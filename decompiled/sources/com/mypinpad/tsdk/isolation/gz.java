package com.mypinpad.tsdk.isolation;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56111c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56112d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final component20 f56113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final component17 f56114b;

    public gz(@NotNull component20 component20Var, @NotNull component17 component17Var) {
        Intrinsics.checkNotNullParameter(component20Var, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        this.f56113a = component20Var;
        this.f56114b = component17Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0156 A[PHI: r8
      0x0156: PHI (r8v18 com.mypinpad.tsdk.i.getBeepOnFailure) = (r8v17 com.mypinpad.tsdk.i.getBeepOnFailure), (r8v39 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:18:0x0154, B:15:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0194 A[PHI: r8
      0x0194: PHI (r8v26 com.mypinpad.tsdk.i.getBeepOnFailure) = (r8v17 com.mypinpad.tsdk.i.getBeepOnFailure), (r8v39 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:18:0x0154, B:15:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure getbeeponfailure2;
        int i13 = ~i11;
        int i14 = (~i12) | i13;
        int i15 = (((~i14) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
        int i16 = ~i10;
        if (((~(i13 | i12)) * 113) + (((~(i10 | i14)) | (~(i11 | i16)) | (~(i16 | i12))) * (-113)) + i15 != 1) {
            gz gzVar = (gz) objArr[0];
            gv gvVar = (gv) objArr[1];
            int i17 = f56112d;
            int i18 = (i17 & 59) + (i17 | 59);
            f56111c = i18 % 128;
            if (i18 % 2 != 0) {
                setCompoundDrawableTintBlendMode(new Object[]{gzVar, gvVar, Boolean.FALSE}, -618470104, 618470105, System.identityHashCode(gzVar));
            } else {
                setCompoundDrawableTintBlendMode(new Object[]{gzVar, gvVar, Boolean.TRUE}, -618470104, 618470105, System.identityHashCode(gzVar));
            }
            int i19 = f56111c + 41;
            f56112d = i19 % 128;
            if (i19 % 2 != 0) {
                return null;
            }
            throw null;
        }
        gz gzVar2 = (gz) objArr[0];
        gv gvVar2 = (gv) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i20 = f56111c;
        int i21 = (-2) - (((i20 & 40) + (i20 | 40)) ^ (-1));
        f56112d = i21 % 128;
        if (i21 % 2 == 0) {
            Intrinsics.checkNotNullParameter(gvVar2, "");
            setAnimation setanimation = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
            Intrinsics.checkNotNull(getbeeponfailure3);
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            getbeeponfailure = (getBeepOnFailure) ((Pair) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 243863605, -243863605, System.identityHashCode(getbeeponfailure3)), 0}, 1761745221, -1761745219, 0)).getFirst();
            if (zBooleanValue) {
                v vVar = new v(gvVar2);
                getbeeponfailure2 = (getBeepOnFailure) ((Pair) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{vVar}, 243863605, -243863605, System.identityHashCode(vVar)), 0}, 1761745221, -1761745219, 0)).getFirst();
                int i22 = f56112d;
                int i23 = i22 & 85;
                int i24 = ((i22 | 85) & (~i23)) + (i23 << 1);
                f56111c = i24 % 128;
                int i25 = i24 % 2;
            } else {
                int i26 = f56112d;
                int i27 = i26 ^ 29;
                int i28 = -(-((i26 & 29) << 1));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                f56111c = i29 % 128;
                int i30 = i29 % 2;
                getbeeponfailure2 = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(gvVar2, "");
            setAnimation setanimation2 = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
            Intrinsics.checkNotNull(getbeeponfailure4);
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
            getbeeponfailure = (getBeepOnFailure) ((Pair) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 243863605, -243863605, System.identityHashCode(getbeeponfailure4)), 0}, 1761745221, -1761745219, 0)).getFirst();
            if (zBooleanValue) {
                v vVar2 = new v(gvVar2);
                getbeeponfailure2 = (getBeepOnFailure) ((Pair) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{vVar2}, 243863605, -243863605, System.identityHashCode(vVar2)), 0}, 1761745221, -1761745219, 0)).getFirst();
                int i210 = f56112d;
                int i211 = i210 & 85;
                int i212 = ((i210 | 85) & (~i211)) + (i211 << 1);
                f56111c = i212 % 128;
                int i213 = i212 % 2;
            } else {
                int i214 = f56112d;
                int i215 = i214 ^ 29;
                int i216 = -(-((i214 & 29) << 1));
                int i217 = (i215 ^ i216) + ((i216 & i215) << 1);
                f56111c = i217 % 128;
                int i31 = i217 % 2;
                getbeeponfailure2 = null;
            }
        }
        int iIntValue = ((Integer) setInputExtras.setDividerPadding(new Object[]{gzVar2.f56114b.setCompoundDrawableTintBlendMode(4)}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
        gv.setOnFocusChangeListener(new Object[]{gvVar2, Integer.valueOf(iIntValue)}, -56098110, 56098122, iIntValue);
        ((Integer) gv.setOnFocusChangeListener(new Object[]{gvVar2}, -747611684, 747611692, System.identityHashCode(gvVar2))).intValue();
        byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure));
        if (getbeeponfailure2 != null) {
            int i32 = f56112d;
            int i33 = i32 & 63;
            int i34 = ((i32 ^ 63) | i33) << 1;
            int i35 = -((i32 | 63) & (~i33));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            f56111c = i36 % 128;
            int i37 = i36 % 2;
            int i38 = f56112d;
            int i39 = (i38 & (-32)) | ((~i38) & 31);
            int i40 = -(-((i38 & 31) << 1));
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            f56111c = i41 % 128;
            int i42 = i41 % 2;
        }
        gzVar2.f56113a.setY(bArr);
        int i43 = f56112d + 95;
        f56111c = i43 % 128;
        if (i43 % 2 != 0) {
            int i44 = 74 / 0;
        }
        return null;
    }

    public final void setY(@NotNull gv gvVar, boolean z10) {
        setCompoundDrawableTintBlendMode(new Object[]{this, gvVar, Boolean.valueOf(z10)}, -618470104, 618470105, System.identityHashCode(this));
    }
}
