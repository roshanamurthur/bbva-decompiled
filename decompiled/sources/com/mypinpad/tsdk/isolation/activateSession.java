package com.mypinpad.tsdk.isolation;

import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\fj\u0002\b\rj\u0002\b\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/activateSession;", "", "", "toString", "()Ljava/lang/String;", "", "setTextAlignment", "B", "setDividerPadding", "()B", "setOnFocusChangeListener", "setY", "setCompoundDrawableTintBlendMode", "setX", "getNavBarTitleString", "setLayoutAnimation", "setOnDragListener", "setOnLongClickListener", "setNavigationOnClickListener", "setZ", "UiMessageCallbackKtWhenMappings", "setAlwaysDrawnWithCacheEnabled"}, k = 1, mv = {1, 5, 1})
public enum activateSession {
    PRESENT_CARD(MessageUtils.MESSAGE_21_NAK),
    PRESENT_CARD_AGAIN((byte) 33),
    APPROVED((byte) 3),
    APPROVED_SIGN(MessageUtils.MESSAGE_26_SUB),
    NOT_AUTHORISED((byte) 7),
    ERROR_OTHER_CARD((byte) 28),
    INSERT_CARD((byte) 29),
    SEE_PHONE((byte) 32),
    AUTHORISING_PLEASE_WAIT((byte) 27),
    CLEAR_DISPLAY(MessageUtils.MESSAGE_30_RS),
    N_A((byte) -1),
    CARD_READ_OK((byte) 0);

    private static int getAmountFieldTextColor = 1;

    @NotNull
    private static final openContextMenu<activateSession> setChildDivider;

    @NotNull
    private static final activateSession setIncludeFontPadding;

    @NotNull
    private static final activateSession setOnEditorActionListener;
    private static int setTextScaleX;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: setTextAlignment, reason: from kotlin metadata */
    private final byte setOnFocusChangeListener;

