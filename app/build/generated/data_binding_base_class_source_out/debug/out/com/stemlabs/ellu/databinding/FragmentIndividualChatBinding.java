// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentIndividualChatBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView cardViewSendMessage;

  @NonNull
  public final FrameLayout frameAddAction;

  @NonNull
  public final ImageView imgClose;

  @NonNull
  public final ImageView imgPlusButton;

  @NonNull
  public final LinearLayout llAction;

  @NonNull
  public final LinearLayout llReplyChat;

  @NonNull
  public final LinearLayout llSendMessage;

  @NonNull
  public final RecyclerView rvIndividualChat;

  private FragmentIndividualChatBinding(@NonNull LinearLayout rootView,
      @NonNull CardView cardViewSendMessage, @NonNull FrameLayout frameAddAction,
      @NonNull ImageView imgClose, @NonNull ImageView imgPlusButton, @NonNull LinearLayout llAction,
      @NonNull LinearLayout llReplyChat, @NonNull LinearLayout llSendMessage,
      @NonNull RecyclerView rvIndividualChat) {
    this.rootView = rootView;
    this.cardViewSendMessage = cardViewSendMessage;
    this.frameAddAction = frameAddAction;
    this.imgClose = imgClose;
    this.imgPlusButton = imgPlusButton;
    this.llAction = llAction;
    this.llReplyChat = llReplyChat;
    this.llSendMessage = llSendMessage;
    this.rvIndividualChat = rvIndividualChat;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentIndividualChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentIndividualChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_individual_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentIndividualChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardViewSendMessage;
      CardView cardViewSendMessage = rootView.findViewById(id);
      if (cardViewSendMessage == null) {
        break missingId;
      }

      id = R.id.frameAddAction;
      FrameLayout frameAddAction = rootView.findViewById(id);
      if (frameAddAction == null) {
        break missingId;
      }

      id = R.id.imgClose;
      ImageView imgClose = rootView.findViewById(id);
      if (imgClose == null) {
        break missingId;
      }

      id = R.id.imgPlusButton;
      ImageView imgPlusButton = rootView.findViewById(id);
      if (imgPlusButton == null) {
        break missingId;
      }

      id = R.id.llAction;
      LinearLayout llAction = rootView.findViewById(id);
      if (llAction == null) {
        break missingId;
      }

      id = R.id.llReplyChat;
      LinearLayout llReplyChat = rootView.findViewById(id);
      if (llReplyChat == null) {
        break missingId;
      }

      id = R.id.llSendMessage;
      LinearLayout llSendMessage = rootView.findViewById(id);
      if (llSendMessage == null) {
        break missingId;
      }

      id = R.id.rvIndividualChat;
      RecyclerView rvIndividualChat = rootView.findViewById(id);
      if (rvIndividualChat == null) {
        break missingId;
      }

      return new FragmentIndividualChatBinding((LinearLayout) rootView, cardViewSendMessage,
          frameAddAction, imgClose, imgPlusButton, llAction, llReplyChat, llSendMessage,
          rvIndividualChat);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
