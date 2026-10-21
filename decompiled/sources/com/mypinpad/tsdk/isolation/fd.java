package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/fd;", "", "", "toString", "()Ljava/lang/String;", "", "UiMessageCallbackKtWhenMappings", "B", "setDividerPadding", "()B", "setOnFocusChangeListener", "setX", "setCompoundDrawableTintBlendMode", "setY", "setLayoutAnimation", "setOnDragListener", "getNavBarTitleString", "setOnLongClickListener", "setNavigationOnClickListener"}, k = 1, mv = {1, 5, 1})
public enum fd {
    APPROVED((byte) 16),
    DECLINED((byte) 32),
    ONLINE_REQUEST((byte) 48),
    END_APPLICATION((byte) 64),
    SELECT_NEXT(Constants.CVR_B1b85_0101_MOBILE_APP),
    TRY_ANOTHER_INTERFACE(Constants.CVR_B1b85_0110_TERMINAL),
    TRY_AGAIN(Constants.CVR_B1b85_0111_VERIFIED_CLOUD),
    UI_REQUEST((byte) 116),
    N_A(Constants.CVR_B2b8765_1111_APP_DISABLED);

    private static int setAlwaysDrawnWithCacheEnabled = 0;

    @NotNull
    private static final openContextMenu<fd> setIncludeFontPadding;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setZ = 1;

    /* JADX INFO: renamed from: UiMessageCallbackKtWhenMappings, reason: from kotlin metadata */
    private final byte setOnFocusChangeListener;

    public static final class setCompoundDrawableTintBlendMode extends openContextMenu<fd> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f55514f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f55515g = 1;

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
            int i15 = ~i12;
            int i16 = ~(i15 | i11);
            int i17 = ~(i10 | i11);
            int i18 = i13 | (~i11);
            if (((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14 != 1) {
                fd fdVar = (fd) objArr[0];
                int i19 = f55514f;
                int i20 = (i19 & 87) + (i19 | 87);
                f55515g = i20 % 128;
                if (i20 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fdVar, "");
                    return Byte.valueOf(fdVar.setDividerPadding());
                }
                Intrinsics.checkNotNullParameter(fdVar, "");
                fdVar.setDividerPadding();
                throw null;
            }
            Enum r10 = (Enum) objArr[1];
            int i21 = f55515g;
            int i22 = (i21 | 89) << 1;
            int i23 = -(((~i21) & 89) | (i21 & (-90)));
            int i24 = (i22 & i23) + (i23 | i22);
            f55514f = i24 % 128;
            int i25 = i24 % 2;
            byte bByteValue = ((Byte) setY(new Object[]{(fd) r10}, 1368073288, -1368073288, (int) System.currentTimeMillis())).byteValue();
            int i26 = f55514f;
            int i27 = (i26 & 61) + (i26 | 61);
            f55515g = i27 % 128;
            if (i27 % 2 != 0) {
                return Byte.valueOf(bByteValue);
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setY(new Object[]{this, r4}, 566798438, -566798437, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.fd$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/fd$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/fd;", "setIncludeFontPadding", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setX", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setDividerPadding")
        @NotNull
        public static openContextMenu<fd> setDividerPadding() {
            return (openContextMenu) setX(new Object[0], -1681136479, 1681136479, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            return fd.setX();
        }
    }

    static {
        int i10 = 1 & 81;
        int i11 = ((1 ^ 81) | i10) << 1;
        int i12 = -((~i10) & (1 | 81));
        int i13 = (i11 & i12) + (i11 | i12);
        setAlwaysDrawnWithCacheEnabled = i13 % 128;
        int i14 = i13 % 2;
        int i15 = (1 & 125) + (1 | 125);
        setAlwaysDrawnWithCacheEnabled = i15 % 128;
        int i16 = i15 % 2;
        INSTANCE = new Companion(null);
        setIncludeFontPadding = new setCompoundDrawableTintBlendMode(valuesCustom(), 30);
        int i17 = setAlwaysDrawnWithCacheEnabled;
        int i18 = (((i17 | 23) << 1) - (~(-(((~i17) & 23) | (i17 & (-24)))))) - 1;
        setZ = i18 % 128;
        int i19 = i18 % 2;
    }

    fd(byte b10) {
        this.setOnFocusChangeListener = b10;
    }

    public static final /* synthetic */ openContextMenu setX() {
        int i10 = setAlwaysDrawnWithCacheEnabled;
        int i11 = ((-1) << 1) - ((-1) ^ ((i10 ^ 72) + ((i10 & 72) << 1)));
        setZ = i11 % 128;
        int i12 = i11 % 2;
        openContextMenu<fd> opencontextmenu = setIncludeFontPadding;
        if (i12 == 0) {
            int i13 = 52 / 0;
        }
        return opencontextmenu;
    }

    public static fd valueOf(String str) {
        int i10 = setAlwaysDrawnWithCacheEnabled;
        int i11 = (((i10 ^ 107) | (i10 & 107)) << 1) - (((~i10) & 107) | (i10 & (-108)));
        setZ = i11 % 128;
        if (i11 % 2 != 0) {
            return (fd) Enum.valueOf(fd.class, str);
        }
        Enum.valueOf(fd.class, str);
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static fd[] valuesCustom() {
        int i10 = setAlwaysDrawnWithCacheEnabled;
        int i11 = ((i10 | 67) << 1) - (i10 ^ 67);
        setZ = i11 % 128;
        int i12 = i11 % 2;
        fd[] fdVarArr = (fd[]) values().clone();
        int i13 = setZ;
        int i14 = (i13 ^ 87) + ((i13 & 87) << 1);
        setAlwaysDrawnWithCacheEnabled = i14 % 128;
        int i15 = i14 % 2;
        return fdVarArr;
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        int i10 = setZ + 105;
        int i11 = i10 % 128;
        setAlwaysDrawnWithCacheEnabled = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        byte b10 = this.setOnFocusChangeListener;
        int i12 = i11 + 41;
        setZ = i12 % 128;
        if (i12 % 2 != 0) {
            return b10;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setAlwaysDrawnWithCacheEnabled;
        int i11 = i10 ^ 31;
        int i12 = ((i10 & 31) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        setZ = i14 % 128;
        int i15 = i14 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i16 = setAlwaysDrawnWithCacheEnabled + 69;
        setZ = i16 % 128;
        int i17 = i16 % 2;
        return "";
    }
}
