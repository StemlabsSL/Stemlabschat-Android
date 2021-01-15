// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

public final class FragmentMeetCardAnimationBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final FrameLayout frameEnvelop;

  @NonNull
  public final FrameLayout frameToFrom;

  @NonNull
  public final ImageView imgEnvelop;

  @NonNull
  public final ImageView imgOpenEnvelop;

  @NonNull
  public final TextView tvOpenInvitationLBL;

  private FragmentMeetCardAnimationBinding(@NonNull LinearLayout rootView,
      @NonNull FrameLayout frameEnvelop, @NonNull FrameLayout frameToFrom,
      @NonNull ImageView imgEnvelop, @NonNull ImageView imgOpenEnvelop,
      @NonNull TextView tvOpenInvitationLBL) {
    this.rootView = rootView;
    this.frameEnvelop = frameEnvelop;
    this.frameToFrom = frameToFrom;
    this.imgEnvelop = imgEnvelop;
    this.imgOpenEnvelop = imgOpenEnvelop;
    this.tvOpenInvitationLBL = tvOpenInvitationLBL;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMeetCardAnimationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMeetCardAnimationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_meet_card_animation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMeetCardAnimationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.frameEnvelop;
      FrameLayout frameEnvelop = rootView.findViewById(id);
      if (frameEnvelop == null) {
        break missingId;
      }

      id = R.id.frameToFrom;
      FrameLayout frameToFrom = rootView.findViewById(id);
      if (frameToFrom == null) {
        break missingId;
      }

      id = R.id.imgEnvelop;
      ImageView imgEnvelop = rootView.findViewById(id);
      if (imgEnvelop == null) {
        break missingId;
      }

      id = R.id.imgOpenEnvelop;
      ImageView imgOpenEnvelop = rootView.findViewById(id);
      if (imgOpenEnvelop == null) {
        break missingId;
      }

      id = R.id.tvOpenInvitationLBL;
      TextView tvOpenInvitationLBL = rootView.findViewById(id);
      if (tvOpenInvitationLBL == null) {
        break missingId;
      }

      return new FragmentMeetCardAnimationBinding((LinearLayout) rootView, frameEnvelop,
          frameToFrom, imgEnvelop, imgOpenEnvelop, tvOpenInvitationLBL);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}