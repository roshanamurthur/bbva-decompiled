package kf;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.Ed25519PublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Ed25519Verify;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: Ed25519PublicKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends KeyTypeManager<Ed25519PublicKey> {

    /* JADX INFO: compiled from: Ed25519PublicKeyManager.java */
    public class a extends PrimitiveFactory<PublicKeyVerify, Ed25519PublicKey> {
        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public final PublicKeyVerify getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
            return new Ed25519Verify(((Ed25519PublicKey) messageLite).getKeyValue().toByteArray());
        }
    }

    public b() {
        super(Ed25519PublicKey.class, new a(PublicKeyVerify.class));
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
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
        return Ed25519PublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public final void validateKey(MessageLite messageLite) throws GeneralSecurityException {
        Ed25519PublicKey ed25519PublicKey = (Ed25519PublicKey) messageLite;
        Validators.validateVersion(ed25519PublicKey.getVersion(), 0);
        if (ed25519PublicKey.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
    }
}
