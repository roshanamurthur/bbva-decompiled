package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KmsClients;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKey;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public class KmsEnvelopeAeadKeyManager extends KeyTypeManager<KmsEnvelopeAeadKey> {

    public class a extends PrimitiveFactory<Aead, KmsEnvelopeAeadKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Aead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            KmsEnvelopeAeadKey kmsEnvelopeAeadKey = (KmsEnvelopeAeadKey) messageLite;
            String kekUri = kmsEnvelopeAeadKey.getParams().getKekUri();
            return new KmsEnvelopeAead(kmsEnvelopeAeadKey.getParams().getDekTemplate(), KmsClients.get(kekUri).getAead(kekUri));
        }
    }

    public class b extends KeyTypeManager.KeyFactory<KmsEnvelopeAeadKeyFormat, KmsEnvelopeAeadKey> {
        public b() {
            super(KmsEnvelopeAeadKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            return KmsEnvelopeAeadKey.newBuilder().setParams((KmsEnvelopeAeadKeyFormat) messageLite).setVersion(KmsEnvelopeAeadKeyManager.this.getVersion()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return KmsEnvelopeAeadKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat = (KmsEnvelopeAeadKeyFormat) messageLite;
            if (kmsEnvelopeAeadKeyFormat.getKekUri().isEmpty() || !kmsEnvelopeAeadKeyFormat.hasDekTemplate()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    public KmsEnvelopeAeadKeyManager() {
        super(KmsEnvelopeAeadKey.class, new a(Aead.class));
    }

    public static KeyTemplate createKeyTemplate(String str, KeyTemplate keyTemplate) {
        return KeyTemplate.create(new KmsEnvelopeAeadKeyManager().getKeyType(), KmsEnvelopeAeadKeyFormat.newBuilder().setDekTemplate(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(keyTemplate.getTypeUrl()).setValue(ByteString.copyFrom(keyTemplate.getValue())).build()).setKekUri(str).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new KmsEnvelopeAeadKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<KmsEnvelopeAeadKeyFormat, KmsEnvelopeAeadKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KmsEnvelopeAeadKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return KmsEnvelopeAeadKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(KmsEnvelopeAeadKey kmsEnvelopeAeadKey) throws GeneralSecurityException {
        Validators.validateVersion(kmsEnvelopeAeadKey.getVersion(), getVersion());
    }
}
