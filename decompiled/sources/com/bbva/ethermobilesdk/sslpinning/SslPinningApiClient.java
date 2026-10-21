package com.bbva.ethermobilesdk.sslpinning;

import android.content.Context;
import com.bbva.ethermobilesdk.ethercore.EtherClient;
import com.bbva.ethermobilesdk.sslpinning.exception.RepositoryInitializationException;
import com.bbva.ethermobilesdk.sslpinning.manager.InitializationErrorManager;
import com.bbva.sl.ar.android.sslpinning.SSLChecker;
import com.bbva.sl.ar.android.sslpinning.SSLPinning;
import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningException;
import com.bbva.sl.ar.android.sslpinning.net.SSLPinningConnection;
import com.bbva.sl.ar.android.sslpinning.result.CheckResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SslPinningApiClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/sslpinning/SslPinningApiClient;", "Lcom/bbva/ethermobilesdk/ethercore/EtherClient;", "Landroid/content/Context;", "context", "Lcom/bbva/ethermobilesdk/sslpinning/SslPinningApiConfig;", "config", "", "init$sslpinning_release", "(Landroid/content/Context;Lcom/bbva/ethermobilesdk/sslpinning/SslPinningApiConfig;)V", "init", "updateCatalog", "getLastUpdateError", "Lcom/bbva/sl/ar/android/sslpinning/net/SSLPinningConnection;", "connection", "Lcom/bbva/sl/ar/android/sslpinning/result/CheckResult;", "verifyConnection", "<init>", "()V", "sslpinning_release"}, k = 1, mv = {1, 4, 0})
public final class SslPinningApiClient implements EtherClient {
    public static final SslPinningApiClient INSTANCE = new SslPinningApiClient();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SSLChecker f30030a;

    public static SSLChecker a(Context context, SslPinningApiConfig sslPinningApiConfig, boolean z10) throws InitializationException {
        try {
            SSLPinning sSLPinning = SSLPinning.getInstance(context, sslPinningApiConfig.getSslCheck(), z10);
            Intrinsics.checkExpressionValueIsNotNull(sSLPinning, "SSLPinning.getInstance(c…, config.sslCheck, reset)");
            SSLChecker checker = sSLPinning.getChecker();
            Intrinsics.checkExpressionValueIsNotNull(checker, "SSLPinning.getInstance(c….sslCheck, reset).checker");
            return checker;
        } catch (Exception e5) {
            throw new InitializationErrorManager().handlerException(e5);
        }
    }

    public final void getLastUpdateError(@NotNull Context context, @NotNull SslPinningApiConfig config) throws InitializationException {
        SSLPinning sSLPinning = SSLPinning.getInstance(context, config.getSslCheck());
        Intrinsics.checkExpressionValueIsNotNull(sSLPinning, "SSLPinning.getInstance(context, config.sslCheck)");
        sSLPinning.getLastUpdateError();
    }

    public final void init$sslpinning_release(@NotNull Context context, @NotNull SslPinningApiConfig config) throws InitializationException {
        SSLChecker sSLCheckerA;
        try {
            sSLCheckerA = a(context, config, config.getReset());
        } catch (InitializationException e5) {
            if (!(e5 instanceof RepositoryInitializationException) || config.getReset()) {
                throw e5;
            }
            sSLCheckerA = a(context, config, true);
        }
        f30030a = sSLCheckerA;
    }

    public final void updateCatalog(@NotNull Context context, @NotNull SslPinningApiConfig config) throws InitializationException {
        SSLPinning.getInstance(context, config.getSslCheck()).updateCatalog();
    }

    @NotNull
    public final CheckResult verifyConnection(@NotNull SSLPinningConnection connection) throws SSLPinningException {
        SSLChecker sSLChecker = f30030a;
        if (sSLChecker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSslChecker");
        }
        CheckResult checkResultCheckEstablished = sSLChecker.checkEstablished(connection);
        Intrinsics.checkExpressionValueIsNotNull(checkResultCheckEstablished, "mSslChecker.checkEstablished(connection)");
        return checkResultCheckEstablished;
    }
}
