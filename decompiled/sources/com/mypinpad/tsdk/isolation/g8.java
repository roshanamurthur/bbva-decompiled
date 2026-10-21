package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "c", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPayloadSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayloadSerializer.kt\ncom/mypinpad/tsdk/internal/remote/attestation/serialization/PayloadSerializer$serializeCollectionParameters$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,222:1\n37#2,2:223\n*S KotlinDebug\n*F\n+ 1 PayloadSerializer.kt\ncom/mypinpad/tsdk/internal/remote/attestation/serialization/PayloadSerializer$serializeCollectionParameters$1\n*L\n195#1:223,2\n*E\n"})
final class g8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f55638q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55639r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55640s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f55641t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f55642u0;
    public static final byte[] v0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setHorizontalScrollBarEnabled f55643p0;

    static {
        b();
        f55641t0 = 0;
        f55642u0 = 1;
        f55639r0 = 0;
        f55640s0 = 1;
        f55638q0 = 4496872471339354858L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(setHorizontalScrollBarEnabled sethorizontalscrollbarenabled) {
        super(1);
        this.f55643p0 = sethorizontalscrollbarenabled;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r9 = r9 * 3
            int r9 = r9 + 107
            byte[] r0 = new byte[r7]
            byte[] r1 = com.mypinpad.tsdk.isolation.g8.v0
            r2 = 0
            if (r1 != 0) goto L1a
            r9 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r7
            goto L36
        L1a:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1f:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r0[r3] = r5
            if (r4 != r8) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L2e:
            r3 = r1[r9]
            r6 = r10
            r10 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L36:
            int r7 = r7 + r8
            int r9 = r9 + 1
            r8 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.g8.a(int, int, int, java.lang.Object[]):void");
    }

    public static void b() {
        v0 = new byte[]{33, 87, ComputeCcCommandApdu.EXPECTED_P1, -82};
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0278  */
    /* JADX WARN: Code duplicated, block: B:48:0x0279  */
    public final void c(@NotNull mo moVar) throws Throwable {
        Throwable cause;
        int i10 = f55640s0 + 5;
        f55639r0 = i10 % 128;
        int i11 = 2;
        int i12 = i10 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        int i13 = 0;
        int iRed = 36653 - Color.red(0);
        int i14 = f55641t0;
        int i15 = i14 + 79;
        f55642u0 = i15 % 128;
        int i16 = i15 % 2;
        int i17 = i14 + 5;
        f55642u0 = i17 % 128;
        int i18 = i17 % 2;
        char[] charArray = "ꤍ☱띓Ғ閺".toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = iRed;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i19 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i19 >= charArray.length) {
                break;
            }
            int i20 = f55642u0 + 11;
            f55641t0 = i20 % 128;
            int i21 = i20 % i11;
            long j10 = f55638q0;
            if (i21 != 0) {
                char c10 = charArray[i19];
                try {
                    Object[] objArr = new Object[3];
                    objArr[i11] = setlayoutanimation;
                    objArr[1] = setlayoutanimation;
                    objArr[i13] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(i13) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i13) == 0.0d ? 0 : -1)) + 33, 1195 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        byte b10 = (byte) i13;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, (byte) (b11 + 1), objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i19] = ((Long) ((Method) method).invoke(null, objArr)).longValue() * (j10 & 1779209353347916695L);
                    Object[] objArr3 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 728 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr4 = new Object[1];
                        a(b12, b13, b13, objArr4);
                        method2 = cls2.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(645183118, method2);
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
                Object[] objArr5 = {Integer.valueOf(charArray[i19]), setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(-764403778);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) Color.alpha(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1194);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr6 = new Object[1];
                    a(b14, b15, (byte) (b15 + 1), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Integer.TYPE, Object.class, Object.class);
                    map2.put(-764403778, method3);
                }
                jArr[i19] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (j10 ^ 1779209353347916695L);
                Object[] objArr7 = {setlayoutanimation, setlayoutanimation};
                Object method4 = map2.get(645183118);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0') + 1), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (Process.myTid() >> 22) + 728);
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr8 = new Object[1];
                    a(b16, b17, b17, objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(645183118, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
            i11 = 2;
            i13 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i22 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i22 >= charArray.length) {
                String strF = n1.f(cArr);
                setFriction setfriction = (setFriction) this.f55643p0;
                mo.setY(new Object[]{moVar, strF, ((List) setFriction.setCompoundDrawableTintBlendMode(new Object[]{setfriction}, 355777135, -355777135, System.identityHashCode(setfriction))).toArray(new Object[0])}, 1538034737, -1538034736, System.identityHashCode(moVar));
                int i23 = f55639r0 + 123;
                f55640s0 = i23 % 128;
                int i24 = i23 % 2;
                return;
            }
            cArr[i22] = (char) jArr[i22];
            Object[] objArr9 = {setlayoutanimation, setlayoutanimation};
            Map map3 = setTextScaleX.setMaxEms;
            Object method5 = map3.get(645183118);
            if (method5 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 44, View.getDefaultSize(0, 0) + 728);
                byte b18 = (byte) 0;
                byte b19 = b18;
                Object[] objArr10 = new Object[1];
                a(b18, b19, b19, objArr10);
                method5 = cls5.getMethod((String) objArr10[0], Object.class, Object.class);
                map3.put(645183118, method5);
            }
            ((Method) method5).invoke(null, objArr9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f55640s0 + 93;
        f55639r0 = i10 % 128;
        int i11 = i10 % 2;
        c(moVar);
        if (i11 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }
}
