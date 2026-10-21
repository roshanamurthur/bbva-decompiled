package com.google.firebase.sessions;

import android.util.Base64;
import androidx.camera.camera2.internal.h0;
import kotlin.Metadata;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SessionDataStoreConfigs.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/google/firebase/sessions/SessionDataStoreConfigs;", "", "", "a", "Ljava/lang/String;", "getSESSIONS_CONFIG_NAME", "()Ljava/lang/String;", "SESSIONS_CONFIG_NAME", "b", "getSETTINGS_CONFIG_NAME", "SETTINGS_CONFIG_NAME", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class SessionDataStoreConfigs {

    @NotNull
    public static final SessionDataStoreConfigs INSTANCE = new SessionDataStoreConfigs();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String SESSIONS_CONFIG_NAME;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String SETTINGS_CONFIG_NAME;

    static {
        String strEncodeToString = Base64.encodeToString(l.encodeToByteArray(ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions()), 10);
        SESSIONS_CONFIG_NAME = h0.b("firebase_session_", strEncodeToString, "_data");
        SETTINGS_CONFIG_NAME = h0.b("firebase_session_", strEncodeToString, "_settings");
    }

    @NotNull
    public final String getSESSIONS_CONFIG_NAME() {
        return SESSIONS_CONFIG_NAME;
    }

    @NotNull
    public final String getSETTINGS_CONFIG_NAME() {
        return SETTINGS_CONFIG_NAME;
    }
}
