package com.dasnano.vddocumentcapture.activities;

import com.veridas.display.DisplayOrientation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PortraitDocumentClassificationActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"Lcom/dasnano/vddocumentcapture/activities/PortraitDocumentClassificationActivity;", "Lcom/dasnano/vddocumentcapture/activities/DocumentClassificationActivity;", "()V", "getRequiredDisplayOrientation", "Lcom/veridas/display/DisplayOrientation;", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PortraitDocumentClassificationActivity extends DocumentClassificationActivity {
    @Override // com.dasnano.vddocumentcapture.activities.AbstractActivity
    @NotNull
    public DisplayOrientation getRequiredDisplayOrientation() {
        return DisplayOrientation.PORTRAIT;
    }
}