    public static final class setCompoundDrawableTintBlendMode extends openContextMenu<activateSession> {
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ~i15;
            int i17 = ~i12;
            int i18 = ((i16 | (~(i13 | i17)) | (~(i14 | i17))) * (-1136)) + (i11 * 569) + (i10 * 569);
            int i19 = i10 | i17;
            if ((((~i19) | (~(i11 | i17)) | (~(i15 | i12))) * 568) + (((~(i13 | i12)) | (~(i14 | i12)) | (~(i19 | i11))) * (-568)) + i18 != 1) {
                return Byte.valueOf(((Byte) setX(new Object[]{(activateSession) ((Enum) objArr[1])}, -1818368436, 1818368437, (int) System.currentTimeMillis())).byteValue());
            }
            activateSession activatesession = (activateSession) objArr[0];
            Intrinsics.checkNotNullParameter(activatesession, "");
            return Byte.valueOf(activatesession.setDividerPadding());
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setX(new Object[]{this, r4}, -1228778666, 1228778666, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.activateSession$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u0005\u0010\nR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/activateSession$setY;", "", "", "p0", "Lcom/mypinpad/tsdk/i/activateSession;", "setY", "(B)Lcom/mypinpad/tsdk/i/activateSession;", "setIncludeFontPadding", "Lcom/mypinpad/tsdk/i/activateSession;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/activateSession;", "setCompoundDrawableTintBlendMode", "setOnEditorActionListener", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setChildDivider", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52425a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52426b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i13 | i11);
            int i15 = ~i12;
            int i16 = ((i14 | (~(i15 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
            int i17 = ~(i13 | i12);
            int i18 = ~((~i11) | i10);
            int i19 = ((i18 | i12) * 54) + (((~(i10 | i15)) | i17 | i18) * 54) + i16;
            if (i19 == 1) {
                int i20 = f52426b;
                int i21 = i20 & 93;
                int i22 = i21 + ((i20 ^ 93) | i21);
                f52425a = i22 % 128;
                int i23 = i22 % 2;
                openContextMenu x4 = activateSession.setX();
                if (i23 == 0) {
                    return x4;
                }
                int i24 = 95 / 0;
                return x4;
            }
            if (i19 == 2) {
                int i25 = f52426b;
                int i26 = ((i25 & 27) - (~(i25 | 27))) - 1;
                f52425a = i26 % 128;
                int i27 = i26 % 2;
                activateSession compoundDrawableTintBlendMode = activateSession.setCompoundDrawableTintBlendMode();
                if (i27 == 0) {
                    return compoundDrawableTintBlendMode;
                }
                int i28 = 68 / 0;
                return compoundDrawableTintBlendMode;
            }
            if (i19 != 3) {
                int i29 = f52425a;
                int i30 = i29 & 19;
                int i31 = i30 + ((i29 ^ 19) | i30);
                f52426b = i31 % 128;
                int i32 = i31 % 2;
                activateSession onFocusChangeListener = activateSession.setOnFocusChangeListener();
                int i33 = f52426b;
                int i34 = i33 & 85;
                int i35 = i34 + ((i33 ^ 85) | i34);
                f52425a = i35 % 128;
                int i36 = i35 % 2;
                return onFocusChangeListener;
            }
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i37 = f52425a;
            int i38 = i37 | 59;
            int i39 = i38 << 1;
            int i40 = -((~(i37 & 59)) & i38);
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            f52426b = i41 % 128;
            if (i41 % 2 != 0) {
                openContextMenu opencontextmenu = (openContextMenu) setCompoundDrawableTintBlendMode(new Object[0], -1412320618, 1412320619, (int) System.currentTimeMillis());
                return (activateSession) ((Enum) openContextMenu.setOnFocusChangeListener(new Object[]{opencontextmenu, Byte.valueOf(bByteValue)}, 693193897, -693193897, System.identityHashCode(opencontextmenu)));
            }
            openContextMenu opencontextmenu2 = (openContextMenu) setCompoundDrawableTintBlendMode(new Object[0], -1412320618, 1412320619, (int) System.currentTimeMillis());
            throw null;
        }

        @JvmName(name = "setDividerPadding")
        @NotNull
        public static activateSession setDividerPadding() {
            return (activateSession) setCompoundDrawableTintBlendMode(new Object[0], -1920552587, 1920552589, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static openContextMenu<activateSession> setOnFocusChangeListener() {
            return (openContextMenu) setCompoundDrawableTintBlendMode(new Object[0], -1412320618, 1412320619, (int) System.currentTimeMillis());
        }

        @NotNull
        public static activateSession setY(byte p4) {
            return (activateSession) setCompoundDrawableTintBlendMode(new Object[]{Byte.valueOf(p4)}, -1225863308, 1225863311, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setY")
        @NotNull
        public static activateSession setY() {
            return (activateSession) setCompoundDrawableTintBlendMode(new Object[0], 689677017, -689677017, (int) System.currentTimeMillis());
        }
    }

    static {
        activateSession activatesession = PRESENT_CARD_AGAIN;
        activateSession activatesession2 = NOT_AUTHORISED;
        int i10 = 65 << 1;
        int i11 = -(65 & (~0));
        int i12 = (i10 & i11) + (i11 | i10);
        int i13 = i12 % 128;
        getAmountFieldTextColor = i13;
        int i14 = i12 % 2;
        int i15 = ((i13 | 59) << 1) - ((i13 & (-60)) | ((~i13) & 59));
        setTextScaleX = i15 % 128;
        int i16 = i15 % 2;
        INSTANCE = new Companion(null);
        setIncludeFontPadding = activatesession2;
        setOnEditorActionListener = activatesession;
        setChildDivider = new setCompoundDrawableTintBlendMode(valuesCustom(), 22);
        int i17 = getAmountFieldTextColor + 65;
        setTextScaleX = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    activateSession(byte b10) {
        this.setOnFocusChangeListener = b10;
    }

    public static final /* synthetic */ activateSession setCompoundDrawableTintBlendMode() {
        int i10 = setTextScaleX;
        int i11 = ((i10 | 41) << 1) - (i10 ^ 41);
        getAmountFieldTextColor = i11 % 128;
        if (i11 % 2 != 0) {
            return setIncludeFontPadding;
        }
        throw null;
    }

    public static final /* synthetic */ activateSession setOnFocusChangeListener() {
        int i10 = ((-1) << 1) - ((setTextScaleX + 86) ^ (-1));
        int i11 = i10 % 128;
        getAmountFieldTextColor = i11;
        int i12 = i10 % 2;
        activateSession activatesession = setOnEditorActionListener;
        int i13 = (i11 & 93) + (i11 | 93);
        setTextScaleX = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 48 / 0;
        }
        return activatesession;
    }

    public static final /* synthetic */ openContextMenu setX() {
        int i10 = getAmountFieldTextColor;
        int i11 = (i10 & 25) + (i10 | 25);
        setTextScaleX = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        openContextMenu<activateSession> opencontextmenu = setChildDivider;
        int i12 = ((i10 ^ 42) + ((i10 & 42) << 1)) - 1;
        setTextScaleX = i12 % 128;
        if (i12 % 2 == 0) {
            return opencontextmenu;
        }
        throw null;
    }

    public static activateSession valueOf(String str) {
        int i10 = setTextScaleX;
        int i11 = i10 & 101;
        int i12 = (i11 - (~(-(-((i10 ^ 101) | i11))))) - 1;
        getAmountFieldTextColor = i12 % 128;
        if (i12 % 2 != 0) {
            return (activateSession) Enum.valueOf(activateSession.class, str);
        }
        Enum.valueOf(activateSession.class, str);
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static activateSession[] valuesCustom() {
        int i10 = ((-1) << 1) - ((setTextScaleX + 54) ^ (-1));
        getAmountFieldTextColor = i10 % 128;
        int i11 = i10 % 2;
        activateSession[] activatesessionArr = (activateSession[]) values().clone();
        int i12 = getAmountFieldTextColor;
        int i13 = i12 & 31;
        int i14 = (i12 | 31) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        setTextScaleX = i16 % 128;
        if (i16 % 2 == 0) {
            return activatesessionArr;
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        int i10 = getAmountFieldTextColor;
        int i11 = i10 + 107;
        setTextScaleX = i11 % 128;
        int i12 = i11 % 2;
        byte b10 = this.setOnFocusChangeListener;
        int i13 = (i10 & (-108)) | ((~i10) & 107);
        int i14 = (i10 & 107) << 1;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        setTextScaleX = i15 % 128;
        if (i15 % 2 == 0) {
            return b10;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setTextScaleX;
        int i11 = (((i10 | 122) << 1) - (i10 ^ 122)) - 1;
        getAmountFieldTextColor = i11 % 128;
        int i12 = i11 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i13 = getAmountFieldTextColor;
        int i14 = ((i13 | 117) << 1) - (i13 ^ 117);
        setTextScaleX = i14 % 128;
        int i15 = i14 % 2;
        return "";
    }
}
