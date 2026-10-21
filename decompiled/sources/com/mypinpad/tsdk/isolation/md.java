package com.mypinpad.tsdk.isolation;

import bk.w;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/md;", "", "", "setTextScaleX", "B", "setDividerPadding", "()B", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode", "setX", "setY", "setNavigationOnClickListener", "setOnLongClickListener", "setOnDragListener", "getNavBarTitleString", "setLayoutAnimation", "setIncludeFontPadding", "setTextAlignment", "setAlwaysDrawnWithCacheEnabled", "setZ", "UiMessageCallbackKtWhenMappings", "setOnEditorActionListener"}, k = 1, mv = {1, 5, 1})
public final class md {
    public static final md UiMessageCallbackKtWhenMappings;

    @NotNull
    private static final openContextMenu<md> getAmountFieldTextColor;
    public static final md getNavBarTitleString;
    private static int getSuppressed = 1;
    public static final md setAlwaysDrawnWithCacheEnabled;

    @NotNull
    private static final String setChildDivider;

    @NotNull
    private static final Set<md> setCompoundDrawablePadding;
    public static final md setCompoundDrawableTintBlendMode;
    public static final md setDividerPadding;
    private static final /* synthetic */ md[] setImageResource;
    public static final md setIncludeFontPadding;
    public static final md setLayoutAnimation;
    private static int setLayoutDirection;
    public static final md setNavigationOnClickListener;
    public static final md setOnDragListener;
    public static final md setOnEditorActionListener;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final md setOnLongClickListener;
    public static final md setTextAlignment;
    public static final md setX;
    public static final md setY;
    public static final md setZ;

    /* JADX INFO: renamed from: setTextScaleX, reason: from kotlin metadata */
    private final byte setDividerPadding;

