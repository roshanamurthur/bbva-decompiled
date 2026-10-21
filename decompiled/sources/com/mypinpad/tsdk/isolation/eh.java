package com.mypinpad.tsdk.isolation;

import bk.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\u0004\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\nJ\u0015\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0005J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\f\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/eh;", "", "", "Lcom/mypinpad/tsdk/i/setImageTintBlendMode;", "setOnFocusChangeListener", "()Ljava/util/List;", "setDividerPadding", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;)Z", "setY", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class eh {

    @NotNull
    public static final eh INSTANCE = new eh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55376a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55377b = 1;

    static {
        int i10 = f55376a;
        int i11 = (((i10 | 56) << 1) - (i10 ^ 56)) - 1;
        f55377b = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @NotNull
    public static List<setImageTintBlendMode> setCompoundDrawableTintBlendMode() {
        return (List) setDividerPadding(new Object[0], -516361844, 516361846, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        cq cqVar;
        cr crVar;
        int i13 = (i11 * 971) + (i10 * (-1939));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~((~i12) | i11);
        int i17 = ~i10;
        int i18 = (((~(i17 | i14)) | i16) * 970) + ((~(i11 | i17)) * 1940) + ((i15 | i16) * (-970)) + i13;
        if (i18 == 1) {
            int i19 = f55376a;
            int i20 = ((i19 | 13) << 1) - (i19 ^ 13);
            f55377b = i20 % 128;
            if (i20 % 2 == 0) {
                CollectionsKt__CollectionsKt.emptyList();
                throw null;
            }
            List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            int i21 = f55376a;
            int i22 = (i21 & (-80)) | ((~i21) & 79);
            int i23 = (i21 & 79) << 1;
            int i24 = (i22 & i23) + (i23 | i22);
            f55377b = i24 % 128;
            if (i24 % 2 != 0) {
                return listEmptyList;
            }
            throw null;
        }
        if (i18 == 2) {
            int i25 = f55376a;
            int i26 = i25 & 21;
            int i27 = (i26 - (~((i25 ^ 21) | i26))) - 1;
            f55377b = i27 % 128;
            int i28 = i27 % 2;
            List listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
            int i29 = f55377b;
            int i30 = ((i29 & (-40)) | ((~i29) & 39)) + ((i29 & 39) << 1);
            f55376a = i30 % 128;
            if (i30 % 2 == 0) {
                return listEmptyList2;
            }
            int i31 = 14 / 0;
            return listEmptyList2;
        }
        if (i18 == 3) {
            int i32 = f55376a;
            int i33 = i32 & 121;
            int i34 = (i32 | 121) & (~i33);
            int i35 = -(-(i33 << 1));
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            f55377b = i36 % 128;
            int i37 = i36 % 2;
            List listListOf = d.listOf(setImageTintBlendMode.getNavBarTitleString);
            int i38 = f55377b;
            int i39 = i38 & 109;
            int i40 = ((i38 ^ 109) | i39) << 1;
            int i41 = -((i38 | 109) & (~i39));
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            f55376a = i42 % 128;
            if (i42 % 2 == 0) {
                return listListOf;
            }
            int i43 = 82 / 0;
            return listListOf;
        }
        if (i18 == 4) {
            int i44 = f55377b;
            int i45 = (i44 & (-120)) | ((~i44) & 119);
            int i46 = -(-((i44 & 119) << 1));
            int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
            f55376a = i47 % 128;
            int i48 = i47 % 2;
            List listListOf2 = d.listOf(setImageTintBlendMode.setOnFocusChangeListener);
            int i49 = (-2) - ((f55377b + 74) ^ (-1));
            f55376a = i49 % 128;
            if (i49 % 2 == 0) {
                return listListOf2;
            }
            throw null;
        }
        if (i18 != 5) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
            int i50 = f55377b;
            int i51 = i50 & 79;
            int i52 = ((i50 ^ 79) | i51) << 1;
            int i53 = -((i50 | 79) & (~i51));
            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
            f55376a = i54 % 128;
            int i55 = i54 % 2;
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            setAnimation setanimation = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], -692948779, 692948802, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            if (getbeeponfailure == null) {
                int i56 = f55377b;
                int i57 = ((((i56 ^ 109) | (i56 & 109)) << 1) - (~(-(((~i56) & 109) | (i56 & (-110)))))) - 1;
                int i58 = i57 % 128;
                f55376a = i58;
                if (i57 % 2 != 0) {
                    throw null;
                }
                int i59 = ((i58 | 6) << 1) - (i58 ^ 6);
                int i60 = (i59 ^ (-1)) + (i59 << 1);
                f55377b = i60 % 128;
                int i61 = i60 % 2;
                crVar = null;
            } else {
                cs csVar = new cs(getbeeponfailure);
                crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
            if (crVar != null) {
                boolean zBooleanValue = ((Boolean) cr.setDividerPadding(new Object[]{crVar}, 1815100415, -1815100409, System.identityHashCode(crVar))).booleanValue();
                int i62 = f55376a;
                int i63 = i62 & 117;
                int i64 = (i62 ^ 117) | i63;
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                f55377b = i65 % 128;
                int i66 = i65 % 2;
                return Boolean.valueOf(zBooleanValue);
            }
            int i67 = f55377b;
            int i68 = ((i67 | 35) << 1) - (i67 ^ 35);
            int i69 = i68 % 128;
            f55376a = i69;
            boolean z10 = i68 % 2 != 0;
            int i70 = (((i69 ^ 27) | (i69 & 27)) << 1) - (((~i69) & 27) | (i69 & (-28)));
            f55377b = i70 % 128;
            if (i70 % 2 != 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i71 = f55377b;
        int i72 = ((i71 ^ 23) | (i71 & 23)) << 1;
        int i73 = -(((~i71) & 23) | (i71 & (-24)));
        int i74 = (i72 & i73) + (i73 | i72);
        f55376a = i74 % 128;
        int i75 = i74 % 2;
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade2, "");
        setAnimation setanimation2 = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
        if (getbeeponfailure2 == null) {
            int i76 = f55376a;
            int i77 = ((i76 | 9) << 1) - (((~i76) & 9) | (i76 & (-10)));
            f55377b = i77 % 128;
            if (i77 % 2 == 0) {
                int i78 = 80 / 0;
            }
            cqVar = null;
        } else {
            cu cuVar = new cu(getbeeponfailure2);
            cqVar = (cq) ((setImageTintList) w.setX(new Object[]{cuVar}, 1693919772, -1693919769, System.identityHashCode(cuVar)));
            int i79 = f55377b;
            int i80 = (i79 ^ 63) + ((i79 & 63) << 1);
            f55376a = i80 % 128;
            int i81 = i80 % 2;
        }
        if (cqVar != null) {
            boolean zBooleanValue2 = ((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 112512454, -112512442, System.identityHashCode(cqVar))).booleanValue();
            int i82 = f55377b;
            int i83 = i82 & 55;
            int i84 = (i82 | 55) & (~i83);
            int i85 = -(-(i83 << 1));
            int i86 = (i84 ^ i85) + ((i84 & i85) << 1);
            f55376a = i86 % 128;
            if (i86 % 2 == 0) {
                return Boolean.valueOf(zBooleanValue2);
            }
            throw null;
        }
        int i87 = f55376a;
        int i88 = i87 & 25;
        int i89 = ((i87 ^ 25) | i88) << 1;
        int i90 = -((i87 | 25) & (~i88));
        int i91 = (i89 ^ i90) + ((i90 & i89) << 1);
        int i92 = i91 % 128;
        f55377b = i92;
        int i93 = i91 % 2;
        int i94 = (-2) - ((i92 + 54) ^ (-1));
        f55376a = i94 % 128;
        if (i94 % 2 != 0) {
            int i95 = 39 / 0;
        }
        return Boolean.FALSE;
    }

    public static boolean setOnFocusChangeListener(@NotNull setScrollBarDefaultDelayBeforeFade p4) {
        return ((Boolean) setDividerPadding(new Object[]{p4}, -1976408796, 1976408801, (int) System.currentTimeMillis())).booleanValue();
    }

    @NotNull
    public static List<setImageTintBlendMode> setY() {
        return (List) setDividerPadding(new Object[0], 766096637, -766096636, (int) System.currentTimeMillis());
    }

    @NotNull
    public static List<setImageTintBlendMode> setOnFocusChangeListener() {
        return (List) setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis());
    }

    public static boolean setDividerPadding(@NotNull setScrollBarDefaultDelayBeforeFade p4) {
        return ((Boolean) setDividerPadding(new Object[]{p4}, 967111399, -967111399, (int) System.currentTimeMillis())).booleanValue();
    }

    @NotNull
    public static List<setImageTintBlendMode> setDividerPadding() {
        return (List) setDividerPadding(new Object[0], -51816101, 51816104, (int) System.currentTimeMillis());
    }
}
