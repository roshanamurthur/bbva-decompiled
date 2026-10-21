package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import com.mypinpad.tsdk.api.TerminalSdk;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nIdentityService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityService.kt\ncom/mypinpad/tsdk/internal/remote/oauth/IdentityService\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n+ 4 OkHttpUtils.kt\ncom/mypinpad/tsdk/internal/remote/OkHttpUtilsKt\n*L\n1#1,146:1\n11335#2:147\n11670#2,3:148\n7#3,8:151\n112#4,6:159\n91#4,13:165\n*S KotlinDebug\n*F\n+ 1 IdentityService.kt\ncom/mypinpad/tsdk/internal/remote/oauth/IdentityService\n*L\n59#1:147\n59#1:148,3\n63#1:151,8\n66#1:159,6\n67#1:165,13\n*E\n"})
public final class qu {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f57991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char[] f57992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char f57993l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f57994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f57995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f57996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f57997q = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f57998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String[] f57999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f58000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function2<pw, Integer, JSONObject> f58001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function2 f58002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ym f58003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Object f58004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Function0<Pair<String, Integer>> f58005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Pair<String, Integer> f58006i;

    public static final class setY {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f58007d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f58008e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f58009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f58010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Integer f58011c;

        public setY(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
            this.f58009a = str;
            this.f58010b = str2;
            this.f58011c = num;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            int i15 = (((~(i10 | i12)) | (~((~i10) | i14)) | (~(i11 | i12))) * 831) + ((~(i13 | i10 | i12)) * (-1662)) + (((~(i13 | i14)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830));
            if (i15 == 1) {
                setY sety = (setY) objArr[0];
                int i16 = f58008e;
                int i17 = ((i16 | 49) << 1) - (i16 ^ 49);
                f58007d = i17 % 128;
                int i18 = i17 % 2;
                Integer num = sety.f58011c;
                int i19 = i16 & 41;
                int i20 = i16 | 41;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f58007d = i21 % 128;
                int i22 = i21 % 2;
                return num;
            }
            if (i15 == 2) {
                setY sety2 = (setY) objArr[0];
                int i23 = f58007d;
                int i24 = i23 + 69;
                f58008e = i24 % 128;
                int i25 = i24 % 2;
                String str = sety2.f58010b;
                if (i25 == 0) {
                    throw null;
                }
                int i26 = i23 ^ 93;
                int i27 = ((i23 & 93) | i26) << 1;
                int i28 = -i26;
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                f58008e = i29 % 128;
                if (i29 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            setY sety3 = (setY) objArr[0];
            int i30 = f58008e;
            int i31 = i30 ^ 115;
            int i32 = ((i30 & 115) | i31) << 1;
            int i33 = -i31;
            int i34 = (i32 & i33) + (i32 | i33);
            int i35 = i34 % 128;
            f58007d = i35;
            int i36 = i34 % 2;
            String str2 = sety3.f58009a;
            int i37 = i35 & 33;
            int i38 = i37 + ((i35 ^ 33) | i37);
            f58008e = i38 % 128;
            if (i38 % 2 != 0) {
                return str2;
            }
            int i39 = 83 / 0;
            return str2;
        }

        @Nullable
        public final String setCompoundDrawableTintBlendMode() {
            return (String) setX(new Object[]{this}, 1437643985, -1437643983, System.identityHashCode(this));
        }

        @Nullable
        public final Integer setOnFocusChangeListener() {
            return (Integer) setX(new Object[]{this}, -774643003, 774643004, System.identityHashCode(this));
        }

        @Nullable
        public final String setY() {
            return (String) setX(new Object[]{this}, 1158246745, -1158246745, System.identityHashCode(this));
        }
    }

    static {
        d();
        f57995o = 0;
        f57996p = 1;
        m = 0;
        f57994n = 1;
        f57991j = -2218114023316342850L;
        f57993l = (char) 53956;
        f57992k = new char[]{59192, 58563, 59171, 59189, 59198, 58560, 59140, 58561, 59197, 59187, 59170, 59199, 59195, 59188, 59186, 59179, 59184, 59191, 58565, 59194, 59196, 59177, 59176, 58562, 59183};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qu(@NotNull String str, @NotNull String[] strArr, long j10, @NotNull Function2<? super pw, ? super Integer, ? extends JSONObject> function2, @NotNull Function2 function3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function3, "");
        this.f57998a = str;
        this.f57999b = strArr;
        this.f58000c = j10;
        this.f58001d = function2;
        this.f58002e = function3;
        this.f58004g = new Object();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0187  */
    /* JADX WARN: Code duplicated, block: B:36:0x0188  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = f57996p + 99;
        f57995o = i11 % 128;
        char c10 = 2;
        if (i11 % 2 != 0) {
            int i12 = 41 / 0;
        }
        char[] charArray = str.toCharArray();
        int i13 = f57996p + 29;
        f57995o = i13 % 128;
        int i14 = i13 % 2;
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i15 >= charArray.length) {
                break;
            }
            char c11 = charArray[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (Process.myPid() >> 22) + 33, KeyEvent.keyCodeFromString("") + 1195);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b10, b11, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f57991j ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((Process.getThreadPriority(0) + 20) >> 6), 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b12, b13, (byte) (b13 + 3), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                c10 = 2;
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
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                String str2 = new String(cArr);
                int i17 = f57996p + 123;
                f57995o = i17 % 128;
                int i18 = i17 % 2;
                objArr[0] = str2;
                return;
            }
            cArr[i16] = (char) jArr[i16];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 728);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                c(b14, b15, (byte) (b15 + 3), objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0162  */
    /* JADX WARN: Code duplicated, block: B:41:0x0178  */
    /* JADX WARN: Code duplicated, block: B:46:0x01cd A[Catch: all -> 0x00a7, TRY_ENTER, TryCatch #0 {all -> 0x00a7, blocks: (B:10:0x0039, B:14:0x008d, B:13:0x004e, B:20:0x00ad, B:24:0x0105, B:42:0x017a, B:46:0x01cd, B:47:0x022c, B:51:0x0249, B:55:0x02f1, B:54:0x028d, B:23:0x00c5), top: B:71:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x023d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0289  */
    /* JADX WARN: Code duplicated, block: B:54:0x028d A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:10:0x0039, B:14:0x008d, B:13:0x004e, B:20:0x00ad, B:24:0x0105, B:42:0x017a, B:46:0x01cd, B:47:0x022c, B:51:0x0249, B:55:0x02f1, B:54:0x028d, B:23:0x00c5), top: B:71:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x031b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0325  */
    /* JADX WARN: Code duplicated, block: B:60:0x034d  */
    public static void b(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        Map map;
        Object method;
        int iIntValue;
        int i12;
        int i13;
        int i14;
        Object method2;
        int length;
        char[] cArr;
        int i15;
        int i16 = f57995o + 5;
        f57996p = i16 % 128;
        int i17 = i16 % 2;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr2 = f57992k;
        long j10 = 0;
        float f6 = 0.0f;
        int i18 = 290255894;
        if (cArr2 != null) {
            int i19 = f57996p + 53;
            f57995o = i19 % 128;
            if (i19 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i15 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i15 = 0;
            }
            while (i15 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i15])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(Integer.valueOf(i18));
                    if (method3 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (1 - (AudioTrack.getMaxVolume() > f6 ? 1 : (AudioTrack.getMaxVolume() == f6 ? 0 : -1))), 46 - (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1)), 1116 - KeyEvent.getDeadChar(0, 0));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, (byte) (b12 | 11), objArr3);
                        method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map2.put(290255894, method3);
                    }
                    cArr[i15] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i15++;
                    j10 = 0;
                    f6 = 0.0f;
                    i18 = 290255894;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        Object[] objArr4 = {Integer.valueOf(f57993l)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method4 = map3.get(290255894);
        if (method4 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 45 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1116);
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            c(b13, b14, (byte) (b14 | 11), objArr5);
            method4 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map3.put(290255894, method4);
        }
        char cCharValue = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i20 = f57996p + 57;
            f57995o = i20 % 128;
            int i21 = i20 % 2;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            int i22 = f57996p + 125;
            f57995o = i22 % 128;
            int i23 = i22 % 2;
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i24 = setincludefontpadding.setDividerPadding;
                if (i24 >= i11) {
                    break;
                }
                int i25 = f57996p + 45;
                f57995o = i25 % 128;
                if (i25 % 2 != 0) {
                    char c10 = charArray[i24];
                    setincludefontpadding.setY = c10;
                    char c11 = charArray[0];
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                    if (c10 == c11) {
                        cArr3[i24] = (char) (setincludefontpadding.setY - b10);
                        cArr3[i24 + 1] = (char) (setincludefontpadding.setCompoundDrawableTintBlendMode - b10);
                    } else {
                        Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        map = setTextScaleX.setMaxEms;
                        method = map.get(180437302);
                        if (method == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 27, 2311 - View.MeasureSpec.getMode(0));
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr7 = new Object[1];
                            c(b15, b16, (byte) (b16 | 8), objArr7);
                            String str2 = (String) objArr7[0];
                            Class<?> cls4 = Integer.TYPE;
                            method = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                            map.put(180437302, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                        i12 = setincludefontpadding.setNavigationOnClickListener;
                        if (iIntValue == i12) {
                            int i26 = f57995o + 37;
                            f57996p = i26 % 128;
                            int i27 = i26 % 2;
                            Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                            method2 = map.get(1989802713);
                            if (method2 != null) {
                                Class cls5 = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49102), 36 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2545 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                byte b17 = (byte) 0;
                                Object[] objArr9 = new Object[1];
                                c(b17, b17, (byte) f57997q.length, objArr9);
                                String str3 = (String) objArr9[0];
                                Class<?> cls6 = Integer.TYPE;
                                method2 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                                map.put(1989802713, method2);
                            }
                            int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr8)).intValue();
                            int i28 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                            int i29 = setincludefontpadding.setDividerPadding;
                            cArr3[i29] = cArr2[iIntValue2];
                            cArr3[i29 + 1] = cArr2[i28];
                            int i30 = f57996p + 13;
                            f57995o = i30 % 128;
                            int i31 = i30 % 2;
                        } else {
                            i13 = setincludefontpadding.setX;
                            i14 = setincludefontpadding.setOnFocusChangeListener;
                            if (i13 == i14) {
                                int i32 = f57996p + 105;
                                f57995o = i32 % 128;
                                int i33 = i32 % 2;
                                int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                                setincludefontpadding.setOnLongClickListener = iA;
                                int iA2 = a.a(i12, cCharValue, 1, cCharValue);
                                setincludefontpadding.setNavigationOnClickListener = iA2;
                                int i34 = (i14 * cCharValue) + iA2;
                                int i35 = setincludefontpadding.setDividerPadding;
                                cArr3[i35] = cArr2[(i13 * cCharValue) + iA];
                                cArr3[i35 + 1] = cArr2[i34];
                            } else {
                                int i36 = (i13 * cCharValue) + i12;
                                int i37 = (i14 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                                int i38 = setincludefontpadding.setDividerPadding;
                                cArr3[i38] = cArr2[i36];
                                cArr3[i38 + 1] = cArr2[i37];
                            }
                        }
                    }
                } else {
                    char c12 = charArray[i24];
                    setincludefontpadding.setY = c12;
                    char c13 = charArray[i24 + 1];
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c13;
                    if (c12 == c13) {
                        cArr3[i24] = (char) (setincludefontpadding.setY - b10);
                        cArr3[i24 + 1] = (char) (setincludefontpadding.setCompoundDrawableTintBlendMode - b10);
                    } else {
                        Object[] objArr10 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        map = setTextScaleX.setMaxEms;
                        method = map.get(180437302);
                        if (method == null) {
                            Class cls7 = (Class) setTextScaleX.setX((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 27, 2311 - View.MeasureSpec.getMode(0));
                            byte b18 = (byte) 0;
                            byte b19 = b18;
                            Object[] objArr11 = new Object[1];
                            c(b18, b19, (byte) (b19 | 8), objArr11);
                            String str4 = (String) objArr11[0];
                            Class<?> cls8 = Integer.TYPE;
                            method = cls7.getMethod(str4, Object.class, Object.class, cls8, Object.class, Object.class, cls8, Object.class, Object.class, cls8, Object.class, Object.class, cls8, Object.class);
                            map.put(180437302, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr10)).intValue();
                        i12 = setincludefontpadding.setNavigationOnClickListener;
                        if (iIntValue == i12) {
                            int i210 = f57995o + 37;
                            f57996p = i210 % 128;
                            int i211 = i210 % 2;
                            Object[] objArr12 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                            method2 = map.get(1989802713);
                            if (method2 != null) {
                                Class cls9 = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49102), 36 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2545 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                byte b110 = (byte) 0;
                                Object[] objArr13 = new Object[1];
                                c(b110, b110, (byte) f57997q.length, objArr13);
                                String str5 = (String) objArr13[0];
                                Class<?> cls10 = Integer.TYPE;
                                method2 = cls9.getMethod(str5, Object.class, Object.class, cls10, cls10, Object.class, Object.class, cls10, cls10, Object.class, cls10, Object.class);
                                map.put(1989802713, method2);
                            }
                            int iIntValue3 = ((Integer) ((Method) method2).invoke(null, objArr12)).intValue();
                            int i212 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                            int i213 = setincludefontpadding.setDividerPadding;
                            cArr3[i213] = cArr2[iIntValue3];
                            cArr3[i213 + 1] = cArr2[i212];
                            int i39 = f57996p + 13;
                            f57995o = i39 % 128;
                            int i310 = i39 % 2;
                        } else {
                            i13 = setincludefontpadding.setX;
                            i14 = setincludefontpadding.setOnFocusChangeListener;
                            if (i13 == i14) {
                                int i311 = f57996p + 105;
                                f57995o = i311 % 128;
                                int i312 = i311 % 2;
                                int iA3 = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                                setincludefontpadding.setOnLongClickListener = iA3;
                                int iA4 = a.a(i12, cCharValue, 1, cCharValue);
                                setincludefontpadding.setNavigationOnClickListener = iA4;
                                int i313 = (i14 * cCharValue) + iA4;
                                int i314 = setincludefontpadding.setDividerPadding;
                                cArr3[i314] = cArr2[(i13 * cCharValue) + iA3];
                                cArr3[i314 + 1] = cArr2[i313];
                            } else {
                                int i315 = (i13 * cCharValue) + i12;
                                int i316 = (i14 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                                int i317 = setincludefontpadding.setDividerPadding;
                                cArr3[i317] = cArr2[i315];
                                cArr3[i317 + 1] = cArr2[i316];
                            }
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                int i40 = f57995o + 15;
                f57996p = i40 % 128;
                int i41 = i40 % 2;
            }
        }
        for (int i42 = 0; i42 < i10; i42++) {
            cArr3[i42] = (char) (cArr3[i42] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 110 - r8
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.qu.f57997q
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r8
            r3 = r2
            r8 = r7
            r7 = r6
            goto L2e
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qu.c(int, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f57997q = new byte[]{28, 69, -30, 27};
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        Pair<String, Integer> pairInvoke;
        qu quVar = (qu) objArr[0];
        Function0<Pair<String, Integer>> function0 = quVar.f58005h;
        int i13 = 2;
        if (function0 != null) {
            int i14 = f57994n + 41;
            m = i14 % 128;
            if (i14 % 2 != 0) {
                function0.invoke();
                throw null;
            }
            pairInvoke = function0.invoke();
        } else {
            int i15 = m + 91;
            f57994n = i15 % 128;
            int i16 = i15 % 2;
            pairInvoke = null;
        }
        synchronized (quVar.f58004g) {
            try {
                ym.setX setx = new ym.setX();
                try {
                    String[] strArr = quVar.f57999b;
                    ArrayList arrayList = new ArrayList(strArr.length);
                    int length = strArr.length;
                    int i17 = 0;
                    while (i17 < length) {
                        String str = strArr[i17];
                        yg.Companion companion = yg.INSTANCE;
                        yg ygVar = (yg) yg.Companion.setDividerPadding(new Object[]{quVar.f57998a}, -655114145, 655114147, (int) System.currentTimeMillis());
                        arrayList.add(new xn.setOnFocusChangeListener((String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)), str));
                        i17++;
                        i13 = 2;
                    }
                    Object[] objArr2 = new Object[i13];
                    objArr2[0] = setx;
                    objArr2[1] = arrayList;
                    long j10 = quVar.f58000c;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    Boolean bool = mg.setY;
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    if (bool.booleanValue()) {
                        abr abrVar = new abr(qe.AnonymousClass1.setCompoundDrawableTintBlendMode);
                        Object[] objArr3 = new Object[1];
                        a("呋崷䚯䠃", Drawable.resolveOpacity(0, 0) + 2417, objArr3);
                        String lowerCase = ((String) objArr3[0]).intern().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        int iHashCode = lowerCase.hashCode();
                        if (iHashCode == 3029410) {
                            Object[] objArr4 = new Object[1];
                            a("呋崷䚯䠃", 2417 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
                            if (lowerCase.equals(((String) objArr4[0]).intern())) {
                            }
                        } else if (iHashCode != 93508654) {
                            if (iHashCode == 795307910) {
                                Object[] objArr5 = new Object[1];
                                b(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8, "\u000e\t\u0010\u000e\u0001\u0018㘫", (byte) ((Process.myPid() >> 22) + 66), objArr5);
                                if (lowerCase.equals(((String) objArr5[0]).intern())) {
                                }
                            }
                        } else {
                            Object[] objArr6 = new Object[1];
                            a("呋䭓橬ऑ⠦", TextUtils.indexOf("", "", 0, 0) + 7963, objArr6);
                            if (lowerCase.equals(((String) objArr6[0]).intern())) {
                            }
                        }
                    }
                    quVar.f58006i = pairInvoke;
                    if (pairInvoke != null) {
                    }
                    quVar.f58003f = (ym) ym.setX.setX(new Object[]{setx}, -1643781551, 1643781585, System.identityHashCode(setx));
                    Unit unit = Unit.INSTANCE;
                } catch (IllegalArgumentException e5) {
                    TerminalException terminalException = new TerminalException(10034, null, e5);
                    mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    @NotNull
    public final setY setCompoundDrawableTintBlendMode(@NotNull sr srVar) throws Throwable {
        ym ymVar;
        Intrinsics.checkNotNullParameter(srVar, "");
        yk.setDividerPadding setdividerpadding = new yk.setDividerPadding();
        yk.setDividerPadding setdividerpadding2 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding, this.f57998a}, -86147461, 86147468, System.identityHashCode(setdividerpadding));
        yh.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new yh.setCompoundDrawableTintBlendMode(null, 1, null);
        Object[] objArr = new Object[1];
        b(6 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0014\u0002\n\u0012㙑", (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 81), objArr);
        yh.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (yh.setCompoundDrawableTintBlendMode) yh.setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode, ((String) objArr[0]).intern(), (String) sr.setY(new Object[]{srVar}, 213627831, -213627831, System.identityHashCode(srVar))}, -1183851361, 1183851361, System.identityHashCode(setcompounddrawabletintblendmode));
        if (srVar instanceof st) {
            Object[] objArr2 = new Object[1];
            b((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, "\u0015\u0016\u0012\u0004\u0015\t\u0014\u000e\u0013\u0000", (byte) (93 - TextUtils.indexOf("", "", 0, 0)), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a("告\ud8b6䶦\uf295枋铢ᧄ軯㏃ꃇ픳娽켣簊\ue10aᙵ魵ࡹ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36083, objArr3);
            Object[] objArr4 = new Object[1];
            a("告繖f⩵ﰋ蘂ꠄ狅ӕ", ExpandableListView.getPackedPositionGroup(0L) + 10771, objArr4);
            st stVar = (st) srVar;
            Object[] objArr5 = new Object[1];
            b((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, "\u0002\u000f\u0013\t\u0004\u0017\u0007\u0015\u0000\u0001\u0018\u0001㙣", (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 117), objArr5);
        }
        yk.setDividerPadding setdividerpadding3 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2, (yh) yh.setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode2}, -1712660640, 1712660641, System.identityHashCode(setcompounddrawabletintblendmode2))}, -722632008, 722632019, System.identityHashCode(setdividerpadding2));
        yk ykVar = (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding3}, 721744858, -721744846, System.identityHashCode(setdividerpadding3));
        synchronized (this.f58004g) {
            try {
                Function0<Pair<String, Integer>> function0 = this.f58005h;
                Pair<String, Integer> pairInvoke = function0 != null ? function0.invoke() : null;
                if (this.f58003f == null || qi.setX(this.f58006i, pairInvoke)) {
                    mr mrVar = mr.getAmountFieldTextColor;
                    Object[] objArr6 = new Object[1];
                    a("呠휢劒\ude0a姡앫䃇챙伂쪫瘍\uf19a絴\uf8e9摞\ue788抺\uee04概镵ჱ鱛῍骷١膐ഊ裫㐭럵㍀븐㦽ꔒ⃧걇\u2fd9ꭋ혶冮\udd05", 33646 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr6);
                    mt.setX(new Object[]{mrVar, ((String) objArr6[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
                    setY(new Object[]{this}, -837982483, 837982483, (int) System.currentTimeMillis());
                }
                ymVar = this.f58003f;
                if (ymVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    ymVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object dividerPadding = qe.setDividerPadding(new Object[]{ymVar, ykVar}, -664672934, 664672934, (int) System.currentTimeMillis());
        ResultKt.throwOnFailure(dividerPadding);
        pw pwVar = (pw) dividerPadding;
        mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(TerminalSdk.Configuration.DEFAULT_TOTAL_ELAPSED_TIMEOUT), pwVar, null, 4}, -1968587119, 1968587120, TerminalSdk.Configuration.DEFAULT_TOTAL_ELAPSED_TIMEOUT);
        int y7 = pwVar.setY();
        if (200 <= y7) {
            int i10 = f57994n;
            int i11 = i10 + 63;
            m = i11 % 128;
            if (i11 % 2 == 0 ? y7 < 300 : y7 < 8223) {
                int i12 = i10 + 61;
                m = i12 % 128;
                int i13 = i12 % 2;
                JSONObject jSONObjectInvoke = this.f58001d.invoke(pwVar, 10067);
                Object[] objArr7 = new Object[1];
                b(10 - Color.blue(0), "\u0017\u000e\u0013\u0001\u0001\b\u0014\u000e\u0013\u0000", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 70), objArr7);
                String string = jSONObjectInvoke.getString(((String) objArr7[0]).intern());
                Object[] objArr8 = new Object[1];
                a("呈ᰡ쒜贍痶㹍\ue6f4꺰\u171e\udf81聢䣞", 18539 - Color.argb(0, 0, 0, 0), objArr8);
                String string2 = jSONObjectInvoke.getString(((String) objArr8[0]).intern());
                Object[] objArr9 = new Object[1];
                b(11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0000\u0003\u0013\n\u0018\u0001\u0015\u0007\r\u0004", (byte) (Color.rgb(0, 0, 0) + 16777245), objArr9);
                return new setY(string, string2, Integer.valueOf(jSONObjectInvoke.getInt(((String) objArr9[0]).intern())));
            }
        } else {
            int i14 = m + 13;
            f57994n = i14 % 128;
            int i15 = i14 % 2;
        }
        this.f58002e.invoke(pwVar, 10067);
        throw new KotlinNothingValueException();
    }

    public final void setY(@NotNull Function0<Pair<String, Integer>> function0) {
        int i10 = f57994n + 15;
        m = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.f58005h = function0;
            setY(new Object[]{this}, -837982483, 837982483, (int) System.currentTimeMillis());
            int i11 = 27 / 0;
            return;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        this.f58005h = function0;
        setY(new Object[]{this}, -837982483, 837982483, (int) System.currentTimeMillis());
    }
}
