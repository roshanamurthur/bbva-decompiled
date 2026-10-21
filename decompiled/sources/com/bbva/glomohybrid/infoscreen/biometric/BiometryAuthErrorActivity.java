package com.bbva.glomohybrid.infoscreen.biometric;

import android.os.Bundle;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometryAuthErrorActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/biometric/BiometryAuthErrorActivity;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenActivity;", "()V", "id", "", "getId", "()Ljava/lang/String;", "isHandledByDeepLink", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BiometryAuthErrorActivity extends InfoScreenActivity {

    @NotNull
    public static final String ID = "biometry-error";

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    @NotNull
    public String getId() {
        return "biometry-error";
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    public boolean isHandledByDeepLink() {
        return true;
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity, com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        trackEvent(AnalyticsEvent.LOGIN_BIOMETRIC_UNCONFIGURED_ERROR);
    }
}
