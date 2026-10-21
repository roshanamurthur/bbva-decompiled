package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.RsaSsaPssVerifyJce;
import com.google.crypto.tink.subtle.Validators;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Optional;

/* JADX INFO: compiled from: JwtRsaSsaPssVerifyKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends KeyTypeManager<JwtRsaSsaPssPublicKey> {

    /* JADX INFO: compiled from: JwtRsaSsaPssVerifyKeyManager.java */
    public class a extends PrimitiveFactory<JwtPublicKeyVerifyInternal, JwtRsaSsaPssPublicKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final JwtPublicKeyVerifyInternal getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey = (JwtRsaSsaPssPublicKey) messageLite;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, jwtRsaSsaPssPublicKey.getN().toByteArray()), new BigInteger(1, jwtRsaSsaPssPublicKey.getE().toByteArray())));
            Enums.HashType hashTypeA = j.a(jwtRsaSsaPssPublicKey.getAlgorithm());
            return new i(new RsaSsaPssVerifyJce(rSAPublicKey, hashTypeA, hashTypeA, j.b(jwtRsaSsaPssPublicKey.getAlgorithm())), jwtRsaSsaPssPublicKey.getAlgorithm().name(), jwtRsaSsaPssPublicKey.hasCustomKid() ? Optional.of(jwtRsaSsaPssPublicKey.getCustomKid().getValue()) : Optional.empty());
        }
    }

    /* JADX INFO: compiled from: JwtRsaSsaPssVerifyKeyManager.java */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46761a;

        static {
            int[] iArr = new int[JwtRsaSsaPssAlgorithm.values().length];
            f46761a = iArr;
            try {
                iArr[JwtRsaSsaPssAlgorithm.PS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46761a[JwtRsaSsaPssAlgorithm.PS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46761a[JwtRsaSsaPssAlgorithm.PS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j() {
        super(JwtRsaSsaPssPublicKey.class, new a(JwtPublicKeyVerifyInternal.class));
    }

    public static final Enums.HashType a(JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm) throws GeneralSecurityException {
        int i10 = b.f46761a[jwtRsaSsaPssAlgorithm.ordinal()];
        if (i10 == 1) {
            return Enums.HashType.SHA256;
        }
        if (i10 == 2) {
            return Enums.HashType.SHA384;
        }
        if (i10 == 3) {
            return Enums.HashType.SHA512;
        }
        throw new GeneralSecurityException("unknown algorithm " + jwtRsaSsaPssAlgorithm.name());
    }

    public static final int b(JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm) throws GeneralSecurityException {
        int i10 = b.f46761a[jwtRsaSsaPssAlgorithm.ordinal()];
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 48;
        }
        if (i10 == 3) {
            return 64;
        }
        throw new GeneralSecurityException("unknown algorithm " + jwtRsaSsaPssAlgorithm.name());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";
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
        return JwtRsaSsaPssPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final void validateKey(MessageLite messageLite) throws GeneralSecurityException {
        JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey = (JwtRsaSsaPssPublicKey) messageLite;
        Validators.validateVersion(jwtRsaSsaPssPublicKey.getVersion(), 0);
        Validators.validateRsaModulusSize(new BigInteger(1, jwtRsaSsaPssPublicKey.getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, jwtRsaSsaPssPublicKey.getE().toByteArray()));
    }
}
