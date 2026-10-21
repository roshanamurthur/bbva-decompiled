package com.mypinpad.tsdk.isolation;

import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\u0007j\u0002\b\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/component13;", "", "", "setCompoundDrawablePadding", "B", "setCompoundDrawableTintBlendMode", "()B", "setY", "setX", "setOnFocusChangeListener", "setDividerPadding", "setNavigationOnClickListener", "setOnDragListener", "getNavBarTitleString", "setLayoutAnimation", "setOnLongClickListener", "setTextAlignment", "setIncludeFontPadding", "UiMessageCallbackKtWhenMappings", "setZ", "setAlwaysDrawnWithCacheEnabled", "setOnEditorActionListener"}, k = 1, mv = {1, 5, 1})
public final class component13 {
    public static final component13 UiMessageCallbackKtWhenMappings;
    private static final /* synthetic */ component13[] getAmountFieldTextColor;
    public static final component13 getNavBarTitleString;
    public static final component13 setAlwaysDrawnWithCacheEnabled;
    private static int setChildDivider = 0;
    public static final component13 setCompoundDrawableTintBlendMode;
    public static final component13 setDividerPadding;
    public static final component13 setIncludeFontPadding;
    public static final component13 setLayoutAnimation;
    public static final component13 setNavigationOnClickListener;
    public static final component13 setOnDragListener;
    public static final component13 setOnEditorActionListener;
    public static final component13 setOnFocusChangeListener;
    public static final component13 setOnLongClickListener;
    public static final component13 setTextAlignment;
    private static int setTextScaleX = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final component13 setY;
    public static final component13 setZ;

