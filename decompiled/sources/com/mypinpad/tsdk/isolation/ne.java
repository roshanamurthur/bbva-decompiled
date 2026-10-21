package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.PointerIconCompat;
import com.esotericsoftware.kryo.serializers.d;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\n\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\n\u0010\u000eR\u001a\u0010\b\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/ne;", "Lcom/mypinpad/tsdk/i/component23;", "Lcom/mypinpad/tsdk/i/ns;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/ns;)V", "", "setY", "()Z", "setDividerPadding", "()V", "setCompoundDrawableTintBlendMode", "", "([B)[B", "", "d", "J", "()J", "Lcom/mypinpad/tsdk/i/nd;", "<init>", "(Lcom/mypinpad/tsdk/i/nd;)V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardProviderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardProviderAdapter.kt\ncom/mypinpad/tsdk/internal/emvlib/CardProviderAdapter\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,101:1\n7#2,8:102\n7#2,8:110\n*S KotlinDebug\n*F\n+ 1 CardProviderAdapter.kt\ncom/mypinpad/tsdk/internal/emvlib/CardProviderAdapter\n*L\n69#1:102,8\n94#1:110,8\n*E\n"})
public final class ne implements component23 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static char[] f57245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f57250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f57251k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final nd f57252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile ns f57253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public volatile CompletableFuture<ns> f57254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long setY;

    static {
        d();
        f57249i = 0;
        f57250j = 1;
        f57247g = 0;
        f57248h = 1;
        e();
        INSTANCE = new Companion(null);
        int i10 = f57247g + 79;
        f57248h = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 59 / 0;
        }
    }

    public ne(@NotNull nd ndVar) {
        Intrinsics.checkNotNullParameter(ndVar, "");
        this.f57252a = ndVar;
        this.setY = 2000L;
    }

    public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        char c10;
        int i11;
        char[] cArr;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        char c11 = 0;
        int i12 = iArr[0];
        int i13 = 1;
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr2 = f57245e;
        float f6 = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                try {
                    Object[] objArr2 = new Object[i13];
                    objArr2[c11] = Integer.valueOf(cArr2[i17]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, 609 - (PointF.length(f6, f6) > f6 ? 1 : (PointF.length(f6, f6) == f6 ? 0 : -1)));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr3 = new Object[1];
                        c((byte) (b11 + 4), b10, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr3[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i17++;
                    cArr2 = cArr2;
                    length = length;
                    i15 = i15;
                    c11 = 0;
                    i13 = 1;
                    f6 = 0.0f;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i15;
            cArr2 = cArr3;
        } else {
            i10 = i15;
        }
        char[] cArr4 = new char[i14];
        System.arraycopy(cArr2, i12, cArr4, 0, i14);
        if (bytes != null) {
            char[] cArr5 = new char[i14];
            setnavigationonclicklistener.setX = 0;
            char c12 = 0;
            while (true) {
                int i18 = setnavigationonclicklistener.setX;
                if (i18 >= i14) {
                    break;
                }
                if (bytes[i18] == 1) {
                    int i19 = f57249i + 95;
                    f57250j = i19 % 128;
                    int i20 = i19 % 2;
                    Object[] objArr4 = {Integer.valueOf(cArr4[i18]), Integer.valueOf(c12)};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1737824323);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.getOffsetBefore("", 0) + 4449), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, TextUtils.indexOf("", "", 0) + PointerIconCompat.TYPE_GRABBING);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        c((byte) (b13 + 1), b12, b13, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls3 = Integer.TYPE;
                        method2 = cls2.getMethod(str2, cls3, cls3);
                        map2.put(1737824323, method2);
                    }
                    cArr5[i18] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    bytes = bytes;
                    Object[] objArr6 = {Integer.valueOf(cArr4[i18]), Integer.valueOf(c12)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-504758789);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 45 - View.getDefaultSize(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2627);
                        byte b14 = (byte) 0;
                        Object[] objArr7 = new Object[1];
                        c((byte) f57251k.length, b14, (byte) (b14 - 1), objArr7);
                        String str3 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str3, cls5, cls5);
                        map3.put(-504758789, method3);
                    }
                    cArr5[i18] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c12 = cArr5[setnavigationonclicklistener.setX];
                Object[] objArr8 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31347), 48 - View.MeasureSpec.makeMeasureSpec(0, 0), 840 - TextUtils.getOffsetBefore("", 0));
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr9 = new Object[1];
                    c((byte) (-b16), b15, b16, objArr9);
                    method4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr8);
                bytes = bytes;
            }
            cArr4 = cArr5;
        }
        if (i16 > 0) {
            int i21 = f57249i + 23;
            f57250j = i21 % 128;
            if (i21 % 2 == 0) {
                char[] cArr6 = new char[i14];
                System.arraycopy(cArr4, 0, cArr6, 1, i14);
                System.arraycopy(cArr6, 1, cArr4, i14 >> i16, i16);
                System.arraycopy(cArr6, i16, cArr4, 0, i14 / i16);
            } else {
                char[] cArr7 = new char[i14];
                System.arraycopy(cArr4, 0, cArr7, 0, i14);
                int i22 = i14 - i16;
                System.arraycopy(cArr7, 0, cArr4, i22, i16);
                System.arraycopy(cArr7, i16, cArr4, 0, i22);
            }
        }
        if (z10) {
            int i23 = f57250j + 29;
            f57249i = i23 % 128;
            if (i23 % 2 != 0) {
                cArr = new char[i14];
                i11 = 1;
                setnavigationonclicklistener.setX = 1;
            } else {
                i11 = 1;
                cArr = new char[i14];
                setnavigationonclicklistener.setX = 0;
            }
            while (true) {
                int i24 = setnavigationonclicklistener.setX;
                if (i24 >= i14) {
                    break;
                }
                cArr[i24] = cArr4[(i14 - i24) - i11];
                setnavigationonclicklistener.setX = i24 + 1;
                int i25 = f57250j + 51;
                f57249i = i25 % 128;
                int i26 = i25 % 2;
            }
            c10 = 2;
            cArr4 = cArr;
        } else {
            c10 = 2;
        }
        if (i10 > 0) {
            int i27 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i27;
                int i28 = setnavigationonclicklistener.setX;
                if (i28 >= i14) {
                    break;
                }
                cArr4[i28] = (char) (cArr4[i28] - iArr[c10]);
                i27 = i28 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x01b6  */
    public static void b(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13 = f57249i + 21;
        f57250j = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        int i16 = 0;
        getnavbartitlestring.setY = 0;
        while (true) {
            int i17 = getnavbartitlestring.setY;
            if (i17 >= i10) {
                break;
            }
            char c10 = charArray[i17];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i17] = c11;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(f57246f);
                objArr2[i16] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0', i16) + 1), TextUtils.indexOf("", "", i16, i16) + 41, 483 - View.MeasureSpec.makeMeasureSpec(i16, i16));
                    byte b10 = (byte) i16;
                    byte b11 = (byte) (-f57251k[i14]);
                    Object[] objArr3 = new Object[1];
                    c(b11, b10, (byte) (b10 - 1), objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf("", "", 0) + 55966), 44 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2268 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    c((byte) (b13 & DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), b12, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 2;
                i16 = 0;
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
        if (i12 > 0) {
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i18 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i18, i18);
            int i19 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i19, cArr, 0, i10 - i19);
        }
        if (z10) {
            int i20 = f57250j + 61;
            f57249i = i20 % 128;
            int i21 = i20 % 2;
            char[] cArr3 = new char[i10];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i22 = getnavbartitlestring.setY;
                if (i22 >= i10) {
                    break;
                }
                cArr3[i22] = cArr[(i10 - i22) - 1];
                Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (55966 - (ViewConfiguration.getScrollBarSize() >> 8)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 44, 2268 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    c((byte) (b15 & DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), b14, b15, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = 101 - r7
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.ne.f57251k
            if (r2 != 0) goto L15
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            goto L33
        L15:
            r3 = r1
        L16:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r7 = r7 + 1
            r0[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2a:
            r3 = r2[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L33:
            int r7 = -r7
            int r7 = r7 + r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ne.c(int, short, short, java.lang.Object[]):void");
    }

    public static void d() {
        f57251k = new byte[]{22, 117, -35, 69};
    }

    public static void e() {
        f57245e = new char[]{59125, 58961, 58922, 58920, 58920, 58915, 58881, 58889, 58921, 58915, 58924, 58915, 58924, 58926, 58927, 58927, 58881, 58881, 58925, 58965, 58920, 59055, 59131, 59129, 59131, 59090, 59102, 59130, 59133, 59135, 59133, 59095, 59102, 59129, 59120, 59131, 59131, 59134, 59135, 59094, 59094, 59135, 59109, 59100, 59042, 59103, 59089, 59044, 59103, 59135, 59121, 59075, 59083, 59128, 59121, 59135, 58893, 59300, 59325, 59314, 59300, 59293, 59283, 59322, 59323, 59314, 59319, 59327, 59300, 59321, 59324, 59325, 59085, 58913, 58912, 58925, 58920, 58915, 58939, 58918, 58927, 58926, 58887, 58887, 58924, 58926, 58920};
        f57246f = -443080038;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        ne neVar = (ne) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        mr mrVar = mr.getNavBarTitleString;
        Object[] objArr2 = new Object[1];
        b(10 - (ViewConfiguration.getFadingEdgeLength() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 172, 7 - ExpandableListView.getPackedPositionChild(0L), "\ufffe\ufffa\ufff8\b\u0003\ufff6\u0007\t\ufffa\u000b", true, objArr2);
        mt.setX(new Object[]{mrVar, ((String) objArr2[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        if (bArr == null) {
            int i13 = f57248h + 79;
            f57247g = i13 % 128;
            return i13 % 2 != 0 ? new byte[1] : new byte[0];
        }
        ns nsVar = neVar.f57253b;
        if (nsVar != null) {
            int i14 = f57248h + 25;
            f57247g = i14 % 128;
            if (i14 % 2 != 0) {
                nsVar.setDividerPadding(bArr);
                throw null;
            }
            byte[] dividerPadding = nsVar.setDividerPadding(bArr);
            if (dividerPadding != null) {
                return dividerPadding;
            }
        }
        TerminalException terminalException = new TerminalException(10010, null, null);
        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
        throw terminalException;
    }

    @Override // com.mypinpad.tsdk.isolation.component23
    public final synchronized void setCompoundDrawableTintBlendMode() {
        try {
            int i10 = f57247g + 15;
            f57248h = i10 % 128;
            int i11 = i10 % 2;
            mr mrVar = mr.getNavBarTitleString;
            Object[] objArr = new Object[1];
            a("\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001", true, new int[]{72, 15, 74, 0}, objArr);
            mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
            ns nsVar = this.f57253b;
            if (nsVar != null) {
                nsVar.setX();
            }
            this.f57253b = null;
            CompletableFuture<ns> completableFuture = this.f57254c;
            if (completableFuture != null) {
                completableFuture.cancel(false);
            }
            this.f57254c = null;
            int i12 = f57248h + 23;
            f57247g = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.component23
    public final void setDividerPadding() throws Throwable {
        Unit unit;
        int i10 = f57248h + 29;
        f57247g = i10 % 128;
        int i11 = i10 % 2;
        mr mrVar = mr.getNavBarTitleString;
        Object[] objArr = new Object[1];
        a("\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001", false, new int[]{56, 16, 190, 0}, objArr);
        mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
        this.f57252a.setY();
        ns nsVar = this.f57253b;
        if (nsVar != null) {
            nsVar.setCompoundDrawableTintBlendMode(setX());
            unit = Unit.INSTANCE;
        } else {
            int i12 = f57247g + 103;
            f57248h = i12 % 128;
            int i13 = i12 % 2;
            unit = null;
        }
        if (unit != null) {
            return;
        }
        TerminalException terminalException = new TerminalException(10010, null, null);
        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
        throw terminalException;
    }

    @Override // com.mypinpad.tsdk.isolation.component23
    @JvmName(name = "setX")
    public final long setX() {
        int i10 = f57247g;
        int i11 = i10 + 117;
        f57248h = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 9;
        f57248h = i13 % 128;
        int i14 = i13 % 2;
        return this.setY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.mr.getNavBarTitleString;
        r0 = new java.lang.Object[1];
        b(27 - android.view.View.getDefaultSize(0, 0), 165 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), android.text.TextUtils.indexOf("", "", 0) + 22, "\u0005\u000f\uffff\u000b\u0012\u0001\u000e\u0015ﾼ\n\u000b\u0010ﾼ\u000e\u0001\r\u0011\u0001\u000f\u0010\u0001\u0000\u0010�\u0003ﾼ\u0000", false, r0);
        com.mypinpad.tsdk.isolation.mt.setX(new java.lang.Object[]{r12, ((java.lang.String) r0[0]).intern()}, -855939515, 855939522, (int) java.lang.System.currentTimeMillis());
        r12 = com.mypinpad.tsdk.isolation.ne.f57247g + 5;
        com.mypinpad.tsdk.isolation.ne.f57248h = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b7, code lost:
    
        if ((r12 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006d, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        r0.complete(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setX(@org.jetbrains.annotations.NotNull com.mypinpad.tsdk.isolation.ns r12) throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = com.mypinpad.tsdk.isolation.ne.f57247g
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.ne.f57248h = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = -135701017(0xfffffffff7e95de7, float:-9.466482E33)
            r3 = 135701020(0x816a21c, float:4.532954E-34)
            r4 = 10
            r5 = 82
            r6 = 21
            java.lang.String r7 = "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000"
            java.lang.String r8 = ""
            r9 = 1
            r10 = 0
            if (r0 != 0) goto L47
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r8)
            com.mypinpad.tsdk.i.mr r0 = com.mypinpad.tsdk.isolation.mr.getNavBarTitleString
            int[] r4 = new int[]{r10, r6, r5, r4}
            java.lang.Object[] r5 = new java.lang.Object[r9]
            a(r7, r10, r4, r5)
            r4 = r5[r10]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r10] = r0
            r5[r9] = r4
            long r6 = java.lang.System.currentTimeMillis()
            int r0 = (int) r6
            com.mypinpad.tsdk.isolation.mt.setX(r5, r3, r2, r0)
            java.util.concurrent.CompletableFuture<com.mypinpad.tsdk.i.ns> r0 = r11.f57254c
            if (r0 == 0) goto L73
            goto L6f
        L47:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r8)
            com.mypinpad.tsdk.i.mr r0 = com.mypinpad.tsdk.isolation.mr.getNavBarTitleString
            int[] r4 = new int[]{r10, r6, r5, r4}
            java.lang.Object[] r5 = new java.lang.Object[r9]
            a(r7, r10, r4, r5)
            r4 = r5[r10]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r10] = r0
            r5[r9] = r4
            long r6 = java.lang.System.currentTimeMillis()
            int r0 = (int) r6
            com.mypinpad.tsdk.isolation.mt.setX(r5, r3, r2, r0)
            java.util.concurrent.CompletableFuture<com.mypinpad.tsdk.i.ns> r0 = r11.f57254c
            if (r0 == 0) goto L73
        L6f:
            ae.c.f(r0, r12)
            return
        L73:
            com.mypinpad.tsdk.i.mr r12 = com.mypinpad.tsdk.isolation.mr.getNavBarTitleString
            int r0 = android.view.View.getDefaultSize(r10, r10)
            int r2 = 27 - r0
            r0 = 48
            int r0 = android.text.TextUtils.indexOf(r8, r0, r10)
            int r3 = 165 - r0
            r6 = 0
            java.lang.String r5 = "\u0005\u000f\uffff\u000b\u0012\u0001\u000e\u0015ﾼ\n\u000b\u0010ﾼ\u000e\u0001\r\u0011\u0001\u000f\u0010\u0001\u0000\u0010�\u0003ﾼ\u0000"
            int r0 = android.text.TextUtils.indexOf(r8, r8, r10)
            int r4 = r0 + 22
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r7 = r0
            b(r2, r3, r4, r5, r6, r7)
            r0 = r0[r10]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r10] = r12
            r2[r9] = r0
            long r3 = java.lang.System.currentTimeMillis()
            int r12 = (int) r3
            r0 = -855939515(0xffffffffccfb6645, float:-1.31805736E8)
            r3 = 855939522(0x330499c2, float:3.0873487E-8)
            com.mypinpad.tsdk.isolation.mt.setX(r2, r0, r3, r12)
            int r12 = com.mypinpad.tsdk.isolation.ne.f57247g
            int r12 = r12 + 5
            int r0 = r12 % 128
            com.mypinpad.tsdk.isolation.ne.f57248h = r0
            int r12 = r12 % r1
            if (r12 == 0) goto Lba
            return
        Lba:
            r12 = 0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ne.setX(com.mypinpad.tsdk.i.ns):void");
    }

    @Override // com.mypinpad.tsdk.isolation.component23
    @NotNull
    public final byte[] setDividerPadding(@Nullable byte[] p4) {
        return (byte[]) setY(new Object[]{this, p4}, 1226419130, -1226419130, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.component23
    public final boolean setY() throws Throwable {
        mr mrVar = mr.getNavBarTitleString;
        boolean z10 = false;
        Object[] objArr = new Object[1];
        b(14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 166 - KeyEvent.getDeadChar(0, 0), 13 - (Process.myPid() >> 22), "\u0000\u0005\u000f\uffff\u000b\u0012\u0001\u000eﾼ\uffff�\u000e\u0000", false, objArr);
        mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
        this.f57252a.setCompoundDrawableTintBlendMode();
        CompletableFuture<ns> completableFutureB = d.b();
        this.f57254c = completableFutureB;
        try {
            this.f57253b = (ns) completableFutureB.get();
            z10 = true;
        } catch (Exception e5) {
            if (e5 instanceof CancellationException) {
                mr mrVar2 = mr.setOnFocusChangeListener;
                Object[] objArr2 = new Object[1];
                b(37 - ExpandableListView.getPackedPositionChild(0L), 155 - MotionEvent.axisFromString(""), TextUtils.indexOf((CharSequence) "", '0', 0) + 20, "ￆ\u000e\u0007\u0019ￆ\b\u000b\u000b\u0014ￆ\t\u0007\u0014\t\u000b\u0012\u0012\u000b\n�\u0007\u000f\u001a\u000f\u0014\rￆ\f\u0015\u0018ￆ\ufff4￬￩ￆ\u001a\u0007\r", false, objArr2);
                mt.setX(new Object[]{((String) objArr2[0]).intern()}, 1189439426, -1189439420, (int) System.currentTimeMillis());
            } else {
                mr mrVar3 = mr.setOnFocusChangeListener;
                Object[] objArr3 = new Object[1];
                a("\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{21, 35, 0, 30}, objArr3);
                mt.setX(new Object[]{((String) objArr3[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                int i10 = f57248h + 37;
                f57247g = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = f57247g + 63;
            f57248h = i12 % 128;
            int i13 = i12 % 2;
        }
        this.f57254c = null;
        return z10;
    }
}
