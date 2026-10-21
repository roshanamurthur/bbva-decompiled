package com.google.crypto.tink.mac;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutablePrimitiveRegistry;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveConstructor;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.PrfHmacJce;
import com.google.crypto.tink.subtle.PrfMac;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class HmacKeyManager extends KeyTypeManager<com.google.crypto.tink.proto.HmacKey> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PrimitiveConstructor<HmacKey, ChunkedMac> f46787d = PrimitiveConstructor.create(new androidx.emoji2.text.flatbuffer.a(), HmacKey.class, ChunkedMac.class);

    public class a extends PrimitiveFactory<Mac, com.google.crypto.tink.proto.HmacKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Mac getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            com.google.crypto.tink.proto.HmacKey hmacKey = (com.google.crypto.tink.proto.HmacKey) messageLite;
            HashType hash = hmacKey.getParams().getHash();
            SecretKeySpec secretKeySpec = new SecretKeySpec(hmacKey.getKeyValue().toByteArray(), "HMAC");
            int tagSize = hmacKey.getParams().getTagSize();
            int i10 = c.f46789a[hash.ordinal()];
            if (i10 == 1) {
                return new PrfMac(new PrfHmacJce("HMACSHA1", secretKeySpec), tagSize);
            }
            if (i10 == 2) {
                return new PrfMac(new PrfHmacJce("HMACSHA224", secretKeySpec), tagSize);
            }
            if (i10 == 3) {
                return new PrfMac(new PrfHmacJce("HMACSHA256", secretKeySpec), tagSize);
            }
            if (i10 == 4) {
                return new PrfMac(new PrfHmacJce("HMACSHA384", secretKeySpec), tagSize);
            }
            if (i10 == 5) {
                return new PrfMac(new PrfHmacJce("HMACSHA512", secretKeySpec), tagSize);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    public class b extends KeyTypeManager.KeyFactory<HmacKeyFormat, com.google.crypto.tink.proto.HmacKey> {
        public b() {
            super(HmacKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            HmacKeyFormat hmacKeyFormat = (HmacKeyFormat) messageLite;
            return com.google.crypto.tink.proto.HmacKey.newBuilder().setVersion(HmacKeyManager.this.getVersion()).setParams(hmacKeyFormat.getParams()).setKeyValue(ByteString.copyFrom(Random.randBytes(hmacKeyFormat.getKeySize()))).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            HmacKeyFormat hmacKeyFormat = (HmacKeyFormat) messageLite;
            int version = hmacKeyFormat.getVersion();
            HmacKeyManager hmacKeyManager = HmacKeyManager.this;
            Validators.validateVersion(version, hmacKeyManager.getVersion());
            byte[] bArr = new byte[hmacKeyFormat.getKeySize()];
            try {
                KeyTypeManager.KeyFactory.readFully(inputStream, bArr);
                return com.google.crypto.tink.proto.HmacKey.newBuilder().setVersion(hmacKeyManager.getVersion()).setParams(hmacKeyFormat.getParams()).setKeyValue(ByteString.copyFrom(bArr)).build();
            } catch (IOException e5) {
                throw new GeneralSecurityException("Reading pseudorandomness failed", e5);
            }
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<HmacKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            HashType hashType = HashType.SHA256;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            map.put("HMAC_SHA256_128BITTAG", HmacKeyManager.a(32, 16, hashType, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            map.put("HMAC_SHA256_128BITTAG_RAW", HmacKeyManager.a(32, 16, hashType, outputPrefixType2));
            map.put("HMAC_SHA256_256BITTAG", HmacKeyManager.a(32, 32, hashType, outputPrefixType));
            map.put("HMAC_SHA256_256BITTAG_RAW", HmacKeyManager.a(32, 32, hashType, outputPrefixType2));
            HashType hashType2 = HashType.SHA512;
            map.put("HMAC_SHA512_128BITTAG", HmacKeyManager.a(64, 16, hashType2, outputPrefixType));
            map.put("HMAC_SHA512_128BITTAG_RAW", HmacKeyManager.a(64, 16, hashType2, outputPrefixType2));
            map.put("HMAC_SHA512_256BITTAG", HmacKeyManager.a(64, 32, hashType2, outputPrefixType));
            map.put("HMAC_SHA512_256BITTAG_RAW", HmacKeyManager.a(64, 32, hashType2, outputPrefixType2));
            map.put("HMAC_SHA512_512BITTAG", HmacKeyManager.a(64, 64, hashType2, outputPrefixType));
            map.put("HMAC_SHA512_512BITTAG_RAW", HmacKeyManager.a(64, 64, hashType2, outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return HmacKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            HmacKeyFormat hmacKeyFormat = (HmacKeyFormat) messageLite;
            if (hmacKeyFormat.getKeySize() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            HmacKeyManager.c(hmacKeyFormat.getParams());
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46789a;

        static {
            int[] iArr = new int[HashType.values().length];
            f46789a = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46789a[HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46789a[HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46789a[HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46789a[HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public HmacKeyManager() {
        super(com.google.crypto.tink.proto.HmacKey.class, new a(Mac.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(int i10, int i11, HashType hashType, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat(HmacKeyFormat.newBuilder().setParams(HmacParams.newBuilder().setHash(hashType).setTagSize(i11).build()).setKeySize(i10).build(), outputPrefixType);
    }

    public static KeyTemplate b(int i10, int i11, HashType hashType) {
        return KeyTemplate.create(new HmacKeyManager().getKeyType(), HmacKeyFormat.newBuilder().setParams(HmacParams.newBuilder().setHash(hashType).setTagSize(i11).build()).setKeySize(i10).build().toByteArray(), KeyTemplate.OutputPrefixType.TINK);
    }

    public static void c(HmacParams hmacParams) throws GeneralSecurityException {
        if (hmacParams.getTagSize() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i10 = c.f46789a[hmacParams.getHash().ordinal()];
        if (i10 == 1) {
            if (hmacParams.getTagSize() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 2) {
            if (hmacParams.getTagSize() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 3) {
            if (hmacParams.getTagSize() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 4) {
            if (hmacParams.getTagSize() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i10 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (hmacParams.getTagSize() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    public static final KeyTemplate hmacSha256HalfDigestTemplate() {
        return b(32, 16, HashType.SHA256);
    }

    public static final KeyTemplate hmacSha256Template() {
        return b(32, 32, HashType.SHA256);
    }

    public static final KeyTemplate hmacSha512HalfDigestTemplate() {
        return b(64, 32, HashType.SHA512);
    }

    public static final KeyTemplate hmacSha512Template() {
        return b(64, 64, HashType.SHA512);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new HmacKeyManager(), z10);
        ParametersSerializer<HmacParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.mac.b.f46805a;
        MutableSerializationRegistry mutableSerializationRegistryGlobalInstance = MutableSerializationRegistry.globalInstance();
        mutableSerializationRegistryGlobalInstance.registerParametersSerializer(com.google.crypto.tink.mac.b.f46805a);
        mutableSerializationRegistryGlobalInstance.registerParametersParser(com.google.crypto.tink.mac.b.f46806b);
        mutableSerializationRegistryGlobalInstance.registerKeySerializer(com.google.crypto.tink.mac.b.f46807c);
        mutableSerializationRegistryGlobalInstance.registerKeyParser(com.google.crypto.tink.mac.b.f46808d);
        MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(f46787d);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<HmacKeyFormat, com.google.crypto.tink.proto.HmacKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.HmacKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.HmacKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.HmacKey hmacKey) throws GeneralSecurityException {
        Validators.validateVersion(hmacKey.getVersion(), getVersion());
        if (hmacKey.getKeyValue().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        c(hmacKey.getParams());
    }
}
