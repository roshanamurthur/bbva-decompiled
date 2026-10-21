package com.google.firebase.sessions;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionGenerator.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/google/firebase/sessions/SessionDetails;", "", "", "component1", "component2", "", "component3", "", "component4", AuthConstants.SESSION_ID, "firstSessionId", "sessionIndex", "sessionStartTimestampUs", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "b", "getFirstSessionId", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSessionIndex", "()I", "d", "J", "getSessionStartTimestampUs", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SessionDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String firstSessionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int sessionIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long sessionStartTimestampUs;

    public SessionDetails(@NotNull String sessionId, @NotNull String firstSessionId, int i10, long j10) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i10;
        this.sessionStartTimestampUs = j10;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, String str2, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionDetails.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionDetails.firstSessionId;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            i10 = sessionDetails.sessionIndex;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            j10 = sessionDetails.sessionStartTimestampUs;
        }
        return sessionDetails.copy(str, str3, i12, j10);
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
    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    @NotNull
    public final SessionDetails copy(@NotNull String sessionId, @NotNull String firstSessionId, int sessionIndex, long sessionStartTimestampUs) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        return new SessionDetails(sessionId, firstSessionId, sessionIndex, sessionStartTimestampUs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) other;
        return Intrinsics.areEqual(this.sessionId, sessionDetails.sessionId) && Intrinsics.areEqual(this.firstSessionId, sessionDetails.firstSessionId) && this.sessionIndex == sessionDetails.sessionIndex && this.sessionStartTimestampUs == sessionDetails.sessionStartTimestampUs;
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

    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public int hashCode() {
        int iC = (n1.c(this.firstSessionId, this.sessionId.hashCode() * 31, 31) + this.sessionIndex) * 31;
        long j10 = this.sessionStartTimestampUs;
        return iC + ((int) (j10 ^ (j10 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "SessionDetails(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", sessionStartTimestampUs=" + this.sessionStartTimestampUs + RootService.CLOSE_BRACKET;
    }
}
