package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f53919a = new w1(BigInteger.valueOf(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w1 f53920b = new w1(BigInteger.valueOf(3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53921c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53922d = 1;

    static {
        int i10 = f53921c;
        int i11 = ((i10 ^ 107) | (i10 & 107)) << 1;
        int i12 = -(((~i10) & 107) | (i10 & (-108)));
        int i13 = (i11 & i12) + (i12 | i11);
        f53922d = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00cb  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
    
        if (r8 != 3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r8 != 3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.aup.f53920b;
        r7 = com.mypinpad.tsdk.isolation.aup.f53922d;
        r8 = ((r7 ^ 85) | (r7 & 85)) << 1;
        r7 = -(((~r7) & 85) | (r7 & (-86)));
        r0 = ((r8 | r7) << 1) - (r7 ^ r8);
        com.mypinpad.tsdk.isolation.aup.f53921c = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setOnFocusChangeListener(java.lang.Object[] r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aup.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static auq setX(int[] iArr) {
        return (auq) setOnFocusChangeListener(new Object[]{iArr}, 1285721114, -1285721113, (int) System.currentTimeMillis());
    }

    public static aul setOnFocusChangeListener(BigInteger bigInteger) {
        return (aul) setOnFocusChangeListener(new Object[]{bigInteger}, -276420764, 276420764, (int) System.currentTimeMillis());
    }
}
