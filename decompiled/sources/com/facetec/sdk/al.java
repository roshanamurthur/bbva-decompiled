package com.facetec.sdk;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.compose.animation.core.AnimationKt;
import androidx.core.app.NotificationManagerCompat;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes9.dex */
final class al extends ag implements Camera.AutoFocusCallback, Camera.ErrorCallback, Camera.PreviewCallback, SurfaceHolder.Callback {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static /* synthetic */ boolean F;
    private static int H;
    private static int[] I;
    private static int J;
    private static String[] m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f40311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final WeakReference<bh> f40312p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f40314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final j f40315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SurfaceHolder f40316t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f40318v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f40310n = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Camera f40313q = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f40321y = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    an f40309k = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f40317u = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f40320x = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f40319w = false;
    private boolean C = false;
    private final Handler A = new Handler(Looper.getMainLooper());
    private String B = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f40322z = -1;
    private final AtomicBoolean D = new AtomicBoolean(false);
    private final Camera.AutoFocusMoveCallback G = new Camera.AutoFocusMoveCallback() { // from class: com.facetec.sdk.w0
        @Override // android.hardware.Camera.AutoFocusMoveCallback
        public final void onAutoFocusMoving(boolean z10, Camera camera) throws Throwable {
            this.f42934a.S_(z10, camera);
        }
    };
    private final Camera.AutoFocusCallback E = new Camera.AutoFocusCallback() { // from class: com.facetec.sdk.x0
        @Override // android.hardware.Camera.AutoFocusCallback
        public final void onAutoFocus(boolean z10, Camera camera) throws Throwable {
            this.f42954p0.R_(z10, camera);
        }
    };

    static {
        init$0();
        H = 0;
        J = 1;
        n();
        F = true;
        m = new String[]{"ZTE B2017G"};
    }

    private al(Activity activity, boolean z10) {
        this.f40312p = new WeakReference<>((bh) activity);
        ag.f40233d = z10;
        HandlerThread handlerThread = new HandlerThread("CameraHandlerThread");
        handlerThread.start();
        this.f40311o = new Handler(handlerThread.getLooper());
        this.f40315s = new j(activity);
    }

    private void G_(ViewGroup viewGroup) throws Throwable {
        if (this.f40313q == null || this.f40310n) {
            return;
        }
        H_(I_(ag.f40236g, ag.f40237h, viewGroup));
    }

