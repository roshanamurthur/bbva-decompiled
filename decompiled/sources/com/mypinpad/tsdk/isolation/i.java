package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\f"}, d2 = {"Lcom/mypinpad/tsdk/i/i;", "", "", "toString", "()Ljava/lang/String;", "", "setY", "B", "setOnFocusChangeListener", "()B", "setX", "setCompoundDrawableTintBlendMode", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public enum i {
    N_A;

    private static int setOnLongClickListener = 1;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    private final byte setX = Constants.CVR_B2b8765_1111_APP_DISABLED;
    private static int setNavigationOnClickListener = 40;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final openContextMenu<i> setX = new setOnFocusChangeListener(valuesCustom(), 43);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.i$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/i$setCompoundDrawableTintBlendMode;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/i;", "setX", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setY", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setDividerPadding", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            return i.setCompoundDrawableTintBlendMode();
        }

        @JvmName(name = "setY")
        @NotNull
        public static openContextMenu<i> setY() {
            return (openContextMenu) setCompoundDrawableTintBlendMode(new Object[0], -264606879, 264606879, (int) System.currentTimeMillis());
        }
    }

    public static final class setOnFocusChangeListener extends openContextMenu<i> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f56315f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f56316g = 1;

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            byte bByteValue;
            int i13 = ~i11;
            int i14 = ~(i13 | i10);
            int i15 = ~i12;
            int i16 = ~(i15 | i10);
            if (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711)) == 1) {
                i iVar = (i) objArr[0];
                int i17 = f56315f;
                int i18 = i17 & 67;
                int i19 = ((((i17 ^ 67) | i18) << 1) - (~(-((i17 | 67) & (~i18))))) - 1;
                f56316g = i19 % 128;
                if (i19 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(iVar, "");
                    iVar.setOnFocusChangeListener();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(iVar, "");
                byte onFocusChangeListener = iVar.setOnFocusChangeListener();
                int i20 = f56316g;
                int i21 = (((i20 ^ 117) | (i20 & 117)) << 1) - (((~i20) & 117) | (i20 & (-118)));
                f56315f = i21 % 128;
                if (i21 % 2 == 0) {
                    return Byte.valueOf(onFocusChangeListener);
                }
                throw null;
            }
            Enum r10 = (Enum) objArr[1];
            int i22 = f56315f;
            int i23 = i22 & 57;
            int i24 = ((i22 ^ 57) | i23) << 1;
            int i25 = -((i22 | 57) & (~i23));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f56316g = i26 % 128;
            i iVar2 = (i) r10;
            if (i26 % 2 == 0) {
                bByteValue = ((Byte) setCompoundDrawableTintBlendMode(new Object[]{iVar2}, -66573986, 66573987, (int) System.currentTimeMillis())).byteValue();
                int i27 = 33 / 0;
            } else {
                bByteValue = ((Byte) setCompoundDrawableTintBlendMode(new Object[]{iVar2}, -66573986, 66573987, (int) System.currentTimeMillis())).byteValue();
            }
            int i28 = f56316g;
            int i29 = i28 & 89;
            int i30 = (i28 ^ 89) | i29;
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            f56315f = i31 % 128;
            int i32 = i31 % 2;
            return Byte.valueOf(bByteValue);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setCompoundDrawableTintBlendMode(new Object[]{this, r4}, 452910889, -452910889, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        int i10 = setNavigationOnClickListener;
        int i11 = i10 & 47;
        int i12 = (i10 ^ 47) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setOnLongClickListener = i13 % 128;
        int i14 = i13 % 2;
    }

    public static final /* synthetic */ openContextMenu setCompoundDrawableTintBlendMode() {
        int i10 = setNavigationOnClickListener;
        int i11 = ((i10 ^ 79) | (i10 & 79)) << 1;
        int i12 = -(((~i10) & 79) | (i10 & (-80)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setOnLongClickListener = i13 % 128;
        if (i13 % 2 != 0) {
            return setX;
        }
        throw null;
    }

    public static i valueOf(String str) {
        int i10 = setNavigationOnClickListener;
        int i11 = ((i10 & 32) + (i10 | 32)) - 1;
        setOnLongClickListener = i11 % 128;
        if (i11 % 2 == 0) {
            Enum.valueOf(i.class, str);
            throw null;
        }
        i iVar = (i) Enum.valueOf(i.class, str);
        int i12 = setNavigationOnClickListener;
        int i13 = i12 & 37;
        int i14 = i12 | 37;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        setOnLongClickListener = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 77 / 0;
        }
        return iVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        int i10 = setNavigationOnClickListener;
        int i11 = ((-1) << 1) - ((((i10 | 48) << 1) - (i10 ^ 48)) ^ (-1));
        setOnLongClickListener = i11 % 128;
        int i12 = i11 % 2;
        i[] iVarArr = (i[]) values().clone();
        int i13 = setNavigationOnClickListener;
        int i14 = (((i13 ^ 67) | (i13 & 67)) << 1) - (((~i13) & 67) | (i13 & (-68)));
        setOnLongClickListener = i14 % 128;
        if (i14 % 2 != 0) {
            return iVarArr;
        }
        throw null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final byte setOnFocusChangeListener() {
        int i10 = setOnLongClickListener;
        int i11 = i10 + 97;
        setNavigationOnClickListener = i11 % 128;
        int i12 = i11 % 2;
        byte b10 = this.setX;
        int i13 = i10 ^ 43;
        int i14 = ((i10 & 43) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        setNavigationOnClickListener = i16 % 128;
        int i17 = i16 % 2;
        return b10;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setNavigationOnClickListener + 71;
        setOnLongClickListener = i10 % 128;
        if (i10 % 2 == 0) {
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
            int i11 = 5 / 0;
        } else {
            setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
        }
        int i12 = setNavigationOnClickListener;
        int i13 = (i12 & 125) + (i12 | 125);
        setOnLongClickListener = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 35 / 0;
        }
        return "";
    }
}
