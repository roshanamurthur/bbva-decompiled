package com.mypinpad.tsdk.isolation;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes10.dex */
public final class h3 implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ String f56136a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Object[] objArr = {this};
        System.identityHashCode(this);
        try {
            return Class.forName(((h3) objArr[0]).f56136a);
        } catch (Exception unused) {
            return null;
        }
    }
}
