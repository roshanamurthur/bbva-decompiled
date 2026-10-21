package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey;
import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.signature.internal.SigUtil;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce;
import com.google.crypto.tink.subtle.SelfKeyTestValidators;
import com.google.crypto.tink.subtle.Validators;
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
import kf.d;

/* JADX INFO: loaded from: classes10.dex */
public final class RsaSsaPkcs1SignKeyManager extends PrivateKeyTypeManager<RsaSsaPkcs1PrivateKey, RsaSsaPkcs1PublicKey> {

    public class a extends PrimitiveFactory<PublicKeySign, RsaSsaPkcs1PrivateKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final PublicKeySign getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey = (RsaSsaPkcs1PrivateKey) messageLite;
            KeyFactory engineFactory = EngineFactory.KEY_FACTORY.getInstance("RSA");
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) engineFactory.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getN().toByteArray()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getE().toByteArray()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getD().toByteArray()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getP().toByteArray()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getQ().toByteArray()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getDp().toByteArray()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getDq().toByteArray()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getCrt().toByteArray())));
            RsaSsaPkcs1Params params = rsaSsaPkcs1PrivateKey.getPublicKey().getParams();
            SelfKeyTestValidators.validateRsaSsaPkcs1(rSAPrivateCrtKey, (RSAPublicKey) engineFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getN().toByteArray()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getE().toByteArray()))), SigUtil.toHashType(params.getHashType()));
            return new RsaSsaPkcs1SignJce(rSAPrivateCrtKey, SigUtil.toHashType(params.getHashType()));
        }
    }

    public class b extends KeyTypeManager.KeyFactory<RsaSsaPkcs1KeyFormat, RsaSsaPkcs1PrivateKey> {
        public b() {
            super(RsaSsaPkcs1KeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat = (RsaSsaPkcs1KeyFormat) messageLite;
            RsaSsaPkcs1Params params = rsaSsaPkcs1KeyFormat.getParams();
            KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance("RSA");
            engineFactory.initialize(new RSAKeyGenParameterSpec(rsaSsaPkcs1KeyFormat.getModulusSizeInBits(), new BigInteger(1, rsaSsaPkcs1KeyFormat.getPublicExponent().toByteArray())));
            KeyPair keyPairGenerateKeyPair = engineFactory.generateKeyPair();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
            RsaSsaPkcs1PublicKey.Builder builderNewBuilder = RsaSsaPkcs1PublicKey.newBuilder();
            RsaSsaPkcs1SignKeyManager rsaSsaPkcs1SignKeyManager = RsaSsaPkcs1SignKeyManager.this;
            return RsaSsaPkcs1PrivateKey.newBuilder().setVersion(rsaSsaPkcs1SignKeyManager.getVersion()).setPublicKey(builderNewBuilder.setVersion(rsaSsaPkcs1SignKeyManager.getVersion()).setParams(params).setE(ByteString.copyFrom(rSAPublicKey.getPublicExponent().toByteArray())).setN(ByteString.copyFrom(rSAPublicKey.getModulus().toByteArray())).build()).setD(ByteString.copyFrom(rSAPrivateCrtKey.getPrivateExponent().toByteArray())).setP(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeP().toByteArray())).setQ(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeQ().toByteArray())).setDp(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentP().toByteArray())).setDq(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray())).setCrt(ByteString.copyFrom(rSAPrivateCrtKey.getCrtCoefficient().toByteArray())).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<RsaSsaPkcs1KeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            HashType hashType = HashType.SHA256;
            BigInteger bigInteger = RSAKeyGenParameterSpec.F4;
            RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormatA = RsaSsaPkcs1SignKeyManager.a(hashType, 3072, bigInteger);
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            map.put("RSA_SSA_PKCS1_3072_SHA256_F4", new KeyTypeManager.KeyFactory.KeyFormat(rsaSsaPkcs1KeyFormatA, outputPrefixType));
            RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormatA2 = RsaSsaPkcs1SignKeyManager.a(hashType, 3072, bigInteger);
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", new KeyTypeManager.KeyFactory.KeyFormat(rsaSsaPkcs1KeyFormatA2, outputPrefixType2));
            map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPkcs1SignKeyManager.a(hashType, 3072, bigInteger), outputPrefixType2));
            HashType hashType2 = HashType.SHA512;
            map.put("RSA_SSA_PKCS1_4096_SHA512_F4", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPkcs1SignKeyManager.a(hashType2, 4096, bigInteger), outputPrefixType));
            map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", new KeyTypeManager.KeyFactory.KeyFormat(RsaSsaPkcs1SignKeyManager.a(hashType2, 4096, bigInteger), outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return RsaSsaPkcs1KeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat = (RsaSsaPkcs1KeyFormat) messageLite;
            SigUtil.validateRsaSsaPkcs1Params(rsaSsaPkcs1KeyFormat.getParams());
            Validators.validateRsaModulusSize(rsaSsaPkcs1KeyFormat.getModulusSizeInBits());
            Validators.validateRsaPublicExponent(new BigInteger(1, rsaSsaPkcs1KeyFormat.getPublicExponent().toByteArray()));
        }
    }

    public RsaSsaPkcs1SignKeyManager() {
        super(RsaSsaPkcs1PrivateKey.class, RsaSsaPkcs1PublicKey.class, new a(PublicKeySign.class));
    }

    public static RsaSsaPkcs1KeyFormat a(HashType hashType, int i10, BigInteger bigInteger) {
        return RsaSsaPkcs1KeyFormat.newBuilder().setParams(RsaSsaPkcs1Params.newBuilder().setHashType(hashType).build()).setModulusSizeInBits(i10).setPublicExponent(ByteString.copyFrom(bigInteger.toByteArray())).build();
    }

    public static KeyTemplate b(HashType hashType, int i10, BigInteger bigInteger, KeyTemplate.OutputPrefixType outputPrefixType) {
        return KeyTemplate.create(new RsaSsaPkcs1SignKeyManager().getKeyType(), a(hashType, i10, bigInteger).toByteArray(), outputPrefixType);
    }

    public static final KeyTemplate rawRsa3072SsaPkcs1Sha256F4Template() {
        return b(HashType.SHA256, 3072, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate rawRsa4096SsaPkcs1Sha512F4Template() {
        return b(HashType.SHA512, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW);
    }

    public static void registerPair(boolean z10) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new RsaSsaPkcs1SignKeyManager(), new d(), z10);
    }

    public static final KeyTemplate rsa3072SsaPkcs1Sha256F4Template() {
        return b(HashType.SHA256, 3072, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rsa4096SsaPkcs1Sha512F4Template() {
        return b(HashType.SHA512, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<RsaSsaPkcs1KeyFormat, RsaSsaPkcs1PrivateKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public RsaSsaPkcs1PublicKey getPublicKey(RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey) throws GeneralSecurityException {
        return rsaSsaPkcs1PrivateKey.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public RsaSsaPkcs1PrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return RsaSsaPkcs1PrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey) throws GeneralSecurityException {
        Validators.validateVersion(rsaSsaPkcs1PrivateKey.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getE().toByteArray()));
        SigUtil.validateRsaSsaPkcs1Params(rsaSsaPkcs1PrivateKey.getPublicKey().getParams());
    }
}
