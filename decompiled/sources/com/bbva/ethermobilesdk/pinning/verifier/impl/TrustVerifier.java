package com.bbva.ethermobilesdk.pinning.verifier.impl;

import com.bbva.ethermobilesdk.cipher.factory.TrustVerifierKt;
import com.bbva.ethermobilesdk.pinning.exception.PinningException;
import com.bbva.ethermobilesdk.pinning.extension.ExceptionKt;
import com.bbva.ethermobilesdk.pinning.model.catalog.Site;
import com.bbva.ethermobilesdk.pinning.model.result.ErrorType;
import com.bbva.ethermobilesdk.pinning.verifier.Verifier;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TrustVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/verifier/impl/TrustVerifier;", "Lcom/bbva/ethermobilesdk/pinning/verifier/Verifier;", "()V", "verify", "", "hostname", "", "site", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Site;", "session", "Ljavax/net/ssl/SSLSession;", "verifyServerTrust", "serverCertificates", "", "Ljava/security/cert/X509Certificate;", "cipherSuite", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrustVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrustVerifier.kt\ncom/bbva/ethermobilesdk/pinning/verifier/impl/TrustVerifier\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,55:1\n4098#2,11:56\n*S KotlinDebug\n*F\n+ 1 TrustVerifier.kt\ncom/bbva/ethermobilesdk/pinning/verifier/impl/TrustVerifier\n*L\n20#1:56,11\n*E\n"})
public final class TrustVerifier implements Verifier {
    private final boolean verifyServerTrust(Site site, List<? extends X509Certificate> serverCertificates, String cipherSuite) throws PinningException {
        try {
            Result.Companion companion = Result.INSTANCE;
            List<X509TrustManager> listTrustManagers = site.trustManagers();
            if (serverCertificates.isEmpty() || listTrustManagers.isEmpty()) {
                ExceptionKt.throwError$default(ErrorType.TrustMangerNotAvailable.INSTANCE, (Throwable) null, 2, (Object) null);
                throw new KotlinNothingValueException();
            }
            boolean certificateTrust = site.getChecker().getCertificateTrust();
            boolean certificateDates = site.getChecker().getCertificateDates();
            if (certificateTrust) {
                TrustVerifierKt.checkServerTrust(listTrustManagers, serverCertificates, cipherSuite, certificateTrust, certificateDates);
            }
            if (!certificateDates) {
                return true;
            }
            TrustVerifierKt.checkDates(serverCertificates);
            return true;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(Result.m5535constructorimpl(ResultKt.createFailure(th2)));
            if (thM5538exceptionOrNullimpl == null) {
                throw new KotlinNothingValueException();
            }
            ExceptionKt.throwError(ExceptionKt.cipherToPinningException(thM5538exceptionOrNullimpl).getError(), thM5538exceptionOrNullimpl);
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
        String cipherSuite = session.getCipherSuite();
        Intrinsics.checkNotNullExpressionValue(cipherSuite, "session.cipherSuite");
        return verifyServerTrust(site, arrayList, cipherSuite);
    }
}
