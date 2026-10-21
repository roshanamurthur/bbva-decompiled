package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56421a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56422b = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        gv gvVar = (gv) objArr[0];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[1];
        getValue getvalue = (getValue) objArr[2];
        Continuation continuation = (Continuation) objArr[3];
        ag agVar = new ag(gvVar);
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1412794821, 1412794991, (int) System.currentTimeMillis());
        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 2064855914, -2064855856, System.identityHashCode(gvVar))).booleanValue()) {
            int i13 = f56422b;
            int i14 = i13 & 119;
            int i15 = -(-(i13 | 119));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f56421a = i16 % 128;
            int i17 = i16 % 2;
            if (((ac) ((setImageTintList) w.setX(new Object[]{agVar}, 1693919772, -1693919769, System.identityHashCode(agVar)))).getNavBarTitleString()) {
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -547346090, 547346114, (int) System.currentTimeMillis());
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -232375606, 232375652, System.identityHashCode(gvVar))).booleanValue()) {
                    getvalue.setOnFocusChangeListener(new setDrawingCacheQuality(setInputExtras.setX(setAnimation.setHapticFeedbackEnabled().setOnFocusChangeListener())));
                    hq hqVar = new hq(gvVar, settextkeepstate, getvalue);
                    Object dividerPadding = hq.setDividerPadding(new Object[]{hqVar, continuation}, -1586206821, 1586206822, System.identityHashCode(hqVar));
                    int i18 = f56422b + 83;
                    f56421a = i18 % 128;
                    if (i18 % 2 == 0) {
                        return dividerPadding;
                    }
                    throw null;
                }
                int i19 = f56422b;
                int i20 = i19 & 47;
                int i21 = -(-((i19 ^ 47) | i20));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f56421a = i22 % 128;
                int i23 = i22 % 2;
                fk fkVar = fk.setX;
                int i24 = f56421a;
                int i25 = (i24 & (-56)) | ((~i24) & 55);
                int i26 = (i24 & 55) << 1;
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f56422b = i27 % 128;
                int i28 = i27 % 2;
                return fkVar;
            }
        }
        fk fkVar2 = fk.setX;
        int i29 = f56422b + 99;
        f56421a = i29 % 128;
        int i30 = i29 % 2;
        return fkVar2;
    }

    @Nullable
    public static Object setY(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull getValue getvalue, @NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{gvVar, settextkeepstate, getvalue, continuation}, -2121381249, 2121381249, (int) System.currentTimeMillis());
    }
}
