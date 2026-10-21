package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class es extends ei {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55405c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55406d = 1;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (((~((~i10) | i12)) | i13) * (-318)) + (i11 * (-317)) + (i10 * 319);
        int i15 = ~(i13 | i12);
        int i16 = ~i12;
        int i17 = (((~(i10 | i11 | i12)) | (~(i13 | i16 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((i15 | (~(i16 | i10 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i14;
        if (i17 == 1) {
            int i18 = f55406d;
            int i19 = (i18 | 91) << 1;
            int i20 = -(((~i18) & 91) | (i18 & (-92)));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f55405c = i21 % 128;
            int i22 = i21 % 2;
            eh ehVar = eh.INSTANCE;
            List list = (List) eh.setDividerPadding(new Object[0], 766096637, -766096636, (int) System.currentTimeMillis());
            int i23 = f55406d;
            int i24 = ((i23 & 86) + (i23 | 86)) - 1;
            f55405c = i24 % 128;
            if (i24 % 2 == 0) {
                return list;
            }
            throw null;
        }
        if (i17 == 2) {
            int i25 = f55406d;
            int i26 = i25 ^ 121;
            int i27 = ((((i25 & 121) | i26) << 1) - (~(-i26))) - 1;
            f55405c = i27 % 128;
            if (i27 % 2 == 0) {
                eh ehVar2 = eh.INSTANCE;
                return (List) eh.setDividerPadding(new Object[0], -891789758, 891789762, (int) System.currentTimeMillis());
            }
            eh ehVar3 = eh.INSTANCE;
            throw null;
        }
        if (i17 == 3) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
            int i28 = f55405c;
            int i29 = ((i28 | 109) << 1) - (i28 ^ 109);
            f55406d = i29 % 128;
            int i30 = i29 % 2;
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            eh ehVar4 = eh.INSTANCE;
            boolean zBooleanValue = ((Boolean) eh.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -1976408796, 1976408801, (int) System.currentTimeMillis())).booleanValue();
            int i31 = f55405c;
            int i32 = i31 & 45;
            int i33 = (i31 ^ 45) | i32;
            int i34 = (i32 & i33) + (i33 | i32);
            f55406d = i34 % 128;
            if (i34 % 2 == 0) {
                int i35 = 75 / 0;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i17 == 4) {
            int i36 = f55405c;
            int i37 = i36 & 69;
            int i38 = i37 + ((i36 ^ 69) | i37);
            f55406d = i38 % 128;
            int i39 = i38 % 2;
            eh ehVar5 = eh.INSTANCE;
            List list2 = (List) eh.setDividerPadding(new Object[0], -516361844, 516361846, (int) System.currentTimeMillis());
            int i40 = f55405c + 29;
            f55406d = i40 % 128;
            int i41 = i40 % 2;
            return list2;
        }
        es esVar = (es) objArr[0];
        int iIdentityHashCode = System.identityHashCode(esVar);
        int i42 = ((-1514815385) ^ iIdentityHashCode) | ((-1514815385) & iIdentityHashCode);
        int i43 = (335011926 & i42) | ((~i42) & (-335011927));
        int i44 = i42 & (-335011927);
        int i45 = (-1589372406) - (~(-(-(((i44 & i43) | (i43 ^ i44)) * (-381)))));
        int i46 = (i45 ^ (-1)) + (i45 << 1);
        int i47 = ~iIdentityHashCode;
        int i48 = i47 & (-1514815385);
        int i49 = ~(((i47 | (-1514815385)) & (~i48)) | i48);
        int i50 = ((~i49) & 28688454) | ((-28688455) & i49);
        int i51 = i49 & 28688454;
        int i52 = (i51 & i50) | (i50 ^ i51);
        int i53 = i52 ^ 1208491912;
        int i54 = i52 & 1208491912;
        int i55 = ((i54 & i53) | (i53 ^ i54)) * 381;
        int i56 = i46 & i55;
        int i57 = i56 + ((i55 ^ i46) | i56);
        int i58 = i57 ^ 745125840;
        int i59 = (745125840 & i57) << 1;
        int i60 = (i58 & i59) + (i59 | i58);
        int iIdentityHashCode2 = System.identityHashCode(esVar);
        int i61 = 2057295855 & iIdentityHashCode2;
        int i62 = (~i61) & (2057295855 | iIdentityHashCode2);
        int i63 = ~((i61 & i62) | (i62 ^ i61));
        int i64 = ((~i63) & 33719368) | ((-33719369) & i63);
        int i65 = i63 & 33719368;
        int i66 = -(-(((i65 & i64) | (i64 ^ i65)) * (-756)));
        int i67 = 1275548427 | i66;
        int i68 = (i67 << 1) - ((~(i66 & 1275548427)) & i67);
        int i69 = ~iIdentityHashCode2;
        int i70 = ((~i69) & 2057295855) | ((-2057295856) & i69);
        int i71 = i69 & 2057295855;
        if (i60 <= (((i71 & i70) | (i70 ^ i71)) * 756) + i68) {
            eh ehVar6 = eh.INSTANCE;
            return (List) eh.setDividerPadding(new Object[0], -51816101, 51816104, (int) System.currentTimeMillis());
        }
        eh ehVar7 = eh.INSTANCE;
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setCompoundDrawableTintBlendMode() {
        return (List) setY(new Object[]{this}, 309494289, -309494287, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setOnFocusChangeListener() {
        return (List) setY(new Object[]{this}, 111335048, -111335048, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setX() {
        return (List) setY(new Object[]{this}, 1811731457, -1811731453, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    public final boolean setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        return ((Boolean) setY(new Object[]{this, setscrollbardefaultdelaybeforefade}, -337427774, 337427777, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ei
    @NotNull
    public final List<setImageTintBlendMode> setY() {
        return (List) setY(new Object[]{this}, -1969142571, 1969142572, System.identityHashCode(this));
    }
}
