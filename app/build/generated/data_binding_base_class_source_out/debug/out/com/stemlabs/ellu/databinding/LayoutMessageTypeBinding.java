// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutMessageTypeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgFiles;

  @NonNull
  public final LinearLayout llAware;

  @NonNull
  public final LinearLayout llCamera;

  @NonNull
  public final LinearLayout llContact;

  @NonNull
  public final LinearLayout llFiles;

  @NonNull
  public final LinearLayout llGallery;

  @NonNull
  public final LinearLayout llLetMeet;

  @NonNull
  public final LinearLayout llLocation;

  @NonNull
  public final TextView tvFiles;

  private LayoutMessageTypeBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgFiles,
      @NonNull LinearLayout llAware, @NonNull LinearLayout llCamera,
      @NonNull LinearLayout llContact, @NonNull LinearLayout llFiles,
      @NonNull LinearLayout llGallery, @NonNull LinearLayout llLetMeet,
      @NonNull LinearLayout llLocation, @NonNull TextView tvFiles) {
    this.rootView = rootView;
    this.imgFiles = imgFiles;
    this.llAware = llAware;
    this.llCamera = llCamera;
    this.llContact = llContact;
    this.llFiles = llFiles;
    this.llGallery = llGallery;
    this.llLetMeet = llLetMeet;
    this.llLocation = llLocation;
    this.tvFiles = tvFiles;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutMessageTypeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutMessageTypeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_message_type, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutMessageTypeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgFiles;
      ImageView imgFiles = rootView.findViewById(id);
      if (imgFiles == null) {
        break missingId;
      }

      id = R.id.llAware;
      LinearLayout llAware = rootView.findViewById(id);
      if (llAware == null) {
        break missingId;
      }

      id = R.id.llCamera;
      LinearLayout llCamera = rootView.findViewById(id);
      if (llCamera == null) {
        break missingId;
      }

      id = R.id.llContact;
      LinearLayout llContact = rootView.findViewById(id);
      if (llContact == null) {
        break missingId;
      }

      id = R.id.llFiles;
      LinearLayout llFiles = rootView.findViewById(id);
      if (llFiles == null) {
        break missingId;
      }

      id = R.id.llGallery;
      LinearLayout llGallery = rootView.findViewById(id);
      if (llGallery == null) {
        break missingId;
      }

      id = R.id.llLetMeet;
      LinearLayout llLetMeet = rootView.findViewById(id);
      if (llLetMeet == null) {
        break missingId;
      }

      id = R.id.llLocation;
      LinearLayout llLocation = rootView.findViewById(id);
      if (llLocation == null) {
        break missingId;
      }

      id = R.id.tvFiles;
      TextView tvFiles = rootView.findViewById(id);
      if (tvFiles == null) {
        break missingId;
      }

      return new LayoutMessageTypeBinding((LinearLayout) rootView, imgFiles, llAware, llCamera,
          llContact, llFiles, llGallery, llLetMeet, llLocation, tvFiles);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}