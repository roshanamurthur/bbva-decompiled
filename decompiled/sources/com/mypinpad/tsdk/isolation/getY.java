package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\u0002X\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\fj\u0002\b\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/getY;", "", "", "toString", "()Ljava/lang/String;", "", "setOnDragListener", "B", "setDividerPadding", "()B", "setX", "setY", "Ljava/lang/String;", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode", "setOnLongClickListener", "setNavigationOnClickListener"}, k = 1, mv = {1, 5, 1})
public final class getY {

    @NotNull
    private static final openContextMenu<getY> getNavBarTitleString;
    private static int setAlwaysDrawnWithCacheEnabled = 1;
    public static final getY setCompoundDrawableTintBlendMode;
    public static final getY setDividerPadding;
    private static int setIncludeFontPadding;
    private static final /* synthetic */ getY[] setLayoutAnimation;
    public static final getY setNavigationOnClickListener;
    public static final getY setOnFocusChangeListener;
    public static final getY setOnLongClickListener;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: setOnDragListener, reason: from kotlin metadata */
    private final byte setX;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public String setOnFocusChangeListener;

    public static final class setDividerPadding extends openContextMenu<getY> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f56007f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f56008g = 1;

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~i12;
            if ((((~(i14 | i15)) | i13) * 68) + ((~(i11 | i13 | i15)) * (-68)) + (((~(i10 | i11)) | (~(i13 | i14 | i15)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69) == 1) {
                Enum r10 = (Enum) objArr[1];
                int i16 = f56008g;
                int i17 = (i16 ^ 97) + ((i16 & 97) << 1);
                f56007f = i17 % 128;
                getY gety = (getY) r10;
                if (i17 % 2 == 0) {
                    return Byte.valueOf(((Byte) setY(new Object[]{gety}, -1711673900, 1711673900, (int) System.currentTimeMillis())).byteValue());
                }
                ((Byte) setY(new Object[]{gety}, -1711673900, 1711673900, (int) System.currentTimeMillis())).byteValue();
                throw null;
            }
            getY gety2 = (getY) objArr[0];
            int i18 = f56007f;
            int i19 = (i18 | 23) << 1;
            int i20 = -(((~i18) & 23) | (i18 & (-24)));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f56008g = i21 % 128;
            if (i21 % 2 == 0) {
                Intrinsics.checkNotNullParameter(gety2, "");
                gety2.setDividerPadding();
                throw null;
            }
            Intrinsics.checkNotNullParameter(gety2, "");
            byte dividerPadding = gety2.setDividerPadding();
            int i22 = f56008g + 15;
            f56007f = i22 % 128;
            int i23 = i22 % 2;
            return Byte.valueOf(dividerPadding);
        }

        @Override // com.mypinpad.tsdk.isolation.openContextMenu
        public final /* synthetic */ byte setOnFocusChangeListener(Enum r4) {
            return ((Byte) setY(new Object[]{this, r4}, 1283946746, -1283946745, System.identityHashCode(this))).byteValue();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.getY$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/getY$setX;", "", "Lcom/mypinpad/tsdk/i/openContextMenu;", "Lcom/mypinpad/tsdk/i/getY;", "getNavBarTitleString", "Lcom/mypinpad/tsdk/i/openContextMenu;", "setX", "()Lcom/mypinpad/tsdk/i/openContextMenu;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f56009a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56010b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setX")
        @NotNull
        public static openContextMenu<getY> setX() {
            return (openContextMenu) setY(new Object[0], -103800918, 103800918, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f56010b;
            int i14 = ((i13 ^ 21) - (~((i13 & 21) << 1))) - 1;
            f56009a = i14 % 128;
            int i15 = i14 % 2;
            openContextMenu compoundDrawableTintBlendMode = getY.setCompoundDrawableTintBlendMode();
            int i16 = f56009a + 47;
            f56010b = i16 % 128;
            int i17 = i16 % 2;
            return compoundDrawableTintBlendMode;
        }
    }

    static {
        getY[] getyArr;
        getY gety = new getY(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, 0, (byte) 0, "not implemented");
        setDividerPadding = gety;
        getY gety2 = new getY("B", 1, (byte) 16, "transmission error, restart kernel");
        setOnFocusChangeListener = gety2;
        getY gety3 = new getY("C", 2, (byte) 32, "kernel wants to end and have preprocessing select another application if there is one");
        setCompoundDrawableTintBlendMode = gety3;
        getY gety4 = new getY("D", 3, (byte) 48, "not implemented");
        setOnLongClickListener = gety4;
        getY gety5 = new getY("N_A", 4, Constants.CVR_B2b8765_1111_APP_DISABLED, "no error");
        setNavigationOnClickListener = gety5;
        int i10 = (1 & 7) + (1 | 7);
        setIncludeFontPadding = i10 % 128;
        if (i10 % 2 != 0) {
            getyArr = new getY[3];
            getyArr[1] = gety;
            getyArr[1] = gety2;
            getyArr[3] = gety3;
            getyArr[4] = gety4;
            getyArr[2] = gety5;
        } else {
            getyArr = new getY[]{gety, gety2, gety3, gety4, gety5};
        }
        setLayoutAnimation = getyArr;
        INSTANCE = new Companion(null);
        getNavBarTitleString = new setDividerPadding(values(), 17);
        int i11 = setIncludeFontPadding;
        int i12 = (i11 & 33) + (i11 | 33);
        setAlwaysDrawnWithCacheEnabled = i12 % 128;
        int i13 = i12 % 2;
    }

    public getY(String str, int i10, byte b10, String str2) {
        super(str, i10);
        this.setX = b10;
        this.setOnFocusChangeListener = str2;
    }

    public static final /* synthetic */ openContextMenu setCompoundDrawableTintBlendMode() {
        int i10 = setAlwaysDrawnWithCacheEnabled;
        int i11 = i10 & 61;
        int i12 = -(-(i10 | 61));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setIncludeFontPadding = i13 % 128;
        int i14 = i13 % 2;
        openContextMenu<getY> opencontextmenu = getNavBarTitleString;
        if (i14 != 0) {
            int i15 = 65 / 0;
        }
        return opencontextmenu;
    }

    public static getY valueOf(String str) {
        int i10 = setIncludeFontPadding + 123;
        setAlwaysDrawnWithCacheEnabled = i10 % 128;
        if (i10 % 2 == 0) {
            Enum.valueOf(getY.class, str);
            throw null;
        }
        getY gety = (getY) Enum.valueOf(getY.class, str);
        int i11 = setAlwaysDrawnWithCacheEnabled;
        int i12 = (((i11 ^ 63) | (i11 & 63)) << 1) - (((~i11) & 63) | (i11 & (-64)));
        setIncludeFontPadding = i12 % 128;
        if (i12 % 2 == 0) {
            return gety;
        }
        throw null;
    }

    public static getY[] values() {
        int i10 = setAlwaysDrawnWithCacheEnabled;
        int i11 = ((((i10 ^ 19) | (i10 & 19)) << 1) - (~(-(((~i10) & 19) | (i10 & (-20)))))) - 1;
        setIncludeFontPadding = i11 % 128;
        int i12 = i11 % 2;
        getY[] getyArr = (getY[]) setLayoutAnimation.clone();
        int i13 = setIncludeFontPadding;
        int i14 = i13 & 45;
        int i15 = ((((i13 ^ 45) | i14) << 1) - (~(-((i13 | 45) & (~i14))))) - 1;
        setAlwaysDrawnWithCacheEnabled = i15 % 128;
        int i16 = i15 % 2;
        return getyArr;
    }

    @JvmName(name = "setDividerPadding")
    public final byte setDividerPadding() {
        int i10 = setAlwaysDrawnWithCacheEnabled;
        int i11 = i10 & 61;
        int i12 = (i10 ^ 61) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        setIncludeFontPadding = i14;
        int i15 = i13 % 2;
        byte b10 = this.setX;
        int i16 = ((i14 & 76) + (i14 | 76)) - 1;
        setAlwaysDrawnWithCacheEnabled = i16 % 128;
        if (i16 % 2 != 0) {
            return b10;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setAlwaysDrawnWithCacheEnabled + 5;
        setIncludeFontPadding = i10 % 128;
        int i11 = i10 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i12 = setIncludeFontPadding + 119;
        setAlwaysDrawnWithCacheEnabled = i12 % 128;
        if (i12 % 2 != 0) {
            return "";
        }
        throw null;
    }
}
