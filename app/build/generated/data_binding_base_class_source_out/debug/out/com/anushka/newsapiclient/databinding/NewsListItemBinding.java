// Generated by view binder compiler. Do not edit!
package com.anushka.newsapiclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.anushka.newsapiclient.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NewsListItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivArticleImage;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvPublishedAt;

  @NonNull
  public final TextView tvSource;

  @NonNull
  public final TextView tvTitle;

  private NewsListItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivArticleImage,
      @NonNull TextView tvDescription, @NonNull TextView tvPublishedAt, @NonNull TextView tvSource,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.ivArticleImage = ivArticleImage;
    this.tvDescription = tvDescription;
    this.tvPublishedAt = tvPublishedAt;
    this.tvSource = tvSource;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NewsListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewsListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.news_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewsListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivArticleImage;
      ImageView ivArticleImage = rootView.findViewById(id);
      if (ivArticleImage == null) {
        break missingId;
      }

      id = R.id.tvDescription;
      TextView tvDescription = rootView.findViewById(id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tvPublishedAt;
      TextView tvPublishedAt = rootView.findViewById(id);
      if (tvPublishedAt == null) {
        break missingId;
      }

      id = R.id.tvSource;
      TextView tvSource = rootView.findViewById(id);
      if (tvSource == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = rootView.findViewById(id);
      if (tvTitle == null) {
        break missingId;
      }

      return new NewsListItemBinding((LinearLayout) rootView, ivArticleImage, tvDescription,
          tvPublishedAt, tvSource, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
