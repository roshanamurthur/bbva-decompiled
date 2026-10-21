package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setRotationY;", "", "setCompoundDrawableTintBlendMode", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class setRotationY {
    public static final setRotationY setCompoundDrawableTintBlendMode;
    public static final setRotationY setDividerPadding;
    private static int setOnFocusChangeListener = 1;
    private static final /* synthetic */ setRotationY[] setX;
    private static int setY;

    static {
        setRotationY setrotationy = new setRotationY("RA", 0);
        setCompoundDrawableTintBlendMode = setrotationy;
        setRotationY setrotationy2 = new setRotationY("L1RSP", 1);
        setDividerPadding = setrotationy2;
        int i10 = (57 << 1) - ((~0) & 57);
        int i11 = i10 % 128;
        setOnFocusChangeListener = i11;
        setRotationY[] setrotationyArr = i10 % 2 == 0 ? new setRotationY[]{setrotationy2, setrotationy} : new setRotationY[]{setrotationy, setrotationy2};
        int i12 = (i11 & (-68)) | ((~i11) & 67);
        int i13 = -(-((i11 & 67) << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        setY = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        setX = setrotationyArr;
        int i15 = ((i11 & (-100)) | ((~i11) & 99)) + ((i11 & 99) << 1);
        setY = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 74 / 0;
        }
    }

    public setRotationY() {
        throw null;
    }

    public static setRotationY valueOf(String str) {
        int i10 = setOnFocusChangeListener + 77;
        setY = i10 % 128;
        int i11 = i10 % 2;
        setRotationY setrotationy = (setRotationY) Enum.valueOf(setRotationY.class, str);
        int i12 = setY;
        int i13 = i12 ^ 3;
        int i14 = ((i12 & 3) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        setOnFocusChangeListener = i16 % 128;
        int i17 = i16 % 2;
        return setrotationy;
    }

    public static setRotationY[] values() {
        int i10 = setY;
        int i11 = ((i10 & (-26)) | ((~i10) & 25)) + ((i10 & 25) << 1);
        setOnFocusChangeListener = i11 % 128;
        int i12 = i11 % 2;
        setRotationY[] setrotationyArr = setX;
        if (i12 != 0) {
            return (setRotationY[]) setrotationyArr.clone();
        }
        int i13 = 35 / 0;
        return (setRotationY[]) setrotationyArr.clone();
    }
}
