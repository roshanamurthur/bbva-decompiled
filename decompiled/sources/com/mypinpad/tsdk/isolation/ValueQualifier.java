package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\bj\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/ValueQualifier;", "", "", "toString", "()Ljava/lang/String;", "", "setLayoutAnimation", "B", "setCompoundDrawableTintBlendMode", "()B", "setX", "setY", "setOnLongClickListener", "setOnFocusChangeListener", "getNavBarTitleString", "setDividerPadding", "setOnDragListener"}, k = 1, mv = {1, 5, 1})
public final class ValueQualifier {
    private static int UiMessageCallbackKtWhenMappings = 1;
    private static ValueQualifier getNavBarTitleString;
    private static final /* synthetic */ ValueQualifier[] setAlwaysDrawnWithCacheEnabled;
    public static final ValueQualifier setCompoundDrawableTintBlendMode;
    public static final ValueQualifier setDividerPadding;

    @NotNull
    private static final openContextMenu<ValueQualifier> setNavigationOnClickListener;
    public static final ValueQualifier setOnDragListener;
    public static final ValueQualifier setOnFocusChangeListener;
    private static ValueQualifier setOnLongClickListener;
    private static int setTextAlignment;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ValueQualifier setY;

    /* JADX INFO: renamed from: setLayoutAnimation, reason: from kotlin metadata */
    private final byte setX;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.ValueQualifier$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/ValueQualifier$setX;", "", "", "p0", "Lcom/mypinpad/tsdk/i/ValueQualifier;", "setX", "(B)Lcom/mypinpad/tsdk/i/ValueQualifier;", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setNavigationOnClickListener", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setY", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f51955a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f51956b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            Object dividerPadding;
            int i13 = (i11 * (-978)) + (i10 * 980);
            int i14 = ~i11;
            int i15 = ~i12;
            if ((((~(i10 | i15)) | (~(i14 | i12))) * 979) + ((i10 | i12) * (-979)) + ((~(i14 | i15)) * 979) + i13 != 1) {
                byte bByteValue = ((Byte) objArr[0]).byteValue();
                int i16 = f51956b;
                int i17 = ((i16 ^ 1) | (i16 & 1)) << 1;
                int i18 = -(((~i16) & 1) | (i16 & (-2)));
                int i19 = (i17 & i18) + (i18 | i17);
                f51955a = i19 % 128;
                int i20 = i19 % 2;
                openContextMenu opencontextmenu = (openContextMenu) setDividerPadding(new Object[0], -1834904919, 1834904920, (int) System.currentTimeMillis());
                dividerPadding = (ValueQualifier) ((Enum) openContextMenu.setOnFocusChangeListener(new Object[]{opencontextmenu, Byte.valueOf(bByteValue)}, 693193897, -693193897, System.identityHashCode(opencontextmenu)));
                int i21 = f51955a;
                int i22 = ((i21 | 17) << 1) - (i21 ^ 17);
                f51956b = i22 % 128;
                if (i22 % 2 == 0) {
                    throw null;
                }
            } else {
                int i23 = f51956b;
                int i24 = ((i23 & (-4)) | ((~i23) & 3)) + ((i23 & 3) << 1);
                f51955a = i24 % 128;
                if (i24 % 2 != 0) {
                    ValueQualifier.setDividerPadding();
                    throw null;
                }
                dividerPadding = ValueQualifier.setDividerPadding();
                int i25 = f51956b;
                int i26 = ((i25 | 65) << 1) - (i25 ^ 65);
                f51955a = i26 % 128;
                if (i26 % 2 != 0) {
                    throw null;
                }
            }
            return dividerPadding;
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static openContextMenu<ValueQualifier> setOnFocusChangeListener() {
            return (openContextMenu) setDividerPadding(new Object[0], -1834904919, 1834904920, (int) System.currentTimeMillis());
        }

