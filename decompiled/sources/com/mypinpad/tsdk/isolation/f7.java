package com.mypinpad.tsdk.isolation;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f7 extends FunctionReferenceImpl implements Function3<setHorizontalScrollbarOverlay, String, Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final long f55493p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55494q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55495r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f55496s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final byte[] f55497t0 = null;

    static {
        c();
        f55496s0 = 1;
        f55494q0 = 0;
        f55495r0 = 1;
        f55493p0 = -390022075155928940L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f7(ss ssVar) throws Throwable {
        Object[] objArr = new Object[1];
        a("쭧좃첫샙쓰𝠲퀧", 997 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("쭧穷ꥃ\ud845༠븚\ued0aᰓ䎯\uf2e9⇍僓螐㚿斃钘\uda61्롘\uef24Ḉ䴔ﰐ⏨勾臋ナ枭雷얢璞멣\ue94e\u181d伬︩ⴗ尟菫㋤懊郞쟦皻ꖀ풓᩠䥳\uf85d⽭帽贏㰐握鋼쇊烜\ua7e5횕և뒘既⥸塚輦㸾浚鰼쏭狷ꇓ탕ߤ뚶\ue588ᒖ婨褱㡾潈鸡촋簟ꏧ튬Ǫ냟\ue7a5ᚭ䖋\uf4d6㩤楾顀콚繣괷\udc1aϳ닿\ue1d0თ䞧\uf6b8▎品騠쥎", 45329 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        super(3, ssVar, ss.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0177  */
    /* JADX WARN: Code duplicated, block: B:33:0x0178  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = f55496s0;
        int i12 = i11 + 65;
        int i13 = i12 % 128;
        char c10 = 2;
        int i14 = i12 % 2;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i15 = 0;
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                break;
            }
            char c11 = charArray[i16];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[i15] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(i15), (ViewConfiguration.getWindowTouchSlop() >> 8) + 33, 1195 - View.combineMeasuredStates(i15, i15));
                    byte b10 = (byte) 1;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b11, b10, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f55493p0 ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (AndroidCharacter.getMirror('0') - '0'), 44 - (ViewConfiguration.getEdgeSlop() >> 16), 727 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b13, b13, b12, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                c10 = 2;
                i15 = 0;
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
        while (true) {
            int i17 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i17 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i18 = i11 + 105;
            int i19 = i18 % 128;
            int i20 = i18 % 2;
            cArr[i17] = (char) jArr[i17];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (KeyEvent.getMaxKeyCode() >> 16), 44 - KeyEvent.getDeadChar(0, 0), TextUtils.getTrimmedLength("") + 728);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b15, b15, b14, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    public static void b(int i10, int i11, short s4, Object[] objArr) {
        int i12 = 4 - (i11 * 4);
        int i13 = (s4 * 3) + 107;
        int i14 = i10 * 4;
        byte[] bArr = new byte[1 - i14];
        int i15 = 0 - i14;
        int i16 = -1;
        byte[] bArr2 = f55497t0;
        if (bArr2 == null) {
            i13 = i15 + (-i13);
            i15 = i15;
            i12++;
        }
        while (true) {
            i16++;
            bArr[i16] = (byte) i13;
            if (i16 == i15) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte b10 = bArr2[i12];
            i13 += -b10;
            i15 = i15;
            i12++;
        }
    }

    public static void c() {
        f55497t0 = new byte[]{15, -41, -95, -53};
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay, String str, Throwable th2) {
        int i10 = f55495r0;
        int i11 = i10 + 31;
        f55494q0 = i11 % 128;
        int i12 = i11 % 2;
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay2 = sethorizontalscrollbaroverlay;
        String str2 = str;
        int i13 = i10 + 75;
        f55494q0 = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay2, "");
            Intrinsics.checkNotNullParameter(str2, "");
            ss.setX(new Object[]{sethorizontalscrollbaroverlay2, str2}, -485599955, 485599962, (int) System.currentTimeMillis());
            throw null;
        }
        Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ss.setX(new Object[]{sethorizontalscrollbaroverlay2, str2}, -485599955, 485599962, (int) System.currentTimeMillis());
        Unit unit = Unit.INSTANCE;
        int i14 = f55494q0 + 123;
        f55495r0 = i14 % 128;
        int i15 = i14 % 2;
        return unit;
    }
}
