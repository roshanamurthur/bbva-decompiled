package com.dasnano.vddocumentcapture.fragments;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: DocumentCaptureTutorialFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DocumentCaptureTutorialFragment f39360p0;

    public b(DocumentCaptureTutorialFragment documentCaptureTutorialFragment) {
        this.f39360p0 = documentCaptureTutorialFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = DocumentCaptureTutorialFragment.TUTORIAL_FINISHED;
        DocumentCaptureTutorialFragment documentCaptureTutorialFragment = this.f39360p0;
        FragmentActivity activity = documentCaptureTutorialFragment.getActivity();
        Intent intent = new Intent("com.veridas.documentCapture.documentTutorialFragment.tutorialFinished");
        intent.putExtra("com.veridas.documentCapture.documentTutorialFragment.tutorialFinished", false);
        documentCaptureTutorialFragment.broadcastIntent(intent, new c(activity));
    }
}
