package com.mypinpad.tsdk.isolation;

import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.esotericsoftware.asm.Opcodes;
import com.esotericsoftware.kryo.serializers.d;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/setLinkTextColor;", "", "", "p0", "", "p1", "", "setCompoundDrawableTintBlendMode", "(JI)[B", "Landroid/hardware/SensorManager;", "<init>", "(Landroid/hardware/SensorManager;)V", "setY"}, k = 1, mv = {1, 5, 1})
public final class setLinkTextColor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int[] f60011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f60016g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f60017h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SensorManager f60018a;

    static {
        b();
        f60014e = 0;
        f60015f = 1;
        f60012c = 0;
        f60013d = 1;
        c();
        INSTANCE = new Companion(null);
        int i10 = f60013d + 45;
        f60012c = i10 % 128;
        int i11 = i10 % 2;
    }

    public setLinkTextColor(@NotNull SensorManager sensorManager) {
        Intrinsics.checkNotNullParameter(sensorManager, "");
        this.f60018a = sensorManager;
    }

    public static void a(byte b10, int i10, short s4, Object[] objArr) {
        int i11 = 108 - (b10 * 4);
        int i12 = s4 * 2;
        int i13 = i10 + 4;
        byte[] bArr = new byte[1 - i12];
        int i14 = 0 - i12;
        byte[] bArr2 = f60016g;
        int i15 = -1;
        if (bArr2 == null) {
            i11 += i14;
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr[i16] = (byte) i11;
            if (i16 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i13++;
            i11 = bArr2[i13] + i11;
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = i16;
        }
    }

    public static void b() {
        f60016g = new byte[]{120, 57, -32, 115};
        f60017h = Opcodes.MULTIANEWARRAY;
    }

    public static void c() {
        f60011b = new int[]{1392746911, -895276201, 982013957, 1664840581, 1538461878, -79629362, 756748953, 1040711423, -831245355, 1188359791, -1248107927, 2059261668, 1045987720, 1534571686, 1456306286, -659116959, -1200789179, 302121431};
    }

    public static final /* synthetic */ void setDividerPadding(setLinkTextColor setlinktextcolor, String str) {
        int i10 = f60013d + 93;
        f60012c = i10 % 128;
        int i11 = i10 % 2;
        setlinktextcolor.getClass();
        int i12 = f60012c + 37;
        f60013d = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 46 / 0;
        }
    }

    public final CompletableFuture d() throws Throwable {
        int[] iArr;
        int i10;
        char[] cArr;
        char[] cArr2;
        int i11;
        int length;
        int[] iArr2;
        int[] iArr3 = {1991709360, 1925010463};
        int mirror = '2' - AndroidCharacter.getMirror('0');
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[4];
        int[] iArr4 = f60011b;
        int i12 = 1;
        int i13 = 0;
        int i14 = f60017h;
        if (iArr4 != null) {
            int i15 = f60015f + 31;
            int i16 = i15 % 128;
            f60014e = i16;
            int i17 = i15 % 2;
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i18 = i16 + 81;
            f60015f = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (i20 < length2) {
                try {
                    Object[] objArr = new Object[1];
                    objArr[i13] = Integer.valueOf(iArr4[i20]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1833429914);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionForGroup(i13) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i13) == 0L ? 0 : -1)), 44 - (Process.myPid() >> 22), 729 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        byte b10 = (byte) (i14 & 3);
                        byte b11 = (byte) (-b10);
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, (byte) (b11 + 1), objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1833429914, method);
                    }
                    iArr5[i20] = ((Integer) ((Method) method).invoke(null, objArr)).intValue();
                    i20++;
                    length2 = length2;
                    iArr4 = iArr4;
                    i13 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            int i21 = f60014e + 117;
            f60015f = i21 % 128;
            int i22 = i21 % 2;
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = f60011b;
        if (iArr7 != null) {
            int i23 = f60015f + 29;
            f60014e = i23 % 128;
            if (i23 % 2 != 0) {
                length = iArr7.length;
                iArr2 = new int[length];
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
            }
            int i24 = 0;
            while (i24 < length) {
                int i25 = f60015f + 47;
                f60014e = i25 % 128;
                if (i25 % 2 != 0) {
                    Object[] objArr3 = new Object[i12];
                    objArr3[0] = Integer.valueOf(iArr7[i24]);
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1833429914);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), View.resolveSizeAndState(0, 0, 0) + 44, TextUtils.indexOf("", "", 0) + 728);
                        byte b12 = (byte) (i14 & 3);
                        byte b13 = (byte) (-b12);
                        Object[] objArr4 = new Object[1];
                        a(b12, b13, (byte) (b13 + 1), objArr4);
                        method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                        map2.put(1833429914, method2);
                    }
                    iArr2[i24] = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
                } else {
                    iArr3 = iArr3;
                    mirror = mirror;
                    cArr3 = cArr3;
                    cArr4 = cArr4;
                    length = length;
                    Object[] objArr5 = {Integer.valueOf(iArr7[i24])};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(1833429914);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.indexOf("", "", 0) + 44, 728 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        byte b14 = (byte) (i14 & 3);
                        byte b15 = (byte) (-b14);
                        Object[] objArr6 = new Object[1];
                        a(b14, b15, (byte) (b15 + 1), objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Integer.TYPE);
                        map3.put(1833429914, method3);
                    }
                    iArr2[i24] = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                    i24++;
                }
                mirror = mirror;
                length = length;
                cArr4 = cArr4;
                cArr3 = cArr3;
                iArr3 = iArr3;
                i12 = 1;
            }
            iArr = iArr3;
            i10 = mirror;
            cArr = cArr3;
            cArr2 = cArr4;
            iArr7 = iArr2;
        } else {
            iArr = iArr3;
            i10 = mirror;
            cArr = cArr3;
            cArr2 = cArr4;
        }
        System.arraycopy(iArr7, 0, iArr6, 0, length3);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i26 = setonlongclicklistener.setDividerPadding;
            if (i26 >= 2) {
                break;
            }
            int i27 = f60015f + 41;
            f60014e = i27 % 128;
            int i28 = i27 % 2;
            int i29 = iArr[i26];
            char c10 = (char) (i29 >> 16);
            cArr[0] = c10;
            char c11 = (char) i29;
            cArr[1] = c11;
            int i30 = iArr[i26 + 1];
            char c12 = (char) (i30 >> 16);
            cArr[2] = c12;
            char c13 = (char) i30;
            cArr[3] = c13;
            setonlongclicklistener.setY = (c10 << 16) + c11;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c12 << 16) + c13;
            setOnLongClickListener.setX(iArr6);
            int i31 = 0;
            for (int i32 = 16; i31 < i32; i32 = 16) {
                int i33 = setonlongclicklistener.setY ^ iArr6[i31];
                setonlongclicklistener.setY = i33;
                Object[] objArr7 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i33)), setonlongclicklistener, setonlongclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-350984188);
                if (method4 == null) {
                    method4 = ((Class) setTextScaleX.setX((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 41, 180 - TextUtils.getOffsetAfter("", 0))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map4.put(-350984188, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                i31++;
            }
            int i34 = setonlongclicklistener.setY;
            int i35 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i36 = i34 ^ iArr6[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i36;
            int i37 = i35 ^ iArr6[17];
            setonlongclicklistener.setY = i37;
            cArr[0] = (char) (i37 >>> 16);
            cArr[1] = (char) i37;
            cArr[2] = (char) (i36 >>> 16);
            cArr[3] = (char) i36;
            setOnLongClickListener.setX(iArr6);
            int i38 = setonlongclicklistener.setDividerPadding * 2;
            cArr2[i38] = cArr[0];
            cArr2[i38 + 1] = cArr[1];
            cArr2[i38 + 2] = cArr[2];
            cArr2[i38 + 3] = cArr[3];
            Object[] objArr8 = {setonlongclicklistener, setonlongclicklistener};
            Map map5 = setTextScaleX.setMaxEms;
            Object method5 = map5.get(-147294223);
            if (method5 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 40 - TextUtils.lastIndexOf("", '0', 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 482);
                byte b16 = (byte) 0;
                byte b17 = (byte) (b16 - 1);
                Object[] objArr9 = new Object[1];
                a(b16, b17, (byte) (b17 + 1), objArr9);
                method5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map5.put(-147294223, method5);
            }
            ((Method) method5).invoke(null, objArr8);
        }
        final int i39 = 80;
        Intrinsics.stringPlus(new String(cArr2, 0, i10).intern(), 80);
        final ArrayList arrayList = new ArrayList();
        final CompletableFuture completableFutureB = d.b();
        final long j10 = 2000;
        if (new getValidUntil(this.f60018a, new Function2<setWillNotCacheDrawing, getValidUntil, Unit>() { // from class: com.mypinpad.tsdk.i.setLinkTextColor.1
            public static final byte[] E0 = null;
            public static final int F0 = 0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public static final int[] f60019u0;
            public static int v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public static int f60020w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public static int f60021x0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public static int f60022y0;

            static {
                b();
                f60021x0 = 0;
                f60022y0 = 1;
                v0 = 0;
                f60020w0 = 1;
                f60019u0 = new int[]{1072648968, 768970739, -758004978, 1902549898, 461206765, 766813724, 545317635, -817970727, 2063118616, -642913199, 563694405, 391487050, -2082360441, -1787978448, 1922208615, -793166287, 269526965, -1649045027};
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            public static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 3
                    int r8 = r8 + 1
                    int r9 = r9 * 2
                    int r9 = 3 - r9
                    int r7 = r7 * 4
                    int r7 = r7 + 104
                    byte[] r0 = new byte[r8]
                    r1 = 0
                    byte[] r2 = com.mypinpad.tsdk.isolation.setLinkTextColor.AnonymousClass1.E0
                    if (r2 != 0) goto L1a
                    r5 = r1
                    r3 = r2
                    r2 = r0
                    r0 = r10
                    r10 = r9
                    r9 = r8
                    goto L35
                L1a:
                    r3 = r1
                L1b:
                    byte r4 = (byte) r7
                    int r5 = r3 + 1
                    r0[r3] = r4
                    if (r5 != r8) goto L2a
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r0, r1)
                    r10[r1] = r7
                    return
                L2a:
                    int r9 = r9 + 1
                    r3 = r2[r9]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r2
                    r2 = r0
                    r0 = r10
                    r10 = r6
                L35:
                    int r7 = r7 + r8
                    r8 = r9
                    r9 = r10
                    r10 = r0
                    r0 = r2
                    r2 = r3
                    r3 = r5
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setLinkTextColor.AnonymousClass1.a(int, int, int, java.lang.Object[]):void");
            }

            public static void b() {
                E0 = new byte[]{49, 113, -89, 89};
                F0 = 153;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(setWillNotCacheDrawing setwillnotcachedrawing, getValidUntil getvaliduntil) throws Throwable {
                int i40 = v0 + 41;
                f60020w0 = i40 % 128;
                int i41 = i40 % 2;
                setX(setwillnotcachedrawing, getvaliduntil);
                Unit unit = Unit.INSTANCE;
                if (i41 == 0) {
                    int i42 = 94 / 0;
                }
                return unit;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 java.lang.NullPointerException, still in use, count: 2, list:
                  (r0v6 java.lang.NullPointerException) from 0x0148: MOVE (r19v0 java.lang.NullPointerException) = (r0v6 java.lang.NullPointerException) (LINE:329)
                  (r0v6 java.lang.NullPointerException) from 0x00be: PHI (r0v28 java.lang.NullPointerException) = (r0v6 java.lang.NullPointerException), (r0v34 java.lang.NullPointerException) binds: [B:12:0x00b1, B:20:0x012d] A[DONT_GENERATE, DONT_INLINE]
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            public final void setX(@org.jetbrains.annotations.NotNull com.mypinpad.tsdk.isolation.setWillNotCacheDrawing r26, @org.jetbrains.annotations.NotNull com.mypinpad.tsdk.isolation.getValidUntil r27) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1102
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setLinkTextColor.AnonymousClass1.setX(com.mypinpad.tsdk.i.setWillNotCacheDrawing, com.mypinpad.tsdk.i.getValidUntil):void");
            }
        }).setOnFocusChangeListener()) {
            i11 = 2;
        } else {
            int i40 = f60013d + 35;
            f60012c = i40 % 128;
            i11 = 2;
            int i41 = i40 % 2;
            completableFutureB.complete(new setWillNotCacheDrawing[0]);
        }
        int i42 = f60012c + 107;
        f60013d = i42 % 128;
        if (i42 % i11 != 0) {
            return completableFutureB;
        }
        throw null;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode(long p4, int p10) throws ExecutionException, ordinal, InterruptedException {
        byte[] bArrPlus;
        try {
            Object obj = d().get(2500L, TimeUnit.MILLISECONDS);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                setWillNotCacheDrawing setwillnotcachedrawing = (setWillNotCacheDrawing) objArr[i10];
                arrayList.add(Byte.valueOf((byte) (((Double) setWillNotCacheDrawing.setOnFocusChangeListener(new Object[]{setwillnotcachedrawing}, -1209949171, 1209949172, System.identityHashCode(setwillnotcachedrawing))).doubleValue() * 1000.0d)));
                i10++;
                int i11 = f60013d + 115;
                f60012c = i11 % 128;
                int i12 = i11 % 2;
            }
            bArrPlus = CollectionsKt___CollectionsKt.toByteArray(arrayList);
        } catch (TimeoutException unused) {
            bArrPlus = null;
        }
        if (bArrPlus == null || bArrPlus.length == 0) {
            throw new ordinal();
        }
        int i13 = f60013d + 15;
        f60012c = i13 % 128;
        int i14 = i13 % 2;
        int length2 = 80 - bArrPlus.length;
        if (length2 > 0) {
            byte[] bArr = new byte[length2];
            new SecureRandom().nextBytes(bArr);
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, bArr);
        }
        int i15 = f60013d + 69;
        f60012c = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 42 / 0;
        }
        return bArrPlus;
    }
}
