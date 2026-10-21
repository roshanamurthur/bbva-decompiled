package com.bbva.glomohybrid.infoscreen.maintenanceflowmeter;

import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MaintenanceFlowmeterActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0014R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/maintenanceflowmeter/MaintenanceFlowmeterActivity;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenActivity;", "()V", "id", "", "getId", "()Ljava/lang/String;", "onBackPressed", "", "onPositiveButtonClicked", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MaintenanceFlowmeterActivity extends InfoScreenActivity {

    @NotNull
    public static final String ID = "maintenance-flowmeter";

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    @NotNull
    public String getId() {
        return "maintenance-flowmeter";
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    public void onPositiveButtonClicked() {
        finish();
    }
}
