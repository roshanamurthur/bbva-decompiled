package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\fj\u0002\b\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/setDrawSelectorOnTop;", "", "", "toString", "()Ljava/lang/String;", "", "setOnDragListener", "B", "setY", "()B", "setDividerPadding", "setCompoundDrawableTintBlendMode", "setX", "setOnFocusChangeListener", "getNavBarTitleString", "setLayoutAnimation", "setNavigationOnClickListener", "setOnLongClickListener"}, k = 1, mv = {1, 5, 1})
public final class setDrawSelectorOnTop {
    private static final /* synthetic */ setDrawSelectorOnTop[] UiMessageCallbackKtWhenMappings;
    public static final setDrawSelectorOnTop getNavBarTitleString;
    private static int setAlwaysDrawnWithCacheEnabled = 0;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final setDrawSelectorOnTop setDividerPadding;
    public static final setDrawSelectorOnTop setLayoutAnimation;
    public static final setDrawSelectorOnTop setNavigationOnClickListener;
    public static final setDrawSelectorOnTop setOnFocusChangeListener;
    public static final setDrawSelectorOnTop setOnLongClickListener;

    @NotNull
    private static final openContextMenu<setDrawSelectorOnTop> setTextAlignment;
    public static final setDrawSelectorOnTop setX;
    public static final setDrawSelectorOnTop setY;
    private static int setZ = 1;

