package com.dasnano.vdphotoselfiecapture.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dasnano.vdphotoselfiecapture.R;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.dasnano.vdphotoselfiecapture.fragments.ShowSelfieFragment;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.veridas.activity.ActivityLifecycleAdapter;
import com.veridas.activity.DasActivity;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayOrientation;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public abstract class SelfieActivity extends AbstractActivity {
    public static final String CHALLENGE_CAPTURED = "com.dasnano.selfieCapture.selfieActivity.challengeCaptured";
    public static final String CHALLENGE_TO_BE_REPEATED = "com.dasnano.selfieCapture.selfieActivity.challengeRepeated";
    public static final String CHALLENGE_VIDEO_PATH = "com.dasnano.selfieCapture.selfieActivity.challengeCaptured.video";
    public static final String CHALLENGE_VTT = "com.dasnano.selfieCapture.selfieActivity.challengeCaptured.vtt";
    public static final String FRAME_CAPTURED = "com.dasnano.selfieCapture.selfieActivity.frameCaptured";
    public static final String FRAME_FACE_PATH = "com.dasnano.selfieCapture.selfieActivity.frameCaptured.face";
    public static final String FRAME_SELFIE_PATH = "com.dasnano.selfieCapture.selfieActivity.frameCaptured.selfie";
    public static final String PHOTO_CAPTURED = "com.dasnano.selfieCapture.selfieActivity.photoCaptured";
    public static final String PHOTO_FACE_PATH = "com.dasnano.selfieCapture.selfieActivity.photoCaptured.face";
    public static final String PHOTO_SELFIE_PATH = "com.dasnano.selfieCapture.selfieActivity.photoCaptured.selfie";
    public static final String SELFIE_FINISHED = "com.dasnano.selfieCapture.selfieActivity.finished";
    public static final String SELFIE_TO_BE_REPEATED = "com.dasnano.selfieCapture.selfieActivity.repeated";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f39533r0 = false;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f39534s0 = false;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public nd.a f39535t0;

    public class a extends ActivityLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onBeforeCreated(DasActivity dasActivity, Bundle bundle) {
            SelfieActivity.f(SelfieActivity.this);
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onCreated(DasActivity dasActivity, Bundle bundle) {
            String str = SelfieActivity.SELFIE_TO_BE_REPEATED;
            SelfieActivity selfieActivity = SelfieActivity.this;
            VDPhotoSelfieConfiguration configuration = selfieActivity.getConfiguration();
            selfieActivity.setContentView(R.layout.activity_selfie);
            try {
                selfieActivity.f39533r0 = configuration.getBoolean(VDPhotoSelfieConfiguration.LIVE_PHOTO);
                selfieActivity.f39534s0 = selfieActivity.getConfiguration().getBoolean(VDPhotoSelfieConfiguration.SHOW_SELFIE);
            } catch (PropertyNameNotFoundException e5) {
                Log.e("SelfieActivity", e5);
            }
            selfieActivity.f39535t0 = new nd.a(selfieActivity);
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onDestroyed(DasActivity dasActivity) {
            SelfieActivity.this.f39535t0 = null;
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onPaused(DasActivity dasActivity) {
            SelfieActivity selfieActivity = SelfieActivity.this;
            selfieActivity.unregisterBroadcastReceiver(selfieActivity.f39535t0);
            selfieActivity.keepScreenAutoOff();
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onResumed(DasActivity dasActivity) {
            SelfieActivity.i(SelfieActivity.this);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SelfieFragment selfieFragment = new SelfieFragment();
            SelfieActivity selfieActivity = SelfieActivity.this;
            FragmentManager supportFragmentManager = selfieActivity.getSupportFragmentManager();
            int i10 = R.id.vd_photo_container;
            Fragment fragmentFindFragmentById = supportFragmentManager.findFragmentById(i10);
            ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).setCurrentAction(SelfieFragment.class);
            if (fragmentFindFragmentById == null || fragmentFindFragmentById.getClass() != SelfieFragment.class) {
                selfieActivity.startFragment(i10, selfieFragment);
            } else {
                supportFragmentManager.beginTransaction().replace(i10, selfieFragment).commit();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ShowSelfieFragment showSelfieFragment = new ShowSelfieFragment();
            SelfieActivity selfieActivity = SelfieActivity.this;
            FragmentManager supportFragmentManager = selfieActivity.getSupportFragmentManager();
            int i10 = R.id.vd_photo_container;
            Fragment fragmentFindFragmentById = supportFragmentManager.findFragmentById(i10);
            ((VDPhotoSelfieViewModel) ((DasActivity) selfieActivity).viewModel).setCurrentAction(ShowSelfieFragment.class);
            if (fragmentFindFragmentById.getClass() == ShowSelfieFragment.class) {
                return;
            }
            selfieActivity.startFragment(i10, showSelfieFragment);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SelfieActivity.this.finish();
        }
    }

    public SelfieActivity() {
        addActivityLifecycleListener(new a());
    }

    public static void f(SelfieActivity selfieActivity) {
        DisplayOrientation requiredDisplayOrientation = selfieActivity.getRequiredDisplayOrientation();
        ((VDPhotoSelfieViewModel) selfieActivity.viewModel).setDisplayOrientation(requiredDisplayOrientation);
        if (requiredDisplayOrientation == DisplayOrientation.PORTRAIT) {
            selfieActivity.setRequestedOrientation(1);
        } else {
            selfieActivity.setRequestedOrientation(0);
        }
    }

    public static void g(SelfieActivity selfieActivity, String str, String str2) {
        selfieActivity.getClass();
        Intent intent = new Intent(PHOTO_CAPTURED);
        intent.putExtra(PHOTO_SELFIE_PATH, str);
        intent.putExtra(PHOTO_FACE_PATH, str2);
        selfieActivity.broadcastIntent(intent);
    }

    public static void h(SelfieActivity selfieActivity) {
        ((VDPhotoSelfieViewModel) selfieActivity.viewModel).setCurrentAction(null);
    }

    public static void i(SelfieActivity selfieActivity) {
        selfieActivity.keepScreenAutoOn();
        selfieActivity.inhibitNfcPopup();
        selfieActivity.registerBroadcastReceiver(selfieActivity.f39535t0, Arrays.asList(VDPhotoSelfieCapture.FORCE_STOP, SelfieFragment.CHALLENGE_CAPTURED, "com.dasnano.selfieCapture.selfieFragment.challengeRepeated", SelfieFragment.FRAME_CAPTURED, SelfieFragment.PHOTO_CAPTURED, SelfieFragment.SELFIE_FINISHED, "com.dasnano.selfieCapture.showSelfieFragment.finished"));
        Class<?> currentAction = ((VDPhotoSelfieViewModel) selfieActivity.viewModel).getCurrentAction();
        if (currentAction == null || currentAction.equals(SelfieFragment.class)) {
            selfieActivity.requestSelfieFragment();
        } else if (currentAction.equals(ShowSelfieFragment.class)) {
            selfieActivity.requestShowSelfieFragment();
        }
    }

    public abstract DisplayOrientation getRequiredDisplayOrientation();

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        Fragment fragmentFindFragmentById;
        if (((VDPhotoSelfieViewModel) this.viewModel).getCurrentAction() == SelfieFragment.class && (fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.vd_photo_container)) != null && fragmentFindFragmentById.getClass() == SelfieFragment.class) {
            ((SelfieFragment) fragmentFindFragmentById).forceIsRunningToFalse();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.popBackStackImmediate()) {
            if (supportFragmentManager.getBackStackEntryCount() <= 0) {
                VDLogger.log(Logger.Tag.CLOSE, VDPhotoSelfieCapture.LOG_TAG_ON_BACK_PRESSED);
                x(false);
            } else {
                VDLogger.log(Logger.Tag.REPEAT, VDPhotoSelfieCapture.LOG_TAG_REPEAT);
                Intent intent = new Intent("com.dasnano.selfieCapture.showSelfieFragment.finished");
                intent.putExtra("com.dasnano.selfieCapture.showSelfieFragment.finished", false);
                broadcastIntent(intent);
            }
        }
    }

    public void requestSelfieFragment() {
        runOnUiThread(new b());
    }

    public void requestShowSelfieFragment() {
        runOnUiThread(new c());
    }

    public final void x(boolean z10) {
        Intent intent = new Intent(SELFIE_FINISHED);
        intent.putExtra(SELFIE_FINISHED, z10);
        broadcastIntent(intent, new d());
    }
}
