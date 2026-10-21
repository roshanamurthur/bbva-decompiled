package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ady extends adw {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52521r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52522s0 = 1;

    /* JADX WARN: Code duplicated, block: B:36:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x0207  */
    public static /* synthetic */ Object setNavigationOnClickListener(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = i13 | i11;
        int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i16 = ~(i14 | i12);
        int i17 = ~i12;
        switch (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15) {
            case 1:
                objValueOf = (ady) objArr[0];
                int i18 = f52521r0;
                int i19 = (((i18 | 28) << 1) - (i18 ^ 28)) - 1;
                int i20 = i19 % 128;
                f52522s0 = i20;
                int i21 = i19 % 2;
                int i22 = ((i20 ^ 15) | (i20 & 15)) << 1;
                int i23 = -(((~i20) & 15) | (i20 & (-16)));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f52521r0 = i24 % 128;
                if (i24 % 2 != 0) {
                    throw null;
                }
                break;
            case 2:
                adq adqVar = new adq((byte[]) objArr[0]);
                try {
                    objValueOf = (ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar));
                    if (adqVar.available() != 0) {
                        throw new IOException("Extra data detected in stream");
                    }
                    int i25 = f52521r0 + 93;
                    f52522s0 = i25 % 128;
                    if (i25 % 2 == 0) {
                        throw null;
                    }
                } catch (ClassCastException unused) {
                    throw new IOException("cannot recognise object in stream");
                }
            case 3:
                ady adyVar = (ady) objArr[0];
                add addVar = (add) objArr[1];
                int i26 = f52522s0;
                int i27 = (((i26 ^ 71) | (i26 & 71)) << 1) - ((i26 & (-72)) | ((~i26) & 71));
                f52521r0 = i27 % 128;
                int i28 = i27 % 2;
                if (adyVar == addVar) {
                    int i29 = f52521r0;
                    int i30 = (i29 ^ 25) + ((i29 & 25) << 1);
                    f52522s0 = i30 % 128;
                    int i31 = i30 % 2;
                    objValueOf = Boolean.TRUE;
                } else {
                    int i32 = i26 + 17;
                    int i33 = i32 % 128;
                    f52521r0 = i33;
                    int i34 = i32 % 2;
                    if (addVar != null) {
                        int i35 = i33 + 35;
                        f52522s0 = i35 % 128;
                        int i36 = i35 % 2;
                        ady adyVarUiMessageCallbackKtWhenMappings = addVar.UiMessageCallbackKtWhenMappings();
                        if (i36 == 0) {
                            adyVar.d(adyVarUiMessageCallbackKtWhenMappings);
                            throw null;
                        }
                        if (adyVar.d(adyVarUiMessageCallbackKtWhenMappings)) {
                            int i210 = f52521r0;
                            int i37 = (i210 ^ 25) + ((i210 & 25) << 1);
                            f52522s0 = i37 % 128;
                            int i38 = i37 % 2;
                            objValueOf = Boolean.TRUE;
                        }
                    }
                    int i39 = f52522s0;
                    int i40 = i39 & 3;
                    int i41 = (i39 ^ 3) | i40;
                    int i42 = (i40 & i41) + (i41 | i40);
                    f52521r0 = i42 % 128;
                    if (i42 % 2 != 0) {
                        int i43 = 42 / 0;
                    }
                    objValueOf = Boolean.FALSE;
                }
                break;
            case 4:
                ady adyVar2 = (ady) objArr[0];
                OutputStream outputStream = (OutputStream) objArr[1];
                int i44 = f52522s0;
                int i45 = i44 & 47;
                int i46 = ((i44 ^ 47) | i45) << 1;
                int i47 = -((i44 | 47) & (~i45));
                int i48 = (i46 & i47) + (i47 | i46);
                f52521r0 = i48 % 128;
                int i49 = i48 % 2;
                ((aeb) aeb.setX(new Object[]{outputStream}, -2145123870, 2145123873, (int) System.currentTimeMillis())).m(adyVar2);
                int i50 = f52522s0;
                int i51 = i50 ^ 15;
                int i52 = ((i50 & 15) | i51) << 1;
                int i53 = -i51;
                int i54 = (i52 & i53) + (i52 | i53);
                f52521r0 = i54 % 128;
                int i55 = i54 % 2;
                return null;
            case 5:
                ady adyVar3 = (ady) objArr[0];
                Object obj = objArr[1];
                int i56 = f52522s0;
                int i57 = (i56 & (-126)) | ((~i56) & 125);
                int i58 = (i56 & 125) << 1;
                int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                int i60 = i59 % 128;
                f52521r0 = i60;
                int i61 = i59 % 2;
                if (adyVar3 == obj) {
                    int i62 = (i56 | 7) << 1;
                    int i63 = -(i56 ^ 7);
                    int i64 = (i62 ^ i63) + ((i62 & i63) << 1);
                    f52521r0 = i64 % 128;
                    boolean z10 = i64 % 2 == 0;
                    int i65 = i56 & 115;
                    int i66 = i65 + ((i56 ^ 115) | i65);
                    f52521r0 = i66 % 128;
                    if (i66 % 2 != 0) {
                        int i67 = 13 / 0;
                    }
                    objValueOf = Boolean.valueOf(z10);
                } else if (!(obj instanceof add)) {
                    int i68 = f52521r0;
                    int i69 = (i68 & 89) + (i68 | 89);
                    f52522s0 = i69 % 128;
                    int i70 = i69 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    int i71 = i60 ^ 109;
                    int i72 = (i60 & 109) << 1;
                    int i73 = (i71 ^ i72) + ((i71 & i72) << 1);
                    f52522s0 = i73 % 128;
                    int i74 = i73 % 2;
                    if (!adyVar3.d(((add) obj).UiMessageCallbackKtWhenMappings())) {
                        int i610 = f52521r0;
                        int i611 = (i610 & 89) + (i610 | 89);
                        f52522s0 = i611 % 128;
                        int i75 = i611 % 2;
                        objValueOf = Boolean.FALSE;
                    } else {
                        int i76 = f52522s0;
                        int i77 = (i76 ^ 21) + ((i76 & 21) << 1);
                        int i78 = i77 % 128;
                        f52521r0 = i78;
                        int i79 = i77 % 2;
                        int i80 = (-2) - ((i78 + 110) ^ (-1));
                        f52522s0 = i80 % 128;
                        int i81 = i80 % 2;
                        objValueOf = Boolean.TRUE;
                    }
                }
                break;
            case 6:
                ady adyVar4 = (ady) objArr[0];
                OutputStream outputStream2 = (OutputStream) objArr[1];
                String str = (String) objArr[2];
                int i82 = f52521r0;
                int i83 = (i82 ^ 119) + ((i82 & 119) << 1);
                f52522s0 = i83 % 128;
                int i84 = i83 % 2;
                ((aeb) aeb.setX(new Object[]{outputStream2, str}, 20425772, -20425765, (int) System.currentTimeMillis())).m(adyVar4);
                int i85 = f52522s0;
                int i86 = i85 & 99;
                int i87 = -(-((i85 ^ 99) | i86));
                int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                f52521r0 = i88 % 128;
                if (i88 % 2 == 0) {
                    return null;
                }
                throw null;
            default:
                ady adyVar5 = (ady) objArr[0];
                ady adyVar6 = (ady) objArr[1];
                int i89 = f52521r0;
                int i90 = i89 & 53;
                int i91 = (i89 | 53) & (~i90);
                int i92 = -(-(i90 << 1));
                int i93 = ((i91 | i92) << 1) - (i91 ^ i92);
                f52522s0 = i93 % 128;
                if (i93 % 2 == 0) {
                    throw null;
                }
                if (adyVar5 == adyVar6 || adyVar5.d(adyVar6)) {
                    int i94 = f52521r0;
                    int i95 = i94 & 19;
                    int i96 = -(-((i94 ^ 19) | i95));
                    int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                    f52522s0 = i97 % 128;
                    if (i97 % 2 == 0) {
                        int i98 = 22 / 0;
                    }
                    objValueOf = Boolean.TRUE;
                } else {
                    int i99 = f52521r0;
                    int i100 = i99 & 81;
                    int i101 = (((i99 | 81) & (~i100)) - (~(-(-(i100 << 1))))) - 1;
                    f52522s0 = i101 % 128;
                    if (i101 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                }
                break;
                break;
        }
        return objValueOf;
    }

    public static ady setOnDragListener(byte[] bArr) throws IOException {
        return (ady) setNavigationOnClickListener(new Object[]{bArr}, -1692126728, 1692126730, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() throws IOException {
        return (ady) setNavigationOnClickListener(new Object[]{this}, 940223019, -940223018, System.identityHashCode(this));
    }

    public ady a() {
        int i10 = f52522s0;
        int i11 = (i10 & (-84)) | ((~i10) & 83);
        int i12 = (i10 & 83) << 1;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f52521r0 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i10 + 117;
        f52521r0 = i15 % 128;
        if (i15 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public abstract int b(boolean z10) throws IOException;

    public abstract void c(aeb aebVar, boolean z10) throws IOException;

    public abstract boolean d(ady adyVar);

    public ady e() {
        int i10 = f52521r0;
        int i11 = i10 & 81;
        int i12 = -(-((i10 ^ 81) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f52522s0 = i14;
        int i15 = i13 % 2;
        int i16 = i14 & 105;
        int i17 = (i16 - (~((i14 ^ 105) | i16))) - 1;
        f52521r0 = i17 % 128;
        int i18 = i17 % 2;
        return this;
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final boolean equals(Object obj) {
        return ((Boolean) setNavigationOnClickListener(new Object[]{this, obj}, -75431658, 75431663, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setCompoundDrawableTintBlendMode(ady adyVar) {
        return ((Boolean) setNavigationOnClickListener(new Object[]{this, adyVar}, -109201153, 109201153, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final void setDividerPadding(OutputStream outputStream, String str) throws IOException {
        setNavigationOnClickListener(new Object[]{this, outputStream, str}, 1438703569, -1438703563, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener(add addVar) {
        return ((Boolean) setNavigationOnClickListener(new Object[]{this, addVar}, -872519378, 872519381, System.identityHashCode(this))).booleanValue();
    }

    public abstract boolean setY();

    @Override // com.mypinpad.tsdk.isolation.adw
    public final void setDividerPadding(OutputStream outputStream) throws IOException {
        setNavigationOnClickListener(new Object[]{this, outputStream}, 923679093, -923679089, System.identityHashCode(this));
    }
}
