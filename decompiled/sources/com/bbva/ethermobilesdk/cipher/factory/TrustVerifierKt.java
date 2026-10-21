package com.bbva.ethermobilesdk.cipher.factory;

import com.bbva.ethermobilesdk.cipher.error.TrustVerifierErrorType;
import com.bbva.ethermobilesdk.cipher.extension.ThrowableKt;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TrustVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a>\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0000\u001a\u00020\f¨\u0006\r"}, d2 = {"checkDates", "", "certificates", "", "Ljava/security/cert/X509Certificate;", "checkServerTrust", "chain", "Ljavax/net/ssl/X509TrustManager;", "x509Certificates", "cipherSuite", "", "checkTrust", "", "cipher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrustVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrustVerifier.kt\ncom/bbva/ethermobilesdk/cipher/factory/TrustVerifierKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,59:1\n1855#2,2:60\n1855#2:62\n1856#2:65\n37#3,2:63\n*S KotlinDebug\n*F\n+ 1 TrustVerifier.kt\ncom/bbva/ethermobilesdk/cipher/factory/TrustVerifierKt\n*L\n22#1:60,2\n52#1:62\n52#1:65\n53#1:63,2\n*E\n"})
public final class TrustVerifierKt {
    public static final void checkDates(@NotNull List<? extends X509Certificate> certificates) throws TrustVerifierErrorType.TrustDateBeforeValidity, TrustVerifierErrorType, TrustVerifierErrorType.TrustDateAfterValidity {
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        Date date = new Date();
        for (X509Certificate x509Certificate : certificates) {
            if (date.after(x509Certificate.getNotAfter())) {
                Date notAfter = x509Certificate.getNotAfter();
                Intrinsics.checkNotNullExpressionValue(notAfter, "it.notAfter");
                throw new TrustVerifierErrorType.TrustDateAfterValidity(notAfter, 0, null, 6, null);
            }
            if (date.before(x509Certificate.getNotBefore())) {
                Date notBefore = x509Certificate.getNotBefore();
                Intrinsics.checkNotNullExpressionValue(notBefore, "it.notBefore");
                throw new TrustVerifierErrorType.TrustDateBeforeValidity(notBefore, 0, null, 6, null);
            }
        }
    }

    public static final void checkServerTrust(@NotNull List<? extends X509TrustManager> chain, @NotNull List<? extends X509Certificate> x509Certificates, @NotNull String cipherSuite, boolean z10, boolean z11) throws TrustVerifierErrorType, TrustVerifierErrorType.TrustServerHandshakeError {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(x509Certificates, "x509Certificates");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator<T> it = chain.iterator();
            while (it.hasNext()) {
                ((X509TrustManager) it.next()).checkServerTrusted((X509Certificate[]) x509Certificates.toArray(new X509Certificate[0]), cipherSuite);
            }
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            throw new TrustVerifierErrorType.TrustServerHandshakeError(ThrowableKt.trustMessage(thM5538exceptionOrNullimpl, z10, z11), 0, null, 6, null);
        }
    }

    public static /* synthetic */ void checkServerTrust$default(List list, List list2, String str, boolean z10, boolean z11, int i10, Object obj) throws TrustVerifierErrorType, TrustVerifierErrorType.TrustServerHandshakeError {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        checkServerTrust(list, list2, str, z10, z11);
    }
}
