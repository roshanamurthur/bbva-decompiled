package com.veridas.camera;

import android.media.MediaRecorder;
import com.veridas.camera.metrics.DefaultMeteringSessionCollection;
import com.veridas.camera.metrics.MeteringSession;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;
import com.veridas.util.Thread;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractCamera implements Camera {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Camera.Facing f66571s0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f66568p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f66569q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f66570r0 = 0;
    protected AtomicBoolean recording = new AtomicBoolean(false);
    protected DefaultMeteringSessionCollection meteringSessionCollection = new DefaultMeteringSessionCollection();
    protected List<CameraListener> cameraListenerList = Collections.synchronizedList(new LinkedList());
    protected volatile Camera.PreviewMode previewMode = Camera.PreviewMode.PULL;

    public class a implements t {
        public a() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onParametersChanged(AbstractCamera.this);
        }
    }

    public class b implements t {
        public b() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onPreviewStarted(AbstractCamera.this);
        }
    }

    public class c implements t {
        public c() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onPreviewStopped(AbstractCamera.this);
        }
    }

    public class d implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Resolution f66575a;

        public d(Resolution resolution) {
            this.f66575a = resolution;
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onPreviewSurfaceChanged(AbstractCamera.this, this.f66575a);
        }
    }

    public class e implements t {
        public e() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onReconnected(AbstractCamera.this);
        }
    }

    public class f implements t {
        public f() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onReleased(AbstractCamera.this);
        }
    }

    public class g implements t {
        public g() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onReoriented(AbstractCamera.this);
        }
    }

    public class h implements t {
        public h() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onStarted(AbstractCamera.this);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ t f66581p0;

        public i(t tVar) {
            this.f66581p0 = tVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractCamera abstractCamera = AbstractCamera.this;
            if (abstractCamera.cameraListenerList.isEmpty()) {
                return;
            }
            Object[] array = abstractCamera.cameraListenerList.toArray();
            for (int length = array.length - 1; length >= 0; length--) {
                this.f66581p0.a((CameraListener) array[length]);
            }
        }
    }

    public class j implements t {
        public j() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onStopped(AbstractCamera.this);
        }
    }

    public class k implements t {
        public k() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onUnlocked(AbstractCamera.this);
        }
    }

    public class l implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f66585a;

        public l(boolean z10) {
            this.f66585a = z10;
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onFocusFinished(AbstractCamera.this, this.f66585a);
        }
    }

    public class m implements t {
        public m() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onFocusStarted(AbstractCamera.this);
        }
    }

    public class n implements t {
        public n() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onAvailable(AbstractCamera.this);
        }
    }

    public class o implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Camera.Error f66589a;

        public o(Camera.Error error) {
            this.f66589a = error;
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onError(AbstractCamera.this, this.f66589a);
        }
    }

    public class p implements t {
        public p() {
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onLocked(AbstractCamera.this);
        }
    }

    public class q implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediaRecorder f66592a;

        public q(MediaRecorder mediaRecorder) {
            this.f66592a = mediaRecorder;
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onMediaRecorderInitialized(AbstractCamera.this, this.f66592a);
        }
    }

    public class r implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediaRecorder f66594a;

        public r(MediaRecorder mediaRecorder) {
            this.f66594a = mediaRecorder;
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onMediaRecorderStarted(AbstractCamera.this, this.f66594a);
        }
    }

    public class s implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediaRecorder f66596a;

        public s(MediaRecorder mediaRecorder) {
            this.f66596a = mediaRecorder;
        }

        @Override // com.veridas.camera.AbstractCamera.t
        public final void a(CameraListener cameraListener) {
            cameraListener.onMediaRecorderStopped(AbstractCamera.this, this.f66596a);
        }
    }

    public interface t {
        void a(CameraListener cameraListener);
    }

    public final void a(t tVar) {
        if (this.cameraListenerList.isEmpty()) {
            return;
        }
        Thread.runOnUiThread(new i(tVar));
    }

    @Override // com.veridas.camera.Camera
    public void addCameraListener(CameraListener cameraListener) {
        this.cameraListenerList.add(cameraListener);
    }

    public void fireOnAvailable() {
        a(new n());
    }

    public void fireOnError(Camera.Error error) {
        a(new o(error));
    }

    public void fireOnFocusFinished(boolean z10) {
        this.meteringSessionCollection.finishFocusMeasurement(z10);
        a(new l(z10));
    }

    public void fireOnFocusStarted() {
        this.meteringSessionCollection.startFocusMeasurement();
        a(new m());
    }

    public void fireOnLocked() {
        a(new p());
    }

    public void fireOnMediaRecorderInitialized(MediaRecorder mediaRecorder) {
        a(new q(mediaRecorder));
    }

    public void fireOnMediaRecorderStarted(MediaRecorder mediaRecorder) {
        a(new r(mediaRecorder));
    }

    public void fireOnMediaRecorderStopped(MediaRecorder mediaRecorder) {
        a(new s(mediaRecorder));
    }

    public void fireOnParametersChanged() {
        a(new a());
    }

    public void fireOnPictureReady(Picture picture) {
        this.meteringSessionCollection.addPictureMeasurement();
        if (this.cameraListenerList.isEmpty()) {
            return;
        }
        Object[] array = this.cameraListenerList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((CameraListener) array[length]).onPictureReady(this, picture);
        }
    }

    public void fireOnPreviewReady(Picture picture) {
        this.meteringSessionCollection.addPreviewMeasurement();
        if (this.cameraListenerList.isEmpty()) {
            return;
        }
        Object[] array = this.cameraListenerList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((CameraListener) array[length]).onPreviewReady(this, picture);
        }
    }

    public void fireOnPreviewStarted() {
        a(new b());
    }

    public void fireOnPreviewStopped() {
        a(new c());
    }

    public void fireOnPreviewSurfaceChanged(Resolution resolution) {
        a(new d(resolution));
    }

    public void fireOnReconnected() {
        a(new e());
    }

    public void fireOnReleased() {
        a(new f());
    }

    public void fireOnReoriented() {
        a(new g());
    }

    public void fireOnStarted() {
        a(new h());
    }

    public void fireOnStopped() {
        this.meteringSessionCollection.destroy();
        a(new j());
    }

    public void fireOnUnlocked() {
        a(new k());
    }

    @Override // com.veridas.camera.Camera
    public Camera.Facing getFacing() {
        return this.f66571s0;
    }

    @Override // com.veridas.camera.Camera
    public MeteringSession getMeteringSession() {
        return this.meteringSessionCollection.create();
    }

    @Override // com.veridas.camera.Camera
    public int getPictureRotation() {
        return this.f66568p0;
    }

    @Override // com.veridas.camera.Camera
    public Camera.PreviewMode getPreviewMode() {
        return this.previewMode;
    }

    @Override // com.veridas.camera.Camera
    public int getSensorOrientation() {
        return this.f66569q0;
    }

    @Override // com.veridas.camera.Camera
    public int getSensorRotation() {
        return this.f66570r0;
    }

    @Override // com.veridas.camera.Camera
    public boolean isFacingBack() {
        return this.f66571s0 == Camera.Facing.BACK;
    }

    @Override // com.veridas.camera.Camera
    public boolean isFacingFront() {
        return this.f66571s0 == Camera.Facing.FRONT;
    }

    @Override // com.veridas.camera.Camera
    public boolean isRecording() {
        return this.recording.get();
    }

    @Override // com.veridas.camera.Camera
    public void removeCameraListener(CameraListener cameraListener) {
        this.cameraListenerList.remove(cameraListener);
    }

    public void setFacing(Camera.Facing facing) {
        this.f66571s0 = facing;
    }

    public void setPictureRotation(int i10) {
        this.f66568p0 = i10;
    }

    @Override // com.veridas.camera.Camera
    public void setPreviewMode(@NotNull Camera.PreviewMode previewMode) {
        this.previewMode = previewMode;
    }

    public void setSensorOrientation(int i10) {
        this.f66569q0 = i10;
    }

    public void setSensorRotation(int i10) {
        this.f66570r0 = i10;
    }
}
