package com.bbva.document.scanner.plugin.launcher;

import android.app.Activity;
import com.bbva.document.scanner.CaptureOptions;
import com.bbva.document.scanner.PreviewOptions;
import com.bbva.document.scanner.presentation.capture.ScanResult;
import com.bbva.document.scanner.presentation.preview.PreviewResult;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentScannerActivityLauncher.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH\u0016J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/document/scanner/plugin/launcher/DocumentScannerActivityLauncher;", "", "previewDocument", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "options", "Lcom/bbva/document/scanner/PreviewOptions;", "onResult", "Lkotlin/Function1;", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult;", "scanDocument", "Lcom/bbva/document/scanner/CaptureOptions;", "Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DocumentScannerActivityLauncher {

    /* JADX INFO: compiled from: DocumentScannerActivityLauncher.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void previewDocument(@NotNull DocumentScannerActivityLauncher documentScannerActivityLauncher, @NotNull Activity activity, @NotNull PreviewOptions options, @NotNull Function1<? super PreviewResult, Unit> onResult) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(onResult, "onResult");
        }

        public static void scanDocument(@NotNull DocumentScannerActivityLauncher documentScannerActivityLauncher, @NotNull Activity activity, @NotNull CaptureOptions options, @NotNull Function1<? super ScanResult, Unit> onResult) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(onResult, "onResult");
        }
    }

    void previewDocument(@NotNull Activity activity, @NotNull PreviewOptions options, @NotNull Function1<? super PreviewResult, Unit> onResult);

    void scanDocument(@NotNull Activity activity, @NotNull CaptureOptions options, @NotNull Function1<? super ScanResult, Unit> onResult);
}
