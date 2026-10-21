package com.facetec.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.text.TextUtils;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.bbva.plugin.media.capture.util.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@TargetApi(21)
final class ai extends ag {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final /* synthetic */ boolean f40254x = true;
    private int C;
    private Handler D;
    private final TextureView.SurfaceTextureListener E;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final g f40255k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final an f40256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final WeakReference<bh> f40257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    CameraDevice f40258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    CameraCaptureSession f40259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    dp f40260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    CaptureRequest.Builder f40261s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f40264w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CameraCharacteristics f40265y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private HandlerThread f40266z;
    static final String[] m = {"Surface Duo 2", "2203129G"};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static Surface f40253v = null;
    private static Boolean F = null;
    private static Boolean I = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final dp.b f40263u = new dp.b() { // from class: com.facetec.sdk.r0
        @Override // com.facetec.sdk.dp.b
        public final void onImageAvailable(byte[] bArr, Size size) {
            this.f42801a.r_(bArr, size);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Semaphore f40262t = new Semaphore(1);
    private boolean B = false;
    private boolean A = false;
    private final CameraDevice.StateCallback H = new CameraDevice.StateCallback() { // from class: com.facetec.sdk.ai.1
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            ai.this.x_(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull CameraDevice cameraDevice, int i10) throws Throwable {
            ai aiVar = ai.this;
            aiVar.x_(cameraDevice);
            bh bhVar = aiVar.f40257o.get();
            if (bhVar != null) {
                bhVar.b("Camera2 device error: ".concat(String.valueOf(i10)));
                e eVar = e.CAMERA2_ERROR;
                StringBuilder sb2 = new StringBuilder("Camera2 device error: ");
                sb2.append(i10);
                sb2.append(t.c((Activity) bhVar));
                t.c(bhVar, eVar, sb2.toString());
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull CameraDevice cameraDevice) {
            au.b("CTOT");
            final ai aiVar = ai.this;
            au.c("CTCPT");
            aiVar.f40258p = cameraDevice;
            try {
                try {
                    if (aiVar.f40260r != null) {
                        SurfaceTexture surfaceTexture = aiVar.f40255k.getSurfaceTexture();
                        if (!ai.f40254x && surfaceTexture == null) {
                            throw new AssertionError();
                        }
                        an anVar = aiVar.f40256n;
                        surfaceTexture.setDefaultBufferSize(anVar.f40333a, anVar.f40334c);
                        Surface surface = new Surface(surfaceTexture);
                        Surface surfaceCa_ = aiVar.f40260r.ca_();
                        CaptureRequest.Builder builderCreateCaptureRequest = aiVar.f40258p.createCaptureRequest(1);
                        aiVar.f40261s = builderCreateCaptureRequest;
                        builderCreateCaptureRequest.addTarget(surface);
                        aiVar.f40261s.addTarget(surfaceCa_);
                        Surface surface2 = ai.f40253v;
                        if (surface2 != null) {
                            aiVar.f40261s.addTarget(surface2);
                        }
                        aiVar.f40261s.set(CaptureRequest.CONTROL_MODE, 1);
                        if (aiVar.y_(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES, 11)) {
                            aiVar.f40261s.set(CaptureRequest.CONTROL_SCENE_MODE, 11);
                        }
                        CaptureRequest.Builder builder = aiVar.f40261s;
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AWB_LOCK;
                        Boolean bool = Boolean.FALSE;
                        builder.set(key, bool);
                        aiVar.f40261s.set(CaptureRequest.CONTROL_AE_LOCK, bool);
                        aiVar.f40261s.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                        boolean z10 = false;
                        for (String str : ai.m) {
                            if (Build.MODEL.contains(str)) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            CaptureRequest.Builder builder2 = aiVar.f40261s;
                            CaptureRequest.Key key2 = CaptureRequest.EDGE_MODE;
                            if (builder2.get(key2) != null) {
                                aiVar.f40261s.set(key2, 0);
                            }
                            CaptureRequest.Builder builder3 = aiVar.f40261s;
                            CaptureRequest.Key key3 = CaptureRequest.NOISE_REDUCTION_MODE;
                            if (builder3.get(key3) != null) {
                                aiVar.f40261s.set(key3, 0);
                            }
                        }
                        if (ag.b.e(ag.b.f40247b)) {
                            CaptureRequest.Builder builder4 = aiVar.f40261s;
                            CaptureRequest.Key key4 = CaptureRequest.CONTROL_CAPTURE_INTENT;
                            if (builder4.get(key4) != null) {
                                aiVar.f40261s.set(key4, 4);
                            }
                            CaptureRequest.Builder builder5 = aiVar.f40261s;
                            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AWB_MODE;
                            if (builder5.get(key5) != null) {
                                aiVar.f40261s.set(key5, 0);
                            }
                        }
                        au.c("CTCCST");
                        Surface surface3 = ai.f40253v;
                        aiVar.f40258p.createCaptureSession(surface3 == null ? Arrays.asList(surface, surfaceCa_) : Arrays.asList(surface, surfaceCa_, surface3), new CameraCaptureSession.StateCallback() { // from class: com.facetec.sdk.ai.2
                            /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                            public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                                au.b("CTCCST");
                                ai aiVar2 = ai.this;
                                boolean zTryAcquire = false;
                                try {
                                    try {
                                        zTryAcquire = aiVar2.f40262t.tryAcquire(2L, TimeUnit.SECONDS);
                                        if (aiVar2.f40258p == null) {
                                            if (zTryAcquire) {
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        aiVar2.f40259q = cameraCaptureSession;
                                        if (bd.f40494c) {
                                            if (aiVar2.y_(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, 3)) {
                                                aiVar2.f40261s.set(CaptureRequest.CONTROL_AF_MODE, 3);
                                            }
                                        } else if (aiVar2.y_(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, 4)) {
                                            aiVar2.f40261s.set(CaptureRequest.CONTROL_AF_MODE, 4);
                                        }
                                        if (aiVar2.y_(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, 1)) {
                                            aiVar2.f40261s.set(CaptureRequest.CONTROL_AE_MODE, 1);
                                        }
                                        au.c("CTPRT");
                                        aiVar2.f40259q.setRepeatingRequest(aiVar2.f40261s.build(), null, null);
                                        au.b("CTPRT");
                                    } finally {
                                        if (0 != 0) {
                                            aiVar2.f40262t.release();
                                        }
                                    }
                                } catch (CameraAccessException e5) {
                                    e = e5;
                                    k.c(e);
                                    if (!zTryAcquire) {
                                    }
                                } catch (InterruptedException e7) {
                                    e = e7;
                                    k.c(e);
                                    if (!zTryAcquire) {
                                    }
                                }
                            }

                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                            public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                            }
                        }, null);
                    }
                } catch (CameraAccessException e5) {
                    k.c(e5);
                } catch (IllegalStateException unused) {
                    if (aiVar.f40257o.get() != null) {
                        bh bhVar = aiVar.f40257o.get();
                        e eVar = e.CAMERA_ALREADY_CLOSED;
                        bhVar.b(eVar.toString());
                        t.c(aiVar.f40257o.get(), eVar, t.c((Activity) aiVar.f40257o.get()));
                    }
                }
                aiVar.f40262t.release();
                au.b("CTCPT");
            } catch (Throwable th2) {
                aiVar.f40262t.release();
                throw th2;
            }
        }
    };

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        StreamConfigurationMap f40270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f40271b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f40272d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CameraCharacteristics f40273e;
    }

    public ai(Activity activity) throws am {
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.facetec.sdk.ai.5
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws Throwable {
                ai.this.c(i10, i11);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                try {
                    ai.this.h();
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
                ai.this.e(i10, i11);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.E = surfaceTextureListener;
        this.f40257o = new WeakReference<>((bh) activity);
        if (bd.f40494c) {
            this.f40256n = ag.j();
        } else {
            this.f40256n = ag.g();
        }
        g gVar = new g(activity);
        this.f40255k = gVar;
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f40266z = handlerThread;
        handlerThread.start();
        this.D = new Handler(this.f40266z.getLooper());
        if (gVar.isAvailable()) {
            c(activity, gVar.getWidth(), gVar.getHeight());
        } else {
            gVar.setSurfaceTextureListener(surfaceTextureListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int A_(Size size, Size size2) {
        return Integer.compare(size.getWidth() * size.getHeight(), size2.getWidth() * size2.getHeight());
    }

    public static an f(Context context) throws am {
        return b(context, g(context));
    }

    private static d g(Context context) throws am {
        return c(context, 0);
    }

    private static d i(Context context) throws am {
        return c(context, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r_(byte[] bArr, Size size) {
        cc ccVar;
        if (this.f40241j) {
            au.b("CTFFT");
        }
        this.f40240b = true;
        be beVar = (be) this.f40257o.get();
        if (beVar == null || (ccVar = beVar.f40571d) == null) {
            return;
        }
        ccVar.a(bArr, size.getWidth(), size.getHeight(), this.C, Boolean.TRUE);
        this.f40241j = false;
    }

    private void v_(Context context, StreamConfigurationMap streamConfigurationMap) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(Allocation.class);
        HashMap map = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < outputSizes.length; i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(outputSizes[i10].getWidth());
            sb2.append("x");
            sb2.append(outputSizes[i10].getHeight());
            String string = sb2.toString();
            Integer num = (Integer) map.get(string);
            int iIntValue = num == null ? 1 : num.intValue() + 1;
            map.put(string, Integer.valueOf(iIntValue));
            if (iIntValue > 2) {
                z10 = true;
            }
        }
        boolean z11 = map.size() < 2 || z10;
        Size size = null;
        bn.a$24662222((Enum) ((Class) bp.a(27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Process.myPid() >> 22, (char) (ImageFormat.getBitsPerPixel(0) + 1))).getField("e").get(null), z11);
        Arrays.sort(outputSizes, new q0());
        Size size2 = new Size(640, 360);
        an anVar = this.f40256n;
        float f6 = anVar.f40333a / anVar.f40334c;
        int height = size2.getHeight() * size2.getWidth();
        int i11 = height << 2;
        for (Size size3 : outputSizes) {
            int width = size3.getWidth() * size3.getHeight();
            if (width >= height && width <= i11) {
                float width2 = size3.getWidth() / size3.getHeight();
                if (width2 <= 3.0f) {
                    if (width2 == f6) {
                        size = size3;
                        break;
                    }
                    size = size3;
                } else {
                    continue;
                }
            }
        }
        if (size != null) {
            size2 = size;
        }
        ag.f40232c = new an(size2.getWidth(), size2.getHeight());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(size2.getWidth());
        sb3.append("x");
        sb3.append(size2.getHeight());
        l.f42228d = sb3.toString();
        try {
            dp dpVar = new dp(context, size2);
            this.f40260r = dpVar;
            if (this.B) {
                dpVar.e(this.f40263u);
            }
        } catch (Throwable th2) {
            k.c(th2);
            ay.a(th2.getMessage());
            throw new RuntimeException(th2);
        }
    }

    private static CameraManager w_(Context context) {
        return (CameraManager) context.getApplicationContext().getSystemService(Constants.CAMERA_SRC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int z_(Size size, Size size2) {
        return (size2.getHeight() * size2.getWidth()) - (size.getHeight() * size.getWidth());
    }

    @Override // com.facetec.sdk.ag
    public final View a() {
        return this.f40255k;
    }

    @Override // com.facetec.sdk.ag
    public final void b(boolean z10) {
    }

    @Override // com.facetec.sdk.ag
    public final void c(boolean z10) {
    }

    @Override // com.facetec.sdk.ag
    public final void d() {
        this.f40260r.f41334c.set(true);
    }

    public final void e(int i10, int i11) {
        bh bhVar = this.f40257o.get();
        if (this.f40255k == null || bhVar == null) {
            return;
        }
        int rotation = bhVar.getWindowManager().getDefaultDisplay().getRotation();
        Matrix matrix = new Matrix();
        float f6 = i10;
        float f10 = i11;
        RectF rectF = new RectF(0.0f, 0.0f, f6, f10);
        an anVar = this.f40256n;
        RectF rectF2 = new RectF(0.0f, 0.0f, anVar.f40334c, anVar.f40333a);
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        if (1 == rotation || 3 == rotation) {
            rectF2.offset(fCenterX - rectF2.centerX(), fCenterY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            an anVar2 = this.f40256n;
            float fMax = Math.max(f10 / anVar2.f40334c, f6 / anVar2.f40333a);
            matrix.postScale(fMax, fMax, fCenterX, fCenterY);
            matrix.postRotate((rotation - 2) * 90, fCenterX, fCenterY);
        } else if (2 == rotation) {
            matrix.postRotate(180.0f, fCenterX, fCenterY);
        }
        this.f40255k.setTransform(matrix);
    }

    public final void x_(@NonNull CameraDevice cameraDevice) {
        this.f40262t.release();
        cameraDevice.close();
        this.f40258p = null;
    }

    public final boolean y_(CameraCharacteristics.Key<int[]> key, int i10) {
        int[] iArr = (int[]) this.f40265y.get(key);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(Activity activity) throws am, CameraAccessException {
        c(activity, i(activity));
    }

    private void c(Activity activity, d dVar) throws am, CameraAccessException {
        if (dVar == null) {
            throw new am(am.e.FRONT_FACING_NOT_FOUND);
        }
        String str = dVar.f40271b;
        CameraCharacteristics cameraCharacteristics = dVar.f40273e;
        StreamConfigurationMap streamConfigurationMap = dVar.f40270a;
        int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.C = iIntValue;
        ag.f40238i = iIntValue;
        activity.getWindowManager().getDefaultDisplay().getSize(new Point());
        activity.getWindowManager().getDefaultDisplay().getRealSize(new Point());
        if (activity.getResources().getConfiguration().orientation == 2) {
            g gVar = this.f40255k;
            an anVar = this.f40256n;
            gVar.setAspectRatio(anVar.f40333a, anVar.f40334c);
        } else {
            g gVar2 = this.f40255k;
            an anVar2 = this.f40256n;
            gVar2.setAspectRatio(anVar2.f40334c, anVar2.f40333a);
        }
        v_(activity, streamConfigurationMap);
        this.f40264w = str;
        this.f40265y = cameraCharacteristics;
    }

    @Override // com.facetec.sdk.ag
    public final void b() {
        if (this.B) {
            return;
        }
        this.B = true;
        dp dpVar = this.f40260r;
        if (dpVar != null) {
            dpVar.e(this.f40263u);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() throws com.facetec.sdk.am {
        /*
            r4 = this;
            java.util.concurrent.Semaphore r0 = r4.f40262t     // Catch: java.lang.InterruptedException -> Lb
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> Lb
            r2 = 10
            boolean r0 = r0.tryAcquire(r2, r1)     // Catch: java.lang.InterruptedException -> Lb
            goto L10
        Lb:
            r0 = move-exception
            com.facetec.sdk.k.c(r0)
            r0 = 0
        L10:
            android.hardware.camera2.CameraCaptureSession r1 = r4.f40259q     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r2 = 0
            if (r1 == 0) goto L1f
            r1.close()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r4.f40259q = r2     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            goto L1f
        L1b:
            r1 = move-exception
            goto L38
        L1d:
            r1 = move-exception
            goto L30
        L1f:
            android.hardware.camera2.CameraDevice r1 = r4.f40258p     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r1 == 0) goto L28
            r1.close()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r4.f40258p = r2     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
        L28:
            if (r0 == 0) goto L2f
            java.util.concurrent.Semaphore r0 = r4.f40262t
            r0.release()
        L2f:
            return
        L30:
            com.facetec.sdk.am r2 = new com.facetec.sdk.am     // Catch: java.lang.Throwable -> L1b
            com.facetec.sdk.am$e r3 = com.facetec.sdk.am.e.CLOSE_ERROR     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1b
            throw r2     // Catch: java.lang.Throwable -> L1b
        L38:
            if (r0 == 0) goto L3f
            java.util.concurrent.Semaphore r0 = r4.f40262t
            r0.release()
        L3f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ai.h():void");
    }

    public static synchronized boolean a(Context context) throws am {
        if (F == null) {
            d dVarG = g(context);
            if (dVarG == null) {
                return false;
            }
            F = Boolean.valueOf(dVarG.f40272d);
        }
        return F.booleanValue();
    }

    private void b(Activity activity) throws am, CameraAccessException {
        c(activity, g(activity));
    }

    private static an b(Context context, d dVar) throws am {
        float[] fArr = {1.7f, 1.6f, 1.5f, 1.4f, 1.3f};
        ArrayList arrayList = new ArrayList();
        if (dVar != null) {
            Size[] outputSizes = dVar.f40270a.getOutputSizes(SurfaceTexture.class);
            if (outputSizes.length != 0) {
                Arrays.sort(outputSizes, new p0());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(outputSizes[0].getWidth());
                sb2.append("x");
                sb2.append(outputSizes[0].getHeight());
                ag.f40231a = sb2.toString();
                l.l_(outputSizes);
                Point point = new Point();
                ay.V_(context).getDefaultDisplay().getRealSize(point);
                for (int i10 = 0; i10 < 5; i10++) {
                    float f6 = fArr[i10];
                    for (Size size : outputSizes) {
                        float width = size.getWidth();
                        float height = size.getHeight();
                        if (width <= 1920.0f && height <= 1080.0f) {
                            float f10 = width / height;
                            if (f10 >= f6 && f10 <= 1.9f && width >= 640.0f && width <= point.y && height <= point.x) {
                                arrayList.add(size);
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        break;
                    }
                }
                if (arrayList.size() > 0) {
                    return new an(((Size) arrayList.get(0)).getWidth(), ((Size) arrayList.get(0)).getHeight());
                }
                return new an(outputSizes[0].getWidth(), outputSizes[0].getHeight());
            }
            throw new am(am.e.NO_OUTPUT_SIZES);
        }
        throw new am(am.e.FRONT_FACING_NOT_FOUND);
    }

    public static an h(Context context) throws am {
        return b(context, i(context));
    }

    @Override // com.facetec.sdk.ag
    public final void e() {
        HandlerThread handlerThread = this.f40266z;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.f40266z.join();
                this.f40266z = null;
                this.D.removeCallbacksAndMessages(null);
                this.D = null;
            } catch (InterruptedException e5) {
                k.c(e5);
            }
        }
        try {
            h();
        } catch (Exception unused) {
        }
        dp dpVar = this.f40260r;
        if (dpVar != null) {
            dpVar.f41333b = null;
            this.f40260r = null;
        }
        this.A = true;
    }

    private static d c(Context context, int i10) throws am {
        StreamConfigurationMap streamConfigurationMap;
        CameraManager cameraManagerW_ = w_(context);
        try {
            String[] cameraIdList = cameraManagerW_.getCameraIdList();
            CameraAccessException e5 = null;
            for (String str : cameraIdList) {
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManagerW_.getCameraCharacteristics(str);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if ((num == null || num.intValue() == i10 || af.d(cameraIdList)) && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
                        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        d dVar = new d();
                        dVar.f40271b = str;
                        dVar.f40273e = cameraCharacteristics;
                        dVar.f40270a = streamConfigurationMap;
                        if (num2.intValue() != 2) {
                            dVar.f40272d = true;
                        }
                        return dVar;
                    }
                } catch (CameraAccessException e7) {
                    e5 = e7;
                    e5.getMessage();
                }
            }
            if (e5 == null) {
                return null;
            }
            throw new am(am.e.ACCESS_ERROR, e5);
        } catch (CameraAccessException e10) {
            throw new am(e10);
        }
    }

    @Override // com.facetec.sdk.ag
    public final void F_(ViewGroup viewGroup) {
    }

    @Override // com.facetec.sdk.ag
    public final void J_(Camera.PictureCallback pictureCallback) {
    }

    public static synchronized boolean c(Context context) throws am {
        if (I == null) {
            d dVarI = i(context);
            if (dVarI == null) {
                return false;
            }
            I = Boolean.valueOf(dVarI.f40272d);
        }
        return I.booleanValue();
    }

    private void c(Activity activity, int i10, int i11) throws am {
        if (this.A) {
            return;
        }
        if (ContextCompat.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
            try {
                if (!bd.f40494c) {
                    b(activity);
                } else {
                    a(activity);
                }
                e(i10, i11);
                CameraManager cameraManagerW_ = w_(activity);
                if (cameraManagerW_ != null) {
                    try {
                        if (this.f40262t.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                            au.c("CTOT");
                            au.c("CTFFT");
                            try {
                                cameraManagerW_.openCamera(this.f40264w, this.H, (Handler) null);
                                return;
                            } catch (Exception e5) {
                                this.f40262t.release();
                                throw new am(am.e.UNKNOWN, e5.getMessage());
                            }
                        }
                        throw new am(am.e.OPEN_TIMEOUT);
                    } catch (InterruptedException e7) {
                        k.c(e7);
                        throw new am(am.e.LOCK_OPEN_TIMEOUT, e7);
                    }
                }
                throw new am(am.e.PERMISSION_DENIED);
            } catch (CameraAccessException e10) {
                throw new am(am.e.UNKNOWN, e10.getMessage());
            }
        }
        throw new am(am.e.PERMISSION_DENIED);
    }

    @Override // com.facetec.sdk.ag
    public final void E_(boolean z10, ViewGroup viewGroup) {
    }

    public final void c(int i10, int i11) throws Throwable {
        bh bhVar = this.f40257o.get();
        if (bhVar == null) {
            return;
        }
        try {
            c(bhVar, i10, i11);
        } catch (Throwable th2) {
            e eVar = e.CAMERA2_ERROR;
            StringBuilder sb2 = new StringBuilder("Camera2 SurfaceTexture error: ");
            sb2.append(th2.getMessage());
            sb2.append(t.c((Activity) bhVar));
            t.d(bhVar, th2, eVar, sb2.toString(), true);
            StringBuilder sb3 = new StringBuilder("Camera 2 SurfaceTexture error: ");
            sb3.append(th2.getMessage());
            bhVar.b(sb3.toString());
        }
    }

    @Override // com.facetec.sdk.ag
    public final void c() {
        CaptureRequest.Builder builderCreateCaptureRequest;
        boolean z10;
        try {
            builderCreateCaptureRequest = this.f40258p.createCaptureRequest(2);
        } catch (Exception e5) {
            bn.c(new Object[]{this.f40257o.get(), ak.f40280ad, e5}, -1113264220, 1113264220, (int) System.currentTimeMillis());
            builderCreateCaptureRequest = null;
        }
        if (builderCreateCaptureRequest != null) {
            try {
                builderCreateCaptureRequest.addTarget(this.f40260r.ca_());
                this.f40259q.capture(builderCreateCaptureRequest.build(), null, this.D);
            } catch (IllegalArgumentException unused) {
                z10 = true;
            } catch (Exception e7) {
                bn.c(new Object[]{this.f40257o.get(), ak.f40282af, e7}, -1113264220, 1113264220, (int) System.currentTimeMillis());
            }
        }
        z10 = false;
        bn.a$24662222((Enum) ((Class) bp.a(View.getDefaultSize(0, 0) + 26, (-1) - TextUtils.lastIndexOf("", '0', 0, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getField("b").get(null), z10);
    }
}
