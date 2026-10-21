package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\bj\u0002\b\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/setTransitionVisibility;", "", "", "toString", "()Ljava/lang/String;", "", "setNavigationOnClickListener", "B", "setX", "()B", "setY", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setDividerPadding", "getNavBarTitleString", "setLayoutAnimation", "setOnDragListener"}, k = 1, mv = {1, 5, 1})
public final class setTransitionVisibility {
    private static int UiMessageCallbackKtWhenMappings = 1;
    public static final setTransitionVisibility getNavBarTitleString;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final setTransitionVisibility setDividerPadding;
    private static final /* synthetic */ setTransitionVisibility[] setIncludeFontPadding;
    public static final setTransitionVisibility setLayoutAnimation;
    public static final setTransitionVisibility setOnDragListener;
    public static final setTransitionVisibility setOnFocusChangeListener;

    @NotNull
    private static final openContextMenu<setTransitionVisibility> setOnLongClickListener;
    public static final setTransitionVisibility setX;
    public static final setTransitionVisibility setY;
    private static int setZ;

    /* JADX INFO: renamed from: setNavigationOnClickListener, reason: from kotlin metadata */
    private final byte setY;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setTransitionVisibility$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setTransitionVisibility$setCompoundDrawableTintBlendMode;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/setTransitionVisibility;", "setOnLongClickListener", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            return setTransitionVisibility.setDividerPadding();
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static openContextMenu<setTransitionVisibility> setOnFocusChangeListener() {
            return (openContextMenu) setCompoundDrawableTintBlendMode(new Object[0], -1720268721, 1720268721, (int) System.currentTimeMillis());
        }
    }

    public static final class setOnFocusChangeListener extends openContextMenu<setTransitionVisibility> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f60792f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f60793g = 1;

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            byte bByteValue;
            int i13 = (i11 * (-755)) + (i10 * (-755));
            int i14 = ~((~i10) | (~i11));
            int i15 = i10 | i11;
            int i16 = ((~(i15 | i12)) | i14) * (-756);
            if (((i15 | (~i12)) * 756) + i16 + (i14 * 1512) + i13 == 1) {
                setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[0];
                int i17 = f60792f;
                int i18 = (i17 & 87) + (i17 | 87);
                f60793g = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(settransitionvisibility, "");
                byte x4 = settransitionvisibility.setX();
                int i20 = f60792f;
                int i21 = i20 ^ 25;
                int i22 = (((i20 & 25) | i21) << 1) - i21;
                f60793g = i22 % 128;
                if (i22 % 2 != 0) {
                    return Byte.valueOf(x4);
                }
                throw null;
            }
            Enum r3 = (Enum) objArr[1];
            int i23 = f60793g;
            int i24 = i23 & 57;
            int i25 = -(-((i23 ^ 57) | i24));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f60792f = i26 % 128;
            setTransitionVisibility settransitionvisibility2 = (setTransitionVisibility) r3;
            Object[] objArr2 = new Object[1];
            if (i26 % 2 != 0) {
                objArr2[0] = settransitionvisibility2;
                bByteValue = ((Byte) setX(objArr2, 324578855, -324578854, (int) System.currentTimeMillis())).byteValue();
                int i27 = 16 / 0;
            } else {
                objArr2[0] = settransitionvisibility2;
                bByteValue = ((Byte) setX(objArr2, 324578855, -324578854, (int) System.currentTimeMillis())).byteValue();
            }
            return Byte.valueOf(bByteValue);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setX(new Object[]{this, r4}, -723609175, 723609175, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        setTransitionVisibility settransitionvisibility = new setTransitionVisibility("NO_CVM", 0, (byte) 0);
        setOnFocusChangeListener = settransitionvisibility;
        setTransitionVisibility settransitionvisibility2 = new setTransitionVisibility("OBTAIN_SIGNATURE", 1, (byte) 16);
        setX = settransitionvisibility2;
        setTransitionVisibility settransitionvisibility3 = new setTransitionVisibility(ExpectedUserActionOnPoiTypes.ONLINE_PIN, 2, (byte) 32);
        setY = settransitionvisibility3;
        setTransitionVisibility settransitionvisibility4 = new setTransitionVisibility("CONFIRMATION_CODE_VERIFIED", 3, (byte) 48);
        setDividerPadding = settransitionvisibility4;
        setTransitionVisibility settransitionvisibility5 = new setTransitionVisibility("OFFLINE_PIN", 4, (byte) 64);
        getNavBarTitleString = settransitionvisibility5;
        setTransitionVisibility settransitionvisibility6 = new setTransitionVisibility("COMBO", 5, Constants.CVR_B1b85_0101_MOBILE_APP);
        setLayoutAnimation = settransitionvisibility6;
        setTransitionVisibility settransitionvisibility7 = new setTransitionVisibility("N_A", 6, Constants.CVR_B2b8765_1111_APP_DISABLED);
        setOnDragListener = settransitionvisibility7;
        int i10 = ((1 ^ 66) + ((1 & 66) << 1)) - 1;
        int i11 = i10 % 128;
        setZ = i11;
        int i12 = i10 % 2;
        setTransitionVisibility[] settransitionvisibilityArr = {settransitionvisibility, settransitionvisibility2, settransitionvisibility3, settransitionvisibility4, settransitionvisibility5, settransitionvisibility6, settransitionvisibility7};
        int i13 = (i11 & (-68)) | ((~i11) & 67);
        int i14 = -(-((i11 & 67) << 1));
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        UiMessageCallbackKtWhenMappings = i15 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i15 % 2 == 0) {
            throw null;
        }
        setIncludeFontPadding = settransitionvisibilityArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        setOnLongClickListener = new setOnFocusChangeListener(values(), 16);
        int i16 = setZ;
        int i17 = i16 & 121;
        int i18 = (i16 | 121) & (~i17);
        int i19 = i17 << 1;
        int i20 = (i18 & i19) + (i18 | i19);
        UiMessageCallbackKtWhenMappings = i20 % 128;
        int i21 = i20 % 2;
    }

    public setTransitionVisibility(String str, int i10, byte b10) {
        super(str, i10);
        this.setY = b10;
    }

    public static final /* synthetic */ openContextMenu setDividerPadding() {
        int i10 = setZ;
        int i11 = ((i10 & (-30)) | ((~i10) & 29)) + ((i10 & 29) << 1);
        UiMessageCallbackKtWhenMappings = i11 % 128;
        if (i11 % 2 != 0) {
            return setOnLongClickListener;
        }
        throw null;
    }

    public static setTransitionVisibility valueOf(String str) {
        int i10 = UiMessageCallbackKtWhenMappings;
        int i11 = i10 & 115;
        int i12 = (i11 - (~(-(-((i10 ^ 115) | i11))))) - 1;
        setZ = i12 % 128;
        int i13 = i12 % 2;
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) Enum.valueOf(setTransitionVisibility.class, str);
        int i14 = setZ;
        int i15 = i14 & 39;
        int i16 = (i15 - (~((i14 ^ 39) | i15))) - 1;
        UiMessageCallbackKtWhenMappings = i16 % 128;
        int i17 = i16 % 2;
        return settransitionvisibility;
    }

    public static setTransitionVisibility[] values() {
        int i10 = setZ;
        int i11 = i10 & 117;
        int i12 = (i11 - (~(-(-((i10 ^ 117) | i11))))) - 1;
        UiMessageCallbackKtWhenMappings = i12 % 128;
        int i13 = i12 % 2;
        setTransitionVisibility[] settransitionvisibilityArr = (setTransitionVisibility[]) setIncludeFontPadding.clone();
        int i14 = UiMessageCallbackKtWhenMappings;
        int i15 = ((i14 & 50) + (i14 | 50)) - 1;
        setZ = i15 % 128;
        if (i15 % 2 == 0) {
            return settransitionvisibilityArr;
        }
        throw null;
    }

    @JvmName(name = "setX")
    public final byte setX() {
        int i10 = setZ;
        int i11 = i10 & 63;
        int i12 = (i11 - (~((i10 ^ 63) | i11))) - 1;
        UiMessageCallbackKtWhenMappings = i12 % 128;
        int i13 = i12 % 2;
        byte b10 = this.setY;
        int i14 = ((i10 ^ 55) | (i10 & 55)) << 1;
        int i15 = -(((~i10) & 55) | (i10 & (-56)));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        UiMessageCallbackKtWhenMappings = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 95 / 0;
        }
        return b10;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setZ;
        int i11 = (i10 & 59) + (i10 | 59);
        UiMessageCallbackKtWhenMappings = i11 % 128;
        if (i11 % 2 == 0) {
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
            throw null;
        }
        setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
        int i12 = setZ;
        int i13 = i12 & 93;
        int i14 = -(-((i12 ^ 93) | i13));
        int i15 = (i13 & i14) + (i14 | i13);
        UiMessageCallbackKtWhenMappings = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 2 / 0;
        }
        return "";
    }
}
