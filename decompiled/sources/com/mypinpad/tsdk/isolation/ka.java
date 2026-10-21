package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ka extends TerminalSdkConfigurationCompanion<setProgressTintMode> {
    public static int H = 0;
    public static int I = 1;
    public final boolean A;
    public boolean B;

    @Nullable
    public getBeepOnFailure C;
    public boolean D;

    @NotNull
    public final setMaxWidth E;

    @Nullable
    public getBeepOnFailure F;
    public boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(@NotNull setBackgroundTintList setbackgroundtintlist, @Nullable di diVar, @NotNull setChildIndicator setchildindicator) {
        super(setbackgroundtintlist, diVar, setchildindicator, Terminal.KERNEL_6);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        setProgressTintMode x4 = setX();
        this.A = ((Boolean) setProgressTintMode.setDividerPadding(new Object[]{x4}, 1929988626, -1929988625, System.identityHashCode(x4))).booleanValue();
        this.E = new setMaxWidth();
    }

    public static /* synthetic */ Boolean H(Object[] objArr) {
        ka kaVar = (ka) objArr[0];
        int i10 = H;
        int i11 = (i10 ^ 55) + ((i10 & 55) << 1);
        int i12 = i11 % 128;
        I = i12;
        int i13 = i11 % 2;
        boolean z10 = kaVar.D;
        if (i13 == 0) {
            throw null;
        }
        int i14 = i12 & 89;
        int i15 = (i14 - (~((i12 ^ 89) | i14))) - 1;
        H = i15 % 128;
        if (i15 % 2 == 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    public static /* synthetic */ Boolean L(Object[] objArr) {
        ka kaVar = (ka) objArr[0];
        int i10 = I;
        int i11 = i10 & 17;
        int i12 = (i10 | 17) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        H = i14 % 128;
        int i15 = i14 % 2;
        boolean z10 = kaVar.B;
        if (i15 == 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a2, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, (java.lang.String) com.mypinpad.tsdk.isolation.setScrollContainer.setOnFocusChangeListener(new java.lang.Object[]{r9}, -888877733, 888877739, java.lang.System.identityHashCode(r9)), r15}, 746705890, -746705890, java.lang.System.identityHashCode(r5))).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d9, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, (java.lang.String) com.mypinpad.tsdk.isolation.setScrollContainer.setOnFocusChangeListener(new java.lang.Object[]{r9}, -888877733, 888877739, java.lang.System.identityHashCode(r9)), r15}, 746705890, -746705890, java.lang.System.identityHashCode(r5))).booleanValue() != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00db, code lost:
    
        r15 = com.mypinpad.tsdk.isolation.ka.H + 103;
        com.mypinpad.tsdk.isolation.ka.I = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e6, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean c0(java.lang.Object[] r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ka.c0(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ getBeepOnFailure d0(Object[] objArr) {
        ka kaVar = (ka) objArr[0];
        int i10 = H;
        int i11 = (i10 ^ 19) + ((i10 & 19) << 1);
        I = i11 % 128;
        int i12 = i11 % 2;
        getBeepOnFailure getbeeponfailure = kaVar.F;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 & 121;
        int i14 = i13 + ((i10 ^ 121) | i13);
        I = i14 % 128;
        if (i14 % 2 != 0) {
            return getbeeponfailure;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        if (r9 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        r0 = ((-1) << 1) - ((com.mypinpad.tsdk.isolation.ka.H + 110) ^ (-1));
        com.mypinpad.tsdk.isolation.ka.I = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        r1 = new com.mypinpad.tsdk.isolation.bu(r9);
        r9 = (byte[]) com.mypinpad.tsdk.isolation.setInputExtras.setDividerPadding(new java.lang.Object[]{((com.mypinpad.tsdk.isolation.br) ((com.mypinpad.tsdk.isolation.setImageTintList) com.mypinpad.tsdk.isolation.w.setX(new java.lang.Object[]{r1}, 1693919772, -1693919769, java.lang.System.identityHashCode(r1)))).setLayoutAnimation()}, 60045397, -60045381, (int) java.lang.System.currentTimeMillis());
        r0 = com.mypinpad.tsdk.isolation.ka.H;
        r1 = r0 & 117;
        r1 = r1 + ((r0 ^ 117) | r1);
        com.mypinpad.tsdk.isolation.ka.I = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (r9 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object e0(java.lang.Object[] r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ka.e0(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ void f0(Object[] objArr) {
        ka kaVar = (ka) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i10 = H;
        int i11 = i10 & 61;
        int i12 = (~i11) & (i10 | 61);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        I = i14 % 128;
        int i15 = i14 % 2;
        kaVar.F = getbeeponfailure;
        int i16 = i10 + 107;
        I = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 32 / 0;
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13 = (i11 * (-448)) + (i10 * 450);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        switch ((((~(i10 | i15 | (~i12))) | i14) * 449) + (i14 * (-1347)) + (((~(i15 | i10 | i12)) | i14) * 449) + i13) {
            case 1:
                return e0(objArr);
            case 2:
                u(objArr);
                return null;
            case 3:
                return d0(objArr);
            case 4:
                f0(objArr);
                return null;
            case 5:
                return H(objArr);
            case 6:
                return L(objArr);
            case 7:
                ka kaVar = (ka) objArr[0];
                int i16 = I;
                int i17 = i16 & 9;
                int i18 = i16 | 9;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                H = i19 % 128;
                if (i19 % 2 != 0) {
                    super.setLayoutAnimation();
                    setMaxWidth setmaxwidth = kaVar.E;
                    setMaxWidth.setX(new Object[]{setmaxwidth}, 1900601062, -1900601058, System.identityHashCode(setmaxwidth));
                    throw null;
                }
                super.setLayoutAnimation();
                setMaxWidth setmaxwidth2 = kaVar.E;
                setMaxWidth.setX(new Object[]{setmaxwidth2}, 1900601062, -1900601058, System.identityHashCode(setmaxwidth2));
                getBeepOnFailure getbeeponfailure = kaVar.F;
                if (getbeeponfailure != null) {
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1006797251, -1006797224, System.identityHashCode(getbeeponfailure));
                    int i20 = I;
                    int i21 = i20 & 7;
                    int i22 = ((i20 ^ 7) | i21) << 1;
                    int i23 = -((i20 | 7) & (~i21));
                    int i24 = (i22 & i23) + (i23 | i22);
                    H = i24 % 128;
                    int i25 = i24 % 2;
                }
                getBeepOnFailure getbeeponfailure2 = kaVar.C;
                if (getbeeponfailure2 != null) {
                    int i26 = I;
                    int i27 = ((i26 | 107) << 1) - (i26 ^ 107);
                    H = i27 % 128;
                    if (i27 % 2 != 0) {
                        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1006797251, -1006797224, System.identityHashCode(getbeeponfailure2));
                        int i28 = 76 / 0;
                    } else {
                        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1006797251, -1006797224, System.identityHashCode(getbeeponfailure2));
                    }
                }
                int i29 = I;
                int i30 = i29 & 75;
                int i31 = (i29 ^ 75) | i30;
                int i32 = (i30 & i31) + (i31 | i30);
                H = i32 % 128;
                int i33 = i32 % 2;
                return null;
            case 8:
                return c0(objArr);
            case 9:
                ka kaVar2 = (ka) objArr[0];
                int i34 = I;
                int i35 = (i34 ^ 57) + ((i34 & 57) << 1);
                H = i35 % 128;
                if (i35 % 2 != 0) {
                    setMaxWidth setmaxwidth3 = kaVar2.E;
                    throw null;
                }
                setMaxWidth setmaxwidth4 = kaVar2.E;
                int i36 = i34 & 51;
                int i37 = (i34 | 51) & (~i36);
                int i38 = -(-(i36 << 1));
                int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                H = i39 % 128;
                int i40 = i39 % 2;
                return setmaxwidth4;
            case 10:
                ka kaVar3 = (ka) objArr[0];
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) objArr[1];
                int i41 = H;
                int i42 = (i41 & 69) + (i41 | 69);
                int i43 = i42 % 128;
                I = i43;
                int i44 = i42 % 2;
                kaVar3.C = getbeeponfailure3;
                int i45 = (i43 & (-108)) | ((~i43) & 107);
                int i46 = -(-((i43 & 107) << 1));
                int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
                H = i47 % 128;
                int i48 = i47 % 2;
                return null;
            case 11:
                ka kaVar4 = (ka) objArr[0];
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) objArr[1];
                int iIdentityHashCode = System.identityHashCode(kaVar4);
                int i49 = ~(((-1534584641) ^ iIdentityHashCode) | ((-1534584641) & iIdentityHashCode));
                int i50 = ((i49 & 568868542) | (568868542 ^ i49)) * Opcodes.ATHROW;
                int i51 = 1001651963 & i50;
                int i52 = -(-((i50 ^ 1001651963) | i51));
                int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                int i54 = ~iIdentityHashCode;
                int i55 = i54 & (-1534584641);
                int i56 = ~(((i54 | (-1534584641)) & (~i55)) | i55);
                int i57 = -(-(((i56 & 23078400) | (23078400 ^ i56)) * Opcodes.ATHROW));
                int i58 = (i53 & i57) + (i57 | i53);
                int iIdentityHashCode2 = System.identityHashCode(kaVar4);
                int i59 = 959436653 & iIdentityHashCode2;
                int i60 = (959436653 | iIdentityHashCode2) & (~i59);
                int i61 = ~iIdentityHashCode2;
                int i62 = ~(i60 | i59);
                int i63 = ((~i61) & 690083085) | ((-690083086) & i61);
                int i64 = 690083085 & i61;
                int i65 = ~((i63 & i64) | (i63 ^ i64) | (-823101286));
                int i66 = -(-(((i62 & i65) | (i62 ^ i65)) * 497));
                int i67 = (-1178475470) & i66;
                int i68 = -(-((i66 ^ (-1178475470)) | i67));
                int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                int i70 = (~((823101285 & i61) | (823101285 ^ i61))) | 136335368;
                int i71 = (-269353569) & iIdentityHashCode2;
                int i72 = (iIdentityHashCode2 | (-269353569)) & (~i71);
                int i73 = ~((i72 & i71) | (i72 ^ i71));
                int i74 = ((~i73) & i70) | ((~i70) & i73);
                int i75 = i73 & i70;
                int i76 = -(~(((i75 & i74) | (i74 ^ i75)) * 497));
                if (i58 <= ((i69 & i76) + (i76 | i69)) - 1) {
                    Intrinsics.checkNotNullParameter(getbeeponfailure4, "");
                    setMaxWidth.setX(new Object[]{kaVar4.E, getbeeponfailure4, Boolean.FALSE}, -333173787, 333173806, (int) System.currentTimeMillis());
                    return null;
                }
                Intrinsics.checkNotNullParameter(getbeeponfailure4, "");
                setMaxWidth.setX(new Object[]{kaVar4.E, getbeeponfailure4, Boolean.TRUE}, -333173787, 333173806, (int) System.currentTimeMillis());
                return null;
            case 12:
                ka kaVar5 = (ka) objArr[0];
                int i77 = I + 115;
                H = i77 % 128;
                if (i77 % 2 == 0) {
                    return kaVar5.C;
                }
                getBeepOnFailure getbeeponfailure5 = kaVar5.C;
                throw null;
            case 13:
                ka kaVar6 = (ka) objArr[0];
                int i78 = H;
                int i79 = i78 & 59;
                int i80 = (i78 ^ 59) | i79;
                int i81 = ((i79 | i80) << 1) - (i79 ^ i80);
                I = i81 % 128;
                int i82 = i81 % 2;
                kaVar6.G = true;
                int i83 = i78 & 97;
                int i84 = (i83 - (~((i78 ^ 97) | i83))) - 1;
                I = i84 % 128;
                int i85 = i84 % 2;
                return null;
            case 14:
                setMaxWidth setmaxwidth5 = (setMaxWidth) objArr[0];
                Intrinsics.checkNotNullParameter(setmaxwidth5, "");
                setOverscrollHeader setoverscrollheader = new setOverscrollHeader();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setmaxwidth5, 10));
                int i86 = I;
                int i87 = ((i86 ^ 75) | (i86 & 75)) << 1;
                int i88 = -((75 & (~i86)) | (i86 & (-76)));
                int i89 = (i87 & i88) + (i88 | i87);
                H = i89 % 128;
                int i90 = i89 % 2;
                for (getBeepOnFailure getbeeponfailure6 : setmaxwidth5) {
                    int i91 = H + 77;
                    I = i91 % 128;
                    int i92 = i91 % 2;
                    getBeepOnFailure navigationOnClickListener = getbeeponfailure6.setNavigationOnClickListener();
                    setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 1115257939, -1115257923, System.identityHashCode(navigationOnClickListener));
                    setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure6));
                    int iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue();
                    setImageTintList.setX(new Object[]{setimagetintlist, Integer.valueOf(iIntValue)}, -2003004454, 2003004454, iIntValue);
                    setOverscrollHeader.setX(new Object[]{setoverscrollheader, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 252497730, -252497710, System.identityHashCode(navigationOnClickListener))}, 2089112754, -2089112752, System.identityHashCode(setoverscrollheader));
                    arrayList.add(Unit.INSTANCE);
                    int i93 = I;
                    int i94 = i93 & 19;
                    int i95 = -(-((i93 ^ 19) | i94));
                    int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                    H = i96 % 128;
                    int i97 = i96 % 2;
                }
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -308641137, 308641263, (int) System.currentTimeMillis());
                getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), (byte[]) setOverscrollHeader.setX(new Object[]{setoverscrollheader}, -158300171, 158300171, System.identityHashCode(setoverscrollheader)), null, Boolean.FALSE, 28}, -976227287, 976227290, 28);
                int i98 = I;
                int i99 = (((i98 | 118) << 1) - (i98 ^ 118)) - 1;
                H = i99 % 128;
                int i100 = i99 % 2;
                return getbeeponfailure7;
            case 15:
                ka kaVar7 = (ka) objArr[0];
                int i101 = H;
                int i102 = i101 & 53;
                int i103 = (((i101 | 53) & (~i102)) - (~(-(-(i102 << 1))))) - 1;
                I = i103 % 128;
                int i104 = i103 % 2;
                boolean z10 = kaVar7.A;
                if (i104 != 0) {
                    return Boolean.valueOf(z10);
                }
                throw null;
            case 16:
                ka kaVar8 = (ka) objArr[0];
                int i105 = H;
                int i106 = ((((i105 ^ 51) | (i105 & 51)) << 1) - (~(-(((~i105) & 51) | (i105 & (-52)))))) - 1;
                int i107 = i106 % 128;
                I = i107;
                int i108 = i106 % 2;
                boolean z11 = kaVar8.G;
                int i109 = i107 & 5;
                int i110 = ((i107 ^ 5) | i109) << 1;
                int i111 = -((i107 | 5) & (~i109));
                int i112 = (i110 & i111) + (i111 | i110);
                H = i112 % 128;
                int i113 = i112 % 2;
                return Boolean.valueOf(z11);
            default:
                ka kaVar9 = (ka) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i114 = H;
                int i115 = (i114 & 103) + (i114 | 103);
                I = i115 % 128;
                int i116 = i115 % 2;
                kaVar9.D = zBooleanValue;
                int i117 = (i114 & 11) + (i114 | 11);
                I = i117 % 128;
                if (i117 % 2 != 0) {
                    return null;
                }
                throw null;
        }
    }

    @NotNull
    public static getBeepOnFailure setDividerPadding(@NotNull setMaxWidth setmaxwidth) {
        return (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{setmaxwidth}, 1223662572, -1223662558, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void u(Object[] objArr) {
        ka kaVar = (ka) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = I + 125;
        H = i10 % 128;
        int i11 = i10 % 2;
        kaVar.B = zBooleanValue;
        if (i11 != 0) {
            throw null;
        }
    }

    @Nullable
    public final getBeepOnFailure TransactionResult() {
        return (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{this}, 2066879617, -2066879605, System.identityHashCode(this));
    }

    public final boolean getSuppressed() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1525191230, -1525191215, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final setMaxWidth printStackTrace() {
        return (setMaxWidth) setCompoundDrawableTintBlendMode(new Object[]{this}, 2099681381, -2099681372, System.identityHashCode(this));
    }

    public final boolean setCursorVisible() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -316514770, 316514786, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade
    @Nullable
    public final byte[] setImageResource() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -2114891615, 2114891616, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade, com.mypinpad.tsdk.isolation.getRrn
    public final void setLayoutAnimation() throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 580077469, -580077462, System.identityHashCode(this));
    }

    public final boolean setMaxEms() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -411478475, 411478481, System.identityHashCode(this))).booleanValue();
    }

    public final void setOnFocusChangeListener(@Nullable getBeepOnFailure getbeeponfailure) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, getbeeponfailure}, -1982343417, 1982343427, System.identityHashCode(this));
    }

    public final void setScroller() throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1284673777, 1284673790, System.identityHashCode(this));
    }

    public final boolean setTextSelectHandleRight() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1663195320, -1663195315, System.identityHashCode(this))).booleanValue();
    }

    @Nullable
    public final getBeepOnFailure setViewTranslationCallback() {
        return (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{this}, 959776700, -959776697, System.identityHashCode(this));
    }

    public final void setX(@Nullable getBeepOnFailure getbeeponfailure) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, getbeeponfailure}, -1043492351, 1043492355, System.identityHashCode(this));
    }

    public final void setY(@NotNull getBeepOnFailure getbeeponfailure) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, getbeeponfailure}, -1412399391, 1412399402, System.identityHashCode(this));
    }

    public final void setY(boolean z10) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, -1254059264, 1254059264, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade
    public final boolean setCompoundDrawableTintBlendMode(@NotNull getBeepOnFailure getbeeponfailure, @Nullable TerminalCreationFailure terminalCreationFailure) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, getbeeponfailure, terminalCreationFailure}, -2108269027, 2108269035, System.identityHashCode(this))).booleanValue();
    }

    public final void setCompoundDrawableTintBlendMode(boolean z10) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, 165395401, -165395399, System.identityHashCode(this));
    }
}
