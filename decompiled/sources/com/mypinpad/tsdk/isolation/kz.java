package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class kz extends TerminalSdkConfigurationCompanion<getNavBarBgColor> {
    public static int E = 0;
    public static int F = 1;

    @NotNull
    public final byte[] A;

    @NotNull
    public ds B;
    public setFitsSystemWindows C;

    @Nullable
    public getBeepOnFailure D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(@NotNull setBackgroundTintList setbackgroundtintlist, @Nullable di diVar, @NotNull setChildIndicator setchildindicator) {
        super(setbackgroundtintlist, diVar, setchildindicator, Terminal.KERNEL_EFTPOS);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        getNavBarBgColor x4 = setX();
        this.A = (byte[]) setInputExtras.setDividerPadding(new Object[]{(String) getNavBarBgColor.setCompoundDrawableTintBlendMode(new Object[]{x4}, 532765770, -532765770, System.identityHashCode(x4)), 5}, -689525923, 689525942, 5);
        this.B = ds.setCompoundDrawableTintBlendMode;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0150  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object obj;
        getBeepOnFailure navigationOnClickListener;
        int i13 = ~i11;
        int i14 = ~i12;
        switch ((((~(i10 | i12)) | (~(i11 | i14))) * 950) + (((~(i14 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i13 | i14)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949))) {
            case 1:
                kz kzVar = (kz) objArr[0];
                int i15 = E;
                int i16 = i15 + 45;
                F = i16 % 128;
                int i17 = i16 % 2;
                obj = kzVar.C;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i18 = F + 23;
                    E = i18 % 128;
                    if (i18 % 2 == 0) {
                        return null;
                    }
                    int i19 = 47 / 0;
                    return null;
                }
                int i20 = i15 & 113;
                int i21 = (i20 - (~(-(-((i15 ^ 113) | i20))))) - 1;
                F = i21 % 128;
                int i22 = i21 % 2;
                int i23 = ((i15 ^ 101) | (i15 & 101)) << 1;
                int i24 = -(((~i15) & 101) | (i15 & (-102)));
                int i25 = (i23 & i24) + (i24 | i23);
                F = i25 % 128;
                if (i25 % 2 == 0) {
                    int i26 = 14 / 0;
                }
                break;
                break;
            case 2:
                kz kzVar2 = (kz) objArr[0];
                int i27 = E;
                int i28 = i27 & 23;
                int i29 = i27 | 23;
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                F = i30 % 128;
                int i31 = i30 % 2;
                obj = kzVar2.A;
                if (i31 == 0) {
                    int i32 = 22 / 0;
                }
                break;
            case 3:
                kz kzVar3 = (kz) objArr[0];
                int i33 = E;
                int i34 = ((i33 | 105) << 1) - (i33 ^ 105);
                F = i34 % 128;
                int i35 = i34 % 2;
                getBeepOnFailure dividerPadding = kzVar3.setDividerPadding(setAnimation.TransactionErrorCause());
                if (dividerPadding == null) {
                    int i36 = F;
                    int i37 = i36 & 113;
                    int i38 = (i36 | 113) & (~i37);
                    int i39 = -(-(i37 << 1));
                    int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                    E = i40 % 128;
                    if (i40 % 2 != 0) {
                        throw null;
                    }
                    navigationOnClickListener = null;
                } else {
                    navigationOnClickListener = dividerPadding.setNavigationOnClickListener();
                    int i41 = E;
                    int i42 = i41 & 51;
                    int i43 = -(-((i41 ^ 51) | i42));
                    int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                    F = i44 % 128;
                    int i45 = i44 % 2;
                }
                kzVar3.D = navigationOnClickListener;
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                TransactionFailed transactionFailedTransactionErrorCause = setAnimation.TransactionErrorCause();
                String str = (String) TransactionFailed.setX(new Object[]{transactionFailedTransactionErrorCause}, 1914607362, -1914607356, System.identityHashCode(transactionFailedTransactionErrorCause));
                TransactionFailed transactionFailedTransactionErrorCause2 = setAnimation.TransactionErrorCause();
                int onFocusChangeListener = ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailedTransactionErrorCause2}, -570885530, 570885532, System.identityHashCode(transactionFailedTransactionErrorCause2))).setOnFocusChangeListener();
                byte[] bArr = new byte[onFocusChangeListener];
                int i46 = E + 125;
                F = i46 % 128;
                int i47 = i46 % 2;
                int i48 = 0;
                while (i48 < onFocusChangeListener) {
                    int i49 = E;
                    int i50 = i49 & 89;
                    int i51 = i49 | 89;
                    int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                    F = i52 % 128;
                    int i53 = i52 % 2;
                    bArr[i48] = 0;
                    System.identityHashCode(kzVar3);
                    int i54 = -(~(i48 * (-623)));
                    int i55 = ((-623) ^ i54) + ((i54 & (-623)) << 1) + 1247;
                    int i56 = -(-((i48 | (-2)) * 624));
                    int i57 = i55 & i56;
                    int i58 = (i56 ^ i55) | i57;
                    int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                    int i60 = i48 & 1;
                    int i61 = (i48 | 1) & (~i60);
                    int i62 = -(-(((i61 & i60) | (i61 ^ i60)) * 624));
                    i48 = (i62 | i59) + (i59 & i62);
                    int i63 = E;
                    int i64 = ((i63 ^ 23) - (~(-(-((i63 & 23) << 1))))) - 1;
                    F = i64 % 128;
                    int i65 = i64 % 2;
                }
                kzVar3.setCompoundDrawableTintBlendMode((getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, bArr, null, Boolean.FALSE, 28}, -976227287, 976227290, 28));
                int i66 = F;
                int i67 = (i66 & (-32)) | ((~i66) & 31);
                int i68 = (i66 & 31) << 1;
                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                E = i69 % 128;
                if (i69 % 2 == 0) {
                    return null;
                }
                int i70 = 31 / 0;
                return null;
            case 4:
                kz kzVar4 = (kz) objArr[0];
                setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) objArr[1];
                int i71 = F;
                int i72 = ((i71 | 29) << 1) - (((~i71) & 29) | (i71 & (-30)));
                E = i72 % 128;
                int i73 = i72 % 2;
                Intrinsics.checkNotNullParameter(setfitssystemwindows, "");
                kzVar4.C = setfitssystemwindows;
                int i74 = E;
                int i75 = (((i74 | 38) << 1) - (i74 ^ 38)) - 1;
                F = i75 % 128;
                int i76 = i75 % 2;
                return null;
            case 5:
                kz kzVar5 = (kz) objArr[0];
                TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i77 = F;
                int i78 = (i77 & (-114)) | ((~i77) & 113);
                int i79 = (113 & i77) << 1;
                int i80 = (i78 & i79) + (i79 | i78);
                E = i80 % 128;
                int i81 = i80 % 2;
                Intrinsics.checkNotNullParameter(transactionFailed, "");
                if (!kzVar5.setY((String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                    int i82 = E;
                    int i83 = ((i82 & 74) + (i82 | 74)) - 1;
                    F = i83 % 128;
                    int i84 = i83 % 2;
                    obj = Boolean.FALSE;
                } else {
                    int i85 = F;
                    int i86 = i85 ^ 69;
                    int i87 = ((i85 & 69) | i86) << 1;
                    int i88 = -i86;
                    int i89 = (i87 & i88) + (i87 | i88);
                    E = i89 % 128;
                    int i90 = i89 % 2;
                    getBeepOnFailure onFocusChangeListener2 = kzVar5.setOnFocusChangeListener(transactionFailed);
                    if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{onFocusChangeListener2}, 252497730, -252497710, System.identityHashCode(onFocusChangeListener2))).length != iIntValue) {
                        int i810 = E;
                        int i811 = ((i810 & 74) + (i810 | 74)) - 1;
                        F = i811 % 128;
                        int i812 = i811 % 2;
                        obj = Boolean.FALSE;
                    } else {
                        int i91 = F;
                        int i92 = ((i91 ^ 58) + ((i91 & 58) << 1)) - 1;
                        E = i92 % 128;
                        int i93 = i92 % 2;
                        obj = true;
                    }
                }
                break;
            case 6:
                kz kzVar6 = (kz) objArr[0];
                int i94 = E;
                int i95 = (i94 ^ 91) + ((i94 & 91) << 1);
                int i96 = i95 % 128;
                F = i96;
                int i97 = i95 % 2;
                obj = kzVar6.B;
                if (i97 == 0) {
                    int i98 = 70 / 0;
                }
                int i99 = i96 & 17;
                int i100 = ((i96 | 17) & (~i99)) + (i99 << 1);
                E = i100 % 128;
                if (i100 % 2 != 0) {
                    throw null;
                }
                break;
            case 7:
                kz kzVar7 = (kz) objArr[0];
                int i101 = E;
                int i102 = i101 & 117;
                int i103 = (((i101 ^ 117) | i102) << 1) - ((~i102) & (i101 | 117));
                F = i103 % 128;
                if (i103 % 2 == 0) {
                    getBeepOnFailure getbeeponfailure = kzVar7.D;
                    throw null;
                }
                getBeepOnFailure getbeeponfailure2 = kzVar7.D;
                if (getbeeponfailure2 != null) {
                    int i104 = i101 & 125;
                    int i105 = i104 + ((i101 ^ 125) | i104);
                    F = i105 % 128;
                    if (i105 % 2 == 0) {
                        kzVar7.setCompoundDrawableTintBlendMode(getbeeponfailure2);
                        int i106 = 69 / 0;
                    } else {
                        kzVar7.setCompoundDrawableTintBlendMode(getbeeponfailure2);
                    }
                }
                int i107 = F;
                int i108 = i107 & 51;
                int i109 = (i108 - (~(-(-((i107 ^ 51) | i108))))) - 1;
                E = i109 % 128;
                if (i109 % 2 == 0) {
                    return null;
                }
                throw null;
            default:
                kz kzVar8 = (kz) objArr[0];
                ds dsVar = (ds) objArr[1];
                int i110 = F;
                int i111 = ((i110 ^ 1) | (i110 & 1)) << 1;
                int i112 = -(((~i110) & 1) | (i110 & (-2)));
                int i113 = (i111 & i112) + (i112 | i111);
                E = i113 % 128;
                if (i113 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(dsVar, "");
                    kzVar8.B = dsVar;
                    return null;
                }
                Intrinsics.checkNotNullParameter(dsVar, "");
                kzVar8.B = dsVar;
                throw null;
        }
        return obj;
    }

    public final void TransactionResult() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, 1068055759, -1068055756, System.identityHashCode(this));
    }

    @NotNull
    public final ds getSuppressed() {
        return (ds) setOnFocusChangeListener(new Object[]{this}, -1080464866, 1080464872, System.identityHashCode(this));
    }

    public final void printStackTrace() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, -487101006, 487101013, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull setFitsSystemWindows setfitssystemwindows) throws Exception {
        setOnFocusChangeListener(new Object[]{this, setfitssystemwindows}, 738496851, -738496847, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setMaxEms() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 405523870, -405523868, System.identityHashCode(this));
    }

    @NotNull
    public final setFitsSystemWindows setViewTranslationCallback() {
        return (setFitsSystemWindows) setOnFocusChangeListener(new Object[]{this}, 1371444268, -1371444267, System.identityHashCode(this));
    }

    public final void setX(@NotNull ds dsVar) throws Exception {
        setOnFocusChangeListener(new Object[]{this, dsVar}, -1851091220, 1851091220, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener(@NotNull TransactionFailed transactionFailed, int i10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, transactionFailed, Integer.valueOf(i10)}, 1229051272, -1229051267, i10)).booleanValue();
    }
}
