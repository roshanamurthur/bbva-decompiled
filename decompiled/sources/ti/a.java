package ti;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: LogManagerProperties.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements PrivilegedAction<ClassLoader[]> {
    @Override // java.security.PrivilegedAction
    public final ClassLoader[] run() {
        ClassLoader[] classLoaderArr = new ClassLoader[2];
        try {
            classLoaderArr[0] = ClassLoader.getSystemClassLoader();
        } catch (SecurityException unused) {
            classLoaderArr[0] = null;
        }
        try {
            classLoaderArr[1] = Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused2) {
            classLoaderArr[1] = null;
        }
        return classLoaderArr;
    }
}
