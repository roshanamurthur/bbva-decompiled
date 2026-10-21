package com.google.crypto.tink.jwt;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.JwtEcdsaAlgorithm;
import com.google.crypto.tink.proto.JwtEcdsaKeyFormat;
import com.google.crypto.tink.proto.JwtEcdsaPrivateKey;
import com.google.crypto.tink.proto.JwtEcdsaPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EcdsaSignJce;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.SelfKeyTestValidators;
import com.google.crypto.tink.subtle.Validators;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: loaded from: classes10.dex */
public final class JwtEcdsaSignKeyManager extends PrivateKeyTypeManager<JwtEcdsaPrivateKey, JwtEcdsaPublicKey> {

    public class a extends KeyTypeManager.KeyFactory<JwtEcdsaKeyFormat, JwtEcdsaPrivateKey> {
        public a() {
            super(JwtEcdsaKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            JwtEcdsaKeyFormat jwtEcdsaKeyFormat = (JwtEcdsaKeyFormat) messageLite;
            JwtEcdsaAlgorithm algorithm = jwtEcdsaKeyFormat.getAlgorithm();
            KeyPair keyPairGenerateKeyPair = EllipticCurves.generateKeyPair(com.google.crypto.tink.jwt.b.a(jwtEcdsaKeyFormat.getAlgorithm()));
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
            ECPoint w6 = eCPublicKey.getW();
            JwtEcdsaPublicKey.Builder builderNewBuilder = JwtEcdsaPublicKey.newBuilder();
            JwtEcdsaSignKeyManager jwtEcdsaSignKeyManager = JwtEcdsaSignKeyManager.this;
            return JwtEcdsaPrivateKey.newBuilder().setVersion(jwtEcdsaSignKeyManager.getVersion()).setPublicKey(builderNewBuilder.setVersion(jwtEcdsaSignKeyManager.getVersion()).setAlgorithm(algorithm).setX(ByteString.copyFrom(w6.getAffineX().toByteArray())).setY(ByteString.copyFrom(w6.getAffineY().toByteArray())).build()).setKeyValue(ByteString.copyFrom(eCPrivateKey.getS().toByteArray())).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<JwtEcdsaKeyFormat>> keyFormats() {
            HashMap map = new HashMap();
            JwtEcdsaAlgorithm jwtEcdsaAlgorithm = JwtEcdsaAlgorithm.ES256;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
            map.put("JWT_ES256_RAW", JwtEcdsaSignKeyManager.a(jwtEcdsaAlgorithm, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.TINK;
            map.put("JWT_ES256", JwtEcdsaSignKeyManager.a(jwtEcdsaAlgorithm, outputPrefixType2));
            JwtEcdsaAlgorithm jwtEcdsaAlgorithm2 = JwtEcdsaAlgorithm.ES384;
            map.put("JWT_ES384_RAW", JwtEcdsaSignKeyManager.a(jwtEcdsaAlgorithm2, outputPrefixType));
            map.put("JWT_ES384", JwtEcdsaSignKeyManager.a(jwtEcdsaAlgorithm2, outputPrefixType2));
            JwtEcdsaAlgorithm jwtEcdsaAlgorithm3 = JwtEcdsaAlgorithm.ES512;
            map.put("JWT_ES512_RAW", JwtEcdsaSignKeyManager.a(jwtEcdsaAlgorithm3, outputPrefixType));
            map.put("JWT_ES512", JwtEcdsaSignKeyManager.a(jwtEcdsaAlgorithm3, outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return JwtEcdsaKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            com.google.crypto.tink.jwt.b.b(((JwtEcdsaKeyFormat) messageLite).getAlgorithm());
        }
    }

    public static class b extends PrimitiveFactory<JwtPublicKeySignInternal, JwtEcdsaPrivateKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final JwtPublicKeySignInternal getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            JwtEcdsaPrivateKey jwtEcdsaPrivateKey = (JwtEcdsaPrivateKey) messageLite;
            ECPrivateKey ecPrivateKey = EllipticCurves.getEcPrivateKey(com.google.crypto.tink.jwt.b.a(jwtEcdsaPrivateKey.getPublicKey().getAlgorithm()), jwtEcdsaPrivateKey.getKeyValue().toByteArray());
            Enums.HashType hashTypeB = com.google.crypto.tink.jwt.b.b(jwtEcdsaPrivateKey.getPublicKey().getAlgorithm());
            ECPublicKey ecPublicKey = EllipticCurves.getEcPublicKey(com.google.crypto.tink.jwt.b.a(jwtEcdsaPrivateKey.getPublicKey().getAlgorithm()), jwtEcdsaPrivateKey.getPublicKey().getX().toByteArray(), jwtEcdsaPrivateKey.getPublicKey().getY().toByteArray());
            EllipticCurves.EcdsaEncoding ecdsaEncoding = EllipticCurves.EcdsaEncoding.IEEE_P1363;
            SelfKeyTestValidators.validateEcdsa(ecPrivateKey, ecPublicKey, hashTypeB, ecdsaEncoding);
            JwtEcdsaAlgorithm algorithm = jwtEcdsaPrivateKey.getPublicKey().getAlgorithm();
            EcdsaSignJce ecdsaSignJce = new EcdsaSignJce(ecPrivateKey, com.google.crypto.tink.jwt.b.b(algorithm), ecdsaEncoding);
            return new com.google.crypto.tink.jwt.a(jwtEcdsaPrivateKey.getPublicKey().hasCustomKid() ? Optional.of(jwtEcdsaPrivateKey.getPublicKey().getCustomKid().getValue()) : Optional.empty(), algorithm.name(), ecdsaSignJce);
        }
    }

    public JwtEcdsaSignKeyManager() {
        super(JwtEcdsaPrivateKey.class, JwtEcdsaPublicKey.class, new b(JwtPublicKeySignInternal.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(JwtEcdsaAlgorithm jwtEcdsaAlgorithm, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat(JwtEcdsaKeyFormat.newBuilder().setAlgorithm(jwtEcdsaAlgorithm).build(), outputPrefixType);
    }

    public static void registerPair(boolean z10) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new JwtEcdsaSignKeyManager(), new com.google.crypto.tink.jwt.b(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtEcdsaPrivateKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<JwtEcdsaKeyFormat, JwtEcdsaPrivateKey> keyFactory() {
        return new a();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public JwtEcdsaPublicKey getPublicKey(JwtEcdsaPrivateKey jwtEcdsaPrivateKey) {
        return jwtEcdsaPrivateKey.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public JwtEcdsaPrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return JwtEcdsaPrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(JwtEcdsaPrivateKey jwtEcdsaPrivateKey) throws GeneralSecurityException {
        Validators.validateVersion(jwtEcdsaPrivateKey.getVersion(), getVersion());
        com.google.crypto.tink.jwt.b.b(jwtEcdsaPrivateKey.getPublicKey().getAlgorithm());
    }
}
