package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UiMessageCallbackKtWhenMappings' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d"}, d2 = {"Lcom/mypinpad/tsdk/i/fk;", "", "Lcom/mypinpad/tsdk/i/fg;", "setLayoutDirection", "Lcom/mypinpad/tsdk/i/fg;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/fg;", "setX", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setY", "setOnDragListener", "getNavBarTitleString", "setNavigationOnClickListener", "setOnLongClickListener", "setLayoutAnimation", "setIncludeFontPadding", "UiMessageCallbackKtWhenMappings", "setZ", "setAlwaysDrawnWithCacheEnabled", "setTextAlignment", "setCompoundDrawablePadding", "setChildDivider", "getAmountFieldTextColor", "setTextScaleX", "setOnEditorActionListener", "getSuppressed", "setMinHeight", "setMaxEms", "setImageResource"}, k = 1, mv = {1, 5, 1})
public final class fk {
    public static final fk UiMessageCallbackKtWhenMappings;
    public static final fk getAmountFieldTextColor;
    public static final fk getNavBarTitleString;
    public static final fk getSuppressed;
    private static final /* synthetic */ fk[] printStackTrace;
    public static final fk setAlwaysDrawnWithCacheEnabled;
    public static final fk setChildDivider;
    public static final fk setCompoundDrawablePadding;
    public static final fk setCompoundDrawableTintBlendMode;
    public static final fk setDividerPadding;
    public static final fk setImageResource;
    public static final fk setIncludeFontPadding;
    public static final fk setLayoutAnimation;
    public static final fk setMaxEms;
    public static final fk setMinHeight;
    public static final fk setNavigationOnClickListener;
    public static final fk setOnDragListener;
    public static final fk setOnEditorActionListener;
    public static final fk setOnFocusChangeListener;
    public static final fk setOnLongClickListener;
    public static final fk setTextAlignment;
    public static final fk setTextScaleX;
    private static int setTextSelectHandleRight = 1;
    private static int setViewTranslationCallback;
    public static final fk setX;
    public static final fk setY;
    public static final fk setZ;

    /* JADX INFO: renamed from: setLayoutDirection, reason: from kotlin metadata */
    @Nullable
    private final fg setDividerPadding;

