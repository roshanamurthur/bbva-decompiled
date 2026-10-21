package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.proto.EcdsaKeyFormat;
import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.signature.internal.SigUtil;
import com.google.crypto.tink.subtle.EcdsaSignJce;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.SelfKeyTestValidators;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class EcdsaSignKeyManager extends PrivateKeyTypeManager<com.google.crypto.tink.proto.EcdsaPrivateKey, com.google.crypto.tink.proto.EcdsaPublicKey> {

    public class a extends PrimitiveFactory<PublicKeySign, com.google.crypto.tink.proto.EcdsaPrivateKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final PublicKeySign getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            com.google.crypto.tink.proto.EcdsaPrivateKey ecdsaPrivateKey = (com.google.crypto.tink.proto.EcdsaPrivateKey) messageLite;
            ECPrivateKey ecPrivateKey = EllipticCurves.getEcPrivateKey(SigUtil.toCurveType(ecdsaPrivateKey.getPublicKey().getParams().getCurve()), ecdsaPrivateKey.getKeyValue().toByteArray());
            SelfKeyTestValidators.validateEcdsa(ecPrivateKey, EllipticCurves.getEcPublicKey(SigUtil.toCurveType(ecdsaPrivateKey.getPublicKey().getParams().getCurve()), ecdsaPrivateKey.getPublicKey().getX().toByteArray(), ecdsaPrivateKey.getPublicKey().getY().toByteArray()), SigUtil.toHashType(ecdsaPrivateKey.getPublicKey().getParams().getHashType()), SigUtil.toEcdsaEncoding(ecdsaPrivateKey.getPublicKey().getParams().getEncoding()));
            return new EcdsaSignJce(ecPrivateKey, SigUtil.toHashType(ecdsaPrivateKey.getPublicKey().getParams().getHashType()), SigUtil.toEcdsaEncoding(ecdsaPrivateKey.getPublicKey().getParams().getEncoding()));
        }
    }

    public class b extends KeyTypeManager.KeyFactory<EcdsaKeyFormat, com.google.crypto.tink.proto.EcdsaPrivateKey> {
        public b() {
            super(EcdsaKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            EcdsaParams params = ((EcdsaKeyFormat) messageLite).getParams();
            KeyPair keyPairGenerateKeyPair = EllipticCurves.generateKeyPair(SigUtil.toCurveType(params.getCurve()));
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
            ECPoint w6 = eCPublicKey.getW();
            com.google.crypto.tink.proto.EcdsaPublicKey.Builder builderNewBuilder = com.google.crypto.tink.proto.EcdsaPublicKey.newBuilder();
            EcdsaSignKeyManager ecdsaSignKeyManager = EcdsaSignKeyManager.this;
            return com.google.crypto.tink.proto.EcdsaPrivateKey.newBuilder().setVersion(ecdsaSignKeyManager.getVersion()).setPublicKey(builderNewBuilder.setVersion(ecdsaSignKeyManager.getVersion()).setParams(params).setX(ByteString.copyFrom(w6.getAffineX().toByteArray())).setY(ByteString.copyFrom(w6.getAffineY().toByteArray())).build()).setKeyValue(ByteString.copyFrom(eCPrivateKey.getS().toByteArray())).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<EcdsaKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            HashType hashType = HashType.SHA256;
            EllipticCurveType ellipticCurveType = EllipticCurveType.NIST_P256;
            EcdsaSignatureEncoding ecdsaSignatureEncoding = EcdsaSignatureEncoding.DER;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            map.put("ECDSA_P256", EcdsaSignKeyManager.a(hashType, ellipticCurveType, ecdsaSignatureEncoding, outputPrefixType));
            EcdsaSignatureEncoding ecdsaSignatureEncoding2 = EcdsaSignatureEncoding.IEEE_P1363;
            map.put("ECDSA_P256_IEEE_P1363", EcdsaSignKeyManager.a(hashType, ellipticCurveType, ecdsaSignatureEncoding2, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            map.put("ECDSA_P256_RAW", EcdsaSignKeyManager.a(hashType, ellipticCurveType, ecdsaSignatureEncoding2, outputPrefixType2));
            map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", EcdsaSignKeyManager.a(hashType, ellipticCurveType, ecdsaSignatureEncoding2, outputPrefixType2));
            HashType hashType2 = HashType.SHA512;
            EllipticCurveType ellipticCurveType2 = EllipticCurveType.NIST_P384;
            map.put("ECDSA_P384", EcdsaSignKeyManager.a(hashType2, ellipticCurveType2, ecdsaSignatureEncoding, outputPrefixType));
            map.put("ECDSA_P384_IEEE_P1363", EcdsaSignKeyManager.a(hashType2, ellipticCurveType2, ecdsaSignatureEncoding2, outputPrefixType));
            map.put("ECDSA_P384_SHA512", EcdsaSignKeyManager.a(hashType2, ellipticCurveType2, ecdsaSignatureEncoding, outputPrefixType));
            map.put("ECDSA_P384_SHA384", EcdsaSignKeyManager.a(HashType.SHA384, ellipticCurveType2, ecdsaSignatureEncoding, outputPrefixType));
            EllipticCurveType ellipticCurveType3 = EllipticCurveType.NIST_P521;
            map.put("ECDSA_P521", EcdsaSignKeyManager.a(hashType2, ellipticCurveType3, ecdsaSignatureEncoding, outputPrefixType));
            map.put("ECDSA_P521_IEEE_P1363", EcdsaSignKeyManager.a(hashType2, ellipticCurveType3, ecdsaSignatureEncoding2, outputPrefixType));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return EcdsaKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            SigUtil.validateEcdsaParams(((EcdsaKeyFormat) messageLite).getParams());
        }
    }

    public EcdsaSignKeyManager() {
        super(com.google.crypto.tink.proto.EcdsaPrivateKey.class, com.google.crypto.tink.proto.EcdsaPublicKey.class, new a(PublicKeySign.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(HashType hashType, EllipticCurveType ellipticCurveType, EcdsaSignatureEncoding ecdsaSignatureEncoding, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat(EcdsaKeyFormat.newBuilder().setParams(EcdsaParams.newBuilder().setHashType(hashType).setCurve(ellipticCurveType).setEncoding(ecdsaSignatureEncoding).build()).build(), outputPrefixType);
    }

    public static KeyTemplate createKeyTemplate(HashType hashType, EllipticCurveType ellipticCurveType, EcdsaSignatureEncoding ecdsaSignatureEncoding, KeyTemplate.OutputPrefixType outputPrefixType) {
        return KeyTemplate.create(new EcdsaSignKeyManager().getKeyType(), EcdsaKeyFormat.newBuilder().setParams(EcdsaParams.newBuilder().setHashType(hashType).setCurve(ellipticCurveType).setEncoding(ecdsaSignatureEncoding).build()).build().toByteArray(), outputPrefixType);
    }

    public static final KeyTemplate ecdsaP256Template() {
        return createKeyTemplate(HashType.SHA256, EllipticCurveType.NIST_P256, EcdsaSignatureEncoding.DER, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawEcdsaP256Template() {
        return createKeyTemplate(HashType.SHA256, EllipticCurveType.NIST_P256, EcdsaSignatureEncoding.IEEE_P1363, KeyTemplate.OutputPrefixType.RAW);
    }

    public static void registerPair(boolean z10) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new EcdsaSignKeyManager(), new kf.a(), z10);
        ParametersSerializer<EcdsaParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.signature.a.f47355a;
        MutableSerializationRegistry mutableSerializationRegistryGlobalInstance = MutableSerializationRegistry.globalInstance();
        mutableSerializationRegistryGlobalInstance.registerParametersSerializer(com.google.crypto.tink.signature.a.f47355a);
        mutableSerializationRegistryGlobalInstance.registerParametersParser(com.google.crypto.tink.signature.a.f47356b);
        mutableSerializationRegistryGlobalInstance.registerKeySerializer(com.google.crypto.tink.signature.a.f47357c);
        mutableSerializationRegistryGlobalInstance.registerKeyParser(com.google.crypto.tink.signature.a.f47358d);
        mutableSerializationRegistryGlobalInstance.registerKeySerializer(com.google.crypto.tink.signature.a.f47359e);
        mutableSerializationRegistryGlobalInstance.registerKeyParser(com.google.crypto.tink.signature.a.f47360f);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<EcdsaKeyFormat, com.google.crypto.tink.proto.EcdsaPrivateKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public com.google.crypto.tink.proto.EcdsaPublicKey getPublicKey(com.google.crypto.tink.proto.EcdsaPrivateKey ecdsaPrivateKey) throws GeneralSecurityException {
        return ecdsaPrivateKey.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.EcdsaPrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.EcdsaPrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.EcdsaPrivateKey ecdsaPrivateKey) throws GeneralSecurityException {
        Validators.validateVersion(ecdsaPrivateKey.getVersion(), getVersion());
        SigUtil.validateEcdsaParams(ecdsaPrivateKey.getPublicKey().getParams());
    }
}
