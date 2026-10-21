package com.bbva.ethermobilesdk.pinning.verifier;

import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.pinning.SiteManager;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.ethermobilesdk.pinning.model.catalog.Site;
import com.bbva.ethermobilesdk.pinning.verifier.impl.HostVerifier;
import com.bbva.ethermobilesdk.pinning.verifier.impl.TrustVerifier;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PeerVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/verifier/PeerVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "verifiers", "", "Lcom/bbva/ethermobilesdk/pinning/verifier/Verifier;", "verify", "", "hostname", "", "session", "Ljavax/net/ssl/SSLSession;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PeerVerifier implements HostnameVerifier {

    @NotNull
    private final List<Verifier> verifiers = CollectionsKt__CollectionsKt.listOf((Object[]) new Verifier[]{new HostVerifier(), new TrustVerifier()});

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String hostname, @NotNull SSLSession session) throws Exception {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            Site siteByHost = SiteManager.INSTANCE.getSiteByHost(hostname);
            for (Verifier verifier : this.verifiers) {
                if (!verifier.verify(hostname, siteByHost, session)) {
                    LoggerKt.logError$default("Cannot verify [" + hostname + "] against [" + siteByHost + "] using [" + verifier.getClass().getCanonicalName() + Constant.BRACKET_CLOSE, null, 2, null);
                    return false;
                }
            }
            LoggerKt.log(LoggerLevel.INFO, "Verified [" + hostname + "] against site [" + siteByHost.getId() + Constant.BRACKET_CLOSE);
            return true;
        } catch (Exception e5) {
            LoggerKt.logError("peerverifier failed to verify [" + hostname + Constant.BRACKET_CLOSE, e5);
            throw e5;
        }
    }
}
