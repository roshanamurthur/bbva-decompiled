package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKey;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesGcmHkdfStreaming;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lf.e;

/* JADX INFO: loaded from: classes10.dex */
public final class AesGcmHkdfStreamingKeyManager extends KeyTypeManager<AesGcmHkdfStreamingKey> {

    public class a extends PrimitiveFactory<StreamingAead, AesGcmHkdfStreamingKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final StreamingAead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey = (AesGcmHkdfStreamingKey) messageLite;
            return new AesGcmHkdfStreaming(aesGcmHkdfStreamingKey.getKeyValue().toByteArray(), e.a(aesGcmHkdfStreamingKey.getParams().getHkdfHashType()), aesGcmHkdfStreamingKey.getParams().getDerivedKeySize(), aesGcmHkdfStreamingKey.getParams().getCiphertextSegmentSize(), 0);
        }
    }

    public class b extends KeyTypeManager.KeyFactory<AesGcmHkdfStreamingKeyFormat, AesGcmHkdfStreamingKey> {
        public b() {
            super(AesGcmHkdfStreamingKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat = (AesGcmHkdfStreamingKeyFormat) messageLite;
            return AesGcmHkdfStreamingKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(aesGcmHkdfStreamingKeyFormat.getKeySize()))).setParams(aesGcmHkdfStreamingKeyFormat.getParams()).setVersion(AesGcmHkdfStreamingKeyManager.this.getVersion()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat = (AesGcmHkdfStreamingKeyFormat) messageLite;
            int version = aesGcmHkdfStreamingKeyFormat.getVersion();
            AesGcmHkdfStreamingKeyManager aesGcmHkdfStreamingKeyManager = AesGcmHkdfStreamingKeyManager.this;
            Validators.validateVersion(version, aesGcmHkdfStreamingKeyManager.getVersion());
            byte[] bArr = new byte[aesGcmHkdfStreamingKeyFormat.getKeySize()];
            try {
                KeyTypeManager.KeyFactory.readFully(inputStream, bArr);
                return AesGcmHkdfStreamingKey.newBuilder().setKeyValue(ByteString.copyFrom(bArr)).setParams(aesGcmHkdfStreamingKeyFormat.getParams()).setVersion(aesGcmHkdfStreamingKeyManager.getVersion()).build();
            } catch (IOException e5) {
                throw new GeneralSecurityException("Reading pseudorandomness failed", e5);
            }
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesGcmHkdfStreamingKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            HashType hashType = HashType.SHA256;
            AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormatA = AesGcmHkdfStreamingKeyManager.a(16, hashType, 16, 4096);
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
            map.put("AES128_GCM_HKDF_4KB", new KeyTypeManager.KeyFactory.KeyFormat(aesGcmHkdfStreamingKeyFormatA, outputPrefixType));
            map.put("AES128_GCM_HKDF_1MB", new KeyTypeManager.KeyFactory.KeyFormat(AesGcmHkdfStreamingKeyManager.a(16, hashType, 16, 1048576), outputPrefixType));
            map.put("AES256_GCM_HKDF_4KB", new KeyTypeManager.KeyFactory.KeyFormat(AesGcmHkdfStreamingKeyManager.a(32, hashType, 32, 4096), outputPrefixType));
            map.put("AES256_GCM_HKDF_1MB", new KeyTypeManager.KeyFactory.KeyFormat(AesGcmHkdfStreamingKeyManager.a(32, hashType, 32, 1048576), outputPrefixType));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return AesGcmHkdfStreamingKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat = (AesGcmHkdfStreamingKeyFormat) messageLite;
            if (aesGcmHkdfStreamingKeyFormat.getKeySize() < 16) {
                throw new GeneralSecurityException("key_size must be at least 16 bytes");
            }
            AesGcmHkdfStreamingKeyManager.c(aesGcmHkdfStreamingKeyFormat.getParams());
        }
    }

    public AesGcmHkdfStreamingKeyManager() {
        super(AesGcmHkdfStreamingKey.class, new a(StreamingAead.class));
    }

    public static AesGcmHkdfStreamingKeyFormat a(int i10, HashType hashType, int i11, int i12) {
        return AesGcmHkdfStreamingKeyFormat.newBuilder().setKeySize(i10).setParams(AesGcmHkdfStreamingParams.newBuilder().setCiphertextSegmentSize(i12).setDerivedKeySize(i11).setHkdfHashType(hashType).build()).build();
    }

    public static final KeyTemplate aes128GcmHkdf1MBTemplate() {
        return b(16, HashType.SHA256, 16, 1048576);
    }

    public static final KeyTemplate aes128GcmHkdf4KBTemplate() {
        return b(16, HashType.SHA256, 16, 4096);
    }

    public static final KeyTemplate aes256GcmHkdf1MBTemplate() {
        return b(32, HashType.SHA256, 32, 1048576);
    }

    public static final KeyTemplate aes256GcmHkdf4KBTemplate() {
        return b(32, HashType.SHA256, 32, 4096);
    }

    public static KeyTemplate b(int i10, HashType hashType, int i11, int i12) {
        return KeyTemplate.create(new AesGcmHkdfStreamingKeyManager().getKeyType(), a(i10, hashType, i11, i12).toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void c(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) throws GeneralSecurityException {
        Validators.validateAesKeySize(aesGcmHkdfStreamingParams.getDerivedKeySize());
        if (aesGcmHkdfStreamingParams.getHkdfHashType() == HashType.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        }
        if (aesGcmHkdfStreamingParams.getCiphertextSegmentSize() < aesGcmHkdfStreamingParams.getDerivedKeySize() + 25) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesGcmHkdfStreamingKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesGcmHkdfStreamingKeyFormat, AesGcmHkdfStreamingKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public AesGcmHkdfStreamingKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesGcmHkdfStreamingKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey) throws GeneralSecurityException {
        Validators.validateVersion(aesGcmHkdfStreamingKey.getVersion(), getVersion());
        c(aesGcmHkdfStreamingKey.getParams());
    }
}
