package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setIndeterminateDrawableTiled {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f59867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f59868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f59869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f59870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f59871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f59872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f59873j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f59874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f59876c;

    static {
        c();
        f59872i = 1;
        f59870g = 0;
        f59871h = 1;
        f59869f = (char) 51266;
        f59867d = -2443367703579691432L;
        f59868e = -461867432;
    }

    public setIndeterminateDrawableTiled(@NotNull String str, int i10, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f59874a = str;
        this.f59875b = i10;
        this.f59876c = str2;
    }

    public static void a(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char c11;
        int i11 = f59872i;
        int i12 = i11 + 77;
        int i13 = i12 % 128;
        int i14 = i12 % 2;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        char[] charArray3 = str.toCharArray();
        int i15 = i11 + 61;
        int i16 = i15 % 128;
        int i17 = i15 % 2;
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        int i18 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i18] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (50677 - TextUtils.lastIndexOf("", '0')), 40 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 1738);
                    byte b10 = (byte) i18;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b11, b11, b10, objArr3);
                    String str3 = (String) objArr3[i18];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i18] = Object.class;
                    method = cls.getMethod(str3, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i18] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8124), 37 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 646);
                    byte b12 = (byte) 3;
                    byte b13 = (byte) (b12 - 3);
                    Object[] objArr5 = new Object[1];
                    b(b13, b13, b12, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) Color.blue(0), 49 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 434 - Color.argb(0, 0, 0, 0));
                    byte b14 = (byte) 1;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    b(b15, b15, b14, objArr7);
                    String str4 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str4, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    c11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 4450), (-16777174) - Color.rgb(0, 0, 0), 1020 - TextUtils.lastIndexOf("", '0', 0, 0));
                    byte b16 = (byte) 0;
                    Object[] objArr9 = new Object[1];
                    b(b16, b16, (byte) 6, objArr9);
                    String str5 = (String) objArr9[0];
                    c11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str5, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c12 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c12;
                int i19 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i19] = (char) (((((long) (c12 ^ charArray[i19])) ^ (f59867d ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f59868e) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f59869f) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i19 + 1;
                length3 = length3;
                i18 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r9 = r9 + 113
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.setIndeterminateDrawableTiled.f59873j
            if (r2 != 0) goto L19
            r9 = r8
            r4 = r1
            r3 = r2
            r8 = r7
            r2 = r0
            r0 = r10
            r10 = r9
            goto L32
        L19:
            r3 = r1
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L29:
            r3 = r2[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L32:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r8 + 1
            r8 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setIndeterminateDrawableTiled.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f59873j = new byte[]{92, -124, 49, 72};
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        int i10 = f59870g + 95;
        int i11 = i10 % 128;
        f59871h = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 57;
        f59870g = i13 % 128;
        int i14 = i13 % 2;
        return this.f59874a;
    }

    public final int setDividerPadding() {
        int i10 = f59870g + 69;
        int i11 = i10 % 128;
        f59871h = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 119;
        f59870g = i13 % 128;
        int i14 = i13 % 2;
        return this.f59875b;
    }

    @NotNull
    public final String setY() {
        int i10 = f59870g;
        int i11 = i10 + 43;
        f59871h = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 77;
        f59871h = i13 % 128;
        if (i13 % 2 != 0) {
            return this.f59876c;
        }
        throw null;
    }

    @NotNull
    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) TextUtils.getTrimmedLength(""), "ᴝ\ue7ad⩭加", Color.green(0) + 1843899677, "㖧捄\ue425\udc66淿\uf799픩", objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(this.f59874a);
        Object[] objArr2 = new Object[1];
        a((char) (44500 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "뛜魉퍳\u19ad", 1939556790 - (ViewConfiguration.getEdgeSlop() >> 16), "ぷ㠣ᒦ瑲䉁", objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(this.f59875b);
        Object[] objArr3 = new Object[1];
        a((char) ((-16768137) - Color.rgb(0, 0, 0)), "⠺Ч矅줣", (-989583577) - TextUtils.lastIndexOf("", '0', 0), "짴꣥\ue28a某\uf195", objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append(this.f59876c);
        Object[] objArr4 = new Object[1];
        a((char) (TextUtils.indexOf("", "", 0) + 11159), "苧ʵ音栫", ViewConfiguration.getScrollBarFadeDuration() >> 16, "芊進", objArr4);
        sb2.append(((String) objArr4[0]).intern());
        String string = sb2.toString();
        int i10 = f59871h + 85;
        f59870g = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }
}
