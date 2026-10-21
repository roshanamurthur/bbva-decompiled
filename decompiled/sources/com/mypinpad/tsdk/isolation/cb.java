package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/cb;", "", "", "setTextAlignment", "B", "setCompoundDrawableTintBlendMode", "()B", "setDividerPadding", "setX", "setOnFocusChangeListener", "setY", "setOnDragListener", "setNavigationOnClickListener", "setLayoutAnimation", "getNavBarTitleString", "setOnLongClickListener", "setIncludeFontPadding", "setAlwaysDrawnWithCacheEnabled"}, k = 1, mv = {1, 5, 1})
public enum cb {
    ALWAYS((byte) 0),
    IF_UNATTENDED_CASH((byte) 1),
    IF_NOT_UNATTENDED_CASH_AND_NOT_MANUAL_CASH_AND_NOT_PURCHASE_WITH_CASHBACK((byte) 2),
    IF_TERMINAL_SUPPORTS_THE_CVM((byte) 3),
    IF_MANUAL_CASH((byte) 4),
    IF_PURCHASE_WITH_CASHBACK((byte) 5),
    IF_TRANSACTION_IS_IN_THE_APPLICATION_CURRENCY_AND_IS_UNDER_X((byte) 6),
    IF_TRANSACTION_IS_IN_THE_APPLICATION_CURRENCY_AND_IS_OVER_X((byte) 7),
    IF_TRANSACTION_IS_IN_THE_APPLICATION_CURRENCY_AND_IS_UNDER_Y((byte) 8),
    IF_TRANSACTION_IS_IN_THE_APPLICATION_CURRENCY_AND_IS_OVER_Y((byte) 9),
    RESERVED((byte) 10);

    private static int getAmountFieldTextColor = 0;
    private static int setChildDivider = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final openContextMenu<cb> setZ;

    /* JADX INFO: renamed from: setTextAlignment, reason: from kotlin metadata */
    private final byte setDividerPadding;

    public static final class setDividerPadding extends openContextMenu<cb> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f54796f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f54797g = 1;

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            byte bByteValue;
            byte compoundDrawableTintBlendMode;
            int i13 = ~i12;
            if ((((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559)) != 1) {
                cb cbVar = (cb) objArr[0];
                int i14 = f54797g;
                int i15 = ((i14 | 79) << 1) - (i14 ^ 79);
                f54796f = i15 % 128;
                if (i15 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(cbVar, "");
                    compoundDrawableTintBlendMode = cbVar.setCompoundDrawableTintBlendMode();
                    int i16 = 14 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(cbVar, "");
                    compoundDrawableTintBlendMode = cbVar.setCompoundDrawableTintBlendMode();
                }
                return Byte.valueOf(compoundDrawableTintBlendMode);
            }
            Enum r3 = (Enum) objArr[1];
            int i17 = f54797g;
            int i18 = i17 & 93;
            int i19 = -(-((i17 ^ 93) | i18));
            int i20 = (i18 & i19) + (i19 | i18);
            f54796f = i20 % 128;
            cb cbVar2 = (cb) r3;
            Object[] objArr2 = new Object[1];
            if (i20 % 2 != 0) {
                objArr2[0] = cbVar2;
                bByteValue = ((Byte) setX(objArr2, 1459191576, -1459191576, (int) System.currentTimeMillis())).byteValue();
                int i21 = 29 / 0;
            } else {
                objArr2[0] = cbVar2;
                bByteValue = ((Byte) setX(objArr2, 1459191576, -1459191576, (int) System.currentTimeMillis())).byteValue();
            }
            int i22 = f54796f;
            int i23 = i22 & 91;
            int i24 = (i22 ^ 91) | i23;
            int i25 = (i23 & i24) + (i24 | i23);
            f54797g = i25 % 128;
            int i26 = i25 % 2;
            return Byte.valueOf(bByteValue);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setX(new Object[]{this, r4}, 726562509, -726562508, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.cb$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/cb$setX;", "", "", "p0", "Lcom/mypinpad/tsdk/i/cb;", "setOnFocusChangeListener", "(B)Lcom/mypinpad/tsdk/i/cb;", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setZ", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setX", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f54798a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54799b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public static openContextMenu<cb> setCompoundDrawableTintBlendMode() {
            return (openContextMenu) setX(new Object[0], -48508283, 48508283, (int) System.currentTimeMillis());
        }

        @NotNull
        public static cb setOnFocusChangeListener(byte p4) {
            return (cb) setX(new Object[]{Byte.valueOf(p4)}, -2037287875, 2037287876, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            Object y7;
            int i13 = ~i10;
            int i14 = i13 | i11;
            int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
            int i16 = ~(i14 | i12);
            int i17 = ~i12;
            if (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15 != 1) {
                int i18 = f54799b;
                int i19 = (((i18 ^ 31) | (i18 & 31)) << 1) - (((~i18) & 31) | (i18 & (-32)));
                f54798a = i19 % 128;
                int i20 = i19 % 2;
                y7 = cb.setY();
                if (i20 != 0) {
                    int i21 = 1 / 0;
                }
            } else {
                byte bByteValue = ((Byte) objArr[0]).byteValue();
                int i22 = f54799b;
                int i23 = i22 & 79;
                int i24 = ((i22 ^ 79) | i23) << 1;
                int i25 = -((i22 | 79) & (~i23));
                int i26 = (i24 & i25) + (i25 | i24);
                f54798a = i26 % 128;
                int i27 = i26 % 2;
                openContextMenu opencontextmenu = (openContextMenu) setX(new Object[0], -48508283, 48508283, (int) System.currentTimeMillis());
                y7 = (cb) ((Enum) openContextMenu.setOnFocusChangeListener(new Object[]{opencontextmenu, Byte.valueOf(bByteValue)}, 693193897, -693193897, System.identityHashCode(opencontextmenu)));
                int i28 = f54798a;
                int i29 = i28 & 61;
                int i30 = -(-((i28 ^ 61) | i29));
                int i31 = (i29 & i30) + (i30 | i29);
                f54799b = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 15 / 0;
                }
            }
            return y7;
        }
    }

