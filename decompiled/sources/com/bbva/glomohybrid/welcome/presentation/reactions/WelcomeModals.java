package com.bbva.glomohybrid.welcome.presentation.reactions;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomoconfig.factory.HalfModalComponentFactory;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomeModals.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J$\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&R\u0014\u0010\u0014\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/reactions/WelcomeModals;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "", "getId", "", "configure", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "exception", "show", "showGenericError", "id", "message", "showModal", "", "isNavigation", "getModalId", "getGenericErrorId", "()Ljava/lang/String;", "genericErrorId", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;)V", "Companion", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class WelcomeModals extends ReactiveComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "welcome-error-modals-component";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f34750p0;

    /* JADX INFO: compiled from: WelcomeModals.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/reactions/WelcomeModals$Companion;", "", "()V", "ID", "", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WelcomeModals(@NotNull BaseReaction baseReaction) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        this.f34750p0 = baseReaction;
    }

    public static /* synthetic */ void showModal$default(WelcomeModals welcomeModals, FragmentActivity fragmentActivity, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showModal");
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        welcomeModals.showModal(fragmentActivity, str, str2);
    }

    @NotNull
    public abstract String getGenericErrorId();

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    @NotNull
    public abstract String getModalId(@NotNull LoginException exception);

    public abstract boolean isNavigation(@NotNull String id);

    public final void show(@NotNull FragmentActivity activity, @NotNull LoginException exception) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String modalId = getModalId(exception);
        if (isNavigation(modalId)) {
            BaseReaction.openScreen$default(this.f34750p0, modalId, (Animation) Animation.SlideUp.INSTANCE, (Bundle) null, false, 12, (Object) null);
        } else {
            showModal$default(this, activity, modalId, null, 4, null);
        }
    }

    public final void showGenericError(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        HalfModalComponent.INSTANCE.getInstance().configure(HalfModalComponentFactory.INSTANCE.genericError()).show(activity);
    }

    public abstract void showModal(@NotNull FragmentActivity activity, @NotNull String id, @Nullable String message);

    public void configure() {
    }
}
