package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f44473p0;

    public class a implements Parcelable.Creator<DateValidatorPointBackward> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final DateValidatorPointBackward createFromParcel(@NonNull Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final DateValidatorPointBackward[] newArray(int i10) {
            return new DateValidatorPointBackward[i10];
        }
    }

    public DateValidatorPointBackward(long j10) {
        this.f44473p0 = j10;
    }

    @NonNull
    public static DateValidatorPointBackward before(long j10) {
        return new DateValidatorPointBackward(j10);
    }

    @NonNull
    public static DateValidatorPointBackward now() {
        return before(w.h().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.f44473p0 == ((DateValidatorPointBackward) obj).f44473p0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f44473p0)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j10) {
        return j10 <= this.f44473p0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeLong(this.f44473p0);
    }
}
