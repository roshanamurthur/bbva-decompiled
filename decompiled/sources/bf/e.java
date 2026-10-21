package bf;

import com.google.crypto.tink.KeyManager;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: KeyManagerRegistry.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f25199b = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f25200a;

    /* JADX INFO: compiled from: KeyManagerRegistry.java */
    public interface a {
        Class<?> a();

        Class<?> b();

        Set<Class<?>> c();

        MessageLite d(ByteString byteString) throws InvalidProtocolBufferException, GeneralSecurityException;

        <P> KeyManager<P> e(Class<P> cls) throws GeneralSecurityException;

        KeyManager<?> f();
    }

    public e(e eVar) {
        this.f25200a = new ConcurrentHashMap(eVar.f25200a);
    }

    public final synchronized a a(String str) throws GeneralSecurityException {
        if (!this.f25200a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (a) this.f25200a.get(str);
    }

    public final KeyManager b(Class cls, String str) throws GeneralSecurityException {
        a aVarA = a(str);
        if (cls == null) {
            return aVarA.f();
        }
        if (aVarA.c().contains(cls)) {
            return aVarA.e(cls);
        }
        StringBuilder sb2 = new StringBuilder("Primitive type ");
        sb2.append(cls.getName());
        sb2.append(" not supported by key manager of type ");
        sb2.append(aVarA.b());
        sb2.append(", supported primitives: ");
        Set<Class<?>> setC = aVarA.c();
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls2 : setC) {
            if (!z10) {
                sb3.append(", ");
            }
            sb3.append(cls2.getCanonicalName());
            z10 = false;
        }
        sb2.append(sb3.toString());
        throw new GeneralSecurityException(sb2.toString());
    }

    public final synchronized <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> void c(PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, KeyTypeManager<PublicKeyProtoT> keyTypeManager) throws GeneralSecurityException {
        Class<?> clsA;
        try {
            TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibilityFipsStatus = privateKeyTypeManager.fipsStatus();
            TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibilityFipsStatus2 = keyTypeManager.fipsStatus();
            if (!algorithmFipsCompatibilityFipsStatus.isCompatible()) {
                throw new GeneralSecurityException("failed to register key manager " + privateKeyTypeManager.getClass() + " as it is not FIPS compatible.");
            }
            if (!algorithmFipsCompatibilityFipsStatus2.isCompatible()) {
                throw new GeneralSecurityException("failed to register key manager " + keyTypeManager.getClass() + " as it is not FIPS compatible.");
            }
            String keyType = privateKeyTypeManager.getKeyType();
            String keyType2 = keyTypeManager.getKeyType();
            if (this.f25200a.containsKey(keyType) && ((a) this.f25200a.get(keyType)).a() != null && (clsA = ((a) this.f25200a.get(keyType)).a()) != null && !clsA.getName().equals(keyTypeManager.getClass().getName())) {
                f25199b.warning("Attempted overwrite of a registered key manager for key type " + keyType + " with inconsistent public key type " + keyType2);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", privateKeyTypeManager.getClass().getName(), clsA.getName(), keyTypeManager.getClass().getName()));
            }
            f(new d(privateKeyTypeManager, keyTypeManager), true);
            f(new c(keyTypeManager), false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized <P> void d(KeyManager<P> keyManager) throws GeneralSecurityException {
        if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        f(new b(keyManager), false);
    }

    public final synchronized <KeyProtoT extends MessageLite> void e(KeyTypeManager<KeyProtoT> keyTypeManager) throws GeneralSecurityException {
        if (!keyTypeManager.fipsStatus().isCompatible()) {
            throw new GeneralSecurityException("failed to register key manager " + keyTypeManager.getClass() + " as it is not FIPS compatible.");
        }
        f(new c(keyTypeManager), false);
    }

    public final synchronized <P> void f(a aVar, boolean z10) throws GeneralSecurityException {
        try {
            String keyType = aVar.f().getKeyType();
            a aVar2 = (a) this.f25200a.get(keyType);
            if (aVar2 != null && !aVar2.b().equals(aVar.b())) {
                f25199b.warning("Attempted overwrite of a registered key manager for key type " + keyType);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", keyType, aVar2.b().getName(), aVar.b().getName()));
            }
            if (z10) {
                this.f25200a.put(keyType, aVar);
            } else {
                this.f25200a.putIfAbsent(keyType, aVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public e() {
        this.f25200a = new ConcurrentHashMap();
    }
}
