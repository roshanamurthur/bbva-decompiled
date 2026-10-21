package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/xk;", "", "", "setNavigationOnClickListener", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setOnFocusChangeListener", "()I", "setDividerPadding", "setY", "setX", "setCompoundDrawableTintBlendMode", "setOnLongClickListener"}, k = 1, mv = {1, 8, 0})
public final class xk {
    private static int getNavBarTitleString = 1;
    public static final xk setCompoundDrawableTintBlendMode;
    public static final xk setDividerPadding;
    private static final /* synthetic */ xk[] setLayoutAnimation;
    private static int setOnDragListener;
    public static final xk setOnFocusChangeListener;
    public static final xk setOnLongClickListener;
    public static final xk setX;
    public static final xk setY;

    /* JADX INFO: renamed from: setNavigationOnClickListener, reason: from kotlin metadata */
    private final int setDividerPadding;

    static {
        xk[] xkVarArr;
        xk xkVar = new xk("MAIN_PROCESS_REQUEST", 0, 0);
        setDividerPadding = xkVar;
        xk xkVar2 = new xk("MAIN_PROCESS_RESPONSE", 1, 1);
        setOnFocusChangeListener = xkVar2;
        xk xkVar3 = new xk("MAIN_PROCESS_NFC_TAG_FOUND", 2, 2);
        setY = xkVar3;
        xk xkVar4 = new xk("MAIN_PROCESS_TERMINATE_PROCESS", 3, 3);
        setX = xkVar4;
        xk xkVar5 = new xk("ISOLATED_PROCESS_REQUEST", 4, 4);
        setCompoundDrawableTintBlendMode = xkVar5;
        xk xkVar6 = new xk("LOGGING", 5, 5);
        setOnLongClickListener = xkVar6;
        int i10 = 1 & 49;
        int i11 = (((1 ^ 49) | i10) << 1) - ((~i10) & (1 | 49));
        setOnDragListener = i11 % 128;
        if (i11 % 2 != 0) {
            xkVarArr = new xk[57];
            xkVarArr[0] = xkVar;
            xkVarArr[0] = xkVar2;
            xkVarArr[2] = xkVar3;
            xkVarArr[4] = xkVar4;
            xkVarArr[3] = xkVar5;
            xkVarArr[4] = xkVar6;
        } else {
            xkVarArr = new xk[]{xkVar, xkVar2, xkVar3, xkVar4, xkVar5, xkVar6};
        }
        int i12 = ((1 & 16) + (1 | 16)) - 1;
        int i13 = i12 % 128;
        setOnDragListener = i13;
        int i14 = i12 % 2;
        setLayoutAnimation = xkVarArr;
        int i15 = ((i13 & 102) + (i13 | 102)) - 1;
        getNavBarTitleString = i15 % 128;
        int i16 = i15 % 2;
    }

    public xk(String str, int i10, int i11) {
        super(str, i10);
        this.setDividerPadding = i11;
    }

    public static xk valueOf(String str) {
        int i10 = setOnDragListener;
        int i11 = ((((i10 ^ 75) | (i10 & 75)) << 1) - (~(-(((~i10) & 75) | (i10 & (-76)))))) - 1;
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        xk xkVar = (xk) Enum.valueOf(xk.class, str);
        int i13 = setOnDragListener;
        int i14 = (i13 ^ 21) + ((i13 & 21) << 1);
        getNavBarTitleString = i14 % 128;
        int i15 = i14 % 2;
        return xkVar;
    }

    public static xk[] values() {
        int i10 = setOnDragListener;
        int i11 = (i10 & 53) + (i10 | 53);
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        xk[] xkVarArr = setLayoutAnimation;
        if (i12 != 0) {
            return (xk[]) xkVarArr.clone();
        }
        throw null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final int setOnFocusChangeListener() {
        int i10 = getNavBarTitleString;
        int i11 = i10 | 41;
        int i12 = (i11 << 1) - ((~(i10 & 41)) & i11);
        setOnDragListener = i12 % 128;
        if (i12 % 2 == 0) {
            return this.setDividerPadding;
        }
        throw null;
    }
}
