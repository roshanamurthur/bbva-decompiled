package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KmsClients;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KmsAeadKey;
import com.google.crypto.tink.proto.KmsAeadKeyFormat;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public class KmsAeadKeyManager extends KeyTypeManager<KmsAeadKey> {

    public class a extends PrimitiveFactory<Aead, KmsAeadKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Aead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            String keyUri = ((KmsAeadKey) messageLite).getParams().getKeyUri();
            return KmsClients.get(keyUri).getAead(keyUri);
        }
    }

    public class b extends KeyTypeManager.KeyFactory<KmsAeadKeyFormat, KmsAeadKey> {
        public b() {
            super(KmsAeadKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            return KmsAeadKey.newBuilder().setParams((KmsAeadKeyFormat) messageLite).setVersion(KmsAeadKeyManager.this.getVersion()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return KmsAeadKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final /* bridge */ /* synthetic */ void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
        }
    }

    public KmsAeadKeyManager() {
        super(KmsAeadKey.class, new a(Aead.class));
    }

    public static KeyTemplate createKeyTemplate(String str) {
        return KeyTemplate.create(new KmsAeadKeyManager().getKeyType(), KmsAeadKeyFormat.newBuilder().setKeyUri(str).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new KmsAeadKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<KmsAeadKeyFormat, KmsAeadKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KmsAeadKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return KmsAeadKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(KmsAeadKey kmsAeadKey) throws GeneralSecurityException {
        Validators.validateVersion(kmsAeadKey.getVersion(), getVersion());
    }
}
