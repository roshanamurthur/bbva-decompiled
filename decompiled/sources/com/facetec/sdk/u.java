package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    w f42877a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    w f42879c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    w f42882j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<List<Integer>> f42881e = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f42880d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42878b = 0;

    /* JADX INFO: renamed from: com.facetec.sdk.u$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f42883c;

        static {
            int[] iArr = new int[b.values().length];
            f42883c = iArr;
            try {
                iArr[b.f42886c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42883c[b.f42884a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42883c[b.f42885b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42883c[b.f42887d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42883c[b.f42888e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42883c[b.f42889g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static int $10 = 0;
        private static int $11 = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f42884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f42885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f42887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f42888e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f42889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ b[] f42890h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static long f42891i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f42892j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f42893k = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f42894f;

        static {
            b();
            Object[] objArr = new Object[1];
            l("㦻ᴩ", 9371 - TextUtils.getCapsMode("", 0, 0), objArr);
            f42886c = new b("HASH_SET", 0, ((String) objArr[0]).intern());
            f42884a = new b("SIZE", 1, "s");
            f42885b = new b("SESSION_COUNT", 2, SqlContracts.TokenEntry.SC);
            f42887d = new b("INTRA_SESSION_LOOP_DETECTION_LEVEL", 3, "l1");
            f42888e = new b("INTRA_FACETEC_SESSION_LOOP_DETECTION_LEVEL", 4, "l2");
            f42889g = new b("INTER_FACETEC_SESSION_LOOP_DETECTION_LEVEL", 5, "l3");
            f42890h = c();
            int i10 = f42892j + 59;
            f42893k = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        private b(String str, int i10, String str2) {
            super(str, i10);
            this.f42894f = str2;
        }

        public static void b() {
            f42891i = 3330092061267021176L;
        }

        private static /* synthetic */ b[] c() {
            int i10 = f42892j;
            int i11 = i10 + 47;
            f42893k = i11 % 128;
            int i12 = i11 % 2;
            b[] bVarArr = {f42886c, f42884a, f42885b, f42887d, f42888e, f42889g};
            int i13 = i10 + 67;
            f42893k = i13 % 128;
            int i14 = i13 % 2;
            return bVarArr;
        }

        /* JADX WARN: Code duplicated, block: B:51:0x0213  */
        /* JADX WARN: Code duplicated, block: B:52:0x0214  */
        private static void l(String str, int i10, Object[] objArr) throws Throwable {
            char[] charArray;
            Throwable cause;
            int i11 = 2;
            if (str != null) {
                int i12 = $10 + 65;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            gw gwVar = new gw();
            gwVar.f41836e = i10;
            int length = cArr.length;
            long[] jArr = new long[length];
            gwVar.f41835a = 0;
            while (true) {
                int i14 = gwVar.f41835a;
                if (i14 >= cArr.length) {
                    break;
                }
                int i15 = $11 + 7;
                $10 = i15 % 128;
                if (i15 % i11 != 0) {
                    char c10 = cArr[i14];
                    try {
                        Object[] objArr2 = new Object[3];
                        objArr2[i11] = gwVar;
                        objArr2[1] = gwVar;
                        objArr2[0] = Integer.valueOf(c10);
                        Map map = bp.f40694x;
                        Object method = map.get(346539884);
                        if (method == null) {
                            method = ((Class) bp.a(23 - TextUtils.lastIndexOf("", '0'), 245 - Drawable.resolveOpacity(0, 0), (char) KeyEvent.getDeadChar(0, 0))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                            map.put(346539884, method);
                        }
                        jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() / (f42891i - 4932774504156859221L);
                        Object[] objArr3 = {gwVar, gwVar};
                        Object method2 = map.get(593077425);
                        if (method2 == null) {
                            method2 = ((Class) bp.a(24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (Process.myPid() >> 22) + 150, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("q", Object.class, Object.class);
                            map.put(593077425, method2);
                        }
                        ((Method) method2).invoke(null, objArr3);
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr[i14]), gwVar, gwVar};
                    Map map2 = bp.f40694x;
                    Object method3 = map2.get(346539884);
                    if (method3 == null) {
                        method3 = ((Class) bp.a(24 - Drawable.resolveOpacity(0, 0), Color.green(0) + 245, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                        map2.put(346539884, method3);
                    }
                    jArr[i14] = ((Long) ((Method) method3).invoke(null, objArr4)).longValue() ^ (f42891i ^ (-4932774504156859221L));
                    Object[] objArr5 = {gwVar, gwVar};
                    Object method4 = map2.get(593077425);
                    if (method4 == null) {
                        method4 = ((Class) bp.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23, (ViewConfiguration.getWindowTouchSlop() >> 8) + 150, (char) Color.argb(0, 0, 0, 0))).getMethod("q", Object.class, Object.class);
                        map2.put(593077425, method4);
                    }
                    ((Method) method4).invoke(null, objArr5);
                }
                i11 = 2;
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            char[] cArr2 = new char[length];
            gwVar.f41835a = 0;
            while (true) {
                int i16 = gwVar.f41835a;
                if (i16 >= cArr.length) {
                    String str2 = new String(cArr2);
                    int i17 = $11 + 19;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    objArr[0] = str2;
                    return;
                }
                cArr2[i16] = (char) jArr[i16];
                Object[] objArr6 = {gwVar, gwVar};
                Map map3 = bp.f40694x;
                Object method5 = map3.get(593077425);
                if (method5 == null) {
                    method5 = ((Class) bp.a(23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 150 - (ViewConfiguration.getTapTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1))).getMethod("q", Object.class, Object.class);
                    map3.put(593077425, method5);
                }
                ((Method) method5).invoke(null, objArr6);
            }
        }

        public static b valueOf(String str) {
            int i10 = f42892j + 15;
            f42893k = i10 % 128;
            if (i10 % 2 != 0) {
                return (b) Enum.valueOf(b.class, str);
            }
            Enum.valueOf(b.class, str);
            throw null;
        }

        public static b[] values() {
            int i10 = f42892j + 79;
            f42893k = i10 % 128;
            int i11 = i10 % 2;
            b[] bVarArr = (b[]) f42890h.clone();
            int i12 = f42893k + 15;
            f42892j = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 1 / 0;
            }
            return bVarArr;
        }
    }

    public u() {
        w wVar = w.NOT_RAN;
        this.f42879c = wVar;
        this.f42877a = wVar;
        this.f42882j = wVar;
    }

    public static u a(String str) {
        u uVar = new u();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray(b.f42886c.f42894f);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    arrayList2.add(Integer.valueOf(jSONArray2.getInt(i11)));
                }
                arrayList.add(arrayList2);
            }
            for (b bVar : b.values()) {
                switch (AnonymousClass3.f42883c[bVar.ordinal()]) {
                    case 1:
                        uVar.f42881e = arrayList;
                        break;
                    case 2:
                        uVar.f42880d = jSONObject.getInt(bVar.f42894f);
                        break;
                    case 3:
                        uVar.f42878b = jSONObject.getInt(bVar.f42894f);
                        break;
                    case 4:
                        uVar.f42879c = w.c(jSONObject.getInt(bVar.f42894f));
                        break;
                    case 5:
                        uVar.f42877a = w.c(jSONObject.getInt(bVar.f42894f));
                        break;
                    case 6:
                        uVar.f42882j = w.c(jSONObject.getInt(bVar.f42894f));
                        break;
                }
            }
        } catch (Exception unused) {
        }
        return uVar;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (b bVar : b.values()) {
                switch (AnonymousClass3.f42883c[bVar.ordinal()]) {
                    case 1:
                        jSONObject.put(bVar.f42894f, new JSONArray((Collection) this.f42881e));
                        break;
                    case 2:
                        jSONObject.put(bVar.f42894f, this.f42880d);
                        break;
                    case 3:
                        jSONObject.put(bVar.f42894f, this.f42878b);
                        break;
                    case 4:
                        jSONObject.put(bVar.f42894f, this.f42879c.f42933d);
                        break;
                    case 5:
                        jSONObject.put(bVar.f42894f, this.f42877a.f42933d);
                        break;
                    case 6:
                        jSONObject.put(bVar.f42894f, this.f42882j.f42933d);
                        break;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
