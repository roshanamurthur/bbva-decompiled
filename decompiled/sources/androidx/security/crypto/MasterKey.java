package androidx.security.crypto;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes2.dex */
public final class MasterKey {
    public static final int DEFAULT_AES_GCM_MASTER_KEY_SIZE = 256;
    public static final String DEFAULT_MASTER_KEY_ALIAS = "_androidx_security_master_key_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f23436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final KeyGenParameterSpec f23437b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f23438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public KeyGenParameterSpec f23439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public KeyScheme f23440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Context f23444g;

        @RequiresApi(23)
        public static class a {

            /* JADX INFO: renamed from: androidx.security.crypto.MasterKey$Builder$a$a, reason: collision with other inner class name */
            @RequiresApi(28)
            public static class C0104a {
                @DoNotInline
                public static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            @RequiresApi(30)
            public static class b {
                @DoNotInline
                public static void a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            @DoNotInline
            public static String a(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public Builder(@NonNull Context context) {
            this(context, MasterKey.DEFAULT_MASTER_KEY_ALIAS);
        }

        @NonNull
        public MasterKey build() throws GeneralSecurityException, IOException {
            int i10 = Build.VERSION.SDK_INT;
            KeyScheme keyScheme = this.f23440c;
            if (keyScheme == null && this.f23439b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (keyScheme == KeyScheme.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.f23438a, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256);
                if (this.f23441d) {
                    keySize.setUserAuthenticationRequired(true);
                    if (i10 >= 30) {
                        a.b.a(keySize, this.f23442e, 3);
                    } else {
                        keySize.setUserAuthenticationValidityDurationSeconds(this.f23442e);
                    }
                }
                if (i10 >= 28 && this.f23443f && this.f23444g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    a.C0104a.a(keySize);
                }
                this.f23439b = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.f23439b;
            if (keyGenParameterSpec != null) {
                return new MasterKey(MasterKeys.getOrCreate(keyGenParameterSpec), this.f23439b);
            }
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }

        @NonNull
        @RequiresApi(23)
        public Builder setKeyGenParameterSpec(@NonNull KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f23440c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            String strA = a.a(keyGenParameterSpec);
            String str = this.f23438a;
            if (str.equals(strA)) {
                this.f23439b = keyGenParameterSpec;
                return this;
            }
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + str + " vs " + a.a(keyGenParameterSpec));
        }

        @NonNull
        public Builder setKeyScheme(@NonNull KeyScheme keyScheme) {
            if (a.f23445a[keyScheme.ordinal()] != 1) {
                throw new IllegalArgumentException("Unsupported scheme: " + keyScheme);
            }
            if (this.f23439b != null) {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
            this.f23440c = keyScheme;
            return this;
        }

        @NonNull
        public Builder setRequestStrongBoxBacked(boolean z10) {
            this.f23443f = z10;
            return this;
        }

        @NonNull
        public Builder setUserAuthenticationRequired(boolean z10) {
            return setUserAuthenticationRequired(z10, MasterKey.getDefaultAuthenticationValidityDurationSeconds());
        }

        public Builder(@NonNull Context context, @NonNull String str) {
            this.f23444g = context.getApplicationContext();
            this.f23438a = str;
        }

        @NonNull
        public Builder setUserAuthenticationRequired(boolean z10, @IntRange(from = 1) int i10) {
            this.f23441d = z10;
            this.f23442e = i10;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KeyScheme {
        private static final /* synthetic */ KeyScheme[] $VALUES;
        public static final KeyScheme AES256_GCM;

        static {
            KeyScheme keyScheme = new KeyScheme("AES256_GCM", 0);
            AES256_GCM = keyScheme;
            $VALUES = new KeyScheme[]{keyScheme};
        }

        public KeyScheme() {
            throw null;
        }

        public static KeyScheme valueOf(String str) {
            return (KeyScheme) Enum.valueOf(KeyScheme.class, str);
        }

        public static KeyScheme[] values() {
            return (KeyScheme[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23445a;

        static {
            int[] iArr = new int[KeyScheme.values().length];
            f23445a = iArr;
            try {
                iArr[KeyScheme.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @RequiresApi(23)
    public static class b {
        @DoNotInline
        public static int a(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds();
        }

        @DoNotInline
        public static boolean b(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.isUserAuthenticationRequired();
        }
    }

    @RequiresApi(28)
    public static class c {
        @DoNotInline
        public static boolean a(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.isStrongBoxBacked();
        }
    }

    public MasterKey(@NonNull String str, @Nullable KeyGenParameterSpec keyGenParameterSpec) {
        this.f23436a = str;
        this.f23437b = keyGenParameterSpec;
    }

    @SuppressLint({"MethodNameUnits"})
    public static int getDefaultAuthenticationValidityDurationSeconds() {
        return 300;
    }

    @SuppressLint({"MethodNameUnits"})
    public int getUserAuthenticationValidityDurationSeconds() {
        KeyGenParameterSpec keyGenParameterSpec = this.f23437b;
        if (keyGenParameterSpec == null) {
            return 0;
        }
        return b.a(keyGenParameterSpec);
    }

    public boolean isKeyStoreBacked() {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
            keyStore.load(null);
            return keyStore.containsAlias(this.f23436a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public boolean isStrongBoxBacked() {
        KeyGenParameterSpec keyGenParameterSpec;
        if (Build.VERSION.SDK_INT < 28 || (keyGenParameterSpec = this.f23437b) == null) {
            return false;
        }
        return c.a(keyGenParameterSpec);
    }

    public boolean isUserAuthenticationRequired() {
        KeyGenParameterSpec keyGenParameterSpec = this.f23437b;
        return keyGenParameterSpec != null && b.b(keyGenParameterSpec);
    }

    @NonNull
    public String toString() {
        return "MasterKey{keyAlias=" + this.f23436a + ", isKeyStoreBacked=" + isKeyStoreBacked() + "}";
    }
}
