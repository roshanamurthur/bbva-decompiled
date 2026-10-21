package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56109a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56110b = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setMaxWidth setmaxwidth = new setMaxWidth();
        setAnimation setanimation = setAnimation.INSTANCE;
        List<Pair> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -1540796460, 1540796546, (int) System.currentTimeMillis()), "0000000000"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], 567755471, -567755289, (int) System.currentTimeMillis()), "0002"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -1664305091, 1664305098, (int) System.currentTimeMillis()), "00"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -1469601949, 1469602107, (int) System.currentTimeMillis()), "00"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -1772869869, 1772870128, (int) System.currentTimeMillis()), "00"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], 1337004710, -1337004604, (int) System.currentTimeMillis()), "9F6A04"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -581523700, 581523791, (int) System.currentTimeMillis()), "0D"), TuplesKt.to(setAnimation.setScrollBarStyle(), "00"), TuplesKt.to(setAnimation.applicationCreated(), "02"), TuplesKt.to(setAnimation.setDividerHeight(), "012C"), TuplesKt.to(setAnimation.setHorizontalScrollBarEnabled(), "00"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -1773023437, 1773023670, (int) System.currentTimeMillis()), "000013"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -1875940328, 1875940526, (int) System.currentTimeMillis()), "0032"), TuplesKt.to(setAnimation.setSupportBackgroundTintList(), "0014"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], 1827418416, -1827418358, (int) System.currentTimeMillis()), "000001000001200000080000080020000004000004002000000100000100200000020000020020000000000000000700"), TuplesKt.to(setAnimation.setColorFilter(), "000000000000"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], 1729290740, -1729290532, (int) System.currentTimeMillis()), "000000000000"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -1152230407, 1152230575, (int) System.currentTimeMillis()), "000000000000"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -983972997, 983973214, (int) System.currentTimeMillis()), "000000000000"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], 177432468, -177432400, (int) System.currentTimeMillis()), "05DC"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], 231627235, -231627203, (int) System.currentTimeMillis()), "32"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], 917752193, -917752105, (int) System.currentTimeMillis()), "00"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], 499827513, -499827474, (int) System.currentTimeMillis()), "840000000C"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], 166350058, -166349798, (int) System.currentTimeMillis()), "840000000C"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -1173953479, 1173953575, (int) System.currentTimeMillis()), "840000000C"), TuplesKt.to(setAnimation.setOnCapturedPointerListener(), "0000"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -118459840, 118459878, (int) System.currentTimeMillis()), "0012"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -758464039, 758464168, (int) System.currentTimeMillis()), "0018"), TuplesKt.to((TransactionFailed) setAnimation.setY(new Object[0], -835982431, 835982546, (int) System.currentTimeMillis()), "00"), TuplesKt.to(setAnimation.getDiscretionaryTagData(), "01F4")});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        int i13 = f56109a;
        int i14 = i13 & 25;
        int i15 = (((i13 | 25) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
        f56110b = i15 % 128;
        int i16 = i15 % 2;
        for (Pair pair : listListOf) {
            int i17 = f56110b;
            int i18 = i17 & 65;
            int i19 = i18 + ((i17 ^ 65) | i18);
            f56109a = i19 % 128;
            int i20 = i19 % 2;
            TransactionFailed transactionFailed = (TransactionFailed) pair.component1();
            String str = (String) pair.component2();
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            arrayList.add((getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), str, Terminal.KERNEL_2}, -1778552586, 1778552596, System.identityHashCode(setcompounddrawabletintblendmode)));
            int i21 = f56110b;
            int i22 = i21 & 27;
            int i23 = (i22 - (~((i21 ^ 27) | i22))) - 1;
            f56109a = i23 % 128;
            int i24 = i23 % 2;
        }
        setmaxwidth.addAll(arrayList);
        int i25 = f56109a;
        int i26 = (i25 ^ 22) + ((i25 & 22) << 1);
        int i27 = (i26 ^ (-1)) + (i26 << 1);
        f56110b = i27 % 128;
        if (i27 % 2 != 0) {
            return setmaxwidth;
        }
        throw null;
    }

    @NotNull
    public static final setMaxWidth setY() {
        return (setMaxWidth) setDividerPadding(new Object[0], -1346593006, 1346593006, (int) System.currentTimeMillis());
    }
}
