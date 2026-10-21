package com.noknok.android.uaf.framework.service;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.ActivityTracker;
import com.noknok.android.client.utils.IntentQueue;
import com.noknok.android.client.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class MfacIntentActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f63588b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63589a;

    public static class UafProcessorTask extends AsyncTask<MfacIntentActivity, Void, Intent> {
        private final int mActivityId;

        public UafProcessorTask(int i10) {
            this.mActivityId = i10;
        }

        @Override // android.os.AsyncTask
        public Intent doInBackground(MfacIntentActivity... mfacIntentActivityArr) {
            int i10 = MfacIntentActivity.f63588b;
            Logger.i("MfacIntentActivity", "Starting doInBackground");
            ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(mfacIntentActivityArr[0]);
            Intent intentProcessIntent = new UafIntentProcessor().processIntent(activityProxyCreateFromActivity.getIntent(), activityProxyCreateFromActivity.getApplicationContext(), activityProxyCreateFromActivity, false);
            activityProxyCreateFromActivity.finish();
            return intentProcessIntent;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Intent intent) {
            super.onPostExecute(intent);
            int i10 = MfacIntentActivity.f63588b;
            Logger.i("MfacIntentActivity", "Starting onPostExecute");
            IntentQueue.finishRequest();
            ActivityTracker.getActivityTracker().updateActivity(this.mActivityId, new ActivityTracker.SetResultUpdater(intent == null ? 0 : -1, intent));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Logger.i("MfacIntentActivity", "onCreate");
        super.onCreate(bundle);
        if (bundle != null) {
            this.f63589a = bundle.getInt("activityId");
            ActivityTracker.getActivityTracker().onCreateActivity(this.f63589a, this);
        } else {
            this.f63589a = ActivityTracker.getActivityTracker().generateActivityId();
            ActivityTracker.getActivityTracker().onCreateActivity(this.f63589a, this);
            IntentQueue.startRequest();
            new UafProcessorTask(this.f63589a).executeOnExecutor(IntentQueue.getExecutor(), this);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActivityTracker.getActivityTracker().onDestroyActivity(this.f63589a);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("activityId", this.f63589a);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
