package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/ur;", "", "", "p0", "", "setX", "(J)Ljava/lang/String;", "Ljava/util/Locale;", "Ljava/util/Currency;", "p1", "Lcom/mypinpad/tsdk/i/sf;", "p2", "<init>", "(Ljava/util/Locale;Ljava/util/Currency;Lcom/mypinpad/tsdk/i/sf;)V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionAmountFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionAmountFormatter.kt\ncom/mypinpad/tsdk/internal/utils/amount/TransactionAmountFormatter\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,131:1\n1064#2,2:132\n*S KotlinDebug\n*F\n+ 1 TransactionAmountFormatter.kt\ncom/mypinpad/tsdk/internal/utils/amount/TransactionAmountFormatter\n*L\n53#1:132,2\n*E\n"})
public final class ur {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f61405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f61407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f61408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f61409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f61410i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Locale f61411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Currency f61412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final sf f61413c;

    static {
        b();
        f61408g = 0;
        f61409h = 1;
        f61406e = 0;
        f61407f = 1;
        f61405d = -443080062;
    }

    public ur(@NotNull Locale locale, @NotNull Currency currency, @Nullable sf sfVar) {
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(currency, "");
        this.f61411a = locale;
        this.f61412b = currency;
        this.f61413c = sfVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 65
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = new byte[r7]
            byte[] r1 = com.mypinpad.tsdk.isolation.ur.f61410i
            r2 = 0
            if (r1 != 0) goto L16
            r8 = r7
            r4 = r8
            r3 = r2
            r7 = r6
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ur.a(int, byte, int, java.lang.Object[]):void");
    }

    public static void b() {
        f61410i = new byte[]{25, -30, -107, -39};
    }

