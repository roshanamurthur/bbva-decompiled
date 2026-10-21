package r5;

import android.view.View;
import androidx.camera.core.ImageCapture;
import androidx.core.content.ContextCompat;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.Reactor;
import com.bbva.component.ui.login.remembereduser.ButtonType;
import com.bbva.component.ui.login.remembereduser.RememberedUserView;
import com.bbva.document.scanner.presentation.capture.ScanDocumentActivity;
import com.bbva.document.scanner.presentation.capture.ScanDocumentViewModel;
import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import com.bbva.signaturepad.ui.SignaturePadActivity;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f92926p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f92927q0;

    public /* synthetic */ c(Object obj, int i10) {
        this.f92926p0 = i10;
        this.f92927q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f92926p0;
        ImageCapture imageCapture = null;
        Object obj = this.f92927q0;
        switch (i10) {
            case 0:
                RememberedUserView this$0 = (RememberedUserView) obj;
                RememberedUserView.Companion companion = RememberedUserView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.viewModel.onButtonTaped(ButtonType.BIOMETRIC);
                break;
            case 1:
                ScanDocumentActivity this$1 = (ScanDocumentActivity) obj;
                ScanDocumentActivity.Companion companion2 = ScanDocumentActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ScanDocumentViewModel scanDocumentViewModel = this$1.f29168q0;
                if (scanDocumentViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    scanDocumentViewModel = null;
                }
                scanDocumentViewModel.onCapturePhotoClicked();
                ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(new File(this$1.j().getOutput())).build();
                Intrinsics.checkNotNullExpressionValue(outputFileOptionsBuild, "Builder(File(configurati…ut))\n            .build()");
                ImageCapture imageCapture2 = this$1.f29169r0;
                if (imageCapture2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageCapture");
                } else {
                    imageCapture = imageCapture2;
                }
                imageCapture.lambda$takePicture$4(outputFileOptionsBuild, ContextCompat.getMainExecutor(this$1), this$1.f29172u0);
                break;
            case 2:
                FullScreenModal this$2 = (FullScreenModal) obj;
                FullScreenModal.Companion companion3 = FullScreenModal.INSTANCE;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Function0<Unit> function0 = this$2.confirmListener;
                if (function0 != null) {
                    function0.invoke();
                }
                ActionSpec<Void> actionSpec = FullScreenModal.f34617u0;
                FullScreenModal.FullScreenModalConfig fullScreenModalConfig = this$2.f34621q0;
                if (fullScreenModalConfig == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("config");
                    fullScreenModalConfig = null;
                }
                Reactor.inside(fullScreenModalConfig.getId()).doAction(actionSpec).with(null).fire();
                this$2.dismiss();
                break;
            default:
                SignaturePadActivity this$3 = (SignaturePadActivity) obj;
                SignaturePadActivity.Companion companion4 = SignaturePadActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.setResult(0);
                this$3.finish();
                break;
        }
    }
}
