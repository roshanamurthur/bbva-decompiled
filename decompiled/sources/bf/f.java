package bf;

import com.google.crypto.tink.PrivateKeyManager;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: PrivateKeyManagerImpl.java */
/* JADX INFO: loaded from: classes10.dex */
@Alpha
public final class f<PrimitiveT, KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> extends a<PrimitiveT, KeyProtoT> implements PrivateKeyManager<PrimitiveT> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> f25201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final KeyTypeManager<PublicKeyProtoT> f25202d;

    public f(PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, KeyTypeManager<PublicKeyProtoT> keyTypeManager, Class<PrimitiveT> cls) {
        super(privateKeyTypeManager, cls);
        this.f25201c = privateKeyTypeManager;
        this.f25202d = keyTypeManager;
    }

    @Override // com.google.crypto.tink.PrivateKeyManager
    public final KeyData getPublicKeyData(ByteString byteString) throws GeneralSecurityException {
        KeyTypeManager<PublicKeyProtoT> keyTypeManager = this.f25202d;
        PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager = this.f25201c;
        try {
            KeyProtoT key = privateKeyTypeManager.parseKey(byteString);
            privateKeyTypeManager.validateKey(key);
            MessageLite publicKey = privateKeyTypeManager.getPublicKey(key);
            keyTypeManager.validateKey(publicKey);
            return KeyData.newBuilder().setTypeUrl(keyTypeManager.getKeyType()).setValue(publicKey.toByteString()).setKeyMaterialType(keyTypeManager.keyMaterialType()).build();
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("expected serialized proto of type ", e5);
        }
    }
}
