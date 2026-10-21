package ef;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: EciesAeadHkdfPublicKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends KeyTypeManager<EciesAeadHkdfPublicKey> {

    /* JADX INFO: renamed from: ef.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EciesAeadHkdfPublicKeyManager.java */
    public class C0284a extends PrimitiveFactory<HybridEncrypt, EciesAeadHkdfPublicKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final HybridEncrypt getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = (EciesAeadHkdfPublicKey) messageLite;
            EciesAeadHkdfParams params = eciesAeadHkdfPublicKey.getParams();
            EciesHkdfKemParams kemParams = params.getKemParams();
            return new EciesAeadHkdfHybridEncrypt(EllipticCurves.getEcPublicKey(b.a(kemParams.getCurveType()), eciesAeadHkdfPublicKey.getX().toByteArray(), eciesAeadHkdfPublicKey.getY().toByteArray()), kemParams.getHkdfSalt().toByteArray(), b.b(kemParams.getHkdfHashType()), b.c(params.getEcPointFormat()), new c(params.getDemParams().getAeadDem()));
        }
    }

    public a() {
        super(EciesAeadHkdfPublicKey.class, new C0284a(HybridEncrypt.class));
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
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
        return EciesAeadHkdfPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final void validateKey(MessageLite messageLite) throws GeneralSecurityException {
        EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = (EciesAeadHkdfPublicKey) messageLite;
        Validators.validateVersion(eciesAeadHkdfPublicKey.getVersion(), 0);
        b.d(eciesAeadHkdfPublicKey.getParams());
    }
}
