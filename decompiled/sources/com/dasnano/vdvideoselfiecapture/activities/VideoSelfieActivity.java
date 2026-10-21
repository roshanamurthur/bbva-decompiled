package com.dasnano.vdvideoselfiecapture.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dasnano.vdvideoselfiecapture.R;
import com.dasnano.vdvideoselfiecapture.fragments.VideoFragment;
import com.veridas.activity.ActivityLifecycleAdapter;
import com.veridas.activity.DasActivity;
import com.veridas.config.Configuration;
import com.veridas.config.InvalidDisplayOrientationException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayOrientation;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import java.util.Arrays;
import pd.b;

/* JADX INFO: loaded from: classes9.dex */
public abstract class VideoSelfieActivity extends AbstractVideoActivity {
    public static final String CAPTURE_FINISHED = "com.veridas.videoSelfieCapture.videoActivity.CAPTURE_FINISHED";
    public static final String KEY_DOCUMENT_TYPE = "com.veridas.videoCapture.KEY_DOCUMENT_TYPE";
    public static final String KEY_SMART_VIDEO = "com.veridas.videoCapture.SMART_VIDEO";
    public static final String VIDEO_CAPTURED = "com.veridas.videoSelfieCapture.videoActivity.VIDEO_CAPTURED";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f39721s0 = null;

    public class a extends ActivityLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onCreated(DasActivity dasActivity, Bundle bundle) {
            String str = VideoSelfieActivity.KEY_DOCUMENT_TYPE;
            int i10 = R.layout.activity_video_selfie;
            VideoSelfieActivity videoSelfieActivity = VideoSelfieActivity.this;
            videoSelfieActivity.setContentView(i10);
            videoSelfieActivity.f39721s0 = new b(videoSelfieActivity);
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onDestroyed(DasActivity dasActivity) {
            VideoSelfieActivity.this.f39721s0 = null;
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onPaused(DasActivity dasActivity) {
            VideoSelfieActivity videoSelfieActivity = VideoSelfieActivity.this;
            videoSelfieActivity.unregisterBroadcastReceiver(videoSelfieActivity.f39721s0);
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onResumed(DasActivity dasActivity) {
            VideoSelfieActivity videoSelfieActivity = VideoSelfieActivity.this;
            videoSelfieActivity.registerBroadcastReceiver(videoSelfieActivity.f39721s0, Arrays.asList("com.veridas.videoSelfieCapture.videoFragment.VIDEO_CAPTURED", VideoFragment.VIDEO_FRAGMENT_FINISHED));
            videoSelfieActivity.requestVideoFragment();
        }
    }

    public VideoSelfieActivity() {
        addActivityLifecycleListener(new a());
    }

    public static void start(Context context, Configuration configuration, String str, boolean z10) {
        try {
            Intent intent = new Intent(context, (Class<?>) (configuration.getDisplayOrientation("screenorientation") == DisplayOrientation.PORTRAIT ? PortraitVideoSelfieActivity.class : LandscapeVideoSelfieActivity.class));
            intent.putExtra("com.veridas.videoCapture.KEY_DOCUMENT_TYPE", str);
            intent.putExtra(KEY_SMART_VIDEO, z10);
            DasActivity.startActivity(context, intent, configuration);
        } catch (InvalidDisplayOrientationException e5) {
            e = e5;
            Log.e("VideoSelfieActivity", e);
        } catch (PropertyNameNotFoundException e7) {
            e = e7;
            Log.e("VideoSelfieActivity", e);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        VideoFragment videoFragment = (VideoFragment) getSupportFragmentManager().findFragmentById(R.id.vd_video_container);
        if (videoFragment != null) {
            videoFragment.forceIsRunningToFalse();
        }
        VDLogger.log(Logger.Tag.CLOSE, "BACK button called in: %s", "VideoSelfieActivity");
        Intent intent = new Intent(CAPTURE_FINISHED);
        intent.putExtra(CAPTURE_FINISHED, false);
        broadcastIntent(intent);
        finish();
    }

    public void requestVideoFragment() {
        VideoFragment videoFragment = new VideoFragment();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i10 = R.id.vd_video_container;
        Fragment fragmentFindFragmentById = supportFragmentManager.findFragmentById(i10);
        if (fragmentFindFragmentById == null || fragmentFindFragmentById.getClass() != VideoFragment.class) {
            startFragment(i10, videoFragment);
        } else {
            supportFragmentManager.beginTransaction().replace(i10, videoFragment).commit();
        }
    }
}
