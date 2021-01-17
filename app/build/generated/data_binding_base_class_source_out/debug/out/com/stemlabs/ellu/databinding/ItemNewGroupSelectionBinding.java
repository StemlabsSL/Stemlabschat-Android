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

public final class ItemNewGroupSelectionBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivClose;

  @NonNull
  public final CircleImageView ivUserProfile;

  @NonNull
  public final LinearLayout llItemMain;

  @NonNull
  public final TextView tvName;

  private ItemNewGroupSelectionBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivClose,
      @NonNull CircleImageView ivUserProfile, @NonNull LinearLayout llItemMain,
      @NonNull TextView tvName) {
    this.rootView = rootView;
    this.ivClose = ivClose;
    this.ivUserProfile = ivUserProfile;
    this.llItemMain = llItemMain;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemNewGroupSelectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemNewGroupSelectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_new_group_selection, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemNewGroupSelectionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivClose;
      ImageView ivClose = rootView.findViewById(id);
      if (ivClose == null) {
        break missingId;
      }

      id = R.id.ivUserProfile;
      CircleImageView ivUserProfile = rootView.findViewById(id);
      if (ivUserProfile == null) {
        break missingId;
      }

      LinearLayout llItemMain = (LinearLayout) rootView;

      id = R.id.tvName;
      TextView tvName = rootView.findViewById(id);
      if (tvName == null) {
        break missingId;
      }

      return new ItemNewGroupSelectionBinding((LinearLayout) rootView, ivClose, ivUserProfile,
          llItemMain, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
