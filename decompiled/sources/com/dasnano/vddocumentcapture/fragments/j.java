package com.dasnano.vddocumentcapture.fragments;

import android.view.View;
import android.widget.Button;
import com.dasnano.vddocumentcapture.GenericDocumentState;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;

/* JADX INFO: compiled from: DocumentFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Button f39372p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DocumentFragment f39373q0;

    public j(DocumentFragment documentFragment, Button button) {
        this.f39373q0 = documentFragment;
        this.f39372p0 = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VDLogger.log(Logger.Tag.DOCUMENT_CAPTURED_WITH_BUTTON, "true");
        DocumentFragment documentFragment = this.f39373q0;
        if (documentFragment.getGenericDocumentState() == GenericDocumentState.SEARCHING_OBVERSE) {
            documentFragment.mPictureWithButtonIsShowing = true;
            documentFragment.mShutterButtonMessageIsShowing = true;
        }
        this.f39372p0.setVisibility(8);
        documentFragment.disableCameraButton();
        documentFragment.takeFirstPicture();
    }
}
