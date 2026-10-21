package com.mypinpad.tsdk.isolation;

import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setIndeterminateTintList {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f59883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f59884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f59887f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f59888a;

    static {
        b();
        f59885d = 0;
        f59886e = 1;
        f59884c = (char) 53954;
        f59883b = new char[]{53952, 59193, 53955, 59140, 59199, 59198, 59189, 59194, 59191};
    }

    public setIndeterminateTintList(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f59888a = context;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 + 99
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.setIndeterminateTintList.f59887f
            if (r2 != 0) goto L17
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L33
        L17:
            r3 = r1
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r9
            r9 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L33:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setIndeterminateTintList.a(int, short, int, java.lang.Object[]):void");
    }

    public static void b() {
        f59887f = new byte[]{85, 2, -89, 93};
    }

    public final boolean setOnFocusChangeListener() throws Throwable {
        ContentResolver contentResolver;
        int i10;
        char c10;
        ContentResolver contentResolver2 = this.f59888a.getContentResolver();
        int i11 = 0;
        int iIndexOf = TextUtils.indexOf("", "", 0, 0);
        int i12 = 11 - iIndexOf;
        char longPressTimeout = (byte) (78 - (ViewConfiguration.getLongPressTimeout() >> 16));
        int i13 = f59886e + 25;
        int i14 = i13 % 128;
        f59885d = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 117;
        f59886e = i16 % 128;
        if (i16 % 2 == 0) {
            "\u0001\u0007\u0000\u0004\u0003\b\u0001\u0004\u0002\b㙌".toCharArray();
            throw null;
        }
        char[] charArray = "\u0001\u0007\u0000\u0004\u0003\b\u0001\u0004\u0002\b㙌".toCharArray();
        int i17 = f59885d + 105;
        f59886e = i17 % 128;
        int i18 = i17 % 2;
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f59883b;
        int i19 = 1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i20 = f59885d + 5;
            f59886e = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (i22 < length) {
                try {
                    Object[] objArr = new Object[i19];
                    objArr[i11] = Integer.valueOf(cArr[i22]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(290255894);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionGroup(0L), 45 - TextUtils.getOffsetAfter("", i11), 1116 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i22] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i22++;
                    length = length;
                    cArr = cArr;
                    contentResolver2 = contentResolver2;
                    i11 = 0;
                    i19 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            contentResolver = contentResolver2;
            cArr = cArr2;
        } else {
            contentResolver = contentResolver2;
        }
        Object[] objArr3 = {Integer.valueOf(f59884c)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", ""), TextUtils.lastIndexOf("", '0', 0) + 46, 1116 - KeyEvent.keyCodeFromString(""));
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr4 = new Object[1];
            a(b12, b13, b13, objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i12];
        char c11 = '\n';
        if (i12 % 2 != 0) {
            i10 = 10 - iIndexOf;
            cArr3[i10] = (char) (charArray[i10] - longPressTimeout);
        } else {
            i10 = i12;
        }
        if (i10 > 1) {
            int i23 = f59886e + 93;
            f59885d = i23 % 128;
            int i24 = i23 % 2;
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i25 = setincludefontpadding.setDividerPadding;
                if (i25 >= i10) {
                    break;
                }
                char c12 = charArray[i25];
                setincludefontpadding.setY = c12;
                int i26 = i25 + 1;
                char c13 = charArray[i26];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c13;
                if (c12 == c13) {
                    int i27 = f59885d + 9;
                    f59886e = i27 % 128;
                    int i28 = i27 % 2;
                    cArr3[i25] = (char) (c12 - longPressTimeout);
                    cArr3[i26] = (char) (c13 - longPressTimeout);
                    i10 = i10;
                    c10 = c11;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = setincludefontpadding;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[c11] = setincludefontpadding;
                    objArr5[9] = setincludefontpadding;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = setincludefontpadding;
                    objArr5[6] = setincludefontpadding;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = setincludefontpadding;
                    objArr5[3] = setincludefontpadding;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = setincludefontpadding;
                    objArr5[0] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0), Gravity.getAbsoluteGravity(0, 0) + 27, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2310);
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 + 3);
                        Object[] objArr6 = new Object[1];
                        a(b14, b15, (byte) (b15 - 3), objArr6);
                        String str = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                    int i29 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i29) {
                        Object[] objArr7 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 != null) {
                            c10 = '\n';
                        } else {
                            Class cls5 = (Class) setTextScaleX.setX((char) (MotionEvent.axisFromString("") + 49104), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 34, MotionEvent.axisFromString("") + 2546);
                            byte b16 = (byte) 0;
                            Object[] objArr8 = new Object[1];
                            a(b16, (byte) (b16 | 7), b16, objArr8);
                            String str2 = (String) objArr8[0];
                            Class<?> cls6 = Integer.TYPE;
                            c10 = '\n';
                            method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                        int i30 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i31 = setincludefontpadding.setDividerPadding;
                        cArr3[i31] = cArr[iIntValue2];
                        cArr3[i31 + 1] = cArr[i30];
                    } else {
                        c10 = '\n';
                        int i32 = setincludefontpadding.setX;
                        int i33 = setincludefontpadding.setOnFocusChangeListener;
                        if (i32 == i33) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i29, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i34 = (i33 * cCharValue) + iA2;
                            int i35 = setincludefontpadding.setDividerPadding;
                            cArr3[i35] = cArr[(i32 * cCharValue) + iA];
                            cArr3[i35 + 1] = cArr[i34];
                        } else {
                            int i36 = (i32 * cCharValue) + i29;
                            int i37 = (i33 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i38 = setincludefontpadding.setDividerPadding;
                            cArr3[i38] = cArr[i36];
                            cArr3[i38 + 1] = cArr[i37];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                c11 = c10;
                i10 = i10;
            }
        }
        int i39 = f59886e + 99;
        f59885d = i39 % 128;
        int i40 = i39 % 2;
        for (int i41 = 0; i41 < i12; i41++) {
            cArr3[i41] = (char) (cArr3[i41] ^ 13722);
        }
        String str3 = new String(cArr3);
        int i42 = f59885d + 73;
        f59886e = i42 % 128;
        if (i42 % 2 != 0) {
            return Settings.Global.getInt(contentResolver, str3.intern(), 0) != 0;
        }
        throw null;
    }
}
