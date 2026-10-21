package com.veridas.camera.one;

import android.graphics.Bitmap;
import android.graphics.PixelFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.NonNull;
import com.veridas.camera.AbstractCamera;
import com.veridas.camera.BufferCollection;
import com.veridas.camera.CameraAction;
import com.veridas.camera.CameraProperties;
import com.veridas.camera.MediaRecorderAction;
import com.veridas.camera.parameter.ParametersBuilder;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.picture.PictureFactory;
import com.veridas.camera.resolution.Resolution;
import com.veridas.graphics.ImageUtils;
import com.veridas.log.Log;
import com.veridas.thread.QueuedThread;
import com.veridas.thread.QueuedThreadRunnable;
import com.veridas.view.surface.DualExecuteSurfaceTextureListener;
import com.veridas.view.surface.SurfaceHolderAdapter;
import com.veridas.view.surface.SurfaceTextureAdapter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes9.dex */
public final class CameraOneCamera extends AbstractCamera implements Camera.ErrorCallback, Camera.PictureCallback, Camera.PreviewCallback, MediaRecorder.OnErrorListener {
    public final HandlerThread E0;
    public final wi.h G0;
    public final PictureFactory H0;
    public Camera J0;
    public MediaRecorder L0;
    public SurfaceView O0;
    public TextureView Q0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile BufferCollection f66604t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f66605u0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Handler f66608y0;
    public final AtomicBoolean v0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final u f66606w0 = new u();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final CameraOneCamera f66607x0 = this;
    public final Object F0 = new Object();
    public final ReentrantReadWriteLock I0 = new ReentrantReadWriteLock();
    public CameraProperties K0 = null;
    public w M0 = new v(this);
    public Resolution N0 = null;
    public SurfaceHolderAdapter P0 = null;
    public final QueuedThread<Picture> R0 = new QueuedThread<>(new k(), 1, "CameraPreviewThread");
    public final QueuedThread<Picture> S0 = new QueuedThread<>(new n(), 64, "CameraPictureThread");

    public abstract class ProtectedTask implements Runnable {
        public ProtectedTask() {
        }

        public abstract void execute();

