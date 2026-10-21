package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.u;
import androidx.collection.ArraySet;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTemplates;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.daead.DeterministicAeadConfig;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.subtle.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedPreferences f23425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f23426b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f23427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f23428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Aead f23429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final DeterministicAead f23430f;

    public enum PrefKeyEncryptionScheme {
        AES256_SIV;

        private final String mDeterministicAeadKeyTemplateName = "AES256_SIV";

        public final KeyTemplate a() throws GeneralSecurityException {
            return KeyTemplates.get(this.mDeterministicAeadKeyTemplateName);
        }
    }

    public enum PrefValueEncryptionScheme {
        AES256_GCM;

        private final String mAeadKeyTemplateName = "AES256_GCM";

        public final KeyTemplate a() throws GeneralSecurityException {
            return KeyTemplates.get(this.mAeadKeyTemplateName);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23431a;

        static {
            int[] iArr = new int[c.values().length];
            f23431a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23431a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23431a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23431a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23431a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23431a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EncryptedSharedPreferences f23432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SharedPreferences.Editor f23433b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f23435d = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f23434c = new CopyOnWriteArrayList();

        public b(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.f23432a = encryptedSharedPreferences;
            this.f23433b = editor;
        }

        public final void a() {
            if (this.f23435d.getAndSet(false)) {
                EncryptedSharedPreferences encryptedSharedPreferences = this.f23432a;
                for (String str : encryptedSharedPreferences.getAll().keySet()) {
                    if (!this.f23434c.contains(str) && !EncryptedSharedPreferences.c(str)) {
                        this.f23433b.remove(encryptedSharedPreferences.a(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            a();
            this.f23433b.apply();
            b();
            this.f23434c.clear();
        }

        public final void b() {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f23432a;
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : encryptedSharedPreferences.f23426b) {
                Iterator it = this.f23434c.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(encryptedSharedPreferences, (String) it.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f23432a;
            encryptedSharedPreferences.getClass();
            if (EncryptedSharedPreferences.c(str)) {
                throw new SecurityException(u.f(str, " is a reserved key for the encryption keyset."));
            }
            this.f23434c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String strA = encryptedSharedPreferences.a(str);
                Pair pair = new Pair(strA, Base64.encode(encryptedSharedPreferences.f23429e.encrypt(bArr, strA.getBytes(StandardCharsets.UTF_8))));
                this.f23433b.putString((String) pair.first, (String) pair.second);
            } catch (GeneralSecurityException e5) {
                throw new SecurityException(androidx.emoji2.text.flatbuffer.a.d(e5, new StringBuilder("Could not encrypt data: ")), e5);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor clear() {
            this.f23435d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f23434c;
            a();
            try {
                return this.f23433b.commit();
            } finally {
                b();
                copyOnWriteArrayList.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putBoolean(@Nullable String str, boolean z10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(c.BOOLEAN.a());
            byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putFloat(@Nullable String str, float f6) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.FLOAT.a());
            byteBufferAllocate.putFloat(f6);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putInt(@Nullable String str, int i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.INT.a());
            byteBufferAllocate.putInt(i10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putLong(@Nullable String str, long j10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(c.LONG.a());
            byteBufferAllocate.putLong(j10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putString(@Nullable String str, @Nullable String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(c.STRING.a());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putStringSet(@Nullable String str, @Nullable Set<String> set) {
            if (set == null) {
                set = new ArraySet<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(c.STRING_SET.a());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor remove(@Nullable String str) {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f23432a;
            encryptedSharedPreferences.getClass();
            if (EncryptedSharedPreferences.c(str)) {
                throw new SecurityException(u.f(str, " is a reserved key for the encryption keyset."));
            }
            this.f23433b.remove(encryptedSharedPreferences.a(str));
            this.f23434c.add(str);
            return this;
        }
    }

    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        c(int i10) {
            this.mId = i10;
        }

        public final int a() {
            return this.mId;
        }
    }

    public EncryptedSharedPreferences(@NonNull String str, @NonNull String str2, @NonNull SharedPreferences sharedPreferences, @NonNull Aead aead, @NonNull DeterministicAead deterministicAead) {
        this.f23427c = str;
        this.f23425a = sharedPreferences;
        this.f23428d = str2;
        this.f23429e = aead;
        this.f23430f = deterministicAead;
    }

    public static boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @NonNull
    @Deprecated
    public static SharedPreferences create(@NonNull String str, @NonNull String str2, @NonNull Context context, @NonNull PrefKeyEncryptionScheme prefKeyEncryptionScheme, @NonNull PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        DeterministicAeadConfig.register();
        AeadConfig.register();
        Context applicationContext = context.getApplicationContext();
        KeysetHandle keysetHandle = new AndroidKeysetManager.Builder().withKeyTemplate(prefKeyEncryptionScheme.a()).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        KeysetHandle keysetHandle2 = new AndroidKeysetManager.Builder().withKeyTemplate(prefValueEncryptionScheme.a()).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        return new EncryptedSharedPreferences(str, str2, applicationContext.getSharedPreferences(str, 0), (Aead) keysetHandle2.getPrimitive(Aead.class), (DeterministicAead) keysetHandle.getPrimitive(DeterministicAead.class));
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return Base64.encode(this.f23430f.encryptDeterministically(str.getBytes(StandardCharsets.UTF_8), this.f23427c.getBytes()));
        } catch (GeneralSecurityException e5) {
            throw new SecurityException(androidx.emoji2.text.flatbuffer.a.d(e5, new StringBuilder("Could not encrypt key. ")), e5);
        }
    }

    public final Object b(String str) throws SecurityException {
        c cVar;
        if (c(str)) {
            throw new SecurityException(u.f(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = a(str);
            String string = this.f23425a.getString(strA, null);
            if (string == null) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(string, 0);
            Aead aead = this.f23429e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(aead.decrypt(bArrDecode, strA.getBytes(charset)));
            byteBufferWrap.position(0);
            int i10 = byteBufferWrap.getInt();
            if (i10 == 0) {
                cVar = c.STRING;
            } else if (i10 == 1) {
                cVar = c.STRING_SET;
            } else if (i10 == 2) {
                cVar = c.INT;
            } else if (i10 == 3) {
                cVar = c.LONG;
            } else if (i10 != 4) {
                cVar = i10 != 5 ? null : c.BOOLEAN;
            } else {
                cVar = c.FLOAT;
            }
            if (cVar == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
            }
            switch (a.f23431a[cVar.ordinal()]) {
                case 1:
                    int i11 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i11);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (string2.equals("__NULL__")) {
                        return null;
                    }
                    return string2;
                case 2:
                    return Integer.valueOf(byteBufferWrap.getInt());
                case 3:
                    return Long.valueOf(byteBufferWrap.getLong());
                case 4:
                    return Float.valueOf(byteBufferWrap.getFloat());
                case 5:
                    return Boolean.valueOf(byteBufferWrap.get() != 0);
                case 6:
                    ArraySet arraySet = new ArraySet();
                    while (byteBufferWrap.hasRemaining()) {
                        int i12 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i12);
                        byteBufferWrap.position(byteBufferWrap.position() + i12);
                        arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (arraySet.size() == 1 && "__NULL__".equals(arraySet.valueAt(0))) {
                        return null;
                    }
                    return arraySet;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + cVar);
            }
        } catch (GeneralSecurityException e5) {
            throw new SecurityException(androidx.emoji2.text.flatbuffer.a.d(e5, new StringBuilder("Could not decrypt value. ")), e5);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(@Nullable String str) {
        if (c(str)) {
            throw new SecurityException(u.f(str, " is a reserved key for the encryption keyset."));
        }
        return this.f23425a.contains(a(str));
    }

    @Override // android.content.SharedPreferences
    @NonNull
    public SharedPreferences.Editor edit() {
        return new b(this, this.f23425a.edit());
    }

    @Override // android.content.SharedPreferences
    @NonNull
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f23425a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f23430f.decryptDeterministically(Base64.decode(entry.getKey(), 0), this.f23427c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, b(str));
                } catch (GeneralSecurityException e5) {
                    throw new SecurityException(androidx.emoji2.text.flatbuffer.a.d(e5, new StringBuilder("Could not decrypt key. ")), e5);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(@Nullable String str, boolean z10) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(@Nullable String str, float f6) {
        Object objB = b(str);
        return objB instanceof Float ? ((Float) objB).floatValue() : f6;
    }

    @Override // android.content.SharedPreferences
    public int getInt(@Nullable String str, int i10) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(@Nullable String str, long j10) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(@Nullable String str, @Nullable String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public Set<String> getStringSet(@Nullable String str, @Nullable Set<String> set) {
        Object objB = b(str);
        Set<String> arraySet = objB instanceof Set ? (Set) objB : new ArraySet<>();
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f23426b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f23426b.remove(onSharedPreferenceChangeListener);
    }

    @NonNull
    public static SharedPreferences create(@NonNull Context context, @NonNull String str, @NonNull MasterKey masterKey, @NonNull PrefKeyEncryptionScheme prefKeyEncryptionScheme, @NonNull PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        return create(str, masterKey.f23436a, context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }
}
