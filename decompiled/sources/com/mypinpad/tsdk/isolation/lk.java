package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class lk extends ky {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f56960f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56961g = 1;

    public /* synthetic */ class setX {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setFitsSystemWindows.values().length];
            iArr[setFitsSystemWindows.setOnFocusChangeListener.ordinal()] = 1;
            iArr[setFitsSystemWindows.setX.ordinal()] = 2;
            setX = iArr;
            int i10 = 1 & 93;
            int i11 = (((~i10) & (1 | 93)) - (~(i10 << 1))) - 1;
            int i12 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull lj ljVar) {
        super(kzVar, settextkeepstate, ljVar);
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ljVar, "");
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        fd fdVar;
        lk lkVar = (lk) objArr[0];
        int i13 = f56961g;
        int i14 = ((i13 & 44) + (i13 | 44)) - 1;
        f56960f = i14 % 128;
        int i15 = i14 % 2;
        ee eeVar = ee.setDividerPadding;
        kz onFocusChangeListener = lkVar.setOnFocusChangeListener();
        kz onFocusChangeListener2 = lkVar.setOnFocusChangeListener();
        int i16 = setX.setX[((setFitsSystemWindows) ee.setOnFocusChangeListener(new Object[]{onFocusChangeListener, Long.valueOf(((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) kz.setOnFocusChangeListener(new Object[]{onFocusChangeListener2}, 405523870, -405523868, System.identityHashCode(onFocusChangeListener2))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue())}, -1226013544, 1226013559, (int) System.currentTimeMillis())).ordinal()];
        if (i16 == 1) {
            fdVar = fd.DECLINED;
            int i17 = f56960f;
            int i18 = i17 | 3;
            int i19 = i18 << 1;
            int i20 = -((~(i17 & 3)) & i18);
            int i21 = (i19 & i20) + (i20 | i19);
            f56961g = i21 % 128;
            int i22 = i21 % 2;
        } else if (i16 != 2) {
            fdVar = fd.N_A;
            int i23 = f56961g;
            int i24 = (i23 & 60) + (i23 | 60);
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            f56960f = i25 % 128;
            int i26 = i25 % 2;
        } else {
            fdVar = fd.ONLINE_REQUEST;
            System.identityHashCode(lkVar);
            System.identityHashCode(lkVar);
        }
        lh lhVar = new lh(lkVar.setOnFocusChangeListener(), lkVar.setCompoundDrawableTintBlendMode(), lkVar.setX());
        fk fkVar = (fk) lh.setOnFocusChangeListener(new Object[]{lhVar, fdVar}, 1529335352, -1529335352, System.identityHashCode(lhVar));
        int i27 = f56960f;
        int i28 = (i27 ^ 79) + ((i27 & 79) << 1);
        f56961g = i28 % 128;
        int i29 = i28 % 2;
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setY(new Object[]{this, continuation}, -1293135664, 1293135664, System.identityHashCode(this));
    }
}
