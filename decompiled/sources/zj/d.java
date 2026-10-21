package zj;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: compiled from: SecuritySupport.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: compiled from: SecuritySupport.java */
    public static class a implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public final Object run() {
            try {
                return Thread.currentThread().getContextClassLoader();
            } catch (SecurityException unused) {
                return null;
            }
        }
    }

    public static ClassLoader a() {
        return (ClassLoader) AccessController.doPrivileged(new a());
    }
}
