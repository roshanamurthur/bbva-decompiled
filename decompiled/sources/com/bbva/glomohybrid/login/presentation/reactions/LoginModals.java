package com.bbva.glomohybrid.login.presentation.reactions;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomoconfig.factory.HalfModalComponentFactory;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.login.domain.model.CountryLoginErrorType;
import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginModals.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nJ \u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0002H&J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016R\u0014\u0010\u001a\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/reactions/LoginModals;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "", "getId", "", "configure", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/glomohybrid/login/domain/model/CountryLoginErrorType;", "errorType", "Landroid/os/Bundle;", "params", "show", "id", "showGenericError", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$FullScreenModalConfig;", "config", "showFullScreenModal", "message", "showModal", "", "isNavigation", "getModalId", "isUserRemembered", "getGenericErrorId", "()Ljava/lang/String;", "genericErrorId", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "halfModalComponent", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public abstract class LoginModals extends ReactiveComponent {

    @NotNull
    public static final String ID = "login-error-modals-component";

    @NotNull
    public static final String technicalError = "technical-error-half-modal";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f33489p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final HalfModalComponent f33490q0;

    public LoginModals(@NotNull BaseReaction baseReaction, @NotNull HalfModalComponent halfModalComponent) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        Intrinsics.checkNotNullParameter(halfModalComponent, "halfModalComponent");
        this.f33489p0 = baseReaction;
        this.f33490q0 = halfModalComponent;
    }

    public static /* synthetic */ void show$default(LoginModals loginModals, FragmentActivity fragmentActivity, CountryLoginErrorType countryLoginErrorType, Bundle EMPTY, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i10 & 4) != 0) {
            EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        loginModals.show(fragmentActivity, countryLoginErrorType, EMPTY);
    }

    public static /* synthetic */ void showModal$default(LoginModals loginModals, FragmentActivity fragmentActivity, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showModal");
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        loginModals.showModal(fragmentActivity, str, str2);
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
    public abstract String getModalId(@NotNull CountryLoginErrorType errorType);

    @NotNull
    public String getModalId(@NotNull CountryLoginErrorType errorType, boolean isUserRemembered) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        return getGenericErrorId();
    }

    public abstract boolean isNavigation(@NotNull String id);

    public final void show(@NotNull FragmentActivity activity, @NotNull CountryLoginErrorType errorType, @NotNull Bundle params) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(params, "params");
        show(activity, getModalId(errorType), params);
    }

    public final void showFullScreenModal(@NotNull FragmentActivity activity, @NotNull FullScreenModal.FullScreenModalConfig config) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
        FullScreenModal.INSTANCE.getInstance(config).show(activity.getSupportFragmentManager(), config.getId());
    }

    public final void showGenericError(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f33490q0.configure(HalfModalComponentFactory.INSTANCE.genericError()).show(activity);
    }

    public abstract void showModal(@NotNull FragmentActivity activity, @NotNull String id, @Nullable String message);

    public static /* synthetic */ void show$default(LoginModals loginModals, FragmentActivity fragmentActivity, String str, Bundle EMPTY, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i10 & 4) != 0) {
            EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        loginModals.show(fragmentActivity, str, EMPTY);
    }

    public final void show(@NotNull FragmentActivity activity, @NotNull String id, @NotNull Bundle params) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(params, "params");
        if (isNavigation(id)) {
            BaseReaction.openScreen$default(this.f33489p0, id, (Animation) Animation.SlideUp.INSTANCE, params, false, 8, (Object) null);
        } else {
            showModal$default(this, activity, id, null, 4, null);
        }
    }

    public void configure() {
    }
}
