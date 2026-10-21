package com.huawei.secure.android.common.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.secure.android.common.intent.IntentUtils;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes10.dex */
public class SafeActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50594a = "SafeActivity";

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception e5) {
            a.a(f50594a, "finish exception : " + e5.getMessage());
        }
    }

    @Override // android.app.Activity
    public void finishAffinity() {
        try {
            super.finishAffinity();
        } catch (Exception e5) {
            a.a(f50594a, "finishAffinity: " + e5.getMessage(), e5);
        }
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        try {
            return new SafeIntent(super.getIntent());
        } catch (Exception e5) {
            a.a(f50594a, "getIntent: " + e5.getMessage());
            return new SafeIntent(new Intent());
        }
    }

    @Override // android.app.Activity
    public Uri getReferrer() {
        try {
            return super.getReferrer();
        } catch (Exception e5) {
            a.a(f50594a, "getReferrer: " + e5.getMessage());
            return null;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        try {
            super.onActivityResult(i10, i11, new SafeIntent(intent));
        } catch (Exception e5) {
            a.a(f50594a, "onActivityResult exception : " + e5.getMessage(), e5);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (IntentUtils.hasIntentBomb(super.getIntent())) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Exception e5) {
            a.a(f50594a, "onDestroy exception : " + e5.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        if (IntentUtils.hasIntentBomb(super.getIntent())) {
            a.a(f50594a, "onRestart : hasIntentBomb");
        }
        super.onRestart();
    }

    @Override // android.app.Activity
    public void onResume() {
        if (IntentUtils.hasIntentBomb(super.getIntent())) {
            a.a(f50594a, "onResume : hasIntentBomb");
        }
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        if (IntentUtils.hasIntentBomb(super.getIntent())) {
            a.a(f50594a, "onStart : hasIntentBomb");
        }
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        try {
            super.onStop();
        } catch (Exception e5) {
            a.a(f50594a, "onStop exception : " + e5.getMessage());
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr) {
        try {
            super.startActivities(intentArr);
        } catch (Exception e5) {
            a.a(f50594a, "startActivities: " + e5.getMessage());
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            super.startActivity(intent);
        } catch (Exception e5) {
            a.a(f50594a, "startActivity Exception : " + e5.getMessage());
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        try {
            super.startActivityForResult(intent, i10);
        } catch (Exception e5) {
            a.a(f50594a, "startActivity: " + e5.getMessage(), e5);
        }
    }

    @Override // android.app.Activity
    public boolean startActivityIfNeeded(Intent intent, int i10) {
        try {
            return super.startActivityIfNeeded(intent, i10);
        } catch (Exception e5) {
            a.a(f50594a, "startActivityIfNeeded: " + e5.getMessage(), e5);
            return false;
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr, Bundle bundle) {
        try {
            super.startActivities(intentArr, bundle);
        } catch (Exception e5) {
            a.a(f50594a, "startActivities: " + e5.getMessage(), e5);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        try {
            super.startActivity(intent, bundle);
        } catch (Exception e5) {
            a.a(f50594a, "startActivity: " + e5.getMessage(), e5);
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        try {
            super.startActivityForResult(intent, i10, bundle);
        } catch (Exception e5) {
            a.a(f50594a, "startActivity: " + e5.getMessage(), e5);
        }
    }
}
