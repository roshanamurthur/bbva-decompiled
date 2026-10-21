package bf;

import com.google.crypto.tink.KeyManager;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: compiled from: KeyManagerRegistry.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrivateKeyTypeManager f25197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyTypeManager f25198b;

    public d(PrivateKeyTypeManager privateKeyTypeManager, KeyTypeManager keyTypeManager) {
        this.f25197a = privateKeyTypeManager;
        this.f25198b = keyTypeManager;
    }

    @Override // bf.e.a
    public final Class<?> a() {
        return this.f25198b.getClass();
    }

    @Override // bf.e.a
    public final Class<?> b() {
        return this.f25197a.getClass();
    }

    @Override // bf.e.a
    public final Set<Class<?>> c() {
        return this.f25197a.supportedPrimitives();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.crypto.tink.shaded.protobuf.MessageLite] */
    @Override // bf.e.a
    public final MessageLite d(ByteString byteString) throws InvalidProtocolBufferException, GeneralSecurityException {
        PrivateKeyTypeManager privateKeyTypeManager = this.f25197a;
        ?? key = privateKeyTypeManager.parseKey(byteString);
        privateKeyTypeManager.validateKey(key);
        return key;
    }

    @Override // bf.e.a
    public final <Q> KeyManager<Q> e(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new f(this.f25197a, this.f25198b, cls);
        } catch (IllegalArgumentException e5) {
            throw new GeneralSecurityException("Primitive type not supported", e5);
        }
    }

    @Override // bf.e.a
    public final KeyManager<?> f() {
        KeyTypeManager keyTypeManager = this.f25198b;
        PrivateKeyTypeManager privateKeyTypeManager = this.f25197a;
        return new f(privateKeyTypeManager, keyTypeManager, privateKeyTypeManager.firstSupportedPrimitiveClass());
    }
}
