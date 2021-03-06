/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.billing;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum ChargeStatus implements Parcelable {
  PENDING, IN_PROGRESS, ACH_REJECT, BILLED, CANCELED, REFUND_PENDING, REFUND_PENDING_IF_BILLED, REFUND_IN_PROGRESS, REFUNDED, REFUND_DOWNGRADE_PENDING, REFUND_DOWNGRADE_IN_PROGRESS, REFUND_DOWNGRADE_CANCELED, REFUNDED_DOWNGRADE, DISBURSED;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<ChargeStatus> CREATOR = new Creator<ChargeStatus>() {
    @Override
    public ChargeStatus createFromParcel(final Parcel source) {
      return ChargeStatus.valueOf(source.readString());
    }

    @Override
    public ChargeStatus[] newArray(final int size) {
      return new ChargeStatus[size];
    }
  };
}
