package com.bbva.ocrcard.command;

import android.app.Activity;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ocrcard.command.params.ScanParams;
import io.card.payment.CardIOActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OCRScannable.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/bbva/ocrcard/command/OCRScannable;", "", "canScan", "", ScanDocumentCommand.ID, "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "scanParams", "Lcom/bbva/ocrcard/command/params/ScanParams;", "ocrcard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface OCRScannable {

    /* JADX INFO: compiled from: OCRScannable.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static boolean canScan(@NotNull OCRScannable oCRScannable) {
            Intrinsics.checkNotNullParameter(oCRScannable, "this");
            return CardIOActivity.canReadCardWithCamera();
        }
    }

    boolean canScan();

    void scan(@NotNull Activity activity, @NotNull ScanParams scanParams);
}
