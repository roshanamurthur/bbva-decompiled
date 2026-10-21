package com.bbva.glomo.semaas.data;

import com.bbva.glomo.semaas.SemaasRefreshTokenProvider;
import com.bbva.network.NetworkWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemaasConfigProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\u0006\u0010%\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012R\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012¨\u0006("}, d2 = {"Lcom/bbva/glomo/semaas/data/SemaasConfigProvider;", "", "Lcom/bbva/network/NetworkWorker;", "a", "Lcom/bbva/network/NetworkWorker;", "getNetworkWorker", "()Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/glomo/semaas/SemaasRefreshTokenProvider;", "b", "Lcom/bbva/glomo/semaas/SemaasRefreshTokenProvider;", "getRefreshTokenProvider", "()Lcom/bbva/glomo/semaas/SemaasRefreshTokenProvider;", "refreshTokenProvider", "", "c", "Ljava/lang/String;", "getTokenConfigHost", "()Ljava/lang/String;", "tokenConfigHost", "d", "getConsumerId", "consumerId", "e", "getValidationPolicy", "validationPolicy", "f", "getRhoHost", "rhoHost", "g", "getOmegaHost", "omegaHost", "h", "getNamespace", "namespace", "i", "getMrId", "mrId", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/glomo/semaas/SemaasRefreshTokenProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
public final class SemaasConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkWorker networkWorker;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SemaasRefreshTokenProvider refreshTokenProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenConfigHost;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String consumerId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String validationPolicy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String rhoHost;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String omegaHost;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String namespace;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String mrId;

    public SemaasConfigProvider(@NotNull NetworkWorker networkWorker, @NotNull SemaasRefreshTokenProvider refreshTokenProvider, @NotNull String tokenConfigHost, @NotNull String consumerId, @NotNull String validationPolicy, @NotNull String rhoHost, @NotNull String omegaHost, @NotNull String namespace, @NotNull String mrId) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(refreshTokenProvider, "refreshTokenProvider");
        Intrinsics.checkNotNullParameter(tokenConfigHost, "tokenConfigHost");
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        Intrinsics.checkNotNullParameter(validationPolicy, "validationPolicy");
        Intrinsics.checkNotNullParameter(rhoHost, "rhoHost");
        Intrinsics.checkNotNullParameter(omegaHost, "omegaHost");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(mrId, "mrId");
        this.networkWorker = networkWorker;
        this.refreshTokenProvider = refreshTokenProvider;
        this.tokenConfigHost = tokenConfigHost;
        this.consumerId = consumerId;
        this.validationPolicy = validationPolicy;
        this.rhoHost = rhoHost;
        this.omegaHost = omegaHost;
        this.namespace = namespace;
        this.mrId = mrId;
    }

    @NotNull
    public final String getConsumerId() {
        return this.consumerId;
    }

    @NotNull
    public final String getMrId() {
        return this.mrId;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    @NotNull
    public final NetworkWorker getNetworkWorker() {
        return this.networkWorker;
    }

    @NotNull
    public final String getOmegaHost() {
        return this.omegaHost;
    }

    @NotNull
    public final SemaasRefreshTokenProvider getRefreshTokenProvider() {
        return this.refreshTokenProvider;
    }

    @NotNull
    public final String getRhoHost() {
        return this.rhoHost;
    }

    @NotNull
    public final String getTokenConfigHost() {
        return this.tokenConfigHost;
    }

    @NotNull
    public final String getValidationPolicy() {
        return this.validationPolicy;
    }
}
