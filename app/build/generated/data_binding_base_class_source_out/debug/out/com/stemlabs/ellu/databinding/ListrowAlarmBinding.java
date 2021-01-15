// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.stemlabs.ellu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListrowAlarmBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView cardMain;

  @NonNull
  public final FrameLayout flMainBasketRow;

  @NonNull
  public final ImageView imgDelete;

  @NonNull
  public final LinearLayout llDelete;

  @NonNull
  public final LinearLayout llMain;

  @NonNull
  public final RecyclerView rvAlarmCalendar;

  @NonNull
  public final SwipeRevealLayout swipeMain;

  @NonNull
  public final SwitchCompat switchAlarmOnOff;

  @NonNull
  public final TextView tvAlarmTime;

  @NonNull
  public final TextView tvAlarmTitle;

  private ListrowAlarmBinding(@NonNull RelativeLayout rootView, @NonNull CardView cardMain,
      @NonNull FrameLayout flMainBasketRow, @NonNull ImageView imgDelete,
      @NonNull LinearLayout llDelete, @NonNull LinearLayout llMain,
      @NonNull RecyclerView rvAlarmCalendar, @NonNull SwipeRevealLayout swipeMain,
      @NonNull SwitchCompat switchAlarmOnOff, @NonNull TextView tvAlarmTime,
      @NonNull TextView tvAlarmTitle) {
    this.rootView = rootView;
    this.cardMain = cardMain;
    this.flMainBasketRow = flMainBasketRow;
    this.imgDelete = imgDelete;
    this.llDelete = llDelete;
    this.llMain = llMain;
    this.rvAlarmCalendar = rvAlarmCalendar;
    this.swipeMain = swipeMain;
    this.switchAlarmOnOff = switchAlarmOnOff;
    this.tvAlarmTime = tvAlarmTime;
    this.tvAlarmTitle = tvAlarmTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListrowAlarmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListrowAlarmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.listrow_alarm, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListrowAlarmBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardMain;
      CardView cardMain = rootView.findViewById(id);
      if (cardMain == null) {
        break missingId;
      }

      id = R.id.fl_main_basket_row;
      FrameLayout flMainBasketRow = rootView.findViewById(id);
      if (flMainBasketRow == null) {
        break missingId;
      }

      id = R.id.imgDelete;
      ImageView imgDelete = rootView.findViewById(id);
      if (imgDelete == null) {
        break missingId;
      }

      id = R.id.ll_delete;
      LinearLayout llDelete = rootView.findViewById(id);
      if (llDelete == null) {
        break missingId;
      }

      id = R.id.llMain;
      LinearLayout llMain = rootView.findViewById(id);
      if (llMain == null) {
        break missingId;
      }

      id = R.id.rvAlarmCalendar;
      RecyclerView rvAlarmCalendar = rootView.findViewById(id);
      if (rvAlarmCalendar == null) {
        break missingId;
      }

      id = R.id.swipe_main;
      SwipeRevealLayout swipeMain = rootView.findViewById(id);
      if (swipeMain == null) {
        break missingId;
      }

      id = R.id.switchAlarmOnOff;
      SwitchCompat switchAlarmOnOff = rootView.findViewById(id);
      if (switchAlarmOnOff == null) {
        break missingId;
      }

      id = R.id.tvAlarmTime;
      TextView tvAlarmTime = rootView.findViewById(id);
      if (tvAlarmTime == null) {
        break missingId;
      }

      id = R.id.tvAlarmTitle;
      TextView tvAlarmTitle = rootView.findViewById(id);
      if (tvAlarmTitle == null) {
        break missingId;
      }

      return new ListrowAlarmBinding((RelativeLayout) rootView, cardMain, flMainBasketRow,
          imgDelete, llDelete, llMain, rvAlarmCalendar, swipeMain, switchAlarmOnOff, tvAlarmTime,
          tvAlarmTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
