package com.bbva.ethermobilesdk.pinning.verifier.impl;

import com.bbva.ethermobilesdk.pinning.exception.PinningException;
import com.bbva.ethermobilesdk.pinning.extension.ExceptionKt;
import com.bbva.ethermobilesdk.pinning.model.catalog.Site;
import com.bbva.ethermobilesdk.pinning.model.result.ErrorType;
import com.bbva.ethermobilesdk.pinning.tools.HostToolsKt;
import com.bbva.ethermobilesdk.pinning.verifier.Verifier;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HostVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/verifier/impl/HostVerifier;", "Lcom/bbva/ethermobilesdk/pinning/verifier/Verifier;", "()V", "verify", "", "hostname", "", "site", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Site;", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "host", "serverCertificates", "", "Ljava/security/cert/X509Certificate;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHostVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostVerifier.kt\ncom/bbva/ethermobilesdk/pinning/verifier/impl/HostVerifier\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,52:1\n4098#2,11:53\n*S KotlinDebug\n*F\n+ 1 HostVerifier.kt\ncom/bbva/ethermobilesdk/pinning/verifier/impl/HostVerifier\n*L\n19#1:53,11\n*E\n"})
public final class HostVerifier implements Verifier {
    private final boolean verifyHostname(Site site, String host, List<? extends X509Certificate> serverCertificates) throws PinningException {
        if (!site.getChecker().getHostname()) {
            return true;
        }
        if (serverCertificates.isEmpty()) {
            ExceptionKt.throwError$default(ErrorType.HostServerCertificatesNotFound.INSTANCE, (Throwable) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
        boolean subdomain = site.getChecker().getSubdomain();
        try {
            Iterator<? extends X509Certificate> it = serverCertificates.iterator();
            while (it.hasNext()) {
                if (HostToolsKt.verifyHost(host, it.next(), subdomain)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            if (th2 instanceof PinningException) {
                throw th2;
            }
            ExceptionKt.throwError(ErrorType.HostUnknownError.INSTANCE, th2);
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.bbva.ethermobilesdk.pinning.verifier.Verifier
    public boolean verify(@NotNull String hostname, @NotNull Site site, @NotNull SSLSession session) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(site, "site");
        Intrinsics.checkNotNullParameter(session, "session");
        Certificate[] peerCertificates = session.getPeerCertificates();
        Intrinsics.checkNotNullExpressionValue(peerCertificates, "session.peerCertificates");
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : peerCertificates) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(certificate);
            }
        }
        return verifyHostname(site, hostname, arrayList);
    }
}
