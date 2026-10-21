package com.mypinpad.tsdk.isolation;

import androidx.room.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0002J\u000f\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0019"}, d2 = {"Lokhttp3/MediaType;", "", "", "toString", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Ljava/nio/charset/Charset;", "defaultValue", "charset", "name", "parameter", "-deprecated_subtype", "()Ljava/lang/String;", "subtype", "-deprecated_type", "type", "mediaType", "Ljava/lang/String;", "", "parameterNamesAndValues", "[Ljava/lang/String;", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0})
public final class yj {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f62098g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f62099h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f62100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f62101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f62102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String[] f62103d;

    @NotNull
    public static final setX setOnFocusChangeListener = new setX(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f62096e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f62097f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    static {
        int i10 = f62098g;
        int i11 = i10 & 13;
        int i12 = i11 + ((i10 ^ 13) | i11);
        f62099h = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 12 / 0;
        }
    }

    public yj(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f62100a = str;
        this.f62101b = str2;
        this.f62102c = str3;
        this.f62103d = strArr;
    }

    public static /* synthetic */ Charset setDividerPadding(yj yjVar) {
        return (Charset) setX(new Object[]{yjVar}, -1228786349, 1228786353, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ Pattern setOnFocusChangeListener() {
        return (Pattern) setX(new Object[0], 627246667, -627246664, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        String str;
        int i13 = ~i10;
        int i14 = (((~(i10 | (~i11))) | (~(i11 | i13 | i12))) * 235) + (((~(i13 | i12)) | i11) * (-470)) + (((~((~i12) | i13)) | i11) * (-235)) + (i11 * 471) + (i10 * 236);
        String str2 = null;
        switch (i14) {
            case 1:
                yj yjVar = (yj) objArr[0];
                Charset charsetForName = (Charset) objArr[1];
                int i15 = f62099h + 51;
                f62098g = i15 % 128;
                int i16 = i15 % 2;
                String str3 = (String) setX(new Object[]{yjVar, "charset"}, 1075454750, -1075454744, System.identityHashCode(yjVar));
                if (str3 != null) {
                    try {
                        charsetForName = Charset.forName(str3);
                        int i17 = f62098g;
                        int i18 = i17 & 55;
                        int i19 = -(-((i17 ^ 55) | i18));
                        int i20 = (i18 & i19) + (i19 | i18);
                        f62099h = i20 % 128;
                        int i21 = i20 % 2;
                    } catch (IllegalArgumentException unused) {
                    }
                    int i22 = f62099h + 93;
                    f62098g = i22 % 128;
                    if (i22 % 2 == 0) {
                        return charsetForName;
                    }
                    int i23 = 23 / 0;
                    return charsetForName;
                }
                int i24 = f62099h;
                int i25 = (i24 & 107) + (i24 | 107);
                int i26 = i25 % 128;
                f62098g = i26;
                if (i25 % 2 != 0) {
                    int i27 = 0 / 0;
                }
                int i28 = i26 & 9;
                int i29 = (i26 | 9) & (~i28);
                int i30 = i28 << 1;
                int i31 = (i29 & i30) + (i29 | i30);
                f62099h = i31 % 128;
                if (i31 % 2 != 0) {
                    return charsetForName;
                }
                throw null;
            case 2:
                yj yjVar2 = (yj) objArr[0];
                Object obj = objArr[1];
                int i32 = f62098g;
                int i33 = (i32 & (-116)) | ((~i32) & 115);
                int i34 = -(-((i32 & 115) << 1));
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                f62099h = i35 % 128;
                if (i35 % 2 == 0) {
                    boolean z10 = obj instanceof yj;
                    throw null;
                }
                if (!(obj instanceof yj) || !Intrinsics.areEqual(((yj) obj).f62100a, yjVar2.f62100a)) {
                    int i36 = f62099h + 23;
                    f62098g = i36 % 128;
                    if (i36 % 2 != 0) {
                        int i37 = 62 / 0;
                    }
                    return Boolean.FALSE;
                }
                int i38 = f62098g;
                int i39 = i38 + 59;
                f62099h = i39 % 128;
                int i40 = i39 % 2;
                int i41 = (i38 & 89) + (i38 | 89);
                f62099h = i41 % 128;
                if (i41 % 2 == 0) {
                    int i42 = 3 / 0;
                }
                return Boolean.TRUE;
            case 3:
                int i43 = f62098g + 71;
                f62099h = i43 % 128;
                if (i43 % 2 != 0) {
                    return f62097f;
                }
                throw null;
            case 4:
                yj yjVar3 = (yj) objArr[0];
                int i44 = f62098g + 99;
                f62099h = i44 % 128;
                int i45 = i44 % 2;
                Charset charset = (Charset) setX(new Object[]{yjVar3, null}, -1673590045, 1673590046, System.identityHashCode(yjVar3));
                int i46 = f62099h + 45;
                f62098g = i46 % 128;
                int i47 = i46 % 2;
                return charset;
            case 5:
                yj yjVar4 = (yj) objArr[0];
                int i48 = f62098g;
                int i49 = i48 ^ 57;
                int i50 = (((i48 & 57) | i49) << 1) - i49;
                f62099h = i50 % 128;
                int i51 = i50 % 2;
                String str4 = yjVar4.f62101b;
                if (i51 != 0) {
                    return str4;
                }
                int i52 = 59 / 0;
                return str4;
            case 6:
                yj yjVar5 = (yj) objArr[0];
                String str5 = (String) objArr[1];
                int i53 = f62098g;
                int i54 = (i53 & (-72)) | ((~i53) & 71);
                int i55 = -(-((i53 & 71) << 1));
                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                f62099h = i56 % 128;
                int i57 = i56 % 2;
                Intrinsics.checkNotNullParameter(str5, "");
                int length = yjVar5.f62103d.length;
                int iIdentityHashCode = System.identityHashCode(yjVar5);
                int i58 = length * (-622);
                int i59 = (-624) & i58;
                int i60 = (((((-624) ^ i58) | i59) << 1) - (~(-((i58 | (-624)) & (~i59))))) - 1;
                int i61 = ~length;
                int i62 = ~i61;
                int i63 = (i62 ^ i61) | (i62 & i61);
                int i64 = ~iIdentityHashCode;
                int i65 = (i63 & iIdentityHashCode) | (i63 ^ iIdentityHashCode);
                int i66 = ~i65;
                int i67 = ((i65 | i66) & i66) * 623;
                int i68 = i60 | i67;
                int i69 = i68 << 1;
                int i70 = -((~(i60 & i67)) & i68);
                int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                int i72 = (i64 | iIdentityHashCode) & i64;
                int i73 = (i71 - (~(-(-(((i72 & i61) | ((i72 & i62) | ((~i72) & i61))) * (-623)))))) - 1;
                int i74 = i62 | i61;
                int i75 = ~i74;
                int i76 = (i74 | i75) & i75;
                int i77 = (length | i61) & i61;
                int i78 = i77 ^ iIdentityHashCode;
                int i79 = i77 & iIdentityHashCode;
                int i80 = (i79 & i78) | (i78 ^ i79);
                int i81 = ~i80;
                int i82 = (i80 | i81) & i81;
                int i83 = ((~i82) & i76) | ((~i76) & i82);
                int i84 = i82 & i76;
                int i85 = (i84 & i83) | (i83 ^ i84);
                int i86 = ~((iIdentityHashCode & i64) | (i64 ^ iIdentityHashCode));
                int i87 = ((~i86) & i85) | ((~i85) & i86);
                int i88 = i85 & i86;
                int i89 = ((i88 & i87) | (i87 ^ i88)) * 623;
                int i90 = i73 & i89;
                int i91 = (i89 | i73) & (~i90);
                int i92 = i90 << 1;
                int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, (i91 ^ i92) + ((i91 & i92) << 1), 2);
                if (progressionLastElement >= 0) {
                    int i93 = 0;
                    while (true) {
                        int i94 = ((i93 | (-84)) << 1) - (i93 ^ (-84));
                        int i95 = (((i94 ^ 86) | (i94 & 86)) << 1) - (((~i94) & 86) | (i94 & (-87)));
                        String[] strArr = yjVar5.f62103d;
                        if (l.equals(strArr[i93], str5, true)) {
                            int i96 = f62098g;
                            int i97 = ((i96 ^ 94) + ((i96 & 94) << 1)) - 1;
                            int i98 = i97 % 128;
                            f62099h = i98;
                            if (i97 % 2 == 0) {
                                str = strArr[i93 / 0];
                            } else {
                                int i99 = i93 & 1;
                                int i100 = ((i93 ^ 1) | i99) << 1;
                                int i101 = -((~i99) & (i93 | 1));
                                str = strArr[((i100 | i101) << 1) - (i100 ^ i101)];
                            }
                            int i102 = ((i98 & 120) + (i98 | 120)) - 1;
                            f62098g = i102 % 128;
                            if (i102 % 2 != 0) {
                                throw null;
                            }
                            str2 = str;
                        } else if (i93 == progressionLastElement) {
                            int i103 = f62099h;
                            int i104 = (i103 & 121) + (i103 | 121);
                            f62098g = i104 % 128;
                            int i105 = i104 % 2;
                        } else {
                            i93 = i95;
                        }
                    }
                } else {
                    int i106 = f62099h;
                    int i107 = (i106 & 121) + (i106 | 121);
                    f62098g = i107 % 128;
                    int i108 = i107 % 2;
                }
                return str2;
            case 7:
                yj yjVar6 = (yj) objArr[0];
                int i109 = f62098g;
                int i110 = ((i109 & 92) + (i109 | 92)) - 1;
                int i111 = i110 % 128;
                f62099h = i111;
                int i112 = i110 % 2;
                String str6 = yjVar6.f62102c;
                int i113 = i111 & 43;
                int i114 = ((i111 ^ 43) | i113) << 1;
                int i115 = -((i111 | 43) & (~i113));
                int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
                f62098g = i116 % 128;
                int i117 = i116 % 2;
                return str6;
            case 8:
                yj yjVar7 = (yj) objArr[0];
                int i118 = f62099h + 63;
                int i119 = i118 % 128;
                f62098g = i119;
                int i120 = i118 % 2;
                String str7 = yjVar7.f62100a;
                if (i120 != 0) {
                    throw null;
                }
                int i121 = i119 ^ 111;
                int i122 = (i119 & 111) << 1;
                int i123 = (i121 ^ i122) + ((i121 & i122) << 1);
                f62099h = i123 % 128;
                int i124 = i123 % 2;
                return str7;
            case 9:
                yj yjVar8 = (yj) objArr[0];
                int i125 = f62099h + 26;
                int i126 = (i125 ^ (-1)) + (i125 << 1);
                f62098g = i126 % 128;
                int i127 = i126 % 2;
                String str8 = yjVar8.f62100a;
                if (i127 == 0) {
                    return Integer.valueOf(str8.hashCode());
                }
                str8.hashCode();
                throw null;
            default:
                int i128 = f62099h;
                int i129 = i128 & 43;
                int i130 = (i128 | 43) & (~i129);
                int i131 = -(-(i129 << 1));
                int i132 = (i130 & i131) + (i130 | i131);
                f62098g = i132 % 128;
                if (i132 % 2 != 0) {
                    int i133 = 60 / 0;
                }
                return f62096e;
        }
    }

    public final boolean equals(@Nullable Object other) {
        return ((Boolean) setX(new Object[]{this, other}, -550492191, 550492193, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 1410588931, -1410588922, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "subtype")
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setX(new Object[]{this}, -1751399784, 1751399791, System.identityHashCode(this));
    }

    @JvmOverloads
    @Nullable
    public final Charset setY(@Nullable Charset charset) {
        return (Charset) setX(new Object[]{this, charset}, -1673590045, 1673590046, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -1473036550, 1473036558, System.identityHashCode(this));
    }

    @JvmName(name = "type")
    @NotNull
    public final String setY() {
        return (String) setX(new Object[]{this}, -1745004322, 1745004327, System.identityHashCode(this));
    }

    public static final /* synthetic */ Pattern setX() {
        return (Pattern) setX(new Object[0], 1940767611, -1940767611, (int) System.currentTimeMillis());
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005R\u0018\u0010\u0006\u001a\u0006*\u00020\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0006*\u00020\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/yj$setX;", "", "", "Lcom/mypinpad/tsdk/i/yj;", "setOnFocusChangeListener", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/yj;", "setDividerPadding", "Ljava/util/regex/Pattern;", "setOnLongClickListener", "Ljava/util/regex/Pattern;", "setLayoutAnimation", "setX", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class setX {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62104a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62105b = 1;

        public setX() {
        }

        public /* synthetic */ setX(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i14 | i12)) | (~(i13 | i14)) | (~(i13 | i12))) * (-880)) + (i11 * 881) + (i10 * 881);
            int i16 = i11 | (~(i13 | (~i12)));
            int i17 = ~(i10 | i12);
            int i18 = (i17 * 880) + ((i16 | i17) * (-880)) + i15;
            yj yjVar = null;
            if (i18 != 1) {
                String str = (String) objArr[0];
                int i19 = f62104a;
                int i20 = i19 ^ 61;
                int i21 = -(-((i19 & 61) << 1));
                int i22 = (i20 & i21) + (i21 | i20);
                f62105b = i22 % 128;
                int i23 = i22 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                try {
                    yj yjVar2 = (yj) setDividerPadding(new Object[]{str}, -2934678, 2934679, (int) System.currentTimeMillis());
                    int i24 = f62104a;
                    int i25 = i24 & 43;
                    int i26 = (((i24 ^ 43) | i25) << 1) - ((i24 | 43) & (~i25));
                    f62105b = i26 % 128;
                    int i27 = i26 % 2;
                    yjVar = yjVar2;
                } catch (IllegalArgumentException unused) {
                }
                int i28 = f62105b;
                int i29 = (i28 & (-38)) | ((~i28) & 37);
                int i30 = -(-((i28 & 37) << 1));
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                f62104a = i31 % 128;
                if (i31 % 2 != 0) {
                    int i32 = 94 / 0;
                }
            } else {
                String str2 = (String) objArr[0];
                Intrinsics.checkNotNullParameter(str2, "");
                Matcher matcher = ((Pattern) yj.setX(new Object[0], 1940767611, -1940767611, (int) System.currentTimeMillis())).matcher(str2);
                if (!matcher.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder("No subtype found for: \"");
                    sb2.append(str2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String strGroup = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(strGroup, "");
                Locale locale = Locale.US;
                String strD = a.d(locale, "", strGroup, locale, "");
                String strGroup2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(strGroup2, "");
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = strGroup2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = ((Pattern) yj.setX(new Object[0], 627246667, -627246664, (int) System.currentTimeMillis())).matcher(str2);
                int iEnd = matcher.end();
                while (iEnd < str2.length()) {
                    matcher2.region(iEnd, str2.length());
                    if (!matcher2.lookingAt()) {
                        StringBuilder sb3 = new StringBuilder("Parameter is not formatted correctly: \"");
                        String strSubstring = str2.substring(iEnd);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        sb3.append(strSubstring);
                        sb3.append("\" for: \"");
                        sb3.append(str2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    String strGroup3 = matcher2.group(1);
                    if (strGroup3 == null) {
                        iEnd = matcher2.end();
                    } else {
                        String strGroup4 = matcher2.group(2);
                        if (strGroup4 == null) {
                            strGroup4 = matcher2.group(3);
                        } else if (l.startsWith$default(strGroup4, "'", false, 2, null) && l.endsWith$default(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                            strGroup4 = strGroup4.substring(1, ((-1) << 1) - (strGroup4.length() ^ (-1)));
                            Intrinsics.checkNotNullExpressionValue(strGroup4, "");
                        }
                        arrayList.add(strGroup3);
                        arrayList.add(strGroup4);
                        iEnd = matcher2.end();
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                yjVar = new yj(str2, strD, lowerCase, (String[]) array, null);
            }
            return yjVar;
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public static yj setOnFocusChangeListener(@NotNull String str) {
            return (yj) setDividerPadding(new Object[]{str}, -2934678, 2934679, (int) System.currentTimeMillis());
        }

        @JvmStatic
        @JvmName(name = "parse")
        @Nullable
        public static yj setDividerPadding(@NotNull String str) {
            return (yj) setDividerPadding(new Object[]{str}, 2075813311, -2075813311, (int) System.currentTimeMillis());
        }
    }
}
