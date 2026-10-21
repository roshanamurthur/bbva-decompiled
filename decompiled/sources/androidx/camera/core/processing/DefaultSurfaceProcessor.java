package androidx.camera.core.processing;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.d0;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.p1;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class DefaultSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    private final Executor mGlExecutor;

    @VisibleForTesting
    final Handler mGlHandler;
    private final OpenGlRenderer mGlRenderer;

    @VisibleForTesting
    final HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final AtomicBoolean mIsReleased;
    final Map<SurfaceOutput, Surface> mOutputSurfaces;
    private final float[] mSurfaceOutputMatrix;
    private final float[] mTextureMatrix;

    public DefaultSurfaceProcessor() {
        this(ShaderProvider.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void checkReadyToRelease() {
        if (this.mIsReleased.get() && this.mInputSurfaceCount == 0) {
            Iterator<SurfaceOutput> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.release();
            this.mGlThread.quit();
        }
    }

    private void initGlRenderer(@NonNull ShaderProvider shaderProvider) {
        try {
            CallbackToFutureAdapter.getFuture(new b(this, shaderProvider)).get();
        } catch (InterruptedException | ExecutionException e5) {
            e = e5;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGlRenderer$4(ShaderProvider shaderProvider, CallbackToFutureAdapter.Completer completer) {
        try {
            this.mGlRenderer.init(shaderProvider);
            completer.set(null);
        } catch (RuntimeException e5) {
            completer.setException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$initGlRenderer$5(ShaderProvider shaderProvider, CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mGlExecutor.execute(new d0(this, shaderProvider, 1, completer));
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$0(SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.mInputSurfaceCount--;
        checkReadyToRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInputSurface$1(SurfaceRequest surfaceRequest) {
        this.mInputSurfaceCount++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.mGlRenderer.getTextureName());
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, this.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.d
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f2202p0.lambda$onInputSurface$0(surfaceTexture, surface, (SurfaceRequest.Result) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.mGlHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$2(SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        surfaceOutput.close();
        this.mOutputSurfaces.remove(surfaceOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOutputSurface$3(final SurfaceOutput surfaceOutput) {
        this.mOutputSurfaces.put(surfaceOutput, surfaceOutput.getSurface(this.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.c
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f2200p0.lambda$onOutputSurface$2(surfaceOutput, (SurfaceOutput.Event) obj);
            }
        }));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@NonNull SurfaceTexture surfaceTexture) {
        if (this.mIsReleased.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.mTextureMatrix);
        for (Map.Entry<SurfaceOutput, Surface> entry : this.mOutputSurfaces.entrySet()) {
            Surface value = entry.getValue();
            SurfaceOutput key = entry.getKey();
            this.mGlRenderer.setOutputSurface(value);
            key.updateTransformMatrix(this.mSurfaceOutputMatrix, this.mTextureMatrix);
            this.mGlRenderer.render(surfaceTexture.getTimestamp(), this.mSurfaceOutputMatrix);
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@NonNull SurfaceRequest surfaceRequest) {
        if (this.mIsReleased.get()) {
            surfaceRequest.willNotProvideSurface();
        } else {
            this.mGlExecutor.execute(new a(this, surfaceRequest, 0));
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@NonNull SurfaceOutput surfaceOutput) {
        if (this.mIsReleased.get()) {
            surfaceOutput.close();
        } else {
            this.mGlExecutor.execute(new p1(this, surfaceOutput, 1));
        }
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        int i10 = 1;
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        this.mGlExecutor.execute(new androidx.camera.camera2.internal.d(this, i10));
    }

    public DefaultSurfaceProcessor(@NonNull ShaderProvider shaderProvider) {
        this.mIsReleased = new AtomicBoolean(false);
        this.mTextureMatrix = new float[16];
        this.mSurfaceOutputMatrix = new float[16];
        this.mOutputSurfaces = new LinkedHashMap();
        this.mInputSurfaceCount = 0;
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mGlRenderer = new OpenGlRenderer();
        try {
            initGlRenderer(shaderProvider);
        } catch (RuntimeException e5) {
            release();
            throw e5;
        }
    }
}
