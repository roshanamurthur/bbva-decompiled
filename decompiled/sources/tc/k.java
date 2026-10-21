package tc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: compiled from: ResourceRecycler.java */
/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f93533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f93534b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: ResourceRecycler.java */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource) message.obj).recycle();
            return true;
        }
    }

    public final synchronized void a(Resource<?> resource, boolean z10) {
        try {
            if (this.f93533a || z10) {
                this.f93534b.obtainMessage(1, resource).sendToTarget();
            } else {
                this.f93533a = true;
                resource.recycle();
                this.f93533a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
