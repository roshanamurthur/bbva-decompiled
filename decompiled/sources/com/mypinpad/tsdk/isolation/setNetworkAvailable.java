package com.mypinpad.tsdk.isolation;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setNetworkAvailable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Regex f60160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f60161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static char f60163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f60164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f60165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f60166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f60167h = null;

    static {
        char[] charArray;
        boolean z10;
        int i10;
        b();
        int i11 = 0;
        f60165f = 0;
        int i12 = 1;
        f60166g = 1;
        f60164e = 1;
        c();
        char c10 = (char) (64732 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
        String str = "";
        int iIndexOf = TextUtils.indexOf("", "", 0, 0);
        int i13 = f60165f + 71;
        f60166g = i13 % 128;
        int i14 = i13 % 2;
        char[] charArray2 = "䓧떯".toCharArray();
        int i15 = f60165f + 19;
        f60166g = i15 % 128;
        if (i15 % 2 == 0) {
            charArray = "\u0000\u0000\u0000\u0000".toCharArray();
            int i16 = 63 / 0;
        } else {
            charArray = "\u0000\u0000\u0000\u0000".toCharArray();
        }
        char[] charArray3 = "臐⩬\udc7c껼".toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (c10 ^ cArr[0]);
        cArr2[2] = (char) (cArr2[2] + ((char) iIndexOf));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            try {
                Object[] objArr = new Object[i12];
                objArr[i11] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (50677 - Process.getGidForName(str)), 38 - ((byte) KeyEvent.getModifierMetaStateMask()), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1736);
                    byte b10 = (byte) i11;
                    byte b11 = b10;
                    Object[] objArr2 = new Object[i12];
                    a(b10, b11, b11, objArr2);
                    String str2 = (String) objArr2[0];
                    Class<?>[] clsArr = new Class[i12];
                    clsArr[0] = Object.class;
                    method = cls.getMethod(str2, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr)).intValue();
                Object[] objArr3 = new Object[i12];
                objArr3[0] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 != null) {
                    z10 = false;
                } else {
                    z10 = false;
                    Class cls2 = (Class) setTextScaleX.setX((char) (8126 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 36 - TextUtils.lastIndexOf(str, '0'), View.resolveSize(0, 0) + 646);
                    byte b12 = (byte) 3;
                    byte b13 = (byte) (b12 - 3);
                    Object[] objArr4 = new Object[1];
                    a(b12, b13, b13, objArr4);
                    method2 = cls2.getMethod((String) objArr4[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
                Object[] objArr5 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 49 - View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf(str, '0', 0) + 435);
                    byte b14 = (byte) 1;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr6 = new Object[1];
                    a(b14, b15, b15, objArr6);
                    String str3 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str3, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                Object[] objArr7 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    i10 = 0;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ImageFormat.getBitsPerPixel(0) + 4450), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, AndroidCharacter.getMirror('0') + 973);
                    i10 = 0;
                    byte b16 = (byte) 0;
                    Object[] objArr8 = new Object[1];
                    a((byte) 6, b16, b16, objArr8);
                    String str4 = (String) objArr8[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str4, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i17 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i17] = (char) (((((long) (c11 ^ charArray2[i17])) ^ (f60161b ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f60162c) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f60163d) ^ (-2443367703579691432L)))));
                i12 = 1;
                uiMessageCallbackKtWhenMappings.setX = i17 + 1;
                i11 = i10;
                length3 = length3;
                str = str;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str5 = new String(cArr3);
        int i18 = f60166g + 19;
        f60165f = i18 % 128;
        int i19 = i18 % 2;
        f60160a = new Regex(str5.intern());
        int i20 = f60164e + 15;
        int i21 = i20 % 128;
        int i22 = i20 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r6 = r6 + 113
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.setNetworkAvailable.f60167h
            if (r2 != 0) goto L17
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L36
        L17:
            r3 = r1
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2c:
            r4 = r2[r7]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L36:
            int r6 = -r6
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setNetworkAvailable.a(int, int, int, java.lang.Object[]):void");
    }

    public static void b() {
        f60167h = new byte[]{59, 125, 28, -9};
    }

    public static void c() {
        f60163d = (char) 30296;
        f60161b = -2443367703579691432L;
        f60162c = 645587190;
    }

    @NotNull
    public static final Regex setY() {
        int i10 = f60164e;
        int i11 = i10 + 15;
        int i12 = i11 % 128;
        if (i11 % 2 != 0) {
            int i13 = 60 / 0;
        }
        int i14 = i10 + 29;
        int i15 = i14 % 128;
        if (i14 % 2 == 0) {
            return f60160a;
        }
        throw null;
    }
}
