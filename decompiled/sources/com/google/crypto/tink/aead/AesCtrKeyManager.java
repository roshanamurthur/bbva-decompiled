package com.google.crypto.tink.aead;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.AesCtrKeyFormat;
import com.google.crypto.tink.proto.AesCtrParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesCtrJceCipher;
import com.google.crypto.tink.subtle.IndCpaCipher;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public class AesCtrKeyManager extends KeyTypeManager<AesCtrKey> {

    public class a extends PrimitiveFactory<IndCpaCipher, AesCtrKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final IndCpaCipher getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            AesCtrKey aesCtrKey = (AesCtrKey) messageLite;
            return new AesCtrJceCipher(aesCtrKey.getKeyValue().toByteArray(), aesCtrKey.getParams().getIvSize());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<AesCtrKeyFormat, AesCtrKey> {
        public b() {
            super(AesCtrKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            AesCtrKeyFormat aesCtrKeyFormat = (AesCtrKeyFormat) messageLite;
            return AesCtrKey.newBuilder().setParams(aesCtrKeyFormat.getParams()).setKeyValue(ByteString.copyFrom(Random.randBytes(aesCtrKeyFormat.getKeySize()))).setVersion(AesCtrKeyManager.this.getVersion()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return AesCtrKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            AesCtrKeyFormat aesCtrKeyFormat = (AesCtrKeyFormat) messageLite;
            Validators.validateAesKeySize(aesCtrKeyFormat.getKeySize());
            AesCtrParams params = aesCtrKeyFormat.getParams();
            AesCtrKeyManager.this.getClass();
            if (params.getIvSize() < 12 || params.getIvSize() > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
        }
    }

    public AesCtrKeyManager() {
        super(AesCtrKey.class, new a(IndCpaCipher.class));
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesCtrKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesCtrKeyFormat, AesCtrKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public AesCtrKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesCtrKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(AesCtrKey aesCtrKey) throws GeneralSecurityException {
        Validators.validateVersion(aesCtrKey.getVersion(), getVersion());
        Validators.validateAesKeySize(aesCtrKey.getKeyValue().size());
        AesCtrParams params = aesCtrKey.getParams();
        if (params.getIvSize() < 12 || params.getIvSize() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
