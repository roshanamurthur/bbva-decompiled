package com.bbva.semaas;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bbva/semaas/TokenConfig;", "", "host", "", "consumerId", "validationPolicy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConsumerId", "()Ljava/lang/String;", "getHost", "getValidationPolicy", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TokenConfig {

    @NotNull
    private final String consumerId;

    @NotNull
    private final String host;

    @NotNull
    private final String validationPolicy;

    public TokenConfig(@NotNull String host, @NotNull String consumerId, @NotNull String validationPolicy) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        Intrinsics.checkNotNullParameter(validationPolicy, "validationPolicy");
        this.host = host;
        this.consumerId = consumerId;
        this.validationPolicy = validationPolicy;
    }

    @NotNull
    public final String getConsumerId() {
        return this.consumerId;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getValidationPolicy() {
        return this.validationPolicy;
    }
}
