package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/et;", "", "Lcom/mypinpad/tsdk/i/gv;", "p0", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "p1", "", "setY", "(Lcom/mypinpad/tsdk/i/gv;Lcom/mypinpad/tsdk/i/getBeepOnFailure;)V", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/gv;)V", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/gv;)Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class et {

    @NotNull
    public static final et INSTANCE = new et();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55407a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55408b = 1;

    static {
        int i10 = f55407a;
        int i11 = i10 ^ 55;
        int i12 = ((((i10 & 55) | i11) << 1) - (~(-i11))) - 1;
        f55408b = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i11 | i13;
        int i16 = (((~(i10 | i14)) | (~i15)) * 752) + ((~(i15 | i12)) * (-1504)) + (((~(i13 | i14)) | (~(i13 | i12))) * ReturnCode.ERR_CONN_IO) + (i11 * (-751)) + (i10 * (-751));
        if (i16 == 1) {
            gv gvVar = (gv) objArr[0];
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
            int i17 = f55408b;
            int i18 = i17 ^ 35;
            int i19 = ((i17 & 35) | i18) << 1;
            int i20 = -i18;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            f55407a = i21 % 128;
            if (i21 % 2 == 0) {
                Intrinsics.checkNotNullParameter(gvVar, "");
                Intrinsics.checkNotNullParameter(getbeeponfailure, "");
                Unit unit = Unit.INSTANCE;
                setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                return null;
            }
            Intrinsics.checkNotNullParameter(gvVar, "");
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            Unit unit2 = Unit.INSTANCE;
            setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
            throw null;
        }
        if (i16 == 2) {
            gv gvVar2 = (gv) objArr[0];
            int i22 = f55407a;
            int i23 = (i22 & (-116)) | ((~i22) & 115);
            int i24 = -(-((i22 & 115) << 1));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            f55408b = i25 % 128;
            if (i25 % 2 != 0) {
                Intrinsics.checkNotNullParameter(gvVar2, "");
                Unit unit3 = Unit.INSTANCE;
                setRenderEffect setrendereffect3 = setRenderEffect.INSTANCE;
                return null;
            }
            Intrinsics.checkNotNullParameter(gvVar2, "");
            Unit unit4 = Unit.INSTANCE;
            setRenderEffect setrendereffect4 = setRenderEffect.INSTANCE;
            int i26 = 87 / 0;
            return null;
        }
        if (i16 != 3) {
            gv gvVar3 = (gv) objArr[0];
            int i27 = f55407a;
            int i28 = (i27 & 51) + (i27 | 51);
            f55408b = i28 % 128;
            int i29 = i28 % 2;
            Intrinsics.checkNotNullParameter(gvVar3, "");
            setAnimation setanimation = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, (TransactionFailed) setAnimation.setY(new Object[0], -731579319, 731579502, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar3));
            if (getbeeponfailure2 == null) {
                int i30 = f55408b;
                int i31 = (i30 | 97) << 1;
                int i32 = -(((~i30) & 97) | (i30 & (-98)));
                int i33 = (i31 & i32) + (i32 | i31);
                f55407a = i33 % 128;
                if (i33 % 2 != 0) {
                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                    TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -731579319, 731579502, (int) System.currentTimeMillis());
                    getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), null, null, Boolean.FALSE, 78}, -976227287, 976227290, 78);
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, getbeeponfailure2}, 2008358388, -2008358355, System.identityHashCode(gvVar3));
                } else {
                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                    TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -731579319, 731579502, (int) System.currentTimeMillis());
                    getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, getbeeponfailure2}, 2008358388, -2008358355, System.identityHashCode(gvVar3));
                }
            } else {
                int i34 = f55407a;
                int i35 = (-2) - ((((i34 | 126) << 1) - (i34 ^ 126)) ^ (-1));
                f55408b = i35 % 128;
                if (i35 % 2 == 0) {
                    int i36 = 82 / 0;
                }
            }
            return getbeeponfailure2;
        }
        gv gvVar4 = (gv) objArr[0];
        int i37 = f55408b;
        int i38 = i37 | 123;
        int i39 = (i38 << 1) - ((~(i37 & 123)) & i38);
        f55407a = i39 % 128;
        if (i39 % 2 != 0) {
            Intrinsics.checkNotNullParameter(gvVar4, "");
            ey eyVar = ey.INSTANCE;
            gv.setOnFocusChangeListener(new Object[]{gvVar4, (getBeepOnFailure) ey.setY(new Object[]{gvVar4}, 1660534021, -1660534020, (int) System.currentTimeMillis())}, 319442889, -319442867, System.identityHashCode(gvVar4));
            throw null;
        }
        Intrinsics.checkNotNullParameter(gvVar4, "");
        ey eyVar2 = ey.INSTANCE;
        gv.setOnFocusChangeListener(new Object[]{gvVar4, (getBeepOnFailure) ey.setY(new Object[]{gvVar4}, 1660534021, -1660534020, (int) System.currentTimeMillis())}, 319442889, -319442867, System.identityHashCode(gvVar4));
        if (((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar4, setAnimation.setIndeterminateDrawableTiled()}, -1593889019, 1593889062, System.identityHashCode(gvVar4))) == null) {
            int i40 = f55408b;
            int i41 = i40 & 101;
            int i42 = -(-((i40 ^ 101) | i41));
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            f55407a = i43 % 128;
            int i44 = i43 % 2;
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = getBeepOnFailure.setOnFocusChangeListener;
            TransactionFailed indeterminateDrawableTiled = setAnimation.setIndeterminateDrawableTiled();
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar4, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{indeterminateDrawableTiled}, 1914607362, -1914607356, System.identityHashCode(indeterminateDrawableTiled)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30)}, 2008358388, -2008358355, System.identityHashCode(gvVar4));
            int i45 = f55407a;
            int i46 = i45 & 21;
            int i47 = (i45 | 21) & (~i46);
            int i48 = -(-(i46 << 1));
            int i49 = (i47 & i48) + (i47 | i48);
            f55408b = i49 % 128;
            int i50 = i49 % 2;
        }
        Unit unit5 = Unit.INSTANCE;
        setRenderEffect setrendereffect5 = setRenderEffect.INSTANCE;
        int i51 = f55407a;
        int i52 = (i51 & 3) + (i51 | 3);
        f55408b = i52 % 128;
        if (i52 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static void setOnFocusChangeListener(@NotNull gv p4) throws Exception {
        setDividerPadding(new Object[]{p4}, 704883502, -704883499, (int) System.currentTimeMillis());
    }

    @NotNull
    public static getBeepOnFailure setY(@NotNull gv p4) {
        return (getBeepOnFailure) setDividerPadding(new Object[]{p4}, 1597533800, -1597533800, (int) System.currentTimeMillis());
    }

    public static void setY(@NotNull gv p4, @NotNull getBeepOnFailure p10) throws Exception {
        setDividerPadding(new Object[]{p4, p10}, 1131837414, -1131837413, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(@NotNull gv p4) throws Exception {
        setDividerPadding(new Object[]{p4}, 338249870, -338249868, (int) System.currentTimeMillis());
    }
}
