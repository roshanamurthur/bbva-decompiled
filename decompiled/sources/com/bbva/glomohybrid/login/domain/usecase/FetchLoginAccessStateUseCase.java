package com.bbva.glomohybrid.login.domain.usecase;

import com.bbva.component.ui.login.model.LoginCredentialsState;
import com.bbva.component.ui.login.model.LoginState;
import com.bbva.component.ui.login.model.LoginViewType;
import com.bbva.component.ui.login.model.RememberedUserState;
import com.bbva.glomohybrid.login.domain.model.CredentialsViewState;
import com.bbva.glomohybrid.login.domain.model.LoginAccessStateParam;
import com.bbva.glomohybrid.login.domain.model.RememberedUserBiometricsViewDataState;
import com.bbva.glomohybrid.login.domain.model.RememberedUserViewDataState;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FetchLoginAccessStateUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/usecase/FetchLoginAccessStateUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomohybrid/login/domain/model/LoginAccessStateParam;", "Lcom/bbva/component/ui/login/model/LoginState;", "params", "execute", "Lcom/bbva/glomohybrid/login/domain/model/RememberedUserBiometricsViewDataState;", "rememberedUserBiometricsViewState", "Lcom/bbva/glomohybrid/login/domain/model/RememberedUserViewDataState;", "rememberedUserViewState", "Lcom/bbva/glomohybrid/login/domain/model/CredentialsViewState;", "credentialsViewState", "<init>", "(Lcom/bbva/glomohybrid/login/domain/model/RememberedUserBiometricsViewDataState;Lcom/bbva/glomohybrid/login/domain/model/RememberedUserViewDataState;Lcom/bbva/glomohybrid/login/domain/model/CredentialsViewState;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class FetchLoginAccessStateUseCase implements UseCaseWithParams<LoginAccessStateParam, LoginState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RememberedUserBiometricsViewDataState f33419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RememberedUserViewDataState f33420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CredentialsViewState f33421c;

    /* JADX INFO: compiled from: FetchLoginAccessStateUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginViewType.values().length];
            try {
                iArr[LoginViewType.CREDENTIALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoginViewType.BIOMETRICS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoginViewType.REMEMBERED_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoginViewType.RESET_PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FetchLoginAccessStateUseCase(@NotNull RememberedUserBiometricsViewDataState rememberedUserBiometricsViewState, @NotNull RememberedUserViewDataState rememberedUserViewState, @NotNull CredentialsViewState credentialsViewState) {
        Intrinsics.checkNotNullParameter(rememberedUserBiometricsViewState, "rememberedUserBiometricsViewState");
        Intrinsics.checkNotNullParameter(rememberedUserViewState, "rememberedUserViewState");
        Intrinsics.checkNotNullParameter(credentialsViewState, "credentialsViewState");
        this.f33419a = rememberedUserBiometricsViewState;
        this.f33420b = rememberedUserViewState;
        this.f33421c = credentialsViewState;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public LoginState execute(@NotNull LoginAccessStateParam params) {
        Intrinsics.checkNotNullParameter(params, "params");
        int i10 = WhenMappings.$EnumSwitchMapping$0[params.getLoginViewType().ordinal()];
        if (i10 == 1) {
            return this.f33421c.getLoginState();
        }
        if (i10 == 2) {
            return this.f33419a.configure(params.getUserRememberedUser(), params.getAvatarModel(), params.getRememberedUserType());
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return new LoginState(LoginViewType.RESET_PASSWORD, (LoginCredentialsState) null, (RememberedUserState) null, 6, (DefaultConstructorMarker) null);
            }
            throw new NoWhenBranchMatchedException();
        }
        return this.f33420b.configure(params.getUserRememberedUser(), params.getAvatarModel());
    }
}
