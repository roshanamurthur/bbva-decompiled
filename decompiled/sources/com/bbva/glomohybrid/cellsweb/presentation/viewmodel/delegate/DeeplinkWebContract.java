package com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeeplinkWebContract;", "", "()V", "Event", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeeplinkWebContract {

    /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeeplinkWebContract$Event;", "", "()V", "ShowNotificationChangeProfileRequest", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeeplinkWebContract$Event$ShowNotificationChangeProfileRequest;", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeeplinkWebContract$Event$ShowNotificationChangeProfileRequest;", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeeplinkWebContract$Event;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "component1", "Lcom/bbva/glomo/user/domain/model/UserType;", "component2", DeepLinkListenerAdapter.Constants.DEEP_LINK, "newUserType", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeepLink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "b", "Lcom/bbva/glomo/user/domain/model/UserType;", "getNewUserType", "()Lcom/bbva/glomo/user/domain/model/UserType;", "<init>", "(Lcom/bbva/glomohybrid/base/models/DeepLinkModel;Lcom/bbva/glomo/user/domain/model/UserType;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class ShowNotificationChangeProfileRequest extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final DeepLinkModel deepLink;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final UserType newUserType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowNotificationChangeProfileRequest(@NotNull DeepLinkModel deepLink, @NotNull UserType newUserType) {
                super(null);
                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                Intrinsics.checkNotNullParameter(newUserType, "newUserType");
                this.deepLink = deepLink;
                this.newUserType = newUserType;
            }

            public static /* synthetic */ ShowNotificationChangeProfileRequest copy$default(ShowNotificationChangeProfileRequest showNotificationChangeProfileRequest, DeepLinkModel deepLinkModel, UserType userType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    deepLinkModel = showNotificationChangeProfileRequest.deepLink;
                }
                if ((i10 & 2) != 0) {
                    userType = showNotificationChangeProfileRequest.newUserType;
                }
                return showNotificationChangeProfileRequest.copy(deepLinkModel, userType);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DeepLinkModel getDeepLink() {
                return this.deepLink;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final UserType getNewUserType() {
                return this.newUserType;
            }

            @NotNull
            public final ShowNotificationChangeProfileRequest copy(@NotNull DeepLinkModel deepLink, @NotNull UserType newUserType) {
                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                Intrinsics.checkNotNullParameter(newUserType, "newUserType");
                return new ShowNotificationChangeProfileRequest(deepLink, newUserType);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowNotificationChangeProfileRequest)) {
                    return false;
                }
                ShowNotificationChangeProfileRequest showNotificationChangeProfileRequest = (ShowNotificationChangeProfileRequest) other;
                return Intrinsics.areEqual(this.deepLink, showNotificationChangeProfileRequest.deepLink) && this.newUserType == showNotificationChangeProfileRequest.newUserType;
            }

            @NotNull
            public final DeepLinkModel getDeepLink() {
                return this.deepLink;
            }

            @NotNull
            public final UserType getNewUserType() {
                return this.newUserType;
            }

            public int hashCode() {
                return this.newUserType.hashCode() + (this.deepLink.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "ShowNotificationChangeProfileRequest(deepLink=" + this.deepLink + ", newUserType=" + this.newUserType + ")";
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
