package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\nj\u0002\b\rj\u0002\b\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a"}, d2 = {"Lcom/mypinpad/tsdk/i/setContentCaptureSession;", "", "", "toString", "()Ljava/lang/String;", "", "setZ", "B", "setX", "()B", "setDividerPadding", "setY", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setLayoutAnimation", "setNavigationOnClickListener", "setOnDragListener", "setOnLongClickListener", "getNavBarTitleString", "setTextAlignment", "setChildDivider", "UiMessageCallbackKtWhenMappings", "setCompoundDrawablePadding", "getAmountFieldTextColor", "setTextScaleX", "setOnEditorActionListener", "setAlwaysDrawnWithCacheEnabled"}, k = 1, mv = {1, 5, 1})
public final class setContentCaptureSession {
    public static final setContentCaptureSession UiMessageCallbackKtWhenMappings;
    private static setContentCaptureSession getAmountFieldTextColor = null;
    public static final setContentCaptureSession getNavBarTitleString;
    public static final setContentCaptureSession setAlwaysDrawnWithCacheEnabled;
    private static setContentCaptureSession setChildDivider = null;
    private static setContentCaptureSession setCompoundDrawablePadding = null;
    public static final setContentCaptureSession setCompoundDrawableTintBlendMode;
    public static final setContentCaptureSession setDividerPadding;
    private static int setImageResource = 1;

    @NotNull
    private static final openContextMenu<setContentCaptureSession> setIncludeFontPadding;
    public static final setContentCaptureSession setLayoutAnimation;
    private static int setLayoutDirection;
    private static final /* synthetic */ setContentCaptureSession[] setMinHeight;
    public static final setContentCaptureSession setNavigationOnClickListener;
    public static final setContentCaptureSession setOnDragListener;
    private static setContentCaptureSession setOnEditorActionListener;
    public static final setContentCaptureSession setOnFocusChangeListener;
    public static final setContentCaptureSession setOnLongClickListener;
    private static setContentCaptureSession setTextAlignment;
    private static setContentCaptureSession setTextScaleX;
    public static final setContentCaptureSession setX;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: setZ, reason: from kotlin metadata */
    private final byte setDividerPadding;

    public static final class setCompoundDrawableTintBlendMode extends openContextMenu<setContentCaptureSession> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f59574f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f59575g = 1;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = i13 | i11;
            int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
            int i16 = ~(i14 | i12);
            int i17 = ~i12;
            if (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15 != 1) {
                setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[0];
                int i18 = f59574f;
                int i19 = ((-1) << 1) - ((((i18 | 74) << 1) - (i18 ^ 74)) ^ (-1));
                f59575g = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
                byte x4 = setcontentcapturesession.setX();
                int i21 = f59575g;
                int i22 = ((((i21 ^ 33) | (i21 & 33)) << 1) - (~(-(((~i21) & 33) | (i21 & (-34)))))) - 1;
                f59574f = i22 % 128;
                int i23 = i22 % 2;
                return Byte.valueOf(x4);
            }
            Enum r10 = (Enum) objArr[1];
            int i24 = f59574f;
            int i25 = i24 | 105;
            int i26 = i25 << 1;
            int i27 = -((~(i24 & 105)) & i25);
            int i28 = (i26 & i27) + (i27 | i26);
            f59575g = i28 % 128;
            int i29 = i28 % 2;
            byte bByteValue = ((Byte) setDividerPadding(new Object[]{(setContentCaptureSession) r10}, 1088713419, -1088713419, (int) System.currentTimeMillis())).byteValue();
            int i30 = f59575g;
            int i31 = i30 & 55;
            int i32 = -(-(i30 | 55));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            f59574f = i33 % 128;
            int i34 = i33 % 2;
            return Byte.valueOf(bByteValue);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setDividerPadding(new Object[]{this, r4}, -1574293321, 1574293322, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setContentCaptureSession$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setContentCaptureSession$setY;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/setContentCaptureSession;", "setIncludeFontPadding", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f59576a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f59577b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f59577b;
            int i14 = i13 & 49;
            int i15 = ((i13 | 49) & (~i14)) + (i14 << 1);
            f59576a = i15 % 128;
            int i16 = i15 % 2;
            openContextMenu onFocusChangeListener = setContentCaptureSession.setOnFocusChangeListener();
            int i17 = f59576a;
            int i18 = i17 & 105;
            int i19 = (i17 | 105) & (~i18);
            int i20 = i18 << 1;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            f59577b = i21 % 128;
            if (i21 % 2 != 0) {
                return onFocusChangeListener;
            }
            throw null;
        }

