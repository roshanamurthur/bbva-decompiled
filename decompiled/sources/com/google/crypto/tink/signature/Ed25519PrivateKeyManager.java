package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.Ed25519KeyFormat;
import com.google.crypto.tink.proto.Ed25519PrivateKey;
import com.google.crypto.tink.proto.Ed25519PublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Ed25519Sign;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class Ed25519PrivateKeyManager extends PrivateKeyTypeManager<Ed25519PrivateKey, Ed25519PublicKey> {

    public class a extends PrimitiveFactory<PublicKeySign, Ed25519PrivateKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final PublicKeySign getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            return new Ed25519Sign(((Ed25519PrivateKey) messageLite).getKeyValue().toByteArray());
        }
    }

    public class b extends KeyTypeManager.KeyFactory<Ed25519KeyFormat, Ed25519PrivateKey> {
        public b() {
            super(Ed25519KeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            Ed25519Sign.KeyPair keyPairNewKeyPair = Ed25519Sign.KeyPair.newKeyPair();
            Ed25519PublicKey.Builder builderNewBuilder = Ed25519PublicKey.newBuilder();
            Ed25519PrivateKeyManager ed25519PrivateKeyManager = Ed25519PrivateKeyManager.this;
            return Ed25519PrivateKey.newBuilder().setVersion(ed25519PrivateKeyManager.getVersion()).setKeyValue(ByteString.copyFrom(keyPairNewKeyPair.getPrivateKey())).setPublicKey(builderNewBuilder.setVersion(ed25519PrivateKeyManager.getVersion()).setKeyValue(ByteString.copyFrom(keyPairNewKeyPair.getPublicKey())).build()).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            int version = ((Ed25519KeyFormat) messageLite).getVersion();
            Ed25519PrivateKeyManager ed25519PrivateKeyManager = Ed25519PrivateKeyManager.this;
            Validators.validateVersion(version, ed25519PrivateKeyManager.getVersion());
            byte[] bArr = new byte[32];
            try {
                KeyTypeManager.KeyFactory.readFully(inputStream, bArr);
                Ed25519Sign.KeyPair keyPairNewKeyPairFromSeed = Ed25519Sign.KeyPair.newKeyPairFromSeed(bArr);
                return Ed25519PrivateKey.newBuilder().setVersion(ed25519PrivateKeyManager.getVersion()).setKeyValue(ByteString.copyFrom(keyPairNewKeyPairFromSeed.getPrivateKey())).setPublicKey(Ed25519PublicKey.newBuilder().setVersion(ed25519PrivateKeyManager.getVersion()).setKeyValue(ByteString.copyFrom(keyPairNewKeyPairFromSeed.getPublicKey())).build()).build();
            } catch (IOException e5) {
                throw new GeneralSecurityException("Reading pseudorandomness failed", e5);
            }
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<Ed25519KeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            map.put("ED25519", new KeyTypeManager.KeyFactory.KeyFormat(Ed25519KeyFormat.getDefaultInstance(), KeyTemplate.OutputPrefixType.TINK));
            Ed25519KeyFormat defaultInstance = Ed25519KeyFormat.getDefaultInstance();
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
            map.put("ED25519_RAW", new KeyTypeManager.KeyFactory.KeyFormat(defaultInstance, outputPrefixType));
            map.put("ED25519WithRawOutput", new KeyTypeManager.KeyFactory.KeyFormat(Ed25519KeyFormat.getDefaultInstance(), outputPrefixType));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return Ed25519KeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final /* bridge */ /* synthetic */ void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
        }
    }

    public Ed25519PrivateKeyManager() {
        super(Ed25519PrivateKey.class, Ed25519PublicKey.class, new a(PublicKeySign.class));
    }

    public static final KeyTemplate ed25519Template() {
        return KeyTemplate.create(new Ed25519PrivateKeyManager().getKeyType(), new byte[0], KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawEd25519Template() {
        return KeyTemplate.create(new Ed25519PrivateKeyManager().getKeyType(), new byte[0], KeyTemplate.OutputPrefixType.RAW);
    }

    public static void registerPair(boolean z10) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new Ed25519PrivateKeyManager(), new kf.b(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<Ed25519KeyFormat, Ed25519PrivateKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public Ed25519PublicKey getPublicKey(Ed25519PrivateKey ed25519PrivateKey) throws GeneralSecurityException {
        return ed25519PrivateKey.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public Ed25519PrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return Ed25519PrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(Ed25519PrivateKey ed25519PrivateKey) throws GeneralSecurityException {
        Validators.validateVersion(ed25519PrivateKey.getVersion(), getVersion());
        new kf.b();
        Ed25519PublicKey publicKey = ed25519PrivateKey.getPublicKey();
        Validators.validateVersion(publicKey.getVersion(), 0);
        if (publicKey.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
        if (ed25519PrivateKey.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
        }
    }
}
