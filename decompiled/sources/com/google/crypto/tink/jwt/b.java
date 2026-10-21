package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.JwtEcdsaAlgorithm;
import com.google.crypto.tink.proto.JwtEcdsaPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EcdsaVerifyJce;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* JADX INFO: compiled from: JwtEcdsaVerifyKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends KeyTypeManager<JwtEcdsaPublicKey> {

    /* JADX INFO: compiled from: JwtEcdsaVerifyKeyManager.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46740a;

        static {
            int[] iArr = new int[JwtEcdsaAlgorithm.values().length];
            f46740a = iArr;
            try {
                iArr[JwtEcdsaAlgorithm.ES256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46740a[JwtEcdsaAlgorithm.ES384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46740a[JwtEcdsaAlgorithm.ES512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JwtEcdsaVerifyKeyManager.java */
    public static class C0202b extends PrimitiveFactory<JwtPublicKeyVerifyInternal, JwtEcdsaPublicKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final JwtPublicKeyVerifyInternal getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            JwtEcdsaPublicKey jwtEcdsaPublicKey = (JwtEcdsaPublicKey) messageLite;
            return new c(new EcdsaVerifyJce(EllipticCurves.getEcPublicKey(b.a(jwtEcdsaPublicKey.getAlgorithm()), jwtEcdsaPublicKey.getX().toByteArray(), jwtEcdsaPublicKey.getY().toByteArray()), b.b(jwtEcdsaPublicKey.getAlgorithm()), EllipticCurves.EcdsaEncoding.IEEE_P1363), jwtEcdsaPublicKey.getAlgorithm().name(), jwtEcdsaPublicKey.hasCustomKid() ? Optional.of(jwtEcdsaPublicKey.getCustomKid().getValue()) : Optional.empty());
        }
    }

    public b() {
        super(JwtEcdsaPublicKey.class, new C0202b(JwtPublicKeyVerifyInternal.class));
    }

    public static final EllipticCurves.CurveType a(JwtEcdsaAlgorithm jwtEcdsaAlgorithm) throws GeneralSecurityException {
        int i10 = a.f46740a[jwtEcdsaAlgorithm.ordinal()];
        if (i10 == 1) {
            return EllipticCurves.CurveType.NIST_P256;
        }
        if (i10 == 2) {
            return EllipticCurves.CurveType.NIST_P384;
        }
        if (i10 == 3) {
            return EllipticCurves.CurveType.NIST_P521;
        }
        throw new GeneralSecurityException("unknown algorithm " + jwtEcdsaAlgorithm.name());
    }

    public static Enums.HashType b(JwtEcdsaAlgorithm jwtEcdsaAlgorithm) throws GeneralSecurityException {
        int i10 = a.f46740a[jwtEcdsaAlgorithm.ordinal()];
        if (i10 == 1) {
            return Enums.HashType.SHA256;
        }
        if (i10 == 2) {
            return Enums.HashType.SHA384;
        }
        if (i10 == 3) {
            return Enums.HashType.SHA512;
        }
        throw new GeneralSecurityException("unknown algorithm " + jwtEcdsaAlgorithm.name());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final MessageLite parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return JwtEcdsaPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final void validateKey(MessageLite messageLite) throws GeneralSecurityException {
        JwtEcdsaPublicKey jwtEcdsaPublicKey = (JwtEcdsaPublicKey) messageLite;
        Validators.validateVersion(jwtEcdsaPublicKey.getVersion(), 0);
        b(jwtEcdsaPublicKey.getAlgorithm());
    }
}
