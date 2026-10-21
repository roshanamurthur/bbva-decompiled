package com.bbva.glomohybrid.cellsweb.presentation.viewmodel;

import androidx.camera.core.imagecapture.a;
import androidx.lifecycle.ViewModelKt;
import com.bbva.component.dm.headers.interceptor.HeadersInterceptorDataManager;
import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.SmartAssistanceCredentials;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.StoreUserTypeUseCase;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomohybrid.base.cells.constants.AuthTokenInterceptorsIds;
import com.bbva.glomohybrid.base.delegates.DynamicModulesDelegate;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.cellsweb.presentation.observers.BanxicoAppLifecycleObserver;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.CountryUserTypeCellsWebViewModelDelegate;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeViewModelDelegate;
import com.bbva.slidemenuview.presentation.MenuDelegate;
import com.bbva.smartassistance.SmartAssistanceController;
import com.bbva.smartassistance.flags.SmartAssistanceFlag;
import com.bbva.smartassistance.listeners.CustomBaseConversationListener;
import com.bbva.smartassistance.listeners.CustomBaseSessionListener;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: CellsWebViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B-\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0006\u0010\u0014\u001a\u00020\u0002R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebViewModel;", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebGlobalViewModel;", "", "initView", "initializeSmartAssistance", "", "question", "askToSmartAssistance", "logoutSmartAssistance", "token", "storeToken", "saveGlomoToken", "restoreGlomoToken", "Lcom/bbva/smartassistance/flags/SmartAssistanceFlag;", "flags", "reloadFlagsSmartAssistance", "onCloseSession", "Lcom/bbva/glomohybrid/base/models/ModalType;", "modal", "onModalConfirmClick", "initializeAppLifecycleObserver", "Lcom/bbva/glomohybrid/base/delegates/DynamicModulesDelegate;", "R0", "Lcom/bbva/glomohybrid/base/delegates/DynamicModulesDelegate;", "getDynamicModulesDelegate", "()Lcom/bbva/glomohybrid/base/delegates/DynamicModulesDelegate;", "dynamicModulesDelegate", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/CountryUserTypeCellsWebViewModelDelegate;", "S0", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/CountryUserTypeCellsWebViewModelDelegate;", "getUserTypeViewModelDelegate", "()Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/CountryUserTypeCellsWebViewModelDelegate;", "userTypeViewModelDelegate", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/slidemenuview/presentation/MenuDelegate;", "menuDelegate", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/slidemenuview/presentation/MenuDelegate;Lcom/bbva/glomohybrid/base/delegates/DynamicModulesDelegate;Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/CountryUserTypeCellsWebViewModelDelegate;)V", "Companion", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCellsWebViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsWebViewModel.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,164:1\n56#2,6:165\n56#2,6:171\n56#2,6:177\n56#2,6:183\n56#2,6:189\n56#2,6:195\n56#2,6:201\n*S KotlinDebug\n*F\n+ 1 CellsWebViewModel.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebViewModel\n*L\n36#1:165,6\n37#1:171,6\n38#1:177,6\n39#1:183,6\n40#1:189,6\n41#1:195,6\n42#1:201,6\n*E\n"})
public final class CellsWebViewModel extends CellsWebGlobalViewModel {

    @NotNull
    public static final String ID = "cells-web-view-model";

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @Nullable
    public final DynamicModulesDelegate dynamicModulesDelegate;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @NotNull
    public final CountryUserTypeCellsWebViewModelDelegate userTypeViewModelDelegate;

    @NotNull
    public final Lazy T0;

    @NotNull
    public final Lazy U0;

    @NotNull
    public final Lazy V0;

    @NotNull
    public final Lazy W0;

    @NotNull
    public final Lazy X0;

    @NotNull
    public final Lazy Y0;

    @NotNull
    public final Lazy Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public String f31813a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f31814b1;

