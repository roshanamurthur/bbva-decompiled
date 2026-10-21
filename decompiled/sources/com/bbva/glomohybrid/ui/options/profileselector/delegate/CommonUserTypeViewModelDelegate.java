package com.bbva.glomohybrid.ui.options.profileselector.delegate;

import androidx.lifecycle.MutableLiveData;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.TrackAction;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.model.UserTypeKt;
import com.bbva.glomo.user.domain.usecase.DeleteUserDataUseCase;
import com.bbva.glomo.user.domain.usecase.GetUserTypeUseCase;
import com.bbva.glomo.user.domain.usecase.StoreUserTypeUseCase;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.ui.options.profileselector.helper.ProfileSelectorHelper;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectorDialogState;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: compiled from: CommonUserTypeViewModelDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u0004H\u0084@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020$0N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/CommonUserTypeViewModelDelegate;", "Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeViewModelDelegate;", "", "selectedOption", "", "onShowUserTypeSelector", "openEnterpriseDialog", "onStoreUserTypeInComponent", "persistUserSelectedType", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/user/domain/model/UserType;", "computeUserSelected", Scopes.PROFILE, "confirmChangeProfile", "cancelChangeProfile", "b", "Ljava/lang/String;", "getUserTypeSelectedOption", "()Ljava/lang/String;", "setUserTypeSelectedOption", "(Ljava/lang/String;)V", "userTypeSelectedOption", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectorDialogState;", "c", "Landroidx/lifecycle/MutableLiveData;", "getProfileSelectorDialogState", "()Landroidx/lifecycle/MutableLiveData;", "profileSelectorDialogState", "Lkotlinx/coroutines/CoroutineScope;", "d", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/channels/Channel;", "Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeContract$Event;", "e", "Lkotlinx/coroutines/channels/Channel;", "get_userTypeEvents", "()Lkotlinx/coroutines/channels/Channel;", "_userTypeEvents", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "f", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getPendingDeeplink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "setPendingDeeplink", "(Lcom/bbva/glomohybrid/base/models/DeepLinkModel;)V", "pendingDeeplink", "Lcom/bbva/glomo/user/domain/usecase/DeleteUserDataUseCase;", "getDeleteUser", "()Lcom/bbva/glomo/user/domain/usecase/DeleteUserDataUseCase;", "deleteUser", "Lcom/bbva/glomo/user/domain/usecase/StoreUserTypeUseCase;", "getStoreUserTypeUseCase", "()Lcom/bbva/glomo/user/domain/usecase/StoreUserTypeUseCase;", "storeUserTypeUseCase", "Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;", "getGetRememberedUserUseCase", "()Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;", "getRememberedUserUseCase", "Lcom/bbva/glomo/user/domain/usecase/GetUserTypeUseCase;", "getGetUserTypeUseCase", "()Lcom/bbva/glomo/user/domain/usecase/GetUserTypeUseCase;", "getUserTypeUseCase", "Lcom/bbva/glomohybrid/ui/options/profileselector/helper/ProfileSelectorHelper;", "getProfileSelectorHelper", "()Lcom/bbva/glomohybrid/ui/options/profileselector/helper/ProfileSelectorHelper;", "profileSelectorHelper", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "getShowUserTypeSelectorUseCase", "()Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "showUserTypeSelectorUseCase", "getCurrentUserType", "()Lcom/bbva/glomo/user/domain/model/UserType;", "currentUserType", "Lkotlinx/coroutines/flow/Flow;", "getUserTypeEvents", "()Lkotlinx/coroutines/flow/Flow;", "userTypeEvents", "getId", "id", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCommonUserTypeViewModelDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUserTypeViewModelDelegate.kt\ncom/bbva/glomohybrid/ui/options/profileselector/delegate/CommonUserTypeViewModelDelegate\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n41#2,6:103\n47#2:110\n41#2,6:112\n47#2:119\n41#2,6:121\n47#2:128\n41#2,6:130\n47#2:137\n41#2,6:139\n47#2:146\n41#2,6:148\n47#2:155\n133#3:109\n133#3:118\n133#3:127\n133#3:136\n133#3:145\n133#3:154\n107#4:111\n107#4:120\n107#4:129\n107#4:138\n107#4:147\n107#4:156\n1#5:157\n*S KotlinDebug\n*F\n+ 1 CommonUserTypeViewModelDelegate.kt\ncom/bbva/glomohybrid/ui/options/profileselector/delegate/CommonUserTypeViewModelDelegate\n*L\n30#1:103,6\n30#1:110\n32#1:112,6\n32#1:119\n34#1:121,6\n34#1:128\n36#1:130,6\n36#1:137\n38#1:139,6\n38#1:146\n40#1:148,6\n40#1:155\n30#1:109\n32#1:118\n34#1:127\n36#1:136\n38#1:145\n40#1:154\n30#1:111\n32#1:120\n34#1:129\n36#1:138\n38#1:147\n40#1:156\n*E\n"})
public abstract class CommonUserTypeViewModelDelegate implements UserTypeViewModelDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f34659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String userTypeSelectedOption;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<ProfileSelectorDialogState> profileSelectorDialogState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Channel<UserTypeContract.Event> _userTypeEvents;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DeepLinkModel pendingDeeplink;

    /* JADX INFO: compiled from: CommonUserTypeViewModelDelegate.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate", f = "CommonUserTypeViewModelDelegate.kt", i = {0}, l = {82, 89}, m = "computeUserSelected$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CommonUserTypeViewModelDelegate f34665p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f34666q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f34668s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34666q0 = obj;
            this.f34668s0 |= Integer.MIN_VALUE;
            return CommonUserTypeViewModelDelegate.a(CommonUserTypeViewModelDelegate.this, this);
        }
    }

    /* JADX INFO: compiled from: CommonUserTypeViewModelDelegate.kt */
    public static final class b extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f34669p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(Boolean.FALSE);
        }
    }

    /* JADX INFO: compiled from: CommonUserTypeViewModelDelegate.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.ui.options.profileselector.delegate.CommonUserTypeViewModelDelegate$onShowUserTypeSelector$1", f = "CommonUserTypeViewModelDelegate.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f34670p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f34672r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f34672r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CommonUserTypeViewModelDelegate.this.new c(this.f34672r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f34670p0;
            CommonUserTypeViewModelDelegate commonUserTypeViewModelDelegate = CommonUserTypeViewModelDelegate.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SuspendGetRememberedUserUseCase getRememberedUserUseCase = commonUserTypeViewModelDelegate.getGetRememberedUserUseCase();
                this.f34670p0 = 1;
                obj = getRememberedUserUseCase.execute(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RememberedUser rememberedUser = (RememberedUser) obj;
            MutableLiveData<ProfileSelectorDialogState> profileSelectorDialogState = commonUserTypeViewModelDelegate.getProfileSelectorDialogState();
            String str = this.f34672r0;
            profileSelectorDialogState.setValue(rememberedUser != null ? new ProfileSelectorDialogState.UserRemembered(rememberedUser, str) : new ProfileSelectorDialogState.UserNew(str));
            return Unit.INSTANCE;
        }
    }

    public CommonUserTypeViewModelDelegate(@NotNull ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f34659a = provider;
        this.profileSelectorDialogState = new MutableLiveData<>();
        this.scope = CoroutineScopeKt.CoroutineScope(JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        this._userTypeEvents = ChannelKt.Channel$default(0, null, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(CommonUserTypeViewModelDelegate commonUserTypeViewModelDelegate, Continuation<? super UserType> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f34668s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f34668s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = commonUserTypeViewModelDelegate.new a(continuation);
            }
        } else {
            aVar = commonUserTypeViewModelDelegate.new a(continuation);
        }
        Object objExecute = aVar.f34666q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f34668s0;
        if (i11 != 0) {
            if (i11 == 1) {
                commonUserTypeViewModelDelegate = aVar.f34665p0;
                ResultKt.throwOnFailure(objExecute);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objExecute);
            }
        }
        ResultKt.throwOnFailure(objExecute);
        SuspendUseCase<Boolean> showUserTypeSelectorUseCase = commonUserTypeViewModelDelegate.getShowUserTypeSelectorUseCase();
        aVar.f34665p0 = commonUserTypeViewModelDelegate;
        aVar.f34668s0 = 1;
        objExecute = showUserTypeSelectorUseCase.execute(aVar);
        if (objExecute == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (!((Boolean) objExecute).booleanValue()) {
            commonUserTypeViewModelDelegate.setUserTypeSelectedOption(commonUserTypeViewModelDelegate.getProfileSelectorHelper().getDefault());
            return commonUserTypeViewModelDelegate.getProfileSelectorHelper().userTypeFrom(commonUserTypeViewModelDelegate.getProfileSelectorHelper().getDefault());
        }
        if (commonUserTypeViewModelDelegate.getUserTypeSelectedOption() != null) {
            return commonUserTypeViewModelDelegate.getProfileSelectorHelper().userTypeFrom(commonUserTypeViewModelDelegate.getUserTypeSelectedOption());
        }
        GetUserTypeUseCase getUserTypeUseCase = commonUserTypeViewModelDelegate.getGetUserTypeUseCase();
        aVar.f34665p0 = null;
        aVar.f34668s0 = 2;
        objExecute = getUserTypeUseCase.execute(aVar);
        return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void cancelChangeProfile() {
        setPendingDeeplink(null);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @Nullable
    public Object computeUserSelected(@NotNull Continuation<? super UserType> continuation) {
        return a(this, continuation);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void confirmChangeProfile(@NotNull UserType profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        onUserTypeSelected(getProfileSelectorHelper().stringFrom(profile));
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void doAction(@NotNull String str, @Nullable String str2) {
        UserTypeViewModelDelegate.DefaultImpls.doAction(this, str, str2);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void executeNavigationIfNeeded(@NotNull String str, boolean z10) {
        UserTypeViewModelDelegate.DefaultImpls.executeNavigationIfNeeded(this, str, z10);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public UserType getCurrentUserType() {
        return getProfileSelectorHelper().userTypeFrom(getUserTypeSelectedOption());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public DeleteUserDataUseCase getDeleteUser() {
        ViewModelComponentsProviders viewModelComponentsProviders = this.f34659a;
        boolean z10 = viewModelComponentsProviders instanceof KoinScopeComponent;
        return (DeleteUserDataUseCase) (z10 ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(DeleteUserDataUseCase.class), null, b.f34669p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public SuspendGetRememberedUserUseCase getGetRememberedUserUseCase() {
        ViewModelComponentsProviders viewModelComponentsProviders = this.f34659a;
        return (SuspendGetRememberedUserUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(SuspendGetRememberedUserUseCase.class), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public GetUserTypeUseCase getGetUserTypeUseCase() {
        ViewModelComponentsProviders viewModelComponentsProviders = this.f34659a;
        return (GetUserTypeUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(GetUserTypeUseCase.class), null, null);
    }

    @NotNull
    public abstract String getId();

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @Nullable
    public DeepLinkModel getPendingDeeplink() {
        return this.pendingDeeplink;
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public MutableLiveData<ProfileSelectorDialogState> getProfileSelectorDialogState() {
        return this.profileSelectorDialogState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public ProfileSelectorHelper getProfileSelectorHelper() {
        ViewModelComponentsProviders viewModelComponentsProviders = this.f34659a;
        return (ProfileSelectorHelper) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(ProfileSelectorHelper.class), null, null);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public CoroutineScope getScope() {
        return this.scope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public SuspendUseCase<Boolean> getShowUserTypeSelectorUseCase() {
        StringQualifier stringQualifierNamed = QualifierKt.named(UserTypeKt.SHOW_USERTYPE_SELECTOR_USECASE_NAME);
        ViewModelComponentsProviders viewModelComponentsProviders = this.f34659a;
        return (SuspendUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(SuspendUseCase.class), stringQualifierNamed, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public StoreUserTypeUseCase getStoreUserTypeUseCase() {
        ViewModelComponentsProviders viewModelComponentsProviders = this.f34659a;
        return (StoreUserTypeUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(StoreUserTypeUseCase.class), null, null);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @NotNull
    public Flow<UserTypeContract.Event> getUserTypeEvents() {
        return FlowKt.consumeAsFlow(this._userTypeEvents);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    @Nullable
    public String getUserTypeSelectedOption() {
        return this.userTypeSelectedOption;
    }

    @NotNull
    public final Channel<UserTypeContract.Event> get_userTypeEvents() {
        return this._userTypeEvents;
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onChangeProfileRetry() {
        UserTypeViewModelDelegate.DefaultImpls.onChangeProfileRetry(this);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onSelectorReset() {
        UserTypeViewModelDelegate.DefaultImpls.onSelectorReset(this);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onShowUserTypeSelector(@NotNull String selectedOption) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new c(selectedOption, null), 3, null);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onStoreUserTypeInComponent() {
        String userTypeSelectedOption = getUserTypeSelectedOption();
        if (userTypeSelectedOption == null) {
            return;
        }
        onChangeSelectedOption(userTypeSelectedOption);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onSwitchToEnterprise() {
        UserTypeViewModelDelegate.DefaultImpls.onSwitchToEnterprise(this);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void onUserTypeSelected(@NotNull String str) {
        UserTypeViewModelDelegate.DefaultImpls.onUserTypeSelected(this, str);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void openEnterpriseDialog() {
        String userTypeSelectedOption = getUserTypeSelectedOption();
        if (userTypeSelectedOption != null) {
            onShowUserTypeSelector(userTypeSelectedOption);
        }
    }

    @Nullable
    public final Object persistUserSelectedType(@NotNull Continuation<? super Unit> continuation) {
        Object objExecute = getStoreUserTypeUseCase().execute(getProfileSelectorHelper().userTypeFrom(getUserTypeSelectedOption()), continuation);
        return objExecute == ek.a.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void setPendingDeeplink(@Nullable DeepLinkModel deepLinkModel) {
        this.pendingDeeplink = deepLinkModel;
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void setUserTypeSelectedOption(@Nullable String str) {
        this.userTypeSelectedOption = str;
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void storeToken(@NotNull String str) {
        UserTypeViewModelDelegate.DefaultImpls.storeToken(this, str);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate
    public void trackAction(@NotNull TrackAction trackAction) {
        UserTypeViewModelDelegate.DefaultImpls.trackAction(this, trackAction);
    }
}
