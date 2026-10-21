package com.fido.android.framework.tm;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.noknok.android.client.utils.ActivityInOutParams;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.uaf.AppFinder;

/* JADX INFO: loaded from: classes9.dex */
public class AsmIntentHelperActivity extends Activity {
    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Logger.d("AsmIntentHelperActivity", "AsmIntentHelperActivity onActivityResult".concat(i11 == 0 ? " RESULT_CANCELED" : ""));
        ActivityInOutParams.setResult(this, (i11 != -1 || intent == null) ? null : intent.getStringExtra("message"));
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ActivityInOutParams.onActivityCreate(this)) {
            Logger.d("AsmIntentHelperActivity", "The first intent");
            Intent intent = getIntent();
            Intent intent2 = new Intent(AppFinder.INTENT_ACTION);
            intent2.setComponent((ComponentName) intent.getParcelableExtra("COMPONENT_NAME"));
            intent2.setType(AppFinder.MIME_TYPE_ASM);
            intent2.putExtra("message", intent.getStringExtra("IN_PARAM"));
            try {
                startActivityForResult(intent2, 0);
            } catch (ActivityNotFoundException | SecurityException unused) {
                ActivityInOutParams.setResult(this, null);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
