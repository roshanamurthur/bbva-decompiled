package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FingerprintManagerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19931a;

    public static final class AuthenticationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoObject f19932a;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.f19932a = cryptoObject;
        }

        public CryptoObject getCryptoObject() {
            return this.f19932a;
        }
    }

    @RequiresApi(23)
    public static class a {
        @RequiresPermission(MagiskApp.USE_FINGERPRINT)
        @DoNotInline
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @DoNotInline
        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @DoNotInline
        public static FingerprintManager c(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i10 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        @RequiresPermission(MagiskApp.USE_FINGERPRINT)
        @DoNotInline
        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @RequiresPermission(MagiskApp.USE_FINGERPRINT)
        @DoNotInline
        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @DoNotInline
        public static CryptoObject f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        @DoNotInline
        public static FingerprintManager.CryptoObject g(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }
    }

    public FingerprintManagerCompat(Context context) {
        this.f19931a = context;
    }

    @NonNull
    public static FingerprintManagerCompat from(@NonNull Context context) {
        return new FingerprintManagerCompat(context);
    }

    @RequiresPermission(MagiskApp.USE_FINGERPRINT)
    public void authenticate(@Nullable CryptoObject cryptoObject, int i10, @Nullable androidx.core.os.CancellationSignal cancellationSignal, @NonNull AuthenticationCallback authenticationCallback, @Nullable Handler handler) {
        FingerprintManager fingerprintManagerC = a.c(this.f19931a);
        if (fingerprintManagerC != null) {
            a.a(fingerprintManagerC, a.g(cryptoObject), cancellationSignal != null ? (CancellationSignal) cancellationSignal.getCancellationSignalObject() : null, i10, new androidx.core.hardware.fingerprint.a(authenticationCallback), handler);
        }
    }

    @RequiresPermission(MagiskApp.USE_FINGERPRINT)
    public boolean hasEnrolledFingerprints() {
        FingerprintManager fingerprintManagerC = a.c(this.f19931a);
        return fingerprintManagerC != null && a.d(fingerprintManagerC);
    }

    @RequiresPermission(MagiskApp.USE_FINGERPRINT)
    public boolean isHardwareDetected() {
        FingerprintManager fingerprintManagerC = a.c(this.f19931a);
        return fingerprintManagerC != null && a.e(fingerprintManagerC);
    }

    public static class CryptoObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Signature f19933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cipher f19934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Mac f19935c;

        public CryptoObject(@NonNull Signature signature) {
            this.f19933a = signature;
            this.f19934b = null;
            this.f19935c = null;
        }

        @Nullable
        public Cipher getCipher() {
            return this.f19934b;
        }

        @Nullable
        public Mac getMac() {
            return this.f19935c;
        }

        @Nullable
        public Signature getSignature() {
            return this.f19933a;
        }

        public CryptoObject(@NonNull Cipher cipher) {
            this.f19934b = cipher;
            this.f19933a = null;
            this.f19935c = null;
        }

        public CryptoObject(@NonNull Mac mac) {
            this.f19935c = mac;
            this.f19934b = null;
            this.f19933a = null;
        }
    }

    public static abstract class AuthenticationCallback {
        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        }

        public void onAuthenticationError(int i10, CharSequence charSequence) {
        }

        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
        }
    }
}
