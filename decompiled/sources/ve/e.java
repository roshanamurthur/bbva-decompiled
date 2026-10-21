package ve;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.play.core.review.internal.zzt;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzt f94045a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzt zztVar = this.f94045a;
        zztVar.f46218b.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zztVar.zzc().post(new c(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzt zztVar = this.f94045a;
        zztVar.f46218b.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zztVar.zzc().post(new d(this));
    }
}