    public static final class setDividerPadding extends openContextMenu<md> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f57078f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f57079g = 1;

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            byte bByteValue;
            int i13 = (i11 * (-500)) + (i10 * (-500));
            int i14 = ~i11;
            int i15 = ~(i14 | i10);
            int i16 = ~i10;
            if (((~(i16 | (~i12) | i11)) * 501) + ((~(i14 | i16)) * 1002) + ((i15 | (~(i16 | i11 | i12))) * 501) + i13 == 1) {
                md mdVar = (md) objArr[0];
                int i17 = f57078f + 41;
                f57079g = i17 % 128;
                int i18 = i17 % 2;
                Intrinsics.checkNotNullParameter(mdVar, "");
                byte dividerPadding = mdVar.setDividerPadding();
                int i19 = f57079g;
                int i20 = (i19 & (-108)) | ((~i19) & 107);
                int i21 = -(-((i19 & 107) << 1));
                int i22 = (i20 & i21) + (i21 | i20);
                f57078f = i22 % 128;
                int i23 = i22 % 2;
                return Byte.valueOf(dividerPadding);
            }
            Enum r4 = (Enum) objArr[1];
            int i24 = f57079g;
            int i25 = (i24 & 97) + (i24 | 97);
            f57078f = i25 % 128;
            md mdVar2 = (md) r4;
            if (i25 % 2 != 0) {
                bByteValue = ((Byte) setX(new Object[]{mdVar2}, -85599083, 85599084, (int) System.currentTimeMillis())).byteValue();
                int i26 = 5 / 0;
            } else {
                bByteValue = ((Byte) setX(new Object[]{mdVar2}, -85599083, 85599084, (int) System.currentTimeMillis())).byteValue();
            }
            int i27 = f57079g;
            int i28 = (((i27 | 84) << 1) - (i27 ^ 84)) - 1;
            f57078f = i28 % 128;
            if (i28 % 2 == 0) {
                return Byte.valueOf(bByteValue);
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setX(new Object[]{this, r4}, -1450522952, 1450522952, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.md$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/mypinpad/tsdk/i/md$setOnFocusChangeListener;", "", "", "p0", "Lcom/mypinpad/tsdk/i/md;", "setOnFocusChangeListener", "(B)Lcom/mypinpad/tsdk/i/md;", "", "", "setX", "(Ljava/lang/String;)Z", "setChildDivider", "Ljava/lang/String;", "", "setCompoundDrawablePadding", "Ljava/util/Set;", "()Ljava/util/Set;", "setDividerPadding", "Lcom/mypinpad/tsdk/i/openContextMenu;", "getAmountFieldTextColor", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setY", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f57080a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f57081b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i13 | i12);
            int i15 = ~i12;
            int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
            int i17 = ~i11;
            int i18 = i10 | i15;
            int i19 = (((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16;
            if (i19 == 1) {
                int i20 = f57081b;
                int i21 = (i20 & 107) + (i20 | 107);
                f57080a = i21 % 128;
                int i22 = i21 % 2;
                Set onFocusChangeListener = md.setOnFocusChangeListener();
                int i23 = f57080a;
                int i24 = ((i23 | 17) << 1) - (((~i23) & 17) | (i23 & (-18)));
                f57081b = i24 % 128;
                if (i24 % 2 != 0) {
                    return onFocusChangeListener;
                }
                int i25 = 46 / 0;
                return onFocusChangeListener;
            }
            if (i19 == 2) {
                int i26 = f57080a;
                int i27 = i26 & 121;
                int i28 = (i26 | 121) & (~i27);
                int i29 = i27 << 1;
                int i30 = (i28 & i29) + (i28 | i29);
                f57081b = i30 % 128;
                int i31 = i30 % 2;
                openContextMenu y7 = md.setY();
                if (i31 == 0) {
                    int i32 = 61 / 0;
                }
                int i33 = f57081b;
                int i34 = i33 ^ 37;
                int i35 = (i33 & 37) << 1;
                int i36 = (i34 & i35) + (i35 | i34);
                f57080a = i36 % 128;
                int i37 = i36 % 2;
                return y7;
            }
            if (i19 == 3) {
                String str = (String) objArr[0];
                int i38 = f57080a;
                int i39 = (((i38 & (-62)) | ((~i38) & 61)) - (~(-(-((i38 & 61) << 1))))) - 1;
                f57081b = i39 % 128;
                if (i39 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return Boolean.valueOf(Intrinsics.areEqual(str, md.setX()));
                }
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.areEqual(str, md.setX());
                throw null;
            }
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i40 = f57080a;
            int i41 = i40 & 7;
            int i42 = (((i40 ^ 7) | i41) << 1) - ((i40 | 7) & (~i41));
            f57081b = i42 % 128;
            int i43 = i42 % 2;
            openContextMenu opencontextmenu = (openContextMenu) setCompoundDrawableTintBlendMode(new Object[0], 1227270162, -1227270160, (int) System.currentTimeMillis());
            md mdVar = (md) ((Enum) openContextMenu.setOnFocusChangeListener(new Object[]{opencontextmenu, Byte.valueOf(bByteValue)}, 693193897, -693193897, System.identityHashCode(opencontextmenu)));
            int i44 = f57081b + 109;
            f57080a = i44 % 128;
            int i45 = i44 % 2;
            return mdVar;
        }

        @NotNull
        public static md setOnFocusChangeListener(byte p4) {
            return (md) setCompoundDrawableTintBlendMode(new Object[]{Byte.valueOf(p4)}, -998269109, 998269109, (int) System.currentTimeMillis());
        }

        public static boolean setX(@NotNull String p4) {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{p4}, -669820145, 669820148, (int) System.currentTimeMillis())).booleanValue();
        }

        @JvmName(name = "setY")
        @NotNull
        public static openContextMenu<md> setY() {
            return (openContextMenu) setCompoundDrawableTintBlendMode(new Object[0], 1227270162, -1227270160, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static Set<md> setOnFocusChangeListener() {
            return (Set) setCompoundDrawableTintBlendMode(new Object[0], -910328869, 910328870, (int) System.currentTimeMillis());
        }
    }

    static {
        md mdVar = new md("PURCHASE", 0, (byte) 0);
        setCompoundDrawableTintBlendMode = mdVar;
        md mdVar2 = new md("CASH", 1, (byte) 1);
        setDividerPadding = mdVar2;
        md mdVar3 = new md("ADJUSTMENT", 2, (byte) 2);
        setX = mdVar3;
        md mdVar4 = new md("PURCHASE_WITH_CASHBACK", 3, (byte) 9);
        setY = mdVar4;
        md mdVar5 = new md("REFUND", 4, (byte) 32);
        setNavigationOnClickListener = mdVar5;
        md mdVar6 = new md("CASH_DISBURSEMENT", 5, (byte) 23);
        setOnLongClickListener = mdVar6;
        md mdVar7 = new md("BALANCE_INQUIRY", 6, (byte) 48);
        setOnDragListener = mdVar7;
        md mdVar8 = new md("MONEY_ADD", 7, (byte) 40);
        getNavBarTitleString = mdVar8;
        md mdVar9 = new md("BALANCE_ENQUIRY", 8, (byte) 49);
        setLayoutAnimation = mdVar9;
        md mdVar10 = new md("TRANSACTION_88", 9, (byte) -120);
        setIncludeFontPadding = mdVar10;
        md mdVar11 = new md("TRANSACTION_12", 10, MessageUtils.MESSAGE_18_DC2);
        setTextAlignment = mdVar11;
        md mdVar12 = new md("TRANSACTION_21", 11, (byte) 33);
        setAlwaysDrawnWithCacheEnabled = mdVar12;
        md mdVar13 = new md("TRANSACTION_93", 12, (byte) -109);
        setZ = mdVar13;
        md mdVar14 = new md("LOADED", 13, (byte) -2);
        UiMessageCallbackKtWhenMappings = mdVar14;
        md mdVar15 = new md("UNLOADED", 14, (byte) -1);
        setOnEditorActionListener = mdVar15;
        int i10 = 57 % 128;
        getSuppressed = i10;
        int i11 = 57 % 2;
        md[] mdVarArr = {mdVar, mdVar2, mdVar3, mdVar4, mdVar5, mdVar6, mdVar7, mdVar8, mdVar9, mdVar10, mdVar11, mdVar12, mdVar13, mdVar14, mdVar15};
        int i12 = i10 + 3;
        setLayoutDirection = i12 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i12 % 2 != 0) {
            throw null;
        }
        setImageResource = mdVarArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        setCompoundDrawablePadding = w.setOf((Object[]) new md[]{mdVar2, mdVar6, mdVar, mdVar4});
        setChildDivider = (String) getPinPadLandscape.setY(new Object[]{Byte.valueOf(mdVar4.setDividerPadding)}, 1862949367, -1862949363, (int) System.currentTimeMillis());
        getAmountFieldTextColor = new setDividerPadding(values(), AuthApiStatusCodes.AUTH_TOKEN_ERROR);
        int i13 = getSuppressed;
        int i14 = i13 & 121;
        int i15 = -(-((i13 ^ 121) | i14));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        setLayoutDirection = i16 % 128;
        int i17 = i16 % 2;
    }

    public md(String str, int i10, byte b10) {
        super(str, i10);
        this.setDividerPadding = b10;
    }

    public static final /* synthetic */ Set setOnFocusChangeListener() {
        int i10 = setLayoutDirection;
        int i11 = ((i10 & 32) + (i10 | 32)) - 1;
        getSuppressed = i11 % 128;
        int i12 = i11 % 2;
        Set<md> set = setCompoundDrawablePadding;
        if (i12 == 0) {
            int i13 = 59 / 0;
        }
        return set;
    }

    public static final /* synthetic */ String setX() {
        int i10 = setLayoutDirection;
        int i11 = (i10 & 77) + (i10 | 77);
        getSuppressed = i11 % 128;
        if (i11 % 2 != 0) {
            return setChildDivider;
        }
        throw null;
    }

    public static final /* synthetic */ openContextMenu setY() {
        int i10 = setLayoutDirection;
        int i11 = (i10 ^ 35) + ((i10 & 35) << 1);
        int i12 = i11 % 128;
        getSuppressed = i12;
        int i13 = i11 % 2;
        openContextMenu<md> opencontextmenu = getAmountFieldTextColor;
        int i14 = (((i12 | 26) << 1) - (i12 ^ 26)) - 1;
        setLayoutDirection = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 73 / 0;
        }
        return opencontextmenu;
    }

