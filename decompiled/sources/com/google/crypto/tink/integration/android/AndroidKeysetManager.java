package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.BinaryKeysetReader;
import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetManager;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Hex;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes10.dex */
public final class AndroidKeysetManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f46599d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPrefKeysetWriter f46600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Aead f46601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public KeysetManager f46602c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46611a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46611a = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46611a[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46611a[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46611a[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AndroidKeysetManager(Builder builder) {
        this.f46600a = new SharedPrefKeysetWriter(builder.f46603a, builder.f46604b, builder.f46605c);
        this.f46601b = builder.f46607e;
        this.f46602c = builder.f46610h;
    }

    public final void a(KeysetManager keysetManager) throws GeneralSecurityException {
        Aead aead = this.f46601b;
        boolean z10 = aead != null;
        SharedPrefKeysetWriter sharedPrefKeysetWriter = this.f46600a;
        try {
            if (z10) {
                keysetManager.getKeysetHandle().write(sharedPrefKeysetWriter, aead);
            } else {
                CleartextKeysetHandle.write(keysetManager.getKeysetHandle(), sharedPrefKeysetWriter);
            }
        } catch (IOException e5) {
            throw new GeneralSecurityException(e5);
        }
    }

    @CanIgnoreReturnValue
    @GuardedBy("this")
    @Deprecated
    public synchronized AndroidKeysetManager add(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager keysetManagerAdd = this.f46602c.add(keyTemplate);
        this.f46602c = keysetManagerAdd;
        a(keysetManagerAdd);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager delete(int i10) throws GeneralSecurityException {
        KeysetManager keysetManagerDelete = this.f46602c.delete(i10);
        this.f46602c = keysetManagerDelete;
        a(keysetManagerDelete);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager destroy(int i10) throws GeneralSecurityException {
        KeysetManager keysetManagerDestroy = this.f46602c.destroy(i10);
        this.f46602c = keysetManagerDestroy;
        a(keysetManagerDestroy);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager disable(int i10) throws GeneralSecurityException {
        KeysetManager keysetManagerDisable = this.f46602c.disable(i10);
        this.f46602c = keysetManagerDisable;
        a(keysetManagerDisable);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager enable(int i10) throws GeneralSecurityException {
        KeysetManager keysetManagerEnable = this.f46602c.enable(i10);
        this.f46602c = keysetManagerEnable;
        a(keysetManagerEnable);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() throws GeneralSecurityException {
        return this.f46602c.getKeysetHandle();
    }

    public synchronized boolean isUsingKeystore() {
        return this.f46601b != null;
    }

    @CanIgnoreReturnValue
    @InlineMe(replacement = "this.setPrimary(keyId)")
    @Deprecated
    public synchronized AndroidKeysetManager promote(int i10) throws GeneralSecurityException {
        return setPrimary(i10);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public synchronized AndroidKeysetManager rotate(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager keysetManagerRotate = this.f46602c.rotate(keyTemplate);
        this.f46602c = keysetManagerRotate;
        a(keysetManagerRotate);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager setPrimary(int i10) throws GeneralSecurityException {
        KeysetManager primary = this.f46602c.setPrimary(i10);
        this.f46602c = primary;
        a(primary);
        return this;
    }

    @CanIgnoreReturnValue
    @GuardedBy("this")
    public synchronized AndroidKeysetManager add(com.google.crypto.tink.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager keysetManagerAdd = this.f46602c.add(keyTemplate);
        this.f46602c = keysetManagerAdd;
        a(keysetManagerAdd);
        return this;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f46603a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f46604b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f46605c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f46606d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Aead f46607e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f46608f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public com.google.crypto.tink.KeyTemplate f46609g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @GuardedBy("this")
        public KeysetManager f46610h;

        @Nullable
        public static byte[] b(Context context, String str, String str2) throws IOException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return Hex.decode(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public final KeysetManager a() throws GeneralSecurityException, IOException {
            if (this.f46609g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            KeysetManager keysetManagerAdd = KeysetManager.withEmptyKeyset().add(this.f46609g);
            KeysetManager primary = keysetManagerAdd.setPrimary(keysetManagerAdd.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
            SharedPrefKeysetWriter sharedPrefKeysetWriter = new SharedPrefKeysetWriter(this.f46603a, this.f46604b, this.f46605c);
            if (this.f46607e != null) {
                primary.getKeysetHandle().write(sharedPrefKeysetWriter, this.f46607e);
            } else {
                CleartextKeysetHandle.write(primary.getKeysetHandle(), sharedPrefKeysetWriter);
            }
            return primary;
        }

        public synchronized AndroidKeysetManager build() throws GeneralSecurityException, IOException {
            AndroidKeysetManager androidKeysetManager;
            try {
                if (this.f46604b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (AndroidKeysetManager.f46599d) {
                    try {
                        byte[] bArrB = b(this.f46603a, this.f46604b, this.f46605c);
                        if (bArrB == null) {
                            if (this.f46606d != null) {
                                this.f46607e = d();
                            }
                            this.f46610h = a();
                        } else if (this.f46606d != null) {
                            this.f46610h = c(bArrB);
                        } else {
                            this.f46610h = KeysetManager.withKeysetHandle(CleartextKeysetHandle.read(BinaryKeysetReader.withBytes(bArrB)));
                        }
                        androidKeysetManager = new AndroidKeysetManager(this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
            return androidKeysetManager;
        }

        public final KeysetManager c(byte[] bArr) throws GeneralSecurityException, IOException {
            try {
                this.f46607e = new AndroidKeystoreKmsClient().getAead(this.f46606d);
                try {
                    return KeysetManager.withKeysetHandle(KeysetHandle.read(BinaryKeysetReader.withBytes(bArr), this.f46607e));
                } catch (IOException | GeneralSecurityException e5) {
                    try {
                        return KeysetManager.withKeysetHandle(CleartextKeysetHandle.read(BinaryKeysetReader.withBytes(bArr)));
                    } catch (IOException unused) {
                        throw e5;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e7) {
                try {
                    KeysetManager keysetManagerWithKeysetHandle = KeysetManager.withKeysetHandle(CleartextKeysetHandle.read(BinaryKeysetReader.withBytes(bArr)));
                    Object obj = AndroidKeysetManager.f46599d;
                    Log.w("AndroidKeysetManager", "cannot use Android Keystore, it'll be disabled", e7);
                    return keysetManagerWithKeysetHandle;
                } catch (IOException unused2) {
                    throw e7;
                }
            }
        }

        @Nullable
        public final Aead d() throws GeneralSecurityException {
            Object obj = AndroidKeysetManager.f46599d;
            AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
            try {
                boolean zA = AndroidKeystoreKmsClient.a(this.f46606d);
                try {
                    return androidKeystoreKmsClient.getAead(this.f46606d);
                } catch (GeneralSecurityException | ProviderException e5) {
                    if (!zA) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f46606d), e5);
                    }
                    Object obj2 = AndroidKeysetManager.f46599d;
                    Log.w("AndroidKeysetManager", "cannot use Android Keystore, it'll be disabled", e5);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e7) {
                Object obj3 = AndroidKeysetManager.f46599d;
                Log.w("AndroidKeysetManager", "cannot use Android Keystore, it'll be disabled", e7);
                return null;
            }
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder doNotUseKeystore() {
            this.f46606d = null;
            this.f46608f = false;
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder withKeyTemplate(KeyTemplate keyTemplate) {
            com.google.crypto.tink.KeyTemplate.OutputPrefixType outputPrefixType;
            String typeUrl = keyTemplate.getTypeUrl();
            byte[] byteArray = keyTemplate.getValue().toByteArray();
            OutputPrefixType outputPrefixType2 = keyTemplate.getOutputPrefixType();
            Object obj = AndroidKeysetManager.f46599d;
            int i10 = a.f46611a[outputPrefixType2.ordinal()];
            if (i10 == 1) {
                outputPrefixType = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK;
            } else if (i10 == 2) {
                outputPrefixType = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY;
            } else if (i10 == 3) {
                outputPrefixType = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW;
            } else {
                if (i10 != 4) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                outputPrefixType = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY;
            }
            this.f46609g = com.google.crypto.tink.KeyTemplate.create(typeUrl, byteArray, outputPrefixType);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withMasterKeyUri(String str) {
            if (!str.startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f46608f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f46606d = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withSharedPref(Context context, String str, String str2) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f46603a = context;
            this.f46604b = str;
            this.f46605c = str2;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withKeyTemplate(com.google.crypto.tink.KeyTemplate keyTemplate) {
            this.f46609g = keyTemplate;
            return this;
        }
    }
}
