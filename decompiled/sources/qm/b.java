package qm;

import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.bouncycastle.jcajce.provider.drbg.DRBG;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements PrivilegedAction<SecureRandom> {
    @Override // java.security.PrivilegedAction
    public final SecureRandom run() {
        try {
            return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return DRBG.b();
        }
    }
}
