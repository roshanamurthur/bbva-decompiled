package com.budiyev.android.codescanner;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Process;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes9.dex */
public final class CodeScanner {
    public static final List<BarcodeFormat> ALL_FORMATS;
    public static final int CAMERA_BACK = -1;
    public static final int CAMERA_FRONT = -2;
    public static final List<BarcodeFormat> K;
    public static final ScanMode L;
    public static final AutoFocusMode M;
    public static final List<BarcodeFormat> ONE_DIMENSIONAL_FORMATS;
    public static final List<BarcodeFormat> TWO_DIMENSIONAL_FORMATS;
    public volatile int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f37916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f37917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CodeScannerView f37918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SurfaceHolder f37919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f37920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f37921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f37922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f37923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f37924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f37925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f37926l;
    public final b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile List<BarcodeFormat> f37927n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile ScanMode f37928o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile AutoFocusMode f37929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile DecodeCallback f37930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile ErrorCallback f37931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile pc.b f37932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f37933t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f37934u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f37935v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f37936w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f37937x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile long f37938y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile int f37939z;

    public final class a implements Decoder.StateListener {
        public a() {
        }

        @Override // com.budiyev.android.codescanner.Decoder.StateListener
        public final boolean onStateChanged(@NonNull Decoder.State state) {
            if (state == Decoder.State.DECODED) {
                ScanMode scanMode = CodeScanner.this.f37928o;
                if (scanMode == ScanMode.PREVIEW) {
                    return false;
                }
                if (scanMode == ScanMode.SINGLE) {
                    CodeScanner.this.f37935v = true;
                    CodeScanner codeScanner = CodeScanner.this;
                    codeScanner.f37917c.post(codeScanner.f37925k);
                }
            }
            return true;
        }
    }

    public final class b implements Thread.UncaughtExceptionHandler {
        public b() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
            CodeScanner codeScanner = CodeScanner.this;
            List<BarcodeFormat> list = CodeScanner.ALL_FORMATS;
            codeScanner.b();
            ErrorCallback errorCallback = CodeScanner.this.f37931r;
            if (errorCallback == null) {
                throw new CodeScannerException(th2);
            }
            errorCallback.onError(th2);
        }
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final pc.c f37942p0;

