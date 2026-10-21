package com.google.crypto.tink;

import androidx.appcompat.widget.o1;
import androidx.camera.core.impl.utils.b;
import androidx.camera.core.processing.f;
import bf.g;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.LegacyProtoParameters;
import com.google.crypto.tink.internal.MutablePrimitiveRegistry;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.monitoring.MonitoringAnnotations;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.tinkkey.KeyAccess;
import com.google.crypto.tink.tinkkey.KeyHandle;
import com.google.crypto.tink.tinkkey.internal.InternalKeyHandle;
import com.google.crypto.tink.tinkkey.internal.ProtoKey;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class KeysetHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Keyset f46415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Entry> f46416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MonitoringAnnotations f46417c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f46418a = new ArrayList();

        @CanIgnoreReturnValue
        public Builder addEntry(Entry entry) {
            if (entry.f46424f != null) {
                throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
            }
            boolean z10 = entry.f46419a;
            ArrayList arrayList = this.f46418a;
            if (z10) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Entry) it.next()).f46419a = false;
                }
            }
            entry.f46424f = this;
            arrayList.add(entry);
            return this;
        }

        public KeysetHandle build() throws GeneralSecurityException {
            int iRandKeyId;
            Keyset.Key keyBuild;
            Keyset.Builder builderNewBuilder = Keyset.newBuilder();
            ArrayList<Entry> arrayList = this.f46418a;
            int i10 = 0;
            while (true) {
                int size = arrayList.size() - 1;
                a aVar = a.f46425b;
                if (i10 >= size) {
                    HashSet hashSet = new HashSet();
                    Integer numValueOf = null;
                    for (Entry entry : arrayList) {
                        if (entry.f46420b == null) {
                            throw new GeneralSecurityException("Key Status not set.");
                        }
                        a aVar2 = entry.f46423e;
                        if (aVar2 == null) {
                            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                        }
                        if (aVar2 == aVar) {
                            iRandKeyId = 0;
                            while (true) {
                                if (iRandKeyId != 0 && !hashSet.contains(Integer.valueOf(iRandKeyId))) {
                                    break;
                                }
                                iRandKeyId = Util.randKeyId();
                            }
                        } else {
                            iRandKeyId = aVar2.f46426a;
                        }
                        if (hashSet.contains(Integer.valueOf(iRandKeyId))) {
                            throw new GeneralSecurityException(b.a("Id ", iRandKeyId, " is used twice in the keyset"));
                        }
                        hashSet.add(Integer.valueOf(iRandKeyId));
                        Key key = entry.f46421c;
                        if (key == null) {
                            KeyStatusType keyStatusTypeA = KeysetHandle.a(entry.getStatus());
                            Parameters parameters = entry.f46422d;
                            ProtoParametersSerialization serialization = parameters instanceof LegacyProtoParameters ? ((LegacyProtoParameters) parameters).getSerialization() : (ProtoParametersSerialization) MutableSerializationRegistry.globalInstance().serializeParameters(parameters, ProtoParametersSerialization.class);
                            keyBuild = Keyset.Key.newBuilder().setKeyId(iRandKeyId).setStatus(keyStatusTypeA).setKeyData(Registry.newKeyData(serialization.getKeyTemplate())).setOutputPrefixType(serialization.getKeyTemplate().getOutputPrefixType()).build();
                        } else {
                            ProtoKeySerialization serialization2 = key instanceof LegacyProtoKey ? ((LegacyProtoKey) key).getSerialization(InsecureSecretKeyAccess.get()) : (ProtoKeySerialization) MutableSerializationRegistry.globalInstance().serializeKey(key, ProtoKeySerialization.class, InsecureSecretKeyAccess.get());
                            Integer idRequirementOrNull = serialization2.getIdRequirementOrNull();
                            if (idRequirementOrNull != null && idRequirementOrNull.intValue() != iRandKeyId) {
                                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                            }
                            keyBuild = Keyset.Key.newBuilder().setKeyData(KeyData.newBuilder().setTypeUrl(serialization2.getTypeUrl()).setValue(serialization2.getValue()).setKeyMaterialType(serialization2.getKeyMaterialType())).setStatus(KeysetHandle.a(entry.getStatus())).setKeyId(iRandKeyId).setOutputPrefixType(serialization2.getOutputPrefixType()).build();
                        }
                        builderNewBuilder.addKey(keyBuild);
                        if (entry.f46419a) {
                            if (numValueOf != null) {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                            numValueOf = Integer.valueOf(iRandKeyId);
                        }
                    }
                    if (numValueOf == null) {
                        throw new GeneralSecurityException("No primary was set");
                    }
                    builderNewBuilder.setPrimaryKeyId(numValueOf.intValue());
                    return KeysetHandle.d(builderNewBuilder.build());
                }
                if (((Entry) arrayList.get(i10)).f46423e == aVar && ((Entry) arrayList.get(i10 + 1)).f46423e != aVar) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
                i10++;
            }
        }

        @CanIgnoreReturnValue
        public Builder deleteAt(int i10) {
            this.f46418a.remove(i10);
            return this;
        }

        public Entry getAt(int i10) {
            return (Entry) this.f46418a.get(i10);
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Entry removeAt(int i10) {
            return (Entry) this.f46418a.remove(i10);
        }

        public int size() {
            return this.f46418a.size();
        }

        public static class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f46425b = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f46426a;

            public a() {
                this.f46426a = 0;
            }

            public a(int i10) {
                this.f46426a = i10;
            }
        }

        public static final class Entry {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f46419a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public KeyStatus f46420b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final Key f46421c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public final Parameters f46422d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public a f46423e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public Builder f46424f;

            public Entry(Key key) {
                this.f46420b = KeyStatus.ENABLED;
                this.f46423e = null;
                this.f46424f = null;
                this.f46421c = key;
                this.f46422d = null;
            }

            public KeyStatus getStatus() {
                return this.f46420b;
            }

            public boolean isPrimary() {
                return this.f46419a;
            }

            @CanIgnoreReturnValue
            public Entry makePrimary() {
                Builder builder = this.f46424f;
                if (builder != null) {
                    Iterator it = builder.f46418a.iterator();
                    while (it.hasNext()) {
                        ((Entry) it.next()).f46419a = false;
                    }
                }
                this.f46419a = true;
                return this;
            }

            @CanIgnoreReturnValue
            public Entry setStatus(KeyStatus keyStatus) {
                this.f46420b = keyStatus;
                return this;
            }

            @CanIgnoreReturnValue
            public Entry withFixedId(int i10) {
                this.f46423e = new a(i10);
                return this;
            }

            @CanIgnoreReturnValue
            public Entry withRandomId() {
                this.f46423e = a.f46425b;
                return this;
            }

            public Entry(Parameters parameters) {
                this.f46420b = KeyStatus.ENABLED;
                this.f46423e = null;
                this.f46424f = null;
                this.f46421c = null;
                this.f46422d = parameters;
            }
        }
    }

    @Immutable
    @Alpha
    public static final class Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Key f46427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KeyStatus f46428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f46430d;

        public Entry(Key key, KeyStatus keyStatus, int i10, boolean z10) {
            this.f46427a = key;
            this.f46428b = keyStatus;
            this.f46429c = i10;
            this.f46430d = z10;
        }

        public int getId() {
            return this.f46429c;
        }

        public Key getKey() {
            return this.f46427a;
        }

        public KeyStatus getStatus() {
            return this.f46428b;
        }

        public boolean isPrimary() {
            return this.f46430d;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46431a;

        static {
            int[] iArr = new int[KeyStatusType.values().length];
            f46431a = iArr;
            try {
                iArr[KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46431a[KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46431a[KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public KeysetHandle(Keyset keyset, List<Entry> list) {
        this.f46415a = keyset;
        this.f46416b = list;
        this.f46417c = MonitoringAnnotations.EMPTY;
    }

    public static KeyStatusType a(KeyStatus keyStatus) {
        if (KeyStatus.ENABLED.equals(keyStatus)) {
            return KeyStatusType.ENABLED;
        }
        if (KeyStatus.DISABLED.equals(keyStatus)) {
            return KeyStatusType.DISABLED;
        }
        if (KeyStatus.DESTROYED.equals(keyStatus)) {
            return KeyStatusType.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    public static void b(Keyset keyset) throws GeneralSecurityException {
        for (Keyset.Key key : keyset.getKeyList()) {
            if (key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL || key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.SYMMETRIC || key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", key.getKeyData().getKeyMaterialType().name(), key.getKeyData().getTypeUrl()));
            }
        }
    }

    @Deprecated
    public static final KeysetHandle createFromKey(KeyHandle keyHandle, KeyAccess keyAccess) throws GeneralSecurityException {
        KeysetManager keysetManagerAdd = KeysetManager.withEmptyKeyset().add(keyHandle);
        keysetManagerAdd.setPrimary(keysetManagerAdd.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
        return keysetManagerAdd.getKeysetHandle();
    }

    public static final KeysetHandle d(Keyset keyset) throws GeneralSecurityException {
        if (keyset == null || keyset.getKeyCount() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new KeysetHandle(keyset, e(keyset));
    }

    public static List<Entry> e(Keyset keyset) {
        KeyStatus keyStatus;
        ArrayList arrayList = new ArrayList(keyset.getKeyCount());
        for (Keyset.Key key : keyset.getKeyList()) {
            int keyId = key.getKeyId();
            try {
                try {
                    Key keyWithLegacyFallback = MutableSerializationRegistry.globalInstance().parseKeyWithLegacyFallback(ProtoKeySerialization.create(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), key.getKeyData().getKeyMaterialType(), key.getOutputPrefixType(), key.getOutputPrefixType() == OutputPrefixType.RAW ? null : Integer.valueOf(key.getKeyId())), InsecureSecretKeyAccess.get());
                    int i10 = a.f46431a[key.getStatus().ordinal()];
                    boolean z10 = true;
                    if (i10 == 1) {
                        keyStatus = KeyStatus.ENABLED;
                    } else if (i10 == 2) {
                        keyStatus = KeyStatus.DISABLED;
                    } else {
                        if (i10 != 3) {
                            throw new GeneralSecurityException("Unknown key status");
                        }
                        keyStatus = KeyStatus.DESTROYED;
                    }
                    if (keyId != keyset.getPrimaryKeyId()) {
                        z10 = false;
                    }
                    arrayList.add(new Entry(keyWithLegacyFallback, keyStatus, keyId, z10));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e5) {
                throw new TinkBugException("Creating a protokey serialization failed", e5);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Builder.Entry generateEntryFromParameters(Parameters parameters) {
        return new Builder.Entry(parameters);
    }

    public static Builder.Entry generateEntryFromParametersName(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        Logger logger = Registry.f46453a;
        synchronized (Registry.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(Registry.f46458f);
        }
        if (!mapUnmodifiableMap.containsKey(str)) {
            throw new GeneralSecurityException(f.d("cannot find key template: ", str));
        }
        return new Builder.Entry(MutableSerializationRegistry.globalInstance().parseParametersWithLegacyFallback(ProtoParametersSerialization.create(Registry.b().get(str).f46412a)));
    }

    @Deprecated
    public static final KeysetHandle generateNew(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        return newBuilder().addEntry(generateEntryFromParameters(new LegacyProtoParameters(ProtoParametersSerialization.create(keyTemplate))).makePrimary().withRandomId()).build();
    }

    public static Builder.Entry importKey(Key key) {
        Builder.Entry entry = new Builder.Entry(key);
        Integer idRequirementOrNull = key.getIdRequirementOrNull();
        if (idRequirementOrNull != null) {
            entry.withFixedId(idRequirementOrNull.intValue());
        }
        return entry;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final KeysetHandle read(KeysetReader keysetReader, Aead aead) throws GeneralSecurityException, IOException {
        return readWithAssociatedData(keysetReader, aead, new byte[0]);
    }

    public static final KeysetHandle readNoSecret(KeysetReader keysetReader) throws GeneralSecurityException, IOException {
        try {
            Keyset keyset = keysetReader.read();
            b(keyset);
            return d(keyset);
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static final KeysetHandle readWithAssociatedData(KeysetReader keysetReader, Aead aead, byte[] bArr) throws GeneralSecurityException, IOException {
        EncryptedKeyset encrypted = keysetReader.readEncrypted();
        if (encrypted == null || encrypted.getEncryptedKeyset().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            Keyset from = Keyset.parseFrom(aead.decrypt(encrypted.getEncryptedKeyset().toByteArray(), bArr), ExtensionRegistryLite.getEmptyRegistry());
            if (from == null || from.getKeyCount() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            return d(from);
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final Entry c(int i10) {
        List<Entry> list = this.f46416b;
        if (list.get(i10) != null) {
            return list.get(i10);
        }
        throw new IllegalStateException("Keyset-Entry at position i has wrong status or key parsing failed");
    }

    public Entry getAt(int i10) {
        if (i10 >= 0 && i10 < size()) {
            return c(i10);
        }
        StringBuilder sbC = o1.c("Invalid index ", i10, " for keyset of size ");
        sbC.append(size());
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    @Deprecated
    public List<KeyHandle> getKeys() {
        ArrayList arrayList = new ArrayList();
        for (Keyset.Key key : this.f46415a.getKeyList()) {
            arrayList.add(new InternalKeyHandle(new ProtoKey(key.getKeyData(), KeyTemplate.a(key.getOutputPrefixType())), key.getStatus(), key.getKeyId()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public KeysetInfo getKeysetInfo() {
        return g.a(this.f46415a);
    }

    public Entry getPrimary() {
        int i10 = 0;
        while (true) {
            Keyset keyset = this.f46415a;
            if (i10 >= keyset.getKeyCount()) {
                throw new IllegalStateException("Keyset has no primary");
            }
            if (keyset.getKey(i10).getKeyId() == keyset.getPrimaryKeyId()) {
                Entry entryC = c(i10);
                if (entryC.getStatus() == KeyStatus.ENABLED) {
                    return entryC;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <P> P getPrimitive(Class<P> cls) throws GeneralSecurityException {
        Object primitive;
        Class<?> inputPrimitive = Registry.getInputPrimitive(cls);
        if (inputPrimitive == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i10 = g.f25203a;
        Keyset keyset = this.f46415a;
        int primaryKeyId = keyset.getPrimaryKeyId();
        boolean z10 = true;
        int i11 = 0;
        boolean z11 = false;
        for (Keyset.Key key : keyset.getKeyList()) {
            if (key.getStatus() == KeyStatusType.ENABLED) {
                if (!key.hasKeyData()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(key.getKeyId())));
                }
                if (key.getOutputPrefixType() == OutputPrefixType.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(key.getKeyId())));
                }
                if (key.getStatus() == KeyStatusType.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(key.getKeyId())));
                }
                if (key.getKeyId() == primaryKeyId) {
                    if (z11) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z11 = true;
                }
                if (key.getKeyData().getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z10 = false;
                }
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z11 && !z10) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        PrimitiveSet.Builder builderNewBuilder = PrimitiveSet.newBuilder(inputPrimitive);
        builderNewBuilder.setAnnotations(this.f46417c);
        for (int i12 = 0; i12 < size(); i12++) {
            Keyset.Key key2 = keyset.getKey(i12);
            if (key2.getStatus().equals(KeyStatusType.ENABLED)) {
                Object primitive2 = null;
                try {
                    primitive = Registry.getPrimitive(key2.getKeyData(), inputPrimitive);
                } catch (GeneralSecurityException e5) {
                    if (!e5.getMessage().contains("No key manager found for key type ") && !e5.getMessage().contains(" not supported by key manager of type ")) {
                        throw e5;
                    }
                    primitive = null;
                }
                List<Entry> list = this.f46416b;
                if (list.get(i12) != null) {
                    Key key3 = list.get(i12).getKey();
                    try {
                        Logger logger = Registry.f46453a;
                        primitive2 = MutablePrimitiveRegistry.globalInstance().getPrimitive(key3, inputPrimitive);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                if (key2.getKeyId() == keyset.getPrimaryKeyId()) {
                    builderNewBuilder.addPrimaryFullPrimitiveAndOptionalPrimitive(primitive2, primitive, key2);
                } else {
                    builderNewBuilder.addFullPrimitiveAndOptionalPrimitive(primitive2, primitive, key2);
                }
            }
        }
        return (P) Registry.wrap(builderNewBuilder.build(), cls);
    }

    public KeysetHandle getPublicKeysetHandle() throws GeneralSecurityException {
        Keyset keyset = this.f46415a;
        if (keyset == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        Keyset.Builder builderNewBuilder = Keyset.newBuilder();
        for (Keyset.Key key : keyset.getKeyList()) {
            KeyData keyData = key.getKeyData();
            if (keyData.getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException("The keyset contains a non-private key");
            }
            KeyData publicKeyData = Registry.getPublicKeyData(keyData.getTypeUrl(), keyData.getValue());
            Registry.getPrimitive(publicKeyData);
            builderNewBuilder.addKey(key.toBuilder().setKeyData(publicKeyData).build());
        }
        builderNewBuilder.setPrimaryKeyId(keyset.getPrimaryKeyId());
        return d(builderNewBuilder.build());
    }

    @Deprecated
    public KeyHandle primaryKey() throws GeneralSecurityException {
        Keyset keyset = this.f46415a;
        int primaryKeyId = keyset.getPrimaryKeyId();
        for (Keyset.Key key : keyset.getKeyList()) {
            if (key.getKeyId() == primaryKeyId) {
                return new InternalKeyHandle(new ProtoKey(key.getKeyData(), KeyTemplate.a(key.getOutputPrefixType())), key.getStatus(), key.getKeyId());
            }
        }
        throw new GeneralSecurityException("No primary key found in keyset.");
    }

    public int size() {
        return this.f46415a.getKeyCount();
    }

    public String toString() {
        return getKeysetInfo().toString();
    }

    public void write(KeysetWriter keysetWriter, Aead aead) throws GeneralSecurityException, IOException {
        writeWithAssociatedData(keysetWriter, aead, new byte[0]);
    }

    public void writeNoSecret(KeysetWriter keysetWriter) throws GeneralSecurityException, IOException {
        Keyset keyset = this.f46415a;
        b(keyset);
        keysetWriter.write(keyset);
    }

    public void writeWithAssociatedData(KeysetWriter keysetWriter, Aead aead, byte[] bArr) throws GeneralSecurityException, IOException {
        Keyset keyset = this.f46415a;
        byte[] bArrEncrypt = aead.encrypt(keyset.toByteArray(), bArr);
        try {
            if (!Keyset.parseFrom(aead.decrypt(bArrEncrypt, bArr), ExtensionRegistryLite.getEmptyRegistry()).equals(keyset)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            keysetWriter.write(EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(bArrEncrypt)).setKeysetInfo(g.a(keyset)).build());
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static Builder newBuilder(KeysetHandle keysetHandle) {
        Builder builder = new Builder();
        for (int i10 = 0; i10 < keysetHandle.size(); i10++) {
            Entry entryC = keysetHandle.c(i10);
            Builder.Entry entryWithFixedId = importKey(entryC.getKey()).withFixedId(entryC.getId());
            entryWithFixedId.setStatus(entryC.getStatus());
            if (entryC.isPrimary()) {
                entryWithFixedId.makePrimary();
            }
            builder.addEntry(entryWithFixedId);
        }
        return builder;
    }

    public KeysetHandle(Keyset keyset, List<Entry> list, MonitoringAnnotations monitoringAnnotations) {
        this.f46415a = keyset;
        this.f46416b = list;
        this.f46417c = monitoringAnnotations;
    }

    @Deprecated
    public static final KeysetHandle readNoSecret(byte[] bArr) throws GeneralSecurityException {
        try {
            Keyset from = Keyset.parseFrom(bArr, ExtensionRegistryLite.getEmptyRegistry());
            b(from);
            return d(from);
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static final KeysetHandle generateNew(KeyTemplate keyTemplate) throws GeneralSecurityException {
        return newBuilder().addEntry(generateEntryFromParameters(new LegacyProtoParameters(ProtoParametersSerialization.create(keyTemplate.f46412a))).makePrimary().withRandomId()).build();
    }
}
