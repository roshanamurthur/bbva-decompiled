package com.mypinpad.tsdk.isolation;

import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class pg extends pf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final char f57690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char f57691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final char f57692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final char f57693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f57694r = null;

    @NotNull
    public final UUID m;

    static {
        b();
        f57693q = (char) 61514;
        f57692p = (char) 41067;
        f57690n = (char) 28914;
        f57691o = (char) 36686;
    }

    public pg(@NotNull UUID uuid) throws Throwable {
        char c10;
        Intrinsics.checkNotNullParameter(uuid, "");
        int i10 = 16;
        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31;
        char[] charArray = "뷞㔪艀榄ꞕ壨싌殓\u00adͷ框ၠ恄蒏櫮ꊇ큀\ue645빘怘誢\ue898ߤꒁ˥ꇕ᱆䈮䖉ङ锋䦡".toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i11 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char c11 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i12 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i12 >= charArray.length) {
                super(null, new String(cArr, 0, keyRepeatTimeout).intern(), null, 0L, 13, null);
                this.m = uuid;
                return;
            }
            cArr2[i11] = charArray[i12];
            char c12 = 1;
            cArr2[1] = charArray[i12 + 1];
            int i13 = 58224;
            int i14 = i11;
            while (i14 < i10) {
                char c13 = cArr2[c12];
                char c14 = cArr2[i11];
                int i15 = (c14 + i13) ^ ((c14 << 4) + ((char) (((long) f57692p) ^ 4333817592127744003L)));
                int i16 = c14 >>> 5;
                try {
                    Object[] objArr = new Object[4];
                    objArr[3] = Integer.valueOf(f57693q);
                    objArr[c11] = Integer.valueOf(i16);
                    objArr[c12] = Integer.valueOf(i15);
                    objArr[0] = Integer.valueOf(c13);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (TextUtils.getOffsetBefore("", 0) + 48534), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 48, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2673);
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr2 = new Object[1];
                        c(b10, b11, b11, objArr2);
                        String str = (String) objArr2[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    cArr2[1] = cCharValue;
                    setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled2 = setalwaysdrawnwithcacheenabled;
                    char[] cArr3 = cArr;
                    Object[] objArr3 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i13) ^ ((cCharValue << 4) + ((char) (((long) f57690n) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f57691o)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48534 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 48, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2672);
                        byte b12 = (byte) (-1);
                        byte b13 = (byte) (b12 + 1);
                        Object[] objArr4 = new Object[1];
                        c(b12, b13, b13, objArr4);
                        String str2 = (String) objArr4[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str2, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i13 -= 40503;
                    i14++;
                    setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled2;
                    cArr = cArr3;
                    charArray = charArray;
                    i10 = 16;
                    i11 = 0;
                    c11 = 2;
                    c12 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = charArray;
            setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled3 = setalwaysdrawnwithcacheenabled;
            char[] cArr5 = cArr;
            int i17 = setalwaysdrawnwithcacheenabled3.setOnFocusChangeListener;
            cArr5[i17] = cArr2[0];
            cArr5[i17 + 1] = cArr2[1];
            Object[] objArr5 = {setalwaysdrawnwithcacheenabled3, setalwaysdrawnwithcacheenabled3};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                c10 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0), 37 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2146 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                byte b14 = (byte) (-1);
                byte b15 = (byte) (b14 + 1);
                Object[] objArr6 = new Object[1];
                c(b14, b15, (byte) (b15 + 1), objArr6);
                c10 = 2;
                method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            c11 = c10;
            setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled3;
            cArr = cArr5;
            charArray = cArr4;
            i10 = 16;
            i11 = 0;
        }
    }

    public static void b() {
        f57694r = new byte[]{116, 87, -51, 89};
    }

    public static void c(byte b10, byte b11, int i10, Object[] objArr) {
        int i11 = b10 + 4;
        int i12 = b11 * 3;
        int i13 = (i10 * 2) + 103;
        byte[] bArr = new byte[i12 + 1];
        int i14 = -1;
        byte[] bArr2 = f57694r;
        if (bArr2 == null) {
            objArr = objArr;
            bArr = bArr;
            i14 = -1;
            bArr2 = bArr2;
            i13 = (-i11) + i13;
            i11 = i11;
            i12 = i12;
        }
        while (true) {
            int i15 = i14 + 1;
            int i16 = i11 + 1;
            bArr[i15] = (byte) i13;
            if (i15 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i17 = i12;
            byte[] bArr3 = bArr2;
            byte[] bArr4 = bArr;
            Object[] objArr2 = objArr;
            int i18 = (-bArr2[i16]) + i13;
            objArr = objArr2;
            bArr = bArr4;
            i14 = i15;
            bArr2 = bArr3;
            i13 = i18;
            i11 = i16;
            i12 = i17;
        }
    }

    @NotNull
    public final UUID setDividerPadding() {
        return this.m;
    }
}
