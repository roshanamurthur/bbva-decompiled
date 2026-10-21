package com.dasnano.vdphotoselfiecapture.activities;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dasnano.vdphotoselfiecapture.R;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieTutorialFragment;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.veridas.activity.ActivityLifecycleAdapter;
import com.veridas.activity.DasActivity;
import com.veridas.config.InvalidDisplayOrientationException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayOrientation;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class SelfieTutorialActivity extends AbstractActivity {
    public static final String TUTORIAL_FINISHED = "com.veridas.selfieCapture.selfieTutorialActivity.tutorialFinished";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public b f39540r0 = null;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f39541s0 = 1;

    public class a extends ActivityLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onCreated(DasActivity dasActivity, Bundle bundle) {
            SelfieTutorialActivity.this.create();
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onDestroyed(DasActivity dasActivity) {
            SelfieTutorialActivity.this.destroy();
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onPaused(DasActivity dasActivity) {
            SelfieTutorialActivity.this.pause();
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onResumed(DasActivity dasActivity) {
            SelfieTutorialActivity.this.resume();
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.getClass();
            boolean zEquals = action.equals("com.veridas.selfieCapture.selfieTutorialFragment.tutorialFinished");
            SelfieTutorialActivity selfieTutorialActivity = SelfieTutorialActivity.this;
            if (zEquals) {
                boolean booleanExtra = intent.getBooleanExtra("com.veridas.selfieCapture.selfieTutorialFragment.tutorialFinished", true);
                String str = SelfieTutorialActivity.TUTORIAL_FINISHED;
                selfieTutorialActivity.f(booleanExtra);
            } else if (action.equals(VDPhotoSelfieCapture.FORCE_STOP)) {
                String str2 = SelfieTutorialActivity.TUTORIAL_FINISHED;
                selfieTutorialActivity.f(false);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SelfieTutorialActivity.this.finish();
        }
    }

    public SelfieTutorialActivity() {
        addActivityLifecycleListener(new a());
    }

    public void create() {
        try {
            DisplayOrientation displayOrientation = getConfiguration().getDisplayOrientation("screenorientation");
            if (displayOrientation == DisplayOrientation.PORTRAIT) {
                this.f39541s0 = 1;
            } else {
                this.f39541s0 = 0;
            }
            ((VDPhotoSelfieViewModel) this.viewModel).setDisplayOrientation(displayOrientation);
        } catch (InvalidDisplayOrientationException e5) {
            e = e5;
            Log.e("SelfieTutorialActivity", e);
        } catch (PropertyNameNotFoundException e7) {
            e = e7;
            Log.e("SelfieTutorialActivity", e);
        }
        setRequestedOrientation(this.f39541s0);
        setContentView(R.layout.activity_selfie_tutorial);
        this.f39540r0 = new b();
    }

    public void destroy() {
        this.f39540r0 = null;
    }

    public final void f(boolean z10) {
        c cVar = new c();
        Intent intent = new Intent("com.veridas.selfieCapture.selfieTutorialActivity.tutorialFinished");
        intent.putExtra("com.veridas.selfieCapture.selfieTutorialActivity.tutorialFinished", z10);
        broadcastIntent(intent, cVar);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        VDLogger.log(Logger.Tag.CLOSE, "BACK button called in: %s", "SelfieTutorialActivity");
        f(false);
    }

    public void pause() {
        unregisterBroadcastReceiver(this.f39540r0);
        keepScreenAutoOff();
    }

    public void resume() {
        setRequestedOrientation(this.f39541s0);
        keepScreenAutoOn();
        inhibitNfcPopup();
        registerBroadcastReceiver(this.f39540r0, Arrays.asList(VDPhotoSelfieCapture.FORCE_STOP, "com.veridas.selfieCapture.selfieTutorialFragment.tutorialFinished"));
        startSelfieTutorialFragment();
    }

    public void startSelfieTutorialFragment() {
        startFragment(R.id.vd_photo_tutorial_container, new SelfieTutorialFragment());
    }
}
