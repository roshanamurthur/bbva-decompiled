package com.mypinpad.tsdk.isolation;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class vm extends FunctionReferenceImpl implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f61567p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f61568q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61569r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61570s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f61571t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f61572u0 = null;

    static {
        c();
        f61571t0 = 1;
        f61569r0 = 0;
        f61570s0 = 1;
        f61568q0 = 8063303508941216646L;
        f61567p0 = new char[]{50804, 7143, 32070, 24246, 45080, 37499, 63426, 51531, 10927, 3101, 28287, 17392, 42315, 34491, 55326, 14974, 8168, 29007, 21157, 46103, 38523, 60363, 52564, 18055, 39700, 64949, 56901, 12523, 4744, 30513, 18872, 43612, 36078, 61068, 49923, 9656, 1608, 22765, 47757, 40731, 61884, 53846, 13540, 5768, 27448, 19879, 44561, 32950, 58035};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vm(Object obj) throws Throwable {
        Object[] objArr = new Object[1];
        a((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (33012 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, objArr2);
        super(0, obj, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0256  */
    /* JADX WARN: Code duplicated, block: B:48:0x0257  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        int i12;
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i13 = setcompounddrawabletintblendmode.setDividerPadding;
            i12 = f61571t0;
            if (i13 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f61567p0[i10 + i13])};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(1832327647);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (KeyEvent.getMaxKeyCode() >> 16), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 728 - (ViewConfiguration.getTouchSlop() >> 8));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b11, b11, b10, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                    map.put(1832327647, method);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f61568q0), Integer.valueOf(c10)};
                Object method2 = map.get(2012362404);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (46115 - ExpandableListView.getPackedPositionChild(0L)), 43 - (ViewConfiguration.getLongPressTimeout() >> 16), 1776 - (ViewConfiguration.getTouchSlop() >> 8));
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    b(b13, b13, b12, objArr5);
                    String str = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method2 = cls2.getMethod(str, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method2);
                }
                jArr[i13] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method3 = map.get(1606688712);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) + 27, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2310);
                    byte b14 = (byte) 5;
                    byte b15 = (byte) (b14 - 5);
                    Object[] objArr7 = new Object[1];
                    b(b15, b15, b14, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                int i14 = i12 + 27;
                int i15 = i14 % 128;
                int i16 = i14 % 2;
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
        char[] cArr = new char[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i17 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i17 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i18 = i12 + 29;
            int i19 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr[i17] = (char) jArr[i17];
                Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Map map2 = setTextScaleX.setMaxEms;
                Object method4 = map2.get(1606688712);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 27 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2312);
                    byte b16 = (byte) 5;
                    byte b17 = (byte) (b16 - 5);
                    Object[] objArr9 = new Object[1];
                    b(b17, b17, b16, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                    map2.put(1606688712, method4);
                }
                ((Method) method4).invoke(null, objArr8);
                throw null;
            }
            cArr[i17] = (char) jArr[i17];
            Object[] objArr10 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map3 = setTextScaleX.setMaxEms;
            Object method5 = map3.get(1606688712);
            if (method5 == null) {
                Class cls6 = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionChild(0L) + 28, 2359 - AndroidCharacter.getMirror('0'));
                byte b18 = (byte) 5;
                byte b19 = (byte) (b18 - 5);
                Object[] objArr11 = new Object[1];
                b(b19, b19, b18, objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map3.put(1606688712, method5);
            }
            ((Method) method5).invoke(null, objArr10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 67
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.vm.f61572u0
            if (r2 != 0) goto L19
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L34
        L19:
            r3 = r1
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r6 = -r6
            int r7 = r7 + 1
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.vm.b(int, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f61572u0 = new byte[]{81, -106, ByteSourceJsonBootstrapper.UTF8_BOM_3, 63};
    }

    public final void d() throws Throwable {
        int i10 = f61569r0 + 17;
        f61570s0 = i10 % 128;
        if (i10 % 2 != 0) {
            ul.setDividerPadding(new Object[]{(ul) this.receiver}, -1908454412, 1908454418, (int) System.currentTimeMillis());
        } else {
            ul.setDividerPadding(new Object[]{(ul) this.receiver}, -1908454412, 1908454418, (int) System.currentTimeMillis());
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() throws Throwable {
        int i10 = f61570s0 + 75;
        f61569r0 = i10 % 128;
        int i11 = i10 % 2;
        d();
        if (i11 == 0) {
            return Unit.INSTANCE;
        }
        int i12 = 99 / 0;
        return Unit.INSTANCE;
    }
}
