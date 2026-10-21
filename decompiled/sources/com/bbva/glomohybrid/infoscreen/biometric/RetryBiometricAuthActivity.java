package com.bbva.glomohybrid.infoscreen.biometric;

import android.os.Bundle;
import android.view.Menu;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x8.a;
import x8.b;

/* JADX INFO: compiled from: RetryBiometricAuthActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0014R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/biometric/RetryBiometricAuthActivity;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenActivity;", "()V", "id", "", "getId", "()Ljava/lang/String;", "isHandledByDeepLink", "", "onCloseScreenButtonClicked", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onStart", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RetryBiometricAuthActivity extends InfoScreenActivity {

    @NotNull
    public static final String ID = "biometry-error-retry";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final ActionSpec<Boolean> ACTION_RETRY_AUTH = new ActionSpec<>("action-retry-auth");

    @NotNull
    public static final ActionSpec<Void> F0 = new ActionSpec<>("screen-start");

    @NotNull
    public static final ActionSpec<Void> G0 = new ActionSpec<>("screen-close");

    /* JADX INFO: compiled from: RetryBiometricAuthActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/biometric/RetryBiometricAuthActivity$Companion;", "", "()V", "ACTION_RETRY_AUTH", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", "ACTION_RETRY_AUTH_CLOSE", "Ljava/lang/Void;", "getACTION_RETRY_AUTH_CLOSE", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_SCREEN_START", "getACTION_SCREEN_START", "ID", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Void> getACTION_RETRY_AUTH_CLOSE() {
            return RetryBiometricAuthActivity.G0;
        }

        @NotNull
        public final ActionSpec<Void> getACTION_SCREEN_START() {
            return RetryBiometricAuthActivity.F0;
        }
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    @NotNull
    public String getId() {
        return "biometry-error-retry";
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    public boolean isHandledByDeepLink() {
        return true;
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    public void onCloseScreenButtonClicked() {
        CellsReactor.fire$default(getId(), G0, null, 4, null);
        finish();
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity, com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getBinding().positiveButton.setOnClickListener(new a(this, 0));
        getBinding().negativeButton.setOnClickListener(new b(this, 0));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        CellsReactor.fire$default("biometry-error-retry", F0, null, 4, null);
    }
}
