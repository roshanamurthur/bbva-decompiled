package bf;

import com.google.crypto.tink.KeyManager;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: compiled from: KeyManagerRegistry.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeyTypeManager f25196a;

    public c(KeyTypeManager keyTypeManager) {
        this.f25196a = keyTypeManager;
    }

    @Override // bf.e.a
    public final Class<?> a() {
        return null;
    }

    @Override // bf.e.a
    public final Class<?> b() {
        return this.f25196a.getClass();
    }

    @Override // bf.e.a
    public final Set<Class<?>> c() {
        return this.f25196a.supportedPrimitives();
    }

    @Override // bf.e.a
    public final MessageLite d(ByteString byteString) throws InvalidProtocolBufferException, GeneralSecurityException {
        KeyTypeManager keyTypeManager = this.f25196a;
        MessageLite key = keyTypeManager.parseKey(byteString);
        keyTypeManager.validateKey(key);
        return key;
    }

    @Override // bf.e.a
    public final <Q> KeyManager<Q> e(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new a(this.f25196a, cls);
        } catch (IllegalArgumentException e5) {
            throw new GeneralSecurityException("Primitive type not supported", e5);
        }
    }

    @Override // bf.e.a
    public final KeyManager<?> f() {
        KeyTypeManager keyTypeManager = this.f25196a;
        return new a(keyTypeManager, keyTypeManager.firstSupportedPrimitiveClass());
    }
}
