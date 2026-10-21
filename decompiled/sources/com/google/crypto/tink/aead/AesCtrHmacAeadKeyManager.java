package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.mac.HmacKeyManager;
import com.google.crypto.tink.proto.AesCtrHmacAeadKey;
import com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat;
import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.AesCtrKeyFormat;
import com.google.crypto.tink.proto.AesCtrParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EncryptThenAuthenticate;
import com.google.crypto.tink.subtle.IndCpaCipher;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class AesCtrHmacAeadKeyManager extends KeyTypeManager<AesCtrHmacAeadKey> {

    public class a extends PrimitiveFactory<Aead, AesCtrHmacAeadKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Aead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            AesCtrHmacAeadKey aesCtrHmacAeadKey = (AesCtrHmacAeadKey) messageLite;
            return new EncryptThenAuthenticate((IndCpaCipher) new AesCtrKeyManager().getPrimitive(aesCtrHmacAeadKey.getAesCtrKey(), IndCpaCipher.class), (Mac) new HmacKeyManager().getPrimitive(aesCtrHmacAeadKey.getHmacKey(), Mac.class), aesCtrHmacAeadKey.getHmacKey().getParams().getTagSize());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<AesCtrHmacAeadKeyFormat, AesCtrHmacAeadKey> {
        public b() {
            super(AesCtrHmacAeadKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = (AesCtrHmacAeadKeyFormat) messageLite;
            AesCtrKey aesCtrKey = (AesCtrKey) new AesCtrKeyManager().keyFactory().createKey(aesCtrHmacAeadKeyFormat.getAesCtrKeyFormat());
            return AesCtrHmacAeadKey.newBuilder().setAesCtrKey(aesCtrKey).setHmacKey((HmacKey) new HmacKeyManager().keyFactory().createKey(aesCtrHmacAeadKeyFormat.getHmacKeyFormat())).setVersion(AesCtrHmacAeadKeyManager.this.getVersion()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesCtrHmacAeadKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            HashType hashType = HashType.SHA256;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            map.put("AES128_CTR_HMAC_SHA256", new KeyTypeManager.KeyFactory.KeyFormat(AesCtrHmacAeadKeyManager.a(16, 16, hashType), outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            map.put("AES128_CTR_HMAC_SHA256_RAW", new KeyTypeManager.KeyFactory.KeyFormat(AesCtrHmacAeadKeyManager.a(16, 16, hashType), outputPrefixType2));
            map.put("AES256_CTR_HMAC_SHA256", new KeyTypeManager.KeyFactory.KeyFormat(AesCtrHmacAeadKeyManager.a(32, 32, hashType), outputPrefixType));
            map.put("AES256_CTR_HMAC_SHA256_RAW", new KeyTypeManager.KeyFactory.KeyFormat(AesCtrHmacAeadKeyManager.a(32, 32, hashType), outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return AesCtrHmacAeadKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = (AesCtrHmacAeadKeyFormat) messageLite;
            new AesCtrKeyManager().keyFactory().validateKeyFormat(aesCtrHmacAeadKeyFormat.getAesCtrKeyFormat());
            new HmacKeyManager().keyFactory().validateKeyFormat(aesCtrHmacAeadKeyFormat.getHmacKeyFormat());
            Validators.validateAesKeySize(aesCtrHmacAeadKeyFormat.getAesCtrKeyFormat().getKeySize());
        }
    }

    public AesCtrHmacAeadKeyManager() {
        super(AesCtrHmacAeadKey.class, new a(Aead.class));
    }

    public static AesCtrHmacAeadKeyFormat a(int i10, int i11, HashType hashType) {
        AesCtrKeyFormat aesCtrKeyFormatBuild = AesCtrKeyFormat.newBuilder().setParams(AesCtrParams.newBuilder().setIvSize(16).build()).setKeySize(i10).build();
        return AesCtrHmacAeadKeyFormat.newBuilder().setAesCtrKeyFormat(aesCtrKeyFormatBuild).setHmacKeyFormat(HmacKeyFormat.newBuilder().setParams(HmacParams.newBuilder().setHash(hashType).setTagSize(i11).build()).setKeySize(32).build()).build();
    }

    public static final KeyTemplate aes128CtrHmacSha256Template() {
        return KeyTemplate.create(new AesCtrHmacAeadKeyManager().getKeyType(), a(16, 16, HashType.SHA256).toByteArray(), KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate aes256CtrHmacSha256Template() {
        return KeyTemplate.create(new AesCtrHmacAeadKeyManager().getKeyType(), a(32, 32, HashType.SHA256).toByteArray(), KeyTemplate.OutputPrefixType.TINK);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesCtrHmacAeadKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesCtrHmacAeadKeyFormat, AesCtrHmacAeadKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public AesCtrHmacAeadKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesCtrHmacAeadKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(AesCtrHmacAeadKey aesCtrHmacAeadKey) throws GeneralSecurityException {
        Validators.validateVersion(aesCtrHmacAeadKey.getVersion(), getVersion());
        new AesCtrKeyManager().validateKey(aesCtrHmacAeadKey.getAesCtrKey());
        new HmacKeyManager().validateKey(aesCtrHmacAeadKey.getHmacKey());
    }
}
