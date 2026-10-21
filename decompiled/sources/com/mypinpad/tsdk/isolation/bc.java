package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/bc;", "", "", "toString", "()Ljava/lang/String;", "", "setCompoundDrawableTintBlendMode", "B", "setOnFocusChangeListener", "()B", "setDividerPadding", "setY", "setX", "setOnLongClickListener", "setNavigationOnClickListener", "setOnDragListener", "getNavBarTitleString"}, k = 1, mv = {1, 5, 1})
public final class bc {
    private static bc getNavBarTitleString = null;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setIncludeFontPadding = 1;
    private static final /* synthetic */ bc[] setLayoutAnimation;
    private static bc setNavigationOnClickListener;
    private static bc setOnDragListener;

    @NotNull
    private static final openContextMenu<bc> setOnFocusChangeListener;
    private static bc setOnLongClickListener;
    private static bc setX;
    public static final bc setY;
    private static int setZ;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    private final byte setOnFocusChangeListener;

    public static final class setCompoundDrawableTintBlendMode extends openContextMenu<bc> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f54440f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f54441g = 1;

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            byte bByteValue;
            int i13 = (i11 * 246) + (i10 * (-244));
            int i14 = ~i11;
            int i15 = (((~((~i12) | i14)) | (~(i14 | i10))) * (-245)) + i13;
            int i16 = ~(i14 | i12);
            if (((i10 | i16) * 245) + (i16 * (-245)) + i15 != 1) {
                Enum r3 = (Enum) objArr[1];
                int i17 = f54441g;
                int i18 = i17 & 35;
                int i19 = (i17 ^ 35) | i18;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f54440f = i20 % 128;
                bc bcVar = (bc) r3;
                Object[] objArr2 = new Object[1];
                if (i20 % 2 != 0) {
                    objArr2[0] = bcVar;
                    bByteValue = ((Byte) setX(objArr2, -2030035750, 2030035751, (int) System.currentTimeMillis())).byteValue();
                    int i21 = 12 / 0;
                } else {
                    objArr2[0] = bcVar;
                    bByteValue = ((Byte) setX(objArr2, -2030035750, 2030035751, (int) System.currentTimeMillis())).byteValue();
                }
                return Byte.valueOf(bByteValue);
            }
            bc bcVar2 = (bc) objArr[0];
            int i22 = f54441g;
            int i23 = i22 | 25;
            int i24 = (i23 << 1) - ((~(i22 & 25)) & i23);
            f54440f = i24 % 128;
            int i25 = i24 % 2;
            Intrinsics.checkNotNullParameter(bcVar2, "");
            byte onFocusChangeListener = bcVar2.setOnFocusChangeListener();
            int i26 = f54440f;
            int i27 = i26 & 17;
            int i28 = ((i26 ^ 17) | i27) << 1;
            int i29 = -((i26 | 17) & (~i27));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f54441g = i30 % 128;
            int i31 = i30 % 2;
            return Byte.valueOf(onFocusChangeListener);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setX(new Object[]{this, r4}, -1718297642, 1718297642, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.bc$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/bc$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/bc;", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setX", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f54442a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54443b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public static openContextMenu<bc> setCompoundDrawableTintBlendMode() {
            return (openContextMenu) setY(new Object[0], 1856913402, -1856913402, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f54442a;
            int i14 = (i13 & 107) + (i13 | 107);
            f54443b = i14 % 128;
            int i15 = i14 % 2;
            openContextMenu compoundDrawableTintBlendMode = bc.setCompoundDrawableTintBlendMode();
            int i16 = f54443b;
            int i17 = (((i16 | 33) << 1) - (~(-(((~i16) & 33) | (i16 & (-34)))))) - 1;
            f54442a = i17 % 128;
            int i18 = i17 % 2;
            return compoundDrawableTintBlendMode;
        }
    }

    static {
        bc[] bcVarArr;
        bc bcVar = new bc("STANDARD_CARD", 0, (byte) 0);
        setY = bcVar;
        bc bcVar2 = new bc("MINI_CARD", 1, (byte) 1);
        setX = bcVar2;
        bc bcVar3 = new bc("NON_CARD_FORM_FACTOR", 2, (byte) 2);
        setOnLongClickListener = bcVar3;
        bc bcVar4 = new bc("CONSUMER_MOBILE_DEVICE", 3, (byte) 3);
        setNavigationOnClickListener = bcVar4;
        bc bcVar5 = new bc("WRIST_WORN_DEVICE", 4, (byte) 4);
        setOnDragListener = bcVar5;
        bc bcVar6 = new bc("UNKNOWN", 5, (byte) 127);
        getNavBarTitleString = bcVar6;
        int i10 = 0 - (-31);
        int i11 = i10 % 128;
        setIncludeFontPadding = i11;
        if (i10 % 2 == 0) {
            bcVarArr = new bc[17];
            bcVarArr[1] = bcVar;
            bcVarArr[0] = bcVar2;
            bcVarArr[5] = bcVar3;
            bcVarArr[2] = bcVar4;
            bcVarArr[3] = bcVar5;
            bcVarArr[4] = bcVar6;
        } else {
            bcVarArr = new bc[]{bcVar, bcVar2, bcVar3, bcVar4, bcVar5, bcVar6};
        }
        int i12 = i11 & 119;
        int i13 = ((i11 ^ 119) | i12) << 1;
        int i14 = -((~i12) & (i11 | 119));
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        setZ = i15 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i15 % 2 != 0) {
            throw null;
        }
        setLayoutAnimation = bcVarArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        setOnFocusChangeListener = new setCompoundDrawableTintBlendMode(values(), getNavBarTitleString);
        int i16 = setIncludeFontPadding;
        int i17 = i16 & 109;
        int i18 = ((i16 ^ 109) | i17) << 1;
        int i19 = -((i16 | 109) & (~i17));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        setZ = i20 % 128;
        int i21 = i20 % 2;
    }

