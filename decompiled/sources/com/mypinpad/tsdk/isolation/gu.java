package com.mypinpad.tsdk.isolation;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gu extends fy {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56089i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56090j = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue) {
        super(fiVar, settextkeepstate, grVar, getvalue);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fd fdVar;
        int i13;
        gu guVar = (gu) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i14 = f56090j;
        int i15 = i14 & 67;
        int i16 = (i14 ^ 67) | i15;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f56089i = i17 % 128;
        int i18 = i17 % 2;
        Intrinsics.checkNotNullParameter(setrotationx, "");
        dx dxVar = dx.INSTANCE;
        Object onFocusChangeListener = guVar.setOnFocusChangeListener();
        setTextKeepState compoundDrawableTintBlendMode = guVar.setCompoundDrawableTintBlendMode();
        ew ewVar = (ew) guVar.setX();
        ds dsVar = ds.setCompoundDrawableTintBlendMode;
        fi fiVar = (fi) guVar.setOnFocusChangeListener();
        Pair pair = (Pair) dx.setY(new Object[]{dxVar, onFocusChangeListener, compoundDrawableTintBlendMode, ewVar, setrotationx, dsVar, (setFitsSystemWindows) fi.setY(new Object[]{fiVar}, 1745369071, -1745369070, System.identityHashCode(fiVar))}, 2109200881, -2109200880, System.identityHashCode(dxVar));
        fk fkVar = (fk) pair.component1();
        boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        if (fkVar != null) {
            int i19 = f56090j;
            int i20 = ((i19 | 22) << 1) - (i19 ^ 22);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f56089i = i21 % 128;
            if (i21 % 2 != 0) {
                throw null;
            }
        } else {
            gr grVar = (gr) guVar.setX();
            gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, (fi) guVar.setOnFocusChangeListener(), guVar.setCompoundDrawableTintBlendMode()}, 575703855, -575703854, System.identityHashCode(grVar));
            if (!zBooleanValue) {
                fdVar = fd.DECLINED;
                i13 = (-2) - ((f56089i + 54) ^ (-1));
            } else {
                int i22 = f56090j;
                int i23 = i22 & 41;
                int i24 = -(-((i22 ^ 41) | i23));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f56089i = i25 % 128;
                int i26 = i25 % 2;
                fdVar = fd.ONLINE_REQUEST;
                i13 = f56089i + 83;
            }
            f56090j = i13 % 128;
            int i27 = i13 % 2;
            gp gpVar = new gp((fi) guVar.setOnFocusChangeListener(), guVar.setCompoundDrawableTintBlendMode(), (gr) guVar.setX());
            fkVar = (fk) gp.setCompoundDrawableTintBlendMode(new Object[]{gpVar, fdVar}, 1880982469, -1880982469, System.identityHashCode(gpVar));
            int i28 = f56090j;
            int i29 = i28 & 23;
            int i30 = ((i28 ^ 23) | i29) << 1;
            int i31 = -((i28 | 23) & (~i29));
            int i32 = (i30 & i31) + (i31 | i30);
            f56089i = i32 % 128;
            if (i32 % 2 != 0) {
                throw null;
            }
        }
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setX(new Object[]{this, setrotationx}, 1662157925, -1662157925, System.identityHashCode(this));
    }
}
