package com.bbva.zoomauth.facialauth;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AuxCache.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/bbva/zoomauth/facialauth/AuxCache;", "", "", "a", "Ljava/lang/String;", "getSUCCESS_FACIAL_AUTH_DATA", "()Ljava/lang/String;", "setSUCCESS_FACIAL_AUTH_DATA", "(Ljava/lang/String;)V", "SUCCESS_FACIAL_AUTH_DATA", "b", "getSUCCESS_BASE_64_DATA", "setSUCCESS_BASE_64_DATA", "SUCCESS_BASE_64_DATA", "<init>", "()V", "zoomauth_release"}, k = 1, mv = {1, 5, 1})
public final class AuxCache {

    @NotNull
    public static final AuxCache INSTANCE = new AuxCache();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static String SUCCESS_FACIAL_AUTH_DATA = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static String SUCCESS_BASE_64_DATA = "";

    @NotNull
    public final String getSUCCESS_BASE_64_DATA() {
        return SUCCESS_BASE_64_DATA;
    }

    @NotNull
    public final String getSUCCESS_FACIAL_AUTH_DATA() {
        return SUCCESS_FACIAL_AUTH_DATA;
    }

    public final void setSUCCESS_BASE_64_DATA(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SUCCESS_BASE_64_DATA = str;
    }

    public final void setSUCCESS_FACIAL_AUTH_DATA(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SUCCESS_FACIAL_AUTH_DATA = str;
    }
}
