package com.bbva.ethermobilesdk.cipher.extension;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Throwable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\u0007"}, d2 = {"trustInitMessage", "", "", "trustMessage", "checkTrust", "", "checkDates", "cipher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ThrowableKt {
    @NotNull
    public static final String trustInitMessage(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if (th2 instanceof NoSuchAlgorithmException) {
            return "Error building KeyStore for verifier.";
        }
        if ((th2 instanceof IOException) || (th2 instanceof CertificateException)) {
            return "Error initializing KeyStore for verifier.";
        }
        return th2 instanceof KeyStoreException ? "Error accessing to KeyStore for verifier." : u.g(Constant.BRACKET_OPEN, th2.getClass().getCanonicalName(), "]: Trust verifier is not available. [", th2.getMessage(), Constant.BRACKET_CLOSE);
    }

    @NotNull
    public static final String trustMessage(@NotNull Throwable th2, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        String strD = null;
        if (th2 instanceof CertificateExpiredException) {
            if (z11) {
                strD = "Certificate expired:";
            }
        } else if (th2 instanceof CertificateNotYetValidException) {
            if (z11) {
                strD = "Certificate not yet valid.";
            }
        } else if (th2 instanceof SSLPeerUnverifiedException) {
            strD = z10 ? "The peer identity has not been verified." : "SSL error: peer's identity has not been verified.";
        } else if (th2 instanceof CertPathValidatorException) {
            if (z10) {
                strD = "Certificate path could not be validated.";
            }
        } else if (th2 instanceof SSLKeyException) {
            strD = "SSL error: bad SSL key.";
        } else if (th2 instanceof SSLProtocolException) {
            strD = "SSL error: error in protocol.";
        } else if (th2 instanceof SSLHandshakeException) {
            strD = "SSL error: error performing SSL handshake.";
        } else if (th2 instanceof SSLException) {
            strD = "Error in SSL subsystem.";
        }
        if (strD == null) {
            strD = f.d("Exception ", th2.getClass().getCanonicalName());
        }
        return strD + " [" + th2.getMessage() + Constant.BRACKET_CLOSE;
    }

    public static /* synthetic */ String trustMessage$default(Throwable th2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return trustMessage(th2, z10, z11);
    }
}
