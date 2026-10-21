package bf;

import com.google.crypto.tink.KeyManager;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: KeyManagerRegistry.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeyManager f25195a;

    public b(KeyManager keyManager) {
        this.f25195a = keyManager;
    }

    @Override // bf.e.a
    public final Class<?> a() {
        return null;
    }

    @Override // bf.e.a
    public final Class<?> b() {
        return this.f25195a.getClass();
    }

    @Override // bf.e.a
    public final Set<Class<?>> c() {
        return Collections.singleton(this.f25195a.getPrimitiveClass());
    }

    @Override // bf.e.a
    public final MessageLite d(ByteString byteString) throws InvalidProtocolBufferException, GeneralSecurityException {
        return null;
    }

    @Override // bf.e.a
    public final <Q> KeyManager<Q> e(Class<Q> cls) throws GeneralSecurityException {
        KeyManager<Q> keyManager = this.f25195a;
        if (keyManager.getPrimitiveClass().equals(cls)) {
            return keyManager;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // bf.e.a
    public final KeyManager<?> f() {
        return this.f25195a;
    }
}