        @NotNull
        public static ValueQualifier setX(byte p4) {
            return (ValueQualifier) setDividerPadding(new Object[]{Byte.valueOf(p4)}, 365678160, -365678160, (int) System.currentTimeMillis());
        }
    }

    public static final class setY extends openContextMenu<ValueQualifier> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f51957f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f51958g = 1;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            byte bByteValue;
            int i13 = ~i11;
            if ((((~((~i10) | i12)) | i13) * 502) + ((~((~i12) | i13 | i10)) * (-502)) + (((~(i11 | i10)) | (~(i13 | i12))) * (-502)) + (i11 * 503) + (i10 * (-501)) == 1) {
                ValueQualifier valueQualifier = (ValueQualifier) objArr[0];
                int i14 = f51958g;
                int i15 = (i14 ^ 15) + ((i14 & 15) << 1);
                f51957f = i15 % 128;
                int i16 = i15 % 2;
                Intrinsics.checkNotNullParameter(valueQualifier, "");
                byte compoundDrawableTintBlendMode = valueQualifier.setCompoundDrawableTintBlendMode();
                int i17 = f51958g;
                int i18 = (i17 & 49) + (i17 | 49);
                f51957f = i18 % 128;
                if (i18 % 2 == 0) {
                    return Byte.valueOf(compoundDrawableTintBlendMode);
                }
                throw null;
            }
            Enum r4 = (Enum) objArr[1];
            int i19 = f51958g;
            int i20 = i19 & 31;
            int i21 = (i19 | 31) & (~i20);
            int i22 = -(-(i20 << 1));
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            f51957f = i23 % 128;
            ValueQualifier valueQualifier2 = (ValueQualifier) r4;
            Object[] objArr2 = new Object[1];
            if (i23 % 2 != 0) {
                objArr2[0] = valueQualifier2;
                bByteValue = ((Byte) setDividerPadding(objArr2, -368077709, 368077710, (int) System.currentTimeMillis())).byteValue();
                int i24 = 63 / 0;
            } else {
                objArr2[0] = valueQualifier2;
                bByteValue = ((Byte) setDividerPadding(objArr2, -368077709, 368077710, (int) System.currentTimeMillis())).byteValue();
            }
            int i25 = f51957f + 103;
            f51958g = i25 % 128;
            if (i25 % 2 != 0) {
                return Byte.valueOf(bByteValue);
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setDividerPadding(new Object[]{this, r4}, 1008684506, -1008684506, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        ValueQualifier valueQualifier = new ValueQualifier("NOT_READY", 0, (byte) 0);
        setY = valueQualifier;
        ValueQualifier valueQualifier2 = new ValueQualifier("IDLE", 1, (byte) 1);
        setOnLongClickListener = valueQualifier2;
        ValueQualifier valueQualifier3 = new ValueQualifier("READY_TO_READ", 2, (byte) 2);
        setOnFocusChangeListener = valueQualifier3;
        ValueQualifier valueQualifier4 = new ValueQualifier("PROCESSING", 3, (byte) 3);
        getNavBarTitleString = valueQualifier4;
        ValueQualifier valueQualifier5 = new ValueQualifier("CARD_READ_SUCCESSFULLY", 4, (byte) 4);
        setCompoundDrawableTintBlendMode = valueQualifier5;
        ValueQualifier valueQualifier6 = new ValueQualifier("PROCESSING_ERROR", 5, (byte) 5);
        setDividerPadding = valueQualifier6;
        ValueQualifier valueQualifier7 = new ValueQualifier("N_A", 6, (byte) -1);
        setOnDragListener = valueQualifier7;
        int i10 = (((1 | 87) << 1) - (~(-((1 & (-88)) | ((~1) & 87))))) - 1;
        setTextAlignment = i10 % 128;
        int i11 = i10 % 2;
        ValueQualifier[] valueQualifierArr = {valueQualifier, valueQualifier2, valueQualifier3, valueQualifier4, valueQualifier5, valueQualifier6, valueQualifier7};
        int i12 = ((1 | 126) << 1) - (1 ^ 126);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        setTextAlignment = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 12 / 0;
        }
        setAlwaysDrawnWithCacheEnabled = valueQualifierArr;
        INSTANCE = new Companion(null);
        setNavigationOnClickListener = new setY(values(), 23);
        int i15 = UiMessageCallbackKtWhenMappings + 56;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        setTextAlignment = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 19 / 0;
        }
    }

    public ValueQualifier(String str, int i10, byte b10) {
        super(str, i10);
        this.setX = b10;
    }

    public static final /* synthetic */ openContextMenu setDividerPadding() {
        int i10 = setTextAlignment;
        int i11 = (((i10 ^ 93) | (i10 & 93)) << 1) - ((i10 & (-94)) | ((~i10) & 93));
        UiMessageCallbackKtWhenMappings = i11 % 128;
        int i12 = i11 % 2;
        openContextMenu<ValueQualifier> opencontextmenu = setNavigationOnClickListener;
        int i13 = i10 + 97;
        UiMessageCallbackKtWhenMappings = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 84 / 0;
        }
        return opencontextmenu;
    }

    public static ValueQualifier valueOf(String str) {
        int i10 = setTextAlignment;
        int i11 = i10 & 55;
        int i12 = (i10 ^ 55) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        UiMessageCallbackKtWhenMappings = i13 % 128;
        if (i13 % 2 == 0) {
            Enum.valueOf(ValueQualifier.class, str);
            throw null;
        }
        ValueQualifier valueQualifier = (ValueQualifier) Enum.valueOf(ValueQualifier.class, str);
        int i14 = setTextAlignment + 43;
        UiMessageCallbackKtWhenMappings = i14 % 128;
        if (i14 % 2 != 0) {
            return valueQualifier;
        }
        throw null;
    }

    public static ValueQualifier[] values() {
        int i10 = setTextAlignment;
        int i11 = i10 & 97;
        int i12 = i11 + ((i10 ^ 97) | i11);
        UiMessageCallbackKtWhenMappings = i12 % 128;
        int i13 = i12 % 2;
        ValueQualifier[] valueQualifierArr = setAlwaysDrawnWithCacheEnabled;
        if (i13 == 0) {
            throw null;
        }
        ValueQualifier[] valueQualifierArr2 = (ValueQualifier[]) valueQualifierArr.clone();
        int i14 = setTextAlignment + 103;
        UiMessageCallbackKtWhenMappings = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 6 / 0;
        }
        return valueQualifierArr2;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final byte setCompoundDrawableTintBlendMode() {
        int i10 = UiMessageCallbackKtWhenMappings;
        int i11 = (i10 & 43) + (i10 | 43);
        int i12 = i11 % 128;
        setTextAlignment = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        byte b10 = this.setX;
        int i13 = (((i12 | 120) << 1) - (i12 ^ 120)) - 1;
        UiMessageCallbackKtWhenMappings = i13 % 128;
        int i14 = i13 % 2;
        return b10;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = UiMessageCallbackKtWhenMappings;
        int i11 = ((i10 & 47) - (~(-(-(i10 | 47))))) - 1;
        setTextAlignment = i11 % 128;
        int i12 = i11 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i13 = UiMessageCallbackKtWhenMappings;
        int i14 = ((i13 ^ 86) + ((i13 & 86) << 1)) - 1;
        setTextAlignment = i14 % 128;
        if (i14 % 2 == 0) {
            return "";
        }
        throw null;
    }
}
