// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainChatBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivAdd;

  @NonNull
  public final ImageView ivMainChat;

  @NonNull
  public final CircleImageView ivUserProfile;

  @NonNull
  public final LinearLayout llStoryBoard;

  @NonNull
  public final RecyclerView rvChatPerson;

  @NonNull
  public final RecyclerView rvMainChat;

  private FragmentMainChatBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivAdd,
      @NonNull ImageView ivMainChat, @NonNull CircleImageView ivUserProfile,
      @NonNull LinearLayout llStoryBoard, @NonNull RecyclerView rvChatPerson,
      @NonNull RecyclerView rvMainChat) {
    this.rootView = rootView;
    this.ivAdd = ivAdd;
    this.ivMainChat = ivMainChat;
    this.ivUserProfile = ivUserProfile;
    this.llStoryBoard = llStoryBoard;
    this.rvChatPerson = rvChatPerson;
    this.rvMainChat = rvMainChat;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivAdd;
      ImageView ivAdd = rootView.findViewById(id);
      if (ivAdd == null) {
        break missingId;
      }

      id = R.id.ivMainChat;
      ImageView ivMainChat = rootView.findViewById(id);
      if (ivMainChat == null) {
        break missingId;
      }

      id = R.id.ivUserProfile;
      CircleImageView ivUserProfile = rootView.findViewById(id);
      if (ivUserProfile == null) {
        break missingId;
      }

      id = R.id.llStoryBoard;
      LinearLayout llStoryBoard = rootView.findViewById(id);
      if (llStoryBoard == null) {
        break missingId;
      }

      id = R.id.rvChatPerson;
      RecyclerView rvChatPerson = rootView.findViewById(id);
      if (rvChatPerson == null) {
        break missingId;
      }

      id = R.id.rvMainChat;
      RecyclerView rvMainChat = rootView.findViewById(id);
      if (rvMainChat == null) {
        break missingId;
      }

      return new FragmentMainChatBinding((LinearLayout) rootView, ivAdd, ivMainChat, ivUserProfile,
          llStoryBoard, rvChatPerson, rvMainChat);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