    public static md valueOf(String str) {
        int i10 = getSuppressed;
        int i11 = i10 & 93;
        int i12 = -(-((i10 ^ 93) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setLayoutDirection = i13 % 128;
        int i14 = i13 % 2;
        md mdVar = (md) Enum.valueOf(md.class, str);
        int i15 = setLayoutDirection;
        int i16 = i15 & 67;
        int i17 = -(-((i15 ^ 67) | i16));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        getSuppressed = i18 % 128;
        int i19 = i18 % 2;
        return mdVar;
    }

    public static md[] values() {
        int i10 = getSuppressed + 25;
        setLayoutDirection = i10 % 128;
        int i11 = i10 % 2;
        md[] mdVarArr = (md[]) setImageResource.clone();
        int i12 = getSuppressed;
        int i13 = i12 & 27;
        int i14 = (i12 | 27) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        setLayoutDirection = i16 % 128;
        int i17 = i16 % 2;
        return mdVarArr;
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        int i10 = getSuppressed;
        int i11 = i10 & 17;
        int i12 = (i11 - (~((i10 ^ 17) | i11))) - 1;
        int i13 = i12 % 128;
        setLayoutDirection = i13;
        int i14 = i12 % 2;
        byte b10 = this.setDividerPadding;
        int i15 = i13 + 101;
        getSuppressed = i15 % 128;
        int i16 = i15 % 2;
        return b10;
    }
}
