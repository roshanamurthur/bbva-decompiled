package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class aya extends ayc {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54133w0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final axy f54134r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final axw f54135s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54136t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54137u0;

    public aya(axy axyVar, axw axwVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f54134r0 = axyVar;
        this.f54135s0 = axwVar;
        this.f54136t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54137u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static aya setCompoundDrawableTintBlendMode(Object obj) throws IOException {
        return (aya) setY(new Object[]{obj}, 1338346932, -1338346929, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0145  */
    /* JADX WARN: Code duplicated, block: B:41:0x0158  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        aya ayaVar;
        int i13;
        int i14;
        int i15 = ~i11;
        int i16 = ~i10;
        int i17 = ~i12;
        int i18 = ((~(i10 | i11)) * 933) + (((~(i17 | i15)) | (~(i15 | i10))) * 933) + (((~(i16 | i17)) | i15) * (-933)) + (i11 * (-932)) + (i10 * 934);
        DataInputStream dataInputStream = null;
        if (i18 == 1) {
            aya ayaVar2 = (aya) objArr[0];
            int i19 = v0;
            int i20 = (i19 ^ 119) + ((i19 & 119) << 1);
            f54133w0 = i20 % 128;
            int i21 = i20 % 2;
            byte[] bArr = (byte[]) setY(new Object[]{ayaVar2}, -1992569272, 1992569276, System.identityHashCode(ayaVar2));
            int i22 = v0 + 97;
            f54133w0 = i22 % 128;
            if (i22 % 2 != 0) {
                return bArr;
            }
            throw null;
        }
        if (i18 == 2) {
            aya ayaVar3 = (aya) objArr[0];
            int i23 = v0;
            int i24 = (((i23 | 32) << 1) - (i23 ^ 32)) - 1;
            f54133w0 = i24 % 128;
            int i25 = i24 % 2;
            int iHashCode = (ayaVar3.f54134r0.hashCode() * 31) - (~(-(-ayaVar3.f54135s0.hashCode())));
            int i26 = (iHashCode ^ (-1)) + (iHashCode << 1);
            int i27 = i26 * 31;
            int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{ayaVar3.f54136t0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            int iIdentityHashCode = System.identityHashCode(ayaVar3);
            int i28 = iIntValue * 217;
            int i29 = i26 * (-6665);
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            int i31 = -(~(-(-((~((iIntValue ^ iIdentityHashCode) | (iIntValue & iIdentityHashCode))) * 216))));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            int i33 = (i32 ^ (-1)) + (i32 << 1);
            int i34 = ~i27;
            int i35 = iIntValue & i34;
            int i36 = (i34 | iIntValue) & (~i35);
            int i37 = (i36 & i35) | (i36 ^ i35);
            int i38 = ~iIdentityHashCode;
            int i39 = ((~i38) & i37) | ((~i37) & i38);
            int i40 = i37 & i38;
            int i41 = -(-(((i40 & i39) | (i39 ^ i40)) * (-216)));
            int i42 = (((i33 ^ i41) | (i33 & i41)) << 1) - (((~i33) & i41) | ((~i41) & i33));
            int i43 = (i38 | iIdentityHashCode) & i38;
            int i44 = i43 & iIntValue;
            int i45 = ~(((i43 | iIntValue) & (~i44)) | i44);
            int i46 = ((i27 & i45) | (i27 ^ i45)) * 216;
            int i47 = ((~i46) & i42) | ((~i42) & i46);
            int i48 = (i46 & i42) << 1;
            int i49 = (((i47 | i48) << 1) - (i48 ^ i47)) * 31;
            int i50 = -(-((Integer) bek.setOnFocusChangeListener(new Object[]{ayaVar3.f54137u0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue());
            int i51 = i49 & i50;
            int i52 = i51 + ((i50 ^ i49) | i51);
            int i53 = v0 + 63;
            f54133w0 = i53 % 128;
            if (i53 % 2 != 0) {
                return Integer.valueOf(i52);
            }
            throw null;
        }
        if (i18 == 3) {
            Object obj = objArr[0];
            while (!(obj instanceof aya)) {
                if (obj instanceof DataInputStream) {
                    DataInputStream dataInputStream2 = (DataInputStream) obj;
                    int i54 = dataInputStream2.readInt();
                    axy axyVar = (axy) axy.setDividerPadding(new Object[]{Integer.valueOf(i54)}, 905448134, -905448134, i54);
                    int i55 = dataInputStream2.readInt();
                    axw axwVar = (axw) axw.setOnFocusChangeListener(new Object[]{Integer.valueOf(i55)}, 1003383068, -1003383065, i55);
                    byte[] bArr2 = new byte[16];
                    dataInputStream2.readFully(bArr2);
                    byte[] bArr3 = new byte[((Integer) axy.setDividerPadding(new Object[]{axyVar}, -72431915, 72431919, System.identityHashCode(axyVar))).intValue()];
                    dataInputStream2.readFully(bArr3);
                    ayaVar = new aya(axyVar, axwVar, bArr3, bArr2);
                    int i56 = (-2) - ((v0 + 64) ^ (-1));
                    f54133w0 = i56 % 128;
                    int i57 = i56 % 2;
                } else if (obj instanceof byte[]) {
                    try {
                        DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                        try {
                            ayaVar = (aya) setY(new Object[]{dataInputStream3}, 1338346932, -1338346929, (int) System.currentTimeMillis());
                            dataInputStream3.close();
                            int i58 = v0;
                            int i59 = i58 & 15;
                            int i60 = i58 | 15;
                            int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                            f54133w0 = i61 % 128;
                            int i62 = i61 % 2;
                        } catch (Throwable th2) {
                            th = th2;
                            dataInputStream = dataInputStream3;
                            if (dataInputStream != null) {
                                dataInputStream.close();
                                int i63 = f54133w0 + 72;
                                int i64 = (i63 ^ (-1)) + (i63 << 1);
                                v0 = i64 % 128;
                                int i65 = i64 % 2;
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    if (!(obj instanceof InputStream)) {
                        throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(obj)));
                    }
                    int i66 = v0;
                    int i67 = i66 & 117;
                    int i68 = -(-((i66 ^ 117) | i67));
                    int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                    f54133w0 = i69 % 128;
                    InputStream inputStream = (InputStream) obj;
                    if (i69 % 2 == 0) {
                        throw null;
                    }
                    obj = (byte[]) bfc.setOnFocusChangeListener(new Object[]{inputStream}, 1574614765, -1574614762, (int) System.currentTimeMillis());
                }
                return ayaVar;
            }
            int i70 = v0;
            int i71 = ((i70 | 118) << 1) - (i70 ^ 118);
            int i72 = (i71 ^ (-1)) + (i71 << 1);
            f54133w0 = i72 % 128;
            int i73 = i72 % 2;
            ayaVar = (aya) obj;
            int i74 = i70 & 115;
            int i75 = -(-((i70 ^ 115) | i74));
            int i76 = (i74 & i75) + (i75 | i74);
            f54133w0 = i76 % 128;
            if (i76 % 2 == 0) {
                int i77 = 77 / 0;
            }
            return ayaVar;
        }
        if (i18 == 4) {
            aya ayaVar4 = (aya) objArr[0];
            int i78 = v0;
            int i79 = (i78 ^ 77) + ((i78 & 77) << 1);
            f54133w0 = i79 % 128;
            int i80 = i79 % 2;
            axr axrVar = (axr) axr.setDividerPadding(new Object[0], -776185694, 776185694, (int) System.currentTimeMillis());
            axy axyVar2 = ayaVar4.f54134r0;
            int iIntValue2 = ((Integer) axy.setDividerPadding(new Object[]{axyVar2}, -934473121, 934473126, System.identityHashCode(axyVar2))).intValue();
            axr axrVar2 = (axr) axr.setDividerPadding(new Object[]{axrVar, Integer.valueOf(iIntValue2)}, 1810000667, -1810000665, iIntValue2);
            axw axwVar2 = ayaVar4.f54135s0;
            int iIntValue3 = ((Integer) axw.setOnFocusChangeListener(new Object[]{axwVar2}, 1670377334, -1670377333, System.identityHashCode(axwVar2))).intValue();
            axr axrVar3 = (axr) axr.setDividerPadding(new Object[]{axrVar2, Integer.valueOf(iIntValue3)}, 1810000667, -1810000665, iIntValue3);
            axr axrVar4 = (axr) axr.setDividerPadding(new Object[]{axrVar3, ayaVar4.f54136t0}, 195178378, -195178377, System.identityHashCode(axrVar3));
            axr axrVar5 = (axr) axr.setDividerPadding(new Object[]{axrVar4, ayaVar4.f54137u0}, 195178378, -195178377, System.identityHashCode(axrVar4));
            byte[] bArr4 = (byte[]) axr.setDividerPadding(new Object[]{axrVar5}, 1746305515, -1746305507, System.identityHashCode(axrVar5));
            int i81 = v0 + 61;
            f54133w0 = i81 % 128;
            if (i81 % 2 != 0) {
                return bArr4;
            }
            throw null;
        }
        Boolean bool = Boolean.FALSE;
        aya ayaVar5 = (aya) objArr[0];
        Object obj2 = objArr[1];
        int i82 = f54133w0;
        int i83 = i82 & 115;
        int i84 = (i82 | 115) & (~i83);
        int i85 = i83 << 1;
        int i86 = (i84 ^ i85) + ((i84 & i85) << 1);
        int i87 = i86 % 128;
        v0 = i87;
        int i88 = i86 % 2;
        if (ayaVar5 == obj2) {
            int i89 = i87 & 49;
            int i90 = -(-(i87 | 49));
            int i91 = (i89 ^ i90) + ((i89 & i90) << 1);
            int i92 = i91 % 128;
            f54133w0 = i92;
            int i93 = i91 % 2;
            int i94 = (i92 | 63) << 1;
            int i95 = -(((~i92) & 63) | (i92 & (-64)));
            int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
            v0 = i96 % 128;
            int i97 = i96 % 2;
            return Boolean.TRUE;
        }
        if (obj2 != null) {
            int i98 = (i87 ^ 111) + ((i87 & 111) << 1);
            f54133w0 = i98 % 128;
            if (i98 % 2 == 0) {
                ayaVar5.getClass();
                throw null;
            }
            if (ayaVar5.getClass() != obj2.getClass()) {
                int i99 = v0;
                int i100 = i99 & 23;
                i13 = (i100 - (~(-(-((i99 ^ 23) | i100))))) - 1;
                f54133w0 = i13 % 128;
                if (i13 % 2 == 0) {
                    return bool;
                }
                i14 = 51;
            } else {
                aya ayaVar6 = (aya) obj2;
                if (!ayaVar5.f54134r0.equals(ayaVar6.f54134r0)) {
                    int i101 = v0;
                    int i102 = i101 & 91;
                    int i103 = i101 | 91;
                    int i104 = ((i102 | i103) << 1) - (i102 ^ i103);
                    f54133w0 = i104 % 128;
                    int i105 = i104 % 2;
                    int i106 = i101 + 1;
                    f54133w0 = i106 % 128;
                    if (i106 % 2 != 0) {
                        return bool;
                    }
                    throw null;
                }
                if (ayaVar5.f54135s0.equals(ayaVar6.f54135s0)) {
                    if (!((Boolean) bek.setOnFocusChangeListener(new Object[]{ayaVar5.f54136t0, ayaVar6.f54136t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue()) {
                        System.identityHashCode(ayaVar5);
                        System.identityHashCode(ayaVar5);
                        return bool;
                    }
                    boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{ayaVar5.f54137u0, ayaVar6.f54137u0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i107 = v0 + 23;
                    f54133w0 = i107 % 128;
                    if (i107 % 2 == 0) {
                        int i108 = 47 / 0;
                    }
                    return Boolean.valueOf(zBooleanValue);
                }
                int i109 = f54133w0;
                int i110 = (i109 | 19) << 1;
                int i111 = -(i109 ^ 19);
                int i112 = (i110 & i111) + (i111 | i110);
                int i113 = i112 % 128;
                v0 = i113;
                int i114 = i112 % 2;
                int i115 = i113 & 27;
                int i116 = ((i113 ^ 27) | i115) << 1;
                int i117 = -((i113 | 27) & (~i115));
                int i118 = (i116 ^ i117) + ((i117 & i116) << 1);
                f54133w0 = i118 % 128;
                if (i118 % 2 != 0) {
                    return bool;
                }
                i14 = 90;
            }
        } else {
            int i910 = v0;
            int i1010 = i910 & 23;
            i13 = (i1010 - (~(-(-((i910 ^ 23) | i1010))))) - 1;
            f54133w0 = i13 % 128;
            if (i13 % 2 == 0) {
                return bool;
            }
            i14 = 51;
        }
        int i119 = i14 / 0;
        return bool;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, -1794152460, 1794152460, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, 114375523, -114375521, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ayc, com.mypinpad.tsdk.isolation.ben
    public final byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        return (byte[]) setY(new Object[]{this}, -813923592, 813923593, System.identityHashCode(this));
    }
}
