package com.google.firebase.sessions;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsData;", "", "", "component1", AuthConstants.SESSION_ID, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FirebaseSessionsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String sessionId;

    public FirebaseSessionsData(@Nullable String str) {
        this.sessionId = str;
    }

    public static /* synthetic */ FirebaseSessionsData copy$default(FirebaseSessionsData firebaseSessionsData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = firebaseSessionsData.sessionId;
        }
        return firebaseSessionsData.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final FirebaseSessionsData copy(@Nullable String sessionId) {
        return new FirebaseSessionsData(sessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FirebaseSessionsData) && Intrinsics.areEqual(this.sessionId, ((FirebaseSessionsData) other).sessionId);
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("FirebaseSessionsData(sessionId="), this.sessionId, RootService.CLOSE_BRACKET);
    }
}
