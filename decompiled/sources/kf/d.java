package kf;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.signature.internal.SigUtil;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce;
import com.google.crypto.tink.subtle.Validators;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: compiled from: RsaSsaPkcs1VerifyKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends KeyTypeManager<RsaSsaPkcs1PublicKey> {

    /* JADX INFO: compiled from: RsaSsaPkcs1VerifyKeyManager.java */
    public class a extends PrimitiveFactory<PublicKeyVerify, RsaSsaPkcs1PublicKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final PublicKeyVerify getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = (RsaSsaPkcs1PublicKey) messageLite;
            return new RsaSsaPkcs1VerifyJce((RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, rsaSsaPkcs1PublicKey.getN().toByteArray()), new BigInteger(1, rsaSsaPkcs1PublicKey.getE().toByteArray()))), SigUtil.toHashType(rsaSsaPkcs1PublicKey.getParams().getHashType()));
        }
    }

    public d() {
        super(RsaSsaPkcs1PublicKey.class, new a(PublicKeyVerify.class));
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
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
        return RsaSsaPkcs1PublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final void validateKey(MessageLite messageLite) throws GeneralSecurityException {
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = (RsaSsaPkcs1PublicKey) messageLite;
        Validators.validateVersion(rsaSsaPkcs1PublicKey.getVersion(), 0);
        Validators.validateRsaModulusSize(new BigInteger(1, rsaSsaPkcs1PublicKey.getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, rsaSsaPkcs1PublicKey.getE().toByteArray()));
        SigUtil.validateRsaSsaPkcs1Params(rsaSsaPkcs1PublicKey.getParams());
    }
}
