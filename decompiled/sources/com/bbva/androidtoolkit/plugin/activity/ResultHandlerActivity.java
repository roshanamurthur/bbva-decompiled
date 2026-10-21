package com.bbva.androidtoolkit.plugin.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ResultHandlerActivity extends Activity {
    public static final String ACTION = "action";
    public static final String EXTRAS = "extras";
    public static final String TARGET = "target";
    public static final String TYPE = "type";
    public static final String URI = "uri";

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 4826) {
            if (i11 == 0) {
                ActivityResultManager.INSTANCE.onActivityResultCancelled();
            } else {
                ActivityResultManager.INSTANCE.onActivityResultSuccess(intent);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Class cls = (Class) intent.getSerializableExtra("target");
        Intent intent2 = cls != null ? new Intent(this, (Class<?>) cls) : new Intent(intent.getStringExtra("action"), (Uri) intent.getParcelableExtra("uri"));
        String stringExtra = intent.getStringExtra("type");
        if (stringExtra != null) {
            intent2.setType(stringExtra);
        }
        Bundle bundleExtra = intent.getBundleExtra("extras");
        if (bundleExtra != null) {
            intent2.putExtras(bundleExtra);
        }
        startActivityForResult(intent2, 4826);
    }
}
