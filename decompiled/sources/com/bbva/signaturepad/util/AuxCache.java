package com.bbva.signaturepad.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AuxCache.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/signaturepad/util/AuxCache;", "", "", "a", "Ljava/lang/String;", "getSUCCESS_DIGITAL_SIGN_DATA", "()Ljava/lang/String;", "setSUCCESS_DIGITAL_SIGN_DATA", "(Ljava/lang/String;)V", "SUCCESS_DIGITAL_SIGN_DATA", "<init>", "()V", "signaturepad_release"}, k = 1, mv = {1, 9, 0})
public final class AuxCache {

    @NotNull
    public static final AuxCache INSTANCE = new AuxCache();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static String SUCCESS_DIGITAL_SIGN_DATA = "";

    @NotNull
    public final String getSUCCESS_DIGITAL_SIGN_DATA() {
        return SUCCESS_DIGITAL_SIGN_DATA;
    }

    public final void setSUCCESS_DIGITAL_SIGN_DATA(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SUCCESS_DIGITAL_SIGN_DATA = str;
    }
}
