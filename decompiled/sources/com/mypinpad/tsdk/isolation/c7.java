package com.mypinpad.tsdk.isolation;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class c7 extends FunctionReferenceImpl implements Function3<Integer, String, Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char f54776p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char f54777q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char f54778r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final char f54779s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54780t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54781u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54782w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f54783x0 = null;

    static {
        c();
        v0 = 0;
        f54782w0 = 1;
        f54780t0 = 0;
        f54781u0 = 1;
        f54779s0 = (char) 46771;
        f54778r0 = (char) 55238;
        f54776p0 = (char) 16456;
        f54777q0 = (char) 40132;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c7(pd pdVar) throws Throwable {
        Object[] objArr = new Object[1];
        a("贞\u0fea熘∌蕗ⵢ瞕\ue183钶ㄔ숢⑈", View.resolveSize(0, 0) + 11, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("贞\u0fea熘∌蕗ⵢ瞕\ue183钶ㄔ⢸჻ꄫ葠\ue32f띵愸ण\uf370\uf655ᢑ萌ㅝ웉荗ी㽓辒찑椔쯯⭚\ue32f띵愸ण\uf370\uf655ᢑ萌ㅝ웉뼪㖙郁ᦽ\uf407툜碞㉥䓵갣䧆事", 53 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
        super(3, pdVar, pd.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        int i12 = 2;
        char[] cArr2 = new char[2];
        int i13 = f54782w0 + 123;
        v0 = i13 % 128;
        int i14 = i13 % 2;
        while (true) {
            int i15 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i15 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i16 = v0 + 117;
            f54782w0 = i16 % 128;
            int i17 = 58224;
            if (i16 % i12 == 0) {
                cArr2[1] = charArray[i15];
                cArr2[0] = charArray[i15 + 1];
            } else {
                cArr2[0] = charArray[i15];
                cArr2[1] = charArray[i15 + 1];
            }
            int i18 = 0;
            while (i18 < 16) {
                char c10 = cArr2[1];
                char c11 = cArr2[0];
                int i19 = (c11 + i17) ^ ((c11 << 4) + ((char) (((long) f54778r0) ^ 4333817592127744003L)));
                int i20 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f54779s0);
                    objArr2[i12] = Integer.valueOf(i20);
                    objArr2[1] = Integer.valueOf(i19);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Gravity.getAbsoluteGravity(0, 0) + 48534), KeyEvent.normalizeMetaState(0) + 47, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2672);
                        byte b10 = (byte) 1;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) f54776p0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f54777q0)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48535 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 46 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2672 - View.resolveSize(0, 0));
                        byte b12 = (byte) 1;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, b13, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i17 -= 40503;
                    i18++;
                    int i21 = f54782w0 + 91;
                    v0 = i21 % 128;
                    int i22 = i21 % 2;
                    i12 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i23 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i23] = cArr2[0];
            cArr[i23 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 38, 2145 - (ViewConfiguration.getTapTimeout() >> 16));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, b15, objArr7);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i12 = i11;
        }
    }

    public static void b(byte b10, int i10, short s4, Object[] objArr) {
        int i11 = 105 - (b10 * 2);
        int i12 = s4 * 4;
        int i13 = 3 - (i10 * 4);
        byte[] bArr = new byte[i12 + 1];
        int i14 = -1;
        byte[] bArr2 = f54783x0;
        if (bArr2 == null) {
            i11 += i12;
            i12 = i12;
            objArr = objArr;
            bArr = bArr;
            i14 = -1;
            bArr2 = bArr2;
        }
        while (true) {
            int i15 = i14 + 1;
            i13++;
            bArr[i15] = (byte) i11;
            if (i15 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            Object[] objArr2 = objArr;
            int i16 = i12;
            byte[] bArr3 = bArr2;
            byte[] bArr4 = bArr;
            i11 += bArr2[i13];
            i12 = i16;
            objArr = objArr2;
            bArr = bArr4;
            i14 = i15;
            bArr2 = bArr3;
        }
    }

    public static void c() {
        f54783x0 = new byte[]{59, -77, 103, 16};
    }

    public final void d(int i10, @Nullable String str, @Nullable Throwable th2) {
        int i11 = f54780t0 + 115;
        f54781u0 = i11 % 128;
        if (i11 % 2 == 0) {
            pd.setOnFocusChangeListener(new Object[]{(pd) this.receiver, Integer.valueOf(i10), str, th2}, 691581619, -691581616, i10);
            throw null;
        }
        pd.setOnFocusChangeListener(new Object[]{(pd) this.receiver, Integer.valueOf(i10), str, th2}, 691581619, -691581616, i10);
        int i12 = f54781u0 + 85;
        f54780t0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(Integer num, String str, Throwable th2) {
        int i10 = f54781u0 + 91;
        f54780t0 = i10 % 128;
        int i11 = i10 % 2;
        d(num.intValue(), str, th2);
        if (i11 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i12 = f54781u0 + 1;
        f54780t0 = i12 % 128;
        if (i12 % 2 == 0) {
            return unit2;
        }
        throw null;
    }
}
