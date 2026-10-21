package com.bbva.datepicker.plugin.model;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxDateConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMinDateConditionFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/bbva/datepicker/plugin/model/GetRequest;", "", "dateFormat", "", "defaultDate", LandingMinDateConditionFilter.ID, LandingMaxDateConditionFilter.ID, "disableWeekends", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDateFormat", "()Ljava/lang/String;", "getDefaultDate", "getDisableWeekends", "()Z", "getMaxDate", "getMinDate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "datepicker-plugin_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class GetRequest {

    @Nullable
    private final String dateFormat;

    @Nullable
    private final String defaultDate;
    private final boolean disableWeekends;

    @Nullable
    private final String maxDate;

    @Nullable
    private final String minDate;

    public GetRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z10) {
        this.dateFormat = str;
        this.defaultDate = str2;
        this.minDate = str3;
        this.maxDate = str4;
        this.disableWeekends = z10;
    }

    public static /* synthetic */ GetRequest copy$default(GetRequest getRequest, String str, String str2, String str3, String str4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getRequest.dateFormat;
        }
        if ((i10 & 2) != 0) {
            str2 = getRequest.defaultDate;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = getRequest.minDate;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = getRequest.maxDate;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            z10 = getRequest.disableWeekends;
        }
        return getRequest.copy(str, str5, str6, str7, z10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDateFormat() {
        return this.dateFormat;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefaultDate() {
        return this.defaultDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinDate() {
        return this.minDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxDate() {
        return this.maxDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDisableWeekends() {
        return this.disableWeekends;
    }

    @NotNull
    public final GetRequest copy(@Nullable String dateFormat, @Nullable String defaultDate, @Nullable String minDate, @Nullable String maxDate, boolean disableWeekends) {
        return new GetRequest(dateFormat, defaultDate, minDate, maxDate, disableWeekends);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetRequest)) {
            return false;
        }
        GetRequest getRequest = (GetRequest) other;
        return Intrinsics.areEqual(this.dateFormat, getRequest.dateFormat) && Intrinsics.areEqual(this.defaultDate, getRequest.defaultDate) && Intrinsics.areEqual(this.minDate, getRequest.minDate) && Intrinsics.areEqual(this.maxDate, getRequest.maxDate) && this.disableWeekends == getRequest.disableWeekends;
    }

    @Nullable
    public final String getDateFormat() {
        return this.dateFormat;
    }

    @Nullable
    public final String getDefaultDate() {
        return this.defaultDate;
    }

    public final boolean getDisableWeekends() {
        return this.disableWeekends;
    }

    @Nullable
    public final String getMaxDate() {
        return this.maxDate;
    }

    @Nullable
    public final String getMinDate() {
        return this.minDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.dateFormat;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.defaultDate;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.minDate;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.maxDate;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z10 = this.disableWeekends;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode4 + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GetRequest(dateFormat=");
        sb2.append(this.dateFormat);
        sb2.append(", defaultDate=");
        sb2.append(this.defaultDate);
        sb2.append(", minDate=");
        sb2.append(this.minDate);
        sb2.append(", maxDate=");
        sb2.append(this.maxDate);
        sb2.append(", disableWeekends=");
        return i.c(sb2, this.disableWeekends, ")");
    }

    public /* synthetic */ GetRequest(String str, String str2, String str3, String str4, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? false : z10);
    }
}
