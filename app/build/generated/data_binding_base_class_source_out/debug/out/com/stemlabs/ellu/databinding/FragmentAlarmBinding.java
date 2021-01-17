// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import com.weigan.loopview.LoopView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAlarmBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgAddAlarm;

  @NonNull
  public final ImageView imgAlarm;

  @NonNull
  public final ImageView imgTimer;

  @NonNull
  public final ImageView imgTimerPause;

  @NonNull
  public final ImageView imgTimerPlay;

  @NonNull
  public final ImageView imgTimerStop;

  @NonNull
  public final LinearLayout llAlarmView;

  @NonNull
  public final LinearLayout llTimeProgressing;

  @NonNull
  public final LinearLayout llTimerSelection;

  @NonNull
  public final LoopView loopHours;

  @NonNull
  public final LoopView loopMinutes;

  @NonNull
  public final LoopView loopSeconds;

  @NonNull
  public final RecyclerView rvAlarm;

  @NonNull
  public final ProgressBar timerProgressBar;

  @NonNull
  public final TextView tvHoursLBL;

  @NonNull
  public final TextView tvMinutesLBL;

  @NonNull
  public final TextView tvRemaining;

  @NonNull
  public final TextView tvSecondsLBL;

  @NonNull
  public final TextView tvTimeLeft;

  private FragmentAlarmBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgAddAlarm,
      @NonNull ImageView imgAlarm, @NonNull ImageView imgTimer, @NonNull ImageView imgTimerPause,
      @NonNull ImageView imgTimerPlay, @NonNull ImageView imgTimerStop,
      @NonNull LinearLayout llAlarmView, @NonNull LinearLayout llTimeProgressing,
      @NonNull LinearLayout llTimerSelection, @NonNull LoopView loopHours,
      @NonNull LoopView loopMinutes, @NonNull LoopView loopSeconds, @NonNull RecyclerView rvAlarm,
      @NonNull ProgressBar timerProgressBar, @NonNull TextView tvHoursLBL,
      @NonNull TextView tvMinutesLBL, @NonNull TextView tvRemaining, @NonNull TextView tvSecondsLBL,
      @NonNull TextView tvTimeLeft) {
    this.rootView = rootView;
    this.imgAddAlarm = imgAddAlarm;
    this.imgAlarm = imgAlarm;
    this.imgTimer = imgTimer;
    this.imgTimerPause = imgTimerPause;
    this.imgTimerPlay = imgTimerPlay;
    this.imgTimerStop = imgTimerStop;
    this.llAlarmView = llAlarmView;
    this.llTimeProgressing = llTimeProgressing;
    this.llTimerSelection = llTimerSelection;
    this.loopHours = loopHours;
    this.loopMinutes = loopMinutes;
    this.loopSeconds = loopSeconds;
    this.rvAlarm = rvAlarm;
    this.timerProgressBar = timerProgressBar;
    this.tvHoursLBL = tvHoursLBL;
    this.tvMinutesLBL = tvMinutesLBL;
    this.tvRemaining = tvRemaining;
    this.tvSecondsLBL = tvSecondsLBL;
    this.tvTimeLeft = tvTimeLeft;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAlarmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAlarmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_alarm, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAlarmBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgAddAlarm;
      ImageView imgAddAlarm = rootView.findViewById(id);
      if (imgAddAlarm == null) {
        break missingId;
      }

      id = R.id.imgAlarm;
      ImageView imgAlarm = rootView.findViewById(id);
      if (imgAlarm == null) {
        break missingId;
      }

      id = R.id.imgTimer;
      ImageView imgTimer = rootView.findViewById(id);
      if (imgTimer == null) {
        break missingId;
      }

      id = R.id.imgTimerPause;
      ImageView imgTimerPause = rootView.findViewById(id);
      if (imgTimerPause == null) {
        break missingId;
      }

      id = R.id.imgTimerPlay;
      ImageView imgTimerPlay = rootView.findViewById(id);
      if (imgTimerPlay == null) {
        break missingId;
      }

      id = R.id.imgTimerStop;
      ImageView imgTimerStop = rootView.findViewById(id);
      if (imgTimerStop == null) {
        break missingId;
      }

      id = R.id.llAlarmView;
      LinearLayout llAlarmView = rootView.findViewById(id);
      if (llAlarmView == null) {
        break missingId;
      }

      id = R.id.llTimeProgressing;
      LinearLayout llTimeProgressing = rootView.findViewById(id);
      if (llTimeProgressing == null) {
        break missingId;
      }

      id = R.id.llTimerSelection;
      LinearLayout llTimerSelection = rootView.findViewById(id);
      if (llTimerSelection == null) {
        break missingId;
      }

      id = R.id.loopHours;
      LoopView loopHours = rootView.findViewById(id);
      if (loopHours == null) {
        break missingId;
      }

      id = R.id.loopMinutes;
      LoopView loopMinutes = rootView.findViewById(id);
      if (loopMinutes == null) {
        break missingId;
      }

      id = R.id.loopSeconds;
      LoopView loopSeconds = rootView.findViewById(id);
      if (loopSeconds == null) {
        break missingId;
      }

      id = R.id.rvAlarm;
      RecyclerView rvAlarm = rootView.findViewById(id);
      if (rvAlarm == null) {
        break missingId;
      }

      id = R.id.timerProgressBar;
      ProgressBar timerProgressBar = rootView.findViewById(id);
      if (timerProgressBar == null) {
        break missingId;
      }

      id = R.id.tvHoursLBL;
      TextView tvHoursLBL = rootView.findViewById(id);
      if (tvHoursLBL == null) {
        break missingId;
      }

      id = R.id.tvMinutesLBL;
      TextView tvMinutesLBL = rootView.findViewById(id);
      if (tvMinutesLBL == null) {
        break missingId;
      }

      id = R.id.tvRemaining;
      TextView tvRemaining = rootView.findViewById(id);
      if (tvRemaining == null) {
        break missingId;
      }

      id = R.id.tvSecondsLBL;
      TextView tvSecondsLBL = rootView.findViewById(id);
      if (tvSecondsLBL == null) {
        break missingId;
      }

      id = R.id.tvTimeLeft;
      TextView tvTimeLeft = rootView.findViewById(id);
      if (tvTimeLeft == null) {
        break missingId;
      }

      return new FragmentAlarmBinding((LinearLayout) rootView, imgAddAlarm, imgAlarm, imgTimer,
          imgTimerPause, imgTimerPlay, imgTimerStop, llAlarmView, llTimeProgressing,
          llTimerSelection, loopHours, loopMinutes, loopSeconds, rvAlarm, timerProgressBar,
          tvHoursLBL, tvMinutesLBL, tvRemaining, tvSecondsLBL, tvTimeLeft);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
