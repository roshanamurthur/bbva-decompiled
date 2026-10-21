package com.google.crypto.tink.mac;

import ad.d;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutablePrimitiveRegistry;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveConstructor;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.proto.AesCmacKeyFormat;
import com.google.crypto.tink.proto.AesCmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.PrfAesCmac;
import com.google.crypto.tink.subtle.PrfMac;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class AesCmacKeyManager extends KeyTypeManager<com.google.crypto.tink.proto.AesCmacKey> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PrimitiveConstructor<AesCmacKey, ChunkedMac> f46769d = PrimitiveConstructor.create(new d(), AesCmacKey.class, ChunkedMac.class);

    public class a extends PrimitiveFactory<Mac, com.google.crypto.tink.proto.AesCmacKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Mac getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            com.google.crypto.tink.proto.AesCmacKey aesCmacKey = (com.google.crypto.tink.proto.AesCmacKey) messageLite;
            return new PrfMac(new PrfAesCmac(aesCmacKey.getKeyValue().toByteArray()), aesCmacKey.getParams().getTagSize());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<AesCmacKeyFormat, com.google.crypto.tink.proto.AesCmacKey> {
        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            AesCmacKeyFormat aesCmacKeyFormat = (AesCmacKeyFormat) messageLite;
            return com.google.crypto.tink.proto.AesCmacKey.newBuilder().setVersion(0).setKeyValue(ByteString.copyFrom(Random.randBytes(aesCmacKeyFormat.getKeySize()))).setParams(aesCmacKeyFormat.getParams()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesCmacKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            AesCmacKeyFormat aesCmacKeyFormatBuild = AesCmacKeyFormat.newBuilder().setKeySize(32).setParams(AesCmacParams.newBuilder().setTagSize(16).build()).build();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            map.put("AES_CMAC", new KeyTypeManager.KeyFactory.KeyFormat(aesCmacKeyFormatBuild, outputPrefixType));
            map.put("AES256_CMAC", new KeyTypeManager.KeyFactory.KeyFormat(AesCmacKeyFormat.newBuilder().setKeySize(32).setParams(AesCmacParams.newBuilder().setTagSize(16).build()).build(), outputPrefixType));
            map.put("AES256_CMAC_RAW", new KeyTypeManager.KeyFactory.KeyFormat(AesCmacKeyFormat.newBuilder().setKeySize(32).setParams(AesCmacParams.newBuilder().setTagSize(16).build()).build(), KeyTemplate.OutputPrefixType.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return AesCmacKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            AesCmacKeyFormat aesCmacKeyFormat = (AesCmacKeyFormat) messageLite;
            AesCmacKeyManager.a(aesCmacKeyFormat.getParams());
            if (aesCmacKeyFormat.getKeySize() != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
        }
    }

    public AesCmacKeyManager() {
        super(com.google.crypto.tink.proto.AesCmacKey.class, new a(Mac.class));
    }

    public static void a(AesCmacParams aesCmacParams) throws GeneralSecurityException {
        if (aesCmacParams.getTagSize() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (aesCmacParams.getTagSize() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static final KeyTemplate aes256CmacTemplate() {
        return KeyTemplate.create(new AesCmacKeyManager().getKeyType(), AesCmacKeyFormat.newBuilder().setKeySize(32).setParams(AesCmacParams.newBuilder().setTagSize(16).build()).build().toByteArray(), KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawAes256CmacTemplate() {
        return KeyTemplate.create(new AesCmacKeyManager().getKeyType(), AesCmacKeyFormat.newBuilder().setKeySize(32).setParams(AesCmacParams.newBuilder().setTagSize(16).build()).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesCmacKeyManager(), z10);
        ParametersSerializer<AesCmacParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.mac.a.f46800a;
        MutableSerializationRegistry mutableSerializationRegistryGlobalInstance = MutableSerializationRegistry.globalInstance();
        mutableSerializationRegistryGlobalInstance.registerParametersSerializer(com.google.crypto.tink.mac.a.f46800a);
        mutableSerializationRegistryGlobalInstance.registerParametersParser(com.google.crypto.tink.mac.a.f46801b);
        mutableSerializationRegistryGlobalInstance.registerKeySerializer(com.google.crypto.tink.mac.a.f46802c);
        mutableSerializationRegistryGlobalInstance.registerKeyParser(com.google.crypto.tink.mac.a.f46803d);
        MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(f46769d);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesCmacKeyFormat, com.google.crypto.tink.proto.AesCmacKey> keyFactory() {
        return new b(AesCmacKeyFormat.class);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.AesCmacKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.AesCmacKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.AesCmacKey aesCmacKey) throws GeneralSecurityException {
        Validators.validateVersion(aesCmacKey.getVersion(), getVersion());
        if (aesCmacKey.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        a(aesCmacKey.getParams());
    }
}
