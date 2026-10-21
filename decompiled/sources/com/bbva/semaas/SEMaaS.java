package com.bbva.semaas;

import android.content.Context;
import com.bbva.network.NetworkWorker;
import com.bbva.semaas.client.OmegaClient;
import com.bbva.semaas.client.OmegaClientImpl;
import com.bbva.semaas.client.RhoClient;
import com.bbva.semaas.client.RhoClientImpl;
import com.bbva.semaas.datasource.RemoteDataSource;
import com.bbva.semaas.model.Omega;
import com.bbva.semaas.model.Rho;
import com.bbva.semaas.token.AccessTokenProvider;
import com.bbva.semaas.token.AccessTokenProviderImpl;
import com.bbva.semaas.token.RefreshTokenProvider;
import com.bbva.semaas.token.datasource.LocalAccessTokenDataSource;
import com.bbva.semaas.token.datasource.RemoteAccessTokenDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SEMaaS.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/semaas/SEMaaS;", "", "context", "Landroid/content/Context;", "config", "Lcom/bbva/semaas/SEMaaSConfig;", "networkWorker", "Lcom/bbva/network/NetworkWorker;", "refreshTokenProvider", "Lcom/bbva/semaas/token/RefreshTokenProvider;", "cipher", "Lcom/bbva/semaas/Cipher;", "(Landroid/content/Context;Lcom/bbva/semaas/SEMaaSConfig;Lcom/bbva/network/NetworkWorker;Lcom/bbva/semaas/token/RefreshTokenProvider;Lcom/bbva/semaas/Cipher;)V", "<set-?>", "Lcom/bbva/semaas/client/OmegaClient;", "omega", "getOmega", "()Lcom/bbva/semaas/client/OmegaClient;", "Lcom/bbva/semaas/client/RhoClient;", "rho", "getRho", "()Lcom/bbva/semaas/client/RhoClient;", "createAccessTokenProvider", "Lcom/bbva/semaas/token/AccessTokenProvider;", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSEMaaS.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SEMaaS.kt\ncom/bbva/semaas/SEMaaS\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class SEMaaS {

    @NotNull
    private final Cipher cipher;

    @NotNull
    private final SEMaaSConfig config;

    @NotNull
    private final Context context;

    @NotNull
    private final NetworkWorker networkWorker;

    @Nullable
    private OmegaClient omega;

    @NotNull
    private final RefreshTokenProvider refreshTokenProvider;

    @Nullable
    private RhoClient rho;

    public SEMaaS(@NotNull Context context, @NotNull SEMaaSConfig config, @NotNull NetworkWorker networkWorker, @NotNull RefreshTokenProvider refreshTokenProvider, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(refreshTokenProvider, "refreshTokenProvider");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.context = context;
        this.config = config;
        this.networkWorker = networkWorker;
        this.refreshTokenProvider = refreshTokenProvider;
        this.cipher = cipher;
        AccessTokenProvider accessTokenProviderCreateAccessTokenProvider = createAccessTokenProvider();
        OmegaConfig omega = config.getOmega();
        if (omega != null) {
            OmegaClientImpl omegaClientImpl = new OmegaClientImpl(context, omega, new RemoteDataSource(omega, networkWorker, accessTokenProviderCreateAccessTokenProvider, Omega.INSTANCE.serializer()), cipher);
            omegaClientImpl.loadPreviouslySavedWork();
            this.omega = omegaClientImpl;
        }
        RhoConfig rho = config.getRho();
        if (rho != null) {
            RhoClientImpl rhoClientImpl = new RhoClientImpl(context, rho, new RemoteDataSource(rho, networkWorker, accessTokenProviderCreateAccessTokenProvider, Rho.INSTANCE.serializer()), cipher);
            rhoClientImpl.loadPreviouslySavedWork();
            this.rho = rhoClientImpl;
        }
    }

    private final AccessTokenProvider createAccessTokenProvider() {
        return new AccessTokenProviderImpl(new RemoteAccessTokenDataSource(this.config.getToken(), this.networkWorker, this.refreshTokenProvider), new LocalAccessTokenDataSource());
    }

    @Nullable
    public final OmegaClient getOmega() {
        return this.omega;
    }

    @Nullable
    public final RhoClient getRho() {
        return this.rho;
    }

    public /* synthetic */ SEMaaS(Context context, SEMaaSConfig sEMaaSConfig, NetworkWorker networkWorker, RefreshTokenProvider refreshTokenProvider, Cipher cipher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, sEMaaSConfig, networkWorker, refreshTokenProvider, (i10 & 16) != 0 ? new TextPlain() : cipher);
    }
}
