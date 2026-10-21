package com.dasnano.vddocumentcapture.fragments;

/* JADX INFO: compiled from: DocumentFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f39374p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DocumentFragment f39375q0;

    public k(DocumentFragment documentFragment, int i10) {
        this.f39375q0 = documentFragment;
        this.f39374p0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DocumentFragment documentFragment = this.f39375q0;
        if (documentFragment.getGenericDocumentState().isSearching) {
            boolean z10 = documentFragment.mShutterButtonTimeIsFinished.get();
            int i10 = this.f39374p0;
            if (z10 && documentFragment.mShutterButton.getVisibility() == 8 && i10 < 25) {
                documentFragment.disableTextViewHelp();
                documentFragment.enableCameraButton();
                documentFragment.mShutterButton.setVisibility(0);
            }
            if (z10 && documentFragment.mShutterButton.getVisibility() == 0 && i10 > 80) {
                documentFragment.disableCameraButton();
            }
        }
    }
}
