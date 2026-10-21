package qm;

import java.security.PrivilegedAction;
import org.bouncycastle.crypto.prng.EntropySourceProvider;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements PrivilegedAction<EntropySourceProvider> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f92877a;

    public c(String str) {
        this.f92877a = str;
    }

    @Override // java.security.PrivilegedAction
    public final EntropySourceProvider run() {
        String str = this.f92877a;
        try {
            return (EntropySourceProvider) ClassUtil.loadClass(DRBG.class, str).newInstance();
        } catch (Exception e5) {
            throw new IllegalStateException(ci.a.b(e5, ci.a.d("entropy source ", str, " not created: ")), e5);
        }
    }
}
