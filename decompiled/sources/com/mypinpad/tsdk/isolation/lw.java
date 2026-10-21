package com.mypinpad.tsdk.isolation;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class lw extends lo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57006i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f57007j = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull mc mcVar, @NotNull getValue getvalue) {
        super(lqVar, settextkeepstate, mcVar, getvalue);
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(mcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fd fdVar;
        lw lwVar = (lw) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i13 = f57007j;
        int i14 = i13 & 109;
        int i15 = i14 + ((i13 ^ 109) | i14);
        f57006i = i15 % 128;
        int i16 = i15 % 2;
        Intrinsics.checkNotNullParameter(setrotationx, "");
        dx dxVar = dx.INSTANCE;
        Object onFocusChangeListener = lwVar.setOnFocusChangeListener();
        setTextKeepState compoundDrawableTintBlendMode = lwVar.setCompoundDrawableTintBlendMode();
        ew ewVar = (ew) lwVar.setX();
        lq lqVar = (lq) lwVar.setOnFocusChangeListener();
        ds dsVar = (ds) lq.setCompoundDrawableTintBlendMode(new Object[]{lqVar}, 328985409, -328985407, System.identityHashCode(lqVar));
        lq lqVar2 = (lq) lwVar.setOnFocusChangeListener();
        Pair pair = (Pair) dx.setY(new Object[]{dxVar, onFocusChangeListener, compoundDrawableTintBlendMode, ewVar, setrotationx, dsVar, (setFitsSystemWindows) lq.setCompoundDrawableTintBlendMode(new Object[]{lqVar2}, -1934930086, 1934930090, System.identityHashCode(lqVar2))}, 2109200881, -2109200880, System.identityHashCode(dxVar));
        fk fkVar = (fk) pair.component1();
        boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        if (fkVar != null) {
            int i17 = f57006i;
            int i18 = (i17 & (-40)) | ((~i17) & 39);
            int i19 = (i17 & 39) << 1;
            int i20 = (i18 & i19) + (i18 | i19);
            f57007j = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i17 & 91;
            int i23 = (i22 - (~(-(-((i17 ^ 91) | i22))))) - 1;
            f57007j = i23 % 128;
            int i24 = i23 % 2;
            return fkVar;
        }
        mc mcVar = (mc) lwVar.setX();
        mc.setCompoundDrawableTintBlendMode(new Object[]{mcVar, (lq) lwVar.setOnFocusChangeListener(), lwVar.setCompoundDrawableTintBlendMode()}, 341676927, -341676926, System.identityHashCode(mcVar));
        if (zBooleanValue) {
            int i25 = f57006i;
            int i26 = i25 & 21;
            int i27 = ((i25 | 21) & (~i26)) + (i26 << 1);
            f57007j = i27 % 128;
            if (i27 % 2 == 0) {
                fd.Companion companion = fd.INSTANCE;
                throw null;
            }
            fdVar = fd.ONLINE_REQUEST;
        } else {
            fdVar = fd.DECLINED;
            int i28 = f57006i;
            int i29 = ((i28 | 123) << 1) - (i28 ^ 123);
            f57007j = i29 % 128;
            int i30 = i29 % 2;
        }
        ly lyVar = new ly((lq) lwVar.setOnFocusChangeListener(), lwVar.setCompoundDrawableTintBlendMode(), (mc) lwVar.setX());
        fk fkVar2 = (fk) ly.setX(new Object[]{lyVar, fdVar}, -1513967758, 1513967758, System.identityHashCode(lyVar));
        int i31 = f57006i + 3;
        f57007j = i31 % 128;
        int i32 = i31 % 2;
        return fkVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setX(new Object[]{this, setrotationx}, 1172459035, -1172459035, System.identityHashCode(this));
    }
}
