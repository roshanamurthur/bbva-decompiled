package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/uo;", "", "", "p0", "p1", "setDividerPadding", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMpocEndpoints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MpocEndpoints.kt\ncom/mypinpad/tsdk/internal/utils/MpocEndpoints\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1747#2,3:24\n1549#2:27\n1620#2,3:28\n*S KotlinDebug\n*F\n+ 1 MpocEndpoints.kt\ncom/mypinpad/tsdk/internal/utils/MpocEndpoints\n*L\n14#1:24,3\n12#1:27\n12#1:28,3\n*E\n"})
public final class uo {

    @NotNull
    public static final uo INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ArrayList f61389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f61390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f61393e = null;

    static {
        c();
        f61391c = 0;
        f61392d = 1;
        e();
        INSTANCE = new uo();
        Object[] objArr = new Object[1];
        a("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000", false, new int[]{5, 26, 0, 0}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000", false, new int[]{31, 87, 0, 0}, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000", true, new int[]{118, 23, 0, 0}, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", false, new int[]{141, 14, 0, 7}, objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(null, true, new int[]{155, 12, 60, 10}, objArr5);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{strIntern, strIntern2, strIntern3, strIntern4, ((String) objArr5[0]).intern()});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        int i10 = f61391c + 97;
        f61392d = i10 % 128;
        while (true) {
            int i11 = i10 % 2;
            if (!it.hasNext()) {
                f61389a = arrayList;
                return;
            } else {
                arrayList.add(new Regex((String) it.next()));
                i10 = f61392d + 83;
                f61391c = i10 % 128;
            }
        }
    }

    public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        String str2 = str;
        String str3 = "";
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        char c10 = 0;
        int i12 = iArr[0];
        int i13 = 1;
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr = f61390b;
        char c11 = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                try {
                    Object[] objArr2 = new Object[i13];
                    objArr2[c10] = Integer.valueOf(cArr[i17]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((-1) - MotionEvent.axisFromString(str3)), 36 - TextUtils.indexOf(str3, c11), Color.alpha(0) + TypedValues.MotionType.TYPE_POLAR_RELATIVETO);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b11, b10, (byte) (b11 + 3), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i17++;
                    cArr = cArr;
                    str3 = str3;
                    length = length;
                    i15 = i15;
                    c10 = 0;
                    i13 = 1;
                    c11 = '0';
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i15;
            cArr = cArr2;
        } else {
            i10 = i15;
        }
        char[] cArr3 = new char[i14];
        System.arraycopy(cArr, i12, cArr3, 0, i14);
        if (bArr != null) {
            char[] cArr4 = new char[i14];
            setnavigationonclicklistener.setX = 0;
            char c12 = 0;
            while (true) {
                int i18 = setnavigationonclicklistener.setX;
                if (i18 >= i14) {
                    break;
                }
                if (bArr[i18] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i18]), Integer.valueOf(c12)};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1737824323);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (4449 - (Process.myTid() >> 22)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, 1021 - (Process.myTid() >> 22));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b13, b12, b13, objArr5);
                        String str4 = (String) objArr5[0];
                        Class<?> cls3 = Integer.TYPE;
                        method2 = cls2.getMethod(str4, cls3, cls3);
                        map2.put(1737824323, method2);
                    }
                    cArr4[i18] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    Object[] objArr6 = {Integer.valueOf(cArr3[i18]), Integer.valueOf(c12)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-504758789);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), 45 - (Process.myTid() >> 22), Color.green(0) + 2627);
                        byte b14 = (byte) 0;
                        Object[] objArr7 = new Object[1];
                        b(b14, b14, (byte) f61393e.length, objArr7);
                        String str5 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str5, cls5, cls5);
                        map3.put(-504758789, method3);
                    }
                    cArr4[i18] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c12 = cArr4[setnavigationonclicklistener.setX];
                Object[] objArr8 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) (31347 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 48 - (ViewConfiguration.getEdgeSlop() >> 16), Color.alpha(0) + 840);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr9 = new Object[1];
                    b(b16, b15, (byte) (b16 + 1), objArr9);
                    method4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i16 > 0) {
            char[] cArr5 = new char[i14];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i14);
            int i19 = i14 - i16;
            System.arraycopy(cArr5, 0, cArr3, i19, i16);
            System.arraycopy(cArr5, i16, cArr3, 0, i19);
        } else {
            i11 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i14];
            while (true) {
                setnavigationonclicklistener.setX = i11;
                int i20 = setnavigationonclicklistener.setX;
                if (i20 >= i14) {
                    break;
                }
                cArr6[i20] = cArr3[(i14 - i20) - 1];
                i11 = i20 + 1;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i21 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i21;
                int i22 = setnavigationonclicklistener.setX;
                if (i22 >= i14) {
                    break;
                }
                cArr3[i22] = (char) (cArr3[i22] - iArr[2]);
                i21 = i22 + 1;
            }
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
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 101 - r8
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.uo.f61393e
            if (r2 != 0) goto L18
            r4 = r8
            r3 = r1
            r8 = r7
            r7 = r6
            goto L2e
        L18:
            r3 = r1
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2e:
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.uo.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f61393e = new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2, 86, 126, 91};
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:? A[LOOP:0: B:12:0x0022->B:22:?, LOOP_END, SYNTHETIC] */
    public static boolean d(String str) {
        Iterator it;
        ArrayList arrayList = f61389a;
        if (arrayList instanceof Collection) {
            int i10 = f61392d + 81;
            f61391c = i10 % 128;
            if (i10 % 2 != 0) {
                arrayList.isEmpty();
                throw null;
            }
            if (!arrayList.isEmpty()) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    int i11 = f61392d + 45;
                    f61391c = i11 % 128;
                    int i12 = i11 % 2;
                    if (((Regex) it.next()).containsMatchIn(str)) {
                        int i13 = f61391c + 75;
                        f61392d = i13 % 128;
                        int i14 = i13 % 2;
                        return true;
                    }
                }
            }
        } else {
            it = arrayList.iterator();
            while (it.hasNext()) {
                int i15 = f61392d + 45;
                f61391c = i15 % 128;
                int i16 = i15 % 2;
                if (((Regex) it.next()).containsMatchIn(str)) {
                    int i17 = f61391c + 75;
                    f61392d = i17 % 128;
                    int i18 = i17 % 2;
                    return true;
                }
            }
        }
        int i19 = f61391c + 123;
        f61392d = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    public static void e() {
        f61390b = new char[]{58992, 58999, 58929, 58957, 58993, 59010, 59100, 59135, 59104, 59105, 59111, 59076, 59097, 59134, 59109, 59110, 59135, 59122, 59133, 59121, 59103, 59101, 59121, 59129, 59134, 59120, 59132, 59132, 59132, 59108, 59097, 59010, 59100, 59135, 59104, 59105, 59111, 59076, 59097, 59134, 59109, 59110, 59135, 59122, 59133, 59121, 59103, 59088, 59088, 59067, 59046, 59096, 59090, 59100, 59124, 59129, 59084, 59087, 59072, 59089, 59088, 59067, 59046, 59096, 59090, 59100, 59124, 59129, 59074, 59085, 59072, 59089, 59088, 59067, 59046, 59096, 59090, 59100, 59124, 59129, 59074, 59085, 59072, 59089, 59088, 59067, 59046, 59096, 59090, 59100, 59124, 59129, 59074, 59085, 59072, 59089, 59088, 59067, 59046, 59096, 59090, 59100, 59124, 59129, 59075, 59044, 59074, 59075, 59101, 59121, 59129, 59134, 59120, 59132, 59132, 59132, 59108, 59097, 59015, 59100, 59132, 59133, 59128, 59108, 59076, 59099, 59131, 59129, 59131, 59135, 59135, 59110, 59129, 59129, 59105, 59135, 59101, 59096, 59122, 59134, 59076, 59052, 59135, 59120, 59121, 59135, 59129, 59089, 59068, 59076, 59134, 59122, 59096, 59098, 59111, 58943, 58916, 58935, 58932, 58939, 59134, 58930, 58933, 58938, 59134, 59125, 58933};
    }

    @NotNull
    public static String setDividerPadding(@NotNull String p4, @NotNull String p10) throws Throwable {
        Object obj;
        String strIntern = "";
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p4);
        Boolean bool = mg.setCompoundDrawableTintBlendMode;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue()) {
            int i10 = f61392d + 13;
            f61391c = i10 % 128;
            if (i10 % 2 != 0) {
                d(p10);
                throw null;
            }
            if (d(p10)) {
                int i11 = f61392d + 107;
                f61391c = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    a(null, true, new int[]{0, 5, 117, 3}, objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(null, true, new int[]{0, 5, 117, 3}, objArr2);
                    obj = objArr2[0];
                }
                strIntern = ((String) obj).intern();
            }
        }
        sb2.append(strIntern);
        sb2.append(p10);
        return sb2.toString();
    }
}
