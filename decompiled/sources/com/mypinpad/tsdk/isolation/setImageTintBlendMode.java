package com.mypinpad.tsdk.isolation;

import com.bbva.component.request.header.standin.StandInHeaderInterceptor;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b*\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u0002X\u0007¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\bj\u0002\b\u0005j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,"}, d2 = {"Lcom/mypinpad/tsdk/i/setImageTintBlendMode;", "", "", "setAlwaysDrawnWithCacheEnabled", "Ljava/lang/String;", "setDividerPadding", "()Ljava/lang/String;", "setX", "setY", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "UiMessageCallbackKtWhenMappings", "setIncludeFontPadding", "setOnEditorActionListener", "setOnDragListener", "getAmountFieldTextColor", "setNavigationOnClickListener", "setTextScaleX", "setChildDivider", "setCompoundDrawablePadding", "setOnLongClickListener", "setLayoutDirection", "setImageResource", "setMaxEms", "getSuppressed", "setMinHeight", "printStackTrace", "setCursorVisible", "getNavBarTitleString", "TransactionResult", "setTextSelectHandleRight", "setViewTranslationCallback", "setAdapter", "setCacheColorHint", "setSmoothScrollbarEnabled", "setLayoutAnimation", "setEllipsize", "setTextAlignment", "setScroller", "setImageTintMode", "getPreferredLanguage", "setSelectedChildViewEnabled", "setFilterTouchesWhenObscured", "getError", "setZ"}, k = 1, mv = {1, 5, 1})
public final class setImageTintBlendMode {
    private static setImageTintBlendMode TransactionResult = null;
    private static int TsdkManualInitializerinit1 = 0;
    private static setImageTintBlendMode UiMessageCallbackKtWhenMappings = null;
    private static setImageTintBlendMode getAmountFieldTextColor = null;
    private static setImageTintBlendMode getError = null;
    public static final setImageTintBlendMode getNavBarTitleString;
    private static setImageTintBlendMode getPreferredLanguage = null;
    private static setImageTintBlendMode getSuppressed = null;
    private static int getType = 1;
    private static setImageTintBlendMode printStackTrace;
    private static setImageTintBlendMode setAdapter;
    private static setImageTintBlendMode setCacheColorHint;
    private static setImageTintBlendMode setChildDivider;
    private static setImageTintBlendMode setCompoundDrawablePadding;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static setImageTintBlendMode setCursorVisible;
    public static final setImageTintBlendMode setDividerPadding;
    private static setImageTintBlendMode setEllipsize;
    private static setImageTintBlendMode setFilterTouchesWhenObscured;
    private static setImageTintBlendMode setImageResource;
    private static setImageTintBlendMode setImageTintMode;
    private static setImageTintBlendMode setIncludeFontPadding;
    public static final setImageTintBlendMode setLayoutAnimation;
    private static setImageTintBlendMode setLayoutDirection;
    private static setImageTintBlendMode setMaxEms;
    private static setImageTintBlendMode setMinHeight;
    public static final setImageTintBlendMode setNavigationOnClickListener;
    public static final setImageTintBlendMode setOnDragListener;
    private static setImageTintBlendMode setOnEditorActionListener;
    public static final setImageTintBlendMode setOnFocusChangeListener;
    public static final setImageTintBlendMode setOnLongClickListener;
    private static final /* synthetic */ setImageTintBlendMode[] setRendererPriorityPolicy;
    private static setImageTintBlendMode setScroller;
    private static setImageTintBlendMode setSelectedChildViewEnabled;
    private static setImageTintBlendMode setSmoothScrollbarEnabled;
    public static final setImageTintBlendMode setTextAlignment;
    private static setImageTintBlendMode setTextScaleX;
    private static setImageTintBlendMode setTextSelectHandleRight;
    private static setImageTintBlendMode setViewTranslationCallback;
    public static final setImageTintBlendMode setY;
    public static final setImageTintBlendMode setZ;

    /* JADX INFO: renamed from: setAlwaysDrawnWithCacheEnabled, reason: from kotlin metadata */
    @NotNull
    private final String setDividerPadding;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public String setY;

