package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'setNavigationOnClickListener' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000eX\u0007¢\u0006\u0006\n\u0004\b\t\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b "}, d2 = {"Lcom/mypinpad/tsdk/i/da;", "", "", "setX", "B", "()B", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/ck;", "Lcom/mypinpad/tsdk/i/ck;", "setY", "()Lcom/mypinpad/tsdk/i/ck;", "setCompoundDrawableTintBlendMode", "Lcom/mypinpad/tsdk/i/cg;", "Lcom/mypinpad/tsdk/i/cg;", "Lcom/mypinpad/tsdk/i/cj;", "Lcom/mypinpad/tsdk/i/cj;", "setDividerPadding", "setNavigationOnClickListener", "setLayoutAnimation", "setOnDragListener", "getNavBarTitleString", "setTextAlignment", "setZ", "setAlwaysDrawnWithCacheEnabled", "UiMessageCallbackKtWhenMappings", "setIncludeFontPadding", "setCompoundDrawablePadding", "setChildDivider", "setOnEditorActionListener", "getAmountFieldTextColor", "setTextScaleX", "setImageResource", "setMinHeight"}, k = 1, mv = {1, 5, 1})
public final class da {
    private static da UiMessageCallbackKtWhenMappings = null;
    private static da getAmountFieldTextColor = null;
    private static da getNavBarTitleString = null;
    private static int getSuppressed = 1;
    private static da setAlwaysDrawnWithCacheEnabled;
    private static da setChildDivider;
    private static da setCompoundDrawablePadding;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static da setImageResource;
    private static da setIncludeFontPadding;
    private static da setLayoutAnimation;
    private static final /* synthetic */ da[] setLayoutDirection;
    private static int setMaxEms;
    private static da setMinHeight;
    private static da setNavigationOnClickListener;
    private static da setOnDragListener;
    private static da setOnEditorActionListener;

    @NotNull
    private static final openContextMenu<da> setOnLongClickListener;
    private static da setTextAlignment;
    private static da setTextScaleX;
    private static da setZ;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public cg setX;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    private final ck setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    private final byte setOnFocusChangeListener;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public cj setDividerPadding;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.da$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/da$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/da;", "setOnLongClickListener", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setY", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setDividerPadding")
        @NotNull
        public static openContextMenu<da> setDividerPadding() {
            return (openContextMenu) setY(new Object[0], 1348427754, -1348427754, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            return da.setOnFocusChangeListener();
        }
    }

