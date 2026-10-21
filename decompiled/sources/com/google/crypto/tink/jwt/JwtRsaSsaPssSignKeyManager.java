package com.google.crypto.tink.jwt;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPssKeyFormat;
import com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey;
import com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.RsaSsaPssSignJce;
import com.google.crypto.tink.subtle.SelfKeyTestValidators;
import com.google.crypto.tink.subtle.Validators;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: loaded from: classes10.dex */
public final class JwtRsaSsaPssSignKeyManager extends PrivateKeyTypeManager<JwtRsaSsaPssPrivateKey, JwtRsaSsaPssPublicKey> {

    public class a extends KeyTypeManager.KeyFactory<JwtRsaSsaPssKeyFormat, JwtRsaSsaPssPrivateKey> {
        public a() {
            super(JwtRsaSsaPssKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat = (JwtRsaSsaPssKeyFormat) messageLite;
            JwtRsaSsaPssAlgorithm algorithm = jwtRsaSsaPssKeyFormat.getAlgorithm();
            KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance("RSA");
            engineFactory.initialize(new RSAKeyGenParameterSpec(jwtRsaSsaPssKeyFormat.getModulusSizeInBits(), new BigInteger(1, jwtRsaSsaPssKeyFormat.getPublicExponent().toByteArray())));
            KeyPair keyPairGenerateKeyPair = engineFactory.generateKeyPair();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
            JwtRsaSsaPssPublicKey.Builder builderNewBuilder = JwtRsaSsaPssPublicKey.newBuilder();
            JwtRsaSsaPssSignKeyManager jwtRsaSsaPssSignKeyManager = JwtRsaSsaPssSignKeyManager.this;
            return JwtRsaSsaPssPrivateKey.newBuilder().setVersion(jwtRsaSsaPssSignKeyManager.getVersion()).setPublicKey(builderNewBuilder.setVersion(jwtRsaSsaPssSignKeyManager.getVersion()).setAlgorithm(algorithm).setE(ByteString.copyFrom(rSAPublicKey.getPublicExponent().toByteArray())).setN(ByteString.copyFrom(rSAPublicKey.getModulus().toByteArray())).build()).setD(ByteString.copyFrom(rSAPrivateCrtKey.getPrivateExponent().toByteArray())).setP(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeP().toByteArray())).setQ(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeQ().toByteArray())).setDp(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentP().toByteArray())).setDq(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray())).setCrt(ByteString.copyFrom(rSAPrivateCrtKey.getCrtCoefficient().toByteArray())).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<JwtRsaSsaPssKeyFormat>> keyFormats() {
            HashMap map = new HashMap();
            JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm = JwtRsaSsaPssAlgorithm.PS256;
            BigInteger bigInteger = RSAKeyGenParameterSpec.F4;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
            map.put("JWT_PS256_2048_F4_RAW", JwtRsaSsaPssSignKeyManager.a(jwtRsaSsaPssAlgorithm, 2048, bigInteger, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.TINK;
            map.put("JWT_PS256_2048_F4", JwtRsaSsaPssSignKeyManager.a(jwtRsaSsaPssAlgorithm, 2048, bigInteger, outputPrefixType2));
            map.put("JWT_PS256_3072_F4_RAW", JwtRsaSsaPssSignKeyManager.a(jwtRsaSsaPssAlgorithm, 3072, bigInteger, outputPrefixType));
            map.put("JWT_PS256_3072_F4", JwtRsaSsaPssSignKeyManager.a(jwtRsaSsaPssAlgorithm, 3072, bigInteger, outputPrefixType2));
            JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm2 = JwtRsaSsaPssAlgorithm.PS384;
            map.put("JWT_PS384_3072_F4_RAW", JwtRsaSsaPssSignKeyManager.a(jwtRsaSsaPssAlgorithm2, 3072, bigInteger, outputPrefixType));
            map.put("JWT_PS384_3072_F4", JwtRsaSsaPssSignKeyManager.a(jwtRsaSsaPssAlgorithm2, 3072, bigInteger, outputPrefixType2));
            JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm3 = JwtRsaSsaPssAlgorithm.PS512;
            map.put("JWT_PS512_4096_F4_RAW", JwtRsaSsaPssSignKeyManager.a(jwtRsaSsaPssAlgorithm3, 4096, bigInteger, outputPrefixType));
            map.put("JWT_PS512_4096_F4", JwtRsaSsaPssSignKeyManager.a(jwtRsaSsaPssAlgorithm3, 4096, bigInteger, outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return JwtRsaSsaPssKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            JwtRsaSsaPssKeyFormat jwtRsaSsaPssKeyFormat = (JwtRsaSsaPssKeyFormat) messageLite;
            Validators.validateRsaModulusSize(jwtRsaSsaPssKeyFormat.getModulusSizeInBits());
            Validators.validateRsaPublicExponent(new BigInteger(1, jwtRsaSsaPssKeyFormat.getPublicExponent().toByteArray()));
        }
    }

    public static class b extends PrimitiveFactory<JwtPublicKeySignInternal, JwtRsaSsaPssPrivateKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final JwtPublicKeySignInternal getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey = (JwtRsaSsaPssPrivateKey) messageLite;
            EngineFactory<EngineWrapper.TKeyFactory, KeyFactory> engineFactory = EngineFactory.KEY_FACTORY;
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) engineFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, jwtRsaSsaPssPrivateKey.getPublicKey().getN().toByteArray()), new BigInteger(1, jwtRsaSsaPssPrivateKey.getPublicKey().getE().toByteArray()), new BigInteger(1, jwtRsaSsaPssPrivateKey.getD().toByteArray()), new BigInteger(1, jwtRsaSsaPssPrivateKey.getP().toByteArray()), new BigInteger(1, jwtRsaSsaPssPrivateKey.getQ().toByteArray()), new BigInteger(1, jwtRsaSsaPssPrivateKey.getDp().toByteArray()), new BigInteger(1, jwtRsaSsaPssPrivateKey.getDq().toByteArray()), new BigInteger(1, jwtRsaSsaPssPrivateKey.getCrt().toByteArray())));
            RSAPublicKey rSAPublicKey = (RSAPublicKey) engineFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, jwtRsaSsaPssPrivateKey.getPublicKey().getN().toByteArray()), new BigInteger(1, jwtRsaSsaPssPrivateKey.getPublicKey().getE().toByteArray())));
            JwtRsaSsaPssAlgorithm algorithm = jwtRsaSsaPssPrivateKey.getPublicKey().getAlgorithm();
            Enums.HashType hashTypeA = j.a(algorithm);
            SelfKeyTestValidators.validateRsaSsaPss(rSAPrivateCrtKey, rSAPublicKey, hashTypeA, hashTypeA, j.b(algorithm));
            JwtRsaSsaPssAlgorithm algorithm2 = jwtRsaSsaPssPrivateKey.getPublicKey().getAlgorithm();
            Enums.HashType hashTypeA2 = j.a(algorithm2);
            RsaSsaPssSignJce rsaSsaPssSignJce = new RsaSsaPssSignJce(rSAPrivateCrtKey, hashTypeA2, hashTypeA2, j.b(algorithm2));
            return new h(jwtRsaSsaPssPrivateKey.getPublicKey().hasCustomKid() ? Optional.of(jwtRsaSsaPssPrivateKey.getPublicKey().getCustomKid().getValue()) : Optional.empty(), algorithm2.name(), rsaSsaPssSignJce);
        }
    }

    public JwtRsaSsaPssSignKeyManager() {
        super(JwtRsaSsaPssPrivateKey.class, JwtRsaSsaPssPublicKey.class, new b(JwtPublicKeySignInternal.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm, int i10, BigInteger bigInteger, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat(JwtRsaSsaPssKeyFormat.newBuilder().setAlgorithm(jwtRsaSsaPssAlgorithm).setModulusSizeInBits(i10).setPublicExponent(ByteString.copyFrom(bigInteger.toByteArray())).build(), outputPrefixType);
    }

    public static void registerPair(boolean z10) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new JwtRsaSsaPssSignKeyManager(), new j(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPrivateKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<JwtRsaSsaPssKeyFormat, JwtRsaSsaPssPrivateKey> keyFactory() {
        return new a();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public JwtRsaSsaPssPublicKey getPublicKey(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) {
        return jwtRsaSsaPssPrivateKey.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public JwtRsaSsaPssPrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return JwtRsaSsaPssPrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey) throws GeneralSecurityException {
        Validators.validateVersion(jwtRsaSsaPssPrivateKey.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, jwtRsaSsaPssPrivateKey.getPublicKey().getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, jwtRsaSsaPssPrivateKey.getPublicKey().getE().toByteArray()));
    }
}
