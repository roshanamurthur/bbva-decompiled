package kd;

import com.dasnano.vddocumentcapture.activities.DocumentCaptureTutorialActivity;

/* JADX INFO: compiled from: DocumentCaptureTutorialActivity.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DocumentCaptureTutorialActivity f79312p0;

    public b(DocumentCaptureTutorialActivity documentCaptureTutorialActivity) {
        this.f79312p0 = documentCaptureTutorialActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f79312p0.finish();
    }
}
