package com.mypinpad.tsdk.isolation;

import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/by;", "", "", "setTextAlignment", "B", "setDividerPadding", "()B", "setOnFocusChangeListener", "setY", "setX", "setCompoundDrawableTintBlendMode", "setNavigationOnClickListener", "setOnDragListener", "setLayoutAnimation", "getNavBarTitleString", "setOnLongClickListener", "UiMessageCallbackKtWhenMappings"}, k = 1, mv = {1, 5, 1})
public enum by {
    FAIL_CVM_PROCESSING((byte) 0),
    PLAINTEXT_PIN_VERIFICATION_PERFORMED_BY_ICC((byte) 1),
    ENCIPHERED_PIN_VERIFIED_ONLINE((byte) 2),
    PLAINTEXT_PIN_VERIFICATION_PERFORMED_BY_ICC_AND_SIGNATURE_PAPER((byte) 3),
    ENCIPHERED_PIN_VERIFICATION_PERFORMED_BY_ICC((byte) 4),
    ENCIPHERED_PIN_VERIFICATION_PERFORMED_BY_ICC_AND_SIGNATURE_PAPER((byte) 5),
    SIGNATURE_PAPER(MessageUtils.MESSAGE_30_RS),
    NO_CVM_REQUIRED((byte) 31),
    RFU((byte) 29),
    UNRECOGNISED_CVM((byte) 63);


    @NotNull
    private static final openContextMenu<by> setAlwaysDrawnWithCacheEnabled;
    private static int setCompoundDrawablePadding = 1;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setZ;

    /* JADX INFO: renamed from: setTextAlignment, reason: from kotlin metadata */
    private final byte setOnFocusChangeListener;

    public static final class setDividerPadding extends openContextMenu<by> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f54741f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f54742g = 1;

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ((~i15) * 497) + (i11 * (-496)) + (i10 * (-496));
            int i17 = ~(i15 | i12);
            int i18 = ~i12;
            if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i18 | i13))) * 497) + ((i17 | (~(i14 | i18 | i10))) * 497) + i16 == 1) {
                Enum r10 = (Enum) objArr[1];
                int i19 = f54742g + 117;
                f54741f = i19 % 128;
                by byVar = (by) r10;
                if (i19 % 2 == 0) {
                    return Byte.valueOf(((Byte) setCompoundDrawableTintBlendMode(new Object[]{byVar}, 1602781042, -1602781042, (int) System.currentTimeMillis())).byteValue());
                }
                ((Byte) setCompoundDrawableTintBlendMode(new Object[]{byVar}, 1602781042, -1602781042, (int) System.currentTimeMillis())).byteValue();
                throw null;
            }
            by byVar2 = (by) objArr[0];
            int i20 = f54741f;
            int i21 = (((i20 ^ 53) | (i20 & 53)) << 1) - (((~i20) & 53) | (i20 & (-54)));
            f54742g = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.checkNotNullParameter(byVar2, "");
            byte dividerPadding = byVar2.setDividerPadding();
            int i23 = f54742g;
            int i24 = i23 & 41;
            int i25 = -(-((i23 ^ 41) | i24));
            int i26 = (i24 & i25) + (i25 | i24);
            f54741f = i26 % 128;
            if (i26 % 2 == 0) {
                return Byte.valueOf(dividerPadding);
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setCompoundDrawableTintBlendMode(new Object[]{this, r4}, -1830832028, 1830832029, System.identityHashCode(this))).byteValue();
        }
    }

    static {
        by byVar = UNRECOGNISED_CVM;
        int i10 = ~0;
        int i11 = 63 & i10;
        int i12 = (i11 << 1) - i11;
        setCompoundDrawablePadding = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 23 & i10;
        int i15 = -(-0);
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        setCompoundDrawablePadding = i16 % 128;
        int i17 = i16 % 2;
        INSTANCE = new Companion(null);
        setAlwaysDrawnWithCacheEnabled = new setDividerPadding(valuesCustom(), byVar);
        int i18 = setCompoundDrawablePadding;
        int i19 = (i18 & 87) + (i18 | 87);
        setZ = i19 % 128;
        int i20 = i19 % 2;
    }

    by(byte b10) {
        this.setOnFocusChangeListener = b10;
    }

    public static final /* synthetic */ openContextMenu setOnFocusChangeListener() {
        int i10 = setZ;
        int i11 = (i10 & 7) + (i10 | 7);
        setCompoundDrawablePadding = i11 % 128;
        if (i11 % 2 != 0) {
            return setAlwaysDrawnWithCacheEnabled;
        }
        throw null;
    }

    public static by valueOf(String str) {
        int i10 = setZ;
        int i11 = (i10 & (-126)) | ((~i10) & 125);
        int i12 = -(-((i10 & 125) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setCompoundDrawablePadding = i13 % 128;
        int i14 = i13 % 2;
        by byVar = (by) Enum.valueOf(by.class, str);
        if (i14 == 0) {
            int i15 = 9 / 0;
        }
        int i16 = setZ;
        int i17 = i16 & 87;
        int i18 = -(-(i16 | 87));
        int i19 = (i17 & i18) + (i18 | i17);
        setCompoundDrawablePadding = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 42 / 0;
        }
        return byVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static by[] valuesCustom() {
        int i10 = setCompoundDrawablePadding;
        int i11 = ((i10 | 57) << 1) - (i10 ^ 57);
        setZ = i11 % 128;
        int i12 = i11 % 2;
        by[] byVarArrValuesCustom = values();
        if (i12 == 0) {
            return (by[]) byVarArrValuesCustom.clone();
        }
        int i13 = 88 / 0;
        return (by[]) byVarArrValuesCustom.clone();
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        int i10 = setCompoundDrawablePadding;
        int i11 = ((-1) << 1) - ((((i10 | 14) << 1) - (i10 ^ 14)) ^ (-1));
        int i12 = i11 % 128;
        setZ = i12;
        int i13 = i11 % 2;
        byte b10 = this.setOnFocusChangeListener;
        int i14 = i12 & 49;
        int i15 = (i14 - (~(-(-((i12 ^ 49) | i14))))) - 1;
        setCompoundDrawablePadding = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 81 / 0;
        }
        return b10;
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.by$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/by$setOnFocusChangeListener;", "", "", "p0", "Lcom/mypinpad/tsdk/i/by;", "setCompoundDrawableTintBlendMode", "(B)Lcom/mypinpad/tsdk/i/by;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~i12;
            if ((((~(i14 | i15)) | i13) * 68) + ((~(i11 | i13 | i15)) * (-68)) + (((~(i10 | i11)) | (~(i13 | i14 | i15)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69) == 1) {
                return by.setOnFocusChangeListener();
            }
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            openContextMenu opencontextmenu = (openContextMenu) setCompoundDrawableTintBlendMode(new Object[0], 1453008430, -1453008429, (int) System.currentTimeMillis());
            return (by) ((Enum) openContextMenu.setOnFocusChangeListener(new Object[]{opencontextmenu, Byte.valueOf(bByteValue)}, 693193897, -693193897, System.identityHashCode(opencontextmenu)));
        }

        @NotNull
        public static by setCompoundDrawableTintBlendMode(byte p4) {
            return (by) setCompoundDrawableTintBlendMode(new Object[]{Byte.valueOf(p4)}, -2066420717, 2066420717, (int) System.currentTimeMillis());
        }
    }
}
