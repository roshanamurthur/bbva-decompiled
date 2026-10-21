package com.bbva.ocrcard;

import android.app.Activity;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ocrcard.command.OCRScannable;
import com.bbva.ocrcard.command.ScanCommand;
import com.bbva.ocrcard.command.params.ScanParams;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OCRCardManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017¨\u0006\t"}, d2 = {"Lcom/bbva/ocrcard/OCRCardManager;", "Lcom/bbva/ocrcard/command/OCRScannable;", "()V", ScanDocumentCommand.ID, "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "scanParams", "Lcom/bbva/ocrcard/command/params/ScanParams;", "ocrcard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OCRCardManager implements OCRScannable {
    @Override // com.bbva.ocrcard.command.OCRScannable
    public boolean canScan() {
        return OCRScannable.DefaultImpls.canScan(this);
    }

    @Override // com.bbva.ocrcard.command.OCRScannable
    @Deprecated(message = "This method is now deprecated, you should use the ScannerActivityContract\n        |with the registerForActivityResult method.\n        |\n        | val scanLauncher = registerForActivityResult(OCRActivityContract()){ result -> ... }\n        | scanlauncher.launch(scanParams)\n    ")
    public void scan(@NotNull Activity activity, @NotNull ScanParams scanParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scanParams, "scanParams");
        new ScanCommand().scan(activity, scanParams);
    }
}
