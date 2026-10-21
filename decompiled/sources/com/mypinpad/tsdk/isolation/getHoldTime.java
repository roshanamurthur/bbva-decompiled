package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.pm.u0;
import androidx.core.view.PointerIconCompat;
import bk.p;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.time.Clock;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0005¢\u0006\u0004\b\f\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/getHoldTime;", "", "", "Lcom/mypinpad/tsdk/i/setAccessibilityTraversalAfter;", "p0", "", "Lcom/mypinpad/tsdk/i/getHoldTime$setY;", "setX", "(Ljava/util/List;)Ljava/util/Map;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setAccessibilityTraversalAfter;)Lcom/mypinpad/tsdk/i/getHoldTime$setY;", "", "setDividerPadding", "()V", "Lcom/mypinpad/tsdk/i/applicationCreated;", "Lcom/mypinpad/tsdk/i/setSubtitleTextAppearance;", "p1", "(Lcom/mypinpad/tsdk/i/applicationCreated;Ljava/util/Map;)V", "Lcom/mypinpad/tsdk/i/setColorFilter;", "<init>", "(Lcom/mypinpad/tsdk/i/setColorFilter;)V", "setOnFocusChangeListener", "setY"}, k = 1, mv = {1, 5, 1})
public final class getHoldTime {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<DateTimeFormatter> f55861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f55867i = null;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setColorFilter f55868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f55869b;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.getHoldTime$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u0006*\u00020\u00030\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/getHoldTime$setOnFocusChangeListener;", "", "", "Ljava/time/format/DateTimeFormatter;", "setY", "Ljava/util/List;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f55870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f55872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f55873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f55874e = null;

        static {
            b();
            f55872c = 0;
            f55873d = 1;
            f55871b = 0;
            f55870a = -443079995;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = 66 - r6
                int r8 = r8 * 4
                int r0 = r8 + 1
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                byte[] r1 = com.mypinpad.tsdk.isolation.getHoldTime.Companion.f55874e
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L31
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L28:
                r3 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r5
            L31:
                int r7 = -r7
                int r6 = r6 + r7
                r7 = r8
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getHoldTime.Companion.a(byte, int, short, java.lang.Object[]):void");
        }

        public static void b() {
            f55874e = new byte[]{Constants.CVR_B1b85_0110_TERMINAL, UtilitiesSDKConstants.SRP_LABEL_ENC, -21, -9};
        }

