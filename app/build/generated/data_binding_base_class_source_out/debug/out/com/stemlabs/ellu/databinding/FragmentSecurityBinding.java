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

public final class FragmentSecurityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout LLFinger;

  @NonNull
  public final ImageView imgFaceDetection;

  @NonNull
  public final TextView tvAddFingerPrintLBL;

  @NonNull
  public final TextView tvKeepYourSafeDescriptionLBL;

  @NonNull
  public final TextView tvKeepYourSafeLBL;

  @NonNull
  public final TextView tvStartUsingYourLBL;

  @NonNull
  public final TextView tvUseIdentificationLBL;

  private FragmentSecurityBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout LLFinger,
      @NonNull ImageView imgFaceDetection, @NonNull TextView tvAddFingerPrintLBL,
      @NonNull TextView tvKeepYourSafeDescriptionLBL, @NonNull TextView tvKeepYourSafeLBL,
      @NonNull TextView tvStartUsingYourLBL, @NonNull TextView tvUseIdentificationLBL) {
    this.rootView = rootView;
    this.LLFinger = LLFinger;
    this.imgFaceDetection = imgFaceDetection;
    this.tvAddFingerPrintLBL = tvAddFingerPrintLBL;
    this.tvKeepYourSafeDescriptionLBL = tvKeepYourSafeDescriptionLBL;
    this.tvKeepYourSafeLBL = tvKeepYourSafeLBL;
    this.tvStartUsingYourLBL = tvStartUsingYourLBL;
    this.tvUseIdentificationLBL = tvUseIdentificationLBL;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSecurityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSecurityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_security, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSecurityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout LLFinger = (LinearLayout) rootView;

      id = R.id.imgFaceDetection;
      ImageView imgFaceDetection = rootView.findViewById(id);
      if (imgFaceDetection == null) {
        break missingId;
      }

      id = R.id.tvAddFingerPrintLBL;
      TextView tvAddFingerPrintLBL = rootView.findViewById(id);
      if (tvAddFingerPrintLBL == null) {
        break missingId;
      }

      id = R.id.tvKeepYourSafeDescriptionLBL;
      TextView tvKeepYourSafeDescriptionLBL = rootView.findViewById(id);
      if (tvKeepYourSafeDescriptionLBL == null) {
        break missingId;
      }

      id = R.id.tvKeepYourSafeLBL;
      TextView tvKeepYourSafeLBL = rootView.findViewById(id);
      if (tvKeepYourSafeLBL == null) {
        break missingId;
      }

      id = R.id.tvStartUsingYourLBL;
      TextView tvStartUsingYourLBL = rootView.findViewById(id);
      if (tvStartUsingYourLBL == null) {
        break missingId;
      }

      id = R.id.tvUseIdentificationLBL;
      TextView tvUseIdentificationLBL = rootView.findViewById(id);
      if (tvUseIdentificationLBL == null) {
        break missingId;
      }

      return new FragmentSecurityBinding((LinearLayout) rootView, LLFinger, imgFaceDetection,
          tvAddFingerPrintLBL, tvKeepYourSafeDescriptionLBL, tvKeepYourSafeLBL, tvStartUsingYourLBL,
          tvUseIdentificationLBL);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
