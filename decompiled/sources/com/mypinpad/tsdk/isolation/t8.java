package com.mypinpad.tsdk.isolation;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/t8;", "Ljava/security/Provider;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
final class t8 extends Provider {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final t8 f60993p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static char f60994q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static char f60995r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static char f60996s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static char f60997t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f60998u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f60999w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f61000x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final byte[] f61001y0 = null;

    static {
        c();
        f60999w0 = 0;
        f61000x0 = 1;
        f60998u0 = 0;
        v0 = 1;
        f();
        f60993p0 = new t8();
        int i10 = v0 + 71;
        f60998u0 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t8() throws Throwable {
        Object[] objArr = new Object[1];
        a("ﾐ㰪酩昺\udfea蛱먬洪ﬤ꧘", ExpandableListView.getPackedPositionGroup(0L) + 9, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\uf7e6贺ᨨ\uf882哒깷\uecdd䢈밅\u0e76셖嬁㐥⾡♐ꋜ濝\ue1a6\uf112⯢뵓ꃉ䣐䂕ᙢﲸ", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, objArr2);
        super(strIntern, 1.0d, ((String) objArr2[0]).intern());
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = f60999w0 + 15;
        f61000x0 = i11 % 128;
        char c10 = 2;
        if (i11 % 2 == 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i12 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i13 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i13 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[i12] = charArray[i13];
            cArr2[1] = charArray[i13 + 1];
            int i14 = 58224;
            int i15 = i12;
            while (i15 < 16) {
                char c11 = cArr2[1];
                char c12 = cArr2[i12];
                char[] cArr3 = cArr2;
                int i16 = (c12 + i14) ^ ((c12 << 4) + ((char) (((long) f60996s0) ^ 4333817592127744003L)));
                int i17 = c12 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f60997t0);
                    objArr2[c10] = Integer.valueOf(i17);
                    objArr2[1] = Integer.valueOf(i16);
                    objArr2[0] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48582 - AndroidCharacter.getMirror('0')), ((byte) KeyEvent.getModifierMetaStateMask()) + 48, ImageFormat.getBitsPerPixel(0) + 2673);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i14) ^ ((cCharValue << 4) + ((char) (((long) f60994q0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f60995r0)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (ImageFormat.getBitsPerPixel(0) + 48535), 47 - ((Process.getThreadPriority(0) + 20) >> 6), 2671 - ImageFormat.getBitsPerPixel(0));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, b13, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i14 -= 40503;
                    i15++;
                    int i18 = f61000x0 + 73;
                    f60999w0 = i18 % 128;
                    int i19 = i18 % 2;
                    cArr2 = cArr3;
                    c10 = 2;
                    i12 = 0;
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
                Class cls5 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0') + 1), 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), 2145 - View.resolveSize(0, 0));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, (byte) (b15 + 1), objArr7);
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            int i21 = f61000x0 + 25;
            f60999w0 = i21 % 128;
            int i22 = i21 % 2;
            c10 = 2;
            cArr2 = cArr4;
            i12 = 0;
        }
    }

    public static void b(int i10, short s4, short s7, Object[] objArr) {
        int i11 = s4 * 2;
        int i12 = (s7 * 2) + 103;
        int i13 = 4 - (i10 * 2);
        byte[] bArr = new byte[1 - i11];
        int i14 = 0 - i11;
        byte[] bArr2 = f61001y0;
        int i15 = -1;
        if (bArr2 == null) {
            i13++;
            i12 = i13 + i12;
        }
        while (true) {
            i15++;
            bArr[i15] = (byte) i12;
            if (i15 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            } else {
                byte b10 = bArr2[i13];
                i13++;
                i12 += b10;
            }
        }
    }

    public static void c() {
        f61001y0 = new byte[]{75, 85, 67, -51};
    }

    public static /* synthetic */ Set e(Object[] objArr) {
        t8 t8Var = (t8) objArr[0];
        int i10 = f60998u0 + 123;
        v0 = i10 % 128;
        int i11 = i10 % 2;
        Set<Object> setKeySet = super.keySet();
        int i12 = v0 + 45;
        f60998u0 = i12 % 128;
        int i13 = i12 % 2;
        return setKeySet;
    }

    public static void f() {
        f60997t0 = (char) 31728;
        f60996s0 = (char) 3776;
        f60994q0 = (char) 63893;
        f60995r0 = (char) 34454;
    }

    public final Collection<Object> d() {
        int i10 = v0 + 7;
        f60998u0 = i10 % 128;
        int i11 = i10 % 2;
        Collection<Object> collectionValues = super.values();
        int i12 = f60998u0 + 61;
        v0 = i12 % 128;
        int i13 = i12 % 2;
        return collectionValues;
    }

    @Override // java.security.Provider, java.util.Hashtable, java.util.Map
    public final Set<Map.Entry<Object, Object>> entrySet() {
        Set<Map.Entry<Object, Object>> setEntrySet;
        int i10 = f60998u0;
        int i11 = i10 + 67;
        v0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 25;
        v0 = i13 % 128;
        if (i13 % 2 == 0) {
            setEntrySet = super.entrySet();
            int i14 = 60 / 0;
        } else {
            setEntrySet = super.entrySet();
        }
        int i15 = f60998u0 + 19;
        v0 = i15 % 128;
        int i16 = i15 % 2;
        return setEntrySet;
    }

    @Override // java.security.Provider, java.util.Hashtable, java.util.Map
    public final Set<Object> keySet() {
        int i10 = f60998u0 + 119;
        v0 = i10 % 128;
        if (i10 % 2 != 0) {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return e(objArr);
        }
        Object[] objArr2 = {this};
        System.identityHashCode(this);
        int i11 = 42 / 0;
        return e(objArr2);
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final int size() {
        int i10 = f60998u0;
        int i11 = i10 + 53;
        v0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 73;
        v0 = i13 % 128;
        if (i13 % 2 == 0) {
            super.size();
            throw null;
        }
        int size = super.size();
        int i14 = f60998u0 + 91;
        v0 = i14 % 128;
        if (i14 % 2 != 0) {
            return size;
        }
        throw null;
    }

    @Override // java.security.Provider, java.util.Hashtable, java.util.Map
    public final Collection<Object> values() {
        int i10 = v0 + 47;
        f60998u0 = i10 % 128;
        if (i10 % 2 == 0) {
            return d();
        }
        d();
        throw null;
    }
}
