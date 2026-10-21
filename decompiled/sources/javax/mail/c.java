package javax.mail;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: Session.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c implements PrivilegedAction<ClassLoader> {
    @Override // java.security.PrivilegedAction
    public final ClassLoader run() {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
