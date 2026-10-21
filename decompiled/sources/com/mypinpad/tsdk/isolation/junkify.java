package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class junkify {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f56703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f56704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f56705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f56706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f56707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f56709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f56710i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CurrencyKt f56711a;

    static {
        b();
        f56709h = 1;
        f56707f = 0;
        f56708g = 1;
        f56705d = true;
        f56706e = true;
        f56704c = 1794962252;
        f56703b = new char[]{62170, 62147, 62168, 62316, 62161, 62127, 62173, 62144, 62126, 62163, 62145, 62107, 62151, 62172, 62169, 62167, 62106, 62095, 62174, 62088, 62112, 62090};
    }

    public junkify(@NotNull CurrencyKt currencyKt) {
        Intrinsics.checkNotNullParameter(currencyKt, "");
        this.f56711a = currencyKt;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = r6 * 2
            int r6 = r6 + 118
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.junkify.f56710i
            if (r2 != 0) goto L1c
            r6 = r7
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L39
        L1c:
            r3 = r1
            r5 = r8
            r8 = r6
        L1f:
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2d:
            r4 = r2[r6]
            int r3 = r3 + 1
            r5 = r9
            r9 = r6
            r6 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L39:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.junkify.a(int, short, short, java.lang.Object[]):void");
    }

    public static void b() {
        f56710i = new byte[]{122, -107, 66, -93};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007c, code lost:
    
        if (r10 >= r7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.junkify.f56708g + 81;
        com.mypinpad.tsdk.isolation.junkify.f56707f = r11 % 128;
        r11 = r11 % 2;
        r2.add(((java.security.cert.Certificate) r0[r10]).getEncoded());
        r10 = r10 + 1;
        r11 = com.mypinpad.tsdk.isolation.junkify.f56707f + 115;
        com.mypinpad.tsdk.isolation.junkify.f56708g = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x009e, code lost:
    
        r0 = r2.toArray(new byte[0][]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a4, code lost:
    
        if (r0 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
    
        r2 = 128 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1));
        r7 = com.mypinpad.tsdk.isolation.junkify.f56709h + 45;
        r8 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
    
        if ((r7 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
    
        r7 = "\u0096\u0095\u0094\u008d\u0086\u0093\u0093\u0092\u0091\u0081\u0090\u0083\u0088\u0087\u008f\u0084\u008a\u008e\u008d\u0088\u0084\u0083\u0083\u0082\u0081\u008c\u0081\u0087\u0081\u0084\u0087\u0088\u0084\u0088\u008b\u0086\u0085\u0084\u008a\u0089\u0084\u0088\u0087\u0081\u0081\u0086\u0085\u0084\u0083\u0083\u0082\u0081".getBytes("ISO-8859-1");
        r8 = 98 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        r7 = "\u0096\u0095\u0094\u008d\u0086\u0093\u0093\u0092\u0091\u0081\u0090\u0083\u0088\u0087\u008f\u0084\u008a\u008e\u008d\u0088\u0084\u0083\u0083\u0082\u0081\u008c\u0081\u0087\u0081\u0084\u0087\u0088\u0084\u0088\u008b\u0086\u0085\u0084\u008a\u0089\u0084\u0088\u0087\u0081\u0081\u0086\u0085\u0084\u0083\u0083\u0082\u0081".getBytes("ISO-8859-1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        r8 = com.mypinpad.tsdk.isolation.junkify.f56709h + 121;
        r12 = r8 % 128;
        r8 = r8 % 2;
        r8 = new com.mypinpad.tsdk.isolation.setZ();
        r12 = com.mypinpad.tsdk.isolation.junkify.f56703b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d9, code lost:
    
        if (r12 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        r13 = r12.length;
        r14 = new char[r13];
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00df, code lost:
    
        if (r15 >= r13) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e3, code lost:
    
        r3 = new java.lang.Object[r4];
        r3[r6] = java.lang.Integer.valueOf(r12[r15]);
        r10 = com.mypinpad.tsdk.isolation.setTextScaleX.setMaxEms;
        r5 = r10.get(1129500232);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f8, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fd, code lost:
    
        r4 = (java.lang.Class) com.mypinpad.tsdk.isolation.setTextScaleX.setX((char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26288), android.view.View.MeasureSpec.getMode(r6) + 64, 1595 - (android.os.Process.myPid() >> 22));
        r5 = (byte) r6;
        r11 = r5;
        r12 = new java.lang.Object[1];
        a(r11, r5, r11, r12);
        r5 = r4.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE);
        r10.put(1129500232, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x014b, code lost:
    
        r14[r15] = ((java.lang.Character) ((java.lang.reflect.Method) r5).invoke(null, r3)).charValue();
        r15 = r15 + 1;
        r12 = r12;
        r4 = 1;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0159, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015c, code lost:
    
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0163, code lost:
    
        r5 = new java.lang.Object[]{java.lang.Integer.valueOf(com.mypinpad.tsdk.isolation.junkify.f56704c)};
        r3 = com.mypinpad.tsdk.isolation.setTextScaleX.setMaxEms;
        r6 = r3.get(1019674483);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0179, code lost:
    
        if (r6 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017c, code lost:
    
        r6 = (java.lang.Class) com.mypinpad.tsdk.isolation.setTextScaleX.setX((char) (10745 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))), 43 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 566 - android.text.TextUtils.getOffsetBefore("", 0));
        r9 = (byte) 0;
        r11 = r9;
        r15 = new java.lang.Object[1];
        a((byte) (r11 + 1), r9, r11, r15);
        r6 = r6.getMethod((java.lang.String) r15[0], java.lang.Integer.TYPE);
        r3.put(1019674483, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01bc, code lost:
    
        r3 = ((java.lang.Integer) ((java.lang.reflect.Method) r6).invoke(null, r5)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01cd, code lost:
    
        if (com.mypinpad.tsdk.isolation.junkify.f56706e == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01cf, code lost:
    
        r5 = r7.length;
        r8.setOnFocusChangeListener = r5;
        r5 = new char[r5];
        r8.setDividerPadding = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d7, code lost:
    
        r6 = r8.setDividerPadding;
        r9 = r8.setOnFocusChangeListener;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01db, code lost:
    
        if (r6 >= r9) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01dd, code lost:
    
        r5[r6] = (char) (r12[r7[(r9 - 1) - r6] + r2] - r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ea, code lost:
    
        r9 = new java.lang.Object[]{r8, r8};
        r6 = com.mypinpad.tsdk.isolation.setTextScaleX.setMaxEms;
        r11 = r6.get(-1539766653);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ff, code lost:
    
        if (r11 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0206, code lost:
    
        r11 = (java.lang.Class) com.mypinpad.tsdk.isolation.setTextScaleX.setX((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) r1, '0', 0, 0) + 1), 51 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2879);
        r14 = (byte) 0;
        r15 = r14;
        r1 = new java.lang.Object[1];
        a((byte) (r15 + 2), r14, r15, r1);
        r11 = r11.getMethod((java.lang.String) r1[0], java.lang.Object.class, java.lang.Object.class);
        r6.put(-1539766653, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0250, code lost:
    
        ((java.lang.reflect.Method) r11).invoke(null, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0256, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0261, code lost:
    
        throw new java.lang.NullPointerException(androidx.camera.camera2.internal.n1.f(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0264, code lost:
    
        if (com.mypinpad.tsdk.isolation.junkify.f56705d == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0267, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0269, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x026a, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.CurrencyKt.setDividerPadding(new java.lang.Object[]{r10}, -1394030873, 1394030873, java.lang.System.identityHashCode(r10))).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026e, code lost:
    
        if (r1 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0270, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0271, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x027b, code lost:
    
        return new kotlin.Pair<>(r0, r8.getSecond());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0283, code lost:
    
        throw new com.mypinpad.tsdk.isolation.getStackTrace(null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.CurrencyKt.setDividerPadding(new java.lang.Object[]{r10}, -1394030873, 1394030873, java.lang.System.identityHashCode(r10))).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r8 = new kotlin.Pair(r10.setX(), kotlin.collections.ArraysKt___ArraysJvmKt.plus(r21, r10.setOnFocusChangeListener(r21)));
        r0 = com.mypinpad.tsdk.isolation.junkify.f56707f + 119;
        com.mypinpad.tsdk.isolation.junkify.f56708g = r0 % 128;
        r0 = r0 % 2;
        r0 = (java.lang.Object[]) r8.getFirst();
        r2 = new java.util.ArrayList(r0.length);
        r7 = r0.length;
        r10 = com.mypinpad.tsdk.isolation.junkify.f56707f + 111;
        com.mypinpad.tsdk.isolation.junkify.f56708g = r10 % 128;
        r10 = r10 % 2;
        r10 = 0;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<byte[][], byte[]> setOnFocusChangeListener(@org.jetbrains.annotations.NotNull byte[] r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.junkify.setOnFocusChangeListener(byte[]):kotlin.Pair");
    }
}
