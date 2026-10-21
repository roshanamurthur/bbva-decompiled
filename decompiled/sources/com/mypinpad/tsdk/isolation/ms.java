package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/ms;", "", "Lkotlin/Function1;", "", "", "p0", "setCompoundDrawableTintBlendMode", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/mypinpad/tsdk/i/setHorizontalScrollbarOverlay;", "Lcom/mypinpad/tsdk/i/mr;", "p1", "p2", "", "p3", "(Lcom/mypinpad/tsdk/i/setHorizontalScrollbarOverlay;Ljava/lang/String;)V", "setX", "(Ljava/lang/String;)V", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInternalLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalLogger.kt\ncom/mypinpad/tsdk/internal/common/logging/InternalLogger\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,105:1\n21#2:106\n14#2:107\n*S KotlinDebug\n*F\n+ 1 InternalLogger.kt\ncom/mypinpad/tsdk/internal/common/logging/InternalLogger\n*L\n54#1:106\n54#1:107\n*E\n"})
public final class ms {

    @NotNull
    public static final ms INSTANCE = new ms();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static Function1<? super String, Unit> f57142a = new a(ml.INSTANCE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57143b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57144c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f57145p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f57146q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f57147r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final byte[] f57148s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final int f57149t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f57150u0;
        public static int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final byte[] f57151w0 = null;

        static {
            c();
            f57150u0 = 0;
            v0 = 1;
            f57149t0 = 1;
            f57145p0 = -438782394;
            f57146q0 = -1454817151;
            f57147r0 = 2027627002;
            f57148s0 = new byte[]{122, -107, 66, -105, -115, -52, 22, -15, -91, -53, -4, -103, -122, -30, -15, -83, -11, -67, -20, -57, -43, -53, -36, -122, -7, -14, ByteSourceJsonBootstrapper.UTF8_BOM_3};
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(ml mlVar) throws Throwable {
            short sResolveSizeAndState = (short) ((-106) - View.resolveSizeAndState(0, 0, 0));
            Object[] objArr = new Object[1];
            a((-22) - KeyEvent.getDeadChar(0, 0), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 111), sResolveSizeAndState, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 778936063, (-1284634323) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            String strIntern = ((String) objArr[0]).intern();
            short sKeyCodeFromString = (short) ((-75) - KeyEvent.keyCodeFromString(""));
            Object[] objArr2 = new Object[1];
            a((-21) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((-29) - Gravity.getAbsoluteGravity(0, 0)), sKeyCodeFromString, TextUtils.indexOf("", "", 0) + 778936062, (-1284634318) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            super(1, mlVar, ml.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        /* JADX WARN: Code duplicated, block: B:52:0x0212  */
        public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
            int i13;
            byte[] bArr;
            byte[] bArr2;
            int i14 = f57146q0;
            setTextAlignment settextalignment = new setTextAlignment();
            StringBuilder sb2 = new StringBuilder();
            int i15 = 2;
            try {
                int i16 = 1;
                Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i14)};
                int i17 = 0;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-769569468);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 49, TextUtils.getCapsMode("", 0, 0) + 434);
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b11, (byte) (b12 + 1), b12, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(-769569468, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                boolean z10 = iIntValue == -1;
                int i18 = f57145p0;
                byte[] bArr3 = f57148s0;
                if (z10) {
                    if (bArr3 != null) {
                        int length = bArr3.length;
                        bArr2 = new byte[length];
                        int i19 = 0;
                        while (i19 < length) {
                            int i20 = v0 + 37;
                            f57150u0 = i20 % 128;
                            if (i20 % i15 != 0) {
                                Object[] objArr4 = new Object[i16];
                                objArr4[i17] = Integer.valueOf(bArr3[i19]);
                                Map map2 = setTextScaleX.setMaxEms;
                                Object method2 = map2.get(510767826);
                                if (method2 == null) {
                                    method2 = ((Class) setTextScaleX.setX((char) (49110 - ImageFormat.getBitsPerPixel(i17)), 42 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 52 - TextUtils.indexOf("", ""))).getMethod("s", Integer.TYPE);
                                    map2.put(510767826, method2);
                                }
                                bArr2[i19] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                            } else {
                                length = length;
                                Object[] objArr5 = {Integer.valueOf(bArr3[i19])};
                                Map map3 = setTextScaleX.setMaxEms;
                                Object method3 = map3.get(510767826);
                                if (method3 == null) {
                                    method3 = ((Class) setTextScaleX.setX((char) (TextUtils.getOffsetAfter("", 0) + 49111), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 41, (ViewConfiguration.getTapTimeout() >> 16) + 52)).getMethod("s", Integer.TYPE);
                                    map3.put(510767826, method3);
                                }
                                bArr2[i19] = ((Byte) ((Method) method3).invoke(null, objArr5)).byteValue();
                                i19++;
                            }
                            length = length;
                            i15 = 2;
                            i16 = 1;
                            i17 = 0;
                        }
                    } else {
                        bArr2 = bArr3;
                    }
                    bArr2.getClass();
                    Object[] objArr6 = {Integer.valueOf(i12), Integer.valueOf(i18)};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(-769569468);
                    if (method4 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49, 434 - TextUtils.getOffsetBefore("", 0));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr7 = new Object[1];
                        b(b13, (byte) (b14 + 1), b14, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method4 = cls3.getMethod(str2, cls4, cls4);
                        map4.put(-769569468, method4);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method4).invoke(null, objArr6)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i14) ^ 7616081452308447380L)));
                }
                if (iIntValue > 0) {
                    int i21 = ((i12 + iIntValue) - 2) + ((int) (((long) i18) ^ 7616081452308447380L));
                    if (z10) {
                        int i22 = v0 + 37;
                        f57150u0 = i22 % 128;
                        if (i22 % 2 != 0) {
                            i13 = 0;
                        } else {
                            i13 = 1;
                        }
                    } else {
                        i13 = 0;
                    }
                    settextalignment.setX = i21 + i13;
                    Object[] objArr8 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f57147r0), sb2};
                    Map map5 = setTextScaleX.setMaxEms;
                    Object method5 = map5.get(193260760);
                    if (method5 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) Color.red(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, 2802 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr9 = new Object[1];
                        b(b15, b16, b16, objArr9);
                        String str3 = (String) objArr9[0];
                        Class<?> cls6 = Integer.TYPE;
                        method5 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                        map5.put(193260760, method5);
                    }
                    ((StringBuilder) ((Method) method5).invoke(null, objArr8)).append(settextalignment.setCompoundDrawableTintBlendMode);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    if (bArr3 != null) {
                        int length2 = bArr3.length;
                        bArr = new byte[length2];
                        int i23 = 0;
                        while (i23 < length2) {
                            int i24 = v0 + 65;
                            f57150u0 = i24 % 128;
                            if (i24 % 2 != 0) {
                                bArr[i23] = (byte) (((long) bArr3[i23]) | 7616081452308447380L);
                            } else {
                                bArr[i23] = (byte) (((long) bArr3[i23]) ^ 7616081452308447380L);
                                i23++;
                            }
                        }
                    } else {
                        bArr = bArr3;
                    }
                    boolean z11 = bArr != null;
                    settextalignment.setDividerPadding = 1;
                    int i25 = f57150u0 + 51;
                    v0 = i25 % 128;
                    int i26 = i25 % 2;
                    while (settextalignment.setDividerPadding < iIntValue) {
                        if (!z11) {
                            settextalignment.setX--;
                            throw null;
                        }
                        int i27 = settextalignment.setX;
                        settextalignment.setX = i27 - 1;
                        char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i27]) ^ 7616081452308447380L)) + s4)) ^ b10));
                        settextalignment.setCompoundDrawableTintBlendMode = c10;
                        sb2.append(c10);
                        settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                        settextalignment.setDividerPadding++;
                    }
                }
                objArr[0] = sb2.toString();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 4
                int r9 = r9 + 1
                int r8 = r8 * 3
                int r8 = 112 - r8
                int r7 = r7 * 3
                int r7 = 3 - r7
                byte[] r0 = new byte[r9]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.ms.a.f57151w0
                if (r2 != 0) goto L17
                r3 = r8
                r4 = r1
                r8 = r7
                goto L2e
            L17:
                r3 = r1
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r0[r3] = r5
                if (r4 != r9) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r1)
                r10[r1] = r7
                return
            L27:
                int r7 = r7 + 1
                r3 = r2[r7]
                r6 = r8
                r8 = r7
                r7 = r6
            L2e:
                int r7 = r7 + r3
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.ms.a.b(byte, int, short, java.lang.Object[]):void");
        }

        public static void c() {
            f57151w0 = new byte[]{121, -93, 12, 34};
        }

        public final void d(@NotNull String str) {
            int i10 = f57149t0 + 7;
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                ml mlVar = (ml) this.receiver;
                ml.setY(new Object[]{mlVar, str}, 194155730, -194155730, System.identityHashCode(mlVar));
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                ml mlVar2 = (ml) this.receiver;
                ml.setY(new Object[]{mlVar2, str}, 194155730, -194155730, System.identityHashCode(mlVar2));
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i10 = f57149t0;
            int i11 = i10 + 7;
            int i12 = i11 % 128;
            int i13 = i11 % 2;
            d(str);
            Unit unit = Unit.INSTANCE;
            if (i13 != 0) {
                int i14 = 55 / 0;
            }
            int i15 = i10 + 65;
            int i16 = i15 % 128;
            if (i15 % 2 != 0) {
                int i17 = 39 / 0;
            }
            return unit;
        }
    }

    static {
        int i10 = f57143b;
        int i11 = i10 & 63;
        int i12 = (((i10 | 63) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f57144c = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 78 / 0;
        }
    }

    public final synchronized void setCompoundDrawableTintBlendMode(@NotNull Function1<? super String, Unit> p4) {
        int i10 = f57144c;
        int i11 = i10 & 61;
        int i12 = -(-((i10 ^ 61) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f57143b = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p4, "");
            f57142a = p4;
            throw null;
        }
        Intrinsics.checkNotNullParameter(p4, "");
        f57142a = p4;
    }

    public final synchronized void setX(@NotNull String p4) {
        int i10 = f57144c;
        int i11 = (i10 ^ 85) + ((i10 & 85) << 1);
        f57143b = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p4, "");
            f57142a.invoke(p4);
            throw null;
        }
        Intrinsics.checkNotNullParameter(p4, "");
        f57142a.invoke(p4);
    }

    public final synchronized void setCompoundDrawableTintBlendMode(@NotNull setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay, @NotNull String str) {
        int i10 = f57144c;
        int i11 = i10 & 85;
        int i12 = -(-((i10 ^ 85) | i11));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f57143b = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        int i15 = i10 & 55;
        int i16 = (~i15) & (i10 | 55);
        int i17 = -(-(i15 << 1));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f57143b = i18 % 128;
        int i19 = i18 % 2;
    }
}