    public bc(String str, int i10, byte b10) {
        super(str, i10);
        this.setOnFocusChangeListener = b10;
    }

    public static final /* synthetic */ openContextMenu setCompoundDrawableTintBlendMode() {
        int i10 = setIncludeFontPadding;
        int i11 = i10 | 9;
        int i12 = ((i11 << 1) - (~(-(i11 & (~(i10 & 9)))))) - 1;
        setZ = i12 % 128;
        int i13 = i12 % 2;
        openContextMenu<bc> opencontextmenu = setOnFocusChangeListener;
        int i14 = (i10 & 17) + (i10 | 17);
        setZ = i14 % 128;
        if (i14 % 2 == 0) {
            return opencontextmenu;
        }
        throw null;
    }

    public static bc valueOf(String str) {
        int i10 = setIncludeFontPadding;
        int i11 = i10 & 9;
        int i12 = -(-((i10 ^ 9) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setZ = i13 % 128;
        int i14 = i13 % 2;
        bc bcVar = (bc) Enum.valueOf(bc.class, str);
        if (i14 != 0) {
            int i15 = 70 / 0;
        }
        return bcVar;
    }

    public static bc[] values() {
        bc[] bcVarArr;
        int i10 = setZ;
        int i11 = i10 & 85;
        int i12 = (i11 - (~(-(-((i10 ^ 85) | i11))))) - 1;
        setIncludeFontPadding = i12 % 128;
        int i13 = i12 % 2;
        bc[] bcVarArr2 = setLayoutAnimation;
        if (i13 == 0) {
            bcVarArr = (bc[]) bcVarArr2.clone();
            int i14 = 57 / 0;
        } else {
            bcVarArr = (bc[]) bcVarArr2.clone();
        }
        int i15 = setZ;
        int i16 = i15 | 13;
        int i17 = i16 << 1;
        int i18 = -((~(i15 & 13)) & i16);
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        setIncludeFontPadding = i19 % 128;
        int i20 = i19 % 2;
        return bcVarArr;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final byte setOnFocusChangeListener() {
        int i10 = setIncludeFontPadding;
        int i11 = i10 | 11;
        int i12 = (i11 << 1) - ((~(i10 & 11)) & i11);
        int i13 = i12 % 128;
        setZ = i13;
        int i14 = i12 % 2;
        byte b10 = this.setOnFocusChangeListener;
        int i15 = ((-1) << 1) - ((-1) ^ ((i13 ^ 94) + ((i13 & 94) << 1)));
        setIncludeFontPadding = i15 % 128;
        if (i15 % 2 != 0) {
            return b10;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setZ;
        int i11 = i10 ^ 103;
        int i12 = (i10 & 103) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setIncludeFontPadding = i13 % 128;
        int i14 = i13 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i15 = setIncludeFontPadding;
        int i16 = (((i15 | 10) << 1) - (i15 ^ 10)) - 1;
        setZ = i16 % 128;
        if (i16 % 2 == 0) {
            return "";
        }
        throw null;
    }
}
