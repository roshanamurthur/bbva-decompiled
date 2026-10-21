package com.huawei.secure.android.common.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import androidx.datastore.preferences.protobuf.q;
import com.huawei.secure.android.common.intent.IntentUtils;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes10.dex */
public class SafePreferenceActivity extends PreferenceActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50597a = "SafePreferenceActivity";

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("finish exception : "), f50597a, true);
        }
    }

    @Override // android.app.Activity
    public void finishAffinity() {
        try {
            super.finishAffinity();
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("finishAffinity: "), f50597a, true);
        }
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        try {
            return new SafeIntent(super.getIntent());
        } catch (Exception e5) {
            a.a(f50597a, "getIntent: " + e5.getMessage(), true);
            return new SafeIntent(new Intent());
        }
    }

    @Override // android.app.Activity
    public Uri getReferrer() {
        try {
            return super.getReferrer();
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getReferrer: "), f50597a, true);
            return null;
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        try {
            super.onActivityResult(i10, i11, new SafeIntent(intent));
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("onActivityResult exception : "), f50597a, true);
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (IntentUtils.hasIntentBomb(super.getIntent())) {
            finish();
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("onDestroy exception : "), f50597a, true);
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        if (IntentUtils.hasIntentBomb(super.getIntent())) {
            a.a(f50597a, "onRestart : hasIntentBomb");
        }
        super.onRestart();
    }

    @Override // android.app.Activity
    public void onResume() {
        if (IntentUtils.hasIntentBomb(super.getIntent())) {
            a.a(f50597a, "onResume : hasIntentBomb");
        }
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        if (IntentUtils.hasIntentBomb(super.getIntent())) {
            a.a(f50597a, "onStart : hasIntentBomb");
        }
        super.onStart();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onStop() {
        try {
            super.onStop();
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("onStop exception : "), f50597a, true);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr) {
        try {
            super.startActivities(intentArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("startActivities: "), f50597a, true);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            super.startActivity(new SafeIntent(intent));
        } catch (Exception unused) {
            a.a(f50597a, "startActivity Exception ");
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        try {
            super.startActivityForResult(new SafeIntent(intent), i10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("startActivity: "), f50597a, true);
        }
    }

    @Override // android.app.Activity
    public boolean startActivityIfNeeded(Intent intent, int i10) {
        try {
            return super.startActivityIfNeeded(intent, i10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("startActivityIfNeeded: "), f50597a, true);
            return false;
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        try {
            super.startActivity(new SafeIntent(intent), bundle);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("startActivity: "), f50597a, true);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr, Bundle bundle) {
        try {
            super.startActivities(intentArr, bundle);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("startActivities: "), f50597a, true);
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        try {
            super.startActivityForResult(new SafeIntent(intent), i10, bundle);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("startActivity: "), f50597a, true);
        }
    }
}
