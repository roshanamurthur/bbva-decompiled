package com.mypinpad.tsdk.isolation;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setSecondaryProgressTintMode;", "", "", "", "setCompoundDrawableTintBlendMode", "()Ljava/util/List;", "<init>", "()V", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setSecondaryProgressTintMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f60530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static char f60532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f60537h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f60538i = 0;

    static {
        b();
        f60535f = 0;
        f60536g = 1;
        f60533d = 0;
        f60534e = 1;
        c();
        ExpandableListView.getPackedPositionGroup(0L);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        INSTANCE = new Companion(null);
        int i10 = f60534e + 105;
        f60533d = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 119 - r7
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.setSecondaryProgressTintMode.f60537h
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L2f
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L2f:
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setSecondaryProgressTintMode.a(int, byte, int, java.lang.Object[]):void");
    }

    public static void b() {
        f60537h = new byte[]{116, 87, -51, 89};
        f60538i = 5;
    }

    public static void c() {
        f60532c = (char) 38368;
        f60530a = -2443367703579691432L;
        f60531b = -461867432;
    }

    @NotNull
    public static List<String> setCompoundDrawableTintBlendMode() throws Throwable {
        ArrayList arrayList;
        int i10;
        int i11;
        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 54659);
        int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1009330522;
        int i13 = f60535f + 81;
        f60536g = i13 % 128;
        int i14 = 2;
        if (i13 % 2 == 0) {
            throw null;
        }
        char[] charArray = "쇵炜\udccc⚐✶ˣ䟧梠⦷䁰ᑐ䱴粂".toCharArray();
        int i15 = f60536g + 25;
        f60535f = i15 % 128;
        int i16 = i15 % 2;
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        char[] charArray3 = "Ꝗ훖菃㯕".toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        int i17 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (maxKeyCode ^ cArr[0]);
        cArr2[2] = (char) (cArr2[2] + ((char) i12));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i18 = f60535f + 73;
            f60536g = i18 % 128;
            int i19 = i18 % i14;
            try {
                Object[] objArr = new Object[1];
                objArr[i17] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                int i20 = f60538i;
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (50678 - KeyEvent.normalizeMetaState(i17)), 38 - TextUtils.lastIndexOf("", '0'), 1737 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b10 = (byte) (-1);
                    Object[] objArr2 = new Object[1];
                    a(b10, (byte) (b10 & 6), (byte) (i20 - 5), objArr2);
                    method = cls.getMethod((String) objArr2[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr)).intValue();
                Object[] objArr3 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (View.resolveSize(0, 0) + 8125), Drawable.resolveOpacity(0, 0) + 37, 646 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    byte b11 = (byte) (-1);
                    byte b12 = (byte) (b11 + 4);
                    Object[] objArr4 = new Object[1];
                    a(b11, b12, (byte) (b12 - 3), objArr4);
                    method2 = cls2.getMethod((String) objArr4[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
                Object[] objArr5 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 'a' - AndroidCharacter.getMirror('0'), 433 - MotionEvent.axisFromString(""));
                    byte b13 = (byte) i20;
                    Object[] objArr6 = new Object[1];
                    a((byte) (-1), b13, (byte) (b13 - 5), objArr6);
                    String str = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                Object[] objArr7 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    i11 = 0;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (4449 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, MotionEvent.axisFromString("") + 1022);
                    byte b14 = (byte) (-1);
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr8 = new Object[1];
                    a(b14, b15, b15, objArr8);
                    i11 = 0;
                    String str2 = (String) objArr8[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str2, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c10 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c10;
                int i21 = uiMessageCallbackKtWhenMappings.setX;
                UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings2 = uiMessageCallbackKtWhenMappings;
                cArr3[i21] = (char) (((((long) (c10 ^ charArray[i21])) ^ (f60530a ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f60531b) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f60532c) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings2.setX = i21 + 1;
                uiMessageCallbackKtWhenMappings = uiMessageCallbackKtWhenMappings2;
                i17 = i11;
                length3 = length3;
                File file = file;
                i14 = 2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        int i22 = i17;
        File[] fileArrListFiles = new File(n1.f(cArr3)).listFiles();
        if (fileArrListFiles == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int length4 = fileArrListFiles.length;
            for (int i23 = i22; i23 < length4; i23++) {
                File file2 = fileArrListFiles[i23];
                if (file2.isFile()) {
                    int i24 = f60534e + 119;
                    f60533d = i24 % 128;
                    int i25 = i24 % 2;
                    i10 = i22;
                } else {
                    int i26 = f60533d + 37;
                    f60534e = i26 % 128;
                    int i27 = i26 % 2;
                    i10 = 1;
                }
                if ((i10 ^ 1) == 0) {
                    arrayList2.add(file2);
                }
            }
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                int i28 = f60533d + 65;
                f60534e = i28 % 128;
                int i29 = i28 % 2;
                arrayList.add(((File) it.next()).getCanonicalPath());
                int i30 = f60534e + 99;
                f60533d = i30 % 128;
                int i31 = i30 % 2;
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }
}
