package com.google.android.material.datepicker;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.material3.DatePickerDefaults;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Calendar f44521p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f44522q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f44523r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f44524s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f44525t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final long f44526u0;

    @Nullable
    public String v0;

    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Month createFromParcel(@NonNull Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = w.d(calendar);
        this.f44521p0 = calendarD;
        this.f44522q0 = calendarD.get(2);
        this.f44523r0 = calendarD.get(1);
        this.f44524s0 = calendarD.getMaximum(7);
        this.f44525t0 = calendarD.getActualMaximum(5);
        this.f44526u0 = calendarD.getTimeInMillis();
    }

    @NonNull
    public static Month b(int i10, int i11) {
        Calendar calendarI = w.i(null);
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new Month(calendarI);
    }

    @NonNull
    public static Month c(long j10) {
        Calendar calendarI = w.i(null);
        calendarI.setTimeInMillis(j10);
        return new Month(calendarI);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull Month month) {
        return this.f44521p0.compareTo(month.f44521p0);
    }

    @NonNull
    public final String d() {
        if (this.v0 == null) {
            long timeInMillis = this.f44521p0.getTimeInMillis();
            this.v0 = Build.VERSION.SDK_INT >= 24 ? w.c(DatePickerDefaults.YearMonthSkeleton, Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        return this.v0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(@NonNull Month month) {
        if (!(this.f44521p0 instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f44522q0 - this.f44522q0) + ((month.f44523r0 - this.f44523r0) * 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f44522q0 == month.f44522q0 && this.f44523r0 == month.f44523r0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f44522q0), Integer.valueOf(this.f44523r0)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f44523r0);
        parcel.writeInt(this.f44522q0);
    }
}
