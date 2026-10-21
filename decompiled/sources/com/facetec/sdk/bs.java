package com.facetec.sdk;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.PeriodicWorkRequest;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class bs {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f40701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f40702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f40703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f40704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f40705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f40706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f40707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f40708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f40709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static LinkedList<Long> f40710j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f40711n;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f40706f = 0;
        f40711n = 1;
        b();
        f40702b = "";
        f40701a = false;
        f40704d = false;
        f40705e = "";
        f40703c = false;
        int i10 = f40711n + 65;
        f40706f = i10 % 128;
        int i11 = i10 % 2;
    }

    public static void a(Context context) {
        int i10 = f40706f + 83;
        int i11 = i10 % 128;
        f40711n = i11;
        int i12 = i10 % 2;
        if (!f40701a) {
            int i13 = i11 + 117;
            f40706f = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 14 / 0;
                return;
            }
            return;
        }
        if (!f40710j.isEmpty()) {
            int i15 = f40706f + 85;
            f40711n = i15 % 128;
            int i16 = i15 % 2;
            f40710j.removeLast();
        }
        e(new Object[]{context}, -1012379954, 1012379956, (int) System.currentTimeMillis());
        int i17 = f40706f + 57;
        f40711n = i17 % 128;
        int i18 = i17 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i10 = f40706f + 107;
        f40711n = i10 % 128;
        int i11 = i10 % 2;
        if (!f40701a) {
            return null;
        }
        f40710j.add(Long.valueOf(new Date().getTime()));
        g(context);
        int i12 = f40711n + 53;
        f40706f = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static void c(Context context) {
        int i10 = f40711n + 21;
        f40706f = i10 % 128;
        int i11 = i10 % 2;
        if (f40701a && !f40710j.isEmpty()) {
            f40710j.removeLast();
            g(context);
            int i12 = f40706f + 31;
            f40711n = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private static byte[] d() throws Exception {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f40702b);
        sb2.append(f40705e);
        Object[] objArr = new Object[1];
        k("耈༤ꩌ䯞聤늄톱狘睛멚\ud8e2笨減ꌆ쀣", TextUtils.indexOf("", "", 0, 0) + 1, objArr);
        sb2.append(((String) objArr[0]).intern());
        byte[] bArrE = bi.e(sb2.toString());
        int i10 = f40711n + 49;
        f40706f = i10 % 128;
        if (i10 % 2 == 0) {
            return bArrE;
        }
        throw null;
    }

    public static /* synthetic */ Object e(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-978)) + (i10 * 980);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | (~(i14 | i12))) * 979) + ((i10 | i12) * (-979)) + ((~(i14 | i15)) * 979) + i13;
        if (i16 != 1) {
            return i16 != 2 ? c(objArr) : b(objArr);
        }
        return a(objArr);
    }

    private static boolean f(@NonNull Context context) {
        int i10 = f40706f + 87;
        f40711n = i10 % 128;
        boolean z10 = true;
        if (i10 % 2 == 0) {
            try {
                o(context);
            } catch (FileNotFoundException unused) {
            } catch (Exception e5) {
                e = e5;
                ay.a(e.getMessage());
                e.getStackTrace();
            }
        } else {
            try {
                o(context);
            } catch (FileNotFoundException unused2) {
                z10 = false;
            } catch (Exception e7) {
                e = e7;
                z10 = false;
                ay.a(e.getMessage());
                e.getStackTrace();
            }
        }
        int i11 = f40706f + 45;
        f40711n = i11 % 128;
        int i12 = i11 % 2;
        return z10;
    }

    private static void g(@Nullable Context context) {
        int i10 = 2;
        if (context == null) {
            int i11 = f40706f + 85;
            f40711n = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        cx.b(new i4(context, i10));
        int i12 = f40706f + 19;
        f40711n = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static boolean h(Context context) {
        int i10 = f40711n + 71;
        f40706f = i10 % 128;
        int i11 = i10 % 2;
        long jI = i(context);
        if (jI > 0) {
            return new Date().getTime() < jI;
        }
        int i12 = f40706f + 13;
        f40711n = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if ((r9 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r9 = 11 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (com.facetec.sdk.bs.f40707g != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (com.facetec.sdk.bs.f40707g != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        r0 = com.facetec.sdk.bs.f40707g + androidx.work.PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        r9 = com.facetec.sdk.bs.f40706f + 93;
        com.facetec.sdk.bs.f40711n = r9 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long i(android.content.Context r9) {
        /*
            int r0 = com.facetec.sdk.bs.f40706f
            int r0 = r0 + 107
            int r1 = r0 % 128
            com.facetec.sdk.bs.f40711n = r1
            int r0 = r0 % 2
            r1 = -1204673493(0xffffffffb832242b, float:-4.247219E-5)
            r2 = 1204673493(0x47cddbd5, float:105399.664)
            r3 = 1
            r4 = 0
            r6 = 0
            if (r0 != 0) goto L29
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r6] = r9
            long r7 = java.lang.System.currentTimeMillis()
            int r9 = (int) r7
            e(r0, r2, r1, r9)
            long r0 = com.facetec.sdk.bs.f40707g
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 == 0) goto L51
            goto L3b
        L29:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r6] = r9
            long r7 = java.lang.System.currentTimeMillis()
            int r9 = (int) r7
            e(r0, r2, r1, r9)
            long r0 = com.facetec.sdk.bs.f40707g
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 == 0) goto L51
        L3b:
            long r0 = com.facetec.sdk.bs.f40707g
            r2 = 300000(0x493e0, double:1.482197E-318)
            long r0 = r0 + r2
            int r9 = com.facetec.sdk.bs.f40706f
            int r9 = r9 + 93
            int r2 = r9 % 128
            com.facetec.sdk.bs.f40711n = r2
            int r9 = r9 % 2
            if (r9 != 0) goto L50
            r9 = 11
            int r9 = r9 / r6
        L50:
            return r0
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bs.i(android.content.Context):long");
    }

    public static void init$0() {
        $$a = new byte[]{Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -61, 3, -21};
        $$b = 42;
    }

    private static void j(Context context) {
        e(new Object[]{context}, 1204673493, -1204673493, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void l(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 102 - r8
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = com.facetec.sdk.bs.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L36
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r6 = -r6
            int r6 = r6 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bs.l(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Context context) {
        int i10 = f40711n + 33;
        f40706f = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                e(new Object[]{context.getCacheDir()}, -1768634602, 1768634603, (int) System.currentTimeMillis());
                int i11 = 57 / 0;
            } else {
                e(new Object[]{context.getCacheDir()}, -1768634602, 1768634603, (int) System.currentTimeMillis());
            }
        } catch (Exception e5) {
            ay.a(e5.getMessage());
        }
    }

    private static void o(@NonNull Context context) throws Exception {
        byte[] bArrD = bf.d(new File(context.getCacheDir(), e()), d());
        JSONObject jSONObject = new JSONObject(new String(bArrD, 0, bArrD.length, StandardCharsets.UTF_8));
        f40710j.clear();
        Object[] objArr = new Object[1];
        k("림靱┊ꑷ맚⫒", -ExpandableListView.getPackedPositionChild(0L), objArr);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(((String) objArr[0]).intern());
        if (jSONArrayOptJSONArray != null) {
            int i10 = f40706f;
            int i11 = i10 + 71;
            f40711n = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 47;
            f40711n = i13 % 128;
            int i14 = i13 % 2;
            for (int i15 = 0; i15 < jSONArrayOptJSONArray.length(); i15++) {
                f40710j.add(Long.valueOf(jSONArrayOptJSONArray.getLong(i15)));
            }
            Collections.sort(f40710j);
        }
        Object[] objArr2 = new Object[1];
        k("ሆ⊯蚵⟑ቪ鼔", View.resolveSizeAndState(0, 0, 0) + 1, objArr2);
        f40707g = jSONObject.optLong(((String) objArr2[0]).intern(), 0L);
        Object[] objArr3 = new Object[1];
        k("ꙗ칳ꮳ\ueedd\ua63f珙", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
        f40709i = jSONObject.optBoolean(((String) objArr3[0]).intern(), false);
    }

    public static void d(Context context) {
        e(new Object[]{context}, -1012379954, 1012379956, (int) System.currentTimeMillis());
    }

    public static void e(@NonNull Context context) {
        int i10 = f40706f + 119;
        f40711n = i10 % 128;
        int i11 = i10 % 2;
        if (f40701a) {
            return;
        }
        f40710j = new LinkedList<>();
        f40707g = 0L;
        f40709i = false;
        f40702b = context.getPackageName();
        f40705e = Settings.Secure.getString(context.getContentResolver(), "android_id");
        f40704d = f(context);
        f40701a = true;
        int i12 = f40706f + 79;
        f40711n = i12 % 128;
        int i13 = i12 % 2;
    }

    private static void k(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = $11 + 59;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        char[] charArray = str != null ? str.toCharArray() : str;
        ha haVar = new ha();
        char[] cArrB = ha.b(f40708h ^ (-7412675099708671612L), charArray, i10);
        haVar.f41863b = 4;
        int i13 = $11 + 57;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        while (true) {
            int i15 = haVar.f41863b;
            if (i15 >= cArrB.length) {
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                return;
            }
            int i16 = $10 + 19;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i15 - 4;
            haVar.f41864c = i18;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[i15] ^ cArrB[i15 % 4]), Long.valueOf(i18), Long.valueOf(f40708h)};
                Map map = bp.f40694x;
                Object method = map.get(1967282843);
                if (method == null) {
                    Class cls = (Class) bp.a(Process.getGidForName("") + 25, TextUtils.indexOf("", "", 0, 0) + 765, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36773));
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    l(b10, b11, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(1967282843, method);
                }
                cArrB[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {haVar, haVar};
                Object method2 = map.get(1724890883);
                if (method2 == null) {
                    method2 = ((Class) bp.a(View.combineMeasuredStates(0, 0) + 24, Gravity.getAbsoluteGravity(0, 0) + 269, (char) (25686 - View.resolveSize(0, 0)))).getMethod("h", Object.class, Object.class);
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

    public static void b(Context context) {
        if (!f40709i) {
            int i10 = f40711n + 29;
            f40706f = i10 % 128;
            if (i10 % 2 != 0) {
                f40709i = false;
            } else {
                f40709i = true;
            }
            while (f40710j.size() > 3) {
                f40710j.removeFirst();
                int i11 = f40706f + 37;
                f40711n = i11 % 128;
                int i12 = i11 % 2;
            }
            g(context);
        }
        int i13 = f40711n + 19;
        f40706f = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        long j10;
        Context context = (Context) objArr[0];
        if (!f40710j.isEmpty()) {
            long size = f40710j.size();
            long jLongValue = f40710j.peekLast().longValue();
            if (f40703c) {
                int i10 = f40711n + 59;
                f40706f = i10 % 128;
                int i11 = i10 % 2;
                j10 = 600000;
            } else {
                j10 = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
            }
            long j11 = jLongValue - j10;
            while (!f40710j.isEmpty()) {
                int i12 = f40706f + 83;
                f40711n = i12 % 128;
                if (i12 % 2 != 0) {
                    if (f40710j.peekFirst().longValue() >= j11) {
                        break;
                    }
                    f40710j.removeFirst();
                    int i13 = f40706f + 21;
                    f40711n = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    int i15 = 16 / 0;
                    if (f40710j.peekFirst().longValue() >= j11) {
                        break;
                    }
                    f40710j.removeFirst();
                    int i16 = f40706f + 21;
                    f40711n = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
            if (f40710j.size() >= (f40703c ? 16L : 14L)) {
                f40707g = jLongValue;
                f40710j.clear();
            }
            if (f40710j.size() != size) {
                g(context);
            }
        }
        int i18 = f40711n + 53;
        f40706f = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Exception {
        File file = (File) objArr[0];
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<Long> it = f40710j.iterator();
        int i10 = f40711n + 13;
        f40706f = i10 % 128;
        int i11 = i10 % 2;
        while (it.hasNext()) {
            int i12 = f40711n + 113;
            f40706f = i12 % 128;
            int i13 = i12 % 2;
            jSONArray.put(it.next().longValue());
        }
        Object[] objArr2 = new Object[1];
        k("림靱┊ꑷ맚⫒", -TextUtils.lastIndexOf("", '0', 0), objArr2);
        jSONObject.put(((String) objArr2[0]).intern(), jSONArray);
        Object[] objArr3 = new Object[1];
        k("ሆ⊯蚵⟑ቪ鼔", -TextUtils.lastIndexOf("", '0'), objArr3);
        jSONObject.put(((String) objArr3[0]).intern(), f40707g);
        Object[] objArr4 = new Object[1];
        k("ꙗ칳ꮳ\ueedd\ua63f珙", 1 - TextUtils.indexOf("", "", 0, 0), objArr4);
        jSONObject.put(((String) objArr4[0]).intern(), f40709i);
        Object[] objArr5 = new Object[1];
        k("嘖甊䨥\u0a0c噤", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
        jSONObject.put(((String) objArr5[0]).intern(), ay.e(16, 128));
        bf.c(new File(file, e()), d(), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        int i14 = f40706f + 97;
        f40711n = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 44 / 0;
        }
        return null;
    }

    @NonNull
    private static String e() throws Exception {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f40702b);
        sb2.append(f40705e);
        Object[] objArr = new Object[1];
        k("\ue287䘵佃Ί\ue2ebﮕ㒾⛝ᗔ\uf34b㷭⼭ಙ\uea1b┹㡛ݬ\ue5df\u2e7f\u008e㸒\udcf8ឣ১㛇", TextUtils.indexOf("", "", 0, 0) + 1, objArr);
        sb2.append(((String) objArr[0]).intern());
        String strB = bi.b(sb2.toString());
        int i10 = f40706f + 29;
        f40711n = i10 % 128;
        int i11 = i10 % 2;
        return strB;
    }

    public static void b(Context context, int i10) {
        if (!f40704d) {
            int i11 = f40711n + 125;
            f40706f = i11 % 128;
            int i12 = 0;
            if (i11 % 2 != 0) {
                int i13 = 66 / 0;
                if (i10 <= 0) {
                    return;
                }
            } else if (i10 <= 0) {
                return;
            }
            long time = new Date().getTime();
            while (i12 < i10) {
                int i14 = f40706f + 69;
                f40711n = i14 % 128;
                int i15 = i14 % 2;
                f40710j.add(Long.valueOf(time));
                i12++;
                int i16 = f40706f + 111;
                f40711n = i16 % 128;
                int i17 = i16 % 2;
            }
            g(context);
        }
    }

    public static void b() {
        f40708h = 7862496004152591435L;
    }

    private static void c(File file) throws Exception {
        e(new Object[]{file}, -1768634602, 1768634603, (int) System.currentTimeMillis());
    }
}
