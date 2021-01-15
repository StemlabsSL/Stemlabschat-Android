// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ChatToolbarSosBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText edtSearch;

  @NonNull
  public final ImageView imgCall;

  @NonNull
  public final ImageView imgLeftIcon;

  @NonNull
  public final ImageView imgLeftIconSearch;

  @NonNull
  public final ImageView imgMore;

  @NonNull
  public final ImageView imgNotification;

  @NonNull
  public final CircleImageView imgOnline;

  @NonNull
  public final RelativeLayout imgUserProfile;

  @NonNull
  public final ImageView imgVideo;

  @NonNull
  public final LinearLayout llProfile;

  @NonNull
  public final LinearLayout llSearch;

  @NonNull
  public final RelativeLayout toolbarMain;

  @NonNull
  public final TextView tvUserName;

  @NonNull
  public final View viewDivider;

  private ChatToolbarSosBinding(@NonNull RelativeLayout rootView, @NonNull EditText edtSearch,
      @NonNull ImageView imgCall, @NonNull ImageView imgLeftIcon,
      @NonNull ImageView imgLeftIconSearch, @NonNull ImageView imgMore,
      @NonNull ImageView imgNotification, @NonNull CircleImageView imgOnline,
      @NonNull RelativeLayout imgUserProfile, @NonNull ImageView imgVideo,
      @NonNull LinearLayout llProfile, @NonNull LinearLayout llSearch,
      @NonNull RelativeLayout toolbarMain, @NonNull TextView tvUserName,
      @NonNull View viewDivider) {
    this.rootView = rootView;
    this.edtSearch = edtSearch;
    this.imgCall = imgCall;
    this.imgLeftIcon = imgLeftIcon;
    this.imgLeftIconSearch = imgLeftIconSearch;
    this.imgMore = imgMore;
    this.imgNotification = imgNotification;
    this.imgOnline = imgOnline;
    this.imgUserProfile = imgUserProfile;
    this.imgVideo = imgVideo;
    this.llProfile = llProfile;
    this.llSearch = llSearch;
    this.toolbarMain = toolbarMain;
    this.tvUserName = tvUserName;
    this.viewDivider = viewDivider;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChatToolbarSosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChatToolbarSosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.chat_toolbar_sos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChatToolbarSosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtSearch;
      EditText edtSearch = rootView.findViewById(id);
      if (edtSearch == null) {
        break missingId;
      }

      id = R.id.imgCall;
      ImageView imgCall = rootView.findViewById(id);
      if (imgCall == null) {
        break missingId;
      }

      id = R.id.imgLeftIcon;
      ImageView imgLeftIcon = rootView.findViewById(id);
      if (imgLeftIcon == null) {
        break missingId;
      }

      id = R.id.imgLeftIconSearch;
      ImageView imgLeftIconSearch = rootView.findViewById(id);
      if (imgLeftIconSearch == null) {
        break missingId;
      }

      id = R.id.imgMore;
      ImageView imgMore = rootView.findViewById(id);
      if (imgMore == null) {
        break missingId;
      }

      id = R.id.imgNotification;
      ImageView imgNotification = rootView.findViewById(id);
      if (imgNotification == null) {
        break missingId;
      }

      id = R.id.imgOnline;
      CircleImageView imgOnline = rootView.findViewById(id);
      if (imgOnline == null) {
        break missingId;
      }

      id = R.id.imgUserProfile;
      RelativeLayout imgUserProfile = rootView.findViewById(id);
      if (imgUserProfile == null) {
        break missingId;
      }

      id = R.id.imgVideo;
      ImageView imgVideo = rootView.findViewById(id);
      if (imgVideo == null) {
        break missingId;
      }

      id = R.id.llProfile;
      LinearLayout llProfile = rootView.findViewById(id);
      if (llProfile == null) {
        break missingId;
      }

      id = R.id.llSearch;
      LinearLayout llSearch = rootView.findViewById(id);
      if (llSearch == null) {
        break missingId;
      }

      RelativeLayout toolbarMain = (RelativeLayout) rootView;

      id = R.id.tvUserName;
      TextView tvUserName = rootView.findViewById(id);
      if (tvUserName == null) {
        break missingId;
      }

      id = R.id.viewDivider;
      View viewDivider = rootView.findViewById(id);
      if (viewDivider == null) {
        break missingId;
      }

      return new ChatToolbarSosBinding((RelativeLayout) rootView, edtSearch, imgCall, imgLeftIcon,
          imgLeftIconSearch, imgMore, imgNotification, imgOnline, imgUserProfile, imgVideo,
          llProfile, llSearch, toolbarMain, tvUserName, viewDivider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
