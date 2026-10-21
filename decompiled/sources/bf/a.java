package bf;

import com.google.crypto.tink.KeyManager;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: KeyManagerImpl.java */
/* JADX INFO: loaded from: classes10.dex */
@Alpha
public class a<PrimitiveT, KeyProtoT extends MessageLite> implements KeyManager<PrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyTypeManager<KeyProtoT> f25193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<PrimitiveT> f25194b;

    public a(KeyTypeManager<KeyProtoT> keyTypeManager, Class<PrimitiveT> cls) {
        if (!keyTypeManager.supportedPrimitives().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", keyTypeManager.toString(), cls.getName()));
        }
        this.f25193a = keyTypeManager;
        this.f25194b = cls;
    }

    @Override // com.google.crypto.tink.KeyManager
    public final boolean doesSupport(String str) {
        return str.equals(this.f25193a.getKeyType());
    }

    @Override // com.google.crypto.tink.KeyManager
    public final String getKeyType() {
        return this.f25193a.getKeyType();
    }

    @Override // com.google.crypto.tink.KeyManager
    public final PrimitiveT getPrimitive(ByteString byteString) throws GeneralSecurityException {
        KeyTypeManager<KeyProtoT> keyTypeManager = this.f25193a;
        try {
            MessageLite key = keyTypeManager.parseKey(byteString);
            Class<PrimitiveT> cls = this.f25194b;
            if (Void.class.equals(cls)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            keyTypeManager.validateKey(key);
            return (PrimitiveT) keyTypeManager.getPrimitive(key, cls);
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(keyTypeManager.getKeyClass().getName()), e5);
        }
    }

    @Override // com.google.crypto.tink.KeyManager
    public final Class<PrimitiveT> getPrimitiveClass() {
        return this.f25194b;
    }

    @Override // com.google.crypto.tink.KeyManager
    public final int getVersion() {
        return this.f25193a.getVersion();
    }

    @Override // com.google.crypto.tink.KeyManager
    public final MessageLite newKey(ByteString byteString) throws GeneralSecurityException {
        KeyTypeManager<KeyProtoT> keyTypeManager = this.f25193a;
        try {
            KeyTypeManager.KeyFactory<?, KeyProtoT> keyFactory = keyTypeManager.keyFactory();
            MessageLite keyFormat = keyFactory.parseKeyFormat(byteString);
            keyFactory.validateKeyFormat(keyFormat);
            return keyFactory.createKey(keyFormat);
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(keyTypeManager.keyFactory().getKeyFormatClass().getName()), e5);
        }
    }

    @Override // com.google.crypto.tink.KeyManager
    public final KeyData newKeyData(ByteString byteString) throws GeneralSecurityException {
        KeyTypeManager<KeyProtoT> keyTypeManager = this.f25193a;
        try {
            KeyTypeManager.KeyFactory<?, KeyProtoT> keyFactory = keyTypeManager.keyFactory();
            MessageLite keyFormat = keyFactory.parseKeyFormat(byteString);
            keyFactory.validateKeyFormat(keyFormat);
            return KeyData.newBuilder().setTypeUrl(keyTypeManager.getKeyType()).setValue(keyFactory.createKey(keyFormat).toByteString()).setKeyMaterialType(keyTypeManager.keyMaterialType()).build();
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Unexpected proto", e5);
        }
    }

    @Override // com.google.crypto.tink.KeyManager
    public final PrimitiveT getPrimitive(MessageLite messageLite) throws GeneralSecurityException {
        KeyTypeManager<KeyProtoT> keyTypeManager = this.f25193a;
        String strConcat = "Expected proto of type ".concat(keyTypeManager.getKeyClass().getName());
        if (keyTypeManager.getKeyClass().isInstance(messageLite)) {
            Class<PrimitiveT> cls = this.f25194b;
            if (!Void.class.equals(cls)) {
                keyTypeManager.validateKey(messageLite);
                return (PrimitiveT) keyTypeManager.getPrimitive(messageLite, cls);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        throw new GeneralSecurityException(strConcat);
    }

    @Override // com.google.crypto.tink.KeyManager
    public final MessageLite newKey(MessageLite messageLite) throws GeneralSecurityException {
        KeyTypeManager.KeyFactory<?, KeyProtoT> keyFactory = this.f25193a.keyFactory();
        String strConcat = "Expected proto of type ".concat(keyFactory.getKeyFormatClass().getName());
        if (keyFactory.getKeyFormatClass().isInstance(messageLite)) {
            keyFactory.validateKeyFormat(messageLite);
            return keyFactory.createKey(messageLite);
        }
        throw new GeneralSecurityException(strConcat);
    }
}
