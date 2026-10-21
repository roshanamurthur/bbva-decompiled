package com.dasnano.vdvideoselfiecapture.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dasnano.vdvideoselfiecapture.R;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.dasnano.vdvideoselfiecapture.fragments.VideoTutorialFragment;
import com.veridas.activity.ActivityLifecycleAdapter;
import com.veridas.activity.DasActivity;
import com.veridas.config.Configuration;
import com.veridas.config.InvalidDisplayOrientationException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayOrientation;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import pd.c;
import pd.d;

/* JADX INFO: loaded from: classes9.dex */
public abstract class VideoTutorialActivity extends AbstractVideoActivity {
    public static final String TUTORIAL_FINISHED = "com.veridas.videoSelfieCapture.videoTutorialActivity.TUTORIAL_FINISHED";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public c f39723s0 = null;

    public class a extends ActivityLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onCreated(DasActivity dasActivity, Bundle bundle) {
            String str = VideoTutorialActivity.TUTORIAL_FINISHED;
            VideoTutorialActivity videoTutorialActivity = VideoTutorialActivity.this;
            VDVideoSelfieConfiguration configuration = videoTutorialActivity.getConfiguration();
            videoTutorialActivity.setContentView(R.layout.activity_video_tutorial);
            videoTutorialActivity.f39723s0 = new c(videoTutorialActivity, configuration);
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onDestroyed(DasActivity dasActivity) {
            VideoTutorialActivity.this.f39723s0 = null;
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onPaused(DasActivity dasActivity) {
            VideoTutorialActivity videoTutorialActivity = VideoTutorialActivity.this;
            videoTutorialActivity.unregisterBroadcastReceiver(videoTutorialActivity.f39723s0);
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onResumed(DasActivity dasActivity) {
            VideoTutorialActivity videoTutorialActivity = VideoTutorialActivity.this;
            videoTutorialActivity.registerBroadcastReceiver(videoTutorialActivity.f39723s0, "com.veridas.videoSelfieCapture.videoTutorialFragment.TUTORIAL_FINISHED");
            videoTutorialActivity.startVideoTutorialFragment();
        }
    }

    public VideoTutorialActivity() {
        addActivityLifecycleListener(new a());
    }

    public static void start(Context context, Configuration configuration, String str, boolean z10) {
        try {
            Intent intent = new Intent(context, (Class<?>) (configuration.getDisplayOrientation("screenorientation") == DisplayOrientation.PORTRAIT ? PortraitVideoTutorialActivity.class : LandscapeVideoTutorialActivity.class));
            intent.putExtra("com.veridas.videoCapture.KEY_DOCUMENT_TYPE", str);
            intent.putExtra(VideoSelfieActivity.KEY_SMART_VIDEO, z10);
            DasActivity.startActivity(context, intent, configuration);
        } catch (InvalidDisplayOrientationException e5) {
            e = e5;
            Log.e("VideoTutorialActivity", e);
        } catch (PropertyNameNotFoundException e7) {
            e = e7;
            Log.e("VideoTutorialActivity", e);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        VDLogger.log(Logger.Tag.CLOSE, "BACK button called in: %s", "VideoTutorialActivity");
        d dVar = new d(this);
        Intent intent = new Intent("com.veridas.videoSelfieCapture.videoTutorialActivity.TUTORIAL_FINISHED");
        intent.putExtra("com.veridas.videoSelfieCapture.videoTutorialActivity.TUTORIAL_FINISHED", false);
        broadcastIntent(intent, dVar);
    }

    public void startVideoTutorialFragment() {
        startFragment(R.id.id_video_tutorial_container, new VideoTutorialFragment());
    }
}
