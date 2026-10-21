package com.google.crypto.tink.signature;

import androidx.annotation.Nullable;
import com.google.crypto.tink.KeysetReader;
import com.google.crypto.tink.PemKeyType;
import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
import com.google.crypto.tink.signature.internal.SigUtil;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.Random;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.security.Key;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.List;
import kf.d;
import kf.e;

/* JADX INFO: loaded from: classes10.dex */
public final class SignaturePemKeysetReader implements KeysetReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<b> f47350a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f47351a = new ArrayList();

        @CanIgnoreReturnValue
        public Builder addPem(String str, PemKeyType pemKeyType) {
            b bVar = new b();
            bVar.f47353a = new BufferedReader(new StringReader(str));
            bVar.f47354b = pemKeyType;
            this.f47351a.add(bVar);
            return this;
        }

        public KeysetReader build() {
            ArrayList arrayList = this.f47351a;
            SignaturePemKeysetReader signaturePemKeysetReader = new SignaturePemKeysetReader();
            signaturePemKeysetReader.f47350a = arrayList;
            return signaturePemKeysetReader;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47352a;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            f47352a = iArr;
            try {
                iArr[Enums.HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47352a[Enums.HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47352a[Enums.HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BufferedReader f47353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PemKeyType f47354b;
    }

    public SignaturePemKeysetReader() {
        throw null;
    }

    public static HashType a(PemKeyType pemKeyType) {
        int i10 = a.f47352a[pemKeyType.hash.ordinal()];
        if (i10 == 1) {
            return HashType.SHA256;
        }
        if (i10 == 2) {
            return HashType.SHA384;
        }
        if (i10 == 3) {
            return HashType.SHA512;
        }
        throw new IllegalArgumentException("unsupported hash type: " + pemKeyType.hash.name());
    }

    @Nullable
    public static Keyset.Key b(BufferedReader bufferedReader, PemKeyType pemKeyType) throws IOException {
        EllipticCurveType ellipticCurveType;
        KeyData keyDataBuild;
        int i10;
        Key key = pemKeyType.readKey(bufferedReader);
        if (key == null) {
            return null;
        }
        if (key instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) key;
            if (pemKeyType.algorithm.equals("RSASSA-PKCS1-v1_5")) {
                RsaSsaPkcs1Params rsaSsaPkcs1ParamsBuild = RsaSsaPkcs1Params.newBuilder().setHashType(a(pemKeyType)).build();
                RsaSsaPkcs1PublicKey.Builder builderNewBuilder = RsaSsaPkcs1PublicKey.newBuilder();
                new d();
                RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKeyBuild = builderNewBuilder.setVersion(0).setParams(rsaSsaPkcs1ParamsBuild).setE(SigUtil.toUnsignedIntByteString(rSAPublicKey.getPublicExponent())).setN(SigUtil.toUnsignedIntByteString(rSAPublicKey.getModulus())).build();
                KeyData.Builder builderNewBuilder2 = KeyData.newBuilder();
                new d();
                keyDataBuild = builderNewBuilder2.setTypeUrl("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey").setValue(rsaSsaPkcs1PublicKeyBuild.toByteString()).setKeyMaterialType(KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC).build();
            } else {
                if (!pemKeyType.algorithm.equals("RSASSA-PSS")) {
                    throw new IOException("unsupported RSA signature algorithm: " + pemKeyType.algorithm);
                }
                RsaSsaPssParams.Builder mgf1Hash = RsaSsaPssParams.newBuilder().setSigHash(a(pemKeyType)).setMgf1Hash(a(pemKeyType));
                int i11 = a.f47352a[pemKeyType.hash.ordinal()];
                if (i11 == 1) {
                    i10 = 32;
                } else if (i11 == 2) {
                    i10 = 48;
                } else {
                    if (i11 != 3) {
                        throw new IllegalArgumentException("unsupported hash type: " + pemKeyType.hash.name());
                    }
                    i10 = 64;
                }
                RsaSsaPssParams rsaSsaPssParamsBuild = mgf1Hash.setSaltLength(i10).build();
                RsaSsaPssPublicKey.Builder builderNewBuilder3 = RsaSsaPssPublicKey.newBuilder();
                new e();
                RsaSsaPssPublicKey rsaSsaPssPublicKeyBuild = builderNewBuilder3.setVersion(0).setParams(rsaSsaPssParamsBuild).setE(SigUtil.toUnsignedIntByteString(rSAPublicKey.getPublicExponent())).setN(SigUtil.toUnsignedIntByteString(rSAPublicKey.getModulus())).build();
                KeyData.Builder builderNewBuilder4 = KeyData.newBuilder();
                new e();
                keyDataBuild = builderNewBuilder4.setTypeUrl("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey").setValue(rsaSsaPssPublicKeyBuild.toByteString()).setKeyMaterialType(KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC).build();
            }
        } else {
            if (!(key instanceof ECPublicKey)) {
                return null;
            }
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (!pemKeyType.algorithm.equals("ECDSA")) {
                throw new IOException("unsupported EC signature algorithm: " + pemKeyType.algorithm);
            }
            EcdsaParams.Builder hashType = EcdsaParams.newBuilder().setHashType(a(pemKeyType));
            int i12 = pemKeyType.keySizeInBits;
            if (i12 == 256) {
                ellipticCurveType = EllipticCurveType.NIST_P256;
            } else if (i12 == 384) {
                ellipticCurveType = EllipticCurveType.NIST_P384;
            } else {
                if (i12 != 521) {
                    throw new IllegalArgumentException("unsupported curve for key size: " + pemKeyType.keySizeInBits);
                }
                ellipticCurveType = EllipticCurveType.NIST_P521;
            }
            EcdsaParams ecdsaParamsBuild = hashType.setCurve(ellipticCurveType).setEncoding(EcdsaSignatureEncoding.DER).build();
            com.google.crypto.tink.proto.EcdsaPublicKey.Builder builderNewBuilder5 = com.google.crypto.tink.proto.EcdsaPublicKey.newBuilder();
            new kf.a();
            com.google.crypto.tink.proto.EcdsaPublicKey ecdsaPublicKeyBuild = builderNewBuilder5.setVersion(0).setParams(ecdsaParamsBuild).setX(SigUtil.toUnsignedIntByteString(eCPublicKey.getW().getAffineX())).setY(SigUtil.toUnsignedIntByteString(eCPublicKey.getW().getAffineY())).build();
            KeyData.Builder builderNewBuilder6 = KeyData.newBuilder();
            new kf.a();
            keyDataBuild = builderNewBuilder6.setTypeUrl("type.googleapis.com/google.crypto.tink.EcdsaPublicKey").setValue(ecdsaPublicKeyBuild.toByteString()).setKeyMaterialType(KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC).build();
        }
        return Keyset.Key.newBuilder().setKeyData(keyDataBuild).setStatus(KeyStatusType.ENABLED).setOutputPrefixType(OutputPrefixType.RAW).setKeyId(Random.randInt()).build();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.KeysetReader
    public Keyset read() throws IOException {
        Keyset.Builder builderNewBuilder = Keyset.newBuilder();
        for (b bVar : this.f47350a) {
            for (Keyset.Key keyB = b(bVar.f47353a, bVar.f47354b); keyB != null; keyB = b(bVar.f47353a, bVar.f47354b)) {
                builderNewBuilder.addKey(keyB);
            }
        }
        if (builderNewBuilder.getKeyCount() == 0) {
            throw new IOException("cannot find any key");
        }
        builderNewBuilder.setPrimaryKeyId(builderNewBuilder.getKey(0).getKeyId());
        return builderNewBuilder.build();
    }

    @Override // com.google.crypto.tink.KeysetReader
    public EncryptedKeyset readEncrypted() throws IOException {
        throw new UnsupportedOperationException();
    }
}
