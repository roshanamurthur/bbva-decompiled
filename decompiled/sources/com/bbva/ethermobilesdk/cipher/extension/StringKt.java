package com.bbva.ethermobilesdk.cipher.extension;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.cipher.error.X509ErrorType;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.ByteArrayInputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001*\u00020\u0003¨\u0006\t"}, d2 = {"toPrivateKey", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Ljava/security/PrivateKey;", "", "algorithm", "toPublicKey", "Ljava/security/PublicKey;", "toX509Certificate", "Ljava/security/cert/X509Certificate;", "cipher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringKt {
    @NotNull
    public static final Result<PrivateKey> toPrivateKey(@NotNull String str, @NotNull String algorithm) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(KeyFactory.getInstance(algorithm).generatePrivate(new PKCS8EncodedKeySpec(EncodingUtilsKt.base64ToByteArray(str)))));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }

    public static /* synthetic */ Result toPrivateKey$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "RSA";
        }
        return toPrivateKey(str, str2);
    }

    @NotNull
    public static final Result<PublicKey> toPublicKey(@NotNull String str, @NotNull String algorithm) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(KeyFactory.getInstance(algorithm).generatePublic(new X509EncodedKeySpec(EncodingUtilsKt.base64ToByteArray(str)))));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }

    public static /* synthetic */ Result toPublicKey$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "RSA";
        }
        return toPublicKey(str, str2);
    }

    @NotNull
    public static final Result<X509Certificate> toX509Certificate(@NotNull String str) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (StringsKt__StringsKt.trim((CharSequence) str).toString().length() == 0) {
                throw new X509ErrorType.X509Empty(0, null, 3, null);
            }
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(EncodingUtilsKt.base64ToByteArray(StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringAfter$default(new Regex("[\\s\n\r\t]").replace(str, ""), "CERTIFICATE-----", (String) null, 2, (Object) null), "-----END", (String) null, 2, (Object) null))));
            X509Certificate x509Certificate = certificateGenerateCertificate instanceof X509Certificate ? (X509Certificate) certificateGenerateCertificate : null;
            if (x509Certificate == null) {
                throw new CertificateException();
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(x509Certificate));
            if (kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
                objM5535constructorimpl = new Result.Error(new X509ErrorType.InvalidX509Certificate(0, null, 3, null));
            }
            return (Result) objM5535constructorimpl;
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
