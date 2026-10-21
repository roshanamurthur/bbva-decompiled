package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setImportantForAutofill;", "", "", "toString", "()Ljava/lang/String;", "", "setOnDragListener", "B", "setDividerPadding", "()B", "setCompoundDrawableTintBlendMode", "setY", "getNavBarTitleString", "setX", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1})
public final class setImportantForAutofill {
    private static setImportantForAutofill getNavBarTitleString = null;
    public static final setImportantForAutofill setCompoundDrawableTintBlendMode;
    public static final setImportantForAutofill setDividerPadding;
    private static int setLayoutAnimation = 1;
    private static final /* synthetic */ setImportantForAutofill[] setNavigationOnClickListener;
    public static final setImportantForAutofill setOnFocusChangeListener;
    private static int setOnLongClickListener;
    public static final setImportantForAutofill setX;

    /* JADX INFO: renamed from: setOnDragListener, reason: from kotlin metadata */
    private final byte setCompoundDrawableTintBlendMode;

    static {
        setImportantForAutofill setimportantforautofill = new setImportantForAutofill("UNKNOWN", 0, (byte) 0);
        getNavBarTitleString = setimportantforautofill;
        setImportantForAutofill setimportantforautofill2 = new setImportantForAutofill("NO_CVM", 1, (byte) 1);
        setDividerPadding = setimportantforautofill2;
        setImportantForAutofill setimportantforautofill3 = new setImportantForAutofill(ExpectedUserActionOnPoiTypes.SIGNATURE, 2, (byte) 2);
        setX = setimportantforautofill3;
        setImportantForAutofill setimportantforautofill4 = new setImportantForAutofill(ExpectedUserActionOnPoiTypes.ONLINE_PIN, 3, (byte) 3);
        setOnFocusChangeListener = setimportantforautofill4;
        setImportantForAutofill setimportantforautofill5 = new setImportantForAutofill("CDCVM", 4, (byte) 4);
        setCompoundDrawableTintBlendMode = setimportantforautofill5;
        int i10 = (~0) & 45;
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        setImportantForAutofill[] setimportantforautofillArr = {setimportantforautofill, setimportantforautofill2, setimportantforautofill3, setimportantforautofill4, setimportantforautofill5};
        int i12 = -(-19);
        int i13 = (i12 << 1) - i12;
        setLayoutAnimation = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 42 / 0;
        }
        setNavigationOnClickListener = setimportantforautofillArr;
        INSTANCE = new Companion(null);
        int i15 = setLayoutAnimation;
        int i16 = i15 & 21;
        int i17 = -(-(i15 | 21));
        int i18 = (i16 & i17) + (i17 | i16);
        setOnLongClickListener = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public setImportantForAutofill(String str, int i10, byte b10) {
        super(str, i10);
        this.setCompoundDrawableTintBlendMode = b10;
    }

    public static setImportantForAutofill valueOf(String str) {
        int i10 = setOnLongClickListener + 67;
        setLayoutAnimation = i10 % 128;
        if (i10 % 2 == 0) {
            Enum.valueOf(setImportantForAutofill.class, str);
            throw null;
        }
        setImportantForAutofill setimportantforautofill = (setImportantForAutofill) Enum.valueOf(setImportantForAutofill.class, str);
        int i11 = setLayoutAnimation;
        int i12 = (i11 & (-98)) | ((~i11) & 97);
        int i13 = (i11 & 97) << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        setOnLongClickListener = i14 % 128;
        if (i14 % 2 == 0) {
            return setimportantforautofill;
        }
        throw null;
    }

    public static setImportantForAutofill[] values() {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 1;
        int i12 = ((i10 ^ 1) | i11) << 1;
        int i13 = -((i10 | 1) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        setOnLongClickListener = i14 % 128;
        int i15 = i14 % 2;
        setImportantForAutofill[] setimportantforautofillArr = (setImportantForAutofill[]) setNavigationOnClickListener.clone();
        int i16 = setOnLongClickListener;
        int i17 = i16 & 11;
        int i18 = ((((i16 ^ 11) | i17) << 1) - (~(-((i16 | 11) & (~i17))))) - 1;
        setLayoutAnimation = i18 % 128;
        if (i18 % 2 != 0) {
            return setimportantforautofillArr;
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        int i10 = setOnLongClickListener;
        int i11 = i10 & 67;
        int i12 = (i10 ^ 67) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        setLayoutAnimation = i14;
        int i15 = i13 % 2;
        byte b10 = this.setCompoundDrawableTintBlendMode;
        if (i15 == 0) {
            int i16 = 30 / 0;
        }
        int i17 = (((i14 | 3) << 1) - (~(-(i14 ^ 3)))) - 1;
        setOnLongClickListener = i17 % 128;
        if (i17 % 2 == 0) {
            return b10;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setOnLongClickListener;
        int i11 = i10 | 51;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 51)) & i11);
        int i14 = (i12 & i13) + (i13 | i12);
        setLayoutAnimation = i14 % 128;
        if (i14 % 2 == 0) {
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
            throw null;
        }
        setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
        int i15 = setOnLongClickListener + 21;
        setLayoutAnimation = i15 % 128;
        int i16 = i15 % 2;
        return "";
    }
}
