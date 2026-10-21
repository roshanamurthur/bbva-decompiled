package androidx.camera.core.processing;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PorterDuff;
import android.nfc.Tag;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.document.scanner.NotificationConfig;
import com.bbva.document.scanner.presentation.capture.ScanDocumentActivity;
import com.bbva.documentscanner.R;
import com.bbva.documentscanner.databinding.ActivityCaptureDocumentBinding;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.dasnano.vdphotoselfiecapture.api.model.Token;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.common.util.concurrent.ListenableFuture;
import com.mypinpad.tsdk.isolation.IsolatedService;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2223p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2224q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2225r0;

    public /* synthetic */ n(Object obj, Object obj2, int i10) {
        this.f2223p0 = i10;
        this.f2224q0 = obj;
        this.f2225r0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object objM5535constructorimpl;
        int i10 = this.f2223p0;
        byte b10 = 1;
        Object obj = this.f2225r0;
        Object obj2 = this.f2224q0;
        switch (i10) {
            case 0:
                ((SurfaceProcessorWithExecutor) obj2).lambda$onInputSurface$0((SurfaceRequest) obj);
                break;
            case 1:
                ListenableFuture cameraProviderFuture = (ListenableFuture) obj2;
                ScanDocumentActivity this$0 = (ScanDocumentActivity) obj;
                ScanDocumentActivity.Companion companion = ScanDocumentActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(cameraProviderFuture, "$cameraProviderFuture");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) cameraProviderFuture.get();
                PreviewView previewView = this$0.i().cameraPreview;
                Intrinsics.checkNotNullExpressionValue(previewView, "binding.cameraPreview");
                ViewPort viewPort = previewView.getViewPort();
                Intrinsics.checkNotNull(viewPort);
                CameraSelector DEFAULT_BACK_CAMERA = CameraSelector.DEFAULT_BACK_CAMERA;
                Intrinsics.checkNotNullExpressionValue(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
                Preview previewBuild = new Preview.Builder().build();
                previewBuild.setSurfaceProvider(previewView.getSurfaceProvider());
                Intrinsics.checkNotNullExpressionValue(previewBuild, "Builder()\n              …review.surfaceProvider) }");
                ImageCapture imageCaptureBuild = new ImageCapture.Builder().build();
                Intrinsics.checkNotNullExpressionValue(imageCaptureBuild, "Builder()\n                    .build()");
                this$0.f29169r0 = imageCaptureBuild;
                ActivityCaptureDocumentBinding activityCaptureDocumentBindingI = this$0.i();
                NotificationConfig notificationConfig = this$0.j().getNotificationConfig();
                if (notificationConfig != null) {
                    CellsTextView cellsTextView = activityCaptureDocumentBindingI.notificationText;
                    String text = notificationConfig.getText();
                    if (text == null) {
                        text = this$0.getString(R.string.documentScanner_toastText);
                    }
                    cellsTextView.setText(text);
                    ObjectAnimator objectAnimatorK = this$0.k();
                    objectAnimatorK.setStartDelay(notificationConfig.getDuration());
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(this$0.l(), objectAnimatorK);
                    animatorSet.start();
                }
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    processCameraProvider.unbindAll();
                    objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                }
                if (!Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                    Result.m5535constructorimpl(objM5535constructorimpl);
                } else {
                    try {
                        UseCaseGroup.Builder builderAddUseCase = new UseCaseGroup.Builder().addUseCase(previewBuild);
                        ImageCapture imageCapture = this$0.f29169r0;
                        if (imageCapture == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("imageCapture");
                            imageCapture = null;
                        }
                        UseCaseGroup useCaseGroupBuild = builderAddUseCase.addUseCase(imageCapture).setViewPort(viewPort).build();
                        Intrinsics.checkNotNullExpressionValue(useCaseGroupBuild, "Builder()\n              …                 .build()");
                        Result.m5535constructorimpl(processCameraProvider.bindToLifecycle(this$0, DEFAULT_BACK_CAMERA, useCaseGroupBuild));
                    } catch (Throwable th3) {
                        Result.Companion companion4 = Result.INSTANCE;
                        Result.m5535constructorimpl(ResultKt.createFailure(th3));
                        return;
                    }
                }
                break;
            case 2:
                SelfieFragment selfieFragment = (SelfieFragment) obj2;
                Token token = (Token) obj;
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                selfieFragment.H(SelfieFragment.CountDownState.COUNTDOWN_INVISIBLE);
                selfieFragment.J();
                selfieFragment.f39570g1.setVisibility(0);
                selfieFragment.f39568f1.setText(String.format(selfieFragment.getContext().getString(com.dasnano.vdphotoselfiecapture.R.string.vd_photo_ngas_step_number), Integer.valueOf(selfieFragment.N0 + 1), Integer.valueOf(token.getChallenge().getActions().length)));
                selfieFragment.f39568f1.setVisibility(0);
                selfieFragment.u();
                selfieFragment.f39563c1.setVisibility(4);
                selfieFragment.K(selfieFragment.f39580l1);
                String direction = token.getChallenge().getActions()[selfieFragment.N0].getParameters().getDirection();
                direction.getClass();
                switch (direction.hashCode()) {
                    case -1383228885:
                        b10 = !direction.equals("bottom") ? (byte) -1 : (byte) 0;
                        break;
                    case 115029:
                        if (!direction.equals("top")) {
                            b10 = -1;
                        }
                        break;
                    case 3317767:
                        b10 = !direction.equals(Parameters.DIRECTION.LEFT) ? (byte) -1 : (byte) 2;
                        break;
                    case 108511772:
                        b10 = !direction.equals(Parameters.DIRECTION.RIGHT) ? (byte) -1 : (byte) 3;
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        selfieFragment.f39572h1.setRotation(270.0f);
                        selfieFragment.f39572h1.setColorFilter(selfieFragment.A2, PorterDuff.Mode.MULTIPLY);
                        break;
                    case 1:
                        selfieFragment.f39574i1.setRotation(90.0f);
                        selfieFragment.f39574i1.setColorFilter(selfieFragment.A2, PorterDuff.Mode.MULTIPLY);
                        break;
                    case 2:
                        selfieFragment.f39576j1.setRotation(0.0f);
                        selfieFragment.f39576j1.setColorFilter(selfieFragment.A2, PorterDuff.Mode.MULTIPLY);
                        break;
                    case 3:
                        selfieFragment.f39578k1.setRotation(180.0f);
                        selfieFragment.f39578k1.setColorFilter(selfieFragment.A2, PorterDuff.Mode.MULTIPLY);
                        break;
                }
                selfieFragment.setSelfieState(SelfieFragment.SelfieState.SELFIE_CHALLENGE_ACTION);
                selfieFragment.E();
                break;
            default:
                int i11 = IsolatedService.a.f61646b;
                IsolatedService.a.a(new Object[]{(IsolatedService) obj2, (Tag) obj}, 1232315, -1232313, (int) System.currentTimeMillis());
                break;
        }
    }
}
