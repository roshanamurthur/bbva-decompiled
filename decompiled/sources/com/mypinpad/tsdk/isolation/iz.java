package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/mypinpad/tsdk/i/iz;", "", "", "setY", "B", "setOnFocusChangeListener", "()B", "getNavBarTitleString", "setDividerPadding", "setX", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public enum iz {
    UNKNOWN((byte) 0),
    FAILED((byte) 1),
    SUCCESS((byte) 2),
    BLOCKED((byte) 3);

    private static int setLayoutAnimation = 0;
    private static int setOnDragListener = 1;
    private final byte setY;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final openContextMenu<iz> setOnLongClickListener = new setDividerPadding(valuesCustom(), UNKNOWN);

    public static final class setDividerPadding extends openContextMenu<iz> {
        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i13 | i12);
            int i15 = ~i12;
            int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
            int i17 = ~i11;
            int i18 = i10 | i15;
            if ((((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16 != 1) {
                return Byte.valueOf(((Byte) setY(new Object[]{(iz) ((Enum) objArr[1])}, -385034200, 385034201, (int) System.currentTimeMillis())).byteValue());
            }
            iz izVar = (iz) objArr[0];
            Intrinsics.checkNotNullParameter(izVar, "");
            return Byte.valueOf(izVar.setOnFocusChangeListener());
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setY(new Object[]{this, r4}, 2109416925, -2109416925, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.iz$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/iz$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/iz;", "setOnLongClickListener", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setOnFocusChangeListener", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f56561a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56562b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public static openContextMenu<iz> setCompoundDrawableTintBlendMode() {
            return (openContextMenu) setDividerPadding(new Object[0], -1816475843, 1816475843, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f56561a + 63;
            f56562b = i13 % 128;
            if (i13 % 2 == 0) {
                iz.setDividerPadding();
                throw null;
            }
            openContextMenu dividerPadding = iz.setDividerPadding();
            int i14 = f56562b;
            int i15 = ((i14 | 55) << 1) - (i14 ^ 55);
            f56561a = i15 % 128;
            if (i15 % 2 == 0) {
                return dividerPadding;
            }
            throw null;
        }
    }

    static {
        int i10 = 39 << 1;
        int i11 = -39;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        setOnDragListener = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 38 - 1;
        setOnDragListener = i14 % 128;
        int i15 = i14 % 2;
        int i16 = setLayoutAnimation;
        int i17 = (i16 & 33) + (i16 | 33);
        setOnDragListener = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 10 / 0;
        }
    }

    iz(byte b10) {
        this.setY = b10;
    }

    public static final /* synthetic */ openContextMenu setDividerPadding() {
        int i10 = setLayoutAnimation;
        int i11 = ((i10 ^ 56) + ((i10 & 56) << 1)) - 1;
        int i12 = i11 % 128;
        setOnDragListener = i12;
        int i13 = i11 % 2;
        openContextMenu<iz> opencontextmenu = setOnLongClickListener;
        int i14 = i12 & 95;
        int i15 = ((i12 ^ 95) | i14) << 1;
        int i16 = -((i12 | 95) & (~i14));
        int i17 = (i15 & i16) + (i16 | i15);
        setLayoutAnimation = i17 % 128;
        int i18 = i17 % 2;
        return opencontextmenu;
    }

    public static iz valueOf(String str) {
        int i10 = setOnDragListener;
        int i11 = i10 & 61;
        int i12 = (i11 - (~(-(-((i10 ^ 61) | i11))))) - 1;
        setLayoutAnimation = i12 % 128;
        int i13 = i12 % 2;
        iz izVar = (iz) Enum.valueOf(iz.class, str);
        int i14 = setOnDragListener;
        int i15 = i14 & 9;
        int i16 = (i15 - (~(-(-((i14 ^ 9) | i15))))) - 1;
        setLayoutAnimation = i16 % 128;
        int i17 = i16 % 2;
        return izVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static iz[] valuesCustom() {
        int i10 = setOnDragListener;
        int i11 = i10 & 95;
        int i12 = (i11 - (~(-(-((i10 ^ 95) | i11))))) - 1;
        setLayoutAnimation = i12 % 128;
        int i13 = i12 % 2;
        iz[] izVarArr = (iz[]) values().clone();
        int i14 = setOnDragListener + 1;
        setLayoutAnimation = i14 % 128;
        int i15 = i14 % 2;
        return izVarArr;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final byte setOnFocusChangeListener() {
        int i10 = setLayoutAnimation;
        int i11 = i10 ^ 111;
        int i12 = (i10 & 111) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        setOnDragListener = i14;
        int i15 = i13 % 2;
        byte b10 = this.setY;
        int i16 = i14 & 105;
        int i17 = i16 + ((i14 ^ 105) | i16);
        setLayoutAnimation = i17 % 128;
        int i18 = i17 % 2;
        return b10;
    }
}
