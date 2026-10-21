package com.bbva.glomo.user.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TrackAction.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomo/user/domain/model/TrackAction;", "", "()V", "ChangeProfile", "ChangeUser", "Lcom/bbva/glomo/user/domain/model/TrackAction$ChangeProfile;", "Lcom/bbva/glomo/user/domain/model/TrackAction$ChangeUser;", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class TrackAction {

    /* JADX INFO: compiled from: TrackAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/user/domain/model/TrackAction$ChangeProfile;", "Lcom/bbva/glomo/user/domain/model/TrackAction;", "Lcom/bbva/glomo/user/domain/model/UserType;", "a", "Lcom/bbva/glomo/user/domain/model/UserType;", "getProfile", "()Lcom/bbva/glomo/user/domain/model/UserType;", Scopes.PROFILE, "<init>", "(Lcom/bbva/glomo/user/domain/model/UserType;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
    public static final class ChangeProfile extends TrackAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final UserType profile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeProfile(@NotNull UserType profile) {
            super(null);
            Intrinsics.checkNotNullParameter(profile, "profile");
            this.profile = profile;
        }

        @NotNull
        public final UserType getProfile() {
            return this.profile;
        }
    }

    /* JADX INFO: compiled from: TrackAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomo/user/domain/model/TrackAction$ChangeUser;", "Lcom/bbva/glomo/user/domain/model/TrackAction;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeUser extends TrackAction {

        @NotNull
        public static final ChangeUser INSTANCE = new ChangeUser();

        public ChangeUser() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeUser)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 988646156;
        }

        @NotNull
        public String toString() {
            return "ChangeUser";
        }
    }

    public TrackAction() {
    }

    public /* synthetic */ TrackAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
