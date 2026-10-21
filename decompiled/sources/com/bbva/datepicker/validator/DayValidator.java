package com.bbva.datepicker.validator;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.datepicker.extensions.ExtensionsKt;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxDateConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMinDateConditionFilter;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DayValidator.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/bbva/datepicker/validator/DayValidator;", "Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;", "", "date", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "describeContents", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", LandingMinDateConditionFilter.ID, LandingMaxDateConditionFilter.ID, "disableWeekends", "<init>", "(JJZ)V", "datepicker_release"}, k = 1, mv = {1, 4, 2})
public final class DayValidator implements CalendarConstraints.DateValidator {

    @JvmField
    @NotNull
    public final Parcelable.Creator<DayValidator> CREATOR;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Calendar f29011p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f29012q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f29013r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f29014s0;

    public DayValidator() {
        this(0L, 0L, false, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long date) {
        long j10 = this.f29012q0;
        boolean zIsNotEmpty = ExtensionsKt.isNotEmpty(j10);
        long j11 = this.f29013r0;
        if (!zIsNotEmpty || !ExtensionsKt.isNotEmpty(j11) ? !ExtensionsKt.isNotEmpty(j10) ? !ExtensionsKt.isNotEmpty(j11) || date <= j11 : date >= j10 : j10 <= date && j11 >= date) {
            if (!this.f29014s0) {
                return true;
            }
            Calendar utc = this.f29011p0;
            Intrinsics.checkNotNullExpressionValue(utc, "utc");
            utc.setTimeInMillis(date);
            int i10 = utc.get(7);
            if (i10 != 7 && i10 != 1) {
                return true;
            }
        }
        return false;
    }

    public DayValidator(long j10, long j11, boolean z10) {
        this.f29012q0 = j10;
        this.f29013r0 = j11;
        this.f29014s0 = z10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        Unit unit = Unit.INSTANCE;
        this.f29011p0 = calendar;
        this.CREATOR = new Parcelable.Creator<DayValidator>() { // from class: com.bbva.datepicker.validator.DayValidator$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public DayValidator createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new DayValidator(0L, 0L, false, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public DayValidator[] newArray(int size) {
                return new DayValidator[size];
            }
        };
    }

    public /* synthetic */ DayValidator(long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) == 0 ? j11 : -1L, (i10 & 4) != 0 ? false : z10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Nullable Parcel dest, int flags) {
    }
}
