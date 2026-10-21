package com.bbva.glomohybrid.login.model.ui;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.model.enums.UserAvatar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginHeaderState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderState;", "", "Lcom/bbva/glomohybrid/login/model/enums/UserAvatar;", "component1", "Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage;", "component2", "avatar", "background", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/glomohybrid/login/model/enums/UserAvatar;", "getAvatar", "()Lcom/bbva/glomohybrid/login/model/enums/UserAvatar;", "b", "Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage;", "getBackground", "()Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage;", "<init>", "(Lcom/bbva/glomohybrid/login/model/enums/UserAvatar;Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LoginHeaderState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UserAvatar avatar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LoginHeaderImage background;

    public LoginHeaderState(@NotNull UserAvatar avatar, @NotNull LoginHeaderImage background) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(background, "background");
        this.avatar = avatar;
        this.background = background;
    }

    public static /* synthetic */ LoginHeaderState copy$default(LoginHeaderState loginHeaderState, UserAvatar userAvatar, LoginHeaderImage loginHeaderImage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userAvatar = loginHeaderState.avatar;
        }
        if ((i10 & 2) != 0) {
            loginHeaderImage = loginHeaderState.background;
        }
        return loginHeaderState.copy(userAvatar, loginHeaderImage);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserAvatar getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LoginHeaderImage getBackground() {
        return this.background;
    }

    @NotNull
    public final LoginHeaderState copy(@NotNull UserAvatar avatar, @NotNull LoginHeaderImage background) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(background, "background");
        return new LoginHeaderState(avatar, background);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginHeaderState)) {
            return false;
        }
        LoginHeaderState loginHeaderState = (LoginHeaderState) other;
        return Intrinsics.areEqual(this.avatar, loginHeaderState.avatar) && Intrinsics.areEqual(this.background, loginHeaderState.background);
    }

    @NotNull
    public final UserAvatar getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final LoginHeaderImage getBackground() {
        return this.background;
    }

    public int hashCode() {
        return this.background.hashCode() + (this.avatar.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LoginHeaderState(avatar=" + this.avatar + ", background=" + this.background + ")";
    }
}
