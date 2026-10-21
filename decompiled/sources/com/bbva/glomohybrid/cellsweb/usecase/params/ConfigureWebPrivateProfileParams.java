package com.bbva.glomohybrid.cellsweb.usecase.params;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomo.user.domain.model.UserType;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConfigureWebPrivateProfileParams.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/usecase/params/ConfigureWebPrivateProfileParams;", "", "Lcom/bbva/glomo/user/domain/model/UserType;", "component1", "", "component2", "component3", Scopes.PROFILE, "document", "password", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/glomo/user/domain/model/UserType;", "getProfile", "()Lcom/bbva/glomo/user/domain/model/UserType;", "b", "Ljava/lang/String;", "getDocument", "()Ljava/lang/String;", "c", "getPassword", "<init>", "(Lcom/bbva/glomo/user/domain/model/UserType;Ljava/lang/String;Ljava/lang/String;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ConfigureWebPrivateProfileParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UserType profile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String document;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String password;

    public ConfigureWebPrivateProfileParams(@NotNull UserType profile, @NotNull String document, @NotNull String password) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(password, "password");
        this.profile = profile;
        this.document = document;
        this.password = password;
    }

    public static /* synthetic */ ConfigureWebPrivateProfileParams copy$default(ConfigureWebPrivateProfileParams configureWebPrivateProfileParams, UserType userType, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userType = configureWebPrivateProfileParams.profile;
        }
        if ((i10 & 2) != 0) {
            str = configureWebPrivateProfileParams.document;
        }
        if ((i10 & 4) != 0) {
            str2 = configureWebPrivateProfileParams.password;
        }
        return configureWebPrivateProfileParams.copy(userType, str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserType getProfile() {
        return this.profile;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocument() {
        return this.document;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final ConfigureWebPrivateProfileParams copy(@NotNull UserType profile, @NotNull String document, @NotNull String password) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(password, "password");
        return new ConfigureWebPrivateProfileParams(profile, document, password);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigureWebPrivateProfileParams)) {
            return false;
        }
        ConfigureWebPrivateProfileParams configureWebPrivateProfileParams = (ConfigureWebPrivateProfileParams) other;
        return this.profile == configureWebPrivateProfileParams.profile && Intrinsics.areEqual(this.document, configureWebPrivateProfileParams.document) && Intrinsics.areEqual(this.password, configureWebPrivateProfileParams.password);
    }

    @NotNull
    public final String getDocument() {
        return this.document;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final UserType getProfile() {
        return this.profile;
    }

    public int hashCode() {
        return this.password.hashCode() + n1.c(this.document, this.profile.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigureWebPrivateProfileParams(profile=");
        sb2.append(this.profile);
        sb2.append(", document=");
        sb2.append(this.document);
        sb2.append(", password=");
        return d.f(sb2, this.password, ")");
    }
}
