package com.bbva.glomohybrid.login.domain.usecase;

import com.bbva.cells.component.kit.featureflag.FlagState;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.glomohybrid.featureflags.domain.flags.LoginNativeFlags;
import com.bbva.glomohybrid.login.domain.model.LoginFeatureFlagsModel;
import com.bbva.glomoutils.usecase.UseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FetchLoginFeatureFlagsModelUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/usecase/FetchLoginFeatureFlagsModelUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "Lcom/bbva/glomohybrid/login/domain/model/LoginFeatureFlagsModel;", "execute", "Lcom/bbva/cellscore/featureflag/FeatureFlagManager;", "featureFlagsManager", "<init>", "(Lcom/bbva/cellscore/featureflag/FeatureFlagManager;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class FetchLoginFeatureFlagsModelUseCase implements UseCase<LoginFeatureFlagsModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeatureFlagManager f33422a;

    public FetchLoginFeatureFlagsModelUseCase(@NotNull FeatureFlagManager featureFlagsManager) {
        Intrinsics.checkNotNullParameter(featureFlagsManager, "featureFlagsManager");
        this.f33422a = featureFlagsManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public LoginFeatureFlagsModel execute() {
        FlagState flag = this.f33422a.getFlag(LoginNativeFlags.LOGIN_FORGOT_PASSWORD_BUTTON.getValue());
        if (flag == null) {
            flag = FlagState.Enable;
        }
        return new LoginFeatureFlagsModel(flag == FlagState.Enable);
    }
}