    static {
        cb cbVar = RESERVED;
        int i10 = (1 | 71) << 1;
        int i11 = -((1 & (-72)) | (71 & (~1)));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        getAmountFieldTextColor = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 1 & 45;
        int i15 = i14 + ((1 ^ 45) | i14);
        getAmountFieldTextColor = i15 % 128;
        int i16 = i15 % 2;
        INSTANCE = new Companion(null);
        setZ = new setDividerPadding(valuesCustom(), cbVar);
        int i17 = setChildDivider + 75;
        getAmountFieldTextColor = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 7 / 0;
        }
    }

    cb(byte b10) {
        this.setDividerPadding = b10;
    }

    public static final /* synthetic */ openContextMenu setY() {
        int i10 = setChildDivider;
        int i11 = i10 & 3;
        int i12 = (i10 ^ 3) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        getAmountFieldTextColor = i13 % 128;
        int i14 = i13 % 2;
        openContextMenu<cb> opencontextmenu = setZ;
        if (i14 != 0) {
            int i15 = 80 / 0;
        }
        return opencontextmenu;
    }

    public static cb valueOf(String str) {
        int i10 = getAmountFieldTextColor;
        int i11 = (((i10 ^ 17) | (i10 & 17)) << 1) - (((~i10) & 17) | (i10 & (-18)));
        setChildDivider = i11 % 128;
        int i12 = i11 % 2;
        cb cbVar = (cb) Enum.valueOf(cb.class, str);
        if (i12 == 0) {
            int i13 = 65 / 0;
        }
        return cbVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static cb[] valuesCustom() {
        int i10 = getAmountFieldTextColor;
        int i11 = ((-1) << 1) - ((-1) ^ ((i10 & 28) + (i10 | 28)));
        setChildDivider = i11 % 128;
        int i12 = i11 % 2;
        cb[] cbVarArr = (cb[]) values().clone();
        int i13 = getAmountFieldTextColor + 115;
        setChildDivider = i13 % 128;
        int i14 = i13 % 2;
        return cbVarArr;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final byte setCompoundDrawableTintBlendMode() {
        int i10 = ((-1) << 1) - ((getAmountFieldTextColor + 32) ^ (-1));
        int i11 = i10 % 128;
        setChildDivider = i11;
        int i12 = i10 % 2;
        byte b10 = this.setDividerPadding;
        int i13 = i11 & 117;
        int i14 = (i11 ^ 117) | i13;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        getAmountFieldTextColor = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 58 / 0;
        }
        return b10;
    }
}
