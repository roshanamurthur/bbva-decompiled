package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesGcmJce;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class AesGcmKeyManager extends KeyTypeManager<com.google.crypto.tink.proto.AesGcmKey> {

    public class a extends PrimitiveFactory<Aead, com.google.crypto.tink.proto.AesGcmKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Aead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            return new AesGcmJce(((com.google.crypto.tink.proto.AesGcmKey) messageLite).getKeyValue().toByteArray());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<AesGcmKeyFormat, com.google.crypto.tink.proto.AesGcmKey> {
        public b() {
            super(AesGcmKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            return com.google.crypto.tink.proto.AesGcmKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(((AesGcmKeyFormat) messageLite).getKeySize()))).setVersion(AesGcmKeyManager.this.getVersion()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            AesGcmKeyFormat aesGcmKeyFormat = (AesGcmKeyFormat) messageLite;
            int version = aesGcmKeyFormat.getVersion();
            AesGcmKeyManager aesGcmKeyManager = AesGcmKeyManager.this;
            Validators.validateVersion(version, aesGcmKeyManager.getVersion());
            byte[] bArr = new byte[aesGcmKeyFormat.getKeySize()];
            try {
                KeyTypeManager.KeyFactory.readFully(inputStream, bArr);
                return com.google.crypto.tink.proto.AesGcmKey.newBuilder().setKeyValue(ByteString.copyFrom(bArr)).setVersion(aesGcmKeyManager.getVersion()).build();
            } catch (IOException e5) {
                throw new GeneralSecurityException("Reading pseudorandomness failed", e5);
            }
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesGcmKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            map.put("AES128_GCM", AesGcmKeyManager.a(16, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            map.put("AES128_GCM_RAW", AesGcmKeyManager.a(16, outputPrefixType2));
            map.put("AES256_GCM", AesGcmKeyManager.a(32, outputPrefixType));
            map.put("AES256_GCM_RAW", AesGcmKeyManager.a(32, outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return AesGcmKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            Validators.validateAesKeySize(((AesGcmKeyFormat) messageLite).getKeySize());
        }
    }

    public AesGcmKeyManager() {
        super(com.google.crypto.tink.proto.AesGcmKey.class, new a(Aead.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(int i10, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat(AesGcmKeyFormat.newBuilder().setKeySize(i10).build(), outputPrefixType);
    }

    public static final KeyTemplate aes128GcmTemplate() {
        return b(16, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate aes256GcmTemplate() {
        return b(32, KeyTemplate.OutputPrefixType.TINK);
    }

    public static KeyTemplate b(int i10, KeyTemplate.OutputPrefixType outputPrefixType) {
        return KeyTemplate.create(new AesGcmKeyManager().getKeyType(), AesGcmKeyFormat.newBuilder().setKeySize(i10).build().toByteArray(), outputPrefixType);
    }

    public static final KeyTemplate rawAes128GcmTemplate() {
        return b(16, KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate rawAes256GcmTemplate() {
        return b(32, KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesGcmKeyManager(), z10);
        ParametersSerializer<AesGcmParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.b.f46539a;
        MutableSerializationRegistry mutableSerializationRegistryGlobalInstance = MutableSerializationRegistry.globalInstance();
        mutableSerializationRegistryGlobalInstance.registerParametersSerializer(com.google.crypto.tink.aead.b.f46539a);
        mutableSerializationRegistryGlobalInstance.registerParametersParser(com.google.crypto.tink.aead.b.f46540b);
        mutableSerializationRegistryGlobalInstance.registerKeySerializer(com.google.crypto.tink.aead.b.f46541c);
        mutableSerializationRegistryGlobalInstance.registerKeyParser(com.google.crypto.tink.aead.b.f46542d);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesGcmKeyFormat, com.google.crypto.tink.proto.AesGcmKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.AesGcmKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.AesGcmKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.AesGcmKey aesGcmKey) throws GeneralSecurityException {
        Validators.validateVersion(aesGcmKey.getVersion(), getVersion());
        Validators.validateAesKeySize(aesGcmKey.getKeyValue().size());
    }
}
