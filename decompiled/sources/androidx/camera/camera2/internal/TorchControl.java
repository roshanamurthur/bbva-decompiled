package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class TorchControl {
    static final int DEFAULT_TORCH_STATE = 0;
    private static final String TAG = "TorchControl";
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    CallbackToFutureAdapter.Completer<Void> mEnableTorchCompleter;
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private boolean mIsActive;
    boolean mTargetTorchEnabled;
    private final MutableLiveData<Integer> mTorchState = new MutableLiveData<>(0);

    public TorchControl(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        this.mHasFlashUnit = FlashAvailabilityChecker.isFlashAvailable(cameraCharacteristicsCompat);
        camera2CameraControlImpl.addCaptureResultListener(new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.d2
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return this.f1893a.lambda$new$0(totalCaptureResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$enableTorch$2(final boolean z10, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.b2
            @Override // java.lang.Runnable
            public final void run() {
                this.f1814p0.lambda$enableTorch$1(completer, z10);
            }
        });
        return "enableTorch: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(TotalCaptureResult totalCaptureResult) {
        if (this.mEnableTorchCompleter != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.mTargetTorchEnabled) {
                this.mEnableTorchCompleter.set(null);
                this.mEnableTorchCompleter = null;
            }
        }
        return false;
    }

    private <T> void setLiveDataValue(@NonNull MutableLiveData<T> mutableLiveData, T t10) {
        if (Threads.isMainThread()) {
            mutableLiveData.setValue(t10);
        } else {
            mutableLiveData.postValue(t10);
        }
    }

    public ListenableFuture<Void> enableTorch(final boolean z10) {
        if (this.mHasFlashUnit) {
            setLiveDataValue(this.mTorchState, Integer.valueOf(z10 ? 1 : 0));
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.c2
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return this.f1820p0.lambda$enableTorch$2(z10, completer);
                }
            });
        }
        Logger.d(TAG, "Unable to enableTorch due to there is no flash unit.");
        return Futures.immediateFailedFuture(new IllegalStateException("No flash unit"));
    }

    /* JADX INFO: renamed from: enableTorchInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$enableTorch$1(@Nullable CallbackToFutureAdapter.Completer<Void> completer, boolean z10) {
        if (!this.mHasFlashUnit) {
            if (completer != null) {
                completer.setException(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.mIsActive) {
                setLiveDataValue(this.mTorchState, 0);
                if (completer != null) {
                    completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
                    return;
                }
                return;
            }
            this.mTargetTorchEnabled = z10;
            this.mCamera2CameraControlImpl.enableTorchInternal(z10);
            setLiveDataValue(this.mTorchState, Integer.valueOf(z10 ? 1 : 0));
            CallbackToFutureAdapter.Completer<Void> completer2 = this.mEnableTorchCompleter;
            if (completer2 != null) {
                completer2.setException(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.mEnableTorchCompleter = completer;
        }
    }

    @NonNull
    public LiveData<Integer> getTorchState() {
        return this.mTorchState;
    }

    public void setActive(boolean z10) {
        if (this.mIsActive == z10) {
            return;
        }
        this.mIsActive = z10;
        if (z10) {
            return;
        }
        if (this.mTargetTorchEnabled) {
            this.mTargetTorchEnabled = false;
            this.mCamera2CameraControlImpl.enableTorchInternal(false);
            setLiveDataValue(this.mTorchState, 0);
        }
        CallbackToFutureAdapter.Completer<Void> completer = this.mEnableTorchCompleter;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mEnableTorchCompleter = null;
        }
    }
}
