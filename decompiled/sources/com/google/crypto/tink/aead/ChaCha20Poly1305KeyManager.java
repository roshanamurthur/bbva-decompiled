package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.ChaCha20Poly1305;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ChaCha20Poly1305KeyManager extends KeyTypeManager<com.google.crypto.tink.proto.ChaCha20Poly1305Key> {

    public class a extends PrimitiveFactory<Aead, com.google.crypto.tink.proto.ChaCha20Poly1305Key> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Aead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            return new ChaCha20Poly1305(((com.google.crypto.tink.proto.ChaCha20Poly1305Key) messageLite).getKeyValue().toByteArray());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<ChaCha20Poly1305KeyFormat, com.google.crypto.tink.proto.ChaCha20Poly1305Key> {
        public b() {
            super(ChaCha20Poly1305KeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            return com.google.crypto.tink.proto.ChaCha20Poly1305Key.newBuilder().setVersion(ChaCha20Poly1305KeyManager.this.getVersion()).setKeyValue(ByteString.copyFrom(Random.randBytes(32))).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<ChaCha20Poly1305KeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", new KeyTypeManager.KeyFactory.KeyFormat(ChaCha20Poly1305KeyFormat.getDefaultInstance(), KeyTemplate.OutputPrefixType.TINK));
            map.put("CHACHA20_POLY1305_RAW", new KeyTypeManager.KeyFactory.KeyFormat(ChaCha20Poly1305KeyFormat.getDefaultInstance(), KeyTemplate.OutputPrefixType.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return ChaCha20Poly1305KeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final /* bridge */ /* synthetic */ void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
        }
    }

    public ChaCha20Poly1305KeyManager() {
        super(com.google.crypto.tink.proto.ChaCha20Poly1305Key.class, new a(Aead.class));
    }

    public static final KeyTemplate chaCha20Poly1305Template() {
        return KeyTemplate.create(new ChaCha20Poly1305KeyManager().getKeyType(), ChaCha20Poly1305KeyFormat.getDefaultInstance().toByteArray(), KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawChaCha20Poly1305Template() {
        return KeyTemplate.create(new ChaCha20Poly1305KeyManager().getKeyType(), ChaCha20Poly1305KeyFormat.getDefaultInstance().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new ChaCha20Poly1305KeyManager(), z10);
        ParametersSerializer<ChaCha20Poly1305Parameters, ProtoParametersSerialization> parametersSerializer = d.f46549a;
        MutableSerializationRegistry mutableSerializationRegistryGlobalInstance = MutableSerializationRegistry.globalInstance();
        mutableSerializationRegistryGlobalInstance.registerParametersSerializer(d.f46549a);
        mutableSerializationRegistryGlobalInstance.registerParametersParser(d.f46550b);
        mutableSerializationRegistryGlobalInstance.registerKeySerializer(d.f46551c);
        mutableSerializationRegistryGlobalInstance.registerKeyParser(d.f46552d);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<ChaCha20Poly1305KeyFormat, com.google.crypto.tink.proto.ChaCha20Poly1305Key> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.ChaCha20Poly1305Key parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.ChaCha20Poly1305Key.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.ChaCha20Poly1305Key chaCha20Poly1305Key) throws GeneralSecurityException {
        Validators.validateVersion(chaCha20Poly1305Key.getVersion(), getVersion());
        if (chaCha20Poly1305Key.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
