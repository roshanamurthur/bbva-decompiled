package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/ds;", "", "setCompoundDrawableTintBlendMode", "setX", "setOnFocusChangeListener", "setY"}, k = 1, mv = {1, 5, 1})
public final class ds {
    private static int getNavBarTitleString = 0;
    public static final ds setCompoundDrawableTintBlendMode;
    private static final /* synthetic */ ds[] setDividerPadding;
    private static int setLayoutAnimation = 1;
    public static final ds setOnFocusChangeListener;
    public static final ds setX;
    public static final ds setY;

    static {
        ds[] dsVarArr;
        ds dsVar = new ds(ExpectedUserActionOnPoiTypes.NONE, 0);
        setCompoundDrawableTintBlendMode = dsVar;
        ds dsVar2 = new ds("SDA", 1);
        setX = dsVar2;
        ds dsVar3 = new ds("DDA", 2);
        setOnFocusChangeListener = dsVar3;
        ds dsVar4 = new ds("CDA", 3);
        setY = dsVar4;
        int i10 = (1 ^ 55) + ((1 & 55) << 1);
        int i11 = i10 % 128;
        getNavBarTitleString = i11;
        if (i10 % 2 != 0) {
            dsVarArr = new ds[5];
            dsVarArr[0] = dsVar;
            dsVarArr[0] = dsVar2;
            dsVarArr[5] = dsVar3;
            dsVarArr[5] = dsVar4;
        } else {
            dsVarArr = new ds[]{dsVar, dsVar2, dsVar3, dsVar4};
        }
        int i12 = i11 + 67;
        setLayoutAnimation = i12 % 128;
        int i13 = i12 % 2;
        setDividerPadding = dsVarArr;
        int i14 = i11 + 5;
        setLayoutAnimation = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public ds() {
        throw null;
    }

    public static ds valueOf(String str) {
        int i10 = setLayoutAnimation;
        int i11 = ((i10 | 17) << 1) - (i10 ^ 17);
        getNavBarTitleString = i11 % 128;
        if (i11 % 2 != 0) {
            Enum.valueOf(ds.class, str);
            throw null;
        }
        ds dsVar = (ds) Enum.valueOf(ds.class, str);
        int i12 = setLayoutAnimation;
        int i13 = i12 & 95;
        int i14 = i13 + ((i12 ^ 95) | i13);
        getNavBarTitleString = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 74 / 0;
        }
        return dsVar;
    }

    public static ds[] values() {
        int i10 = getNavBarTitleString;
        int i11 = (i10 & (-36)) | ((~i10) & 35);
        int i12 = -(-((i10 & 35) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        setLayoutAnimation = i13 % 128;
        int i14 = i13 % 2;
        ds[] dsVarArr = (ds[]) setDividerPadding.clone();
        int i15 = getNavBarTitleString;
        int i16 = ((-1) << 1) - ((-1) ^ ((i15 & 70) + (i15 | 70)));
        setLayoutAnimation = i16 % 128;
        int i17 = i16 % 2;
        return dsVarArr;
    }
}
