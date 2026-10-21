package com.mypinpad.tsdk.api.callbacks;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/ValueQualifier;", "", ExpectedUserActionOnPoiTypes.NONE, "AMOUNT", "BALANCE"}, k = 1, mv = {1, 8, 0})
public final class ValueQualifier {
    public static final ValueQualifier AMOUNT;
    public static final ValueQualifier BALANCE;
    public static final ValueQualifier NONE;
    private static final /* synthetic */ ValueQualifier[] setDividerPadding;
    private static int setX = 1;
    private static int setY;

    static {
        ValueQualifier[] valueQualifierArr;
        ValueQualifier valueQualifier = new ValueQualifier(ExpectedUserActionOnPoiTypes.NONE, 0);
        NONE = valueQualifier;
        ValueQualifier valueQualifier2 = new ValueQualifier("AMOUNT", 1);
        AMOUNT = valueQualifier2;
        ValueQualifier valueQualifier3 = new ValueQualifier("BALANCE", 2);
        BALANCE = valueQualifier3;
        int i10 = 81 << 1;
        int i11 = -((~0) & 81);
        int i12 = (i10 & i11) + (i10 | i11);
        int i13 = i12 % 128;
        setX = i13;
        if (i12 % 2 == 0) {
            valueQualifierArr = new ValueQualifier[4];
            valueQualifierArr[0] = valueQualifier;
            valueQualifierArr[1] = valueQualifier2;
            valueQualifierArr[3] = valueQualifier3;
        } else {
            valueQualifierArr = new ValueQualifier[]{valueQualifier, valueQualifier2, valueQualifier3};
        }
        setDividerPadding = valueQualifierArr;
        int i14 = i13 + 95;
        setY = i14 % 128;
        int i15 = i14 % 2;
    }

    public ValueQualifier() {
        throw null;
    }

    public static ValueQualifier valueOf(String str) {
        int i10 = setY;
        int i11 = i10 & 97;
        int i12 = ((i10 | 97) & (~i11)) + (i11 << 1);
        setX = i12 % 128;
        int i13 = i12 % 2;
        ValueQualifier valueQualifier = (ValueQualifier) Enum.valueOf(ValueQualifier.class, str);
        int i14 = setY;
        int i15 = i14 & 71;
        int i16 = (i14 ^ 71) | i15;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        setX = i17 % 128;
        if (i17 % 2 != 0) {
            return valueQualifier;
        }
        throw null;
    }

    public static ValueQualifier[] values() {
        int i10 = setY;
        int i11 = i10 & 81;
        int i12 = i10 | 81;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setX = i13 % 128;
        int i14 = i13 % 2;
        ValueQualifier[] valueQualifierArr = setDividerPadding;
        if (i14 == 0) {
            throw null;
        }
        ValueQualifier[] valueQualifierArr2 = (ValueQualifier[]) valueQualifierArr.clone();
        int i15 = setX;
        int i16 = i15 & 59;
        int i17 = ((i15 ^ 59) | i16) << 1;
        int i18 = -((i15 | 59) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        setY = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 21 / 0;
        }
        return valueQualifierArr2;
    }
}
