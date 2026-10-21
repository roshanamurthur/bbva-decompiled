package kf;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.signature.internal.SigUtil;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPssVerifyJce;
import com.google.crypto.tink.subtle.Validators;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: compiled from: RsaSsaPssVerifyKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends KeyTypeManager<RsaSsaPssPublicKey> {

    /* JADX INFO: compiled from: RsaSsaPssVerifyKeyManager.java */
    public class a extends PrimitiveFactory<PublicKeyVerify, RsaSsaPssPublicKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final PublicKeyVerify getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            RsaSsaPssPublicKey rsaSsaPssPublicKey = (RsaSsaPssPublicKey) messageLite;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, rsaSsaPssPublicKey.getN().toByteArray()), new BigInteger(1, rsaSsaPssPublicKey.getE().toByteArray())));
            RsaSsaPssParams params = rsaSsaPssPublicKey.getParams();
            return new RsaSsaPssVerifyJce(rSAPublicKey, SigUtil.toHashType(params.getSigHash()), SigUtil.toHashType(params.getMgf1Hash()), params.getSaltLength());
        }
    }

    public e() {
        super(RsaSsaPssPublicKey.class, new a(PublicKeyVerify.class));
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey";
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
        return RsaSsaPssPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final void validateKey(MessageLite messageLite) throws GeneralSecurityException {
        RsaSsaPssPublicKey rsaSsaPssPublicKey = (RsaSsaPssPublicKey) messageLite;
        Validators.validateVersion(rsaSsaPssPublicKey.getVersion(), 0);
        Validators.validateRsaModulusSize(new BigInteger(1, rsaSsaPssPublicKey.getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, rsaSsaPssPublicKey.getE().toByteArray()));
        SigUtil.validateRsaSsaPssParams(rsaSsaPssPublicKey.getParams());
    }
}