    private void H_(Rect rect) throws Throwable {
        if (this.f40310n || this.f40313q == null || !this.f40317u) {
            return;
        }
        this.f40310n = true;
        try {
            Object[] objArr = new Object[1];
            K(new int[]{62472309, 1196272291, 391067541, -1284278927, 675861992, 1934052901, 1465863320, -2014963410}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            K(new int[]{495332974, -450293190, -2029045105, 122762752}, TextUtils.indexOf((CharSequence) "", '0', 0) + 9, objArr2);
            this.f40322z = ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() / AnimationKt.MillisToNanos;
            try {
                this.f40313q.cancelAutoFocus();
                Camera.Parameters parameters = this.f40313q.getParameters();
                if (parameters.getSupportedFocusModes().contains(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                    parameters.setFocusMode(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(rect, 1000));
                if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusAreas(arrayList);
                }
                this.f40313q.setParameters(parameters);
                c(false);
                this.f40313q.autoFocus(this.E);
            } catch (Exception e5) {
                e5.getMessage();
                r();
                s();
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static Rect I_(float f6, float f10, @NonNull ViewGroup viewGroup) {
        int iA = a(Float.valueOf(((f6 / viewGroup.getWidth()) * 2000.0f) - 1000.0f).intValue());
        int iA2 = a(Float.valueOf(((f10 / viewGroup.getHeight()) * 2000.0f) - 1000.0f).intValue());
        return new Rect(iA, iA2, iA + 300, iA2 + 300);
    }

    private static void K(int[] iArr, int i10, Object[] objArr) throws Throwable {
        char[] cArr;
        String str;
        Object method;
        String str2;
        Object method2;
        Object method3;
        gx gxVar = new gx();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = I;
        int i11 = -1;
        int i12 = 1;
        char c10 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c10] = Integer.valueOf(iArr2[i13]);
                    Map map = bp.f40694x;
                    Object obj = map.get(835167305);
                    if (obj != null) {
                        method3 = obj;
                    } else {
                        Class cls = (Class) bp.a(24 - (Process.myPid() >> 22), 766 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (36773 - (ViewConfiguration.getFadingEdgeLength() >> 16)));
                        byte b10 = (byte) i11;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr3 = new Object[1];
                        L(b10, b11, b11, objArr3);
                        method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(835167305, method3);
                    }
                    iArr3[i13] = ((Integer) ((Method) method3).invoke(null, objArr2)).intValue();
                    i13++;
                    iArr2 = iArr2;
                    i11 = -1;
                    c10 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = I;
        String str3 = "";
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                Object[] objArr4 = new Object[i12];
                objArr4[0] = Integer.valueOf(iArr5[i14]);
                Map map2 = bp.f40694x;
                Object obj2 = map2.get(835167305);
                if (obj2 != null) {
                    method2 = obj2;
                } else {
                    Class cls2 = (Class) bp.a(View.combineMeasuredStates(0, 0) + 24, KeyEvent.keyCodeFromString(str3) + 765, (char) (36772 - TextUtils.indexOf((CharSequence) str3, '0', 0)));
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    L(b12, b13, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(835167305, method2);
                }
                iArr6[i14] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i14++;
                iArr5 = iArr5;
                length3 = length3;
                cArr3 = cArr3;
                str3 = str3;
                i12 = 1;
            }
            cArr = cArr3;
            str = str3;
            iArr5 = iArr6;
        } else {
            cArr = cArr3;
            str = "";
        }
        char c11 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        gxVar.f41838c = 0;
        while (true) {
            int i15 = gxVar.f41838c;
            if (i15 >= iArr.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i16 = iArr[i15];
            char c12 = (char) (i16 >> 16);
            cArr2[c11] = c12;
            char c13 = (char) i16;
            cArr2[1] = c13;
            char c14 = (char) (iArr[i15 + 1] >> 16);
            cArr2[2] = c14;
            char c15 = (char) iArr[i15 + 1];
            cArr2[3] = c15;
            gxVar.f41839d = (c12 << 16) + c13;
            gxVar.f41837a = (c14 << 16) + c15;
            gx.b(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                int i19 = gxVar.f41839d ^ iArr4[i17];
                gxVar.f41839d = i19;
                Object[] objArr6 = {gxVar, Integer.valueOf(gx.e(i19)), gxVar, gxVar};
                Map map3 = bp.f40694x;
                Object method4 = map3.get(147461875);
                if (method4 != null) {
                    str2 = str;
                } else {
                    str2 = str;
                    Class cls3 = (Class) bp.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 23, Process.getGidForName(str) + 1026, (char) (38453 - TextUtils.indexOf(str2, str2)));
                    byte b14 = (byte) (-1);
                    Object[] objArr7 = new Object[1];
                    L(b14, (byte) (b14 + 1), (byte) $$a.length, objArr7);
                    method4 = cls3.getMethod((String) objArr7[0], Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(147461875, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr6)).intValue();
                gxVar.f41839d = gxVar.f41837a;
                gxVar.f41837a = iIntValue;
                i17++;
                str = str2;
            }
            String str4 = str;
            int i20 = gxVar.f41839d;
            int i21 = gxVar.f41837a;
            int i22 = i20 ^ iArr4[16];
            gxVar.f41837a = i22;
            int i23 = i21 ^ iArr4[17];
            gxVar.f41839d = i23;
            cArr2[0] = (char) (i23 >>> 16);
            cArr2[1] = (char) i23;
            cArr2[2] = (char) (i22 >>> 16);
            cArr2[3] = (char) i22;
            gx.b(iArr4);
            int i24 = gxVar.f41838c;
            cArr[i24 * 2] = cArr2[0];
            cArr[(i24 * 2) + 1] = cArr2[1];
            cArr[(i24 * 2) + 2] = cArr2[2];
            cArr[(i24 * 2) + 3] = cArr2[3];
            Object[] objArr8 = {gxVar, gxVar};
            Map map4 = bp.f40694x;
            Object obj3 = map4.get(-1856717708);
            if (obj3 != null) {
                method = obj3;
            } else {
                Class cls4 = (Class) bp.a(24 - Drawable.resolveOpacity(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 789, (char) (TextUtils.getOffsetBefore(str4, 0) + 26624));
                byte b15 = (byte) (-1);
                byte b16 = (byte) (b15 + 1);
                Object[] objArr9 = new Object[1];
                L(b15, b16, (byte) (b16 + 3), objArr9);
                method = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(-1856717708, method);
            }
            ((Method) method).invoke(null, objArr8);
            str = str4;
            c11 = 0;
        }
    }

    private static Camera K_(Camera.CameraInfo cameraInfo) {
        int i10 = 0;
        try {
            Camera.getCameraInfo(0, cameraInfo);
        } catch (RuntimeException unused) {
            i10 = 1;
        }
        return Camera.open(i10);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void L(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.facetec.sdk.al.$$a
            int r5 = r5 + 4
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r7 = 121 - r7
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r2
            r6 = r5
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r7
            goto L37
        L17:
            r4 = r7
            r7 = r6
            r6 = r4
        L1a:
            int r2 = r2 + 1
            int r5 = r5 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L2c
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L2c:
            r3 = r0[r5]
            r4 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r7
            r7 = r4
        L37:
            int r5 = -r5
            int r5 = r5 + r7
            r7 = r8
            r8 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r4 = r6
            r6 = r5
            r5 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.al.L(short, short, short, java.lang.Object[]):void");
    }

    private static Camera L_(Camera.CameraInfo cameraInfo) throws Exception {
        int i10;
        try {
            Camera.getCameraInfo(1, cameraInfo);
            i10 = 1;
        } catch (RuntimeException unused) {
            i10 = 0;
            Camera.getCameraInfo(0, cameraInfo);
        }
        au.c("CLOT");
        au.c("CLFFT");
        if (cameraInfo.facing != 1) {
            throw new ar("Front facing camera not available");
        }
        Camera cameraOpen = Camera.open(i10);
        au.b("CLOT");
        return cameraOpen;
    }

    private static synchronized an M_(Camera camera) {
        Camera.Size preferredPreviewSizeForVideo;
        if (ag.b.e(ag.b.f40249e) && (preferredPreviewSizeForVideo = camera.getParameters().getPreferredPreviewSizeForVideo()) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(preferredPreviewSizeForVideo.width);
            sb2.append("x");
            sb2.append(preferredPreviewSizeForVideo.height);
            l.f42228d = sb2.toString();
            return new an(preferredPreviewSizeForVideo.width, preferredPreviewSizeForVideo.height);
        }
        float[] fArr = {1.7f, 1.6f, 1.5f, 1.4f, 1.3f};
        ArrayList arrayList = new ArrayList();
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        boolean z10 = false;
        for (int i10 = 0; i10 < supportedPreviewSizes.size(); i10++) {
            for (int i11 = 0; i11 < supportedPreviewSizes.size(); i11++) {
                if (i10 != i11 && supportedPreviewSizes.get(i10).width == supportedPreviewSizes.get(i11).width && supportedPreviewSizes.get(i10).height == supportedPreviewSizes.get(i11).height) {
                    z10 = true;
                }
            }
        }
        bn.a$24662222((Enum) ((Class) bp.a(26 - (ViewConfiguration.getWindowTouchSlop() >> 8), ViewConfiguration.getTouchSlop() >> 8, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getField("c").get(null), supportedPreviewSizes.size() < 2 || z10);
        Collections.sort(supportedPreviewSizes, new u0());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(supportedPreviewSizes.get(0).width);
        sb3.append("x");
        sb3.append(supportedPreviewSizes.get(0).height);
        ag.f40231a = sb3.toString();
        l.c(supportedPreviewSizes);
        for (int i12 = 0; i12 < 5; i12++) {
            float f6 = fArr[i12];
            for (Camera.Size size : supportedPreviewSizes) {
                float f10 = size.width;
                float f11 = f10 / size.height;
                if (f11 >= f6 && f11 <= 1.9f && f10 >= 640.0f && f10 <= 1920.0f) {
                    arrayList.add(size);
                }
            }
            if (arrayList.size() > 0) {
                break;
            }
        }
        Camera.Size size2 = (Camera.Size) arrayList.get(0);
        List<Camera.Size> supportedVideoSizes = camera.getParameters().getSupportedVideoSizes();
        if (supportedVideoSizes != null && !supportedVideoSizes.contains(size2)) {
            l.f42227c = true;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(((Camera.Size) arrayList.get(0)).width);
        sb4.append("x");
        sb4.append(((Camera.Size) arrayList.get(0)).height);
        l.f42228d = sb4.toString();
        return new an(((Camera.Size) arrayList.get(0)).width, ((Camera.Size) arrayList.get(0)).height);
    }

    private static synchronized an N_(Camera camera) throws Exception {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            float f6 = ag.f();
            Collections.sort(supportedPreviewSizes, new v0());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(supportedPreviewSizes.get(0).width);
            sb2.append("x");
            sb2.append(supportedPreviewSizes.get(0).height);
            ag.f40231a = sb2.toString();
            for (Camera.Size size : supportedPreviewSizes) {
                float f10 = size.width;
                if (f10 / size.height == f6 && f10 <= 1920.0f) {
                    arrayList.add(size);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new an(((Camera.Size) arrayList.get(0)).width, ((Camera.Size) arrayList.get(0)).height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int O_(Camera.Size size, Camera.Size size2) {
        return (size2.width * size2.height) - (size.width * size.height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int P_(Camera.Size size, Camera.Size size2) {
        return (size2.width * size2.height) - (size.width * size.height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int Q_(Camera.Size size, Camera.Size size2) {
        return (size2.width * size2.height) - (size.width * size.height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R_(boolean z10, Camera camera) throws Throwable {
        this.f40319w = z10;
        try {
            Object[] objArr = new Object[1];
            K(new int[]{62472309, 1196272291, 391067541, -1284278927, 675861992, 1934052901, 1465863320, -2014963410}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            K(new int[]{495332974, -450293190, -2029045105, 122762752}, 7 - ImageFormat.getBitsPerPixel(0), objArr2);
            this.f40322z = ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() / AnimationKt.MillisToNanos;
            r();
            if (p()) {
                s();
            }
            if (this.f40321y && z10) {
                ch.l(true);
                this.f40321y = false;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S_(boolean z10, Camera camera) throws Throwable {
        this.f40319w = !z10;
        this.f40310n = z10;
        try {
            Object[] objArr = new Object[1];
            K(new int[]{62472309, 1196272291, 391067541, -1284278927, 675861992, 1934052901, 1465863320, -2014963410}, MotionEvent.axisFromString("") + 17, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            K(new int[]{495332974, -450293190, -2029045105, 122762752}, TextUtils.lastIndexOf("", '0', 0) + 9, objArr2);
            this.f40322z = ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() / AnimationKt.MillisToNanos;
            boolean z11 = this.f40319w;
            if (this.f40321y && z11) {
                ch.l(true);
                this.f40321y = false;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T_(Rect rect) throws Throwable {
        try {
            r();
            H_(rect);
        } catch (Exception unused) {
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U_(ViewGroup viewGroup) throws Throwable {
        if (o() > 0) {
            return;
        }
        G_(viewGroup);
    }

    public static al a(Activity activity, boolean z10) {
        al alVar = new al(activity, z10);
        alVar.f40315s.getHolder().addCallback(alVar);
        alVar.f40318v = true;
        return alVar;
    }

    public static void init$0() {
        $$a = new byte[]{2, MessageUtils.MESSAGE_21_NAK, -15, 89};
        $$b = 218;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() throws Throwable {
        try {
            q();
        } catch (Exception e5) {
            k.c(e5);
            ay.a(e5.getMessage());
            d(e5.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.C = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        j jVar = this.f40315s;
        an anVar = this.f40309k;
        jVar.setAspectRatio(anVar.f40334c, anVar.f40333a);
    }

    @Override // com.facetec.sdk.ag
    public final void E_(boolean z10, ViewGroup viewGroup) throws Throwable {
        if (z10) {
            this.f40321y = true;
        }
        if (this.C) {
            return;
        }
        if (!this.f40319w) {
            G_(viewGroup);
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new s0(this, viewGroup, 0), o());
    }

    @Override // com.facetec.sdk.ag
    public final void F_(ViewGroup viewGroup) {
        if (this.f40312p.get() == null || this.f40313q == null || !this.f40317u) {
            return;
        }
        this.C = true;
        this.A.removeCallbacksAndMessages(null);
        int i10 = 0;
        this.A.postDelayed(new z0(this, i10), 6000L);
        this.f40311o.post(new a1(this, I_(ag.f40236g, ag.f40237h, viewGroup), i10));
    }

    @Override // com.facetec.sdk.ag
    public final void J_(Camera.PictureCallback pictureCallback) throws Throwable {
        c(false);
        this.f40242l = false;
        this.f40313q.takePicture(null, null, pictureCallback);
    }

    @Override // com.facetec.sdk.ag
    public final void b() throws Throwable {
        if (ag.f40233d) {
            c(true);
            c(false);
        }
    }

    @Override // com.facetec.sdk.ag
    public final void c() {
    }

    @Override // com.facetec.sdk.ag
    public final void d() {
        this.D.set(true);
    }

    @Override // com.facetec.sdk.ag
    public final void e() {
        m();
    }

    public final void i() {
        if (this.f40318v) {
            return;
        }
        this.f40315s.getHolder().addCallback(this);
        this.f40318v = true;
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i10, Camera camera) throws Throwable {
        if (i10 != 100) {
            if (((be) this.f40312p.get()).y() && i10 == 2) {
                return;
            }
            try {
                throw new RuntimeException("Legacy camera error: ".concat(String.valueOf(i10)));
            } catch (Exception e5) {
                k.c(e5);
                d("Legacy camera error with code: ".concat(String.valueOf(i10)));
                return;
            }
        }
        try {
            m();
            q();
        } catch (Exception e7) {
            k.c(e7);
            StringBuilder sb2 = new StringBuilder("Legacy camera error during cleanup and setup camera: ");
            sb2.append(e7.getMessage());
            d(sb2.toString());
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        bj bjVar;
        if (this.f40241j && !ag.f40233d) {
            au.b("CLFFT");
        }
        this.f40240b = true;
        be beVar = (be) this.f40312p.get();
        if (beVar == null || beVar.f40571d == null) {
            return;
        }
        int i10 = 0;
        if (this.D.getAndSet(false)) {
            cx.b(new y0(this, Thread.currentThread().getStackTrace(), i10));
        }
        boolean z10 = ag.f40233d;
        if (z10 && (bjVar = beVar.f40516l) != null && bjVar.f40602k) {
            cc ccVar = beVar.f40571d;
            an anVar = this.f40309k;
            ccVar.a(bArr, anVar.f40333a, anVar.f40334c, this.f40314r, Boolean.FALSE);
        } else {
            if (!z10) {
                cc ccVar2 = beVar.f40571d;
                an anVar2 = this.f40309k;
                ccVar2.a(bArr, anVar2.f40333a, anVar2.f40334c, this.f40314r, Boolean.FALSE);
            }
            this.f40241j = false;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f40316t = surfaceHolder;
        this.f40311o.post(new b1(this, 0));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        m();
        if (surfaceHolder == null || surfaceHolder.getSurface() == null) {
            return;
        }
        surfaceHolder.removeCallback(this);
        surfaceHolder.getSurface().release();
        this.f40318v = false;
    }

    private void d(String str) throws Throwable {
        bh bhVar = this.f40312p.get();
        if (bhVar != null) {
            e eVar = e.CAMERA_LEGACY_ERROR;
            StringBuilder sb2 = new StringBuilder("CameraLegacy error: ");
            sb2.append(str);
            sb2.append(t.c((Activity) bhVar));
            t.c(bhVar, eVar, sb2.toString());
            bhVar.b(str);
        }
    }

    public static synchronized an k() throws Exception {
        an anVarM_;
        Camera cameraL_ = L_(new Camera.CameraInfo());
        anVarM_ = M_(cameraL_);
        cameraL_.stopPreview();
        cameraL_.release();
        return anVarM_;
    }

    public static synchronized an l() throws Exception {
        an anVarN_;
        Camera cameraK_ = K_(new Camera.CameraInfo());
        anVarN_ = N_(cameraK_);
        cameraK_.stopPreview();
        cameraK_.release();
        return anVarN_;
    }

    private synchronized void m() {
        Camera camera = this.f40313q;
        if (camera != null) {
            try {
                try {
                    camera.cancelAutoFocus();
                    c(true);
                    this.f40313q.setPreviewCallback(null);
                    this.f40313q.release();
                } catch (Exception e5) {
                    ay.a(e5.getMessage());
                }
                this.f40313q = null;
            } catch (Throwable th2) {
                this.f40313q = null;
                throw th2;
            }
        }
        Handler handler = this.f40311o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public static void n() {
        I = new int[]{-2023743327, -1040147654, 620207385, -559388241, 473440276, -1705243351, -1492874678, -577894244, -610202872, -754911284, 2134151379, 766519414, -1630622883, -956114794, -1629128457, -1847397038, -777060779, -641985664};
    }

    private long o() throws Throwable {
        if (this.f40322z != -1) {
            try {
                Object[] objArr = new Object[1];
                K(new int[]{62472309, 1196272291, 391067541, -1284278927, 675861992, 1934052901, 1465863320, -2014963410}, 16 - KeyEvent.keyCodeFromString(""), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                K(new int[]{495332974, -450293190, -2029045105, 122762752}, 8 - (Process.myTid() >> 22), objArr2);
                long jLongValue = (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() / AnimationKt.MillisToNanos) - this.f40322z;
                if (jLongValue < 8000) {
                    return 8000 - jLongValue;
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        return 0L;
    }

    private boolean p() {
        String str = this.B;
        return str == "continuous-picture" || str == "continuous-video";
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    private synchronized void q() throws Exception {
        int i10;
        float f6;
        int i11;
        String str;
        Camera.Size next;
        try {
            bh bhVar = this.f40312p.get();
            if (bhVar == null) {
                return;
            }
            int i12 = 0;
            this.f40320x = false;
            this.f40321y = false;
            this.f40310n = false;
            if (this.f40313q != null) {
                return;
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            if (ag.f40233d || bd.f40494c) {
                this.f40313q = K_(cameraInfo);
            } else {
                this.f40313q = L_(cameraInfo);
            }
            this.f40313q.setErrorCallback(this);
            if (ag.f40233d || bd.f40494c) {
                this.f40309k = N_(this.f40313q);
            } else {
                an anVarM_ = M_(this.f40313q);
                this.f40309k = anVarM_;
                if (!F) {
                    an anVar = ag.f40234e;
                    if (anVar.f40334c != anVarM_.f40334c || anVar.f40333a != anVarM_.f40333a) {
                        throw new AssertionError();
                    }
                }
            }
            int rotation = bhVar.getWindowManager().getDefaultDisplay().getRotation();
            if (rotation == 0) {
                i10 = 0;
            } else if (rotation == 1) {
                i10 = 90;
            } else if (rotation == 2) {
                i10 = 180;
            } else if (rotation != 3) {
                i10 = 0;
            } else {
                i10 = 270;
            }
            int i13 = cameraInfo.orientation;
            int i14 = (i13 + i10) % 360;
            this.f40314r = i14;
            ag.f40238i = i14;
            int i15 = (360 - i14) % 360;
            if (ag.f40233d || bd.f40494c) {
                i15 = ((i13 - i10) + 360) % 360;
            }
            this.f40313q.setDisplayOrientation(i15);
            Camera.Parameters parameters = this.f40313q.getParameters();
            if (i15 == 90 || i15 == 270) {
                an anVar2 = this.f40309k;
                f6 = anVar2.f40333a;
                i11 = anVar2.f40334c;
            } else {
                an anVar3 = this.f40309k;
                f6 = anVar3.f40334c;
                i11 = anVar3.f40333a;
            }
            float f10 = f6 / i11;
            if (ag.f40233d && !bd.f40494c && bd.f40495d) {
                List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
                Collections.sort(supportedPictureSizes, new c1());
                Iterator<Camera.Size> it = supportedPictureSizes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = supportedPictureSizes.get(0);
                        break;
                    }
                    next = it.next();
                    float f11 = next.width;
                    if (f11 / next.height == f10 && f11 <= 4096.0f) {
                        break;
                    }
                }
                e eVar = e.ID_SCAN_BACK_CAMERA_TAKEPHOTO_API_RESOLUTION;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(next.width);
                sb2.append("x");
                sb2.append(next.height);
                t.c(bhVar, eVar, sb2.toString());
                parameters.setPictureSize(next.width, next.height);
                ag.f40235f = new an(next.width, next.height);
                if (cameraInfo.canDisableShutterSound) {
                    this.f40313q.enableShutterSound(false);
                }
                parameters.setPictureSize(next.width, next.height);
            }
            an anVar4 = this.f40309k;
            parameters.setPreviewSize(anVar4.f40333a, anVar4.f40334c);
            parameters.setPreviewFormat(17);
            parameters.setAutoExposureLock(false);
            parameters.setAutoWhiteBalanceLock(false);
            List<String> supportedFocusModes = this.f40313q.getParameters().getSupportedFocusModes();
            if (ag.f40233d && supportedFocusModes.contains("continuous-picture")) {
                str = "continuous-picture";
            } else if (supportedFocusModes.contains("continuous-video")) {
                str = "continuous-video";
            } else if (supportedFocusModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            } else {
                str = supportedFocusModes.contains("macro") ? "macro" : null;
            }
            if (str != null) {
                this.B = str;
                parameters.setFocusMode(str);
                if (ag.f40233d && p()) {
                    this.f40313q.setAutoFocusMoveCallback(this.G);
                }
            }
            if (parameters.getMaxNumFocusAreas() > 0) {
                parameters.setFocusAreas(null);
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
                parameters.setMeteringAreas(null);
            }
            bhVar.runOnUiThread(new d1(this, i12));
            an anVar5 = this.f40309k;
            int i16 = anVar5.f40334c;
            int i17 = anVar5.f40333a;
            au.c("CLCPT");
            if (!ag.f40233d) {
                for (String str2 : m) {
                    if (Build.MODEL.contains(str2)) {
                        List<String> supportedColorEffects = parameters.getSupportedColorEffects();
                        if (supportedColorEffects != null && supportedColorEffects.contains("none")) {
                            parameters.setColorEffect("none");
                        }
                        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
                        if (supportedSceneModes != null && supportedSceneModes.contains("steadyphoto")) {
                            parameters.setSceneMode("steadyphoto");
                            break;
                        } else {
                            break;
                            break;
                        }
                    }
                }
            }
            this.f40313q.setParameters(parameters);
            this.f40313q.setPreviewDisplay(this.f40316t);
            c(false);
            this.f40317u = true;
            au.b("CLCPT");
            if (!Build.MANUFACTURER.contains("OnePlus")) {
                this.f40313q.autoFocus(this);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new t0(this, i12), 1000L);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void r() {
        this.f40310n = false;
        Camera camera = this.f40313q;
        if (camera == null) {
            return;
        }
        try {
            camera.cancelAutoFocus();
        } catch (Exception unused) {
        }
    }

    private void s() throws Throwable {
        if (this.f40313q == null || this.B.isEmpty()) {
            return;
        }
        try {
            Camera.Parameters parameters = this.f40313q.getParameters();
            parameters.setFocusMode(this.B);
            if (parameters.getMaxNumFocusAreas() > 0) {
                parameters.setFocusAreas(null);
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
                parameters.setMeteringAreas(null);
            }
            this.f40313q.setParameters(parameters);
            c(false);
        } catch (Exception e5) {
            e5.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() throws Throwable {
        if (this.C) {
            this.f40320x = true;
            return;
        }
        r();
        s();
        this.f40320x = true;
    }

    @Override // com.facetec.sdk.ag
    public final void c(boolean z10) throws Throwable {
        Camera camera = this.f40313q;
        if (camera == null || this.f40317u == (!z10)) {
            return;
        }
        if (z10) {
            camera.stopPreview();
            this.f40317u = false;
            this.f40242l = false;
            return;
        }
        try {
            camera.setPreviewCallback(this);
            this.f40313q.startPreview();
            this.f40317u = true;
            this.f40242l = true;
        } catch (Exception e5) {
            bh bhVar = this.f40312p.get();
            e eVar = e.STARTPREVIEW_EXCEPTION;
            StringBuilder sb2 = new StringBuilder("EXCEPTION: startPreview failed -- ");
            sb2.append(e5.getMessage());
            sb2.append(" ");
            sb2.append(t.c((Activity) this.f40312p.get()));
            t.c(bhVar, eVar, sb2.toString());
        }
    }

    public final boolean h() {
        return this.f40320x;
    }

    @Override // com.facetec.sdk.ag
    public final void b(boolean z10) throws Throwable {
        Camera camera = this.f40313q;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null && supportedFlashModes.size() > 0) {
            if (z10 && supportedFlashModes.contains("torch")) {
                parameters.setFlashMode("torch");
            } else if (!z10 && supportedFlashModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                parameters.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            }
        }
        this.f40313q.setParameters(parameters);
        c(false);
    }

    @Override // com.facetec.sdk.ag
    public final View a() {
        return this.f40315s;
    }

    private static int a(int i10) {
        int iRound = Math.round(150.0f);
        if (Math.abs(i10) + iRound > 1000) {
            return i10 > 0 ? 1000 - iRound : iRound + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        }
        return i10 - iRound;
    }

    private static void c(StackTraceElement[] stackTraceElementArr) {
        int i10 = J;
        boolean z10 = true;
        int i11 = (i10 ^ 79) + ((i10 & 79) << 1);
        int i12 = i11 % 128;
        H = i12;
        int i13 = i11 % 2;
        if (stackTraceElementArr.length < 4) {
            int i14 = (i12 & 25) + (i12 | 25);
            J = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (stackTraceElementArr[3].getClassName().startsWith("android.")) {
            int i15 = J;
            int i16 = (i15 & 59) + (i15 | 59);
            H = i16 % 128;
            int i17 = i16 % 2;
            z10 = false;
        } else {
            int i18 = H;
            int i19 = ((i18 | 39) << 1) - (i18 ^ 39);
            int i20 = i19 % 128;
            J = i20;
            int i21 = i19 % 2;
            int i22 = i20 + 123;
            H = i22 % 128;
            int i23 = i22 % 2;
        }
        bn.a$24662222((Enum) ((Class) bp.a(26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.resolveSize(0, 0), (char) Color.red(0))).getField("a").get(null), z10);
        int i24 = J + 43;
        H = i24 % 128;
        if (i24 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(StackTraceElement[] stackTraceElementArr) {
        c(stackTraceElementArr);
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z10, Camera camera) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }
}
