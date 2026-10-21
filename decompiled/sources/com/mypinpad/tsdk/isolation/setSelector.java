package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\bj\u0002\b\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setSelector;", "", "", "toString", "()Ljava/lang/String;", "", "setX", "B", "setDividerPadding", "()B", "setY", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1})
public enum setSelector {
    NONE((byte) 0),
    AMOUNT((byte) 16),
    BALANCE((byte) 32);

    private static int getNavBarTitleString = 1;
    private static int setOnLongClickListener;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    private final byte setY;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final openContextMenu<setSelector> setLayoutAnimation = new setOnFocusChangeListener(valuesCustom(), 24);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setSelector$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setSelector$setCompoundDrawableTintBlendMode;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/setSelector;", "setLayoutAnimation", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setDividerPadding")
        @NotNull
        public static openContextMenu<setSelector> setDividerPadding() {
            return (openContextMenu) setY(new Object[0], -534741162, 534741162, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            return setSelector.setX();
        }
    }

    public static final class setOnFocusChangeListener extends openContextMenu<setSelector> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f60552f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f60553g = 1;

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i13 | i14)) | (~(i13 | i12))) * ReturnCode.ERR_CONN_IO) + (i11 * (-751)) + (i10 * (-751));
            int i16 = i11 | i13;
            if ((((~(i10 | i14)) | (~i16)) * 752) + ((~(i12 | i16)) * (-1504)) + i15 != 1) {
                Enum r10 = (Enum) objArr[1];
                int i17 = f60552f;
                int i18 = i17 ^ 71;
                int i19 = (i17 & 71) << 1;
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                f60553g = i20 % 128;
                int i21 = i20 % 2;
                byte bByteValue = ((Byte) setX(new Object[]{(setSelector) r10}, 14160528, -14160527, (int) System.currentTimeMillis())).byteValue();
                int i22 = f60553g;
                int i23 = (i22 ^ 81) + ((i22 & 81) << 1);
                f60552f = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = 43 / 0;
                }
                return Byte.valueOf(bByteValue);
            }
            setSelector setselector = (setSelector) objArr[0];
            int i25 = f60553g;
            int i26 = i25 | 95;
            int i27 = ((i26 << 1) - (~(-((~(i25 & 95)) & i26)))) - 1;
            f60552f = i27 % 128;
            if (i27 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setselector, "");
                setselector.setDividerPadding();
                throw null;
            }
            Intrinsics.checkNotNullParameter(setselector, "");
            byte dividerPadding = setselector.setDividerPadding();
            int i28 = f60553g;
            int i29 = i28 & 75;
            int i30 = (i28 | 75) & (~i29);
            int i31 = i29 << 1;
            int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
            f60552f = i32 % 128;
            if (i32 % 2 != 0) {
                int i33 = 62 / 0;
            }
            return Byte.valueOf(dividerPadding);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setX(new Object[]{this, r4}, -304842959, 304842959, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        int i10 = 1 + 97;
        int i11 = i10 % 128;
        setOnLongClickListener = i11;
        int i12 = i10 % 2;
        int i13 = (-2) - ((((i11 | 98) << 1) - (i11 ^ 98)) ^ (-1));
        getNavBarTitleString = i13 % 128;
        int i14 = i13 % 2;
        int i15 = setOnLongClickListener;
        int i16 = (i15 ^ 73) + ((i15 & 73) << 1);
        getNavBarTitleString = i16 % 128;
        int i17 = i16 % 2;
    }

    setSelector(byte b10) {
        this.setY = b10;
    }

    public static final /* synthetic */ openContextMenu setX() {
        int i10 = getNavBarTitleString;
        int i11 = i10 & 55;
        int i12 = i10 | 55;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        setOnLongClickListener = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        openContextMenu<setSelector> opencontextmenu = setLayoutAnimation;
        int i14 = i10 + 110;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        setOnLongClickListener = i15 % 128;
        int i16 = i15 % 2;
        return opencontextmenu;
    }

    public static setSelector valueOf(String str) {
        int i10 = getNavBarTitleString;
        int i11 = ((-1) << 1) - (((i10 & 106) + (i10 | 106)) ^ (-1));
        setOnLongClickListener = i11 % 128;
        if (i11 % 2 != 0) {
            Enum.valueOf(setSelector.class, str);
            throw null;
        }
        setSelector setselector = (setSelector) Enum.valueOf(setSelector.class, str);
        int i12 = getNavBarTitleString;
        int i13 = i12 ^ 15;
        int i14 = ((i12 & 15) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 & i15) + (i14 | i15);
        setOnLongClickListener = i16 % 128;
        if (i16 % 2 == 0) {
            return setselector;
        }
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static setSelector[] valuesCustom() {
        int i10 = getNavBarTitleString;
        int i11 = ((i10 & 76) + (i10 | 76)) - 1;
        setOnLongClickListener = i11 % 128;
        int i12 = i11 % 2;
        setSelector[] setselectorArrValuesCustom = values();
        if (i12 != 0) {
            throw null;
        }
        setSelector[] setselectorArr = (setSelector[]) setselectorArrValuesCustom.clone();
        int i13 = getNavBarTitleString;
        int i14 = i13 & 89;
        int i15 = (i14 - (~((i13 ^ 89) | i14))) - 1;
        setOnLongClickListener = i15 % 128;
        int i16 = i15 % 2;
        return setselectorArr;
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        int i10 = setOnLongClickListener;
        int i11 = i10 & 105;
        int i12 = i11 + ((i10 ^ 105) | i11);
        int i13 = i12 % 128;
        getNavBarTitleString = i13;
        int i14 = i12 % 2;
        byte b10 = this.setY;
        int i15 = (((i13 & (-110)) | ((~i13) & 109)) - (~(-(-((i13 & 109) << 1))))) - 1;
        setOnLongClickListener = i15 % 128;
        if (i15 % 2 == 0) {
            return b10;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setOnLongClickListener;
        int i11 = i10 & 93;
        int i12 = (i11 - (~(-(-((i10 ^ 93) | i11))))) - 1;
        getNavBarTitleString = i12 % 128;
        int i13 = i12 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i14 = setOnLongClickListener;
        int i15 = (i14 & (-52)) | ((~i14) & 51);
        int i16 = -(-((i14 & 51) << 1));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        getNavBarTitleString = i17 % 128;
        int i18 = i17 % 2;
        return "";
    }
}
