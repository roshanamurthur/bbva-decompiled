package pd;

import com.dasnano.vdvideoselfiecapture.activities.VideoTutorialActivity;

/* JADX INFO: compiled from: VideoTutorialActivity.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VideoTutorialActivity f92637p0;

    public d(VideoTutorialActivity videoTutorialActivity) {
        this.f92637p0 = videoTutorialActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92637p0.finish();
    }
}
