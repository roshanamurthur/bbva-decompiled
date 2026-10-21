package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class axu extends ayc {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54107t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54108u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f54109r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final aya f54110s0;

    public axu(int i10, aya ayaVar) {
        super(false);
        this.f54109r0 = i10;
        this.f54110s0 = ayaVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~i10;
        int i17 = ((i15 | (~(i16 | i12))) * (-370)) + (i11 * 371) + (i10 * 371);
        int i18 = (~(i12 | i13)) | (~(i16 | i14));
        int i19 = ~(i10 | i11);
        int i20 = (i19 * 370) + ((i18 | i19) * (-370)) + i17;
        if (i20 == 1) {
            axu axuVar = (axu) objArr[0];
            int i21 = f54108u0;
            int i22 = i21 & 59;
            int i23 = ((((i21 ^ 59) | i22) << 1) - (~(-((i21 | 59) & (~i22))))) - 1;
            int i24 = i23 % 128;
            f54107t0 = i24;
            int i25 = i23 % 2;
            int i26 = axuVar.f54109r0;
            int i27 = i24 + 91;
            f54108u0 = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 64 / 0;
            }
            return Integer.valueOf(i26);
        }
        if (i20 == 2) {
            axu axuVar2 = (axu) objArr[0];
            int i29 = f54108u0;
            int i30 = i29 & 9;
            int i31 = (i30 - (~(-(-((i29 ^ 9) | i30))))) - 1;
            f54107t0 = i31 % 128;
            int i32 = i31 % 2;
            axr axrVar = (axr) axr.setDividerPadding(new Object[0], -776185694, 776185694, (int) System.currentTimeMillis());
            int i33 = axuVar2.f54109r0;
            axr axrVar2 = (axr) axr.setDividerPadding(new Object[]{axrVar, Integer.valueOf(i33)}, 1810000667, -1810000665, i33);
            axr axrVar3 = (axr) axr.setDividerPadding(new Object[]{axrVar2, axuVar2.f54110s0.setAlwaysDrawnWithCacheEnabled()}, 195178378, -195178377, System.identityHashCode(axrVar2));
            byte[] bArr = (byte[]) axr.setDividerPadding(new Object[]{axrVar3}, 1746305515, -1746305507, System.identityHashCode(axrVar3));
            int i34 = f54108u0;
            int i35 = ((i34 | 121) << 1) - (i34 ^ 121);
            f54107t0 = i35 % 128;
            int i36 = i35 % 2;
            return bArr;
        }
        DataInputStream dataInputStream = null;
        if (i20 == 3) {
            axu axuVar3 = (axu) objArr[0];
            Object obj = objArr[1];
            int i37 = f54107t0;
            int i38 = ((i37 | 75) << 1) - (i37 ^ 75);
            int i39 = i38 % 128;
            f54108u0 = i39;
            int i40 = i38 % 2;
            if (axuVar3 == obj) {
                int i41 = (i37 ^ 107) + ((i37 & 107) << 1);
                int i42 = i41 % 128;
                f54108u0 = i42;
                int i43 = i41 % 2;
                int i44 = i42 & 71;
                int i45 = i44 + ((i42 ^ 71) | i44);
                f54107t0 = i45 % 128;
                int i46 = i45 % 2;
                return Boolean.TRUE;
            }
            if (obj != null) {
                int i47 = i39 ^ 65;
                int i48 = (i39 & 65) << 1;
                int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                f54107t0 = i49 % 128;
                int i50 = i49 % 2;
                if (axuVar3.getClass() == obj.getClass()) {
                    axu axuVar4 = (axu) obj;
                    if (axuVar3.f54109r0 == axuVar4.f54109r0) {
                        boolean zEquals = axuVar3.f54110s0.equals(axuVar4.f54110s0);
                        int i51 = f54107t0;
                        int i52 = i51 & 109;
                        int i53 = (i52 - (~((i51 ^ 109) | i52))) - 1;
                        f54108u0 = i53 % 128;
                        if (i53 % 2 != 0) {
                            return Boolean.valueOf(zEquals);
                        }
                        throw null;
                    }
                    int i54 = f54108u0;
                    int i55 = i54 & 101;
                    int i56 = (i54 | 101) & (~i55);
                    int i57 = i55 << 1;
                    int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                    int i59 = i58 % 128;
                    f54107t0 = i59;
                    boolean z10 = i58 % 2 != 0;
                    int i60 = i59 & 51;
                    int i61 = i60 + ((i59 ^ 51) | i60);
                    f54108u0 = i61 % 128;
                    int i62 = i61 % 2;
                    return Boolean.valueOf(z10);
                }
            }
            int i63 = f54107t0;
            int i64 = i63 & 59;
            int i65 = -(-(i63 | 59));
            int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
            f54108u0 = i66 % 128;
            int i67 = i66 % 2;
            return Boolean.FALSE;
        }
        if (i20 != 4) {
            if (i20 != 5) {
                axu axuVar5 = (axu) objArr[0];
                int i68 = f54108u0;
                int i69 = i68 & 109;
                int i70 = i69 + ((i68 ^ 109) | i69);
                int i71 = i70 % 128;
                f54107t0 = i71;
                int i72 = i70 % 2;
                aya ayaVar = axuVar5.f54110s0;
                if (i72 != 0) {
                    int i73 = 10 / 0;
                }
                int i74 = i71 & 101;
                int i75 = ((i71 | 101) & (~i74)) + (i74 << 1);
                f54108u0 = i75 % 128;
                int i76 = i75 % 2;
                return ayaVar;
            }
            axu axuVar6 = (axu) objArr[0];
            int i77 = f54107t0;
            int i78 = i77 & 15;
            int i79 = i78 + ((i77 ^ 15) | i78);
            f54108u0 = i79 % 128;
            int i80 = i79 % 2;
            int i81 = axuVar6.f54109r0 * 31;
            int i82 = -(-axuVar6.f54110s0.hashCode());
            int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
            int i84 = f54108u0;
            int i85 = (-2) - (((i84 ^ 80) + ((i84 & 80) << 1)) ^ (-1));
            f54107t0 = i85 % 128;
            if (i85 % 2 == 0) {
                return Integer.valueOf(i83);
            }
            throw null;
        }
        Object obj2 = objArr[0];
        while (!(obj2 instanceof axu)) {
            if (obj2 instanceof DataInputStream) {
                axu axuVar7 = new axu(((DataInputStream) obj2).readInt(), (aya) aya.setY(new Object[]{obj2}, 1338346932, -1338346929, (int) System.currentTimeMillis()));
                int i86 = f54107t0;
                int i87 = i86 & 109;
                int i88 = i87 + ((i86 ^ 109) | i87);
                f54108u0 = i88 % 128;
                if (i88 % 2 != 0) {
                    return axuVar7;
                }
                throw null;
            }
            if (obj2 instanceof byte[]) {
                try {
                    DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj2));
                    try {
                        axu axuVar8 = (axu) setX(new Object[]{dataInputStream2}, -447186264, 447186268, (int) System.currentTimeMillis());
                        dataInputStream2.close();
                        int i89 = f54107t0;
                        int i90 = i89 & 121;
                        int i91 = (i89 ^ 121) | i90;
                        int i92 = (i90 & i91) + (i91 | i90);
                        f54108u0 = i92 % 128;
                        int i93 = i92 % 2;
                        return axuVar8;
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                            int i94 = f54108u0 + 35;
                            f54107t0 = i94 % 128;
                            int i95 = i94 % 2;
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                if (!(obj2 instanceof InputStream)) {
                    throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(obj2)));
                }
                int i96 = f54108u0;
                int i97 = i96 & 29;
                int i98 = (i96 ^ 29) | i97;
                int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
                f54107t0 = i99 % 128;
                int i100 = i99 % 2;
                obj2 = (byte[]) bfc.setOnFocusChangeListener(new Object[]{(InputStream) obj2}, 1574614765, -1574614762, (int) System.currentTimeMillis());
                int i101 = f54107t0;
                int i102 = i101 & 21;
                int i103 = -(-(i101 | 21));
                int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                f54108u0 = i104 % 128;
                int i105 = i104 % 2;
            }
        }
        int i106 = f54107t0;
        int i107 = i106 & 47;
        int i108 = ((i106 ^ 47) | i107) << 1;
        int i109 = -((~i107) & (i106 | 47));
        int i110 = (i108 ^ i109) + ((i108 & i109) << 1);
        f54108u0 = i110 % 128;
        axu axuVar9 = (axu) obj2;
        if (i110 % 2 == 0) {
            throw null;
        }
        int i111 = (i106 & 75) + (i106 | 75);
        f54108u0 = i111 % 128;
        int i112 = i111 % 2;
        return axuVar9;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, 1394874857, -1394874854, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 180598691, -180598686, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ayc, com.mypinpad.tsdk.isolation.ben
    public final byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        return (byte[]) setX(new Object[]{this}, 404814629, -404814627, System.identityHashCode(this));
    }

    public final int setDividerPadding() {
        return ((Integer) setX(new Object[]{this}, -1093554345, 1093554346, System.identityHashCode(this))).intValue();
    }

    public final aya setOnFocusChangeListener() {
        return (aya) setX(new Object[]{this}, -1779413624, 1779413624, System.identityHashCode(this));
    }

    public static axu setDividerPadding(Object obj) throws IOException {
        return (axu) setX(new Object[]{obj}, -447186264, 447186268, (int) System.currentTimeMillis());
    }
}
