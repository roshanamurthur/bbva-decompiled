package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnGroupCollapseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f60234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f60235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f60237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f60238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f60243j = null;

    static {
        d();
        f60241h = 0;
        f60242i = 1;
        f60239f = 0;
        f60240g = 1;
        f60234a = 3853634833965369877L;
        f60237d = true;
        f60238e = true;
        f60236c = 1794962058;
        f60235b = new char[]{62157, 62177, 62206, 62194, 62137, 62132, 62204, 61969, 62189, 62190, 61973, 61976, 61971, 62122, 61968, 61980, 61979, 61977, 61978, 61982, 62159, 61974, 61953, 62191, 62188, 61983, 62169, 61957, 61972, 61952, 62168, 62207, 62202};
    }

    public setOnGroupCollapseListener(@NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f5  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        char[] charArray = str.toCharArray();
        int i11 = f60242i + 121;
        f60241h = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i14 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i14 >= charArray.length) {
                break;
            }
            int i15 = f60241h + 89;
            f60242i = i15 % 128;
            int i16 = i15 % i12;
            char c10 = charArray[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[i12] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c10);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 33, (Process.myPid() >> 22) + 1195);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b10, (byte) (b11 + 3), b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f60234a ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), Color.blue(0) + 44, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b12, b13, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i12 = 2;
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
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        int i17 = f60242i + 53;
        f60241h = i17 % 128;
        int i18 = i17 % 2;
        while (true) {
            int i19 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i19 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i20 = f60241h + 5;
            f60242i = i20 % 128;
            if (i20 % 2 == 0) {
                cArr[i19] = (char) jArr[i19];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myTid() >> 22) + 44, 727 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    c(b14, b15, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                throw null;
            }
            cArr[i19] = (char) jArr[i19];
            Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
            Map map3 = setTextScaleX.setMaxEms;
            Object method4 = map3.get(645183118);
            if (method4 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 728 - View.MeasureSpec.getMode(0));
                byte b16 = (byte) 0;
                byte b17 = b16;
                Object[] objArr9 = new Object[1];
                c(b16, b17, b17, objArr9);
                method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map3.put(645183118, method4);
            }
            ((Method) method4).invoke(null, objArr8);
        }
    }

    public static void b(int i10, String str, Object[] objArr) throws Throwable {
        int i11 = f60242i + 23;
        f60241h = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = f60235b;
        if (cArr != null) {
            int i14 = f60241h + 63;
            f60242i = i14 % 128;
            int i15 = i14 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                int i17 = f60242i + 9;
                f60241h = i17 % 128;
                int i18 = i17 % i12;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i16])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Color.alpha(0) + 26288), 65 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1595 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        c(b10, (byte) (b11 | 11), b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16++;
                    i12 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f60236c)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (10744 - View.MeasureSpec.getSize(0)), TextUtils.indexOf("", "", 0, 0) + 43, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 566);
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr5 = new Object[1];
            c(b12, (byte) (b13 | 13), b13, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!f60238e) {
            if (!f60237d) {
                throw null;
            }
            throw null;
        }
        int i19 = f60241h + 105;
        f60242i = i19 % 128;
        int i20 = i19 % 2;
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i21 = setz.setDividerPadding;
            int i22 = setz.setOnFocusChangeListener;
            if (i21 >= i22) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i21] = (char) (cArr[bytes[(i22 - 1) - i21] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (KeyEvent.getMaxKeyCode() >> 16), 51 - KeyEvent.keyCodeFromString(""), 2928 - AndroidCharacter.getMirror('0'));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                c(b14, (byte) (b15 | 15), b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 107
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r0 = new byte[r6]
            byte[] r1 = com.mypinpad.tsdk.isolation.setOnGroupCollapseListener.f60243j
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L36
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r4 = r1[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setOnGroupCollapseListener.c(byte, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f60243j = new byte[]{115, MessageUtils.MESSAGE_30_RS, -113, MessageUtils.MESSAGE_21_NAK};
    }

    @NotNull
    public final byte[] setDividerPadding(@NotNull InetAddress inetAddress, int i10) throws Throwable {
        Intrinsics.checkNotNullParameter(inetAddress, "");
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("⧁呧틽兆\udfdd婣", 32141 - Color.red(0), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(inetAddress);
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(i10);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb2.toString()}, -1422891482, 1422891482, (int) System.currentTimeMillis());
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(inetAddress, i10), 20);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(socket, null);
                int i11 = f60239f + 77;
                int i12 = i11 % 128;
                f60240g = i12;
                int i13 = i11 % 2;
                int i14 = i12 + 55;
                f60239f = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
                try {
                    Socket socket2 = new Socket(inetAddress, i10);
                    try {
                        StringBuilder sb3 = new StringBuilder();
                        Object[] objArr2 = new Object[1];
                        a("⧕㑇ኅ烓強뵿鮯念쑾⊯Ñ漬䴶ꮈ觕鑯\uf2ba킅㼨ᵸ篮妡", TextUtils.indexOf("", "") + 7607, objArr2);
                        sb3.append(((String) objArr2[0]).intern());
                        sb3.append(inetAddress);
                        sb3.append(AbstractJsonLexerKt.COLON);
                        sb3.append(i10);
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb3.toString()}, -1422891482, 1422891482, (int) System.currentTimeMillis());
                        OutputStream outputStream = socket2.getOutputStream();
                        outputStream.write(0);
                        Object[] objArr3 = new Object[1];
                        b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, "\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                        String strIntern = ((String) objArr3[0]).intern();
                        Charset charset = StandardCharsets.US_ASCII;
                        Intrinsics.checkNotNullExpressionValue(charset, "");
                        byte[] bytes = strIntern.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes, "");
                        outputStream.write(bytes);
                        outputStream.flush();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
                        try {
                            socket2.setSoTimeout(10);
                            Object[] objArr4 = new Object[1];
                            b(127 - Color.argb(0, 0, 0, 0), "\u008e\u0094\u0090\u0091\u0093\u008e\u0092\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087", objArr4);
                            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(((String) objArr4[0]).intern(), Integer.valueOf(i10))}, -1422891482, 1422891482, (int) System.currentTimeMillis());
                            String str = (String) setSingleLine.setX(new Object[]{bufferedReader, 128}, 265914503, -265914498, 128);
                            StringBuilder sb4 = new StringBuilder();
                            Object[] objArr5 = new Object[1];
                            b((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, "\u008e\u0088\u0094\u0088\u0096\u0093\u0092\u0091\u0095\u008e\u008a\u0089\u0088\u0087", objArr5);
                            sb4.append(((String) objArr5[0]).intern());
                            sb4.append(i10);
                            sb4.append('|');
                            sb4.append(str);
                            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb4.toString()}, -1689942959, 1689942969, (int) System.currentTimeMillis());
                            Charset charset2 = Charsets.UTF_8;
                            if (str == null) {
                                Object[] objArr6 = new Object[1];
                                b(127 - ExpandableListView.getPackedPositionType(0L), "\u008d\u008c\u008b\u0090\u0094 \u009f\u008d\u008c\u0089\u0096\u009f\u0089\u009e\u0089\u009d\u008e\u0088\u0093\u009c\u0094\u008e\u0096\u0096\u0097\u008c\u009b\u008c\u0091\u008c\u008e\u0091\u0094\u008e\u0094\u009a\u0089\u0098\u008e\u0088\u0099\u008e\u0094\u0091\u008c\u008c\u0089\u0098\u008e\u0096\u0096\u0097\u008c", objArr6);
                                throw new NullPointerException(((String) objArr6[0]).intern());
                            }
                            byte[] bytes2 = str.getBytes(charset2);
                            Intrinsics.checkNotNullExpressionValue(bytes2, "");
                            CloseableKt.closeFinally(bufferedReader, null);
                            CloseableKt.closeFinally(socket2, null);
                            int i15 = f60240g + 29;
                            f60239f = i15 % 128;
                            int i16 = i15 % 2;
                            return bytes2;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(bufferedReader, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            CloseableKt.closeFinally(socket2, th4);
                            throw th5;
                        }
                    }
                } catch (IOException e5) {
                    StringBuilder sb5 = new StringBuilder();
                    Object[] objArr7 = new Object[1];
                    b(128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u008e\u0094\u0090\u0091¡", objArr7);
                    sb5.append(((String) objArr7[0]).intern());
                    sb5.append(i10);
                    sb5.append(' ');
                    sb5.append((Object) e5.getMessage());
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb5.toString()}, 1673747418, -1673747410, (int) System.currentTimeMillis());
                    return new byte[0];
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    CloseableKt.closeFinally(socket, th6);
                    throw th7;
                }
            }
        } catch (IOException unused) {
            return new byte[0];
        }
    }
}
