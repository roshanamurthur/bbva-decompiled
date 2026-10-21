package com.dasnano.vddocumentcapture.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dasnano.vddocumentcapture.R;
import com.dasnano.vddocumentcapture.VDDocumentCapture;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.dasnano.vddocumentcapture.fragments.DocumentCaptureTutorialFragment;
import com.veridas.activity.ActivityLifecycleAdapter;
import com.veridas.activity.DasActivity;
import com.veridas.config.Configuration;
import com.veridas.config.InvalidDisplayOrientationException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayOrientation;
import com.veridas.log.Log;
import kd.b;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DocumentCaptureTutorialActivity extends AbstractActivity {
    public static final String TAG = "DocumentCaptureTutorialActivity";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public kd.a f39295r0;

    public class a extends ActivityLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onCreated(DasActivity dasActivity, Bundle bundle) {
            DocumentCaptureTutorialActivity.this.created();
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onDestroyed(DasActivity dasActivity) {
            DocumentCaptureTutorialActivity.this.destroyed();
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onPaused(DasActivity dasActivity) {
            DocumentCaptureTutorialActivity documentCaptureTutorialActivity = DocumentCaptureTutorialActivity.this;
            documentCaptureTutorialActivity.unregisterBroadcastReceiver(documentCaptureTutorialActivity.f39295r0);
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onResumed(DasActivity dasActivity) {
            DocumentCaptureTutorialActivity documentCaptureTutorialActivity = DocumentCaptureTutorialActivity.this;
            documentCaptureTutorialActivity.registerBroadcastReceiver(documentCaptureTutorialActivity.f39295r0, VDDocumentCapture.FORCE_STOP);
        }
    }

    public DocumentCaptureTutorialActivity() {
        addActivityLifecycleListener(new a());
    }

    public static void start(Context context, Configuration configuration) {
        try {
            DasActivity.startActivity(context, (Class<?>) (configuration.getDisplayOrientation(VDDocumentConfiguration.TUTORIAL_SCREEN_ORIENTATION) == DisplayOrientation.PORTRAIT ? PortraitDocumentCaptureTutorialActivity.class : LandscapeDocumentCaptureTutorialActivity.class), configuration);
        } catch (InvalidDisplayOrientationException e5) {
            e = e5;
            Log.e(TAG, e);
        } catch (PropertyNameNotFoundException e7) {
            e = e7;
            Log.e(TAG, e);
        }
    }

    public void created() {
        setContentView(R.layout.activity_document_capture_tutorial);
        this.f39295r0 = new kd.a(this);
        startFragment(R.id.vd_document_document_tutorial_container, new DocumentCaptureTutorialFragment());
    }

    public void destroyed() {
        this.f39295r0 = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent("com.veridas.documentCapture.documentTutorialFragment.tutorialFinished");
        intent.putExtra("com.veridas.documentCapture.documentTutorialFragment.tutorialFinished", false);
        broadcastIntent(intent, new b(this));
    }
}
