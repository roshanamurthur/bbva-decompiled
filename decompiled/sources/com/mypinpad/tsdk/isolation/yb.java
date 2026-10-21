package com.mypinpad.tsdk.isolation;

import androidx.room.a;
import c2.b;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.esotericsoftware.asm.Opcodes;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.nulabinc.zxcvbn.Guess;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/yb;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "setX", "setY", "b", "setDividerPadding", "getNavBarTitleString", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0})
public final class yb {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f62023n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f62024o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setY;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String getNavBarTitleString;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f62027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f62028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f62029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f62030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f62032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f62033i;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f62020j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f62021k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f62022l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yb$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0006*\u00020\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0006*\u00020\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0018\u0010\b\u001a\u0006*\u00020\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0018\u0010\u0012\u001a\u0006*\u00020\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/yb$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/yg;", "p0", "Lcom/mypinpad/tsdk/i/ye;", "p1", "", "Lcom/mypinpad/tsdk/i/yb;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/yg;Lcom/mypinpad/tsdk/i/ye;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "setZ", "Ljava/util/regex/Pattern;", "setX", "setIncludeFontPadding", "setY", "setAlwaysDrawnWithCacheEnabled", "UiMessageCallbackKtWhenMappings", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62034a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62035b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:101:0x04ee  */
        /* JADX WARN: Code duplicated, block: B:111:0x0559  */
        /* JADX WARN: Code duplicated, block: B:113:0x0565  */
        /* JADX WARN: Code duplicated, block: B:114:0x0574  */
        /* JADX WARN: Code duplicated, block: B:116:0x0576  */
        /* JADX WARN: Code duplicated, block: B:118:0x0596  */
        /* JADX WARN: Code duplicated, block: B:120:0x05a5  */
        /* JADX WARN: Code duplicated, block: B:123:0x05b7  */
        /* JADX WARN: Code duplicated, block: B:126:0x05c3  */
        /* JADX WARN: Code duplicated, block: B:128:0x05da  */
        /* JADX WARN: Code duplicated, block: B:130:0x0609  */
        /* JADX WARN: Code duplicated, block: B:132:0x0620 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:133:0x0621  */
        /* JADX WARN: Code duplicated, block: B:134:0x0622  */
        /* JADX WARN: Code duplicated, block: B:138:0x0656  */
        /* JADX WARN: Code duplicated, block: B:140:0x0666  */
        /* JADX WARN: Code duplicated, block: B:143:0x0670  */
        /* JADX WARN: Code duplicated, block: B:145:0x067a  */
        /* JADX WARN: Code duplicated, block: B:146:0x067d  */
        /* JADX WARN: Code duplicated, block: B:149:0x06a5  */
        /* JADX WARN: Code duplicated, block: B:151:0x06b6  */
        /* JADX WARN: Code duplicated, block: B:152:0x06bf  */
        /* JADX WARN: Code duplicated, block: B:153:0x06c9  */
        /* JADX WARN: Code duplicated, block: B:30:0x020f A[PHI: r7 r11
          0x020f: PHI (r7v19 int) = (r7v10 int), (r7v23 int) binds: [B:32:0x0280, B:28:0x020c] A[DONT_GENERATE, DONT_INLINE]
          0x020f: PHI (r11v33 java.lang.String) = (r11v10 java.lang.String), (r11v35 java.lang.String) binds: [B:32:0x0280, B:28:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:98:0x04e3  */
        public static /* synthetic */ yb a(Object[] objArr) {
            int i10;
            long j10;
            long j11;
            String str;
            String str2;
            int i11;
            String strSubstring;
            char c10;
            int i12;
            String str3;
            String str4;
            int iLastIndexOf$default;
            int i13;
            int i14;
            int i15;
            int i16;
            abk abkVar;
            int i17;
            int i18;
            int i19;
            int iIntValue;
            String str5;
            int iIntValue2;
            String str6;
            char c11;
            Companion companion;
            Long l6;
            Long l7;
            char c12 = 0;
            Companion companion2 = (Companion) objArr[0];
            char c13 = 1;
            long jLongValue = ((Number) objArr[1]).longValue();
            yg ygVar = (yg) objArr[2];
            String str7 = (String) objArr[3];
            int i20 = f62035b;
            int i21 = ((i20 & (-16)) | ((~i20) & 15)) + ((i20 & 15) << 1);
            f62034a = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.checkNotNullParameter(ygVar, "");
            Intrinsics.checkNotNullParameter(str7, "");
            int iIntValue3 = ((Integer) yt.setY(new Object[]{str7, ';', 0, 6}, -153626676, 153626697, 0)).intValue();
            int iIntValue4 = ((Integer) yt.setY(new Object[]{str7, '=', Integer.valueOf(iIntValue3), 2}, -153626676, 153626697, iIntValue3)).intValue();
            if (iIntValue4 == iIntValue3) {
                int i23 = f62034a;
                int i24 = i23 & 35;
                int i25 = -(-((i23 ^ 35) | i24));
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                f62035b = i26 % 128;
                int i27 = i26 % 2;
                int i28 = (i23 & 97) + (i23 | 97);
                f62035b = i28 % 128;
                if (i28 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            String str8 = (String) yt.setY(new Object[]{str7, Integer.valueOf(iIntValue4)}, 984847446, -984847437, iIntValue4);
            if (str8.length() == 0) {
                int i29 = f62034a;
                int i30 = ((i29 ^ 92) + ((i29 & 92) << 1)) - 1;
                f62035b = i30 % 128;
                int i31 = i30 % 2;
            } else {
                int i32 = f62035b;
                int i33 = i32 & 63;
                int i34 = (i32 ^ 63) | i33;
                int i35 = (i33 & i34) + (i34 | i33);
                int i36 = i35 % 128;
                f62034a = i36;
                int i37 = i35 % 2;
                int i38 = i36 & 125;
                int i39 = (i36 ^ 125) | i38;
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                f62035b = i40 % 128;
                int i41 = i40 % 2;
                if (((Integer) yt.setY(new Object[]{str8}, 437512014, -437511969, (int) System.currentTimeMillis())).intValue() == -1) {
                    int i42 = iIntValue4 - (-1);
                    String str9 = (String) yt.setY(new Object[]{str7, Integer.valueOf(i42), Integer.valueOf(iIntValue3)}, -68115487, 68115525, i42);
                    if (((Integer) yt.setY(new Object[]{str9}, 437512014, -437511969, (int) System.currentTimeMillis())).intValue() != -1) {
                        int i43 = f62035b;
                        int i44 = i43 ^ 65;
                        int i45 = (i43 & 65) << 1;
                        int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                        f62034a = i46 % 128;
                        int i47 = i46 % 2;
                        int i48 = i43 + 89;
                        f62034a = i48 % 128;
                        if (i48 % 2 == 0) {
                            return null;
                        }
                        int i49 = 55 / 0;
                        return null;
                    }
                    int length = str7.length();
                    boolean z10 = false;
                    boolean z11 = false;
                    boolean z12 = false;
                    boolean z13 = true;
                    int i50 = ((iIntValue3 ^ 2) + ((iIntValue3 & 2) << 1)) - 1;
                    long jLongValue2 = -1;
                    long jLongValue3 = 253402300799999L;
                    String str10 = null;
                    String str11 = null;
                    while (i50 < length) {
                        int i51 = (-2) - ((f62034a + 24) ^ (-1));
                        f62035b = i51 % 128;
                        if (i51 % 2 == 0) {
                            Object[] objArr2 = new Object[4];
                            objArr2[c12] = str7;
                            objArr2[c13] = '8';
                            objArr2[2] = Integer.valueOf(i50);
                            objArr2[3] = Integer.valueOf(length);
                            iIntValue = ((Integer) yt.setY(objArr2, -1105526239, 1105526263, i50)).intValue();
                            Object[] objArr3 = new Object[4];
                            objArr3[c12] = str7;
                            objArr3[c13] = '@';
                            objArr3[2] = Integer.valueOf(i50);
                            objArr3[3] = Integer.valueOf(iIntValue);
                            iIntValue2 = ((Integer) yt.setY(objArr3, -1105526239, 1105526263, i50)).intValue();
                            Object[] objArr4 = new Object[3];
                            objArr4[c12] = str7;
                            objArr4[1] = Integer.valueOf(i50);
                            objArr4[2] = Integer.valueOf(iIntValue2);
                            str5 = (String) yt.setY(objArr4, -68115487, 68115525, i50);
                            if (iIntValue2 < iIntValue) {
                                int i52 = f62035b;
                                int i53 = i52 & 71;
                                int i54 = ((i52 ^ 71) | i53) << 1;
                                int i55 = -((i52 | 71) & (~i53));
                                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                                f62034a = i56 % 128;
                                int i57 = i56 % 2;
                                int i58 = iIntValue2 & 1;
                                int i59 = ((((iIntValue2 ^ 1) | i58) << 1) - (~(-((iIntValue2 | 1) & (~i58))))) - 1;
                                Object[] objArr5 = new Object[3];
                                objArr5[c12] = str7;
                                objArr5[1] = Integer.valueOf(i59);
                                objArr5[2] = Integer.valueOf(iIntValue);
                                str6 = (String) yt.setY(objArr5, -68115487, 68115525, i59);
                                int i60 = f62034a;
                                int i61 = i60 & 55;
                                int i62 = ((i60 ^ 55) | i61) << 1;
                                c11 = '7';
                                int i63 = -((~i61) & (i60 | 55));
                                int i64 = (i62 & i63) + (i62 | i63);
                                f62035b = i64 % 128;
                                int i65 = i64 % 2;
                            } else {
                                c11 = '7';
                                System.identityHashCode(companion2);
                                System.identityHashCode(companion2);
                                str6 = "";
                            }
                        } else {
                            Object[] objArr6 = new Object[4];
                            objArr6[c12] = str7;
                            objArr6[1] = ';';
                            objArr6[2] = Integer.valueOf(i50);
                            objArr6[3] = Integer.valueOf(length);
                            iIntValue = ((Integer) yt.setY(objArr6, -1105526239, 1105526263, i50)).intValue();
                            Object[] objArr7 = new Object[4];
                            objArr7[c12] = str7;
                            objArr7[1] = '=';
                            objArr7[2] = Integer.valueOf(i50);
                            objArr7[3] = Integer.valueOf(iIntValue);
                            int iIntValue5 = ((Integer) yt.setY(objArr7, -1105526239, 1105526263, i50)).intValue();
                            Object[] objArr8 = new Object[3];
                            objArr8[c12] = str7;
                            objArr8[1] = Integer.valueOf(i50);
                            objArr8[2] = Integer.valueOf(iIntValue5);
                            str5 = (String) yt.setY(objArr8, -68115487, 68115525, i50);
                            if (iIntValue5 < iIntValue) {
                                iIntValue2 = iIntValue5;
                                int i510 = f62035b;
                                int i511 = i510 & 71;
                                int i512 = ((i510 ^ 71) | i511) << 1;
                                int i513 = -((i510 | 71) & (~i511));
                                int i514 = (i512 ^ i513) + ((i513 & i512) << 1);
                                f62034a = i514 % 128;
                                int i515 = i514 % 2;
                                int i516 = iIntValue2 & 1;
                                int i517 = ((((iIntValue2 ^ 1) | i516) << 1) - (~(-((iIntValue2 | 1) & (~i516))))) - 1;
                                Object[] objArr9 = new Object[3];
                                objArr9[c12] = str7;
                                objArr9[1] = Integer.valueOf(i517);
                                objArr9[2] = Integer.valueOf(iIntValue);
                                str6 = (String) yt.setY(objArr9, -68115487, 68115525, i517);
                                int i66 = f62034a;
                                int i67 = i66 & 55;
                                int i68 = ((i66 ^ 55) | i67) << 1;
                                c11 = '7';
                                int i69 = -((~i67) & (i66 | 55));
                                int i610 = (i68 & i69) + (i68 | i69);
                                f62035b = i610 % 128;
                                int i611 = i610 % 2;
                            } else {
                                c11 = '7';
                                System.identityHashCode(companion2);
                                System.identityHashCode(companion2);
                                str6 = "";
                            }
                        }
                        if (l.equals(str5, "expires", true)) {
                            int i70 = f62034a;
                            int i71 = ((i70 | 54) << 1) - (i70 ^ 54);
                            int i72 = (i71 ^ (-1)) + (i71 << 1);
                            f62035b = i72 % 128;
                            if (i72 % 2 == 0) {
                                try {
                                    int length2 = str6.length();
                                    Object[] objArr10 = new Object[2];
                                    objArr10[c12] = str6;
                                    objArr10[1] = Integer.valueOf(length2);
                                    l7 = (Long) setY(objArr10, 1134043811, -1134043805, length2);
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                    companion = companion2;
                                }
                            } else {
                                int length3 = str6.length();
                                Object[] objArr11 = new Object[2];
                                objArr11[c12] = str6;
                                objArr11[1] = Integer.valueOf(length3);
                                l7 = (Long) setY(objArr11, 1134043811, -1134043805, length3);
                            }
                            jLongValue3 = l7.longValue();
                            companion = companion2;
                            z12 = true;
                        } else if (l.equals(str5, "max-age", true)) {
                            int i73 = f62034a;
                            int i74 = ((i73 ^ 23) | (i73 & 23)) << 1;
                            int i75 = -((i73 & (-24)) | (23 & (~i73)));
                            int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                            f62035b = i76 % 128;
                            if (i76 % 2 == 0) {
                                Object[] objArr12 = new Object[1];
                                objArr12[c12] = str6;
                                companion = companion2;
                                try {
                                    l6 = (Long) setY(objArr12, 259166889, -259166889, (int) System.currentTimeMillis());
                                } catch (NumberFormatException | IllegalArgumentException unused2) {
                                }
                            } else {
                                companion = companion2;
                                l6 = (Long) setY(new Object[]{str6}, 259166889, -259166889, (int) System.currentTimeMillis());
                            }
                            jLongValue2 = l6.longValue();
                            z12 = true;
                        } else {
                            companion = companion2;
                            if (l.equals(str5, DynamicLink.Builder.KEY_DOMAIN, true)) {
                                int i77 = f62034a;
                                int i78 = i77 | 67;
                                int i79 = i78 << 1;
                                int i80 = -((~(i77 & 67)) & i78);
                                int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                                f62035b = i81 % 128;
                                str11 = (String) (i81 % 2 == 0 ? setY(new Object[]{str6}, -580990947, 580990949, (int) System.currentTimeMillis()) : setY(new Object[]{str6}, -580990947, 580990949, (int) System.currentTimeMillis()));
                                z13 = false;
                            } else if (!(!l.equals(str5, "path", true))) {
                                int i82 = f62035b + 87;
                                f62034a = i82 % 128;
                                if (i82 % 2 != 0) {
                                    throw null;
                                }
                                str10 = str6;
                            } else if (l.equals(str5, "secure", true)) {
                                int i83 = f62035b;
                                int i84 = ((i83 ^ 17) - (~(-(-((i83 & 17) << 1))))) - 1;
                                int i85 = i84 % 128;
                                f62034a = i85;
                                z10 = i84 % 2 == 0;
                                int i86 = ((i85 & (-72)) | (71 & (~i85))) + ((i85 & 71) << 1);
                                f62035b = i86 % 128;
                                int i87 = i86 % 2;
                            } else if (l.equals(str5, "httponly", true)) {
                                int i88 = f62034a;
                                int i89 = i88 + 37;
                                f62035b = i89 % 128;
                                z11 = i89 % 2 != 0;
                                int i90 = (((i88 | 82) << 1) - (i88 ^ 82)) - 1;
                                f62035b = i90 % 128;
                                int i91 = i90 % 2;
                            }
                        }
                        i50 = (iIntValue & 1) + (iIntValue | 1);
                        int i92 = f62034a;
                        int i93 = ((i92 ^ 44) + ((i92 & 44) << 1)) - 1;
                        f62035b = i93 % 128;
                        int i94 = i93 % 2;
                        companion2 = companion;
                        c12 = 0;
                        c13 = 1;
                    }
                    if (jLongValue2 != Long.MIN_VALUE) {
                        if (jLongValue2 != -1) {
                            int i95 = f62035b;
                            int i96 = i95 & 53;
                            int i97 = i96 + ((i95 ^ 53) | i96);
                            int i98 = i97 % 128;
                            f62034a = i98;
                            if (i97 % 2 != 0) {
                                int i99 = 0 / 0;
                                if (jLongValue2 <= 9223372036854775L) {
                                    int i100 = ((i98 & 56) + (i98 | 56)) - 1;
                                    f62035b = i100 % 128;
                                    int i101 = i100 % 2;
                                    j11 = jLongValue2 * 1000;
                                } else {
                                    int i102 = i95 + 117;
                                    f62034a = i102 % 128;
                                    int i103 = i102 % 2;
                                    j11 = Long.MAX_VALUE;
                                }
                            } else if (jLongValue2 <= 9223372036854775L) {
                                int i104 = ((i98 & 56) + (i98 | 56)) - 1;
                                f62035b = i104 % 128;
                                int i105 = i104 % 2;
                                j11 = jLongValue2 * 1000;
                            } else {
                                int i106 = i95 + 117;
                                f62034a = i106 % 128;
                                int i107 = i106 % 2;
                                j11 = Long.MAX_VALUE;
                            }
                            j10 = jLongValue + j11;
                            if (j10 >= jLongValue) {
                                int i108 = f62035b;
                                int i109 = (i108 & 14) + (i108 | 14);
                                int i110 = (i109 ^ (-1)) + (i109 << 1);
                                f62034a = i110 % 128;
                                int i111 = i110 % 2;
                                if (j10 > DatesKt.MAX_DATE) {
                                }
                            }
                            int i112 = f62034a;
                            int i113 = (i112 & 46) + (i112 | 46);
                            i10 = 1;
                            int i114 = (i113 ^ (-1)) + (i113 << 1);
                            f62035b = i114 % 128;
                            int i115 = i114 % 2;
                            j10 = 253402300799999L;
                        } else {
                            i10 = 1;
                            j10 = jLongValue3;
                        }
                        Object[] objArr13 = new Object[i10];
                        objArr13[0] = ygVar;
                        str = (String) yg.setOnFocusChangeListener(objArr13, -1565741557, 1565741570, System.identityHashCode(ygVar));
                        if (str11 == null) {
                            i18 = f62035b;
                            i19 = i18 + 89;
                            f62034a = i19 % 128;
                            if (i19 % 2 == 0) {
                                throw null;
                            }
                            int i116 = ((i18 & 12) + (i18 | 12)) - 1;
                            f62034a = i116 % 128;
                            int i117 = i116 % 2;
                            str2 = str;
                        } else {
                            if (!((Boolean) setY(new Object[]{str, str11}, 620756415, -620756412, (int) System.currentTimeMillis())).booleanValue()) {
                                int i118 = f62035b;
                                i11 = (i118 & 1) + (i118 | 1);
                                int i119 = i11 % 128;
                                f62034a = i119;
                                if (i11 % 2 != 0) {
                                    int i120 = 53 / 0;
                                }
                                int i121 = (((i119 | 80) << 1) - (i119 ^ 80)) - 1;
                                f62035b = i121 % 128;
                                int i122 = i121 % 2;
                                return null;
                            }
                            str2 = str11;
                        }
                        if (str.length() != str2.length()) {
                            int i123 = f62034a;
                            int i124 = i123 & 7;
                            int i125 = -(-((i123 ^ 7) | i124));
                            i16 = ((i124 | i125) << 1) - (i125 ^ i124);
                            f62035b = i16 % 128;
                            if (i16 % 2 != 0) {
                                abk.Companion companion3 = abk.INSTANCE;
                                abk abkVar2 = (abk) abk.Companion.setY(new Object[0], 1737357701, -1737357701, (int) System.currentTimeMillis());
                                throw null;
                            }
                            abk.Companion companion4 = abk.INSTANCE;
                            abkVar = (abk) abk.Companion.setY(new Object[0], 1737357701, -1737357701, (int) System.currentTimeMillis());
                            if (((String) abk.setX(new Object[]{abkVar, str2}, -919103912, 919103917, System.identityHashCode(abkVar))) == null) {
                                int i126 = f62034a;
                                int i127 = i126 & 51;
                                int i128 = -(-(i126 | 51));
                                i17 = (i127 ^ i128) + ((i128 & i127) << 1);
                                f62035b = i17 % 128;
                                if (i17 % 2 != 0) {
                                    return null;
                                }
                                throw null;
                            }
                        }
                        strSubstring = "/";
                        if (str10 != null) {
                            i15 = (-2) - ((f62035b + 38) ^ (-1));
                            f62034a = i15 % 128;
                            if (i15 % 2 != 0) {
                                c10 = 0;
                                i12 = 1;
                                if (l.startsWith$default(str10, "/", false, 2, null)) {
                                    str3 = str10;
                                }
                            } else {
                                c10 = 0;
                                i12 = 1;
                                if (!(!l.startsWith$default(str10, "/", false, 2, null))) {
                                    str3 = str10;
                                }
                            }
                            yb ybVar = new yb(str8, str9, j10, str2, str3, z10, z11, z12, z13, null);
                            int i129 = f62034a;
                            int i130 = (((i129 & (-54)) | ((~i129) & 53)) - (~(-(-((53 & i129) << 1))))) - 1;
                            f62035b = i130 % 128;
                            int i131 = i130 % 2;
                            return ybVar;
                        }
                        c10 = 0;
                        i12 = 1;
                        Object[] objArr14 = new Object[i12];
                        objArr14[c10] = ygVar;
                        str4 = (String) yg.setOnFocusChangeListener(objArr14, 145484652, -145484636, System.identityHashCode(ygVar));
                        iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str4, JsonPointer.SEPARATOR, 0, false, 6, (Object) null);
                        if (iLastIndexOf$default != 0) {
                            int i132 = f62034a;
                            i14 = ((i132 & 92) + (i132 | 92)) - 1;
                            f62035b = i14 % 128;
                            if (i14 % 2 == 0) {
                                i13 = 1;
                                strSubstring = str4.substring(1, iLastIndexOf$default);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            } else {
                                i13 = 1;
                                strSubstring = str4.substring(0, iLastIndexOf$default);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            }
                        } else {
                            i13 = 1;
                        }
                        int i133 = f62034a;
                        int i134 = (((i133 | 40) << i13) - (i133 ^ 40)) - i13;
                        f62035b = i134 % 128;
                        int i135 = i134 % 2;
                        str3 = strSubstring;
                        yb ybVar2 = new yb(str8, str9, j10, str2, str3, z10, z11, z12, z13, null);
                        int i1210 = f62034a;
                        int i136 = (((i1210 & (-54)) | ((~i1210) & 53)) - (~(-(-((53 & i1210) << 1))))) - 1;
                        f62035b = i136 % 128;
                        int i137 = i136 % 2;
                        return ybVar2;
                    }
                    int i138 = f62034a;
                    int i139 = (i138 ^ 81) + ((i138 & 81) << 1);
                    int i140 = i139 % 128;
                    f62035b = i140;
                    int i141 = i139 % 2;
                    int i142 = i140 + 69;
                    f62034a = i142 % 128;
                    int i143 = i142 % 2;
                    j10 = Long.MIN_VALUE;
                    i10 = 1;
                    Object[] objArr15 = new Object[i10];
                    objArr15[0] = ygVar;
                    str = (String) yg.setOnFocusChangeListener(objArr15, -1565741557, 1565741570, System.identityHashCode(ygVar));
                    if (str11 == null) {
                        i18 = f62035b;
                        i19 = i18 + 89;
                        f62034a = i19 % 128;
                        if (i19 % 2 == 0) {
                            throw null;
                        }
                        int i1110 = ((i18 & 12) + (i18 | 12)) - 1;
                        f62034a = i1110 % 128;
                        int i1111 = i1110 % 2;
                        str2 = str;
                    } else {
                        if (!((Boolean) setY(new Object[]{str, str11}, 620756415, -620756412, (int) System.currentTimeMillis())).booleanValue()) {
                            int i1112 = f62035b;
                            i11 = (i1112 & 1) + (i1112 | 1);
                            int i1113 = i11 % 128;
                            f62034a = i1113;
                            if (i11 % 2 != 0) {
                                int i1211 = 53 / 0;
                            }
                            int i1212 = (((i1113 | 80) << 1) - (i1113 ^ 80)) - 1;
                            f62035b = i1212 % 128;
                            int i1213 = i1212 % 2;
                            return null;
                        }
                        str2 = str11;
                    }
                    if (str.length() != str2.length()) {
                        int i1214 = f62034a;
                        int i1215 = i1214 & 7;
                        int i1216 = -(-((i1214 ^ 7) | i1215));
                        i16 = ((i1215 | i1216) << 1) - (i1216 ^ i1215);
                        f62035b = i16 % 128;
                        if (i16 % 2 != 0) {
                            abk.Companion companion5 = abk.INSTANCE;
                            abk abkVar3 = (abk) abk.Companion.setY(new Object[0], 1737357701, -1737357701, (int) System.currentTimeMillis());
                            throw null;
                        }
                        abk.Companion companion6 = abk.INSTANCE;
                        abkVar = (abk) abk.Companion.setY(new Object[0], 1737357701, -1737357701, (int) System.currentTimeMillis());
                        if (((String) abk.setX(new Object[]{abkVar, str2}, -919103912, 919103917, System.identityHashCode(abkVar))) == null) {
                            int i1217 = f62034a;
                            int i1218 = i1217 & 51;
                            int i1219 = -(-(i1217 | 51));
                            i17 = (i1218 ^ i1219) + ((i1219 & i1218) << 1);
                            f62035b = i17 % 128;
                            if (i17 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                    }
                    strSubstring = "/";
                    if (str10 != null) {
                        i15 = (-2) - ((f62035b + 38) ^ (-1));
                        f62034a = i15 % 128;
                        if (i15 % 2 != 0) {
                            c10 = 0;
                            i12 = 1;
                            if (l.startsWith$default(str10, "/", false, 2, null)) {
                                str3 = str10;
                            }
                        } else {
                            c10 = 0;
                            i12 = 1;
                            if (!(!l.startsWith$default(str10, "/", false, 2, null))) {
                                str3 = str10;
                            }
                        }
                        yb ybVar3 = new yb(str8, str9, j10, str2, str3, z10, z11, z12, z13, null);
                        int i12110 = f62034a;
                        int i1310 = (((i12110 & (-54)) | ((~i12110) & 53)) - (~(-(-((53 & i12110) << 1))))) - 1;
                        f62035b = i1310 % 128;
                        int i1311 = i1310 % 2;
                        return ybVar3;
                    }
                    c10 = 0;
                    i12 = 1;
                    Object[] objArr16 = new Object[i12];
                    objArr16[c10] = ygVar;
                    str4 = (String) yg.setOnFocusChangeListener(objArr16, 145484652, -145484636, System.identityHashCode(ygVar));
                    iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str4, JsonPointer.SEPARATOR, 0, false, 6, (Object) null);
                    if (iLastIndexOf$default != 0) {
                        int i1312 = f62034a;
                        i14 = ((i1312 & 92) + (i1312 | 92)) - 1;
                        f62035b = i14 % 128;
                        if (i14 % 2 == 0) {
                            i13 = 1;
                            strSubstring = str4.substring(1, iLastIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        } else {
                            i13 = 1;
                            strSubstring = str4.substring(0, iLastIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        }
                    } else {
                        i13 = 1;
                    }
                    int i1313 = f62034a;
                    int i1314 = (((i1313 | 40) << i13) - (i1313 ^ 40)) - i13;
                    f62035b = i1314 % 128;
                    int i1315 = i1314 % 2;
                    str3 = strSubstring;
                    yb ybVar4 = new yb(str8, str9, j10, str2, str3, z10, z11, z12, z13, null);
                    int i12111 = f62034a;
                    int i1316 = (((i12111 & (-54)) | ((~i12111) & 53)) - (~(-(-((53 & i12111) << 1))))) - 1;
                    f62035b = i1316 % 128;
                    int i1317 = i1316 % 2;
                    return ybVar4;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:126:0x02a3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:13:0x00f8 A[PHI: r12
          0x00f8: PHI (r12v9 int) = (r12v8 int), (r12v24 int) binds: [B:12:0x00f6, B:8:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:15:0x0118  */
        /* JADX WARN: Code duplicated, block: B:17:0x0161  */
        /* JADX WARN: Code duplicated, block: B:34:0x026b  */
        /* JADX WARN: Code duplicated, block: B:36:0x026e  */
        /* JADX WARN: Code duplicated, block: B:38:0x027f  */
        /* JADX WARN: Code duplicated, block: B:40:0x0297  */
        public static /* synthetic */ Long b(Object[] objArr) {
            int iIntValue;
            int i10;
            String str;
            int iIndexOf$default;
            int i11;
            int i12;
            int i13 = 0;
            String str2 = (String) objArr[0];
            int i14 = 1;
            int iIntValue2 = ((Number) objArr[1]).intValue();
            int i15 = f62035b;
            int i16 = i15 & 119;
            int i17 = (((i15 ^ 119) | i16) << 1) - ((i15 | 119) & (~i16));
            f62034a = i17 % 128;
            int i18 = 2;
            int i19 = i17 % 2;
            int i20 = 4;
            int i21 = 3;
            int i22 = -459868471;
            int i23 = 459868478;
            int iIntValue3 = ((Integer) setY(new Object[]{str2, 0, Integer.valueOf(iIntValue2), Boolean.FALSE}, -459868471, 459868478, 0)).intValue();
            Matcher matcher = ((Pattern) yb.setDividerPadding(new Object[0], -1990395594, 1990395598, (int) System.currentTimeMillis())).matcher(str2);
            int i24 = f62035b;
            int i25 = i24 & 65;
            int i26 = -(-(i24 | 65));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            f62034a = i27 % 128;
            int i28 = i27 % 2;
            int i29 = -1;
            int i30 = -1;
            int i31 = -1;
            int i32 = -1;
            int i33 = -1;
            int i34 = -1;
            int i35 = -1;
            while (iIntValue3 < iIntValue2) {
                int i36 = f62034a + 79;
                f62035b = i36 % 128;
                if (i36 % i18 == 0) {
                    Object[] objArr2 = new Object[i20];
                    objArr2[i13] = str2;
                    objArr2[i14] = Integer.valueOf(iIntValue3);
                    objArr2[i18] = Integer.valueOf(iIntValue2);
                    objArr2[i21] = Boolean.FALSE;
                    iIntValue = ((Integer) setY(objArr2, i22, i23, iIntValue3)).intValue();
                    matcher.region(iIntValue3, iIntValue);
                    if (i31 == i29) {
                        str = str2;
                        if (((matcher.usePattern((Pattern) yb.setDividerPadding(new Object[i13], -1990395594, 1990395598, (int) System.currentTimeMillis())).matches() ? 1 : 0) ^ i14) != i14) {
                            int i37 = f62034a + 117;
                            f62035b = i37 % 128;
                            int i38 = i37 % i18;
                            String strGroup = matcher.group(i14);
                            Intrinsics.checkNotNullExpressionValue(strGroup, "");
                            i31 = Integer.parseInt(strGroup);
                            String strGroup2 = matcher.group(i18);
                            Intrinsics.checkNotNullExpressionValue(strGroup2, "");
                            i34 = Integer.parseInt(strGroup2);
                            String strGroup3 = matcher.group(i21);
                            Intrinsics.checkNotNullExpressionValue(strGroup3, "");
                            i35 = Integer.parseInt(strGroup3);
                            int i39 = f62034a;
                            int i40 = i39 & 59;
                            int i41 = ((i39 ^ 59) | i40) << i14;
                            int i42 = -((i39 | 59) & (~i40));
                            int i43 = (i41 ^ i42) + ((i42 & i41) << i14);
                            f62035b = i43 % 128;
                            int i44 = i43 % i18;
                            i32 = i32;
                        } else {
                            i10 = -1;
                        }
                        iIndexOf$default = i33;
                        int i45 = -(-(iIntValue * 517));
                        int i46 = (((-515) ^ i45) | ((-515) & i45)) << i14;
                        int i47 = -((i45 & 514) | ((-515) & (~i45)));
                        int i48 = (i46 ^ i47) + ((i47 & i46) << i14);
                        int i49 = ~iIntValue;
                        int i50 = (i49 | iIntValue) & i49;
                        int i51 = i50 & iIntValue2;
                        int i52 = (i50 | iIntValue2) & (~i51);
                        int i53 = ~((i52 & i51) | (i52 ^ i51));
                        int i54 = ~iIntValue2;
                        int i55 = i54 & 1;
                        int i56 = (~i55) & (i54 | 1);
                        int i57 = ~((i56 ^ i55) | (i56 & i55));
                        int i58 = i53 ^ i57;
                        int i59 = i57 & i53;
                        int i60 = (i58 & i59) | (i58 ^ i59);
                        int i61 = ~i54;
                        int i62 = i54 & iIntValue;
                        int i63 = (i54 ^ iIntValue) | i62;
                        int i64 = ~i63;
                        int i65 = i64 & (i63 | i64);
                        int i66 = -(-(((i65 & i60) | (i60 ^ i65)) * (-516)));
                        int i67 = (i48 & i66) + (i66 | i48);
                        int i68 = (-2) & i49;
                        int i69 = (~i68) & ((-2) | i49);
                        int i70 = (i68 & i69) | (i69 ^ i68);
                        int i71 = i70 & iIntValue2;
                        int i72 = (i70 | iIntValue2) & (~i71);
                        int i73 = ~((i72 & i71) | (i72 ^ i71));
                        int i74 = ((-2) & i61) | i55 | ((-2) & i54);
                        int i75 = (i74 & iIntValue) | (i49 & i74) | ((~i74) & iIntValue);
                        int i76 = ~i75;
                        int i77 = (i75 | i76) & i76;
                        int i78 = ((~i77) & i73) | ((~i73) & i77);
                        int i79 = i73 & i77;
                        int i80 = (i67 - (~(((i79 & i78) | (i78 ^ i79)) * LibMCryptConstants.IND_HEX_SEGMENTO2))) - 1;
                        int i81 = ((-2) ^ iIntValue) | ((-2) & iIntValue);
                        int i82 = ~i81;
                        int i83 = (i81 | i82) & i82;
                        int i84 = (~i62) & (i54 | iIntValue);
                        int i85 = ~((i62 & i84) | (i84 ^ i62));
                        int i86 = ((~i85) & i83) | ((~i83) & i85);
                        int i87 = i83 & i85;
                        int i88 = ((i87 & i86) | (i86 ^ i87)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
                        int i89 = ((i80 ^ i88) | (i80 & i88)) << 1;
                        int i90 = -((i88 & (~i80)) | ((~i88) & i80));
                        int i91 = (i89 & i90) + (i90 | i89);
                        i21 = 3;
                        i22 = -459868471;
                        i23 = 459868478;
                        int iIntValue4 = ((Integer) setY(new Object[]{str, Integer.valueOf(i91), Integer.valueOf(iIntValue2), Boolean.FALSE}, -459868471, 459868478, i91)).intValue();
                        int i92 = f62035b;
                        int i93 = ((i92 & 70) + (i92 | 70)) - 1;
                        f62034a = i93 % 128;
                        int i94 = i93 % 2;
                        i32 = i32;
                        i33 = iIndexOf$default;
                        i20 = 4;
                        iIntValue3 = iIntValue4;
                        str2 = str;
                        i13 = 0;
                        i14 = 1;
                        i18 = 2;
                        i29 = -1;
                    } else {
                        str = str2;
                        i10 = i29;
                    }
                } else {
                    int i95 = ((iIntValue3 ^ 1) | (iIntValue3 & 1)) << i14;
                    int i96 = -((iIntValue3 & (-2)) | ((~iIntValue3) & i14));
                    int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                    Object[] objArr3 = new Object[i20];
                    objArr3[i13] = str2;
                    objArr3[i14] = Integer.valueOf(i97);
                    objArr3[i18] = Integer.valueOf(iIntValue2);
                    objArr3[i21] = Boolean.TRUE;
                    iIntValue = ((Integer) setY(objArr3, i22, i23, i97)).intValue();
                    matcher.region(iIntValue3, iIntValue);
                    i10 = -1;
                    if (i31 == -1) {
                        str = str2;
                        if (((matcher.usePattern((Pattern) yb.setDividerPadding(new Object[i13], -1990395594, 1990395598, (int) System.currentTimeMillis())).matches() ? 1 : 0) ^ i14) != i14) {
                            int i310 = f62034a + 117;
                            f62035b = i310 % 128;
                            int i311 = i310 % i18;
                            String strGroup4 = matcher.group(i14);
                            Intrinsics.checkNotNullExpressionValue(strGroup4, "");
                            i31 = Integer.parseInt(strGroup4);
                            String strGroup5 = matcher.group(i18);
                            Intrinsics.checkNotNullExpressionValue(strGroup5, "");
                            i34 = Integer.parseInt(strGroup5);
                            String strGroup6 = matcher.group(i21);
                            Intrinsics.checkNotNullExpressionValue(strGroup6, "");
                            i35 = Integer.parseInt(strGroup6);
                            int i312 = f62034a;
                            int i410 = i312 & 59;
                            int i411 = ((i312 ^ 59) | i410) << i14;
                            int i412 = -((i312 | 59) & (~i410));
                            int i413 = (i411 ^ i412) + ((i412 & i411) << i14);
                            f62035b = i413 % 128;
                            int i414 = i413 % i18;
                            i32 = i32;
                        } else {
                            i10 = -1;
                        }
                        iIndexOf$default = i33;
                        int i415 = -(-(iIntValue * 517));
                        int i416 = (((-515) ^ i415) | ((-515) & i415)) << i14;
                        int i417 = -((i415 & 514) | ((-515) & (~i415)));
                        int i418 = (i416 ^ i417) + ((i417 & i416) << i14);
                        int i419 = ~iIntValue;
                        int i510 = (i419 | iIntValue) & i419;
                        int i511 = i510 & iIntValue2;
                        int i512 = (i510 | iIntValue2) & (~i511);
                        int i513 = ~((i512 & i511) | (i512 ^ i511));
                        int i514 = ~iIntValue2;
                        int i515 = i514 & 1;
                        int i516 = (~i515) & (i514 | 1);
                        int i517 = ~((i516 ^ i515) | (i516 & i515));
                        int i518 = i513 ^ i517;
                        int i519 = i517 & i513;
                        int i610 = (i518 & i519) | (i518 ^ i519);
                        int i611 = ~i514;
                        int i612 = i514 & iIntValue;
                        int i613 = (i514 ^ iIntValue) | i612;
                        int i614 = ~i613;
                        int i615 = i614 & (i613 | i614);
                        int i616 = -(-(((i615 & i610) | (i610 ^ i615)) * (-516)));
                        int i617 = (i418 & i616) + (i616 | i418);
                        int i618 = (-2) & i419;
                        int i619 = (~i618) & ((-2) | i419);
                        int i710 = (i618 & i619) | (i619 ^ i618);
                        int i711 = i710 & iIntValue2;
                        int i712 = (i710 | iIntValue2) & (~i711);
                        int i713 = ~((i712 & i711) | (i712 ^ i711));
                        int i714 = ((-2) & i611) | i515 | ((-2) & i514);
                        int i715 = (i714 & iIntValue) | (i419 & i714) | ((~i714) & iIntValue);
                        int i716 = ~i715;
                        int i717 = (i715 | i716) & i716;
                        int i718 = ((~i717) & i713) | ((~i713) & i717);
                        int i719 = i713 & i717;
                        int i810 = (i617 - (~(((i719 & i718) | (i718 ^ i719)) * LibMCryptConstants.IND_HEX_SEGMENTO2))) - 1;
                        int i811 = ((-2) ^ iIntValue) | ((-2) & iIntValue);
                        int i812 = ~i811;
                        int i813 = (i811 | i812) & i812;
                        int i814 = (~i612) & (i514 | iIntValue);
                        int i815 = ~((i612 & i814) | (i814 ^ i612));
                        int i816 = ((~i815) & i813) | ((~i813) & i815);
                        int i817 = i813 & i815;
                        int i818 = ((i817 & i816) | (i816 ^ i817)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
                        int i819 = ((i810 ^ i818) | (i810 & i818)) << 1;
                        int i98 = -((i818 & (~i810)) | ((~i818) & i810));
                        int i99 = (i819 & i98) + (i98 | i819);
                        i21 = 3;
                        i22 = -459868471;
                        i23 = 459868478;
                        int iIntValue5 = ((Integer) setY(new Object[]{str, Integer.valueOf(i99), Integer.valueOf(iIntValue2), Boolean.FALSE}, -459868471, 459868478, i99)).intValue();
                        int i910 = f62035b;
                        int i911 = ((i910 & 70) + (i910 | 70)) - 1;
                        f62034a = i911 % 128;
                        int i912 = i911 % 2;
                        i32 = i32;
                        i33 = iIndexOf$default;
                        i20 = 4;
                        iIntValue3 = iIntValue5;
                        str2 = str;
                        i13 = 0;
                        i14 = 1;
                        i18 = 2;
                        i29 = -1;
                    } else {
                        str = str2;
                    }
                }
                if (i32 == i10) {
                    int i100 = f62034a;
                    int i101 = (((i100 & (-64)) | ((~i100) & 63)) - (~((i100 & 63) << i14))) - i14;
                    f62035b = i101 % 128;
                    int i102 = i101 % i18;
                    i11 = iIntValue;
                    if (((matcher.usePattern((Pattern) yb.setDividerPadding(new Object[0], -579294071, 579294073, (int) System.currentTimeMillis())).matches() ? 1 : 0) ^ i14) != i14) {
                        int i103 = f62035b;
                        int i104 = (((i103 & (-38)) | ((~i103) & 37)) - (~(-(-((i103 & 37) << i14))))) - i14;
                        f62034a = i104 % 128;
                        if (i104 % i18 != 0) {
                            String strGroup7 = matcher.group(0);
                            Intrinsics.checkNotNullExpressionValue(strGroup7, "");
                            i32 = Integer.parseInt(strGroup7);
                        } else {
                            String strGroup8 = matcher.group(i14);
                            Intrinsics.checkNotNullExpressionValue(strGroup8, "");
                            i32 = Integer.parseInt(strGroup8);
                        }
                        iIntValue = i11;
                        iIndexOf$default = i33;
                    }
                    int i4110 = -(-(iIntValue * 517));
                    int i4111 = (((-515) ^ i4110) | ((-515) & i4110)) << i14;
                    int i4112 = -((i4110 & 514) | ((-515) & (~i4110)));
                    int i4113 = (i4111 ^ i4112) + ((i4112 & i4111) << i14);
                    int i4114 = ~iIntValue;
                    int i5110 = (i4114 | iIntValue) & i4114;
                    int i5111 = i5110 & iIntValue2;
                    int i5112 = (i5110 | iIntValue2) & (~i5111);
                    int i5113 = ~((i5112 & i5111) | (i5112 ^ i5111));
                    int i5114 = ~iIntValue2;
                    int i5115 = i5114 & 1;
                    int i5116 = (~i5115) & (i5114 | 1);
                    int i5117 = ~((i5116 ^ i5115) | (i5116 & i5115));
                    int i5118 = i5113 ^ i5117;
                    int i5119 = i5117 & i5113;
                    int i6110 = (i5118 & i5119) | (i5118 ^ i5119);
                    int i6111 = ~i5114;
                    int i6112 = i5114 & iIntValue;
                    int i6113 = (i5114 ^ iIntValue) | i6112;
                    int i6114 = ~i6113;
                    int i6115 = i6114 & (i6113 | i6114);
                    int i6116 = -(-(((i6115 & i6110) | (i6110 ^ i6115)) * (-516)));
                    int i6117 = (i4113 & i6116) + (i6116 | i4113);
                    int i6118 = (-2) & i4114;
                    int i6119 = (~i6118) & ((-2) | i4114);
                    int i7110 = (i6118 & i6119) | (i6119 ^ i6118);
                    int i7111 = i7110 & iIntValue2;
                    int i7112 = (i7110 | iIntValue2) & (~i7111);
                    int i7113 = ~((i7112 & i7111) | (i7112 ^ i7111));
                    int i7114 = ((-2) & i6111) | i5115 | ((-2) & i5114);
                    int i7115 = (i7114 & iIntValue) | (i4114 & i7114) | ((~i7114) & iIntValue);
                    int i7116 = ~i7115;
                    int i7117 = (i7115 | i7116) & i7116;
                    int i7118 = ((~i7117) & i7113) | ((~i7113) & i7117);
                    int i7119 = i7113 & i7117;
                    int i8110 = (i6117 - (~(((i7119 & i7118) | (i7118 ^ i7119)) * LibMCryptConstants.IND_HEX_SEGMENTO2))) - 1;
                    int i8111 = ((-2) ^ iIntValue) | ((-2) & iIntValue);
                    int i8112 = ~i8111;
                    int i8113 = (i8111 | i8112) & i8112;
                    int i8114 = (~i6112) & (i5114 | iIntValue);
                    int i8115 = ~((i6112 & i8114) | (i8114 ^ i6112));
                    int i8116 = ((~i8115) & i8113) | ((~i8113) & i8115);
                    int i8117 = i8113 & i8115;
                    int i8118 = ((i8117 & i8116) | (i8116 ^ i8117)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
                    int i8119 = ((i8110 ^ i8118) | (i8110 & i8118)) << 1;
                    int i913 = -((i8118 & (~i8110)) | ((~i8118) & i8110));
                    int i914 = (i8119 & i913) + (i913 | i8119);
                    i21 = 3;
                    i22 = -459868471;
                    i23 = 459868478;
                    int iIntValue6 = ((Integer) setY(new Object[]{str, Integer.valueOf(i914), Integer.valueOf(iIntValue2), Boolean.FALSE}, -459868471, 459868478, i914)).intValue();
                    int i915 = f62035b;
                    int i916 = ((i915 & 70) + (i915 | 70)) - 1;
                    f62034a = i916 % 128;
                    int i917 = i916 % 2;
                    i32 = i32;
                    i33 = iIndexOf$default;
                    i20 = 4;
                    iIntValue3 = iIntValue6;
                    str2 = str;
                    i13 = 0;
                    i14 = 1;
                    i18 = 2;
                    i29 = -1;
                } else {
                    i11 = iIntValue;
                }
                iIndexOf$default = i33;
                if (iIndexOf$default == -1) {
                    int i105 = f62034a + 68;
                    int i106 = (i105 ^ (-1)) + (i105 << i14);
                    f62035b = i106 % 128;
                    int i107 = i106 % i18;
                    if (((matcher.usePattern((Pattern) yb.setDividerPadding(new Object[0], -1902126765, 1902126770, (int) System.currentTimeMillis())).matches() ? 1 : 0) ^ i14) != i14) {
                        int i108 = f62035b;
                        int i109 = i108 ^ 75;
                        int i110 = -(-((i108 & 75) << i14));
                        int i111 = (i109 ^ i110) + ((i110 & i109) << i14);
                        f62034a = i111 % 128;
                        int i112 = i111 % i18;
                        String strGroup9 = matcher.group(i14);
                        Intrinsics.checkNotNullExpressionValue(strGroup9, "");
                        Locale locale = Locale.US;
                        String strD = a.d(locale, "", strGroup9, locale, "");
                        String strPattern = ((Pattern) yb.setDividerPadding(new Object[0], -1902126765, 1902126770, (int) System.currentTimeMillis())).pattern();
                        Intrinsics.checkNotNullExpressionValue(strPattern, "");
                        iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strPattern, strD, 0, false, 6, (Object) null) / i20;
                        int i113 = f62034a;
                        int i114 = ((((i113 ^ 65) | (i113 & 65)) << i14) - (~(-(((~i113) & 65) | (i113 & (-66)))))) - i14;
                        f62035b = i114 % 128;
                        int i115 = i114 % i18;
                    } else if (i30 == -1) {
                        i12 = f62035b + 101;
                        f62034a = i12 % 128;
                        if (i12 % i18 == 0) {
                            matcher.usePattern((Pattern) yb.setDividerPadding(new Object[0], 1672757321, -1672757321, (int) System.currentTimeMillis())).matches();
                            throw null;
                        }
                        if (matcher.usePattern((Pattern) yb.setDividerPadding(new Object[0], 1672757321, -1672757321, (int) System.currentTimeMillis())).matches()) {
                            String strGroup10 = matcher.group(i14);
                            Intrinsics.checkNotNullExpressionValue(strGroup10, "");
                            i30 = Integer.parseInt(strGroup10);
                        }
                    }
                } else if (i30 == -1) {
                    i12 = f62035b + 101;
                    f62034a = i12 % 128;
                    if (i12 % i18 == 0) {
                        matcher.usePattern((Pattern) yb.setDividerPadding(new Object[0], 1672757321, -1672757321, (int) System.currentTimeMillis())).matches();
                        throw null;
                    }
                    if (matcher.usePattern((Pattern) yb.setDividerPadding(new Object[0], 1672757321, -1672757321, (int) System.currentTimeMillis())).matches()) {
                        String strGroup11 = matcher.group(i14);
                        Intrinsics.checkNotNullExpressionValue(strGroup11, "");
                        i30 = Integer.parseInt(strGroup11);
                    }
                }
                iIntValue = i11;
                int i4115 = -(-(iIntValue * 517));
                int i4116 = (((-515) ^ i4115) | ((-515) & i4115)) << i14;
                int i4117 = -((i4115 & 514) | ((-515) & (~i4115)));
                int i4118 = (i4116 ^ i4117) + ((i4117 & i4116) << i14);
                int i4119 = ~iIntValue;
                int i51110 = (i4119 | iIntValue) & i4119;
                int i51111 = i51110 & iIntValue2;
                int i51112 = (i51110 | iIntValue2) & (~i51111);
                int i51113 = ~((i51112 & i51111) | (i51112 ^ i51111));
                int i51114 = ~iIntValue2;
                int i51115 = i51114 & 1;
                int i51116 = (~i51115) & (i51114 | 1);
                int i51117 = ~((i51116 ^ i51115) | (i51116 & i51115));
                int i51118 = i51113 ^ i51117;
                int i51119 = i51117 & i51113;
                int i61110 = (i51118 & i51119) | (i51118 ^ i51119);
                int i61111 = ~i51114;
                int i61112 = i51114 & iIntValue;
                int i61113 = (i51114 ^ iIntValue) | i61112;
                int i61114 = ~i61113;
                int i61115 = i61114 & (i61113 | i61114);
                int i61116 = -(-(((i61115 & i61110) | (i61110 ^ i61115)) * (-516)));
                int i61117 = (i4118 & i61116) + (i61116 | i4118);
                int i61118 = (-2) & i4119;
                int i61119 = (~i61118) & ((-2) | i4119);
                int i71110 = (i61118 & i61119) | (i61119 ^ i61118);
                int i71111 = i71110 & iIntValue2;
                int i71112 = (i71110 | iIntValue2) & (~i71111);
                int i71113 = ~((i71112 & i71111) | (i71112 ^ i71111));
                int i71114 = ((-2) & i61111) | i51115 | ((-2) & i51114);
                int i71115 = (i71114 & iIntValue) | (i4119 & i71114) | ((~i71114) & iIntValue);
                int i71116 = ~i71115;
                int i71117 = (i71115 | i71116) & i71116;
                int i71118 = ((~i71117) & i71113) | ((~i71113) & i71117);
                int i71119 = i71113 & i71117;
                int i81110 = (i61117 - (~(((i71119 & i71118) | (i71118 ^ i71119)) * LibMCryptConstants.IND_HEX_SEGMENTO2))) - 1;
                int i81111 = ((-2) ^ iIntValue) | ((-2) & iIntValue);
                int i81112 = ~i81111;
                int i81113 = (i81111 | i81112) & i81112;
                int i81114 = (~i61112) & (i51114 | iIntValue);
                int i81115 = ~((i61112 & i81114) | (i81114 ^ i61112));
                int i81116 = ((~i81115) & i81113) | ((~i81113) & i81115);
                int i81117 = i81113 & i81115;
                int i81118 = ((i81117 & i81116) | (i81116 ^ i81117)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
                int i81119 = ((i81110 ^ i81118) | (i81110 & i81118)) << 1;
                int i918 = -((i81118 & (~i81110)) | ((~i81118) & i81110));
                int i919 = (i81119 & i918) + (i918 | i81119);
                i21 = 3;
                i22 = -459868471;
                i23 = 459868478;
                int iIntValue7 = ((Integer) setY(new Object[]{str, Integer.valueOf(i919), Integer.valueOf(iIntValue2), Boolean.FALSE}, -459868471, 459868478, i919)).intValue();
                int i9110 = f62035b;
                int i9111 = ((i9110 & 70) + (i9110 | 70)) - 1;
                f62034a = i9111 % 128;
                int i9112 = i9111 % 2;
                i32 = i32;
                i33 = iIndexOf$default;
                i20 = 4;
                iIntValue3 = iIntValue7;
                str2 = str;
                i13 = 0;
                i14 = 1;
                i18 = 2;
                i29 = -1;
            }
            int i116 = i32;
            int i117 = i33;
            if (70 <= i30) {
                int i118 = f62035b;
                int i119 = (i118 & 39) + (i118 | 39);
                int i120 = i119 % 128;
                f62034a = i120;
                if (i119 % 2 == 0 ? i30 >= 100 : i30 >= 48) {
                    int i121 = (i120 ^ 95) + ((i120 & 95) << 1);
                    f62035b = i121 % 128;
                    int i122 = i121 % 2;
                } else {
                    int i123 = (i118 & 24) + (i118 | 24);
                    int i124 = (i123 ^ (-1)) + (i123 << 1);
                    int i125 = i124 % 128;
                    f62034a = i125;
                    int i126 = i124 % 2;
                    int i127 = (((i125 | 30) << 1) - (i125 ^ 30)) - 1;
                    f62035b = i127 % 128;
                    int i128 = i127 % 2;
                    int i129 = i125 + 33;
                    f62035b = i129 % 128;
                    if (i129 % 2 == 0) {
                        i30 = ((i30 & ReturnCode.ERR_REPO_INIT) + (i30 | ReturnCode.ERR_REPO_INIT)) - 1;
                        int i130 = 41 / 0;
                    } else {
                        int i131 = i30 & ReturnCode.ERR_REPOSITORY;
                        int i132 = (i30 ^ ReturnCode.ERR_REPOSITORY) | i131;
                        i30 = (i131 ^ i132) + ((i131 & i132) << 1);
                    }
                }
            } else {
                int i133 = f62034a;
                int i134 = (i133 ^ 71) + ((i133 & 71) << 1);
                f62035b = i134 % 128;
                int i135 = i134 % 2;
            }
            if (i30 >= 0) {
                int i136 = f62034a;
                int i137 = ((i136 ^ 121) - (~(-(-((i136 & 121) << 1))))) - 1;
                f62035b = i137 % 128;
                int i138 = i137 % 2;
                if (i30 < 70) {
                    int i139 = i136 + 13;
                    int i140 = i139 % 128;
                    f62035b = i140;
                    int i141 = i139 % 2;
                    int i142 = i140 & 49;
                    int i143 = (i140 | 49) & (~i142);
                    int i144 = i142 << 1;
                    int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                    f62034a = i145 % 128;
                    if (i145 % 2 != 0) {
                        throw null;
                    }
                    int i146 = i30 & Guess.REFERENCE_YEAR;
                    i30 = (((~i146) & (i30 | Guess.REFERENCE_YEAR)) - (~(-(-(i146 << 1))))) - 1;
                } else {
                    int i147 = (i136 ^ 81) + ((i136 & 81) << 1);
                    f62035b = i147 % 128;
                    int i148 = i147 % 2;
                }
            } else {
                int i149 = f62034a;
                int i150 = (i149 ^ 81) + ((i149 & 81) << 1);
                f62035b = i150 % 128;
                int i151 = i150 % 2;
            }
            if (i30 >= 1601) {
                int i152 = f62034a;
                int i153 = i152 & 61;
                int i154 = -(-((i152 ^ 61) | i153));
                int i155 = ((i153 | i154) << 1) - (i154 ^ i153);
                int i156 = i155 % 128;
                f62035b = i156;
                if (i155 % 2 != 0) {
                    if (i117 == -1) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    int i157 = i156 + 7;
                    f62034a = i157 % 128;
                    int i158 = i157 % 2;
                    if (i116 > 0) {
                        int i159 = (((i156 ^ 87) | (i156 & 87)) << 1) - (((~i156) & 87) | (i156 & (-88)));
                        int i160 = i159 % 128;
                        f62034a = i160;
                        if (i159 % 2 == 0 ? i116 < 32 : i116 < 33) {
                            int i161 = i160 & 105;
                            int i162 = (i160 | 105) & (~i161);
                            int i163 = i161 << 1;
                            int i164 = (i162 & i163) + (i162 | i163);
                            int i165 = i164 % 128;
                            f62035b = i165;
                            int i166 = i164 % 2;
                            if (i31 >= 0) {
                                int i167 = i165 + 55;
                                int i168 = i167 % 128;
                                f62034a = i168;
                                if (i167 % 2 == 0 ? i31 < 24 : i31 < 59) {
                                    int i169 = ((i168 & 45) - (~(-(-(i168 | 45))))) - 1;
                                    f62035b = i169 % 128;
                                    int i170 = i169 % 2;
                                    int i171 = i34;
                                    if (i171 >= 0) {
                                        int i172 = (i168 & (-104)) | ((~i168) & 103);
                                        int i173 = -(-((i168 & 103) << 1));
                                        int i174 = (i172 ^ i173) + ((i172 & i173) << 1);
                                        int i175 = i174 % 128;
                                        f62035b = i175;
                                        if (i174 % 2 != 0 ? i171 < 60 : i171 < 76) {
                                            int i176 = i168 & 121;
                                            int i177 = (~i176) & (i168 | 121);
                                            int i178 = i176 << 1;
                                            int i179 = ((i177 | i178) << 1) - (i178 ^ i177);
                                            f62035b = i179 % 128;
                                            int i180 = i179 % 2;
                                            int i181 = (i168 ^ 113) + ((i168 & 113) << 1);
                                            int i182 = i181 % 128;
                                            f62035b = i182;
                                            int i183 = i181 % 2;
                                            int i184 = i35;
                                            if (i184 >= 0) {
                                                int i185 = (((i182 & (-74)) | ((~i182) & 73)) - (~(-(-((i182 & 73) << 1))))) - 1;
                                                f62034a = i185 % 128;
                                                if (i185 % 2 == 0 ? i184 < 60 : i184 < 117) {
                                                    int i186 = i182 + 95;
                                                    f62034a = i186 % 128;
                                                    int i187 = i186 % 2;
                                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(yt.setCompoundDrawableTintBlendMode);
                                                    gregorianCalendar.setLenient(false);
                                                    gregorianCalendar.set(1, i30);
                                                    gregorianCalendar.set(2, i117 + ((i117 ^ (-1)) | i117));
                                                    gregorianCalendar.set(5, i116);
                                                    gregorianCalendar.set(11, i31);
                                                    gregorianCalendar.set(12, i171);
                                                    gregorianCalendar.set(13, i184);
                                                    gregorianCalendar.set(14, 0);
                                                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                                                    int i188 = f62034a;
                                                    int i189 = i188 ^ 51;
                                                    int i190 = (((i188 & 51) | i189) << 1) - i189;
                                                    f62035b = i190 % 128;
                                                    int i191 = i190 % 2;
                                                    return Long.valueOf(timeInMillis);
                                                }
                                                int i192 = i182 & 45;
                                                int i193 = -(-((i182 ^ 45) | i192));
                                                int i194 = (i192 ^ i193) + ((i192 & i193) << 1);
                                                f62034a = i194 % 128;
                                                int i195 = i194 % 2;
                                            }
                                            throw new IllegalArgumentException("Failed requirement.".toString());
                                        }
                                        int i196 = ((i175 | 99) << 1) - (i175 ^ 99);
                                        f62034a = i196 % 128;
                                        int i197 = i196 % 2;
                                    }
                                    throw new IllegalArgumentException("Failed requirement.".toString());
                                }
                                int i198 = (-2) - (((i165 ^ 100) + ((i165 & 100) << 1)) ^ (-1));
                                f62034a = i198 % 128;
                                int i199 = i198 % 2;
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        int i200 = i160 & 97;
                        int i201 = (((~i200) & (i160 | 97)) - (~(i200 << 1))) - 1;
                        f62035b = i201 % 128;
                        int i202 = i201 % 2;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX INFO: Removed unreachable split cross block B:165:0x0758 */
        /* JADX WARN: Code duplicated, block: B:169:0x038d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x0140 A[PHI: r6 r15
          0x0140: PHI (r6v21 char) = (r6v20 char), (r6v39 char) binds: [B:35:0x013e, B:32:0x012b] A[DONT_GENERATE, DONT_INLINE]
          0x0140: PHI (r15v6 int) = (r15v5 int), (r15v16 int) binds: [B:35:0x013e, B:32:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:80:0x0348 A[PHI: r15
          0x0348: PHI (r15v7 int) = (r15v6 int), (r15v6 int), (r15v9 int), (r15v9 int), (r15v9 int), (r15v9 int), (r15v9 int) binds: [B:41:0x021f, B:39:0x021c, B:43:0x0223, B:54:0x026f, B:74:0x02f5, B:77:0x032f, B:62:0x02b3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:83:0x035b  */
        /* JADX WARN: Code duplicated, block: B:84:0x0379  */
        /* JADX WARN: Code duplicated, block: B:88:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:91:0x03b7  */
        /* JADX WARN: Code duplicated, block: B:93:0x03c1 A[LOOP:0: B:28:0x00f1->B:93:0x03c1, LOOP_END] */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        
            if (r0 <= 0) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instruction units count: 1900
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.yb.Companion.setY(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @JvmStatic
        @NotNull
        public final List<yb> setOnFocusChangeListener(@NotNull yg p4, @NotNull ye p10) {
            return (List) setY(new Object[]{this, p4, p10}, 1656972118, -1656972113, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f62024o;
        int i11 = i10 & 21;
        int i12 = -(-((i10 ^ 21) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f62023n = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 35 / 0;
        }
    }

    public yb(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this.setY = str;
        this.getNavBarTitleString = str2;
        this.f62027c = j10;
        this.f62028d = str3;
        this.f62029e = str4;
        this.f62030f = z10;
        this.f62031g = z11;
        this.f62032h = z12;
        this.f62033i = z13;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x009f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:31:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0103  */
    /* JADX WARN: Code duplicated, block: B:34:0x0109  */
    /* JADX WARN: Code duplicated, block: B:36:0x0129  */
    /* JADX WARN: Code duplicated, block: B:38:0x012f  */
    public static /* synthetic */ Boolean a(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        yb ybVar = (yb) objArr[0];
        Object obj = objArr[1];
        int i15 = f62024o;
        int i16 = (i15 & (-24)) | ((~i15) & 23);
        int i17 = (i15 & 23) << 1;
        int i18 = (i16 & i17) + (i16 | i17);
        f62023n = i18 % 128;
        if (i18 % 2 != 0) {
            boolean z12 = obj instanceof yb;
            throw null;
        }
        if (obj instanceof yb) {
            int i19 = i15 & 91;
            int i20 = (i15 | 91) & (~i19);
            int i21 = i19 << 1;
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            f62023n = i22 % 128;
            int i23 = i22 % 2;
            yb ybVar2 = (yb) obj;
            if (Intrinsics.areEqual(ybVar2.setY, ybVar.setY)) {
                int i24 = f62024o;
                int i25 = i24 & 95;
                int i26 = (i24 ^ 95) | i25;
                int i27 = (i25 & i26) + (i26 | i25);
                f62023n = i27 % 128;
                int i28 = i27 % 2;
                String str = ybVar2.getNavBarTitleString;
                String str2 = ybVar.getNavBarTitleString;
                if (i28 != 0) {
                    boolean zAreEqual = Intrinsics.areEqual(str, str2);
                    int i29 = 13 / 0;
                    if (zAreEqual) {
                        int i30 = (-2) - ((f62024o + 76) ^ (-1));
                        i10 = i30 % 128;
                        f62023n = i10;
                        int i31 = i30 % 2;
                        if (ybVar2.f62027c == ybVar.f62027c) {
                            int i32 = i10 & 71;
                            int i33 = (i10 | 71) & (~i32);
                            int i34 = -(-(i32 << 1));
                            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                            f62024o = i35 % 128;
                            int i36 = i35 % 2;
                            if (Intrinsics.areEqual(ybVar2.f62028d, ybVar.f62028d)) {
                                int i37 = f62023n;
                                int i38 = (((i37 & (-94)) | ((~i37) & 93)) - (~((i37 & 93) << 1))) - 1;
                                f62024o = i38 % 128;
                                int i39 = i38 % 2;
                                if (Intrinsics.areEqual(ybVar2.f62029e, ybVar.f62029e)) {
                                    i11 = f62023n;
                                    int i40 = (i11 ^ 103) + ((i11 & 103) << 1);
                                    f62024o = i40 % 128;
                                    int i41 = i40 % 2;
                                    if (ybVar2.f62030f == ybVar.f62030f) {
                                        int i42 = i11 & 67;
                                        int i43 = (i11 ^ 67) | i42;
                                        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                                        f62024o = i44 % 128;
                                        int i45 = i44 % 2;
                                        if (ybVar2.f62031g == ybVar.f62031g) {
                                            int i46 = i11 & 59;
                                            int i47 = (i46 - (~((i11 ^ 59) | i46))) - 1;
                                            i12 = i47 % 128;
                                            f62024o = i12;
                                            i13 = i47 % 2;
                                            z10 = ybVar2.f62032h;
                                            z11 = ybVar.f62032h;
                                            if (i13 == 0) {
                                                int i48 = 46 / 0;
                                                if (z10 == z11) {
                                                    if (ybVar2.f62033i == ybVar.f62033i) {
                                                        int i49 = i12 & 23;
                                                        int i50 = (i49 - (~(-(-((i12 ^ 23) | i49))))) - 1;
                                                        f62023n = i50 % 128;
                                                        int i51 = i50 % 2;
                                                        i14 = ((i12 ^ 70) + ((i12 & 70) << 1)) - 1;
                                                        f62023n = i14 % 128;
                                                        if (i14 % 2 != 0) {
                                                            return Boolean.TRUE;
                                                        }
                                                        int i52 = 22 / 0;
                                                        return Boolean.TRUE;
                                                    }
                                                }
                                            } else if (z10 == z11) {
                                                if (ybVar2.f62033i == ybVar.f62033i) {
                                                    int i410 = i12 & 23;
                                                    int i53 = (i410 - (~(-(-((i12 ^ 23) | i410))))) - 1;
                                                    f62023n = i53 % 128;
                                                    int i54 = i53 % 2;
                                                    i14 = ((i12 ^ 70) + ((i12 & 70) << 1)) - 1;
                                                    f62023n = i14 % 128;
                                                    if (i14 % 2 != 0) {
                                                        return Boolean.TRUE;
                                                    }
                                                    int i55 = 22 / 0;
                                                    return Boolean.TRUE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (!(!Intrinsics.areEqual(str, str2))) {
                    int i310 = (-2) - ((f62024o + 76) ^ (-1));
                    i10 = i310 % 128;
                    f62023n = i10;
                    int i311 = i310 % 2;
                    if (ybVar2.f62027c == ybVar.f62027c) {
                        int i312 = i10 & 71;
                        int i313 = (i10 | 71) & (~i312);
                        int i314 = -(-(i312 << 1));
                        int i315 = ((i313 | i314) << 1) - (i314 ^ i313);
                        f62024o = i315 % 128;
                        int i316 = i315 % 2;
                        if (Intrinsics.areEqual(ybVar2.f62028d, ybVar.f62028d)) {
                            int i317 = f62023n;
                            int i318 = (((i317 & (-94)) | ((~i317) & 93)) - (~((i317 & 93) << 1))) - 1;
                            f62024o = i318 % 128;
                            int i319 = i318 % 2;
                            if (Intrinsics.areEqual(ybVar2.f62029e, ybVar.f62029e)) {
                                i11 = f62023n;
                                int i411 = (i11 ^ 103) + ((i11 & 103) << 1);
                                f62024o = i411 % 128;
                                int i412 = i411 % 2;
                                if (ybVar2.f62030f == ybVar.f62030f) {
                                    int i413 = i11 & 67;
                                    int i414 = (i11 ^ 67) | i413;
                                    int i415 = (i413 ^ i414) + ((i413 & i414) << 1);
                                    f62024o = i415 % 128;
                                    int i416 = i415 % 2;
                                    if (ybVar2.f62031g == ybVar.f62031g) {
                                        int i417 = i11 & 59;
                                        int i418 = (i417 - (~((i11 ^ 59) | i417))) - 1;
                                        i12 = i418 % 128;
                                        f62024o = i12;
                                        i13 = i418 % 2;
                                        z10 = ybVar2.f62032h;
                                        z11 = ybVar.f62032h;
                                        if (i13 == 0) {
                                            int i419 = 46 / 0;
                                            if (z10 == z11) {
                                                if (ybVar2.f62033i == ybVar.f62033i) {
                                                    int i4110 = i12 & 23;
                                                    int i56 = (i4110 - (~(-(-((i12 ^ 23) | i4110))))) - 1;
                                                    f62023n = i56 % 128;
                                                    int i57 = i56 % 2;
                                                    i14 = ((i12 ^ 70) + ((i12 & 70) << 1)) - 1;
                                                    f62023n = i14 % 128;
                                                    if (i14 % 2 != 0) {
                                                        return Boolean.TRUE;
                                                    }
                                                    int i58 = 22 / 0;
                                                    return Boolean.TRUE;
                                                }
                                            }
                                        } else if (z10 == z11) {
                                            if (ybVar2.f62033i == ybVar.f62033i) {
                                                int i4111 = i12 & 23;
                                                int i59 = (i4111 - (~(-(-((i12 ^ 23) | i4111))))) - 1;
                                                f62023n = i59 % 128;
                                                int i510 = i59 % 2;
                                                i14 = ((i12 ^ 70) + ((i12 & 70) << 1)) - 1;
                                                f62023n = i14 % 128;
                                                if (i14 % 2 != 0) {
                                                    return Boolean.TRUE;
                                                }
                                                int i511 = 22 / 0;
                                                return Boolean.TRUE;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i60 = f62024o;
        int i61 = (-2) - (((i60 ^ 122) + ((i60 & 122) << 1)) ^ (-1));
        f62023n = i61 % 128;
        int i62 = i61 % 2;
        return Boolean.FALSE;
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        yb ybVar = (yb) objArr[0];
        int i10 = f62024o;
        int i11 = i10 & 59;
        int i12 = -(-((i10 ^ 59) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f62023n = i13 % 128;
        int i14 = i13 % 2;
        int iHashCode = ybVar.setY.hashCode();
        int iIdentityHashCode = System.identityHashCode(ybVar);
        int i15 = (-965) - (~(-(-(iHashCode * (-963)))));
        int i16 = i15 | 508555;
        int i17 = (i16 << 1) - ((~(i15 & 508555)) & i16);
        int i18 = ~iHashCode;
        int i19 = (-528) ^ iIdentityHashCode;
        int i20 = ~iIdentityHashCode;
        int i21 = (-528) & iIdentityHashCode;
        int i22 = (i19 & i21) | (i19 ^ i21);
        int i23 = ~i22;
        int i24 = (i22 | i23) & i23;
        int i25 = ((~i24) & i18) | ((~i18) & i24);
        int i26 = i18 & i24;
        int i27 = -(-(((i26 & i25) | (i25 ^ i26)) * (-964)));
        int i28 = i17 & i27;
        int i29 = (i28 - (~(-(-((i27 ^ i17) | i28))))) - 1;
        int i30 = (iIdentityHashCode | i20) & i20;
        int i31 = ~((i30 & (-528)) | ((~i30) & (-528)) | (i30 & 527));
        int i32 = ~((iHashCode & (-528)) | ((-528) ^ iHashCode));
        int i33 = ((~i32) & i31) | ((~i31) & i32);
        int i34 = i32 & i31;
        int i35 = ((i34 & i33) | (i33 ^ i34)) * (-964);
        int i36 = i29 & i35;
        int i37 = ((i29 ^ i35) | i36) << 1;
        int i38 = -((i35 | i29) & (~i36));
        int i39 = ((i37 & i38) + (i38 | i37)) * 31;
        int iHashCode2 = ybVar.getNavBarTitleString.hashCode();
        int i40 = (((i39 ^ iHashCode2) | (i39 & iHashCode2)) << 1) - ((iHashCode2 & (~i39)) | ((~iHashCode2) & i39));
        int i41 = i40 * 31;
        long j10 = ybVar.f62027c;
        int i42 = (int) (j10 ^ (j10 >>> 32));
        int iIdentityHashCode2 = System.identityHashCode(ybVar);
        int i43 = i42 * (-381);
        int i44 = i40 * 5952;
        int i45 = (((~i44) & i43) | ((~i43) & i44)) + ((i44 & i43) << 1);
        int i46 = ~i42;
        int i47 = -(-(i46 * (-191)));
        int i48 = i45 & i47;
        int i49 = ((i45 ^ i47) | i48) << 1;
        int i50 = -((i47 | i45) & (~i48));
        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
        int i52 = i41 & iIdentityHashCode2;
        int i53 = (~i52) & (i41 | iIdentityHashCode2);
        int i54 = (i52 & i53) | (i53 ^ i52);
        int i55 = ~i54;
        int i56 = (i54 | i55) & i55;
        int i57 = i42 & i56;
        int i58 = (i42 | i56) & (~i57);
        int i59 = -(-(((i58 & i57) | (i58 ^ i57)) * Opcodes.ATHROW));
        int i60 = i51 & i59;
        int i61 = (i59 ^ i51) | i60;
        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
        int i63 = ((~i41) & i46) | ((~i46) & i41);
        int i64 = i46 & i41;
        int i65 = (i63 & i64) | (i63 ^ i64);
        int i66 = ~i65;
        int i67 = (i65 | i66) & i66;
        int i68 = i41 | (~iIdentityHashCode2);
        int i69 = ~i68;
        int i70 = (i68 | i69) & i69;
        int i71 = ((~i70) & i67) | ((~i67) & i70);
        int i72 = i70 & i67;
        int i73 = -(-(((i72 & i71) | (i71 ^ i72)) * Opcodes.ATHROW));
        int i74 = i62 & i73;
        int i75 = (i73 | i62) & (~i74);
        int i76 = -(-(i74 << 1));
        int i77 = (((i75 | i76) << 1) - (i75 ^ i76)) * 31;
        int iHashCode3 = ybVar.f62028d.hashCode();
        int i78 = i77 & iHashCode3;
        int iE = b.e(i78, ~((iHashCode3 ^ i77) | i78), 1, 31);
        int i79 = -(-ybVar.f62029e.hashCode());
        int i80 = iE ^ i79;
        int i81 = -(-((iE & i79) << 1));
        int i82 = ((i80 & i81) + (i81 | i80)) * 31;
        int i83 = ybVar.f62030f ? 1231 : 1237;
        int i84 = i82 ^ i83;
        int i85 = ((i83 & i82) | i84) << 1;
        int i86 = -i84;
        int i87 = ((((i85 ^ i86) + ((i85 & i86) << 1)) * 31) + (ybVar.f62031g ? 1231 : 1237)) * 31;
        int i88 = -(~(-(-(ybVar.f62032h ? 1231 : 1237))));
        int i89 = (i87 & i88) + (i88 | i87);
        int i90 = ((i89 ^ (-1)) + (i89 << 1)) * 31;
        int i91 = -(-(ybVar.f62033i ? 1231 : 1237));
        int i92 = i90 & i91;
        int i93 = i91 | i90;
        int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
        int i95 = f62024o + 37;
        f62023n = i95 % 128;
        if (i95 % 2 == 0) {
            return Integer.valueOf(i94);
        }
        throw null;
    }

    public static final /* synthetic */ Pattern setCompoundDrawableTintBlendMode() {
        return (Pattern) setDividerPadding(new Object[0], -1990395594, 1990395598, (int) System.currentTimeMillis());
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = ~i10;
        int i16 = ~i12;
        int i17 = ~(i15 | i16);
        int i18 = ~i11;
        int i19 = i15 | i18;
        switch ((((~(i10 | i18 | i12)) | (~(i11 | i15 | i12)) | (~(i19 | i16))) * 867) + (((~i19) | (~(i15 | i12)) | (~(i18 | i12))) * (-1734)) + ((i17 | (~(i18 | i16))) * (-867)) + (i11 * 868) + (i10 * 868)) {
            case 1:
                return b(objArr);
            case 2:
                int i20 = f62023n;
                int i21 = i20 + 94;
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                f62024o = i22 % 128;
                if (i22 % 2 == 0) {
                    throw null;
                }
                int i23 = (i20 & 75) + (i20 | 75);
                f62024o = i23 % 128;
                int i24 = i23 % 2;
                return f62022l;
            case 3:
                return a(objArr);
            case 4:
                int i25 = f62024o;
                int i26 = i25 ^ 7;
                int i27 = -(-((i25 & 7) << 1));
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                f62023n = i28 % 128;
                if (i28 % 2 != 0) {
                    int i29 = 75 / 0;
                }
                int i30 = i25 & 91;
                int i31 = i25 | 91;
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f62023n = i32 % 128;
                if (i32 % 2 == 0) {
                    return m;
                }
                throw null;
            case 5:
                int i33 = f62023n;
                int i34 = (i33 & (-58)) | ((~i33) & 57);
                int i35 = -(-((i33 & 57) << 1));
                int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                f62024o = i36 % 128;
                if (i36 % 2 == 0) {
                    throw null;
                }
                int i37 = i33 + 87;
                f62024o = i37 % 128;
                if (i37 % 2 != 0) {
                    return f62021k;
                }
                throw null;
            case 6:
                yb ybVar = (yb) objArr[0];
                int i38 = f62023n;
                int i39 = i38 & 83;
                int i40 = -(-((i38 ^ 83) | i39));
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                int i42 = i41 % 128;
                f62024o = i42;
                if (i41 % 2 == 0) {
                    long j10 = ybVar.f62027c;
                    throw null;
                }
                long j11 = ybVar.f62027c;
                int i43 = ((i42 & (-126)) | ((~i42) & 125)) + ((i42 & 125) << 1);
                f62023n = i43 % 128;
                int i44 = i43 % 2;
                return Long.valueOf(j11);
            case 7:
                yb ybVar2 = (yb) objArr[0];
                int i45 = f62024o;
                int i46 = i45 & 23;
                int i47 = (i45 | 23) & (~i46);
                int i48 = -(-(i46 << 1));
                int i49 = (i47 & i48) + (i47 | i48);
                int i50 = i49 % 128;
                f62023n = i50;
                int i51 = i49 % 2;
                String str = ybVar2.f62028d;
                int i52 = (i50 & 53) + (i50 | 53);
                f62024o = i52 % 128;
                if (i52 % 2 != 0) {
                    return str;
                }
                int i53 = 93 / 0;
                return str;
            case 8:
                yb ybVar3 = (yb) objArr[0];
                int i54 = f62023n;
                int i55 = i54 & 53;
                int i56 = ((i54 ^ 53) | i55) << 1;
                int i57 = -((i54 | 53) & (~i55));
                int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                int i59 = i58 % 128;
                f62024o = i59;
                int i60 = i58 % 2;
                boolean z10 = ybVar3.f62032h;
                int i61 = (((i59 ^ 105) | (i59 & 105)) << 1) - (((~i59) & 105) | (i59 & (-106)));
                f62023n = i61 % 128;
                int i62 = i61 % 2;
                return Boolean.valueOf(z10);
            case 9:
                yb ybVar4 = (yb) objArr[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) setDividerPadding(new Object[]{ybVar4}, -1206018521, 1206018534, System.identityHashCode(ybVar4)));
                sb2.append('=');
                sb2.append((String) setDividerPadding(new Object[]{ybVar4}, -1173441952, 1173441966, System.identityHashCode(ybVar4)));
                if (((Boolean) setDividerPadding(new Object[]{ybVar4}, 83557085, -83557077, System.identityHashCode(ybVar4))).booleanValue()) {
                    int i63 = f62023n;
                    int i64 = (i63 ^ 65) + ((i63 & 65) << 1);
                    f62024o = i64 % 128;
                    int i65 = i64 % 2;
                    if (((Long) setDividerPadding(new Object[]{ybVar4}, -2104654797, 2104654803, System.identityHashCode(ybVar4))).longValue() == Long.MIN_VALUE) {
                        int i66 = f62024o + 3;
                        f62023n = i66 % 128;
                        int i67 = i66 % 2;
                        sb2.append("; max-age=0");
                        int i68 = f62023n;
                        int i69 = i68 & 123;
                        int i70 = (i68 | 123) & (~i69);
                        int i71 = -(-(i69 << 1));
                        i13 = i70 ^ i71;
                        i14 = (i70 & i71) << 1;
                    } else {
                        sb2.append("; expires=");
                        ybVar4.getClass();
                        sb2.append((String) zm.setOnFocusChangeListener(new Object[]{new Date(((Long) setDividerPadding(new Object[]{ybVar4}, -2104654797, 2104654803, System.identityHashCode(ybVar4))).longValue())}, 1853930851, -1853930850, (int) System.currentTimeMillis()));
                        int i72 = f62023n;
                        i13 = i72 & 93;
                        i14 = i72 | 93;
                    }
                    int i73 = i13 + i14;
                    f62024o = i73 % 128;
                    int i74 = i73 % 2;
                }
                if (!((Boolean) setDividerPadding(new Object[]{ybVar4}, 2077963355, -2077963343, System.identityHashCode(ybVar4))).booleanValue()) {
                    int i75 = f62024o;
                    int i76 = (i75 & (-16)) | ((~i75) & 15);
                    int i77 = -(-((i75 & 15) << 1));
                    int i78 = (i76 & i77) + (i77 | i76);
                    f62023n = i78 % 128;
                    if (i78 % 2 != 0) {
                        sb2.append("; domain=");
                        sb2.append((String) setDividerPadding(new Object[]{ybVar4}, -1041224009, 1041224016, System.identityHashCode(ybVar4)));
                        throw null;
                    }
                    sb2.append("; domain=");
                    sb2.append((String) setDividerPadding(new Object[]{ybVar4}, -1041224009, 1041224016, System.identityHashCode(ybVar4)));
                }
                sb2.append("; path=");
                sb2.append((String) setDividerPadding(new Object[]{ybVar4}, 1799707109, -1799707098, System.identityHashCode(ybVar4)));
                if (((Boolean) setDividerPadding(new Object[]{ybVar4}, 2074202026, -2074202011, System.identityHashCode(ybVar4))).booleanValue()) {
                    int i79 = f62023n;
                    int i80 = ((i79 & 87) - (~(-(-(i79 | 87))))) - 1;
                    f62024o = i80 % 128;
                    if (i80 % 2 == 0) {
                        sb2.append("; secure");
                        int i81 = 4 / 0;
                    } else {
                        sb2.append("; secure");
                    }
                }
                if (((Boolean) setDividerPadding(new Object[]{ybVar4}, -1133760594, 1133760610, System.identityHashCode(ybVar4))).booleanValue()) {
                    int iIdentityHashCode = System.identityHashCode(ybVar4);
                    int i82 = ~iIdentityHashCode;
                    int i83 = (-309072884) & i82;
                    int i84 = (~i83) & ((-309072884) | i82);
                    int i85 = (~((i83 & i84) | (i84 ^ i83))) * 979;
                    int i86 = ((((450048830 ^ i85) | (450048830 & i85)) << 1) - (~(-((i85 & (-450048831)) | (450048830 & (~i85)))))) - 1;
                    int i87 = (((-1746547279) ^ iIdentityHashCode) | ((-1746547279) & iIdentityHashCode)) * (-979);
                    int i88 = i86 & i87;
                    int i89 = -(-((i87 ^ i86) | i88));
                    int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                    int i91 = ~(((-309072884) & iIdentityHashCode) | ((-309072884) ^ iIdentityHashCode));
                    int i92 = (iIdentityHashCode | i82) & i82;
                    int i93 = ~((i92 & (-1746547279)) | (1746547278 & i92) | ((~i92) & (-1746547279)));
                    int i94 = i91 & i93;
                    int i95 = -(-((((i93 | i91) & (~i94)) | i94) * 979));
                    int i96 = i90 & i95;
                    int i97 = -(-((i95 ^ i90) | i96));
                    int i98 = (i96 & i97) + (i97 | i96);
                    int iIdentityHashCode2 = System.identityHashCode(ybVar4);
                    int i99 = ~((826003438 ^ iIdentityHashCode2) | (826003438 & iIdentityHashCode2));
                    int i100 = 17842504 & i99;
                    int i101 = (i99 | 17842504) & (~i100);
                    int i102 = 1101642916 - (~(((i101 & i100) | (i101 ^ i100)) * (-196)));
                    int i103 = i102 & (-644454920);
                    int i104 = i103 + (((-644454920) ^ i102) | i103);
                    int i105 = ~(iIdentityHashCode2 | 826003438);
                    int i106 = 808160934 ^ i105;
                    int i107 = i105 & 808160934;
                    int i108 = -(-(((i107 & i106) | (i106 ^ i107)) * 196));
                    int i109 = i104 & i108;
                    int i110 = (i108 ^ i104) | i109;
                    if (i98 > (i109 & i110) + (i110 | i109)) {
                        sb2.append("; httponly");
                        throw null;
                    }
                    sb2.append("; httponly");
                }
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i111 = f62024o;
                int i112 = i111 & 69;
                int i113 = -(-((i111 ^ 69) | i112));
                int i114 = (i112 & i113) + (i113 | i112);
                f62023n = i114 % 128;
                if (i114 % 2 == 0) {
                    return string;
                }
                throw null;
            case 10:
                yb ybVar5 = (yb) objArr[0];
                int i115 = f62023n;
                int i116 = i115 & 15;
                int i117 = (i115 ^ 15) | i116;
                int i118 = (i116 ^ i117) + ((i117 & i116) << 1);
                f62024o = i118 % 128;
                if (i118 % 2 != 0) {
                    return (String) setDividerPadding(new Object[]{ybVar5}, 1272912168, -1272912159, System.identityHashCode(ybVar5));
                }
                int i119 = 21 / 0;
                return (String) setDividerPadding(new Object[]{ybVar5}, 1272912168, -1272912159, System.identityHashCode(ybVar5));
            case 11:
                yb ybVar6 = (yb) objArr[0];
                int i120 = f62024o;
                int i121 = i120 & 43;
                int i122 = i120 | 43;
                int i123 = (i121 & i122) + (i122 | i121);
                f62023n = i123 % 128;
                int i124 = i123 % 2;
                String str2 = ybVar6.f62029e;
                System.identityHashCode(ybVar6);
                System.identityHashCode(ybVar6);
                return str2;
            case 12:
                yb ybVar7 = (yb) objArr[0];
                int i125 = f62023n;
                int i126 = i125 + 63;
                f62024o = i126 % 128;
                int i127 = i126 % 2;
                boolean z11 = ybVar7.f62033i;
                int i128 = (i125 ^ 25) + ((i125 & 25) << 1);
                f62024o = i128 % 128;
                int i129 = i128 % 2;
                return Boolean.valueOf(z11);
            case 13:
                yb ybVar8 = (yb) objArr[0];
                int i130 = f62024o;
                int i131 = i130 & 19;
                int i132 = ((i130 | 19) & (~i131)) + (i131 << 1);
                f62023n = i132 % 128;
                int i133 = i132 % 2;
                String str3 = ybVar8.setY;
                if (i133 == 0) {
                    return str3;
                }
                int i134 = 62 / 0;
                return str3;
            case 14:
                yb ybVar9 = (yb) objArr[0];
                int i135 = f62024o;
                int i136 = ((i135 ^ 78) + ((i135 & 78) << 1)) - 1;
                int i137 = i136 % 128;
                f62023n = i137;
                int i138 = i136 % 2;
                String str4 = ybVar9.getNavBarTitleString;
                if (i138 != 0) {
                    int i139 = 87 / 0;
                }
                int i140 = i137 + 45;
                f62024o = i140 % 128;
                if (i140 % 2 != 0) {
                    return str4;
                }
                throw null;
            case 15:
                yb ybVar10 = (yb) objArr[0];
                int i141 = f62023n;
                int i142 = (((i141 ^ 49) | (i141 & 49)) << 1) - ((i141 & (-50)) | ((~i141) & 49));
                f62024o = i142 % 128;
                int i143 = i142 % 2;
                boolean z12 = ybVar10.f62030f;
                if (i143 == 0) {
                    throw null;
                }
                int i144 = i141 & 45;
                int i145 = (i144 - (~((i141 ^ 45) | i144))) - 1;
                f62024o = i145 % 128;
                int i146 = i145 % 2;
                return Boolean.valueOf(z12);
            case 16:
                yb ybVar11 = (yb) objArr[0];
                int i147 = f62024o;
                int i148 = (i147 & (-88)) | ((~i147) & 87);
                int i149 = -(-((i147 & 87) << 1));
                int i150 = ((i148 | i149) << 1) - (i149 ^ i148);
                int i151 = i150 % 128;
                f62023n = i151;
                int i152 = i150 % 2;
                boolean z13 = ybVar11.f62031g;
                int i153 = (((i151 | 124) << 1) - (i151 ^ 124)) - 1;
                f62024o = i153 % 128;
                int i154 = i153 % 2;
                return Boolean.valueOf(z13);
            default:
                int i155 = f62023n;
                int i156 = (((i155 & (-36)) | ((~i155) & 35)) - (~(-(-((i155 & 35) << 1))))) - 1;
                int i157 = i156 % 128;
                f62024o = i157;
                int i158 = i156 % 2;
                int i159 = i157 & 3;
                int i160 = (i157 ^ 3) | i159;
                int i161 = ((i159 | i160) << 1) - (i160 ^ i159);
                f62023n = i161 % 128;
                if (i161 % 2 == 0) {
                    return f62020j;
                }
                throw null;
        }
    }

    public static final /* synthetic */ Pattern setOnFocusChangeListener() {
        return (Pattern) setDividerPadding(new Object[0], -1902126765, 1902126770, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ Pattern setOnLongClickListener() {
        return (Pattern) setDividerPadding(new Object[0], 1672757321, -1672757321, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ Pattern setY() {
        return (Pattern) setDividerPadding(new Object[0], -579294071, 579294073, (int) System.currentTimeMillis());
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setDividerPadding(new Object[]{this, p4}, 1604841675, -1604841672, System.identityHashCode(this))).booleanValue();
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -50763152, 50763153, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setX")
    @NotNull
    public final String setX() {
        return (String) setDividerPadding(new Object[]{this}, -1206018521, 1206018534, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, 1926992721, -1926992711, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        return (String) setDividerPadding(new Object[]{this}, -1173441952, 1173441966, System.identityHashCode(this));
    }
}
