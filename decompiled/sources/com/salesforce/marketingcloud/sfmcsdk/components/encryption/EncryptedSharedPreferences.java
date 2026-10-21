package com.salesforce.marketingcloud.sfmcsdk.components.encryption;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.u;
import androidx.collection.ArraySet;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    private static final int BYTE_BYTES = 1;
    private static final int FLOAT_BYTES = 4;
    private static final int INTEGER_BYTES = 4;
    private static final String KEY_IV = "__iv__";
    private static final int LONG_BYTES = 8;
    private static final String NULL_VALUE = "__NULL__";
    final String mEncryptionKey;
    final String mFileName;
    final SharedPreferences mSharedPreferences;
    final List<SharedPreferences.OnSharedPreferenceChangeListener> mListeners = new ArrayList();
    final byte[] iv = generateKeyIv();

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$salesforce$marketingcloud$sfmcsdk$components$encryption$EncryptedSharedPreferences$EncryptedType;

        static {
            int[] iArr = new int[EncryptedType.values().length];
            $SwitchMap$com$salesforce$marketingcloud$sfmcsdk$components$encryption$EncryptedSharedPreferences$EncryptedType = iArr;
            try {
                iArr[EncryptedType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$salesforce$marketingcloud$sfmcsdk$components$encryption$EncryptedSharedPreferences$EncryptedType[EncryptedType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$salesforce$marketingcloud$sfmcsdk$components$encryption$EncryptedSharedPreferences$EncryptedType[EncryptedType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$salesforce$marketingcloud$sfmcsdk$components$encryption$EncryptedSharedPreferences$EncryptedType[EncryptedType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$salesforce$marketingcloud$sfmcsdk$components$encryption$EncryptedSharedPreferences$EncryptedType[EncryptedType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$salesforce$marketingcloud$sfmcsdk$components$encryption$EncryptedSharedPreferences$EncryptedType[EncryptedType.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class Editor implements SharedPreferences.Editor {
        private final SharedPreferences.Editor mEditor;
        private final EncryptedSharedPreferences mEncryptedSharedPreferences;
        private final AtomicBoolean mClearRequested = new AtomicBoolean(false);
        private final List<String> mKeysChanged = new CopyOnWriteArrayList();

        public Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.mEncryptedSharedPreferences = encryptedSharedPreferences;
            this.mEditor = editor;
        }

        private void clearKeysIfNeeded() {
            if (this.mClearRequested.getAndSet(false)) {
                for (String str : this.mEncryptedSharedPreferences.getAll().keySet()) {
                    if (!this.mKeysChanged.contains(str) && !this.mEncryptedSharedPreferences.isReservedKey(str)) {
                        this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
                    }
                }
            }
        }

        private void notifyListeners() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.mEncryptedSharedPreferences.mListeners) {
                Iterator<String> it = this.mKeysChanged.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.mEncryptedSharedPreferences, it.next());
                }
            }
        }

        private void putEncryptedObject(String str, byte[] bArr) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                throw new SecurityException(u.f(str, " is a reserved key for the encryption keyset."));
            }
            this.mKeysChanged.add(str);
            if (str == null) {
                str = EncryptedSharedPreferences.NULL_VALUE;
            }
            Pair pairEncryptKeyValuePair = this.mEncryptedSharedPreferences.encryptKeyValuePair(str, bArr);
            this.mEditor.putString((String) pairEncryptKeyValuePair.first, (String) pairEncryptKeyValuePair.second);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            clearKeysIfNeeded();
            this.mEditor.apply();
            notifyListeners();
            this.mKeysChanged.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor clear() {
            this.mClearRequested.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            clearKeysIfNeeded();
            try {
                return this.mEditor.commit();
            } finally {
                notifyListeners();
                this.mKeysChanged.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putBoolean(@Nullable String str, boolean z10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(EncryptedType.BOOLEAN.getId());
            byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putFloat(@Nullable String str, float f6) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(EncryptedType.FLOAT.getId());
            byteBufferAllocate.putFloat(f6);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putInt(@Nullable String str, int i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(EncryptedType.INT.getId());
            byteBufferAllocate.putInt(i10);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putLong(@Nullable String str, long j10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(EncryptedType.LONG.getId());
            byteBufferAllocate.putLong(j10);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putString(@Nullable String str, @Nullable String str2) {
            if (str2 == null) {
                str2 = EncryptedSharedPreferences.NULL_VALUE;
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(EncryptedType.STRING.getId());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putStringSet(@Nullable String str, @Nullable Set<String> set) {
            if (set == null) {
                set = new ArraySet<>();
                set.add(EncryptedSharedPreferences.NULL_VALUE);
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
            byteBufferAllocate.putInt(EncryptedType.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            putEncryptedObject(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor remove(@Nullable String str) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                throw new SecurityException(u.f(str, " is a reserved key for the encryption keyset."));
            }
            this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
            this.mKeysChanged.remove(str);
            return this;
        }
    }

    public enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        EncryptedType(int i10) {
            this.mId = i10;
        }

        public static EncryptedType fromId(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return STRING_SET;
            }
            if (i10 == 2) {
                return INT;
            }
            if (i10 == 3) {
                return LONG;
            }
            if (i10 == 4) {
                return FLOAT;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int getId() {
            return this.mId;
        }
    }

    private EncryptedSharedPreferences(@NonNull String str, @NonNull SharedPreferences sharedPreferences, @NonNull String str2) throws NoSuchAlgorithmException {
        this.mFileName = str;
        this.mSharedPreferences = sharedPreferences;
        this.mEncryptionKey = str2;
    }

    @NonNull
    public static SharedPreferences create(@NonNull Context context, @NonNull String str, @NonNull String str2) throws NoSuchAlgorithmException {
        return new EncryptedSharedPreferences(str, context.getApplicationContext().getSharedPreferences(str, 0), str2);
    }

    private String decryptKey(String str) {
        String strDecrypt = Encryptor.decrypt(str, this.mEncryptionKey);
        if (strDecrypt.equals(NULL_VALUE)) {
            return null;
        }
        return strDecrypt;
    }

    private byte[] decryptValue(String str) {
        return Base64.decode(Encryptor.decrypt(str, this.mEncryptionKey), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String encryptKey(String str) {
        if (str == null) {
            str = NULL_VALUE;
        }
        return Encryptor.encrypt(str, this.mEncryptionKey, this.iv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Pair<String, String> encryptKeyValuePair(String str, byte[] bArr) {
        return new Pair<>(encryptKey(str), encryptValue(bArr));
    }

    private String encryptValue(byte[] bArr) {
        return Encryptor.encrypt(Base64.encodeToString(bArr, 2), this.mEncryptionKey);
    }

    private byte[] generateKeyIv() throws NoSuchAlgorithmException {
        String string = this.mSharedPreferences.getString(KEY_IV, null);
        if (string != null) {
            return Base64.decode(string, 2);
        }
        byte[] bArrGenerateInitVector = Encryptor.generateInitVector();
        this.mSharedPreferences.edit().putString(KEY_IV, Base64.encodeToString(bArrGenerateInitVector, 2)).apply();
        return bArrGenerateInitVector;
    }

    private Object getDecryptedObject(String str) {
        if (isReservedKey(str)) {
            throw new SecurityException(u.f(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = NULL_VALUE;
        }
        String string = this.mSharedPreferences.getString(encryptKey(str), null);
        if (string == null) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(decryptValue(string));
        byteBufferWrap.position(0);
        switch (AnonymousClass1.$SwitchMap$com$salesforce$marketingcloud$sfmcsdk$components$encryption$EncryptedSharedPreferences$EncryptedType[EncryptedType.fromId(byteBufferWrap.getInt()).ordinal()]) {
            case 1:
                int i10 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i10);
                String string2 = StandardCharsets.UTF_8.decode(byteBufferSlice).toString();
                if (string2.equals(NULL_VALUE)) {
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
                    int i11 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                    byteBufferSlice2.limit(i11);
                    byteBufferWrap.position(byteBufferWrap.position() + i11);
                    arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                }
                if (arraySet.size() == 1 && NULL_VALUE.equals(arraySet.valueAt(0))) {
                    return null;
                }
                return arraySet;
            default:
                return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(@Nullable String str) {
        if (isReservedKey(str)) {
            throw new SecurityException(u.f(str, " is a reserved key for the encryption keyset."));
        }
        return this.mSharedPreferences.contains(encryptKey(str));
    }

    @Override // android.content.SharedPreferences
    @NonNull
    public SharedPreferences.Editor edit() {
        return new Editor(this, this.mSharedPreferences.edit());
    }

    @Override // android.content.SharedPreferences
    @NonNull
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.mSharedPreferences.getAll().entrySet()) {
            if (!isReservedKey(entry.getKey())) {
                String strDecryptKey = decryptKey(entry.getKey());
                map.put(strDecryptKey, getDecryptedObject(strDecryptKey));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(@Nullable String str, boolean z10) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Boolean)) ? z10 : ((Boolean) decryptedObject).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(@Nullable String str, float f6) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Float)) ? f6 : ((Float) decryptedObject).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(@Nullable String str, int i10) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Integer)) ? i10 : ((Integer) decryptedObject).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(@Nullable String str, long j10) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Long)) ? j10 : ((Long) decryptedObject).longValue();
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(@Nullable String str, @Nullable String str2) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof String)) ? str2 : (String) decryptedObject;
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public Set<String> getStringSet(@Nullable String str, @Nullable Set<String> set) {
        Object decryptedObject = getDecryptedObject(str);
        Set<String> arraySet = decryptedObject instanceof Set ? (Set) decryptedObject : new ArraySet<>();
        return arraySet.size() > 0 ? arraySet : set;
    }

    public boolean isReservedKey(String str) {
        return KEY_IV.equals(str);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.remove(onSharedPreferenceChangeListener);
    }
}
