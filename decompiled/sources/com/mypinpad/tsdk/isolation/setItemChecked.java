package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\nj\u0002\b\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/setItemChecked;", "", "", "toString", "()Ljava/lang/String;", "", "setNavigationOnClickListener", "B", "setX", "()B", "setCompoundDrawableTintBlendMode", "setY", "setDividerPadding", "setOnFocusChangeListener", "setOnDragListener", "setLayoutAnimation"}, k = 1, mv = {1, 5, 1})
public final class setItemChecked {
    private static final /* synthetic */ setItemChecked[] getNavBarTitleString;
    public static final setItemChecked setCompoundDrawableTintBlendMode;
    public static final setItemChecked setDividerPadding;
    private static setItemChecked setLayoutAnimation = null;
    private static setItemChecked setOnDragListener = null;
    public static final setItemChecked setOnFocusChangeListener;

    @NotNull
    private static final openContextMenu<setItemChecked> setOnLongClickListener;
    private static int setTextAlignment = 0;
    public static final setItemChecked setX;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setZ = 1;

    /* JADX INFO: renamed from: setNavigationOnClickListener, reason: from kotlin metadata */
    private final byte setCompoundDrawableTintBlendMode;

    public static final class setDividerPadding extends openContextMenu<setItemChecked> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f59931f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f59932g = 1;

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i13 | i14)) | (~(i13 | i12))) * ReturnCode.ERR_CONN_IO) + (i11 * (-751)) + (i10 * (-751));
            int i16 = i11 | i13;
            if ((((~(i10 | i14)) | (~i16)) * 752) + ((~(i12 | i16)) * (-1504)) + i15 != 1) {
                Enum r10 = (Enum) objArr[1];
                int i17 = f59932g;
                int i18 = (i17 ^ 117) + ((i17 & 117) << 1);
                f59931f = i18 % 128;
                int i19 = i18 % 2;
                byte bByteValue = ((Byte) setY(new Object[]{(setItemChecked) r10}, -1987615917, 1987615918, (int) System.currentTimeMillis())).byteValue();
                int i20 = f59932g;
                int i21 = i20 & 67;
                int i22 = (((i20 | 67) & (~i21)) - (~(-(-(i21 << 1))))) - 1;
                f59931f = i22 % 128;
                int i23 = i22 % 2;
                return Byte.valueOf(bByteValue);
            }
            setItemChecked setitemchecked = (setItemChecked) objArr[0];
            int i24 = f59931f;
            int i25 = (((i24 | 62) << 1) - (i24 ^ 62)) - 1;
            f59932g = i25 % 128;
            int i26 = i25 % 2;
            Intrinsics.checkNotNullParameter(setitemchecked, "");
            byte x4 = setitemchecked.setX();
            int i27 = f59932g;
            int i28 = ((i27 | 91) << 1) - (i27 ^ 91);
            f59931f = i28 % 128;
            if (i28 % 2 == 0) {
                return Byte.valueOf(x4);
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setY(new Object[]{this, r4}, 1035617005, -1035617005, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setItemChecked$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setItemChecked$setY;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/setItemChecked;", "setOnLongClickListener", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setX", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setX")
        @NotNull
        public static openContextMenu<setItemChecked> setX() {
            return (openContextMenu) setY(new Object[0], -1838665501, 1838665501, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            return setItemChecked.setY();
        }
    }

    static {
        setItemChecked[] setitemcheckedArr;
        setItemChecked setitemchecked = new setItemChecked("NOT_SET", 0, (byte) -1);
        setDividerPadding = setitemchecked;
        setItemChecked setitemchecked2 = new setItemChecked("OK", 1, (byte) 0);
        setCompoundDrawableTintBlendMode = setitemchecked2;
        setItemChecked setitemchecked3 = new setItemChecked("TIME_OUT_ERROR", 2, (byte) 1);
        setX = setitemchecked3;
        setItemChecked setitemchecked4 = new setItemChecked("TRANSMISSION_ERROR", 3, (byte) 2);
        setOnFocusChangeListener = setitemchecked4;
        setItemChecked setitemchecked5 = new setItemChecked("PROTOCOL_ERROR", 4, (byte) 3);
        setOnDragListener = setitemchecked5;
        setItemChecked setitemchecked6 = new setItemChecked("RETURN_CODE", 5, (byte) 4);
        setLayoutAnimation = setitemchecked6;
        int i10 = 0 - (-57);
        int i11 = i10 % 128;
        setZ = i11;
        if (i10 % 2 == 0) {
            setitemcheckedArr = new setItemChecked[14];
            setitemcheckedArr[0] = setitemchecked;
            setitemcheckedArr[1] = setitemchecked2;
            setitemcheckedArr[4] = setitemchecked3;
            setitemcheckedArr[3] = setitemchecked4;
            setitemcheckedArr[4] = setitemchecked5;
            setitemcheckedArr[3] = setitemchecked6;
        } else {
            setitemcheckedArr = new setItemChecked[]{setitemchecked, setitemchecked2, setitemchecked3, setitemchecked4, setitemchecked5, setitemchecked6};
        }
        int i12 = i11 + 75;
        setTextAlignment = i12 % 128;
        int i13 = i12 % 2;
        getNavBarTitleString = setitemcheckedArr;
        INSTANCE = new Companion(null);
        setOnLongClickListener = new setDividerPadding(values(), 18);
        int i14 = setZ;
        int i15 = i14 & 45;
        int i16 = (((i14 | 45) & (~i15)) - (~(i15 << 1))) - 1;
        setTextAlignment = i16 % 128;
        int i17 = i16 % 2;
    }

    public setItemChecked(String str, int i10, byte b10) {
        super(str, i10);
        this.setCompoundDrawableTintBlendMode = b10;
    }

    public static final /* synthetic */ openContextMenu setY() {
        int i10 = setZ;
        int i11 = i10 + 94;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        setTextAlignment = i12 % 128;
        int i13 = i12 % 2;
        openContextMenu<setItemChecked> opencontextmenu = setOnLongClickListener;
        int i14 = i10 & 123;
        int i15 = (i10 ^ 123) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        setTextAlignment = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 18 / 0;
        }
        return opencontextmenu;
    }

    public static setItemChecked valueOf(String str) {
        int i10 = setZ;
        int i11 = i10 | 1;
        int i12 = (i11 << 1) - ((~(i10 & 1)) & i11);
        setTextAlignment = i12 % 128;
        if (i12 % 2 != 0) {
            Enum.valueOf(setItemChecked.class, str);
            throw null;
        }
        setItemChecked setitemchecked = (setItemChecked) Enum.valueOf(setItemChecked.class, str);
        int i13 = setZ;
        int i14 = (i13 & 52) + (i13 | 52);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        setTextAlignment = i15 % 128;
        int i16 = i15 % 2;
        return setitemchecked;
    }

    public static setItemChecked[] values() {
        int i10 = setTextAlignment;
        int i11 = ((((i10 ^ 103) | (i10 & 103)) << 1) - (~(-(((~i10) & 103) | (i10 & (-104)))))) - 1;
        setZ = i11 % 128;
        int i12 = i11 % 2;
        setItemChecked[] setitemcheckedArr = (setItemChecked[]) getNavBarTitleString.clone();
        int i13 = setZ;
        int i14 = i13 ^ 99;
        int i15 = ((i13 & 99) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        setTextAlignment = i17 % 128;
        if (i17 % 2 == 0) {
            return setitemcheckedArr;
        }
        throw null;
    }

    @JvmName(name = "setX")
    public final byte setX() {
        int i10 = setTextAlignment;
        int i11 = ((i10 & (-28)) | ((~i10) & 27)) + ((i10 & 27) << 1);
        int i12 = i11 % 128;
        setZ = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        byte b10 = this.setCompoundDrawableTintBlendMode;
        int i13 = (i12 ^ 35) + ((i12 & 35) << 1);
        setTextAlignment = i13 % 128;
        if (i13 % 2 == 0) {
            return b10;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setZ + 92;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        setTextAlignment = i11 % 128;
        if (i11 % 2 == 0) {
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
            return "";
        }
        setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
        int i12 = 27 / 0;
        return "";
    }
}
