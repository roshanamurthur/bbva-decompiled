package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/g;", "", "", "toString", "()Ljava/lang/String;", "", "setDividerPadding", "B", "setY", "()B", "setOnFocusChangeListener", "setX"}, k = 1, mv = {1, 5, 1})
public enum g {
    N_A;

    private static int setOnDragListener = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    private final byte setOnFocusChangeListener = Constants.CVR_B2b8765_1111_APP_DISABLED;
    private static int getNavBarTitleString = 118;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final openContextMenu<g> setY = new setX(valuesCustom(), 44);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.g$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/g$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/g;", "setY", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setX", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setOnFocusChangeListener", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            return g.setDividerPadding();
        }

        @JvmName(name = "setX")
        @NotNull
        public static openContextMenu<g> setX() {
            return (openContextMenu) setOnFocusChangeListener(new Object[0], 611118803, -611118803, (int) System.currentTimeMillis());
        }
    }

    public static final class setX extends openContextMenu<g> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f55586f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f55587g = 1;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 263) + (i10 * (-523));
            int i14 = ~((~i10) | i11);
            int i15 = ~i11;
            int i16 = ~(i10 | i15);
            if (((i16 | (~(i15 | (~i12))) | i14) * 262) + (i16 * (-786)) + ((i14 | i16 | (~(i15 | i12))) * 262) + i13 != 1) {
                g gVar = (g) objArr[0];
                int i17 = f55586f + 53;
                f55587g = i17 % 128;
                int i18 = i17 % 2;
                Intrinsics.checkNotNullParameter(gVar, "");
                byte y7 = gVar.setY();
                int i19 = f55586f;
                int i20 = ((i19 | 21) << 1) - (i19 ^ 21);
                f55587g = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 99 / 0;
                }
                return Byte.valueOf(y7);
            }
            Enum r4 = (Enum) objArr[1];
            int i22 = f55587g;
            int i23 = i22 & 17;
            int i24 = i23 + ((i22 ^ 17) | i23);
            f55586f = i24 % 128;
            int i25 = i24 % 2;
            byte bByteValue = ((Byte) setDividerPadding(new Object[]{(g) r4}, 1733747061, -1733747061, (int) System.currentTimeMillis())).byteValue();
            int i26 = f55586f;
            int i27 = i26 & 119;
            int i28 = ((i26 ^ 119) | i27) << 1;
            int i29 = -((i26 | 119) & (~i27));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f55587g = i30 % 128;
            int i31 = i30 % 2;
            return Byte.valueOf(bByteValue);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setDividerPadding(new Object[]{this, r4}, -1209359199, 1209359200, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        setOnDragListener = 99;
        int i10 = getNavBarTitleString;
        int i11 = (i10 ^ 17) + ((i10 & 17) << 1);
        setOnDragListener = i11 % 128;
        int i12 = i11 % 2;
    }

    public static final /* synthetic */ openContextMenu setDividerPadding() {
        int i10 = getNavBarTitleString;
        int i11 = ((-1) << 1) - ((((i10 | 16) << 1) - (i10 ^ 16)) ^ (-1));
        setOnDragListener = i11 % 128;
        int i12 = i11 % 2;
        openContextMenu<g> opencontextmenu = setY;
        int i13 = (i10 & 53) + (i10 | 53);
        setOnDragListener = i13 % 128;
        int i14 = i13 % 2;
        return opencontextmenu;
    }

    public static g valueOf(String str) {
        int i10 = getNavBarTitleString;
        int i11 = (i10 & (-42)) | ((~i10) & 41);
        int i12 = (i10 & 41) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setOnDragListener = i13 % 128;
        int i14 = i13 % 2;
        g gVar = (g) Enum.valueOf(g.class, str);
        if (i14 == 0) {
            int i15 = 23 / 0;
        }
        int i16 = getNavBarTitleString;
        int i17 = i16 & 93;
        int i18 = (i17 - (~((i16 ^ 93) | i17))) - 1;
        setOnDragListener = i18 % 128;
        int i19 = i18 % 2;
        return gVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        int i10 = getNavBarTitleString;
        int i11 = i10 & 73;
        int i12 = (i10 | 73) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        setOnDragListener = i14 % 128;
        int i15 = i14 % 2;
        g[] gVarArr = (g[]) values().clone();
        int i16 = setOnDragListener;
        int i17 = i16 & 19;
        int i18 = -(-((i16 ^ 19) | i17));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        getNavBarTitleString = i19 % 128;
        int i20 = i19 % 2;
        return gVarArr;
    }

    @JvmName(name = "setY")
    public final byte setY() {
        int i10 = setOnDragListener;
        int i11 = i10 & 55;
        int i12 = (i10 | 55) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        getNavBarTitleString = i14 % 128;
        if (i14 % 2 == 0) {
            return this.setOnFocusChangeListener;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = getNavBarTitleString;
        int i11 = ((i10 | 23) << 1) - (i10 ^ 23);
        setOnDragListener = i11 % 128;
        int i12 = i11 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i13 = setOnDragListener;
        int i14 = (i13 & (-36)) | ((~i13) & 35);
        int i15 = -(-((i13 & 35) << 1));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        getNavBarTitleString = i16 % 128;
        if (i16 % 2 == 0) {
            return "";
        }
        throw null;
    }
}
