package com.mypinpad.tsdk.isolation;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/py;", "", "", "p0", "", "setCompoundDrawableTintBlendMode", "(Ljava/lang/String;)Z", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEncryptedEndpoints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EncryptedEndpoints.kt\ncom/mypinpad/tsdk/internal/remote/EncryptedEndpoints\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n1747#2,3:14\n1549#2:17\n1620#2,3:18\n*S KotlinDebug\n*F\n+ 1 EncryptedEndpoints.kt\ncom/mypinpad/tsdk/internal/remote/EncryptedEndpoints\n*L\n12#1:14,3\n10#1:17\n10#1:18,3\n*E\n"})
public final class py {

    @NotNull
    public static final py INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ArrayList f57779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f57780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f57782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f57783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f57788j = null;

    static {
        c();
        f57786h = 0;
        f57787i = 1;
        f57784f = 0;
        f57785g = 1;
        d();
        INSTANCE = new py();
        Object[] objArr = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 127, "\u0095\u0091\u0094\u0093\u008f\u008e\u008d\u0088\u008c\u008b\u0088\u008a\u0089\u0088\u0086\u0087\u0088\u0091\u0092\u008f\u008e\u008d\u0088\u008c\u008b\u0088\u008a\u0089\u0088\u0086\u0087\u0088\u0091\u0092\u008f\u008e\u008d\u0088\u008c\u008b\u0088\u008a\u0089\u0088\u0086\u0087\u0088\u0091\u0092\u008f\u008e\u008d\u0088\u008c\u008b\u0088\u008a\u0089\u0088\u0086\u0087\u0088\u0091\u0090\u008f\u008e\u008d\u0088\u008c\u008b\u0088\u008a\u0089\u0088\u0086\u0087\u0081\u0083\u0086\u0085\u0081\u0084\u0083\u0082\u0081", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0095\u009a\u0097\u0084\u0099\u0096\u0081\u009a\u0099\u0098\u0096\u0086\u0096\u0082\u0097\u0096\u0096\u0086\u0081\u0084\u0083\u0082\u0081", objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0095\u0097\u0082\u0086\u009e\u009d\u009c\u009b\u0085\u0081\u0084\u0083\u0082\u0081", objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((Process.myTid() >> 22) + 127, "\u0095\u0083\u009a\u009b\u0089\u0097\u009c\u0081\u0084\u0083\u0082\u0081", objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(127 - TextUtils.getOffsetAfter("", 0), "\u0095\u0085\u0086\u0096\u0081\u0084\u0083\u0082\u0081", objArr5);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{strIntern, strIntern2, strIntern3, strIntern4, ((String) objArr5[0]).intern()});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        int i10 = f57785g + 23;
        f57784f = i10 % 128;
        while (true) {
            int i11 = i10 % 2;
            if (!it.hasNext()) {
                f57779a = arrayList;
                return;
            } else {
                arrayList.add(new Regex((String) it.next()));
                i10 = f57785g + 47;
                f57784f = i10 % 128;
            }
        }
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr2 = f57780b;
        if (cArr2 != null) {
            int i11 = f57786h + 3;
            f57787i = i11 % 128;
            if (i11 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i12 = 0; i12 < length; i12++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (View.resolveSizeAndState(0, 0, 0) + 26288), 63 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getTouchSlop() >> 8) + 1595);
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 2);
                        Object[] objArr3 = new Object[1];
                        b(b11, (byte) (b11 - 3), b10, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
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
        Object[] objArr4 = {Integer.valueOf(f57781c)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (KeyEvent.getDeadChar(0, 0) + 10744), ((byte) KeyEvent.getModifierMetaStateMask()) + 44, 566 - (ViewConfiguration.getPressedStateDuration() >> 16));
            byte b12 = (byte) 0;
            byte b13 = (byte) (b12 + 1);
            Object[] objArr5 = new Object[1];
            b(b13, (byte) (-b13), b12, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!f57783e) {
            if (!f57782d) {
                throw null;
            }
            throw null;
        }
        int i13 = f57787i + 53;
        f57786h = i13 % 128;
        int i14 = i13 % 2;
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i15 = setz.setDividerPadding;
            int i16 = setz.setOnFocusChangeListener;
            if (i15 >= i16) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i15] = (char) (cArr2[bytes[(i16 - 1) - i15] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 51, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2880);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b15, (byte) (b15 - 1), b14, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 122 - r7
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r0 = new byte[r9]
            byte[] r1 = com.mypinpad.tsdk.isolation.py.f57788j
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r5 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L32
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L27:
            int r8 = r8 + 1
            r3 = r1[r8]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L32:
            int r7 = -r7
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.py.b(byte, byte, short, java.lang.Object[]):void");
    }

    public static void c() {
        f57788j = new byte[]{92, -124, 49, 72};
    }

    public static void d() {
        f57782d = true;
        f57783e = true;
        f57781c = 1794962273;
        f57780b = new char[]{62094, 62194, 62149, 62154, 62193, 62144, 62170, 62092, 62151, 62112, 62119, 62129, 62136, 62172, 62202, 62137, 62204, 62133, 62128, 62131, 62085, 62197, 62148, 62152, 62158, 62159, 62196, 62195, 62146, 62153};
    }

    public static boolean setCompoundDrawableTintBlendMode(@NotNull String p4) {
        int i10 = f57784f + 103;
        f57785g = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        ArrayList arrayList = f57779a;
        if (arrayList instanceof Collection) {
            int i12 = f57784f + 73;
            f57785g = i12 % 128;
            if (i12 % 2 == 0) {
                arrayList.isEmpty();
                throw null;
            }
            if (arrayList.isEmpty()) {
                return false;
            }
        }
        Iterator it = arrayList.iterator();
        int i13 = f57784f + 109;
        f57785g = i13 % 128;
        int i14 = i13 % 2;
        while (it.hasNext()) {
            if (((Regex) it.next()).containsMatchIn(p4)) {
                int i15 = f57785g + 29;
                f57784f = i15 % 128;
                int i16 = i15 % 2;
                return true;
            }
        }
        return false;
    }
}
