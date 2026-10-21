package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ly {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57011d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57012e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final lq f57013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f57014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final mc f57015c;

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[fd.valuesCustom().length];
            iArr[fd.ONLINE_REQUEST.ordinal()] = 1;
            iArr[fd.DECLINED.ordinal()] = 2;
            setCompoundDrawableTintBlendMode = iArr;
            int i10 = 1 & 75;
            int i11 = (i10 - (~(-(-((1 ^ 75) | i10))))) - 1;
            int i12 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }
    }

    public ly(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull mc mcVar) {
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(mcVar, "");
        this.f57013a = lqVar;
        this.f57014b = settextkeepstate;
        this.f57015c = mcVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        fk fkVar;
        ly lyVar = (ly) objArr[0];
        fd fdVar = (fd) objArr[1];
        int i13 = f57012e;
        int i14 = i13 ^ 43;
        int i15 = ((i13 & 43) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        f57011d = i17 % 128;
        int i18 = i17 % 2;
        Intrinsics.checkNotNullParameter(fdVar, "");
        lq lqVar = lyVar.f57013a;
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{lqVar}, -672536244, 672536278, System.identityHashCode(lqVar));
        TransactionFailed persistentDrawingCache = setAnimation.setPersistentDrawingCache();
        lq lqVar2 = lyVar.f57013a;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{lqVar2, persistentDrawingCache}, -1593889019, 1593889062, System.identityHashCode(lqVar2));
        if (getbeeponfailure != null) {
            int i19 = f57011d;
            int i20 = ((i19 | 81) << 1) - (i19 ^ 81);
            f57012e = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 42 / 0;
            }
        }
        int i22 = setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode[fdVar.ordinal()];
        setTextKeepState settextkeepstate = lyVar.f57014b;
        mc mcVar = lyVar.f57015c;
        if (i22 == 1) {
            fkVar = (fk) mc.setCompoundDrawableTintBlendMode(new Object[]{mcVar, lqVar2, settextkeepstate, activateSession.AUTHORISING_PLEASE_WAIT, fd.ONLINE_REQUEST, settransitionvisibility}, 892756200, -892756193, System.identityHashCode(mcVar));
            int i23 = f57011d;
            int i24 = (i23 ^ 45) + ((i23 & 45) << 1);
            f57012e = i24 % 128;
            if (i24 % 2 == 0) {
                throw null;
            }
        } else {
            if (i22 != 2) {
                throw new fh(23, fdVar.toString());
            }
            fkVar = (fk) mc.setCompoundDrawableTintBlendMode(new Object[]{mcVar, lqVar2, settextkeepstate, activateSession.NOT_AUTHORISED, fd.DECLINED, settransitionvisibility}, 892756200, -892756193, System.identityHashCode(mcVar));
            int i25 = f57011d;
            int i26 = i25 & 117;
            int i27 = i26 + ((i25 ^ 117) | i26);
            f57012e = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 84 / 0;
            }
        }
        return fkVar;
    }

    @NotNull
    public final fk setDividerPadding(@NotNull fd fdVar) {
        return (fk) setX(new Object[]{this, fdVar}, -1513967758, 1513967758, System.identityHashCode(this));
    }
}
