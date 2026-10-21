package com.google.firebase.sessions;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/sessions/DataCollectionStatus;", "", "Lcom/google/firebase/sessions/DataCollectionState;", "component1", "component2", "", "component3", "performance", CrashlyticsHandler.ID, "sessionSamplingRate", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/google/firebase/sessions/DataCollectionState;", "getPerformance", "()Lcom/google/firebase/sessions/DataCollectionState;", "b", "getCrashlytics", "c", "D", "getSessionSamplingRate", "()D", "<init>", "(Lcom/google/firebase/sessions/DataCollectionState;Lcom/google/firebase/sessions/DataCollectionState;D)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DataCollectionStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DataCollectionState performance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DataCollectionState crashlytics;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final double sessionSamplingRate;

    public DataCollectionStatus() {
        this(null, null, 0.0d, 7, null);
    }

    public static /* synthetic */ DataCollectionStatus copy$default(DataCollectionStatus dataCollectionStatus, DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dataCollectionState = dataCollectionStatus.performance;
        }
        if ((i10 & 2) != 0) {
            dataCollectionState2 = dataCollectionStatus.crashlytics;
        }
        if ((i10 & 4) != 0) {
            d2 = dataCollectionStatus.sessionSamplingRate;
        }
        return dataCollectionStatus.copy(dataCollectionState, dataCollectionState2, d2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataCollectionState getPerformance() {
        return this.performance;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @NotNull
    public final DataCollectionStatus copy(@NotNull DataCollectionState performance, @NotNull DataCollectionState crashlytics, double sessionSamplingRate) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        return new DataCollectionStatus(performance, crashlytics, sessionSamplingRate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataCollectionStatus)) {
            return false;
        }
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) other;
        return this.performance == dataCollectionStatus.performance && this.crashlytics == dataCollectionStatus.crashlytics && Intrinsics.areEqual((Object) Double.valueOf(this.sessionSamplingRate), (Object) Double.valueOf(dataCollectionStatus.sessionSamplingRate));
    }

    @NotNull
    public final DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    @NotNull
    public final DataCollectionState getPerformance() {
        return this.performance;
    }

    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        int iHashCode = (this.crashlytics.hashCode() + (this.performance.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.sessionSamplingRate);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    @NotNull
    public String toString() {
        return "DataCollectionStatus(performance=" + this.performance + ", crashlytics=" + this.crashlytics + ", sessionSamplingRate=" + this.sessionSamplingRate + RootService.CLOSE_BRACKET;
    }

    public DataCollectionStatus(@NotNull DataCollectionState performance, @NotNull DataCollectionState crashlytics, double d2) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.performance = performance;
        this.crashlytics = crashlytics;
        this.sessionSamplingRate = d2;
    }

    public /* synthetic */ DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState, (i10 & 2) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState2, (i10 & 4) != 0 ? 1.0d : d2);
    }
}
