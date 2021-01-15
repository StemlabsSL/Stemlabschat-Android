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

public final class FragmentPagerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edtTypeMessage;

  @NonNull
  public final TextView tvSendLBL;

  private FragmentPagerBinding(@NonNull LinearLayout rootView, @NonNull EditText edtTypeMessage,
      @NonNull TextView tvSendLBL) {
    this.rootView = rootView;
    this.edtTypeMessage = edtTypeMessage;
    this.tvSendLBL = tvSendLBL;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPagerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPagerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_pager, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPagerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtTypeMessage;
      EditText edtTypeMessage = rootView.findViewById(id);
      if (edtTypeMessage == null) {
        break missingId;
      }

      id = R.id.tvSendLBL;
      TextView tvSendLBL = rootView.findViewById(id);
      if (tvSendLBL == null) {
        break missingId;
      }

      return new FragmentPagerBinding((LinearLayout) rootView, edtTypeMessage, tvSendLBL);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}