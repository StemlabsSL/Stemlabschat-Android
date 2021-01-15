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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.stemlabs.ellu.R;
import com.stemlabs.ellu.widgets.RadarView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProximityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final ImageView dropdownArrow;

  @NonNull
  public final ImageView ivCenterEllips;

  @NonNull
  public final RadarView radarView;

  @NonNull
  public final RecyclerView rvNearByUser;

  @NonNull
  public final LinearLayout topLayout;

  @NonNull
  public final TextView tvActivateLBL;

  private FragmentProximityBinding(@NonNull LinearLayout rootView,
      @NonNull LottieAnimationView animationView, @NonNull ImageView dropdownArrow,
      @NonNull ImageView ivCenterEllips, @NonNull RadarView radarView,
      @NonNull RecyclerView rvNearByUser, @NonNull LinearLayout topLayout,
      @NonNull TextView tvActivateLBL) {
    this.rootView = rootView;
    this.animationView = animationView;
    this.dropdownArrow = dropdownArrow;
    this.ivCenterEllips = ivCenterEllips;
    this.radarView = radarView;
    this.rvNearByUser = rvNearByUser;
    this.topLayout = topLayout;
    this.tvActivateLBL = tvActivateLBL;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProximityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProximityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_proximity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProximityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animationView;
      LottieAnimationView animationView = rootView.findViewById(id);
      if (animationView == null) {
        break missingId;
      }

      id = R.id.dropdownArrow;
      ImageView dropdownArrow = rootView.findViewById(id);
      if (dropdownArrow == null) {
        break missingId;
      }

      id = R.id.ivCenterEllips;
      ImageView ivCenterEllips = rootView.findViewById(id);
      if (ivCenterEllips == null) {
        break missingId;
      }

      id = R.id.radarView;
      RadarView radarView = rootView.findViewById(id);
      if (radarView == null) {
        break missingId;
      }

      id = R.id.rvNearByUser;
      RecyclerView rvNearByUser = rootView.findViewById(id);
      if (rvNearByUser == null) {
        break missingId;
      }

      id = R.id.topLayout;
      LinearLayout topLayout = rootView.findViewById(id);
      if (topLayout == null) {
        break missingId;
      }

      id = R.id.tvActivateLBL;
      TextView tvActivateLBL = rootView.findViewById(id);
      if (tvActivateLBL == null) {
        break missingId;
      }

      return new FragmentProximityBinding((LinearLayout) rootView, animationView, dropdownArrow,
          ivCenterEllips, radarView, rvNearByUser, topLayout, tvActivateLBL);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}