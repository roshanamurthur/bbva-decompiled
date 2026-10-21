package com.bbva.glomohybrid.ui.options.profileselector.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomo.user.domain.model.RememberedUser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProfileSelectorDialogState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectorDialogState;", "", "", "a", "Ljava/lang/String;", "getSelectedOption", "()Ljava/lang/String;", "selectedOption", "UserNew", "UserRemembered", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectorDialogState$UserNew;", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectorDialogState$UserRemembered;", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class ProfileSelectorDialogState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String selectedOption;

    /* JADX INFO: compiled from: ProfileSelectorDialogState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectorDialogState$UserNew;", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectorDialogState;", "", "component1", "selectedOption", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getSelectedOption", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class UserNew extends ProfileSelectorDialogState {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String selectedOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserNew(@NotNull String selectedOption) {
            super(selectedOption, null);
            Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
            this.selectedOption = selectedOption;
        }

        public static /* synthetic */ UserNew copy$default(UserNew userNew, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = userNew.selectedOption;
            }
            return userNew.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSelectedOption() {
            return this.selectedOption;
        }

        @NotNull
        public final UserNew copy(@NotNull String selectedOption) {
            Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
            return new UserNew(selectedOption);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserNew) && Intrinsics.areEqual(this.selectedOption, ((UserNew) other).selectedOption);
        }

        @Override // com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectorDialogState
        @NotNull
        public String getSelectedOption() {
            return this.selectedOption;
        }

        public int hashCode() {
            return this.selectedOption.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("UserNew(selectedOption="), this.selectedOption, ")");
        }
    }

    /* JADX INFO: compiled from: ProfileSelectorDialogState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectorDialogState$UserRemembered;", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectorDialogState;", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "component1", "", "component2", "user", "selectedOption", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "getUser", "()Lcom/bbva/glomo/user/domain/model/RememberedUser;", "c", "Ljava/lang/String;", "getSelectedOption", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/glomo/user/domain/model/RememberedUser;Ljava/lang/String;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class UserRemembered extends ProfileSelectorDialogState {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final RememberedUser user;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String selectedOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserRemembered(@NotNull RememberedUser user, @NotNull String selectedOption) {
            super(selectedOption, null);
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
            this.user = user;
            this.selectedOption = selectedOption;
        }

        public static /* synthetic */ UserRemembered copy$default(UserRemembered userRemembered, RememberedUser rememberedUser, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rememberedUser = userRemembered.user;
            }
            if ((i10 & 2) != 0) {
                str = userRemembered.selectedOption;
            }
            return userRemembered.copy(rememberedUser, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RememberedUser getUser() {
            return this.user;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSelectedOption() {
            return this.selectedOption;
        }

        @NotNull
        public final UserRemembered copy(@NotNull RememberedUser user, @NotNull String selectedOption) {
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
            return new UserRemembered(user, selectedOption);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserRemembered)) {
                return false;
            }
            UserRemembered userRemembered = (UserRemembered) other;
            return Intrinsics.areEqual(this.user, userRemembered.user) && Intrinsics.areEqual(this.selectedOption, userRemembered.selectedOption);
        }

        @Override // com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectorDialogState
        @NotNull
        public String getSelectedOption() {
            return this.selectedOption;
        }

        @NotNull
        public final RememberedUser getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.selectedOption.hashCode() + (this.user.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UserRemembered(user=" + this.user + ", selectedOption=" + this.selectedOption + ")";
        }
    }

    public ProfileSelectorDialogState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.selectedOption = str;
    }

    @NotNull
    public String getSelectedOption() {
        return this.selectedOption;
    }
}