        @JvmName(name = "setDividerPadding")
        @NotNull
        public static openContextMenu<setContentCaptureSession> setDividerPadding() {
            return (openContextMenu) setCompoundDrawableTintBlendMode(new Object[0], -803309742, 803309742, (int) System.currentTimeMillis());
        }
    }

    static {
        setContentCaptureSession setcontentcapturesession = new setContentCaptureSession("NOT_SET", 0, (byte) -1);
        setCompoundDrawableTintBlendMode = setcontentcapturesession;
        setContentCaptureSession setcontentcapturesession2 = new setContentCaptureSession("OK", 1, (byte) 0);
        setDividerPadding = setcontentcapturesession2;
        setContentCaptureSession setcontentcapturesession3 = new setContentCaptureSession("CARD_DATA_MISSING", 2, (byte) 1);
        setOnFocusChangeListener = setcontentcapturesession3;
        setContentCaptureSession setcontentcapturesession4 = new setContentCaptureSession("CAM_FAILED", 3, (byte) 2);
        setX = setcontentcapturesession4;
        setContentCaptureSession setcontentcapturesession5 = new setContentCaptureSession("STATUS_BYTES", 4, (byte) 3);
        setLayoutAnimation = setcontentcapturesession5;
        setContentCaptureSession setcontentcapturesession6 = new setContentCaptureSession("PARSING_ERROR", 5, (byte) 4);
        setNavigationOnClickListener = setcontentcapturesession6;
        setContentCaptureSession setcontentcapturesession7 = new setContentCaptureSession("MAX_LIMIT_EXCEEDED", 6, (byte) 5);
        setOnDragListener = setcontentcapturesession7;
        setContentCaptureSession setcontentcapturesession8 = new setContentCaptureSession("CARD_DATA_ERROR", 7, (byte) 6);
        setOnLongClickListener = setcontentcapturesession8;
        setContentCaptureSession setcontentcapturesession9 = new setContentCaptureSession("MAGSTRIPE_NOT_SUPPORTED", 8, (byte) 7);
        getNavBarTitleString = setcontentcapturesession9;
        setContentCaptureSession setcontentcapturesession10 = new setContentCaptureSession("NO_PPSE", 9, (byte) 8);
        setTextAlignment = setcontentcapturesession10;
        setContentCaptureSession setcontentcapturesession11 = new setContentCaptureSession("PPSE_FAULT", 10, (byte) 9);
        setChildDivider = setcontentcapturesession11;
        setContentCaptureSession setcontentcapturesession12 = new setContentCaptureSession("EMPTY_CANDIDATE_LIST", 11, (byte) 10);
        UiMessageCallbackKtWhenMappings = setcontentcapturesession12;
        setContentCaptureSession setcontentcapturesession13 = new setContentCaptureSession("IDS_READ_ERROR", 12, (byte) 11);
        setCompoundDrawablePadding = setcontentcapturesession13;
        setContentCaptureSession setcontentcapturesession14 = new setContentCaptureSession("IDS_WRITE_ERROR", 13, (byte) 12);
        getAmountFieldTextColor = setcontentcapturesession14;
        setContentCaptureSession setcontentcapturesession15 = new setContentCaptureSession("IDS_DATA_ERROR", 14, (byte) 13);
        setTextScaleX = setcontentcapturesession15;
        setContentCaptureSession setcontentcapturesession16 = new setContentCaptureSession("IDS_NO_MATCHING_AC", 15, Constants.CVR_B1b41_1110_ONLINE_PIN);
        setOnEditorActionListener = setcontentcapturesession16;
        setContentCaptureSession setcontentcapturesession17 = new setContentCaptureSession("TERMINAL_DATA_ERROR", 16, (byte) 15);
        setAlwaysDrawnWithCacheEnabled = setcontentcapturesession17;
        setImageResource = 35 % 128;
        int i10 = 35 % 2;
        setContentCaptureSession[] setcontentcapturesessionArr = {setcontentcapturesession, setcontentcapturesession2, setcontentcapturesession3, setcontentcapturesession4, setcontentcapturesession5, setcontentcapturesession6, setcontentcapturesession7, setcontentcapturesession8, setcontentcapturesession9, setcontentcapturesession10, setcontentcapturesession11, setcontentcapturesession12, setcontentcapturesession13, setcontentcapturesession14, setcontentcapturesession15, setcontentcapturesession16, setcontentcapturesession17};
        int i11 = (47 << 1) - (47 & (~0));
        setImageResource = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 62 / 0;
        }
        setMinHeight = setcontentcapturesessionArr;
        INSTANCE = new Companion(null);
        setIncludeFontPadding = new setCompoundDrawableTintBlendMode(values(), 19);
        int i13 = setLayoutDirection + 103;
        setImageResource = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public setContentCaptureSession(String str, int i10, byte b10) {
        super(str, i10);
        this.setDividerPadding = b10;
    }

    public static final /* synthetic */ openContextMenu setOnFocusChangeListener() {
        int i10 = setImageResource;
        int i11 = i10 & 63;
        int i12 = ((i10 ^ 63) | i11) << 1;
        int i13 = -((i10 | 63) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        setLayoutDirection = i15;
        int i16 = i14 % 2;
        openContextMenu<setContentCaptureSession> opencontextmenu = setIncludeFontPadding;
        int i17 = i15 & 61;
        int i18 = i17 + ((i15 ^ 61) | i17);
        setImageResource = i18 % 128;
        int i19 = i18 % 2;
        return opencontextmenu;
    }

    public static setContentCaptureSession valueOf(String str) {
        int i10 = setLayoutDirection;
        int i11 = i10 & 35;
        int i12 = i11 + ((i10 ^ 35) | i11);
        setImageResource = i12 % 128;
        int i13 = i12 % 2;
        setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) Enum.valueOf(setContentCaptureSession.class, str);
        int i14 = setImageResource;
        int i15 = (((i14 | 20) << 1) - (i14 ^ 20)) - 1;
        setLayoutDirection = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 55 / 0;
        }
        return setcontentcapturesession;
    }

    public static setContentCaptureSession[] values() {
        int i10 = setLayoutDirection;
        int i11 = (i10 & 55) + (i10 | 55);
        setImageResource = i11 % 128;
        int i12 = i11 % 2;
        setContentCaptureSession[] setcontentcapturesessionArr = (setContentCaptureSession[]) setMinHeight.clone();
        int i13 = setImageResource;
        int i14 = ((i13 ^ 75) | (i13 & 75)) << 1;
        int i15 = -(((~i13) & 75) | (i13 & (-76)));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        setLayoutDirection = i16 % 128;
        int i17 = i16 % 2;
        return setcontentcapturesessionArr;
    }

    @JvmName(name = "setX")
    public final byte setX() {
        int i10 = setLayoutDirection;
        int i11 = ((-1) << 1) - ((i10 + 102) ^ (-1));
        setImageResource = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        byte b10 = this.setDividerPadding;
        int i12 = i10 + 89;
        setImageResource = i12 % 128;
        if (i12 % 2 != 0) {
            return b10;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setImageResource + 67;
        setLayoutDirection = i10 % 128;
        int i11 = i10 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i12 = setImageResource + 82;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        setLayoutDirection = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 65 / 0;
        }
        return "";
    }
}
