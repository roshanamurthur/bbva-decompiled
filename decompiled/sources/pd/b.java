package pd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dasnano.vdvideoselfiecapture.activities.VideoSelfieActivity;
import com.dasnano.vdvideoselfiecapture.fragments.VideoFragment;

/* JADX INFO: compiled from: VideoSelfieActivity.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoSelfieActivity f92634a;

    public b(VideoSelfieActivity videoSelfieActivity) {
        this.f92634a = videoSelfieActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        boolean zEquals = action.equals(VideoFragment.VIDEO_FRAGMENT_FINISHED);
        VideoSelfieActivity videoSelfieActivity = this.f92634a;
        if (zEquals) {
            boolean booleanExtra = intent.getBooleanExtra(VideoFragment.VIDEO_FRAGMENT_FINISHED, false);
            String str = VideoSelfieActivity.KEY_DOCUMENT_TYPE;
            videoSelfieActivity.getClass();
            Intent intent2 = new Intent(VideoSelfieActivity.CAPTURE_FINISHED);
            intent2.putExtra(VideoSelfieActivity.CAPTURE_FINISHED, booleanExtra);
            videoSelfieActivity.broadcastIntent(intent2);
            videoSelfieActivity.finish();
            return;
        }
        if (action.equals("com.veridas.videoSelfieCapture.videoFragment.VIDEO_CAPTURED")) {
            String stringExtra = intent.getStringExtra("com.veridas.videoSelfieCapture.videoFragment.VIDEO_CAPTURED");
            String str2 = VideoSelfieActivity.KEY_DOCUMENT_TYPE;
            videoSelfieActivity.getClass();
            Intent intent3 = new Intent(VideoSelfieActivity.VIDEO_CAPTURED);
            intent3.putExtra(VideoSelfieActivity.VIDEO_CAPTURED, stringExtra);
            videoSelfieActivity.broadcastIntent(intent3);
        }
    }
}
