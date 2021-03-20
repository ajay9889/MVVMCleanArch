package com.anushka.newsapiclient.presentation.viewmodel


import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.anushka.newsapiclient.data.model.APIResponse
import com.anushka.newsapiclient.data.util.Resource
import com.anushka.newsapiclient.domain.usecase.GetNewsHeadLineUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel (
    private val app: Application,
    private val getNewsHeadLineUseCase: GetNewsHeadLineUseCase
) : AndroidViewModel(app) {

    val newsHeadLines: MutableLiveData<Resource<APIResponse>> = MutableLiveData();

    fun getNewsHeadLines(country: String  , page: Int) = viewModelScope.launch(Dispatchers.IO) {
       try{
           newsHeadLines.postValue(Resource.Loading());
           if(isNetworkAvailable(app)){
               val result = getNewsHeadLineUseCase.execute(country, page)
               newsHeadLines.postValue(result);
           }else{
               newsHeadLines.postValue(Resource.Error("Internet is not connected"));
           }
       }catch (e: Exception){
           newsHeadLines.postValue(Resource.Error(e.message.toString()));
           e.printStackTrace()
       }
    }

    private fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val nw      = connectivityManager.activeNetwork ?: return false
            val actNw = connectivityManager.getNetworkCapabilities(nw) ?: return false
            return when {
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                //for other device how are able to connect with Ethernet
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                //for check internet over Bluetooth
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH) -> true
                else -> false
            }
        } else {
            val nwInfo = connectivityManager.activeNetworkInfo ?: return false
            return nwInfo.isConnected
        }
    }
}