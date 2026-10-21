package com.mypinpad.tsdk.isolation;

import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\u0005j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setFitsSystemWindows;", "", "", "setOnLongClickListener", "B", "setDividerPadding", "()B", "setOnFocusChangeListener", "setY", "setX", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class setFitsSystemWindows {
    private static final /* synthetic */ setFitsSystemWindows[] getNavBarTitleString;
    public static final setFitsSystemWindows setCompoundDrawableTintBlendMode;
    public static final setFitsSystemWindows setDividerPadding;
    private static int setLayoutAnimation = 0;
    private static int setNavigationOnClickListener = 1;

    @NotNull
    private static final openContextMenu<setFitsSystemWindows> setOnDragListener;
    public static final setFitsSystemWindows setOnFocusChangeListener;
    public static final setFitsSystemWindows setX;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: setOnLongClickListener, reason: from kotlin metadata */
    private final byte setOnFocusChangeListener;

    public static final class setOnFocusChangeListener extends openContextMenu<setFitsSystemWindows> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f59714f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f59715g = 1;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i12;
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = i13 | (~(i14 | i15));
            int i17 = ~(i10 | i11);
            if ((((~(i10 | i15)) | (~(i11 | i14))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i17) * (-1444)) + ((i16 | i17) * 1444) + (i11 * (-721)) + (i10 * (-721)) == 1) {
                setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) objArr[0];
                int i18 = f59714f + 121;
                f59715g = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(setfitssystemwindows, "");
                byte dividerPadding = setfitssystemwindows.setDividerPadding();
                int i20 = f59715g;
                int i21 = ((-1) << 1) - ((-1) ^ (((i20 | 50) << 1) - (i20 ^ 50)));
                f59714f = i21 % 128;
                int i22 = i21 % 2;
                return Byte.valueOf(dividerPadding);
            }
            Enum r10 = (Enum) objArr[1];
            int i23 = f59715g;
            int i24 = i23 & 51;
            int i25 = (i24 - (~(-(-((i23 ^ 51) | i24))))) - 1;
            f59714f = i25 % 128;
            int i26 = i25 % 2;
            byte bByteValue = ((Byte) setDividerPadding(new Object[]{(setFitsSystemWindows) r10}, -2042518651, 2042518652, (int) System.currentTimeMillis())).byteValue();
            int i27 = f59715g;
            int i28 = i27 & 21;
            int i29 = (i27 | 21) & (~i28);
            int i30 = i28 << 1;
            int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
            f59714f = i31 % 128;
            int i32 = i31 % 2;
            return Byte.valueOf(bByteValue);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setDividerPadding(new Object[]{this, r4}, -494351923, 494351923, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setFitsSystemWindows$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setFitsSystemWindows$setY;", "", "", "p0", "Lcom/mypinpad/tsdk/i/setFitsSystemWindows;", "setCompoundDrawableTintBlendMode", "(B)Lcom/mypinpad/tsdk/i/setFitsSystemWindows;", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setOnDragListener", "Lcom/mypinpad/tsdk/i/openContextMenu;", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setX", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f59716a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f59717b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public static openContextMenu<setFitsSystemWindows> setCompoundDrawableTintBlendMode() {
            return (openContextMenu) setOnFocusChangeListener(new Object[0], -1783054430, 1783054431, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            Object x4;
            int i13 = (i11 * 399) + (i10 * 399);
            int i14 = ~((~i10) | i11);
            int i15 = ~i11;
            int i16 = ~(i15 | i10);
            if ((((~((~i12) | i15)) | i14 | i16) * 398) + ((i10 | i11) * (-1194)) + ((i14 | i16 | (~(i15 | i12))) * 398) + i13 != 1) {
                byte bByteValue = ((Byte) objArr[0]).byteValue();
                int i17 = f59716a;
                int i18 = (i17 & (-112)) | ((~i17) & 111);
                int i19 = -(-((i17 & 111) << 1));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                f59717b = i20 % 128;
                int i21 = i20 % 2;
                openContextMenu opencontextmenu = (openContextMenu) setOnFocusChangeListener(new Object[0], -1783054430, 1783054431, (int) System.currentTimeMillis());
                x4 = (setFitsSystemWindows) ((Enum) openContextMenu.setOnFocusChangeListener(new Object[]{opencontextmenu, Byte.valueOf(bByteValue)}, 693193897, -693193897, System.identityHashCode(opencontextmenu)));
                int i22 = f59716a;
                int i23 = i22 ^ 63;
                int i24 = ((i22 & 63) | i23) << 1;
                int i25 = -i23;
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                f59717b = i26 % 128;
                if (i26 % 2 == 0) {
                    throw null;
                }
            } else {
                int i27 = f59717b;
                int i28 = ((i27 & (-64)) | ((~i27) & 63)) + ((i27 & 63) << 1);
                f59716a = i28 % 128;
                int i29 = i28 % 2;
                x4 = setFitsSystemWindows.setX();
                int i30 = f59716a;
                int i31 = i30 & 35;
                int i32 = ((i30 ^ 35) | i31) << 1;
                int i33 = -((i30 | 35) & (~i31));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                f59717b = i34 % 128;
                if (i34 % 2 == 0) {
                    throw null;
                }
            }
            return x4;
        }

        @NotNull
        public static setFitsSystemWindows setCompoundDrawableTintBlendMode(byte p4) {
            return (setFitsSystemWindows) setOnFocusChangeListener(new Object[]{Byte.valueOf(p4)}, 179081543, -179081543, (int) System.currentTimeMillis());
        }
    }

    static {
        setFitsSystemWindows[] setfitssystemwindowsArr;
        setFitsSystemWindows setfitssystemwindows = new setFitsSystemWindows("AAC", 0, (byte) 0);
        setOnFocusChangeListener = setfitssystemwindows;
        setFitsSystemWindows setfitssystemwindows2 = new setFitsSystemWindows("TC", 1, (byte) 1);
        setDividerPadding = setfitssystemwindows2;
        setFitsSystemWindows setfitssystemwindows3 = new setFitsSystemWindows("ARQC", 2, (byte) 2);
        setX = setfitssystemwindows3;
        setFitsSystemWindows setfitssystemwindows4 = new setFitsSystemWindows("UNKNOWN", 3, (byte) -1);
        setCompoundDrawableTintBlendMode = setfitssystemwindows4;
        int i10 = 1 & 53;
        int i11 = 1 | 53;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        setLayoutAnimation = i12 % 128;
        if (i12 % 2 != 0) {
            setfitssystemwindowsArr = new setFitsSystemWindows[5];
            setfitssystemwindowsArr[0] = setfitssystemwindows;
            setfitssystemwindowsArr[1] = setfitssystemwindows2;
            setfitssystemwindowsArr[4] = setfitssystemwindows3;
            setfitssystemwindowsArr[4] = setfitssystemwindows4;
        } else {
            setfitssystemwindowsArr = new setFitsSystemWindows[]{setfitssystemwindows, setfitssystemwindows2, setfitssystemwindows3, setfitssystemwindows4};
        }
        getNavBarTitleString = setfitssystemwindowsArr;
        INSTANCE = new Companion(null);
        setOnDragListener = new setOnFocusChangeListener(values(), setfitssystemwindows4);
        int i13 = setLayoutAnimation;
        int i14 = i13 & 75;
        int i15 = (i13 ^ 75) | i14;
        int i16 = (i14 & i15) + (i15 | i14);
        setNavigationOnClickListener = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public setFitsSystemWindows(String str, int i10, byte b10) {
        super(str, i10);
        this.setOnFocusChangeListener = b10;
    }

    public static final /* synthetic */ openContextMenu setX() {
        int i10 = setNavigationOnClickListener;
        int i11 = (i10 ^ 119) + ((i10 & 119) << 1);
        setLayoutAnimation = i11 % 128;
        int i12 = i11 % 2;
        openContextMenu<setFitsSystemWindows> opencontextmenu = setOnDragListener;
        int i13 = (i10 & 113) + (i10 | 113);
        setLayoutAnimation = i13 % 128;
        if (i13 % 2 == 0) {
            return opencontextmenu;
        }
        throw null;
    }

    public static setFitsSystemWindows valueOf(String str) {
        int i10 = setLayoutAnimation + 81;
        setNavigationOnClickListener = i10 % 128;
        if (i10 % 2 != 0) {
            return (setFitsSystemWindows) Enum.valueOf(setFitsSystemWindows.class, str);
        }
        Enum.valueOf(setFitsSystemWindows.class, str);
        throw null;
    }

    public static setFitsSystemWindows[] values() {
        int i10 = setNavigationOnClickListener;
        int i11 = (((i10 | 66) << 1) - (i10 ^ 66)) - 1;
        setLayoutAnimation = i11 % 128;
        int i12 = i11 % 2;
        setFitsSystemWindows[] setfitssystemwindowsArr = getNavBarTitleString;
        if (i12 == 0) {
            return (setFitsSystemWindows[]) setfitssystemwindowsArr.clone();
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        int i10 = setLayoutAnimation;
        int i11 = (((i10 | 114) << 1) - (i10 ^ 114)) - 1;
        int i12 = i11 % 128;
        setNavigationOnClickListener = i12;
        int i13 = i11 % 2;
        byte b10 = this.setOnFocusChangeListener;
        int i14 = i12 ^ 25;
        int i15 = (((i12 & 25) | i14) << 1) - i14;
        setLayoutAnimation = i15 % 128;
        if (i15 % 2 == 0) {
            return b10;
        }
        throw null;
    }
}