        @Override // java.lang.Runnable
        public void run() {
            try {
                execute();
            } catch (RuntimeException e5) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, e5);
                CameraOneCamera.this.fireOnError(com.veridas.camera.Camera.Error.UNKNOWN);
            }
        }
    }

    public class a extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TextureView f66610q0;

        /* JADX INFO: renamed from: com.veridas.camera.one.CameraOneCamera$a$a, reason: collision with other inner class name */
        public class C0274a extends SurfaceTextureAdapter {
            public C0274a() {
            }

            @Override // com.veridas.view.surface.SurfaceTextureAdapter, android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                CameraOneCamera.this.getClass();
                return true;
            }

            @Override // com.veridas.view.surface.SurfaceTextureAdapter, android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
                a aVar = a.this;
                CameraOneCamera cameraOneCamera = CameraOneCamera.this;
                cameraOneCamera.getClass();
                cameraOneCamera.i(new com.veridas.camera.one.c(cameraOneCamera));
                CameraOneCamera cameraOneCamera2 = CameraOneCamera.this;
                cameraOneCamera2.getClass();
                cameraOneCamera2.fireOnPreviewSurfaceChanged(Resolution.create(i10, i11));
            }

            @Override // com.veridas.view.surface.SurfaceTextureAdapter, android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                a aVar = a.this;
                ReentrantReadWriteLock.ReadLock lock = CameraOneCamera.this.I0.readLock();
                lock.lock();
                w wVar = CameraOneCamera.this.M0;
                lock.unlock();
                wVar.a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextureView textureView) {
            super();
            this.f66610q0 = textureView;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            TextureView textureView = this.f66610q0;
            cameraOneCamera.Q0 = textureView;
            C0274a c0274a = new C0274a();
            u uVar = cameraOneCamera.f66606w0;
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            CameraOneCamera cameraOneCamera2 = CameraOneCamera.this;
            try {
                cameraOneCamera2.J0.setPreviewTexture(surfaceTexture);
                cameraOneCamera2.g();
            } catch (IOException e5) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, "Error setting the preview texture.", e5);
            }
            TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
            if (surfaceTextureListener == null || !(surfaceTextureListener instanceof DualExecuteSurfaceTextureListener)) {
                textureView.setSurfaceTextureListener(c0274a);
            } else {
                ((DualExecuteSurfaceTextureListener) surfaceTextureListener).setCameraSurfaceTextureListener(c0274a);
            }
        }
    }

    public class b extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66613q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CameraAction cameraAction) {
            super();
            this.f66613q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            cameraOneCamera.R0.start();
            cameraOneCamera.S0.start();
            u uVar = cameraOneCamera.f66607x0.f66606w0;
            CameraOneCamera cameraOneCamera2 = CameraOneCamera.this;
            cameraOneCamera2.J0.unlock();
            try {
                cameraOneCamera2.J0.reconnect();
            } catch (IOException e5) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, e5);
            }
            uVar.b();
            cameraOneCamera.fireOnStarted();
            CameraAction cameraAction = this.f66613q0;
            if (cameraAction != null) {
                cameraAction.execute(true);
            }
        }
    }

    public class c extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66615q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CameraAction cameraAction) {
            super();
            this.f66615q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            u uVar = cameraOneCamera.f66607x0.f66606w0;
            CameraOneCamera.this.J0.autoFocus(new com.veridas.camera.one.d(uVar, this.f66615q0));
            cameraOneCamera.fireOnFocusStarted();
        }
    }

    public class d extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66617q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CameraAction cameraAction) {
            super();
            this.f66617q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            MediaRecorder mediaRecorder = cameraOneCamera.L0;
            CameraAction cameraAction = this.f66617q0;
            if (mediaRecorder == null) {
                Log.w(com.veridas.camera.Camera.LOG_TAG, "The media recorder instance is null, have you forgotten to initialize it..?");
                if (cameraAction != null) {
                    cameraAction.execute(false);
                    return;
                }
                return;
            }
            ReentrantReadWriteLock.WriteLock writeLock = cameraOneCamera.I0.writeLock();
            writeLock.lock();
            cameraOneCamera.M0 = cameraOneCamera.M0.advance();
            writeLock.unlock();
            try {
                cameraOneCamera.L0.prepare();
                cameraOneCamera.L0.start();
                cameraOneCamera.J0.reconnect();
                cameraOneCamera.g();
                ((AbstractCamera) cameraOneCamera).recording.set(true);
                cameraOneCamera.fireOnMediaRecorderStarted(cameraOneCamera.L0);
                if (cameraAction != null) {
                    cameraAction.execute(true);
                }
            } catch (IOException | IllegalStateException e5) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, e5);
                cameraOneCamera.f66606w0.a();
                cameraOneCamera.fireOnError(com.veridas.camera.Camera.Error.UNKNOWN);
            }
        }
    }

    public class e extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66619q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CameraAction cameraAction) {
            super();
            this.f66619q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera.this.f66607x0.f66606w0.b();
            CameraAction cameraAction = this.f66619q0;
            if (cameraAction != null) {
                cameraAction.execute(true);
            }
        }
    }

    public class f extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66621q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CameraAction cameraAction) {
            super();
            this.f66621q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            cameraOneCamera.R0.stop();
            cameraOneCamera.R0.clear();
            QueuedThread<Picture> queuedThread = cameraOneCamera.S0;
            queuedThread.stop();
            queuedThread.clear();
            u uVar = cameraOneCamera.f66607x0.f66606w0;
            CameraOneCamera cameraOneCamera2 = CameraOneCamera.this;
            ((AbstractCamera) cameraOneCamera2).cameraListenerList.clear();
            uVar.a();
            CameraOneCamera cameraOneCamera3 = CameraOneCamera.this;
            cameraOneCamera3.J0.stopPreview();
            CameraOneCamera.b(cameraOneCamera3, new fa.a(uVar));
            try {
                cameraOneCamera2.J0.setPreviewDisplay(null);
            } catch (Exception e5) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, e5);
            }
            try {
                cameraOneCamera2.J0.setPreviewTexture(null);
            } catch (Exception e7) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, e7);
            }
            cameraOneCamera2.J0.setErrorCallback(null);
            SurfaceView surfaceView = cameraOneCamera2.O0;
            if (surfaceView != null) {
                surfaceView.getHolder().removeCallback(cameraOneCamera2.P0);
                cameraOneCamera2.P0 = null;
            }
            TextureView textureView = cameraOneCamera2.Q0;
            if (textureView != null) {
                TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
                if (surfaceTextureListener == null || !(surfaceTextureListener instanceof DualExecuteSurfaceTextureListener)) {
                    cameraOneCamera2.Q0.setSurfaceTextureListener(null);
                } else {
                    ((DualExecuteSurfaceTextureListener) surfaceTextureListener).setCameraSurfaceTextureListener(null);
                }
            }
            cameraOneCamera2.J0.release();
            cameraOneCamera2.fireOnStopped();
            CameraAction cameraAction = this.f66621q0;
            if (cameraAction != null) {
                cameraAction.execute(true);
            }
            cameraOneCamera.f66608y0.removeCallbacksAndMessages(null);
            cameraOneCamera.E0.quit();
        }
    }

    public class g extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66623q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CameraAction cameraAction) {
            super();
            this.f66623q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera.this.J0.cancelAutoFocus();
            CameraAction cameraAction = this.f66623q0;
            if (cameraAction != null) {
                cameraAction.execute(true);
            }
        }
    }

    public class h extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66625q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(CameraAction cameraAction) {
            super();
            this.f66625q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            MediaRecorder mediaRecorder = cameraOneCamera.L0;
            CameraAction cameraAction = this.f66625q0;
            if (mediaRecorder != null) {
                ReentrantReadWriteLock.WriteLock writeLock = cameraOneCamera.I0.writeLock();
                writeLock.lock();
                cameraOneCamera.M0 = cameraOneCamera.M0.advance();
                writeLock.unlock();
                try {
                    try {
                        cameraOneCamera.L0.stop();
                        cameraOneCamera.fireOnMediaRecorderStopped(cameraOneCamera.L0);
                        cameraOneCamera.f66606w0.a();
                        if (cameraAction != null) {
                            cameraAction.execute(true);
                        }
                    } catch (IllegalStateException e5) {
                        Log.e(com.veridas.camera.Camera.LOG_TAG, e5);
                        cameraOneCamera.fireOnError(com.veridas.camera.Camera.Error.UNKNOWN);
                        cameraOneCamera.f66606w0.a();
                        if (cameraAction != null) {
                            cameraAction.execute(false);
                        }
                    }
                } catch (Throwable th2) {
                    cameraOneCamera.f66606w0.a();
                    if (cameraAction != null) {
                        cameraAction.execute(false);
                    }
                    throw th2;
                }
            } else {
                Log.w(com.veridas.camera.Camera.LOG_TAG, "The media recorder instance is null, have you forgotten to initialize it..?");
                if (cameraAction != null) {
                    cameraAction.execute(false);
                }
            }
            ((AbstractCamera) cameraOneCamera).recording.set(false);
        }
    }

    public class i extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66627q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(CameraAction cameraAction) {
            super();
            this.f66627q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            u uVar = CameraOneCamera.this.f66607x0.f66606w0;
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            cameraOneCamera.J0.stopPreview();
            CameraOneCamera.b(cameraOneCamera, new fa.a(uVar));
            CameraAction cameraAction = this.f66627q0;
            if (cameraAction != null) {
                cameraAction.execute(true);
            }
        }
    }

    public class j extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66629q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(CameraAction cameraAction) {
            super();
            this.f66629q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraAction cameraAction = this.f66629q0;
            try {
                CameraOneCamera cameraOneCamera = CameraOneCamera.this;
                cameraOneCamera.J0.takePicture(null, null, cameraOneCamera.f66607x0);
                if (cameraAction != null) {
                    cameraAction.execute(true);
                }
            } catch (Throwable th2) {
                try {
                    Log.e(com.veridas.camera.Camera.LOG_TAG, th2);
                } finally {
                    if (cameraAction != null) {
                        cameraAction.execute(false);
                    }
                }
            }
        }
    }

    public class k implements QueuedThreadRunnable<Picture> {
        public k() {
        }

        @Override // com.veridas.thread.QueuedThreadRunnable
        public final void run(Picture picture) {
            Picture picture2 = picture;
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            if (!cameraOneCamera.v0.getAndSet(false)) {
                cameraOneCamera.recycle(picture2);
                return;
            }
            try {
                cameraOneCamera.fireOnPreviewReady(picture2);
            } catch (RuntimeException e5) {
                Log.e(k.class.getSimpleName(), e5);
            }
        }
    }

    public class l extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66632q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(CameraAction cameraAction) {
            super();
            this.f66632q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraAction cameraAction = this.f66632q0;
            try {
                CameraOneCamera cameraOneCamera = CameraOneCamera.this;
                cameraOneCamera.J0.takePicture(null, null, cameraOneCamera.f66607x0);
                if (cameraAction != null) {
                    cameraAction.execute(true);
                }
            } catch (Throwable th2) {
                try {
                    Log.e(com.veridas.camera.Camera.LOG_TAG, th2);
                } finally {
                    if (cameraAction != null) {
                        cameraAction.execute(false);
                    }
                }
            }
        }
    }

    public class m extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Picture f66634q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Picture picture) {
            super();
            this.f66634q0 = picture;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            ReentrantReadWriteLock.ReadLock lock = cameraOneCamera.I0.readLock();
            lock.lock();
            cameraOneCamera.M0.recycle(this.f66634q0);
            lock.unlock();
        }
    }

    public class n implements QueuedThreadRunnable<Picture> {
        public n() {
        }

        @Override // com.veridas.thread.QueuedThreadRunnable
        public final void run(Picture picture) {
            try {
                CameraOneCamera.this.fireOnPictureReady(picture);
            } catch (RuntimeException e5) {
                Log.e(n.class.getSimpleName(), e5);
            }
        }
    }

    public class o extends ProtectedTask {
        public o() {
            super();
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            u uVar = CameraOneCamera.this.f66606w0;
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            try {
                cameraOneCamera.J0 = Camera.open(cameraOneCamera.f66605u0);
                CameraOneCamera cameraOneCamera2 = CameraOneCamera.this;
                cameraOneCamera2.J0.unlock();
                try {
                    cameraOneCamera2.J0.reconnect();
                } catch (IOException e5) {
                    Log.e(com.veridas.camera.Camera.LOG_TAG, e5);
                }
                cameraOneCamera.J0.setDisplayOrientation(cameraOneCamera.getSensorRotation());
                Camera.Parameters parameters = cameraOneCamera.J0.getParameters();
                Camera.Size previewSize = parameters.getPreviewSize();
                Camera.Size pictureSize = parameters.getPictureSize();
                String str = com.veridas.camera.Camera.LOG_TAG;
                Log.i(str, "Opened camera with settings:");
                Log.i(str, "Preview size: %dx%d", Integer.valueOf(previewSize.width), Integer.valueOf(previewSize.height));
                Log.i(str, "Picture size: %dx%d", Integer.valueOf(pictureSize.width), Integer.valueOf(pictureSize.height));
                cameraOneCamera.J0.setErrorCallback(cameraOneCamera.f66607x0);
                wi.c cVar = new wi.c(cameraOneCamera.J0);
                synchronized (cameraOneCamera.F0) {
                    cameraOneCamera.K0 = cVar;
                }
            } catch (RuntimeException e7) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, e7);
            }
        }
    }

    public class p extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MediaRecorderAction f66638q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(MediaRecorderAction mediaRecorderAction) {
            super();
            this.f66638q0 = mediaRecorderAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            int pictureRotation = cameraOneCamera.getPictureRotation();
            if (cameraOneCamera.L0 != null) {
                cameraOneCamera.f66607x0.f66606w0.a();
            }
            CameraOneCamera.b(cameraOneCamera, new xd.h(this, pictureRotation, this.f66638q0));
        }
    }

    public class q extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f66640q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i10) {
            super();
            this.f66640q0 = i10;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            int i10;
            int i11;
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            u uVar = cameraOneCamera.f66606w0;
            uVar.getClass();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            CameraOneCamera cameraOneCamera2 = CameraOneCamera.this;
            Camera.getCameraInfo(cameraOneCamera2.f66605u0, cameraInfo);
            int i12 = cameraInfo.orientation;
            boolean zIsFacingFront = cameraOneCamera2.isFacingFront();
            int i13 = this.f66640q0;
            if (zIsFacingFront) {
                i10 = (360 - ((i12 + i13) % 360)) % 360;
                i11 = (360 - i10) % 360;
            } else {
                i10 = ((i12 - i13) + 360) % 360;
                i11 = i10;
            }
            cameraOneCamera2.setPictureRotation(i11);
            cameraOneCamera2.setSensorOrientation(i12);
            cameraOneCamera2.setSensorRotation(i10);
            try {
                cameraOneCamera2.J0.setDisplayOrientation(i10);
                Log.w(com.veridas.camera.Camera.LOG_TAG, "Set sensor rotation to %d", Integer.valueOf(i10));
            } catch (RuntimeException e5) {
                String str = com.veridas.camera.Camera.LOG_TAG;
                Log.w(str, "Unable to set sensor rotation to %d", Integer.valueOf(i10));
                Log.e(str, e5);
            }
            Log.i(com.veridas.camera.Camera.LOG_TAG, "Reoriented camera, device rotation: %d, sensor orientation: %d, picture rotation: %d", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i11));
            cameraOneCamera.fireOnReoriented();
        }
    }

    public class r extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f66642q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(CameraAction cameraAction) {
            super();
            this.f66642q0 = cameraAction;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            u uVar = CameraOneCamera.this.f66607x0.f66606w0;
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            cameraOneCamera.J0.stopPreview();
            CameraOneCamera.b(cameraOneCamera, new fa.a(uVar));
            uVar.b();
            CameraAction cameraAction = this.f66642q0;
            if (cameraAction != null) {
                cameraAction.execute(true);
            }
        }
    }

    public class s extends ProtectedTask {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SurfaceView f66644q0;

        public class a extends SurfaceHolderAdapter {

            /* JADX INFO: renamed from: com.veridas.camera.one.CameraOneCamera$s$a$a, reason: collision with other inner class name */
            public class C0275a extends ProtectedTask {

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ int f66647q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ int f66648r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0275a(int i10, int i11) {
                    super();
                    this.f66647q0 = i10;
                    this.f66648r0 = i11;
                }

                @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
                public final void execute() {
                    a aVar = a.this;
                    CameraOneCamera cameraOneCamera = CameraOneCamera.this;
                    cameraOneCamera.getClass();
                    cameraOneCamera.i(new com.veridas.camera.one.c(cameraOneCamera));
                    CameraOneCamera cameraOneCamera2 = CameraOneCamera.this;
                    cameraOneCamera2.getClass();
                    cameraOneCamera2.fireOnPreviewSurfaceChanged(Resolution.create(this.f66647q0, this.f66648r0));
                }
            }

            public class b extends ProtectedTask {
                public b() {
                    super();
                }

                @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
                public final void execute() {
                    CameraOneCamera.this.getClass();
                }
            }

            public a() {
            }

            @Override // com.veridas.view.surface.SurfaceHolderAdapter, android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
                CameraOneCamera.this.i(new C0275a(i11, i12));
            }

            @Override // com.veridas.view.surface.SurfaceHolderAdapter, android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                CameraOneCamera.this.i(new b());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(SurfaceView surfaceView) {
            super();
            this.f66644q0 = surfaceView;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
        public final void execute() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            SurfaceView surfaceView = this.f66644q0;
            cameraOneCamera.O0 = surfaceView;
            cameraOneCamera.P0 = new a();
            SurfaceHolder holder = surfaceView.getHolder();
            CameraOneCamera cameraOneCamera2 = CameraOneCamera.this;
            try {
                cameraOneCamera2.J0.setPreviewDisplay(holder);
                cameraOneCamera2.g();
            } catch (IOException e5) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, "Error setting surface holder.", e5);
            }
            holder.addCallback(cameraOneCamera.P0);
        }
    }

    public class u {
        public u() {
        }

        public final void a() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            MediaRecorder mediaRecorder = cameraOneCamera.L0;
            if (mediaRecorder != null) {
                mediaRecorder.reset();
                cameraOneCamera.L0.release();
                cameraOneCamera.L0 = null;
            }
        }

        public final void b() {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            cameraOneCamera.h();
            cameraOneCamera.J0.startPreview();
            cameraOneCamera.g();
            cameraOneCamera.fireOnPreviewStarted();
        }
    }

    public class v extends t {

        public class a extends ProtectedTask {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Picture f66654q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Picture picture) {
                super();
                this.f66654q0 = picture;
            }

            @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
            public final void execute() {
                byte[] bArrArray = this.f66654q0.getBuffer().array();
                if (CameraOneCamera.this.f66604t0.contains(bArrArray)) {
                    v.this.f66651a.J0.addCallbackBuffer(bArrArray);
                }
            }
        }

        public v(CameraOneCamera cameraOneCamera) {
            super(cameraOneCamera);
        }

        @Override // com.veridas.camera.one.CameraOneCamera.w
        public w advance() {
            return CameraOneCamera.this.new x(this.f66651a);
        }

        @Override // com.veridas.camera.one.CameraOneCamera.w
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraOneCamera cameraOneCamera = CameraOneCamera.this;
            if (cameraOneCamera.N0 == null) {
                return;
            }
            ByteBuffer byteBuffer = cameraOneCamera.f66604t0.get(bArr);
            if (byteBuffer == null) {
                Log.w(com.veridas.camera.Camera.LOG_TAG, "Skipping frame, buffer not found in collection.");
                return;
            }
            boolean z10 = CameraOneCamera.this.getFacing() == com.veridas.camera.Camera.Facing.FRONT;
            byteBuffer.position(byteBuffer.limit());
            byteBuffer.flip();
            CameraOneCamera cameraOneCamera2 = CameraOneCamera.this;
            Picture pictureCreate = cameraOneCamera2.H0.create(byteBuffer, cameraOneCamera2.N0, cameraOneCamera2.getPictureRotation(), true, z10);
            Picture pictureMakeRoom = CameraOneCamera.this.S0.makeRoom();
            CameraOneCamera.this.R0.push(pictureCreate);
            if (pictureMakeRoom != null) {
                recycle(pictureMakeRoom);
            }
        }

        @Override // com.veridas.camera.one.CameraOneCamera.w
        public void recycle(Picture picture) {
            CameraOneCamera.this.i(new a(picture));
        }
    }

    public interface w {
        void a();

        w advance();

        void onPreviewFrame(byte[] bArr, Camera camera);

        void recycle(Picture picture);
    }

    public class x extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f66656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HandlerThread f66657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Handler f66658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile Bitmap f66659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile ByteBuffer f66660g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile ByteBuffer f66661h;

        public x(CameraOneCamera cameraOneCamera) {
            super(cameraOneCamera);
            this.f66656c = new AtomicBoolean(false);
            this.f66659f = null;
            this.f66660g = null;
            this.f66661h = null;
            HandlerThread handlerThread = new HandlerThread(String.format("CameraSurfaceTexturePreviewThread-%s", CameraOneCamera.this.getId()), 10);
            this.f66657d = handlerThread;
            handlerThread.start();
            this.f66658e = new Handler(handlerThread.getLooper());
        }

        @Override // com.veridas.camera.one.CameraOneCamera.t, com.veridas.camera.one.CameraOneCamera.w
        public final void a() {
            if (this.f66656c.get()) {
                return;
            }
            int iRound = Math.round(500 * Resolution.create(CameraOneCamera.this.Q0.getWidth(), CameraOneCamera.this.Q0.getHeight()).inverseAspectRatio);
            if (iRound % 2 != 0) {
                iRound++;
            }
            if (this.f66659f == null || this.f66659f.getHeight() != iRound) {
                this.f66659f = Bitmap.createBitmap(500, iRound, Bitmap.Config.ARGB_8888);
                this.f66660g = ByteBuffer.allocateDirect(ImageUtils.calculateBufferSizeForRgba(this.f66659f));
                this.f66661h = ByteBuffer.allocateDirect(ImageUtils.calculateBufferSizeForYuv(this.f66659f));
            }
            CameraOneCamera.this.Q0.getBitmap(this.f66659f);
            if (this.f66659f != null) {
                this.f66658e.post(new com.veridas.camera.one.e(this));
            }
        }

        @Override // com.veridas.camera.one.CameraOneCamera.v, com.veridas.camera.one.CameraOneCamera.w
        public final w advance() {
            this.f66658e.removeCallbacksAndMessages(null);
            HandlerThread handlerThread = this.f66657d;
            handlerThread.quit();
            try {
                handlerThread.join(144L);
            } catch (InterruptedException e5) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, e5);
            }
            return CameraOneCamera.this.new v(this.f66651a);
        }

        @Override // com.veridas.camera.one.CameraOneCamera.v, com.veridas.camera.one.CameraOneCamera.w
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            this.f66656c.compareAndSet(false, true);
            super.onPreviewFrame(bArr, camera);
        }

        @Override // com.veridas.camera.one.CameraOneCamera.v, com.veridas.camera.one.CameraOneCamera.w
        public final void recycle(Picture picture) {
            super.recycle(picture);
        }
    }

    public CameraOneCamera(int i10, PictureFactory pictureFactory, wi.h hVar) {
        this.G0 = hVar;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f66605u0 = i10;
        Camera.getCameraInfo(i10, cameraInfo);
        setFacing(cameraInfo.facing == 1 ? com.veridas.camera.Camera.Facing.FRONT : com.veridas.camera.Camera.Facing.BACK);
        this.H0 = pictureFactory;
        HandlerThread handlerThread = new HandlerThread(String.format("CameraThread-%s", getId()), 10);
        this.E0 = handlerThread;
        handlerThread.start();
        this.f66608y0 = new Handler(handlerThread.getLooper());
        i(new o());
        hVar.f94279a = this;
    }

    public static void b(CameraOneCamera cameraOneCamera, CameraAction cameraAction) {
        synchronized (cameraOneCamera) {
            cameraOneCamera.i(new com.veridas.camera.one.b(cameraOneCamera, cameraAction));
        }
    }

    @Override // com.veridas.camera.Camera
    public final ParametersBuilder createParametersBuilder() {
        return this.G0.create();
    }

    public final synchronized void g() {
        try {
            if (getPreviewMode() == com.veridas.camera.Camera.PreviewMode.PUSH) {
                this.J0.setPreviewCallback(null);
                this.J0.setPreviewCallback(this.f66607x0);
            } else {
                this.J0.setPreviewCallbackWithBuffer(null);
                this.J0.setPreviewCallbackWithBuffer(this.f66607x0);
                if (this.f66604t0 == null) {
                    h();
                }
                this.f66604t0.attachBuffers(this.J0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.veridas.camera.Camera
    public final String getId() {
        return "" + this.f66605u0;
    }

    @Override // com.veridas.camera.Camera
    public final CameraProperties getProperties() {
        CameraProperties cameraProperties;
        synchronized (this.F0) {
            cameraProperties = this.K0;
        }
        return cameraProperties;
    }

    public final synchronized void h() {
        try {
            Camera.Parameters parameters = this.J0.getParameters();
            int previewFormat = parameters.getPreviewFormat();
            PixelFormat pixelFormat = new PixelFormat();
            PixelFormat.getPixelFormatInfo(previewFormat, pixelFormat);
            Camera.Size previewSize = parameters.getPreviewSize();
            int i10 = ((previewSize.width * previewSize.height) * pixelFormat.bitsPerPixel) / 8;
            if (this.f66604t0 == null || this.f66604t0.getBufferSize() != i10) {
                this.f66604t0 = new BufferCollection(4, i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i(ProtectedTask protectedTask) {
        long id = Thread.currentThread().getId();
        HandlerThread handlerThread = this.E0;
        if (id == handlerThread.getId()) {
            protectedTask.run();
        } else if (handlerThread.isAlive()) {
            this.f66608y0.post(protectedTask);
        } else {
            Log.w(com.veridas.camera.Camera.LOG_TAG, "Could not execute runnable, handler thread has died.");
        }
    }

    @Override // com.veridas.camera.Camera
    public final void initializeMediaRecorder() {
        initializeMediaRecorder(null);
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i10, Camera camera) {
        com.veridas.camera.Camera.Error error = com.veridas.camera.Camera.Error.UNKNOWN;
        if (i10 == 1) {
            Log.e(com.veridas.camera.Camera.LOG_TAG, "Camera threw error CAMERA_ERROR_UNKNOWN");
        } else if (i10 != 100) {
            Log.e(com.veridas.camera.Camera.LOG_TAG, "Camera threw unknown error (%d)", Integer.valueOf(i10));
        } else {
            error = com.veridas.camera.Camera.Error.SERVICE;
            Log.e(com.veridas.camera.Camera.LOG_TAG, "Camera threw error CAMERA_ERROR_SERVER_DIED");
        }
        fireOnError(error);
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        int pictureRotation = getPictureRotation();
        Picture pictureCreate = this.H0.create(bArr, getProperties().getPictureResolution(), pictureRotation, false, isFacingFront());
        this.R0.clear();
        startPreview(null);
        QueuedThread<Picture> queuedThread = this.S0;
        Picture pictureMakeRoom = queuedThread.makeRoom();
        queuedThread.push(pictureCreate);
        if (pictureMakeRoom != null) {
            recycle(pictureMakeRoom);
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        ReentrantReadWriteLock.ReadLock lock = this.I0.readLock();
        lock.lock();
        w wVar = this.M0;
        lock.unlock();
        wVar.onPreviewFrame(bArr, camera);
    }

    @Override // com.veridas.camera.Camera
    public final void recycle(Picture picture) {
        this.f66608y0.post(new m(picture));
    }

    @Override // com.veridas.camera.Camera
    public final void reorient(int i10) {
        i(new q(i10));
    }

    @Override // com.veridas.camera.Camera
    public final void requestFrame() {
        this.v0.set(true);
    }

    @Override // com.veridas.camera.Camera
    public final void restartPreview() {
        restartPreview(null);
    }

    @Override // com.veridas.camera.AbstractCamera, com.veridas.camera.Camera
    public final void setPreviewMode(@NonNull com.veridas.camera.Camera.PreviewMode previewMode) {
        super.setPreviewMode(previewMode);
        g();
    }

    @Override // com.veridas.camera.Camera
    public final void setPreviewSurface(SurfaceView surfaceView) {
        i(new s(surfaceView));
    }

    @Override // com.veridas.camera.Camera
    public final void start() {
        start(null);
    }

    @Override // com.veridas.camera.Camera
    public final void startAutoFocus() {
        startAutoFocus(null);
    }

    @Override // com.veridas.camera.Camera
    public final void startMediaRecorder() {
        startMediaRecorder(null);
    }

    @Override // com.veridas.camera.Camera
    public final void startPreview() {
        startPreview(null);
    }

    @Override // com.veridas.camera.Camera
    public final void stop() {
        stop(null);
    }

    @Override // com.veridas.camera.Camera
    public final void stopAutoFocus() {
        stopAutoFocus(null);
    }

    @Override // com.veridas.camera.Camera
    public final void stopMediaRecorder() {
        stopMediaRecorder(null);
    }

    @Override // com.veridas.camera.Camera
    public final void stopPreview() {
        stopPreview(null);
    }

    @Override // com.veridas.camera.Camera
    public final void takePicture() {
        takePicture((CameraAction) null);
    }

    @Override // com.veridas.camera.Camera
    public final void initializeMediaRecorder(MediaRecorderAction mediaRecorderAction) {
        i(new p(mediaRecorderAction));
    }

    @Override // com.veridas.camera.Camera
    public final void restartPreview(CameraAction cameraAction) {
        i(new r(cameraAction));
    }

    @Override // com.veridas.camera.Camera
    public final void setPreviewSurface(TextureView textureView) {
        i(new a(textureView));
    }

    @Override // com.veridas.camera.Camera
    public final void start(CameraAction cameraAction) {
        i(new b(cameraAction));
    }

    @Override // com.veridas.camera.Camera
    public final void startAutoFocus(CameraAction cameraAction) {
        i(new c(cameraAction));
    }

    @Override // com.veridas.camera.Camera
    public final void startMediaRecorder(CameraAction cameraAction) {
        i(new d(cameraAction));
    }

    @Override // com.veridas.camera.Camera
    public final void startPreview(CameraAction cameraAction) {
        i(new e(cameraAction));
    }

    @Override // com.veridas.camera.Camera
    public final void stop(CameraAction cameraAction) {
        i(new f(cameraAction));
        try {
            this.E0.join(30000L);
        } catch (InterruptedException e5) {
            Log.e(com.veridas.camera.Camera.LOG_TAG, e5);
        }
    }

    @Override // com.veridas.camera.Camera
    public final void stopAutoFocus(CameraAction cameraAction) {
        i(new g(cameraAction));
    }

    @Override // com.veridas.camera.Camera
    public final void stopMediaRecorder(CameraAction cameraAction) {
        i(new h(cameraAction));
    }

    @Override // com.veridas.camera.Camera
    public final void stopPreview(CameraAction cameraAction) {
        i(new i(cameraAction));
    }

    @Override // com.veridas.camera.Camera
    public final void takePicture(CameraAction cameraAction) {
        i(new j(cameraAction));
    }

    @Override // com.veridas.camera.Camera
    public final void takePicture(int i10) {
        takePicture(i10, null);
    }

    @Override // com.veridas.camera.Camera
    public final void takePicture(int i10, CameraAction cameraAction) {
        this.f66608y0.postDelayed(new l(cameraAction), i10);
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i10, int i11) {
        com.veridas.camera.Camera.Error error = com.veridas.camera.Camera.Error.UNKNOWN;
        if (i10 == 100) {
            error = com.veridas.camera.Camera.Error.SERVICE;
            Log.e(com.veridas.camera.Camera.LOG_TAG, "MediaRecorder threw error MEDIA_ERROR_SERVER_DIED, code: %d", Integer.valueOf(i11));
        } else if (i10 == 1) {
            Log.e(com.veridas.camera.Camera.LOG_TAG, "MediaRecorder threw error MEDIA_RECORDER_ERROR_UNKNOWN, code: %d", Integer.valueOf(i11));
        }
        fireOnError(error);
    }

    public static abstract class t implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraOneCamera f66651a;

        public t(CameraOneCamera cameraOneCamera) {
            this.f66651a = cameraOneCamera;
        }

        @Override // com.veridas.camera.one.CameraOneCamera.w
        public void a() {
        }
    }
}
