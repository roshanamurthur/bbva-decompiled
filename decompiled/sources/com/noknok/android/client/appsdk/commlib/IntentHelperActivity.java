package com.noknok.android.client.appsdk.commlib;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.collection.k;
import com.noknok.android.client.appsdk.FidoOut;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk.uaf.UafIntentParser;
import com.noknok.android.client.utils.ActivityInOutParams;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.uaf.framework.agent.UafAppSdkIntent;

/* JADX INFO: loaded from: classes11.dex */
public class IntentHelperActivity extends Activity {
    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        FidoOut uafResponseIntent;
        super.onActivityResult(i10, i11, intent);
        Logger.d("IntentHelperActivity", k.c("IntentHelperActivity onActivityResult(requestCode=", i10, ", resultCode=", i11, ")"));
        finish();
        if (i11 == -1 || i11 == 0) {
            uafResponseIntent = UafIntentParser.parseUafResponseIntent(intent);
            if (uafResponseIntent.fidoStatus.equals(ResultType.FAILURE) && i11 == 0) {
                uafResponseIntent.fidoStatus = ResultType.CANCELED;
            }
        } else {
            uafResponseIntent = new FidoOut();
            uafResponseIntent.fidoStatus = ResultType.PROTOCOL_ERROR;
        }
        Logger.i("IntentHelperActivity", "return from onActivity Result");
        ActivityInOutParams.setResult(this, uafResponseIntent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Logger.d("IntentHelperActivity", "IntentHelperActivity onConfigurationChanged");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (ActivityInOutParams.onActivityCreate(this)) {
            Logger.d("IntentHelperActivity", "IntentHelperActivity onCreate");
            Intent intent2 = new Intent();
            intent2.putExtras(intent);
            Outcome outcomeProcessUAFMessage = UafAppSdkIntent.instance().processUAFMessage(this, intent2);
            if (outcomeProcessUAFMessage == Outcome.NOT_INSTALLED) {
                Logger.i("IntentHelperActivity", "Return not installed error");
                finish();
                FidoOut fidoOut = new FidoOut();
                fidoOut.fidoResponse = null;
                fidoOut.fidoStatus = ResultType.fromOutcome(outcomeProcessUAFMessage);
                ActivityInOutParams.setResult(this, fidoOut);
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        FidoOut fidoOut = new FidoOut();
        fidoOut.fidoStatus = ResultType.CANCELED;
        ActivityInOutParams.setResult(this, fidoOut);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
