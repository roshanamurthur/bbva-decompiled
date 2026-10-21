package com.dasnano.vdvideoselfiecapture.activities;

import android.content.Intent;
import android.os.Bundle;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.dasnano.vdvideoselfiecapture.model.VDVideoSelfieViewModel;
import com.veridas.activity.ActivityLifecycleAdapter;
import com.veridas.activity.DasActivity;
import com.veridas.display.DisplayOrientation;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractVideoActivity extends DasActivity<VDVideoSelfieConfiguration, VDVideoSelfieViewModel> {
    public static final String FINISH_ACTION = "com.dasnano.videoFinish";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public pd.a f39719r0 = null;

    public class a extends ActivityLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onBeforeCreated(DasActivity dasActivity, Bundle bundle) {
            AbstractVideoActivity.f(AbstractVideoActivity.this);
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onCreated(DasActivity dasActivity, Bundle bundle) {
            String str = AbstractVideoActivity.FINISH_ACTION;
            AbstractVideoActivity abstractVideoActivity = AbstractVideoActivity.this;
            abstractVideoActivity.getClass();
            abstractVideoActivity.f39719r0 = new pd.a(abstractVideoActivity);
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onDestroyed(DasActivity dasActivity) {
            AbstractVideoActivity.this.f39719r0 = null;
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onPaused(DasActivity dasActivity) {
            AbstractVideoActivity abstractVideoActivity = AbstractVideoActivity.this;
            abstractVideoActivity.unregisterBroadcastReceiver(abstractVideoActivity.f39719r0);
            abstractVideoActivity.keepScreenAutoOff();
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onResumed(DasActivity dasActivity) {
            String str = AbstractVideoActivity.FINISH_ACTION;
            AbstractVideoActivity abstractVideoActivity = AbstractVideoActivity.this;
            abstractVideoActivity.keepScreenAutoOn();
            abstractVideoActivity.inhibitNfcPopup();
            abstractVideoActivity.registerBroadcastReceiver(abstractVideoActivity.f39719r0, "com.dasnano.videoFinish");
        }
    }

    public AbstractVideoActivity() {
        addActivityLifecycleListener(new a());
    }

    public static void f(AbstractVideoActivity abstractVideoActivity) {
        Intent intent = abstractVideoActivity.getIntent();
        String stringExtra = intent.getStringExtra("com.veridas.videoCapture.KEY_DOCUMENT_TYPE");
        boolean booleanExtra = intent.getBooleanExtra(VideoSelfieActivity.KEY_SMART_VIDEO, false);
        ((VDVideoSelfieViewModel) abstractVideoActivity.viewModel).setDocumentType(stringExtra);
        ((VDVideoSelfieViewModel) abstractVideoActivity.viewModel).setSmartVideo(Boolean.valueOf(booleanExtra));
        DisplayOrientation requiredOrientation = abstractVideoActivity.getRequiredOrientation();
        ((VDVideoSelfieViewModel) abstractVideoActivity.viewModel).setDisplayOrientation(requiredOrientation);
        if (requiredOrientation == DisplayOrientation.PORTRAIT) {
            abstractVideoActivity.setRequestedOrientation(1);
        } else {
            abstractVideoActivity.setRequestedOrientation(0);
        }
    }

    @Override // com.veridas.activity.DasActivity
    public Class<VDVideoSelfieConfiguration> getConfigurationClass() {
        return VDVideoSelfieConfiguration.class;
    }

    public abstract DisplayOrientation getRequiredOrientation();

    @Override // com.veridas.activity.DasActivity
    public Class<VDVideoSelfieViewModel> getViewModelClass() {
        return VDVideoSelfieViewModel.class;
    }
}
