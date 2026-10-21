package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class bfk extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f54705p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54706q0 = 1;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        bfk bfkVar = (bfk) objArr[0];
        int i13 = f54705p0 + 5;
        f54706q0 = i13 % 128;
        int i14 = i13 % 2;
        bfkVar.getClass();
        if (i14 == 0) {
            int i15 = 68 / 0;
        }
        int i16 = f54706q0;
        int i17 = i16 & 97;
        int i18 = i17 + ((i16 ^ 97) | i17);
        f54705p0 = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (Throwable) setY(new Object[]{this}, -623638333, 623638333, System.identityHashCode(this));
    }
}
