package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/dv;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "Lcom/mypinpad/tsdk/i/do;", "p1", "", "setX", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/do;)V", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class dv {

    @NotNull
    public static final dv INSTANCE = new dv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55262a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55263b = 1;

    static {
        int i10 = f55263b;
        int i11 = (i10 ^ 37) + ((i10 & 37) << 1);
        f55262a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0075  */
    /* JADX WARN: Code duplicated, block: B:13:0x008b  */
    /* JADX WARN: Code duplicated, block: B:14:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:15:0x0106  */
    /* JADX WARN: Code duplicated, block: B:9:0x004e A[PHI: r4
      0x004e: PHI (r4v6 byte[]) = (r4v5 byte[]), (r4v56 byte[]) binds: [B:8:0x004c, B:5:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        byte[] onFocusChangeListener;
        getBeepOnFailure getbeeponfailure;
        int i13;
        Object dividerPadding;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        Cdo cdo = (Cdo) objArr[1];
        int i14 = f55263b;
        int i15 = ((i14 | 70) << 1) - (i14 ^ 70);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        f55262a = i16 % 128;
        if (i16 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(cdo, "");
            onFocusChangeListener = cdo.setOnFocusChangeListener();
            int i17 = 5 / 0;
            if (onFocusChangeListener != null) {
                setAnimation setanimation = setAnimation.INSTANCE;
                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                if (getbeeponfailure == null) {
                    int i18 = f55263b;
                    int i19 = i18 & 1;
                    int i20 = (i18 | 1) & (~i19);
                    int i21 = -(-(i19 << 1));
                    i13 = (i20 ^ i21) + ((i20 & i21) << 1);
                    f55262a = i13 % 128;
                    if (i13 % 2 != 0) {
                        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis());
                        getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), null, null, Boolean.TRUE, 96}, -976227287, 976227290, 96);
                    } else {
                        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis());
                        getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
                    }
                } else {
                    int i22 = f55263b;
                    int i23 = i22 | 101;
                    int i24 = ((i23 << 1) - (~(-((~(i22 & 101)) & i23)))) - 1;
                    f55262a = i24 % 128;
                    int i25 = i24 % 2;
                }
                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, onFocusChangeListener}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure));
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                int i26 = f55263b;
                int i27 = i26 & 87;
                int i28 = -(-(i26 | 87));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                f55262a = i29 % 128;
                int i30 = i29 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(cdo, "");
            onFocusChangeListener = cdo.setOnFocusChangeListener();
            if (onFocusChangeListener != null) {
                setAnimation setanimation2 = setAnimation.INSTANCE;
                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                if (getbeeponfailure == null) {
                    int i110 = f55263b;
                    int i111 = i110 & 1;
                    int i210 = (i110 | 1) & (~i111);
                    int i211 = -(-(i111 << 1));
                    i13 = (i210 ^ i211) + ((i210 & i211) << 1);
                    f55262a = i13 % 128;
                    if (i13 % 2 != 0) {
                        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = getBeepOnFailure.setOnFocusChangeListener;
                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis());
                        getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)), null, null, Boolean.TRUE, 96}, -976227287, 976227290, 96);
                    } else {
                        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = getBeepOnFailure.setOnFocusChangeListener;
                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis());
                        getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
                    }
                } else {
                    int i212 = f55263b;
                    int i213 = i212 | 101;
                    int i214 = ((i213 << 1) - (~(-((~(i212 & 101)) & i213)))) - 1;
                    f55262a = i214 % 128;
                    int i215 = i214 % 2;
                }
                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, onFocusChangeListener}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure));
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                int i216 = f55263b;
                int i217 = i216 & 87;
                int i218 = -(-(i216 | 87));
                int i219 = (i217 ^ i218) + ((i218 & i217) << 1);
                f55262a = i219 % 128;
                int i31 = i219 % 2;
            }
        }
        setAnimation setanimation3 = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], 843474092, -843473889, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        if (getbeeponfailure2 == null) {
            int i32 = f55262a;
            int i33 = i32 & 119;
            int i34 = (i33 - (~(-(-((i32 ^ 119) | i33))))) - 1;
            f55263b = i34 % 128;
            if (i34 % 2 == 0) {
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = getBeepOnFailure.setOnFocusChangeListener;
                TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 843474092, -843473889, (int) System.currentTimeMillis());
                dividerPadding = getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5)), null, null, Boolean.TRUE, 23}, -976227287, 976227290, 23);
            } else {
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode6 = getBeepOnFailure.setOnFocusChangeListener;
                TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 843474092, -843473889, (int) System.currentTimeMillis());
                dividerPadding = getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
            }
            getbeeponfailure2 = (getBeepOnFailure) dividerPadding;
        } else {
            int i35 = f55262a;
            int i36 = i35 & 45;
            int i37 = ((i35 | 45) & (~i36)) + (i36 << 1);
            f55263b = i37 % 128;
            int i38 = i37 % 2;
        }
        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, (byte[]) Cdo.setCompoundDrawableTintBlendMode(new Object[]{cdo}, 2022768723, -2022768723, System.identityHashCode(cdo))}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure2));
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, getbeeponfailure2}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        int i39 = f55263b;
        int i40 = ((i39 ^ 100) + ((i39 & 100) << 1)) - 1;
        f55262a = i40 % 128;
        int i41 = i40 % 2;
        return null;
    }

    public static void setX(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull Cdo p10) throws Exception {
        setOnFocusChangeListener(new Object[]{p4, p10}, -2054554965, 2054554965, (int) System.currentTimeMillis());
    }
}
