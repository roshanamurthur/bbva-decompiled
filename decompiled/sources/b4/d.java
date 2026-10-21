package b4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.akamai.botman.ap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayList<Pair<String, Long>> f24784p0;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList<Pair<String, Long>> arrayList = this.f24784p0;
        if (arrayList.size() < 10) {
            arrayList.add(new Pair<>("2", Long.valueOf(System.currentTimeMillis())));
        }
        ap.a("BackgroundEventManager", "Activity paused: " + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ArrayList<Pair<String, Long>> arrayList = this.f24784p0;
        if (arrayList.size() < 10) {
            arrayList.add(new Pair<>(ExifInterface.GPS_MEASUREMENT_3D, Long.valueOf(System.currentTimeMillis())));
        }
        ap.a("BackgroundEventManager", "Activity resumed: " + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
