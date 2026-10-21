package com.bbva.glomohybrid.landing.presentation.model;

import androidx.appcompat.widget.a;
import androidx.camera.camera2.internal.n1;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingGreetingRange.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingGreetingRange;", "", "", "component1", "component2", "", "component3", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "resource", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getStart", "()Ljava/lang/String;", "b", "getEnd", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getResource", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingGreetingRange {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int resource;

    public LandingGreetingRange(@NotNull String start, @NotNull String end, int i10) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
        this.resource = i10;
    }

    public static /* synthetic */ LandingGreetingRange copy$default(LandingGreetingRange landingGreetingRange, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = landingGreetingRange.start;
        }
        if ((i11 & 2) != 0) {
            str2 = landingGreetingRange.end;
        }
        if ((i11 & 4) != 0) {
            i10 = landingGreetingRange.resource;
        }
        return landingGreetingRange.copy(str, str2, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getResource() {
        return this.resource;
    }

    @NotNull
    public final LandingGreetingRange copy(@NotNull String start, @NotNull String end, int resource) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return new LandingGreetingRange(start, end, resource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingGreetingRange)) {
            return false;
        }
        LandingGreetingRange landingGreetingRange = (LandingGreetingRange) other;
        return Intrinsics.areEqual(this.start, landingGreetingRange.start) && Intrinsics.areEqual(this.end, landingGreetingRange.end) && this.resource == landingGreetingRange.resource;
    }

    @NotNull
    public final String getEnd() {
        return this.end;
    }

    public final int getResource() {
        return this.resource;
    }

    @NotNull
    public final String getStart() {
        return this.start;
    }

    public int hashCode() {
        return n1.c(this.end, this.start.hashCode() * 31, 31) + this.resource;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingGreetingRange(start=");
        sb2.append(this.start);
        sb2.append(", end=");
        sb2.append(this.end);
        sb2.append(", resource=");
        return a.c(sb2, this.resource, ")");
    }
}
