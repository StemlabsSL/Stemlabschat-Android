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
import com.hbb20.CountryCodePicker;
import com.stemlabs.ellu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText ETPhoneForGot;

  @NonNull
  public final LinearLayout LLForgot;

  @NonNull
  public final CountryCodePicker ccp;

  @NonNull
  public final ImageView imgBackArrow;

  @NonNull
  public final ImageView imgVerificationCode;

  @NonNull
  public final LinearLayout llMain;

  @NonNull
  public final TextView tvVerifyTitle;

  private FragmentForgotPasswordBinding(@NonNull LinearLayout rootView,
      @NonNull EditText ETPhoneForGot, @NonNull LinearLayout LLForgot,
      @NonNull CountryCodePicker ccp, @NonNull ImageView imgBackArrow,
      @NonNull ImageView imgVerificationCode, @NonNull LinearLayout llMain,
      @NonNull TextView tvVerifyTitle) {
    this.rootView = rootView;
    this.ETPhoneForGot = ETPhoneForGot;
    this.LLForgot = LLForgot;
    this.ccp = ccp;
    this.imgBackArrow = imgBackArrow;
    this.imgVerificationCode = imgVerificationCode;
    this.llMain = llMain;
    this.tvVerifyTitle = tvVerifyTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ETPhone_ForGot;
      EditText ETPhoneForGot = rootView.findViewById(id);
      if (ETPhoneForGot == null) {
        break missingId;
      }

      LinearLayout LLForgot = (LinearLayout) rootView;

      id = R.id.ccp;
      CountryCodePicker ccp = rootView.findViewById(id);
      if (ccp == null) {
        break missingId;
      }

      id = R.id.imgBackArrow;
      ImageView imgBackArrow = rootView.findViewById(id);
      if (imgBackArrow == null) {
        break missingId;
      }

      id = R.id.imgVerificationCode;
      ImageView imgVerificationCode = rootView.findViewById(id);
      if (imgVerificationCode == null) {
        break missingId;
      }

      id = R.id.llMain;
      LinearLayout llMain = rootView.findViewById(id);
      if (llMain == null) {
        break missingId;
      }

      id = R.id.tvVerifyTitle;
      TextView tvVerifyTitle = rootView.findViewById(id);
      if (tvVerifyTitle == null) {
        break missingId;
      }

      return new FragmentForgotPasswordBinding((LinearLayout) rootView, ETPhoneForGot, LLForgot,
          ccp, imgBackArrow, imgVerificationCode, llMain, tvVerifyTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
