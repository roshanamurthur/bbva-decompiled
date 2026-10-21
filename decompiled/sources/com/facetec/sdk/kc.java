package com.facetec.sdk;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.nulabinc.zxcvbn.Guess;
import java.lang.reflect.Method;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import mx.openpay.library.domain.util.Constant;
import okhttp3.internal.http.DatesKt;

/* JADX INFO: loaded from: classes9.dex */
public final class kc {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f41993a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f41994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f41995d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f41996f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f41997k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char[] f41998n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41999b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42000e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f42001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f42002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f42003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f42004j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f42005l;
    private final boolean m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f42006o;

    static {
        init$0();
        b();
        f41994c = Pattern.compile("(\\d{2,4})[^\\d]*");
        f41995d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        f41993a = Pattern.compile("(\\d{1,2})[^\\d]*");
        f41996f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    }

    private kc(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f41999b = str;
        this.f42000e = str2;
        this.f42002h = j10;
        this.f42003i = str3;
        this.f42004j = str4;
        this.f42001g = z10;
        this.f42006o = z11;
        this.m = z12;
        this.f42005l = z13;
    }

    public static List<kc> a(kk kkVar, kj kjVar) throws Throwable {
        int iA = kjVar.a();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < iA; i10++) {
            if ("Set-Cookie".equalsIgnoreCase(kjVar.e(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(kjVar.c(i10));
            }
        }
        List listUnmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
        int size = listUnmodifiableList.size();
        ArrayList arrayList2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            String str = (String) listUnmodifiableList.get(i11);
            try {
                Object[] objArr = new Object[1];
                p(17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ViewConfiguration.getScrollDefaultDelay() >> 16, (char) ExpandableListView.getPackedPositionGroup(0L), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                p(17 - (Process.myPid() >> 22), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 61542), objArr2);
                kc kcVarE = e(((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue(), kkVar, str);
                if (kcVarE != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(kcVarE);
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        return arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.emptyList();
    }

    private static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !kz.d(str);
    }

    private static long c(String str) {
        try {
            long j10 = Long.parseLong(str);
            if (j10 <= 0) {
                return Long.MIN_VALUE;
            }
            return j10;
        } catch (NumberFormatException e5) {
            if (str.matches("-?\\d+")) {
                return str.startsWith(Constant.DASH_STRING) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0238 A[PHI: r0
      0x0238: PHI (r0v27 long) = (r0v3 long), (r0v8 long) binds: [B:118:0x0236, B:129:0x0260] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:161:0x02e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2 A[Catch: IllegalArgumentException -> 0x00bb, TryCatch #1 {IllegalArgumentException -> 0x00bb, blocks: (B:25:0x0088, B:27:0x0092, B:29:0x009e, B:48:0x011e, B:34:0x00c9, B:36:0x00d5, B:39:0x00e2, B:41:0x00ee, B:45:0x0109, B:47:0x0115), top: B:178:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee A[Catch: IllegalArgumentException -> 0x00bb, TryCatch #1 {IllegalArgumentException -> 0x00bb, blocks: (B:25:0x0088, B:27:0x0092, B:29:0x009e, B:48:0x011e, B:34:0x00c9, B:36:0x00d5, B:39:0x00e2, B:41:0x00ee, B:45:0x0109, B:47:0x0115), top: B:178:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean, int] */
    @Nullable
    private static kc e(long j10, kk kkVar, String str) {
        long j11;
        long j12;
        String str2;
        String strSubstring;
        int i10;
        int length;
        int length2;
        String string;
        char c10;
        int i11;
        int i12;
        int i13;
        Pattern pattern;
        String str3 = str;
        int length3 = str.length();
        ?? r3 = 0;
        char c11 = ';';
        int iB = kz.b(str3, 0, length3, ';');
        char c12 = '=';
        int iB2 = kz.b(str3, 0, iB, '=');
        String str4 = null;
        if (iB2 == iB) {
            return null;
        }
        String strE = kz.e(str3, 0, iB2);
        if (!strE.isEmpty()) {
            int i14 = -1;
            if (kz.e(strE) == -1) {
                boolean z10 = true;
                String strE2 = kz.e(str3, iB2 + 1, iB);
                if (kz.e(strE2) != -1) {
                    return null;
                }
                int i15 = iB + 1;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                String str5 = null;
                boolean z14 = true;
                long jC = -1;
                long timeInMillis = DatesKt.MAX_DATE;
                while (i15 < length3) {
                    int iB3 = kz.b(str3, i15, length3, c11);
                    int iB4 = kz.b(str3, i15, iB3, c12);
                    String strE3 = kz.e(str3, i15, iB4);
                    String strE4 = iB4 < iB3 ? kz.e(str3, iB4 + 1, iB3) : "";
                    if (strE3.equalsIgnoreCase("expires")) {
                        try {
                            int length4 = strE4.length();
                            int iB5 = b(strE4, r3, length4, r3);
                            Matcher matcher = f41996f.matcher(strE4);
                            int iIndexOf = i14;
                            int i16 = iIndexOf;
                            int i17 = i16;
                            int i18 = i17;
                            int i19 = i18;
                            int i20 = i19;
                            ?? r10 = z10;
                            while (iB5 < length4) {
                                try {
                                    int iB6 = b(strE4, iB5 + 1, length4, r10);
                                    matcher.region(iB5, iB6);
                                    if (i16 == -1) {
                                        if (matcher.usePattern(f41996f).matches()) {
                                            i16 = Integer.parseInt(matcher.group((int) r10));
                                            i19 = Integer.parseInt(matcher.group(2));
                                            i20 = Integer.parseInt(matcher.group(3));
                                            i18 = i18;
                                        } else {
                                            i12 = -1;
                                        }
                                        i18 = i18;
                                        iB5 = b(strE4, iB6 + 1, length4, false);
                                        r10 = 1;
                                    } else {
                                        i12 = -1;
                                    }
                                    if (i18 != i12) {
                                        if (iIndexOf == i12) {
                                            pattern = f41995d;
                                            if (matcher.usePattern(pattern).matches()) {
                                                iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                                            } else {
                                                i13 = -1;
                                            }
                                        } else {
                                            i13 = i12;
                                        }
                                        if (i17 == i13 && matcher.usePattern(f41994c).matches()) {
                                            i17 = Integer.parseInt(matcher.group(1));
                                        }
                                    } else if (matcher.usePattern(f41993a).matches()) {
                                        i18 = Integer.parseInt(matcher.group(1));
                                    } else {
                                        i12 = -1;
                                        if (iIndexOf == i12) {
                                            pattern = f41995d;
                                            if (matcher.usePattern(pattern).matches()) {
                                                iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                                            } else {
                                                i13 = -1;
                                            }
                                        } else {
                                            i13 = i12;
                                        }
                                        if (i17 == i13) {
                                            i17 = Integer.parseInt(matcher.group(1));
                                        }
                                    }
                                    i18 = i18;
                                    iB5 = b(strE4, iB6 + 1, length4, false);
                                    r10 = 1;
                                } catch (IllegalArgumentException unused) {
                                    i11 = -1;
                                    c10 = ';';
                                }
                            }
                            int i21 = i18;
                            if (i17 >= 70 && i17 <= 99) {
                                i17 += ReturnCode.ERR_REPOSITORY;
                            }
                            if (i17 >= 0 && i17 <= 69) {
                                i17 += Guess.REFERENCE_YEAR;
                            }
                            if (i17 < 1601) {
                                throw new IllegalArgumentException();
                            }
                            i11 = -1;
                            if (iIndexOf == -1) {
                                throw new IllegalArgumentException();
                            }
                            if (i21 <= 0 || i21 > 31) {
                                throw new IllegalArgumentException();
                            }
                            if (i16 < 0 || i16 > 23) {
                                throw new IllegalArgumentException();
                            }
                            int i22 = i19;
                            c10 = ';';
                            if (i22 < 0 || i22 > 59) {
                                throw new IllegalArgumentException();
                            }
                            int i23 = i20;
                            if (i23 < 0 || i23 > 59) {
                                throw new IllegalArgumentException();
                            }
                            try {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(kz.f42207b);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i17);
                                gregorianCalendar.set(2, iIndexOf - 1);
                                gregorianCalendar.set(5, i21);
                                gregorianCalendar.set(11, i16);
                                gregorianCalendar.set(12, i22);
                                gregorianCalendar.set(13, i23);
                                gregorianCalendar.set(14, 0);
                                timeInMillis = gregorianCalendar.getTimeInMillis();
                                z13 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused2) {
                            }
                        } catch (IllegalArgumentException unused3) {
                            c10 = c11;
                            i11 = i14;
                        }
                    } else {
                        c10 = c11;
                        i11 = i14;
                        if (strE3.equalsIgnoreCase("max-age")) {
                            jC = c(strE4);
                            z13 = true;
                        } else if (strE3.equalsIgnoreCase(DynamicLink.Builder.KEY_DOMAIN)) {
                            if (strE4.endsWith(Constant.DOT_STRING)) {
                                throw new IllegalArgumentException();
                            }
                            if (strE4.startsWith(Constant.DOT_STRING)) {
                                strE4 = strE4.substring(1);
                            }
                            String strB = kz.b(strE4);
                            if (strB == null) {
                                throw new IllegalArgumentException();
                            }
                            str4 = strB;
                            z14 = false;
                        } else if (strE3.equalsIgnoreCase("path")) {
                            str5 = strE4;
                        } else if (strE3.equalsIgnoreCase("secure")) {
                            z11 = true;
                        } else if (strE3.equalsIgnoreCase("httponly")) {
                            z12 = true;
                        }
                    }
                    i15 = iB3 + 1;
                    i14 = i11;
                    c11 = c10;
                    r3 = 0;
                    c12 = '=';
                    z10 = true;
                    str3 = str;
                }
                long j13 = Long.MIN_VALUE;
                if (jC == Long.MIN_VALUE) {
                    j11 = j13;
                } else if (jC != -1) {
                    j13 = j10 + (jC <= 9223372036854775L ? jC * 1000 : Long.MAX_VALUE);
                    if (j13 >= j10) {
                        j12 = DatesKt.MAX_DATE;
                        if (j13 <= DatesKt.MAX_DATE) {
                            j11 = j13;
                        }
                    } else {
                        j12 = DatesKt.MAX_DATE;
                    }
                    j11 = j12;
                } else {
                    j11 = timeInMillis;
                }
                String strI = kkVar.i();
                if (str4 == null) {
                    str2 = strI;
                } else {
                    if (!b(strI, str4)) {
                        return null;
                    }
                    str2 = str4;
                }
                if (strI.length() != str2.length()) {
                    mw mwVarB = mw.b();
                    String[] strArrSplit = IDN.toUnicode(str2).split("\\.");
                    String[] strArrB = mwVarB.b(strArrSplit);
                    if (strArrSplit.length == strArrB.length) {
                        i10 = 0;
                        if (strArrB[0].charAt(0) != '!') {
                            string = null;
                        }
                        if (string == null) {
                            return null;
                        }
                    } else {
                        i10 = 0;
                    }
                    if (strArrB[i10].charAt(i10) == '!') {
                        length = strArrSplit.length;
                        length2 = strArrB.length;
                    } else {
                        length = strArrSplit.length;
                        length2 = strArrB.length + 1;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    String[] strArrSplit2 = str2.split("\\.");
                    for (int i24 = length - length2; i24 < strArrSplit2.length; i24++) {
                        sb2.append(strArrSplit2[i24]);
                        sb2.append('.');
                    }
                    sb2.deleteCharAt(sb2.length() - 1);
                    string = sb2.toString();
                    if (string == null) {
                        return null;
                    }
                }
                String str6 = str5;
                if (str6 == null || !str6.startsWith("/")) {
                    String strH = kkVar.h();
                    int iLastIndexOf = strH.lastIndexOf(47);
                    strSubstring = iLastIndexOf != 0 ? strH.substring(0, iLastIndexOf) : "/";
                } else {
                    strSubstring = str6;
                }
                return new kc(strE, strE2, j11, str2, strSubstring, z11, z12, z14, z13);
            }
        }
        return null;
    }

    public static void init$0() {
        $$a = new byte[]{122, 27, 102, -107};
        $$b = 83;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b4  */
    private static void p(int i10, int i11, char c10, Object[] objArr) throws Throwable {
        Throwable cause;
        gt gtVar = new gt();
        long[] jArr = new long[i10];
        gtVar.f41826d = 0;
        while (true) {
            int i12 = gtVar.f41826d;
            if (i12 >= i10) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f41998n[i11 + i12])};
                Map map = bp.f40694x;
                Object method = map.get(-167668390);
                if (method == null) {
                    method = ((Class) bp.a(24 - ExpandableListView.getPackedPositionGroup(0L), (KeyEvent.getMaxKeyCode() >> 16) + 245, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1))).getMethod("d", Integer.TYPE);
                    map.put(-167668390, method);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(gtVar.f41826d), Long.valueOf(f41997k), Integer.valueOf(c10)};
                Object method2 = map.get(-1565725271);
                if (method2 == null) {
                    Class cls = (Class) bp.a(23 - ((byte) KeyEvent.getModifierMetaStateMask()), 1672 - (KeyEvent.getMaxKeyCode() >> 16), (char) (View.resolveSizeAndState(0, 0, 0) + 58390));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr4 = new Object[1];
                    q(b10, b11, b11, objArr4);
                    String str = (String) objArr4[0];
                    Class<?> cls2 = Long.TYPE;
                    method2 = cls.getMethod(str, cls2, cls2, cls2, Integer.TYPE);
                    map.put(-1565725271, method2);
                }
                jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr3)).longValue();
                Object[] objArr5 = {gtVar, gtVar};
                Object method3 = map.get(453950717);
                if (method3 == null) {
                    method3 = ((Class) bp.a(23 - ((byte) KeyEvent.getModifierMetaStateMask()), 269 - Color.red(0), (char) (25686 - KeyEvent.getDeadChar(0, 0)))).getMethod("b", Object.class, Object.class);
                    map.put(453950717, method3);
                }
                ((Method) method3).invoke(null, objArr5);
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[i10];
        gtVar.f41826d = 0;
        while (true) {
            int i13 = gtVar.f41826d;
            if (i13 >= i10) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i13] = (char) jArr[i13];
            Object[] objArr6 = {gtVar, gtVar};
            Map map2 = bp.f40694x;
            Object method4 = map2.get(453950717);
            if (method4 == null) {
                method4 = ((Class) bp.a(25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777485, (char) (25686 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)))).getMethod("b", Object.class, Object.class);
                map2.put(453950717, method4);
            }
            ((Method) method4).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void q(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.facetec.sdk.kc.$$a
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r9 = r9 * 3
            int r9 = 99 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r9 = r8
            r3 = r9
            r4 = r2
            r8 = r7
            goto L2e
        L18:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1d:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r8]
        L2e:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.kc.q(byte, byte, byte, java.lang.Object[]):void");
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof kc)) {
            return false;
        }
        kc kcVar = (kc) obj;
        return kcVar.f41999b.equals(this.f41999b) && kcVar.f42000e.equals(this.f42000e) && kcVar.f42003i.equals(this.f42003i) && kcVar.f42004j.equals(this.f42004j) && kcVar.f42002h == this.f42002h && kcVar.f42001g == this.f42001g && kcVar.f42006o == this.f42006o && kcVar.f42005l == this.f42005l && kcVar.m == this.m;
    }

    public final int hashCode() {
        int iHashCode = (this.f42004j.hashCode() + ((this.f42003i.hashCode() + ((this.f42000e.hashCode() + ((this.f41999b.hashCode() + 527) * 31)) * 31)) * 31)) * 31;
        long j10 = this.f42002h;
        return ((((((((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f42001g ? 1 : 0)) * 31) + (!this.f42006o ? 1 : 0)) * 31) + (!this.f42005l ? 1 : 0)) * 31) + (!this.m ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f41999b);
        sb2.append('=');
        sb2.append(this.f42000e);
        if (this.f42005l) {
            if (this.f42002h == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(lq.e(new Date(this.f42002h)));
            }
        }
        if (!this.m) {
            sb2.append("; domain=");
            sb2.append(this.f42003i);
        }
        sb2.append("; path=");
        sb2.append(this.f42004j);
        if (this.f42001g) {
            sb2.append("; secure");
        }
        if (this.f42006o) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }

    private static int b(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static void b() {
        f41998n = new char[]{32903, 40010, 47383, 55006, 62427, 3935, 11304, 18921, 26298, 33333, 40706, 48150, 55766, 63127, 4700, 12058, 28905, 27705, 18804, 9898, 1015, 65338, 56410, 47540, 38611, 29201, 28499, 19525, 10667, 1768, 57906, 57209, 48281};
        f41997k = 8317373590319111211L;
    }
}
