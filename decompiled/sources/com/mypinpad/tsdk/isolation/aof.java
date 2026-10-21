package com.mypinpad.tsdk.isolation;

import java.io.OutputStream;
import java.security.Signature;

/* JADX INFO: loaded from: classes10.dex */
public final class aof {
    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        Signature signature = (Signature) objArr[0];
        b1 b1Var = new b1();
        b1Var.f54244p0 = signature;
        return b1Var;
    }

    public static OutputStream setY(Signature signature) {
        return (OutputStream) setY(new Object[]{signature}, -1886135727, 1886135727, (int) System.currentTimeMillis());
    }
}
