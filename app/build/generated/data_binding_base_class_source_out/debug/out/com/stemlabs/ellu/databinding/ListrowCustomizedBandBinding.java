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
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListrowCustomizedBandBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgCustomizedBand;

  @NonNull
  public final SwitchCompat switchCustomizedBand;

  @NonNull
  public final TextView tvCustomizedBandTitle;

  @NonNull
  public final View viewDivider;

  private ListrowCustomizedBandBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView imgCustomizedBand, @NonNull SwitchCompat switchCustomizedBand,
      @NonNull TextView tvCustomizedBandTitle, @NonNull View viewDivider) {
    this.rootView = rootView;
    this.imgCustomizedBand = imgCustomizedBand;
    this.switchCustomizedBand = switchCustomizedBand;
    this.tvCustomizedBandTitle = tvCustomizedBandTitle;
    this.viewDivider = viewDivider;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListrowCustomizedBandBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListrowCustomizedBandBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.listrow_customized_band, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListrowCustomizedBandBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgCustomizedBand;
      ImageView imgCustomizedBand = rootView.findViewById(id);
      if (imgCustomizedBand == null) {
        break missingId;
      }

      id = R.id.switchCustomizedBand;
      SwitchCompat switchCustomizedBand = rootView.findViewById(id);
      if (switchCustomizedBand == null) {
        break missingId;
      }

      id = R.id.tvCustomizedBandTitle;
      TextView tvCustomizedBandTitle = rootView.findViewById(id);
      if (tvCustomizedBandTitle == null) {
        break missingId;
      }

      id = R.id.viewDivider;
      View viewDivider = rootView.findViewById(id);
      if (viewDivider == null) {
        break missingId;
      }

      return new ListrowCustomizedBandBinding((LinearLayout) rootView, imgCustomizedBand,
          switchCustomizedBand, tvCustomizedBandTitle, viewDivider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
