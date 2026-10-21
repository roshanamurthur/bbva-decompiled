package com.bbva.pluginkit.activity.result;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bbva.cells.pluginkit.activity.result.ActivityResultManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResultHandlerActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014¨\u0006\u000e"}, d2 = {"Lcom/bbva/pluginkit/activity/result/ResultHandlerActivity;", "Landroid/app/Activity;", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class ResultHandlerActivity extends Activity {

    @NotNull
    public static final String ACTION = "action";

    @NotNull
    public static final String EXTRAS = "extras";

    @NotNull
    public static final String TARGET = "target";

    @NotNull
    public static final String TYPE = "type";

    @NotNull
    public static final String URI = "uri";

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 4826) {
            if (resultCode == 0) {
                ActivityResultManager.INSTANCE.onActivityResultCancelled();
            } else {
                ActivityResultManager activityResultManager = ActivityResultManager.INSTANCE;
                if (data == null) {
                    data = new Intent();
                }
                activityResultManager.onActivityResultSuccess(data);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Class cls = (Class) getIntent().getSerializableExtra("target");
        Intent intent = cls != null ? new Intent(this, (Class<?>) cls) : new Intent(getIntent().getStringExtra("action"), (Uri) getIntent().getParcelableExtra("uri"));
        String stringExtra = getIntent().getStringExtra("type");
        if (stringExtra != null) {
            intent.setType(stringExtra);
        }
        Bundle bundleExtra = getIntent().getBundleExtra("extras");
        if (bundleExtra != null) {
            intent.putExtras(bundleExtra);
        }
        startActivityForResult(intent, 4826);
    }
}