    /* JADX INFO: renamed from: setCompoundDrawablePadding, reason: from kotlin metadata */
    private final byte setY;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.component13$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/component13$setX;", "", "", "p0", "Lcom/mypinpad/tsdk/i/component13;", "setY", "(B)Lcom/mypinpad/tsdk/i/component13;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f54855a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54856b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0057 A[PHI: r2
          0x0057: PHI (r2v7 com.mypinpad.tsdk.i.component13) = (r2v6 com.mypinpad.tsdk.i.component13), (r2v19 com.mypinpad.tsdk.i.component13) binds: [B:10:0x0055, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:12:0x0067 A[PHI: r2
          0x0067: PHI (r2v18 com.mypinpad.tsdk.i.component13) = (r2v6 com.mypinpad.tsdk.i.component13), (r2v19 com.mypinpad.tsdk.i.component13) binds: [B:10:0x0055, B:7:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            component13 component13Var;
            boolean z10;
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i13 = f54856b;
            int i14 = i13 & 101;
            int i15 = (((i13 ^ 101) | i14) << 1) - ((i13 | 101) & (~i14));
            f54855a = i15 % 128;
            int i16 = i15 % 2;
            component13[] component13VarArrValues = component13.values();
            int length = component13VarArrValues.length;
            int i17 = f54855a;
            int i18 = (i17 | 35) << 1;
            int i19 = -(i17 ^ 35);
            int i20 = (i18 & i19) + (i19 | i18);
            f54856b = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (i22 < length) {
                int i23 = f54856b + 59;
                f54855a = i23 % 128;
                if (i23 % 2 != 0) {
                    component13Var = component13VarArrValues[i22];
                    int i24 = 65 / 0;
                    if (component13Var.setCompoundDrawableTintBlendMode() == bByteValue) {
                        int i25 = f54856b;
                        int i26 = ((i25 | 59) << 1) - (i25 ^ 59);
                        f54855a = i26 % 128;
                        int i27 = i26 % 2;
                        z10 = true;
                    } else {
                        int i28 = f54855a;
                        int i29 = (i28 & (-56)) | ((~i28) & 55);
                        int i30 = -(-((i28 & 55) << 1));
                        int i31 = (i29 & i30) + (i30 | i29);
                        f54856b = i31 % 128;
                        int i32 = i31 % 2;
                        z10 = false;
                    }
                } else {
                    component13Var = component13VarArrValues[i22];
                    if (component13Var.setCompoundDrawableTintBlendMode() == bByteValue) {
                        int i210 = f54856b;
                        int i211 = ((i210 | 59) << 1) - (i210 ^ 59);
                        f54855a = i211 % 128;
                        int i212 = i211 % 2;
                        z10 = true;
                    } else {
                        int i213 = f54855a;
                        int i214 = (i213 & (-56)) | ((~i213) & 55);
                        int i33 = -(-((i213 & 55) << 1));
                        int i34 = (i214 & i33) + (i33 | i214);
                        f54856b = i34 % 128;
                        int i35 = i34 % 2;
                        z10 = false;
                    }
                }
                if (z10) {
                    int i36 = f54856b;
                    int i37 = (i36 ^ 79) + ((i36 & 79) << 1);
                    int i38 = i37 % 128;
                    f54855a = i38;
                    int i39 = i37 % 2;
                    int i40 = (i38 & (-22)) | ((~i38) & 21);
                    int i41 = -(-((i38 & 21) << 1));
                    int i42 = (i40 & i41) + (i41 | i40);
                    f54856b = i42 % 128;
                    int i43 = i42 % 2;
                    return component13Var;
                }
                i22 = (((i22 & (-2)) | ((~i22) & 1)) - (~((i22 & 1) << 1))) - 1;
                int i44 = f54856b;
                int i45 = i44 & 95;
                int i46 = (i44 ^ 95) | i45;
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                f54855a = i47 % 128;
                int i48 = i47 % 2;
            }
            int i49 = f54856b + 117;
            f54855a = i49 % 128;
            int i50 = i49 % 2;
            return null;
        }

        @Nullable
        public static component13 setY(byte p4) {
            return (component13) setDividerPadding(new Object[]{Byte.valueOf(p4)}, 961284563, -961284563, (int) System.currentTimeMillis());
        }
    }

    static {
        component13 component13Var = new component13("PURCHASE", 0, (byte) 0);
        setOnFocusChangeListener = component13Var;
        component13 component13Var2 = new component13("CASH", 1, (byte) 1);
        setY = component13Var2;
        component13 component13Var3 = new component13("ADJUSTMENT", 2, (byte) 2);
        setCompoundDrawableTintBlendMode = component13Var3;
        component13 component13Var4 = new component13("PURCHASE_WITH_CASHBACK", 3, (byte) 9);
        setDividerPadding = component13Var4;
        component13 component13Var5 = new component13("REFUND", 4, (byte) 32);
        setNavigationOnClickListener = component13Var5;
        component13 component13Var6 = new component13("CASH_DISBURSEMENT", 5, (byte) 23);
        setOnDragListener = component13Var6;
        component13 component13Var7 = new component13("BALANCE_INQUIRY", 6, (byte) 48);
        getNavBarTitleString = component13Var7;
        component13 component13Var8 = new component13("MONEY_ADD", 7, (byte) 40);
        setLayoutAnimation = component13Var8;
        component13 component13Var9 = new component13("BALANCE_ENQUIRY", 8, (byte) 49);
        setOnLongClickListener = component13Var9;
        component13 component13Var10 = new component13("TRANSACTION_88", 9, (byte) -120);
        setTextAlignment = component13Var10;
        component13 component13Var11 = new component13("TRANSACTION_12", 10, MessageUtils.MESSAGE_18_DC2);
        setIncludeFontPadding = component13Var11;
        component13 component13Var12 = new component13("TRANSACTION_21", 11, (byte) 33);
        UiMessageCallbackKtWhenMappings = component13Var12;
        component13 component13Var13 = new component13("TRANSACTION_93", 12, (byte) -109);
        setZ = component13Var13;
        component13 component13Var14 = new component13("LOADED", 13, (byte) -2);
        setAlwaysDrawnWithCacheEnabled = component13Var14;
        component13 component13Var15 = new component13("UNLOADED", 14, (byte) -1);
        setOnEditorActionListener = component13Var15;
        int i10 = 1 - (-53);
        setChildDivider = i10 % 128;
        int i11 = i10 % 2;
        component13[] component13VarArr = {component13Var, component13Var2, component13Var3, component13Var4, component13Var5, component13Var6, component13Var7, component13Var8, component13Var9, component13Var10, component13Var11, component13Var12, component13Var13, component13Var14, component13Var15};
        int i12 = 1 & 57;
        int i13 = ((~i12) & (1 | 57)) + (i12 << 1);
        setChildDivider = i13 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i13 % 2 != 0) {
            throw null;
        }
        getAmountFieldTextColor = component13VarArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i14 = setChildDivider + 105;
        setTextScaleX = i14 % 128;
        int i15 = i14 % 2;
    }

    public component13(String str, int i10, byte b10) {
        super(str, i10);
        this.setY = b10;
    }

    public static component13 valueOf(String str) {
        int i10 = setChildDivider + 29;
        setTextScaleX = i10 % 128;
        int i11 = i10 % 2;
        component13 component13Var = (component13) Enum.valueOf(component13.class, str);
        if (i11 == 0) {
            int i12 = 68 / 0;
        }
        int i13 = setTextScaleX + 49;
        setChildDivider = i13 % 128;
        if (i13 % 2 == 0) {
            return component13Var;
        }
        throw null;
    }

    public static component13[] values() {
        System.currentTimeMillis();
        System.currentTimeMillis();
        component13[] component13VarArr = (component13[]) getAmountFieldTextColor.clone();
        int i10 = setTextScaleX;
        int i11 = i10 & 115;
        int i12 = -(-((i10 ^ 115) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setChildDivider = i13 % 128;
        if (i13 % 2 == 0) {
            return component13VarArr;
        }
        throw null;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final byte setCompoundDrawableTintBlendMode() {
        byte b10;
        int i10 = setTextScaleX;
        int i11 = (((i10 & (-64)) | ((~i10) & 63)) - (~((i10 & 63) << 1))) - 1;
        int i12 = i11 % 128;
        setChildDivider = i12;
        if (i11 % 2 != 0) {
            b10 = this.setY;
            int i13 = 21 / 0;
        } else {
            b10 = this.setY;
        }
        int i14 = i12 ^ 41;
        int i15 = ((i12 & 41) | i14) << 1;
        int i16 = -i14;
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        setTextScaleX = i17 % 128;
        if (i17 % 2 != 0) {
            return b10;
        }
        throw null;
    }
}
