package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Month f44456p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final Month f44457q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final DateValidator f44458r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public Month f44459s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f44460t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f44461u0;
    public final int v0;

    public static final class Builder {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f44462f = w.a(Month.b(ReturnCode.ERR_REPOSITORY, 0).f44526u0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f44463g = w.a(Month.b(2100, 11).f44526u0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f44466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44467d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f44464a = f44462f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f44465b = f44463g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DateValidator f44468e = DateValidatorPointForward.from(Long.MIN_VALUE);

        @NonNull
        public CalendarConstraints build() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f44468e);
            Month monthC = Month.c(this.f44464a);
            Month monthC2 = Month.c(this.f44465b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l6 = this.f44466c;
            return new CalendarConstraints(monthC, monthC2, dateValidator, l6 == null ? null : Month.c(l6.longValue()), this.f44467d);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setEnd(long j10) {
            this.f44465b = j10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setFirstDayOfWeek(int i10) {
            this.f44467d = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOpenAt(long j10) {
            this.f44466c = Long.valueOf(j10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setStart(long j10) {
            this.f44464a = j10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setValidator(@NonNull DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f44468e = dateValidator;
            return this;
        }
    }

    public interface DateValidator extends Parcelable {
        boolean isValid(long j10);
    }

    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f44456p0 = month;
        this.f44457q0 = month2;
        this.f44459s0 = month3;
        this.f44460t0 = i10;
        this.f44458r0 = dateValidator;
        if (month3 != null && month.f44521p0.compareTo(month3.f44521p0) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f44521p0.compareTo(month2.f44521p0) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > w.i(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.v0 = month.e(month2) + 1;
        this.f44461u0 = (month2.f44523r0 - month.f44523r0) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f44456p0.equals(calendarConstraints.f44456p0) && this.f44457q0.equals(calendarConstraints.f44457q0) && ObjectsCompat.equals(this.f44459s0, calendarConstraints.f44459s0) && this.f44460t0 == calendarConstraints.f44460t0 && this.f44458r0.equals(calendarConstraints.f44458r0);
    }

    public DateValidator getDateValidator() {
        return this.f44458r0;
    }

    public long getEndMs() {
        return this.f44457q0.f44526u0;
    }

    @Nullable
    public Long getOpenAtMs() {
        Month month = this.f44459s0;
        if (month == null) {
            return null;
        }
        return Long.valueOf(month.f44526u0);
    }

    public long getStartMs() {
        return this.f44456p0.f44526u0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44456p0, this.f44457q0, this.f44459s0, Integer.valueOf(this.f44460t0), this.f44458r0});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f44456p0, 0);
        parcel.writeParcelable(this.f44457q0, 0);
        parcel.writeParcelable(this.f44459s0, 0);
        parcel.writeParcelable(this.f44458r0, 0);
        parcel.writeInt(this.f44460t0);
    }
}
