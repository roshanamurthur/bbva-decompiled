package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTemplates;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager;
import com.google.crypto.tink.aead.AesGcmKeyManager;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.EcPointFormat;
import com.google.crypto.tink.proto.EciesAeadDemParams;
import com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EciesAeadHkdfHybridDecrypt;
import com.google.crypto.tink.subtle.EllipticCurves;
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
public final class EciesAeadHkdfPrivateKeyManager extends PrivateKeyTypeManager<EciesAeadHkdfPrivateKey, EciesAeadHkdfPublicKey> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f46573e = new byte[0];

    public class a extends PrimitiveFactory<HybridDecrypt, EciesAeadHkdfPrivateKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final HybridDecrypt getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey = (EciesAeadHkdfPrivateKey) messageLite;
            EciesAeadHkdfParams params = eciesAeadHkdfPrivateKey.getPublicKey().getParams();
            EciesHkdfKemParams kemParams = params.getKemParams();
            return new EciesAeadHkdfHybridDecrypt(EllipticCurves.getEcPrivateKey(ef.b.a(kemParams.getCurveType()), eciesAeadHkdfPrivateKey.getKeyValue().toByteArray()), kemParams.getHkdfSalt().toByteArray(), ef.b.b(kemParams.getHkdfHashType()), ef.b.c(params.getEcPointFormat()), new ef.c(params.getDemParams().getAeadDem()));
        }
    }

    public class b extends KeyTypeManager.KeyFactory<EciesAeadHkdfKeyFormat, EciesAeadHkdfPrivateKey> {
        public b() {
            super(EciesAeadHkdfKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            EciesAeadHkdfKeyFormat eciesAeadHkdfKeyFormat = (EciesAeadHkdfKeyFormat) messageLite;
            KeyPair keyPairGenerateKeyPair = EllipticCurves.generateKeyPair(ef.b.a(eciesAeadHkdfKeyFormat.getParams().getKemParams().getCurveType()));
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
            ECPoint w6 = eCPublicKey.getW();
            EciesAeadHkdfPublicKey.Builder builderNewBuilder = EciesAeadHkdfPublicKey.newBuilder();
            EciesAeadHkdfPrivateKeyManager eciesAeadHkdfPrivateKeyManager = EciesAeadHkdfPrivateKeyManager.this;
            return EciesAeadHkdfPrivateKey.newBuilder().setVersion(eciesAeadHkdfPrivateKeyManager.getVersion()).setPublicKey(builderNewBuilder.setVersion(eciesAeadHkdfPrivateKeyManager.getVersion()).setParams(eciesAeadHkdfKeyFormat.getParams()).setX(ByteString.copyFrom(w6.getAffineX().toByteArray())).setY(ByteString.copyFrom(w6.getAffineY().toByteArray())).build()).setKeyValue(ByteString.copyFrom(eCPrivateKey.getS().toByteArray())).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<EciesAeadHkdfKeyFormat>> keyFormats() throws GeneralSecurityException {
            HashMap map = new HashMap();
            EllipticCurveType ellipticCurveType = EllipticCurveType.NIST_P256;
            HashType hashType = HashType.SHA256;
            EcPointFormat ecPointFormat = EcPointFormat.UNCOMPRESSED;
            KeyTemplate keyTemplate = KeyTemplates.get("AES128_GCM");
            byte[] bArr = EciesAeadHkdfPrivateKeyManager.f46573e;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", EciesAeadHkdfPrivateKeyManager.a(outputPrefixType, keyTemplate, ecPointFormat, ellipticCurveType, hashType, bArr));
            KeyTemplate keyTemplate2 = KeyTemplates.get("AES128_GCM");
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", EciesAeadHkdfPrivateKeyManager.a(outputPrefixType2, keyTemplate2, ecPointFormat, ellipticCurveType, hashType, bArr));
            EcPointFormat ecPointFormat2 = EcPointFormat.COMPRESSED;
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", EciesAeadHkdfPrivateKeyManager.a(outputPrefixType, KeyTemplates.get("AES128_GCM"), ecPointFormat2, ellipticCurveType, hashType, bArr));
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", EciesAeadHkdfPrivateKeyManager.a(outputPrefixType2, KeyTemplates.get("AES128_GCM"), ecPointFormat2, ellipticCurveType, hashType, bArr));
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", EciesAeadHkdfPrivateKeyManager.a(outputPrefixType2, KeyTemplates.get("AES128_GCM"), ecPointFormat2, ellipticCurveType, hashType, bArr));
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", EciesAeadHkdfPrivateKeyManager.a(outputPrefixType, KeyTemplates.get("AES128_CTR_HMAC_SHA256"), ecPointFormat, ellipticCurveType, hashType, bArr));
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", EciesAeadHkdfPrivateKeyManager.a(outputPrefixType2, KeyTemplates.get("AES128_CTR_HMAC_SHA256"), ecPointFormat, ellipticCurveType, hashType, bArr));
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", EciesAeadHkdfPrivateKeyManager.a(outputPrefixType, KeyTemplates.get("AES128_CTR_HMAC_SHA256"), ecPointFormat2, ellipticCurveType, hashType, bArr));
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", EciesAeadHkdfPrivateKeyManager.a(outputPrefixType2, KeyTemplates.get("AES128_CTR_HMAC_SHA256"), ecPointFormat2, ellipticCurveType, hashType, bArr));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return EciesAeadHkdfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            ef.b.d(((EciesAeadHkdfKeyFormat) messageLite).getParams());
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46575a;

        static {
            int[] iArr = new int[KeyTemplate.OutputPrefixType.values().length];
            f46575a = iArr;
            try {
                iArr[KeyTemplate.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46575a[KeyTemplate.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46575a[KeyTemplate.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46575a[KeyTemplate.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public EciesAeadHkdfPrivateKeyManager() {
        super(EciesAeadHkdfPrivateKey.class, EciesAeadHkdfPublicKey.class, new a(HybridDecrypt.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(KeyTemplate.OutputPrefixType outputPrefixType, KeyTemplate keyTemplate, EcPointFormat ecPointFormat, EllipticCurveType ellipticCurveType, HashType hashType, byte[] bArr) {
        return new KeyTypeManager.KeyFactory.KeyFormat(EciesAeadHkdfKeyFormat.newBuilder().setParams(c(ellipticCurveType, hashType, ecPointFormat, keyTemplate, bArr)).build(), outputPrefixType);
    }

    public static KeyTemplate b(KeyTemplate.OutputPrefixType outputPrefixType, KeyTemplate keyTemplate, EcPointFormat ecPointFormat, EllipticCurveType ellipticCurveType, HashType hashType, byte[] bArr) {
        return KeyTemplate.create(new EciesAeadHkdfPrivateKeyManager().getKeyType(), EciesAeadHkdfKeyFormat.newBuilder().setParams(c(ellipticCurveType, hashType, ecPointFormat, keyTemplate, bArr)).build().toByteArray(), outputPrefixType);
    }

    public static EciesAeadHkdfParams c(EllipticCurveType ellipticCurveType, HashType hashType, EcPointFormat ecPointFormat, KeyTemplate keyTemplate, byte[] bArr) {
        OutputPrefixType outputPrefixType;
        EciesHkdfKemParams eciesHkdfKemParamsBuild = EciesHkdfKemParams.newBuilder().setCurveType(ellipticCurveType).setHkdfHashType(hashType).setHkdfSalt(ByteString.copyFrom(bArr)).build();
        com.google.crypto.tink.proto.KeyTemplate.Builder value = com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(keyTemplate.getTypeUrl()).setValue(ByteString.copyFrom(keyTemplate.getValue()));
        int i10 = c.f46575a[keyTemplate.getOutputPrefixType().ordinal()];
        if (i10 == 1) {
            outputPrefixType = OutputPrefixType.TINK;
        } else if (i10 == 2) {
            outputPrefixType = OutputPrefixType.LEGACY;
        } else if (i10 == 3) {
            outputPrefixType = OutputPrefixType.RAW;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            outputPrefixType = OutputPrefixType.CRUNCHY;
        }
        return EciesAeadHkdfParams.newBuilder().setKemParams(eciesHkdfKemParamsBuild).setDemParams(EciesAeadDemParams.newBuilder().setAeadDem(value.setOutputPrefixType(outputPrefixType).build()).build()).setEcPointFormat(ecPointFormat).build();
    }

    public static final KeyTemplate eciesP256HkdfHmacSha256Aes128CtrHmacSha256Template() {
        EllipticCurveType ellipticCurveType = EllipticCurveType.NIST_P256;
        HashType hashType = HashType.SHA256;
        EcPointFormat ecPointFormat = EcPointFormat.UNCOMPRESSED;
        return b(KeyTemplate.OutputPrefixType.TINK, AesCtrHmacAeadKeyManager.aes128CtrHmacSha256Template(), ecPointFormat, ellipticCurveType, hashType, f46573e);
    }

    public static final KeyTemplate eciesP256HkdfHmacSha256Aes128GcmTemplate() {
        EllipticCurveType ellipticCurveType = EllipticCurveType.NIST_P256;
        HashType hashType = HashType.SHA256;
        EcPointFormat ecPointFormat = EcPointFormat.UNCOMPRESSED;
        return b(KeyTemplate.OutputPrefixType.TINK, AesGcmKeyManager.aes128GcmTemplate(), ecPointFormat, ellipticCurveType, hashType, f46573e);
    }

    public static final KeyTemplate rawEciesP256HkdfHmacSha256Aes128CtrHmacSha256CompressedTemplate() {
        EllipticCurveType ellipticCurveType = EllipticCurveType.NIST_P256;
        HashType hashType = HashType.SHA256;
        EcPointFormat ecPointFormat = EcPointFormat.COMPRESSED;
        return b(KeyTemplate.OutputPrefixType.RAW, AesCtrHmacAeadKeyManager.aes128CtrHmacSha256Template(), ecPointFormat, ellipticCurveType, hashType, f46573e);
    }

    public static final KeyTemplate rawEciesP256HkdfHmacSha256Aes128GcmCompressedTemplate() {
        EllipticCurveType ellipticCurveType = EllipticCurveType.NIST_P256;
        HashType hashType = HashType.SHA256;
        EcPointFormat ecPointFormat = EcPointFormat.COMPRESSED;
        return b(KeyTemplate.OutputPrefixType.RAW, AesGcmKeyManager.aes128GcmTemplate(), ecPointFormat, ellipticCurveType, hashType, f46573e);
    }

    public static void registerPair(boolean z10) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new EciesAeadHkdfPrivateKeyManager(), new ef.a(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<EciesAeadHkdfKeyFormat, EciesAeadHkdfPrivateKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public EciesAeadHkdfPublicKey getPublicKey(EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey) throws GeneralSecurityException {
        return eciesAeadHkdfPrivateKey.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public EciesAeadHkdfPrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return EciesAeadHkdfPrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey) throws GeneralSecurityException {
        if (eciesAeadHkdfPrivateKey.getKeyValue().isEmpty()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        Validators.validateVersion(eciesAeadHkdfPrivateKey.getVersion(), getVersion());
        ef.b.d(eciesAeadHkdfPrivateKey.getPublicKey().getParams());
    }
}
