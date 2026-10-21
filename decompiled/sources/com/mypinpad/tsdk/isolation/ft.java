package com.mypinpad.tsdk.isolation;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u0005j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/ft;", "", "", "setOnDragListener", "B", "setOnFocusChangeListener", "()B", "setCompoundDrawableTintBlendMode", "UiMessageCallbackKtWhenMappings", "setIncludeFontPadding", "setTextAlignment", "setAlwaysDrawnWithCacheEnabled", "setOnEditorActionListener", "setCompoundDrawablePadding", "setDividerPadding", "setY", "setX", "getNavBarTitleString", "setLayoutAnimation", "setNavigationOnClickListener", "setOnLongClickListener", "setChildDivider"}, k = 1, mv = {1, 5, 1})
public enum ft {
    ATTENDED_ONLINE_ONLY_MERCHANTS((byte) 33),
    ATTENDED_OFFLINE_WITH_ONLINE_CAPABILITY_MERCHANTS((byte) 34),
    ATTENDED_OFFLINE_ONLY_MERCHANTS((byte) 35),
    UNATTENDED_ONLINE_ONLY_VENDING_MACHINES(DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE),
    UNATTENDED_OFFLINE_WITH_ONLINE_CAPABILITY_VENDING_MACHINES((byte) 37),
    UNATTENDED_OFFLINE_ONLY_VENDING_MACHINES(GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH),
    ATTENDED_ONLINE_ONLY_NOT_RECOMMENDED_IN_TRANSIT((byte) -111),
    ATTENDED_OFFLINE_WITH_ONLINE_CAPABILITY_TRANSIT_WITH_CONDUCTOR((byte) -110),
    ATTENDED_OFFLINE_WITH_ONLINE_CAPABILITY_FARE_ADJUSTMENT_TERMINAL((byte) -109),
    ATTENDED_OFFLINE_ONLY_TRANSIT_WITH_CONDUCTOR((byte) -108),
    UNATTENDED_ONLINE_ONLY_NOT_RECOMMENDED_IN_TRANSIT((byte) -107),
    UNATTENDED_OFFLINE_WITH_ONLINE_CAPABILITY_TRANSIT_WITHOUT_CONDUCTOR((byte) -106),
    UNATTENDED_OFFLINE_WITH_ONLINE_CAPABILITY_FARE_ADJUSTMENT_TERMINAL((byte) -105),
    UNATTENDED_OFFLINE_ONLY_TRANSIT_WITHOUT_CONDUCTOR((byte) -104),
    UNKNOWN((byte) -1);


    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setMaxEms = 1;
    private static int setTextScaleX;

    @NotNull
    private static final openContextMenu<ft> setZ;

    /* JADX INFO: renamed from: setOnDragListener, reason: from kotlin metadata */
    private final byte setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.ft$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/ft$setCompoundDrawableTintBlendMode;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/ft;", "setZ", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "setY", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setDividerPadding")
        @NotNull
        public static openContextMenu<ft> setDividerPadding() {
            return (openContextMenu) setX(new Object[0], 909111607, -909111607, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            return ft.setY();
        }
    }

    public static final class setDividerPadding extends openContextMenu<ft> {
        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
            int i14 = ~i11;
            int i15 = ~(i14 | i10);
            int i16 = ~(i10 | i12);
            int i17 = ((i15 | i16) * (-814)) + i13;
            int i18 = ~(i14 | (~i12));
            int i19 = ~i10;
            int i20 = ~(i19 | i11);
            if ((((~(i19 | i12)) | i20 | (~(i11 | i12))) * 407) + ((i18 | i20 | i16) * 407) + i17 != 1) {
                return Byte.valueOf(((Byte) setY(new Object[]{(ft) ((Enum) objArr[1])}, -957149076, 957149077, (int) System.currentTimeMillis())).byteValue());
            }
            ft ftVar = (ft) objArr[0];
            Intrinsics.checkNotNullParameter(ftVar, "");
            return Byte.valueOf(ftVar.setOnFocusChangeListener());
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setY(new Object[]{this, r4}, 651884038, -651884038, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        int i10 = 16 - 1;
        int i11 = i10 % 128;
        setMaxEms = i11;
        int i12 = i10 % 2;
        int i13 = (i11 & (-88)) | ((~i11) & 87);
        int i14 = (i11 & 87) << 1;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        setTextScaleX = i15 % 128;
        int i16 = i15 % 2;
        INSTANCE = new Companion(null);
        setZ = new setDividerPadding(valuesCustom(), UNKNOWN);
        int i17 = setTextScaleX;
        int i18 = (((i17 | 8) << 1) - (i17 ^ 8)) - 1;
        setMaxEms = i18 % 128;
        int i19 = i18 % 2;
    }

    ft(byte b10) {
        this.setCompoundDrawableTintBlendMode = b10;
    }

    public static final /* synthetic */ openContextMenu setY() {
        int i10 = setTextScaleX;
        int i11 = (((i10 | 102) << 1) - (i10 ^ 102)) - 1;
        setMaxEms = i11 % 128;
        int i12 = i11 % 2;
        openContextMenu<ft> opencontextmenu = setZ;
        if (i12 == 0) {
            int i13 = 84 / 0;
        }
        return opencontextmenu;
    }

    public static ft valueOf(String str) {
        int i10 = setMaxEms;
        int i11 = ((i10 ^ 5) - (~((i10 & 5) << 1))) - 1;
        setTextScaleX = i11 % 128;
        if (i11 % 2 == 0) {
            return (ft) Enum.valueOf(ft.class, str);
        }
        Enum.valueOf(ft.class, str);
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ft[] valuesCustom() {
        int i10 = setMaxEms;
        int i11 = (i10 ^ 39) + ((i10 & 39) << 1);
        setTextScaleX = i11 % 128;
        int i12 = i11 % 2;
        ft[] ftVarArr = (ft[]) values().clone();
        int i13 = setTextScaleX;
        int i14 = i13 & 17;
        int i15 = (i13 | 17) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        setMaxEms = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 54 / 0;
        }
        return ftVarArr;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final byte setOnFocusChangeListener() {
        int i10 = setTextScaleX;
        int i11 = i10 & 3;
        int i12 = i11 + ((i10 ^ 3) | i11);
        setMaxEms = i12 % 128;
        int i13 = i12 % 2;
        byte b10 = this.setCompoundDrawableTintBlendMode;
        int i14 = ((-1) << 1) - ((i10 + 34) ^ (-1));
        setMaxEms = i14 % 128;
        int i15 = i14 % 2;
        return b10;
    }
}
