package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class jt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56697d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f56698e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final iv f56699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f56700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kc f56701c;

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[fd.valuesCustom().length];
            iArr[fd.ONLINE_REQUEST.ordinal()] = 1;
            iArr[fd.DECLINED.ordinal()] = 2;
            setCompoundDrawableTintBlendMode = iArr;
            int i10 = (0 - (-44)) - 1;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    public jt(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull kc kcVar) {
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kcVar, "");
        this.f56699a = ivVar;
        this.f56700b = settextkeepstate;
        this.f56701c = kcVar;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        jt jtVar = (jt) objArr[0];
        fd fdVar = (fd) objArr[1];
        int i13 = f56698e + 89;
        f56697d = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fdVar, "");
            iv ivVar = jtVar.f56699a;
            TransactionFailed persistentDrawingCache = setAnimation.setPersistentDrawingCache();
            iv ivVar2 = jtVar.f56699a;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fdVar, "");
        iv ivVar3 = jtVar.f56699a;
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar3}, -672536244, 672536278, System.identityHashCode(ivVar3));
        TransactionFailed persistentDrawingCache2 = setAnimation.setPersistentDrawingCache();
        iv ivVar4 = jtVar.f56699a;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar4, persistentDrawingCache2}, -1593889019, 1593889062, System.identityHashCode(ivVar4));
        if (getbeeponfailure != null) {
            int i14 = f56698e;
            int i15 = ((i14 & 9) - (~(i14 | 9))) - 1;
            f56697d = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = setY.setCompoundDrawableTintBlendMode[fdVar.ordinal()];
        setTextKeepState settextkeepstate = jtVar.f56700b;
        kc kcVar = jtVar.f56701c;
        if (i17 == 1) {
            fk fkVar = (fk) kc.setDividerPadding(new Object[]{kcVar, ivVar4, settextkeepstate, activateSession.AUTHORISING_PLEASE_WAIT, fd.ONLINE_REQUEST, settransitionvisibility}, 1701233296, -1701233283, System.identityHashCode(kcVar));
            int i18 = f56697d;
            int i19 = i18 & 15;
            int i20 = (((i18 ^ 15) | i19) << 1) - ((i18 | 15) & (~i19));
            f56698e = i20 % 128;
            int i21 = i20 % 2;
            return fkVar;
        }
        if (i17 != 2) {
            throw new fh(23, fdVar.toString());
        }
        fk fkVar2 = (fk) kc.setDividerPadding(new Object[]{kcVar, ivVar4, settextkeepstate, activateSession.NOT_AUTHORISED, fd.DECLINED, settransitionvisibility}, 1701233296, -1701233283, System.identityHashCode(kcVar));
        int i22 = f56697d + 7;
        f56698e = i22 % 128;
        if (i22 % 2 != 0) {
            return fkVar2;
        }
        int i23 = 61 / 0;
        return fkVar2;
    }

    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull fd fdVar) {
        return (fk) setDividerPadding(new Object[]{this, fdVar}, -407897628, 407897628, System.identityHashCode(this));
    }
}
