package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/mypinpad/tsdk/i/fw;", "", "", "toString", "()Ljava/lang/String;", "", "setX", "B", "()B", "setOnFocusChangeListener", "setDividerPadding", "setY", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class fw {
    private static fw setCompoundDrawableTintBlendMode = null;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setLayoutAnimation = 0;
    private static final /* synthetic */ fw[] setNavigationOnClickListener;

    @NotNull
    private static final openContextMenu<fw> setOnFocusChangeListener;
    private static int setOnLongClickListener = 1;
    public static final fw setY;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    private final byte setOnFocusChangeListener;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.fw$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/fw$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/fw;", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setY", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55583a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55584b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f55584b;
            int i14 = i13 & 21;
            int i15 = (i13 | 21) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            f55583a = i17 % 128;
            if (i17 % 2 != 0) {
                fw.setY();
                throw null;
            }
            openContextMenu y7 = fw.setY();
            int i18 = f55583a + 5;
            f55584b = i18 % 128;
            int i19 = i18 % 2;
            return y7;
        }

        @JvmName(name = "setY")
        @NotNull
        public static openContextMenu<fw> setY() {
            return (openContextMenu) setX(new Object[0], -1048160494, 1048160494, (int) System.currentTimeMillis());
        }
    }

    public static final class setY extends openContextMenu<fw> {
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i12;
            if ((((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559)) == 1) {
                return Byte.valueOf(((Byte) setDividerPadding(new Object[]{(fw) ((Enum) objArr[1])}, 1569870803, -1569870803, (int) System.currentTimeMillis())).byteValue());
            }
            fw fwVar = (fw) objArr[0];
            Intrinsics.checkNotNullParameter(fwVar, "");
            return Byte.valueOf(fwVar.setX());
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setDividerPadding(new Object[]{this, r4}, 1720988640, -1720988639, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        fw fwVar = new fw("BYTE2", 0, (byte) 4);
        setY = fwVar;
        fw fwVar2 = new fw("UNKNOWN", 1, (byte) 0);
        setCompoundDrawableTintBlendMode = fwVar2;
        int i10 = 5 % 128;
        setOnLongClickListener = i10;
        int i11 = 5 % 2;
        fw[] fwVarArr = {fwVar, fwVar2};
        int i12 = ((i10 | 94) << 1) - (i10 ^ 94);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        setLayoutAnimation = i13 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i13 % 2 != 0) {
            throw null;
        }
        setNavigationOnClickListener = fwVarArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        setOnFocusChangeListener = new setY(values(), setCompoundDrawableTintBlendMode);
        int i14 = setLayoutAnimation;
        int i15 = i14 & 27;
        int i16 = ((i14 ^ 27) | i15) << 1;
        int i17 = -((i14 | 27) & (~i15));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        setOnLongClickListener = i18 % 128;
        int i19 = i18 % 2;
    }

    public fw(String str, int i10, byte b10) {
        super(str, i10);
        this.setOnFocusChangeListener = b10;
    }

    public static final /* synthetic */ openContextMenu setY() {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 33;
        int i12 = (i10 ^ 33) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        setOnLongClickListener = i14;
        int i15 = i13 % 2;
        openContextMenu<fw> opencontextmenu = setOnFocusChangeListener;
        int i16 = i14 ^ 77;
        int i17 = (i14 & 77) << 1;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        setLayoutAnimation = i18 % 128;
        int i19 = i18 % 2;
        return opencontextmenu;
    }

    public static fw valueOf(String str) {
        int i10 = setLayoutAnimation;
        int i11 = ((i10 ^ 75) - (~(-(-((i10 & 75) << 1))))) - 1;
        setOnLongClickListener = i11 % 128;
        if (i11 % 2 == 0) {
            Enum.valueOf(fw.class, str);
            throw null;
        }
        fw fwVar = (fw) Enum.valueOf(fw.class, str);
        int i12 = setLayoutAnimation;
        int i13 = i12 & 67;
        int i14 = (i12 | 67) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        setOnLongClickListener = i16 % 128;
        if (i16 % 2 != 0) {
            return fwVar;
        }
        throw null;
    }

    public static fw[] values() {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 111;
        int i12 = -(-((i10 ^ 111) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        setOnLongClickListener = i13 % 128;
        int i14 = i13 % 2;
        fw[] fwVarArr = setNavigationOnClickListener;
        if (i14 != 0) {
            return (fw[]) fwVarArr.clone();
        }
        int i15 = 29 / 0;
        return (fw[]) fwVarArr.clone();
    }

    @JvmName(name = "setX")
    public final byte setX() {
        int i10 = setOnLongClickListener;
        int i11 = i10 & 33;
        int i12 = (i10 ^ 33) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setLayoutAnimation = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setOnFocusChangeListener;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 57;
        int i12 = (i10 ^ 57) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setOnLongClickListener = i13 % 128;
        if (i13 % 2 == 0) {
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
            int i14 = 54 / 0;
        } else {
            setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
        }
        int i15 = setLayoutAnimation;
        int i16 = i15 ^ 73;
        int i17 = -(-((i15 & 73) << 1));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        setOnLongClickListener = i18 % 128;
        int i19 = i18 % 2;
        return "";
    }
}
