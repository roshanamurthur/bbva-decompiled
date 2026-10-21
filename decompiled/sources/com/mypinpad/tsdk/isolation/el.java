package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class el extends er {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55384d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55385e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final em f55386c = new em();

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13 = ~i10;
        int i14 = ~i11;
        if ((i14 * 701) + ((i13 | i11) * (-701)) + ((~(i13 | i14)) * 701) + (i11 * 702) + (i10 * (-700)) != 1) {
            el elVar = (el) objArr[0];
            int i15 = f55385e;
            int i16 = ((i15 | 35) << 1) - (i15 ^ 35);
            f55384d = i16 % 128;
            if (i16 % 2 == 0) {
                return elVar.f55386c;
            }
            em emVar = elVar.f55386c;
            throw null;
        }
        el elVar2 = (el) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        eu euVar = (eu) objArr[3];
        a aVar = (a) objArr[4];
        int i17 = f55385e;
        int i18 = i17 & 39;
        int i19 = -(-((i17 ^ 39) | i18));
        int i20 = (i18 & i19) + (i19 | i18);
        f55384d = i20 % 128;
        if (i20 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(settextkeepstate, "");
            Intrinsics.checkNotNullParameter(euVar, "");
            Intrinsics.checkNotNullParameter(aVar, "");
            setMaxWidth setmaxwidth = (setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar));
            TransactionFailed designatorAfterValue = setAnimation.getDesignatorAfterValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(euVar, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        setMaxWidth setmaxwidth2 = (setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar));
        TransactionFailed designatorAfterValue2 = setAnimation.getDesignatorAfterValue();
        if (((getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth2, (String) TransactionFailed.setX(new Object[]{designatorAfterValue2}, 1914607362, -1914607356, System.identityHashCode(designatorAfterValue2))}, -480651882, 480651889, System.identityHashCode(setmaxwidth2))) != null) {
            setMaxWidth setmaxwidth3 = (setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar));
            int i21 = f55385e;
            int i22 = i21 & 11;
            int i23 = i22 + ((i21 ^ 11) | i22);
            f55384d = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 99 / 0;
            }
        } else {
            super.setOnFocusChangeListener(setscrollbardefaultdelaybeforefade, settextkeepstate, euVar, aVar);
            int i25 = f55384d;
            int i26 = (i25 ^ 101) + ((i25 & 101) << 1);
            f55385e = i26 % 128;
            int i27 = i26 % 2;
        }
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.er
    public final void setOnFocusChangeListener(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar, @NotNull a aVar) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, euVar, aVar}, -129505904, 129505905, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.er
    @NotNull
    public final ei setX() {
        return (ei) setCompoundDrawableTintBlendMode(new Object[]{this}, -1886856678, 1886856678, System.identityHashCode(this));
    }
}
