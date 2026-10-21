package com.bbva.ethermobilesdk.pinning.verifier;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PinningVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/verifier/PinningVerifier;", "", "()V", "peerVerifier", "Lcom/bbva/ethermobilesdk/pinning/verifier/PeerVerifier;", "getPeerVerifier", "()Lcom/bbva/ethermobilesdk/pinning/verifier/PeerVerifier;", "sslContext", "Ljavax/net/ssl/SSLContext;", "getSslContext", "()Ljavax/net/ssl/SSLContext;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PinningVerifier {

    @NotNull
    private final PeerVerifier peerVerifier = new PeerVerifier();

    @NotNull
    private final SSLContext sslContext;

    public PinningVerifier() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        sSLContext.init(null, null, null);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLSv1.2\").a…t(null, null, null)\n    }");
        this.sslContext = sSLContext;
    }

    @NotNull
    public final PeerVerifier getPeerVerifier() {
        return this.peerVerifier;
    }

    @NotNull
    public final SSLContext getSslContext() {
        return this.sslContext;
    }
}
