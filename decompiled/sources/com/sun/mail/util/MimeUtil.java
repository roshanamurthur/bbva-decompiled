package com.sun.mail.util;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.mail.internet.MimePart;

/* JADX INFO: loaded from: classes9.dex */
public class MimeUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f65573a;

    public static class a implements PrivilegedAction<ClassLoader> {
        @Override // java.security.PrivilegedAction
        public final ClassLoader run() {
            try {
                return Thread.currentThread().getContextClassLoader();
            } catch (SecurityException unused) {
                return null;
            }
        }
    }

    static {
        Class<?> cls;
        Method method = null;
        try {
            try {
                String property = System.getProperty("mail.mime.contenttypehandler");
                if (property != null) {
                    ClassLoader classLoaderA = a();
                    if (classLoaderA != null) {
                        try {
                            cls = Class.forName(property, false, classLoaderA);
                        } catch (ClassNotFoundException unused) {
                            cls = null;
                        }
                    } else {
                        cls = null;
                    }
                    if (cls == null) {
                        cls = Class.forName(property);
                    }
                    method = cls.getMethod("cleanContentType", MimePart.class, String.class);
                }
            } finally {
                f65573a = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException | RuntimeException unused2) {
        }
    }

    public static ClassLoader a() {
        return (ClassLoader) AccessController.doPrivileged(new a());
    }

    public static String cleanContentType(MimePart mimePart, String str) {
        Method method = f65573a;
        if (method != null) {
            try {
                return (String) method.invoke(null, mimePart, str);
            } catch (Exception unused) {
            }
        }
        return str;
    }
}
