package com.bbva.androidtoolkit.plugin.activity.result;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bbva.androidtoolkit.plugin.response.Errors;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResultHandlerActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014¨\u0006\u000e"}, d2 = {"Lcom/bbva/androidtoolkit/plugin/activity/result/ResultHandlerActivity;", "Landroid/app/Activity;", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "toolkit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResultHandlerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResultHandlerActivity.kt\ncom/bbva/androidtoolkit/plugin/activity/result/ResultHandlerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
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
                ActivityResultManager.onActivityResultCancelled$default(ActivityResultManager.INSTANCE, null, 1, null);
            } else {
                ActivityResultManager activityResultManager = ActivityResultManager.INSTANCE;
                if (data == null) {
                    data = new Intent();
                }
                activityResultManager.onActivityResultSuccess(resultCode, data);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
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
            try {
                startActivityForResult(intent, 4826);
            } catch (ActivityNotFoundException unused) {
                ActivityResultManager.INSTANCE.onActivityResultCancelled(Errors.ErrorNotAvailable);
            } catch (Exception unused2) {
                ActivityResultManager.INSTANCE.onActivityResultCancelled(Errors.ErrorNotSupported);
            }
        }
    }
}
