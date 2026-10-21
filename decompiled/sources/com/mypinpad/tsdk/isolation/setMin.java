package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setMin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60111a;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-929)) + (i10 * (-464));
        int i14 = ~i10;
        int i15 = i11 | i12;
        if (((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13 != 1) {
            setMin setmin = (setMin) objArr[0];
            int i16 = f60111a;
            int i17 = i16 ^ 61;
            int i18 = -(-((i16 & 61) << 1));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            int i20 = i19 % 128;
            if (i19 % 2 == 0) {
                setmin.getClass();
                throw null;
            }
            setmin.getClass();
            int i21 = i20 + 121;
            f60111a = i21 % 128;
            if (i21 % 2 == 0) {
                return null;
            }
            throw null;
        }
        setMin setmin2 = (setMin) objArr[0];
        setmin2.getClass();
        Result.Companion companion = Result.INSTANCE;
        Object objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(new setBackgroundResource()));
        int iIdentityHashCode = System.identityHashCode(setmin2);
        int i22 = 330188271 & iIdentityHashCode;
        int i23 = (330188271 | iIdentityHashCode) & (~i22);
        int i24 = ~iIdentityHashCode;
        int i25 = ~((i23 & i22) | (i23 ^ i22));
        int i26 = (-285510478) & i25;
        int i27 = (i25 | (-285510478)) & (~i26);
        int i28 = -(-(((i27 & i26) | (i27 ^ i26)) * (-318)));
        int i29 = (1731615639 ^ i28) + ((i28 & 1731615639) << 1);
        int i30 = ((-285510478) & i24) | (iIdentityHashCode & 285510477);
        int i31 = (-285510478) & iIdentityHashCode;
        int i32 = ~((i30 & i31) | (i30 ^ i31));
        int i33 = i24 & (-330188272);
        int i34 = (~i33) & (i24 | (-330188272));
        int i35 = 285510477 | (i33 & i34) | (i34 ^ i33);
        int i36 = ~i35;
        int i37 = -(-((i32 | ((i35 | i36) & i36)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
        int i38 = (((i29 ^ i37) | (i29 & i37)) << 1) - ((i37 & (~i29)) | ((~i37) & i29));
        int i39 = (i24 | iIdentityHashCode) & i24;
        int i40 = (i39 & (-285510478)) | ((-285510478) ^ i39);
        int i41 = i40 & (-330188272);
        int i42 = (i40 | (-330188272)) & (~i41);
        int i43 = (i42 & i41) | (i42 ^ i41);
        int i44 = ~i43;
        int i45 = (i43 | i44) & i44;
        int i46 = ~((iIdentityHashCode & (-44713123)) | ((-44713123) ^ iIdentityHashCode));
        int i47 = i45 & i46;
        int i48 = (i46 | i45) & (~i47);
        int i49 = -(~(-(-(((i48 & i47) | (i48 ^ i47)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))));
        int i50 = (i38 & i49) + (i49 | i38);
        int i51 = (i50 ^ (-1)) + (i50 << 1);
        int iIdentityHashCode2 = System.identityHashCode(setmin2);
        int i52 = ~iIdentityHashCode2;
        int i53 = ~((i52 ^ 1697429877) | (i52 & 1697429877));
        int i54 = ((i53 & (-1744681856)) | ((~i53) & (-1744681856)) | (1744681855 & i53)) * (-712);
        int i55 = 1837536093 & i54;
        int i56 = i55 + ((i54 ^ 1837536093) | i55);
        int i57 = (i52 | iIdentityHashCode2) & i52;
        int i58 = 1660009263 ^ i57;
        int i59 = 1660009263 & i57;
        int i60 = (i58 & i59) | (i58 ^ i59);
        int i61 = i60 ^ 1697429877;
        int i62 = i60 & 1697429877;
        int i63 = ~((i62 & i61) | (i61 ^ i62));
        int i64 = (i52 & (-47251979)) | (47251978 & iIdentityHashCode2);
        int i65 = iIdentityHashCode2 & (-47251979);
        int i66 = (i65 & i64) | (i64 ^ i65);
        int i67 = ~i66;
        int i68 = (i66 | i67) & i67;
        int i69 = -(-(((i68 & i63) | (i63 ^ i68)) * (-712)));
        int i70 = i56 & i69;
        int i71 = (i70 - (~((i69 ^ i56) | i70))) - 1;
        int i72 = i57 & 1697429877;
        int i73 = (1697429877 | i57) & (~i72);
        int i74 = ~((i72 & i73) | (i73 ^ i72));
        if (i51 > (i71 - (~(-(-(((i74 & 1660009263) | (1660009263 ^ i74)) * 712))))) - 1) {
            int i75 = 22 / 0;
        }
        return objM5535constructorimpl;
    }

    public final void setCompoundDrawableTintBlendMode() {
        setOnFocusChangeListener(new Object[]{this}, -1342405781, 1342405781, System.identityHashCode(this));
    }

    @NotNull
    public final Object setOnFocusChangeListener() {
        return setOnFocusChangeListener(new Object[]{this}, 1848591007, -1848591006, System.identityHashCode(this));
    }
}
