package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public interface setFastScrollEnabled {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setFastScrollEnabled$setY;", "", "setCompoundDrawableTintBlendMode", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
    public static final class setY {
        public static final setY setCompoundDrawableTintBlendMode;
        public static final setY setDividerPadding;
        private static int setOnFocusChangeListener = 1;
        private static final /* synthetic */ setY[] setX;
        private static int setY;

        static {
            setY[] setyArr;
            setY sety = new setY(NotifyProvisionResult.SUCCESS_RESULT, 0);
            setCompoundDrawableTintBlendMode = sety;
            setY sety2 = new setY("FAILURE", 1);
            setDividerPadding = sety2;
            int i10 = 1 & 51;
            int i11 = (1 ^ 51) | i10;
            int i12 = (i10 & i11) + (i10 | i11);
            setY = i12 % 128;
            if (i12 % 2 != 0) {
                setyArr = new setY[4];
                setyArr[0] = sety;
                setyArr[1] = sety2;
            } else {
                setyArr = new setY[]{sety, sety2};
            }
            setX = setyArr;
            int i13 = 1 & 123;
            int i14 = ((~i13) & (1 | 123)) + (i13 << 1);
            setY = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        }

        public setY() {
            throw null;
        }

        public static setY valueOf(String str) {
            int i10 = setY;
            int i11 = i10 & 65;
            int i12 = ((i10 ^ 65) | i11) << 1;
            int i13 = -((i10 | 65) & (~i11));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            setOnFocusChangeListener = i14 % 128;
            int i15 = i14 % 2;
            setY sety = (setY) Enum.valueOf(setY.class, str);
            int i16 = setY;
            int i17 = i16 & 11;
            int i18 = i16 | 11;
            int i19 = (i17 & i18) + (i18 | i17);
            setOnFocusChangeListener = i19 % 128;
            int i20 = i19 % 2;
            return sety;
        }

        public static setY[] values() {
            int i10 = setOnFocusChangeListener + 109;
            setY = i10 % 128;
            int i11 = i10 % 2;
            setY[] setyArr = (setY[]) setX.clone();
            int i12 = setOnFocusChangeListener;
            int i13 = (i12 ^ 107) + ((i12 & 107) << 1);
            setY = i13 % 128;
            if (i13 % 2 == 0) {
                return setyArr;
            }
            throw null;
        }
    }
}
