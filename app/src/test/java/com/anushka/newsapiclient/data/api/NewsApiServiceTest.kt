package com.anushka.newsapiclient.data.api

import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okio.buffer
import okio.source
import org.junit.After
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.nio.charset.Charset
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

class NewsApiServiceTest {
    private lateinit var service: NewApiService
    private lateinit var server: MockWebServer


    @Before
    fun setUP(){

        server = MockWebServer();
        service = Retrofit.Builder()
                .baseUrl(server.url(""))
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(NewApiService::class.java)
    }


    // toread from local json response.

    private fun enqueueResponse(
            fileName: String
    ){
        val inputStream = javaClass.classLoader!!.getResourceAsStream(fileName)
        val source = inputStream.source().buffer();
        val mockResponse =MockResponse();
        mockResponse.setBody(source.readString(Charset.defaultCharset()))
        server.enqueue(mockResponse)
    }

    @Test
    fun getTopHeader_sentRequesy_reciveExpected(){

        runBlocking {
            enqueueResponse(
                    "newsresponse.json"
            )

            val responsBody = service.getTopHealdline("us",
            1).body()

            val request =server.takeRequest()


            // truth library to usefull set of fucntion for testing
            assertThat(responsBody).isNotNull()
            assertThat(request.path).isEqualTo("/v2/top-headlines?country=sg&apiKey=15fe9bc062974696aa3a55c34b4b273c")


        }
    }


    @After
    fun tearDown(){
        server.shutdown()
    }

}