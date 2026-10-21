package com.bbva.glomohybrid.login.domain.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserCredentials.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;", "", "", "component1", "component2", "user", "password", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getUser", "()Ljava/lang/String;", "b", "getPassword", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class UserCredentials {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String user;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String password;

    public UserCredentials(@NotNull String user, @NotNull String password) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(password, "password");
        this.user = user;
        this.password = password;
    }

    public static /* synthetic */ UserCredentials copy$default(UserCredentials userCredentials, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userCredentials.user;
        }
        if ((i10 & 2) != 0) {
            str2 = userCredentials.password;
        }
        return userCredentials.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final UserCredentials copy(@NotNull String user, @NotNull String password) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(password, "password");
        return new UserCredentials(user, password);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCredentials)) {
            return false;
        }
        UserCredentials userCredentials = (UserCredentials) other;
        return Intrinsics.areEqual(this.user, userCredentials.user) && Intrinsics.areEqual(this.password, userCredentials.password);
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.password.hashCode() + (this.user.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserCredentials(user=");
        sb2.append(this.user);
        sb2.append(", password=");
        return d.f(sb2, this.password, ")");
    }
}
