package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.h;
import androidx.camera.core.u1;
import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/ve;", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "p0", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "setX"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSdkThreadFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkThreadFactory.kt\ncom/mypinpad/tsdk/internal/utils/threading/SdkThreadFactory\n+ 2 DebugFunctions.kt\ncom/mypinpad/common/buildconstants/DebugFunctionsKt\n*L\n1#1,49:1\n42#2:50\n*S KotlinDebug\n*F\n+ 1 SdkThreadFactory.kt\ncom/mypinpad/tsdk/internal/utils/threading/SdkThreadFactory\n*L\n29#1:50\n*E\n"})
public final class ve implements ThreadFactory {
    public static final byte[] E0 = null;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f61538r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static long f61539s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f61540t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static char f61541u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f61542w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f61543x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f61544y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f61545p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f61546q0;

    static {
        d();
        f61543x0 = 0;
        f61544y0 = 1;
        v0 = 0;
        f61542w0 = 1;
        e();
        INSTANCE = new Companion(null);
        f61538r0 = new AtomicInteger(1);
        int i10 = v0 + 7;
        f61542w0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public ve(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        if ((i10 & 1) != 0) {
            Object[] objArr = new Object[1];
            b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\ue74e묌Í놽", Color.green(0) - 843379481, "컔뀰嘢呉뭬⊜薺", objArr);
            str = ((String) objArr[0]).intern();
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.f61545p0 = new AtomicInteger(1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('-');
        sb2.append(f61538r0.getAndIncrement());
        Object[] objArr2 = new Object[1];
        b((char) Color.green(0), "埪ᬈ噔䵤", ViewConfiguration.getFadingEdgeLength() >> 16, "鶊煲\ue76a駓焓准㡛爹", objArr2);
        sb2.append(((String) objArr2[0]).intern());
        this.f61546q0 = sb2.toString();
    }

    public static void a(Runnable runnable) {
        int i10 = v0 + 21;
        f61542w0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(runnable, "");
        up upVar = up.setX;
        up.setOnFocusChangeListener(new Object[0], 1074367466, -1074367463, (int) System.currentTimeMillis());
        runnable.run();
        int i12 = f61542w0 + 77;
        v0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static void b(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char[] charArray = str2.toCharArray();
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        int i11 = f61544y0 + 5;
        f61543x0 = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        char[] charArray3 = str.toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        char c11 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i14 = f61543x0 + 115;
            f61544y0 = i14 % 128;
            int i15 = i14 % i12;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[c11] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (MotionEvent.axisFromString("") + 50679), 39 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1737 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    c(b11, b11, b10, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (8125 - KeyEvent.getDeadChar(0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37, 647 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    c(b13, (byte) (b13 + 3), b12, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), 50 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 435);
                    byte b14 = (byte) (-1);
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr7 = new Object[1];
                    c(b15, (byte) (b15 + 1), b14, objArr7);
                    String str3 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str3, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (View.combineMeasuredStates(0, 0) + 4449), 42 - Color.red(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + PointerIconCompat.TYPE_GRABBING);
                    byte b16 = (byte) (-1);
                    Object[] objArr9 = new Object[1];
                    c((byte) (b16 + 1), (byte) (-E0[1]), b16, objArr9);
                    String str4 = (String) objArr9[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str4, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c12 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c12;
                int i16 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i16] = (char) (((((long) (c12 ^ charArray[i16])) ^ (f61539s0 ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f61540t0) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f61541u0) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i16 + 1;
                int i17 = f61544y0 + 123;
                f61543x0 = i17 % 128;
                i12 = 2;
                int i18 = i17 % 2;
                length3 = length3;
                c11 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 113
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.ve.E0
            if (r2 != 0) goto L18
            r7 = r6
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L35
        L18:
            r3 = r1
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r2[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L35:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ve.c(byte, byte, int, java.lang.Object[]):void");
    }

    public static void d() {
        E0 = new byte[]{76, -6, -8, -33};
    }

    public static void e() {
        f61541u0 = (char) 30296;
        f61539s0 = -2443367703579691432L;
        f61540t0 = 263187407;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public final Thread newThread(@NotNull Runnable p4) throws Throwable {
        Runnable runnable;
        Runnable u1Var;
        Intrinsics.checkNotNullParameter(p4, "");
        Object[] objArr = new Object[1];
        b((char) Color.red(0), "ᤌ濄蚮탤", (-1368407015) - TextUtils.indexOf("", "", 0, 0), "熧嘼鰹ᔩ䜶茔\uf2bf", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((char) (39777 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "杗굍慛\ue39b", ExpandableListView.getPackedPositionChild(0L) + 1538084200, "ᔶ\uf2ee띊鈴⥫", objArr2);
        int i10 = 5;
        if (!(!Intrinsics.areEqual(strIntern, ((String) objArr2[0]).intern()))) {
            int i11 = f61542w0 + 3;
            v0 = i11 % 128;
            if (i11 % 2 != 0) {
                u1Var = new h(p4, i10);
                int i12 = 30 / 0;
            } else {
                u1Var = new u1(p4, 4);
            }
            runnable = u1Var;
        } else {
            runnable = p4;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f61546q0);
        sb2.append(this.f61545p0.getAndIncrement());
        Thread thread = new Thread(null, runnable, sb2.toString(), 0L);
        if (thread.isDaemon()) {
            int i13 = v0 + 27;
            f61542w0 = i13 % 128;
            if (i13 % 2 == 0) {
                thread.setDaemon(true);
            } else {
                thread.setDaemon(false);
            }
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        int i14 = v0 + 33;
        f61542w0 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 26 / 0;
        }
        return thread;
    }

    public ve() {
        this(null, 1, null);
    }
}
