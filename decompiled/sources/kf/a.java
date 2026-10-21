package kf;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.EcdsaPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.signature.internal.SigUtil;
import com.google.crypto.tink.subtle.EcdsaVerifyJce;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: EcdsaVerifyKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends KeyTypeManager<EcdsaPublicKey> {

    /* JADX INFO: renamed from: kf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EcdsaVerifyKeyManager.java */
    public class C0434a extends PrimitiveFactory<PublicKeyVerify, EcdsaPublicKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final PublicKeyVerify getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) messageLite;
            return new EcdsaVerifyJce(EllipticCurves.getEcPublicKey(SigUtil.toCurveType(ecdsaPublicKey.getParams().getCurve()), ecdsaPublicKey.getX().toByteArray(), ecdsaPublicKey.getY().toByteArray()), SigUtil.toHashType(ecdsaPublicKey.getParams().getHashType()), SigUtil.toEcdsaEncoding(ecdsaPublicKey.getParams().getEncoding()));
        }
    }

    public a() {
        super(EcdsaPublicKey.class, new C0434a(PublicKeyVerify.class));
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
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
        return EcdsaPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final void validateKey(MessageLite messageLite) throws GeneralSecurityException {
        EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) messageLite;
        Validators.validateVersion(ecdsaPublicKey.getVersion(), 0);
        SigUtil.validateEcdsaParams(ecdsaPublicKey.getParams());
    }
}
