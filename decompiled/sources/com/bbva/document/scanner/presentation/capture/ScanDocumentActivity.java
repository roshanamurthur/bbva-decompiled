package com.bbva.document.scanner.presentation.capture;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.processing.n;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.document.scanner.CaptureOptions;
import com.bbva.document.scanner.camera.Dimensions;
import com.bbva.document.scanner.camera.FramePosition;
import com.bbva.document.scanner.presentation.capture.ScanDocumentActivity;
import com.bbva.document.scanner.presentation.view.FrameBackground;
import com.bbva.document.scanner.presentation.view.FrameView;
import com.bbva.documentscanner.R;
import com.bbva.documentscanner.databinding.ActivityCaptureDocumentBinding;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r5.c;
import r5.d;

/* JADX INFO: compiled from: ScanDocumentActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanDocumentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanDocumentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanDocumentActivity.kt\ncom/bbva/document/scanner/presentation/capture/ScanDocumentActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
public final class ScanDocumentActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ScanDocumentViewModelFactory f29167p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ScanDocumentViewModel f29168q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ImageCapture f29169r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f29170s0 = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f29171t0 = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final ScanDocumentActivity$imageCaptureCallback$1 f29172u0 = new ImageCapture.OnImageSavedCallback() { // from class: com.bbva.document.scanner.presentation.capture.ScanDocumentActivity$imageCaptureCallback$1
        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onError(@NotNull ImageCaptureException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            ScanDocumentViewModel scanDocumentViewModel = this.f29175a.f29168q0;
            if (scanDocumentViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                scanDocumentViewModel = null;
            }
            scanDocumentViewModel.onImageCaptureError(exception);
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onImageSaved(@NotNull ImageCapture.OutputFileResults outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
            ScanDocumentActivity scanDocumentActivity = this.f29175a;
            ScanDocumentViewModel scanDocumentViewModel = scanDocumentActivity.f29168q0;
            if (scanDocumentViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                scanDocumentViewModel = null;
            }
            scanDocumentViewModel.onImageCaptured(scanDocumentActivity.j().getOutput(), ScanDocumentActivity.access$previewDimensions(scanDocumentActivity), ScanDocumentActivity.access$framePosition(scanDocumentActivity));
        }
    };

    /* JADX INFO: compiled from: ScanDocumentActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanDocumentActivity$Companion;", "", "()V", "ANIMATION_TIME", "", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: ScanDocumentActivity.kt */
    public static final class a extends Lambda implements Function0<ActivityCaptureDocumentBinding> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ActivityCaptureDocumentBinding invoke() {
            ActivityCaptureDocumentBinding activityCaptureDocumentBindingInflate = ActivityCaptureDocumentBinding.inflate(ScanDocumentActivity.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(activityCaptureDocumentBindingInflate, "inflate(layoutInflater)");
            return activityCaptureDocumentBindingInflate;
        }
    }

    /* JADX INFO: compiled from: ScanDocumentActivity.kt */
    public static final class b extends Lambda implements Function0<CaptureOptions> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CaptureOptions invoke() {
            Parcelable parcelableExtra = ScanDocumentActivity.this.getIntent().getParcelableExtra("parameters");
            if (parcelableExtra != null) {
                return (CaptureOptions) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static final FramePosition access$framePosition(ScanDocumentActivity scanDocumentActivity) {
        FrameView frameView = scanDocumentActivity.i().frame;
        return new FramePosition(frameView.getLeft(), frameView.getTop(), frameView.getWidth(), frameView.getHeight());
    }

    public static final void access$loadingToast(ScanDocumentActivity scanDocumentActivity, boolean z10) {
        ActivityCaptureDocumentBinding activityCaptureDocumentBindingI = scanDocumentActivity.i();
        String processingImageText = scanDocumentActivity.j().getProcessingImageText();
        if (processingImageText != null) {
            activityCaptureDocumentBindingI.notificationText.setText(processingImageText);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(z10 ? scanDocumentActivity.l() : scanDocumentActivity.k());
            animatorSet.start();
        }
    }

    public static final void access$onScanResult(ScanDocumentActivity scanDocumentActivity, ScanResult scanResult) {
        scanDocumentActivity.getClass();
        Intent intent = new Intent();
        intent.putExtra("result", scanResult);
        scanDocumentActivity.setResult(-1, intent);
        scanDocumentActivity.finish();
    }

    public static final Dimensions access$previewDimensions(ScanDocumentActivity scanDocumentActivity) {
        PreviewView previewView = scanDocumentActivity.i().cameraPreview;
        return new Dimensions(previewView.getWidth(), previewView.getHeight());
    }

    public final ActivityCaptureDocumentBinding i() {
        return (ActivityCaptureDocumentBinding) this.f29170s0.getValue();
    }

    public final CaptureOptions j() {
        return (CaptureOptions) this.f29171t0.getValue();
    }

    public final ObjectAnimator k() {
        FrameLayout frameLayout = i().notificationContainer;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.notificationContainer");
        ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(300L);
        Intrinsics.checkNotNullExpressionValue(duration, "ofFloat(view, View.ALPHA…tDuration(ANIMATION_TIME)");
        return duration;
    }

    public final ObjectAnimator l() {
        FrameLayout frameLayout = i().notificationContainer;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.notificationContainer");
        ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
        Intrinsics.checkNotNullExpressionValue(duration, "ofFloat(view, View.ALPHA…tDuration(ANIMATION_TIME)");
        return duration;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        int i10 = 1;
        requestWindowFeature(1);
        super.onCreate(savedInstanceState);
        setContentView(i().getRoot());
        this.f29167p0 = new ScanDocumentViewModelFactory(j());
        ScanDocumentViewModelFactory scanDocumentViewModelFactory = this.f29167p0;
        ScanDocumentViewModel scanDocumentViewModel = null;
        if (scanDocumentViewModelFactory == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
            scanDocumentViewModelFactory = null;
        }
        this.f29168q0 = (ScanDocumentViewModel) new ViewModelProvider(this, scanDocumentViewModelFactory).get(ScanDocumentViewModel.class);
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            ScanResult.ScanError scanError = new ScanResult.ScanError("Permissions for Camera not granted");
            Intent intent = new Intent();
            intent.putExtra("result", scanError);
            setResult(-1, intent);
            finish();
            return;
        }
        ActivityCaptureDocumentBinding activityCaptureDocumentBindingI = i();
        activityCaptureDocumentBindingI.frame.setRatio(j().getRatio());
        CellsButton cellsButton = activityCaptureDocumentBindingI.takePhoto;
        String buttonText = j().getButtonText();
        if (buttonText == null) {
            buttonText = getString(R.string.documentScanner_captureText);
        }
        cellsButton.setText(buttonText);
        activityCaptureDocumentBindingI.takePhoto.setOnClickListener(new c(this, i10));
        activityCaptureDocumentBindingI.close.setOnClickListener(new d(this, 1));
        FrameBackground frameBackground = activityCaptureDocumentBindingI.overlay;
        FrameView frame = activityCaptureDocumentBindingI.frame;
        Intrinsics.checkNotNullExpressionValue(frame, "frame");
        frameBackground.attachBoxProvider(frame);
        ListenableFuture<ProcessCameraProvider> processCameraProvider = ProcessCameraProvider.getInstance(this);
        Intrinsics.checkNotNullExpressionValue(processCameraProvider, "getInstance(this)");
        processCameraProvider.addListener(new n(processCameraProvider, this, i10), ContextCompat.getMainExecutor(this));
        ScanDocumentViewModel scanDocumentViewModel2 = this.f29168q0;
        if (scanDocumentViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            scanDocumentViewModel = scanDocumentViewModel2;
        }
        LiveData<ScanDocumentState> state = scanDocumentViewModel.getState();
        final com.bbva.document.scanner.presentation.capture.a aVar = new com.bbva.document.scanner.presentation.capture.a(this);
        state.observe(this, new Observer() { // from class: s6.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ScanDocumentActivity.Companion companion = ScanDocumentActivity.INSTANCE;
                Function1 tmp0 = aVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }
        });
    }
}
