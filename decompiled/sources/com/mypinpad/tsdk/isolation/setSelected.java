package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.streams.jdk8.StreamsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setSelected;", "", "", "", "setY", "()Ljava/util/List;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setSelected {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char f60539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char f60540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static char f60541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static char f60542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f60543e = null;

    static {
        b();
        c();
        Color.rgb(0, 0, 0);
        INSTANCE = new Companion(null);
    }

    public static void a(byte b10, short s4, short s7, Object[] objArr) {
        int i10 = (s7 * 2) + 103;
        int i11 = s4 * 4;
        int i12 = b10 + 4;
        byte[] bArr = new byte[1 - i11];
        int i13 = 0 - i11;
        int i14 = -1;
        byte[] bArr2 = f60543e;
        if (bArr2 == null) {
            i10 = i12 + i13;
            i12 = i12;
            i13 = i13;
        }
        while (true) {
            i14++;
            bArr[i14] = (byte) i10;
            if (i14 == i13) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i15 = i12 + 1;
            i10 += bArr2[i15];
            i12 = i15;
            i13 = i13;
        }
    }

    public static void b() {
        f60543e = new byte[]{94, Constants.CVR_B2b8765_1111_APP_DISABLED, 73, 34};
    }

    public static void c() {
        f60542d = (char) 64638;
        f60541c = (char) 51760;
        f60539a = (char) 3763;
        f60540b = (char) 10018;
    }

    @NotNull
    public static List<String> setY() throws Throwable {
        BufferedReader bufferedReader;
        FileReader fileReader;
        int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
        char[] charArray = "\ue88e쓻豒⃰맺び㌠꼌\uf532㯅⹔飴遄吘䛮鰗".toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i10 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i11 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i11 >= charArray.length) {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(new String(cArr, 0, packedPositionGroup).intern())));
                try {
                    Stream streamLines = bufferedReader2.lines();
                    Intrinsics.checkNotNullExpressionValue(streamLines, "");
                    List<String> list = StreamsKt.toList(streamLines);
                    CloseableKt.closeFinally(bufferedReader2, null);
                    return list;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedReader2, th2);
                        throw th3;
                    }
                }
            }
            cArr2[i10] = charArray[i11];
            char c10 = charArray[i11 + 1];
            char c11 = 1;
            cArr2[1] = c10;
            int i12 = 58224;
            int i13 = i10;
            while (i13 < 16) {
                char c12 = cArr2[c11];
                char c13 = cArr2[i10];
                int i14 = i13;
                char[] cArr3 = charArray;
                try {
                    Object[] objArr = {Integer.valueOf(c12), Integer.valueOf((c13 + i12) ^ ((c13 << 4) + ((char) (((long) f60541c) ^ 4333817592127744003L)))), Integer.valueOf(c13 >>> 5), Integer.valueOf(f60542d)};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', 0) + 48535), (ViewConfiguration.getTouchSlop() >> 8) + 47, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2672);
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr2 = new Object[1];
                        a(b11, b10, (byte) (b11 + 1), objArr2);
                        String str = (String) objArr2[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i12) ^ ((cCharValue << 4) + ((char) (((long) f60539a) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f60540b)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (Color.rgb(0, 0, 0) + 16825750), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 46, 2672 - TextUtils.getCapsMode("", 0, 0));
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr4 = new Object[1];
                        a(b13, b12, (byte) (b13 + 1), objArr4);
                        String str2 = (String) objArr4[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str2, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i12 -= 40503;
                    i13 = i14 + 1;
                    charArray = cArr3;
                    bufferedReader = bufferedReader;
                    fileReader = fileReader;
                    i10 = 0;
                    c11 = 1;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
            }
            FileReader fileReader2 = fileReader;
            BufferedReader bufferedReader3 = bufferedReader;
            char[] cArr4 = charArray;
            int i15 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i15] = cArr2[0];
            cArr[i15 + 1] = cArr2[1];
            Object[] objArr5 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 38 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2145);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr6 = new Object[1];
                a(b15, b14, (byte) (-b15), objArr6);
                method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            charArray = cArr4;
            bufferedReader = bufferedReader3;
            fileReader = fileReader2;
            i10 = 0;
        }
    }
}
