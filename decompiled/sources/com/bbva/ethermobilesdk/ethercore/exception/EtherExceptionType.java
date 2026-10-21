package com.bbva.ethermobilesdk.ethercore.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherExceptionType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/ethercore/exception/EtherExceptionType;", "", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "NO_CONFIG_PROVIDED", "ethercore_release"}, k = 1, mv = {1, 4, 0})
public enum EtherExceptionType {
    NO_CONFIG_PROVIDED;


    @NotNull
    private final String message = "Required configuration for specific API was not provided";

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
