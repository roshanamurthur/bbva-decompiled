package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/mypinpad/tsdk/i/jg;", "", "", "toString", "()Ljava/lang/String;", "", "setX", "B", "()B", "setOnFocusChangeListener", "setDividerPadding", "setCompoundDrawableTintBlendMode", "setNavigationOnClickListener"}, k = 1, mv = {1, 5, 1})
public enum jg {
    V3_0((byte) 1),
    V3_1((byte) 2),
    V4_0_X((byte) 3);

    private static int getNavBarTitleString = 1;
    private static int setOnDragListener;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final openContextMenu<jg> setY;
    private final byte setX;

    public static final class setDividerPadding extends openContextMenu<jg> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f56634f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f56635g = 1;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = i13 | i11;
            int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
            int i16 = ~(i14 | i12);
            int i17 = ~i12;
            if (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15 == 1) {
                jg jgVar = (jg) objArr[0];
                int i18 = f56634f;
                int i19 = i18 ^ 31;
                int i20 = (((i18 & 31) | i19) << 1) - i19;
                f56635g = i20 % 128;
                if (i20 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(jgVar, "");
                    return Byte.valueOf(jgVar.setX());
                }
                Intrinsics.checkNotNullParameter(jgVar, "");
                jgVar.setX();
                throw null;
            }
            Enum r10 = (Enum) objArr[1];
            int i21 = f56634f + 105;
            f56635g = i21 % 128;
            jg jgVar2 = (jg) r10;
            if (i21 % 2 == 0) {
                ((Byte) setDividerPadding(new Object[]{jgVar2}, -1802820916, 1802820917, (int) System.currentTimeMillis())).byteValue();
                throw null;
            }
            byte bByteValue = ((Byte) setDividerPadding(new Object[]{jgVar2}, -1802820916, 1802820917, (int) System.currentTimeMillis())).byteValue();
            int i22 = f56635g;
            int i23 = ((i22 | 93) << 1) - (i22 ^ 93);
            f56634f = i23 % 128;
            if (i23 % 2 == 0) {
                return Byte.valueOf(bByteValue);
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setDividerPadding(new Object[]{this, r4}, 160657604, -160657604, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.jg$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/jg$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/jg;", "setY", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setX", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f56636a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56637b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f56636a + 97;
            f56637b = i13 % 128;
            if (i13 % 2 == 0) {
                jg.setDividerPadding();
                throw null;
            }
            openContextMenu dividerPadding = jg.setDividerPadding();
            int i14 = f56637b;
            int i15 = i14 & 1;
            int i16 = (((i14 | 1) & (~i15)) - (~(i15 << 1))) - 1;
            f56636a = i16 % 128;
            int i17 = i16 % 2;
            return dividerPadding;
        }

        @JvmName(name = "setX")
        @NotNull
        public static openContextMenu<jg> setX() {
            return (openContextMenu) setCompoundDrawableTintBlendMode(new Object[0], -756573368, 756573368, (int) System.currentTimeMillis());
        }
    }

    static {
        int i10 = ~1;
        int i11 = ((1 & (-38)) | (37 & i10)) + ((37 & 1) << 1);
        setOnDragListener = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((((1 ^ 103) | (1 & 103)) << 1) - (~(-((103 & i10) | (1 & (-104)))))) - 1;
        setOnDragListener = i13 % 128;
        int i14 = i13 % 2;
        INSTANCE = new Companion(null);
        setY = new setDividerPadding(valuesCustom(), 47);
        int i15 = getNavBarTitleString + 105;
        setOnDragListener = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 90 / 0;
        }
    }

    jg(byte b10) {
        this.setX = b10;
    }

    public static final /* synthetic */ openContextMenu setDividerPadding() {
        int i10 = setOnDragListener + 67;
        getNavBarTitleString = i10 % 128;
        if (i10 % 2 != 0) {
            return setY;
        }
        throw null;
    }

    public static jg valueOf(String str) {
        int i10 = getNavBarTitleString + 9;
        setOnDragListener = i10 % 128;
        int i11 = i10 % 2;
        jg jgVar = (jg) Enum.valueOf(jg.class, str);
        int i12 = getNavBarTitleString;
        int i13 = (i12 & 3) + (i12 | 3);
        setOnDragListener = i13 % 128;
        int i14 = i13 % 2;
        return jgVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static jg[] valuesCustom() {
        jg[] jgVarArr;
        int i10 = setOnDragListener;
        int i11 = (((i10 | 55) << 1) - (~(-(((~i10) & 55) | (i10 & (-56)))))) - 1;
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        jg[] jgVarArrValuesCustom = values();
        if (i12 == 0) {
            jgVarArr = (jg[]) jgVarArrValuesCustom.clone();
            int i13 = 62 / 0;
        } else {
            jgVarArr = (jg[]) jgVarArrValuesCustom.clone();
        }
        int i14 = setOnDragListener;
        int i15 = i14 & 113;
        int i16 = ((i14 ^ 113) | i15) << 1;
        int i17 = -((i14 | 113) & (~i15));
        int i18 = (i16 & i17) + (i17 | i16);
        getNavBarTitleString = i18 % 128;
        if (i18 % 2 != 0) {
            return jgVarArr;
        }
        throw null;
    }

    @JvmName(name = "setX")
    public final byte setX() {
        int i10 = ((-1) << 1) - ((getNavBarTitleString + 104) ^ (-1));
        int i11 = i10 % 128;
        setOnDragListener = i11;
        int i12 = i10 % 2;
        byte b10 = this.setX;
        int i13 = (i11 & 105) + (i11 | 105);
        getNavBarTitleString = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 64 / 0;
        }
        return b10;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = getNavBarTitleString;
        int i11 = i10 & 33;
        int i12 = ((i10 ^ 33) | i11) << 1;
        int i13 = -((i10 | 33) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        setOnDragListener = i14 % 128;
        int i15 = i14 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i16 = getNavBarTitleString;
        int i17 = (i16 & (-102)) | ((~i16) & 101);
        int i18 = -(-((i16 & 101) << 1));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        setOnDragListener = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 42 / 0;
        }
        return "";
    }
}
