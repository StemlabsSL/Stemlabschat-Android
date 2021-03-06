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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentContactsToSendBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgContactSend;

  @NonNull
  public final RecyclerView rvContactSend;

  private FragmentContactsToSendBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView imgContactSend, @NonNull RecyclerView rvContactSend) {
    this.rootView = rootView;
    this.imgContactSend = imgContactSend;
    this.rvContactSend = rvContactSend;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentContactsToSendBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentContactsToSendBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_contacts_to_send, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentContactsToSendBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgContactSend;
      ImageView imgContactSend = rootView.findViewById(id);
      if (imgContactSend == null) {
        break missingId;
      }

      id = R.id.rvContactSend;
      RecyclerView rvContactSend = rootView.findViewById(id);
      if (rvContactSend == null) {
        break missingId;
      }

      return new FragmentContactsToSendBinding((LinearLayout) rootView, imgContactSend,
          rvContactSend);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
