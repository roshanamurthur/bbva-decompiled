package javax.activation;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: CommandInfo.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            return ClassLoader.getSystemClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
