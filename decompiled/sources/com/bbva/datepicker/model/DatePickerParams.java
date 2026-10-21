package com.bbva.datepicker.model;

import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxDateConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMinDateConditionFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: DatePickerParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/bbva/datepicker/model/DatePickerParams;", "", "", "a", "J", "getCurrentDate", "()J", "currentDate", "b", "getMinDate", LandingMinDateConditionFilter.ID, "c", "getMaxDate", LandingMaxDateConditionFilter.ID, "", "d", "Z", "getDisableWeekends", "()Z", "disableWeekends", "<init>", "(JJJZ)V", "datepicker_release"}, k = 1, mv = {1, 4, 2})
public final class DatePickerParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long currentDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long minDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long maxDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean disableWeekends;

    public DatePickerParams(long j10, long j11, long j12, boolean z10) {
        this.currentDate = j10;
        this.minDate = j11;
        this.maxDate = j12;
        this.disableWeekends = z10;
    }

    public final long getCurrentDate() {
        return this.currentDate;
    }

    public final boolean getDisableWeekends() {
        return this.disableWeekends;
    }

    public final long getMaxDate() {
        return this.maxDate;
    }

    public final long getMinDate() {
        return this.minDate;
    }

    public /* synthetic */ DatePickerParams(long j10, long j11, long j12, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? -1L : j11, (i10 & 4) != 0 ? -1L : j12, z10);
    }
}
