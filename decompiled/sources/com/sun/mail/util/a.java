package com.sun.mail.util;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: SocketFetcher.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements PrivilegedAction<ClassLoader> {
    @Override // java.security.PrivilegedAction
    public final ClassLoader run() {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