    /* JADX INFO: compiled from: CellsWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$askToSmartAssistance$1", f = "CellsWebViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31815p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f31817r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31817r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebViewModel.this.new a(this.f31817r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31815p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SmartAssistanceController smartAssistanceControllerAccess$getSmartAssistanceController = CellsWebViewModel.access$getSmartAssistanceController(CellsWebViewModel.this);
                this.f31815p0 = 1;
                if (smartAssistanceControllerAccess$getSmartAssistanceController.ask(this.f31817r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$initializeAppLifecycleObserver$1", f = "CellsWebViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CellsWebViewModel.access$getAppLifecycleObserver(CellsWebViewModel.this).initialize();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$initializeSmartAssistance$1", f = "CellsWebViewModel.kt", i = {}, l = {74, 70}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCellsWebViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsWebViewModel.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebViewModel$initializeSmartAssistance$1\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,164:1\n26#2:165\n*S KotlinDebug\n*F\n+ 1 CellsWebViewModel.kt\ncom/bbva/glomohybrid/cellsweb/presentation/viewmodel/CellsWebViewModel$initializeSmartAssistance$1\n*L\n68#1:165\n*E\n"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CellsWebViewModel f31819p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f31820q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f31821r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public String f31822s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public SmartAssistanceController f31823t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f31824u0;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x009f  */
        /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CellsWebViewModel cellsWebViewModel;
            String[] strArrSplitWithVerticalBarToArray;
            String str;
            String str2;
            Object objExecute;
            String str3;
            SmartAssistanceController smartAssistanceController;
            AppSettings data;
            SmartAssistanceCredentials smartAssistantEncryptedKey;
            RememberedUser rememberedUser;
            String str4;
            String str5;
            CustomBaseConversationListener customBaseConversationListenerAccess$getBaseConversationListener;
            CustomBaseSessionListener customBaseSessionListenerAccess$getBaseSessionListener;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31824u0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                cellsWebViewModel = CellsWebViewModel.this;
                AppSettingsResult settings = CellsWebViewModel.access$getAppSettings(cellsWebViewModel).getSettings(SettingsPolicy.Local);
                if (!(settings instanceof AppSettingsResult.FreshResult) && !(settings instanceof AppSettingsResult.CachedResult)) {
                    settings = null;
                }
                String androidValue = (settings == null || (data = settings.getData()) == null || (smartAssistantEncryptedKey = data.getSmartAssistantEncryptedKey()) == null) ? null : smartAssistantEncryptedKey.getAndroidValue();
                if (androidValue != null) {
                    String strDecryptHexKey = StringExtensionsKt.decryptHexKey(androidValue);
                    if (strDecryptHexKey == null || (strArrSplitWithVerticalBarToArray = StringExtensionsKt.splitWithVerticalBarToArray(strDecryptHexKey)) == null) {
                        strArrSplitWithVerticalBarToArray = new String[0];
                    }
                    if (strArrSplitWithVerticalBarToArray.length == 3) {
                        SmartAssistanceController smartAssistanceControllerAccess$getSmartAssistanceController = CellsWebViewModel.access$getSmartAssistanceController(cellsWebViewModel);
                        str = strArrSplitWithVerticalBarToArray[0];
                        str2 = strArrSplitWithVerticalBarToArray[1];
                        String str6 = strArrSplitWithVerticalBarToArray[2];
                        SuspendGetRememberedUserUseCase suspendGetRememberedUserUseCaseAccess$getGetRememberedUserUseCase = CellsWebViewModel.access$getGetRememberedUserUseCase(cellsWebViewModel);
                        this.f31819p0 = cellsWebViewModel;
                        this.f31820q0 = str6;
                        this.f31821r0 = str2;
                        this.f31822s0 = str;
                        this.f31823t0 = smartAssistanceControllerAccess$getSmartAssistanceController;
                        this.f31824u0 = 1;
                        objExecute = suspendGetRememberedUserUseCaseAccess$getGetRememberedUserUseCase.execute(this);
                        if (objExecute == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = str6;
                        smartAssistanceController = smartAssistanceControllerAccess$getSmartAssistanceController;
                        rememberedUser = (RememberedUser) objExecute;
                        str4 = cellsWebViewModel.f31813a1;
                        if (str4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tsec");
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        customBaseConversationListenerAccess$getBaseConversationListener = CellsWebViewModel.access$getBaseConversationListener(cellsWebViewModel);
                        customBaseSessionListenerAccess$getBaseSessionListener = CellsWebViewModel.access$getBaseSessionListener(cellsWebViewModel);
                        this.f31819p0 = null;
                        this.f31820q0 = null;
                        this.f31821r0 = null;
                        this.f31822s0 = null;
                        this.f31823t0 = null;
                        this.f31824u0 = 2;
                        if (smartAssistanceController.initializeAmeliaChat(str, str2, str3, rememberedUser, str5, customBaseConversationListenerAccess$getBaseConversationListener, customBaseSessionListenerAccess$getBaseSessionListener, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else if (i10 == 1) {
                smartAssistanceController = this.f31823t0;
                String str7 = this.f31822s0;
                String str8 = this.f31821r0;
                str3 = this.f31820q0;
                cellsWebViewModel = this.f31819p0;
                ResultKt.throwOnFailure(obj);
                str2 = str8;
                str = str7;
                objExecute = obj;
                rememberedUser = (RememberedUser) objExecute;
                str4 = cellsWebViewModel.f31813a1;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tsec");
                    str5 = null;
                } else {
                    str5 = str4;
                }
                customBaseConversationListenerAccess$getBaseConversationListener = CellsWebViewModel.access$getBaseConversationListener(cellsWebViewModel);
                customBaseSessionListenerAccess$getBaseSessionListener = CellsWebViewModel.access$getBaseSessionListener(cellsWebViewModel);
                this.f31819p0 = null;
                this.f31820q0 = null;
                this.f31821r0 = null;
                this.f31822s0 = null;
                this.f31823t0 = null;
                this.f31824u0 = 2;
                if (smartAssistanceController.initializeAmeliaChat(str, str2, str3, rememberedUser, str5, customBaseConversationListenerAccess$getBaseConversationListener, customBaseSessionListenerAccess$getBaseSessionListener, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$logoutSmartAssistance$1", f = "CellsWebViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31825p0;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31825p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SmartAssistanceController smartAssistanceControllerAccess$getSmartAssistanceController = CellsWebViewModel.access$getSmartAssistanceController(CellsWebViewModel.this);
                this.f31825p0 = 1;
                if (smartAssistanceControllerAccess$getSmartAssistanceController.logout(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$onCloseSession$1", f = "CellsWebViewModel.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31827p0;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31827p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                StoreUserTypeUseCase storeUserTypeUseCase = CellsWebViewModel.this.getUserTypeViewModelDelegate().getStoreUserTypeUseCase();
                UserType userType = UserType.PERSONAL;
                this.f31827p0 = 1;
                if (storeUserTypeUseCase.execute(userType, (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$reloadFlagsSmartAssistance$1", f = "CellsWebViewModel.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31829p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SmartAssistanceFlag f31831r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SmartAssistanceFlag smartAssistanceFlag, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f31831r0 = smartAssistanceFlag;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebViewModel.this.new f(this.f31831r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31829p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SmartAssistanceController smartAssistanceControllerAccess$getSmartAssistanceController = CellsWebViewModel.access$getSmartAssistanceController(CellsWebViewModel.this);
                this.f31829p0 = 1;
                if (smartAssistanceControllerAccess$getSmartAssistanceController.reloadFlags(this.f31831r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$restoreGlomoToken$1", f = "CellsWebViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebViewModel.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CellsWebViewModel cellsWebViewModel = CellsWebViewModel.this;
            HeadersInterceptorDataManager headersInterceptorDataManagerAccess$getHeadersInterceptorDataManager = CellsWebViewModel.access$getHeadersInterceptorDataManager(cellsWebViewModel);
            String str = cellsWebViewModel.f31814b1;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("glomoTsec");
                str = null;
            }
            headersInterceptorDataManagerAccess$getHeadersInterceptorDataManager.setToken(str, AuthTokenInterceptorsIds.GLOMO.toString());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$saveGlomoToken$1", f = "CellsWebViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f31834q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f31834q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebViewModel.this.new h(this.f31834q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CellsWebViewModel.this.f31814b1 = this.f31834q0;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CellsWebViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$storeToken$1", f = "CellsWebViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f31836q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f31836q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CellsWebViewModel.this.new i(this.f31836q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CellsWebViewModel.this.f31813a1 = this.f31836q0;
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CellsWebViewModel(ViewModelComponentsProviders viewModelComponentsProviders, MenuDelegate menuDelegate, DynamicModulesDelegate dynamicModulesDelegate, CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, menuDelegate, (i10 & 4) != 0 ? null : dynamicModulesDelegate, (i10 & 8) != 0 ? new CountryUserTypeCellsWebViewModelDelegate(viewModelComponentsProviders) : countryUserTypeCellsWebViewModelDelegate);
    }

    public static final BanxicoAppLifecycleObserver access$getAppLifecycleObserver(CellsWebViewModel cellsWebViewModel) {
        return (BanxicoAppLifecycleObserver) cellsWebViewModel.Y0.getValue();
    }

    public static final AppSettingsRepository access$getAppSettings(CellsWebViewModel cellsWebViewModel) {
        return (AppSettingsRepository) cellsWebViewModel.V0.getValue();
    }

    public static final CustomBaseConversationListener access$getBaseConversationListener(CellsWebViewModel cellsWebViewModel) {
        return (CustomBaseConversationListener) cellsWebViewModel.W0.getValue();
    }

    public static final CustomBaseSessionListener access$getBaseSessionListener(CellsWebViewModel cellsWebViewModel) {
        return (CustomBaseSessionListener) cellsWebViewModel.X0.getValue();
    }

    public static final SuspendGetRememberedUserUseCase access$getGetRememberedUserUseCase(CellsWebViewModel cellsWebViewModel) {
        return (SuspendGetRememberedUserUseCase) cellsWebViewModel.T0.getValue();
    }

    public static final HeadersInterceptorDataManager access$getHeadersInterceptorDataManager(CellsWebViewModel cellsWebViewModel) {
        return (HeadersInterceptorDataManager) cellsWebViewModel.Z0.getValue();
    }

    public static final SmartAssistanceController access$getSmartAssistanceController(CellsWebViewModel cellsWebViewModel) {
        return (SmartAssistanceController) cellsWebViewModel.U0.getValue();
    }

    public final void askToSmartAssistance(@NotNull String question) {
        Intrinsics.checkNotNullParameter(question, "question");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(question, null), 3, null);
    }

    @Nullable
    public final DynamicModulesDelegate getDynamicModulesDelegate() {
        return this.dynamicModulesDelegate;
    }

    @NotNull
    public final CountryUserTypeCellsWebViewModelDelegate getUserTypeViewModelDelegate() {
        return this.userTypeViewModelDelegate;
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel
    public void initView() {
        super.initView();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l8.c(this, null), 3, null);
    }

    public final void initializeAppLifecycleObserver() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    public final void initializeSmartAssistance() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    public final void logoutSmartAssistance() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new d(null), 3, null);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel
    public void onCloseSession() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e(null), 3, null);
        super.onCloseSession();
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel, com.bbva.glomohybrid.base.delegates.EventsModalDelegate
    public void onModalConfirmClick(@NotNull ModalType modal) {
        Intrinsics.checkNotNullParameter(modal, "modal");
        super.onModalConfirmClick(modal);
        boolean z10 = modal instanceof ModalType.ChangeUser;
        CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate = this.userTypeViewModelDelegate;
        if (z10 || (modal instanceof ModalType.ChangeUserWithFeaturesList)) {
            countryUserTypeCellsWebViewModelDelegate.onPersistedSelectorReset();
        } else if (modal instanceof ModalType.ErrorSSONoPhone) {
            countryUserTypeCellsWebViewModelDelegate.onChangeProfileRetry();
        }
    }

    public final void reloadFlagsSmartAssistance(@NotNull SmartAssistanceFlag flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f(flags, null), 3, null);
    }

    public final void restoreGlomoToken() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g(null), 3, null);
    }

    public final void saveGlomoToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h(token, null), 3, null);
    }

    public final void storeToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.userTypeViewModelDelegate.storeToken(token);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new i(token, null), 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CellsWebViewModel(@NotNull final ViewModelComponentsProviders provider, @NotNull MenuDelegate menuDelegate, @Nullable DynamicModulesDelegate dynamicModulesDelegate, @NotNull CountryUserTypeCellsWebViewModelDelegate userTypeViewModelDelegate) {
        super(provider, menuDelegate);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(menuDelegate, "menuDelegate");
        Intrinsics.checkNotNullParameter(userTypeViewModelDelegate, "userTypeViewModelDelegate");
        this.dynamicModulesDelegate = dynamicModulesDelegate;
        this.userTypeViewModelDelegate = userTypeViewModelDelegate;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.T0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SuspendGetRememberedUserUseCase>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SuspendGetRememberedUserUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(SuspendGetRememberedUserUseCase.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.U0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<SmartAssistanceController>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.smartassistance.SmartAssistanceController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SmartAssistanceController invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(SmartAssistanceController.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.V0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<AppSettingsRepository>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.settings.repository.AppSettingsRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppSettingsRepository invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.W0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<CustomBaseConversationListener>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.smartassistance.listeners.CustomBaseConversationListener, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CustomBaseConversationListener invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(CustomBaseConversationListener.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.X0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<CustomBaseSessionListener>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.smartassistance.listeners.CustomBaseSessionListener, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CustomBaseSessionListener invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(CustomBaseSessionListener.class), objArr8, objArr9);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.Y0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<BanxicoAppLifecycleObserver>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.cellsweb.presentation.observers.BanxicoAppLifecycleObserver, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BanxicoAppLifecycleObserver invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(BanxicoAppLifecycleObserver.class), objArr10, objArr11);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode7 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.Z0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode7, (Function0) new Function0<HeadersInterceptorDataManager>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.headers.interceptor.HeadersInterceptorDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HeadersInterceptorDataManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(HeadersInterceptorDataManager.class), objArr12, objArr13);
            }
        });
        UserTypeViewModelDelegate.DefaultImpls.init$default(userTypeViewModelDelegate, null, 1, null);
    }
}
