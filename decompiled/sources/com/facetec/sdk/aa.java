package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.budiyev.android.codescanner.BarcodeUtils;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
final class aa {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f40195a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f40196c;

    static {
        init$0();
        f40195a = new char[]{32903, 21853, 11065, 511, 55175, 44436, 33386, 22580, 11778, 1178, 55956, 44911, 34130, 23300, 12774, 1983, 26889, 48331, 49848, 59514, 15957, 17438, 27617, 45487, 51097};
        f40196c = -4580266323956771524L;
    }

    public static boolean a(List<Integer> list) {
        return b(list).length >= 3;
    }

    public static Integer[] b(List<Integer> list) {
        return (Integer[]) new HashSet(list).toArray(new Integer[0]);
    }

    public static JSONArray c(List<List<List<z>>> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i11 = 0; i11 < list.get(i10).size(); i11++) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i12 = 0; i12 < list.get(i10).size(); i12++) {
                    jSONArray3.put(list.get(i10).get(i11).get(i12).c());
                }
                jSONArray2.put(jSONArray3);
            }
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    public static C0579r d(List<C0579r> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.addAll(list.get(i10).f42788a);
            arrayList2.addAll(list.get(i10).f42791d);
        }
        C0579r c0579r = new C0579r();
        c0579r.f42788a = arrayList;
        c0579r.f42791d = arrayList2;
        return c0579r;
    }

    public static JSONArray e(List<List<z>> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i11 = 0; i11 < list.get(i10).size(); i11++) {
                jSONArray2.put(list.get(i10).get(i11).c());
            }
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x01c6  */
    private static void f(int i10, int i11, char c10, Object[] objArr) throws Throwable {
        Object method;
        Throwable cause;
        gt gtVar = new gt();
        long[] jArr = new long[i10];
        gtVar.f41826d = 0;
        while (true) {
            int i12 = gtVar.f41826d;
            if (i12 >= i10) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f40195a[i11 + i12])};
                Map map = bp.f40694x;
                Object method2 = map.get(-167668390);
                if (method2 == null) {
                    method2 = ((Class) bp.a((Process.myPid() >> 22) + 24, 246 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("d", Integer.TYPE);
                    map.put(-167668390, method2);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) method2).invoke(null, objArr2)).longValue()), Long.valueOf(gtVar.f41826d), Long.valueOf(f40196c), Integer.valueOf(c10)};
                Object method3 = map.get(-1565725271);
                if (method3 == null) {
                    Class cls = (Class) bp.a(23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1673 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (58390 - (ViewConfiguration.getJumpTapTimeout() >> 16)));
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr4 = new Object[1];
                    h(b10, b11, (byte) (b11 + 1), objArr4);
                    String str = (String) objArr4[0];
                    Class<?> cls2 = Long.TYPE;
                    method3 = cls.getMethod(str, cls2, cls2, cls2, Integer.TYPE);
                    map.put(-1565725271, method3);
                }
                jArr[i12] = ((Long) ((Method) method3).invoke(null, objArr3)).longValue();
                Object[] objArr5 = {gtVar, gtVar};
                Object method4 = map.get(453950717);
                if (method4 == null) {
                    method4 = ((Class) bp.a(24 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + BarcodeUtils.ROTATION_270, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 25686))).getMethod("b", Object.class, Object.class);
                    map.put(453950717, method4);
                }
                ((Method) method4).invoke(null, objArr5);
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
        char[] cArr = new char[i10];
        gtVar.f41826d = 0;
        while (true) {
            int i13 = gtVar.f41826d;
            if (i13 >= i10) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i13] = (char) jArr[i13];
            Object[] objArr6 = {gtVar, gtVar};
            Map map2 = bp.f40694x;
            Object obj = map2.get(453950717);
            if (obj != null) {
                method = obj;
            } else {
                method = ((Class) bp.a(23 - ExpandableListView.getPackedPositionChild(0L), View.MeasureSpec.getSize(0) + 269, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 25686))).getMethod("b", Object.class, Object.class);
                map2.put(453950717, method);
            }
            ((Method) method).invoke(null, objArr6);
        }
    }

    public static List g(List list) {
        List list2 = list;
        int i10 = 0;
        while (i10 <= 0) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    if (list2.get(i11) instanceof List) {
                        arrayList.addAll((Collection) list2.get(i11));
                    } else {
                        arrayList.add(list2.get(i11));
                    }
                }
                i10++;
                list2 = arrayList;
            } catch (Exception unused) {
                return list;
            }
        }
        return list2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = r9 * 3
            int r0 = 1 - r9
            byte[] r1 = com.facetec.sdk.aa.$$a
            int r7 = r7 * 4
            int r7 = 99 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r9 = 0 - r9
            if (r1 != 0) goto L1a
            r7 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L37
        L1a:
            r3 = r2
        L1b:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r9) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L37:
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.aa.h(short, int, short, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{20, -13, -66, -85};
        $$b = 65;
    }

    public static byte[] e(byte[] bArr, int i10, int i11) throws Throwable {
        if (i10 <= 25 && i11 <= 25) {
            return bArr;
        }
        int iFloor = (int) Math.floor(((double) bArr.length) / ((double) (i10 * i11)));
        byte[] bArr2 = new byte[iFloor * 625];
        int iFloor2 = (((int) Math.floor(((double) (i10 - 25)) / 2.0d)) * iFloor) + (((int) Math.floor((((double) (i11 - 25)) / 2.0d) * ((double) i10))) * iFloor);
        int i12 = 0;
        for (int i13 = 25; i12 < i13; i13 = 25) {
            try {
                Object[] objArr = {bArr, Integer.valueOf((i10 * i12 * iFloor) + iFloor2), bArr2, Integer.valueOf(i12 * 25 * iFloor), Integer.valueOf(iFloor * 25)};
                Object[] objArr2 = new Object[1];
                f(TextUtils.lastIndexOf("", '0', 0) + 17, TextUtils.indexOf((CharSequence) "", '0') + 1, (char) TextUtils.getOffsetAfter("", 0), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                f((ViewConfiguration.getWindowTouchSlop() >> 8) + 9, 16 - Drawable.resolveOpacity(0, 0), (char) (Color.red(0) + 59781), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                i12++;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        return bArr2;
    }

    public static int c(String str) {
        return Math.round(str.getBytes(StandardCharsets.UTF_8).length / 1000.0f);
    }
}
