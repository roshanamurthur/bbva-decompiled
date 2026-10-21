package com.google.crypto.tink.daead;

import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.AesSivKey;
import com.google.crypto.tink.proto.AesSivKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesSiv;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class AesSivKeyManager extends KeyTypeManager<AesSivKey> {

    public class a extends PrimitiveFactory<DeterministicAead, AesSivKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final DeterministicAead getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            return new AesSiv(((AesSivKey) messageLite).getKeyValue().toByteArray());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<AesSivKeyFormat, AesSivKey> {
        public b() {
            super(AesSivKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            return AesSivKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(((AesSivKeyFormat) messageLite).getKeySize()))).setVersion(AesSivKeyManager.this.getVersion()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            int version = ((AesSivKeyFormat) messageLite).getVersion();
            AesSivKeyManager aesSivKeyManager = AesSivKeyManager.this;
            Validators.validateVersion(version, aesSivKeyManager.getVersion());
            byte[] bArr = new byte[64];
            try {
                KeyTypeManager.KeyFactory.readFully(inputStream, bArr);
                return AesSivKey.newBuilder().setKeyValue(ByteString.copyFrom(bArr)).setVersion(aesSivKeyManager.getVersion()).build();
            } catch (IOException e5) {
                throw new GeneralSecurityException("Reading pseudorandomness failed", e5);
            }
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesSivKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            map.put("AES256_SIV", new KeyTypeManager.KeyFactory.KeyFormat(AesSivKeyFormat.newBuilder().setKeySize(64).build(), KeyTemplate.OutputPrefixType.TINK));
            map.put("AES256_SIV_RAW", new KeyTypeManager.KeyFactory.KeyFormat(AesSivKeyFormat.newBuilder().setKeySize(64).build(), KeyTemplate.OutputPrefixType.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return AesSivKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            AesSivKeyFormat aesSivKeyFormat = (AesSivKeyFormat) messageLite;
            if (aesSivKeyFormat.getKeySize() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + aesSivKeyFormat.getKeySize() + ". Valid keys must have 64 bytes.");
        }
    }

    public AesSivKeyManager() {
        super(AesSivKey.class, new a(DeterministicAead.class));
    }

    public static final KeyTemplate aes256SivTemplate() {
        return KeyTemplate.create(new AesSivKeyManager().getKeyType(), AesSivKeyFormat.newBuilder().setKeySize(64).build().toByteArray(), KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawAes256SivTemplate() {
        return KeyTemplate.create(new AesSivKeyManager().getKeyType(), AesSivKeyFormat.newBuilder().setKeySize(64).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z10) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesSivKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesSivKeyFormat, AesSivKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public AesSivKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesSivKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(AesSivKey aesSivKey) throws GeneralSecurityException {
        Validators.validateVersion(aesSivKey.getVersion(), getVersion());
        if (aesSivKey.getKeyValue().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + aesSivKey.getKeyValue().size() + ". Valid keys must have 64 bytes.");
    }
}
