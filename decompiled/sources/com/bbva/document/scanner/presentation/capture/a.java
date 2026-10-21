package com.bbva.document.scanner.presentation.capture;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ScanDocumentActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Lambda implements Function1<ScanDocumentState, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ScanDocumentActivity f29189p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ScanDocumentActivity scanDocumentActivity) {
        super(1);
        this.f29189p0 = scanDocumentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ScanDocumentState scanDocumentState) {
        ScanDocumentState scanDocumentState2 = scanDocumentState;
        boolean z10 = scanDocumentState2 instanceof ScanDocumentState.Standby;
        ScanDocumentActivity scanDocumentActivity = this.f29189p0;
        if (z10) {
            scanDocumentActivity.i().frame.setHighlight(false);
        } else if (scanDocumentState2 instanceof ScanDocumentState.Loading) {
            ScanDocumentActivity.access$loadingToast(scanDocumentActivity, true);
            scanDocumentActivity.i().frame.setHighlight(true);
            scanDocumentActivity.i().takePhoto.setEnabled(false);
        } else if (scanDocumentState2 instanceof ScanDocumentState.Completed) {
            ScanDocumentActivity.access$loadingToast(scanDocumentActivity, false);
            ScanDocumentActivity.access$onScanResult(scanDocumentActivity, ((ScanDocumentState.Completed) scanDocumentState2).getScanResult());
        } else if (scanDocumentState2 instanceof ScanDocumentState.Error) {
            ScanDocumentActivity.access$loadingToast(scanDocumentActivity, false);
            ScanDocumentActivity.access$onScanResult(scanDocumentActivity, ((ScanDocumentState.Error) scanDocumentState2).getScanResult());
        }
        return Unit.INSTANCE;
    }
}
