package com.facetec.sdk;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40205a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<u> f40209e = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40208d = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40212i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f40207c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f40206b = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40210f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40211g = false;

    /* JADX INFO: renamed from: com.facetec.sdk.ac$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f40213b;

        static {
            int[] iArr = new int[e.values().length];
            f40213b = iArr;
            try {
                iArr[e.f40218c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40213b[e.f40219d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40213b[e.f40217b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40213b[e.f40220e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40213b[e.f40216a.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40213b[e.f40224j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40214c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40215e;

        public c(int i10, int i11) {
            this.f40215e = i10;
            this.f40214c = i11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static int $10 = 0;
        private static int $11 = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f40216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f40217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f40218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f40219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f40220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f40221f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static long f40222g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ e[] f40223i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final e f40224j;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f40225n = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f40226h;

        static {
            b();
            f40218c = new e("HASH_SET_ARRAY", 0, "haia");
            f40219d = new e("VERSION", 1, SharedPrefsStorage.VERSION_KEY);
            Object[] objArr = new Object[1];
            k("វ", 25057 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            f40217b = new e("REVISION", 2, ((String) objArr[0]).intern());
            f40220e = new e("SIZE", 3, "s");
            f40216a = new e("SESSION_COUNT", 4, SqlContracts.TokenEntry.SC);
            f40224j = new e("TAMPERING_DETECTED", 5, "td");
            f40223i = e();
            int i10 = f40221f + 87;
            f40225n = i10 % 128;
            int i11 = i10 % 2;
        }

        private e(String str, int i10, String str2) {
            super(str, i10);
            this.f40226h = str2;
        }

        public static void b() {
            f40222g = -8375890715601771707L;
        }

        private static /* synthetic */ e[] e() {
            int i10 = f40221f;
            int i11 = i10 + 99;
            f40225n = i11 % 128;
            int i12 = i11 % 2;
            e[] eVarArr = {f40218c, f40219d, f40217b, f40220e, f40216a, f40224j};
            int i13 = i10 + 85;
            f40225n = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 45 / 0;
            }
            return eVarArr;
        }

        /* JADX WARN: Code duplicated, block: B:51:0x0227  */
        /* JADX WARN: Code duplicated, block: B:52:0x0228  */
        private static void k(String str, int i10, Object[] objArr) throws Throwable {
            char[] charArray;
            Throwable cause;
            int i11 = 2;
            if (str != null) {
                int i12 = $11 + 67;
                $10 = i12 % 128;
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
                int i15 = $10 + 123;
                $11 = i15 % 128;
                if (i15 % i11 == 0) {
                    char c10 = cArr[i14];
                    try {
                        Object[] objArr2 = new Object[3];
                        objArr2[i11] = gwVar;
                        objArr2[1] = gwVar;
                        objArr2[0] = Integer.valueOf(c10);
                        Map map = bp.f40694x;
                        Object method = map.get(346539884);
                        if (method == null) {
                            method = ((Class) bp.a(23 - TextUtils.indexOf((CharSequence) "", '0', 0), 293 - AndroidCharacter.getMirror('0'), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                            map.put(346539884, method);
                        }
                        jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() | (f40222g ^ (-4932774504156859221L));
                        Object[] objArr3 = {gwVar, gwVar};
                        Object method2 = map.get(593077425);
                        if (method2 == null) {
                            method2 = ((Class) bp.a(TextUtils.getOffsetAfter("", 0) + 23, (Process.myPid() >> 22) + 150, (char) (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("q", Object.class, Object.class);
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
                        method3 = ((Class) bp.a(TextUtils.getOffsetBefore("", 0) + 24, 245 - TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                        map2.put(346539884, method3);
                    }
                    jArr[i14] = ((Long) ((Method) method3).invoke(null, objArr4)).longValue() ^ (f40222g ^ (-4932774504156859221L));
                    Object[] objArr5 = {gwVar, gwVar};
                    Object method4 = map2.get(593077425);
                    if (method4 == null) {
                        method4 = ((Class) bp.a(Color.green(0) + 23, 150 - TextUtils.indexOf("", "", 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1))).getMethod("q", Object.class, Object.class);
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
                    objArr[0] = new String(cArr2);
                    return;
                }
                int i17 = $10 + 35;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr2[i16] = (char) jArr[i16];
                Object[] objArr6 = {gwVar, gwVar};
                Map map3 = bp.f40694x;
                Object method5 = map3.get(593077425);
                if (method5 == null) {
                    method5 = ((Class) bp.a(22 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 150, (char) (ViewConfiguration.getTouchSlop() >> 8))).getMethod("q", Object.class, Object.class);
                    map3.put(593077425, method5);
                }
                ((Method) method5).invoke(null, objArr6);
            }
        }

        public static e valueOf(String str) {
            int i10 = f40225n + 121;
            f40221f = i10 % 128;
            int i11 = i10 % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            int i12 = f40221f + 91;
            f40225n = i12 % 128;
            int i13 = i12 % 2;
            return eVar;
        }

        public static e[] values() {
            int i10 = f40221f + 37;
            f40225n = i10 % 128;
            int i11 = i10 % 2;
            e[] eVarArr = (e[]) f40223i.clone();
            int i12 = f40221f + 73;
            f40225n = i12 % 128;
            if (i12 % 2 != 0) {
                return eVarArr;
            }
            throw null;
        }
    }

    public ac(Context context) {
        this.f40205a = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(c cVar, c cVar2) {
        return cVar.f40214c - cVar2.f40214c;
    }

    public final List<c> b() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f40209e.size(); i10++) {
            c cVar = new c(i10, i10);
            w wVar = this.f40209e.get(i10).f42879c;
            w wVar2 = w.DETECTED;
            if (wVar == wVar2) {
                cVar.f40214c -= this.f40209e.size();
            }
            if (this.f40209e.get(i10).f42877a == wVar2) {
                cVar.f40214c -= this.f40209e.size();
            }
            if (this.f40209e.get(i10).f42882j == wVar2) {
                cVar.f40214c -= this.f40209e.size();
            }
            arrayList.add(cVar);
        }
        Collections.sort(arrayList, new n0());
        return arrayList;
    }

    public static ac d(Context context, String str) throws Throwable {
        ac acVar = new ac(context);
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.getJSONArray(e.f40218c.f40226h);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(u.a(jSONArray.getJSONObject(i10).toString()));
                }
                for (e eVar : e.values()) {
                    switch (AnonymousClass4.f40213b[eVar.ordinal()]) {
                        case 1:
                            acVar.f40209e = arrayList;
                            break;
                        case 2:
                            acVar.f40208d = jSONObject.getInt(eVar.f40226h);
                            break;
                        case 3:
                            acVar.f40212i = jSONObject.getInt(eVar.f40226h);
                            break;
                        case 4:
                            acVar.f40207c = jSONObject.getInt(eVar.f40226h);
                            break;
                        case 5:
                            acVar.f40206b = jSONObject.getInt(eVar.f40226h);
                            break;
                        case 6:
                            acVar.f40210f = jSONObject.getBoolean(eVar.f40226h);
                            break;
                    }
                }
                acVar.f40211g = true;
                acVar.f40212i++;
            } catch (Exception e5) {
                acVar.f40210f = true;
                com.facetec.sdk.e eVar2 = com.facetec.sdk.e.F2F_ERROR;
                StringBuilder sb2 = new StringBuilder("Error 4471: ");
                sb2.append(e5.getMessage());
                t.c(context, eVar2, sb2.toString());
            }
        }
        return acVar;
    }

    public final JSONObject a() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<u> it = this.f40209e.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().c());
        }
        try {
            for (e eVar : e.values()) {
                switch (AnonymousClass4.f40213b[eVar.ordinal()]) {
                    case 1:
                        jSONObject.put(eVar.f40226h, jSONArray);
                        break;
                    case 2:
                        jSONObject.put(eVar.f40226h, this.f40208d);
                        break;
                    case 3:
                        jSONObject.put(eVar.f40226h, this.f40212i);
                        break;
                    case 4:
                        jSONObject.put(eVar.f40226h, this.f40207c);
                        break;
                    case 5:
                        jSONObject.put(eVar.f40226h, this.f40206b);
                        break;
                    case 6:
                        jSONObject.put(eVar.f40226h, this.f40210f);
                        break;
                }
            }
        } catch (JSONException e5) {
            Context context = this.f40205a;
            com.facetec.sdk.e eVar2 = com.facetec.sdk.e.F2F_ERROR;
            StringBuilder sb2 = new StringBuilder("Error 4470: ");
            sb2.append(e5.getMessage());
            t.c(context, eVar2, sb2.toString());
        }
        return jSONObject;
    }
}
