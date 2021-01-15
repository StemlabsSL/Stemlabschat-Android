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
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListrowCallLogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgCall;

  @NonNull
  public final ImageView imgType;

  @NonNull
  public final CircleImageView imgUserProfile;

  @NonNull
  public final ImageView imgVideo;

  @NonNull
  public final TextView tvTimeAt;

  @NonNull
  public final TextView tvUserName;

  private ListrowCallLogBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgCall,
      @NonNull ImageView imgType, @NonNull CircleImageView imgUserProfile,
      @NonNull ImageView imgVideo, @NonNull TextView tvTimeAt, @NonNull TextView tvUserName) {
    this.rootView = rootView;
    this.imgCall = imgCall;
    this.imgType = imgType;
    this.imgUserProfile = imgUserProfile;
    this.imgVideo = imgVideo;
    this.tvTimeAt = tvTimeAt;
    this.tvUserName = tvUserName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListrowCallLogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListrowCallLogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.listrow_call_log, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListrowCallLogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgCall;
      ImageView imgCall = rootView.findViewById(id);
      if (imgCall == null) {
        break missingId;
      }

      id = R.id.imgType;
      ImageView imgType = rootView.findViewById(id);
      if (imgType == null) {
        break missingId;
      }

      id = R.id.imgUserProfile;
      CircleImageView imgUserProfile = rootView.findViewById(id);
      if (imgUserProfile == null) {
        break missingId;
      }

      id = R.id.imgVideo;
      ImageView imgVideo = rootView.findViewById(id);
      if (imgVideo == null) {
        break missingId;
      }

      id = R.id.tvTimeAt;
      TextView tvTimeAt = rootView.findViewById(id);
      if (tvTimeAt == null) {
        break missingId;
      }

      id = R.id.tvUserName;
      TextView tvUserName = rootView.findViewById(id);
      if (tvUserName == null) {
        break missingId;
      }

      return new ListrowCallLogBinding((LinearLayout) rootView, imgCall, imgType, imgUserProfile,
          imgVideo, tvTimeAt, tvUserName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
