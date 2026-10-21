package kd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dasnano.vddocumentcapture.VDDocumentCapture;
import com.dasnano.vddocumentcapture.activities.DocumentCaptureTutorialActivity;

/* JADX INFO: compiled from: DocumentCaptureTutorialActivity.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DocumentCaptureTutorialActivity f79311a;

    public a(DocumentCaptureTutorialActivity documentCaptureTutorialActivity) {
        this.f79311a = documentCaptureTutorialActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(VDDocumentCapture.FORCE_STOP)) {
            this.f79311a.finish();
        }
    }
}
