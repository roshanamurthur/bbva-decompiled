package com.bbva.document.scanner;

import android.content.Intent;
import com.bbva.document.scanner.presentation.DocumentScannerRequest;
import com.bbva.document.scanner.presentation.capture.ScanResult;
import com.bbva.document.scanner.presentation.preview.PreviewResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DocumentScanner.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/bbva/document/scanner/DocumentScanner;", "", "documentResult", "Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "intent", "Landroid/content/Intent;", "previewDocument", "Lcom/bbva/document/scanner/presentation/DocumentScannerRequest;", "previewOptions", "Lcom/bbva/document/scanner/PreviewOptions;", "previewResult", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult;", "scanDocument", "captureOptions", "Lcom/bbva/document/scanner/CaptureOptions;", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DocumentScanner {
    @NotNull
    ScanResult documentResult(@Nullable Intent intent);

    @NotNull
    DocumentScannerRequest previewDocument(@NotNull PreviewOptions previewOptions);

    @NotNull
    PreviewResult previewResult(@Nullable Intent intent);

    @NotNull
    DocumentScannerRequest scanDocument(@NotNull CaptureOptions captureOptions);
}
