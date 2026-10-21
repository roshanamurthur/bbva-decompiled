package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.proto.AesEaxKeyFormat;
import com.google.crypto.tink.proto.AesEaxParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesEaxJce;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class AesEaxKeyManager extends KeyTypeManager<com.google.crypto.tink.proto.AesEaxKey> {

    public class a extends PrimitiveFactory<Aead, com.google.crypto.tink.proto.AesEaxKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Aead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            com.google.crypto.tink.proto.AesEaxKey aesEaxKey = (com.google.crypto.tink.proto.AesEaxKey) messageLite;
            return new AesEaxJce(aesEaxKey.getKeyValue().toByteArray(), aesEaxKey.getParams().getIvSize());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<AesEaxKeyFormat, com.google.crypto.tink.proto.AesEaxKey> {
        public b() {
            super(AesEaxKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            AesEaxKeyFormat aesEaxKeyFormat = (AesEaxKeyFormat) messageLite;
            return com.google.crypto.tink.proto.AesEaxKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(aesEaxKeyFormat.getKeySize()))).setParams(aesEaxKeyFormat.getParams()).setVersion(AesEaxKeyManager.this.getVersion()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesEaxKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            map.put("AES128_EAX", AesEaxKeyManager.a(16, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            map.put("AES128_EAX_RAW", AesEaxKeyManager.a(16, outputPrefixType2));
            map.put("AES256_EAX", AesEaxKeyManager.a(32, outputPrefixType));
            map.put("AES256_EAX_RAW", AesEaxKeyManager.a(32, outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return AesEaxKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            AesEaxKeyFormat aesEaxKeyFormat = (AesEaxKeyFormat) messageLite;
            Validators.validateAesKeySize(aesEaxKeyFormat.getKeySize());
            if (aesEaxKeyFormat.getParams().getIvSize() != 12 && aesEaxKeyFormat.getParams().getIvSize() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public AesEaxKeyManager() {
        super(com.google.crypto.tink.proto.AesEaxKey.class, new a(Aead.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(int i10, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat(AesEaxKeyFormat.newBuilder().setKeySize(i10).setParams(AesEaxParams.newBuilder().setIvSize(16).build()).build(), outputPrefixType);
    }

    public static final KeyTemplate aes128EaxTemplate() {
        return b(16, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate aes256EaxTemplate() {
        return b(32, KeyTemplate.OutputPrefixType.TINK);
    }

    public static KeyTemplate b(int i10, KeyTemplate.OutputPrefixType outputPrefixType) {
        return KeyTemplate.create(new AesEaxKeyManager().getKeyType(), AesEaxKeyFormat.newBuilder().setKeySize(i10).setParams(AesEaxParams.newBuilder().setIvSize(16).build()).build().toByteArray(), outputPrefixType);
    }

    public static final KeyTemplate rawAes128EaxTemplate() {
        return b(16, KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate rawAes256EaxTemplate() {
        return b(32, KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesEaxKeyManager(), z10);
        ParametersSerializer<AesEaxParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.a.f46534a;
        MutableSerializationRegistry mutableSerializationRegistryGlobalInstance = MutableSerializationRegistry.globalInstance();
        mutableSerializationRegistryGlobalInstance.registerParametersSerializer(com.google.crypto.tink.aead.a.f46534a);
        mutableSerializationRegistryGlobalInstance.registerParametersParser(com.google.crypto.tink.aead.a.f46535b);
        mutableSerializationRegistryGlobalInstance.registerKeySerializer(com.google.crypto.tink.aead.a.f46536c);
        mutableSerializationRegistryGlobalInstance.registerKeyParser(com.google.crypto.tink.aead.a.f46537d);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesEaxKeyFormat, com.google.crypto.tink.proto.AesEaxKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.AesEaxKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.AesEaxKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.AesEaxKey aesEaxKey) throws GeneralSecurityException {
        Validators.validateVersion(aesEaxKey.getVersion(), getVersion());
        Validators.validateAesKeySize(aesEaxKey.getKeyValue().size());
        if (aesEaxKey.getParams().getIvSize() != 12 && aesEaxKey.getParams().getIvSize() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
