// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListrowVibrationPatternBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RadioButton rbVibrationPattern;

  @NonNull
  public final TextView tvVibrationPatternTitle;

  @NonNull
  public final View viewDivider;

  private ListrowVibrationPatternBinding(@NonNull LinearLayout rootView,
      @NonNull RadioButton rbVibrationPattern, @NonNull TextView tvVibrationPatternTitle,
      @NonNull View viewDivider) {
    this.rootView = rootView;
    this.rbVibrationPattern = rbVibrationPattern;
    this.tvVibrationPatternTitle = tvVibrationPatternTitle;
    this.viewDivider = viewDivider;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListrowVibrationPatternBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListrowVibrationPatternBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.listrow_vibration_pattern, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListrowVibrationPatternBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rbVibrationPattern;
      RadioButton rbVibrationPattern = rootView.findViewById(id);
      if (rbVibrationPattern == null) {
        break missingId;
      }

      id = R.id.tvVibrationPatternTitle;
      TextView tvVibrationPatternTitle = rootView.findViewById(id);
      if (tvVibrationPatternTitle == null) {
        break missingId;
      }

      id = R.id.viewDivider;
      View viewDivider = rootView.findViewById(id);
      if (viewDivider == null) {
        break missingId;
      }

      return new ListrowVibrationPatternBinding((LinearLayout) rootView, rbVibrationPattern,
          tvVibrationPatternTitle, viewDivider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
