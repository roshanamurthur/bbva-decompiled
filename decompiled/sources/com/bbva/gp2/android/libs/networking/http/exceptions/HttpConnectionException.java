package com.bbva.gp2.android.libs.networking.http.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpConnectionException.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/exceptions/HttpConnectionException;", "Ljava/lang/Exception;", "e", "(Ljava/lang/Exception;)V", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HttpConnectionException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpConnectionException(@NotNull Exception e5) {
        super(e5);
        Intrinsics.checkNotNullParameter(e5, "e");
    }
}
