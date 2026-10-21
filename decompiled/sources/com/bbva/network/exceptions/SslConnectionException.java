package com.bbva.network.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: exceptions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/network/exceptions/SslConnectionException;", "Lcom/bbva/network/exceptions/ConnectionException;", "", "r0", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final class SslConnectionException extends ConnectionException {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SslConnectionException(@NotNull String url, @Nullable String str) {
        super(str, null, null, 4, null);
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
