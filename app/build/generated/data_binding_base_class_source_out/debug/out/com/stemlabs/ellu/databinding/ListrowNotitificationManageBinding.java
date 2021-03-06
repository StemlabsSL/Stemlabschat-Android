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

public final class ListrowNotitificationManageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RadioButton rbNotificationManage;

  @NonNull
  public final TextView tvNotificationManageTitle;

  private ListrowNotitificationManageBinding(@NonNull LinearLayout rootView,
      @NonNull RadioButton rbNotificationManage, @NonNull TextView tvNotificationManageTitle) {
    this.rootView = rootView;
    this.rbNotificationManage = rbNotificationManage;
    this.tvNotificationManageTitle = tvNotificationManageTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListrowNotitificationManageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListrowNotitificationManageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.listrow_notitification_manage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListrowNotitificationManageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rbNotificationManage;
      RadioButton rbNotificationManage = rootView.findViewById(id);
      if (rbNotificationManage == null) {
        break missingId;
      }

      id = R.id.tvNotificationManageTitle;
      TextView tvNotificationManageTitle = rootView.findViewById(id);
      if (tvNotificationManageTitle == null) {
        break missingId;
      }

      return new ListrowNotitificationManageBinding((LinearLayout) rootView, rbNotificationManage,
          tvNotificationManageTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
