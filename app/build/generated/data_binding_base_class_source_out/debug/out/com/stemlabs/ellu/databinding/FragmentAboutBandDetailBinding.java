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

public final class FragmentAboutBandDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgDeviceName;

  @NonNull
  public final ImageView imgResetBand;

  @NonNull
  public final ImageView imgTips;

  @NonNull
  public final ImageView imgUpdateBand;

  @NonNull
  public final LinearLayout llDeviceName;

  @NonNull
  public final LinearLayout llResetBand;

  @NonNull
  public final LinearLayout llTips;

  @NonNull
  public final LinearLayout llUpdateBand;

  @NonNull
  public final TextView tvDeviceName;

  @NonNull
  public final TextView tvResetBand;

  @NonNull
  public final TextView tvSoftwareVersion;

  @NonNull
  public final TextView tvTips;

  @NonNull
  public final TextView tvUpdateBand;

  @NonNull
  public final TextView tvUsernameBand;

  private FragmentAboutBandDetailBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView imgDeviceName, @NonNull ImageView imgResetBand, @NonNull ImageView imgTips,
      @NonNull ImageView imgUpdateBand, @NonNull LinearLayout llDeviceName,
      @NonNull LinearLayout llResetBand, @NonNull LinearLayout llTips,
      @NonNull LinearLayout llUpdateBand, @NonNull TextView tvDeviceName,
      @NonNull TextView tvResetBand, @NonNull TextView tvSoftwareVersion, @NonNull TextView tvTips,
      @NonNull TextView tvUpdateBand, @NonNull TextView tvUsernameBand) {
    this.rootView = rootView;
    this.imgDeviceName = imgDeviceName;
    this.imgResetBand = imgResetBand;
    this.imgTips = imgTips;
    this.imgUpdateBand = imgUpdateBand;
    this.llDeviceName = llDeviceName;
    this.llResetBand = llResetBand;
    this.llTips = llTips;
    this.llUpdateBand = llUpdateBand;
    this.tvDeviceName = tvDeviceName;
    this.tvResetBand = tvResetBand;
    this.tvSoftwareVersion = tvSoftwareVersion;
    this.tvTips = tvTips;
    this.tvUpdateBand = tvUpdateBand;
    this.tvUsernameBand = tvUsernameBand;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutBandDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutBandDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about_band_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutBandDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgDeviceName;
      ImageView imgDeviceName = rootView.findViewById(id);
      if (imgDeviceName == null) {
        break missingId;
      }

      id = R.id.imgResetBand;
      ImageView imgResetBand = rootView.findViewById(id);
      if (imgResetBand == null) {
        break missingId;
      }

      id = R.id.imgTips;
      ImageView imgTips = rootView.findViewById(id);
      if (imgTips == null) {
        break missingId;
      }

      id = R.id.imgUpdateBand;
      ImageView imgUpdateBand = rootView.findViewById(id);
      if (imgUpdateBand == null) {
        break missingId;
      }

      id = R.id.llDeviceName;
      LinearLayout llDeviceName = rootView.findViewById(id);
      if (llDeviceName == null) {
        break missingId;
      }

      id = R.id.llResetBand;
      LinearLayout llResetBand = rootView.findViewById(id);
      if (llResetBand == null) {
        break missingId;
      }

      id = R.id.llTips;
      LinearLayout llTips = rootView.findViewById(id);
      if (llTips == null) {
        break missingId;
      }

      id = R.id.llUpdateBand;
      LinearLayout llUpdateBand = rootView.findViewById(id);
      if (llUpdateBand == null) {
        break missingId;
      }

      id = R.id.tvDeviceName;
      TextView tvDeviceName = rootView.findViewById(id);
      if (tvDeviceName == null) {
        break missingId;
      }

      id = R.id.tvResetBand;
      TextView tvResetBand = rootView.findViewById(id);
      if (tvResetBand == null) {
        break missingId;
      }

      id = R.id.tvSoftwareVersion;
      TextView tvSoftwareVersion = rootView.findViewById(id);
      if (tvSoftwareVersion == null) {
        break missingId;
      }

      id = R.id.tvTips;
      TextView tvTips = rootView.findViewById(id);
      if (tvTips == null) {
        break missingId;
      }

      id = R.id.tvUpdateBand;
      TextView tvUpdateBand = rootView.findViewById(id);
      if (tvUpdateBand == null) {
        break missingId;
      }

      id = R.id.tvUsernameBand;
      TextView tvUsernameBand = rootView.findViewById(id);
      if (tvUsernameBand == null) {
        break missingId;
      }

      return new FragmentAboutBandDetailBinding((LinearLayout) rootView, imgDeviceName,
          imgResetBand, imgTips, imgUpdateBand, llDeviceName, llResetBand, llTips, llUpdateBand,
          tvDeviceName, tvResetBand, tvSoftwareVersion, tvTips, tvUpdateBand, tvUsernameBand);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
