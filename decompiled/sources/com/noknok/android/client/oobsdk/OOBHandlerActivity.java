package com.noknok.android.client.oobsdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.JsonParser;
import com.noknok.android.client.appsdk.AppSDK2;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.IProgressObserver;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.ProgressObserverFactory;

/* JADX INFO: loaded from: classes11.dex */
public class OOBHandlerActivity extends AppCompatActivity {
    public static final String TAG = "OOBHandlerActivity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IProgressObserver f63359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OobReceiver.MessageType f63360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActivityProxy f63362d = null;

    public class OOBCompletionListener implements OobReceiver.ICompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OobReceiver.ICompletionListener f63363a;

        public OOBCompletionListener(OobReceiver.ICompletionListener iCompletionListener) {
            this.f63363a = iCompletionListener;
        }

        @Override // com.noknok.android.client.oobsdk.OobReceiver.ICompletionListener
        public final /* synthetic */ void onComplete(Activity activity, ResultType resultType, String str, AppSDK2.Operation operation) {
            c.a(this, activity, resultType, str, operation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:25:0x0038  */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if (r4 != com.noknok.android.client.appsdk.ResultType.CANCELED) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(com.noknok.android.client.appsdk.ResultType r4, com.noknok.android.client.appsdk.AppSDK2.Operation r5, com.noknok.android.client.utils.ActivityProxy r6, android.app.Activity r7) {
            /*
                r3 = this;
                com.noknok.android.client.oobsdk.OOBHandlerActivity r7 = com.noknok.android.client.oobsdk.OOBHandlerActivity.this
                r7.getClass()
                r0 = 0
                if (r4 != 0) goto L9
                goto L48
            L9:
                com.noknok.android.client.oobsdk.OobReceiver$MessageType r1 = com.noknok.android.client.oobsdk.OobReceiver.MessageType.OOB_APPLINK
                com.noknok.android.client.oobsdk.OobReceiver$MessageType r2 = com.noknok.android.client.oobsdk.OOBHandlerActivity.f(r7)
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L1e
                com.noknok.android.client.appsdk.ResultType r5 = com.noknok.android.client.appsdk.ResultType.SUCCESS
                if (r4 == r5) goto L48
                com.noknok.android.client.appsdk.ResultType r5 = com.noknok.android.client.appsdk.ResultType.CANCELED
                if (r4 != r5) goto L34
                goto L48
            L1e:
                com.noknok.android.client.appsdk.ResultType r1 = com.noknok.android.client.appsdk.ResultType.SUCCESS
                if (r4 != r1) goto L29
                com.noknok.android.client.appsdk.AppSDK2$Operation r1 = com.noknok.android.client.appsdk.AppSDK2.Operation.OOB_REG
                if (r5 != r1) goto L29
                java.lang.String r5 = "Device is activated"
                goto L35
            L29:
                com.noknok.android.client.appsdk.ResultType r1 = com.noknok.android.client.appsdk.ResultType.NO_MATCH
                if (r4 != r1) goto L34
                com.noknok.android.client.appsdk.AppSDK2$Operation r1 = com.noknok.android.client.appsdk.AppSDK2.Operation.OOB_AUTH
                if (r5 != r1) goto L34
                java.lang.String r5 = "No registrations found"
                goto L35
            L34:
                r5 = r0
            L35:
                if (r5 == 0) goto L38
                goto L3c
            L38:
                java.lang.String r5 = r4.getMessage(r7)
            L3c:
                android.content.Context r4 = r7.getApplicationContext()
                r7 = 0
                android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r7)
                r4.show()
            L48:
                com.noknok.android.client.oobsdk.OobReceiver$MessageType r4 = com.noknok.android.client.oobsdk.OobReceiver.MessageType.OOB_APPLINK
                com.noknok.android.client.oobsdk.OOBHandlerActivity r5 = com.noknok.android.client.oobsdk.OOBHandlerActivity.this
                com.noknok.android.client.oobsdk.OobReceiver$MessageType r5 = com.noknok.android.client.oobsdk.OOBHandlerActivity.f(r5)
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L5c
                com.noknok.android.client.oobsdk.OOBHandlerActivity r4 = com.noknok.android.client.oobsdk.OOBHandlerActivity.this
                r4.finishAffinity()
                goto L61
            L5c:
                com.noknok.android.client.oobsdk.OOBHandlerActivity r4 = com.noknok.android.client.oobsdk.OOBHandlerActivity.this
                r4.finish()
            L61:
                r6.onResult(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.noknok.android.client.oobsdk.OOBHandlerActivity.OOBCompletionListener.a(com.noknok.android.client.appsdk.ResultType, com.noknok.android.client.appsdk.AppSDK2$Operation, com.noknok.android.client.utils.ActivityProxy, android.app.Activity):void");
        }

        @Override // com.noknok.android.client.oobsdk.OobReceiver.ICompletionListener
        public void onComplete(final ActivityProxy activityProxy, final ResultType resultType, String str, final AppSDK2.Operation operation) {
            OobReceiver.ICompletionListener iCompletionListener = this.f63363a;
            if (iCompletionListener != null) {
                iCompletionListener.onComplete(activityProxy, resultType, str, operation);
                return;
            }
            try {
                activityProxy.executeInActivity(new ActivityProxy.IActivityCommand() { // from class: com.noknok.android.client.oobsdk.a
                    @Override // com.noknok.android.client.utils.ActivityProxy.IActivityCommand
                    public final void executeInActivity(Activity activity) {
                        this.f63388a.a(resultType, operation, activityProxy, activity);
                    }
                });
            } catch (IllegalStateException e5) {
                Logger.e(OOBHandlerActivity.TAG, "Failed to finish activity", e5);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f63362d = ActivityProxy.onActivityCreate(this, bundle);
        this.f63359a = ProgressObserverFactory.getInstance().createProgressObserver(this);
        Intent intent = getIntent();
        if (intent.getData() == null) {
            this.f63361c = intent.getStringExtra(OobReceiver.PROCESS_MESSAGE);
            this.f63360b = (OobReceiver.MessageType) intent.getSerializableExtra("message_type");
        } else {
            String queryParameter = intent.getData().getQueryParameter(OobReceiver.APPLINK_DATA);
            if (queryParameter == null) {
                this.f63361c = intent.getData().toString();
                this.f63360b = OobReceiver.MessageType.OOB_QR_CODE;
            } else {
                try {
                    this.f63361c = JsonParser.parseString(new String(Base64.decode(queryParameter, 11), Charsets.utf8Charset)).getAsJsonObject().get("oobData").getAsString();
                } catch (IllegalArgumentException e5) {
                    Logger.e(TAG, e5.getMessage());
                }
                this.f63360b = OobReceiver.MessageType.OOB_APPLINK;
            }
        }
        OobReceiver oobReceiverInstance = OobReceiver.instance();
        OobReceiver.IStartListener startListener = oobReceiverInstance.getStartListener();
        if (OobReceiver.MessageType.OOB_APPLINK.equals(this.f63360b) || startListener == null || startListener.onStart(this, this.f63360b, this.f63361c)) {
            oobReceiverInstance.processMessage(this.f63362d, this.f63361c, new OOBCompletionListener(oobReceiverInstance.getCompletionListener()));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            this.f63359a.disable();
        }
        this.f63362d.onActivityDestroy(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f63359a.enable(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f63362d.onActivitySaveSate(bundle);
    }
}
