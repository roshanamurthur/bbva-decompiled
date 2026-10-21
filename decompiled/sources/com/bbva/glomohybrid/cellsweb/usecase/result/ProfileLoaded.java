package com.bbva.glomohybrid.cellsweb.usecase.result;

import com.bbva.glomo.user.domain.model.UserType;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SwitchPrivateProfileResult.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/usecase/result/ProfileLoaded;", "Lcom/bbva/glomohybrid/cellsweb/usecase/result/SwitchPrivateProfileResult;", "Lcom/bbva/glomo/user/domain/model/UserType;", "a", "Lcom/bbva/glomo/user/domain/model/UserType;", "getProfile", "()Lcom/bbva/glomo/user/domain/model/UserType;", Scopes.PROFILE, "<init>", "(Lcom/bbva/glomo/user/domain/model/UserType;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ProfileLoaded extends SwitchPrivateProfileResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UserType profile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileLoaded(@NotNull UserType profile) {
        super(null);
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.profile = profile;
    }

    @NotNull
    public final UserType getProfile() {
        return this.profile;
    }
}
