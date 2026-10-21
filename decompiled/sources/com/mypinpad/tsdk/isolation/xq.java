package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.esotericsoftware.asm.Opcodes;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u00142\u00020\u0001:\u0002\u0016\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\b\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u001a\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\r\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/xq;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "setOnFocusChangeListener", "()Z", "setOnLongClickListener", "b", "setDividerPadding", "setLayoutAnimation", "", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setX", "()I", "e", "setY", "f", "setCompoundDrawableTintBlendMode", "g", "setOnDragListener", "h", "setNavigationOnClickListener", "i", "getNavBarTitleString", "j", "setTextAlignment"}, k = 1, mv = {1, 6, 0})
public final class xq {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f61882n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f61883o = 1;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean setOnLongClickListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean setLayoutAnimation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int setOnFocusChangeListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean setDividerPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean setY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean setOnDragListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int setNavigationOnClickListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int getNavBarTitleString;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final boolean setTextAlignment;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f61894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f61895l;

    @Nullable
    public String m;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xq$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/xq$setY;", "", "Lcom/mypinpad/tsdk/i/ye;", "p0", "Lcom/mypinpad/tsdk/i/xq;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/ye;)Lcom/mypinpad/tsdk/i/xq;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f61903a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61904b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public static xq setCompoundDrawableTintBlendMode(@NotNull ye p4) {
            return (xq) setDividerPadding(new Object[]{p4}, 1821148600, -1821148599, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Code duplicated, block: B:101:0x067b  */
        /* JADX WARN: Code duplicated, block: B:103:0x0690  */
        /* JADX WARN: Code duplicated, block: B:104:0x0693  */
        /* JADX WARN: Code duplicated, block: B:132:0x052f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:133:0x0579 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:134:0x0627 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:138:0x0777 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:139:0x05b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:140:0x0743 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:141:0x05ef A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x0646 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:0x0700 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:144:0x054b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x0594 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:146:0x0724 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x04c0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x04fe A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x06e7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:150:0x06aa A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:151:0x064f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:152:0x05e7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:153:0x05dc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:154:0x04b8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:32:0x022a  */
        /* JADX WARN: Code duplicated, block: B:34:0x026d  */
        /* JADX WARN: Code duplicated, block: B:36:0x027f  */
        /* JADX WARN: Code duplicated, block: B:40:0x029f  */
        /* JADX WARN: Code duplicated, block: B:47:0x0377  */
        /* JADX WARN: Code duplicated, block: B:49:0x0392  */
        /* JADX WARN: Code duplicated, block: B:50:0x0462  */
        /* JADX WARN: Code duplicated, block: B:60:0x04f0  */
        /* JADX WARN: Code duplicated, block: B:64:0x0513  */
        /* JADX WARN: Code duplicated, block: B:68:0x0542  */
        /* JADX WARN: Code duplicated, block: B:72:0x0565  */
        /* JADX WARN: Code duplicated, block: B:75:0x058c  */
        /* JADX WARN: Code duplicated, block: B:78:0x05aa  */
        /* JADX WARN: Code duplicated, block: B:87:0x0602  */
        /* JADX WARN: Code duplicated, block: B:91:0x063e  */
        /* JADX WARN: Code duplicated, block: B:97:0x0657  */
        /* JADX WARN: Code duplicated, block: B:99:0x0673  */
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            String str;
            int i13;
            int i14;
            int iIntValue;
            String string;
            String str2;
            String strSubstring;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int iIntValue2;
            int i21;
            int i22 = ((~(i10 | i12)) * 216) + (i11 * (-215)) + (i10 * 217);
            int i23 = (~i11) | i10;
            int i24 = ~i12;
            int i25 = (((~(i10 | i24)) | i11) * 216) + ((i23 | i24) * (-216)) + i22;
            char c10 = 0;
            int i26 = 2;
            int i27 = 1;
            if (i25 != 1) {
                String str3 = (String) objArr[0];
                String str4 = (String) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i28 = f61903a;
                int i29 = ((i28 | 85) << 1) - (i28 ^ 85);
                f61904b = i29 % 128;
                int i30 = i29 % 2;
                int length = str3.length();
                int i31 = f61904b;
                int i32 = ((((i31 ^ 105) | (i31 & 105)) << 1) - (~(-(((~i31) & 105) | (i31 & (-106)))))) - 1;
                f61903a = i32 % 128;
                int i33 = i32 % 2;
                while (iIntValue3 < length) {
                    int i34 = f61904b;
                    int i35 = ((i34 | 67) << 1) - (i34 ^ 67);
                    f61903a = i35 % 128;
                    if (i35 % 2 != 0) {
                        int i36 = ((-1) << 1) - (((iIntValue3 & 61) + (iIntValue3 | 61)) ^ (-1));
                        int i37 = (i36 & 52) | ((~i36) & (-53));
                        int i38 = -(-((i36 & (-53)) << 1));
                        i21 = (i37 | i38) + (i37 & i38);
                        if (StringsKt__StringsKt.contains$default((CharSequence) str4, str3.charAt(iIntValue3), false, 2, (Object) null)) {
                            int i39 = f61904b;
                            int i40 = i39 ^ 35;
                            int i41 = ((i39 & 35) | i40) << 1;
                            int i42 = -i40;
                            int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                            f61903a = i43 % 128;
                            int i44 = i43 % 2;
                            return Integer.valueOf(iIntValue3);
                        }
                        iIntValue3 = i21;
                    } else {
                        int i45 = ((iIntValue3 | (-95)) << 1) - (iIntValue3 ^ (-95));
                        i21 = ((i45 & 96) << 1) + (i45 ^ 96);
                        if (StringsKt__StringsKt.contains$default((CharSequence) str4, str3.charAt(iIntValue3), false, 2, (Object) null)) {
                            int i310 = f61904b;
                            int i46 = i310 ^ 35;
                            int i47 = ((i310 & 35) | i46) << 1;
                            int i48 = -i46;
                            int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                            f61903a = i49 % 128;
                            int i410 = i49 % 2;
                            return Integer.valueOf(iIntValue3);
                        }
                        iIntValue3 = i21;
                    }
                }
                int length2 = str3.length();
                int i50 = f61903a;
                int i51 = (i50 & 55) + (i50 | 55);
                f61904b = i51 % 128;
                int i52 = i51 % 2;
                return Integer.valueOf(length2);
            }
            ye yeVar = (ye) objArr[0];
            int i53 = f61903a + 109;
            f61904b = i53 % 128;
            int i54 = i53 % 2;
            Intrinsics.checkNotNullParameter(yeVar, "");
            int iIntValue4 = ((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1558209065, 1558209065, System.identityHashCode(yeVar))).intValue();
            int i55 = f61903a;
            int i56 = ((i55 ^ 112) + ((i55 & 112) << 1)) - 1;
            f61904b = i56 % 128;
            int i57 = i56 % 2;
            String str5 = null;
            int iIntValue5 = -1;
            int iIntValue6 = -1;
            int iIntValue7 = -1;
            int iIntValue8 = -1;
            int i58 = 0;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = true;
            while (i58 < iIntValue4) {
                int i59 = f61904b;
                int i60 = i59 & 63;
                int i61 = -(-((i59 ^ 63) | i60));
                int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
                f61903a = i62 % 128;
                int i63 = i62 % i26;
                int i64 = i58 - 72;
                int i65 = (73 & (~i64)) | (i64 & (-74));
                int i66 = (i64 & 73) << i27;
                i58 = ((i65 | i66) << i27) - (i66 ^ i65);
                Object[] objArr2 = new Object[i26];
                objArr2[c10] = yeVar;
                objArr2[i27] = Integer.valueOf(i58);
                String str6 = (String) ye.setCompoundDrawableTintBlendMode(objArr2, 611642845, -611642844, i58);
                Object[] objArr3 = new Object[i26];
                objArr3[c10] = yeVar;
                objArr3[1] = Integer.valueOf(i58);
                String str7 = (String) ye.setCompoundDrawableTintBlendMode(objArr3, -1668064352, 1668064356, i58);
                if (l.equals(str6, "Cache-Control", true)) {
                    int i67 = f61903a;
                    int i68 = (-2) - ((i67 + 104) ^ (-1));
                    int i69 = i68 % 128;
                    f61904b = i69;
                    int i70 = i68 % 2;
                    if (str5 != null) {
                        int i71 = (((i67 | 124) << 1) - (i67 ^ 124)) - 1;
                        f61904b = i71 % 128;
                        int i72 = i71 % 2;
                        int i73 = i67 & 9;
                        int i74 = (i67 | 9) & (~i73);
                        int i75 = -(-(i73 << 1));
                        int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                        f61904b = i76 % 128;
                        int i77 = i76 % 2;
                    } else {
                        int i78 = i69 | 93;
                        int i79 = i78 << 1;
                        int i80 = -(i78 & (~(i69 & 93)));
                        int i81 = (i79 & i80) + (i80 | i79);
                        f61903a = i81 % 128;
                        int i82 = i81 % 2;
                        str5 = str7;
                    }
                    int i83 = f61903a;
                    int i84 = i83 & 101;
                    int i85 = (((i83 ^ 101) | i84) << 1) - ((i83 | 101) & (~i84));
                    f61904b = i85 % 128;
                    i13 = 2;
                    int i86 = i85 % 2;
                    i14 = 0;
                    while (i14 < str7.length()) {
                        int i87 = f61904b + 123;
                        f61903a = i87 % 128;
                        int i88 = i87 % i13;
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = str7;
                        objArr4[1] = "=,;";
                        objArr4[i13] = Integer.valueOf(i14);
                        iIntValue = ((Integer) setDividerPadding(objArr4, 520924656, -520924656, i14)).intValue();
                        String strSubstring2 = str7.substring(i14, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                        string = StringsKt__StringsKt.trim((CharSequence) strSubstring2).toString();
                        if (iIntValue != str7.length()) {
                            int i89 = f61904b + 71;
                            f61903a = i89 % 128;
                            int i90 = i89 % 2;
                            if (str7.charAt(iIntValue) != ',') {
                                int i91 = f61903a;
                                int i92 = i91 & 77;
                                int i93 = -(-((i91 ^ 77) | i92));
                                i20 = (i92 ^ i93) + ((i93 & i92) << 1);
                                f61904b = i20 % 128;
                                if (i20 % 2 == 0 ? str7.charAt(iIntValue) != ';' : str7.charAt(iIntValue) != 'a') {
                                    str2 = string;
                                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                                    int i94 = iIntValue * 434;
                                    int i95 = (-432) & i94;
                                    yeVar = yeVar;
                                    int i96 = (~i95) & ((-432) | i94);
                                    int i97 = i95 << 1;
                                    int i98 = (i96 ^ i97) + ((i96 & i97) << 1);
                                    int i99 = ~iCurrentTimeMillis;
                                    int i100 = (i99 | iCurrentTimeMillis) & i99;
                                    int i101 = (-2) ^ i100;
                                    int i102 = (-2) & i100;
                                    int i103 = (i101 ^ i102) | (i101 & i102);
                                    iIntValue4 = iIntValue4;
                                    int i104 = ~iIntValue;
                                    z18 = z18;
                                    int i105 = (i103 & i104) | ((~i103) & iIntValue);
                                    int i106 = i103 & iIntValue;
                                    int i107 = (i105 ^ i106) | (i106 & i105);
                                    int i108 = ~i107;
                                    int i109 = ((i107 | i108) & i108) * 433;
                                    str5 = str5;
                                    int i110 = ((~i109) & i98) | ((~i98) & i109);
                                    int i111 = -(-((i98 & i109) << 1));
                                    int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                                    int i113 = (i104 & i99) | ((~i104) & iCurrentTimeMillis);
                                    int i114 = i104 & iCurrentTimeMillis;
                                    int i115 = (i113 & i114) | (i113 ^ i114);
                                    int i116 = ~i115;
                                    int i117 = (i115 | i116) & i116;
                                    int i118 = -(-(((i117 & (-2)) | ((-2) ^ i117)) * (-433)));
                                    int i119 = ((((~i118) & i112) | ((~i112) & i118)) - (~((i118 & i112) << 1))) - 1;
                                    int i120 = (-2) & iCurrentTimeMillis;
                                    int i121 = (~i120) & (iCurrentTimeMillis | (-2));
                                    int i122 = ~((i121 & i120) | (i121 ^ i120));
                                    int i123 = (i104 & 1) | (iIntValue & (-2));
                                    int i124 = iIntValue & 1;
                                    int i125 = ~((i123 & i124) | (i123 ^ i124));
                                    int i126 = i122 & i125;
                                    int i127 = -(-((((i122 | i125) & (~i126)) | i126) * 433));
                                    int i128 = i119 & i127;
                                    int i129 = (i127 | i119) & (~i128);
                                    int i130 = -(-(i128 << 1));
                                    int i131 = ((i129 | i130) << 1) - (i129 ^ i130);
                                    iIntValue2 = ((Integer) yt.setY(new Object[]{str7, Integer.valueOf(i131)}, 150030434, -150030394, i131)).intValue();
                                    if (iIntValue2 < str7.length()) {
                                        int i132 = f61903a;
                                        int i133 = ((i132 & (-122)) | ((~i132) & 121)) + ((i132 & 121) << 1);
                                        f61904b = i133 % 128;
                                        int i134 = i133 % 2;
                                        if (str7.charAt(iIntValue2) == '\"') {
                                            int i135 = (-2) - ((f61904b + 52) ^ (-1));
                                            f61903a = i135 % 128;
                                            int i136 = i135 % 2;
                                            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                                            int i137 = (iIntValue2 * (-97)) + 50;
                                            int i138 = ~iIntValue2;
                                            int i139 = (i138 | iIntValue2) & i138;
                                            int i140 = ~iCurrentTimeMillis2;
                                            int i141 = ~((i139 & i140) | ((~i140) & i139) | ((~i139) & i140));
                                            int i142 = ~(i138 | 1);
                                            int i143 = -(-(((i141 & i142) | (i141 ^ i142)) * 98));
                                            int i144 = ((~i143) & i137) | ((~i137) & i143);
                                            int i145 = (i137 & i143) << 1;
                                            int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                                            int i147 = ~(((-2) ^ i140) | (i140 & (-2)));
                                            int i148 = i138 & i147;
                                            int i149 = (i147 | i138) & (~i148);
                                            int i150 = (i149 & i148) | (i149 ^ i148);
                                            int i151 = iCurrentTimeMillis2 ^ 1;
                                            int i152 = iCurrentTimeMillis2 & 1;
                                            int i153 = ~((i151 & i152) | (i151 ^ i152));
                                            int i154 = ((~i153) & i150) | ((~i150) & i153);
                                            int i155 = i150 & i153;
                                            int i156 = -(~(-(-(((i155 & i154) | (i154 ^ i155)) * (-49)))));
                                            int i157 = (i146 ^ i156) + ((i156 & i146) << 1);
                                            int i158 = (i157 ^ (-1)) + (i157 << 1);
                                            int i159 = (iCurrentTimeMillis2 & i138) | (i138 ^ iCurrentTimeMillis2);
                                            int i160 = ~i159;
                                            int i161 = (i159 | i160) & i160;
                                            int i162 = ~((iIntValue2 & 1) | (iIntValue2 ^ 1));
                                            int i163 = ((~i162) & i161) | ((~i161) & i162);
                                            int i164 = i162 & i161;
                                            int i165 = ((i164 & i163) | (i163 ^ i164)) * 49;
                                            int i166 = i158 ^ i165;
                                            int i167 = -(-((i165 & i158) << 1));
                                            int i168 = ((i166 | i167) << 1) - (i167 ^ i166);
                                            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str7, '\"', i168, false, 4, (Object) null);
                                            strSubstring = str7.substring(i168, iIndexOf$default);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                            int i169 = ((iIndexOf$default ^ 1) | (iIndexOf$default & 1)) << 1;
                                            int i170 = -(((~iIndexOf$default) & 1) | (iIndexOf$default & (-2)));
                                            int i171 = (i169 ^ i170) + ((i170 & i169) << 1);
                                            int i172 = f61904b;
                                            int i173 = i172 & 51;
                                            int i174 = (i173 - (~((i172 ^ 51) | i173))) - 1;
                                            f61903a = i174 % 128;
                                            int i175 = i174 % 2;
                                            i14 = i171;
                                        } else {
                                            int iIntValue9 = ((Integer) setDividerPadding(new Object[]{str7, ",;", Integer.valueOf(iIntValue2)}, 520924656, -520924656, iIntValue2)).intValue();
                                            String strSubstring3 = str7.substring(iIntValue2, iIntValue9);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                                            String string2 = StringsKt__StringsKt.trim((CharSequence) strSubstring3).toString();
                                            int i176 = f61903a;
                                            int i177 = i176 & 73;
                                            int i178 = ((i176 | 73) & (~i177)) + (i177 << 1);
                                            f61904b = i178 % 128;
                                            int i179 = i178 % 2;
                                            i14 = iIntValue9;
                                            strSubstring = string2;
                                        }
                                    } else {
                                        int iIntValue10 = ((Integer) setDividerPadding(new Object[]{str7, ",;", Integer.valueOf(iIntValue2)}, 520924656, -520924656, iIntValue2)).intValue();
                                        String strSubstring4 = str7.substring(iIntValue2, iIntValue10);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                                        String string3 = StringsKt__StringsKt.trim((CharSequence) strSubstring4).toString();
                                        int i1710 = f61903a;
                                        int i1711 = i1710 & 73;
                                        int i1712 = ((i1710 | 73) & (~i1711)) + (i1711 << 1);
                                        f61904b = i1712 % 128;
                                        int i1713 = i1712 % 2;
                                        i14 = iIntValue10;
                                        strSubstring = string3;
                                    }
                                } else {
                                    yeVar = yeVar;
                                    str2 = string;
                                    iIntValue4 = iIntValue4;
                                    z18 = z18;
                                    str5 = str5;
                                    int i180 = iIntValue & 1;
                                    i14 = i180 + ((iIntValue ^ 1) | i180);
                                    strSubstring = null;
                                }
                            } else {
                                yeVar = yeVar;
                                str2 = string;
                                iIntValue4 = iIntValue4;
                                z18 = z18;
                                str5 = str5;
                                int i181 = iIntValue & 1;
                                i14 = i181 + ((iIntValue ^ 1) | i181);
                                strSubstring = null;
                            }
                        } else {
                            yeVar = yeVar;
                            str2 = string;
                            iIntValue4 = iIntValue4;
                            z18 = z18;
                            str5 = str5;
                            int i182 = iIntValue & 1;
                            i14 = i182 + ((iIntValue ^ 1) | i182);
                            strSubstring = null;
                        }
                        if (!l.equals("no-cache", str2, true)) {
                            if (l.equals("no-store", str2, true)) {
                                int i183 = f61904b;
                                int i184 = (i183 ^ 101) + ((i183 & 101) << 1);
                                f61903a = i184 % 128;
                                int i185 = i184 % 2;
                                int i186 = i183 ^ 111;
                                int i187 = ((i183 & 111) | i186) << 1;
                                int i188 = -i186;
                                int i189 = ((i187 | i188) << 1) - (i187 ^ i188);
                                f61903a = i189 % 128;
                                int i190 = i189 % 2;
                                z11 = true;
                            } else if (l.equals("max-age", str2, true)) {
                                int i191 = f61903a;
                                i15 = (-2) - ((((i191 | 36) << 1) - (i191 ^ 36)) ^ (-1));
                                f61904b = i15 % 128;
                                if (i15 % 2 != 0) {
                                    ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                                    throw null;
                                }
                                iIntValue5 = ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                                i13 = 2;
                            } else if (l.equals("s-maxage", str2, true)) {
                                int i192 = f61904b;
                                int i193 = i192 & 71;
                                int i194 = ((i192 ^ 71) | i193) << 1;
                                int i195 = -((i192 | 71) & (~i193));
                                i16 = ((i194 | i195) << 1) - (i195 ^ i194);
                                f61903a = i16 % 128;
                                if (i16 % 2 == 0) {
                                    ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                                    throw null;
                                }
                                iIntValue6 = ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                                i13 = 2;
                            } else if (l.equals("private", str2, true)) {
                                int i196 = f61903a;
                                int i197 = ((i196 ^ 43) - (~(-(-((i196 & 43) << 1))))) - 1;
                                f61904b = i197 % 128;
                                int i198 = i197 % 2;
                                z12 = true;
                            } else if (l.equals("public", str2, true)) {
                                int i199 = f61903a;
                                int i200 = (-2) - ((((i199 | 54) << 1) - (i199 ^ 54)) ^ (-1));
                                int i201 = i200 % 128;
                                f61904b = i201;
                                int i202 = i200 % 2;
                                int i203 = i201 + 71;
                                f61903a = i203 % 128;
                                int i204 = i203 % 2;
                                yeVar = yeVar;
                                iIntValue4 = iIntValue4;
                                z18 = z18;
                                str5 = str5;
                                i13 = 2;
                                z13 = true;
                            } else if (!l.equals("must-revalidate", str2, true)) {
                                int i205 = f61904b;
                                int i206 = ((i205 & 70) + (i205 | 70)) - 1;
                                f61903a = i206 % 128;
                                int i207 = i206 % 2;
                                int i208 = i205 & 117;
                                int i209 = (i205 ^ 117) | i208;
                                int i210 = ((i208 | i209) << 1) - (i209 ^ i208);
                                f61903a = i210 % 128;
                                int i211 = i210 % 2;
                                yeVar = yeVar;
                                iIntValue4 = iIntValue4;
                                z18 = z18;
                                str5 = str5;
                                i13 = 2;
                                z14 = true;
                            } else if (l.equals("max-stale", str2, true)) {
                                int i212 = f61903a;
                                i17 = (i212 ^ 79) + ((i212 & 79) << 1);
                                f61904b = i17 % 128;
                                i13 = 2;
                                if (i17 % 2 != 0) {
                                    ((Integer) yt.setY(new Object[]{strSubstring, Integer.MAX_VALUE}, -1998824873, 1998824895, Integer.MAX_VALUE)).intValue();
                                    throw null;
                                }
                                iIntValue7 = ((Integer) yt.setY(new Object[]{strSubstring, Integer.MAX_VALUE}, -1998824873, 1998824895, Integer.MAX_VALUE)).intValue();
                            } else if (!l.equals("min-fresh", str2, true)) {
                                int i213 = f61903a;
                                int i214 = i213 & 11;
                                i18 = (((i213 | 11) & (~i214)) - (~(-(-(i214 << 1))))) - 1;
                                f61904b = i18 % 128;
                                if (i18 % 2 == 0) {
                                    iIntValue8 = ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                                    int i215 = 36 / 0;
                                    i13 = 2;
                                    iIntValue4 = iIntValue4;
                                    z18 = z18;
                                    str5 = str5;
                                    yeVar = yeVar;
                                } else {
                                    iIntValue8 = ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                                    yeVar = yeVar;
                                    iIntValue4 = iIntValue4;
                                    z18 = z18;
                                    str5 = str5;
                                    i13 = 2;
                                }
                            } else if (!l.equals("only-if-cached", str2, true)) {
                                if (l.equals("no-transform", str2, true)) {
                                    int i216 = f61904b;
                                    int i217 = (i216 ^ 59) + ((i216 & 59) << 1);
                                    f61903a = i217 % 128;
                                    int i218 = i217 % 2;
                                    z16 = true;
                                } else if (l.equals("immutable", str2, true)) {
                                    int i219 = f61904b;
                                    int i220 = (i219 | 115) << 1;
                                    int i221 = -(i219 ^ 115);
                                    i19 = ((i220 | i221) << 1) - (i221 ^ i220);
                                    int i222 = i19 % 128;
                                    f61903a = i222;
                                    if (i19 % 2 != 0) {
                                        z17 = false;
                                    } else {
                                        z17 = true;
                                    }
                                    int i223 = i222 & 93;
                                    int i224 = -(-((i222 ^ 93) | i223));
                                    int i225 = ((i223 | i224) << 1) - (i224 ^ i223);
                                    f61904b = i225 % 128;
                                    int i226 = i225 % 2;
                                }
                                i13 = 2;
                            } else {
                                int i227 = f61903a;
                                int i228 = i227 & 83;
                                int i229 = ((((i227 ^ 83) | i228) << 1) - (~(-((i227 | 83) & (~i228))))) - 1;
                                int i230 = i229 % 128;
                                f61904b = i230;
                                int i231 = i229 % 2;
                                int i232 = (i230 & (-100)) | ((~i230) & 99);
                                int i233 = (i230 & 99) << 1;
                                int i234 = ((i232 | i233) << 1) - (i233 ^ i232);
                                f61903a = i234 % 128;
                                int i235 = i234 % 2;
                                yeVar = yeVar;
                                iIntValue4 = iIntValue4;
                                z18 = z18;
                                str5 = str5;
                                i13 = 2;
                                z15 = true;
                            }
                            i13 = 2;
                        } else {
                            int i236 = f61904b;
                            int i237 = (i236 ^ 107) + ((i236 & 107) << 1);
                            f61903a = i237 % 128;
                            int i238 = i237 % 2;
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            yeVar = yeVar;
                            iIntValue4 = iIntValue4;
                            z18 = z18;
                            str5 = str5;
                            i13 = 2;
                            z10 = true;
                        }
                    }
                    c10 = 0;
                    i26 = 2;
                    i27 = 1;
                } else {
                    if (l.equals(str6, "Pragma", true)) {
                        int i239 = f61904b;
                        int i240 = (i239 ^ 36) + ((i239 & 36) << 1);
                        int i241 = (i240 ^ (-1)) + (i240 << 1);
                        f61903a = i241 % 128;
                        int i242 = i241 % 2;
                        int i243 = (i239 & (-84)) | ((~i239) & 83);
                        int i244 = (i239 & 83) << 1;
                        int i245 = (i243 ^ i244) + ((i244 & i243) << 1);
                        f61903a = i245 % 128;
                        int i246 = i245 % 2;
                    } else {
                        ye yeVar2 = yeVar;
                        int i247 = f61903a;
                        int i248 = ((i247 & 126) + (i247 | 126)) - 1;
                        f61904b = i248 % 128;
                        int i249 = i248 % 2;
                        c10 = 0;
                        yeVar = yeVar2;
                        iIntValue4 = iIntValue4;
                    }
                    i26 = 2;
                    i27 = 1;
                }
                z18 = false;
                int i810 = f61903a;
                int i811 = i810 & 101;
                int i812 = (((i810 ^ 101) | i811) << 1) - ((i810 | 101) & (~i811));
                f61904b = i812 % 128;
                i13 = 2;
                int i813 = i812 % 2;
                i14 = 0;
                while (i14 < str7.length()) {
                    int i814 = f61904b + 123;
                    f61903a = i814 % 128;
                    int i815 = i814 % i13;
                    Object[] objArr5 = new Object[3];
                    objArr5[0] = str7;
                    objArr5[1] = "=,;";
                    objArr5[i13] = Integer.valueOf(i14);
                    iIntValue = ((Integer) setDividerPadding(objArr5, 520924656, -520924656, i14)).intValue();
                    String strSubstring5 = str7.substring(i14, iIntValue);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
                    string = StringsKt__StringsKt.trim((CharSequence) strSubstring5).toString();
                    if (iIntValue != str7.length()) {
                        int i816 = f61904b + 71;
                        f61903a = i816 % 128;
                        int i910 = i816 % 2;
                        if (str7.charAt(iIntValue) != ',') {
                            int i911 = f61903a;
                            int i912 = i911 & 77;
                            int i913 = -(-((i911 ^ 77) | i912));
                            i20 = (i912 ^ i913) + ((i913 & i912) << 1);
                            f61904b = i20 % 128;
                            if (i20 % 2 == 0) {
                                str2 = string;
                                int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                                int i914 = iIntValue * 434;
                                int i915 = (-432) & i914;
                                yeVar = yeVar;
                                int i916 = (~i915) & ((-432) | i914);
                                int i917 = i915 << 1;
                                int i918 = (i916 ^ i917) + ((i916 & i917) << 1);
                                int i919 = ~iCurrentTimeMillis3;
                                int i1010 = (i919 | iCurrentTimeMillis3) & i919;
                                int i1011 = (-2) ^ i1010;
                                int i1012 = (-2) & i1010;
                                int i1013 = (i1011 ^ i1012) | (i1011 & i1012);
                                iIntValue4 = iIntValue4;
                                int i1014 = ~iIntValue;
                                z18 = z18;
                                int i1015 = (i1013 & i1014) | ((~i1013) & iIntValue);
                                int i1016 = i1013 & iIntValue;
                                int i1017 = (i1015 ^ i1016) | (i1016 & i1015);
                                int i1018 = ~i1017;
                                int i1019 = ((i1017 | i1018) & i1018) * 433;
                                str5 = str5;
                                int i1110 = ((~i1019) & i918) | ((~i918) & i1019);
                                int i1111 = -(-((i918 & i1019) << 1));
                                int i1112 = (i1110 ^ i1111) + ((i1111 & i1110) << 1);
                                int i1113 = (i1014 & i919) | ((~i1014) & iCurrentTimeMillis3);
                                int i1114 = i1014 & iCurrentTimeMillis3;
                                int i1115 = (i1113 & i1114) | (i1113 ^ i1114);
                                int i1116 = ~i1115;
                                int i1117 = (i1115 | i1116) & i1116;
                                int i1118 = -(-(((i1117 & (-2)) | ((-2) ^ i1117)) * (-433)));
                                int i1119 = ((((~i1118) & i1112) | ((~i1112) & i1118)) - (~((i1118 & i1112) << 1))) - 1;
                                int i1210 = (-2) & iCurrentTimeMillis3;
                                int i1211 = (~i1210) & (iCurrentTimeMillis3 | (-2));
                                int i1212 = ~((i1211 & i1210) | (i1211 ^ i1210));
                                int i1213 = (i1014 & 1) | (iIntValue & (-2));
                                int i1214 = iIntValue & 1;
                                int i1215 = ~((i1213 & i1214) | (i1213 ^ i1214));
                                int i1216 = i1212 & i1215;
                                int i1217 = -(-((((i1212 | i1215) & (~i1216)) | i1216) * 433));
                                int i1218 = i1119 & i1217;
                                int i1219 = (i1217 | i1119) & (~i1218);
                                int i1310 = -(-(i1218 << 1));
                                int i1311 = ((i1219 | i1310) << 1) - (i1219 ^ i1310);
                                iIntValue2 = ((Integer) yt.setY(new Object[]{str7, Integer.valueOf(i1311)}, 150030434, -150030394, i1311)).intValue();
                                if (iIntValue2 < str7.length()) {
                                    int i1312 = f61903a;
                                    int i1313 = ((i1312 & (-122)) | ((~i1312) & 121)) + ((i1312 & 121) << 1);
                                    f61904b = i1313 % 128;
                                    int i1314 = i1313 % 2;
                                    if (str7.charAt(iIntValue2) == '\"') {
                                        int i1315 = (-2) - ((f61904b + 52) ^ (-1));
                                        f61903a = i1315 % 128;
                                        int i1316 = i1315 % 2;
                                        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                                        int i1317 = (iIntValue2 * (-97)) + 50;
                                        int i1318 = ~iIntValue2;
                                        int i1319 = (i1318 | iIntValue2) & i1318;
                                        int i1410 = ~iCurrentTimeMillis4;
                                        int i1411 = ~((i1319 & i1410) | ((~i1410) & i1319) | ((~i1319) & i1410));
                                        int i1412 = ~(i1318 | 1);
                                        int i1413 = -(-(((i1411 & i1412) | (i1411 ^ i1412)) * 98));
                                        int i1414 = ((~i1413) & i1317) | ((~i1317) & i1413);
                                        int i1415 = (i1317 & i1413) << 1;
                                        int i1416 = ((i1414 | i1415) << 1) - (i1415 ^ i1414);
                                        int i1417 = ~(((-2) ^ i1410) | (i1410 & (-2)));
                                        int i1418 = i1318 & i1417;
                                        int i1419 = (i1417 | i1318) & (~i1418);
                                        int i1510 = (i1419 & i1418) | (i1419 ^ i1418);
                                        int i1511 = iCurrentTimeMillis4 ^ 1;
                                        int i1512 = iCurrentTimeMillis4 & 1;
                                        int i1513 = ~((i1511 & i1512) | (i1511 ^ i1512));
                                        int i1514 = ((~i1513) & i1510) | ((~i1510) & i1513);
                                        int i1515 = i1510 & i1513;
                                        int i1516 = -(~(-(-(((i1515 & i1514) | (i1514 ^ i1515)) * (-49)))));
                                        int i1517 = (i1416 ^ i1516) + ((i1516 & i1416) << 1);
                                        int i1518 = (i1517 ^ (-1)) + (i1517 << 1);
                                        int i1519 = (iCurrentTimeMillis4 & i1318) | (i1318 ^ iCurrentTimeMillis4);
                                        int i1610 = ~i1519;
                                        int i1611 = (i1519 | i1610) & i1610;
                                        int i1612 = ~((iIntValue2 & 1) | (iIntValue2 ^ 1));
                                        int i1613 = ((~i1612) & i1611) | ((~i1611) & i1612);
                                        int i1614 = i1612 & i1611;
                                        int i1615 = ((i1614 & i1613) | (i1613 ^ i1614)) * 49;
                                        int i1616 = i1518 ^ i1615;
                                        int i1617 = -(-((i1615 & i1518) << 1));
                                        int i1618 = ((i1616 | i1617) << 1) - (i1617 ^ i1616);
                                        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str7, '\"', i1618, false, 4, (Object) null);
                                        strSubstring = str7.substring(i1618, iIndexOf$default2);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                        int i1619 = ((iIndexOf$default2 ^ 1) | (iIndexOf$default2 & 1)) << 1;
                                        int i1714 = -(((~iIndexOf$default2) & 1) | (iIndexOf$default2 & (-2)));
                                        int i1715 = (i1619 ^ i1714) + ((i1714 & i1619) << 1);
                                        int i1716 = f61904b;
                                        int i1717 = i1716 & 51;
                                        int i1718 = (i1717 - (~((i1716 ^ 51) | i1717))) - 1;
                                        f61903a = i1718 % 128;
                                        int i1719 = i1718 % 2;
                                        i14 = i1715;
                                    } else {
                                        int iIntValue11 = ((Integer) setDividerPadding(new Object[]{str7, ",;", Integer.valueOf(iIntValue2)}, 520924656, -520924656, iIntValue2)).intValue();
                                        String strSubstring6 = str7.substring(iIntValue2, iIntValue11);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "");
                                        String string4 = StringsKt__StringsKt.trim((CharSequence) strSubstring6).toString();
                                        int i17110 = f61903a;
                                        int i17111 = i17110 & 73;
                                        int i17112 = ((i17110 | 73) & (~i17111)) + (i17111 << 1);
                                        f61904b = i17112 % 128;
                                        int i17113 = i17112 % 2;
                                        i14 = iIntValue11;
                                        strSubstring = string4;
                                    }
                                } else {
                                    int iIntValue12 = ((Integer) setDividerPadding(new Object[]{str7, ",;", Integer.valueOf(iIntValue2)}, 520924656, -520924656, iIntValue2)).intValue();
                                    String strSubstring7 = str7.substring(iIntValue2, iIntValue12);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring7, "");
                                    String string5 = StringsKt__StringsKt.trim((CharSequence) strSubstring7).toString();
                                    int i17114 = f61903a;
                                    int i17115 = i17114 & 73;
                                    int i17116 = ((i17114 | 73) & (~i17115)) + (i17115 << 1);
                                    f61904b = i17116 % 128;
                                    int i17117 = i17116 % 2;
                                    i14 = iIntValue12;
                                    strSubstring = string5;
                                }
                            } else {
                                str2 = string;
                                int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
                                int i9110 = iIntValue * 434;
                                int i9111 = (-432) & i9110;
                                yeVar = yeVar;
                                int i9112 = (~i9111) & ((-432) | i9110);
                                int i9113 = i9111 << 1;
                                int i9114 = (i9112 ^ i9113) + ((i9112 & i9113) << 1);
                                int i9115 = ~iCurrentTimeMillis5;
                                int i10110 = (i9115 | iCurrentTimeMillis5) & i9115;
                                int i10111 = (-2) ^ i10110;
                                int i10112 = (-2) & i10110;
                                int i10113 = (i10111 ^ i10112) | (i10111 & i10112);
                                iIntValue4 = iIntValue4;
                                int i10114 = ~iIntValue;
                                z18 = z18;
                                int i10115 = (i10113 & i10114) | ((~i10113) & iIntValue);
                                int i10116 = i10113 & iIntValue;
                                int i10117 = (i10115 ^ i10116) | (i10116 & i10115);
                                int i10118 = ~i10117;
                                int i10119 = ((i10117 | i10118) & i10118) * 433;
                                str5 = str5;
                                int i11110 = ((~i10119) & i9114) | ((~i9114) & i10119);
                                int i11111 = -(-((i9114 & i10119) << 1));
                                int i11112 = (i11110 ^ i11111) + ((i11111 & i11110) << 1);
                                int i11113 = (i10114 & i9115) | ((~i10114) & iCurrentTimeMillis5);
                                int i11114 = i10114 & iCurrentTimeMillis5;
                                int i11115 = (i11113 & i11114) | (i11113 ^ i11114);
                                int i11116 = ~i11115;
                                int i11117 = (i11115 | i11116) & i11116;
                                int i11118 = -(-(((i11117 & (-2)) | ((-2) ^ i11117)) * (-433)));
                                int i11119 = ((((~i11118) & i11112) | ((~i11112) & i11118)) - (~((i11118 & i11112) << 1))) - 1;
                                int i12110 = (-2) & iCurrentTimeMillis5;
                                int i12111 = (~i12110) & (iCurrentTimeMillis5 | (-2));
                                int i12112 = ~((i12111 & i12110) | (i12111 ^ i12110));
                                int i12113 = (i10114 & 1) | (iIntValue & (-2));
                                int i12114 = iIntValue & 1;
                                int i12115 = ~((i12113 & i12114) | (i12113 ^ i12114));
                                int i12116 = i12112 & i12115;
                                int i12117 = -(-((((i12112 | i12115) & (~i12116)) | i12116) * 433));
                                int i12118 = i11119 & i12117;
                                int i12119 = (i12117 | i11119) & (~i12118);
                                int i13110 = -(-(i12118 << 1));
                                int i13111 = ((i12119 | i13110) << 1) - (i12119 ^ i13110);
                                iIntValue2 = ((Integer) yt.setY(new Object[]{str7, Integer.valueOf(i13111)}, 150030434, -150030394, i13111)).intValue();
                                if (iIntValue2 < str7.length()) {
                                    int i13112 = f61903a;
                                    int i13113 = ((i13112 & (-122)) | ((~i13112) & 121)) + ((i13112 & 121) << 1);
                                    f61904b = i13113 % 128;
                                    int i13114 = i13113 % 2;
                                    if (str7.charAt(iIntValue2) == '\"') {
                                        int i13115 = (-2) - ((f61904b + 52) ^ (-1));
                                        f61903a = i13115 % 128;
                                        int i13116 = i13115 % 2;
                                        int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
                                        int i13117 = (iIntValue2 * (-97)) + 50;
                                        int i13118 = ~iIntValue2;
                                        int i13119 = (i13118 | iIntValue2) & i13118;
                                        int i14110 = ~iCurrentTimeMillis6;
                                        int i14111 = ~((i13119 & i14110) | ((~i14110) & i13119) | ((~i13119) & i14110));
                                        int i14112 = ~(i13118 | 1);
                                        int i14113 = -(-(((i14111 & i14112) | (i14111 ^ i14112)) * 98));
                                        int i14114 = ((~i14113) & i13117) | ((~i13117) & i14113);
                                        int i14115 = (i13117 & i14113) << 1;
                                        int i14116 = ((i14114 | i14115) << 1) - (i14115 ^ i14114);
                                        int i14117 = ~(((-2) ^ i14110) | (i14110 & (-2)));
                                        int i14118 = i13118 & i14117;
                                        int i14119 = (i14117 | i13118) & (~i14118);
                                        int i15110 = (i14119 & i14118) | (i14119 ^ i14118);
                                        int i15111 = iCurrentTimeMillis6 ^ 1;
                                        int i15112 = iCurrentTimeMillis6 & 1;
                                        int i15113 = ~((i15111 & i15112) | (i15111 ^ i15112));
                                        int i15114 = ((~i15113) & i15110) | ((~i15110) & i15113);
                                        int i15115 = i15110 & i15113;
                                        int i15116 = -(~(-(-(((i15115 & i15114) | (i15114 ^ i15115)) * (-49)))));
                                        int i15117 = (i14116 ^ i15116) + ((i15116 & i14116) << 1);
                                        int i15118 = (i15117 ^ (-1)) + (i15117 << 1);
                                        int i15119 = (iCurrentTimeMillis6 & i13118) | (i13118 ^ iCurrentTimeMillis6);
                                        int i16110 = ~i15119;
                                        int i16111 = (i15119 | i16110) & i16110;
                                        int i16112 = ~((iIntValue2 & 1) | (iIntValue2 ^ 1));
                                        int i16113 = ((~i16112) & i16111) | ((~i16111) & i16112);
                                        int i16114 = i16112 & i16111;
                                        int i16115 = ((i16114 & i16113) | (i16113 ^ i16114)) * 49;
                                        int i16116 = i15118 ^ i16115;
                                        int i16117 = -(-((i16115 & i15118) << 1));
                                        int i16118 = ((i16116 | i16117) << 1) - (i16117 ^ i16116);
                                        int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) str7, '\"', i16118, false, 4, (Object) null);
                                        strSubstring = str7.substring(i16118, iIndexOf$default3);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                        int i16119 = ((iIndexOf$default3 ^ 1) | (iIndexOf$default3 & 1)) << 1;
                                        int i17118 = -(((~iIndexOf$default3) & 1) | (iIndexOf$default3 & (-2)));
                                        int i17119 = (i16119 ^ i17118) + ((i17118 & i16119) << 1);
                                        int i17120 = f61904b;
                                        int i17121 = i17120 & 51;
                                        int i17122 = (i17121 - (~((i17120 ^ 51) | i17121))) - 1;
                                        f61903a = i17122 % 128;
                                        int i17123 = i17122 % 2;
                                        i14 = i17119;
                                    } else {
                                        int iIntValue13 = ((Integer) setDividerPadding(new Object[]{str7, ",;", Integer.valueOf(iIntValue2)}, 520924656, -520924656, iIntValue2)).intValue();
                                        String strSubstring8 = str7.substring(iIntValue2, iIntValue13);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring8, "");
                                        String string6 = StringsKt__StringsKt.trim((CharSequence) strSubstring8).toString();
                                        int i171110 = f61903a;
                                        int i171111 = i171110 & 73;
                                        int i171112 = ((i171110 | 73) & (~i171111)) + (i171111 << 1);
                                        f61904b = i171112 % 128;
                                        int i171113 = i171112 % 2;
                                        i14 = iIntValue13;
                                        strSubstring = string6;
                                    }
                                } else {
                                    int iIntValue14 = ((Integer) setDividerPadding(new Object[]{str7, ",;", Integer.valueOf(iIntValue2)}, 520924656, -520924656, iIntValue2)).intValue();
                                    String strSubstring9 = str7.substring(iIntValue2, iIntValue14);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring9, "");
                                    String string7 = StringsKt__StringsKt.trim((CharSequence) strSubstring9).toString();
                                    int i171114 = f61903a;
                                    int i171115 = i171114 & 73;
                                    int i171116 = ((i171114 | 73) & (~i171115)) + (i171115 << 1);
                                    f61904b = i171116 % 128;
                                    int i171117 = i171116 % 2;
                                    i14 = iIntValue14;
                                    strSubstring = string7;
                                }
                            }
                        } else {
                            yeVar = yeVar;
                            str2 = string;
                            iIntValue4 = iIntValue4;
                            z18 = z18;
                            str5 = str5;
                            int i1810 = iIntValue & 1;
                            i14 = i1810 + ((iIntValue ^ 1) | i1810);
                            strSubstring = null;
                        }
                    } else {
                        yeVar = yeVar;
                        str2 = string;
                        iIntValue4 = iIntValue4;
                        z18 = z18;
                        str5 = str5;
                        int i1811 = iIntValue & 1;
                        i14 = i1811 + ((iIntValue ^ 1) | i1811);
                        strSubstring = null;
                    }
                    if (!l.equals("no-cache", str2, true)) {
                        if (l.equals("no-store", str2, true)) {
                            int i1812 = f61904b;
                            int i1813 = (i1812 ^ 101) + ((i1812 & 101) << 1);
                            f61903a = i1813 % 128;
                            int i1814 = i1813 % 2;
                            int i1815 = i1812 ^ 111;
                            int i1816 = ((i1812 & 111) | i1815) << 1;
                            int i1817 = -i1815;
                            int i1818 = ((i1816 | i1817) << 1) - (i1816 ^ i1817);
                            f61903a = i1818 % 128;
                            int i1910 = i1818 % 2;
                            z11 = true;
                        } else if (l.equals("max-age", str2, true)) {
                            int i1911 = f61903a;
                            i15 = (-2) - ((((i1911 | 36) << 1) - (i1911 ^ 36)) ^ (-1));
                            f61904b = i15 % 128;
                            if (i15 % 2 != 0) {
                                ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                                throw null;
                            }
                            iIntValue5 = ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                            i13 = 2;
                        } else if (l.equals("s-maxage", str2, true)) {
                            int i1912 = f61904b;
                            int i1913 = i1912 & 71;
                            int i1914 = ((i1912 ^ 71) | i1913) << 1;
                            int i1915 = -((i1912 | 71) & (~i1913));
                            i16 = ((i1914 | i1915) << 1) - (i1915 ^ i1914);
                            f61903a = i16 % 128;
                            if (i16 % 2 == 0) {
                                ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                                throw null;
                            }
                            iIntValue6 = ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                            i13 = 2;
                        } else if (l.equals("private", str2, true)) {
                            int i1916 = f61903a;
                            int i1917 = ((i1916 ^ 43) - (~(-(-((i1916 & 43) << 1))))) - 1;
                            f61904b = i1917 % 128;
                            int i1918 = i1917 % 2;
                            z12 = true;
                        } else if (l.equals("public", str2, true)) {
                            int i1919 = f61903a;
                            int i2010 = (-2) - ((((i1919 | 54) << 1) - (i1919 ^ 54)) ^ (-1));
                            int i2011 = i2010 % 128;
                            f61904b = i2011;
                            int i2012 = i2010 % 2;
                            int i2013 = i2011 + 71;
                            f61903a = i2013 % 128;
                            int i2014 = i2013 % 2;
                            yeVar = yeVar;
                            iIntValue4 = iIntValue4;
                            z18 = z18;
                            str5 = str5;
                            i13 = 2;
                            z13 = true;
                        } else if (!l.equals("must-revalidate", str2, true)) {
                            int i2015 = f61904b;
                            int i2016 = ((i2015 & 70) + (i2015 | 70)) - 1;
                            f61903a = i2016 % 128;
                            int i2017 = i2016 % 2;
                            int i2018 = i2015 & 117;
                            int i2019 = (i2015 ^ 117) | i2018;
                            int i2110 = ((i2018 | i2019) << 1) - (i2019 ^ i2018);
                            f61903a = i2110 % 128;
                            int i2111 = i2110 % 2;
                            yeVar = yeVar;
                            iIntValue4 = iIntValue4;
                            z18 = z18;
                            str5 = str5;
                            i13 = 2;
                            z14 = true;
                        } else if (l.equals("max-stale", str2, true)) {
                            int i2112 = f61903a;
                            i17 = (i2112 ^ 79) + ((i2112 & 79) << 1);
                            f61904b = i17 % 128;
                            i13 = 2;
                            if (i17 % 2 != 0) {
                                ((Integer) yt.setY(new Object[]{strSubstring, Integer.MAX_VALUE}, -1998824873, 1998824895, Integer.MAX_VALUE)).intValue();
                                throw null;
                            }
                            iIntValue7 = ((Integer) yt.setY(new Object[]{strSubstring, Integer.MAX_VALUE}, -1998824873, 1998824895, Integer.MAX_VALUE)).intValue();
                        } else if (!l.equals("min-fresh", str2, true)) {
                            int i2113 = f61903a;
                            int i2114 = i2113 & 11;
                            i18 = (((i2113 | 11) & (~i2114)) - (~(-(-(i2114 << 1))))) - 1;
                            f61904b = i18 % 128;
                            if (i18 % 2 == 0) {
                                iIntValue8 = ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                                int i2115 = 36 / 0;
                                i13 = 2;
                                iIntValue4 = iIntValue4;
                                z18 = z18;
                                str5 = str5;
                                yeVar = yeVar;
                            } else {
                                iIntValue8 = ((Integer) yt.setY(new Object[]{strSubstring, -1}, -1998824873, 1998824895, -1)).intValue();
                                yeVar = yeVar;
                                iIntValue4 = iIntValue4;
                                z18 = z18;
                                str5 = str5;
                                i13 = 2;
                            }
                        } else if (!l.equals("only-if-cached", str2, true)) {
                            if (l.equals("no-transform", str2, true)) {
                                int i2116 = f61904b;
                                int i2117 = (i2116 ^ 59) + ((i2116 & 59) << 1);
                                f61903a = i2117 % 128;
                                int i2118 = i2117 % 2;
                                z16 = true;
                            } else if (l.equals("immutable", str2, true)) {
                                int i2119 = f61904b;
                                int i2210 = (i2119 | 115) << 1;
                                int i2211 = -(i2119 ^ 115);
                                i19 = ((i2210 | i2211) << 1) - (i2211 ^ i2210);
                                int i2212 = i19 % 128;
                                f61903a = i2212;
                                if (i19 % 2 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = true;
                                }
                                int i2213 = i2212 & 93;
                                int i2214 = -(-((i2212 ^ 93) | i2213));
                                int i2215 = ((i2213 | i2214) << 1) - (i2214 ^ i2213);
                                f61904b = i2215 % 128;
                                int i2216 = i2215 % 2;
                            }
                            i13 = 2;
                        } else {
                            int i2217 = f61903a;
                            int i2218 = i2217 & 83;
                            int i2219 = ((((i2217 ^ 83) | i2218) << 1) - (~(-((i2217 | 83) & (~i2218))))) - 1;
                            int i2310 = i2219 % 128;
                            f61904b = i2310;
                            int i2311 = i2219 % 2;
                            int i2312 = (i2310 & (-100)) | ((~i2310) & 99);
                            int i2313 = (i2310 & 99) << 1;
                            int i2314 = ((i2312 | i2313) << 1) - (i2313 ^ i2312);
                            f61903a = i2314 % 128;
                            int i2315 = i2314 % 2;
                            yeVar = yeVar;
                            iIntValue4 = iIntValue4;
                            z18 = z18;
                            str5 = str5;
                            i13 = 2;
                            z15 = true;
                        }
                        i13 = 2;
                    } else {
                        int i2316 = f61904b;
                        int i2317 = (i2316 ^ 107) + ((i2316 & 107) << 1);
                        f61903a = i2317 % 128;
                        int i2318 = i2317 % 2;
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        yeVar = yeVar;
                        iIntValue4 = iIntValue4;
                        z18 = z18;
                        str5 = str5;
                        i13 = 2;
                        z10 = true;
                    }
                }
                c10 = 0;
                i26 = 2;
                i27 = 1;
            }
            if (z18) {
                str = str5;
            } else {
                int i250 = f61903a;
                int i251 = i250 & 71;
                int i252 = (i250 | 71) & (~i251);
                int i253 = -(-(i251 << 1));
                int i254 = (i252 ^ i253) + ((i252 & i253) << 1);
                f61904b = i254 % 128;
                if (i254 % 2 == 0) {
                    throw null;
                }
                str = null;
            }
            xq xqVar = new xq(z10, z11, iIntValue5, iIntValue6, z12, z13, z14, iIntValue7, iIntValue8, z15, z16, z17, str, null);
            int i255 = f61904b;
            int i256 = i255 & 111;
            int i257 = (i255 | 111) & (~i256);
            int i258 = i256 << 1;
            int i259 = ((i257 | i258) << 1) - (i257 ^ i258);
            f61903a = i259 % 128;
            int i260 = i259 % 2;
            return xqVar;
        }
    }

    static {
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode}, 1504760308, -1504760305, System.identityHashCode(setcompounddrawabletintblendmode));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = new setCompoundDrawableTintBlendMode();
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode3}, -459140279, 459140283, System.identityHashCode(setcompounddrawabletintblendmode3));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode4, TimeUnit.SECONDS}, 1714351845, -1714351845, System.identityHashCode(setcompounddrawabletintblendmode4));
        int i10 = f61883o;
        int i11 = i10 & 119;
        int i12 = (((i10 | 119) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f61882n = i12 % 128;
        int i13 = i12 % 2;
    }

    public xq(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.setOnLongClickListener = z10;
        this.setLayoutAnimation = z11;
        this.setOnFocusChangeListener = i10;
        this.f61887d = i11;
        this.setDividerPadding = z12;
        this.setY = z13;
        this.setOnDragListener = z14;
        this.setNavigationOnClickListener = i12;
        this.getNavBarTitleString = i13;
        this.setTextAlignment = z15;
        this.f61894k = z16;
        this.f61895l = z17;
        this.m = str;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        switch ((((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16) {
            case 1:
                xq xqVar = (xq) objArr[0];
                int i20 = f61883o;
                int i21 = i20 & 77;
                int i22 = (i20 ^ 77) | i21;
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                f61882n = i23 % 128;
                int i24 = i23 % 2;
                String string = xqVar.m;
                if (string == null) {
                    StringBuilder sb2 = new StringBuilder();
                    if (!(!((Boolean) setX(new Object[]{xqVar}, 223506781, -223506773, System.identityHashCode(xqVar))).booleanValue())) {
                        int i25 = f61883o;
                        int i26 = i25 & 29;
                        int i27 = (i25 ^ 29) | i26;
                        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                        f61882n = i28 % 128;
                        int i29 = i28 % 2;
                        sb2.append("no-cache, ");
                        int i30 = f61882n;
                        int i31 = i30 ^ 113;
                        int i32 = ((i30 & 113) | i31) << 1;
                        int i33 = -i31;
                        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                        f61883o = i34 % 128;
                        int i35 = i34 % 2;
                    }
                    if (((Boolean) setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                        int i36 = f61882n + 55;
                        f61883o = i36 % 128;
                        if (i36 % 2 == 0) {
                            sb2.append("no-store, ");
                            throw null;
                        }
                        sb2.append("no-store, ");
                    }
                    if (((Integer) setX(new Object[]{xqVar}, -782682580, 782682589, System.identityHashCode(xqVar))).intValue() != -1) {
                        int iIdentityHashCode = System.identityHashCode(xqVar);
                        int i37 = (-329610292) ^ iIdentityHashCode;
                        int i38 = ~iIdentityHashCode;
                        int i39 = iIdentityHashCode & (-329610292);
                        int i40 = ~((i37 ^ i39) | (i39 & i37));
                        int i41 = (-1257027257) & i40;
                        int i42 = (~i41) & (i40 | (-1257027257));
                        int i43 = (((i42 & i41) | (i42 ^ i41)) * 262) - 1733634967;
                        int i44 = (i43 ^ (-903252278)) + ((i43 & (-903252278)) << 1);
                        int i45 = (-329610292) & i38;
                        int i46 = (~i45) & ((-329610292) | i38);
                        int i47 = ~((i45 & i46) | (i46 ^ i45));
                        int i48 = i47 & (-1542321852);
                        int i49 = (i47 | (-1542321852)) & (~i48);
                        int i50 = (i49 & i48) | (i49 ^ i48);
                        int i51 = ((-285294596) & i50) | ((~i50) & 285294595);
                        int i52 = i50 & 285294595;
                        int i53 = (i44 - (~(-(~(-(-(((i52 & i51) | (i51 ^ i52)) * 262))))))) - 2;
                        int iIdentityHashCode2 = System.identityHashCode(xqVar);
                        int i54 = ~(((-1677787281) & iIdentityHashCode2) | ((-1677787281) ^ iIdentityHashCode2));
                        int i55 = ((i54 & (-2127010523)) | ((-2127010523) ^ i54)) * 501;
                        int i56 = ((1815964476 ^ i55) - (~(-(-((i55 & 1815964476) << 1))))) - 1;
                        int i57 = i56 & (-475008176);
                        int i58 = i57 + (((-475008176) ^ i56) | i57);
                        int i59 = ~iIdentityHashCode2;
                        int i60 = (i59 & (-1711604377)) | ((-1711604377) ^ i59);
                        int i61 = (2093193426 & i60) | ((~i60) & (-2093193427));
                        int i62 = i60 & (-2093193427);
                        int i63 = (i62 & i61) | (i61 ^ i62);
                        int i64 = ~i63;
                        int i65 = -(-(((i63 | i64) & i64) * 501));
                        if (i53 > (i58 & i65) + (i65 | i58)) {
                            sb2.append("max-age=");
                            sb2.append(((Integer) setX(new Object[]{xqVar}, -782682580, 782682589, System.identityHashCode(xqVar))).intValue());
                            sb2.append(", ");
                            throw null;
                        }
                        sb2.append("max-age=");
                        sb2.append(((Integer) setX(new Object[]{xqVar}, -782682580, 782682589, System.identityHashCode(xqVar))).intValue());
                        sb2.append(", ");
                    }
                    if (((Integer) setX(new Object[]{xqVar}, 520949256, -520949245, System.identityHashCode(xqVar))).intValue() != -1) {
                        int i66 = f61882n;
                        int i67 = ((i66 ^ 4) + ((i66 & 4) << 1)) - 1;
                        f61883o = i67 % 128;
                        if (i67 % 2 == 0) {
                            sb2.append("s-maxage=");
                            sb2.append(((Integer) setX(new Object[]{xqVar}, 520949256, -520949245, System.identityHashCode(xqVar))).intValue());
                            sb2.append(", ");
                            int i68 = 79 / 0;
                        } else {
                            sb2.append("s-maxage=");
                            sb2.append(((Integer) setX(new Object[]{xqVar}, 520949256, -520949245, System.identityHashCode(xqVar))).intValue());
                            sb2.append(", ");
                        }
                    }
                    if (((Boolean) setX(new Object[]{xqVar}, 2021832796, -2021832792, System.identityHashCode(xqVar))).booleanValue()) {
                        int i69 = f61882n;
                        int i70 = i69 & 25;
                        int i71 = -(-((i69 ^ 25) | i70));
                        int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                        f61883o = i72 % 128;
                        if (i72 % 2 == 0) {
                            sb2.append("private, ");
                            int i73 = 44 / 0;
                        } else {
                            sb2.append("private, ");
                        }
                        int i74 = f61882n;
                        int i75 = ((i74 ^ 97) | (i74 & 97)) << 1;
                        int i76 = -(((~i74) & 97) | (i74 & (-98)));
                        int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                        f61883o = i77 % 128;
                        int i78 = i77 % 2;
                    }
                    if (((Boolean) setX(new Object[]{xqVar}, -171833678, 171833681, System.identityHashCode(xqVar))).booleanValue()) {
                        int i79 = f61883o;
                        int i80 = ((i79 | 53) << 1) - (i79 ^ 53);
                        f61882n = i80 % 128;
                        int i81 = i80 % 2;
                        sb2.append("public, ");
                        int i82 = f61883o + 119;
                        f61882n = i82 % 128;
                        int i83 = i82 % 2;
                    }
                    if (((Boolean) setX(new Object[]{xqVar}, -846729192, 846729199, System.identityHashCode(xqVar))).booleanValue()) {
                        int i84 = f61882n;
                        int i85 = ((i84 | 11) << 1) - (i84 ^ 11);
                        f61883o = i85 % 128;
                        int i86 = i85 % 2;
                        sb2.append("must-revalidate, ");
                        int i87 = f61882n + 57;
                        f61883o = i87 % 128;
                        int i88 = i87 % 2;
                    }
                    if (((Integer) setX(new Object[]{xqVar}, 750343363, -750343351, System.identityHashCode(xqVar))).intValue() != -1) {
                        int i89 = f61882n;
                        int i90 = (((i89 ^ 15) | (i89 & 15)) << 1) - (((~i89) & 15) | (i89 & (-16)));
                        f61883o = i90 % 128;
                        if (i90 % 2 == 0) {
                            sb2.append("max-stale=");
                            sb2.append(((Integer) setX(new Object[]{xqVar}, 750343363, -750343351, System.identityHashCode(xqVar))).intValue());
                            sb2.append(", ");
                            throw null;
                        }
                        sb2.append("max-stale=");
                        sb2.append(((Integer) setX(new Object[]{xqVar}, 750343363, -750343351, System.identityHashCode(xqVar))).intValue());
                        sb2.append(", ");
                        int i91 = f61882n + 36;
                        int i92 = (i91 ^ (-1)) + (i91 << 1);
                        f61883o = i92 % 128;
                        int i93 = i92 % 2;
                    }
                    if (((Integer) setX(new Object[]{xqVar}, -1643188543, 1643188549, System.identityHashCode(xqVar))).intValue() != -1) {
                        int i94 = f61882n;
                        int i95 = i94 & 61;
                        int i96 = (i94 ^ 61) | i95;
                        int i97 = (i95 & i96) + (i96 | i95);
                        f61883o = i97 % 128;
                        if (i97 % 2 == 0) {
                            sb2.append("min-fresh=");
                            sb2.append(((Integer) setX(new Object[]{xqVar}, -1643188543, 1643188549, System.identityHashCode(xqVar))).intValue());
                            sb2.append(", ");
                            throw null;
                        }
                        sb2.append("min-fresh=");
                        sb2.append(((Integer) setX(new Object[]{xqVar}, -1643188543, 1643188549, System.identityHashCode(xqVar))).intValue());
                        sb2.append(", ");
                        int i98 = f61882n;
                        int i99 = i98 & 73;
                        int i100 = i99 + ((i98 ^ 73) | i99);
                        f61883o = i100 % 128;
                        int i101 = i100 % 2;
                    }
                    if (((Boolean) setX(new Object[]{xqVar}, 584308401, -584308399, System.identityHashCode(xqVar))).booleanValue()) {
                        int i102 = f61882n;
                        int i103 = i102 & 7;
                        int i104 = i102 | 7;
                        int i105 = ((i103 | i104) << 1) - (i104 ^ i103);
                        f61883o = i105 % 128;
                        if (i105 % 2 == 0) {
                            sb2.append("only-if-cached, ");
                            throw null;
                        }
                        sb2.append("only-if-cached, ");
                    }
                    if (((Boolean) setX(new Object[]{xqVar}, -269578942, 269578952, System.identityHashCode(xqVar))).booleanValue()) {
                        int i106 = f61883o;
                        int i107 = (((i106 ^ 63) | (i106 & 63)) << 1) - (((~i106) & 63) | (i106 & (-64)));
                        f61882n = i107 % 128;
                        int i108 = i107 % 2;
                        sb2.append("no-transform, ");
                        int i109 = f61882n;
                        int i110 = ((i109 | 118) << 1) - (i109 ^ 118);
                        int i111 = (i110 ^ (-1)) + (i110 << 1);
                        f61883o = i111 % 128;
                        int i112 = i111 % 2;
                    }
                    if (((Boolean) setX(new Object[]{xqVar}, 256857974, -256857969, System.identityHashCode(xqVar))).booleanValue()) {
                        int i113 = f61883o;
                        int i114 = i113 & 61;
                        int i115 = i113 | 61;
                        int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                        f61882n = i116 % 128;
                        int i117 = i116 % 2;
                        sb2.append("immutable, ");
                        int i118 = f61882n;
                        int i119 = ((i118 & (-86)) | ((~i118) & 85)) + ((i118 & 85) << 1);
                        f61883o = i119 % 128;
                        int i120 = i119 % 2;
                    }
                    if (sb2.length() == 0) {
                        int i121 = f61882n;
                        int i122 = i121 & 71;
                        int i123 = (i122 - (~((i121 ^ 71) | i122))) - 1;
                        int i124 = i123 % 128;
                        f61883o = i124;
                        int i125 = i123 % 2;
                        int i126 = i124 & 43;
                        int i127 = -(-((i124 ^ 43) | i126));
                        int i128 = ((i126 | i127) << 1) - (i127 ^ i126);
                        f61882n = i128 % 128;
                        int i129 = i128 % 2;
                        z10 = true;
                    } else {
                        int i130 = f61883o;
                        int i131 = i130 & 39;
                        int i132 = -(-((i130 ^ 39) | i131));
                        int i133 = ((i131 | i132) << 1) - (i132 ^ i131);
                        f61882n = i133 % 128;
                        int i134 = i133 % 2;
                        z10 = false;
                    }
                    if (!(!z10)) {
                        int i135 = f61882n;
                        int i136 = ((i135 | 5) << 1) - (i135 ^ 5);
                        f61883o = i136 % 128;
                        if (i136 % 2 == 0) {
                            int i137 = 88 / 0;
                        }
                        return "";
                    }
                    int length = sb2.length();
                    int iIdentityHashCode3 = System.identityHashCode(xqVar);
                    int i138 = -(-(length * (-958)));
                    int i139 = 1916 & i138;
                    int i140 = ((((1916 ^ i138) | i139) << 1) - (~(-((i138 | 1916) & (~i139))))) - 1;
                    int i141 = ~length;
                    int i142 = (i141 | length) & i141;
                    int i143 = ~iIdentityHashCode3;
                    int i144 = (i143 | iIdentityHashCode3) & i143;
                    int i145 = i142 & i144;
                    int i146 = (i142 | i144) & (~i145);
                    int i147 = ~((i146 & i145) | (i146 ^ i145));
                    int i148 = 1 & iIdentityHashCode3;
                    int i149 = (~i148) & (1 | iIdentityHashCode3);
                    int i150 = (i149 & i148) | (i149 ^ i148);
                    int i151 = ~i150;
                    int i152 = (i150 | i151) & i151;
                    int i153 = (i147 & i152) | (i147 ^ i152);
                    int i154 = i143 & (-2);
                    int i155 = (~i154) & (i143 | (-2));
                    int i156 = ~((i155 & i154) | (i155 ^ i154));
                    int i157 = i153 & i156;
                    int i158 = -(~(-(-((((i153 | i156) & (~i157)) | i157) * 959))));
                    int i159 = ((i140 ^ i158) + ((i158 & i140) << 1)) - 1;
                    int i160 = ((-2) & i141) | (length & 1);
                    int i161 = length & (-2);
                    int i162 = -(~((~((i161 & i160) | (i160 ^ i161))) * (-959)));
                    int i163 = ((i159 ^ i162) + ((i162 & i159) << 1)) - 1;
                    int i164 = 1 ^ i143;
                    int i165 = 1 & i143;
                    int i166 = ~((i164 & i165) | (i164 ^ i165));
                    int i167 = i141 & iIdentityHashCode3;
                    int i168 = ~(((i141 | iIdentityHashCode3) & (~i167)) | i167);
                    int i169 = i166 & i168;
                    int i170 = (i166 | i168) & (~i169);
                    int i171 = (i170 & i169) | (i170 ^ i169);
                    int i172 = i154 | i148;
                    int i173 = iIdentityHashCode3 & (-2);
                    int i174 = ~((i173 & i172) | (i172 ^ i173));
                    int i175 = i171 & i174;
                    int i176 = (i171 | i174) & (~i175);
                    int i177 = -(~(((i176 & i175) | (i176 ^ i175)) * 959));
                    sb2.delete(((i163 & i177) + (i177 | i163)) - 1, sb2.length());
                    string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    xqVar.m = string;
                    int i178 = f61882n;
                    int i179 = i178 ^ 117;
                    int i180 = ((((i178 & 117) | i179) << 1) - (~(-i179))) - 1;
                    f61883o = i180 % 128;
                    int i181 = i180 % 2;
                }
                int i182 = f61883o;
                int i183 = i182 ^ 53;
                int i184 = -(-((i182 & 53) << 1));
                int i185 = ((i183 | i184) << 1) - (i184 ^ i183);
                f61882n = i185 % 128;
                int i186 = i185 % 2;
                return string;
            case 2:
                xq xqVar2 = (xq) objArr[0];
                int i187 = f61883o;
                int i188 = (((i187 & (-48)) | ((~i187) & 47)) - (~(-(-((i187 & 47) << 1))))) - 1;
                f61882n = i188 % 128;
                int i189 = i188 % 2;
                boolean z11 = xqVar2.setTextAlignment;
                if (i189 != 0) {
                    throw null;
                }
                int i190 = (i187 & 105) + (i187 | 105);
                f61882n = i190 % 128;
                if (i190 % 2 != 0) {
                    int i191 = 9 / 0;
                }
                return Boolean.valueOf(z11);
            case 3:
                xq xqVar3 = (xq) objArr[0];
                int i192 = f61882n + 117;
                int i193 = i192 % 128;
                f61883o = i193;
                int i194 = i192 % 2;
                boolean z12 = xqVar3.setY;
                int i195 = i193 + 35;
                f61882n = i195 % 128;
                int i196 = i195 % 2;
                return Boolean.valueOf(z12);
            case 4:
                xq xqVar4 = (xq) objArr[0];
                int i197 = f61883o + 33;
                int i198 = i197 % 128;
                f61882n = i198;
                int i199 = i197 % 2;
                boolean z13 = xqVar4.setDividerPadding;
                int i200 = i198 & 119;
                int i201 = (i198 | 119) & (~i200);
                int i202 = i200 << 1;
                int i203 = (i201 & i202) + (i202 | i201);
                f61883o = i203 % 128;
                int i204 = i203 % 2;
                return Boolean.valueOf(z13);
            case 5:
                xq xqVar5 = (xq) objArr[0];
                int i205 = f61883o;
                int i206 = ((i205 ^ 95) | (i205 & 95)) << 1;
                int i207 = -(((~i205) & 95) | (i205 & (-96)));
                int i208 = (i206 ^ i207) + ((i207 & i206) << 1);
                f61882n = i208 % 128;
                int i209 = i208 % 2;
                boolean z14 = xqVar5.f61895l;
                if (i209 == 0) {
                    return Boolean.valueOf(z14);
                }
                throw null;
            case 6:
                xq xqVar6 = (xq) objArr[0];
                int i210 = f61883o;
                int i211 = ((i210 | 39) << 1) - (i210 ^ 39);
                f61882n = i211 % 128;
                int i212 = i211 % 2;
                int i213 = xqVar6.getNavBarTitleString;
                if (i212 == 0) {
                    return Integer.valueOf(i213);
                }
                throw null;
            case 7:
                xq xqVar7 = (xq) objArr[0];
                int i214 = f61883o;
                int i215 = ((i214 & 22) + (i214 | 22)) - 1;
                int i216 = i215 % 128;
                f61882n = i216;
                int i217 = i215 % 2;
                boolean z15 = xqVar7.setOnDragListener;
                int i218 = (i216 & (-106)) | ((~i216) & 105);
                int i219 = -(-((i216 & 105) << 1));
                int i220 = ((i218 | i219) << 1) - (i219 ^ i218);
                f61883o = i220 % 128;
                if (i220 % 2 != 0) {
                    return Boolean.valueOf(z15);
                }
                throw null;
            case 8:
                xq xqVar8 = (xq) objArr[0];
                int i221 = f61882n + 7;
                f61883o = i221 % 128;
                int i222 = i221 % 2;
                boolean z16 = xqVar8.setOnLongClickListener;
                if (i222 != 0) {
                    return Boolean.valueOf(z16);
                }
                throw null;
            case 9:
                xq xqVar9 = (xq) objArr[0];
                int i223 = f61882n;
                int i224 = i223 ^ 49;
                int i225 = -(-((i223 & 49) << 1));
                int i226 = (i224 & i225) + (i225 | i224);
                f61883o = i226 % 128;
                int i227 = i226 % 2;
                int i228 = xqVar9.setOnFocusChangeListener;
                if (i227 != 0) {
                    return Integer.valueOf(i228);
                }
                throw null;
            case 10:
                xq xqVar10 = (xq) objArr[0];
                int i229 = f61883o;
                int i230 = ((i229 ^ 39) | (i229 & 39)) << 1;
                int i231 = -(((~i229) & 39) | (i229 & (-40)));
                int i232 = (i230 & i231) + (i231 | i230);
                int i233 = i232 % 128;
                f61882n = i233;
                int i234 = i232 % 2;
                boolean z17 = xqVar10.f61894k;
                if (i234 != 0) {
                    throw null;
                }
                int i235 = i233 + 31;
                f61883o = i235 % 128;
                if (i235 % 2 != 0) {
                    return Boolean.valueOf(z17);
                }
                throw null;
            case 11:
                xq xqVar11 = (xq) objArr[0];
                int i236 = f61882n;
                int i237 = i236 ^ 17;
                int i238 = ((i236 & 17) | i237) << 1;
                int i239 = -i237;
                int i240 = (i238 ^ i239) + ((i239 & i238) << 1);
                f61883o = i240 % 128;
                int i241 = i240 % 2;
                int i242 = xqVar11.f61887d;
                int i243 = ((i236 ^ 71) | (i236 & 71)) << 1;
                int i244 = -((71 & (~i236)) | (i236 & (-72)));
                int i245 = (i243 ^ i244) + ((i244 & i243) << 1);
                f61883o = i245 % 128;
                int i246 = i245 % 2;
                return Integer.valueOf(i242);
            case 12:
                xq xqVar12 = (xq) objArr[0];
                int i247 = f61883o;
                int i248 = i247 & 51;
                int i249 = i247 | 51;
                int i250 = ((i248 | i249) << 1) - (i249 ^ i248);
                f61882n = i250 % 128;
                int i251 = i250 % 2;
                int i252 = xqVar12.setNavigationOnClickListener;
                if (i251 != 0) {
                    int i253 = 25 / 0;
                }
                return Integer.valueOf(i252);
            default:
                xq xqVar13 = (xq) objArr[0];
                int i254 = f61882n;
                int i255 = i254 & 11;
                int i256 = i255 + ((i254 ^ 11) | i255);
                f61883o = i256 % 128;
                int i257 = i256 % 2;
                boolean z18 = xqVar13.setLayoutAnimation;
                if (i257 != 0) {
                    return Boolean.valueOf(z18);
                }
                throw null;
        }
    }

    @JvmName(name = "getNavBarTitleString")
    public final boolean getNavBarTitleString() {
        return ((Boolean) setX(new Object[]{this}, 584308401, -584308399, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setX(new Object[]{this}, -171833678, 171833681, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setDividerPadding")
    public final boolean setDividerPadding() {
        return ((Boolean) setX(new Object[]{this}, 1922756639, -1922756639, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setLayoutAnimation")
    public final int setLayoutAnimation() {
        return ((Integer) setX(new Object[]{this}, 750343363, -750343351, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setNavigationOnClickListener")
    public final int setNavigationOnClickListener() {
        return ((Integer) setX(new Object[]{this}, -1643188543, 1643188549, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setOnDragListener")
    public final boolean setOnDragListener() {
        return ((Boolean) setX(new Object[]{this}, -846729192, 846729199, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setX(new Object[]{this}, 223506781, -223506773, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setY")
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, 2021832796, -2021832792, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, 1585151458, -1585151457, System.identityHashCode(this));
    }

    public static final class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f61896f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f61897g = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f61898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61899b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f61900c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61901d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f61902e;

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            int iValueOf;
            int i13 = ~i10;
            int i14 = ((~(i11 | i13)) * 381) + (((~(i10 | i11)) | (~((~i12) | i11)) | (~((~i11) | i13))) * 381) + ((i11 | i12 | i13) * (-381)) + (i11 * 382) + (i10 * (-380));
            if (i14 == 1) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
                xq xqVar = new xq(setcompounddrawabletintblendmode.f61898a, false, setcompounddrawabletintblendmode.f61899b, -1, false, false, false, setcompounddrawabletintblendmode.f61900c, setcompounddrawabletintblendmode.f61901d, setcompounddrawabletintblendmode.f61902e, false, false, null, null);
                int i15 = f61897g;
                int i16 = ((i15 ^ 114) + ((i15 & 114) << 1)) - 1;
                f61896f = i16 % 128;
                if (i16 % 2 == 0) {
                    return xqVar;
                }
                throw null;
            }
            if (i14 == 2) {
                long jLongValue = ((Number) objArr[0]).longValue();
                int i17 = f61896f;
                int i18 = i17 + 12;
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                f61897g = i19 % 128;
                if (i19 % 2 == 0) {
                    throw null;
                }
                if (jLongValue > 2147483647L) {
                    int i20 = i17 & 57;
                    int i21 = ((~i20) & (i17 | 57)) + (i20 << 1);
                    f61897g = i21 % 128;
                    if (i21 % 2 == 0) {
                        throw null;
                    }
                    iValueOf = Integer.MAX_VALUE;
                } else {
                    int i22 = (int) jLongValue;
                    int i23 = (i17 & (-62)) | ((~i17) & 61);
                    int i24 = -(-((i17 & 61) << 1));
                    int i25 = (i23 & i24) + (i23 | i24);
                    f61897g = i25 % 128;
                    if (i25 % 2 == 0) {
                        throw null;
                    }
                    iValueOf = Integer.valueOf(i22);
                }
                return iValueOf;
            }
            if (i14 == 3) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) objArr[0];
                int i26 = f61896f;
                int i27 = (i26 & 71) + (i26 | 71);
                int i28 = i27 % 128;
                f61897g = i28;
                if (i27 % 2 == 0) {
                    setcompounddrawabletintblendmode2.f61898a = false;
                } else {
                    setcompounddrawabletintblendmode2.f61898a = true;
                }
                int i29 = (i28 | 41) << 1;
                int i30 = -((i28 & (-42)) | ((~i28) & 41));
                int i31 = (i29 & i30) + (i29 | i30);
                f61896f = i31 % 128;
                if (i31 % 2 == 0) {
                    return setcompounddrawabletintblendmode2;
                }
                throw null;
            }
            if (i14 == 4) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (setCompoundDrawableTintBlendMode) objArr[0];
                int i32 = f61897g + 42;
                int i33 = (i32 ^ (-1)) + (i32 << 1);
                f61896f = i33 % 128;
                int i34 = i33 % 2;
                setcompounddrawabletintblendmode3.f61902e = true;
                return setcompounddrawabletintblendmode3;
            }
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (setCompoundDrawableTintBlendMode) objArr[0];
            TimeUnit timeUnit = (TimeUnit) objArr[1];
            int i35 = f61897g;
            int i36 = ((i35 ^ 3) - (~((3 & i35) << 1))) - 1;
            f61896f = i36 % 128;
            int i37 = i36 % 2;
            Intrinsics.checkNotNullParameter(timeUnit, "");
            setcompounddrawabletintblendmode4.f61900c = ((Integer) setOnFocusChangeListener(new Object[]{Long.valueOf(timeUnit.toSeconds(2147483647L))}, -1139472675, 1139472677, (int) System.currentTimeMillis())).intValue();
            int i38 = f61897g;
            int i39 = i38 & 15;
            int i40 = ((i38 | 15) & (~i39)) + (i39 << 1);
            f61896f = i40 % 128;
            if (i40 % 2 == 0) {
                return setcompounddrawabletintblendmode4;
            }
            throw null;
        }

        @NotNull
        public final setCompoundDrawableTintBlendMode setCompoundDrawableTintBlendMode(@NotNull TimeUnit timeUnit) {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this, timeUnit}, 1714351845, -1714351845, System.identityHashCode(this));
        }

        @NotNull
        public final xq setDividerPadding() {
            return (xq) setOnFocusChangeListener(new Object[]{this}, 417650848, -417650847, System.identityHashCode(this));
        }

        @NotNull
        public final setCompoundDrawableTintBlendMode setY() {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this}, 1504760308, -1504760305, System.identityHashCode(this));
        }

        @NotNull
        public final setCompoundDrawableTintBlendMode setOnFocusChangeListener() {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this}, -459140279, 459140283, System.identityHashCode(this));
        }
    }

    @JvmName(name = "setX")
    public final int setX() {
        return ((Integer) setX(new Object[]{this}, -782682580, 782682589, System.identityHashCode(this))).intValue();
    }
}
