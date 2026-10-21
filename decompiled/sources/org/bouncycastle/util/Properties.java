package org.bouncycastle.util;

import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes13.dex */
public class Properties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f91637a = new ThreadLocal();

    public static class a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f91638a;

        public a(String str) {
            this.f91638a = str;
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            return Security.getProperty(this.f91638a);
        }
    }

    public static class b implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f91639a;

        public b(String str) {
            this.f91639a = str;
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            return System.getProperty(this.f91639a);
        }
    }

    public static BigInteger asBigInteger(String str) {
        String propertyValue = getPropertyValue(str);
        if (propertyValue != null) {
            return new BigInteger(propertyValue);
        }
        return null;
    }

    public static Set<String> asKeySet(String str) {
        HashSet hashSet = new HashSet();
        String propertyValue = getPropertyValue(str);
        if (propertyValue != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(propertyValue, ",");
            while (stringTokenizer.hasMoreElements()) {
                hashSet.add(Strings.toLowerCase(stringTokenizer.nextToken()).trim());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static String getPropertyValue(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new a(str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) f91637a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new b(str)) : str2;
    }

    public static boolean isOverrideSet(String str) {
        try {
            return "true".equalsIgnoreCase(getPropertyValue(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    public static boolean removeThreadOverride(String str) {
        String str2;
        ThreadLocal threadLocal = f91637a;
        Map map = (Map) threadLocal.get();
        if (map == null || (str2 = (String) map.remove(str)) == null) {
            return false;
        }
        if (map.isEmpty()) {
            threadLocal.remove();
        }
        return "true".equalsIgnoreCase(str2);
    }

    public static boolean setThreadOverride(String str, boolean z10) {
        boolean zIsOverrideSet = isOverrideSet(str);
        ThreadLocal threadLocal = f91637a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
        }
        map.put(str, z10 ? "true" : "false");
        return zIsOverrideSet;
    }
}
