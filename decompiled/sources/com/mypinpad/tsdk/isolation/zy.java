package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r"}, d2 = {"Lcom/mypinpad/tsdk/i/zy;", "", "", "toString", "()Ljava/lang/String;", "", "setCompoundDrawableTintBlendMode", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setDividerPadding", "setX", "Ljava/lang/String;", "setY", "Lcom/mypinpad/tsdk/i/yi;", "Lcom/mypinpad/tsdk/i/yi;", "p0", "p1", "p2", "<init>", "(Lcom/mypinpad/tsdk/i/yi;ILjava/lang/String;)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class zy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62494a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62495b = 1;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @JvmField
    public final int setDividerPadding;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final String setY;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final yi setCompoundDrawableTintBlendMode;

    static {
        System.currentTimeMillis();
        System.currentTimeMillis();
    }

    public zy(@NotNull yi yiVar, int i10, @NotNull String str) {
        Intrinsics.checkNotNullParameter(yiVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.setCompoundDrawableTintBlendMode = yiVar;
        this.setDividerPadding = i10;
        this.setY = str;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        zy zyVar = (zy) objArr[0];
        StringBuilder sb2 = new StringBuilder();
        if (zyVar.setCompoundDrawableTintBlendMode == yi.setCompoundDrawableTintBlendMode) {
            int i13 = f62494a;
            int i14 = ((i13 & 103) - (~(-(-(i13 | 103))))) - 1;
            f62495b = i14 % 128;
            int i15 = i14 % 2;
            sb2.append("HTTP/1.0");
            int i16 = f62495b + 37;
            f62494a = i16 % 128;
            int i17 = i16 % 2;
        } else {
            sb2.append("HTTP/1.1");
            int i18 = f62494a;
            int i19 = (i18 & 25) + (i18 | 25);
            f62495b = i19 % 128;
            int i20 = i19 % 2;
        }
        sb2.append(' ');
        sb2.append(zyVar.setDividerPadding);
        sb2.append(' ');
        sb2.append(zyVar.setY);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i21 = f62495b;
        int i22 = (i21 & 34) + (i21 | 34);
        int i23 = (i22 ^ (-1)) + (i22 << 1);
        f62494a = i23 % 128;
        int i24 = i23 % 2;
        return string;
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -1764655379, 1764655379, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.zy$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/zy$setOnFocusChangeListener;", "", "", "p0", "Lcom/mypinpad/tsdk/i/zy;", "setY", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/zy;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62496a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62497b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws ProtocolException {
            yi yiVar;
            int i13;
            String str = (String) objArr[0];
            int i14 = (-2) - ((f62496a + 28) ^ (-1));
            f62497b = i14 % 128;
            int i15 = i14 % 2;
            String str2 = "";
            Intrinsics.checkNotNullParameter(str, "");
            if (l.startsWith$default(str, "HTTP/1.", false, 2, null)) {
                int i16 = f62497b + 81;
                f62496a = i16 % 128;
                i13 = 9;
                if (i16 % 2 == 0 ? str.length() >= 9 : str.length() >= 66) {
                    if (str.charAt(8) == ' ') {
                        char cCharAt = str.charAt(7);
                        int i17 = cCharAt & (-48);
                        int i18 = i17 + ((cCharAt ^ (-48)) | i17);
                        if (i18 == 0) {
                            yiVar = yi.setCompoundDrawableTintBlendMode;
                            int i19 = f62497b;
                            int i20 = i19 & 111;
                            int i21 = (i20 - (~((i19 ^ 111) | i20))) - 1;
                            f62496a = i21 % 128;
                            int i22 = i21 % 2;
                        } else {
                            if (i18 != 1) {
                                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
                            }
                            yiVar = yi.setOnFocusChangeListener;
                            int i23 = f62497b + 98;
                            int i24 = (i23 ^ (-1)) + (i23 << 1);
                            f62496a = i24 % 128;
                            int i25 = i24 % 2;
                        }
                        int i26 = f62496a;
                        int i27 = i26 & 123;
                        int i28 = i26 | 123;
                        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                        f62497b = i29 % 128;
                        int i30 = i29 % 2;
                    }
                }
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
            }
            if (!l.startsWith$default(str, "ICY ", false, 2, null)) {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
            }
            int i31 = f62497b + 126;
            int i32 = (i31 ^ (-1)) + (i31 << 1);
            f62496a = i32 % 128;
            int i33 = i32 % 2;
            yiVar = yi.setCompoundDrawableTintBlendMode;
            int i34 = f62496a;
            int i35 = (-2) - (((i34 ^ 36) + ((i34 & 36) << 1)) ^ (-1));
            f62497b = i35 % 128;
            int i36 = i35 % 2;
            i13 = 4;
            int length = str.length();
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i37 = -(~(i13 * 53));
            int i38 = ((((-153) | i37) << 1) - (i37 ^ (-153))) - 1;
            int i39 = ~iCurrentTimeMillis;
            int i40 = (i39 & (-4)) | ((~i39) & 3);
            int i41 = i39 & 3;
            int i42 = (i40 & i41) | (i40 ^ i41);
            int i43 = i42 & i13;
            int i44 = (i42 | i13) & (~i43);
            int i45 = (i44 & i43) | (i44 ^ i43);
            int i46 = ~i45;
            int i47 = -(-(((i45 | i46) & i46) * 52));
            int i48 = (i38 ^ i47) + ((i47 & i38) << 1);
            int i49 = ~i13;
            int i50 = (i49 | i13) & i49;
            int i51 = (iCurrentTimeMillis | i39) & i39;
            int i52 = (i50 ^ i51) | (i50 & i51);
            int i53 = ~i52;
            int i54 = (i52 | i53) & i53;
            int i55 = i50 ^ 3;
            int i56 = i50 & 3;
            int i57 = ~((i55 ^ i56) | (i55 & i56));
            int i58 = i54 ^ i57;
            int i59 = i54 & i57;
            int i60 = (i58 & i59) | (i58 ^ i59);
            int i61 = i51 & 3;
            int i62 = (~i61) & (i51 | 3);
            int i63 = ~((i62 & i61) | (i62 ^ i61));
            int i64 = i60 ^ i63;
            int i65 = i63 & i60;
            int i66 = (i48 - (~(((i65 & i64) | (i64 ^ i65)) * (-52)))) - 1;
            int i67 = ~((-4) | i39);
            int i68 = (-4) & i13;
            int i69 = ((~i68) & ((-4) | i13)) | i68;
            int i70 = ~i69;
            int i71 = (i69 | i70) & i70;
            int i72 = ((~i67) & i71) | ((~i71) & i67);
            int i73 = i67 & i71;
            int i74 = -(-(((i72 & i73) | (i72 ^ i73)) * 52));
            if (length < ((i66 | i74) << 1) - (i74 ^ i66)) {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
            }
            int i75 = (i13 ^ 4) + ((i13 & 4) << 1);
            try {
                String strSubstring = str.substring(i13, (i75 ^ (-1)) + (i75 << 1));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                int i76 = Integer.parseInt(strSubstring);
                int i77 = f62496a;
                int i78 = i77 ^ 105;
                int i79 = (((i77 & 105) | i78) << 1) - i78;
                f62497b = i79 % 128;
                int i80 = i79 % 2;
                int i81 = ((i77 ^ 30) + ((i77 & 30) << 1)) - 1;
                f62497b = i81 % 128;
                int i82 = i81 % 2;
                int length2 = str.length();
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i83 = i13 * 382;
                int i84 = ((-1140) ^ i83) + ((i83 & (-1140)) << 1);
                int i85 = i13 & iCurrentTimeMillis2;
                int i86 = (~i85) & (i13 | iCurrentTimeMillis2);
                int i87 = ~iCurrentTimeMillis2;
                int i88 = (i86 ^ i85) | (i85 & i86);
                int i89 = i88 & (-4);
                int i90 = (~i89) & (i88 | (-4));
                int i91 = ((i90 & i89) | (i90 ^ i89)) * (-381);
                int i92 = i84 & i91;
                int i93 = ((i84 ^ i91) | i92) << 1;
                int i94 = -((i91 | i84) & (~i92));
                int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                int i96 = ~(((-4) ^ i50) | (i50 & (-4)));
                int i97 = i87 & i13;
                int i98 = (i87 | i13) & (~i97);
                int i99 = ~((i98 & i97) | (i98 ^ i97));
                int i100 = i96 & i99;
                int i101 = (i96 | i99) & (~i100);
                int i102 = (i101 & i100) | (i101 ^ i100);
                int i103 = (i13 ^ 3) | (i13 & 3);
                int i104 = ~i103;
                int i105 = (i103 | i104) & i104;
                int i106 = -(-(((i102 & i105) | (i102 ^ i105)) * 381));
                int i107 = ((i95 | i106) << 1) - (i106 ^ i95);
                int i108 = (-4) ^ i13;
                int i109 = (i108 ^ i68) | (i68 & i108);
                int i110 = ~i109;
                int i111 = ((i109 | i110) & i110) * 381;
                int i112 = ((~i111) & i107) | ((~i107) & i111);
                int i113 = -(-((i111 & i107) << 1));
                if (length2 > (i112 ^ i113) + ((i113 & i112) << 1)) {
                    int i114 = f62496a;
                    int i115 = (i114 & (-40)) | ((~i114) & 39);
                    int i116 = (i114 & 39) << 1;
                    int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
                    f62497b = i117 % 128;
                    int i118 = i117 % 2;
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i119 = 2938 - (~(-(~(i13 * (-978)))));
                    int i120 = ~iCurrentTimeMillis3;
                    int i121 = -(-((~(((~i120) & i49) | ((~i49) & i120) | (i49 & i120))) * 979));
                    int i122 = i119 ^ i121;
                    int i123 = ((i119 & i121) | i122) << 1;
                    int i124 = -i122;
                    int i125 = ((i123 | i124) << 1) - (i123 ^ i124);
                    int i126 = iCurrentTimeMillis3 & 3;
                    int i127 = (~i126) & (iCurrentTimeMillis3 | 3);
                    int i128 = -(-(((i126 & i127) | (i127 ^ i126)) * (-979)));
                    int i129 = i125 & i128;
                    int i130 = -(-((i128 ^ i125) | i129));
                    int i131 = ((i129 | i130) << 1) - (i130 ^ i129);
                    int i132 = i49 & iCurrentTimeMillis3;
                    int i133 = ~(((iCurrentTimeMillis3 | i49) & (~i132)) | i132);
                    int i134 = (i120 ^ 3) | (i120 & 3);
                    int i135 = ~i134;
                    int i136 = (i134 | i135) & i135;
                    int i137 = i133 & i136;
                    int i138 = (i133 | i136) & (~i137);
                    int i139 = ((i138 & i137) | (i138 ^ i137)) * 979;
                    if (str.charAt(((i131 | i139) << 1) - (i139 ^ i131)) != ' ') {
                        throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
                    }
                    String strSubstring2 = str.substring(i13 - (-4));
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    int i140 = f62496a;
                    int i141 = i140 ^ 77;
                    int i142 = (i140 & 77) << 1;
                    int i143 = (i141 & i142) + (i142 | i141);
                    f62497b = i143 % 128;
                    int i144 = i143 % 2;
                    str2 = strSubstring2;
                }
                zy zyVar = new zy(yiVar, i76, str2);
                int i145 = f62496a;
                int i146 = i145 & 17;
                int i147 = (i145 | 17) & (~i146);
                int i148 = -(-(i146 << 1));
                int i149 = ((i147 | i148) << 1) - (i147 ^ i148);
                f62497b = i149 % 128;
                int i150 = i149 % 2;
                return zyVar;
            } catch (NumberFormatException unused) {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
            }
        }

        @NotNull
        public static zy setY(@NotNull String p4) throws IOException {
            return (zy) setY(new Object[]{p4}, -1723180197, 1723180197, (int) System.currentTimeMillis());
        }
    }
}