        public c(pc.c cVar) {
            this.f37942p0 = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CodeScanner.this.f37934u) {
                CodeScanner.this.f37918d.setPreviewSize(this.f37942p0);
                CodeScanner codeScanner = CodeScanner.this;
                codeScanner.f37918d.setAutoFocusEnabled(codeScanner.isAutoFocusEnabled());
                CodeScanner codeScanner2 = CodeScanner.this;
                codeScanner2.f37918d.setFlashEnabled(codeScanner2.isFlashEnabled());
                CodeScanner.this.startPreview();
            }
        }
    }

    public final class d extends Thread {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f37944p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f37945q0;

        public d(int i10, int i11) {
            super("cs-init");
            this.f37944p0 = i10;
            this.f37945q0 = i11;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0164  */
        /* JADX WARN: Code duplicated, block: B:102:0x0167  */
        /* JADX WARN: Code duplicated, block: B:109:0x018d  */
        /* JADX WARN: Code duplicated, block: B:114:0x0196  */
        /* JADX WARN: Code duplicated, block: B:116:0x0199  */
        /* JADX WARN: Code duplicated, block: B:117:0x019b  */
        /* JADX WARN: Code duplicated, block: B:120:0x019f  */
        /* JADX WARN: Code duplicated, block: B:127:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:129:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:145:0x01fa  */
        /* JADX WARN: Code duplicated, block: B:166:0x0270 A[Catch: all -> 0x028f, TryCatch #0 {, blocks: (B:164:0x0246, B:166:0x0270, B:167:0x027f, B:172:0x0291, B:173:0x0298), top: B:184:0x0246 }] */
        /* JADX WARN: Code duplicated, block: B:172:0x0291 A[Catch: all -> 0x028f, TRY_ENTER, TryCatch #0 {, blocks: (B:164:0x0246, B:166:0x0270, B:167:0x027f, B:172:0x0291, B:173:0x0298), top: B:184:0x0246 }] */
        /* JADX WARN: Code duplicated, block: B:176:0x029b  */
        /* JADX WARN: Code duplicated, block: B:184:0x0246 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x010b  */
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Camera cameraOpen;
            Camera camera;
            int i10;
            Camera.Size previewSize;
            pc.c cVar;
            pc.c cVar2;
            pc.c cVar3;
            List<String> supportedFocusModes;
            boolean z10;
            pc.c cVar4;
            List<String> supportedFlashModes;
            boolean z11;
            int i11;
            List<int[]> supportedPreviewFpsRange;
            Decoder decoder;
            pc.c cVar5;
            List<String> supportedSceneModes;
            int i12;
            int i13;
            pc.d frameRect;
            boolean z12;
            int i14;
            Process.setThreadPriority(10);
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i15 = CodeScanner.this.f37939z;
            if (i15 == -1 || i15 == -2) {
                int numberOfCameras = Camera.getNumberOfCameras();
                int i16 = i15 == -1 ? 0 : 1;
                int i17 = 0;
                while (true) {
                    if (i17 >= numberOfCameras) {
                        cameraOpen = null;
                        break;
                    }
                    Camera.getCameraInfo(i17, cameraInfo);
                    if (cameraInfo.facing == i16) {
                        cameraOpen = Camera.open(i17);
                        CodeScanner.this.f37939z = i17;
                        break;
                    }
                    i17++;
                }
                camera = cameraOpen;
            } else {
                Camera cameraOpen2 = Camera.open(i15);
                Camera.getCameraInfo(i15, cameraInfo);
                camera = cameraOpen2;
            }
            if (camera == null) {
                throw new CodeScannerException("Unable to access camera");
            }
            Camera.Parameters parameters = camera.getParameters();
            if (parameters == null) {
                throw new CodeScannerException("Unable to configure camera");
            }
            WindowManager windowManager = (WindowManager) CodeScanner.this.f37916b.getSystemService("window");
            if (windowManager == null) {
                throw new CodeScannerException("Unable to access window manager");
            }
            int rotation = windowManager.getDefaultDisplay().getRotation();
            if (rotation == 0) {
                i10 = 0;
            } else if (rotation == 1) {
                i10 = 90;
            } else if (rotation == 2) {
                i10 = 180;
            } else if (rotation == 3) {
                i10 = 270;
            } else {
                if (rotation % 90 != 0) {
                    throw new CodeScannerException("Invalid display rotation");
                }
                i10 = (rotation + 360) % 360;
            }
            int iA = androidx.activity.a.a(cameraInfo.facing != 1 ? 360 : 180, cameraInfo.orientation, i10, 360);
            boolean z13 = iA == 90 || iA == 270;
            int i18 = z13 ? this.f37945q0 : this.f37944p0;
            int i19 = z13 ? this.f37944p0 : this.f37945q0;
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            if (supportedPreviewSizes == null || supportedPreviewSizes.isEmpty()) {
                previewSize = parameters.getPreviewSize();
                if (previewSize != null) {
                    throw new CodeScannerException("Unable to configure camera preview size");
                }
                cVar = new pc.c(previewSize.width, previewSize.height);
            } else {
                Collections.sort(supportedPreviewSizes, new Utils.a());
                float f6 = i18 / i19;
                float f10 = 0.3f;
                while (true) {
                    if (f10 <= 3.0f) {
                        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Camera.Size next = it.next();
                                int i20 = next.width;
                                int i21 = next.height;
                                if (i20 * i21 >= 589824 && Math.abs(f6 - (i20 / i21)) <= f10) {
                                    cVar = new pc.c(i20, i21);
                                }
                            } else {
                                f10 += 0.1f;
                            }
                        }
                    } else {
                        previewSize = parameters.getPreviewSize();
                        if (previewSize != null) {
                            throw new CodeScannerException("Unable to configure camera preview size");
                        }
                        cVar = new pc.c(previewSize.width, previewSize.height);
                    }
                }
            }
            int i22 = cVar.f92618a;
            int i23 = cVar.f92619b;
            parameters.setPreviewSize(i22, i23);
            parameters.setPreviewFormat(17);
            int i24 = z13 ? i23 : i22;
            int i25 = z13 ? i22 : i23;
            int i26 = this.f37944p0;
            int i27 = this.f37945q0;
            if (i24 != i26 || i25 != i27) {
                int i28 = (i24 * i27) / i25;
                if (i28 < i26) {
                    cVar3 = new pc.c(i26, (i25 * i26) / i24);
                } else {
                    cVar2 = new pc.c(i28, i27);
                }
                supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes == null && (supportedFocusModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) || supportedFocusModes.contains("continuous-picture"))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    CodeScanner.this.f37936w = false;
                }
                cVar4 = new pc.c(this.f37944p0, this.f37945q0);
                if (z10 && CodeScanner.this.f37936w) {
                    Utils.e(parameters, CodeScanner.this.f37929p);
                    frameRect = CodeScanner.this.f37918d.getFrameRect();
                    if (frameRect != null) {
                        if (iA != 90 || iA == 270) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            i14 = i23;
                        } else {
                            i14 = i22;
                        }
                        if (!z12) {
                            i22 = i23;
                        }
                        Utils.a(parameters, Utils.c(i14, i22, frameRect, cVar3, cVar4), i14, i22, iA);
                    }
                }
                supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes == null && supportedFlashModes.contains("torch")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    CodeScanner.this.f37937x = false;
                }
                i11 = CodeScanner.this.A;
                if (i11 != 0 && parameters.isZoomSupported() && parameters.getZoom() != i11) {
                    parameters.setZoom(Math.min(i11, parameters.getMaxZoom()));
                }
                supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                    Collections.sort(supportedPreviewFpsRange, new Utils.b());
                    for (int[] iArr : supportedPreviewFpsRange) {
                        i12 = iArr[0];
                        if (i12 < 10000 && (i13 = iArr[1]) <= 30000) {
                            parameters.setPreviewFpsRange(i12, i13);
                            break;
                        }
                    }
                }
                if (!OptionalModuleUtils.BARCODE.equals(parameters.getSceneMode()) && (supportedSceneModes = parameters.getSupportedSceneModes()) != null && supportedSceneModes.contains(OptionalModuleUtils.BARCODE)) {
                    parameters.setSceneMode(OptionalModuleUtils.BARCODE);
                }
                if (parameters.isVideoStabilizationSupported() && !parameters.getVideoStabilization()) {
                    parameters.setVideoStabilization(true);
                }
                camera.setParameters(parameters);
                camera.setDisplayOrientation(iA);
                synchronized (CodeScanner.this.f37915a) {
                    CodeScanner codeScanner = CodeScanner.this;
                    decoder = new Decoder(codeScanner.f37926l, codeScanner.m, codeScanner.f37927n, CodeScanner.this.f37930q);
                    cVar5 = cVar3;
                    CodeScanner.this.f37932s = new pc.b(camera, cameraInfo, decoder, cVar, cVar3, cVar4, iA, z10, z11);
                    if (decoder.f37973h == Decoder.State.INITIALIZED) {
                        throw new IllegalStateException("Illegal decoder state");
                    }
                    decoder.f37967b.start();
                    CodeScanner.this.f37933t = false;
                    CodeScanner.this.f37934u = true;
                }
                CodeScanner codeScanner2 = CodeScanner.this;
                codeScanner2.f37917c.post(codeScanner2.new c(cVar5));
            }
            cVar2 = new pc.c(i26, i27);
            cVar3 = cVar2;
            supportedFocusModes = parameters.getSupportedFocusModes();
            if (supportedFocusModes == null) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (!z10) {
                CodeScanner.this.f37936w = false;
            }
            cVar4 = new pc.c(this.f37944p0, this.f37945q0);
            if (z10) {
                Utils.e(parameters, CodeScanner.this.f37929p);
                frameRect = CodeScanner.this.f37918d.getFrameRect();
                if (frameRect != null) {
                    if (iA != 90) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        i14 = i23;
                    } else {
                        i14 = i22;
                    }
                    if (!z12) {
                        i22 = i23;
                    }
                    Utils.a(parameters, Utils.c(i14, i22, frameRect, cVar3, cVar4), i14, i22, iA);
                }
            }
            supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes == null) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (!z11) {
                CodeScanner.this.f37937x = false;
            }
            i11 = CodeScanner.this.A;
            if (i11 != 0) {
                parameters.setZoom(Math.min(i11, parameters.getMaxZoom()));
            }
            supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            if (supportedPreviewFpsRange != null) {
                Collections.sort(supportedPreviewFpsRange, new Utils.b());
                while (r2.hasNext()) {
                    i12 = iArr[0];
                    if (i12 < 10000) {
                    }
                }
            }
            if (!OptionalModuleUtils.BARCODE.equals(parameters.getSceneMode())) {
                parameters.setSceneMode(OptionalModuleUtils.BARCODE);
            }
            if (parameters.isVideoStabilizationSupported()) {
                parameters.setVideoStabilization(true);
            }
            camera.setParameters(parameters);
            camera.setDisplayOrientation(iA);
            synchronized (CodeScanner.this.f37915a) {
                CodeScanner codeScanner3 = CodeScanner.this;
                decoder = new Decoder(codeScanner3.f37926l, codeScanner3.m, codeScanner3.f37927n, CodeScanner.this.f37930q);
                cVar5 = cVar3;
                CodeScanner.this.f37932s = new pc.b(camera, cameraInfo, decoder, cVar, cVar3, cVar4, iA, z10, z11);
                if (decoder.f37973h == Decoder.State.INITIALIZED) {
                    throw new IllegalStateException("Illegal decoder state");
                }
                decoder.f37967b.start();
                CodeScanner.this.f37933t = false;
                CodeScanner.this.f37934u = true;
                CodeScanner codeScanner4 = CodeScanner.this;
                codeScanner4.f37917c.post(codeScanner4.new c(cVar5));
            }
        }
    }

    public final class e implements Camera.PreviewCallback {
        public e() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            pc.b bVar;
            pc.d frameRect;
            if (!CodeScanner.this.f37934u || CodeScanner.this.f37935v || CodeScanner.this.f37928o == ScanMode.PREVIEW || bArr == null || (bVar = CodeScanner.this.f37932s) == null) {
                return;
            }
            Decoder decoder = bVar.f92610b;
            if (decoder.f37973h == Decoder.State.IDLE && (frameRect = CodeScanner.this.f37918d.getFrameRect()) != null && frameRect.f92622c - frameRect.f92620a >= 1 && frameRect.f92623d - frameRect.f92621b >= 1) {
                pc.a aVar = new pc.a(bArr, bVar.f92611c, bVar.f92612d, bVar.f92613e, frameRect, bVar.f92614f, bVar.f92615g);
                synchronized (decoder.f37970e) {
                    try {
                        if (decoder.f37973h != Decoder.State.STOPPED) {
                            decoder.f37972g = aVar;
                            decoder.f37970e.notify();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public final class f implements Camera.AutoFocusCallback {
        public f() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public final void onAutoFocus(boolean z10, @NonNull Camera camera) {
            CodeScanner.this.E = false;
        }
    }

    public final class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            pc.b bVar;
            int i10;
            CodeScanner codeScanner = CodeScanner.this;
            codeScanner.F = false;
            if (codeScanner.f37929p == AutoFocusMode.SAFE) {
                CodeScanner codeScanner2 = CodeScanner.this;
                if (codeScanner2.f37934u && codeScanner2.D && (bVar = codeScanner2.f37932s) != null && bVar.f92616h && codeScanner2.f37936w) {
                    if (!codeScanner2.E || (i10 = codeScanner2.H) >= 2) {
                        try {
                            Camera camera = bVar.f92609a;
                            camera.cancelAutoFocus();
                            camera.autoFocus(codeScanner2.f37923i);
                            codeScanner2.H = 0;
                            codeScanner2.E = true;
                        } catch (Exception unused) {
                            codeScanner2.E = false;
                        }
                    } else {
                        codeScanner2.H = i10 + 1;
                    }
                    codeScanner2.c();
                }
            }
        }
    }

    public final class h implements CodeScannerView.d {
        public h() {
        }
    }

    public final class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CodeScanner.this.stopPreview();
        }
    }

    public final class j implements SurfaceHolder.Callback {
        public j() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            Surface surface = surfaceHolder.getSurface();
            CodeScanner codeScanner = CodeScanner.this;
            if (surface == null) {
                codeScanner.D = false;
                return;
            }
            if (codeScanner.f37934u && codeScanner.D) {
                codeScanner.g(true);
            }
            if (!codeScanner.f37934u || codeScanner.D) {
                return;
            }
            codeScanner.f(true);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            CodeScanner codeScanner = CodeScanner.this;
            if (!codeScanner.f37934u || codeScanner.D) {
                return;
            }
            codeScanner.f(true);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CodeScanner codeScanner = CodeScanner.this;
            if (codeScanner.f37934u && codeScanner.D) {
                codeScanner.g(true);
            }
        }
    }

    public final class k implements Camera.AutoFocusCallback {
        public k() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public final void onAutoFocus(boolean z10, @NonNull Camera camera) {
            CodeScanner.this.C = false;
        }
    }

    static {
        List<BarcodeFormat> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(BarcodeFormat.values()));
        ALL_FORMATS = listUnmodifiableList;
        ONE_DIMENSIONAL_FORMATS = Collections.unmodifiableList(Arrays.asList(BarcodeFormat.CODABAR, BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.EAN_8, BarcodeFormat.EAN_13, BarcodeFormat.ITF, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED, BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.UPC_EAN_EXTENSION));
        TWO_DIMENSIONAL_FORMATS = Collections.unmodifiableList(Arrays.asList(BarcodeFormat.AZTEC, BarcodeFormat.DATA_MATRIX, BarcodeFormat.MAXICODE, BarcodeFormat.PDF_417, BarcodeFormat.QR_CODE));
        K = listUnmodifiableList;
        L = ScanMode.SINGLE;
        M = AutoFocusMode.SAFE;
    }

    @MainThread
    public CodeScanner(@NonNull Context context, @NonNull CodeScannerView codeScannerView) {
        this.f37915a = new Object();
        this.f37927n = K;
        this.f37928o = L;
        this.f37929p = M;
        this.f37930q = null;
        this.f37931r = null;
        this.f37932s = null;
        this.f37933t = false;
        this.f37934u = false;
        this.f37935v = false;
        this.f37936w = true;
        this.f37937x = false;
        this.f37938y = 2000L;
        this.f37939z = -1;
        this.A = 0;
        this.B = true;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.f37916b = context;
        this.f37918d = codeScannerView;
        this.f37919e = codeScannerView.getPreviewView().getHolder();
        this.f37917c = new Handler();
        this.f37920f = new j();
        this.f37921g = new e();
        this.f37922h = new k();
        this.f37923i = new f();
        this.f37924j = new g();
        this.f37925k = new i();
        this.f37926l = new a();
        this.m = new b();
        codeScannerView.setCodeScanner(this);
        codeScannerView.setSizeListener(new h());
    }

    public final void a(int i10, int i11) {
        this.I = i10;
        this.J = i11;
        if (i10 <= 0 || i11 <= 0) {
            this.G = true;
            return;
        }
        this.f37933t = true;
        this.G = false;
        d dVar = new d(i10, i11);
        dVar.setUncaughtExceptionHandler(this.m);
        dVar.start();
    }

    public final void b() {
        this.f37934u = false;
        this.f37933t = false;
        this.f37935v = false;
        this.D = false;
        this.E = false;
        pc.b bVar = this.f37932s;
        if (bVar != null) {
            this.f37932s = null;
            bVar.f92609a.release();
            Decoder decoder = bVar.f92610b;
            decoder.f37967b.interrupt();
            decoder.f37972g = null;
        }
    }

    public final void c() {
        if (this.F) {
            return;
        }
        this.F = true;
        this.f37917c.postDelayed(this.f37924j, this.f37938y);
    }

    public final void d(boolean z10) {
        pc.d frameRect;
        try {
            pc.b bVar = this.f37932s;
            if (bVar != null) {
                Camera camera = bVar.f92609a;
                camera.cancelAutoFocus();
                this.C = false;
                Camera.Parameters parameters = camera.getParameters();
                AutoFocusMode autoFocusMode = this.f37929p;
                if (z10) {
                    Utils.e(parameters, autoFocusMode);
                } else {
                    List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                    if (supportedFocusModes != null && !supportedFocusModes.isEmpty()) {
                        String focusMode = parameters.getFocusMode();
                        if (supportedFocusModes.contains("fixed")) {
                            if (!"fixed".equals(focusMode)) {
                                parameters.setFocusMode("fixed");
                            }
                        } else if (supportedFocusModes.contains(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) && !DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(focusMode)) {
                            parameters.setFocusMode(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                        }
                    }
                }
                if (z10 && (frameRect = this.f37918d.getFrameRect()) != null) {
                    pc.c cVar = bVar.f92611c;
                    int i10 = cVar.f92618a;
                    int i11 = bVar.f92614f;
                    boolean z11 = i11 == 90 || i11 == 270;
                    int i12 = cVar.f92619b;
                    int i13 = z11 ? i12 : i10;
                    if (!z11) {
                        i10 = i12;
                    }
                    Utils.a(parameters, Utils.c(i13, i10, frameRect, bVar.f92612d, bVar.f92613e), i13, i10, i11);
                }
                camera.setParameters(parameters);
                if (z10) {
                    this.H = 0;
                    this.E = false;
                    if (autoFocusMode == AutoFocusMode.SAFE) {
                        c();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void e(boolean z10) {
        Camera camera;
        Camera.Parameters parameters;
        try {
            pc.b bVar = this.f37932s;
            if (bVar == null || (parameters = (camera = bVar.f92609a).getParameters()) == null) {
                return;
            }
            if (z10) {
                Utils.f(parameters, "torch");
            } else {
                Utils.f(parameters, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            }
            camera.setParameters(parameters);
        } catch (Exception unused) {
        }
    }

    public final void f(boolean z10) {
        try {
            pc.b bVar = this.f37932s;
            if (bVar != null) {
                Camera camera = bVar.f92609a;
                camera.setPreviewCallback(this.f37921g);
                camera.setPreviewDisplay(this.f37919e);
                boolean z11 = true;
                if (!z10 && bVar.f92617i && this.f37937x) {
                    e(true);
                }
                camera.startPreview();
                this.f37935v = false;
                this.D = true;
                this.E = false;
                this.H = 0;
                if (bVar.f92616h && this.f37936w) {
                    pc.d frameRect = this.f37918d.getFrameRect();
                    if (frameRect != null) {
                        Camera.Parameters parameters = camera.getParameters();
                        pc.c cVar = bVar.f92611c;
                        int i10 = cVar.f92618a;
                        int i11 = bVar.f92614f;
                        if (i11 != 90 && i11 != 270) {
                            z11 = false;
                        }
                        int i12 = cVar.f92619b;
                        int i13 = z11 ? i12 : i10;
                        if (!z11) {
                            i10 = i12;
                        }
                        Utils.a(parameters, Utils.c(i13, i10, frameRect, bVar.f92612d, bVar.f92613e), i13, i10, i11);
                        camera.setParameters(parameters);
                    }
                    if (this.f37929p == AutoFocusMode.SAFE) {
                        c();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void g(boolean z10) {
        try {
            pc.b bVar = this.f37932s;
            if (bVar != null) {
                Camera camera = bVar.f92609a;
                camera.cancelAutoFocus();
                Camera.Parameters parameters = camera.getParameters();
                if (!z10 && bVar.f92617i && this.f37937x) {
                    Utils.f(parameters, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
                }
                camera.setParameters(parameters);
                camera.setPreviewCallback(null);
                camera.stopPreview();
            }
        } catch (Exception unused) {
        }
        this.f37935v = false;
        this.D = false;
        this.E = false;
        this.H = 0;
    }

    @NonNull
    public AutoFocusMode getAutoFocusMode() {
        return this.f37929p;
    }

    public int getCamera() {
        return this.f37939z;
    }

    @Nullable
    public DecodeCallback getDecodeCallback() {
        return this.f37930q;
    }

    @Nullable
    public ErrorCallback getErrorCallback() {
        return this.f37931r;
    }

    @NonNull
    public List<BarcodeFormat> getFormats() {
        return this.f37927n;
    }

    @NonNull
    public ScanMode getScanMode() {
        return this.f37928o;
    }

    public int getZoom() {
        return this.A;
    }

    public boolean isAutoFocusEnabled() {
        return this.f37936w;
    }

    public boolean isFlashEnabled() {
        return this.f37937x;
    }

    public boolean isPreviewActive() {
        return this.D;
    }

    public boolean isTouchFocusEnabled() {
        return this.B;
    }

    @MainThread
    public void releaseResources() {
        if (this.f37934u) {
            if (this.D) {
                stopPreview();
            }
            b();
        }
    }

    @MainThread
    public void setAutoFocusEnabled(boolean z10) {
        synchronized (this.f37915a) {
            try {
                boolean z11 = this.f37936w != z10;
                this.f37936w = z10;
                this.f37918d.setAutoFocusEnabled(z10);
                pc.b bVar = this.f37932s;
                if (this.f37934u && this.D && z11 && bVar != null && bVar.f92616h) {
                    d(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setAutoFocusInterval(long j10) {
        this.f37938y = j10;
    }

    @MainThread
    public void setAutoFocusMode(@NonNull AutoFocusMode autoFocusMode) {
        synchronized (this.f37915a) {
            try {
                Objects.requireNonNull(autoFocusMode);
                this.f37929p = autoFocusMode;
                if (this.f37934u && this.f37936w) {
                    d(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @MainThread
    public void setCamera(int i10) {
        synchronized (this.f37915a) {
            try {
                if (this.f37939z != i10) {
                    this.f37939z = i10;
                    if (this.f37934u) {
                        boolean z10 = this.D;
                        releaseResources();
                        if (z10) {
                            CodeScannerView codeScannerView = this.f37918d;
                            a(codeScannerView.getWidth(), codeScannerView.getHeight());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setDecodeCallback(@Nullable DecodeCallback decodeCallback) {
        pc.b bVar;
        synchronized (this.f37915a) {
            try {
                this.f37930q = decodeCallback;
                if (this.f37934u && (bVar = this.f37932s) != null) {
                    bVar.f92610b.f37971f = decodeCallback;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setErrorCallback(@Nullable ErrorCallback errorCallback) {
        this.f37931r = errorCallback;
    }

    @MainThread
    public void setFlashEnabled(boolean z10) {
        synchronized (this.f37915a) {
            try {
                boolean z11 = this.f37937x != z10;
                this.f37937x = z10;
                this.f37918d.setFlashEnabled(z10);
                pc.b bVar = this.f37932s;
                if (this.f37934u && this.D && z11 && bVar != null && bVar.f92617i) {
                    e(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @MainThread
    public void setFormats(@NonNull List<BarcodeFormat> list) {
        pc.b bVar;
        synchronized (this.f37915a) {
            try {
                Objects.requireNonNull(list);
                this.f37927n = list;
                if (this.f37934u && (bVar = this.f37932s) != null) {
                    Decoder decoder = bVar.f92610b;
                    EnumMap enumMap = decoder.f37969d;
                    enumMap.put(DecodeHintType.POSSIBLE_FORMATS, list);
                    decoder.f37966a.setHints(enumMap);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setScanMode(@NonNull ScanMode scanMode) {
        Objects.requireNonNull(scanMode);
        this.f37928o = scanMode;
    }

    public void setTouchFocusEnabled(boolean z10) {
        this.B = z10;
    }

    public void setZoom(int i10) {
        pc.b bVar;
        if (i10 < 0) {
            throw new IllegalArgumentException("Zoom value must be greater than or equal to zero");
        }
        synchronized (this.f37915a) {
            try {
                if (i10 != this.A) {
                    this.A = i10;
                    if (this.f37934u && (bVar = this.f37932s) != null) {
                        Camera camera = bVar.f92609a;
                        Camera.Parameters parameters = camera.getParameters();
                        if (parameters.isZoomSupported() && parameters.getZoom() != i10) {
                            parameters.setZoom(Math.min(i10, parameters.getMaxZoom()));
                        }
                        camera.setParameters(parameters);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.A = i10;
    }

    @MainThread
    public void startPreview() {
        synchronized (this.f37915a) {
            try {
                if (!this.f37934u && !this.f37933t) {
                    CodeScannerView codeScannerView = this.f37918d;
                    a(codeScannerView.getWidth(), codeScannerView.getHeight());
                } else {
                    if (this.D) {
                        return;
                    }
                    this.f37919e.addCallback(this.f37920f);
                    f(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @MainThread
    public void stopPreview() {
        if (this.f37934u && this.D) {
            this.f37919e.removeCallback(this.f37920f);
            g(false);
        }
    }

    @MainThread
    public CodeScanner(@NonNull Context context, @NonNull CodeScannerView codeScannerView, int i10) {
        this(context, codeScannerView);
        this.f37939z = i10;
    }
}
