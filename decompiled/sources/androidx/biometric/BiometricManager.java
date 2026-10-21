package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.l;
import o.m;

/* JADX INFO: loaded from: classes.dex */
public class BiometricManager {
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int BIOMETRIC_ERROR_UNSUPPORTED = -2;
    public static final int BIOMETRIC_STATUS_UNKNOWN = -1;
    public static final int BIOMETRIC_SUCCESS = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final d f1749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final android.hardware.biometrics.BiometricManager f1750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final FingerprintManagerCompat f1751c;

    public interface Authenticators {
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        public static final int DEVICE_CREDENTIAL = 32768;
    }

    @RequiresApi(29)
    public static class a {
        public static int a(@NonNull android.hardware.biometrics.BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        @Nullable
        public static android.hardware.biometrics.BiometricManager b(@NonNull Context context) {
            return (android.hardware.biometrics.BiometricManager) context.getSystemService(android.hardware.biometrics.BiometricManager.class);
        }

        @Nullable
        public static Method c() {
            try {
                return android.hardware.biometrics.BiometricManager.class.getMethod("canAuthenticate", android.hardware.biometrics.BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    @RequiresApi(30)
    public static class b {
        public static int a(@NonNull android.hardware.biometrics.BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    public static class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Context f1752a;

        public c(@NonNull Context context) {
            this.f1752a = context.getApplicationContext();
        }
    }

    @VisibleForTesting
    public interface d {
    }

    @VisibleForTesting
    public BiometricManager(@NonNull c cVar) {
        this.f1749a = cVar;
        int i10 = Build.VERSION.SDK_INT;
        Context context = cVar.f1752a;
        this.f1750b = i10 >= 29 ? a.b(context) : null;
        this.f1751c = i10 <= 29 ? FingerprintManagerCompat.from(context) : null;
    }

    @NonNull
    public static BiometricManager from(@NonNull Context context) {
        return new BiometricManager(new c(context));
    }

    public final int a() {
        FingerprintManagerCompat fingerprintManagerCompat = this.f1751c;
        if (fingerprintManagerCompat == null) {
            return 1;
        }
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !fingerprintManagerCompat.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }

    @Deprecated
    public int canAuthenticate() {
        return canAuthenticate(255);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    public int canAuthenticate(int i10) {
        KeyguardManager keyguardManagerA;
        android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObjectB;
        int i11 = Build.VERSION.SDK_INT;
        int iA = 1;
        android.hardware.biometrics.BiometricManager biometricManager = this.f1750b;
        if (i11 >= 30) {
            if (biometricManager == null) {
                return 1;
            }
            return b.a(biometricManager, i10);
        }
        if (!androidx.biometric.c.c(i10)) {
            return -2;
        }
        if (i10 != 0) {
            d dVar = this.f1749a;
            c cVar = (c) dVar;
            if (l.a(cVar.f1752a) != null) {
                boolean zB = androidx.biometric.c.b(i10);
                int i12 = 0;
                Context context = cVar.f1752a;
                if (zB) {
                    KeyguardManager keyguardManagerA2 = l.a(context);
                    if (keyguardManagerA2 == null || !l.b(keyguardManagerA2)) {
                        return 11;
                    }
                } else {
                    if (i11 == 29) {
                        if ((i10 & 255) != 255) {
                            Method methodC = a.c();
                            if (methodC != null && (cryptoObjectB = h.b(h.a())) != null) {
                                try {
                                    Object objInvoke = methodC.invoke(biometricManager, cryptoObjectB);
                                    if (objInvoke instanceof Integer) {
                                        return ((Integer) objInvoke).intValue();
                                    }
                                    Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                                } catch (IllegalArgumentException e7) {
                                    e = e7;
                                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                                } catch (InvocationTargetException e10) {
                                    e = e10;
                                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                                }
                            }
                            iA = biometricManager != null ? a.a(biometricManager) : 1;
                            String str = Build.MODEL;
                            if (Build.VERSION.SDK_INT < 30) {
                                int i13 = R.array.assume_strong_biometrics_models;
                                if (str != null) {
                                    for (String str2 : context.getResources().getStringArray(i13)) {
                                        if (!str.equals(str2)) {
                                        }
                                    }
                                    if (iA == 0) {
                                        keyguardManagerA = l.a(((c) dVar).f1752a);
                                        if (keyguardManagerA == null) {
                                            if (a() != 0) {
                                                i12 = -1;
                                            }
                                        }
                                        return a();
                                    }
                                } else if (iA == 0) {
                                    keyguardManagerA = l.a(((c) dVar).f1752a);
                                    if (keyguardManagerA == null) {
                                        if (a() != 0) {
                                            i12 = -1;
                                        }
                                    }
                                    return a();
                                }
                            } else if (iA == 0) {
                                keyguardManagerA = l.a(((c) dVar).f1752a);
                                if (keyguardManagerA == null || !l.b(keyguardManagerA)) {
                                    return a();
                                }
                                if (a() != 0) {
                                    i12 = -1;
                                }
                            }
                        } else if (biometricManager != null) {
                            iA = a.a(biometricManager);
                        }
                        return iA;
                    }
                    if (i11 != 28) {
                        return a();
                    }
                    if (context != null && context.getPackageManager() != null && m.a(context.getPackageManager())) {
                        KeyguardManager keyguardManagerA3 = l.a(((c) dVar).f1752a);
                        if (keyguardManagerA3 == null || !l.b(keyguardManagerA3)) {
                            return a();
                        }
                        if (a() != 0) {
                            i12 = -1;
                        }
                    }
                }
                return i12;
            }
        }
        return 12;
    }
}
