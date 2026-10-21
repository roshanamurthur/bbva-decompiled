package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.esotericsoftware.asm.Opcodes;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class f {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f41523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f41524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kn f41525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f41526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f41527e;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f41527e = 0;
        f41524b = 1;
        b();
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getTapTimeout();
        MotionEvent.axisFromString("");
        Object[] objArr = new Object[1];
        f(31 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0014\u0015\uffdd\u0014\u0005\u0013\u0012\u0001\b\u0003\uffc0ￛ\u000e\u000f\u0013\nￏ\u000e\u000f\t\u0014\u0001\u0003\t\f\u0010\u0010\u0001\uffd8ￍ\u0006", 28 - ((Process.getThreadPriority(0) + 20) >> 6), 201 - (ViewConfiguration.getJumpTapTimeout() >> 16), true, objArr);
        f41525c = kn.e(((String) objArr[0]).intern());
        int i10 = f41527e + 11;
        f41524b = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static kr.a b(Context context, String str) throws Throwable {
        int i10 = f41524b + 117;
        f41527e = i10 % 128;
        int i11 = i10 % 2;
        kr.a aVarD = d(context, str, Boolean.TRUE);
        int i12 = f41524b + 27;
        f41527e = i12 % 128;
        int i13 = i12 % 2;
        return aVarD;
    }

    public static kr.a d(Context context, String str, Boolean bool) throws Throwable {
        Object obj;
        String str2 = bg.f40537a;
        if (str2 == null) {
            int i10 = f41527e + 33;
            f41524b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 / 0;
            }
            str2 = "";
        }
        kr.a aVarE = new kr.a().e(str);
        Object[] objArr = new Object[1];
        f((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, "\u0015\f\u0012\u0016\ufffbￔ\u0017\u0017￨ￔ\uffff", 11 - (ViewConfiguration.getTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + Opcodes.MONITORENTER, true, objArr);
        kr.a aVarB = aVarE.b(((String) objArr[0]).intern(), str2);
        Object[] objArr2 = new Object[1];
        f(TextUtils.indexOf("", "", 0) + 10, "\u000f\u0006\b￢ￎ\u0013\u0006\u0014\ufff6\u0015", AndroidCharacter.getMirror('0') - '\'', 200 - (ViewConfiguration.getTapTimeout() >> 16), true, objArr2);
        kr.a aVarB2 = aVarB.b(((String) objArr2[0]).intern(), at.a(bg.f40537a));
        Object[] objArr3 = new Object[1];
        g("趏跗뙈\ue873䞔\u0bc4堵趕䨮\ufe53ꁏ엣ɠ욈磀㴚", (-16777215) - Color.rgb(0, 0, 0), objArr3);
        kr.a aVarB3 = aVarB2.b(((String) objArr3[0]).intern(), at.a(bg.f40537a));
        Object[] objArr4 = new Object[1];
        f(View.MeasureSpec.makeMeasureSpec(0, 0) + 15, "\u0001\u0003\t\u0014\u000e\u0005\b\u0014\u0015￡ￍ\ufff4￦\u0005\u0014", View.resolveSizeAndState(0, 0, 0) + 13, (ViewConfiguration.getTouchSlop() >> 8) + 201, true, objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        f((ViewConfiguration.getTouchSlop() >> 8) + 32, "\u0016￼\uffd9 \uffff￪\u0002\ufff4\r\u0015#￦&￨￦\uffe7￦\ufff9￨\u0015\u001b\u0000\u0000\ufff6\u001d\u0005\u0003\uffd8\f\u0011\u0016\u0006", View.MeasureSpec.getMode(0) + 2, 181 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), false, objArr5);
        kr.a aVarB4 = aVarB3.b(strIntern, ((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        f(17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0003\u0001ￌ\u0011\u0002\tￌ\u000e\u0010\u0003\u0004\u0011\u0004\uffff\u0001\u0003\u0012", MotionEvent.axisFromString("") + 13, TextUtils.lastIndexOf("", '0') + 204, false, objArr6);
        SharedPreferences sharedPreferences = context.getSharedPreferences(((String) objArr6[0]).intern(), 0);
        Object[] objArr7 = new Object[1];
        g("⩂⨤鉃狵揓酴\uf861\u2dd7\uedf2\uda03㪱旘ꖹ\ue2ce\ue275鴔絾⪜\uaa3f픘㔡狼鏾ಯ쳣뭥宧䒴蓷쌿ͣ籫屷௲", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr7);
        String string = sharedPreferences.getString(((String) objArr7[0]).intern(), "");
        if (!string.equals("")) {
            int i12 = f41524b + 45;
            f41527e = i12 % 128;
            if (i12 % 2 != 0) {
                Object[] objArr8 = new Object[1];
                f(19 % (ViewConfiguration.getEdgeSlop() >>> 28), "￫\u0013\u0007\u000f\u0012\ufffeￓ\ufffb\u0019\u000b\u0018ￓ", 105 << (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1730 / Color.blue(1), false, objArr8);
                obj = objArr8[0];
            } else {
                Object[] objArr9 = new Object[1];
                f((ViewConfiguration.getEdgeSlop() >> 16) + 12, "￫\u0013\u0007\u000f\u0012\ufffeￓ\ufffb\u0019\u000b\u0018ￓ", 6 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.blue(0) + Opcodes.MONITOREXIT, false, objArr9);
                obj = objArr9[0];
            }
            aVarB4.b(((String) obj).intern(), string);
        }
        if (bool.booleanValue()) {
            int i13 = f41524b + 61;
            f41527e = i13 % 128;
            if (i13 % 2 != 0) {
                String str3 = at.f40386a;
                throw null;
            }
            if (at.f40386a == null) {
                Object[] objArr10 = new Object[1];
                g("썹쌚\u10c8漢\ue158ᧆ䀰開Ә墦눅\uddde䳑恏櫃┟鐕ꠄ⊞济\udc00\uf035᭕뒱◁㧸", Color.red(0) + 1, objArr10);
                throw new a(((String) objArr10[0]).intern());
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr11 = new Object[1];
                f(31 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u0016￼\uffd9 \uffff￪\u0002\ufff4\r\u0015#￦&￨￦\uffe7￦\ufff9￨\u0015\u001b\u0000\u0000\ufff6\u001d\u0005\u0003\uffd8\f\u0011\u0016\u0006", View.getDefaultSize(0, 0) + 2, KeyEvent.normalizeMetaState(0) + 182, false, objArr11);
                sb2.append(((String) objArr11[0]).intern());
                sb2.append(at.f40386a);
                String lowerCase = bi.b(sb2.toString()).toLowerCase();
                Object[] objArr12 = new Object[1];
                g("ꓛꒃ憻谠遧澁ᣁ쵳捼⦺쑂蕻⬇ᅱᲀ緿\uf3f9", TextUtils.indexOf("", "", 0, 0) + 1, objArr12);
                aVarB4.b(((String) objArr12[0]).intern(), lowerCase);
            } catch (Exception unused) {
                Object[] objArr13 = new Object[1];
                g("ꡣꠠ\uf749옛ۗ▌閛䀤濃뼌踍ࡸ⟋蟍嚉\uf0ad｟侟Ỗ룡띓ិ✎愈亗\ude66\uef55⥗ڞ\ua630", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr13);
                throw new a(((String) objArr13[0]).intern());
            }
        }
        return aVarB4;
    }

    public static kr e(Context context, String str, Object obj) throws a {
        kr krVarE = b(context, str).c(kp.a(f41525c, new dy().d().a().e(obj))).e();
        int i10 = f41524b + 111;
        f41527e = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 4 / 0;
        }
        return krVarE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x01c1  */
    private static void f(int i10, String str, int i11, int i12, boolean z10, Object[] objArr) throws Throwable {
        int i13;
        Throwable cause;
        int i14 = $10 + 125;
        $11 = i14 % 128;
        int i15 = 2;
        int i16 = i14 % 2;
        char[] charArray = str != null ? str.toCharArray() : str;
        gz gzVar = new gz();
        char[] cArr = new char[i10];
        gzVar.f41846c = 0;
        while (true) {
            int i17 = gzVar.f41846c;
            if (i17 >= i10) {
                break;
            }
            char c10 = charArray[i17];
            gzVar.f41844a = c10;
            char c11 = (char) (i12 + c10);
            cArr[i17] = c11;
            try {
                Object[] objArr2 = new Object[i15];
                objArr2[1] = Integer.valueOf(f41526d);
                objArr2[0] = Integer.valueOf(c11);
                Map map = bp.f40694x;
                Object method = map.get(1917901234);
                if (method == null) {
                    Class cls = (Class) bp.a(22 - ImageFormat.getBitsPerPixel(0), ImageFormat.getBitsPerPixel(0) + 1026, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 38453));
                    byte b10 = (byte) ($$b - 5);
                    byte b11 = (byte) (b10 - 5);
                    Object[] objArr3 = new Object[1];
                    h(b10, b11, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(1917901234, method);
                }
                cArr[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {gzVar, gzVar};
                Object method2 = map.get(-1709307603);
                if (method2 == null) {
                    Class cls3 = (Class) bp.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 25, (ViewConfiguration.getLongPressTimeout() >> 16) + 765, (char) (36773 - Color.green(0)));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    h(b12, b13, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1709307603, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i15 = 2;
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
        if (i11 > 0) {
            int i18 = $11 + 115;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            gzVar.f41845b = i11;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i20 = gzVar.f41845b;
            System.arraycopy(cArr2, 0, cArr, i10 - i20, i20);
            int i21 = gzVar.f41845b;
            System.arraycopy(cArr2, i21, cArr, 0, i10 - i21);
        }
        if (z10) {
            char[] cArr3 = new char[i10];
            gzVar.f41846c = 0;
            int i22 = $11 + 35;
            $10 = i22 % 128;
            int i23 = 2;
            int i24 = i22 % 2;
            while (true) {
                int i25 = gzVar.f41846c;
                if (i25 >= i10) {
                    break;
                }
                int i26 = $11 + 85;
                $10 = i26 % 128;
                int i27 = i26 % i23;
                cArr3[i25] = cArr[(i10 - i25) - 1];
                Object[] objArr6 = new Object[i23];
                objArr6[1] = gzVar;
                objArr6[0] = gzVar;
                Map map2 = bp.f40694x;
                Object method3 = map2.get(-1709307603);
                if (method3 != null) {
                    i13 = 2;
                } else {
                    Class cls4 = (Class) bp.a((Process.myPid() >> 22) + 24, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 765, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36773));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    h(b14, b15, b15, objArr7);
                    i13 = 2;
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1709307603, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i23 = i13;
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    private static void g(String str, int i10, Object[] objArr) throws Throwable {
        Object charArray;
        int i11 = $10 + 43;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 6 / 0;
            if (str != null) {
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
        } else if (str != null) {
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        ha haVar = new ha();
        char[] cArrB = ha.b(f41523a ^ (-7412675099708671612L), (char[]) charArray, i10);
        haVar.f41863b = 4;
        while (true) {
            int i13 = haVar.f41863b;
            if (i13 >= cArrB.length) {
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                return;
            }
            int i14 = $10 + 53;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 - 4;
            haVar.f41864c = i16;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[i13] ^ cArrB[i13 % 4]), Long.valueOf(i16), Long.valueOf(f41523a)};
                Map map = bp.f40694x;
                Object method = map.get(1967282843);
                if (method == null) {
                    Class cls = (Class) bp.a(ExpandableListView.getPackedPositionType(0L) + 24, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 765, (char) (36773 - ExpandableListView.getPackedPositionType(0L)));
                    byte length = (byte) $$a.length;
                    byte b10 = (byte) (length - 4);
                    Object[] objArr3 = new Object[1];
                    h(length, b10, b10, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(1967282843, method);
                }
                cArrB[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {haVar, haVar};
                Object method2 = map.get(1724890883);
                if (method2 == null) {
                    method2 = ((Class) bp.a(24 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0, 0) + 269, (char) (25686 - KeyEvent.keyCodeFromString("")))).getMethod("h", Object.class, Object.class);
                    map.put(1724890883, method2);
                }
                ((Method) method2).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    private static void h(byte b10, short s4, byte b11, Object[] objArr) {
        int i10 = (b11 * 4) + 4;
        int i11 = 106 - b10;
        int i12 = s4 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i12 + 1];
        int i13 = -1;
        if (bArr == null) {
            i11 += -i12;
            objArr = objArr;
            bArr2 = bArr2;
            bArr = bArr;
            i13 = -1;
            i10++;
            i12 = i12;
        }
        while (true) {
            int i14 = i13 + 1;
            bArr2[i14] = (byte) i11;
            if (i14 == i12) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i15 = i10;
            i11 += -bArr[i10];
            objArr = objArr;
            bArr2 = bArr2;
            bArr = bArr;
            i13 = i14;
            i10 = i15 + 1;
            i12 = i12;
        }
    }

    public static void init$0() {
        $$a = new byte[]{27, 92, 98, 63};
        $$b = 10;
    }

    public static void b() {
        f41526d = -1817348563;
        f41523a = 7510400245217216629L;
    }
}
