// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class FragmentSignUpBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText ETConfirmPassword;

  @NonNull
  public final EditText ETEmail;

  @NonNull
  public final EditText ETName;

  @NonNull
  public final EditText ETPassword;

  @NonNull
  public final LinearLayout LLLayout;

  @NonNull
  public final ImageView imgBackArrow;

  @NonNull
  public final ImageView imgPasswordVisibility;

  @NonNull
  public final ImageView imgSignUP;

  @NonNull
  public final ImageView imggConfirmPasswordVisibility;

  @NonNull
  public final TextView tvSignUpToolbar;

  private FragmentSignUpBinding(@NonNull LinearLayout rootView, @NonNull EditText ETConfirmPassword,
      @NonNull EditText ETEmail, @NonNull EditText ETName, @NonNull EditText ETPassword,
      @NonNull LinearLayout LLLayout, @NonNull ImageView imgBackArrow,
      @NonNull ImageView imgPasswordVisibility, @NonNull ImageView imgSignUP,
      @NonNull ImageView imggConfirmPasswordVisibility, @NonNull TextView tvSignUpToolbar) {
    this.rootView = rootView;
    this.ETConfirmPassword = ETConfirmPassword;
    this.ETEmail = ETEmail;
    this.ETName = ETName;
    this.ETPassword = ETPassword;
    this.LLLayout = LLLayout;
    this.imgBackArrow = imgBackArrow;
    this.imgPasswordVisibility = imgPasswordVisibility;
    this.imgSignUP = imgSignUP;
    this.imggConfirmPasswordVisibility = imggConfirmPasswordVisibility;
    this.tvSignUpToolbar = tvSignUpToolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ET_confirm_password;
      EditText ETConfirmPassword = rootView.findViewById(id);
      if (ETConfirmPassword == null) {
        break missingId;
      }

      id = R.id.ET_email;
      EditText ETEmail = rootView.findViewById(id);
      if (ETEmail == null) {
        break missingId;
      }

      id = R.id.ET_name;
      EditText ETName = rootView.findViewById(id);
      if (ETName == null) {
        break missingId;
      }

      id = R.id.ET_password;
      EditText ETPassword = rootView.findViewById(id);
      if (ETPassword == null) {
        break missingId;
      }

      LinearLayout LLLayout = (LinearLayout) rootView;

      id = R.id.imgBackArrow;
      ImageView imgBackArrow = rootView.findViewById(id);
      if (imgBackArrow == null) {
        break missingId;
      }

      id = R.id.imgPasswordVisibility;
      ImageView imgPasswordVisibility = rootView.findViewById(id);
      if (imgPasswordVisibility == null) {
        break missingId;
      }

      id = R.id.imgSignUP;
      ImageView imgSignUP = rootView.findViewById(id);
      if (imgSignUP == null) {
        break missingId;
      }

      id = R.id.imggConfirmPasswordVisibility;
      ImageView imggConfirmPasswordVisibility = rootView.findViewById(id);
      if (imggConfirmPasswordVisibility == null) {
        break missingId;
      }

      id = R.id.tvSignUpToolbar;
      TextView tvSignUpToolbar = rootView.findViewById(id);
      if (tvSignUpToolbar == null) {
        break missingId;
      }

      return new FragmentSignUpBinding((LinearLayout) rootView, ETConfirmPassword, ETEmail, ETName,
          ETPassword, LLLayout, imgBackArrow, imgPasswordVisibility, imgSignUP,
          imggConfirmPasswordVisibility, tvSignUpToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
