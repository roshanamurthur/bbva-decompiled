package pd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dasnano.vdvideoselfiecapture.activities.VideoSelfieActivity;
import com.dasnano.vdvideoselfiecapture.activities.VideoTutorialActivity;
import com.dasnano.vdvideoselfiecapture.model.VDVideoSelfieViewModel;
import com.veridas.activity.DasActivity;
import com.veridas.config.Configuration;

/* JADX INFO: compiled from: VideoTutorialActivity.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f92635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoTutorialActivity f92636b;

    public c(VideoTutorialActivity videoTutorialActivity, Configuration configuration) {
        this.f92636b = videoTutorialActivity;
        this.f92635a = configuration;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.veridas.videoSelfieCapture.videoTutorialFragment.TUTORIAL_FINISHED".equals(intent.getAction())) {
            boolean booleanExtra = intent.getBooleanExtra("com.veridas.videoSelfieCapture.videoTutorialFragment.TUTORIAL_FINISHED", false);
            VideoTutorialActivity videoTutorialActivity = this.f92636b;
            if (booleanExtra) {
                VideoSelfieActivity.start(context, this.f92635a, ((VDVideoSelfieViewModel) ((DasActivity) videoTutorialActivity).viewModel).getDocumentType(), ((VDVideoSelfieViewModel) ((DasActivity) videoTutorialActivity).viewModel).getSmartVideo().booleanValue());
                videoTutorialActivity.finish();
                return;
            }
            String str = VideoTutorialActivity.TUTORIAL_FINISHED;
            videoTutorialActivity.getClass();
            d dVar = new d(videoTutorialActivity);
            Intent intent2 = new Intent("com.veridas.videoSelfieCapture.videoTutorialActivity.TUTORIAL_FINISHED");
            intent2.putExtra("com.veridas.videoSelfieCapture.videoTutorialActivity.TUTORIAL_FINISHED", booleanExtra);
            videoTutorialActivity.broadcastIntent(intent2, dVar);
        }
    }
}
