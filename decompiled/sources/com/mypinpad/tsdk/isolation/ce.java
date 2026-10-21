package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\u0005j\u0002\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/ce;", "", "", "setCompoundDrawableTintBlendMode", "B", "setDividerPadding", "()B", "setY", "setOnFocusChangeListener", "setX"}, k = 1, mv = {1, 5, 1})
public final class ce {
    private static final /* synthetic */ ce[] getNavBarTitleString;
    public static final ce setDividerPadding;
    private static int setLayoutAnimation = 1;
    private static int setOnDragListener;
    public static final ce setOnFocusChangeListener;

    @NotNull
    private static final openContextMenu<ce> setOnLongClickListener;
    public static final ce setX;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final byte setCompoundDrawableTintBlendMode;

    public static final class setCompoundDrawableTintBlendMode extends openContextMenu<ce> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f54820f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f54821g = 1;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            byte bByteValue;
            int i13 = (i11 * (-667)) + (i10 * (-1335));
            int i14 = ~i11;
            int i15 = i10 | i12;
            if (((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13 != 1) {
                ce ceVar = (ce) objArr[0];
                int i16 = f54821g + 17;
                f54820f = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(ceVar, "");
                byte dividerPadding = ceVar.setDividerPadding();
                int i18 = f54821g;
                int i19 = i18 & 27;
                int i20 = (i18 ^ 27) | i19;
                int i21 = (i19 & i20) + (i20 | i19);
                f54820f = i21 % 128;
                int i22 = i21 % 2;
                return Byte.valueOf(dividerPadding);
            }
            Enum r3 = (Enum) objArr[1];
            int i23 = f54821g;
            int i24 = i23 ^ 27;
            int i25 = ((i23 & 27) | i24) << 1;
            int i26 = -i24;
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            f54820f = i27 % 128;
            ce ceVar2 = (ce) r3;
            Object[] objArr2 = new Object[1];
            if (i27 % 2 != 0) {
                objArr2[0] = ceVar2;
                bByteValue = ((Byte) setDividerPadding(objArr2, -1767593758, 1767593758, (int) System.currentTimeMillis())).byteValue();
                int i28 = 77 / 0;
            } else {
                objArr2[0] = ceVar2;
                bByteValue = ((Byte) setDividerPadding(objArr2, -1767593758, 1767593758, (int) System.currentTimeMillis())).byteValue();
            }
            int i29 = f54820f;
            int i30 = (i29 & 101) + (i29 | 101);
            f54821g = i30 % 128;
            if (i30 % 2 != 0) {
                return Byte.valueOf(bByteValue);
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setDividerPadding(new Object[]{this, r4}, -425044152, 425044153, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.ce$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/ce$setY;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/ce;", "setOnLongClickListener", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setY", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setDividerPadding", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            return ce.setCompoundDrawableTintBlendMode();
        }

        @JvmName(name = "setY")
        @NotNull
        public static openContextMenu<ce> setY() {
            return (openContextMenu) setDividerPadding(new Object[0], 2048500521, -2048500521, (int) System.currentTimeMillis());
        }
    }

    static {
        ce[] ceVarArr;
        ce ceVar = new ce("UNKNOWN", 0, (byte) 0);
        setOnFocusChangeListener = ceVar;
        ce ceVar2 = new ce("FAILED", 1, (byte) 1);
        setDividerPadding = ceVar2;
        ce ceVar3 = new ce(NotifyProvisionResult.SUCCESS_RESULT, 2, (byte) 2);
        setX = ceVar3;
        int i10 = 1 - (-85);
        setOnDragListener = i10 % 128;
        if (i10 % 2 != 0) {
            ceVarArr = new ce[2];
            ceVarArr[1] = ceVar;
            ceVarArr[1] = ceVar2;
            ceVarArr[4] = ceVar3;
        } else {
            ceVarArr = new ce[]{ceVar, ceVar2, ceVar3};
        }
        getNavBarTitleString = ceVarArr;
        INSTANCE = new Companion(null);
        setOnLongClickListener = new setCompoundDrawableTintBlendMode(values(), 26);
        int i11 = setLayoutAnimation;
        int i12 = i11 ^ 79;
        int i13 = -(-((i11 & 79) << 1));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        setOnDragListener = i14 % 128;
        int i15 = i14 % 2;
    }

    public ce(String str, int i10, byte b10) {
        super(str, i10);
        this.setCompoundDrawableTintBlendMode = b10;
    }

    public static final /* synthetic */ openContextMenu setCompoundDrawableTintBlendMode() {
        int i10 = setLayoutAnimation;
        int i11 = (i10 | 19) << 1;
        int i12 = -(((~i10) & 19) | (i10 & (-20)));
        int i13 = (i11 & i12) + (i12 | i11);
        setOnDragListener = i13 % 128;
        if (i13 % 2 == 0) {
            return setOnLongClickListener;
        }
        throw null;
    }

    public static ce valueOf(String str) {
        System.currentTimeMillis();
        System.currentTimeMillis();
        ce ceVar = (ce) Enum.valueOf(ce.class, str);
        int i10 = setLayoutAnimation;
        int i11 = i10 & 73;
        int i12 = (i11 - (~(-(-((i10 ^ 73) | i11))))) - 1;
        setOnDragListener = i12 % 128;
        int i13 = i12 % 2;
        return ceVar;
    }

    public static ce[] values() {
        int i10 = setLayoutAnimation;
        int i11 = (i10 | 55) << 1;
        int i12 = -(((~i10) & 55) | (i10 & (-56)));
        int i13 = (i11 & i12) + (i12 | i11);
        setOnDragListener = i13 % 128;
        int i14 = i13 % 2;
        ce[] ceVarArr = getNavBarTitleString;
        if (i14 == 0) {
            return (ce[]) ceVarArr.clone();
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        int i10 = setLayoutAnimation + 117;
        setOnDragListener = i10 % 128;
        if (i10 % 2 == 0) {
            return this.setCompoundDrawableTintBlendMode;
        }
        int i11 = 8 / 0;
        return this.setCompoundDrawableTintBlendMode;
    }
}