    static {
        setImageTintBlendMode setimagetintblendmode = new setImageTintBlendMode("CODE_00_APPROVED", 0, "00", "Approved");
        setOnFocusChangeListener = setimagetintblendmode;
        setImageTintBlendMode setimagetintblendmode2 = new setImageTintBlendMode("CODE_01_REFER_TO_ISSUER", 1, "01", "Refer customer to card issuer");
        UiMessageCallbackKtWhenMappings = setimagetintblendmode2;
        setImageTintBlendMode setimagetintblendmode3 = new setImageTintBlendMode("CODE_03_INVALID_MERCHANT", 2, "03", "Invalid merchant");
        setIncludeFontPadding = setimagetintblendmode3;
        setImageTintBlendMode setimagetintblendmode4 = new setImageTintBlendMode("CODE_05_DO_NOT_HONOUR", 3, "05", "Do not honour");
        setOnEditorActionListener = setimagetintblendmode4;
        setImageTintBlendMode setimagetintblendmode5 = new setImageTintBlendMode("CODE_08_HONOUR_WITH_ID", 4, "08", "Honour with identification");
        setY = setimagetintblendmode5;
        setImageTintBlendMode setimagetintblendmode6 = new setImageTintBlendMode("CODE_10_PARTIAL_APPROVAL", 5, "10", "Partial approval");
        setDividerPadding = setimagetintblendmode6;
        setImageTintBlendMode setimagetintblendmode7 = new setImageTintBlendMode("CODE_11_VIP_APPROVAL", 6, "11", "VIP Approval");
        setOnDragListener = setimagetintblendmode7;
        setImageTintBlendMode setimagetintblendmode8 = new setImageTintBlendMode("CODE_12_INVALID_TRANSACTION", 7, "12", "Invalid transaction");
        getAmountFieldTextColor = setimagetintblendmode8;
        setImageTintBlendMode setimagetintblendmode9 = new setImageTintBlendMode("CODE_13_INVALID_AMOUNT_CONVERSION", 8, "13", "Invalid amount/currency conversion");
        setNavigationOnClickListener = setimagetintblendmode9;
        setImageTintBlendMode setimagetintblendmode10 = new setImageTintBlendMode("CODE_16_INSUFFICIENT_FUNDS", 9, "16", "Insufficient funds");
        setTextScaleX = setimagetintblendmode10;
        setImageTintBlendMode setimagetintblendmode11 = new setImageTintBlendMode("CODE_17_CANCELLED_BY_CUSTOMER", 10, "17", "Cancelled by customer");
        setChildDivider = setimagetintblendmode11;
        setImageTintBlendMode setimagetintblendmode12 = new setImageTintBlendMode("CODE_19_RETRY", 11, "19", "Retry");
        setCompoundDrawablePadding = setimagetintblendmode12;
        setImageTintBlendMode setimagetintblendmode13 = new setImageTintBlendMode("CODE_1A_ADDITIONAL_AUTH_REQUIRED", 12, EglobalUtils.DOUBLE_AUTH_VISA_CODE, "Additional authentication required");
        setOnLongClickListener = setimagetintblendmode13;
        setImageTintBlendMode setimagetintblendmode14 = new setImageTintBlendMode("CODE_23_DECLINE", 13, EglobalUtils.CARD_REMOVED, "Decline");
        setLayoutDirection = setimagetintblendmode14;
        setImageTintBlendMode setimagetintblendmode15 = new setImageTintBlendMode("CODE_41_RETAIN_CARD_LOST", 14, "41", "Retain card - card reported lost");
        setImageResource = setimagetintblendmode15;
        setImageTintBlendMode setimagetintblendmode16 = new setImageTintBlendMode("CODE_43_RETAIN_CARD_STOLEN", 15, "43", "Retain card - card reported stolen");
        setMaxEms = setimagetintblendmode16;
        setImageTintBlendMode setimagetintblendmode17 = new setImageTintBlendMode("CODE_52_NO_CHECKING_ACCOUNT", 16, "52", "No checking account");
        getSuppressed = setimagetintblendmode17;
        setImageTintBlendMode setimagetintblendmode18 = new setImageTintBlendMode("CODE_51_DECLINE", 17, "51", "Decline");
        setMinHeight = setimagetintblendmode18;
        setImageTintBlendMode setimagetintblendmode19 = new setImageTintBlendMode("CODE_53_NO_SAVING_ACCOUNT", 18, "53", "No savings account");
        printStackTrace = setimagetintblendmode19;
        setImageTintBlendMode setimagetintblendmode20 = new setImageTintBlendMode("CODE_54_CARD_EXPIRED", 19, "54", "Card expired");
        setCursorVisible = setimagetintblendmode20;
        setImageTintBlendMode setimagetintblendmode21 = new setImageTintBlendMode("CODE_55_INCORRECT_PIN", 20, "55", "Incorrect PIN");
        getNavBarTitleString = setimagetintblendmode21;
        setImageTintBlendMode setimagetintblendmode22 = new setImageTintBlendMode("CODE_57_TRANSACTION_NOT_PERMITTED", 21, "57", "Transaction not permitted for cardholder");
        TransactionResult = setimagetintblendmode22;
        setImageTintBlendMode setimagetintblendmode23 = new setImageTintBlendMode("CODE_58_TRASNSACTION_NOT_ALLOWED", 22, StandInHeaderInterceptor.AUTHTYPE58, "Transaction not allowed at terminal");
        setTextSelectHandleRight = setimagetintblendmode23;
        setImageTintBlendMode setimagetintblendmode24 = new setImageTintBlendMode("CODE_59_SUSPECTED_FRAUD", 23, "59", "Suspected fraud");
        setViewTranslationCallback = setimagetintblendmode24;
        setImageTintBlendMode setimagetintblendmode25 = new setImageTintBlendMode("CODE_61_ACTIVITY_LIMITED_EXCEEDED", 24, EglobalUtils.INITIALIZED_KEYS_WRONG_COMMAND, "Activity limited exceeded");
        setAdapter = setimagetintblendmode25;
        setImageTintBlendMode setimagetintblendmode26 = new setImageTintBlendMode("CODE_62_RESTRICTED_CARD", 25, EglobalUtils.NOT_INIT_KEYS, "Restricted card");
        setCacheColorHint = setimagetintblendmode26;
        setImageTintBlendMode setimagetintblendmode27 = new setImageTintBlendMode("CODE_63_SECURITY_VIOLATION", 26, EglobalUtils.READ_CARD_ERROR, "Security violation");
        setSmoothScrollbarEnabled = setimagetintblendmode27;
        setImageTintBlendMode setimagetintblendmode28 = new setImageTintBlendMode("CODE_65_ACTIVITY_COUNT_EXCEEDED", 27, EglobalUtils.DOUBLE_AUTH_MC_CODE, "Activity count exceeded");
        setLayoutAnimation = setimagetintblendmode28;
        setImageTintBlendMode setimagetintblendmode29 = new setImageTintBlendMode("CODE_68_RESPONSE_TOO_LATE", 28, AsoResponse.ERROR_CODE_TSEC_TIME_OUT, "Response received too late");
        setEllipsize = setimagetintblendmode29;
        setImageTintBlendMode setimagetintblendmode30 = new setImageTintBlendMode("CODE_70_PIN_DATA_REQUIRED", 29, "70", "PIN data required");
        setTextAlignment = setimagetintblendmode30;
        setImageTintBlendMode setimagetintblendmode31 = new setImageTintBlendMode("CODE_75_PIN_RETRIES_EXCEEDED", 30, "75", "PIN retries exceeded");
        setScroller = setimagetintblendmode31;
        setImageTintBlendMode setimagetintblendmode32 = new setImageTintBlendMode("CODE_78_BLOCKED", 31, "78", "Blocked - first used");
        setImageTintMode = setimagetintblendmode32;
        setImageTintBlendMode setimagetintblendmode33 = new setImageTintBlendMode("CODE_83_UNABLE_TO_VERIFY_PIN", 32, "83", "Unable to verify PIN");
        getPreferredLanguage = setimagetintblendmode33;
        setImageTintBlendMode setimagetintblendmode34 = new setImageTintBlendMode("CODE_91_ISSUER_UNAVAILABLE", 33, "92", "Issuer unavailable - stand-in processing not applicable or available");
        setSelectedChildViewEnabled = setimagetintblendmode34;
        setImageTintBlendMode setimagetintblendmode35 = new setImageTintBlendMode("CODE_93_TRANSACTION_NOT_COMPLETED_LEGAL", 34, "93", "Transaction cannot be completed due to legal reasons");
        setFilterTouchesWhenObscured = setimagetintblendmode35;
        setImageTintBlendMode setimagetintblendmode36 = new setImageTintBlendMode("CODE_96_SYSTEM_MALFUNCTION", 35, EglobalUtils.NO_NFC, "System malfunction");
        getError = setimagetintblendmode36;
        setImageTintBlendMode setimagetintblendmode37 = new setImageTintBlendMode("UNKNOWN", 36, "", "Unknown");
        setZ = setimagetintblendmode37;
        int i10 = (1 & 117) + (1 | 117);
        TsdkManualInitializerinit1 = i10 % 128;
        int i11 = i10 % 2;
        setImageTintBlendMode[] setimagetintblendmodeArr = {setimagetintblendmode, setimagetintblendmode2, setimagetintblendmode3, setimagetintblendmode4, setimagetintblendmode5, setimagetintblendmode6, setimagetintblendmode7, setimagetintblendmode8, setimagetintblendmode9, setimagetintblendmode10, setimagetintblendmode11, setimagetintblendmode12, setimagetintblendmode13, setimagetintblendmode14, setimagetintblendmode15, setimagetintblendmode16, setimagetintblendmode17, setimagetintblendmode18, setimagetintblendmode19, setimagetintblendmode20, setimagetintblendmode21, setimagetintblendmode22, setimagetintblendmode23, setimagetintblendmode24, setimagetintblendmode25, setimagetintblendmode26, setimagetintblendmode27, setimagetintblendmode28, setimagetintblendmode29, setimagetintblendmode30, setimagetintblendmode31, setimagetintblendmode32, setimagetintblendmode33, setimagetintblendmode34, setimagetintblendmode35, setimagetintblendmode36, setimagetintblendmode37};
        int i12 = (1 ^ 59) + ((1 & 59) << 1);
        TsdkManualInitializerinit1 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        setRendererPriorityPolicy = setimagetintblendmodeArr;
        INSTANCE = new Companion(null);
        int i13 = getType;
        int i14 = ((i13 | 113) << 1) - (i13 ^ 113);
        TsdkManualInitializerinit1 = i14 % 128;
        int i15 = i14 % 2;
    }

