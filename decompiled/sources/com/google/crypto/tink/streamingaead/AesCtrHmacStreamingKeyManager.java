package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.AesCtrHmacStreamingKey;
import com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat;
import com.google.crypto.tink.proto.AesCtrHmacStreamingParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesCtrHmacStreaming;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lf.e;

/* JADX INFO: loaded from: classes10.dex */
public final class AesCtrHmacStreamingKeyManager extends KeyTypeManager<AesCtrHmacStreamingKey> {

    public class a extends PrimitiveFactory<StreamingAead, AesCtrHmacStreamingKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final StreamingAead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            AesCtrHmacStreamingKey aesCtrHmacStreamingKey = (AesCtrHmacStreamingKey) messageLite;
            return new AesCtrHmacStreaming(aesCtrHmacStreamingKey.getKeyValue().toByteArray(), e.a(aesCtrHmacStreamingKey.getParams().getHkdfHashType()), aesCtrHmacStreamingKey.getParams().getDerivedKeySize(), e.a(aesCtrHmacStreamingKey.getParams().getHmacParams().getHash()), aesCtrHmacStreamingKey.getParams().getHmacParams().getTagSize(), aesCtrHmacStreamingKey.getParams().getCiphertextSegmentSize(), 0);
        }
    }

    public class b extends KeyTypeManager.KeyFactory<AesCtrHmacStreamingKeyFormat, AesCtrHmacStreamingKey> {
        public b() {
            super(AesCtrHmacStreamingKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            AesCtrHmacStreamingKeyFormat aesCtrHmacStreamingKeyFormat = (AesCtrHmacStreamingKeyFormat) messageLite;
            return AesCtrHmacStreamingKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(aesCtrHmacStreamingKeyFormat.getKeySize()))).setParams(aesCtrHmacStreamingKeyFormat.getParams()).setVersion(AesCtrHmacStreamingKeyManager.this.getVersion()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesCtrHmacStreamingKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            HashType hashType = HashType.SHA256;
            AesCtrHmacStreamingKeyFormat aesCtrHmacStreamingKeyFormatA = AesCtrHmacStreamingKeyManager.a(16, hashType, 16, hashType, 4096);
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
            map.put("AES128_CTR_HMAC_SHA256_4KB", new KeyTypeManager.KeyFactory.KeyFormat(aesCtrHmacStreamingKeyFormatA, outputPrefixType));
            map.put("AES128_CTR_HMAC_SHA256_1MB", new KeyTypeManager.KeyFactory.KeyFormat(AesCtrHmacStreamingKeyManager.a(16, hashType, 16, hashType, 1048576), outputPrefixType));
            map.put("AES256_CTR_HMAC_SHA256_4KB", new KeyTypeManager.KeyFactory.KeyFormat(AesCtrHmacStreamingKeyManager.a(32, hashType, 32, hashType, 4096), outputPrefixType));
            map.put("AES256_CTR_HMAC_SHA256_1MB", new KeyTypeManager.KeyFactory.KeyFormat(AesCtrHmacStreamingKeyManager.a(32, hashType, 32, hashType, 1048576), outputPrefixType));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return AesCtrHmacStreamingKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            AesCtrHmacStreamingKeyFormat aesCtrHmacStreamingKeyFormat = (AesCtrHmacStreamingKeyFormat) messageLite;
            if (aesCtrHmacStreamingKeyFormat.getKeySize() < 16) {
                throw new GeneralSecurityException("key_size must be at least 16 bytes");
            }
            AesCtrHmacStreamingKeyManager.c(aesCtrHmacStreamingKeyFormat.getParams());
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47369a;

        static {
            int[] iArr = new int[HashType.values().length];
            f47369a = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47369a[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47369a[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AesCtrHmacStreamingKeyManager() {
        super(AesCtrHmacStreamingKey.class, new a(StreamingAead.class));
    }

    public static AesCtrHmacStreamingKeyFormat a(int i10, HashType hashType, int i11, HashType hashType2, int i12) {
        return AesCtrHmacStreamingKeyFormat.newBuilder().setParams(AesCtrHmacStreamingParams.newBuilder().setCiphertextSegmentSize(i12).setDerivedKeySize(i11).setHkdfHashType(hashType).setHmacParams(HmacParams.newBuilder().setHash(hashType2).setTagSize(32).build()).build()).setKeySize(i10).build();
    }

    public static final KeyTemplate aes128CtrHmacSha2561MBTemplate() {
        HashType hashType = HashType.SHA256;
        return b(16, hashType, 16, hashType, 1048576);
    }

    public static final KeyTemplate aes128CtrHmacSha2564KBTemplate() {
        HashType hashType = HashType.SHA256;
        return b(16, hashType, 16, hashType, 4096);
    }

    public static final KeyTemplate aes256CtrHmacSha2561MBTemplate() {
        HashType hashType = HashType.SHA256;
        return b(32, hashType, 32, hashType, 1048576);
    }

    public static final KeyTemplate aes256CtrHmacSha2564KBTemplate() {
        HashType hashType = HashType.SHA256;
        return b(32, hashType, 32, hashType, 4096);
    }

    public static KeyTemplate b(int i10, HashType hashType, int i11, HashType hashType2, int i12) {
        return KeyTemplate.create(new AesCtrHmacStreamingKeyManager().getKeyType(), a(i10, hashType, i11, hashType2, i12).toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void c(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) throws GeneralSecurityException {
        Validators.validateAesKeySize(aesCtrHmacStreamingParams.getDerivedKeySize());
        if (aesCtrHmacStreamingParams.getHkdfHashType() != HashType.SHA1 && aesCtrHmacStreamingParams.getHkdfHashType() != HashType.SHA256 && aesCtrHmacStreamingParams.getHkdfHashType() != HashType.SHA512) {
            throw new GeneralSecurityException("Invalid HKDF hash type: " + aesCtrHmacStreamingParams.getHkdfHashType().getNumber());
        }
        if (aesCtrHmacStreamingParams.getHmacParams().getHash() == HashType.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HMAC hash type");
        }
        HmacParams hmacParams = aesCtrHmacStreamingParams.getHmacParams();
        if (hmacParams.getTagSize() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i10 = c.f47369a[hmacParams.getHash().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new GeneralSecurityException("unknown hash type");
                }
                if (hmacParams.getTagSize() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (hmacParams.getTagSize() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (hmacParams.getTagSize() > 20) {
            throw new GeneralSecurityException("tag size too big");
        }
        if (aesCtrHmacStreamingParams.getCiphertextSegmentSize() < aesCtrHmacStreamingParams.getHmacParams().getTagSize() + aesCtrHmacStreamingParams.getDerivedKeySize() + 9) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
        }
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesCtrHmacStreamingKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesCtrHmacStreamingKeyFormat, AesCtrHmacStreamingKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public AesCtrHmacStreamingKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesCtrHmacStreamingKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(AesCtrHmacStreamingKey aesCtrHmacStreamingKey) throws GeneralSecurityException {
        Validators.validateVersion(aesCtrHmacStreamingKey.getVersion(), getVersion());
        if (aesCtrHmacStreamingKey.getKeyValue().size() < 16) {
            throw new GeneralSecurityException("key_value must have at least 16 bytes");
        }
        if (aesCtrHmacStreamingKey.getKeyValue().size() < aesCtrHmacStreamingKey.getParams().getDerivedKeySize()) {
            throw new GeneralSecurityException("key_value must have at least as many bits as derived keys");
        }
        c(aesCtrHmacStreamingKey.getParams());
    }
}
