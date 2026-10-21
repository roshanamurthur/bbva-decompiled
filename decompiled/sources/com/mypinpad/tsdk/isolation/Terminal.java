package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0007j\u0002\b\u0010j\u0002\b\u0015j\u0002\b\u000bj\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d"}, d2 = {"Lcom/mypinpad/tsdk/i/Terminal;", "", "", "setZ", "Ljava/lang/String;", "setDividerPadding", "()Ljava/lang/String;", "setX", "", "UiMessageCallbackKtWhenMappings", "B", "setY", "()B", "", "setIncludeFontPadding", "Z", "setCompoundDrawableTintBlendMode", "()Z", "Lcom/mypinpad/tsdk/i/getINVALID_MERCHANT_IDannotations;", "getAmountFieldTextColor", "Lcom/mypinpad/tsdk/i/getINVALID_MERCHANT_IDannotations;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/getINVALID_MERCHANT_IDannotations;", "setOnLongClickListener", "getNavBarTitleString", "setLayoutAnimation", "setNavigationOnClickListener", "setOnDragListener", "setTextAlignment", "setAlwaysDrawnWithCacheEnabled"}, k = 1, mv = {1, 5, 1})
public enum Terminal {
    OTHER("Other", (byte) 0, false, null),
    KERNEL_1("VISA&JCB", (byte) 1, false, null),
    KERNEL_2("MasterCard", (byte) 2, true, getINVALID_MERCHANT_IDannotations.setLayoutAnimation),
    KERNEL_3(ProviderType.PROVIDER_ID_VISA, (byte) 3, true, getINVALID_MERCHANT_IDannotations.getNavBarTitleString),
    KERNEL_4("American Express", (byte) 4, true, getINVALID_MERCHANT_IDannotations.setCompoundDrawableTintBlendMode),
    KERNEL_5("JCB", (byte) 5, false, getINVALID_MERCHANT_IDannotations.setY),
    KERNEL_6("Discover", (byte) 6, true, getINVALID_MERCHANT_IDannotations.setDividerPadding),
    KERNEL_7("UnionPay", (byte) 7, false, getINVALID_MERCHANT_IDannotations.setOnLongClickListener),
    KERNEL_13("RuPay", (byte) 13, false, getINVALID_MERCHANT_IDannotations.setNavigationOnClickListener),
    KERNEL_INTERAC("Interac", (byte) -15, true, getINVALID_MERCHANT_IDannotations.setOnFocusChangeListener),
    KERNEL_EFTPOS("Eftpos", (byte) -14, true, getINVALID_MERCHANT_IDannotations.setX);

    private static int setCompoundDrawablePadding = 0;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setTextScaleX = 1;

    /* JADX INFO: renamed from: UiMessageCallbackKtWhenMappings, reason: from kotlin metadata */
    private final byte setY;

    /* JADX INFO: renamed from: getAmountFieldTextColor, reason: from kotlin metadata */
    @Nullable
    private final getINVALID_MERCHANT_IDannotations setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: setIncludeFontPadding, reason: from kotlin metadata */
    private final boolean setDividerPadding;

    /* JADX INFO: renamed from: setZ, reason: from kotlin metadata */
    @NotNull
    private final String setX;

