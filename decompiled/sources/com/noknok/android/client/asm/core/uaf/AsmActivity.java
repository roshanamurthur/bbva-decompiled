package com.noknok.android.client.asm.core.uaf;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.uaf.json.ASMResponse;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.ActivityTracker;
import com.noknok.android.client.utils.ExceptionEncoder;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.StrictTypeAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class AsmActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f63234b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63235a;

    public static final class MessageProcessorTask extends AsyncTask<AsmActivity, Void, String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f63236d = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f63237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f63238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f63239c;

        public MessageProcessorTask(String str, String str2, int i10) {
            this.f63237a = str;
            this.f63238b = str2;
            this.f63239c = i10;
        }

        @Override // android.os.AsyncTask
        public String doInBackground(AsmActivity... asmActivityArr) {
            String json;
            AsmActivity asmActivity = asmActivityArr[0];
            if (f63236d) {
                Logger.i(Logger.TAG_CONFIG_REPORTER, String.format("ASMSDK Version : %s", "9.1.0.1100"));
                f63236d = false;
            }
            ActivityProxy activityProxyCreateFromActivity = ActivityProxy.createFromActivity(asmActivity);
            try {
                json = AsmFactory.createAsmInstance(asmActivity.getApplicationContext()).process(this.f63237a, activityProxyCreateFromActivity, this.f63238b);
            } catch (RuntimeException e5) {
                int i10 = AsmActivity.f63234b;
                Logger.e("AsmActivity", String.format("Asm request processing failed on request: %s", this.f63237a), e5);
                ASMResponse aSMResponse = new ASMResponse();
                aSMResponse.setOutcome(Outcome.FAILURE);
                if (aSMResponse.exts == null) {
                    aSMResponse.exts = new ArrayList();
                }
                if (e5 instanceof AsmException) {
                    AsmException asmException = (AsmException) e5;
                    if (asmException.getExtensions() != null) {
                        aSMResponse.exts.addAll(asmException.getExtensions());
                    }
                }
                aSMResponse.exts.add(ExceptionEncoder.createExceptionExtension(e5));
                json = StrictTypeAdapter.GsonBuilder().create().toJson(aSMResponse);
            }
            activityProxyCreateFromActivity.finish();
            return json;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            Intent intent = new Intent();
            if (str != null) {
                intent.putExtra("message", str);
            }
            int i10 = AsmActivity.f63234b;
            Logger.i("AsmActivity", "Send response back via Intent (result = RESULT_OK)");
            ActivityTracker.getActivityTracker().updateActivity(this.f63239c, new ActivityTracker.SetResultUpdater(-1, intent));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("message");
        ComponentName callingActivity = getCallingActivity();
        String packageName = callingActivity != null ? callingActivity.getPackageName() : null;
        if (packageName == null || packageName.equals("")) {
            Logger.e("AsmActivity", "Cannot obtain calling package name. ASM must be called via startActivityForResult.");
            Intent intent = new Intent();
            intent.putExtra("message", "Cannot obtain calling package name. ASM must be called via startActivityForResult.");
            Logger.i("AsmActivity", String.format("Send response back via Intent (result=%s): %s", 0, "Cannot obtain calling package name. ASM must be called via startActivityForResult."));
            setResult(0, intent);
            finish();
            return;
        }
        Logger.i("AsmActivity", String.format("Received request via Intent: %s", stringExtra));
        if (bundle != null) {
            this.f63235a = bundle.getInt("activityId");
            ActivityTracker.getActivityTracker().onCreateActivity(this.f63235a, this);
        } else {
            this.f63235a = ActivityTracker.getActivityTracker().generateActivityId();
            ActivityTracker.getActivityTracker().onCreateActivity(this.f63235a, this);
            new MessageProcessorTask(stringExtra, packageName, this.f63235a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActivityTracker.getActivityTracker().onDestroyActivity(this.f63235a);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("activityId", this.f63235a);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
