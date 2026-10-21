package qm;

import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements PrivilegedAction<Boolean> {
    @Override // java.security.PrivilegedAction
    public final Boolean run() {
        try {
            return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", new Class[0]) != null);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}
