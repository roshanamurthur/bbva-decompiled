package com.dasnano.vddocumentcapture.fragments;

import com.dasnano.vddocumentcapture.document.DocumentFace;

/* JADX INFO: compiled from: DocumentFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DocumentFragment f39376p0;

    public l(DocumentFragment documentFragment) {
        this.f39376p0 = documentFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = DocumentFragment.CAMERA_FAILURE;
        DocumentFragment documentFragment = this.f39376p0;
        documentFragment.getClass();
        documentFragment.runOnUiThread(new i(documentFragment));
        documentFragment.userVisualHelpManager.setHelpText(null);
        documentFragment.userVisualHelpManager.setTextToShow(documentFragment.configReverseNotFoundText);
        if (documentFragment.mDocumentType.d() == 1) {
            documentFragment.userVisualHelpManager.drawDocumentHelpTemplate((String) documentFragment.mDocumentType.b(), DocumentFace.REVERSE, documentFragment.mReferenceRect, documentFragment.getBlockingResourcesDatabaseLazy());
        }
        documentFragment.w();
    }
}
