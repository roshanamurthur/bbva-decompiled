package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes10.dex */
public final class agw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f52633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f52634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Hashtable f52635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52636d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52637e = 1;

    public static class a extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52638e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52639f = 1;

        public static /* synthetic */ ajz a(Object[] objArr) {
            a aVar = (a) objArr[0];
            aph aphVar = (aph) b(new Object[]{aVar}, 473500863, -473500863, System.identityHashCode(aVar));
            ajz ajzVar = new ajz(aphVar, (akb) agw.setOnFocusChangeListener(new Object[]{aphVar, "04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"}, -116154219, 116154222, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{aphVar}, 162865573, -162865565, System.identityHashCode(aphVar)), (BigInteger) aph.setX(new Object[]{aphVar}, -1899125725, 1899125734, System.identityHashCode(aphVar)), null);
            int i10 = f52638e;
            int i11 = (((i10 | 38) << 1) - (i10 ^ 38)) - 1;
            f52639f = i11 % 128;
            if (i11 % 2 != 0) {
                return ajzVar;
            }
            throw null;
        }

        public static /* synthetic */ Object b(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (~(i13 | i14)) | (~(i14 | i12));
            int i16 = ~i12;
            int i17 = i16 | i10;
            if (((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773) == 1) {
                return a(objArr);
            }
            aph aphVar = (aph) agw.setOnFocusChangeListener(new Object[]{new aph.setX((BigInteger) agw.setOnFocusChangeListener(new Object[]{"F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03"}, 1827180417, -1827180417, (int) System.currentTimeMillis()), (BigInteger) agw.setOnFocusChangeListener(new Object[]{"F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00"}, 1827180417, -1827180417, (int) System.currentTimeMillis()), (BigInteger) agw.setOnFocusChangeListener(new Object[]{"EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F"}, 1827180417, -1827180417, (int) System.currentTimeMillis()), (BigInteger) agw.setOnFocusChangeListener(new Object[]{"F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1"}, 1827180417, -1827180417, (int) System.currentTimeMillis()), BigInteger.valueOf(1L), true)}, -777751465, 777751467, (int) System.currentTimeMillis());
            int i18 = f52639f;
            int i19 = i18 & 31;
            int i20 = -(-((i18 ^ 31) | i19));
            int i21 = (i19 & i20) + (i20 | i19);
            f52638e = i21 % 128;
            if (i21 % 2 == 0) {
                return aphVar;
            }
            int i22 = 37 / 0;
            return aphVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) b(new Object[]{this}, 473500863, -473500863, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) b(new Object[]{this}, -1366129541, 1366129542, System.identityHashCode(this));
        }
    }

    static {
        a aVar = new a();
        f52633a = new Hashtable();
        f52634b = new Hashtable();
        f52635c = new Hashtable();
        setOnFocusChangeListener(new Object[]{"FRP256v1", ahc.setY, aVar}, -110831149, 110831155, (int) System.currentTimeMillis());
        int i10 = f52637e;
        int i11 = i10 & 35;
        int i12 = i11 + ((i10 ^ 35) | i11);
        f52636d = i12 % 128;
        int i13 = i12 % 2;
    }

    public static ajz setDividerPadding(adu aduVar) {
        return (ajz) setOnFocusChangeListener(new Object[]{aduVar}, -224265342, 224265349, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.agw.f52636d;
        r9 = r7 & 113;
        r8 = ((((r7 ^ 113) | r9) << 1) - (~(-((r7 | 113) & (~r9))))) - 1;
        com.mypinpad.tsdk.isolation.agw.f52637e = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f2, code lost:
    
        r7 = r7.setY();
        r8 = com.mypinpad.tsdk.isolation.agw.f52637e;
        r9 = r8 ^ 81;
        r8 = ((((r8 & 81) | r9) << 1) - (~(-r9))) - 1;
        com.mypinpad.tsdk.isolation.agw.f52636d = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0107, code lost:
    
        if ((r8 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.agw.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }
}
