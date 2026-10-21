package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.security.cert.CRLException;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public final class i1 extends g1 {
    public static int F0 = 0;
    public static int G0 = 1;
    public volatile int E0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f56322w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public h1 f56323x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public volatile boolean f56324y0;

    public static class a extends CRLException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Throwable f56325p0;

        public a(IOException iOException) {
            this.f56325p0 = iOException;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return ((a) objArr[0]).f56325p0;
        }

        public a(String str, Exception exc) {
            super(str);
            this.f56325p0 = exc;
        }
    }

    public i1(aow aowVar, aix aixVar) throws CRLException {
        super(aowVar, aixVar, (String) d(new Object[]{aixVar}, -1178992839, 1178992840, (int) System.currentTimeMillis()), (byte[]) d(new Object[]{aixVar}, 224698798, -224698796, (int) System.currentTimeMillis()), ((Boolean) d(new Object[]{aixVar}, 1921962903, -1921962900, (int) System.currentTimeMillis())).booleanValue());
        this.f56322w0 = new Object();
    }

    public static /* synthetic */ Integer c(Object[] objArr) {
        i1 i1Var = (i1) objArr[0];
        int i10 = G0;
        int i11 = i10 & 81;
        int i12 = (i11 - (~((i10 ^ 81) | i11))) - 1;
        F0 = i12 % 128;
        if (i12 % 2 != 0) {
            boolean z10 = i1Var.f56324y0;
            throw null;
        }
        if (!i1Var.f56324y0) {
            i1Var.E0 = ((h1) d(new Object[]{i1Var}, 134355398, -134355394, System.identityHashCode(i1Var))).hashCode();
            i1Var.f56324y0 = true;
            int i13 = G0;
            int i14 = i13 & 41;
            int i15 = (i13 | 41) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 & i16) + (i15 | i16);
            F0 = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = i1Var.E0;
        int i20 = G0;
        int i21 = (i20 & 59) + (i20 | 59);
        F0 = i21 % 128;
        int i22 = i21 % 2;
        return Integer.valueOf(i19);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0373  */
    /* JADX WARN: Code duplicated, block: B:109:0x0383  */
    /* JADX WARN: Code duplicated, block: B:117:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:118:0x03a2 A[Catch: Exception -> 0x035d, PHI: r11
      0x03a2: PHI (r11v31 com.mypinpad.tsdk.i.add) = (r11v16 com.mypinpad.tsdk.i.add), (r11v41 com.mypinpad.tsdk.i.add) binds: [B:106:0x0371, B:99:0x0358] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x035d, blocks: (B:96:0x0343, B:98:0x0357, B:118:0x03a2, B:110:0x0385, B:105:0x035f), top: B:132:0x0341 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00de  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:32:0x0103  */
    /* JADX WARN: Code duplicated, block: B:34:0x0120  */
    /* JADX WARN: Code duplicated, block: B:35:0x013e  */
    /* JADX WARN: Code duplicated, block: B:40:0x018c  */
    public static Object d(Object[] objArr, int i10, int i11, int i12) throws CRLException {
        add addVar;
        int i13;
        int i14;
        a aVar;
        byte[] bArr;
        h1 h1Var;
        boolean zEquals;
        acz onFocusChangeListener;
        int i15;
        int i16;
        int i17 = ~i11;
        int i18 = i17 | i10;
        int i19 = (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i18 | i12)) * 623) + (i11 * (-622)) + (i10 * 624);
        int i20 = (~(i17 | i12)) | (~i18);
        byte[] bArr2 = null;
        switch ((((~(i10 | i12)) | i20) * 623) + i19) {
            case 1:
                aix aixVar = (aix) objArr[0];
                int i21 = G0 + 75;
                F0 = i21 % 128;
                int i22 = i21 % 2;
                try {
                    String str = (String) l1.a(new Object[]{aixVar.setDividerPadding()}, 1362494079, -1362494077, (int) System.currentTimeMillis());
                    int i23 = G0;
                    int i24 = i23 ^ 17;
                    int i25 = ((i23 & 17) | i24) << 1;
                    int i26 = -i24;
                    int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                    F0 = i27 % 128;
                    if (i27 % 2 == 0) {
                        return str;
                    }
                    throw null;
                } catch (Exception e5) {
                    StringBuilder sb2 = new StringBuilder("CRL contents invalid: ");
                    sb2.append(e5.getMessage());
                    throw new a(sb2.toString(), e5);
                }
            case 2:
                aix aixVar2 = (aix) objArr[0];
                int i28 = F0;
                int i29 = (i28 ^ 89) + ((i28 & 89) << 1);
                G0 = i29 % 128;
                try {
                    if (i29 % 2 != 0) {
                        aiw dividerPadding = aixVar2.setDividerPadding();
                        addVar = (add) aiw.setOnFocusChangeListener(new Object[]{dividerPadding}, -513456911, 513456913, System.identityHashCode(dividerPadding));
                        if (addVar == null) {
                            int i30 = F0;
                            int i31 = i30 ^ 31;
                            i13 = (((i30 & 31) | i31) << 1) - i31;
                            int i32 = i13 % 128;
                            G0 = i32;
                            if (i13 % 2 == 0) {
                                int i33 = 43 / 0;
                            }
                            int i34 = (i32 & (-100)) | ((~i32) & 99);
                            int i35 = -(-((i32 & 99) << 1));
                            i14 = ((i34 | i35) << 1) - (i34 ^ i35);
                            F0 = i14 % 128;
                            if (i14 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            ady adyVarUiMessageCallbackKtWhenMappings = addVar.UiMessageCallbackKtWhenMappings();
                            bArr2 = (byte[]) adw.setOnLongClickListener(new Object[]{adyVarUiMessageCallbackKtWhenMappings, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(adyVarUiMessageCallbackKtWhenMappings));
                            int i36 = F0;
                            int i37 = ((i36 | 115) << 1) - (i36 ^ 115);
                            G0 = i37 % 128;
                            int i38 = i37 % 2;
                        }
                        break;
                    } else {
                        aiw dividerPadding2 = aixVar2.setDividerPadding();
                        addVar = (add) aiw.setOnFocusChangeListener(new Object[]{dividerPadding2}, -513456911, 513456913, System.identityHashCode(dividerPadding2));
                        int i39 = 43 / 0;
                        if (addVar == null) {
                            int i310 = F0;
                            int i311 = i310 ^ 31;
                            i13 = (((i310 & 31) | i311) << 1) - i311;
                            int i312 = i13 % 128;
                            G0 = i312;
                            if (i13 % 2 == 0) {
                                int i313 = 43 / 0;
                            }
                            int i314 = (i312 & (-100)) | ((~i312) & 99);
                            int i315 = -(-((i312 & 99) << 1));
                            i14 = ((i314 | i315) << 1) - (i314 ^ i315);
                            F0 = i14 % 128;
                            if (i14 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            ady adyVarUiMessageCallbackKtWhenMappings2 = addVar.UiMessageCallbackKtWhenMappings();
                            bArr2 = (byte[]) adw.setOnLongClickListener(new Object[]{adyVarUiMessageCallbackKtWhenMappings2, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(adyVarUiMessageCallbackKtWhenMappings2));
                            int i316 = F0;
                            int i317 = ((i316 | 115) << 1) - (i316 ^ 115);
                            G0 = i317 % 128;
                            int i318 = i317 % 2;
                        }
                        break;
                    }
                    return bArr2;
                } catch (Exception e7) {
                    throw new CRLException("CRL contents invalid: ".concat(String.valueOf(e7)));
                }
            case 3:
                aix aixVar3 = (aix) objArr[0];
                int i40 = F0;
                int i41 = i40 & 49;
                int i42 = -(-((i40 ^ 49) | i41));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                G0 = i43 % 128;
                try {
                    if (i43 % 2 == 0) {
                        adu aduVar = ajc.setOnLongClickListener;
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    adu aduVar2 = ajc.setOnLongClickListener;
                    byte[] bArr3 = (byte[]) g1.a(new Object[]{aixVar3, (String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar2}, 412071809, -412071801, System.identityHashCode(aduVar2))}, 637630816, -637630812, (int) System.currentTimeMillis());
                    if (bArr3 == null) {
                        int i44 = F0;
                        int i45 = i44 ^ 55;
                        int i46 = -(-((i44 & 55) << 1));
                        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                        G0 = i47 % 128;
                        if (i47 % 2 != 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                    aji ajiVar = (aji) aji.setCompoundDrawableTintBlendMode(new Object[]{bArr3}, -1073045403, 1073045404, (int) System.currentTimeMillis());
                    boolean zBooleanValue = ((Boolean) aji.setCompoundDrawableTintBlendMode(new Object[]{ajiVar}, -959008302, 959008306, System.identityHashCode(ajiVar))).booleanValue();
                    int i48 = F0;
                    int i49 = ((i48 | 13) << 1) - (i48 ^ 13);
                    G0 = i49 % 128;
                    if (i49 % 2 != 0) {
                        return Boolean.valueOf(zBooleanValue);
                    }
                    throw null;
                } catch (Exception e10) {
                    c1 c1Var = new c1("Exception reading IssuingDistributionPoint");
                    c1Var.f54758p0 = e10;
                    throw c1Var;
                }
            case 4:
                i1 i1Var = (i1) objArr[0];
                synchronized (i1Var.f56322w0) {
                    h1 h1Var2 = i1Var.f56323x0;
                    if (h1Var2 != null) {
                        return h1Var2;
                    }
                    try {
                        aix aixVar4 = i1Var.f55595q0;
                        bArr = (byte[]) adw.setOnLongClickListener(new Object[]{aixVar4, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(aixVar4));
                        aVar = null;
                    } catch (IOException e11) {
                        aVar = new a(e11);
                        bArr = null;
                    }
                    h1 h1Var3 = new h1(i1Var.f55594p0, i1Var.f55595q0, i1Var.f55596r0, i1Var.f55597s0, i1Var.f55598t0, bArr, aVar);
                    synchronized (i1Var.f56322w0) {
                        try {
                            if (i1Var.f56323x0 == null) {
                                i1Var.f56323x0 = h1Var3;
                            }
                            h1Var = i1Var.f56323x0;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    return h1Var;
                }
            case 5:
                return c(objArr);
            case 6:
                i1 i1Var2 = (i1) objArr[0];
                int i50 = G0;
                int i51 = i50 | 11;
                int i52 = (i51 << 1) - ((~(i50 & 11)) & i51);
                F0 = i52 % 128;
                int i53 = i52 % 2;
                byte[] bArr4 = (byte[]) bek.setOnFocusChangeListener(new Object[]{((h1) d(new Object[]{i1Var2}, 134355398, -134355394, System.identityHashCode(i1Var2))).getEncoded()}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i54 = G0;
                int i55 = i54 & 23;
                int i56 = i55 + ((i54 ^ 23) | i55);
                F0 = i56 % 128;
                int i57 = i56 % 2;
                return bArr4;
            default:
                i1 i1Var3 = (i1) objArr[0];
                Object obj = objArr[1];
                int i58 = G0;
                int i59 = i58 & 61;
                int i60 = (i58 ^ 61) | i59;
                int i61 = (i59 & i60) + (i59 | i60);
                int i62 = i61 % 128;
                F0 = i62;
                int i63 = i61 % 2;
                if (i1Var3 == obj) {
                    int i64 = ((i62 & 70) + (i62 | 70)) - 1;
                    G0 = i64 % 128;
                    int i65 = i64 % 2;
                    int i66 = (i62 & 15) + (i62 | 15);
                    G0 = i66 % 128;
                    int i67 = i66 % 2;
                    return Boolean.TRUE;
                }
                if (!(!(obj instanceof i1))) {
                    int i68 = (i58 ^ 3) + ((i58 & 3) << 1);
                    F0 = i68 % 128;
                    i1 i1Var4 = (i1) obj;
                    if (i68 % 2 != 0) {
                        boolean z10 = i1Var3.f56324y0;
                        throw null;
                    }
                    if (i1Var3.f56324y0 && i1Var4.f56324y0) {
                        int i69 = G0;
                        int i70 = i69 | 77;
                        int i71 = i70 << 1;
                        int i72 = -((~(i69 & 77)) & i70);
                        int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                        F0 = i73 % 128;
                        int i74 = i73 % 2;
                        if (i1Var3.E0 != i1Var4.E0) {
                            int i75 = F0;
                            int i76 = i75 & 99;
                            int i77 = -(-(i75 | 99));
                            int i78 = (i76 & i77) + (i77 | i76);
                            int i79 = i78 % 128;
                            G0 = i79;
                            int i80 = i78 % 2;
                            int i81 = ((i79 | 105) << 1) - (i79 ^ 105);
                            F0 = i81 % 128;
                            int i82 = i81 % 2;
                            return Boolean.FALSE;
                        }
                        zEquals = ((h1) d(new Object[]{i1Var3}, 134355398, -134355394, System.identityHashCode(i1Var3))).equals((h1) d(new Object[]{i1Var4}, 134355398, -134355394, System.identityHashCode(i1Var4)));
                        int i83 = F0;
                        i16 = (i83 & 37) + (i83 | 37);
                        G0 = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        if (i1Var3.f56323x0 != null) {
                            int i84 = G0;
                            int i85 = i84 & 57;
                            int i86 = (i84 | 57) & (~i85);
                            int i87 = -(-(i85 << 1));
                            int i88 = ((i86 | i87) << 1) - (i86 ^ i87);
                            F0 = i88 % 128;
                            if (i88 % 2 != 0) {
                                h1 h1Var4 = i1Var4.f56323x0;
                                throw null;
                            }
                            if (i1Var4.f56323x0 == null) {
                                onFocusChangeListener = i1Var3.f55595q0.setOnFocusChangeListener();
                                if (onFocusChangeListener != null) {
                                    int i89 = G0;
                                    int i90 = i89 & 107;
                                    int i91 = (i89 | 107) & (~i90);
                                    int i92 = -(-(i90 << 1));
                                    i15 = ((i91 | i92) << 1) - (i91 ^ i92);
                                    F0 = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        ((Boolean) ady.setNavigationOnClickListener(new Object[]{onFocusChangeListener, i1Var4.f55595q0.setOnFocusChangeListener()}, -109201153, 109201153, System.identityHashCode(onFocusChangeListener))).booleanValue();
                                        throw null;
                                    }
                                    if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{onFocusChangeListener, i1Var4.f55595q0.setOnFocusChangeListener()}, -109201153, 109201153, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                                        int i93 = F0;
                                        int i94 = ((i93 | 60) << 1) - (i93 ^ 60);
                                        int i95 = (i94 ^ (-1)) + (i94 << 1);
                                        int i96 = i95 % 128;
                                        G0 = i96;
                                        int i97 = i95 % 2;
                                        int i98 = ((i96 | 65) << 1) - (i96 ^ 65);
                                        F0 = i98 % 128;
                                        int i99 = i98 % 2;
                                        return Boolean.FALSE;
                                    }
                                }
                            }
                        } else {
                            onFocusChangeListener = i1Var3.f55595q0.setOnFocusChangeListener();
                            if (onFocusChangeListener != null) {
                                int i810 = G0;
                                int i910 = i810 & 107;
                                int i911 = (i810 | 107) & (~i910);
                                int i912 = -(-(i910 << 1));
                                i15 = ((i911 | i912) << 1) - (i911 ^ i912);
                                F0 = i15 % 128;
                                if (i15 % 2 == 0) {
                                    ((Boolean) ady.setNavigationOnClickListener(new Object[]{onFocusChangeListener, i1Var4.f55595q0.setOnFocusChangeListener()}, -109201153, 109201153, System.identityHashCode(onFocusChangeListener))).booleanValue();
                                    throw null;
                                }
                                if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{onFocusChangeListener, i1Var4.f55595q0.setOnFocusChangeListener()}, -109201153, 109201153, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                                    int i913 = F0;
                                    int i914 = ((i913 | 60) << 1) - (i913 ^ 60);
                                    int i915 = (i914 ^ (-1)) + (i914 << 1);
                                    int i916 = i915 % 128;
                                    G0 = i916;
                                    int i917 = i915 % 2;
                                    int i918 = ((i916 | 65) << 1) - (i916 ^ 65);
                                    F0 = i918 % 128;
                                    int i919 = i918 % 2;
                                    return Boolean.FALSE;
                                }
                            }
                        }
                        zEquals = ((h1) d(new Object[]{i1Var3}, 134355398, -134355394, System.identityHashCode(i1Var3))).equals((h1) d(new Object[]{i1Var4}, 134355398, -134355394, System.identityHashCode(i1Var4)));
                        int i811 = F0;
                        i16 = (i811 & 37) + (i811 | 37);
                        G0 = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                    }
                } else {
                    zEquals = ((h1) d(new Object[]{i1Var3}, 134355398, -134355394, System.identityHashCode(i1Var3))).equals(obj);
                    int i100 = F0;
                    int i101 = ((i100 | 1) << 1) - (i100 ^ 1);
                    G0 = i101 % 128;
                    int i102 = i101 % 2;
                }
                return Boolean.valueOf(zEquals);
        }
    }

    @Override // java.security.cert.X509CRL
    public final boolean equals(Object obj) {
        return ((Boolean) d(new Object[]{this, obj}, -2041712393, 2041712393, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() throws CRLException {
        return (byte[]) d(new Object[]{this}, 432732229, -432732223, System.identityHashCode(this));
    }

    @Override // java.security.cert.X509CRL
    public final int hashCode() {
        return ((Integer) d(new Object[]{this}, -784879382, 784879387, System.identityHashCode(this))).intValue();
    }
}
