package com.bbva.qr.activity;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.document.scanner.plugin.command.PreviewDocumentCommand;
import com.bbva.qr.R;
import com.bbva.qr.extension.DetectorKt;
import com.bbva.qr.model.input.AspectRatio;
import com.bbva.qr.model.input.BarcodeType;
import com.bbva.qr.model.input.CameraConfig;
import com.bbva.qr.model.input.CustomViewConfig;
import com.bbva.qr.model.input.OverlayConfig;
import com.bbva.qr.model.input.ScannerSettings;
import com.bbva.qr.scanner.camera.CameraOptions;
import com.bbva.qr.scanner.camera.CameraSource;
import com.bbva.qr.scanner.camera.Facing;
import com.bbva.qr.scanner.camera.Flash;
import com.bbva.qr.scanner.camera.Focus;
import com.bbva.qr.scanner.camera.FrameSize;
import com.bbva.qr.scanner.detectors.Detector;
import com.bbva.qr.scanner.graphics.BarcodeGraphic;
import com.bbva.qr.scanner.views.CameraSourcePreview;
import com.bbva.qr.scanner.views.GraphicOverlay;
import com.bbva.qr.utils.ConstantsKt;
import com.bbva.qr.view.Configurable;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tb.b;

/* JADX INFO: compiled from: ScannerActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/qr/activity/ScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "bundle", "", "onCreate", "onResume", "onPause", "onDestroy", "<init>", "()V", "a", "qr_release"}, k = 1, mv = {1, 8, 0})
public final class ScannerActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CameraSourcePreview f36275p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GraphicOverlay<BarcodeGraphic> f36276q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CameraSource f36277r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f36278s0;

    /* JADX INFO: compiled from: ScannerActivity.kt */
    public final class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            return false;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            CameraSource cameraSource = ScannerActivity.this.f36277r0;
            if (cameraSource == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraSource");
                cameraSource = null;
            }
            cameraSource.doZoom(detector.getScaleFactor());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        int iIntValue;
        super.onCreate(bundle);
        setContentView(R.layout.activity_scanner_ml);
        View viewFindViewById = findViewById(R.id.preview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.preview)");
        this.f36275p0 = (CameraSourcePreview) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.graphicOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.graphicOverlay)");
        this.f36276q0 = (GraphicOverlay) viewFindViewById2;
        ScannerSettings scannerSettings = (ScannerSettings) getIntent().getParcelableExtra(ConstantsKt.QR_INTENT_PARAMS);
        if (scannerSettings != null) {
            CustomViewConfig customViewConfig = scannerSettings.getCustomViewConfig();
            GraphicOverlay<BarcodeGraphic> graphicOverlay = null;
            if (customViewConfig != null) {
                Integer id = customViewConfig.getId();
                Map<String, String> options = customViewConfig.getOptions();
                if (id != null) {
                    int iIntValue2 = id.intValue();
                    ViewGroup viewGroup = (ViewGroup) findViewById(R.id.placeHolder);
                    View viewInflate = LayoutInflater.from(this).inflate(iIntValue2, (ViewGroup) null, true);
                    if (options != null && (viewInflate instanceof Configurable)) {
                        ((Configurable) viewInflate).configureAttributes(options);
                    }
                    viewGroup.addView(viewInflate);
                    viewGroup.setVisibility(0);
                }
            }
            CameraConfig cameraConfig = scannerSettings.getCameraConfig();
            if (cameraConfig != null) {
                BarcodeType codeType = scannerSettings.getCodeType();
                boolean autoFocus = cameraConfig.getAutoFocus();
                boolean flash = cameraConfig.getFlash();
                BarcodeScanner client = BarcodeScanning.getClient(DetectorKt.addBarcodeFormats(new BarcodeScannerOptions.Builder(), codeType));
                Intrinsics.checkNotNullExpressionValue(client, "getClient(scannerOptions)");
                Detector detector = new Detector(client, new tb.a(this));
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                Facing facing = Facing.BACK;
                CameraOptions cameraOptions = new CameraOptions(15.0f, autoFocus ? Focus.CONTINUOUS_PICTURE : null, flash ? Flash.TORCH : null, new FrameSize(displayMetrics.widthPixels, displayMetrics.heightPixels), facing);
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                this.f36277r0 = new CameraSource(applicationContext, detector, cameraOptions);
            }
            Integer requestCode = scannerSettings.getRequestCode();
            this.f36278s0 = requestCode != null ? requestCode.intValue() : 1000;
            OverlayConfig overlayConfig = scannerSettings.getOverlayConfig();
            if (overlayConfig != null) {
                Boolean boolIsFrameVisible = overlayConfig.isFrameVisible();
                boolean zBooleanValue = boolIsFrameVisible != null ? boolIsFrameVisible.booleanValue() : true;
                Boolean boolIsImageVisible = overlayConfig.isImageVisible();
                boolean zBooleanValue2 = boolIsImageVisible != null ? boolIsImageVisible.booleanValue() : true;
                if (!zBooleanValue && !zBooleanValue2) {
                    GraphicOverlay<BarcodeGraphic> graphicOverlay2 = this.f36276q0;
                    if (graphicOverlay2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graphicCaptureOverlay");
                    } else {
                        graphicOverlay = graphicOverlay2;
                    }
                    graphicOverlay.setVisibility(8);
                    return;
                }
                GraphicOverlay<BarcodeGraphic> graphicOverlay3 = this.f36276q0;
                if (graphicOverlay3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("graphicCaptureOverlay");
                    graphicOverlay3 = null;
                }
                graphicOverlay3.applyOverlayConfig(overlayConfig);
                GraphicOverlay<BarcodeGraphic> graphicOverlay4 = this.f36276q0;
                if (graphicOverlay4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("graphicCaptureOverlay");
                    graphicOverlay4 = null;
                }
                graphicOverlay4.initPaints(scannerSettings.getCodeType());
                if (scannerSettings.getOverlayConfig().getAspectRatio() == AspectRatio.RECTANGLE_LANDSCAPE) {
                    setRequestedOrientation(0);
                }
            }
            Integer cameraTimeout = scannerSettings.getCameraTimeout();
            if (cameraTimeout != null && (iIntValue = cameraTimeout.intValue()) > 0) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(iIntValue, this, null), 3, null);
            }
        }
        new ScaleGestureDetector(this, new a());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CameraSourcePreview cameraSourcePreview = this.f36275p0;
        if (cameraSourcePreview == null) {
            Intrinsics.throwUninitializedPropertyAccessException(PreviewDocumentCommand.ID);
            cameraSourcePreview = null;
        }
        cameraSourcePreview.release();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        CameraSourcePreview cameraSourcePreview = this.f36275p0;
        if (cameraSourcePreview == null) {
            Intrinsics.throwUninitializedPropertyAccessException(PreviewDocumentCommand.ID);
            cameraSourcePreview = null;
        }
        cameraSourcePreview.stop();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        CameraSource cameraSource = null;
        try {
            CameraSourcePreview cameraSourcePreview = this.f36275p0;
            if (cameraSourcePreview == null) {
                Intrinsics.throwUninitializedPropertyAccessException(PreviewDocumentCommand.ID);
                cameraSourcePreview = null;
            }
            CameraSource cameraSource2 = this.f36277r0;
            if (cameraSource2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraSource");
                cameraSource2 = null;
            }
            GraphicOverlay<BarcodeGraphic> graphicOverlay = this.f36276q0;
            if (graphicOverlay == null) {
                Intrinsics.throwUninitializedPropertyAccessException("graphicCaptureOverlay");
                graphicOverlay = null;
            }
            cameraSourcePreview.start(cameraSource2, graphicOverlay);
        } catch (IOException unused) {
            CameraSource cameraSource3 = this.f36277r0;
            if (cameraSource3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraSource");
            } else {
                cameraSource = cameraSource3;
            }
            cameraSource.stop();
        }
    }
}