    public setImageTintBlendMode(String str, int i10, String str2, String str3) {
        super(str, i10);
        this.setDividerPadding = str2;
        this.setY = str3;
    }

    public static setImageTintBlendMode valueOf(String str) {
        int i10 = TsdkManualInitializerinit1 + 37;
        getType = i10 % 128;
        int i11 = i10 % 2;
        setImageTintBlendMode setimagetintblendmode = (setImageTintBlendMode) Enum.valueOf(setImageTintBlendMode.class, str);
        int i12 = TsdkManualInitializerinit1 + 49;
        getType = i12 % 128;
        int i13 = i12 % 2;
        return setimagetintblendmode;
    }

    public static setImageTintBlendMode[] values() {
        int i10 = TsdkManualInitializerinit1;
        int i11 = ((i10 ^ 122) + ((i10 & 122) << 1)) - 1;
        getType = i11 % 128;
        int i12 = i11 % 2;
        setImageTintBlendMode[] setimagetintblendmodeArr = (setImageTintBlendMode[]) setRendererPriorityPolicy.clone();
        int i13 = TsdkManualInitializerinit1;
        int i14 = ((i13 | 81) << 1) - (((~i13) & 81) | (i13 & (-82)));
        getType = i14 % 128;
        if (i14 % 2 != 0) {
            return setimagetintblendmodeArr;
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        int i10 = TsdkManualInitializerinit1;
        int i11 = ((i10 | 15) << 1) - (i10 ^ 15);
        getType = i11 % 128;
        int i12 = i11 % 2;
        String str = this.setDividerPadding;
        int i13 = i10 & 67;
        int i14 = (((i10 ^ 67) | i13) << 1) - ((i10 | 67) & (~i13));
        getType = i14 % 128;
        int i15 = i14 % 2;
        return str;
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setImageTintBlendMode$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setImageTintBlendMode$setCompoundDrawableTintBlendMode;", "", "", "p0", "Lcom/mypinpad/tsdk/i/setImageTintBlendMode;", "setCompoundDrawableTintBlendMode", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/setImageTintBlendMode;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f59831a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f59832b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            setImageTintBlendMode setimagetintblendmode;
            int i13 = 0;
            String str = (String) objArr[0];
            System.currentTimeMillis();
            System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(str, "");
            setImageTintBlendMode[] setimagetintblendmodeArrValues = setImageTintBlendMode.values();
            int length = setimagetintblendmodeArrValues.length;
            int i14 = f59832b;
            int i15 = ((i14 ^ 33) | (i14 & 33)) << 1;
            int i16 = -(((~i14) & 33) | (i14 & (-34)));
            int i17 = (i15 & i16) + (i16 | i15);
            f59831a = i17 % 128;
            int i18 = i17 % 2;
            while (true) {
                if (i13 >= length) {
                    int i19 = f59832b;
                    int i20 = (i19 & 81) + (i19 | 81);
                    f59831a = i20 % 128;
                    int i21 = i20 % 2;
                    setimagetintblendmode = null;
                    break;
                }
                int i22 = f59831a;
                int i23 = i22 & 73;
                int i24 = i23 + ((i22 ^ 73) | i23);
                f59832b = i24 % 128;
                if (i24 % 2 == 0) {
                    Intrinsics.areEqual(setimagetintblendmodeArrValues[i13].setDividerPadding(), str);
                    throw null;
                }
                setimagetintblendmode = setimagetintblendmodeArrValues[i13];
                if (Intrinsics.areEqual(setimagetintblendmode.setDividerPadding(), str)) {
                    int i25 = f59831a;
                    int i26 = ((((i25 ^ 97) | (i25 & 97)) << 1) - (~(-(((~i25) & 97) | (i25 & (-98)))))) - 1;
                    f59832b = i26 % 128;
                    int i27 = i26 % 2;
                    break;
                }
                i13 = (((i13 & (-2)) | ((~i13) & 1)) - (~(-(-((i13 & 1) << 1))))) - 1;
                int i28 = f59832b;
                int i29 = ((i28 | 67) << 1) - (i28 ^ 67);
                f59831a = i29 % 128;
                int i30 = i29 % 2;
            }
            if (setimagetintblendmode == null) {
                int i31 = f59832b;
                int i32 = i31 & 101;
                int i33 = (i31 | 101) & (~i32);
                int i34 = -(-(i32 << 1));
                int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                f59831a = i35 % 128;
                int i36 = i35 % 2;
                setimagetintblendmode = setImageTintBlendMode.setZ;
                int i37 = f59831a;
                int i38 = ((i37 | 79) << 1) - (i37 ^ 79);
                f59832b = i38 % 128;
                if (i38 % 2 == 0) {
                    throw null;
                }
            } else {
                int i39 = f59831a;
                int i40 = i39 & 41;
                int i41 = ((i39 ^ 41) | i40) << 1;
                int i42 = -((i39 | 41) & (~i40));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f59832b = i43 % 128;
                if (i43 % 2 == 0) {
                    throw null;
                }
            }
            return setimagetintblendmode;
        }

        @NotNull
        public static setImageTintBlendMode setCompoundDrawableTintBlendMode(@NotNull String p4) {
            return (setImageTintBlendMode) setCompoundDrawableTintBlendMode(new Object[]{p4}, 1542621082, -1542621082, (int) System.currentTimeMillis());
        }
    }
}
