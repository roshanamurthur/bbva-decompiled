package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/ey;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;)Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class ey {

    @NotNull
    public static final ey INSTANCE = new ey();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55434a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55435b = 1;

    static {
        int i10 = f55434a;
        int i11 = (((i10 & (-126)) | ((~i10) & 125)) - (~((i10 & 125) << 1))) - 1;
        f55435b = i11 % 128;
        int i12 = i11 % 2;
    }

    @NotNull
    public static getBeepOnFailure setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade p4) {
        return (getBeepOnFailure) setY(new Object[]{p4}, 1660534021, -1660534020, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        getBeepOnFailure getbeeponfailure;
        Object dividerPadding;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i14)) | (~(i13 | i12))) * 959) + (i13 * (-959)) + (((~(i13 | i14)) | (~(i10 | i12))) * 959) + (i11 * (-1917)) + (i10 * 960);
        if (i15 == 1) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
            int i16 = f55434a + 117;
            f55435b = i16 % 128;
            if (i16 % 2 == 0) {
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                setY(new Object[0], -213177429, 213177429, (int) System.currentTimeMillis());
                throw null;
            }
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            setY(new Object[0], -213177429, 213177429, (int) System.currentTimeMillis());
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setY(new Object[]{setscrollbardefaultdelaybeforefade}, -537765286, 537765288, (int) System.currentTimeMillis());
            int i17 = f55435b;
            int i18 = i17 & 33;
            int i19 = (i17 | 33) & (~i18);
            int i20 = -(-(i18 << 1));
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            f55434a = i21 % 128;
            int i22 = i21 % 2;
            return getbeeponfailure2;
        }
        if (i15 != 2) {
            int i23 = f55435b + 117;
            f55434a = i23 % 128;
            if (i23 % 2 == 0) {
                Unit unit = Unit.INSTANCE;
                setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                return null;
            }
            Unit unit2 = Unit.INSTANCE;
            setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
            int i24 = 79 / 0;
            return null;
        }
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i25 = f55434a;
        int i26 = (((i25 ^ 117) | (i25 & 117)) << 1) - ((117 & (~i25)) | (i25 & (-118)));
        f55435b = i26 % 128;
        if (i26 % 2 == 0) {
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -637466314, 637466461, (int) System.currentTimeMillis());
            getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), null, null, Boolean.FALSE, 98}, -976227287, 976227290, 98);
            dividerPadding = setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2}, -1161703492, 1161703507, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
        } else {
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
            setAnimation setanimation2 = setAnimation.INSTANCE;
            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -637466314, 637466461, (int) System.currentTimeMillis());
            getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
            dividerPadding = setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2}, -1161703492, 1161703507, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
        }
        int i27 = f55434a + 73;
        f55435b = i27 % 128;
        int i28 = i27 % 2;
        for (TransactionFailed transactionFailed3 : (List) dividerPadding) {
            int i29 = f55435b + 103;
            f55434a = i29 % 128;
            int i30 = i29 % 2;
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -1511355589, 1511355624, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
            if (getbeeponfailure3 == null) {
                int i31 = f55434a;
                int i32 = i31 & 77;
                int i33 = ((i31 ^ 77) | i32) << 1;
                int i34 = -((i31 | 77) & (~i32));
                int i35 = (i33 & i34) + (i34 | i33);
                f55435b = i35 % 128;
                int i36 = i35 % 2;
                getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -874272392, 874272455, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                int i37 = f55434a;
                int i38 = (((i37 | 84) << 1) - (i37 ^ 84)) - 1;
                f55435b = i38 % 128;
                int i39 = i38 % 2;
            } else {
                int i40 = f55435b;
                int i41 = i40 & 75;
                int i42 = (i40 ^ 75) | i41;
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f55434a = i43 % 128;
                int i44 = i43 % 2;
            }
            if (getbeeponfailure3 != null) {
                int i45 = (-2) - ((f55434a + 32) ^ (-1));
                f55435b = i45 % 128;
                int i46 = i45 % 2;
                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, getbeeponfailure3.setNavigationOnClickListener()}, 1215253814, -1215253809, System.identityHashCode(getbeeponfailure));
                int i47 = f55434a + 87;
                f55435b = i47 % 128;
                int i48 = i47 % 2;
            }
            int i49 = f55435b;
            int i50 = i49 & 89;
            int i51 = -(-(i49 | 89));
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            f55434a = i52 % 128;
            int i53 = i52 % 2;
        }
        int i54 = f55434a;
        int i55 = (i54 ^ 29) + ((i54 & 29) << 1);
        f55435b = i55 % 128;
        if (i55 % 2 != 0) {
            return getbeeponfailure;
        }
        int i56 = 94 / 0;
        return getbeeponfailure;
    }
}
