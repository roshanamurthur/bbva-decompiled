package com.bbva.document.scanner;

import android.app.Application;
import android.content.Intent;
import androidx.core.os.BundleKt;
import com.bbva.document.scanner.presentation.ConstantsKt;
import com.bbva.document.scanner.presentation.DocumentScannerRequest;
import com.bbva.document.scanner.presentation.capture.ScanDocumentActivity;
import com.bbva.document.scanner.presentation.capture.ScanResult;
import com.bbva.document.scanner.presentation.preview.PreviewDocumentActivity;
import com.bbva.document.scanner.presentation.preview.PreviewResult;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultDocumentScanner.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0013"}, d2 = {"Lcom/bbva/document/scanner/DefaultDocumentScanner;", "Lcom/bbva/document/scanner/DocumentScanner;", "Lcom/bbva/document/scanner/CaptureOptions;", "captureOptions", "Lcom/bbva/document/scanner/presentation/DocumentScannerRequest;", "scanDocument", "Lcom/bbva/document/scanner/PreviewOptions;", "previewOptions", "previewDocument", "Landroid/content/Intent;", "intent", "Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "documentResult", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult;", "previewResult", "Landroid/app/Application;", Constants.APPLICATION, "<init>", "(Landroid/app/Application;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final class DefaultDocumentScanner implements DocumentScanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f29110a;

    public DefaultDocumentScanner(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f29110a = application;
    }

    @Override // com.bbva.document.scanner.DocumentScanner
    @NotNull
    public ScanResult documentResult(@Nullable Intent intent) {
        ScanResult scanResult = intent != null ? (ScanResult) intent.getParcelableExtra("result") : null;
        return scanResult == null ? new ScanResult.ScanError("Error reading scan response") : scanResult;
    }

    @Override // com.bbva.document.scanner.DocumentScanner
    @NotNull
    public DocumentScannerRequest previewDocument(@NotNull PreviewOptions previewOptions) {
        Intrinsics.checkNotNullParameter(previewOptions, "previewOptions");
        return new DocumentScannerRequest(ConstantsKt.createUri(this.f29110a, ConstantsKt.ROUTE_PREVIEW), PreviewDocumentActivity.class, BundleKt.bundleOf(TuplesKt.to("parameters", previewOptions)));
    }

    @Override // com.bbva.document.scanner.DocumentScanner
    @NotNull
    public PreviewResult previewResult(@Nullable Intent intent) {
        PreviewResult previewResult = intent != null ? (PreviewResult) intent.getParcelableExtra("result") : null;
        return previewResult == null ? new PreviewResult.Error("Error reading preview") : previewResult;
    }

    @Override // com.bbva.document.scanner.DocumentScanner
    @NotNull
    public DocumentScannerRequest scanDocument(@NotNull CaptureOptions captureOptions) {
        Intrinsics.checkNotNullParameter(captureOptions, "captureOptions");
        return new DocumentScannerRequest(ConstantsKt.createUri(this.f29110a, ConstantsKt.ROUTE_SCAN), ScanDocumentActivity.class, BundleKt.bundleOf(TuplesKt.to("parameters", captureOptions)));
    }
}
