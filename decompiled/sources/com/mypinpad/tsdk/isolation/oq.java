package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.b;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.budiyev.android.codescanner.BarcodeUtils;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0019"}, d2 = {"Lcom/mypinpad/tsdk/i/oq;", "", "Lorg/json/JSONObject;", "p0", "Lcom/mypinpad/tsdk/i/setLineBreakWordStyle;", "setX", "(Lorg/json/JSONObject;)Lcom/mypinpad/tsdk/i/setLineBreakWordStyle;", "Lcom/mypinpad/tsdk/i/AuthorizationGrant;", "setOnFocusChangeListener", "(Lorg/json/JSONObject;)Lcom/mypinpad/tsdk/i/AuthorizationGrant;", "Lcom/mypinpad/tsdk/i/setFocusedByDefault;", "setY", "(Lorg/json/JSONObject;)Lcom/mypinpad/tsdk/i/setFocusedByDefault;", "", "", "p1", "p2", "p3", "p4", "Lcom/mypinpad/tsdk/i/yo;", "setCompoundDrawableTintBlendMode", "(Ljava/lang/String;[B[B[B[B)Lcom/mypinpad/tsdk/i/yo;", "setDividerPadding", "([BLjava/lang/String;)Lcom/mypinpad/tsdk/i/yo;", "Ljava/util/UUID;", "(Ljava/util/UUID;[B)Lcom/mypinpad/tsdk/i/yo;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeyManagementServiceSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyManagementServiceSerializer.kt\ncom/mypinpad/tsdk/internal/keymanagement/KeyManagementServiceSerializer\n+ 2 HexEncoding.kt\ncom/mypinpad/common/bytes/encoding/hex/HexEncodingKt\n*L\n1#1,128:1\n13#2,6:129\n30#2,34:135\n19#2,3:169\n*S KotlinDebug\n*F\n+ 1 KeyManagementServiceSerializer.kt\ncom/mypinpad/tsdk/internal/keymanagement/KeyManagementServiceSerializer\n*L\n77#1:129,6\n77#1:135,34\n77#1:169,3\n*E\n"})
public final class oq {

    @NotNull
    public static final oq INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char[] f57533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f57534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f57539g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f57540h = 0;

    static {
        c();
        f57537e = 0;
        f57538f = 1;
        f57535c = 0;
        f57536d = 1;
        d();
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getTapTimeout();
        AudioTrack.getMaxVolume();
        KeyEvent.keyCodeFromString("");
        TextUtils.getOffsetBefore("", 0);
        Color.green(0);
        INSTANCE = new oq();
        int i10 = f57535c + 125;
        f57536d = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 42 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0281  */
    /* JADX WARN: Code duplicated, block: B:48:0x0282  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        int i12;
        Object method;
        Object method2;
        Throwable cause;
        Object method3;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        int i13 = 0;
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        int i14 = f57538f + 43;
        f57537e = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            int i16 = setcompounddrawabletintblendmode.setDividerPadding;
            i12 = f57540h;
            if (i16 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i13] = Integer.valueOf(f57533a[i10 + i16]);
                Map map = setTextScaleX.setMaxEms;
                Object method4 = map.get(1832327647);
                if (method4 == null) {
                    Class cls = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", i13, i13), View.getDefaultSize(i13, i13) + 44, 727 - ExpandableListView.getPackedPositionChild(0L));
                    byte b10 = (byte) i13;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, (byte) (b11 + 1), objArr3);
                    String str = (String) objArr3[i13];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i13] = Integer.TYPE;
                    method4 = cls.getMethod(str, clsArr);
                    map.put(1832327647, method4);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method4).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f57534b), Integer.valueOf(c10)};
                Object obj = map.get(2012362404);
                if (obj != null) {
                    method3 = obj;
                } else {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46116), 43 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1776 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    byte b12 = (byte) (i12 & 3);
                    byte b13 = (byte) (-b12);
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, (byte) (b13 + 1), objArr5);
                    String str2 = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method3 = cls2.getMethod(str2, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method3);
                }
                jArr[i16] = ((Long) ((Method) method3).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method5 = map.get(1606688712);
                if (method5 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) + 27, 2311 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b14 = (byte) (i12 & 23);
                    byte b15 = (byte) (-1);
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, (byte) (b15 + 1), objArr7);
                    method5 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method5);
                }
                ((Method) method5).invoke(null, objArr6);
                i13 = 0;
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
            int i18 = f57537e + 71;
            f57538f = i18 % 128;
            if (i18 % 2 == 0) {
                cArr[i17] = (char) jArr[i17];
                Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Map map2 = setTextScaleX.setMaxEms;
                Object obj2 = map2.get(1606688712);
                if (obj2 != null) {
                    method = obj2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore("", 0), 27 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2312 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    byte b16 = (byte) (-1);
                    Object[] objArr9 = new Object[1];
                    b((byte) (i12 & 23), b16, (byte) (b16 + 1), objArr9);
                    method = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                    map2.put(1606688712, method);
                }
                ((Method) method).invoke(null, objArr8);
                int i19 = 82 / 0;
            } else {
                cArr[i17] = (char) jArr[i17];
                Object[] objArr10 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Map map3 = setTextScaleX.setMaxEms;
                Object obj3 = map3.get(1606688712);
                if (obj3 != null) {
                    method2 = obj3;
                } else {
                    Class cls6 = (Class) setTextScaleX.setX((char) View.combineMeasuredStates(0, 0), 28 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2311 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    byte b17 = (byte) (-1);
                    Object[] objArr11 = new Object[1];
                    b((byte) (i12 & 23), b17, (byte) (b17 + 1), objArr11);
                    method2 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map3.put(1606688712, method2);
                }
                ((Method) method2).invoke(null, objArr10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 67
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.oq.f57539g
            r2 = 0
            if (r1 != 0) goto L16
            r6 = r7
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L32
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r7]
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L32:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.oq.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f57539g = new byte[]{MessageUtils.MESSAGE_30_RS, -118, 53, -90};
        f57540h = 173;
    }

    public static void d() {
        f57534b = -3786508109039297568L;
        f57533a = new char[]{50805, 39822, 32151, 57244, 45453, 5022, 62871, 22429, 42853, 64148, 47301, 58676, 775, 41265, 53051, 27950, 35621, 10556, 22329, 62722, 4881, 50798, 39827, 32133, 57272, 45465, 5010, 62872, 22417, 10655, 35723, 28065, 53169, 34817, 54779, 13290, 37361, 65525, 24033, 48109, 6634, 26612, 2489, 21568, 45651, 4177, 32336, 56390, 14946, 38978, 58948, 17509, 41598, 's', 28284, 52331, 10869, 50796, 39829, 32134, 57220, 45445, 5011, 62903, 22423, 10641, 35760, 28075, 53158, 41385, 958, 58784, 18315, 6581, 64455, 24010, 16329, 37336, 29637, 54726, 47069, 50794, 39813, 32150, 57243, 45445, 5023, 62874, 64686, 41300, 18263, 58711, 35652, 10591, 53041, 27962, 4926, 45318, 22282, 62816, 39690, 63276, 43713, 19653, 61141, 32980, 8898, 50372, 26333, 6340, 47870, 23803, 65206, 37111, 13042, 54506, 30439, 50799, 39813, 32129, 57228, 45481, 5022, 62848, 22410, 10643, 35760, 28093, 48977, 58017, 1188, 42656, 51371, 27321, 35986, 11959, 20641, 62086, 5305, 46727, 55438, 31370, 50798, 39827, 32133, 57251, 45449, 5001, 62903, 22416, 10653, 35753, 28074, 50809, 39821, 32146, 57261, 45442, 5011, 62854, 22401, 10636, 35764, 28077, 53159, 41378, 896, 58785, 18362, 6576, 64457, 24007, 16355, 37321, 29641, 5180, 18888, 45015, 3560, 25543, 49622, 10179, 34244, 64457, 23025, 49128, 7650, 29671, 53701, 14308, 38399, 52213, 10636, 36738, 60838, 17292, 41356, 1954, 26004, 56222, 14763, 40864, 64953, 21436, 45479, 6068, 40582, 50044, 9579, 34664, 59761, 19310, 44405, 3940, 29030, 54142, 13663, 38724, 63822, 23383, 48473, 8061, 16727, 41783, 50792, 39826, 32133, 57222, 45471, 4992, 62875, 22410, 10632, 35728, 28081, 53162, 41376, 953, 58807, 18323, 6585, 64473, 24055, 16321, 37323, 29662, 54741, 47052, 2505, 60402, 19937, 50813, 39824, 32148, 57261, 45442, 4996, 62854, 22423, 10636, 35769, 28033, 53158, 41391, 930, 58797, 18344, 6568, 64453, 24000, 34459, 56169, 15729, 40781, 61796, 31068, 9388, 49833, 24749, 3750, 44212, 19103, 59578, 38572, 13451, 53940, 28810, 7811, 48263, 23218, 63637, 42652, 17649, 58110, 33019, 12027, 52470, 27379, 50778, 39809, 32141, 57220, 45449, 5012, 62932, 22410, 10649, 35761, 28081, 53153, 41406, 949, 58809, 18365, 6578, 64468, 23946, 38127, 51478, 12037, 36103, 58118, 16656, 42804, 1300, 31506, 55603, 16168, 40229, 62250, 20797, 46883, 5406, 19249, 43328, 3925, 27986, 50015, 8519, 34642, 58719, 37192, 52401, 10914, 34976, 59041, 17591, 41619, 179, 32437, 56468, 14991, 39042, 63117, 21658, 45700, 4279, 20125, 44285, 2761, 26856, 23943, AbstractJsonLexerKt.END_OBJ, 58988, 17527, 10867, 34919, 28267, 52332, 45682, 4204, 63067, 21568, 14917, 38979, 32321, 56396, 41862, 65137, 6264, 47717, 54378, 30335, 36991, 12910, 19564, 61009, 2157, 43602, 50241, 26204, 32834, Typography.almostEqual, 31821, 10606, 29846, 37508, 12521, 24298, 64757, 6784, 47240, 50818, 25772, 33478};
    }

    @NotNull
    public static yo setCompoundDrawableTintBlendMode(@NotNull String p4, @NotNull byte[] p10, @NotNull byte[] p11, @NotNull byte[] p12, @NotNull byte[] p13) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        yo.Companion companion = yo.INSTANCE;
        JSONObject jSONObject = new JSONObject();
        Object[] objArr = new Object[1];
        a((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), View.MeasureSpec.getMode(0), TextUtils.lastIndexOf("", '0') + 9, objArr);
        String strIntern = ((String) objArr[0]).intern();
        JSONObject jSONObject2 = new JSONObject();
        Object[] objArr2 = new Object[1];
        a((char) ((Process.myPid() >> 22) + 24848), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, TextUtils.getOffsetAfter("", 0) + 2, objArr2);
        JSONObject jSONObjectPut = jSONObject2.put(((String) objArr2[0]).intern(), p4);
        Object[] objArr3 = new Object[1];
        a((char) (32432 - Color.alpha(0)), (KeyEvent.getMaxKeyCode() >> 16) + 10, ExpandableListView.getPackedPositionType(0L) + 11, objArr3);
        JSONObject jSONObjectPut2 = jSONObjectPut.put(((String) objArr3[0]).intern(), (String) ux.setCompoundDrawableTintBlendMode(new Object[]{p10}, 1019201663, -1019201662, (int) System.currentTimeMillis()));
        Object[] objArr4 = new Object[1];
        a((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 21 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 11 - Process.getGidForName(""), objArr4);
        JSONObject jSONObjectPut3 = jSONObject.put(strIntern, jSONObjectPut2.put(((String) objArr4[0]).intern(), (String) ux.setCompoundDrawableTintBlendMode(new Object[]{p11}, 1019201663, -1019201662, (int) System.currentTimeMillis())));
        Object[] objArr5 = new Object[1];
        a((char) (20092 - (ViewConfiguration.getPressedStateDuration() >> 16)), 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.argb(0, 0, 0, 0) + 9, objArr5);
        String strIntern2 = ((String) objArr5[0]).intern();
        JSONObject jSONObject3 = new JSONObject();
        Object[] objArr6 = new Object[1];
        a((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 53206), 42 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr6);
        JSONObject jSONObjectPut4 = jSONObject3.put(((String) objArr6[0]).intern(), (String) ux.setCompoundDrawableTintBlendMode(new Object[]{p12}, 1019201663, -1019201662, (int) System.currentTimeMillis()));
        Object[] objArr7 = new Object[1];
        a((char) View.getDefaultSize(0, 0), 57 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, objArr7);
        JSONObject jSONObjectPut5 = jSONObjectPut4.put(((String) objArr7[0]).intern(), (String) ux.setCompoundDrawableTintBlendMode(new Object[]{p13}, 1019201663, -1019201662, (int) System.currentTimeMillis()));
        Object[] objArr8 = new Object[1];
        a((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 82 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 7, objArr8);
        String strIntern3 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a((char) (15094 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 88, 13 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
        String string = jSONObjectPut3.put(strIntern2, jSONObjectPut5.put(strIntern3, ((String) objArr9[0]).intern())).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        yj.setX setx = yj.setOnFocusChangeListener;
        Object[] objArr10 = new Object[1];
        a((char) (12624 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 100, 16 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr10);
        yo yoVar = (yo) yo.Companion.setOnFocusChangeListener(new Object[]{string, (yj) yj.setX.setDividerPadding(new Object[]{((String) objArr10[0]).intern()}, -2934678, 2934679, (int) System.currentTimeMillis())}, 1582490390, -1582490390, (int) System.currentTimeMillis());
        int i10 = f57535c + 41;
        f57536d = i10 % 128;
        int i11 = i10 % 2;
        return yoVar;
    }

    @NotNull
    public static yo setDividerPadding(@NotNull UUID p4, @NotNull byte[] p10) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        yo.Companion companion = yo.INSTANCE;
        JSONObject jSONObject = new JSONObject();
        Object[] objArr = new Object[1];
        a((char) (21123 - View.MeasureSpec.makeMeasureSpec(0, 0)), 317 - TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, objArr);
        JSONObject jSONObjectPut = jSONObject.put(((String) objArr[0]).intern(), (String) ux.setCompoundDrawableTintBlendMode(new Object[]{p10}, 1019201663, -1019201662, (int) System.currentTimeMillis()));
        Object[] objArr2 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionGroup(0L) + 22308), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 341, (ViewConfiguration.getEdgeSlop() >> 16) + 20, objArr2);
        JSONObject jSONObjectPut2 = jSONObjectPut.put(((String) objArr2[0]).intern(), p4.toString());
        Object[] objArr3 = new Object[1];
        a((char) (39931 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 362, 16 - (Process.myPid() >> 22), objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((char) (15094 - ExpandableListView.getPackedPositionChild(0L)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 88, 12 - TextUtils.lastIndexOf("", '0', 0), objArr4);
        JSONObject jSONObjectPut3 = jSONObjectPut2.put(strIntern, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a((char) (26110 - Process.getGidForName("")), 377 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5);
        String strIntern2 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a((char) (61234 - ImageFormat.getBitsPerPixel(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 393, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, objArr6);
        String string = jSONObjectPut3.put(strIntern2, ((String) objArr6[0]).intern()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        yj.setX setx = yj.setOnFocusChangeListener;
        Object[] objArr7 = new Object[1];
        a((char) (12625 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 101, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, objArr7);
        yo yoVar = (yo) yo.Companion.setOnFocusChangeListener(new Object[]{string, (yj) yj.setX.setDividerPadding(new Object[]{((String) objArr7[0]).intern()}, -2934678, 2934679, (int) System.currentTimeMillis())}, 1582490390, -1582490390, (int) System.currentTimeMillis());
        int i10 = f57535c + 27;
        f57536d = i10 % 128;
        int i11 = i10 % 2;
        return yoVar;
    }

    @NotNull
    public static AuthorizationGrant setOnFocusChangeListener(@NotNull JSONObject p4) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        Object[] objArr = new Object[1];
        a((char) (20092 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 33, 9 - TextUtils.indexOf("", ""), objArr);
        JSONObject jSONObject = p4.getJSONObject(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 117 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 11 - TextUtils.indexOf("", ""), objArr2);
        JSONObject jSONObject2 = p4.getJSONObject(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionGroup(0L) + 53205), View.MeasureSpec.makeMeasureSpec(0, 0) + 42, 15 - TextUtils.getOffsetBefore("", 0), objArr3);
        byte[] bArrH = b.h((String) objArr3[0], jSONObject, "");
        Object[] objArr4 = new Object[1];
        a((char) Color.alpha(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 57, 24 - (KeyEvent.getMaxKeyCode() >> 16), objArr4);
        byte[] bArrH2 = b.h((String) objArr4[0], jSONObject, "");
        Object[] objArr5 = new Object[1];
        a((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 251, (KeyEvent.getMaxKeyCode() >> 16) + 19, objArr5);
        byte[] bArrH3 = b.h((String) objArr5[0], jSONObject2, "");
        Object[] objArr6 = new Object[1];
        a((char) (16619 - Process.getGidForName("")), 270 - ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5, objArr6);
        UUID uuidFromString = UUID.fromString(jSONObject2.getString(((String) objArr6[0]).intern()));
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
        AuthorizationGrant authorizationGrant = new AuthorizationGrant(bArrH, bArrH2, bArrH3, uuidFromString);
        int i10 = f57535c + 61;
        f57536d = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 9 / 0;
        }
        return authorizationGrant;
    }

    @NotNull
    public static setLineBreakWordStyle setX(@NotNull JSONObject p4) {
        return (setLineBreakWordStyle) setY(new Object[]{p4}, -1488828002, 1488828002, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0517  */
    /* JADX WARN: Code duplicated, block: B:95:0x058f  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        byte b10;
        int i13;
        int i14;
        JSONObject jSONObject = (JSONObject) objArr[0];
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Boolean bool = mg.setCompoundDrawableTintBlendMode;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue()) {
            Object[] objArr2 = new Object[1];
            a((char) Color.blue(0), Drawable.resolveOpacity(0, 0), (Process.myPid() >> 22) + 8, objArr2);
            JSONObject jSONObject2 = jSONObject.getJSONObject(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a((char) (20091 - ImageFormat.getBitsPerPixel(0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32, (ViewConfiguration.getScrollBarSize() >> 8) + 9, objArr3);
            JSONObject jSONObject3 = jSONObject.getJSONObject(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a((char) TextUtils.indexOf("", "", 0, 0), 117 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, objArr4);
            JSONObject jSONObject4 = jSONObject.getJSONObject(((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            a((char) (Process.getGidForName("") + 31023), 127 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 14, objArr5);
            JSONObject jSONObject5 = jSONObject.getJSONObject(((String) objArr5[0]).intern());
            Object[] objArr6 = new Object[1];
            a((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 32432), ExpandableListView.getPackedPositionType(0L) + 10, (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, objArr6);
            byte[] bArrH = b.h((String) objArr6[0], jSONObject2, "");
            Object[] objArr7 = new Object[1];
            a((char) View.getDefaultSize(0, 0), 142 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 11, objArr7);
            byte[] bArrH2 = b.h((String) objArr7[0], jSONObject2, "");
            Object[] objArr8 = new Object[1];
            a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 153 - View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getSize(0) + 22, objArr8);
            byte[] bArrH3 = b.h((String) objArr8[0], jSONObject2, "");
            Object[] objArr9 = new Object[1];
            a((char) (ExpandableListView.getPackedPositionType(0L) + 53829), ExpandableListView.getPackedPositionGroup(0L) + 175, 31 - View.resolveSize(0, 0), objArr9);
            byte[] bArrH4 = b.h((String) objArr9[0], jSONObject2, "");
            Object[] objArr10 = new Object[1];
            a((char) (22766 - (Process.myPid() >> 22)), 206 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, objArr10);
            byte[] bArrH5 = b.h((String) objArr10[0], jSONObject2, "");
            Object[] objArr11 = new Object[1];
            a((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 224 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.alpha(0) + 27, objArr11);
            byte[] bArrH6 = b.h((String) objArr11[0], jSONObject2, "");
            Object[] objArr12 = new Object[1];
            a((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 53205), 42 - (Process.myTid() >> 22), 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
            byte[] bArrH7 = b.h((String) objArr12[0], jSONObject3, "");
            Object[] objArr13 = new Object[1];
            a((char) (ViewConfiguration.getTouchSlop() >> 8), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 57, 24 - ExpandableListView.getPackedPositionType(0L), objArr13);
            byte[] bArrH8 = b.h((String) objArr13[0], jSONObject3, "");
            Object[] objArr14 = new Object[1];
            a((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Gravity.getAbsoluteGravity(0, 0) + 251, 20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr14);
            byte[] bArrH9 = b.h((String) objArr14[0], jSONObject4, "");
            Object[] objArr15 = new Object[1];
            a((char) (KeyEvent.keyCodeFromString("") + 16620), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + BarcodeUtils.ROTATION_270, (ViewConfiguration.getLongPressTimeout() >> 16) + 5, objArr15);
            UUID uuidFromString = UUID.fromString(jSONObject4.getString(((String) objArr15[0]).intern()));
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
            Object[] objArr16 = new Object[1];
            a((char) (48931 - TextUtils.getOffsetAfter("", 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 275, (ViewConfiguration.getTapTimeout() >> 16) + 23, objArr16);
            byte[] bArrH10 = b.h((String) objArr16[0], jSONObject5, "");
            Object[] objArr17 = new Object[1];
            a((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16620), 269 - ImageFormat.getBitsPerPixel(0), View.getDefaultSize(0, 0) + 5, objArr17);
            UUID uuidFromString2 = UUID.fromString(jSONObject5.getString(((String) objArr17[0]).intern()));
            Intrinsics.checkNotNullExpressionValue(uuidFromString2, "");
            return new setWillNotDraw(bArrH, bArrH2, bArrH3, bArrH4, bArrH5, bArrH6, bArrH7, bArrH8, bArrH9, uuidFromString, bArrH10, uuidFromString2);
        }
        Object[] objArr18 = new Object[1];
        a((char) (Process.myTid() >> 22), View.resolveSize(0, 0), TextUtils.getTrimmedLength("") + 8, objArr18);
        JSONObject jSONObject6 = jSONObject.getJSONObject(((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionType(0L) + 20092), 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 9, objArr19);
        JSONObject jSONObject7 = jSONObject.getJSONObject(((String) objArr19[0]).intern());
        Object[] objArr20 = new Object[1];
        a((char) ExpandableListView.getPackedPositionType(0L), ((byte) KeyEvent.getModifierMetaStateMask()) + 118, ((byte) KeyEvent.getModifierMetaStateMask()) + 12, objArr20);
        JSONObject jSONObject8 = jSONObject.getJSONObject(((String) objArr20[0]).intern());
        Object[] objArr21 = new Object[1];
        a((char) (Process.getGidForName("") + 31023), 128 - ExpandableListView.getPackedPositionGroup(0L), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14, objArr21);
        String string = jSONObject.getString(((String) objArr21[0]).intern());
        Object[] objArr22 = new Object[1];
        a((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32432), KeyEvent.normalizeMetaState(0) + 10, (-16777205) - Color.rgb(0, 0, 0), objArr22);
        byte[] bArrH11 = b.h((String) objArr22[0], jSONObject6, "");
        Object[] objArr23 = new Object[1];
        a((char) (Color.argb(0, 0, 0, 0) + 22766), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 206, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, objArr23);
        byte[] bArrH12 = b.h((String) objArr23[0], jSONObject6, "");
        Object[] objArr24 = new Object[1];
        a((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Color.argb(0, 0, 0, 0) + 224, ImageFormat.getBitsPerPixel(0) + 28, objArr24);
        byte[] bArrH13 = b.h((String) objArr24[0], jSONObject6, "");
        char c10 = '0';
        Object[] objArr25 = new Object[1];
        a((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-16777195) - Color.rgb(0, 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 13, objArr25);
        byte[] bArrH14 = b.h((String) objArr25[0], jSONObject6, "");
        Object[] objArr26 = new Object[1];
        a((char) (53205 - View.resolveSize(0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 42, TextUtils.getTrimmedLength("") + 15, objArr26);
        byte[] bArrH15 = b.h((String) objArr26[0], jSONObject7, "");
        Object[] objArr27 = new Object[1];
        a((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 251, 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr27);
        byte[] bArrH16 = b.h((String) objArr27[0], jSONObject8, "");
        Object[] objArr28 = new Object[1];
        a((char) TextUtils.getTrimmedLength(""), 58 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 24 - (ViewConfiguration.getEdgeSlop() >> 16), objArr28);
        byte[] bArrH17 = b.h((String) objArr28[0], jSONObject7, "");
        Object[] objArr29 = new Object[1];
        a((char) (16620 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 269 - ((byte) KeyEvent.getModifierMetaStateMask()), 4 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr29);
        UUID uuidFromString3 = UUID.fromString(jSONObject8.getString(((String) objArr29[0]).intern()));
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strReplace = setNetworkAvailable.setY().replace(new String(vc.setX(string), Charsets.UTF_8), "");
        if (strReplace.length() % 2 != 0) {
            Object[] objArr30 = new Object[1];
            a((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 298, 19 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr30);
            throw new IllegalArgumentException(((String) objArr30[0]).intern().toString());
        }
        int i15 = f57535c + 73;
        f57536d = i15 % 128;
        int i16 = i15 % 2;
        byte[] bArr = new byte[strReplace.length() / 2];
        int i17 = 0;
        while (i17 < strReplace.length()) {
            int i18 = i17 / 2;
            Pair pair = TuplesKt.to(Character.valueOf(strReplace.charAt(i17)), Character.valueOf(strReplace.charAt(i17 + 1)));
            char cCharValue = ((Character) pair.getFirst()).charValue();
            if (cCharValue == c10) {
                b10 = 0;
            } else if (cCharValue == '1') {
                b10 = 1;
            } else {
                if (cCharValue == '2') {
                    int i19 = f57535c + 115;
                    f57536d = i19 % 128;
                    int i20 = i19 % 2;
                } else if (cCharValue == '3') {
                    int i21 = f57535c + 63;
                    f57536d = i21 % 128;
                    if (i21 % 2 != 0) {
                        b10 = 3;
                    }
                } else if (cCharValue == '4') {
                    b10 = 4;
                } else if (cCharValue == '5') {
                    b10 = 5;
                } else if (cCharValue == '6') {
                    b10 = 6;
                } else if (cCharValue == '7') {
                    b10 = 7;
                } else if (cCharValue == '8') {
                    int i22 = f57536d + 25;
                    f57535c = i22 % 128;
                    b10 = i22 % 2 != 0 ? (byte) 17 : (byte) 8;
                } else if (cCharValue == '9') {
                    b10 = 9;
                } else {
                    if (cCharValue == 'a') {
                        i13 = f57536d + 11;
                    } else if (cCharValue == 'A') {
                        i13 = f57536d + 119;
                    } else if (cCharValue == 'b') {
                        b10 = 11;
                    } else if (cCharValue == 'B') {
                        int i23 = f57536d + 101;
                        f57535c = i23 % 128;
                        if (i23 % 2 != 0) {
                            b10 = 126;
                        } else {
                            b10 = 11;
                        }
                    } else if (cCharValue == 'c' || cCharValue == 'C') {
                        b10 = 12;
                    } else if (cCharValue == 'd' || cCharValue == 'D') {
                        b10 = 13;
                    } else if (cCharValue == 'e' || cCharValue == 'E') {
                        b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                    } else {
                        if (cCharValue != 'f' && cCharValue != 'F') {
                            throw new IllegalArgumentException(String.valueOf(cCharValue));
                        }
                        b10 = 15;
                    }
                    f57535c = i13 % 128;
                    int i24 = i13 % 2;
                    b10 = 10;
                }
                b10 = 2;
            }
            int iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(UByte.m5545constructorimpl((byte) 16) & 255) * UInt.m5570constructorimpl(UByte.m5545constructorimpl(b10) & 255));
            char cCharValue2 = ((Character) pair.getSecond()).charValue();
            if (cCharValue2 == c10) {
                i14 = 0;
            } else if (cCharValue2 == '1') {
                i14 = 1;
            } else {
                if (cCharValue2 == '2') {
                    i14 = 2;
                } else if (cCharValue2 == '3') {
                    int i25 = f57536d + 113;
                    f57535c = i25 % 128;
                    if (i25 % 2 != 0) {
                        i14 = 2;
                    } else {
                        i14 = 3;
                    }
                } else if (cCharValue2 == '4') {
                    i14 = 4;
                } else if (cCharValue2 == '5') {
                    i14 = 5;
                } else if (cCharValue2 == '6') {
                    int i26 = f57535c + 69;
                    f57536d = i26 % 128;
                    int i27 = i26 % 2;
                    i14 = 6;
                } else if (cCharValue2 == '7') {
                    int i28 = f57536d + 29;
                    f57535c = i28 % 128;
                    i14 = i28 % 2 != 0 ? 106 : 7;
                } else if (cCharValue2 == '8') {
                    i14 = 8;
                } else if (cCharValue2 == '9') {
                    i14 = 9;
                } else if (cCharValue2 == 'a' || cCharValue2 == 'A') {
                    i14 = 10;
                } else if (cCharValue2 == 'b' || cCharValue2 == 'B') {
                    i14 = 11;
                } else if (cCharValue2 == 'c' || cCharValue2 == 'C') {
                    i14 = 12;
                } else if (cCharValue2 == 'd' || cCharValue2 == 'D') {
                    i14 = 13;
                } else if (cCharValue2 == 'e' || cCharValue2 == 'E') {
                    i14 = 14;
                } else {
                    if (cCharValue2 != 'f' && cCharValue2 != 'F') {
                        throw new IllegalArgumentException(String.valueOf(cCharValue2));
                    }
                    i14 = 15;
                }
                bArr[i18] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(i14) + iM5570constructorimpl);
                i17 += 2;
                c10 = '0';
            }
            bArr[i18] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(i14) + iM5570constructorimpl);
            i17 += 2;
            c10 = '0';
        }
        Intrinsics.checkNotNullExpressionValue(uuidFromString3, "");
        return new setOnKeyListener(bArrH11, bArrH14, bArrH12, bArrH13, bArrH15, bArrH17, bArrH16, uuidFromString3, bArr);
    }

    @NotNull
    public static yo setDividerPadding(@NotNull byte[] p4, @NotNull String p10) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        yo.Companion companion = yo.INSTANCE;
        JSONObject jSONObject = new JSONObject();
        Object[] objArr = new Object[1];
        a((char) (53205 - (ViewConfiguration.getLongPressTimeout() >> 16)), 42 - (Process.myPid() >> 22), 15 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        JSONObject jSONObjectPut = jSONObject.put(((String) objArr[0]).intern(), (String) ux.setCompoundDrawableTintBlendMode(new Object[]{p4}, 1019201663, -1019201662, (int) System.currentTimeMillis()));
        Object[] objArr2 = new Object[1];
        a((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 58 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 24 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        JSONObject jSONObjectPut2 = jSONObjectPut.put(((String) objArr2[0]).intern(), p10);
        Object[] objArr3 = new Object[1];
        a((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 82, 6 - ImageFormat.getBitsPerPixel(0), objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((char) (KeyEvent.keyCodeFromString("") + 15095), TextUtils.lastIndexOf("", '0', 0, 0) + 89, TextUtils.indexOf((CharSequence) "", '0') + 14, objArr4);
        String string = jSONObjectPut2.put(strIntern, ((String) objArr4[0]).intern()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        yj.setX setx = yj.setOnFocusChangeListener;
        Object[] objArr5 = new Object[1];
        a((char) (12624 - MotionEvent.axisFromString("")), 100 - Process.getGidForName(""), Process.getGidForName("") + 17, objArr5);
        yo yoVar = (yo) yo.Companion.setOnFocusChangeListener(new Object[]{string, (yj) yj.setX.setDividerPadding(new Object[]{((String) objArr5[0]).intern()}, -2934678, 2934679, (int) System.currentTimeMillis())}, 1582490390, -1582490390, (int) System.currentTimeMillis());
        int i10 = f57535c + 89;
        f57536d = i10 % 128;
        if (i10 % 2 != 0) {
            return yoVar;
        }
        throw null;
    }

    @NotNull
    public static setFocusedByDefault setY(@NotNull JSONObject p4) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        Object[] objArr = new Object[1];
        a((char) (ImageFormat.getBitsPerPixel(0) + 20093), 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 9 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        JSONObject jSONObject = p4.getJSONObject(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 118 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 11 - View.resolveSizeAndState(0, 0, 0), objArr2);
        JSONObject jSONObject2 = p4.getJSONObject(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((char) (21123 - (ViewConfiguration.getScrollBarSize() >> 8)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + TypedValues.AttributesType.TYPE_PATH_ROTATE, 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
        byte[] bArrH = b.h((String) objArr3[0], jSONObject, "");
        Object[] objArr4 = new Object[1];
        a((char) (22308 - (ViewConfiguration.getScrollBarSize() >> 8)), 341 - ((Process.getThreadPriority(0) + 20) >> 6), 19 - TextUtils.lastIndexOf("", '0', 0), objArr4);
        UUID uuidFromString = UUID.fromString(jSONObject.getString(((String) objArr4[0]).intern()));
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
        Object[] objArr5 = new Object[1];
        a((char) Drawable.resolveOpacity(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 251, 18 - ExpandableListView.getPackedPositionChild(0L), objArr5);
        byte[] bArrH2 = b.h((String) objArr5[0], jSONObject2, "");
        Object[] objArr6 = new Object[1];
        a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16619), 271 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5, objArr6);
        UUID uuidFromString2 = UUID.fromString(jSONObject2.getString(((String) objArr6[0]).intern()));
        Intrinsics.checkNotNullExpressionValue(uuidFromString2, "");
        setFocusedByDefault setfocusedbydefault = new setFocusedByDefault(bArrH, uuidFromString, bArrH2, uuidFromString2);
        int i10 = f57536d + 115;
        f57535c = i10 % 128;
        if (i10 % 2 == 0) {
            return setfocusedbydefault;
        }
        throw null;
    }
}
