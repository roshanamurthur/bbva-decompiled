package pd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dasnano.vdvideoselfiecapture.activities.AbstractVideoActivity;

/* JADX INFO: compiled from: AbstractVideoActivity.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractVideoActivity f92633a;

    public a(AbstractVideoActivity abstractVideoActivity) {
        this.f92633a = abstractVideoActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.dasnano.videoFinish".equals(intent.getAction())) {
            this.f92633a.finish();
        }
    }
}
