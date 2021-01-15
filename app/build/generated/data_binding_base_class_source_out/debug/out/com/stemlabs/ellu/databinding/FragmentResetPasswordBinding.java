// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentResetPasswordBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView_;

  @NonNull
  public final EditText edtConfirmPassword;

  @NonNull
  public final ImageView imgPasswordVisibility;

  @NonNull
  public final ImageView imgSuccessReset;

  @NonNull
  public final EditText password;

  @NonNull
  public final CoordinatorLayout rootView;

  @NonNull
  public final TextView tvSignIn;

  private FragmentResetPasswordBinding(@NonNull CoordinatorLayout rootView_,
      @NonNull EditText edtConfirmPassword, @NonNull ImageView imgPasswordVisibility,
      @NonNull ImageView imgSuccessReset, @NonNull EditText password,
      @NonNull CoordinatorLayout rootView, @NonNull TextView tvSignIn) {
    this.rootView_ = rootView_;
    this.edtConfirmPassword = edtConfirmPassword;
    this.imgPasswordVisibility = imgPasswordVisibility;
    this.imgSuccessReset = imgSuccessReset;
    this.password = password;
    this.rootView = rootView;
    this.tvSignIn = tvSignIn;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView_;
  }

  @NonNull
  public static FragmentResetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentResetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_reset_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentResetPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtConfirmPassword;
      EditText edtConfirmPassword = rootView.findViewById(id);
      if (edtConfirmPassword == null) {
        break missingId;
      }

      id = R.id.imgPasswordVisibility;
      ImageView imgPasswordVisibility = rootView.findViewById(id);
      if (imgPasswordVisibility == null) {
        break missingId;
      }

      id = R.id.imgSuccessReset;
      ImageView imgSuccessReset = rootView.findViewById(id);
      if (imgSuccessReset == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      CoordinatorLayout rootView_ = (CoordinatorLayout) rootView;

      id = R.id.tvSignIn;
      TextView tvSignIn = rootView.findViewById(id);
      if (tvSignIn == null) {
        break missingId;
      }

      return new FragmentResetPasswordBinding((CoordinatorLayout) rootView, edtConfirmPassword,
          imgPasswordVisibility, imgSuccessReset, password, rootView_, tvSignIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
