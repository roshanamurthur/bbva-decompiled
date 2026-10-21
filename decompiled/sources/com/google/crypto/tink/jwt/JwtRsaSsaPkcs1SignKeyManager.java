package com.google.crypto.tink.jwt;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1PrivateKey;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce;
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
public final class JwtRsaSsaPkcs1SignKeyManager extends PrivateKeyTypeManager<JwtRsaSsaPkcs1PrivateKey, JwtRsaSsaPkcs1PublicKey> {

    public class a extends KeyTypeManager.KeyFactory<JwtRsaSsaPkcs1KeyFormat, JwtRsaSsaPkcs1PrivateKey> {
        public a() {
            super(JwtRsaSsaPkcs1KeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            JwtRsaSsaPkcs1KeyFormat jwtRsaSsaPkcs1KeyFormat = (JwtRsaSsaPkcs1KeyFormat) messageLite;
            JwtRsaSsaPkcs1Algorithm algorithm = jwtRsaSsaPkcs1KeyFormat.getAlgorithm();
            KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance("RSA");
            engineFactory.initialize(new RSAKeyGenParameterSpec(jwtRsaSsaPkcs1KeyFormat.getModulusSizeInBits(), new BigInteger(1, jwtRsaSsaPkcs1KeyFormat.getPublicExponent().toByteArray())));
            KeyPair keyPairGenerateKeyPair = engineFactory.generateKeyPair();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
            JwtRsaSsaPkcs1PublicKey.Builder builderNewBuilder = JwtRsaSsaPkcs1PublicKey.newBuilder();
            JwtRsaSsaPkcs1SignKeyManager jwtRsaSsaPkcs1SignKeyManager = JwtRsaSsaPkcs1SignKeyManager.this;
            return JwtRsaSsaPkcs1PrivateKey.newBuilder().setVersion(jwtRsaSsaPkcs1SignKeyManager.getVersion()).setPublicKey(builderNewBuilder.setVersion(jwtRsaSsaPkcs1SignKeyManager.getVersion()).setAlgorithm(algorithm).setE(ByteString.copyFrom(rSAPublicKey.getPublicExponent().toByteArray())).setN(ByteString.copyFrom(rSAPublicKey.getModulus().toByteArray())).build()).setD(ByteString.copyFrom(rSAPrivateCrtKey.getPrivateExponent().toByteArray())).setP(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeP().toByteArray())).setQ(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeQ().toByteArray())).setDp(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentP().toByteArray())).setDq(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray())).setCrt(ByteString.copyFrom(rSAPrivateCrtKey.getCrtCoefficient().toByteArray())).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite deriveKey(MessageLite messageLite, InputStream inputStream) throws GeneralSecurityException {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<JwtRsaSsaPkcs1KeyFormat>> keyFormats() {
            HashMap map = new HashMap();
            JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS256;
            BigInteger bigInteger = RSAKeyGenParameterSpec.F4;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.RAW;
            map.put("JWT_RS256_2048_F4_RAW", JwtRsaSsaPkcs1SignKeyManager.a(jwtRsaSsaPkcs1Algorithm, 2048, bigInteger, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.TINK;
            map.put("JWT_RS256_2048_F4", JwtRsaSsaPkcs1SignKeyManager.a(jwtRsaSsaPkcs1Algorithm, 2048, bigInteger, outputPrefixType2));
            map.put("JWT_RS256_3072_F4_RAW", JwtRsaSsaPkcs1SignKeyManager.a(jwtRsaSsaPkcs1Algorithm, 3072, bigInteger, outputPrefixType));
            map.put("JWT_RS256_3072_F4", JwtRsaSsaPkcs1SignKeyManager.a(jwtRsaSsaPkcs1Algorithm, 3072, bigInteger, outputPrefixType2));
            JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm2 = JwtRsaSsaPkcs1Algorithm.RS384;
            map.put("JWT_RS384_3072_F4_RAW", JwtRsaSsaPkcs1SignKeyManager.a(jwtRsaSsaPkcs1Algorithm2, 3072, bigInteger, outputPrefixType));
            map.put("JWT_RS384_3072_F4", JwtRsaSsaPkcs1SignKeyManager.a(jwtRsaSsaPkcs1Algorithm2, 3072, bigInteger, outputPrefixType2));
            JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm3 = JwtRsaSsaPkcs1Algorithm.RS512;
            map.put("JWT_RS512_4096_F4_RAW", JwtRsaSsaPkcs1SignKeyManager.a(jwtRsaSsaPkcs1Algorithm3, 4096, bigInteger, outputPrefixType));
            map.put("JWT_RS512_4096_F4", JwtRsaSsaPkcs1SignKeyManager.a(jwtRsaSsaPkcs1Algorithm3, 4096, bigInteger, outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return JwtRsaSsaPkcs1KeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            JwtRsaSsaPkcs1KeyFormat jwtRsaSsaPkcs1KeyFormat = (JwtRsaSsaPkcs1KeyFormat) messageLite;
            Validators.validateRsaModulusSize(jwtRsaSsaPkcs1KeyFormat.getModulusSizeInBits());
            Validators.validateRsaPublicExponent(new BigInteger(1, jwtRsaSsaPkcs1KeyFormat.getPublicExponent().toByteArray()));
        }
    }

    public static class b extends PrimitiveFactory<JwtPublicKeySignInternal, JwtRsaSsaPkcs1PrivateKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final JwtPublicKeySignInternal getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey = (JwtRsaSsaPkcs1PrivateKey) messageLite;
            EngineFactory<EngineWrapper.TKeyFactory, KeyFactory> engineFactory = EngineFactory.KEY_FACTORY;
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) engineFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getPublicKey().getN().toByteArray()), new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getPublicKey().getE().toByteArray()), new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getD().toByteArray()), new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getP().toByteArray()), new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getQ().toByteArray()), new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getDp().toByteArray()), new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getDq().toByteArray()), new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getCrt().toByteArray())));
            SelfKeyTestValidators.validateRsaSsaPkcs1(rSAPrivateCrtKey, (RSAPublicKey) engineFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getPublicKey().getN().toByteArray()), new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getPublicKey().getE().toByteArray()))), g.a(jwtRsaSsaPkcs1PrivateKey.getPublicKey().getAlgorithm()));
            JwtRsaSsaPkcs1Algorithm algorithm = jwtRsaSsaPkcs1PrivateKey.getPublicKey().getAlgorithm();
            RsaSsaPkcs1SignJce rsaSsaPkcs1SignJce = new RsaSsaPkcs1SignJce(rSAPrivateCrtKey, g.a(algorithm));
            return new e(jwtRsaSsaPkcs1PrivateKey.getPublicKey().hasCustomKid() ? Optional.of(jwtRsaSsaPkcs1PrivateKey.getPublicKey().getCustomKid().getValue()) : Optional.empty(), algorithm.name(), rsaSsaPkcs1SignJce);
        }
    }

    public JwtRsaSsaPkcs1SignKeyManager() {
        super(JwtRsaSsaPkcs1PrivateKey.class, JwtRsaSsaPkcs1PublicKey.class, new b(JwtPublicKeySignInternal.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm, int i10, BigInteger bigInteger, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat(JwtRsaSsaPkcs1KeyFormat.newBuilder().setAlgorithm(jwtRsaSsaPkcs1Algorithm).setModulusSizeInBits(i10).setPublicExponent(ByteString.copyFrom(bigInteger.toByteArray())).build(), outputPrefixType);
    }

    public static void registerPair(boolean z10) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new JwtRsaSsaPkcs1SignKeyManager(), new g(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PrivateKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<JwtRsaSsaPkcs1KeyFormat, JwtRsaSsaPkcs1PrivateKey> keyFactory() {
        return new a();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public JwtRsaSsaPkcs1PublicKey getPublicKey(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) {
        return jwtRsaSsaPkcs1PrivateKey.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public JwtRsaSsaPkcs1PrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return JwtRsaSsaPkcs1PrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(JwtRsaSsaPkcs1PrivateKey jwtRsaSsaPkcs1PrivateKey) throws GeneralSecurityException {
        Validators.validateVersion(jwtRsaSsaPkcs1PrivateKey.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getPublicKey().getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, jwtRsaSsaPkcs1PrivateKey.getPublicKey().getE().toByteArray()));
    }
}
