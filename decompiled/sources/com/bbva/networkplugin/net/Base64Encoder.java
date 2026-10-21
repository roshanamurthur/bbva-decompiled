package com.bbva.networkplugin.net;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Base64Encoder.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/networkplugin/net/Base64Encoder;", "", "()V", "toBase64", "", "byteArray", "", "network-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Base64Encoder {
    @NotNull
    public final String toBase64(@Nullable byte[] byteArray) {
        String strEncodeToString = Base64.encodeToString(byteArray, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(byteArray, Base64.NO_WRAP)");
        return strEncodeToString;
    }
}
