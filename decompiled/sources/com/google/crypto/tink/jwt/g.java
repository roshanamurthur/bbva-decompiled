package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce;
import com.google.crypto.tink.subtle.Validators;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Optional;

/* JADX INFO: compiled from: JwtRsaSsaPkcs1VerifyKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends KeyTypeManager<JwtRsaSsaPkcs1PublicKey> {

    /* JADX INFO: compiled from: JwtRsaSsaPkcs1VerifyKeyManager.java */
    public class a extends PrimitiveFactory<JwtPublicKeyVerifyInternal, JwtRsaSsaPkcs1PublicKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final JwtPublicKeyVerifyInternal getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey = (JwtRsaSsaPkcs1PublicKey) messageLite;
            return new f(new RsaSsaPkcs1VerifyJce((RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, jwtRsaSsaPkcs1PublicKey.getN().toByteArray()), new BigInteger(1, jwtRsaSsaPkcs1PublicKey.getE().toByteArray()))), g.a(jwtRsaSsaPkcs1PublicKey.getAlgorithm())), jwtRsaSsaPkcs1PublicKey.getAlgorithm().name(), jwtRsaSsaPkcs1PublicKey.hasCustomKid() ? Optional.of(jwtRsaSsaPkcs1PublicKey.getCustomKid().getValue()) : Optional.empty());
        }
    }

    /* JADX INFO: compiled from: JwtRsaSsaPkcs1VerifyKeyManager.java */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46754a;

        static {
            int[] iArr = new int[JwtRsaSsaPkcs1Algorithm.values().length];
            f46754a = iArr;
            try {
                iArr[JwtRsaSsaPkcs1Algorithm.RS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46754a[JwtRsaSsaPkcs1Algorithm.RS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46754a[JwtRsaSsaPkcs1Algorithm.RS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g() {
        super(JwtRsaSsaPkcs1PublicKey.class, new a(JwtPublicKeyVerifyInternal.class));
    }

    public static Enums.HashType a(JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm) throws GeneralSecurityException {
        int i10 = b.f46754a[jwtRsaSsaPkcs1Algorithm.ordinal()];
        if (i10 == 1) {
            return Enums.HashType.SHA256;
        }
        if (i10 == 2) {
            return Enums.HashType.SHA384;
        }
        if (i10 == 3) {
            return Enums.HashType.SHA512;
        }
        throw new GeneralSecurityException("unknown algorithm " + jwtRsaSsaPkcs1Algorithm.name());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey";
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
        return JwtRsaSsaPkcs1PublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final void validateKey(MessageLite messageLite) throws GeneralSecurityException {
        JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey = (JwtRsaSsaPkcs1PublicKey) messageLite;
        Validators.validateVersion(jwtRsaSsaPkcs1PublicKey.getVersion(), 0);
        Validators.validateRsaModulusSize(new BigInteger(1, jwtRsaSsaPkcs1PublicKey.getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, jwtRsaSsaPkcs1PublicKey.getE().toByteArray()));
    }
}