        /* JADX WARN: Code duplicated, block: B:61:0x0244  */
        /* JADX WARN: Code duplicated, block: B:62:0x0245  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r4v32, types: [java.time.format.DateTimeFormatter] */
        /* JADX WARN: Type inference failed for: r4v36, types: [java.time.format.DateTimeFormatter] */
        public static final long setY(String str) throws Throwable {
            Iterator it;
            char[] charArray;
            int i10;
            Throwable cause;
            long epochMilli;
            ?? r1 = str;
            int i11 = f55871b + 99;
            int i12 = i11 % 128;
            int i13 = 2;
            int i14 = i11 % 2;
            int i15 = i12 + 31;
            f55871b = i15 % 128;
            int i16 = 0;
            if (i15 % 2 != 0) {
                it = getHoldTime.setOnFocusChangeListener().iterator();
                int i17 = 45 / 0;
            } else {
                it = getHoldTime.setOnFocusChangeListener().iterator();
            }
            while (it.hasNext()) {
                int i18 = f55871b + 111;
                int i19 = i18 % 128;
                try {
                    if (i18 % 2 == 0) {
                        epochMilli = Instant.from(((DateTimeFormatter) it.next()).parse(r1)).toEpochMilli();
                        int i20 = 44 / i16;
                    } else {
                        epochMilli = Instant.from(((DateTimeFormatter) it.next()).parse(r1)).toEpochMilli();
                    }
                    int i21 = f55871b + 81;
                    i16 = i21 % 128;
                    r1 = i21 % 2;
                    if (r1 != 0) {
                        return epochMilli;
                    }
                    throw null;
                } catch (DateTimeParseException unused) {
                }
            }
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 16;
            int scrollDefaultDelay = 120 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
            int i22 = f55872c + 7;
            f55873d = i22 % 128;
            if (i22 % 2 == 0) {
                charArray = "ￅ\u0014\u0019ￅ\n\u0011\u0007\u0006\u0013\ufffaￅ\n\u0018\u0017\u0006\u0015".toCharArray();
                int i23 = 49 / i16;
            } else {
                charArray = "ￅ\u0014\u0019ￅ\n\u0011\u0007\u0006\u0013\ufffaￅ\n\u0018\u0017\u0006\u0015".toCharArray();
            }
            getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
            char[] cArr = new char[longPressTimeout];
            getnavbartitlestring.setY = i16;
            while (true) {
                int i24 = getnavbartitlestring.setY;
                if (i24 >= longPressTimeout) {
                    break;
                }
                char c10 = charArray[i24];
                getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
                char c11 = (char) (c10 + scrollDefaultDelay);
                cArr[i24] = c11;
                try {
                    Object[] objArr = new Object[i13];
                    objArr[1] = Integer.valueOf(f55870a);
                    objArr[i16] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(133002375);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40, 483 - (KeyEvent.getMaxKeyCode() >> 16));
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr2 = new Object[1];
                        a(b11, b10, b11, objArr2);
                        String str2 = (String) objArr2[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2);
                        map.put(133002375, method);
                    }
                    cArr[i24] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    Object[] objArr3 = {getnavbartitlestring, getnavbartitlestring};
                    Object method2 = map.get(1860518195);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (KeyEvent.normalizeMetaState(0) + 55966), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 43, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2268);
                        byte b12 = (byte) (-1);
                        byte b13 = (byte) (b12 + 1);
                        Object[] objArr4 = new Object[1];
                        a((byte) (b13 + 1), b12, b13, objArr4);
                        method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(1860518195, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                    scrollDefaultDelay = scrollDefaultDelay;
                    i16 = 0;
                    i13 = 2;
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
                cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
            if (edgeSlop > 0) {
                int i25 = f55873d + 117;
                f55872c = i25 % 128;
                int i26 = i25 % 2;
                getnavbartitlestring.setOnFocusChangeListener = edgeSlop;
                char[] cArr2 = new char[longPressTimeout];
                i10 = 0;
                System.arraycopy(cArr, 0, cArr2, 0, longPressTimeout);
                int i27 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr2, 0, cArr, longPressTimeout - i27, i27);
                int i28 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr2, i28, cArr, 0, longPressTimeout - i28);
            } else {
                i10 = 0;
            }
            char[] cArr3 = new char[longPressTimeout];
            getnavbartitlestring.setY = i10;
            while (true) {
                int i29 = getnavbartitlestring.setY;
                if (i29 >= longPressTimeout) {
                    throw u0.i(Intrinsics.stringPlus(new String(cArr3).intern(), r1), r1);
                }
                cArr3[i29] = cArr[(longPressTimeout - i29) - 1];
                Object[] objArr5 = {getnavbartitlestring, getnavbartitlestring};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (55966 - KeyEvent.keyCodeFromString("")), 43 - View.resolveSize(0, 0), 2268 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b14 = (byte) (-1);
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr6 = new Object[1];
                    a((byte) (b15 + 1), b14, b15, objArr6);
                    method3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr5);
            }
        }
    }

    public static final class setY {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final char[] f55875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f55876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f55877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f55878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f55879g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final byte[] f55880h = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f55881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final setSubtitleTextAppearance f55882b;

        static {
            c();
            f55878f = 0;
            f55879g = 1;
            f55876d = 0;
            f55877e = 1;
            f55875c = new char[]{59068, 59103};
        }

        public setY(long j10, @NotNull setSubtitleTextAppearance setsubtitletextappearance) {
            Intrinsics.checkNotNullParameter(setsubtitletextappearance, "");
            this.f55881a = j10;
            this.f55882b = setsubtitletextappearance;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x018b A[PHI: r9
          0x018b: PHI (r9v3 char) = (r9v2 char), (r9v13 char) binds: [B:38:0x0189, B:35:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:42:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:43:0x01ad A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:9:0x0046, B:13:0x00ac, B:12:0x0064, B:19:0x00d8, B:23:0x0136, B:22:0x00f1, B:47:0x0204, B:51:0x0268, B:54:0x027c, B:58:0x02d8, B:57:0x0294, B:50:0x0224, B:40:0x018e, B:44:0x01f1, B:43:0x01ad), top: B:85:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0201  */
        /* JADX WARN: Code duplicated, block: B:49:0x0223  */
        /* JADX WARN: Code duplicated, block: B:50:0x0224 A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:9:0x0046, B:13:0x00ac, B:12:0x0064, B:19:0x00d8, B:23:0x0136, B:22:0x00f1, B:47:0x0204, B:51:0x0268, B:54:0x027c, B:58:0x02d8, B:57:0x0294, B:50:0x0224, B:40:0x018e, B:44:0x01f1, B:43:0x01ad), top: B:85:0x0046 }] */
        public static void a(int[] iArr, Object[] objArr) throws Throwable {
            Class<?> cls;
            int i10;
            int i11;
            char c10;
            Map map;
            Object method;
            Map map2;
            Object method2;
            Class<?> cls2 = Object.class;
            int i12 = f55878f + 7;
            int i13 = i12 % 128;
            f55879g = i13;
            int i14 = 2;
            int i15 = i12 % 2;
            int i16 = 1;
            int i17 = i13 + 1;
            f55878f = i17 % 128;
            int i18 = i17 % 2;
            byte[] bytes = "\u0000\u0001".getBytes("ISO-8859-1");
            setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
            int i19 = iArr[0];
            int i20 = iArr[1];
            int i21 = iArr[2];
            int i22 = iArr[3];
            char[] cArr = f55875c;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i23 = 0;
                while (i23 < length) {
                    int i24 = f55879g + 7;
                    f55878f = i24 % 128;
                    if (i24 % i14 != 0) {
                        try {
                            Object[] objArr2 = new Object[i16];
                            objArr2[0] = Integer.valueOf(cArr[i23]);
                            Map map3 = setTextScaleX.setMaxEms;
                            Object method3 = map3.get(-637734149);
                            if (method3 == null) {
                                Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore("", 0), 37 - TextUtils.getOffsetBefore("", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + TypedValues.MotionType.TYPE_POLAR_RELATIVETO);
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                Object[] objArr3 = new Object[1];
                                b(b11, (byte) (b11 + 1), b10, objArr3);
                                method3 = cls3.getMethod((String) objArr3[0], Integer.TYPE);
                                map3.put(-637734149, method3);
                            }
                            cArr2[i23] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                            i23 >>>= 1;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        cls2 = cls2;
                        i21 = i21;
                        i22 = i22;
                        length = length;
                        Object[] objArr4 = {Integer.valueOf(cArr[i23])};
                        Map map4 = setTextScaleX.setMaxEms;
                        Object method4 = map4.get(-637734149);
                        if (method4 == null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 37 - (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + TypedValues.MotionType.TYPE_POLAR_RELATIVETO);
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            Object[] objArr5 = new Object[1];
                            b(b13, (byte) (b13 + 1), b12, objArr5);
                            method4 = cls4.getMethod((String) objArr5[0], Integer.TYPE);
                            map4.put(-637734149, method4);
                        }
                        cArr2[i23] = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
                        i23++;
                    }
                    i22 = i22;
                    length = length;
                    i21 = i21;
                    cls2 = cls2;
                    i16 = 1;
                    i14 = 2;
                }
                cls = cls2;
                i10 = i21;
                i11 = i22;
                cArr = cArr2;
            } else {
                cls = cls2;
                i10 = i21;
                i11 = i22;
            }
            char[] cArr3 = new char[i20];
            System.arraycopy(cArr, i19, cArr3, 0, i20);
            if (bytes != null) {
                int i25 = f55879g + 97;
                f55878f = i25 % 128;
                int i26 = i25 % 2;
                char[] cArr4 = new char[i20];
                setnavigationonclicklistener.setX = 0;
                char c11 = 0;
                while (true) {
                    int i27 = setnavigationonclicklistener.setX;
                    if (i27 >= i20) {
                        break;
                    }
                    int i28 = f55878f + 33;
                    f55879g = i28 % 128;
                    if (i28 % 2 == 0) {
                        c10 = 1;
                        if (bytes[i27] == 1) {
                            char c12 = cArr3[i27];
                            Object[] objArr6 = new Object[2];
                            objArr6[c10] = Integer.valueOf(c11);
                            objArr6[0] = Integer.valueOf(c12);
                            map = setTextScaleX.setMaxEms;
                            method = map.get(1737824323);
                            if (method != null) {
                                Class cls5 = (Class) setTextScaleX.setX((char) (4448 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, 1020 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                byte b14 = (byte) 0;
                                Object[] objArr7 = new Object[1];
                                b(b14, (byte) f55880h.length, b14, objArr7);
                                String str = (String) objArr7[0];
                                Class<?> cls6 = Integer.TYPE;
                                method = cls5.getMethod(str, cls6, cls6);
                                map.put(1737824323, method);
                            }
                            cArr4[i27] = ((Character) ((Method) method).invoke(null, objArr6)).charValue();
                        } else {
                            Object[] objArr8 = {Integer.valueOf(cArr3[i27]), Integer.valueOf(c11)};
                            map2 = setTextScaleX.setMaxEms;
                            method2 = map2.get(-504758789);
                            if (method2 != null) {
                                Class cls7 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 45, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2626);
                                byte b15 = (byte) 0;
                                byte b16 = b15;
                                Object[] objArr9 = new Object[1];
                                b(b16, b16, b15, objArr9);
                                String str2 = (String) objArr9[0];
                                Class<?> cls8 = Integer.TYPE;
                                method2 = cls7.getMethod(str2, cls8, cls8);
                                map2.put(-504758789, method2);
                            }
                            cArr4[i27] = ((Character) ((Method) method2).invoke(null, objArr8)).charValue();
                        }
                    } else {
                        c10 = 1;
                        if (bytes[i27] == 1) {
                            char c13 = cArr3[i27];
                            Object[] objArr10 = new Object[2];
                            objArr10[c10] = Integer.valueOf(c11);
                            objArr10[0] = Integer.valueOf(c13);
                            map = setTextScaleX.setMaxEms;
                            method = map.get(1737824323);
                            if (method != null) {
                                Class cls9 = (Class) setTextScaleX.setX((char) (4448 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, 1020 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                byte b17 = (byte) 0;
                                Object[] objArr11 = new Object[1];
                                b(b17, (byte) f55880h.length, b17, objArr11);
                                String str3 = (String) objArr11[0];
                                Class<?> cls10 = Integer.TYPE;
                                method = cls9.getMethod(str3, cls10, cls10);
                                map.put(1737824323, method);
                            }
                            cArr4[i27] = ((Character) ((Method) method).invoke(null, objArr10)).charValue();
                        } else {
                            Object[] objArr12 = {Integer.valueOf(cArr3[i27]), Integer.valueOf(c11)};
                            map2 = setTextScaleX.setMaxEms;
                            method2 = map2.get(-504758789);
                            if (method2 != null) {
                                Class cls11 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 45, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2626);
                                byte b18 = (byte) 0;
                                byte b19 = b18;
                                Object[] objArr13 = new Object[1];
                                b(b19, b19, b18, objArr13);
                                String str4 = (String) objArr13[0];
                                Class<?> cls12 = Integer.TYPE;
                                method2 = cls11.getMethod(str4, cls12, cls12);
                                map2.put(-504758789, method2);
                            }
                            cArr4[i27] = ((Character) ((Method) method2).invoke(null, objArr12)).charValue();
                        }
                    }
                    c11 = cArr4[setnavigationonclicklistener.setX];
                    Object[] objArr14 = {setnavigationonclicklistener, setnavigationonclicklistener};
                    Map map5 = setTextScaleX.setMaxEms;
                    Object method5 = map5.get(-265085633);
                    if (method5 == null) {
                        Class cls13 = (Class) setTextScaleX.setX((char) (TextUtils.getCapsMode("", 0, 0) + 31347), (ViewConfiguration.getLongPressTimeout() >> 16) + 48, (ViewConfiguration.getPressedStateDuration() >> 16) + 840);
                        byte b20 = (byte) 0;
                        byte b21 = b20;
                        Object[] objArr15 = new Object[1];
                        b(b21, (byte) (b21 + 3), b20, objArr15);
                        method5 = cls13.getMethod((String) objArr15[0], cls, cls);
                        map5.put(-265085633, method5);
                    }
                    ((Method) method5).invoke(null, objArr14);
                }
                cArr3 = cArr4;
            }
            if (i11 > 0) {
                char[] cArr5 = new char[i20];
                System.arraycopy(cArr3, 0, cArr5, 0, i20);
                int i29 = i20 - i11;
                int i30 = i11;
                System.arraycopy(cArr5, 0, cArr3, i29, i30);
                System.arraycopy(cArr5, i30, cArr3, 0, i29);
                int i31 = f55878f + 75;
                f55879g = i31 % 128;
                int i32 = i31 % 2;
            }
            char[] cArr6 = new char[i20];
            int i33 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i33;
                int i34 = setnavigationonclicklistener.setX;
                if (i34 >= i20) {
                    break;
                }
                int i35 = f55878f + 103;
                f55879g = i35 % 128;
                if (i35 % 2 == 0) {
                    cArr6[i34] = cArr3[(i20 << i34) % 1];
                } else {
                    cArr6[i34] = cArr3[(i20 - i34) - 1];
                }
                i33 = i34 + 1;
            }
            if (i10 > 0) {
                int i36 = 0;
                while (true) {
                    setnavigationonclicklistener.setX = i36;
                    int i37 = setnavigationonclicklistener.setX;
                    if (i37 >= i20) {
                        break;
                    }
                    int i38 = f55878f + 39;
                    f55879g = i38 % 128;
                    if (i38 % 2 == 0) {
                        cArr6[i37] = (char) (cArr6[i37] << iArr[2]);
                        i36 = i37 % 0;
                    } else {
                        cArr6[i37] = (char) (cArr6[i37] - iArr[2]);
                        i36 = i37 + 1;
                    }
                }
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0038). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 4
                int r0 = 1 - r7
                int r8 = r8 + 97
                int r9 = r9 * 4
                int r9 = 3 - r9
                byte[] r0 = new byte[r0]
                r1 = 0
                int r7 = 0 - r7
                byte[] r2 = com.mypinpad.tsdk.i.getHoldTime.setY.f55880h
                if (r2 != 0) goto L1a
                r8 = r7
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r10
                r10 = r9
                goto L38
            L1a:
                r3 = r1
            L1b:
                int r9 = r9 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r1)
                r10[r1] = r7
                return
            L2a:
                r4 = r2[r9]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r5
                r6 = r10
                r10 = r9
                r9 = r4
                r4 = r3
                r3 = r2
                r2 = r0
                r0 = r6
            L38:
                int r9 = -r9
                int r7 = r7 + r9
                r9 = r10
                r10 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.getHoldTime.setY.b(int, int, short, java.lang.Object[]):void");
        }

        public static void c() {
            f55880h = new byte[]{39, 44, -32, 72};
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                int i10 = f55876d + 49;
                f55877e = i10 % 128;
                return i10 % 2 != 0;
            }
            if (!(obj instanceof setY)) {
                return false;
            }
            setY sety = (setY) obj;
            if (this.f55881a == sety.f55881a) {
                if (Intrinsics.areEqual(this.f55882b, sety.f55882b)) {
                    return true;
                }
                int i11 = f55876d + 37;
                f55877e = i11 % 128;
                return i11 % 2 == 0;
            }
            int i12 = f55876d;
            int i13 = i12 + 77;
            f55877e = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 + 87;
            f55877e = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }

        public final int hashCode() {
            int i10 = f55876d + 123;
            f55877e = i10 % 128;
            int i11 = i10 % 2;
            setSubtitleTextAppearance setsubtitletextappearance = this.f55882b;
            long j10 = this.f55881a;
            long j11 = j10 ^ (j10 >>> 32);
            if (i11 == 0) {
                return setsubtitletextappearance.hashCode() * (((int) j11) / 96);
            }
            return setsubtitletextappearance.hashCode() + (((int) j11) * 31);
        }

        public final long setDividerPadding() {
            int i10 = f55877e + 15;
            f55876d = i10 % 128;
            if (i10 % 2 == 0) {
                return this.f55881a;
            }
            throw null;
        }

        @NotNull
        public final String toString() throws Throwable {
            Object obj;
            int i10 = f55877e + 69;
            f55876d = i10 % 128;
            if (i10 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{0, 2, 0, 0}, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 2, 0, 0}, objArr2);
                obj = objArr2[0];
            }
            String strIntern = ((String) obj).intern();
            int i11 = f55876d + 105;
            f55877e = i11 % 128;
            if (i11 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }
    }

    static {
        c();
        f55865g = 0;
        f55866h = 1;
        f55863e = 0;
        f55864f = 1;
        e();
        INSTANCE = new Companion(null);
        f55861c = CollectionsKt__CollectionsKt.listOf((Object[]) new DateTimeFormatter[]{DateTimeFormatter.ISO_INSTANT, DateTimeFormatter.ISO_DATE_TIME, DateTimeFormatter.ISO_OFFSET_DATE_TIME});
        int i10 = f55864f + 41;
        f55863e = i10 % 128;
        int i11 = i10 % 2;
    }

    public getHoldTime(@NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f55868a = setcolorfilter;
        this.f55869b = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x01c7  */
    public static void a(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13 = f55865g;
        int i14 = i13 + 125;
        f55866h = i14 % 128;
        int i15 = 2;
        int i16 = i14 % 2;
        int i17 = i13 + 43;
        f55866h = i17 % 128;
        if (i17 % 2 == 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i18 = getnavbartitlestring.setY;
            if (i18 >= i10) {
                break;
            }
            int i19 = f55865g + 103;
            f55866h = i19 % 128;
            int i20 = i19 % i15;
            char c10 = charArray[i18];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i18] = c11;
            try {
                Object[] objArr2 = new Object[i15];
                objArr2[1] = Integer.valueOf(f55862d);
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 41 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 483);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b11, b10, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55967 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 43 - Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 2269);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b((byte) (b13 + 1), b12, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i15 = 2;
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
            int i21 = f55866h + 37;
            f55865g = i21 % 128;
            int i22 = i21 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i23 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i23, i23);
            int i24 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i24, cArr, 0, i10 - i24);
        }
        if (z10) {
            int i25 = f55865g + 115;
            f55866h = i25 % 128;
            int i26 = i25 % 2;
            char[] cArr3 = new char[i10];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i27 = getnavbartitlestring.setY;
                if (i27 >= i10) {
                    break;
                }
                int i28 = f55866h + 43;
                f55865g = i28 % 128;
                int i29 = i28 % 2;
                cArr3[i27] = cArr[(i10 - i27) - 1];
                Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (55965 - ImageFormat.getBitsPerPixel(0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 44, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2268);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b((byte) (b15 + 1), b14, b15, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 66 - r7
            int r9 = r9 * 2
            int r0 = r9 + 1
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.getHoldTime.f55867i
            if (r2 != 0) goto L18
            r7 = r8
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            goto L36
        L18:
            r3 = r1
        L19:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L28:
            r4 = r2[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r6
        L36:
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getHoldTime.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f55867i = new byte[]{54, 83, MessageUtils.MESSAGE_21_NAK, -119};
    }

    public static void e() {
        f55862d = -443079997;
    }

    public static final /* synthetic */ List setOnFocusChangeListener() {
        int i10 = f55864f;
        int i11 = i10 + 79;
        f55863e = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 13;
        f55863e = i13 % 128;
        int i14 = i13 % 2;
        List<DateTimeFormatter> list = f55861c;
        if (i14 != 0) {
            int i15 = 82 / 0;
        }
        return list;
    }

    public final void d(setAccessibilityTraversalAfter setaccessibilitytraversalafter, setSubtitleTextAppearance setsubtitletextappearance, long j10) {
        synchronized (this.f55869b) {
            this.f55869b.put(setaccessibilitytraversalafter, new setY(j10, setsubtitletextappearance));
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getScrollBarSize() >> 8) + 15, 122 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 9 - View.resolveSizeAndState(0, 0, 0), "\u0014\u0016\r\u0015\uffc1\u0007\u0010\u0013\uffc1\u0014\u0006\u0015\uffc1\u0013\u0006", false, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(setaccessibilitytraversalafter.setDividerPadding());
            sb2.append(' ');
            sb2.append(j10);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb2.toString()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    public final setY setCompoundDrawableTintBlendMode(@NotNull setAccessibilityTraversalAfter p4) {
        setY sety;
        Intrinsics.checkNotNullParameter(p4, "");
        synchronized (this.f55869b) {
            sety = (setY) this.f55869b.get(p4);
        }
        return sety;
    }

    public final void setDividerPadding() {
        synchronized (this.f55869b) {
            this.f55869b.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final Map<setAccessibilityTraversalAfter, setY> setX(@NotNull List<? extends setAccessibilityTraversalAfter> p4) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(p4, "");
        synchronized (this.f55869b) {
            List<? extends setAccessibilityTraversalAfter> list = p4;
            linkedHashMap = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(obj, setCompoundDrawableTintBlendMode((setAccessibilityTraversalAfter) obj));
            }
        }
        return linkedHashMap;
    }

    public final void setDividerPadding(@NotNull applicationCreated p4, @NotNull Map<setAccessibilityTraversalAfter, setSubtitleTextAppearance> p10) {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        synchronized (this.f55869b) {
            try {
                for (setIndeterminateDrawableTiled setindeterminatedrawabletiled : (List) applicationCreated.setOnFocusChangeListener(new Object[]{p4}, -1713923561, 1713923565, System.identityHashCode(p4))) {
                    setColorFilter setcolorfilter = this.f55868a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(setindeterminatedrawabletiled);
                    Object[] objArr = new Object[1];
                    a(5 - Color.red(0), TextUtils.getOffsetBefore("", 0) + 100, 4 - ExpandableListView.getPackedPositionChild(0L), "\ufff4+)ￗ￣", true, objArr);
                    sb2.append(((String) objArr[0]).intern());
                    sb2.append((String) setX(new Object[0], -1063684927, 1063684927, (int) System.currentTimeMillis()));
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, Integer.valueOf(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW), getDisplayExponent.setY(sb2.toString()), null, 4}, 1173867142, -1173867141, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW);
                    setAccessibilityTraversalAfter.Companion companion = setAccessibilityTraversalAfter.INSTANCE;
                    setAccessibilityTraversalAfter setaccessibilitytraversalafter = (setAccessibilityTraversalAfter) setAccessibilityTraversalAfter.Companion.setX(new Object[]{setindeterminatedrawabletiled.setCompoundDrawableTintBlendMode()}, 647307087, -647307087, (int) System.currentTimeMillis());
                    long y7 = Companion.setY(setindeterminatedrawabletiled.setY());
                    setSubtitleTextAppearance setsubtitletextappearance = p10.get(setaccessibilitytraversalafter);
                    if (setsubtitletextappearance != null) {
                        d(setaccessibilitytraversalafter, setsubtitletextappearance, y7);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        String strValueOf;
        int i13 = f55863e + 107;
        f55864f = i13 % 128;
        if (i13 % 2 == 0) {
            strValueOf = String.valueOf(Clock.systemUTC().millis());
            int i14 = 72 / 0;
        } else {
            strValueOf = String.valueOf(Clock.systemUTC().millis());
        }
        int i15 = f55863e + 1;
        f55864f = i15 % 128;
        int i16 = i15 % 2;
        return strValueOf;
    }
}
