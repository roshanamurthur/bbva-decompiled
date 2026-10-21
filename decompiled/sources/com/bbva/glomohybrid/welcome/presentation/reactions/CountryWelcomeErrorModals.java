package com.bbva.glomohybrid.welcome.presentation.reactions;

import androidx.fragment.app.FragmentActivity;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomoconfig.factory.HalfModalComponentFactory;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountryWelcomeErrorModals.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\"\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u0010\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/reactions/CountryWelcomeErrorModals;", "Lcom/bbva/glomohybrid/welcome/presentation/reactions/WelcomeModals;", "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "exception", "", "getModalId", "id", "", "isNavigation", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "message", "", "showModal", "getGenericErrorId", "()Ljava/lang/String;", "genericErrorId", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;)V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryWelcomeErrorModals extends WelcomeModals {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryWelcomeErrorModals(@NotNull BaseReaction baseReaction) {
        super(baseReaction);
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
    }

    @Override // com.bbva.glomohybrid.welcome.presentation.reactions.WelcomeModals
    @NotNull
    public String getGenericErrorId() {
        return "technical-error-half-modal";
    }

    @Override // com.bbva.glomohybrid.welcome.presentation.reactions.WelcomeModals
    @NotNull
    public String getModalId(@NotNull LoginException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return getGenericErrorId();
    }

    @Override // com.bbva.glomohybrid.welcome.presentation.reactions.WelcomeModals
    public boolean isNavigation(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return false;
    }

    @Override // com.bbva.glomohybrid.welcome.presentation.reactions.WelcomeModals
    public void showModal(@NotNull FragmentActivity activity, @NotNull String id, @Nullable String message) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(id, "id");
        HalfModalComponent.INSTANCE.getInstance().configure(HalfModalComponentFactory.INSTANCE.genericError()).show(activity);
    }
}
