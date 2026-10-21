package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class jc extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f56627h = {i.d(jc.class, "cvmPerformed_B1", "getCvmPerformed_B1()Lcom/mypinpad/softpos/emv/terminal/kernel/kernel4/model/smarttag/tag/card/CvmPerformed;", 0), i.d(jc.class, "cvmCondition_B2", "getCvmCondition_B2()Lcom/mypinpad/softpos/emv/terminal/kernel/kernel4/model/smarttag/tag/card/CvmCondition;", 0), i.d(jc.class, "cvmResult_B3", "getCvmResult_B3()Lcom/mypinpad/softpos/emv/terminal/kernel/kernel4/model/smarttag/tag/card/MobileCvmResult;", 0)};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f56628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56629j = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f56630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final n f56631g;

    static {
        int i10 = f56629j;
        int i11 = ((i10 ^ 123) | (i10 & 123)) << 1;
        int i12 = -(((~i10) & 123) | (i10 & (-124)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f56628i = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public jc() {
        super(setAnimation.setCompoundDrawables().setDividerPadding());
        jb.Companion companion = jb.INSTANCE;
        this.f56630f = new n(0, 7, 0, (openContextMenu) jb.Companion.setDividerPadding(new Object[0], 1746259235, -1746259235, (int) System.currentTimeMillis()));
        iy.Companion companion2 = iy.INSTANCE;
        new n(1, 7, 0, iy.Companion.setCompoundDrawableTintBlendMode());
        iz.Companion companion3 = iz.INSTANCE;
        this.f56631g = new n(2, 7, 0, (openContextMenu) iz.Companion.setDividerPadding(new Object[0], -1816475843, 1816475843, (int) System.currentTimeMillis()));
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~(i15 | i12);
        int i17 = ~i12;
        int i18 = (((~(i10 | i14 | i12)) | (~(i11 | i13 | i12)) | (~(i15 | i17))) * 920) + (((~i15) | (~(i13 | i17))) * 920) + ((i16 | (~(i14 | i17 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919));
        int i19 = f56628i;
        KProperty<Object>[] kPropertyArr = f56627h;
        if (i18 != 1) {
            jc jcVar = (jc) objArr[0];
            int i20 = ((i19 ^ 59) | (i19 & 59)) << 1;
            int i21 = -(((~i19) & 59) | (i19 & (-60)));
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            f56629j = i22 % 128;
            int i23 = i22 % 2;
            n nVar = jcVar.f56630f;
            return (jb) ((Enum) (i23 == 0 ? n.setCompoundDrawableTintBlendMode(new Object[]{nVar, jcVar, kPropertyArr[0]}, 2052976211, -2052976210, System.identityHashCode(nVar)) : n.setCompoundDrawableTintBlendMode(new Object[]{nVar, jcVar, kPropertyArr[0]}, 2052976211, -2052976210, System.identityHashCode(nVar))));
        }
        jc jcVar2 = (jc) objArr[0];
        int i24 = (i19 & (-58)) | ((~i19) & 57);
        int i25 = (i19 & 57) << 1;
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        f56629j = i26 % 128;
        int i27 = i26 % 2;
        n nVar2 = jcVar2.f56631g;
        iz izVar = (iz) ((Enum) (i27 == 0 ? n.setCompoundDrawableTintBlendMode(new Object[]{nVar2, jcVar2, kPropertyArr[4]}, 2052976211, -2052976210, System.identityHashCode(nVar2)) : n.setCompoundDrawableTintBlendMode(new Object[]{nVar2, jcVar2, kPropertyArr[2]}, 2052976211, -2052976210, System.identityHashCode(nVar2))));
        int i28 = (-2) - (((i19 & 98) + (i19 | 98)) ^ (-1));
        f56629j = i28 % 128;
        if (i28 % 2 != 0) {
            return izVar;
        }
        int i29 = 53 / 0;
        return izVar;
    }

    @NotNull
    public final jb getNavBarTitleString() {
        return (jb) setOnFocusChangeListener(new Object[]{this}, 1362433532, -1362433532, System.identityHashCode(this));
    }

    @NotNull
    public final iz setLayoutAnimation() {
        return (iz) setOnFocusChangeListener(new Object[]{this}, 1232158677, -1232158676, System.identityHashCode(this));
    }
}