    public static double c(int i10, long j10) {
        int i11 = f61406e + 77;
        f61407f = i11 % 128;
        int i12 = i11 % 2;
        double dPow = j10 / Math.pow(10.0d, i10);
        int i13 = f61407f + 13;
        f61406e = i13 % 128;
        int i14 = i13 % 2;
        return dPow;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:30:0x011f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0128 A[Catch: all -> 0x01ef, TryCatch #0 {all -> 0x01ef, blocks: (B:28:0x00ff, B:32:0x0176, B:34:0x0186, B:38:0x01db, B:37:0x0199, B:31:0x0128, B:50:0x0234, B:54:0x028b, B:53:0x0249), top: B:74:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0198  */
    /* JADX WARN: Code duplicated, block: B:37:0x0199 A[Catch: all -> 0x01ef, TryCatch #0 {all -> 0x01ef, blocks: (B:28:0x00ff, B:32:0x0176, B:34:0x0186, B:38:0x01db, B:37:0x0199, B:31:0x0128, B:50:0x0234, B:54:0x028b, B:53:0x0249), top: B:74:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:44:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0219  */
    /* JADX WARN: Code duplicated, block: B:49:0x022c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0247  */
    /* JADX WARN: Code duplicated, block: B:53:0x0249 A[Catch: all -> 0x01ef, TryCatch #0 {all -> 0x01ef, blocks: (B:28:0x00ff, B:32:0x0176, B:34:0x0186, B:38:0x01db, B:37:0x0199, B:31:0x0128, B:50:0x0234, B:54:0x028b, B:53:0x0249), top: B:74:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0299  */
    /* JADX WARN: Code duplicated, block: B:59:0x029a  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f2 A[EDGE_INSN: B:78:0x01f2->B:42:0x01f2 BREAK  A[LOOP:1: B:25:0x00e3->B:39:0x01e1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x029b A[EDGE_INSN: B:79:0x029b->B:60:0x029b BREAK  A[LOOP:2: B:47:0x0228->B:55:0x0291], SYNTHETIC] */
    public static Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        String currencyCode;
        int touchSlop;
        int defaultSize;
        int iCombineMeasuredStates;
        char[] charArray;
        getNavBarTitleString getnavbartitlestring;
        char[] cArr;
        int i13;
        String str;
        String str2;
        int i14;
        char[] cArr2;
        int i15;
        int i16;
        Map map;
        Object method;
        Throwable cause;
        Map map2;
        Object method2;
        Object method3;
        ur urVar = (ur) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i17 = f61406e + 109;
        f61407f = i17 % 128;
        int i18 = 2;
        if (i17 % 2 == 0) {
            sf sfVar = urVar.f61413c;
            throw null;
        }
        sf sfVar2 = urVar.f61413c;
        Locale locale = urVar.f61411a;
        Currency currency = urVar.f61412b;
        String strF = "";
        if (sfVar2 == null) {
            int defaultFractionDigits = currency.getDefaultFractionDigits();
            int i19 = f61406e + 121;
            f61407f = i19 % 128;
            int i20 = i19 % 2;
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
            currencyInstance.setCurrency(currency);
            currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
            currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
            String str3 = currencyInstance.format(c(defaultFractionDigits, jLongValue));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            int i21 = f61406e;
            int i22 = i21 + 89;
            f61407f = i22 % 128;
            int i23 = i22 % 2;
            int i24 = i21 + 87;
            f61407f = i24 % 128;
            if (i24 % 2 != 0) {
                return str3;
            }
            throw null;
        }
        int defaultFractionDigits2 = currency.getDefaultFractionDigits();
        ut utVar = new ut(urVar.f61412b, urVar.f61411a, sfVar2.setX(), sfVar2.setCompoundDrawableTintBlendMode(), sfVar2.setDividerPadding());
        String str4 = (String) ut.setX(new Object[]{utVar, Double.valueOf(c(defaultFractionDigits2, jLongValue))}, -520472434, 520472434, System.identityHashCode(utVar));
        int i25 = f61407f + 29;
        f61406e = i25 % 128;
        if (i25 % 2 != 0) {
            throw null;
        }
        if (sfVar2.setY()) {
            currencyCode = currency.getSymbol(locale);
        } else {
            currencyCode = currency.getCurrencyCode();
            int i26 = f61407f + 103;
            f61406e = i26 % 128;
            int i27 = i26 % 2;
        }
        if (sfVar2.setY()) {
            Intrinsics.checkNotNullExpressionValue(currencyCode, "");
            int i28 = 0;
            while (true) {
                if (i28 >= currencyCode.length()) {
                    touchSlop = 1 - (ViewConfiguration.getTouchSlop() >> 8);
                    defaultSize = View.getDefaultSize(0, 0) + 122;
                    iCombineMeasuredStates = 1 - View.combineMeasuredStates(0, 0);
                    int i29 = f61408g + 65;
                    int i30 = i29 % 128;
                    f61409h = i30;
                    int i31 = i29 % 2;
                    int i32 = i30 + 33;
                    f61408g = i32 % 128;
                    int i33 = i32 % 2;
                    charArray = "\u0000".toCharArray();
                    getnavbartitlestring = new getNavBarTitleString();
                    cArr = new char[touchSlop];
                    getnavbartitlestring.setY = 0;
                    while (true) {
                        i13 = getnavbartitlestring.setY;
                        if (i13 < touchSlop) {
                            break;
                        }
                        int i34 = f61409h + 21;
                        f61408g = i34 % 128;
                        int i35 = i34 % i18;
                        char c10 = charArray[i13];
                        getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
                        char c11 = (char) (c10 + defaultSize);
                        cArr[i13] = c11;
                        try {
                            Object[] objArr2 = new Object[i18];
                            objArr2[1] = Integer.valueOf(f61405d);
                            objArr2[0] = Integer.valueOf(c11);
                            map2 = setTextScaleX.setMaxEms;
                            method2 = map2.get(133002375);
                            if (method2 != null) {
                                Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 41, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 483);
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                Object[] objArr3 = new Object[1];
                                a(b11, b10, (byte) (b11 + 1), objArr3);
                                String str5 = (String) objArr3[0];
                                Class<?> cls2 = Integer.TYPE;
                                method2 = cls.getMethod(str5, cls2, cls2);
                                map2.put(133002375, method2);
                            }
                            cArr[i13] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                            Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                            method3 = map2.get(1860518195);
                            if (method3 != null) {
                                Class cls3 = (Class) setTextScaleX.setX((char) (55966 - Color.alpha(0)), 44 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2267);
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                Object[] objArr5 = new Object[1];
                                a(b13, b12, b13, objArr5);
                                method3 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                                map2.put(1860518195, method3);
                            }
                            ((Method) method3).invoke(null, objArr4);
                            charArray = charArray;
                            defaultSize = defaultSize;
                            currencyCode = currencyCode;
                            str4 = str4;
                            i18 = 2;
                        } catch (Throwable th2) {
                            cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                        cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                    str = str4;
                    str2 = currencyCode;
                    if (iCombineMeasuredStates > 0) {
                        int i36 = f61408g + 33;
                        f61409h = i36 % 128;
                        int i37 = i36 % 2;
                        getnavbartitlestring.setOnFocusChangeListener = iCombineMeasuredStates;
                        char[] cArr3 = new char[touchSlop];
                        i14 = 0;
                        System.arraycopy(cArr, 0, cArr3, 0, touchSlop);
                        int i38 = getnavbartitlestring.setOnFocusChangeListener;
                        System.arraycopy(cArr3, 0, cArr, touchSlop - i38, i38);
                        int i39 = getnavbartitlestring.setOnFocusChangeListener;
                        System.arraycopy(cArr3, i39, cArr, 0, touchSlop - i39);
                    } else {
                        i14 = 0;
                    }
                    cArr2 = new char[touchSlop];
                    getnavbartitlestring.setY = i14;
                    int i40 = f61408g + 107;
                    f61409h = i40 % 128;
                    i15 = 2;
                    int i41 = i40 % 2;
                    while (true) {
                        i16 = getnavbartitlestring.setY;
                        if (i16 < touchSlop) {
                            break;
                        }
                        cArr2[i16] = cArr[(touchSlop - i16) - 1];
                        Object[] objArr6 = new Object[i15];
                        objArr6[1] = getnavbartitlestring;
                        objArr6[0] = getnavbartitlestring;
                        map = setTextScaleX.setMaxEms;
                        method = map.get(1860518195);
                        if (method != null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) (55965 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getTouchSlop() >> 8) + 43, 2268 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            Object[] objArr7 = new Object[1];
                            a(b15, b14, b15, objArr7);
                            method = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                            map.put(1860518195, method);
                        }
                        ((Method) method).invoke(null, objArr6);
                        i15 = 2;
                    }
                    strF = n1.f(cArr2);
                } else if (Character.isLetter(currencyCode.charAt(i28))) {
                    i28++;
                } else {
                    int i42 = f61407f + 87;
                    f61406e = i42 % 128;
                    if (i42 % 2 != 0) {
                        throw null;
                    }
                    str = str4;
                    str2 = currencyCode;
                }
            }
        } else {
            touchSlop = 1 - (ViewConfiguration.getTouchSlop() >> 8);
            defaultSize = View.getDefaultSize(0, 0) + 122;
            iCombineMeasuredStates = 1 - View.combineMeasuredStates(0, 0);
            int i210 = f61408g + 65;
            int i310 = i210 % 128;
            f61409h = i310;
            int i311 = i210 % 2;
            int i312 = i310 + 33;
            f61408g = i312 % 128;
            int i313 = i312 % 2;
            charArray = "\u0000".toCharArray();
            getnavbartitlestring = new getNavBarTitleString();
            cArr = new char[touchSlop];
            getnavbartitlestring.setY = 0;
            while (true) {
                i13 = getnavbartitlestring.setY;
                if (i13 < touchSlop) {
                    break;
                    break;
                }
                int i314 = f61409h + 21;
                f61408g = i314 % 128;
                int i315 = i314 % i18;
                char c12 = charArray[i13];
                getnavbartitlestring.setCompoundDrawableTintBlendMode = c12;
                char c13 = (char) (c12 + defaultSize);
                cArr[i13] = c13;
                Object[] objArr8 = new Object[i18];
                objArr8[1] = Integer.valueOf(f61405d);
                objArr8[0] = Integer.valueOf(c13);
                map2 = setTextScaleX.setMaxEms;
                method2 = map2.get(133002375);
                if (method2 != null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 41, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 483);
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    a(b17, b16, (byte) (b17 + 1), objArr9);
                    String str6 = (String) objArr9[0];
                    Class<?> cls6 = Integer.TYPE;
                    method2 = cls5.getMethod(str6, cls6, cls6);
                    map2.put(133002375, method2);
                }
                cArr[i13] = ((Character) ((Method) method2).invoke(null, objArr8)).charValue();
                Object[] objArr10 = {getnavbartitlestring, getnavbartitlestring};
                method3 = map2.get(1860518195);
                if (method3 != null) {
                    Class cls7 = (Class) setTextScaleX.setX((char) (55966 - Color.alpha(0)), 44 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2267);
                    byte b18 = (byte) 0;
                    byte b19 = b18;
                    Object[] objArr11 = new Object[1];
                    a(b19, b18, b19, objArr11);
                    method3 = cls7.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr10);
                charArray = charArray;
                defaultSize = defaultSize;
                currencyCode = currencyCode;
                str4 = str4;
                i18 = 2;
                cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
            str = str4;
            str2 = currencyCode;
            if (iCombineMeasuredStates > 0) {
                int i316 = f61408g + 33;
                f61409h = i316 % 128;
                int i317 = i316 % 2;
                getnavbartitlestring.setOnFocusChangeListener = iCombineMeasuredStates;
                char[] cArr4 = new char[touchSlop];
                i14 = 0;
                System.arraycopy(cArr, 0, cArr4, 0, touchSlop);
                int i318 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr4, 0, cArr, touchSlop - i318, i318);
                int i319 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr4, i319, cArr, 0, touchSlop - i319);
            } else {
                i14 = 0;
            }
            cArr2 = new char[touchSlop];
            getnavbartitlestring.setY = i14;
            int i43 = f61408g + 107;
            f61409h = i43 % 128;
            i15 = 2;
            int i44 = i43 % 2;
            while (true) {
                i16 = getnavbartitlestring.setY;
                if (i16 < touchSlop) {
                    break;
                    break;
                }
                cArr2[i16] = cArr[(touchSlop - i16) - 1];
                Object[] objArr12 = new Object[i15];
                objArr12[1] = getnavbartitlestring;
                objArr12[0] = getnavbartitlestring;
                map = setTextScaleX.setMaxEms;
                method = map.get(1860518195);
                if (method != null) {
                    Class cls8 = (Class) setTextScaleX.setX((char) (55965 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getTouchSlop() >> 8) + 43, 2268 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    byte b110 = (byte) 0;
                    byte b111 = b110;
                    Object[] objArr13 = new Object[1];
                    a(b111, b110, b111, objArr13);
                    method = cls8.getMethod((String) objArr13[0], Object.class, Object.class);
                    map.put(1860518195, method);
                }
                ((Method) method).invoke(null, objArr12);
                i15 = 2;
            }
            strF = n1.f(cArr2);
        }
        if (sfVar2.setOnFocusChangeListener()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(strF);
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(strF);
        sb3.append(str);
        return sb3.toString();
    }

    @NotNull
    public final String setX(long p4) {
        return (String) setX(new Object[]{this, Long.valueOf(p4)}, -1158643154, 1158643154, System.identityHashCode(this));
    }
}
