package com.anushka.newsapiclient

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class SavedNewsFragmentDirections private constructor() {
  public companion object {
    public fun actionSavedNewsFragmentToInfoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_savedNewsFragment_to_infoFragment)
  }
}
