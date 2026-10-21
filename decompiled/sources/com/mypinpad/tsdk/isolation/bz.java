package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class bz extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f54743i = {c.e(bz.class, "cvmPerformed_B1", "getCvmPerformed_B1()B", 0), c.e(bz.class, "cvmCondition_B2", "getCvmCondition_B2()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/cvm/CvmConditionCode;", 0), c.e(bz.class, "cvmResult_B3", "getCvmResult_B3()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/cvm/CvmResult;", 0)};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f54744j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f54745k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final p f54746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final n f54747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final n f54748h;

    static {
        int i10 = f54745k;
        int i11 = (i10 & (-90)) | ((~i10) & 89);
        int i12 = (i10 & 89) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f54744j = i13 % 128;
        int i14 = i13 % 2;
    }

    public bz() {
        super(setAnimation.setTitleMarginEnd().setDividerPadding());
        this.f54746f = new p(0);
        cb.Companion companion = cb.INSTANCE;
        this.f54747g = new n(1, 3, 0, (openContextMenu) cb.Companion.setX(new Object[0], -48508283, 48508283, (int) System.currentTimeMillis()));
        ce.Companion companion2 = ce.INSTANCE;
        this.f54748h = new n(2, 1, 0, (openContextMenu) ce.Companion.setDividerPadding(new Object[0], 2048500521, -2048500521, (int) System.currentTimeMillis()));
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~(i15 | i12);
        int i17 = ~i12;
        int i18 = (((~(i10 | i14 | i12)) | (~(i11 | i13 | i12)) | (~(i15 | i17))) * 920) + (((~i15) | (~(i13 | i17))) * 920) + ((i16 | (~(i14 | i17 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919));
        if (i18 == 1) {
            int i19 = f54745k;
            int i20 = i19 & 73;
            int i21 = (((i19 ^ 73) | i20) << 1) - ((i19 | 73) & (~i20));
            f54744j = i21 % 128;
            if (i21 % 2 == 0) {
                setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                return "";
            }
            setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
            int i22 = 29 / 0;
            return "";
        }
        KProperty<Object>[] kPropertyArr = f54743i;
        if (i18 == 2) {
            bz bzVar = (bz) objArr[0];
            cb cbVar = (cb) objArr[1];
            int i23 = f54744j;
            int i24 = ((-1) << 1) - (((i23 & 62) + (i23 | 62)) ^ (-1));
            f54745k = i24 % 128;
            if (i24 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cbVar, "");
                n nVar = bzVar.f54747g;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar, bzVar, kPropertyArr[1], cbVar}, 697712004, -697712004, System.identityHashCode(nVar));
            } else {
                Intrinsics.checkNotNullParameter(cbVar, "");
                n nVar2 = bzVar.f54747g;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar2, bzVar, kPropertyArr[1], cbVar}, 697712004, -697712004, System.identityHashCode(nVar2));
            }
        } else if (i18 != 3) {
            bz bzVar2 = (bz) objArr[0];
            byte bByteValue = ((Byte) objArr[1]).byteValue();
            int i25 = f54744j;
            int i26 = (((i25 | 92) << 1) - (i25 ^ 92)) - 1;
            f54745k = i26 % 128;
            int i27 = i26 % 2;
            p pVar = bzVar2.f54746f;
            p.setX(new Object[]{pVar, bzVar2, kPropertyArr[0], Byte.valueOf(bByteValue)}, 1628090707, -1628090706, System.identityHashCode(pVar));
            int i28 = f54745k;
            int i29 = i28 & 29;
            int i30 = (i28 ^ 29) | i29;
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            f54744j = i31 % 128;
            int i32 = i31 % 2;
        } else {
            bz bzVar3 = (bz) objArr[0];
            ce ceVar = (ce) objArr[1];
            int i33 = f54745k;
            int i34 = i33 & 97;
            int i35 = ((i33 ^ 97) | i34) << 1;
            int i36 = -((i33 | 97) & (~i34));
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            f54744j = i37 % 128;
            if (i37 % 2 != 0) {
                Intrinsics.checkNotNullParameter(ceVar, "");
                n nVar3 = bzVar3.f54748h;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar3, bzVar3, kPropertyArr[4], ceVar}, 697712004, -697712004, System.identityHashCode(nVar3));
            } else {
                Intrinsics.checkNotNullParameter(ceVar, "");
                n nVar4 = bzVar3.f54748h;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar4, bzVar3, kPropertyArr[2], ceVar}, 697712004, -697712004, System.identityHashCode(nVar4));
            }
        }
        return null;
    }

    public final void setDividerPadding(@NotNull cb cbVar) {
        setY(new Object[]{this, cbVar}, -478987183, 478987185, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull ce ceVar) {
        setY(new Object[]{this, ceVar}, 2141338749, -2141338746, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, -1737698158, 1737698159, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(byte b10) {
        setY(new Object[]{this, Byte.valueOf(b10)}, 881254746, -881254746, System.identityHashCode(this));
    }
}
