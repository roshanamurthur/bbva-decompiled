package com.bbva.semaas;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/semaas/SEMaaSConfig;", "", "token", "Lcom/bbva/semaas/TokenConfig;", "rho", "Lcom/bbva/semaas/RhoConfig;", "omega", "Lcom/bbva/semaas/OmegaConfig;", "(Lcom/bbva/semaas/TokenConfig;Lcom/bbva/semaas/RhoConfig;Lcom/bbva/semaas/OmegaConfig;)V", "getOmega", "()Lcom/bbva/semaas/OmegaConfig;", "getRho", "()Lcom/bbva/semaas/RhoConfig;", "getToken", "()Lcom/bbva/semaas/TokenConfig;", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SEMaaSConfig {

    @Nullable
    private final OmegaConfig omega;

    @Nullable
    private final RhoConfig rho;

    @NotNull
    private final TokenConfig token;

    public SEMaaSConfig(@NotNull TokenConfig token, @Nullable RhoConfig rhoConfig, @Nullable OmegaConfig omegaConfig) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.rho = rhoConfig;
        this.omega = omegaConfig;
    }

    @Nullable
    public final OmegaConfig getOmega() {
        return this.omega;
    }

    @Nullable
    public final RhoConfig getRho() {
        return this.rho;
    }

    @NotNull
    public final TokenConfig getToken() {
        return this.token;
    }
}
