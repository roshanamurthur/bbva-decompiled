package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface getRevealSystemBarToastMessage {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/getRevealSystemBarToastMessage$setDividerPadding;", "", "setOnFocusChangeListener", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
    public static final class setDividerPadding {
        private static int setCompoundDrawableTintBlendMode = 1;
        public static final setDividerPadding setDividerPadding;
        public static final setDividerPadding setOnFocusChangeListener;
        private static int setX;
        private static final /* synthetic */ setDividerPadding[] setY;

        static {
            setDividerPadding[] setdividerpaddingArr;
            setDividerPadding setdividerpadding = new setDividerPadding(NotifyProvisionResult.SUCCESS_RESULT, 0);
            setOnFocusChangeListener = setdividerpadding;
            setDividerPadding setdividerpadding2 = new setDividerPadding("FAILURE", 1);
            setDividerPadding = setdividerpadding2;
            int i10 = (1 & 115) + (1 | 115);
            int i11 = i10 % 128;
            setX = i11;
            if (i10 % 2 != 0) {
                setdividerpaddingArr = new setDividerPadding[4];
                setdividerpaddingArr[0] = setdividerpadding;
                setdividerpaddingArr[0] = setdividerpadding2;
            } else {
                setdividerpaddingArr = new setDividerPadding[]{setdividerpadding, setdividerpadding2};
            }
            int i12 = i11 & 57;
            int i13 = (i12 - (~(-(-((i11 ^ 57) | i12))))) - 1;
            int i14 = i13 % 128;
            setCompoundDrawableTintBlendMode = i14;
            if (i13 % 2 == 0) {
                throw null;
            }
            setY = setdividerpaddingArr;
            int i15 = i14 + 59;
            setX = i15 % 128;
            int i16 = i15 % 2;
        }

        public setDividerPadding() {
            throw null;
        }

        public static setDividerPadding valueOf(String str) {
            int i10 = setX;
            int i11 = (((i10 ^ 31) | (i10 & 31)) << 1) - (((~i10) & 31) | (i10 & (-32)));
            setCompoundDrawableTintBlendMode = i11 % 128;
            int i12 = i11 % 2;
            setDividerPadding setdividerpadding = (setDividerPadding) Enum.valueOf(setDividerPadding.class, str);
            int i13 = setX;
            int i14 = (i13 & 125) + (i13 | 125);
            setCompoundDrawableTintBlendMode = i14 % 128;
            int i15 = i14 % 2;
            return setdividerpadding;
        }

        public static setDividerPadding[] values() {
            int i10 = setX;
            int i11 = i10 & 43;
            int i12 = (i10 | 43) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 & i13) + (i12 | i13);
            setCompoundDrawableTintBlendMode = i14 % 128;
            int i15 = i14 % 2;
            setDividerPadding[] setdividerpaddingArr = (setDividerPadding[]) setY.clone();
            int i16 = setX;
            int i17 = i16 & 79;
            int i18 = i17 + ((i16 ^ 79) | i17);
            setCompoundDrawableTintBlendMode = i18 % 128;
            int i19 = i18 % 2;
            return setdividerpaddingArr;
        }
    }

    void setOnFocusChangeListener(@NotNull setDividerPadding setdividerpadding);
}