    /* JADX INFO: renamed from: setOnDragListener, reason: from kotlin metadata */
    private final byte setDividerPadding;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setDrawSelectorOnTop$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setDrawSelectorOnTop$setCompoundDrawableTintBlendMode;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/setDrawSelectorOnTop;", "setTextAlignment", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setY", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            return setDrawSelectorOnTop.setDividerPadding();
        }

        @JvmName(name = "setY")
        @NotNull
        public static openContextMenu<setDrawSelectorOnTop> setY() {
            return (openContextMenu) setX(new Object[0], 89826911, -89826911, (int) System.currentTimeMillis());
        }
    }

    public static final class setDividerPadding extends openContextMenu<setDrawSelectorOnTop> {
        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((i10 | i12) * (-859)) + (i11 * (-858)) + (i10 * 860);
            int i14 = ~i12;
            int i15 = ~(i14 | i10);
            int i16 = ~i10;
            int i17 = ~i11;
            if ((((~(i10 | i17)) | (~(i17 | i14))) * 859) + (((~(i12 | i16 | i17)) | i15) * 859) + i13 != 1) {
                setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[0];
                Intrinsics.checkNotNullParameter(setdrawselectorontop, "");
                return Byte.valueOf(setdrawselectorontop.setY());
            }
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            byte bByteValue = ((Byte) setY(new Object[]{(setDrawSelectorOnTop) ((Enum) objArr[1])}, 314081679, -314081679, (int) System.currentTimeMillis())).byteValue();
            int iIdentityHashCode = System.identityHashCode(setdividerpadding);
            int i18 = iIdentityHashCode & 1078987077;
            int i19 = (i18 | ((~i18) & (iIdentityHashCode | 1078987077))) * 988;
            int i20 = (((-931910579) | i19) << 1) - (i19 ^ (-931910579));
            int i21 = ~iIdentityHashCode;
            int i22 = i21 & 1081715013;
            int i23 = ~(((1081715013 | i21) & (~i22)) | i22);
            int i24 = (((i23 & 923141152) | (923141152 ^ i23)) * (-1976)) + i20;
            int i25 = (-925869089) & iIdentityHashCode;
            int i26 = (iIdentityHashCode | (-925869089)) & (~i25);
            int i27 = ~((i26 & i25) | (i26 ^ i25));
            int i28 = ((~i27) & 1078987077) | ((-1078987078) & i27);
            int i29 = i27 & 1078987077;
            int i30 = (i21 & (-925869089)) | ((~i21) & 925869088);
            int i31 = i21 & 925869088;
            int i32 = -(-(((i29 & i28) | (i28 ^ i29) | (~((i30 & i31) | (i30 ^ i31)))) * 988));
            int i33 = i24 ^ i32;
            int i34 = ((i32 & i24) | i33) << 1;
            int i35 = -i33;
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            int iIdentityHashCode2 = System.identityHashCode(setdividerpadding);
            int i37 = ~iIdentityHashCode2;
            int i38 = (-1803823017) & i37;
            int i39 = (1803823016 & iIdentityHashCode2) | i38;
            int i40 = iIdentityHashCode2 & (-1803823017);
            int i41 = (i40 & i39) | (i39 ^ i40);
            int i42 = ((i41 & 93463343) | (i41 ^ 93463343)) * (-381);
            int i43 = ((-709292782) & i42) + (i42 | (-709292782));
            int i44 = i37 ^ (-1803823017);
            int i45 = ~((i44 & i38) | (i44 ^ i38));
            int i46 = ((~i45) & (-1872111536)) | (1872111535 & i45);
            int i47 = i45 & (-1872111536);
            int i48 = (i47 & i46) | (i46 ^ i47);
            int i49 = i48 & 25174824;
            int i50 = (((i48 | 25174824) & (~i49)) | i49) * 381;
            if (i36 <= (((i43 | i50) << 1) - (i50 ^ i43)) - 939871616) {
                int i51 = 91 / 0;
            }
            return Byte.valueOf(bByteValue);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setY(new Object[]{this, r4}, 809609878, -809609877, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        setDrawSelectorOnTop setdrawselectorontop = new setDrawSelectorOnTop("NOT_SET", 0, (byte) -1);
        setDividerPadding = setdrawselectorontop;
        setDrawSelectorOnTop setdrawselectorontop2 = new setDrawSelectorOnTop("OK", 1, (byte) 0);
        setX = setdrawselectorontop2;
        setDrawSelectorOnTop setdrawselectorontop3 = new setDrawSelectorOnTop("TIME_OUT", 2, (byte) 1);
        setY = setdrawselectorontop3;
        setDrawSelectorOnTop setdrawselectorontop4 = new setDrawSelectorOnTop("STOP", 3, (byte) 2);
        setOnFocusChangeListener = setdrawselectorontop4;
        setDrawSelectorOnTop setdrawselectorontop5 = new setDrawSelectorOnTop("AMOUNT_NOT_PRESENT", 4, (byte) 3);
        getNavBarTitleString = setdrawselectorontop5;
        setDrawSelectorOnTop setdrawselectorontop6 = new setDrawSelectorOnTop("INVALID_AUTHORISATION_DATA", 5, Constants.CVR_B2b8765_1111_APP_DISABLED);
        setLayoutAnimation = setdrawselectorontop6;
        setDrawSelectorOnTop setdrawselectorontop7 = new setDrawSelectorOnTop("ONLINE_DECLINED", 6, (byte) -15);
        setNavigationOnClickListener = setdrawselectorontop7;
        setDrawSelectorOnTop setdrawselectorontop8 = new setDrawSelectorOnTop("FILTERING_SELECTOR_MISMATCH", 7, (byte) -14);
        setOnLongClickListener = setdrawselectorontop8;
        int i10 = ((103 << 1) - (~(-103))) - 1;
        setZ = i10 % 128;
        int i11 = i10 % 2;
        setDrawSelectorOnTop[] setdrawselectorontopArr = {setdrawselectorontop, setdrawselectorontop2, setdrawselectorontop3, setdrawselectorontop4, setdrawselectorontop5, setdrawselectorontop6, setdrawselectorontop7, setdrawselectorontop8};
        int i12 = 0 - (-93);
        setZ = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 67 / 0;
        }
        UiMessageCallbackKtWhenMappings = setdrawselectorontopArr;
        INSTANCE = new Companion(null);
        setTextAlignment = new setDividerPadding(values(), 20);
        int i14 = setZ;
        int i15 = (i14 ^ 113) + ((i14 & 113) << 1);
        setAlwaysDrawnWithCacheEnabled = i15 % 128;
        int i16 = i15 % 2;
    }

    public setDrawSelectorOnTop(String str, int i10, byte b10) {
        super(str, i10);
        this.setDividerPadding = b10;
    }

    public static final /* synthetic */ openContextMenu setDividerPadding() {
        int i10 = setAlwaysDrawnWithCacheEnabled + 53;
        setZ = i10 % 128;
        if (i10 % 2 != 0) {
            return setTextAlignment;
        }
        throw null;
    }

    public static setDrawSelectorOnTop valueOf(String str) {
        int i10 = setZ;
        int i11 = (i10 ^ 69) + ((i10 & 69) << 1);
        setAlwaysDrawnWithCacheEnabled = i11 % 128;
        int i12 = i11 % 2;
        setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) Enum.valueOf(setDrawSelectorOnTop.class, str);
        int i13 = setAlwaysDrawnWithCacheEnabled;
        int i14 = (((i13 | 62) << 1) - (i13 ^ 62)) - 1;
        setZ = i14 % 128;
        int i15 = i14 % 2;
        return setdrawselectorontop;
    }

    public static setDrawSelectorOnTop[] values() {
        int i10 = setZ + 57;
        setAlwaysDrawnWithCacheEnabled = i10 % 128;
        int i11 = i10 % 2;
        setDrawSelectorOnTop[] setdrawselectorontopArr = (setDrawSelectorOnTop[]) UiMessageCallbackKtWhenMappings.clone();
        int i12 = setZ;
        int i13 = i12 & 105;
        int i14 = (i12 ^ 105) | i13;
        int i15 = (i13 & i14) + (i14 | i13);
        setAlwaysDrawnWithCacheEnabled = i15 % 128;
        if (i15 % 2 == 0) {
            return setdrawselectorontopArr;
        }
        throw null;
    }

    @JvmName(name = "setY")
    public final byte setY() {
        int i10 = setAlwaysDrawnWithCacheEnabled;
        int i11 = ((i10 ^ 58) + ((i10 & 58) << 1)) - 1;
        setZ = i11 % 128;
        int i12 = i11 % 2;
        byte b10 = this.setDividerPadding;
        int i13 = ((i10 | 123) << 1) - (((~i10) & 123) | (i10 & (-124)));
        setZ = i13 % 128;
        if (i13 % 2 != 0) {
            return b10;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = ((-1) << 1) - ((setAlwaysDrawnWithCacheEnabled + 126) ^ (-1));
        setZ = i10 % 128;
        int i11 = i10 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i12 = setZ;
        int i13 = (i12 ^ 75) + ((i12 & 75) << 1);
        setAlwaysDrawnWithCacheEnabled = i13 % 128;
        int i14 = i13 % 2;
        return "";
    }
}
