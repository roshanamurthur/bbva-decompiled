package com.facetec.sdk;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.cellscore.web.model.page.components.ComponentDTO;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
final class as {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f40375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f40376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f40377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f40378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static HashMap<String, Integer> f40379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f40380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static short[] f40381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f40382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static byte[] f40383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f40384j;
    private static int m;

    /* JADX INFO: renamed from: com.facetec.sdk.as$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f40385e;

        static {
            int[] iArr = new int[FaceTecSessionStatus.values().length];
            f40385e = iArr;
            try {
                iArr[FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40385e[FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40385e[FaceTecSessionStatus.USER_CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40385e[FaceTecSessionStatus.USER_CANCELLED_VIA_HARDWARE_BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40385e[FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40385e[FaceTecSessionStatus.SESSION_UNSUCCESSFUL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40385e[FaceTecSessionStatus.CAMERA_PERMISSION_DENIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40385e[FaceTecSessionStatus.ENCRYPTION_KEY_INVALID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40385e[FaceTecSessionStatus.TIMEOUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40385e[FaceTecSessionStatus.CONTEXT_SWITCH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40385e[FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40385e[FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40385e[FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40385e[FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40385e[FaceTecSessionStatus.LOCKED_OUT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f40385e[FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f40382h = 0;
        m = 1;
        d();
        f40376b = "";
        f40377c = false;
        f40375a = "";
        int i10 = f40382h + 43;
        m = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 97 / 0;
        }
    }

    @NonNull
    public static String a() {
        int i10 = m + 37;
        f40382h = i10 % 128;
        int i11 = i10 % 2;
        String string = f40379e.toString();
        int i12 = f40382h + 55;
        m = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 40 / 0;
        }
        return string;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        FaceTecSessionStatus faceTecSessionStatus = (FaceTecSessionStatus) objArr[0];
        Context context = (Context) objArr[1];
        if (!f40377c) {
            int i10 = f40382h + 97;
            m = i10 % 128;
            if (i10 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String strE = e(faceTecSessionStatus);
        if (f40379e.get(strE) == null) {
            int i11 = f40382h + 15;
            m = i11 % 128;
            int i12 = i11 % 2;
            f40379e.put(strE, 0);
        } else {
            HashMap<String, Integer> map = f40379e;
            map.put(strE, Integer.valueOf(map.get(strE).intValue() + 1));
        }
        a(context);
        return null;
    }

    public static int c(Context context) {
        return ((Integer) d(new Object[]{context}, -528518656, 528518657, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Object d(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        return (((~(i13 | i12)) | i14) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((((~(i10 | i12)) | (~(i14 | i10))) * (-318)) + ((((~(i11 | ((~i12) | i10))) | (~((i13 | i14) | i12))) * (-318)) + ((i11 * 319) + (i10 * (-317))))) != 1 ? b(objArr) : a(objArr);
    }

    public static void e(Context context) {
        if (f40377c) {
            if (f40379e.get("FC") == null) {
                int i10 = m + 53;
                f40382h = i10 % 128;
                int i11 = i10 % 2;
                f40379e.put("FC", 1);
            } else {
                HashMap<String, Integer> map = f40379e;
                map.put("FC", Integer.valueOf(map.get("FC").intValue() + 1));
            }
            a(context);
            int i12 = f40382h + 71;
            m = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Context context) {
        int i10 = f40382h + 49;
        m = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                e(context.getCacheDir());
            } else {
                e(context.getCacheDir());
                throw null;
            }
        } catch (Exception e5) {
            ay.a(e5.getMessage());
        }
    }

    private static void h(@NonNull Context context) throws Exception {
        byte[] bArrD = bf.d(new File(context.getCacheDir(), b()), e());
        JSONObject jSONObject = new JSONObject(new String(bArrD, 0, bArrD.length, StandardCharsets.UTF_8));
        f40379e.clear();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("history");
        if (jSONObjectOptJSONObject != null) {
            int i10 = f40382h + 83;
            m = i10 % 128;
            if (i10 % 2 == 0) {
                jSONObjectOptJSONObject.keys();
                throw null;
            }
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                int i11 = f40382h + 99;
                m = i11 % 128;
                if (i11 % 2 == 0) {
                    String next = itKeys.next();
                    f40379e.put(next, Integer.valueOf(jSONObjectOptJSONObject.optInt(next)));
                    int i12 = 83 / 0;
                } else {
                    String next2 = itKeys.next();
                    f40379e.put(next2, Integer.valueOf(jSONObjectOptJSONObject.optInt(next2)));
                }
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{3, 73, 31, 124};
        $$b = 78;
    }

    private static void k(short s4, int i10, byte b10, int i11, int i12, Object[] objArr) throws Throwable {
        long j10;
        int i13;
        gy gyVar = new gy();
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(f40384j)};
            int i14 = 0;
            Map map = bp.f40694x;
            Object method = map.get(-131541546);
            float f6 = 0.0f;
            if (method == null) {
                Class cls = (Class) bp.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1623, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1));
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                l(b11, b12, (byte) (b12 + 1), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-131541546, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            boolean z10 = iIntValue == -1;
            if (z10) {
                byte[] bArr = f40383i;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i15 = 0;
                    while (i15 < length) {
                        Object[] objArr4 = new Object[1];
                        objArr4[i14] = Integer.valueOf(bArr[i15]);
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1703225588);
                        if (method2 == null) {
                            Class cls3 = (Class) bp.a((-16777192) - Color.rgb(i14, i14, i14), 1167 - View.MeasureSpec.makeMeasureSpec(i14, i14), (char) (45989 - (AudioTrack.getMaxVolume() > f6 ? 1 : (AudioTrack.getMaxVolume() == f6 ? 0 : -1))));
                            byte b13 = (byte) i14;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            l(b13, b14, (byte) (b14 + 2), objArr5);
                            method2 = cls3.getMethod((String) objArr5[0], Integer.TYPE);
                            map2.put(1703225588, method2);
                        }
                        bArr2[i15] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i15++;
                        bArr = bArr;
                        i14 = 0;
                        f6 = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f40383i;
                    Object[] objArr6 = {Integer.valueOf(i10), Integer.valueOf(f40378d)};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-131541546);
                    if (method3 == null) {
                        Class cls4 = (Class) bp.a(23 - Process.getGidForName(""), ExpandableListView.getPackedPositionType(0L) + 1624, (char) (ViewConfiguration.getPressedStateDuration() >> 16));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        l(b15, b16, (byte) (b16 + 1), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str2, cls5, cls5);
                        map3.put(-131541546, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr6)).intValue()]) ^ 8685730852850169510L)) + ((int) (((long) f40384j) ^ 8685730852850169510L)));
                    j10 = 8685730852850169510L;
                } else {
                    j10 = 8685730852850169510L;
                    iIntValue = (short) (((short) (((long) f40381g[i10 + ((int) (((long) f40378d) ^ 8685730852850169510L))]) ^ 8685730852850169510L)) + ((int) (((long) f40384j) ^ 8685730852850169510L)));
                }
            } else {
                j10 = 8685730852850169510L;
            }
            if (iIntValue > 0) {
                int i16 = ((i10 + iIntValue) - 2) + ((int) (((long) f40378d) ^ j10));
                if (z10) {
                    i13 = 1;
                } else {
                    int i17 = $10 + 123;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    i13 = 0;
                }
                gyVar.f41841b = i16 + i13;
                Object[] objArr8 = {gyVar, Integer.valueOf(i12), Integer.valueOf(f40380f), sb2};
                Map map4 = bp.f40694x;
                Object method4 = map4.get(-1555392445);
                if (method4 == null) {
                    Class cls6 = (Class) bp.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23, TextUtils.lastIndexOf("", '0', 0, 0) + 1484, (char) View.MeasureSpec.getMode(0));
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr9 = new Object[1];
                    l(b17, b18, b18, objArr9);
                    String str3 = (String) objArr9[0];
                    Class<?> cls7 = Integer.TYPE;
                    method4 = cls6.getMethod(str3, Object.class, cls7, cls7, Object.class);
                    map4.put(-1555392445, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr8)).append(gyVar.f41843e);
                gyVar.f41842d = gyVar.f41843e;
                byte[] bArr4 = f40383i;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i19 = 0; i19 < length2; i19++) {
                        bArr5[i19] = (byte) (((long) bArr4[i19]) ^ 8685730852850169510L);
                    }
                    bArr4 = bArr5;
                }
                boolean z11 = bArr4 != null;
                gyVar.f41840a = 1;
                while (gyVar.f41840a < iIntValue) {
                    int i20 = $10 + 83;
                    $11 = i20 % 128;
                    if (i20 % 2 == 0) {
                        throw null;
                    }
                    if (z11) {
                        byte[] bArr6 = f40383i;
                        int i21 = gyVar.f41841b;
                        gyVar.f41841b = i21 - 1;
                        gyVar.f41843e = (char) (gyVar.f41842d + (((byte) (((byte) (((long) bArr6[i21]) ^ 8685730852850169510L)) + s4)) ^ b10));
                    } else {
                        short[] sArr = f40381g;
                        int i22 = gyVar.f41841b;
                        gyVar.f41841b = i22 - 1;
                        gyVar.f41843e = (char) (gyVar.f41842d + (((short) (((short) (((long) sArr[i22]) ^ 8685730852850169510L)) + s4)) ^ b10));
                    }
                    sb2.append(gyVar.f41843e);
                    gyVar.f41842d = gyVar.f41843e;
                    gyVar.f41840a++;
                }
            }
            String string = sb2.toString();
            int i23 = $11 + 31;
            $10 = i23 % 128;
            int i24 = i23 % 2;
            objArr[0] = string;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void l(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 70 - r8
            byte[] r0 = com.facetec.sdk.as.$$a
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L1b
            r8 = r7
            r3 = r1
            r4 = r2
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L35
        L1b:
            r3 = r2
        L1c:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L35:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.as.l(short, short, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i10 = f40382h + 5;
        m = i10 % 128;
        int i11 = i10 % 2;
        if (!f40379e.containsKey("FC")) {
            int i12 = f40382h + 67;
            m = i12 % 128;
            if (i12 % 2 == 0) {
                e(context);
                throw null;
            }
            e(context);
        }
        return Integer.valueOf(f40379e.get("FC").intValue());
    }

    public static void d(@NonNull Context context) {
        int i10 = f40382h + 15;
        m = i10 % 128;
        int i11 = i10 % 2;
        if (f40377c) {
            return;
        }
        f40379e = new HashMap<>();
        for (FaceTecSessionStatus faceTecSessionStatus : FaceTecSessionStatus.values()) {
            int i12 = m + 63;
            f40382h = i12 % 128;
            int i13 = i12 % 2;
            f40379e.put(e(faceTecSessionStatus), 0);
        }
        f40379e.put("FC", 1);
        f40376b = context.getPackageName();
        f40375a = Settings.Secure.getString(context.getContentResolver(), "android_id");
        b(context);
        f40377c = true;
        int i14 = m + 75;
        f40382h = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r3 = 76 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        com.facetec.sdk.cx.b(new com.facetec.sdk.g1(r3, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r1 = r1 + 3;
        com.facetec.sdk.as.f40382h = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(@androidx.annotation.Nullable android.content.Context r3) {
        /*
            int r0 = com.facetec.sdk.as.f40382h
            int r0 = r0 + 25
            int r1 = r0 % 128
            com.facetec.sdk.as.m = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 != 0) goto L13
            r0 = 65
            int r0 = r0 / r2
            if (r3 != 0) goto L23
            goto L15
        L13:
            if (r3 != 0) goto L23
        L15:
            int r1 = r1 + 3
            int r3 = r1 % 128
            com.facetec.sdk.as.f40382h = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L22
            r3 = 76
            int r3 = r3 / r2
        L22:
            return
        L23:
            com.facetec.sdk.g1 r0 = new com.facetec.sdk.g1
            r0.<init>(r3, r2)
            com.facetec.sdk.cx.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.as.a(android.content.Context):void");
    }

    private static void e(File file) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("history", new JSONObject(f40379e));
        Object[] objArr = new Object[1];
        k((short) (View.MeasureSpec.getSize(0) - 70), KeyEvent.normalizeMetaState(0) + 702227702, (byte) TextUtils.getCapsMode("", 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 4, (-406332953) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        jSONObject.put(((String) objArr[0]).intern(), ay.e(16, 128));
        bf.c(new File(file, b()), e(), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        int i10 = f40382h + 31;
        m = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 94 / 0;
        }
    }

    private static void b(@NonNull Context context) {
        int i10 = f40382h + 5;
        m = i10 % 128;
        try {
            try {
                if (i10 % 2 != 0) {
                    h(context);
                    int i11 = f40382h + 55;
                    m = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                h(context);
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
            }
        } catch (Exception e5) {
            ay.a(e5.getMessage());
            e5.getStackTrace();
        }
    }

    public static void d() {
        f40378d = -991154772;
        f40384j = 315160227;
        f40380f = 183554093;
        f40383i = new byte[]{-90};
    }

    @NonNull
    private static String b() throws Exception {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f40376b);
        sb2.append(f40375a);
        sb2.append("history_file_internal");
        String strB = bi.b(sb2.toString());
        int i10 = f40382h + 119;
        m = i10 % 128;
        int i11 = i10 % 2;
        return strB;
    }

    private static byte[] e() throws Exception {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f40376b);
        sb2.append(f40375a);
        sb2.append("history_key");
        byte[] bArrE = bi.e(sb2.toString());
        int i10 = f40382h + 85;
        m = i10 % 128;
        int i11 = i10 % 2;
        return bArrE;
    }

    public static void b(@NonNull FaceTecSessionStatus faceTecSessionStatus, Context context) {
        d(new Object[]{faceTecSessionStatus, context}, 1164904952, -1164904952, (int) System.currentTimeMillis());
    }

    @NonNull
    private static String e(@NonNull FaceTecSessionStatus faceTecSessionStatus) {
        switch (AnonymousClass2.f40385e[faceTecSessionStatus.ordinal()]) {
            case 1:
                return "LI";
            case 2:
                return ComponentDTO.DATA_MANAGER;
            case 3:
                return "UC";
            case 4:
                return "CH";
            case 5:
                return LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PS;
            case 6:
                return "NP";
            case 7:
                return "CD";
            case 8:
                return "EI";
            case 9:
                int i10 = m + 7;
                f40382h = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 48 / 0;
                }
                return "TO";
            case 10:
                return "CS";
            case 11:
                return "CE";
            case 12:
                return "IE";
            case 13:
                return "LA";
            case 14:
                return "RP";
            case 15:
                return "UL";
            case 16:
                return "GI";
            default:
                int i12 = f40382h + 93;
                m = i12 % 128;
                int i13 = i12 % 2;
                return "NA";
        }
    }
}