    static {
        int i10 = setCompoundDrawablePadding;
        int i11 = i10 & 35;
        int i12 = ((i10 ^ 35) | i11) << 1;
        int i13 = -((i10 | 35) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        setTextScaleX = i15;
        int i16 = i14 % 2;
        int i17 = i15 & 101;
        int i18 = i15 | 101;
        int i19 = (i17 & i18) + (i17 | i18);
        setCompoundDrawablePadding = i19 % 128;
        int i20 = i19 % 2;
        INSTANCE = new Companion(null);
        int i21 = setTextScaleX;
        int i22 = i21 & 81;
        int i23 = (i21 ^ 81) | i22;
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        setCompoundDrawablePadding = i24 % 128;
        int i25 = i24 % 2;
    }

    Terminal(String str, byte b10, boolean z10, getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations) {
        this.setX = str;
        this.setY = b10;
        this.setDividerPadding = z10;
        this.setCompoundDrawableTintBlendMode = getinvalid_merchant_idannotations;
    }

    public static Terminal valueOf(String str) {
        int i10 = setCompoundDrawablePadding;
        int i11 = i10 & 69;
        int i12 = -(-((i10 ^ 69) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setTextScaleX = i13 % 128;
        int i14 = i13 % 2;
        Terminal terminal = (Terminal) Enum.valueOf(Terminal.class, str);
        int i15 = setTextScaleX;
        int i16 = (i15 | 49) << 1;
        int i17 = -(((~i15) & 49) | (i15 & (-50)));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        setCompoundDrawablePadding = i18 % 128;
        int i19 = i18 % 2;
        return terminal;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Terminal[] valuesCustom() {
        Terminal[] terminalArr;
        int i10 = setTextScaleX;
        int i11 = i10 & 35;
        int i12 = -(-((i10 ^ 35) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setCompoundDrawablePadding = i13 % 128;
        int i14 = i13 % 2;
        Terminal[] terminalArrValuesCustom = values();
        if (i14 != 0) {
            terminalArr = (Terminal[]) terminalArrValuesCustom.clone();
            int i15 = 74 / 0;
        } else {
            terminalArr = (Terminal[]) terminalArrValuesCustom.clone();
        }
        int i16 = setCompoundDrawablePadding;
        int i17 = (i16 ^ 67) + ((i16 & 67) << 1);
        setTextScaleX = i17 % 128;
        int i18 = i17 % 2;
        return terminalArr;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final boolean setCompoundDrawableTintBlendMode() {
        int i10 = setCompoundDrawablePadding;
        int i11 = (((i10 | 78) << 1) - (i10 ^ 78)) - 1;
        setTextScaleX = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.setDividerPadding;
        int i13 = ((i10 | 120) << 1) - (i10 ^ 120);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        setTextScaleX = i14 % 128;
        int i15 = i14 % 2;
        return z10;
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        int i10 = setCompoundDrawablePadding;
        int i11 = ((i10 ^ 39) | (i10 & 39)) << 1;
        int i12 = -((i10 & (-40)) | ((~i10) & 39));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        setTextScaleX = i13 % 128;
        int i14 = i13 % 2;
        String str = this.setX;
        if (i14 == 0) {
            int i15 = 29 / 0;
        }
        int i16 = ((i10 & 122) + (i10 | 122)) - 1;
        setTextScaleX = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 4 / 0;
        }
        return str;
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final getINVALID_MERCHANT_IDannotations setOnFocusChangeListener() {
        int i10 = setCompoundDrawablePadding;
        int i11 = i10 & 15;
        int i12 = (((i10 ^ 15) | i11) << 1) - ((i10 | 15) & (~i11));
        int i13 = i12 % 128;
        setTextScaleX = i13;
        int i14 = i12 % 2;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations = this.setCompoundDrawableTintBlendMode;
        int i15 = ((i13 | 75) << 1) - (i13 ^ 75);
        setCompoundDrawablePadding = i15 % 128;
        int i16 = i15 % 2;
        return getinvalid_merchant_idannotations;
    }

    @JvmName(name = "setY")
    public final byte setY() {
        int i10 = setTextScaleX;
        int i11 = (i10 & 105) + (i10 | 105);
        int i12 = i11 % 128;
        setCompoundDrawablePadding = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        byte b10 = this.setY;
        int i13 = i12 | 19;
        int i14 = (i13 << 1) - ((~(i12 & 19)) & i13);
        setTextScaleX = i14 % 128;
        int i15 = i14 % 2;
        return b10;
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.Terminal$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/Terminal$setDividerPadding;", "", "", "p0", "Lcom/mypinpad/tsdk/i/Terminal;", "setDividerPadding", "(B)Lcom/mypinpad/tsdk/i/Terminal;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f51812a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f51813b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i13 = f51812a;
            int i14 = ((i13 ^ 68) + ((i13 & 68) << 1)) - 1;
            f51813b = i14 % 128;
            int i15 = i14 % 2;
            Terminal terminal = null;
            if (bByteValue == 0) {
                int i16 = i13 ^ 23;
                int i17 = (((i13 & 23) | i16) << 1) - i16;
                int i18 = i17 % 128;
                f51813b = i18;
                int i19 = i17 % 2;
                int i20 = i18 + 47;
                f51812a = i20 % 128;
                int i21 = i20 % 2;
                return null;
            }
            Terminal[] terminalArrValuesCustom = Terminal.valuesCustom();
            int length = terminalArrValuesCustom.length;
            int i22 = f51812a;
            int i23 = ((i22 ^ 35) | (i22 & 35)) << 1;
            int i24 = -(((~i22) & 35) | (i22 & (-36)));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f51813b = i25 % 128;
            int i26 = i25 % 2;
            int i27 = 0;
            while (true) {
                if (i27 >= length) {
                    int i28 = f51813b;
                    int i29 = (i28 ^ 95) + ((i28 & 95) << 1);
                    f51812a = i29 % 128;
                    int i30 = i29 % 2;
                    break;
                }
                int i31 = f51812a;
                int i32 = i31 ^ 51;
                int i33 = ((((i31 & 51) | i32) << 1) - (~(-i32))) - 1;
                f51813b = i33 % 128;
                if (i33 % 2 == 0) {
                    terminalArrValuesCustom[i27].setY();
                    throw null;
                }
                Terminal terminal2 = terminalArrValuesCustom[i27];
                if (terminal2.setY() == bByteValue) {
                    int i34 = f51812a;
                    int i35 = i34 & 79;
                    int i36 = i35 + ((i34 ^ 79) | i35);
                    f51813b = i36 % 128;
                    if (i36 % 2 != 0) {
                        int i37 = i34 & 125;
                        int i38 = (i34 ^ 125) | i37;
                        int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                        f51813b = i39 % 128;
                        int i40 = i39 % 2;
                        int i41 = (-2) - ((i34 + 36) ^ (-1));
                        f51813b = i41 % 128;
                        int i42 = i41 % 2;
                        terminal = terminal2;
                        break;
                    }
                } else {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                }
                int i43 = i27 & 1;
                int i44 = (i27 | 1) & (~i43);
                int i45 = -(-(i43 << 1));
                i27 = ((i44 & i45) << 1) + (i44 ^ i45);
                int i46 = f51813b;
                int i47 = (i46 & (-78)) | ((~i46) & 77);
                int i48 = -(-((i46 & 77) << 1));
                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                f51812a = i49 % 128;
                int i50 = i49 % 2;
            }
            if (terminal != null) {
                int i51 = f51812a;
                int i52 = (i51 | 41) << 1;
                int i53 = -(i51 ^ 41);
                int i54 = (i52 & i53) + (i53 | i52);
                f51813b = i54 % 128;
                int i55 = i54 % 2;
                return terminal;
            }
            int i56 = f51813b;
            int i57 = ((i56 ^ 17) | (i56 & 17)) << 1;
            int i58 = -(((~i56) & 17) | (i56 & (-18)));
            int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
            f51812a = i59 % 128;
            int i60 = i59 % 2;
            Terminal terminal3 = Terminal.OTHER;
            if (i60 != 0) {
                int i61 = 74 / 0;
            }
            return terminal3;
        }

        @Nullable
        public static Terminal setDividerPadding(byte p4) {
            return (Terminal) setDividerPadding(new Object[]{Byte.valueOf(p4)}, -670685073, 670685073, (int) System.currentTimeMillis());
        }
    }
}
