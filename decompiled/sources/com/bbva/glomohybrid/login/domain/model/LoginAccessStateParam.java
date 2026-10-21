package com.bbva.glomohybrid.login.domain.model;

import com.bbva.component.ui.login.model.LoginViewType;
import com.bbva.component.ui.login.model.RememberedUserType;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginAccessStateParam.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J5\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/LoginAccessStateParam;", "", "Lcom/bbva/component/ui/login/model/LoginViewType;", "component1", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "component2", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "component3", "Lcom/bbva/component/ui/login/model/RememberedUserType;", "component4", "loginViewType", "userRememberedUser", "avatarModel", "rememberedUserType", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/LoginViewType;", "getLoginViewType", "()Lcom/bbva/component/ui/login/model/LoginViewType;", "b", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "getUserRememberedUser", "()Lcom/bbva/glomo/user/domain/model/RememberedUser;", "c", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "getAvatarModel", "()Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "d", "Lcom/bbva/component/ui/login/model/RememberedUserType;", "getRememberedUserType", "()Lcom/bbva/component/ui/login/model/RememberedUserType;", "<init>", "(Lcom/bbva/component/ui/login/model/LoginViewType;Lcom/bbva/glomo/user/domain/model/RememberedUser;Lcom/bbva/glomohybrid/base/models/UserAvatarModel;Lcom/bbva/component/ui/login/model/RememberedUserType;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LoginAccessStateParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LoginViewType loginViewType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final RememberedUser userRememberedUser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UserAvatarModel avatarModel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RememberedUserType rememberedUserType;

    public LoginAccessStateParam(@NotNull LoginViewType loginViewType, @Nullable RememberedUser rememberedUser, @Nullable UserAvatarModel userAvatarModel, @NotNull RememberedUserType rememberedUserType) {
        Intrinsics.checkNotNullParameter(loginViewType, "loginViewType");
        Intrinsics.checkNotNullParameter(rememberedUserType, "rememberedUserType");
        this.loginViewType = loginViewType;
        this.userRememberedUser = rememberedUser;
        this.avatarModel = userAvatarModel;
        this.rememberedUserType = rememberedUserType;
    }

    public static /* synthetic */ LoginAccessStateParam copy$default(LoginAccessStateParam loginAccessStateParam, LoginViewType loginViewType, RememberedUser rememberedUser, UserAvatarModel userAvatarModel, RememberedUserType rememberedUserType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            loginViewType = loginAccessStateParam.loginViewType;
        }
        if ((i10 & 2) != 0) {
            rememberedUser = loginAccessStateParam.userRememberedUser;
        }
        if ((i10 & 4) != 0) {
            userAvatarModel = loginAccessStateParam.avatarModel;
        }
        if ((i10 & 8) != 0) {
            rememberedUserType = loginAccessStateParam.rememberedUserType;
        }
        return loginAccessStateParam.copy(loginViewType, rememberedUser, userAvatarModel, rememberedUserType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LoginViewType getLoginViewType() {
        return this.loginViewType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RememberedUser getUserRememberedUser() {
        return this.userRememberedUser;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserAvatarModel getAvatarModel() {
        return this.avatarModel;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RememberedUserType getRememberedUserType() {
        return this.rememberedUserType;
    }

    @NotNull
    public final LoginAccessStateParam copy(@NotNull LoginViewType loginViewType, @Nullable RememberedUser userRememberedUser, @Nullable UserAvatarModel avatarModel, @NotNull RememberedUserType rememberedUserType) {
        Intrinsics.checkNotNullParameter(loginViewType, "loginViewType");
        Intrinsics.checkNotNullParameter(rememberedUserType, "rememberedUserType");
        return new LoginAccessStateParam(loginViewType, userRememberedUser, avatarModel, rememberedUserType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginAccessStateParam)) {
            return false;
        }
        LoginAccessStateParam loginAccessStateParam = (LoginAccessStateParam) other;
        return this.loginViewType == loginAccessStateParam.loginViewType && Intrinsics.areEqual(this.userRememberedUser, loginAccessStateParam.userRememberedUser) && Intrinsics.areEqual(this.avatarModel, loginAccessStateParam.avatarModel) && this.rememberedUserType == loginAccessStateParam.rememberedUserType;
    }

    @Nullable
    public final UserAvatarModel getAvatarModel() {
        return this.avatarModel;
    }

    @NotNull
    public final LoginViewType getLoginViewType() {
        return this.loginViewType;
    }

    @NotNull
    public final RememberedUserType getRememberedUserType() {
        return this.rememberedUserType;
    }

    @Nullable
    public final RememberedUser getUserRememberedUser() {
        return this.userRememberedUser;
    }

    public int hashCode() {
        int iHashCode = this.loginViewType.hashCode() * 31;
        RememberedUser rememberedUser = this.userRememberedUser;
        int iHashCode2 = (iHashCode + (rememberedUser == null ? 0 : rememberedUser.hashCode())) * 31;
        UserAvatarModel userAvatarModel = this.avatarModel;
        return this.rememberedUserType.hashCode() + ((iHashCode2 + (userAvatarModel != null ? userAvatarModel.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "LoginAccessStateParam(loginViewType=" + this.loginViewType + ", userRememberedUser=" + this.userRememberedUser + ", avatarModel=" + this.avatarModel + ", rememberedUserType=" + this.rememberedUserType + ")";
    }

    public /* synthetic */ LoginAccessStateParam(LoginViewType loginViewType, RememberedUser rememberedUser, UserAvatarModel userAvatarModel, RememberedUserType rememberedUserType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(loginViewType, rememberedUser, userAvatarModel, (i10 & 8) != 0 ? RememberedUserType.BIOMETRICS : rememberedUserType);
    }
}
