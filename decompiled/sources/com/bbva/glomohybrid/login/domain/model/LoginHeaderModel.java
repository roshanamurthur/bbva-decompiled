package com.bbva.glomohybrid.login.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginHeaderModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/LoginHeaderModel;", "", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "component1", "", "component2", "avatar", "background", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "getAvatar", "()Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "b", "Ljava/lang/String;", "getBackground", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/glomohybrid/base/models/UserAvatarModel;Ljava/lang/String;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LoginHeaderModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UserAvatarModel avatar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String background;

    public LoginHeaderModel(@Nullable UserAvatarModel userAvatarModel, @NotNull String background) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.avatar = userAvatarModel;
        this.background = background;
    }

    public static /* synthetic */ LoginHeaderModel copy$default(LoginHeaderModel loginHeaderModel, UserAvatarModel userAvatarModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userAvatarModel = loginHeaderModel.avatar;
        }
        if ((i10 & 2) != 0) {
            str = loginHeaderModel.background;
        }
        return loginHeaderModel.copy(userAvatarModel, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserAvatarModel getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackground() {
        return this.background;
    }

    @NotNull
    public final LoginHeaderModel copy(@Nullable UserAvatarModel avatar, @NotNull String background) {
        Intrinsics.checkNotNullParameter(background, "background");
        return new LoginHeaderModel(avatar, background);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginHeaderModel)) {
            return false;
        }
        LoginHeaderModel loginHeaderModel = (LoginHeaderModel) other;
        return Intrinsics.areEqual(this.avatar, loginHeaderModel.avatar) && Intrinsics.areEqual(this.background, loginHeaderModel.background);
    }

    @Nullable
    public final UserAvatarModel getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getBackground() {
        return this.background;
    }

    public int hashCode() {
        UserAvatarModel userAvatarModel = this.avatar;
        return this.background.hashCode() + ((userAvatarModel == null ? 0 : userAvatarModel.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "LoginHeaderModel(avatar=" + this.avatar + ", background=" + this.background + ")";
    }
}
