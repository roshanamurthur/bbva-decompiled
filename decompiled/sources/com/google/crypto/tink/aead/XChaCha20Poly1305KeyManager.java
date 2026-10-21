package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.google.crypto.tink.subtle.XChaCha20Poly1305;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class XChaCha20Poly1305KeyManager extends KeyTypeManager<com.google.crypto.tink.proto.XChaCha20Poly1305Key> {

    public class a extends PrimitiveFactory<Aead, com.google.crypto.tink.proto.XChaCha20Poly1305Key> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Aead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            return new XChaCha20Poly1305(((com.google.crypto.tink.proto.XChaCha20Poly1305Key) messageLite).getKeyValue().toByteArray());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<XChaCha20Poly1305KeyFormat, com.google.crypto.tink.proto.XChaCha20Poly1305Key> {
        public b() {
            super(XChaCha20Poly1305KeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            return com.google.crypto.tink.proto.XChaCha20Poly1305Key.newBuilder().setVersion(XChaCha20Poly1305KeyManager.this.getVersion()).setKeyValue(ByteString.copyFrom(Random.randBytes(32))).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            int version = ((XChaCha20Poly1305KeyFormat) messageLite).getVersion();
            XChaCha20Poly1305KeyManager xChaCha20Poly1305KeyManager = XChaCha20Poly1305KeyManager.this;
            Validators.validateVersion(version, xChaCha20Poly1305KeyManager.getVersion());
            byte[] bArr = new byte[32];
            try {
                KeyTypeManager.KeyFactory.readFully(inputStream, bArr);
                return com.google.crypto.tink.proto.XChaCha20Poly1305Key.newBuilder().setKeyValue(ByteString.copyFrom(bArr)).setVersion(xChaCha20Poly1305KeyManager.getVersion()).build();
            } catch (IOException e5) {
                throw new GeneralSecurityException("Reading pseudorandomness failed", e5);
            }
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<XChaCha20Poly1305KeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", new KeyTypeManager.KeyFactory.KeyFormat(XChaCha20Poly1305KeyFormat.getDefaultInstance(), KeyTemplate.OutputPrefixType.TINK));
            map.put("XCHACHA20_POLY1305_RAW", new KeyTypeManager.KeyFactory.KeyFormat(XChaCha20Poly1305KeyFormat.getDefaultInstance(), KeyTemplate.OutputPrefixType.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return XChaCha20Poly1305KeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final /* bridge */ /* synthetic */ void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
        }
    }

    public XChaCha20Poly1305KeyManager() {
        super(com.google.crypto.tink.proto.XChaCha20Poly1305Key.class, new a(Aead.class));
    }

    public static final KeyTemplate rawXChaCha20Poly1305Template() {
        return KeyTemplate.create(new XChaCha20Poly1305KeyManager().getKeyType(), XChaCha20Poly1305KeyFormat.getDefaultInstance().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new XChaCha20Poly1305KeyManager(), z10);
        ParametersSerializer<XChaCha20Poly1305Parameters, ProtoParametersSerialization> parametersSerializer = e.f46554a;
        MutableSerializationRegistry mutableSerializationRegistryGlobalInstance = MutableSerializationRegistry.globalInstance();
        mutableSerializationRegistryGlobalInstance.registerParametersSerializer(e.f46554a);
        mutableSerializationRegistryGlobalInstance.registerParametersParser(e.f46555b);
        mutableSerializationRegistryGlobalInstance.registerKeySerializer(e.f46556c);
        mutableSerializationRegistryGlobalInstance.registerKeyParser(e.f46557d);
    }

    public static final KeyTemplate xChaCha20Poly1305Template() {
        return KeyTemplate.create(new XChaCha20Poly1305KeyManager().getKeyType(), XChaCha20Poly1305KeyFormat.getDefaultInstance().toByteArray(), KeyTemplate.OutputPrefixType.TINK);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<XChaCha20Poly1305KeyFormat, com.google.crypto.tink.proto.XChaCha20Poly1305Key> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.XChaCha20Poly1305Key parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.XChaCha20Poly1305Key.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.XChaCha20Poly1305Key xChaCha20Poly1305Key) throws GeneralSecurityException {
        Validators.validateVersion(xChaCha20Poly1305Key.getVersion(), getVersion());
        if (xChaCha20Poly1305Key.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
