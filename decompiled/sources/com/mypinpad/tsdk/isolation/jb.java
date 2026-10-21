package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\u0005j\u0002\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/jb;", "", "", "setX", "B", "setCompoundDrawableTintBlendMode", "()B", "setDividerPadding", "getNavBarTitleString", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1})
public final class jb {
    private static jb getNavBarTitleString = null;
    public static final jb setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setLayoutAnimation = 0;
    private static final /* synthetic */ jb[] setNavigationOnClickListener;
    private static int setOnDragListener = 1;
    public static final jb setOnFocusChangeListener;

    @NotNull
    private static final openContextMenu<jb> setY;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    private final byte setDividerPadding;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.jb$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/jb$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/jb;", "setY", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setX", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f56623a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56624b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f56624b;
            int i14 = (i13 & (-106)) | ((~i13) & 105);
            int i15 = -(-((i13 & 105) << 1));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f56623a = i16 % 128;
            int i17 = i16 % 2;
            openContextMenu dividerPadding = jb.setDividerPadding();
            int i18 = f56623a;
            int i19 = ((i18 ^ 43) | (i18 & 43)) << 1;
            int i20 = -(((~i18) & 43) | (i18 & (-44)));
            int i21 = (i19 & i20) + (i20 | i19);
            f56624b = i21 % 128;
            if (i21 % 2 != 0) {
                return dividerPadding;
            }
            throw null;
        }

        @JvmName(name = "setX")
        @NotNull
        public static openContextMenu<jb> setX() {
            return (openContextMenu) setDividerPadding(new Object[0], 1746259235, -1746259235, (int) System.currentTimeMillis());
        }
    }

    public static final class setY extends openContextMenu<jb> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f56625f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f56626g = 1;

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            if ((((~(i11 | (~i12))) | (~(i13 | i11))) * Opcodes.ATHROW) + ((i10 | (~(i11 | i12))) * Opcodes.ATHROW) + (i13 * (-191)) + (i11 * 192) + (i10 * (-381)) != 1) {
                jb jbVar = (jb) objArr[0];
                int i14 = f56625f;
                int i15 = (i14 ^ 19) + ((i14 & 19) << 1);
                f56626g = i15 % 128;
                int i16 = i15 % 2;
                Intrinsics.checkNotNullParameter(jbVar, "");
                byte compoundDrawableTintBlendMode = jbVar.setCompoundDrawableTintBlendMode();
                int i17 = f56625f;
                int i18 = ((-1) << 1) - ((-1) ^ ((i17 & 70) + (i17 | 70)));
                f56626g = i18 % 128;
                int i19 = i18 % 2;
                return Byte.valueOf(compoundDrawableTintBlendMode);
            }
            Enum r3 = (Enum) objArr[1];
            int i20 = f56626g;
            int i21 = ((i20 & (-50)) | ((~i20) & 49)) + ((i20 & 49) << 1);
            f56625f = i21 % 128;
            int i22 = i21 % 2;
            byte bByteValue = ((Byte) setX(new Object[]{(jb) r3}, -196539532, 196539532, (int) System.currentTimeMillis())).byteValue();
            int i23 = f56626g;
            int i24 = i23 & 77;
            int i25 = i24 + ((i23 ^ 77) | i24);
            f56625f = i25 % 128;
            int i26 = i25 % 2;
            return Byte.valueOf(bByteValue);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setX(new Object[]{this, r4}, 445389537, -445389536, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        jb[] jbVarArr;
        jb jbVar = new jb("UNKNOWN", 0, (byte) 0);
        getNavBarTitleString = jbVar;
        jb jbVar2 = new jb("MOBILE_CVM_PERFORMED", 1, (byte) 1);
        setCompoundDrawableTintBlendMode = jbVar2;
        jb jbVar3 = new jb("NO_CVM_PERFORMED", 2, (byte) 63);
        setOnFocusChangeListener = jbVar3;
        setOnDragListener = 25 % 128;
        if (25 % 2 == 0) {
            jbVarArr = new jb[2];
            jbVarArr[1] = jbVar;
            jbVarArr[0] = jbVar2;
            jbVarArr[3] = jbVar3;
        } else {
            jbVarArr = new jb[]{jbVar, jbVar2, jbVar3};
        }
        setNavigationOnClickListener = jbVarArr;
        INSTANCE = new Companion(null);
        setY = new setY(values(), getNavBarTitleString);
        int i10 = setLayoutAnimation;
        int i11 = (((i10 | 74) << 1) - (i10 ^ 74)) - 1;
        setOnDragListener = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 3 / 0;
        }
    }

    public jb(String str, int i10, byte b10) {
        super(str, i10);
        this.setDividerPadding = b10;
    }

    public static final /* synthetic */ openContextMenu setDividerPadding() {
        System.currentTimeMillis();
        System.currentTimeMillis();
        openContextMenu<jb> opencontextmenu = setY;
        int i10 = setOnDragListener;
        int i11 = i10 ^ 47;
        int i12 = -(-((i10 & 47) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setLayoutAnimation = i13 % 128;
        int i14 = i13 % 2;
        return opencontextmenu;
    }

    public static jb valueOf(String str) {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 9;
        int i12 = i11 + ((i10 ^ 9) | i11);
        setOnDragListener = i12 % 128;
        if (i12 % 2 != 0) {
            return (jb) Enum.valueOf(jb.class, str);
        }
        Enum.valueOf(jb.class, str);
        throw null;
    }

    public static jb[] values() {
        int i10 = setOnDragListener;
        int i11 = i10 & 47;
        int i12 = (i11 - (~(-(-((i10 ^ 47) | i11))))) - 1;
        setLayoutAnimation = i12 % 128;
        int i13 = i12 % 2;
        jb[] jbVarArr = setNavigationOnClickListener;
        if (i13 == 0) {
            return (jb[]) jbVarArr.clone();
        }
        int i14 = 22 / 0;
        return (jb[]) jbVarArr.clone();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final byte setCompoundDrawableTintBlendMode() {
        int i10 = setOnDragListener;
        int i11 = i10 + 125;
        setLayoutAnimation = i11 % 128;
        int i12 = i11 % 2;
        byte b10 = this.setDividerPadding;
        int i13 = ((-1) << 1) - ((-1) ^ ((i10 ^ 42) + ((i10 & 42) << 1)));
        setLayoutAnimation = i13 % 128;
        if (i13 % 2 == 0) {
            return b10;
        }
        throw null;
    }
}
