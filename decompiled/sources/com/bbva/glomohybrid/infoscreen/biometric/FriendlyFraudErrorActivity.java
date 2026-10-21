package com.bbva.glomohybrid.infoscreen.biometric;

import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FriendlyFraudErrorActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0014R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/biometric/FriendlyFraudErrorActivity;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenActivity;", "()V", "id", "", "getId", "()Ljava/lang/String;", "isHandledByDeepLink", "", "onStart", "", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FriendlyFraudErrorActivity extends InfoScreenActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ActionSpec<Void> F0 = new ActionSpec<>("screen-start");

    @NotNull
    public static final String ID = "biometry-friendly-fraud";

    /* JADX INFO: compiled from: FriendlyFraudErrorActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/biometric/FriendlyFraudErrorActivity$Companion;", "", "()V", "ACTION_SCREEN_START", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Ljava/lang/Void;", "getACTION_SCREEN_START", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ID", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Void> getACTION_SCREEN_START() {
            return FriendlyFraudErrorActivity.F0;
        }
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    @NotNull
    public String getId() {
        return "biometry-friendly-fraud";
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    public boolean isHandledByDeepLink() {
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        CellsReactor.fire$default("biometry-friendly-fraud", F0, null, 4, null);
    }
}
