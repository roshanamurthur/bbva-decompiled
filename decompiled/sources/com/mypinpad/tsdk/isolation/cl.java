package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\u0007j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/cl;", "", "", "setCompoundDrawableTintBlendMode", "B", "setOnFocusChangeListener", "()B", "setDividerPadding", "setX", "setOnLongClickListener"}, k = 1, mv = {1, 5, 1})
public enum cl {
    RELAY_RESISTANCE_PROTOCOL_NOT_SUPPORTED((byte) 0),
    RRP_NOT_PERFORMED((byte) 1),
    RRP_PERFORMED((byte) 2);

    private static int setLayoutAnimation = 1;
    private static int setOnDragListener;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final openContextMenu<cl> setY;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    private final byte setDividerPadding;

    public static final class setDividerPadding extends openContextMenu<cl> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f54826f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f54827g = 1;

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            byte bByteValue;
            int i13 = (i11 * 591) + (i10 * (-589));
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = (~(i14 | i10)) | (~(i14 | i15)) | (~(i15 | i10));
            int i17 = ~i10;
            if ((((~(i17 | i15)) | (~(i11 | i15))) * 590) + (i16 * (-1180)) + (((~(i12 | i17 | i11)) | i16) * 590) + i13 == 1) {
                Enum r4 = (Enum) objArr[1];
                int i18 = f54826f + 29;
                f54827g = i18 % 128;
                cl clVar = (cl) r4;
                if (i18 % 2 == 0) {
                    bByteValue = ((Byte) setX(new Object[]{clVar}, -594327345, 594327345, (int) System.currentTimeMillis())).byteValue();
                    int i19 = 88 / 0;
                } else {
                    bByteValue = ((Byte) setX(new Object[]{clVar}, -594327345, 594327345, (int) System.currentTimeMillis())).byteValue();
                }
                return Byte.valueOf(bByteValue);
            }
            cl clVar2 = (cl) objArr[0];
            int i20 = f54827g;
            int i21 = i20 & 67;
            int i22 = ((i20 ^ 67) | i21) << 1;
            int i23 = -((i20 | 67) & (~i21));
            int i24 = (i22 & i23) + (i23 | i22);
            f54826f = i24 % 128;
            int i25 = i24 % 2;
            Intrinsics.checkNotNullParameter(clVar2, "");
            byte onFocusChangeListener = clVar2.setOnFocusChangeListener();
            int i26 = f54827g;
            int i27 = i26 & 35;
            int i28 = (i26 ^ 35) | i27;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f54826f = i29 % 128;
            if (i29 % 2 == 0) {
                return Byte.valueOf(onFocusChangeListener);
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setX(new Object[]{this, r4}, 1762794278, -1762794277, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.cl$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/cl$setX;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/cl;", "setY", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static openContextMenu<cl> setOnFocusChangeListener() {
            return (openContextMenu) setX(new Object[0], 304782637, -304782637, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            System.currentTimeMillis();
            System.currentTimeMillis();
            return cl.setDividerPadding();
        }
    }

    static {
        int i10 = (-1) - (~33);
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        setLayoutAnimation = 105 % 128;
        int i12 = 105 % 2;
        INSTANCE = new Companion(null);
        setY = new setDividerPadding(valuesCustom(), 28);
        int i13 = setOnDragListener;
        int i14 = ((-1) << 1) - (((i13 & 74) + (i13 | 74)) ^ (-1));
        setLayoutAnimation = i14 % 128;
        int i15 = i14 % 2;
    }

    cl(byte b10) {
        this.setDividerPadding = b10;
    }

    public static final /* synthetic */ openContextMenu setDividerPadding() {
        openContextMenu<cl> opencontextmenu;
        int i10 = setLayoutAnimation;
        int i11 = (((i10 | 20) << 1) - (i10 ^ 20)) - 1;
        setOnDragListener = i11 % 128;
        if (i11 % 2 != 0) {
            opencontextmenu = setY;
            int i12 = 45 / 0;
        } else {
            opencontextmenu = setY;
        }
        int i13 = i10 & 117;
        int i14 = (i10 | 117) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        setOnDragListener = i16 % 128;
        if (i16 % 2 == 0) {
            return opencontextmenu;
        }
        throw null;
    }

    public static cl valueOf(String str) {
        int i10 = setOnDragListener;
        int i11 = (i10 | 125) << 1;
        int i12 = -(((~i10) & 125) | (i10 & (-126)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setLayoutAnimation = i13 % 128;
        int i14 = i13 % 2;
        cl clVar = (cl) Enum.valueOf(cl.class, str);
        if (i14 == 0) {
            int i15 = 77 / 0;
        }
        return clVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static cl[] valuesCustom() {
        int i10 = setOnDragListener;
        int i11 = ((((i10 ^ 59) | (i10 & 59)) << 1) - (~(-(((~i10) & 59) | (i10 & (-60)))))) - 1;
        setLayoutAnimation = i11 % 128;
        int i12 = i11 % 2;
        cl[] clVarArrValuesCustom = values();
        if (i12 != 0) {
            return (cl[]) clVarArrValuesCustom.clone();
        }
        throw null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final byte setOnFocusChangeListener() {
        int i10 = setOnDragListener;
        int i11 = (i10 | 11) << 1;
        int i12 = -(((~i10) & 11) | (i10 & (-12)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        setLayoutAnimation = i14;
        int i15 = i13 % 2;
        byte b10 = this.setDividerPadding;
        int i16 = (i14 ^ 71) + ((i14 & 71) << 1);
        setOnDragListener = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 2 / 0;
        }
        return b10;
    }
}
