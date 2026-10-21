package com.mypinpad.tsdk.isolation;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/jl;", "", "Lcom/mypinpad/tsdk/i/iv;", "p0", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/getValue;", "p2", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p3", "Lcom/mypinpad/tsdk/i/kc;", "p4", "Lcom/mypinpad/tsdk/i/fk;", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/iv;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/getValue;Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/kc;)Lcom/mypinpad/tsdk/i/fk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class jl {

    @NotNull
    public static final jl INSTANCE = new jl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56649a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56650b = 1;

    static {
        int i10 = f56649a;
        int i11 = (i10 ^ 11) + ((i10 & 11) << 1);
        f56650b = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:10:0x00c0->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x00ab  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
        int i15 = ~i11;
        if (((~(i15 | i13 | i12)) * 566) + ((~(i10 | i15)) * 566) + i14 == 1) {
            iv ivVar = (iv) objArr[0];
            setTextKeepState settextkeepstate = (setTextKeepState) objArr[1];
            getValue getvalue = (getValue) objArr[2];
            setContentDescription setcontentdescription = (setContentDescription) objArr[3];
            kc kcVar = (kc) objArr[4];
            int i16 = f56650b;
            int i17 = (i16 & 105) + (i16 | 105);
            f56649a = i17 % 128;
            if (i17 % 2 != 0) {
                Intrinsics.checkNotNullParameter(ivVar, "");
                Intrinsics.checkNotNullParameter(settextkeepstate, "");
                Intrinsics.checkNotNullParameter(getvalue, "");
                Intrinsics.checkNotNullParameter(setcontentdescription, "");
                Intrinsics.checkNotNullParameter(kcVar, "");
                ef efVar = ef.INSTANCE;
                fk fkVar = fk.setX;
                throw null;
            }
            Intrinsics.checkNotNullParameter(ivVar, "");
            Intrinsics.checkNotNullParameter(settextkeepstate, "");
            Intrinsics.checkNotNullParameter(getvalue, "");
            Intrinsics.checkNotNullParameter(setcontentdescription, "");
            Intrinsics.checkNotNullParameter(kcVar, "");
            ef efVar2 = ef.INSTANCE;
            fk fkVar2 = (fk) ef.setY(new Object[]{ivVar, setcontentdescription, getvalue}, 327425298, -327425297, (int) System.currentTimeMillis());
            if (fkVar2 != fk.setTextAlignment || ((Boolean) setDividerPadding(new Object[]{ivVar}, 2058435888, -2058435888, (int) System.currentTimeMillis())).booleanValue()) {
                int i18 = f56649a;
                int i19 = i18 | 59;
                int i20 = i19 << 1;
                int i21 = -((~(i18 & 59)) & i19);
                int i22 = (i20 & i21) + (i21 | i20);
                f56650b = i22 % 128;
                int i23 = i22 % 2;
                return fkVar2;
            }
            int i24 = f56649a + 25;
            f56650b = i24 % 128;
            if (i24 % 2 == 0) {
                throw null;
            }
            fk fkVar3 = (fk) kc.setDividerPadding(new Object[]{kcVar, ivVar, settextkeepstate}, 37118063, -37118043, System.identityHashCode(kcVar));
            int i25 = f56649a + 85;
            f56650b = i25 % 128;
            int i26 = i25 % 2;
            return fkVar3;
        }
        iv ivVar2 = (iv) objArr[0];
        int i27 = f56650b;
        int i28 = ((((i27 ^ 49) | (i27 & 49)) << 1) - (~(-(((~i27) & 49) | (i27 & (-50)))))) - 1;
        f56649a = i28 % 128;
        int i29 = i28 % 2;
        setAnimation setanimation = setAnimation.INSTANCE;
        List<TransactionFailed> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 1260159524, -1260159512, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1817971805, -1817971762, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], -154084724, 154084974, (int) System.currentTimeMillis())});
        if (!(listListOf instanceof Collection)) {
            int i30 = f56650b;
            int i31 = (-2) - ((((i30 | 56) << 1) - (i30 ^ 56)) ^ (-1));
            f56649a = i31 % 128;
            int i32 = i31 % 2;
            for (TransactionFailed transactionFailed : listListOf) {
                int i33 = f56649a;
                int i34 = i33 & 1;
                int i35 = (i34 - (~(-(-((i33 ^ 1) | i34))))) - 1;
                f56650b = i35 % 128;
                int i36 = i35 % 2;
                if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(ivVar2))).booleanValue()) {
                    int i37 = f56650b;
                    int i38 = i37 & 65;
                    int i39 = -(-(i37 | 65));
                    int i40 = (i38 & i39) + (i38 | i39);
                    f56649a = i40 % 128;
                    int i41 = i40 % 2;
                    int i42 = (i37 & 27) + (i37 | 27);
                    f56649a = i42 % 128;
                    int i43 = i42 % 2;
                    return Boolean.FALSE;
                }
            }
        } else {
            int i44 = f56650b;
            int i45 = i44 & 49;
            int i46 = ((((i44 ^ 49) | i45) << 1) - (~(-((i44 | 49) & (~i45))))) - 1;
            f56649a = i46 % 128;
            int i47 = i46 % 2;
            if (!listListOf.isEmpty()) {
                int i310 = f56650b;
                int i311 = (-2) - ((((i310 | 56) << 1) - (i310 ^ 56)) ^ (-1));
                f56649a = i311 % 128;
                int i312 = i311 % 2;
                while (r12.hasNext()) {
                    int i313 = f56649a;
                    int i314 = i313 & 1;
                    int i315 = (i314 - (~(-(-((i313 ^ 1) | i314))))) - 1;
                    f56650b = i315 % 128;
                    int i316 = i315 % 2;
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(ivVar2))).booleanValue()) {
                        int i317 = f56650b;
                        int i318 = i317 & 65;
                        int i319 = -(-(i317 | 65));
                        int i48 = (i318 & i319) + (i318 | i319);
                        f56649a = i48 % 128;
                        int i49 = i48 % 2;
                        int i410 = (i317 & 27) + (i317 | 27);
                        f56649a = i410 % 128;
                        int i411 = i410 % 2;
                        return Boolean.FALSE;
                    }
                }
            }
        }
        int i50 = f56649a + 48;
        int i51 = (i50 ^ (-1)) + (i50 << 1);
        f56650b = i51 % 128;
        if (i51 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    @NotNull
    public static fk setDividerPadding(@NotNull iv p4, @NotNull setTextKeepState p10, @NotNull getValue p11, @NotNull setContentDescription p12, @NotNull kc p13) {
        return (fk) setDividerPadding(new Object[]{p4, p10, p11, p12, p13}, 708475684, -708475683, (int) System.currentTimeMillis());
    }
}
