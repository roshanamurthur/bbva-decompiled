package com.bbva.glomohybrid.ui.options.profileselector.delegate;

import androidx.lifecycle.MutableLiveData;
import com.bbva.glomo.user.domain.model.TrackAction;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.DeleteUserDataUseCase;
import com.bbva.glomo.user.domain.usecase.GetUserTypeUseCase;
import com.bbva.glomo.user.domain.usecase.StoreUserTypeUseCase;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.viewmodel.ZipActionsFlow;
import com.bbva.glomohybrid.ui.options.profileselector.helper.AnalyticsViewModelDelegate;
import com.bbva.glomohybrid.ui.options.profileselector.helper.ProfileSelectorHelper;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectorDialogState;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserTypeViewModelDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010A\u001a\u00020BH&J\u0011\u0010C\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010DJ\u0010\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020\u0007H&J\u001c\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u0002082\n\b\u0002\u0010I\u001a\u0004\u0018\u000108H\u0016J\u001a\u0010J\u001a\u00020B2\u0006\u0010K\u001a\u0002082\b\b\u0002\u0010L\u001a\u00020+H\u0016J2\u0010M\u001a\u00020B2 \b\u0002\u0010N\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0P\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010OH&ø\u0001\u0000¢\u0006\u0002\u0010QJ\b\u0010R\u001a\u00020BH\u0016J\u0010\u0010S\u001a\u00020B2\u0006\u0010T\u001a\u000208H&J\b\u0010U\u001a\u00020BH&J\b\u0010V\u001a\u00020BH&J\b\u0010W\u001a\u00020BH\u0016J\u0010\u0010X\u001a\u00020B2\u0006\u0010Y\u001a\u000208H&J\b\u0010Z\u001a\u00020BH&J\b\u0010[\u001a\u00020BH\u0016J\u0010\u0010\\\u001a\u00020B2\u0006\u0010]\u001a\u000208H\u0016J\b\u0010^\u001a\u00020BH&J\u0010\u0010_\u001a\u00020B2\u0006\u0010`\u001a\u000208H\u0016J\u0010\u0010a\u001a\u00020B2\u0006\u0010H\u001a\u00020bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0012\u0010%\u001a\u00020&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00102\u001a\b\u0012\u0004\u0012\u00020403X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00107\u001a\u0004\u0018\u000108X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0012\u0010=\u001a\u00020>X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006c"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeViewModelDelegate;", "", "analyticsDelegate", "Lcom/bbva/glomohybrid/ui/options/profileselector/helper/AnalyticsViewModelDelegate;", "getAnalyticsDelegate", "()Lcom/bbva/glomohybrid/ui/options/profileselector/helper/AnalyticsViewModelDelegate;", "currentUserType", "Lcom/bbva/glomo/user/domain/model/UserType;", "getCurrentUserType", "()Lcom/bbva/glomo/user/domain/model/UserType;", "deleteUser", "Lcom/bbva/glomo/user/domain/usecase/DeleteUserDataUseCase;", "getDeleteUser", "()Lcom/bbva/glomo/user/domain/usecase/DeleteUserDataUseCase;", "getRememberedUserUseCase", "Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;", "getGetRememberedUserUseCase", "()Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;", "getUserTypeUseCase", "Lcom/bbva/glomo/user/domain/usecase/GetUserTypeUseCase;", "getGetUserTypeUseCase", "()Lcom/bbva/glomo/user/domain/usecase/GetUserTypeUseCase;", "pendingDeeplink", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getPendingDeeplink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "setPendingDeeplink", "(Lcom/bbva/glomohybrid/base/models/DeepLinkModel;)V", "profileSelectorDialogState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectorDialogState;", "getProfileSelectorDialogState", "()Landroidx/lifecycle/MutableLiveData;", "profileSelectorHelper", "Lcom/bbva/glomohybrid/ui/options/profileselector/helper/ProfileSelectorHelper;", "getProfileSelectorHelper", "()Lcom/bbva/glomohybrid/ui/options/profileselector/helper/ProfileSelectorHelper;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "showUserTypeSelectorUseCase", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "getShowUserTypeSelectorUseCase", "()Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "storeUserTypeUseCase", "Lcom/bbva/glomo/user/domain/usecase/StoreUserTypeUseCase;", "getStoreUserTypeUseCase", "()Lcom/bbva/glomo/user/domain/usecase/StoreUserTypeUseCase;", "userTypeEvents", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeContract$Event;", "getUserTypeEvents", "()Lkotlinx/coroutines/flow/Flow;", "userTypeSelectedOption", "", "getUserTypeSelectedOption", "()Ljava/lang/String;", "setUserTypeSelectedOption", "(Ljava/lang/String;)V", "zipComponent", "Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;", "getZipComponent", "()Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;", "cancelChangeProfile", "", "computeUserSelected", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmChangeProfile", Scopes.PROFILE, "doAction", "action", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "executeNavigationIfNeeded", "route", "hideloading", "init", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;)V", "onChangeProfileRetry", "onChangeSelectedOption", "value", "onPersistedSelectorReset", "onProfilesChanged", "onSelectorReset", "onShowUserTypeSelector", "selectedOption", "onStoreUserTypeInComponent", "onSwitchToEnterprise", "onUserTypeSelected", "text", "openEnterpriseDialog", "storeToken", "token", "trackAction", "Lcom/bbva/glomo/user/domain/model/TrackAction;", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UserTypeViewModelDelegate {
    void cancelChangeProfile();

    @Nullable
    Object computeUserSelected(@NotNull Continuation<? super UserType> continuation);

    void confirmChangeProfile(@NotNull UserType profile);

    void doAction(@NotNull String action, @Nullable String payload);

    void executeNavigationIfNeeded(@NotNull String route, boolean hideloading);

    @NotNull
    AnalyticsViewModelDelegate getAnalyticsDelegate();

    @NotNull
    UserType getCurrentUserType();

    @NotNull
    DeleteUserDataUseCase getDeleteUser();

    @NotNull
    SuspendGetRememberedUserUseCase getGetRememberedUserUseCase();

    @NotNull
    GetUserTypeUseCase getGetUserTypeUseCase();

    @Nullable
    DeepLinkModel getPendingDeeplink();

    @NotNull
    MutableLiveData<ProfileSelectorDialogState> getProfileSelectorDialogState();

    @NotNull
    ProfileSelectorHelper getProfileSelectorHelper();

    @NotNull
    CoroutineScope getScope();

    @NotNull
    SuspendUseCase<Boolean> getShowUserTypeSelectorUseCase();

    @NotNull
    StoreUserTypeUseCase getStoreUserTypeUseCase();

    @NotNull
    Flow<UserTypeContract.Event> getUserTypeEvents();

    @Nullable
    String getUserTypeSelectedOption();

    @NotNull
    ZipActionsFlow getZipComponent();

    void init(@Nullable Function1<? super Continuation<? super Unit>, ? extends Object> block);

    void onChangeProfileRetry();

    void onChangeSelectedOption(@NotNull String value);

    void onPersistedSelectorReset();

    void onProfilesChanged();

    void onSelectorReset();

    void onShowUserTypeSelector(@NotNull String selectedOption);

    void onStoreUserTypeInComponent();

    void onSwitchToEnterprise();

    void onUserTypeSelected(@NotNull String text);

    void openEnterpriseDialog();

    void setPendingDeeplink(@Nullable DeepLinkModel deepLinkModel);

    void setUserTypeSelectedOption(@Nullable String str);

    void storeToken(@NotNull String token);

    void trackAction(@NotNull TrackAction action);

    /* JADX INFO: compiled from: UserTypeViewModelDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void doAction(@NotNull UserTypeViewModelDelegate userTypeViewModelDelegate, @NotNull String action, @Nullable String str) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        public static /* synthetic */ void doAction$default(UserTypeViewModelDelegate userTypeViewModelDelegate, String str, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doAction");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            userTypeViewModelDelegate.doAction(str, str2);
        }

        public static void executeNavigationIfNeeded(@NotNull UserTypeViewModelDelegate userTypeViewModelDelegate, @NotNull String route, boolean z10) {
            Intrinsics.checkNotNullParameter(route, "route");
        }

        public static /* synthetic */ void executeNavigationIfNeeded$default(UserTypeViewModelDelegate userTypeViewModelDelegate, String str, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeNavigationIfNeeded");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            userTypeViewModelDelegate.executeNavigationIfNeeded(str, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void init$default(UserTypeViewModelDelegate userTypeViewModelDelegate, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
            }
            if ((i10 & 1) != 0) {
                function1 = null;
            }
            userTypeViewModelDelegate.init(function1);
        }

        public static void onUserTypeSelected(@NotNull UserTypeViewModelDelegate userTypeViewModelDelegate, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public static void storeToken(@NotNull UserTypeViewModelDelegate userTypeViewModelDelegate, @NotNull String token) {
            Intrinsics.checkNotNullParameter(token, "token");
        }

        public static void trackAction(@NotNull UserTypeViewModelDelegate userTypeViewModelDelegate, @NotNull TrackAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        public static void onChangeProfileRetry(@NotNull UserTypeViewModelDelegate userTypeViewModelDelegate) {
        }

        public static void onSelectorReset(@NotNull UserTypeViewModelDelegate userTypeViewModelDelegate) {
        }

        public static void onSwitchToEnterprise(@NotNull UserTypeViewModelDelegate userTypeViewModelDelegate) {
        }
    }
}
