package com.bbva.ethermobilesdk.cipher.factory;

import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.cipher.error.TrustManagerErrorType;
import com.bbva.ethermobilesdk.cipher.extension.ThrowableKt;
import com.bbva.ethermobilesdk.cipher.extension.X509CertificateKt;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TrustManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\b"}, d2 = {"", "id", "", "Ljava/security/cert/X509Certificate;", "certificates", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Ljavax/net/ssl/X509TrustManager;", "loadTrustManagers", "cipher_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTrustManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrustManager.kt\ncom/bbva/ethermobilesdk/cipher/factory/TrustManagerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n4098#2,11:53\n1#3:64\n*S KotlinDebug\n*F\n+ 1 TrustManager.kt\ncom/bbva/ethermobilesdk/cipher/factory/TrustManagerKt\n*L\n27#1:53,11\n*E\n"})
public final class TrustManagerKt {
    public static final TrustManagerFactory a(String str, List<? extends X509Certificate> list) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null);
        for (X509Certificate x509Certificate : list) {
            keyStore.setEntry(c.a("certificate-", str, Constant.DASH_STRING, X509CertificateKt.id(x509Certificate)), new KeyStore.TrustedCertificateEntry(x509Certificate), null);
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        Intrinsics.checkNotNullExpressionValue(trustManagerFactory, "getInstance(\n        Tru…pply { init(trustStore) }");
        return trustManagerFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final Result<List<X509TrustManager>> loadTrustManagers(@NotNull String id, @NotNull List<? extends X509Certificate> certificates) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            TrustManager[] trustManagers = a(id, certificates).getTrustManagers();
            Intrinsics.checkNotNullExpressionValue(trustManagers, "trustManager.trustManagers");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            if (arrayList.isEmpty()) {
                throw new TrustManagerErrorType.TrustMangerNotAvailable(i10, null, 3, 0 == true ? 1 : 0);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(arrayList));
            Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                objM5535constructorimpl = new Result.Error(new TrustManagerErrorType.TrustVerifierInitError(ThrowableKt.trustInitMessage(thM5538exceptionOrNullimpl), 0, null, 6, null));
            }
            return (Result) objM5535constructorimpl;
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
