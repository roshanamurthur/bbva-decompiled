package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class ayb extends ayc {
    public static final a G0;
    public static final a[] H0;
    public static int I0 = 0;
    public static int J0 = 1;
    public final int E0;
    public aya F0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f54138r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final axy f54139s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final axw f54140t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f54141u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final WeakHashMap f54142w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f54143x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final aky f54144y0;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54145b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f54146c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54147a;

        public a(int i10) {
            this.f54147a = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b9, code lost:
        
            if (r5 == r6) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
        
            if (r5 == r6) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
        
            r5 = ((r1 ^ 35) - (~(-(-((r1 & 35) << 1))))) - 1;
            com.mypinpad.tsdk.i.ayb.a.f54145b = r5 % 128;
            r5 = r5 % 2;
            r1 = r1 + 72;
            r5 = (r1 ^ (-1)) + (r1 << 1);
            com.mypinpad.tsdk.i.ayb.a.f54145b = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00d9, code lost:
        
            if ((r5 % 2) == 0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00db, code lost:
        
            r5 = 65 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
        
            r6 = r1 & 73;
            r5 = ((r1 ^ 73) | r6) << 1;
            r6 = (~r6) & (r1 | 73);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return java.lang.Boolean.TRUE;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object a(java.lang.Object[] r5, int r6, int r7, int r8) {
            /*
                Method dump skipped, instruction units count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.ayb.a.a(java.lang.Object[], int, int, int):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            return ((Boolean) a(new Object[]{this, obj}, -1985743717, 1985743718, System.identityHashCode(this))).booleanValue();
        }

        public final int hashCode() {
            return ((Integer) a(new Object[]{this}, -1541417357, 1541417357, System.identityHashCode(this))).intValue();
        }
    }

    static {
        a aVar = new a(1);
        G0 = aVar;
        a[] aVarArr = new a[129];
        H0 = aVarArr;
        aVarArr[1] = aVar;
        int i10 = ((93 << 1) - (~(-((~0) & 93)))) - 1;
        J0 = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 2;
        while (true) {
            a[] aVarArr2 = H0;
            if (i12 >= aVarArr2.length) {
                int i13 = J0;
                int i14 = i13 & 105;
                int i15 = i14 + ((i13 ^ 105) | i14);
                I0 = i15 % 128;
                int i16 = i15 % 2;
                return;
            }
            aVarArr2[i12] = new a(i12);
            int i17 = i12 & 64;
            int i18 = (((i12 ^ 64) | i17) << 1) - ((i12 | 64) & (~i17));
            int i19 = i18 & (-63);
            i12 = i19 + ((i18 ^ (-63)) | i19);
            int i20 = J0;
            int i21 = (i20 & 53) + (i20 | 53);
            I0 = i21 % 128;
            int i22 = i21 % 2;
        }
    }

    public ayb(axy axyVar, axw axwVar, int i10, byte[] bArr, int i11, byte[] bArr2) {
        super(true);
        this.f54139s0 = axyVar;
        this.f54140t0 = axwVar;
        this.E0 = i10;
        this.f54138r0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54141u0 = i11;
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        int iIntValue = ((Integer) axy.setDividerPadding(new Object[]{axyVar}, 1735439869, -1735439868, System.identityHashCode(axyVar))).intValue();
        int i12 = iIntValue * 517;
        int i13 = (((-515) | i12) << 1) - (i12 ^ (-515));
        int i14 = ~iIntValue;
        int i15 = i14 & i10;
        int i16 = (~i15) & (i14 | i10);
        int i17 = ~i10;
        int i18 = ~((i15 & i16) | (i16 ^ i15));
        int i19 = (i17 | i10) & i17;
        int i20 = ~(i19 | 1);
        int i21 = i18 ^ i20;
        int i22 = i18 & i20;
        int i23 = i19 & iIntValue;
        int i24 = (i19 | iIntValue) & (~i23);
        int i25 = (i24 & i23) | (i24 ^ i23);
        int i26 = ~i25;
        int i27 = -(-(((i22 & i21) | (i21 ^ i22) | ((i25 | i26) & i26)) * (-516)));
        int i28 = i13 & i27;
        int i29 = i27 | i13;
        int i30 = (i28 & i29) + (i29 | i28);
        int i31 = (i14 | iIntValue) & i14;
        int i32 = ((~i31) & (-2)) | (i31 & 1);
        int i33 = i31 & (-2);
        int i34 = (i33 & i32) | (i32 ^ i33);
        int i35 = ~((i10 & i34) | (i34 & i17) | ((~i34) & i10));
        int i36 = ((-2) ^ i17) | ((-2) & i17);
        int i37 = (i14 & i36) | ((~i36) & iIntValue);
        int i38 = i36 & iIntValue;
        int i39 = ~((i37 & i38) | (i37 ^ i38));
        int i40 = i35 ^ i39;
        int i41 = i35 & i39;
        int i42 = -(~(-(-(((i41 & i40) | (i40 ^ i41)) * LibMCryptConstants.IND_HEX_SEGMENTO2))));
        int i43 = (-2) - ((((i30 | i42) << 1) - (i42 ^ i30)) ^ (-1));
        int i44 = ~(((-2) ^ iIntValue) | ((-2) & iIntValue));
        int i45 = i17 & iIntValue;
        int i46 = ((iIntValue | i17) & (~i45)) | i45;
        int i47 = ~i46;
        int i48 = (i46 | i47) & i47;
        int i49 = i44 & i48;
        int i50 = -(~(-(-((((i48 | i44) & (~i49)) | i49) * LibMCryptConstants.IND_HEX_SEGMENTO2))));
        int i51 = (i43 ^ i50) + ((i50 & i43) << 1);
        this.f54143x0 = 1 << ((i51 ^ (-1)) + (i51 << 1));
        this.f54142w0 = new WeakHashMap();
        this.f54144y0 = (aky) g2.b(new Object[]{axyVar}, -219000324, 219000325, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0135, code lost:
    
        if (r4 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0180, code lost:
    
        if (r4 != null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean a(java.lang.Object[] r14) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ayb.a(java.lang.Object[]):java.lang.Boolean");
    }

    public static aya b(Object[] objArr) {
        aya ayaVar;
        ayb aybVar = (ayb) objArr[0];
        synchronized (aybVar) {
            try {
                if (aybVar.F0 == null) {
                    aybVar.F0 = new aya(aybVar.f54139s0, aybVar.f54140t0, (byte[]) setCompoundDrawableTintBlendMode(new Object[]{aybVar, G0}, -1671112596, 1671112603, System.identityHashCode(aybVar)), aybVar.f54138r0);
                }
                ayaVar = aybVar.F0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ayaVar;
    }

    public static /* synthetic */ axw c(Object[] objArr) {
        ayb aybVar = (ayb) objArr[0];
        int i10 = (-2) - ((J0 + 94) ^ (-1));
        int i11 = i10 % 128;
        I0 = i11;
        int i12 = i10 % 2;
        axw axwVar = aybVar.f54140t0;
        int i13 = i11 & 7;
        int i14 = ((i11 ^ 7) | i13) << 1;
        int i15 = -((i11 | 7) & (~i13));
        int i16 = (i14 & i15) + (i14 | i15);
        J0 = i16 % 128;
        if (i16 % 2 != 0) {
            return axwVar;
        }
        throw null;
    }

    public static /* synthetic */ ayb d(Object[] objArr) throws Throwable {
        Object obj = objArr[0];
        while (true) {
            DataInputStream dataInputStream = null;
            if (obj instanceof ayb) {
                int i10 = J0;
                int i11 = ((((i10 ^ 61) | (i10 & 61)) << 1) - (~(-((i10 & (-62)) | ((~i10) & 61))))) - 1;
                I0 = i11 % 128;
                ayb aybVar = (ayb) obj;
                if (i11 % 2 != 0) {
                    throw null;
                }
                int i12 = i10 & 91;
                int i13 = (i10 ^ 91) | i12;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                I0 = i14 % 128;
                int i15 = i14 % 2;
                return aybVar;
            }
            if (obj instanceof DataInputStream) {
                int i16 = J0;
                int i17 = ((i16 ^ 120) + ((i16 & 120) << 1)) - 1;
                I0 = i17 % 128;
                DataInputStream dataInputStream2 = (DataInputStream) obj;
                if (i17 % 2 != 0) {
                    dataInputStream2.readInt();
                    throw null;
                }
                if (dataInputStream2.readInt() != 0) {
                    throw new IllegalStateException("expected version 0 lms private key");
                }
                int i18 = dataInputStream2.readInt();
                axy axyVar = (axy) axy.setDividerPadding(new Object[]{Integer.valueOf(i18)}, 905448134, -905448134, i18);
                int i19 = dataInputStream2.readInt();
                axw axwVar = (axw) axw.setOnFocusChangeListener(new Object[]{Integer.valueOf(i19)}, 1003383068, -1003383065, i19);
                byte[] bArr = new byte[16];
                dataInputStream2.readFully(bArr);
                int i20 = dataInputStream2.readInt();
                int i21 = dataInputStream2.readInt();
                int i22 = dataInputStream2.readInt();
                if (i22 < 0) {
                    throw new IllegalStateException("secret length less than zero");
                }
                if (i22 > dataInputStream2.available()) {
                    StringBuilder sb2 = new StringBuilder("secret length exceeded ");
                    sb2.append(dataInputStream2.available());
                    throw new IOException(sb2.toString());
                }
                byte[] bArr2 = new byte[i22];
                dataInputStream2.readFully(bArr2);
                ayb aybVar2 = new ayb(axyVar, axwVar, i20, bArr, i21, bArr2);
                int i23 = J0;
                int i24 = i23 ^ 15;
                int i25 = ((i23 & 15) | i24) << 1;
                int i26 = -i24;
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                I0 = i27 % 128;
                int i28 = i27 % 2;
                return aybVar2;
            }
            if (obj instanceof byte[]) {
                try {
                    DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                    try {
                        ayb aybVar3 = (ayb) setCompoundDrawableTintBlendMode(new Object[]{dataInputStream3}, 1988863407, -1988863402, (int) System.currentTimeMillis());
                        dataInputStream3.close();
                        int i29 = I0;
                        int i30 = ((i29 | 71) << 1) - (i29 ^ 71);
                        J0 = i30 % 128;
                        int i31 = i30 % 2;
                        return aybVar3;
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream = dataInputStream3;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                            int i32 = I0;
                            int i33 = ((i32 | 87) << 1) - (i32 ^ 87);
                            J0 = i33 % 128;
                            int i34 = i33 % 2;
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
                int i35 = I0;
                int i36 = ((i35 | 107) << 1) - (i35 ^ 107);
                J0 = i36 % 128;
                InputStream inputStream = (InputStream) obj;
                if (i36 % 2 == 0) {
                    throw null;
                }
                obj = (byte[]) bfc.setOnFocusChangeListener(new Object[]{inputStream}, 1574614765, -1574614762, (int) System.currentTimeMillis());
                int i37 = J0 + 63;
                I0 = i37 % 128;
                int i38 = i37 % 2;
            }
        }
    }

    public static /* synthetic */ Integer e(Object[] objArr) {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = 0;
        ayb aybVar = (ayb) objArr[0];
        int i10 = I0;
        int i11 = ((i10 & (-10)) | ((~i10) & 9)) + ((i10 & 9) << 1);
        J0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = aybVar.E0;
        int i14 = i13 * 31;
        int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{aybVar.f54138r0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
        int iIdentityHashCode = System.identityHashCode(aybVar);
        int i15 = iIntValue * (-919);
        int i16 = i13 * (-28489);
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        int i18 = ~iIntValue;
        int i19 = (i18 | iIntValue) & i18;
        int i20 = ~i14;
        int i21 = i19 & i20;
        int i22 = (i19 | i20) & (~i21);
        int i23 = i22 | i21;
        int i24 = i23 ^ iIdentityHashCode;
        int i25 = ~iIdentityHashCode;
        int i26 = i23 & iIdentityHashCode;
        int i27 = ~((i24 ^ i26) | (i26 & i24));
        int i28 = (i20 | i14) & i20;
        int i29 = (i28 ^ i25) | (i28 & i25);
        int i30 = i29 & iIntValue;
        int i31 = (~i30) & (i29 | iIntValue);
        int i32 = ~((i30 & i31) | (i31 ^ i30));
        int i33 = i27 & i32;
        int i34 = ((((i32 | i27) & (~i33)) | i33) * 920) + i17;
        int i35 = ~((i22 ^ i21) | (i22 & i21));
        int i36 = i18 & i25;
        int i37 = (~i36) & (i18 | i25);
        int i38 = ~((i36 & i37) | (i37 ^ i36));
        int i39 = ((~i38) & i35) | ((~i35) & i38);
        int i40 = i35 & i38;
        int i41 = -(-(((i40 & i39) | (i39 ^ i40)) * 920));
        int i42 = i34 & i41;
        int i43 = -(-(i34 | i41));
        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
        int i45 = i18 & i20;
        int i46 = (~i45) & (i18 | i20);
        int i47 = (i45 & i46) | (i46 ^ i45);
        int i48 = (i25 | iIdentityHashCode) & i25;
        int i49 = (i47 & i48) | (i47 ^ i48);
        int i50 = ~i49;
        int i51 = (i49 | i50) & i50;
        int i52 = (i18 & i14) | (i18 ^ i14);
        int i53 = ~((i52 & iIdentityHashCode) | (i52 ^ iIdentityHashCode));
        int i54 = ((~i53) & i51) | ((~i51) & i53);
        int i55 = i53 & i51;
        int i56 = (i55 & i54) | (i54 ^ i55);
        int i57 = (i20 ^ iIntValue) | (iIntValue & i20);
        int i58 = (i57 & i25) | ((~i57) & iIdentityHashCode);
        int i59 = i57 & iIdentityHashCode;
        int i60 = ~((i59 & i58) | (i58 ^ i59));
        int i61 = i56 ^ i60;
        int i62 = i56 & i60;
        int i63 = -(~(-(-(((i62 & i61) | (i61 ^ i62)) * 920))));
        int i64 = (-2) - (((i44 & i63) + (i63 | i44)) ^ (-1));
        int i65 = i64 * 31;
        axy axyVar = aybVar.f54139s0;
        if (axyVar != null) {
            System.identityHashCode(aybVar);
            System.identityHashCode(aybVar);
            iHashCode = axyVar.hashCode();
            int i66 = J0;
            int i67 = i66 | 113;
            int i68 = i67 << 1;
            int i69 = -((~(i66 & 113)) & i67);
            int i70 = (i68 & i69) + (i69 | i68);
            I0 = i70 % 128;
            int i71 = i70 % 2;
        } else {
            int i72 = I0;
            int i73 = (((i72 | 114) << 1) - (i72 ^ 114)) - 1;
            J0 = i73 % 128;
            int i74 = i73 % 2;
            iHashCode = 0;
        }
        int iIdentityHashCode2 = System.identityHashCode(aybVar);
        int i75 = iHashCode * 50;
        int i76 = -(-(i64 * (-3007)));
        int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
        int i78 = ~i65;
        int i79 = ~iIdentityHashCode2;
        int i80 = ~(i78 | i79);
        int i81 = ~(((i78 | i65) & i78) | iHashCode);
        int i82 = i80 ^ i81;
        int i83 = i80 & i81;
        int i84 = -(~(((i83 & i82) | (i82 ^ i83)) * 98));
        int i85 = ((i77 ^ i84) + ((i77 & i84) << 1)) - 1;
        int i86 = ~iHashCode;
        int i87 = ~(i79 | i86);
        int i88 = i78 & i87;
        int i89 = (i87 | i78) & (~i88);
        int i90 = (i89 & i88) | (i89 ^ i88);
        int i91 = iHashCode & iIdentityHashCode2;
        int i92 = (~i91) & (iHashCode | iIdentityHashCode2);
        int i93 = (i91 & i92) | (i92 ^ i91);
        int i94 = ~i93;
        int i95 = (i93 | i94) & i94;
        int i96 = ((~i95) & i90) | ((~i90) & i95);
        int i97 = i90 & i95;
        int i98 = -(-(((i97 & i96) | (i96 ^ i97)) * (-49)));
        int i99 = (((~i98) & i85) | ((~i85) & i98)) + ((i98 & i85) << 1);
        int i100 = ~((iIdentityHashCode2 & i78) | (i78 ^ iIdentityHashCode2));
        int i101 = (i78 & iHashCode) | (i65 & i86);
        int i102 = i65 & iHashCode;
        int i103 = ~((i101 & i102) | (i101 ^ i102));
        int i104 = i100 & i103;
        int i105 = (i103 | i100) & (~i104);
        int i106 = ((i105 & i104) | (i105 ^ i104)) * 49;
        int i107 = (i99 ^ i106) + ((i106 & i99) << 1);
        int i108 = i107 * 31;
        axw axwVar = aybVar.f54140t0;
        if (axwVar != null) {
            int i109 = I0;
            int i110 = i109 & 35;
            int i111 = (i109 ^ 35) | i110;
            int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
            J0 = i112 % 128;
            int i113 = i112 % 2;
            iHashCode2 = axwVar.hashCode();
            int i114 = I0;
            int i115 = (i114 & 121) + (i114 | 121);
            J0 = i115 % 128;
            int i116 = i115 % 2;
        } else {
            int i117 = J0;
            int i118 = i117 & 83;
            int i119 = (i117 | 83) & (~i118);
            int i120 = i118 << 1;
            int i121 = ((i119 | i120) << 1) - (i119 ^ i120);
            I0 = i121 % 128;
            int i122 = i121 % 2;
            iHashCode2 = 0;
        }
        int iIdentityHashCode3 = System.identityHashCode(aybVar);
        int i123 = iHashCode2 * 934;
        int i124 = -(~(-(-(i107 * (-28892)))));
        int i125 = ((i123 & i124) + (i124 | i123)) - 1;
        int i126 = ~i108;
        int i127 = ~iHashCode2;
        int i128 = ~iIdentityHashCode3;
        int i129 = (iIdentityHashCode3 | i128) & i128;
        int i130 = ~((i129 & i127) | (i127 ^ i129));
        int i131 = i126 ^ i130;
        int i132 = i130 & i126;
        int i133 = (-2) - ((i125 - (~(((i132 & i131) | (i131 ^ i132)) * (-933)))) ^ (-1));
        int i134 = ((~i128) & i126) | ((~i126) & i128);
        int i135 = i126 & i128;
        int i136 = ~((i134 & i135) | (i134 ^ i135));
        int i137 = ~((i126 & iHashCode2) | (i126 ^ iHashCode2));
        int i138 = ((i137 & i136) | (i136 ^ i137)) * 933;
        int i139 = i133 & i138;
        int i140 = (i138 ^ i133) | i139;
        int i141 = (i139 & i140) + (i140 | i139);
        int i142 = -(-((~((i108 & iHashCode2) | (iHashCode2 ^ i108))) * 933));
        int i143 = i141 & i142;
        int i144 = (i142 ^ i141) | i143;
        int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
        int i146 = i145 * 31;
        int iIdentityHashCode4 = System.identityHashCode(aybVar);
        int i147 = aybVar.f54141u0;
        int i148 = i147 * 659;
        int i149 = -(-(i145 * (-20367)));
        int i150 = ((i148 ^ i149) | (i148 & i149)) << 1;
        int i151 = -((i149 & (~i148)) | ((~i149) & i148));
        int i152 = (i150 ^ i151) + ((i151 & i150) << 1);
        int i153 = ~i147;
        int i154 = i153 & (i153 | i147);
        int i155 = ~i146;
        int i156 = (i154 & i146) | (i154 & i155) | ((~i154) & i146);
        int i157 = ~i156;
        int i158 = (i156 | i157) & i157;
        int i159 = i155 ^ i147;
        int i160 = i155 & i147;
        int i161 = i158 | (~(i159 | i160));
        int i162 = i147 & iIdentityHashCode4;
        int i163 = ~((i147 ^ iIdentityHashCode4) | i162);
        int i164 = ((~i163) & i161) | ((~i161) & i163);
        int i165 = i161 & i163;
        int i166 = ((i165 & i164) | (i164 ^ i165)) * (-658);
        int i167 = i152 & i166;
        int i168 = (i166 | i152) & (~i167);
        int i169 = i167 << 1;
        int i170 = ((i168 | i169) << 1) - (i168 ^ i169);
        int i171 = (i146 | i155) & i155;
        int i172 = -(~((~((i171 & i147) | (i171 ^ i147))) * 658));
        int i173 = ((i170 & i172) + (i172 | i170)) - 1;
        int i174 = (i159 ^ i160) | (i159 & i160);
        int i175 = ~i174;
        int i176 = (i174 | i175) & i175;
        int i177 = (iIdentityHashCode4 | i147) & (~i162);
        int i178 = ~((i177 & i162) | (i177 ^ i162));
        int i179 = ((i176 & i178) | (i176 ^ i178)) * 658;
        int i180 = i173 & i179;
        int i181 = i180 + ((i179 ^ i173) | i180);
        int i182 = i181 * 31;
        int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{aybVar.v0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
        int iIdentityHashCode5 = System.identityHashCode(aybVar);
        int i183 = iIntValue2 * (-167);
        int i184 = i181 * (-5177);
        int i185 = i183 & i184;
        int i186 = ((i183 ^ i184) | i185) << 1;
        int i187 = -((i184 | i183) & (~i185));
        int i188 = (i186 & i187) + (i187 | i186);
        int i189 = ~iIntValue2;
        int i190 = ~i182;
        int i191 = (i190 | i182) & i190;
        int i192 = i189 & i191;
        int i193 = (~i192) & (i189 | i191);
        int i194 = (i192 & i193) | (i193 ^ i192);
        int i195 = ~i194;
        int i196 = (i194 | i195) & i195;
        int i197 = ~iIdentityHashCode5;
        int i198 = ~i197;
        int i199 = ~i190;
        int i200 = (i190 & i198) | (i197 & i199);
        int i201 = i190 & i197;
        int i202 = (i200 ^ i201) | (i200 & i201);
        int i203 = ~i202;
        int i204 = (i202 | i203) & i203;
        int i205 = -(-(((i196 & i204) | (i196 ^ i204)) * 168));
        int i206 = ((~i205) & i188) | ((~i188) & i205);
        int i207 = (i188 & i205) << 1;
        int i208 = (i206 ^ i207) + ((i207 & i206) << 1);
        int i209 = ~i189;
        int i210 = (i189 & i199) | (i190 & i209);
        int i211 = i190 & i189;
        int i212 = (i210 & i211) | (i210 ^ i211);
        int i213 = i212 ^ iIdentityHashCode5;
        int i214 = i212 & iIdentityHashCode5;
        int i215 = (~((i214 & i213) | (i213 ^ i214))) * 168;
        int i216 = i208 & i215;
        int i217 = -(-((i215 ^ i208) | i216));
        int i218 = (i216 & i217) + (i217 | i216);
        int i219 = (i189 & i198) | (i197 & i209);
        int i220 = i189 & i197;
        int i221 = (i219 & i220) | (i219 ^ i220);
        int i222 = ~i221;
        int i223 = (i221 | i222) & i222;
        int i224 = i189 ^ i182;
        int i225 = i182 & i189;
        int i226 = (i225 & i224) | (i224 ^ i225);
        int i227 = ~i226;
        int i228 = (i226 | i227) & i227;
        int i229 = (i228 & i223) | (i223 ^ i228);
        int i230 = (i191 ^ iIntValue2) | (iIntValue2 & i191);
        int i231 = ~((i230 & iIdentityHashCode5) | (i230 ^ iIdentityHashCode5));
        int i232 = ((i229 & i231) | (i229 ^ i231)) * 168;
        int i233 = (((i218 | i232) << 1) - (i232 ^ i218)) * 31;
        aya ayaVar = aybVar.F0;
        if (ayaVar != null) {
            int i234 = J0;
            int i235 = ((i234 & 41) - (~(i234 | 41))) - 1;
            I0 = i235 % 128;
            if (i235 % 2 != 0) {
                int i236 = 58 / 0;
                iHashCode3 = ayaVar.hashCode();
            } else {
                iHashCode3 = ayaVar.hashCode();
            }
        } else {
            int i237 = J0;
            int i238 = (i237 ^ 94) + ((i237 & 94) << 1);
            int i239 = (i238 ^ (-1)) + (i238 << 1);
            I0 = i239 % 128;
            int i240 = i239 % 2;
        }
        int i241 = -(~(-(-iHashCode3)));
        int i242 = (((i233 | i241) << 1) - (i241 ^ i233)) - 1;
        int i243 = J0;
        int i244 = i243 & 51;
        int i245 = (i243 | 51) & (~i244);
        int i246 = -(-(i244 << 1));
        int i247 = (i245 & i246) + (i245 | i246);
        I0 = i247 % 128;
        int i248 = i247 % 2;
        return Integer.valueOf(i242);
    }

    public static /* synthetic */ Object f(Object[] objArr) {
        ayb aybVar = (ayb) objArr[0];
        int i10 = J0 + 15;
        I0 = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{aybVar.f54138r0}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i12 = J0 + 121;
        I0 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 70 / 0;
        }
        return bArr;
    }

    public static /* synthetic */ ayb g(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int i10 = I0;
        int i11 = (i10 & (-100)) | ((~i10) & 99);
        int i12 = -(-((i10 & 99) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        J0 = i13 % 128;
        if (i13 % 2 == 0) {
            ((ayb) setCompoundDrawableTintBlendMode(new Object[]{bArr}, 1988863407, -1988863402, (int) System.currentTimeMillis())).F0 = (aya) aya.setY(new Object[]{bArr2}, 1338346932, -1338346929, (int) System.currentTimeMillis());
            throw null;
        }
        ayb aybVar = (ayb) setCompoundDrawableTintBlendMode(new Object[]{bArr}, 1988863407, -1988863402, (int) System.currentTimeMillis());
        aybVar.F0 = (aya) aya.setY(new Object[]{bArr2}, 1338346932, -1338346929, (int) System.currentTimeMillis());
        int i14 = J0;
        int i15 = (i14 & (-8)) | ((~i14) & 7);
        int i16 = -(-((i14 & 7) << 1));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        I0 = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 87 / 0;
        }
        return aybVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a9, code lost:
    
        if (r13 >= r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ab, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.ayb.J0;
        r8 = ((r7 | 91) << 1) - (r7 ^ 91);
        com.mypinpad.tsdk.isolation.ayb.I0 = r8 % 128;
        r8 = r8 % 2;
        com.mypinpad.tsdk.isolation.i2.a(new java.lang.Object[]{(byte[]) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, -1590605455, 1590605458, java.lang.System.identityHashCode(r1)), r1.f54144y0}, -94096710, 94096712, (int) java.lang.System.currentTimeMillis());
        r8 = r1.f54144y0;
        com.mypinpad.tsdk.isolation.i2.a(new java.lang.Object[]{java.lang.Integer.valueOf(r13), r8}, -1169926455, 1169926456, r13);
        com.mypinpad.tsdk.isolation.i2.a(new java.lang.Object[]{(short) -32126, r8}, -274425979, 274425979, (int) java.lang.System.currentTimeMillis());
        r2 = (com.mypinpad.tsdk.isolation.axw) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, 1096331686, -1096331684, java.lang.System.identityHashCode(r1));
        r5 = (byte[]) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, -1590605455, 1590605458, java.lang.System.identityHashCode(r1));
        r0 = -r0;
        r6 = r13 & r0;
        r0 = ((r0 | r13) & (~r6)) + (r6 << 1);
        r1 = (byte[]) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, 225711364, -225711353, java.lang.System.identityHashCode(r1));
        r0 = java.lang.Integer.valueOf(r0);
        r6 = new java.lang.Object[]{r2, r5, r0, r1};
        r1 = (com.mypinpad.tsdk.isolation.axw) r6[0];
        r5 = (byte[]) r6[1];
        r0 = r0.intValue();
        r6 = (byte[]) r6[3];
        r7 = (com.mypinpad.tsdk.isolation.aky) com.mypinpad.tsdk.isolation.g2.b(new java.lang.Object[]{r1}, 1625176659, -1625176659, (int) java.lang.System.currentTimeMillis());
        r3 = (com.mypinpad.tsdk.isolation.axr) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[0], -776185694, 776185694, (int) java.lang.System.currentTimeMillis());
        r4 = (com.mypinpad.tsdk.isolation.axr) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.axr) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[]{r3, r5}, 195178378, -195178377, java.lang.System.identityHashCode(r3)), java.lang.Integer.valueOf(r0)}, 1810000667, -1810000665, r0);
        r4 = (com.mypinpad.tsdk.isolation.axr) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.axr) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[]{r4}, 1477622592, -1477622588, java.lang.System.identityHashCode(r4)), 22}, -140131631, 140131638, 22);
        r3 = (byte[]) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[]{r4}, 1746305515, -1746305507, java.lang.System.identityHashCode(r4));
        r7.setCompoundDrawableTintBlendMode(r3, 0, r3.length);
        r2 = (com.mypinpad.tsdk.isolation.aky) com.mypinpad.tsdk.isolation.g2.b(new java.lang.Object[]{r1}, 1625176659, -1625176659, (int) java.lang.System.currentTimeMillis());
        r3 = (com.mypinpad.tsdk.isolation.axr) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[0], -776185694, 776185694, (int) java.lang.System.currentTimeMillis());
        r3 = (com.mypinpad.tsdk.isolation.axr) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.axr) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[]{r3, r5}, 195178378, -195178377, java.lang.System.identityHashCode(r3)), java.lang.Integer.valueOf(r0)}, 1810000667, -1810000665, r0);
        r4 = r2.setY();
        r13 = r4 * 934;
        r14 = r13 ^ (-21436);
        r13 = -(-((r13 & (-21436)) << 1));
        r16 = (r14 ^ r13) + ((r13 & r14) << 1);
        r13 = ~r4;
        r14 = (r13 | r4) & r13;
        r9 = ~r0;
        r18 = r14 ^ r9;
        r14 = r14 & r9;
        r14 = ~((r18 ^ r14) | (r18 & r14));
        r14 = (((-24) ^ r14) | ((-24) & r14)) * (-933);
        r19 = r16 & r14;
        r14 = (r16 ^ r14) | r19;
        r16 = ((r19 | r14) << 1) - (r19 ^ r14);
        r14 = (-24) & r9;
        r15 = (~r14) & ((-24) | r9);
        r14 = (r15 ^ r14) | (r14 & r15);
        r15 = ~r14;
        r14 = (r14 | r15) & r15;
        r20 = r4 & 23;
        r15 = ((-24) & r13) | r20;
        r4 = (-24) & r4;
        r15 = ~((r15 ^ r4) | (r15 & r4));
        r10 = ((~r14) & r15) | ((~r15) & r14);
        r11 = r14 & r15;
        r10 = -(~(((r10 & r11) | (r10 ^ r11)) * 933));
        r4 = r4 | (r13 & 23);
        r11 = ((((r16 ^ r10) + ((r16 & r10) << 1)) - 1) - (~((~((r4 & r20) | (r4 ^ r20))) * 933))) - 1;
        r3 = (com.mypinpad.tsdk.isolation.axr) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[]{r3, java.lang.Integer.valueOf(r11)}, -140131631, 140131638, r11);
        r3 = (byte[]) com.mypinpad.tsdk.isolation.axr.setDividerPadding(new java.lang.Object[]{r3}, 1746305515, -1746305507, java.lang.System.identityHashCode(r3));
        r11 = new com.mypinpad.tsdk.isolation.j2(r5, r6, (com.mypinpad.tsdk.isolation.aky) com.mypinpad.tsdk.isolation.g2.b(new java.lang.Object[]{r1}, 1625176659, -1625176659, (int) java.lang.System.currentTimeMillis()));
        com.mypinpad.tsdk.isolation.j2.a(new java.lang.Object[]{r11, java.lang.Integer.valueOf(r0)}, 593280510, -593280507, r0);
        com.mypinpad.tsdk.isolation.j2.a(new java.lang.Object[]{r11}, 446591282, -446591280, java.lang.System.identityHashCode(r11));
        r5 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.axw.setOnFocusChangeListener(new java.lang.Object[]{r1}, 1831336568, -1831336562, java.lang.System.identityHashCode(r1))).intValue();
        r6 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.axw.setOnFocusChangeListener(new java.lang.Object[]{r1}, -2053068740, 2053068745, java.lang.System.identityHashCode(r1))).intValue();
        r1 = 1 << ((java.lang.Integer) com.mypinpad.tsdk.isolation.axw.setOnFocusChangeListener(new java.lang.Object[]{r1}, 1500637371, -1500637367, java.lang.System.identityHashCode(r1))).intValue();
        r4 = -(-(r1 * (-317)));
        r13 = ((-319) & r4) + (r4 | (-319));
        r4 = ~r1;
        r10 = r4 & r9;
        r14 = (~r10) & (r4 | r9);
        r10 = -(-(((r10 & r14) | (r14 ^ r10)) * (-318)));
        r14 = r13 & r10;
        r10 = (r10 ^ r13) | r14;
        r13 = (r14 & r10) + (r10 | r14);
        r10 = r4 ^ r0;
        r14 = r4 & r0;
        r10 = ~((r10 & r14) | (r10 ^ r14));
        r14 = ~r9;
        r14 = (r14 & r9) | (r14 ^ r9);
        r14 = (r14 & r1) | (r14 ^ r1);
        r15 = ~r14;
        r14 = (r14 | r15) & r15;
        r15 = r10 & r14;
        r10 = (r10 | r14) & (~r15);
        r10 = -(-(((r10 & r15) | (r10 ^ r15)) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET));
        r12 = r13 ^ r10;
        r10 = ((r10 & r13) | r12) << 1;
        r12 = -r12;
        r14 = (r10 ^ r12) + ((r10 & r12) << 1);
        r9 = r9 & (r9 | r0);
        r4 = r4 | r9;
        r10 = ~r4;
        r4 = (r4 & r10) | (r10 ^ r4);
        r10 = ~r4;
        r4 = (r4 | r10) & r10;
        r1 = r1 | ((-1) ^ r1);
        r10 = r1 & r0;
        r1 = (r1 | r0) & (~r10);
        r1 = ~((r1 & r10) | (r1 ^ r10));
        r10 = ((~r1) & r4) | ((~r4) & r1);
        r1 = r1 & r4;
        r1 = ((r1 & r10) | (r10 ^ r1)) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET;
        r4 = r14 & r1;
        r1 = r1 | r14;
        r10 = (r4 ^ r1) + ((r1 & r4) << 1);
        r1 = com.mypinpad.tsdk.isolation.k2.f56745a;
        r12 = ((r1 | 89) << 1) - (r1 ^ 89);
        com.mypinpad.tsdk.isolation.k2.f56746b = r12 % 128;
        r1 = 2;
        r12 = r12 % 2;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0403, code lost:
    
        if (r4 >= r5) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0405, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.k2.f56746b;
        r13 = r12 + 27;
        r14 = r13 % 128;
        com.mypinpad.tsdk.isolation.k2.f56745a = r14;
        r13 = r13 % r1;
        r1 = r5 * 949;
        r15 = (947 & r1) + (r1 | 947);
        r1 = ~r5;
        r13 = (r1 | r5) & r1;
        r22 = r5;
        r5 = r13 & r0;
        r16 = r8;
        r8 = (~r5) & (r13 | r0);
        r5 = (~((r5 & r8) | (r8 ^ r5))) * (-948);
        r8 = r15 & r5;
        r5 = (r5 | r15) & (~r8);
        r8 = -(-(r8 << 1));
        r15 = (r5 ^ r8) + ((r5 & r8) << 1);
        r5 = (~r9) & r1;
        r8 = ~r1;
        r5 = r5 | (r9 & r8);
        r13 = r1 & r9;
        r5 = (~((r5 ^ r13) | (r5 & r13))) * (-948);
        r13 = r15 & r5;
        r25 = r0;
        r0 = ((~r13) & (r5 | r15)) + (r13 << 1);
        r1 = -(-((r1 | r8) * 948));
        r5 = r0 & r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x045c, code lost:
    
        if (r4 >= (r5 + ((r0 ^ r1) | r5))) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x045e, code lost:
    
        r0 = ((r14 | 57) << 1) - (r14 ^ 57);
        com.mypinpad.tsdk.isolation.k2.f56746b = r0 % 128;
        r0 = r0 % 2;
        r0 = r14 & 91;
        r1 = (~r0) & (r14 | 91);
        r0 = r0 << 1;
        r8 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.k2.f56746b = r8 % 128;
        r8 = r8 % 2;
        r0 = 3;
        r1 = 1;
        r5 = 2;
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0484, code lost:
    
        r0 = r12 & 101;
        r1 = 1;
        r0 = (r0 - (~((r12 ^ 101) | r0))) - 1;
        com.mypinpad.tsdk.isolation.k2.f56745a = r0 % 128;
        r5 = 2;
        r0 = r0 % 2;
        r0 = 3;
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0496, code lost:
    
        r8 = new java.lang.Object[r0];
        r8[0] = r11;
        r8[r1] = r3;
        r8[r5] = java.lang.Boolean.valueOf(r21);
        com.mypinpad.tsdk.isolation.j2.a(r8, -945162936, 945162936, java.lang.System.identityHashCode(r11));
        r13 = new java.lang.Object[r5];
        r13[0] = java.lang.Short.valueOf((short) r4);
        r13[r1] = r3;
        com.mypinpad.tsdk.isolation.ber.setDividerPadding(r13, -522993227, 522993230, (int) java.lang.System.currentTimeMillis());
        r1 = com.mypinpad.tsdk.isolation.k2.f56745a;
        r5 = (((r1 ^ 1) | (r1 & 1)) << 1) - (((~r1) & 1) | (r1 & (-2)));
        com.mypinpad.tsdk.isolation.k2.f56746b = r5 % 128;
        r5 = r5 % 2;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x04df, code lost:
    
        if (r1 >= r10) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x04e1, code lost:
    
        r3[22] = (byte) r1;
        r2.setCompoundDrawableTintBlendMode(r3, 0, r3.length);
        r2.setCompoundDrawableTintBlendMode(r3, 23);
        r1 = r1 - 64;
        r1 = ((r1 & 65) << 1) + (r1 ^ 65);
        r5 = com.mypinpad.tsdk.isolation.k2.f56746b;
        r12 = (r5 & 115) + (r5 | 115);
        com.mypinpad.tsdk.isolation.k2.f56745a = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0507, code lost:
    
        r7.setCompoundDrawableTintBlendMode(r3, 23, r6);
        r5 = ((r4 & (-102)) - (~(r4 | (-102)))) - 1;
        r12 = r5 ^ 103;
        r5 = -(-((r5 & 103) << 1));
        r4 = (r12 ^ r5) + ((r5 & r12) << 1);
        r5 = com.mypinpad.tsdk.isolation.k2.f56745a + 113;
        com.mypinpad.tsdk.isolation.k2.f56746b = r5 % 128;
        r5 = r5 % 2;
        r5 = r22;
        r0 = r25;
        r8 = r16;
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0536, code lost:
    
        r16 = r8;
        r0 = new byte[r7.setY()];
        r7.setCompoundDrawableTintBlendMode(r0, 0);
        r2 = com.mypinpad.tsdk.isolation.k2.f56745a + 49;
        com.mypinpad.tsdk.isolation.k2.f56746b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x054c, code lost:
    
        if ((r2 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x054e, code lost:
    
        r2 = 74 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0551, code lost:
    
        com.mypinpad.tsdk.isolation.i2.a(new java.lang.Object[]{r0, r16}, -94096710, 94096712, (int) java.lang.System.currentTimeMillis());
        r0 = new byte[r16.setY()];
        r16.setCompoundDrawableTintBlendMode(r0, 0);
        r1 = com.mypinpad.tsdk.isolation.ayb.J0;
        r2 = r1 ^ 69;
        r1 = ((r1 & 69) | r2) << 1;
        r2 = -r2;
        r4 = (r1 ^ r2) + ((r1 & r2) << 1);
        com.mypinpad.tsdk.isolation.ayb.I0 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0588, code lost:
    
        r0 = r13 * 2;
        r4 = (byte[]) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1, java.lang.Integer.valueOf(r0)}, -1632130339, 1632130349, r0);
        r8 = -(-(r13 * (-334)));
        r10 = ((-167) & r8) + (r8 | (-167));
        r8 = ~r0;
        r11 = ~(((-2) ^ r8) | ((-2) & r8));
        r12 = r8 ^ r13;
        r14 = r8 & r13;
        r12 = (r12 ^ r14) | (r12 & r14);
        r14 = ~r12;
        r12 = (r12 | r14) & r14;
        r11 = -(-(((r11 & r12) | (r11 ^ r12)) * 336));
        r12 = r10 & r11;
        r10 = -(-((r10 ^ r11) | r12));
        r11 = ((r12 | r10) << 1) - (r10 ^ r12);
        r10 = ~((r0 ^ 1) | (r0 & 1));
        r12 = ~(r13 | 1);
        r14 = ((~r12) & r10) | ((~r10) & r12);
        r10 = r10 & r12;
        r10 = -(-(((r10 & r14) | (r14 ^ r10)) * (-168)));
        r12 = r11 & r10;
        r10 = (r10 ^ r11) | r12;
        r11 = (r12 ^ r10) + ((r10 & r12) << 1);
        r0 = (r0 | r8) & r8;
        r8 = ~r13;
        r8 = ~((r8 & 1) | (r8 ^ 1));
        r10 = r0 & r8;
        r0 = -(~((((r0 | r8) & (~r10)) | r10) * 168));
        r9 = (-2) - ((-1) ^ ((r11 ^ r0) + ((r0 & r11) << 1)));
        r3 = (byte[]) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1, java.lang.Integer.valueOf(r9)}, -1632130339, 1632130349, r9);
        com.mypinpad.tsdk.isolation.i2.a(new java.lang.Object[]{(byte[]) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, -1590605455, 1590605458, java.lang.System.identityHashCode(r1)), r1.f54144y0}, -94096710, 94096712, (int) java.lang.System.currentTimeMillis());
        r1 = r1.f54144y0;
        com.mypinpad.tsdk.isolation.i2.a(new java.lang.Object[]{java.lang.Integer.valueOf(r13), r1}, -1169926455, 1169926456, r13);
        com.mypinpad.tsdk.isolation.i2.a(new java.lang.Object[]{(short) -31869, r1}, -274425979, 274425979, (int) java.lang.System.currentTimeMillis());
        com.mypinpad.tsdk.isolation.i2.a(new java.lang.Object[]{r4, r1}, -94096710, 94096712, (int) java.lang.System.currentTimeMillis());
        com.mypinpad.tsdk.isolation.i2.a(new java.lang.Object[]{r3, r1}, -94096710, 94096712, (int) java.lang.System.currentTimeMillis());
        r2 = new byte[r1.setY()];
        r1.setCompoundDrawableTintBlendMode(r2, 0);
        r0 = com.mypinpad.tsdk.isolation.ayb.J0;
        r1 = ((r0 ^ 68) + ((r0 & 68) << 1)) - 1;
        com.mypinpad.tsdk.isolation.ayb.I0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x06ae, code lost:
    
        if ((r1 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x06b4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0081, code lost:
    
        if (r13 >= r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 2522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ayb.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static ayb setOnFocusChangeListener(Object obj) throws IOException {
        return (ayb) setCompoundDrawableTintBlendMode(new Object[]{obj}, 1988863407, -1988863402, (int) System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, 2044073327, -2044073321, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 732674643, -732674635, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ayc, com.mypinpad.tsdk.isolation.ben
    public final byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -1204933613, 1204933622, System.identityHashCode(this));
    }

    public final aya setY() {
        return (aya) setCompoundDrawableTintBlendMode(new Object[]{this}, 1007144611, -1007144607, System.identityHashCode(this));
    }

    public static ayb setOnFocusChangeListener(byte[] bArr, byte[] bArr2) throws IOException {
        return (ayb) setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2}, 1494829255, -1494829254, (int) System.currentTimeMillis());
    }
}
