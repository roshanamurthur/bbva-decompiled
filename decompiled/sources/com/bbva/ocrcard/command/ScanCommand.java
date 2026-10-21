package com.bbva.ocrcard.command;

import android.app.Activity;
import android.content.Intent;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ocrcard.command.params.ScanParams;
import com.bbva.ocrcard.extension.ScanParamsKt;
import io.card.payment.CardIOActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScanCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/bbva/ocrcard/command/ScanCommand;", "", "()V", ScanDocumentCommand.ID, "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "params", "Lcom/bbva/ocrcard/command/params/ScanParams;", "Companion", "ocrcard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ScanCommand {
    public static final int REQUEST_SCAN = 1125;

    public final void scan(@NotNull Activity activity, @NotNull ScanParams params) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        Intent intent = new Intent(activity, (Class<?>) CardIOActivity.class);
        intent.putExtras(ScanParamsKt.toIntent(params));
        activity.startActivityForResult(intent, REQUEST_SCAN);
    }
}
