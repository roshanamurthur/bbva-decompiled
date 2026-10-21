package com.mypinpad.tsdk.isolation;

import bk.d;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ek extends ei {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55382c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55383d = 1;

    /* JADX WARN: Code duplicated, block: B:27:0x0191  */
    /* JADX WARN: Code duplicated, block: B:29:0x0197  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        List listPlus;
        Object obj;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (~(i13 | i14)) | (~(i14 | i12));
        int i16 = ~i12;
        int i17 = i16 | i10;
        int i18 = ((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773);
        if (i18 == 1) {
            int i19 = f55382c;
            int i20 = i19 & 123;
            int i21 = (i19 ^ 123) | i20;
            int i22 = (i20 & i21) + (i21 | i20);
            f55383d = i22 % 128;
            int i23 = i22 % 2;
            eh ehVar = eh.INSTANCE;
            listPlus = (List) eh.setDividerPadding(new Object[0], -516361844, 516361846, (int) System.currentTimeMillis());
            int i24 = f55383d;
            int i25 = ((i24 & 6) + (i24 | 6)) - 1;
            f55382c = i25 % 128;
            int i26 = i25 % 2;
        } else if (i18 == 2) {
            int i27 = f55383d;
            int i28 = i27 & 29;
            int i29 = (i27 ^ 29) | i28;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f55382c = i30 % 128;
            int i31 = i30 % 2;
            eh ehVar2 = eh.INSTANCE;
            listPlus = CollectionsKt___CollectionsKt.plus((Collection) eh.setDividerPadding(new Object[0], -51816101, 51816104, (int) System.currentTimeMillis()), (Iterable) d.listOf(setImageTintBlendMode.setTextAlignment));
            int i32 = f55382c + 81;
            f55383d = i32 % 128;
            if (i32 % 2 == 0) {
                int i33 = 54 / 0;
            }
        } else {
            if (i18 == 3) {
                ek ekVar = (ek) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                eu euVar = (eu) objArr[3];
                String dividerPadding = (String) objArr[4];
                int i34 = f55383d;
                int i35 = i34 ^ 101;
                int i36 = ((i34 & 101) | i35) << 1;
                int i37 = -i35;
                int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                f55382c = i38 % 128;
                if (i38 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate, "");
                    Intrinsics.checkNotNullParameter(euVar, "");
                    Intrinsics.checkNotNullParameter(dividerPadding, "");
                    int i39 = 25 / 0;
                    if (Intrinsics.areEqual(dividerPadding, setImageTintBlendMode.setTextAlignment.setDividerPadding())) {
                        if (!ekVar.setY(setscrollbardefaultdelaybeforefade)) {
                            int i40 = f55383d;
                            int i41 = i40 ^ 17;
                            int i42 = ((i40 & 17) | i41) << 1;
                            int i43 = -i41;
                            int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                            f55382c = i44 % 128;
                            int i45 = i44 % 2;
                            dividerPadding = setImageTintBlendMode.setOnLongClickListener.setDividerPadding();
                            int i46 = f55383d;
                            int i47 = i46 & 79;
                            int i48 = ((i46 ^ 79) | i47) << 1;
                            int i49 = -((i46 | 79) & (~i47));
                            int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                            f55382c = i50 % 128;
                            int i51 = i50 % 2;
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate, "");
                    Intrinsics.checkNotNullParameter(euVar, "");
                    Intrinsics.checkNotNullParameter(dividerPadding, "");
                    if (!(!Intrinsics.areEqual(dividerPadding, setImageTintBlendMode.setTextAlignment.setDividerPadding()))) {
                        if (!ekVar.setY(setscrollbardefaultdelaybeforefade)) {
                            int i410 = f55383d;
                            int i411 = i410 ^ 17;
                            int i412 = ((i410 & 17) | i411) << 1;
                            int i413 = -i411;
                            int i414 = ((i412 | i413) << 1) - (i412 ^ i413);
                            f55382c = i414 % 128;
                            int i415 = i414 % 2;
                            dividerPadding = setImageTintBlendMode.setOnLongClickListener.setDividerPadding();
                            int i416 = f55383d;
                            int i417 = i416 & 79;
                            int i418 = ((i416 ^ 79) | i417) << 1;
                            int i419 = -((i416 | 79) & (~i417));
                            int i52 = ((i418 | i419) << 1) - (i419 ^ i418);
                            f55382c = i52 % 128;
                            int i53 = i52 % 2;
                        }
                    }
                }
                if (Intrinsics.areEqual(dividerPadding, setImageTintBlendMode.setOnLongClickListener.setDividerPadding())) {
                    bi biVar = new bi(setscrollbardefaultdelaybeforefade);
                    bh bhVar = (bh) ((setImageTintList) w.setX(new Object[]{biVar}, 1693919772, -1693919769, System.identityHashCode(biVar)));
                    if (((bc) bh.setOnFocusChangeListener(new Object[]{bhVar}, 1456793442, -1456793440, System.identityHashCode(bhVar))) == bc.setY) {
                        int i54 = f55382c;
                        int i55 = i54 & 111;
                        int i56 = ((i54 | 111) & (~i55)) + (i55 << 1);
                        f55383d = i56 % 128;
                        if (i56 % 2 == 0) {
                            int i57 = 27 / 0;
                        }
                    } else {
                        if (!((Boolean) bh.setOnFocusChangeListener(new Object[]{bhVar}, 587843053, -587843053, System.identityHashCode(bhVar))).booleanValue()) {
                            int i58 = f55383d;
                            int i59 = i58 & 53;
                            int i60 = (i59 - (~((i58 ^ 53) | i59))) - 1;
                            f55382c = i60 % 128;
                            int i61 = i60 % 2;
                            if (!((Boolean) bh.setOnFocusChangeListener(new Object[]{bhVar}, 1252898241, -1252898240, System.identityHashCode(bhVar))).booleanValue()) {
                                int i62 = f55382c;
                                int i63 = (((i62 | 82) << 1) - (i62 ^ 82)) - 1;
                                f55383d = i63 % 128;
                                if (i63 % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                        obj = null;
                        cs csVar = new cs(setscrollbardefaultdelaybeforefade);
                        cr crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        cr.setDividerPadding(new Object[]{crVar, Boolean.TRUE}, -2146251303, 2146251306, System.identityHashCode(crVar));
                        int i64 = f55382c;
                        int i65 = i64 & 119;
                        int i66 = (i64 | 119) & (~i65);
                        int i67 = -(-(i65 << 1));
                        int i68 = (i66 & i67) + (i66 | i67);
                        f55383d = i68 % 128;
                        int i69 = i68 % 2;
                    }
                    obj = null;
                    return obj;
                }
                obj = null;
                super.setY(setscrollbardefaultdelaybeforefade, settextkeepstate, euVar, dividerPadding);
                int i70 = f55383d;
                int i71 = i70 & 17;
                int i72 = i70 | 17;
                int i73 = (i71 & i72) + (i72 | i71);
                f55382c = i73 % 128;
                int i74 = i73 % 2;
                return obj;
            }
            if (i18 != 4) {
                if (i18 != 5) {
                    int i75 = f55382c;
                    int i76 = ((i75 ^ 9) | (i75 & 9)) << 1;
                    int i77 = -(((~i75) & 9) | (i75 & (-10)));
                    int i78 = (i76 & i77) + (i77 | i76);
                    f55383d = i78 % 128;
                    if (i78 % 2 != 0) {
                        eh ehVar3 = eh.INSTANCE;
                        return CollectionsKt___CollectionsKt.plus((Collection) eh.setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis()), (Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) new setImageTintBlendMode[]{setImageTintBlendMode.setDividerPadding, setImageTintBlendMode.setOnDragListener}));
                    }
                    eh ehVar4 = eh.INSTANCE;
                    List list = (List) eh.setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis());
                    setImageTintBlendMode[] setimagetintblendmodeArr = new setImageTintBlendMode[4];
                    setimagetintblendmodeArr[1] = setImageTintBlendMode.setDividerPadding;
                    setimagetintblendmodeArr[1] = setImageTintBlendMode.setOnDragListener;
                    return CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) setimagetintblendmodeArr));
                }
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                int i79 = f55382c;
                int i80 = i79 ^ 33;
                int i81 = ((i79 & 33) | i80) << 1;
                int i82 = -i80;
                int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
                f55383d = i83 % 128;
                int i84 = i83 % 2;
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade2, "");
                eh ehVar5 = eh.INSTANCE;
                boolean zBooleanValue = ((Boolean) eh.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2}, 967111399, -967111399, (int) System.currentTimeMillis())).booleanValue();
                int i85 = f55382c;
                int i86 = (i85 | 43) << 1;
                int i87 = -(i85 ^ 43);
                int i88 = (i86 & i87) + (i87 | i86);
                f55383d = i88 % 128;
                int i89 = i88 % 2;
                return Boolean.valueOf(zBooleanValue);
            }
            int i90 = f55383d;
            int i91 = i90 & 61;
            int i92 = -(-((i90 ^ 61) | i91));
            int i93 = (i91 & i92) + (i92 | i91);
            f55382c = i93 % 128;
            int i94 = i93 % 2;
            listPlus = d.listOf(setImageTintBlendMode.setOnLongClickListener);
            int i95 = f55382c;
            int i96 = (-2) - (((i95 ^ 30) + ((i95 & 30) << 1)) ^ (-1));
            f55383d = i96 % 128;
            if (i96 % 2 == 0) {
                int i97 = 36 / 0;
            }
        }
        return listPlus;
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setCompoundDrawableTintBlendMode() {
        return (List) setY(new Object[]{this}, -1611650071, 1611650071, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setOnFocusChangeListener() {
        return (List) setY(new Object[]{this}, 1736482584, -1736482582, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setX() {
        return (List) setY(new Object[]{this}, 912450075, -912450074, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setY() {
        return (List) setY(new Object[]{this}, -692571356, 692571360, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    public final boolean setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        return ((Boolean) setY(new Object[]{this, setscrollbardefaultdelaybeforefade}, -1439343565, 1439343570, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    public final void setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar, @NotNull String str) {
        setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, euVar, str}, 1356729129, -1356729126, System.identityHashCode(this));
    }
}
