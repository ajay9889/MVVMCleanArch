package com.anushka.newsapiclient

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class NewsFragmentDirections private constructor() {
  public companion object {
    public fun actionNewsFragmentToInfoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsFragment_to_infoFragment)
  }
}
