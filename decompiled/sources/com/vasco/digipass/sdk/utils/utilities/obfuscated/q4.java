package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f66267a = new ThreadLocal();

    public class a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f66268a;

        public a(String str) {
            this.f66268a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            Map map = (Map) q4.f66267a.get();
            return map != null ? map.get(this.f66268a) : System.getProperty(this.f66268a);
        }
    }

    public static boolean b(String str) {
        try {
            String strA = a(str);
            if (strA != null) {
                return "true".equals(k5.a(strA));
            }
        } catch (AccessControlException unused) {
        }
        return false;
    }

    private static String a(String str) {
        return (String) AccessController.doPrivileged(new a(str));
    }
}
