package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.exception.CheckResultException;
import com.bbva.sl.ar.android.sslpinning.result.CheckResult;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultLevel;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f36147b = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected m f36148a;

    public static String b(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        String str = " (" + th2.getClass().getCanonicalName() + "): [" + th2.getMessage() + Constant.BRACKET_CLOSE;
        String strB = b(th2.getCause());
        return strB != null ? androidx.camera.core.impl.utils.a.b(str, " | ", strB) : str;
    }

    public static Throwable c(Throwable th2, Class<?> cls) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (cls.isAssignableFrom(th2.getClass())) {
            return th2;
        }
        return null;
    }

    public final CheckResult a(Exception exc) {
        String str = "Nested exceptions: " + b(exc);
        Logger logger = f36147b;
        logger.finest(str);
        CheckResult checkResult = null;
        if (exc == null) {
            return null;
        }
        Throwable thC = c(exc, CheckResultException.class);
        if (thC != null) {
            logger.finer("Found CheckResultException, analyzing its contents.");
            checkResult = ((CheckResultException) thC).f36595a;
            if (checkResult.isFailed()) {
                return checkResult;
            }
            logger.finer("No failure found on CheckResultException, evaluating other causes.");
        }
        Throwable thC2 = c(exc, CertificateExpiredException.class);
        if (thC2 != null) {
            if (!this.f36148a.f36162e) {
                return CheckResult.OK();
            }
            return new CheckResult(ResultLevel.FAILED, ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY, "Certificate expired. " + thC2.getMessage(), thC2);
        }
        Throwable thC3 = c(exc, CertificateNotYetValidException.class);
        if (thC3 != null) {
            if (!this.f36148a.f36162e) {
                return CheckResult.OK();
            }
            return new CheckResult(ResultLevel.FAILED, ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY, "Certificate not yet valid. " + thC3.getMessage(), thC3);
        }
        Throwable thC4 = c(exc, SSLPeerUnverifiedException.class);
        if (thC4 != null) {
            if (!this.f36148a.f36161d) {
                return CheckResult.OK();
            }
            return new CheckResult(ResultLevel.FAILED, 512, "The peer identity has not been verified. " + thC4.getMessage(), thC4);
        }
        Throwable thC5 = c(exc, CertPathValidatorException.class);
        if (thC5 != null) {
            if (!this.f36148a.f36161d) {
                return CheckResult.OK();
            }
            return new CheckResult(ResultLevel.FAILED, 512, "Certificate path could not be validated. " + thC5.getMessage(), thC5);
        }
        logger.finer("Looking for other SSL errors.");
        Throwable thC6 = c(exc, SSLKeyException.class);
        if (thC6 != null) {
            return new CheckResult(ResultLevel.FAILED, ResultCode.ERROR_CONN_SSL_KEY, "SSL error: bad SSL key. " + thC6.getMessage(), thC6);
        }
        Throwable thC7 = c(exc, SSLProtocolException.class);
        if (thC7 != null) {
            return new CheckResult(ResultLevel.FAILED, ResultCode.ERROR_CONN_SSL_PROTOCOL, "SSL error: error in protocol. " + thC7.getMessage(), thC7);
        }
        Throwable thC8 = c(exc, SSLPeerUnverifiedException.class);
        if (thC8 != null) {
            return new CheckResult(ResultLevel.FAILED, ResultCode.ERROR_CONN_SSL_UNVERIFIED, "SSL error: peer's identity has not been verified. " + thC8.getMessage(), thC8);
        }
        Throwable thC9 = c(exc, SSLHandshakeException.class);
        if (thC9 != null) {
            return new CheckResult(ResultLevel.FAILED, ResultCode.ERROR_CONN_SSL_HANDSHAKE, "SSL error: error performing SSL handshake. " + thC9.getMessage(), thC9);
        }
        Throwable thC10 = c(exc, SSLException.class);
        if (thC10 == null) {
            return checkResult;
        }
        return new CheckResult(ResultLevel.FAILED, ResultCode.ERROR_CONN_SSL_GENERIC, "Error in SSL subsystem. " + thC10.getMessage(), thC10);
    }

    public abstract CheckResult a(T t10);
}
