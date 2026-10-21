package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes9.dex */
public class nj implements Serializable, Comparable<nj> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f42685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nj f42686e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f42687j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient String f42688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int f42689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f42690c;

    static {
        init$0();
        i();
        f42685d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        f42686e = e(new byte[0]);
    }

    public nj(byte[] bArr) {
        this.f42690c = bArr;
    }

    public static nj c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        nj njVar = new nj(str.getBytes(nv.f42731c));
        njVar.f42688a = str;
        return njVar;
    }

    public static nj e(byte... bArr) {
        if (bArr != null) {
            return new nj((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static void i() {
        f42687j = -1817348588;
    }

    public static void init$0() {
        $$a = new byte[]{92, 12, -51, -62};
        $$b = 101;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x01af  */
    private static void k(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        int i13;
        Object method;
        Throwable cause;
        char[] charArray = str != null ? str.toCharArray() : str;
        gz gzVar = new gz();
        char[] cArr = new char[i12];
        int i14 = 0;
        gzVar.f41846c = 0;
        while (true) {
            int i15 = gzVar.f41846c;
            if (i15 >= i12) {
                break;
            }
            char c10 = charArray[i15];
            gzVar.f41844a = c10;
            char c11 = (char) (i10 + c10);
            cArr[i15] = c11;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(f42687j);
                objArr2[i14] = Integer.valueOf(c11);
                Map map = bp.f40694x;
                Object method2 = map.get(1917901234);
                if (method2 == null) {
                    Class cls = (Class) bp.a('G' - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0', i14, i14) + 1026, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 38453));
                    byte b10 = (byte) ($$b & 3);
                    byte b11 = (byte) (-b10);
                    Object[] objArr3 = new Object[1];
                    l(b10, b11, (byte) (b11 + 1), objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method2 = cls.getMethod(str2, cls2, cls2);
                    map.put(1917901234, method2);
                }
                cArr[i15] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {gzVar, gzVar};
                Object method3 = map.get(-1709307603);
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 766, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36773));
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    l(b12, b13, (byte) (b13 + 1), objArr5);
                    method3 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1709307603, method3);
                }
                ((Method) method3).invoke(null, objArr4);
                i14 = 0;
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
            gzVar.f41845b = i11;
            char[] cArr2 = new char[i12];
            i13 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            int i16 = gzVar.f41845b;
            System.arraycopy(cArr2, 0, cArr, i12 - i16, i16);
            int i17 = gzVar.f41845b;
            System.arraycopy(cArr2, i17, cArr, 0, i12 - i17);
        } else {
            i13 = 0;
        }
        if (z10) {
            char[] cArr3 = new char[i12];
            gzVar.f41846c = i13;
            while (true) {
                int i18 = gzVar.f41846c;
                if (i18 >= i12) {
                    break;
                }
                cArr3[i18] = cArr[(i12 - i18) - 1];
                Object[] objArr6 = {gzVar, gzVar};
                Map map2 = bp.f40694x;
                Object obj = map2.get(-1709307603);
                if (obj != null) {
                    method = obj;
                } else {
                    Class cls4 = (Class) bp.a(23 - TextUtils.lastIndexOf("", '0', 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 765, (char) (36772 - ImageFormat.getBitsPerPixel(0)));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    l(b14, b15, (byte) (b15 + 1), objArr7);
                    method = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1709307603, method);
                }
                ((Method) method).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    private static void l(byte b10, int i10, byte b11, Object[] objArr) {
        int i11 = b11 * 2;
        int i12 = i10 + 4;
        byte[] bArr = $$a;
        int i13 = 106 - (b10 * 5);
        byte[] bArr2 = new byte[i11 + 1];
        int i14 = -1;
        if (bArr == null) {
            i13 += i11;
            i11 = i11;
            objArr = objArr;
            bArr2 = bArr2;
            bArr = bArr;
            i14 = -1;
        }
        while (true) {
            int i15 = i14 + 1;
            bArr2[i15] = (byte) i13;
            if (i15 == i11) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i12++;
            i13 += bArr[i12];
            i11 = i11;
            objArr = objArr;
            bArr2 = bArr2;
            bArr = bArr;
            i14 = i15;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i10)));
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = objectInputStream.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        nj njVar = new nj(bArr);
        try {
            Field declaredField = nj.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(this, njVar.f42690c);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f42690c.length);
        objectOutputStream.write(this.f42690c);
    }

    public String a() {
        return ne.b(this.f42690c);
    }

    public String b() {
        String str = this.f42688a;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f42690c, nv.f42731c);
        this.f42688a = str2;
        return str2;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(nj njVar) {
        nj njVar2 = njVar;
        int iG = g();
        int iG2 = njVar2.g();
        int iMin = Math.min(iG, iG2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iC = c(i10) & 255;
            int iC2 = njVar2.c(i10) & 255;
            if (iC != iC2) {
                return iC < iC2 ? -1 : 1;
            }
        }
        if (iG == iG2) {
            return 0;
        }
        return iG < iG2 ? -1 : 1;
    }

    public String d() {
        byte[] bArr = this.f42690c;
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f42685d;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nj) {
            nj njVar = (nj) obj;
            int iG = njVar.g();
            byte[] bArr = this.f42690c;
            if (iG == bArr.length && njVar.d(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return (byte[]) this.f42690c.clone();
    }

    public int g() {
        return this.f42690c.length;
    }

    public int hashCode() {
        int i10 = this.f42689b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f42690c);
        this.f42689b = iHashCode;
        return iHashCode;
    }

    public nj j() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f42690c;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new nj(bArr2);
            }
            i10++;
        }
    }

    public String toString() {
        if (this.f42690c.length == 0) {
            return "[size=0]";
        }
        String strB = b();
        int length = strB.length();
        int length2 = 0;
        int i10 = 0;
        while (true) {
            if (length2 >= length) {
                length2 = strB.length();
                break;
            }
            if (i10 != 64) {
                int iCodePointAt = strB.codePointAt(length2);
                if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                    length2 = -1;
                    break;
                }
                i10++;
                length2 += Character.charCount(iCodePointAt);
            } else {
                break;
            }
        }
        if (length2 == -1) {
            if (this.f42690c.length <= 64) {
                StringBuilder sb2 = new StringBuilder("[hex=");
                sb2.append(d());
                sb2.append(Constant.BRACKET_CLOSE);
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder("[size=");
            sb3.append(this.f42690c.length);
            sb3.append(" hex=");
            sb3.append(b(0, 64).d());
            sb3.append("…]");
            return sb3.toString();
        }
        String strReplace = strB.substring(0, length2).replace("\\", "\\\\").replace(RootService.LINE_BREAK, "\\n").replace("\r", "\\r");
        if (length2 >= strB.length()) {
            StringBuilder sb4 = new StringBuilder("[text=");
            sb4.append(strReplace);
            sb4.append(Constant.BRACKET_CLOSE);
            return sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder("[size=");
        sb5.append(this.f42690c.length);
        sb5.append(" text=");
        sb5.append(strReplace);
        sb5.append("…]");
        return sb5.toString();
    }

    @Nullable
    public static nj a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] bArrB = ne.b(str);
        if (bArrB != null) {
            return new nj(bArrB);
        }
        return null;
    }

    public static nj b(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ((d(str.charAt(i11)) << 4) + d(str.charAt(i11 + 1)));
            }
            return e(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    public nj e() {
        return e(McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    private nj e(String str) {
        try {
            return e(MessageDigest.getInstance(str).digest(this.f42690c));
        } catch (NoSuchAlgorithmException e5) {
            throw new AssertionError(e5);
        }
    }

    public nj c() {
        return e("SHA-256");
    }

    public byte c(int i10) {
        return this.f42690c[i10];
    }

    private static int d(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c10)));
        }
        return c10 - '7';
    }

    public void d(nb nbVar) {
        byte[] bArr = this.f42690c;
        nbVar.c(bArr, 0, bArr.length);
    }

    public boolean d(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f42690c;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && nv.a(bArr2, i10, bArr, i11, i12);
    }

    public nj b(int i10, int i11) throws Throwable {
        if (i10 >= 0) {
            byte[] bArr = this.f42690c;
            if (i11 > bArr.length) {
                StringBuilder sb2 = new StringBuilder("endIndex > length(");
                sb2.append(this.f42690c.length);
                sb2.append(")");
                throw new IllegalArgumentException(sb2.toString());
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                try {
                    Object[] objArr = {bArr, Integer.valueOf(i10), bArr2, 0, Integer.valueOf(i12)};
                    Object[] objArr2 = new Object[1];
                    k(178 - Color.green(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5, (ViewConfiguration.getLongPressTimeout() >> 16) + 16, "\u0017\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1", false, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    k((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 188, 7 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 9, "\u0003\u0002\ufff6\f\ufff4\u0005\u0005\ufff4\f", true, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                    return new nj(bArr2);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public final boolean d(nj njVar) {
        return b(0, njVar, 0, njVar.g());
    }

    public boolean b(int i10, nj njVar, int i11, int i12) {
        return njVar.d(0, this.f42690c, 0, i12);
    }
}
