package com.bbva.glomohybrid.base.file.channels;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.ipsoft.amelia.sdk.internal.c.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileInteractions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002¨\u0006\t"}, d2 = {"toGenericPdfOperation", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$PdfDocument;", "Landroid/os/Bundle;", "toMonthlyOperation", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$Monthly;", "toReceiptOperation", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$Receipt;", "toTermsAndConditionsOperation", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$TermsAndConditions;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FileInteractionsKt {
    @NotNull
    public static final FileInteraction.PdfDocument toGenericPdfOperation(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        String string = bundle.getString("id", "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = bundle.getString("path", "");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new FileInteraction.PdfDocument(string, string2);
    }

    @NotNull
    public static final FileInteraction.Monthly toMonthlyOperation(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        String string = bundle.getString("id", "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = bundle.getString("path", "");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new FileInteraction.Monthly(string, string2);
    }

    @NotNull
    public static final FileInteraction.Receipt toReceiptOperation(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        String string = bundle.getString("id", "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = bundle.getString(c.f84805j, "");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new FileInteraction.Receipt(string, string2);
    }

    @NotNull
    public static final FileInteraction.TermsAndConditions toTermsAndConditionsOperation(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        String string = bundle.getString("id", "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = bundle.getString("name", "");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new FileInteraction.TermsAndConditions(string, string2);
    }
}
