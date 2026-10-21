package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class pi extends pf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final char[] f57707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f57708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f57709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f57710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f57711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f57712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f57713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f57714u = null;

    @NotNull
    public final UUID m;

    static {
        b();
        f57712s = 0;
        f57713t = 1;
        f57711r = 1;
        f57709p = true;
        f57710q = true;
        f57708o = 1794962057;
        f57707n = new char[]{62201, 61979, 61974, 62186, 62188, 61978, 61968, 61975, 62190, 62205, 62184, 61981, 62156, 61983, 62164, 62202, 62157, 62194, 62168, 62167, 62169};
    }

    public pi(@NotNull UUID uuid) throws Throwable {
        String str = "";
        Intrinsics.checkNotNullParameter(uuid, "");
        int i10 = 0;
        int iResolveSize = View.resolveSize(0, 0) + 127;
        int i11 = f57713t + 83;
        f57712s = i11 % 128;
        int i12 = i11 % 2;
        byte[] bytes = "\u0095\u0094\u0093\u008f\u0092\u0091\u0090\u008a\u008f\u008c\u0088\u0085\u008e\u008d\u0088\u0083\u0087\u008c\u0084\u008b\u0086\u0088\u008b\u0082\u008a\u0089\u0088\u0087\u0086\u0086\u0085\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
        setZ setz = new setZ();
        int i13 = 1;
        float f6 = 0.0f;
        char[] cArr = f57707n;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr = new Object[i13];
                    objArr[i10] = Integer.valueOf(cArr[i14]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (26288 - TextUtils.getCapsMode(str, i10, i10)), Color.argb(i10, i10, i10, i10) + 64, (AudioTrack.getMinVolume() > f6 ? 1 : (AudioTrack.getMinVolume() == f6 ? 0 : -1)) + 1595);
                        byte b10 = (byte) i10;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        c(b10, b11, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i14++;
                    str = str;
                    i10 = 0;
                    i13 = 1;
                    f6 = 0.0f;
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
        Object[] objArr3 = {Integer.valueOf(f57708o)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (10744 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42, 566 - (Process.myPid() >> 22));
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr4 = new Object[1];
            c(b12, b13, (byte) (b13 + 1), objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (!f57710q) {
            if (!f57709p) {
                throw null;
            }
            int i15 = f57712s + 119;
            f57713t = i15 % 128;
            int i16 = i15 % 2;
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i17 = setz.setDividerPadding;
            int i18 = setz.setOnFocusChangeListener;
            if (i17 >= i18) {
                super(null, n1.f(cArr3), null, 0L, 13, null);
                this.m = uuid;
                return;
            }
            cArr3[i17] = (char) (cArr[bytes[(i18 - 1) - i17] + iResolveSize] - iIntValue);
            Object[] objArr5 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 51, 2880 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr6 = new Object[1];
                c(b14, b15, (byte) (b15 + 2), objArr6);
                method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr5);
        }
    }

    public static void b() {
        f57714u = new byte[]{115, MessageUtils.MESSAGE_30_RS, -113, MessageUtils.MESSAGE_21_NAK};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r8 = r8 * 2
            int r8 = r8 + 118
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.pi.f57714u
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L30
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L1c:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r7 = r7 + 1
            int r6 = r6 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pi.c(byte, byte, byte, java.lang.Object[]):void");
    }

    @NotNull
    public final UUID setX() {
        int i10 = f57711r;
        int i11 = i10 + 49;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        int i14 = i10 + 7;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        return this.m;
    }
}
