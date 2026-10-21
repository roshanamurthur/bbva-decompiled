package com.mypinpad.tsdk.isolation;

import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setFilterText implements getPinPadConfiguration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f59681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f59682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f59683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f59684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f59686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f59687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f59688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f59689j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f59690a = new LinkedHashMap();

    static {
        c();
        f59687h = 0;
        f59688i = 1;
        f59685f = 0;
        f59686g = 1;
        f59684e = (char) 41121;
        f59683d = (char) 34247;
        f59681b = (char) 63183;
        f59682c = (char) 53017;
    }

    public static void a(int i10, Object[] objArr) throws Throwable {
        int i11 = f59687h;
        int i12 = i11 + 37;
        f59688i = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 + 75;
        f59688i = i14 % 128;
        int i15 = i14 % 2;
        char[] charArray = "ꕍ隧䇼厜룫䞞\u1cbb叠\uec49灑뎘똲익쫇룫䞞绩ᩫ뎘똲∺鵌鹘夯须祜雀蛞ࣁ者ा爪蘳䥡\uf05e꺣䀠캀蜓띤\ue82e▰䐉ꊅ뢓᭚譍뼩".toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i16 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i17 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i17 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[i16] = charArray[i17];
            cArr2[1] = charArray[i17 + 1];
            int i18 = 58224;
            int i19 = i16;
            while (i19 < 16) {
                char c10 = cArr2[1];
                char c11 = cArr2[i16];
                char[] cArr3 = cArr2;
                try {
                    Object[] objArr2 = {Integer.valueOf(c10), Integer.valueOf((c11 + i18) ^ ((c11 << 4) + ((char) (((long) f59683d) ^ 4333817592127744003L)))), Integer.valueOf(c11 >>> 5), Integer.valueOf(f59684e)};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 48534), 48 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2672 - Drawable.resolveOpacity(0, 0));
                        byte b10 = (byte) 1;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        String str = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) f59681b) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f59682c)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48534 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 47 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2672 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        byte b12 = (byte) 1;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, b13, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str2, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 -= 40503;
                    i19++;
                    cArr2 = cArr3;
                    i16 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr2;
            int i20 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i20] = cArr4[0];
            cArr[i20 + 1] = cArr4[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2145);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, b15, objArr7);
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            int i21 = f59688i + 5;
            f59687h = i21 % 128;
            int i22 = i21 % 2;
            cArr2 = cArr4;
            i16 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 4
            int r0 = 1 - r9
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 105 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r9 = 0 - r9
            byte[] r2 = com.mypinpad.tsdk.isolation.setFilterText.f59689j
            if (r2 != 0) goto L1c
            r7 = r8
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            goto L3b
        L1c:
            r3 = r1
        L1d:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r9) goto L2d
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2d:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r6
        L3b:
            int r9 = -r9
            int r8 = r8 + 1
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setFilterText.b(int, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f59689j = new byte[]{37, 60, 72, GenerateAcResponseApdu.DDA_HEADER};
    }

    public final <T> void d(Class<T> cls) throws setNavigationIcon {
        int i10 = f59686g + 67;
        f59685f = i10 % 128;
        int i11 = i10 % 2;
        LinkedHashMap linkedHashMap = this.f59690a;
        if (i11 != 0) {
            linkedHashMap.containsKey(cls);
            throw null;
        }
        if (linkedHashMap.containsKey(cls)) {
            throw new setNavigationIcon();
        }
        int i12 = f59685f + 57;
        f59686g = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.getPinPadConfiguration
    public final synchronized <T> T setOnFocusChangeListener(@NotNull Class<T> cls, @NotNull Function0<? extends T> function0) {
        T tInvoke;
        try {
            int i10 = f59686g + 21;
            f59685f = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(cls, "");
                    Intrinsics.checkNotNullParameter(function0, "");
                    d(cls);
                    tInvoke = function0.invoke();
                    int i11 = 87 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(cls, "");
                    Intrinsics.checkNotNullParameter(function0, "");
                    d(cls);
                    tInvoke = function0.invoke();
                }
                int i12 = f59685f + 41;
                f59686g = i12 % 128;
                int i13 = i12 % 2;
                LinkedHashMap linkedHashMap = this.f59690a;
                if (tInvoke == null) {
                    Object[] objArr = new Object[1];
                    a((ViewConfiguration.getJumpTapTimeout() >> 16) + 47, objArr);
                    throw new NullPointerException(((String) objArr[0]).intern());
                }
                linkedHashMap.put(cls, tInvoke);
            } catch (Exception e5) {
                throw new setSoundEffectsEnabled(e5);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return tInvoke;
    }

    @Override // com.mypinpad.tsdk.isolation.getPinPadConfiguration
    public final synchronized <T> T setX(@NotNull Class<T> cls) {
        T t10;
        try {
            int i10 = f59685f + 33;
            f59686g = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(cls, "");
            t10 = (T) this.f59690a.get(cls);
            if (t10 == null) {
                throw new init();
            }
            int i12 = f59685f + 77;
            f59686g = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return t10;
    }

    @Override // com.mypinpad.tsdk.isolation.getPinPadConfiguration
    @Nullable
    public final synchronized <T> T setOnFocusChangeListener(@NotNull Class<T> cls) {
        T t10;
        int i10 = f59686g + 51;
        f59685f = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cls, "");
            this.f59690a.get(cls);
            throw null;
        }
        Intrinsics.checkNotNullParameter(cls, "");
        t10 = (T) this.f59690a.get(cls);
        int i11 = f59685f + 9;
        f59686g = i11 % 128;
        int i12 = i11 % 2;
        return t10;
    }
}
