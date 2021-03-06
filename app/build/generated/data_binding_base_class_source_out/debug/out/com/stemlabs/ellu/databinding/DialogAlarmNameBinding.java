// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogAlarmNameBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edtAlarmName;

  @NonNull
  public final TextView tvCancelLBL;

  @NonNull
  public final TextView tvSetAlarmNameLBL;

  @NonNull
  public final TextView tvSetLBL;

  private DialogAlarmNameBinding(@NonNull LinearLayout rootView, @NonNull EditText edtAlarmName,
      @NonNull TextView tvCancelLBL, @NonNull TextView tvSetAlarmNameLBL,
      @NonNull TextView tvSetLBL) {
    this.rootView = rootView;
    this.edtAlarmName = edtAlarmName;
    this.tvCancelLBL = tvCancelLBL;
    this.tvSetAlarmNameLBL = tvSetAlarmNameLBL;
    this.tvSetLBL = tvSetLBL;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogAlarmNameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogAlarmNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_alarm_name, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogAlarmNameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtAlarmName;
      EditText edtAlarmName = rootView.findViewById(id);
      if (edtAlarmName == null) {
        break missingId;
      }

      id = R.id.tvCancelLBL;
      TextView tvCancelLBL = rootView.findViewById(id);
      if (tvCancelLBL == null) {
        break missingId;
      }

      id = R.id.tvSetAlarmNameLBL;
      TextView tvSetAlarmNameLBL = rootView.findViewById(id);
      if (tvSetAlarmNameLBL == null) {
        break missingId;
      }

      id = R.id.tvSetLBL;
      TextView tvSetLBL = rootView.findViewById(id);
      if (tvSetLBL == null) {
        break missingId;
      }

      return new DialogAlarmNameBinding((LinearLayout) rootView, edtAlarmName, tvCancelLBL,
          tvSetAlarmNameLBL, tvSetLBL);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
