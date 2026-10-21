package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/iy;", "", "", "setX", "B", "setDividerPadding", "()B", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setY"}, k = 1, mv = {1, 5, 1})
public enum iy {
    MOBILE_CVM_NOT_REQUIRED((byte) 0),
    TERMINAL_REQUIRED_CVM((byte) 3);

    private static int getNavBarTitleString = 0;
    private static int setOnDragListener = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    private final byte setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final openContextMenu<iy> setDividerPadding = new setX(valuesCustom(), 27);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.iy$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/iy$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/iy;", "setDividerPadding", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f56557a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56558b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public static openContextMenu<iy> setCompoundDrawableTintBlendMode() {
            return (openContextMenu) setX(new Object[0], 598588025, -598588025, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f56557a;
            int i14 = (i13 & (-8)) | ((~i13) & 7);
            int i15 = (i13 & 7) << 1;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            f56558b = i16 % 128;
            int i17 = i16 % 2;
            openContextMenu compoundDrawableTintBlendMode = iy.setCompoundDrawableTintBlendMode();
            int i18 = f56558b + 67;
            f56557a = i18 % 128;
            int i19 = i18 % 2;
            return compoundDrawableTintBlendMode;
        }
    }

    public static final class setX extends openContextMenu<iy> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f56559f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f56560g = 1;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            if ((((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628) != 1) {
                Enum r3 = (Enum) objArr[1];
                int i13 = f56559f;
                int i14 = i13 | 77;
                int i15 = (i14 << 1) - ((~(i13 & 77)) & i14);
                f56560g = i15 % 128;
                iy iyVar = (iy) r3;
                Object[] objArr2 = new Object[1];
                if (i15 % 2 != 0) {
                    objArr2[0] = iyVar;
                    return Byte.valueOf(((Byte) setDividerPadding(objArr2, 1228423304, -1228423303, (int) System.currentTimeMillis())).byteValue());
                }
                objArr2[0] = iyVar;
                ((Byte) setDividerPadding(objArr2, 1228423304, -1228423303, (int) System.currentTimeMillis())).byteValue();
                throw null;
            }
            iy iyVar2 = (iy) objArr[0];
            int i16 = f56560g;
            int i17 = i16 & 99;
            int i18 = (i16 ^ 99) | i17;
            int i19 = (i17 & i18) + (i18 | i17);
            f56559f = i19 % 128;
            int i20 = i19 % 2;
            Intrinsics.checkNotNullParameter(iyVar2, "");
            byte dividerPadding = iyVar2.setDividerPadding();
            int i21 = f56560g;
            int i22 = i21 & 111;
            int i23 = -(-(i21 | 111));
            int i24 = (i22 & i23) + (i23 | i22);
            f56559f = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 98 / 0;
            }
            return Byte.valueOf(dividerPadding);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setDividerPadding(new Object[]{this, r4}, -266181815, 266181815, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        int i10 = 1 - (-71);
        int i11 = i10 % 128;
        getNavBarTitleString = i11;
        int i12 = i10 % 2;
        int i13 = i11 & 41;
        int i14 = i13 + ((i11 ^ 41) | i13);
        setOnDragListener = i14 % 128;
        int i15 = i14 % 2;
        int i16 = setOnDragListener;
        int i17 = i16 & 15;
        int i18 = ((i16 | 15) & (~i17)) + (i17 << 1);
        getNavBarTitleString = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    iy(byte b10) {
        this.setCompoundDrawableTintBlendMode = b10;
    }

    public static final /* synthetic */ openContextMenu setCompoundDrawableTintBlendMode() {
        int i10 = ((-1) << 1) - ((getNavBarTitleString + 60) ^ (-1));
        int i11 = i10 % 128;
        setOnDragListener = i11;
        int i12 = i10 % 2;
        openContextMenu<iy> opencontextmenu = setDividerPadding;
        int i13 = (i11 & (-126)) | ((~i11) & 125);
        int i14 = (i11 & 125) << 1;
        int i15 = (i13 & i14) + (i14 | i13);
        getNavBarTitleString = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 58 / 0;
        }
        return opencontextmenu;
    }

    public static iy valueOf(String str) {
        int i10 = setOnDragListener + 124;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        iy iyVar = (iy) Enum.valueOf(iy.class, str);
        if (i12 != 0) {
            int i13 = 25 / 0;
        }
        int i14 = setOnDragListener + 7;
        getNavBarTitleString = i14 % 128;
        if (i14 % 2 == 0) {
            return iyVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static iy[] valuesCustom() {
        System.currentTimeMillis();
        System.currentTimeMillis();
        iy[] iyVarArr = (iy[]) values().clone();
        int i10 = setOnDragListener;
        int i11 = i10 & 41;
        int i12 = (i10 | 41) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        getNavBarTitleString = i14 % 128;
        if (i14 % 2 == 0) {
            return iyVarArr;
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        int i10 = setOnDragListener;
        int i11 = i10 & 81;
        int i12 = ((i10 | 81) & (~i11)) + (i11 << 1);
        getNavBarTitleString = i12 % 128;
        if (i12 % 2 == 0) {
            return this.setCompoundDrawableTintBlendMode;
        }
        int i13 = 46 / 0;
        return this.setCompoundDrawableTintBlendMode;
    }
}
