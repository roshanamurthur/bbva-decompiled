package com.google.firebase.sessions;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b¨\u0006."}, d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", "", "component1", "component2", "", "component3", "", "component4", "Lcom/google/firebase/sessions/DataCollectionStatus;", "component5", "component6", AuthConstants.SESSION_ID, "firstSessionId", "sessionIndex", "eventTimestampUs", "dataCollectionStatus", "firebaseInstallationId", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "b", "getFirstSessionId", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSessionIndex", "()I", "d", "J", "getEventTimestampUs", "()J", "e", "Lcom/google/firebase/sessions/DataCollectionStatus;", "getDataCollectionStatus", "()Lcom/google/firebase/sessions/DataCollectionStatus;", "f", "getFirebaseInstallationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/DataCollectionStatus;Ljava/lang/String;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SessionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String firstSessionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int sessionIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long eventTimestampUs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DataCollectionStatus dataCollectionStatus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String firebaseInstallationId;

    public SessionInfo(@NotNull String sessionId, @NotNull String firstSessionId, int i10, long j10, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i10;
        this.eventTimestampUs = j10;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = firebaseInstallationId;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i10, long j10, DataCollectionStatus dataCollectionStatus, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionInfo.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionInfo.firstSessionId;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            i10 = sessionInfo.sessionIndex;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            j10 = sessionInfo.eventTimestampUs;
        }
        long j11 = j10;
        if ((i11 & 16) != 0) {
            dataCollectionStatus = sessionInfo.dataCollectionStatus;
        }
        DataCollectionStatus dataCollectionStatus2 = dataCollectionStatus;
        if ((i11 & 32) != 0) {
            str3 = sessionInfo.firebaseInstallationId;
        }
        return sessionInfo.copy(str, str4, i12, j11, dataCollectionStatus2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @NotNull
    public final SessionInfo copy(@NotNull String sessionId, @NotNull String firstSessionId, int sessionIndex, long eventTimestampUs, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        return new SessionInfo(sessionId, firstSessionId, sessionIndex, eventTimestampUs, dataCollectionStatus, firebaseInstallationId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) other;
        return Intrinsics.areEqual(this.sessionId, sessionInfo.sessionId) && Intrinsics.areEqual(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && Intrinsics.areEqual(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && Intrinsics.areEqual(this.firebaseInstallationId, sessionInfo.firebaseInstallationId);
    }

    @NotNull
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    @NotNull
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @NotNull
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public int hashCode() {
        int iC = (n1.c(this.firstSessionId, this.sessionId.hashCode() * 31, 31) + this.sessionIndex) * 31;
        long j10 = this.eventTimestampUs;
        return this.firebaseInstallationId.hashCode() + ((this.dataCollectionStatus.hashCode() + ((iC + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.sessionId);
        sb2.append(", firstSessionId=");
        sb2.append(this.firstSessionId);
        sb2.append(", sessionIndex=");
        sb2.append(this.sessionIndex);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.eventTimestampUs);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.dataCollectionStatus);
        sb2.append(", firebaseInstallationId=");
        return y2.b(sb2, this.firebaseInstallationId, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ SessionInfo(String str, String str2, int i10, long j10, DataCollectionStatus dataCollectionStatus, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, j10, (i11 & 16) != 0 ? new DataCollectionStatus(null, null, 0.0d, 7, null) : dataCollectionStatus, (i11 & 32) != 0 ? "" : str3);
    }
}