    static {
        fk fkVar = new fk(ExpectedUserActionOnPoiTypes.NONE, 0, null);
        setX = fkVar;
        fk fkVar2 = new fk("START", 1, fg.setDividerPadding);
        setCompoundDrawableTintBlendMode = fkVar2;
        fk fkVar3 = new fk("STOP", 2, fg.setTextScaleX);
        setOnFocusChangeListener = fkVar3;
        fk fkVar4 = new fk("WAITING_FOR_GPO_RESPONSE", 3, fg.setCompoundDrawableTintBlendMode);
        setDividerPadding = fkVar4;
        fk fkVar5 = new fk("WAITING_FOR_PDOL_DATA", 4, fg.setY);
        setY = fkVar5;
        fk fkVar6 = new fk("WAITING_FOR_EMV_READ_RECORD_RESPONSE", 5, fg.setNavigationOnClickListener);
        setOnDragListener = fkVar6;
        fk fkVar7 = new fk("WAITING_FOR_EXCHANGE_RELAY_RESISTANCE_DATA_RESPONSE", 6, fg.setOnLongClickListener);
        getNavBarTitleString = fkVar7;
        fk fkVar8 = new fk("WAITING_FOR_GET_DATA_RESPONSE", 7, fg.setLayoutAnimation);
        setNavigationOnClickListener = fkVar8;
        fk fkVar9 = new fk("WAITING_FOR_EMV_MODE_FIRST_WRITE_FLAG", 8, fg.setOnDragListener);
        setOnLongClickListener = fkVar9;
        fk fkVar10 = new fk("WAITING_FOR_PUT_DATA_RESPONSE_AFTER_GEN_AC", 9, fg.setTextAlignment);
        setLayoutAnimation = fkVar10;
        fk fkVar11 = new fk("WAITING_FOR_PUT_DATA_RESPONSE_BEFORE_GEN_AC", 10, fg.setIncludeFontPadding);
        setIncludeFontPadding = fkVar11;
        fg fgVar = fg.setOnFocusChangeListener;
        fk fkVar12 = new fk("COMPLETION", 11, fgVar);
        UiMessageCallbackKtWhenMappings = fkVar12;
        fk fkVar13 = new fk("POST_TAA_PROCESSING", 12, fgVar);
        setZ = fkVar13;
        fk fkVar14 = new fk("WAITING_FOR_GEN_AC_1", 13, fg.UiMessageCallbackKtWhenMappings);
        setAlwaysDrawnWithCacheEnabled = fkVar14;
        fk fkVar15 = new fk("PROCESSING", 14, fg.setZ);
        setTextAlignment = fkVar15;
        fk fkVar16 = new fk("WAITING_FOR_GEN_AC", 15, fg.setAlwaysDrawnWithCacheEnabled);
        setCompoundDrawablePadding = fkVar16;
        fk fkVar17 = new fk("INITIATE_APPLICATION_PROCESSING", 16, fg.setX);
        setChildDivider = fkVar17;
        fk fkVar18 = new fk("WAITING_FOR_EMV_INTERNAL_AUTHENTICATE_RESPONSE", 17, fg.getNavBarTitleString);
        getAmountFieldTextColor = fkVar18;
        fk fkVar19 = new fk("START_2ND_TAP", 18, fg.setOnEditorActionListener);
        setTextScaleX = fkVar19;
        fk fkVar20 = new fk("INITIATE_APPLICATION_PROCESSING_2ND_TAP", 19, fg.getAmountFieldTextColor);
        setOnEditorActionListener = fkVar20;
        fk fkVar21 = new fk("WAITING_FOR_2ND_GPO_RESPONSE", 20, fg.setChildDivider);
        getSuppressed = fkVar21;
        fk fkVar22 = new fk("WAITING_FOR_2ND_EMV_READ_RECORD_RESPONSE", 21, fg.setCompoundDrawablePadding);
        setMinHeight = fkVar22;
        fk fkVar23 = new fk("PROCESSING_2ND_TAP", 22, fg.getSuppressed);
        setMaxEms = fkVar23;
        fk fkVar24 = new fk("WAITING_FOR_2ND_GEN_AC_RESPONSE", 23, fg.setMaxEms);
        setImageResource = fkVar24;
        int i10 = setViewTranslationCallback;
        int i11 = ((i10 ^ 28) + ((i10 & 28) << 1)) - 1;
        setTextSelectHandleRight = i11 % 128;
        int i12 = i11 % 2;
        fk[] fkVarArr = {fkVar, fkVar2, fkVar3, fkVar4, fkVar5, fkVar6, fkVar7, fkVar8, fkVar9, fkVar10, fkVar11, fkVar12, fkVar13, fkVar14, fkVar15, fkVar16, fkVar17, fkVar18, fkVar19, fkVar20, fkVar21, fkVar22, fkVar23, fkVar24};
        int i13 = i10 & 51;
        int i14 = ((i10 ^ 51) | i13) << 1;
        int i15 = -((~i13) & (i10 | 51));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        setTextSelectHandleRight = i16 % 128;
        int i17 = i16 % 2;
        printStackTrace = fkVarArr;
        int i18 = i10 + 107;
        setTextSelectHandleRight = i18 % 128;
        int i19 = i18 % 2;
    }

    public fk(String str, int i10, fg fgVar) {
        super(str, i10);
        this.setDividerPadding = fgVar;
    }

    public static fk valueOf(String str) {
        int i10 = setViewTranslationCallback;
        int i11 = i10 & 15;
        int i12 = ((i10 ^ 15) | i11) << 1;
        int i13 = -((i10 | 15) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        setTextSelectHandleRight = i14 % 128;
        if (i14 % 2 == 0) {
            Enum.valueOf(fk.class, str);
            throw null;
        }
        fk fkVar = (fk) Enum.valueOf(fk.class, str);
        int i15 = setViewTranslationCallback;
        int i16 = (i15 | 117) << 1;
        int i17 = -(((~i15) & 117) | (i15 & (-118)));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        setTextSelectHandleRight = i18 % 128;
        int i19 = i18 % 2;
        return fkVar;
    }

    public static fk[] values() {
        int i10 = setTextSelectHandleRight;
        int i11 = i10 ^ 61;
        int i12 = (i10 & 61) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setViewTranslationCallback = i13 % 128;
        int i14 = i13 % 2;
        fk[] fkVarArr = (fk[]) printStackTrace.clone();
        int i15 = setTextSelectHandleRight;
        int i16 = i15 & 93;
        int i17 = ((i15 ^ 93) | i16) << 1;
        int i18 = -((i15 | 93) & (~i16));
        int i19 = (i17 & i18) + (i18 | i17);
        setViewTranslationCallback = i19 % 128;
        int i20 = i19 % 2;
        return fkVarArr;
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final fg setDividerPadding() {
        int i10 = setTextSelectHandleRight;
        int i11 = i10 + 109;
        setViewTranslationCallback = i11 % 128;
        int i12 = i11 % 2;
        fg fgVar = this.setDividerPadding;
        int i13 = (((i10 | 70) << 1) - (i10 ^ 70)) - 1;
        setViewTranslationCallback = i13 % 128;
        int i14 = i13 % 2;
        return fgVar;
    }
}
