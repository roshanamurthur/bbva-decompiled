package com.mypinpad.tsdk.api.models;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/api/models/PinPadType;", "", "STANDARD", "SHIFTED", "SHUFFLED"}, k = 1, mv = {1, 8, 0})
public final class PinPadType {
    public static final PinPadType SHIFTED;
    public static final PinPadType SHUFFLED;
    public static final PinPadType STANDARD;
    private static final /* synthetic */ PinPadType[] setCompoundDrawableTintBlendMode;
    private static int setX = 1;
    private static int setY;

    static {
        PinPadType[] pinPadTypeArr;
        PinPadType pinPadType = new PinPadType("STANDARD", 0);
        STANDARD = pinPadType;
        PinPadType pinPadType2 = new PinPadType("SHIFTED", 1);
        SHIFTED = pinPadType2;
        PinPadType pinPadType3 = new PinPadType("SHUFFLED", 2);
        SHUFFLED = pinPadType3;
        int i10 = (1 ^ 73) + ((1 & 73) << 1);
        setY = i10 % 128;
        if (i10 % 2 != 0) {
            pinPadTypeArr = new PinPadType[4];
            pinPadTypeArr[1] = pinPadType;
            pinPadTypeArr[1] = pinPadType2;
            pinPadTypeArr[2] = pinPadType3;
        } else {
            pinPadTypeArr = new PinPadType[]{pinPadType, pinPadType2, pinPadType3};
        }
        int i11 = ((1 | 89) << 1) - (1 ^ 89);
        int i12 = i11 % 128;
        setY = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        setCompoundDrawableTintBlendMode = pinPadTypeArr;
        int i13 = (i12 & (-104)) | ((~i12) & 103);
        int i14 = (i12 & 103) << 1;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        setX = i15 % 128;
        int i16 = i15 % 2;
    }

    public PinPadType() {
        throw null;
    }

    public static PinPadType valueOf(String str) {
        int i10 = setY;
        int i11 = (i10 & 119) + (i10 | 119);
        setX = i11 % 128;
        int i12 = i11 % 2;
        PinPadType pinPadType = (PinPadType) Enum.valueOf(PinPadType.class, str);
        int i13 = setX;
        int i14 = i13 & 87;
        int i15 = (i13 ^ 87) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        setY = i16 % 128;
        int i17 = i16 % 2;
        return pinPadType;
    }

    public static PinPadType[] values() {
        int i10 = setY;
        int i11 = (((i10 | 52) << 1) - (i10 ^ 52)) - 1;
        setX = i11 % 128;
        int i12 = i11 % 2;
        PinPadType[] pinPadTypeArr = setCompoundDrawableTintBlendMode;
        if (i12 != 0) {
            return (PinPadType[]) pinPadTypeArr.clone();
        }
        int i13 = 25 / 0;
        return (PinPadType[]) pinPadTypeArr.clone();
    }
}
