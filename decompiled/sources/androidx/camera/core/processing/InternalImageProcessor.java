package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public class InternalImageProcessor {

    @NonNull
    private final Executor mExecutor;

    @NonNull
    private final ImageProcessor mImageProcessor;

    public InternalImageProcessor(@NonNull CameraEffect cameraEffect) {
        Preconditions.checkArgument(cameraEffect.getTargets() == 4);
        this.mExecutor = cameraEffect.getProcessorExecutor();
        ImageProcessor imageProcessor = cameraEffect.getImageProcessor();
        Objects.requireNonNull(imageProcessor);
        this.mImageProcessor = imageProcessor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$safeProcess$0(CallbackToFutureAdapter.Completer completer, ImageProcessor.Request request) {
        try {
            completer.set(this.mImageProcessor.process(request));
        } catch (Exception e5) {
            completer.setException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$safeProcess$1(ImageProcessor.Request request, CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new androidx.camera.camera2.internal.g(this, completer, 1, request));
        return "InternalImageProcessor#process " + request.hashCode();
    }

    @NonNull
    public ImageProcessor.Response safeProcess(@NonNull final ImageProcessor.Request request) throws ImageCaptureException {
        try {
            return (ImageProcessor.Response) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.e
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return this.f2205p0.lambda$safeProcess$1(request, completer);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e5) {
            e = e5;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
