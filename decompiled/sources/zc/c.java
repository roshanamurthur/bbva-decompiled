package zc;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: FirstFrameWaiter.java */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(26)
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Activity> f95021a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f95022b;

    /* JADX INFO: compiled from: FirstFrameWaiter.java */
    public class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ View f95023p0;

        /* JADX INFO: renamed from: zc.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FirstFrameWaiter.java */
        public class RunnableC0514a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f95025p0;

            public RunnableC0514a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f95025p0 = onDrawListener;
            }

            @Override // java.lang.Runnable
            public final void run() {
                HardwareConfigState.getInstance().unblockHardwareBitmaps();
                c.this.f95022b = true;
                View view = a.this.f95023p0;
                view.getViewTreeObserver().removeOnDrawListener(this.f95025p0);
                c.this.f95021a.clear();
            }
        }

        public a(View view) {
            this.f95023p0 = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            Util.postOnUiThread(new RunnableC0514a(this));
        }
    }

    @Override // zc.d
    public final void a(Activity activity) {
        if (!this.f95022b && this.f95021a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
