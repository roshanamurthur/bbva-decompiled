package com.google.crypto.tink.prf;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.AesCmacPrfKey;
import com.google.crypto.tink.proto.AesCmacPrfKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.PrfAesCmac;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class AesCmacPrfKeyManager extends KeyTypeManager<AesCmacPrfKey> {

    public class a extends PrimitiveFactory<Prf, AesCmacPrfKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final Prf getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            return new PrfAesCmac(((AesCmacPrfKey) messageLite).getKeyValue().toByteArray());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<AesCmacPrfKeyFormat, AesCmacPrfKey> {
        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            return AesCmacPrfKey.newBuilder().setVersion(0).setKeyValue(ByteString.copyFrom(Random.randBytes(((AesCmacPrfKeyFormat) messageLite).getKeySize()))).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesCmacPrfKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            AesCmacPrfKeyFormat aesCmacPrfKeyFormatBuild = AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
            map.put("AES256_CMAC_PRF", new KeyTypeManager.KeyFactory.KeyFormat(aesCmacPrfKeyFormatBuild, outputPrefixType));
            map.put("AES_CMAC_PRF", new KeyTypeManager.KeyFactory.KeyFormat(AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build(), outputPrefixType));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return AesCmacPrfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            if (((AesCmacPrfKeyFormat) messageLite).getKeySize() != 32) {
                throw new GeneralSecurityException("AesCmacPrfKey size wrong, must be 32 bytes");
            }
        }
    }

    public AesCmacPrfKeyManager() {
        super(AesCmacPrfKey.class, new a(Prf.class));
    }

    public static final KeyTemplate aes256CmacTemplate() {
        return KeyTemplate.create(new AesCmacPrfKeyManager().getKeyType(), AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesCmacPrfKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacPrfKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesCmacPrfKeyFormat, AesCmacPrfKey> keyFactory() {
        return new b(AesCmacPrfKeyFormat.class);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public AesCmacPrfKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesCmacPrfKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(AesCmacPrfKey aesCmacPrfKey) throws GeneralSecurityException {
        Validators.validateVersion(aesCmacPrfKey.getVersion(), getVersion());
        if (aesCmacPrfKey.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("AesCmacPrfKey size wrong, must be 32 bytes");
        }
    }
}
