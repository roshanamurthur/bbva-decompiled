package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setAddStatesFromChildren;", "", "Lcom/mypinpad/tsdk/i/TransactionProcessingResult;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/TransactionProcessingResult;", "setOnFocusChangeListener", "setX"}, k = 1, mv = {1, 5, 1})
public final class setAddStatesFromChildren {
    private static int getNavBarTitleString = 1;
    public static final setAddStatesFromChildren setCompoundDrawableTintBlendMode;
    private static int setDividerPadding;
    public static final setAddStatesFromChildren setOnFocusChangeListener;
    public static final setAddStatesFromChildren setX;
    private static final /* synthetic */ setAddStatesFromChildren[] setY;

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[setAddStatesFromChildren.values().length];
            iArr[setAddStatesFromChildren.setOnFocusChangeListener.ordinal()] = 1;
            iArr[setAddStatesFromChildren.setX.ordinal()] = 2;
            iArr[setAddStatesFromChildren.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            setCompoundDrawableTintBlendMode = iArr;
            int i10 = ((-1) << 1) - (((1 ^ 86) + ((1 & 86) << 1)) ^ (-1));
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    static {
        setAddStatesFromChildren[] setaddstatesfromchildrenArr;
        setAddStatesFromChildren setaddstatesfromchildren = new setAddStatesFromChildren(NotifyProvisionResult.SUCCESS_RESULT, 0);
        setOnFocusChangeListener = setaddstatesfromchildren;
        setAddStatesFromChildren setaddstatesfromchildren2 = new setAddStatesFromChildren("FAILED", 1);
        setX = setaddstatesfromchildren2;
        setAddStatesFromChildren setaddstatesfromchildren3 = new setAddStatesFromChildren("BYPASSED", 2);
        setCompoundDrawableTintBlendMode = setaddstatesfromchildren3;
        int i10 = -(-65);
        int i11 = (i10 << 1) - i10;
        int i12 = i11 % 128;
        getNavBarTitleString = i12;
        if (i11 % 2 == 0) {
            setaddstatesfromchildrenArr = new setAddStatesFromChildren[4];
            setaddstatesfromchildrenArr[1] = setaddstatesfromchildren;
            setaddstatesfromchildrenArr[1] = setaddstatesfromchildren2;
            setaddstatesfromchildrenArr[4] = setaddstatesfromchildren3;
        } else {
            setaddstatesfromchildrenArr = new setAddStatesFromChildren[]{setaddstatesfromchildren, setaddstatesfromchildren2, setaddstatesfromchildren3};
        }
        int i13 = i12 & 121;
        int i14 = i12 | 121;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        int i16 = i15 % 128;
        setDividerPadding = i16;
        int i17 = i15 % 2;
        setY = setaddstatesfromchildrenArr;
        int i18 = (i16 & 36) + (i16 | 36);
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        getNavBarTitleString = i19 % 128;
        int i20 = i19 % 2;
    }

    public setAddStatesFromChildren() {
        throw null;
    }

    public static setAddStatesFromChildren valueOf(String str) {
        int i10 = setDividerPadding + 123;
        getNavBarTitleString = i10 % 128;
        if (i10 % 2 != 0) {
            return (setAddStatesFromChildren) Enum.valueOf(setAddStatesFromChildren.class, str);
        }
        Enum.valueOf(setAddStatesFromChildren.class, str);
        throw null;
    }

    public static setAddStatesFromChildren[] values() {
        int i10 = getNavBarTitleString;
        int i11 = i10 & 97;
        int i12 = (i10 ^ 97) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        setDividerPadding = i13 % 128;
        int i14 = i13 % 2;
        setAddStatesFromChildren[] setaddstatesfromchildrenArr = (setAddStatesFromChildren[]) setY.clone();
        int i15 = getNavBarTitleString;
        int i16 = (i15 ^ 43) + ((i15 & 43) << 1);
        setDividerPadding = i16 % 128;
        if (i16 % 2 == 0) {
            return setaddstatesfromchildrenArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r3 == 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.TransactionProcessingResult.setY;
        r3 = com.mypinpad.tsdk.isolation.setAddStatesFromChildren.getNavBarTitleString;
        r4 = ((r3 ^ 110) + ((r3 & 110) << 1)) - 1;
        com.mypinpad.tsdk.isolation.setAddStatesFromChildren.setDividerPadding = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r3 == 3) goto L13;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mypinpad.tsdk.isolation.TransactionProcessingResult setCompoundDrawableTintBlendMode() {
        /*
            r6 = this;
            int r0 = com.mypinpad.tsdk.isolation.setAddStatesFromChildren.getNavBarTitleString
            r1 = r0 ^ 85
            r0 = r0 & 85
            r0 = r0 | r1
            r2 = 1
            int r0 = r0 << r2
            int r1 = -r1
            r3 = r0 & r1
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            com.mypinpad.tsdk.isolation.setAddStatesFromChildren.setDividerPadding = r0
            r1 = 2
            int r3 = r3 % r1
            r3 = r0 | 121(0x79, float:1.7E-43)
            int r3 = r3 << r2
            r0 = r0 ^ 121(0x79, float:1.7E-43)
            int r3 = r3 - r0
            int r0 = r3 % 128
            com.mypinpad.tsdk.isolation.setAddStatesFromChildren.getNavBarTitleString = r0
            int r3 = r3 % r1
            r0 = 3
            if (r3 != 0) goto L35
            int[] r3 = com.mypinpad.tsdk.i.setAddStatesFromChildren.setOnFocusChangeListener.setCompoundDrawableTintBlendMode
            int r4 = r6.ordinal()
            r3 = r3[r4]
            r4 = 72
            int r4 = r4 / 0
            if (r3 == r2) goto L72
            if (r3 == r1) goto L5a
            if (r3 != r0) goto L54
            goto L43
        L35:
            int[] r3 = com.mypinpad.tsdk.i.setAddStatesFromChildren.setOnFocusChangeListener.setCompoundDrawableTintBlendMode
            int r4 = r6.ordinal()
            r3 = r3[r4]
            if (r3 == r2) goto L72
            if (r3 == r1) goto L5a
            if (r3 != r0) goto L54
        L43:
            com.mypinpad.tsdk.i.TransactionProcessingResult r0 = com.mypinpad.tsdk.isolation.TransactionProcessingResult.setY
            int r3 = com.mypinpad.tsdk.isolation.setAddStatesFromChildren.getNavBarTitleString
            r4 = r3 ^ 110(0x6e, float:1.54E-43)
            r3 = r3 & 110(0x6e, float:1.54E-43)
            int r3 = r3 << r2
            int r4 = r4 + r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            com.mypinpad.tsdk.isolation.setAddStatesFromChildren.setDividerPadding = r2
            int r4 = r4 % r1
            goto L87
        L54:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L5a:
            com.mypinpad.tsdk.i.TransactionProcessingResult r0 = com.mypinpad.tsdk.isolation.TransactionProcessingResult.setX
            int r3 = com.mypinpad.tsdk.isolation.setAddStatesFromChildren.setDividerPadding
            r4 = r3 ^ 71
            r3 = r3 & 71
            r3 = r3 | r4
            int r3 = r3 << r2
            int r4 = -r4
            int r4 = ~r4
            int r3 = r3 - r4
            int r3 = r3 - r2
            int r2 = r3 % 128
            com.mypinpad.tsdk.isolation.setAddStatesFromChildren.getNavBarTitleString = r2
            int r3 = r3 % r1
            if (r3 == 0) goto L70
            goto L87
        L70:
            r0 = 0
            throw r0
        L72:
            com.mypinpad.tsdk.i.TransactionProcessingResult r0 = com.mypinpad.tsdk.isolation.TransactionProcessingResult.setCompoundDrawableTintBlendMode
            int r3 = com.mypinpad.tsdk.isolation.setAddStatesFromChildren.getNavBarTitleString
            r4 = r3 | 27
            int r2 = r4 << 1
            r4 = r3 & (-28)
            int r3 = ~r3
            r5 = 27
            r3 = r3 & r5
            r3 = r3 | r4
            int r2 = r2 - r3
            int r3 = r2 % 128
            com.mypinpad.tsdk.isolation.setAddStatesFromChildren.setDividerPadding = r3
            int r2 = r2 % r1
        L87:
            int r2 = com.mypinpad.tsdk.isolation.setAddStatesFromChildren.getNavBarTitleString
            r3 = r2 & 73
            r2 = r2 | 73
            int r3 = r3 + r2
            int r2 = r3 % 128
            com.mypinpad.tsdk.isolation.setAddStatesFromChildren.setDividerPadding = r2
            int r3 = r3 % r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setAddStatesFromChildren.setCompoundDrawableTintBlendMode():com.mypinpad.tsdk.i.TransactionProcessingResult");
    }
}
