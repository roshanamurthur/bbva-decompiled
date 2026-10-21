package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.aead.subtle.AesGcmSiv;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.proto.AesGcmSivKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes10.dex */
public final class AesGcmSivKeyManager extends KeyTypeManager<com.google.crypto.tink.proto.AesGcmSivKey> {

    public class a extends PrimitiveFactory<Aead, com.google.crypto.tink.proto.AesGcmSivKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Aead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            return new AesGcmSiv(((com.google.crypto.tink.proto.AesGcmSivKey) messageLite).getKeyValue().toByteArray());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<AesGcmSivKeyFormat, com.google.crypto.tink.proto.AesGcmSivKey> {
        public b() {
            super(AesGcmSivKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            return com.google.crypto.tink.proto.AesGcmSivKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(((AesGcmSivKeyFormat) messageLite).getKeySize()))).setVersion(AesGcmSivKeyManager.this.getVersion()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            AesGcmSivKeyFormat aesGcmSivKeyFormat = (AesGcmSivKeyFormat) messageLite;
            int version = aesGcmSivKeyFormat.getVersion();
            AesGcmSivKeyManager aesGcmSivKeyManager = AesGcmSivKeyManager.this;
            Validators.validateVersion(version, aesGcmSivKeyManager.getVersion());
            byte[] bArr = new byte[aesGcmSivKeyFormat.getKeySize()];
            try {
                KeyTypeManager.KeyFactory.readFully(inputStream, bArr);
                return com.google.crypto.tink.proto.AesGcmSivKey.newBuilder().setKeyValue(ByteString.copyFrom(bArr)).setVersion(aesGcmSivKeyManager.getVersion()).build();
            } catch (IOException e5) {
                throw new GeneralSecurityException("Reading pseudorandomness failed", e5);
            }
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesGcmSivKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            map.put("AES128_GCM_SIV", AesGcmSivKeyManager.a(16, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            map.put("AES128_GCM_SIV_RAW", AesGcmSivKeyManager.a(16, outputPrefixType2));
            map.put("AES256_GCM_SIV", AesGcmSivKeyManager.a(32, outputPrefixType));
            map.put("AES256_GCM_SIV_RAW", AesGcmSivKeyManager.a(32, outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return AesGcmSivKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            Validators.validateAesKeySize(((AesGcmSivKeyFormat) messageLite).getKeySize());
        }
    }

    public AesGcmSivKeyManager() {
        super(com.google.crypto.tink.proto.AesGcmSivKey.class, new a(Aead.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(int i10, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat(AesGcmSivKeyFormat.newBuilder().setKeySize(i10).build(), outputPrefixType);
    }

    public static final KeyTemplate aes128GcmSivTemplate() {
        return b(16, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate aes256GcmSivTemplate() {
        return b(32, KeyTemplate.OutputPrefixType.TINK);
    }

    public static KeyTemplate b(int i10, KeyTemplate.OutputPrefixType outputPrefixType) {
        return KeyTemplate.create(new AesGcmSivKeyManager().getKeyType(), AesGcmSivKeyFormat.newBuilder().setKeySize(i10).build().toByteArray(), outputPrefixType);
    }

    public static final KeyTemplate rawAes128GcmSivTemplate() {
        return b(16, KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate rawAes256GcmSivTemplate() {
        return b(32, KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            Registry.registerKeyManager(new AesGcmSivKeyManager(), z10);
            ParametersSerializer<AesGcmSivParameters, ProtoParametersSerialization> parametersSerializer = c.f46544a;
            MutableSerializationRegistry mutableSerializationRegistryGlobalInstance = MutableSerializationRegistry.globalInstance();
            mutableSerializationRegistryGlobalInstance.registerParametersSerializer(c.f46544a);
            mutableSerializationRegistryGlobalInstance.registerParametersParser(c.f46545b);
            mutableSerializationRegistryGlobalInstance.registerKeySerializer(c.f46546c);
            mutableSerializationRegistryGlobalInstance.registerKeyParser(c.f46547d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesGcmSivKeyFormat, com.google.crypto.tink.proto.AesGcmSivKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.AesGcmSivKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.AesGcmSivKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.AesGcmSivKey aesGcmSivKey) throws GeneralSecurityException {
        Validators.validateVersion(aesGcmSivKey.getVersion(), getVersion());
        Validators.validateAesKeySize(aesGcmSivKey.getKeyValue().size());
    }
}
