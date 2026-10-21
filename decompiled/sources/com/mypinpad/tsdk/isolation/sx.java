package com.mypinpad.tsdk.isolation;

import android.app.Activity;
import android.app.Application;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\tJ!\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/sx;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "T_", "()Landroid/app/Activity;", "Lcom/mypinpad/tsdk/i/sy;", "p0", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/sy;)V", "setCompoundDrawableTintBlendMode", "Landroid/os/Bundle;", "p1", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityLifecycleCallbacksListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityLifecycleCallbacksListener.kt\ncom/mypinpad/tsdk/internal/terminal/ActivityLifecycleCallbacksListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1855#2,2:71\n1855#2,2:73\n*S KotlinDebug\n*F\n+ 1 ActivityLifecycleCallbacksListener.kt\ncom/mypinpad/tsdk/internal/terminal/ActivityLifecycleCallbacksListener\n*L\n40#1:71,2\n49#1:73,2\n*E\n"})
public final class sx implements Application.ActivityLifecycleCallbacks {

    @NotNull
    public static final sx INSTANCE;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public static WeakReference<Activity> f60953p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final ArrayList f60954q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static char[] f60955r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static long f60956s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static char[] f60957t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f60958u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f60959w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f60960x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final byte[] f60961y0 = null;

    static {
        c();
        f60959w0 = 0;
        f60960x0 = 1;
        f60958u0 = 0;
        v0 = 1;
        d();
        INSTANCE = new sx();
        f60954q0 = new ArrayList();
        int i10 = v0 + 123;
        f60958u0 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Nullable
    public static Activity T_() {
        return (Activity) setDividerPadding(new Object[0], -850838153, 850838153, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x020f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0210  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        byte[] bArr;
        Object method;
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        int i12 = 0;
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i13 = setcompounddrawabletintblendmode.setDividerPadding;
            bArr = f60961y0;
            if (i13 >= i11) {
                break;
            }
            int i14 = f60959w0 + 79;
            f60960x0 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i12] = Integer.valueOf(f60955r0[i10 + i13]);
                Map map = setTextScaleX.setMaxEms;
                Object method2 = map.get(1832327647);
                if (method2 == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(i12, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i12, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(i12, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i12, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, Color.blue(i12) + 728);
                    byte b10 = bArr[3];
                    byte b11 = (byte) (b10 - 1);
                    byte b12 = (byte) (-b10);
                    Object[] objArr3 = new Object[1];
                    b((byte) (b12 + 1), b12, b11, objArr3);
                    String str = (String) objArr3[i12];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i12] = Integer.TYPE;
                    method2 = cls.getMethod(str, clsArr);
                    map.put(1832327647, method2);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method2).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f60956s0), Integer.valueOf(c10)};
                Object method3 = map.get(2012362404);
                if (method3 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', 0) + 46117), (Process.myPid() >> 22) + 43, 1776 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    byte b13 = bArr[3];
                    Object[] objArr5 = new Object[1];
                    b(b13, (byte) (-b13), (byte) (b13 - 1), objArr5);
                    String str2 = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method3 = cls2.getMethod(str2, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method3);
                }
                jArr[i13] = ((Long) ((Method) method3).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method4 = map.get(1606688712);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) Color.alpha(0), (KeyEvent.getMaxKeyCode() >> 16) + 27, TextUtils.getOffsetBefore("", 0) + 2311);
                    byte b14 = bArr[3];
                    byte b15 = (byte) (b14 - 1);
                    byte b16 = (byte) (-b14);
                    Object[] objArr7 = new Object[1];
                    b((byte) (b16 & 5), b16, b15, objArr7);
                    method4 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method4);
                }
                ((Method) method4).invoke(null, objArr6);
                i12 = 0;
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
            int i16 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i16 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = f60960x0 + 125;
            f60959w0 = i17 % 128;
            int i18 = i17 % 2;
            cArr[i16] = (char) jArr[i16];
            Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map2 = setTextScaleX.setMaxEms;
            Object obj = map2.get(1606688712);
            if (obj != null) {
                method = obj;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) (Color.rgb(0, 0, 0) + 16777216), ExpandableListView.getPackedPositionType(0L) + 27, 2311 - View.resolveSizeAndState(0, 0, 0));
                byte b17 = bArr[3];
                byte b18 = (byte) (b17 - 1);
                byte b19 = (byte) (-b17);
                Object[] objArr9 = new Object[1];
                b((byte) (b19 & 5), b19, b18, objArr9);
                method = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map2.put(1606688712, method);
            }
            ((Method) method).invoke(null, objArr8);
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
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r7 = r7 + 4
            int r6 = r6 + 67
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.sx.f60961y0
            if (r2 != 0) goto L17
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L32
        L17:
            r3 = r1
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L32:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.sx.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f60961y0 = new byte[]{DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 71, 101, 1};
    }

    public static void d() {
        f60956s0 = -7295946480317233404L;
        f60955r0 = new char[]{31299, 47962, 63581, 14599, 32312, 48957, 64714, 15853, 29336, 45965, 61599, 13910, 30569, 46197, 62728, 10785, 27592, 50803, 1898, 17517, 34103, 49672, 781, 16634, 33245, 52904, 4029, 19647, 35424, 52061, 2134, 18744, 38417, 55288, 50803, 1898, 17517, 34103, 49672, 781, 16634, 33245, 52904, 4029, 19646, 35441, 52047, 2129, 18721, 38417, 55288, 9155, 58074, 41437, 24711, 10168, 59069, 42314, 25709, 11032, 59917, 43276, 28613, 12025, 60903, 44185, 29600, 50803, 1898, 17517, 34103, 49672, 781, 16634, 33245, 52904, 4029, 19647, 35424, 52051, 2132, 18748, 38417, 55288, 40249, 23584, 7975, 56957, 39234, 22599, 7088, 55959, 38370, 21751, 6114, 53563, 36869, 21274, 4724, 52561, 36015, 20395, 3714};
        f60957t0 = new char[]{58896, 58932, 58919, 58888, 58906, 58912, 58917, 58928, 58919, 58928, 58917, 58890, 59112, 58943, 58942, 58932, 58917, 58888, 58917, 58906, 58932, 58890, 58943, 58888, 58917, 58938, 58943};
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = v0;
        int i14 = i13 + 93;
        f60958u0 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        WeakReference<Activity> weakReference = f60953p0;
        if (weakReference == null) {
            return null;
        }
        int i15 = i13 + 11;
        f60958u0 = i15 % 128;
        if (i15 % 2 == 0) {
            return weakReference.get();
        }
        weakReference.get();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity p4, @Nullable Bundle p10) throws Throwable {
        int i10 = v0 + 117;
        f60958u0 = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p4, "");
            mr mrVar = mr.UiMessageCallbackKtWhenMappings;
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getMaximumDrawingCacheSize() / 24) * 48176), Color.argb(0, 1, 1, 0), KeyEvent.getDeadChar(0, 0) * 100, objArr);
            mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        } else {
            Intrinsics.checkNotNullParameter(p4, "");
            mr mrVar2 = mr.UiMessageCallbackKtWhenMappings;
            Object[] objArr2 = new Object[1];
            a((char) (48176 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Color.argb(0, 0, 0, 0), KeyEvent.getDeadChar(0, 0) + 17, objArr2);
            mt.setX(new Object[]{mrVar2, ((String) objArr2[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        }
        int i11 = f60958u0 + 63;
        v0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity p4) throws Throwable {
        int i10 = f60958u0 + 95;
        v0 = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p4, "");
            mr mrVar = mr.UiMessageCallbackKtWhenMappings;
            Object[] objArr = new Object[1];
            a((char) (31902 - (ViewConfiguration.getEdgeSlop() * 3)), 93 >> TextUtils.getOffsetAfter("", 1), 10 >>> (ViewConfiguration.getLongPressTimeout() / 103), objArr);
            mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
            return;
        }
        Intrinsics.checkNotNullParameter(p4, "");
        mr mrVar2 = mr.UiMessageCallbackKtWhenMappings;
        Object[] objArr2 = new Object[1];
        a((char) (23370 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.getOffsetAfter("", 0) + 84, 19 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
        mt.setX(new Object[]{mrVar2, ((String) objArr2[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity p4) throws Throwable {
        Activity activity;
        Intrinsics.checkNotNullParameter(p4, "");
        mr mrVar = mr.UiMessageCallbackKtWhenMappings;
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getTapTimeout() >> 16) + 58800), 51 - (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.normalizeMetaState(0) + 16, objArr);
        mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        WeakReference<Activity> weakReference = f60953p0;
        if (weakReference != null) {
            activity = weakReference.get();
            int i10 = v0 + 83;
            f60958u0 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            activity = null;
        }
        if (Intrinsics.areEqual(activity, p4)) {
            int i12 = v0 + 85;
            f60958u0 = i12 % 128;
            if (i12 % 2 != 0) {
                f60953p0 = null;
                throw null;
            }
            f60953p0 = null;
        }
        Iterator it = CollectionsKt___CollectionsKt.toList(f60954q0).iterator();
        while (it.hasNext()) {
            int i13 = f60958u0 + 17;
            v0 = i13 % 128;
            int i14 = i13 % 2;
            ((sy) it.next()).ah_(p4);
        }
        int i15 = v0 + 55;
        f60958u0 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity p4) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        mr mrVar = mr.UiMessageCallbackKtWhenMappings;
        Object[] objArr = new Object[1];
        a((char) Color.green(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 34, 17 - View.resolveSizeAndState(0, 0, 0), objArr);
        mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        f60953p0 = new WeakReference<>(p4);
        Iterator it = CollectionsKt___CollectionsKt.toList(f60954q0).iterator();
        int i10 = f60958u0 + 77;
        while (true) {
            v0 = i10 % 128;
            int i11 = i10 % 2;
            if (!it.hasNext()) {
                return;
            }
            int i12 = v0 + 3;
            f60958u0 = i12 % 128;
            if (i12 % 2 != 0) {
                ((sy) it.next()).ai_(p4);
                throw null;
            }
            ((sy) it.next()).ai_(p4);
            i10 = f60958u0 + 75;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity p4, @NotNull Bundle p10) throws Throwable {
        mr mrVar;
        int i10 = v0 + 21;
        f60958u0 = i10 % 128;
        int i11 = i10 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        mr mrVar2 = mr.UiMessageCallbackKtWhenMappings;
        char c10 = 0;
        int[] iArr = {0, 27, 60, 15};
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i12 = iArr[0];
        int i13 = 1;
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr = f60957t0;
        byte[] bArr = f60961y0;
        if (cArr != null) {
            int i17 = f60960x0 + 87;
            f60959w0 = i17 % 128;
            int i18 = i17 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr = new Object[i13];
                    objArr[c10] = Integer.valueOf(cArr[i19]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore(str, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36, 608 - TextUtils.indexOf((CharSequence) str, '0', 0));
                        byte b10 = bArr[3];
                        byte b11 = (byte) (b10 - 1);
                        byte b12 = (byte) (-b10);
                        Object[] objArr2 = new Object[1];
                        b((byte) (b12 & 31), b12, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr2[i19] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i19++;
                    cArr = cArr;
                    str = str;
                    length = length;
                    mrVar2 = mrVar2;
                    bArr = bArr;
                    c10 = 0;
                    i13 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            mrVar = mrVar2;
            cArr = cArr2;
        } else {
            mrVar = mrVar2;
        }
        char[] cArr3 = new char[i14];
        System.arraycopy(cArr, i12, cArr3, 0, i14);
        if (i16 > 0) {
            char[] cArr4 = new char[i14];
            System.arraycopy(cArr3, 0, cArr4, 0, i14);
            int i20 = i14 - i16;
            System.arraycopy(cArr4, 0, cArr3, i20, i16);
            System.arraycopy(cArr4, i16, cArr3, 0, i20);
        }
        int i21 = f60960x0 + 37;
        f60959w0 = i21 % 128;
        int i22 = i21 % 2;
        char[] cArr5 = new char[i14];
        int i23 = 0;
        while (true) {
            setnavigationonclicklistener.setX = i23;
            int i24 = setnavigationonclicklistener.setX;
            if (i24 >= i14) {
                break;
            }
            int i25 = f60959w0 + 39;
            f60960x0 = i25 % 128;
            int i26 = i25 % 2;
            cArr5[i24] = cArr3[(i14 - i24) - 1];
            i23 = i24 + 1;
        }
        if (i15 > 0) {
            int i27 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i27;
                int i28 = setnavigationonclicklistener.setX;
                if (i28 >= i14) {
                    break;
                }
                int i29 = f60960x0 + 21;
                f60959w0 = i29 % 128;
                if (i29 % 2 != 0) {
                    cArr5[i28] = (char) (cArr5[i28] - iArr[3]);
                    i27 = i28 - 1;
                } else {
                    cArr5[i28] = (char) (cArr5[i28] - iArr[2]);
                    i27 = i28 + 1;
                }
            }
        }
        mt.setX(new Object[]{mrVar, n1.f(cArr5)}, -225944049, 225944051, (int) System.currentTimeMillis());
        int i30 = v0 + 3;
        f60958u0 = i30 % 128;
        int i31 = i30 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity p4) throws Throwable {
        int i10 = f60958u0 + 105;
        v0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        mr mrVar = mr.UiMessageCallbackKtWhenMappings;
        Object[] objArr = new Object[1];
        a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17, 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        int i12 = f60958u0 + 113;
        v0 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity p4) throws Throwable {
        int i10 = v0 + 125;
        f60958u0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        mr mrVar = mr.UiMessageCallbackKtWhenMappings;
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getTapTimeout() >> 16), View.getDefaultSize(0, 0) + 67, 17 - View.resolveSize(0, 0), objArr);
        mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        int i12 = f60958u0 + 15;
        v0 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public final synchronized void setCompoundDrawableTintBlendMode(@NotNull sy p4) {
        int i10 = v0 + 19;
        f60958u0 = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p4, "");
            f60954q0.remove(p4);
            throw null;
        }
        Intrinsics.checkNotNullParameter(p4, "");
        f60954q0.remove(p4);
    }

    public final synchronized void setOnFocusChangeListener(@NotNull sy p4) {
        int i10 = v0 + 83;
        f60958u0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        ArrayList arrayList = f60954q0;
        if (!arrayList.contains(p4)) {
            int i12 = v0 + 29;
            f60958u0 = i12 % 128;
            if (i12 % 2 != 0) {
                arrayList.add(p4);
                throw null;
            }
            arrayList.add(p4);
        }
    }
}
