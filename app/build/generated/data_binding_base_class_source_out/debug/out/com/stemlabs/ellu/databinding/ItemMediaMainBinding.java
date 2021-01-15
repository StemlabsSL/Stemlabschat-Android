// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemMediaMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView rvMedia;

  @NonNull
  public final TextView tvIndexTitle;

  private ItemMediaMainBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView rvMedia,
      @NonNull TextView tvIndexTitle) {
    this.rootView = rootView;
    this.rvMedia = rvMedia;
    this.tvIndexTitle = tvIndexTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMediaMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMediaMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_media_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMediaMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rvMedia;
      RecyclerView rvMedia = rootView.findViewById(id);
      if (rvMedia == null) {
        break missingId;
      }

      id = R.id.tvIndexTitle;
      TextView tvIndexTitle = rootView.findViewById(id);
      if (tvIndexTitle == null) {
        break missingId;
      }

      return new ItemMediaMainBinding((LinearLayout) rootView, rvMedia, tvIndexTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}