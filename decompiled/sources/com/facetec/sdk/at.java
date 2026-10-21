package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
final class at {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f40386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f40387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f40388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static at f40389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int f40390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int[] f40391f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f40392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f40393i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f40394k;
    private static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f40395n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final kl f40396g = d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TelephonyManager f40397j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f40404a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f40405d;

        public a(boolean z10, boolean z11) {
            this.f40404a = z10;
            this.f40405d = z11;
        }
    }

    @FunctionalInterface
    public interface c {
        void onCompletion(@Nullable a aVar);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f40394k = 0;
        m = 1;
        b();
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getFadingEdgeLength();
        Process.myPid();
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        f40390e = 0;
        Object[] objArr = new Object[1];
        l(new int[]{-378486025, -903247401, 1485821666, 1992321745, 849600535, -1219243693, -299723623, -1965958415, -320197775, 2080280017, -1498180800, 1070916936, -1341090637, 1742168526, -1853752336, 1811188792, -1471777920, 296224359, 95564714, -1603362883, -1809671104, -2000291061}, 44 - Color.blue(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        l(new int[]{-1417014315, 384188260, 605722798, 1850947063, -1559769753, -1701398311, 1934219004, -1316870208, 1679427897, 457084383, 1480922057, 1810972537, -3789521, -1447677972, 1535693845, 136310605, 749325251, 687408748, 875854985, 1841622754, -1055757818, 1424438732}, 44 - View.resolveSize(0, 0), objArr2);
        f40393i = new String[]{strIntern, ((String) objArr2[0]).intern()};
        int i10 = m + 101;
        f40394k = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private at(Context context) throws Throwable {
        Object[] objArr = new Object[1];
        l(new int[]{549106936, 1941957373, -1689423544, 479527278}, 5 - Color.argb(0, 0, 0, 0), objArr);
        this.f40397j = (TelephonyManager) context.getSystemService(((String) objArr[0]).intern());
        if (f40392h == null) {
            f40392h = bg.b(context, true);
        }
        if (f40388c == null) {
            f40388c = context.getPackageName();
        }
        if (f40387b == null) {
            f40387b = ay.d(context);
        }
    }

    public static String a(String str) throws Throwable {
        Object[] objArr = new Object[1];
        o("ี", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27479, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Locale locale = Locale.getDefault();
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        o("ฯԗᡔ⾑⋁㘗䵐䂌埂欚織疀補鰔鍟Ꚋ뷖넏쑃\udb98", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2878, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        androidx.collection.k.e(sb2, f40388c, strIntern, str, strIntern);
        sb2.append(f40392h);
        sb2.append(strIntern);
        sb2.append(Build.MODEL);
        sb2.append(strIntern);
        sb2.append(FaceTecSDK.version());
        sb2.append(strIntern);
        sb2.append(locale.toString());
        sb2.append(strIntern);
        sb2.append(locale.getLanguage());
        sb2.append(strIntern);
        sb2.append(cc.f40802c);
        String string = sb2.toString();
        int i10 = m + 107;
        f40394k = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i10, int i11, int i12) {
        int i13 = 0;
        c cVar = (c) objArr[0];
        a aVar = (a) objArr[1];
        int i14 = m + 121;
        f40394k = i14 % 128;
        int i15 = i14 % 2;
        if (cVar != null) {
            AsyncTask.execute(new h1(cVar, aVar, i13));
        }
        int i16 = f40394k + 59;
        m = i16 % 128;
        int i17 = i16 % 2;
        return null;
    }

    private synchronized void c(Context context, final c cVar) {
        final Context applicationContext = context.getApplicationContext();
        try {
            Object[] objArr = new Object[1];
            l(new int[]{-892100381, 715900726, -547276891, -1334610068, 1354880111, 1310785361, -1129923100, 238111785, -1389705270, 1070311630, 174276675, -244831609, -74886822, -237582884, 86605324, 1363334016, -1129923100, 238111785, -1041205888, 1359103479, 1584518840, -1037302480}, 43 - ExpandableListView.getPackedPositionChild(0L), objArr);
            this.f40396g.c(f.d(context, ((String) objArr[0]).intern(), Boolean.FALSE).c(new ki.c().d()).e()).e(new jy() { // from class: com.facetec.sdk.at.3
                @Override // com.facetec.sdk.jy
                public final void a() {
                    at.b(cVar, null);
                }

                @Override // com.facetec.sdk.jy
                public final void e(@NonNull kq kqVar) throws Throwable {
                    if (kqVar.d()) {
                        kt ktVarA = kqVar.a();
                        at.e(applicationContext, ktVarA != null ? ktVarA.a() : "", cVar);
                    } else if (kqVar.e() == 401) {
                        at.b(cVar, new a(false, false));
                    } else {
                        at.b(cVar, null);
                    }
                }
            });
            int i10 = m + 113;
            f40394k = i10 % 128;
            int i11 = i10 % 2;
        } catch (f.a unused) {
            b(new Object[]{cVar, null}, -705317143, 705317143, (int) System.currentTimeMillis());
        }
    }

    public static /* synthetic */ void e(Context context, String str, c cVar) throws Throwable {
        int i10 = m + 39;
        f40394k = i10 % 128;
        int i11 = i10 % 2;
        a(context, str, cVar);
        if (i11 != 0) {
            int i12 = 58 / 0;
        }
    }

    public static void init$0() {
        $$a = new byte[]{123, 94, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 33};
        $$b = 239;
    }

    private static void l(int[] iArr, int i10, Object[] objArr) throws Throwable {
        char[] cArr;
        Object method;
        int length;
        int[] iArr2;
        int i11;
        gx gxVar = new gx();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = f40391f;
        int i12 = 36773;
        int i13 = 835167305;
        int i14 = 16;
        int i15 = 0;
        if (iArr3 != null) {
            int i16 = $11 + 25;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i11 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i11 = 0;
            }
            while (i11 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i15] = Integer.valueOf(iArr3[i11]);
                    Map map = bp.f40694x;
                    Object method2 = map.get(Integer.valueOf(i13));
                    if (method2 == null) {
                        Class cls = (Class) bp.a(24 - (ViewConfiguration.getMinimumFlingVelocity() >> i14), View.MeasureSpec.makeMeasureSpec(i15, i15) + 765, (char) (i12 - (ViewConfiguration.getScrollBarSize() >> 8)));
                        byte b10 = (byte) i15;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        p(b10, b11, b11, objArr3);
                        method2 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(835167305, method2);
                    }
                    iArr2[i11] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i11++;
                    i12 = 36773;
                    i13 = 835167305;
                    i14 = 16;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f40391f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i17 = 0;
            while (i17 < length3) {
                int i18 = $11 + 15;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i17])};
                    Map map2 = bp.f40694x;
                    Object method3 = map2.get(835167305);
                    if (method3 == null) {
                        Class cls2 = (Class) bp.a(KeyEvent.keyCodeFromString("") + 24, (ViewConfiguration.getTouchSlop() >> 8) + 765, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 36773));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        p(b12, b13, b13, objArr5);
                        method3 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(835167305, method3);
                    }
                    iArr6[i17] = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
                } else {
                    cArr3 = cArr3;
                    length3 = length3;
                    Object[] objArr6 = {Integer.valueOf(iArr5[i17])};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(835167305);
                    if (method4 == null) {
                        Class cls3 = (Class) bp.a(24 - TextUtils.getOffsetBefore("", 0), View.MeasureSpec.getSize(0) + 765, (char) (36773 - View.MeasureSpec.getMode(0)));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        p(b14, b15, b15, objArr7);
                        method4 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
                        map3.put(835167305, method4);
                    }
                    iArr6[i17] = ((Integer) ((Method) method4).invoke(null, objArr6)).intValue();
                    i17++;
                }
                length3 = length3;
                cArr3 = cArr3;
            }
            cArr = cArr3;
            iArr5 = iArr6;
        } else {
            cArr = cArr3;
        }
        char c10 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        gxVar.f41838c = 0;
        while (true) {
            int i19 = gxVar.f41838c;
            if (i19 >= iArr.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i20 = iArr[i19];
            char c11 = (char) (i20 >> 16);
            cArr2[c10] = c11;
            char c12 = (char) i20;
            cArr2[1] = c12;
            char c13 = (char) (iArr[i19 + 1] >> 16);
            cArr2[2] = c13;
            char c14 = (char) iArr[i19 + 1];
            cArr2[3] = c14;
            gxVar.f41839d = (c11 << 16) + c12;
            gxVar.f41837a = (c13 << 16) + c14;
            gx.b(iArr4);
            int i21 = 0;
            for (int i22 = 16; i21 < i22; i22 = 16) {
                int i23 = $11 + 27;
                $10 = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = gxVar.f41839d ^ iArr4[i21];
                    gxVar.f41839d = i24;
                    Object[] objArr8 = {gxVar, Integer.valueOf(gx.e(i24)), gxVar, gxVar};
                    Map map4 = bp.f40694x;
                    Object method5 = map4.get(147461875);
                    if (method5 == null) {
                        Class cls4 = (Class) bp.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 23, 1026 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (38453 - (ViewConfiguration.getLongPressTimeout() >> 16)));
                        byte length4 = (byte) $$a.length;
                        Object[] objArr9 = new Object[1];
                        p((byte) 0, length4, (byte) (length4 - 4), objArr9);
                        method5 = cls4.getMethod((String) objArr9[0], Object.class, Integer.TYPE, Object.class, Object.class);
                        map4.put(147461875, method5);
                    }
                    int iIntValue = ((Integer) ((Method) method5).invoke(null, objArr8)).intValue();
                    gxVar.f41839d = gxVar.f41837a;
                    gxVar.f41837a = iIntValue;
                    i21 += 57;
                } else {
                    int i25 = gxVar.f41839d ^ iArr4[i21];
                    gxVar.f41839d = i25;
                    Object[] objArr10 = {gxVar, Integer.valueOf(gx.e(i25)), gxVar, gxVar};
                    Map map5 = bp.f40694x;
                    Object method6 = map5.get(147461875);
                    if (method6 == null) {
                        Class cls5 = (Class) bp.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22, 1025 - KeyEvent.normalizeMetaState(0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 38454));
                        byte length5 = (byte) $$a.length;
                        Object[] objArr11 = new Object[1];
                        p((byte) 0, length5, (byte) (length5 - 4), objArr11);
                        method6 = cls5.getMethod((String) objArr11[0], Object.class, Integer.TYPE, Object.class, Object.class);
                        map5.put(147461875, method6);
                    }
                    int iIntValue2 = ((Integer) ((Method) method6).invoke(null, objArr10)).intValue();
                    gxVar.f41839d = gxVar.f41837a;
                    gxVar.f41837a = iIntValue2;
                    i21++;
                }
            }
            int i26 = gxVar.f41839d;
            int i27 = gxVar.f41837a;
            int i28 = i26 ^ iArr4[16];
            gxVar.f41837a = i28;
            int i29 = i27 ^ iArr4[17];
            gxVar.f41839d = i29;
            cArr2[0] = (char) (i29 >>> 16);
            cArr2[1] = (char) i29;
            cArr2[2] = (char) (i28 >>> 16);
            cArr2[3] = (char) i28;
            gx.b(iArr4);
            int i30 = gxVar.f41838c;
            cArr[i30 * 2] = cArr2[0];
            cArr[(i30 * 2) + 1] = cArr2[1];
            cArr[(i30 * 2) + 2] = cArr2[2];
            cArr[(i30 * 2) + 3] = cArr2[3];
            Object[] objArr12 = {gxVar, gxVar};
            Map map6 = bp.f40694x;
            Object obj = map6.get(-1856717708);
            if (obj != null) {
                method = obj;
            } else {
                Class cls6 = (Class) bp.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 789, (char) (26624 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                byte b16 = (byte) 0;
                byte b17 = (byte) (b16 + 3);
                Object[] objArr13 = new Object[1];
                p(b16, b17, (byte) (b17 - 3), objArr13);
                method = cls6.getMethod((String) objArr13[0], Object.class, Object.class);
                map6.put(-1856717708, method);
            }
            ((Method) method).invoke(null, objArr12);
            c10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x016b  */
    /* JADX WARN: Code duplicated, block: B:41:0x016c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    private static void o(String str, int i10, Object[] objArr) throws Throwable {
        Object charArray;
        int i11;
        Throwable cause;
        int i12 = $10;
        int i13 = i12 + 15;
        $11 = i13 % 128;
        char c10 = 2;
        if (i13 % 2 == 0) {
            int i14 = 97 / 0;
            if (str != null) {
                int i15 = i12 + 101;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
        } else if (str != null) {
            int i17 = i12 + 101;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = (char[]) charArray;
        gw gwVar = new gw();
        gwVar.f41836e = i10;
        int length = cArr.length;
        long[] jArr = new long[length];
        gwVar.f41835a = 0;
        while (true) {
            int i19 = gwVar.f41835a;
            if (i19 >= cArr.length) {
                break;
            }
            char c11 = cArr[i19];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = gwVar;
                objArr2[1] = gwVar;
                objArr2[0] = Integer.valueOf(c11);
                Map map = bp.f40694x;
                Object method = map.get(346539884);
                if (method == null) {
                    method = ((Class) bp.a(23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.green(0) + 245, (char) TextUtils.getOffsetAfter("", 0))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                    map.put(346539884, method);
                }
                jArr[i19] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f40395n ^ (-4932774504156859221L));
                Object[] objArr3 = {gwVar, gwVar};
                Object method2 = map.get(593077425);
                if (method2 == null) {
                    method2 = ((Class) bp.a(23 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 149, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)))).getMethod("q", Object.class, Object.class);
                    map.put(593077425, method2);
                }
                ((Method) method2).invoke(null, objArr3);
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
        char[] cArr2 = new char[length];
        gwVar.f41835a = 0;
        int i20 = $10 + 113;
        $11 = i20 % 128;
        int i21 = 2;
        int i22 = i20 % 2;
        while (true) {
            int i23 = gwVar.f41835a;
            if (i23 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[i23] = (char) jArr[i23];
            Object[] objArr4 = new Object[i21];
            objArr4[1] = gwVar;
            objArr4[0] = gwVar;
            Map map2 = bp.f40694x;
            Object method3 = map2.get(593077425);
            if (method3 != null) {
                i11 = 2;
            } else {
                i11 = 2;
                method3 = ((Class) bp.a(Color.blue(0) + 23, ImageFormat.getBitsPerPixel(0) + 151, (char) TextUtils.indexOf("", "", 0))).getMethod("q", Object.class, Object.class);
                map2.put(593077425, method3);
            }
            ((Method) method3).invoke(null, objArr4);
            i21 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void p(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 121 - r7
            byte[] r0 = com.facetec.sdk.at.$$a
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L2f:
            int r8 = -r8
            int r7 = r7 + r8
            int r6 = r6 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.at.p(short, short, int, java.lang.Object[]):void");
    }

    @NonNull
    public static synchronized at d(Context context) {
        try {
            int i10 = m + 7;
            f40394k = i10 % 128;
            int i11 = i10 % 2;
            if (f40389d == null) {
                f40389d = new at(context);
                int i12 = m + 99;
                f40394k = i12 % 128;
                int i13 = i12 % 2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40389d;
    }

    public static synchronized void e() {
        try {
            int i10 = m + 99;
            f40394k = i10 % 128;
            if (i10 % 2 != 0) {
                f40389d = null;
                int i11 = 8 / 0;
            } else {
                f40389d = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void b(c cVar, a aVar) {
        int i10 = f40394k + 3;
        m = i10 % 128;
        int i11 = i10 % 2;
        b(new Object[]{cVar, aVar}, -705317143, 705317143, (int) System.currentTimeMillis());
        int i12 = f40394k + 107;
        m = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static void b() {
        f40391f = new int[]{720038973, -1397899970, -1390653859, -124671548, -272133771, -321882952, -287257577, -1065470097, 1063780220, 372249843, 264540930, -554946216, -1869801177, 1053508256, 850496690, -1792502999, 2000759379, -1613500907};
        f40395n = 8400508292826823394L;
    }

    private static synchronized kl d() {
        kl klVarD;
        try {
            jv.b bVar = new jv.b();
            for (String str : f40393i) {
                Object[] objArr = new Object[1];
                o("ำ㫯枴避\udd0c\u09d1㊋罞\ua82f픻Ǽ䪇", View.MeasureSpec.getSize(0) + 13513, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr2 = new Object[1];
                o("ฺ\uda1aꙞ狊庐⭘\uf704", AndroidCharacter.getMirror('0') + 54283, objArr2);
                sb2.append(((String) objArr2[0]).intern());
                sb2.append(str);
                String[] strArr = {sb2.toString()};
                if (strIntern == null) {
                    throw new NullPointerException("pattern == null");
                }
                for (int i10 = 0; i10 <= 0; i10++) {
                    bVar.f41915c.add(new jv.c(strIntern, strArr[0]));
                }
            }
            kl.d dVar = new kl.d();
            dVar.f42097p = bVar.a();
            klVarD = dVar.d();
            kg kgVarM = klVarD.m();
            synchronized (kgVarM) {
                kgVarM.f42026c = 1;
            }
            kgVarM.c();
        } catch (Throwable th2) {
            throw th2;
        }
        return klVarD;
    }

    private static void c(c cVar, a aVar) {
        b(new Object[]{cVar, aVar}, -705317143, 705317143, (int) System.currentTimeMillis());
    }

    @NonNull
    public static kl e(Context context) {
        int i10 = f40394k + 75;
        m = i10 % 128;
        int i11 = i10 % 2;
        kl klVar = d(context).f40396g;
        if (i11 == 0) {
            throw null;
        }
        int i12 = m + 71;
        f40394k = i12 % 128;
        if (i12 % 2 == 0) {
            return klVar;
        }
        throw null;
    }

    public final void e(Context context, m mVar, final boolean z10, final b bVar) {
        String strIntern;
        String strIntern2;
        String string;
        dv dvVarA = new dy().d().a();
        eh ehVar = new eh();
        if (mVar.f42383a == s.FACE_SCAN) {
            Object[] objArr = new Object[1];
            l(new int[]{1600336734, 1320742038, 1269589032, 1650297976, -1074889095, -1716057268, -301650664, 1812276306}, View.MeasureSpec.makeMeasureSpec(0, 0) + 14, objArr);
            ehVar.a(((String) objArr[0]).intern(), mVar.f42385c);
            if (bg.d()) {
                Object[] objArr2 = new Object[1];
                l(new int[]{1237647864, 1760792661}, (KeyEvent.getMaxKeyCode() >> 16) + 2, objArr2);
                ehVar.a(((String) objArr2[0]).intern(), l.f42226b);
            }
            ec ecVarC = dvVarA.c(mVar.f42386d);
            Object[] objArr3 = new Object[1];
            o("ฦ\uf70a", (ViewConfiguration.getJumpTapTimeout() >> 16) + 63799, objArr3);
            ehVar.b(((String) objArr3[0]).intern(), ecVarC);
            if (z10) {
                ee eeVar = new ee();
                Object[] objArr4 = new Object[1];
                l(new int[]{664109908, -1465881958, -1242681526, 1321443701, 1306801564, -1450436688, -2140332978, -1074310849}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, objArr4);
                eeVar.e(((String) objArr4[0]).intern());
                Object[] objArr5 = new Object[1];
                o("\u0e3d鬭␤넵", KeyEvent.getDeadChar(0, 0) + 38149, objArr5);
                ehVar.b(((String) objArr5[0]).intern(), eeVar);
            }
            Object[] objArr6 = new Object[1];
            o("ฬ䑰骕턣❹綖뀮ٍ岟録\ue97c㾑爮졑Ợ唿ꭗ\ue1c7㐳", TextUtils.indexOf("", "", 0, 0) + 19031, objArr6);
            ehVar.a(((String) objArr6[0]).intern(), mVar.f42384b);
            Object[] objArr7 = new Object[1];
            o("อ漯찶ⴃ訛\ueb6d䡠\ua954٘枭쒌▉芎\ue3f9䃲ꇇỗ翿\udd23", (ViewConfiguration.getLongPressTimeout() >> 16) + 24847, objArr7);
            ehVar.a(((String) objArr7[0]).intern(), mVar.f42389h);
            Object[] objArr8 = new Object[1];
            o("อ粯\ueb36妃쐛㋭ꅠ⿔驘भ瞖\ue208", 29327 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr8);
            ehVar.a(((String) objArr8[0]).intern(), mVar.f42391j);
            Object[] objArr9 = new Object[1];
            l(new int[]{661330593, -1653695171, 2024802860, -1118365876}, 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr9);
            ehVar.a(((String) objArr9[0]).intern(), f40392h);
            Object[] objArr10 = new Object[1];
            o("อ眓ﱁ斝\uead6倗\ud97d庑쟜䴛", KeyEvent.getDeadChar(0, 0) + 31039, objArr10);
            ehVar.a(((String) objArr10[0]).intern(), Build.MANUFACTURER);
            Object[] objArr11 = new Object[1];
            l(new int[]{661330593, -1653695171, 467563089, -1809846435, 1378888087, -1152762686}, (ViewConfiguration.getLongPressTimeout() >> 16) + 11, objArr11);
            ehVar.a(((String) objArr11[0]).intern(), Build.MODEL);
            Object[] objArr12 = new Object[1];
            o("อꎍ啽ۃ뢮樉῀녝挗ᒅ왱篑ⶬ\udf0b烩", TextUtils.indexOf((CharSequence) "", '0', 0) + 44450, objArr12);
            ehVar.a(((String) objArr12[0]).intern(), Build.VERSION.RELEASE);
            Object[] objArr13 = new Object[1];
            o("อﺣ\uef21\udf8d찖볧굜鷓詥笷殯堉", 61582 - Process.getGidForName(""), objArr13);
            String strIntern3 = ((String) objArr13[0]).intern();
            Object[] objArr14 = new Object[1];
            o("จﲴ\ueb0b\ud982쑪닿ꅟ", TextUtils.lastIndexOf("", '0', 0, 0) + 62100, objArr14);
            ehVar.a(strIntern3, ((String) objArr14[0]).intern());
            Object[] objArr15 = new Object[1];
            o("อ劋띱ᯕ粶셯◡蚪\ueb10俸邫", View.MeasureSpec.getMode(0) + 23719, objArr15);
            ehVar.a(((String) objArr15[0]).intern(), Build.BRAND);
            Object[] objArr16 = new Object[1];
            l(new int[]{661330593, -1653695171, -1950909861, 1626315747, 735148177, 1497219581, -37138794, 1743456412}, View.getDefaultSize(0, 0) + 16, objArr16);
            ehVar.a(((String) objArr16[0]).intern(), Build.BOOTLOADER);
            Object[] objArr17 = new Object[1];
            l(new int[]{661330593, -1653695171, 446199217, 1253193287, -1362178835, -151600852, -1387216568, -1802752053, -1930448097, 1434764788}, 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr17);
            ehVar.a(((String) objArr17[0]).intern(), Build.FINGERPRINT);
            Object[] objArr18 = new Object[1];
            l(new int[]{661330593, -1653695171, -1014927973, 1826392924, 304599861, 1653909946, 1584518840, -1037302480}, MotionEvent.axisFromString("") + 17, objArr18);
            ehVar.a(((String) objArr18[0]).intern(), Integer.valueOf(Build.VERSION.SDK_INT));
            Object[] objArr19 = new Object[1];
            o("สㇶ熆녕\uf16bㄢ烫냭\uf0b2ぉ瀖뀿\uf3c8", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16339, objArr19);
            ehVar.a(((String) objArr19[0]).intern(), f40388c);
            Object[] objArr20 = new Object[1];
            l(new int[]{-1129923100, 238111785, 2039781850, -1390787995, 201283306, -2016973089}, ((Process.getThreadPriority(0) + 20) >> 6) + 11, objArr20);
            ehVar.a(((String) objArr20[0]).intern(), FaceTecSDK.version());
            Object[] objArr21 = new Object[1];
            o("ศ변毋ᛎ엄烷㿾\ueaf2駨䓧\uf39d뺳涁", TextUtils.lastIndexOf("", '0', 0, 0) + 45818, objArr21);
            ehVar.a(((String) objArr21[0]).intern(), Integer.valueOf(bg.f40539c));
            Object[] objArr22 = new Object[1];
            l(new int[]{1690041808, 1434563179, 3814584, -1160769725, 1861064515, -1355014276, -565064755, 395079649, 427100207, 1436332988, -1913222412, -575919617, -1201206264, 21446457, -972948755, 123713553}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32, objArr22);
            ehVar.a(((String) objArr22[0]).intern(), ag.f40231a);
            int i10 = m + 67;
            f40394k = i10 % 128;
            if (i10 % 2 != 0) {
                Object[] objArr23 = new Object[1];
                l(new int[]{661330593, -1653695171, -1952375108, -503588796, 581853400, -237639566, -1398276874, -524314680, 1537291092, 430970772}, 81 >> (ViewConfiguration.getDoubleTapTimeout() >> 41), objArr23);
                strIntern2 = ((String) objArr23[0]).intern();
                string = Arrays.toString(Build.SUPPORTED_ABIS);
            } else {
                Object[] objArr24 = new Object[1];
                l(new int[]{661330593, -1653695171, -1952375108, -503588796, 581853400, -237639566, -1398276874, -524314680, 1537291092, 430970772}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19, objArr24);
                strIntern2 = ((String) objArr24[0]).intern();
                string = Arrays.toString(Build.SUPPORTED_ABIS);
            }
            ehVar.a(strIntern2, string);
        } else {
            Object[] objArr25 = new Object[1];
            o("ภ잺鴔勯⡴\ue1d4", KeyEvent.getDeadChar(0, 0) + 51607, objArr25);
            ehVar.a(((String) objArr25[0]).intern(), (Number) 1);
            if (mVar.f42383a == s.ID_SCAN_ONLY) {
                Object[] objArr26 = new Object[1];
                l(new int[]{-1291350262, 206487048, -1800238732, 1848998960, -1817381704, 431201911}, TextUtils.indexOf((CharSequence) "", '0', 0) + 11, objArr26);
                ehVar.a(((String) objArr26[0]).intern(), (Number) 1);
                cc.f40802c = mVar.f42388g;
                mVar.f42386d.add(bx.a(ak.f40293j));
                ec ecVarC2 = dvVarA.c(mVar.f42386d);
                Object[] objArr27 = new Object[1];
                o("ฦ\uf70a", 63799 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr27);
                ehVar.b(((String) objArr27[0]).intern(), ecVarC2);
            } else {
                ee eeVar2 = new ee();
                eeVar2.e(bx.a(ak.f40293j));
                Object[] objArr28 = new Object[1];
                o("ฦ\uf70a", 63798 - ImageFormat.getBitsPerPixel(0), objArr28);
                ehVar.b(((String) objArr28[0]).intern(), eeVar2);
            }
            Object[] objArr29 = new Object[1];
            o("ำ釸ㆧ", 40898 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr29);
            ehVar.a(((String) objArr29[0]).intern(), (Number) 1);
            Object[] objArr30 = new Object[1];
            o("อ贈\ue6b9틵", 62533 - (Process.myPid() >> 22), objArr30);
            ehVar.a(((String) objArr30[0]).intern(), cc.f40802c);
            Object[] objArr31 = new Object[1];
            o("อ⳻䮖暼蕖", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8923, objArr31);
            ehVar.a(((String) objArr31[0]).intern(), mVar.f42388g);
            Object[] objArr32 = new Object[1];
            o("ศ珪", 32203 - TextUtils.getCapsMode("", 0, 0), objArr32);
            ehVar.a(((String) objArr32[0]).intern(), bg.f40537a);
            Object[] objArr33 = new Object[1];
            o("ศ✑", 10559 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr33);
            ehVar.a(((String) objArr33[0]).intern(), f40388c);
            Object[] objArr34 = new Object[1];
            o("อ\ue8cd", Drawable.resolveOpacity(0, 0) + 59113, objArr34);
            ehVar.a(((String) objArr34[0]).intern(), Build.MODEL);
            Object[] objArr35 = new Object[1];
            l(new int[]{-651328432, 219731014}, 2 - Color.blue(0), objArr35);
            ehVar.a(((String) objArr35[0]).intern(), FaceTecSDK.version());
            Object[] objArr36 = new Object[1];
            l(new int[]{529670402, 1059334430}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, objArr36);
            ehVar.a(((String) objArr36[0]).intern(), UUID.randomUUID().toString());
            Object[] objArr37 = new Object[1];
            l(new int[]{1094045448, 1532691720, -191589971, 1020862680}, Gravity.getAbsoluteGravity(0, 0) + 8, objArr37);
            ehVar.a(((String) objArr37[0]).intern(), "");
            Object[] objArr38 = new Object[1];
            o("อ珛", 32251 - View.MeasureSpec.getSize(0), objArr38);
            ehVar.a(((String) objArr38[0]).intern(), f40392h);
        }
        Object[] objArr39 = new Object[1];
        o("ฯ롷抔ⴱ흁臷䠐\uf2fe볂杺ᆔ\ud872艍䳨\uf71eꆾ毊", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46687, objArr39);
        SharedPreferences sharedPreferences = context.getSharedPreferences(((String) objArr39[0]).intern(), 0);
        Object[] objArr40 = new Object[1];
        l(new int[]{-1362574782, -363784487, 279266212, 896528805, -2010483270, 494221844, -1263555393, 140383823, -873671867, -191190261, -1198015089, -1005841112, -519385529, -1364473281, -944956836, 1495724701}, 30 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr40);
        String string2 = sharedPreferences.getString(((String) objArr40[0]).intern(), null);
        if (string2 != null) {
            Object[] objArr41 = new Object[1];
            o("ฬ䀡鈢\ue42f㘱", 19973 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr41);
            ehVar.a(((String) objArr41[0]).intern(), string2);
        } else {
            Object[] objArr42 = new Object[1];
            o("ฬ䀡鈢\ue42f㘱", 19973 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr42);
            ehVar.a(((String) objArr42[0]).intern(), "");
            int i11 = m + 17;
            f40394k = i11 % 128;
            int i12 = i11 % 2;
        }
        String str = mVar.f42387e;
        if (str == null || str.isEmpty()) {
            Object[] objArr43 = new Object[1];
            l(new int[]{-892100381, 715900726, -547276891, -1334610068, 1354880111, 1310785361, -1129923100, 238111785, -1389705270, 1070311630, 174276675, -244831609, -74886822, -237582884, -1728404873, -658884412, -1227343851, -1903478565, -1341154802, -896749823, -582395085, 497875223, 1485529139, -1640980188}, 46 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr43);
            strIntern = ((String) objArr43[0]).intern();
        } else {
            Object[] objArr44 = new Object[1];
            l(new int[]{1237989917, 154550684, -339999896, 351014280, -1243139623, 932948875, 91300878, 1645404159}, 15 - Drawable.resolveOpacity(0, 0), objArr44);
            ehVar.a(((String) objArr44[0]).intern(), str);
            Object[] objArr45 = new Object[1];
            o("ม勬랟ᡊ絾\ude66⊀蟑\ue8a2䵱글\uf2da埠룺ᵝ縙쌶⟅袚\uedbf乩錄\uf791壭붾ṍ捉쑶⢦跖\uee06㌩鐓\uf8d7巤뺷̂搘줦ⷿ躆퍞㑬餡\ufdd1庝ꎤѥ椼쨺⻩玅푏", 23761 - (Process.myTid() >> 22), objArr45);
            strIntern = ((String) objArr45[0]).intern();
        }
        try {
            this.f40396g.c(f.e(context, strIntern, ehVar)).e(new jy() { // from class: com.facetec.sdk.at.5
                @Override // com.facetec.sdk.jy
                public final void a() {
                    bVar.d(z10);
                }

                @Override // com.facetec.sdk.jy
                public final void e(kq kqVar) throws IOException {
                    if (!kqVar.d()) {
                        bVar.d(z10);
                    } else {
                        at.f40390e++;
                        bVar.e();
                    }
                }
            });
        } catch (f.a e5) {
            e5.printStackTrace();
        }
    }

    public static abstract class b {
        public void e() {
        }

        public void d(boolean z10) {
        }
    }

    public static void a(Context context, c cVar) {
        int i10 = m + 67;
        f40394k = i10 % 128;
        int i11 = i10 % 2;
        d(context).c(context, cVar);
        int i12 = m + 69;
        f40394k = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private static void a(Context context, String str, c cVar) throws Throwable {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zBooleanValue;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object[] objArr = new Object[1];
            l(new int[]{1094045448, 1532691720}, 4 - View.MeasureSpec.getSize(0), objArr);
            JSONObject jSONObject2 = jSONObject.getJSONObject(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            l(new int[]{-1020773157, 650452948}, 2 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
            if (!(!jSONObject2.getBoolean(((String) objArr2[0]).intern()))) {
                try {
                    if (bg.d()) {
                        Object[] objArr3 = new Object[1];
                        l(new int[]{784894770, 1906199188}, (KeyEvent.getMaxKeyCode() >> 16) + 4, objArr3);
                        String string = jSONObject2.getString(((String) objArr3[0]).intern());
                        Object[] objArr4 = new Object[1];
                        o("อ셡邥", 53069 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
                        if (!string.equals(((String) objArr4[0]).intern())) {
                            int i10 = m + 77;
                            f40394k = i10 % 128;
                            int i11 = i10 % 2;
                            bg.h();
                        } else {
                            bg.i();
                            int i12 = m + 61;
                            f40394k = i12 % 128;
                            int i13 = i12 % 2;
                        }
                    }
                    Object[] objArr5 = new Object[1];
                    o("อ㺹漟龛", (KeyEvent.getMaxKeyCode() >> 16) + 12433, objArr5);
                    d.c cVarC = d.c.c(jSONObject.getJSONObject(((String) objArr5[0]).intern()));
                    d.a(context, cVarC);
                    bg.f40538b = cVarC.f41116e;
                    f40386a = cVarC.f41112a;
                    zBooleanValue = cVarC.f41114c.booleanValue();
                    try {
                        bg.f40539c = cVarC.f41118i.intValue();
                        int iIntValue = cVarC.f41117g.intValue();
                        if (iIntValue > 0) {
                            bs.b(context, iIntValue);
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = zBooleanValue;
                        z10 = true;
                        try {
                            ExpandableListView.getPackedPositionForGroup(0);
                            ay.a(th.getMessage());
                            z12 = z10;
                            zBooleanValue = z11;
                        } catch (Throwable th3) {
                            try {
                                th3.printStackTrace();
                                b(new Object[]{cVar, new a(z10, z11)}, -705317143, 705317143, (int) System.currentTimeMillis());
                            } catch (Throwable th4) {
                                b(new Object[]{cVar, new a(z10, z11)}, -705317143, 705317143, (int) System.currentTimeMillis());
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z10 = true;
                    z11 = false;
                }
            } else {
                z12 = false;
                zBooleanValue = false;
            }
            int i14 = f40394k + 21;
            m = i14 % 128;
            int i15 = i14 % 2;
        } catch (Throwable th6) {
            th = th6;
            z10 = false;
            z11 = false;
        }
        b(new Object[]{cVar, new a(z12, zBooleanValue)}, -705317143, 705317143, (int) System.currentTimeMillis());
        t.e(new Object[]{context}, -1334501404, 1334501406, (int) System.currentTimeMillis());
        ap.e(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar, a aVar) {
        int i10 = f40394k + 95;
        m = i10 % 128;
        int i11 = i10 % 2;
        cVar.onCompletion(aVar);
        int i12 = f40394k + 71;
        m = i12 % 128;
        int i13 = i12 % 2;
    }
}
