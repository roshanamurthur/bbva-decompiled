package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "d", "()V"}, k = 3, mv = {1, 5, 1})
final class l3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char[] f56892r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f56893s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final boolean f56894t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final boolean f56895u0;
    public static final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f56896w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f56897x0 = null;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f56898y0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MonitoringModuleImplementation f56899p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<getCode> f56900q0;

    static {
        c();
        f56896w0 = 0;
        v0 = 1;
        f56894t0 = true;
        f56895u0 = true;
        f56893s0 = 1794962409;
        f56892r0 = new char[]{62280, 62285, 62252, 62335, 62284, 62327, 62333, 62330, 62217, 62320, 62286};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l3(MonitoringModuleImplementation monitoringModuleImplementation, List<? extends getCode> list) {
        super(0);
        this.f56899p0 = monitoringModuleImplementation;
        this.f56900q0 = list;
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        int i11 = f56896w0 + 93;
        int i12 = i11 % 128;
        int i13 = 0;
        if (i11 % 2 == 0) {
            int i14 = 21 / 0;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = f56892r0;
        long j10 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i13] = Integer.valueOf(cArr[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((Process.myPid() >> 22) + 26288), ImageFormat.getBitsPerPixel(i13) + 65, ExpandableListView.getPackedPositionGroup(j10) + 1595);
                        byte b10 = (byte) 2;
                        byte b11 = (byte) (b10 - 3);
                        Object[] objArr3 = new Object[1];
                        b((byte) (b11 + 1), b10, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i15++;
                    i13 = 0;
                    j10 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f56893s0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf("", "", 0, 0) + 10744), 43 - Color.green(0), 566 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            byte b12 = (byte) (f56898y0 & 7);
            byte b13 = (byte) (-b12);
            Object[] objArr5 = new Object[1];
            b((byte) (b13 + 1), b12, b13, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!f56895u0) {
            if (!f56894t0) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i16 = setz.setDividerPadding;
            int i17 = setz.setOnFocusChangeListener;
            if (i16 >= i17) {
                break;
            }
            cArr3[i16] = (char) (cArr[bytes[(i17 - 1) - i16] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getSize(0), 52 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 2880);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr7 = new Object[1];
                b((byte) (b15 + 1), b14, b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
        String str2 = new String(cArr3);
        int i18 = f56896w0 + 111;
        int i19 = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 122 - r7
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.l3.f56897x0
            r2 = 0
            if (r1 != 0) goto L18
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L38
        L18:
            r3 = r2
            r5 = r8
            r8 = r7
        L1b:
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L38:
            int r6 = -r6
            int r6 = r6 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.l3.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f56897x0 = new byte[]{121, 73, -85, -96};
        f56898y0 = 121;
    }

    public final void d() {
        component31 component31Var = (component31) MonitoringModuleImplementation.setX(new Object[]{this.f56899p0}, 1064033728, -1064033727, (int) System.currentTimeMillis());
        MonitoringModuleImplementation monitoringModuleImplementation = this.f56899p0;
        List<getCode> list = this.f56900q0;
        synchronized (component31Var) {
            MonitoringModuleImplementation.setX(monitoringModuleImplementation);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a(TextUtils.getCapsMode("", 0, 0) + 127, "\u0089\u008b\u0086\u008a\u0082\u0082\u0081\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(list.size());
            Object[] objArr2 = new Object[1];
            a(127 - Color.red(0), "\u0088\u0087\u0086\u0085\u0084\u0085\u0089", objArr2);
            sb2.append(((String) objArr2[0]).intern());
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb2.toString()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
            ((component31) MonitoringModuleImplementation.setX(new Object[]{monitoringModuleImplementation}, 1064033728, -1064033727, (int) System.currentTimeMillis())).setY(list);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        int i10 = v0;
        int i11 = i10 + 87;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        d();
        int i14 = i10 + 21;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        return Unit.INSTANCE;
    }
}