    public static final class setX extends openContextMenu<da> {
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 517) + (i10 * (-515));
            int i14 = ~i11;
            int i15 = ~(i14 | i12);
            int i16 = ~i12;
            int i17 = i15 | (~(i16 | i10));
            int i18 = ~(i16 | i11);
            int i19 = ~i10;
            if ((((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i14 | i19)) | (~(i19 | i16 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i17 | i18) * (-516)) + i13 == 1) {
                return Byte.valueOf(((Byte) setDividerPadding(new Object[]{(da) ((Enum) objArr[1])}, 1128245838, -1128245838, (int) System.currentTimeMillis())).byteValue());
            }
            da daVar = (da) objArr[0];
            Intrinsics.checkNotNullParameter(daVar, "");
            return Byte.valueOf(daVar.setX());
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setDividerPadding(new Object[]{this, r4}, -338745050, 338745051, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        ck ckVar = ck.setY;
        cg cgVar = cg.setY;
        cj cjVar = cj.setY;
        setNavigationOnClickListener = new da("ATTENDED__ONLINE_ONLY__FINANCIAL_INSTITUTION", 0, (byte) 17, ckVar, cgVar, cjVar);
        cg cgVar2 = cg.setDividerPadding;
        setLayoutAnimation = new da("ATTENDED__OFFLINE_WITH_ONLINE_CAPABILITY__FINANCIAL_INSTITUTION", 1, MessageUtils.MESSAGE_18_DC2, ckVar, cgVar2, cjVar);
        cg cgVar3 = cg.setX;
        setOnDragListener = new da("ATTENDED__OFFLINE_ONLY__FINANCIAL_INSTITUTION", 2, (byte) 19, ckVar, cgVar3, cjVar);
        ck ckVar2 = ck.setX;
        getNavBarTitleString = new da("UNATTENDED__ONLINE_ONLY__FINANCIAL_INSTITUTION", 3, (byte) 20, ckVar2, cgVar, cjVar);
        setTextAlignment = new da("UNATTENDED__OFFLINE_WITH_ONLINE_CAPABILITY__FINANCIAL_INSTITUTION", 4, MessageUtils.MESSAGE_21_NAK, ckVar2, cgVar2, cjVar);
        setZ = new da("UNATTENDED__OFFLINE_ONLY__FINANCIAL_INSTITUTION", 5, (byte) 22, ckVar2, cgVar3, cjVar);
        cj cjVar2 = cj.setCompoundDrawableTintBlendMode;
        setAlwaysDrawnWithCacheEnabled = new da("ATTENDED__ONLINE_ONLY__MERCHANT", 6, (byte) 33, ckVar, cgVar, cjVar2);
        UiMessageCallbackKtWhenMappings = new da("ATTENDED__OFFLINE_WITH_ONLINE_CAPABILITY__MERCHANT", 7, (byte) 34, ckVar, cgVar2, cjVar2);
        setIncludeFontPadding = new da("ATTENDED__OFFLINE_ONLY__MERCHANT", 8, (byte) 35, ckVar, cgVar3, cjVar2);
        setCompoundDrawablePadding = new da("UNATTENDED__ONLINE_ONLY__MERCHANT", 9, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, ckVar2, cgVar, cjVar2);
        setChildDivider = new da("UNATTENDED__OFFLINE_WITH_ONLINE_CAPABILITY__MERCHANT", 10, (byte) 37, ckVar2, cgVar2, cjVar2);
        setOnEditorActionListener = new da("UNATTENDED__OFFLINE_ONLY__MERCHANT", 11, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, ckVar2, cgVar3, cjVar2);
        cj cjVar3 = cj.setDividerPadding;
        getAmountFieldTextColor = new da("UNATTENDED__ONLINE_ONLY__CARD_HOLDER", 12, (byte) 52, ckVar2, cgVar, cjVar3);
        setTextScaleX = new da("UNATTENDED__OFFLINE_WITH_ONLINE_CAPABILITY__CARD_HOLDER", 13, (byte) 53, ckVar2, cgVar2, cjVar3);
        setImageResource = new da("UNATTENDED__OFFLINE_ONLY__CARD_HOLDER", 14, (byte) 54, ckVar2, cgVar3, cjVar3);
        da daVar = new da("UNKNOWN", 15, (byte) 0, ck.setDividerPadding, cg.setOnFocusChangeListener, cj.setOnFocusChangeListener);
        setMinHeight = daVar;
        int i10 = setMaxEms;
        int i11 = (i10 & (-10)) | ((~i10) & 9);
        int i12 = -(-((i10 & 9) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        getSuppressed = i14;
        int i15 = i13 % 2;
        da[] daVarArr = {setNavigationOnClickListener, setLayoutAnimation, setOnDragListener, getNavBarTitleString, setTextAlignment, setZ, setAlwaysDrawnWithCacheEnabled, UiMessageCallbackKtWhenMappings, setIncludeFontPadding, setCompoundDrawablePadding, setChildDivider, setOnEditorActionListener, getAmountFieldTextColor, setTextScaleX, setImageResource, daVar};
        int i16 = (i14 ^ 123) + ((i14 & 123) << 1);
        setMaxEms = i16 % 128;
        int i17 = i16 % 2;
        setLayoutDirection = daVarArr;
        INSTANCE = new Companion(null);
        setOnLongClickListener = new setX(values(), setMinHeight);
        int i18 = getSuppressed + 11;
        setMaxEms = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public da(String str, int i10, byte b10, ck ckVar, cg cgVar, cj cjVar) {
        super(str, i10);
        this.setOnFocusChangeListener = b10;
        this.setCompoundDrawableTintBlendMode = ckVar;
        this.setX = cgVar;
        this.setDividerPadding = cjVar;
    }

    public static final /* synthetic */ openContextMenu setOnFocusChangeListener() {
        int i10 = setMaxEms;
        int i11 = i10 & 99;
        int i12 = (~i11) & (i10 | 99);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        getSuppressed = i14 % 128;
        int i15 = i14 % 2;
        openContextMenu<da> opencontextmenu = setOnLongClickListener;
        int i16 = i10 ^ 105;
        int i17 = (i10 & 105) << 1;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        getSuppressed = i18 % 128;
        if (i18 % 2 != 0) {
            return opencontextmenu;
        }
        throw null;
    }

    public static da valueOf(String str) {
        int i10 = getSuppressed;
        int i11 = i10 & 111;
        int i12 = i11 + ((i10 ^ 111) | i11);
        setMaxEms = i12 % 128;
        int i13 = i12 % 2;
        da daVar = (da) Enum.valueOf(da.class, str);
        int i14 = setMaxEms + 47;
        getSuppressed = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 18 / 0;
        }
        return daVar;
    }

    public static da[] values() {
        int i10 = getSuppressed;
        int i11 = ((i10 | 93) << 1) - (i10 ^ 93);
        setMaxEms = i11 % 128;
        int i12 = i11 % 2;
        da[] daVarArr = (da[]) setLayoutDirection.clone();
        int i13 = getSuppressed;
        int i14 = i13 | 115;
        int i15 = ((i14 << 1) - (~(-((~(i13 & 115)) & i14)))) - 1;
        setMaxEms = i15 % 128;
        int i16 = i15 % 2;
        return daVarArr;
    }

    @JvmName(name = "setX")
    public final byte setX() {
        int i10 = setMaxEms;
        int i11 = ((-1) << 1) - (((i10 & 126) + (i10 | 126)) ^ (-1));
        int i12 = i11 % 128;
        getSuppressed = i12;
        int i13 = i11 % 2;
        byte b10 = this.setOnFocusChangeListener;
        int i14 = (i12 ^ 115) + ((i12 & 115) << 1);
        setMaxEms = i14 % 128;
        if (i14 % 2 == 0) {
            return b10;
        }
        throw null;
    }

    @JvmName(name = "setY")
    @NotNull
    public final ck setY() {
        int i10 = getSuppressed;
        int i11 = i10 & 59;
        int i12 = i10 | 59;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        setMaxEms = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        ck ckVar = this.setCompoundDrawableTintBlendMode;
        int i15 = (i14 & (-54)) | ((~i14) & 53);
        int i16 = -(-((i14 & 53) << 1));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        getSuppressed = i17 % 128;
        if (i17 % 2 != 0) {
            return ckVar;
        }
        throw null;
    }
}
