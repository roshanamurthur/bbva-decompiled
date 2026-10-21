package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.HpkeAead;
import com.google.crypto.tink.proto.HpkeKdf;
import com.google.crypto.tink.proto.HpkeKem;
import com.google.crypto.tink.proto.HpkeKeyFormat;
import com.google.crypto.tink.proto.HpkeParams;
import com.google.crypto.tink.proto.HpkePrivateKey;
import com.google.crypto.tink.proto.HpkePublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Validators;
import com.google.crypto.tink.subtle.X25519;
import ff.d;
import ff.f;
import ff.h;
import ff.j;
import ff.k;
import ff.l;
import ff.n;
import ff.p;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class HpkePrivateKeyManager extends PrivateKeyTypeManager<HpkePrivateKey, HpkePublicKey> {

    public class a extends PrimitiveFactory<HybridDecrypt, HpkePrivateKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final HybridDecrypt getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            int i10;
            k pVar;
            HpkePrivateKey hpkePrivateKey = (HpkePrivateKey) messageLite;
            if (!hpkePrivateKey.hasPublicKey()) {
                throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
            }
            if (!hpkePrivateKey.getPublicKey().hasParams()) {
                throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
            }
            if (hpkePrivateKey.getPrivateKey().isEmpty()) {
                throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
            }
            HpkeParams params = hpkePrivateKey.getPublicKey().getParams();
            h hVarC = l.c(params);
            ff.c cVarB = l.b(params);
            d dVarA = l.a(params);
            HpkeKem kem = params.getKem();
            int i11 = f.a.f68429a[kem.ordinal()];
            if (i11 == 1) {
                i10 = 32;
            } else if (i11 == 2) {
                i10 = 65;
            } else if (i11 == 3) {
                i10 = 97;
            } else {
                if (i11 != 4) {
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for " + kem.name());
                }
                i10 = 133;
            }
            int i12 = j.f68437a[hpkePrivateKey.getPublicKey().getParams().getKem().ordinal()];
            if (i12 == 1) {
                byte[] byteArray = hpkePrivateKey.getPrivateKey().toByteArray();
                pVar = new p(byteArray, X25519.publicFromPrivate(byteArray));
            } else {
                if (i12 != 2 && i12 != 3 && i12 != 4) {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                byte[] byteArray2 = hpkePrivateKey.getPrivateKey().toByteArray();
                byte[] byteArray3 = hpkePrivateKey.getPublicKey().getPublicKey().toByteArray();
                EllipticCurves.CurveType curveTypeB = HpkeUtil.b(hpkePrivateKey.getPublicKey().getParams().getKem());
                EllipticCurves.validatePublicKey(EllipticCurves.getEcPublicKey(curveTypeB, EllipticCurves.PointFormatType.UNCOMPRESSED, byteArray3), EllipticCurves.getEcPrivateKey(curveTypeB, byteArray2));
                pVar = new n(byteArray2, byteArray3);
            }
            return new f(pVar, hVarC, cVarB, dVarA, i10);
        }
    }

    public class b extends KeyTypeManager.KeyFactory<HpkeKeyFormat, HpkePrivateKey> {
        public b() {
            super(HpkeKeyFormat.class);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite createKey(MessageLite messageLite) throws GeneralSecurityException {
            byte[] bArrGeneratePrivateKey;
            byte[] bArrPublicFromPrivate;
            HpkeKeyFormat hpkeKeyFormat = (HpkeKeyFormat) messageLite;
            int i10 = c.f46584a[hpkeKeyFormat.getParams().getKem().ordinal()];
            if (i10 == 1) {
                bArrGeneratePrivateKey = X25519.generatePrivateKey();
                bArrPublicFromPrivate = X25519.publicFromPrivate(bArrGeneratePrivateKey);
            } else {
                if (i10 != 2 && i10 != 3 && i10 != 4) {
                    throw new GeneralSecurityException("Invalid KEM");
                }
                EllipticCurves.CurveType curveTypeB = HpkeUtil.b(hpkeKeyFormat.getParams().getKem());
                KeyPair keyPairGenerateKeyPair = EllipticCurves.generateKeyPair(curveTypeB);
                bArrPublicFromPrivate = EllipticCurves.pointEncode(curveTypeB, EllipticCurves.PointFormatType.UNCOMPRESSED, ((ECPublicKey) keyPairGenerateKeyPair.getPublic()).getW());
                bArrGeneratePrivateKey = ((ECPrivateKey) keyPairGenerateKeyPair.getPrivate()).getS().toByteArray();
            }
            HpkePublicKey.Builder builderNewBuilder = HpkePublicKey.newBuilder();
            HpkePrivateKeyManager hpkePrivateKeyManager = HpkePrivateKeyManager.this;
            return HpkePrivateKey.newBuilder().setVersion(hpkePrivateKeyManager.getVersion()).setPublicKey(builderNewBuilder.setVersion(hpkePrivateKeyManager.getVersion()).setParams(hpkeKeyFormat.getParams()).setPublicKey(ByteString.copyFrom(bArrPublicFromPrivate)).build()).setPrivateKey(ByteString.copyFrom(bArrGeneratePrivateKey)).build();
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final Map<String, KeyTypeManager.KeyFactory.KeyFormat<HpkeKeyFormat>> keyFormats() {
            HashMap map = new HashMap();
            HpkeKem hpkeKem = HpkeKem.DHKEM_X25519_HKDF_SHA256;
            HpkeKdf hpkeKdf = HpkeKdf.HKDF_SHA256;
            HpkeAead hpkeAead = HpkeAead.AES_128_GCM;
            KeyTemplate.OutputPrefixType outputPrefixType = KeyTemplate.OutputPrefixType.TINK;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", HpkePrivateKeyManager.a(hpkeKem, hpkeKdf, hpkeAead, outputPrefixType));
            KeyTemplate.OutputPrefixType outputPrefixType2 = KeyTemplate.OutputPrefixType.RAW;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", HpkePrivateKeyManager.a(hpkeKem, hpkeKdf, hpkeAead, outputPrefixType2));
            HpkeAead hpkeAead2 = HpkeAead.AES_256_GCM;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", HpkePrivateKeyManager.a(hpkeKem, hpkeKdf, hpkeAead2, outputPrefixType));
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", HpkePrivateKeyManager.a(hpkeKem, hpkeKdf, hpkeAead2, outputPrefixType2));
            HpkeAead hpkeAead3 = HpkeAead.CHACHA20_POLY1305;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", HpkePrivateKeyManager.a(hpkeKem, hpkeKdf, hpkeAead3, outputPrefixType));
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", HpkePrivateKeyManager.a(hpkeKem, hpkeKdf, hpkeAead3, outputPrefixType2));
            HpkeKem hpkeKem2 = HpkeKem.DHKEM_P256_HKDF_SHA256;
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", HpkePrivateKeyManager.a(hpkeKem2, hpkeKdf, hpkeAead, outputPrefixType));
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", HpkePrivateKeyManager.a(hpkeKem2, hpkeKdf, hpkeAead, outputPrefixType2));
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", HpkePrivateKeyManager.a(hpkeKem2, hpkeKdf, hpkeAead2, outputPrefixType));
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", HpkePrivateKeyManager.a(hpkeKem2, hpkeKdf, hpkeAead2, outputPrefixType2));
            HpkeKem hpkeKem3 = HpkeKem.DHKEM_P384_HKDF_SHA384;
            HpkeKdf hpkeKdf2 = HpkeKdf.HKDF_SHA384;
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", HpkePrivateKeyManager.a(hpkeKem3, hpkeKdf2, hpkeAead, outputPrefixType));
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", HpkePrivateKeyManager.a(hpkeKem3, hpkeKdf2, hpkeAead, outputPrefixType2));
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", HpkePrivateKeyManager.a(hpkeKem3, hpkeKdf2, hpkeAead2, outputPrefixType));
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", HpkePrivateKeyManager.a(hpkeKem3, hpkeKdf2, hpkeAead2, outputPrefixType2));
            HpkeKem hpkeKem4 = HpkeKem.DHKEM_P521_HKDF_SHA512;
            HpkeKdf hpkeKdf3 = HpkeKdf.HKDF_SHA512;
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", HpkePrivateKeyManager.a(hpkeKem4, hpkeKdf3, hpkeAead, outputPrefixType));
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", HpkePrivateKeyManager.a(hpkeKem4, hpkeKdf3, hpkeAead, outputPrefixType2));
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", HpkePrivateKeyManager.a(hpkeKem4, hpkeKdf3, hpkeAead2, outputPrefixType));
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", HpkePrivateKeyManager.a(hpkeKem4, hpkeKdf3, hpkeAead2, outputPrefixType2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final MessageLite parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
            return HpkeKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
        public final void validateKeyFormat(MessageLite messageLite) throws GeneralSecurityException {
            HpkeUtil.c(((HpkeKeyFormat) messageLite).getParams());
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46584a;

        static {
            int[] iArr = new int[HpkeKem.values().length];
            f46584a = iArr;
            try {
                iArr[HpkeKem.DHKEM_X25519_HKDF_SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46584a[HpkeKem.DHKEM_P256_HKDF_SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46584a[HpkeKem.DHKEM_P384_HKDF_SHA384.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46584a[HpkeKem.DHKEM_P521_HKDF_SHA512.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public HpkePrivateKeyManager() {
        super(HpkePrivateKey.class, HpkePublicKey.class, new a(HybridDecrypt.class));
    }

    public static KeyTypeManager.KeyFactory.KeyFormat a(HpkeKem hpkeKem, HpkeKdf hpkeKdf, HpkeAead hpkeAead, KeyTemplate.OutputPrefixType outputPrefixType) {
        return new KeyTypeManager.KeyFactory.KeyFormat(HpkeKeyFormat.newBuilder().setParams(HpkeParams.newBuilder().setKem(hpkeKem).setKdf(hpkeKdf).setAead(hpkeAead).build()).build(), outputPrefixType);
    }

    public static void registerPair(boolean z10) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new HpkePrivateKeyManager(), new HpkePublicKeyManager(), z10);
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<HpkeKeyFormat, HpkePrivateKey> keyFactory() {
        return new b();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public HpkePublicKey getPublicKey(HpkePrivateKey hpkePrivateKey) {
        return hpkePrivateKey.getPublicKey();
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public HpkePrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return HpkePrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(HpkePrivateKey hpkePrivateKey) throws GeneralSecurityException {
        if (hpkePrivateKey.getPrivateKey().isEmpty()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!hpkePrivateKey.hasPublicKey()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        Validators.validateVersion(hpkePrivateKey.getVersion(), getVersion());
        HpkeUtil.c(hpkePrivateKey.getPublicKey().getParams());
    }
}
