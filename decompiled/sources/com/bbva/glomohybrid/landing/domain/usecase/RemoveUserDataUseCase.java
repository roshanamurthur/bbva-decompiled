package com.bbva.glomohybrid.landing.domain.usecase;

import android.app.Activity;
import androidx.camera.core.imagecapture.a;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.devices.DevicesDataManager;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.repository.datasource.UserDataStore;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.domain.model.LandingBiometricsParams;
import com.bbva.glomohybrid.mobilepayment.commons.PaymentUnrollHandler;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import com.bbva.push.firebase.ManualFirebasePushHandler;
import com.bbva.push.salesforce.SalesforcePushHandler;
import com.bbva.softtokenbase.ethertoken.GloMoEtherToken;
import com.bbva.softtokenbase.store.TOTPTokenDataStore;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/usecase/RemoveUserDataUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/glomohybrid/landing/domain/model/LandingBiometricsParams;", "", "params", "execute", "(Lcom/bbva/glomohybrid/landing/domain/model/LandingBiometricsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRemoveUserDataUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoveUserDataUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/RemoveUserDataUseCase\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n29#2,4:99\n29#2,4:103\n29#2,4:107\n29#2,4:117\n19#2:121\n29#2,4:127\n42#2,4:131\n42#2,4:137\n56#3,6:111\n176#4:122\n120#4:135\n120#4:141\n352#5:123\n158#5:136\n158#5:142\n766#6:124\n857#6,2:125\n1#7:143\n*S KotlinDebug\n*F\n+ 1 RemoveUserDataUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/RemoveUserDataUseCase\n*L\n33#1:99,4\n34#1:103,4\n35#1:107,4\n37#1:117,4\n38#1:121\n41#1:127,4\n53#1:131,4\n61#1:137,4\n36#1:111,6\n38#1:122\n53#1:135\n61#1:141\n38#1:123\n53#1:136\n61#1:142\n38#1:124\n38#1:125,2\n*E\n"})
public final class RemoveUserDataUseCase implements SuspendUseCaseWithParams<LandingBiometricsParams, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f32890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f32891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f32892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f32893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f32894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f32895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f32896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ArrayList f32897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f32898i;

    /* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase", f = "RemoveUserDataUseCase.kt", i = {0, 0}, l = {56, 64}, m = "clearStores", n = {"this", Scopes.PROFILE}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public RemoveUserDataUseCase f32899p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public UserProfileConfiguration f32900q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f32901r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f32903t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32901r0 = obj;
            this.f32903t0 |= Integer.MIN_VALUE;
            return RemoveUserDataUseCase.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$clearStores$2", f = "RemoveUserDataUseCase.kt", i = {}, l = {57, 58}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRemoveUserDataUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoveUserDataUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/RemoveUserDataUseCase$clearStores$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1855#2,2:99\n*S KotlinDebug\n*F\n+ 1 RemoveUserDataUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/RemoveUserDataUseCase$clearStores$2\n*L\n57#1:99,2\n*E\n"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Iterator f32904p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f32905q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TOTPTokenDataStore f32907s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TOTPTokenDataStore tOTPTokenDataStore, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f32907s0 = tOTPTokenDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RemoveUserDataUseCase.this.new b(this.f32907s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Iterator it;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f32905q0;
            if (i10 != 0) {
                if (i10 == 1) {
                    it = this.f32904p0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            it = RemoveUserDataUseCase.this.f32897h.iterator();
            while (it.hasNext()) {
                UserDataStore userDataStore = (UserDataStore) it.next();
                this.f32904p0 = it;
                this.f32905q0 = 1;
                if (userDataStore.clear(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            TOTPTokenDataStore tOTPTokenDataStore = this.f32907s0;
            if (tOTPTokenDataStore == null) {
                return null;
            }
            this.f32904p0 = null;
            this.f32905q0 = 2;
            if (tOTPTokenDataStore.clear(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
    public static final class c extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ UserProfileConfiguration f32908p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UserProfileConfiguration userProfileConfiguration) {
            super(0);
            this.f32908p0 = userProfileConfiguration;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            Object[] objArr = new Object[1];
            UserProfileConfiguration userProfileConfiguration = this.f32908p0;
            objArr[0] = userProfileConfiguration != null ? userProfileConfiguration.getRememberedUser() : null;
            return ParametersHolderKt.parametersOf(objArr);
        }
    }

    /* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
    public static final class d extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ UserProfileConfiguration f32909p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(UserProfileConfiguration userProfileConfiguration) {
            super(0);
            this.f32909p0 = userProfileConfiguration;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(this.f32909p0);
        }
    }

    /* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase", f = "RemoveUserDataUseCase.kt", i = {0, 0, 0, 1, 1}, l = {46, 48, 49}, m = "execute", n = {"this", "params", "deviceId", "this", "deviceId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public RemoveUserDataUseCase f32910p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f32911q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f32912r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f32913s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f32915u0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32913s0 = obj;
            this.f32915u0 |= Integer.MIN_VALUE;
            return RemoveUserDataUseCase.this.execute((LandingBiometricsParams) null, (Continuation<? super Unit>) this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoveUserDataUseCase(@NotNull final ViewModelComponentsProviders provider, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f32890a = provider;
        this.f32891b = dispatchers;
        final Qualifier qualifier = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f32892c = LazyKt__LazyJVMKt.lazy(new Function0<BiometricAuthenticationDataManager>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final BiometricAuthenticationDataManager invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(BiometricAuthenticationDataManager.class), qualifier, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f32893d = LazyKt__LazyJVMKt.lazy(new Function0<DevicesDataManager>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.component.dm.devices.DevicesDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final DevicesDataManager invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(DevicesDataManager.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.f32894e = LazyKt__LazyJVMKt.lazy(new Function0<PaymentUnrollHandler>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$special$$inlined$injectOrNull$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.mobilepayment.commons.PaymentUnrollHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final PaymentUnrollHandler invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(PaymentUnrollHandler.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.f32895f = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceIdDataSource>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.localstorage.DeviceIdDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceIdDataSource invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(DeviceIdDataSource.class), objArr8, objArr9);
            }
        });
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.f32896g = LazyKt__LazyJVMKt.lazy(new Function0<SalesforcePushHandler>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$special$$inlined$injectOrNull$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.push.salesforce.SalesforcePushHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final SalesforcePushHandler invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(SalesforcePushHandler.class), objArr10, objArr11);
            }
        });
        List all = androidx.camera.core.impl.utils.c.f(provider).getAll(Reflection.getOrCreateKotlinClass(UserDataStore.class));
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (!(((UserDataStore) obj) instanceof TOTPTokenDataStore)) {
                arrayList.add(obj);
            }
        }
        this.f32897h = arrayList;
        final ViewModelComponentsProviders viewModelComponentsProviders = this.f32890a;
        final Object[] objArr12 = objArr2 == true ? 1 : 0;
        final Object[] objArr13 = objArr == true ? 1 : 0;
        this.f32898i = LazyKt__LazyJVMKt.lazy(new Function0<ManualFirebasePushHandler>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$special$$inlined$injectOrNull$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.push.firebase.ManualFirebasePushHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final ManualFirebasePushHandler invoke() {
                return a.e(viewModelComponentsProviders).getOrNull(Reflection.getOrCreateKotlinClass(ManualFirebasePushHandler.class), objArr12, objArr13);
            }
        });
    }

    public static final PaymentUnrollHandler access$getPaymentUnrollHandler(RemoveUserDataUseCase removeUserDataUseCase) {
        return (PaymentUnrollHandler) removeUserDataUseCase.f32894e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$unrollCommercialNotification(RemoveUserDataUseCase removeUserDataUseCase, Continuation continuation) {
        j9.b bVar;
        Boolean bool;
        removeUserDataUseCase.getClass();
        if (continuation instanceof j9.b) {
            bVar = (j9.b) continuation;
            int i10 = bVar.f78812r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f78812r0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new j9.b(removeUserDataUseCase, continuation);
            }
        } else {
            bVar = new j9.b(removeUserDataUseCase, continuation);
        }
        Object objUnregister = bVar.f78810p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f78812r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objUnregister);
                Result.Companion companion = Result.INSTANCE;
                SalesforcePushHandler salesforcePushHandler = (SalesforcePushHandler) removeUserDataUseCase.f32896g.getValue();
                if (salesforcePushHandler != null) {
                    bVar.f78812r0 = 1;
                    objUnregister = salesforcePushHandler.unregister(bVar);
                    if (objUnregister == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    bool = null;
                }
                Result.m5535constructorimpl(bool);
                return Unit.INSTANCE;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUnregister);
            bool = (Boolean) objUnregister;
            Result.m5535constructorimpl(bool);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$unrollManualFirebaseNotification(RemoveUserDataUseCase removeUserDataUseCase, Continuation continuation) {
        j9.c cVar;
        Boolean bool;
        removeUserDataUseCase.getClass();
        if (continuation instanceof j9.c) {
            cVar = (j9.c) continuation;
            int i10 = cVar.f78815r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f78815r0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new j9.c(removeUserDataUseCase, continuation);
            }
        } else {
            cVar = new j9.c(removeUserDataUseCase, continuation);
        }
        Object objUnregister = cVar.f78813p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f78815r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objUnregister);
                Result.Companion companion = Result.INSTANCE;
                ManualFirebasePushHandler manualFirebasePushHandler = (ManualFirebasePushHandler) removeUserDataUseCase.f32898i.getValue();
                if (manualFirebasePushHandler != null) {
                    cVar.f78815r0 = 1;
                    objUnregister = manualFirebasePushHandler.unregister(cVar);
                    if (objUnregister == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    bool = null;
                }
                Result.m5535constructorimpl(bool);
                return Unit.INSTANCE;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUnregister);
            bool = (Boolean) objUnregister;
            Result.m5535constructorimpl(bool);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }

    public static final Object access$unrollNonCommercialNotification(RemoveUserDataUseCase removeUserDataUseCase, String str, Continuation continuation) {
        if (str == null) {
            removeUserDataUseCase.getClass();
            return Unit.INSTANCE;
        }
        DevicesDataManager devicesDataManager = (DevicesDataManager) removeUserDataUseCase.f32893d.getValue();
        if (devicesDataManager == null) {
            return Unit.INSTANCE;
        }
        Object objUnrollNotifications = devicesDataManager.unrollNotifications(str, continuation);
        return objUnrollNotifications == ek.a.getCOROUTINE_SUSPENDED() ? objUnrollNotifications : Unit.INSTANCE;
    }

    public static final Object access$unrollNotifications(RemoveUserDataUseCase removeUserDataUseCase, String str, Continuation continuation) {
        removeUserDataUseCase.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new j9.d(removeUserDataUseCase, str, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public static final Object access$unrollPaymentsCredentials(RemoveUserDataUseCase removeUserDataUseCase, Continuation continuation) {
        removeUserDataUseCase.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new j9.e(removeUserDataUseCase, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(UserProfileConfiguration userProfileConfiguration, Continuation<? super Unit> continuation) {
        a aVar;
        RemoveUserDataUseCase removeUserDataUseCase;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f32903t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32903t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f32901r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f32903t0;
        if (i11 != 0) {
            if (i11 == 1) {
                userProfileConfiguration = aVar.f32900q0;
                removeUserDataUseCase = aVar.f32899p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        TOTPTokenDataStore tOTPTokenDataStore = (TOTPTokenDataStore) androidx.camera.core.impl.utils.c.f(this.f32890a).getOrNull(Reflection.getOrCreateKotlinClass(TOTPTokenDataStore.class), null, new d(userProfileConfiguration));
        CoroutineDispatcher coroutineDispatcherMo4923default = this.f32891b.mo4923default();
        b bVar = new b(tOTPTokenDataStore, null);
        aVar.f32899p0 = this;
        aVar.f32900q0 = userProfileConfiguration;
        aVar.f32903t0 = 1;
        if (BuildersKt.withContext(coroutineDispatcherMo4923default, bVar, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        removeUserDataUseCase = this;
        ViewModelComponentsProviders viewModelComponentsProviders = removeUserDataUseCase.f32890a;
        GloMoEtherToken gloMoEtherToken = (GloMoEtherToken) androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders).getOrNull(Reflection.getOrCreateKotlinClass(GloMoEtherToken.class), null, new c(userProfileConfiguration));
        if (gloMoEtherToken == null) {
            return Unit.INSTANCE;
        }
        aVar.f32899p0 = null;
        aVar.f32900q0 = null;
        aVar.f32903t0 = 2;
        if (gloMoEtherToken.deleteAllTokenList(aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull LandingBiometricsParams landingBiometricsParams, @NotNull Continuation<? super Unit> continuation) throws IllegalAccessException {
        e eVar;
        String deviceId;
        RemoveUserDataUseCase removeUserDataUseCase;
        Activity activity;
        String str;
        RemoveUserDataUseCase removeUserDataUseCase2;
        Unit unit;
        Object objCoroutineScope;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f32915u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f32915u0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f32913s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f32915u0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    String str2 = eVar.f32912r0;
                    LandingBiometricsParams landingBiometricsParams2 = (LandingBiometricsParams) eVar.f32911q0;
                    removeUserDataUseCase = eVar.f32910p0;
                    ResultKt.throwOnFailure(obj);
                    deviceId = str2;
                    landingBiometricsParams = landingBiometricsParams2;
                } else if (i11 == 2) {
                    str = (String) eVar.f32911q0;
                    removeUserDataUseCase2 = eVar.f32910p0;
                    ResultKt.throwOnFailure(obj);
                    eVar.f32910p0 = null;
                    eVar.f32911q0 = null;
                    eVar.f32915u0 = 3;
                    removeUserDataUseCase2.getClass();
                    objCoroutineScope = CoroutineScopeKt.coroutineScope(new j9.d(removeUserDataUseCase2, str, null), eVar);
                    if (objCoroutineScope != ek.a.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            UserProfileConfiguration f32666b = landingBiometricsParams.getF32666b();
            deviceId = ((DeviceIdDataSource) this.f32895f.getValue()).getDeviceId();
            eVar.f32910p0 = this;
            eVar.f32911q0 = landingBiometricsParams;
            eVar.f32912r0 = deviceId;
            eVar.f32915u0 = 1;
            if (a(f32666b, eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            removeUserDataUseCase = this;
            Result.Companion companion = Result.INSTANCE;
            BiometricAuthenticationDataManager biometricAuthenticationDataManager = (BiometricAuthenticationDataManager) removeUserDataUseCase.f32892c.getValue();
            if (biometricAuthenticationDataManager != null) {
                biometricAuthenticationDataManager.deleteAuthenticators(activity);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m5535constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        activity = landingBiometricsParams.get();
        removeUserDataUseCase.getClass();
        eVar.f32910p0 = removeUserDataUseCase;
        eVar.f32911q0 = deviceId;
        eVar.f32912r0 = null;
        eVar.f32915u0 = 2;
        Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(new j9.e(removeUserDataUseCase, null), eVar);
        if (objCoroutineScope2 != ek.a.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope2 = Unit.INSTANCE;
        }
        if (objCoroutineScope2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = deviceId;
        removeUserDataUseCase2 = removeUserDataUseCase;
        eVar.f32910p0 = null;
        eVar.f32911q0 = null;
        eVar.f32915u0 = 3;
        removeUserDataUseCase2.getClass();
        objCoroutineScope = CoroutineScopeKt.coroutineScope(new j9.d(removeUserDataUseCase2, str, null), eVar);
        if (objCoroutineScope != ek.a.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        if (objCoroutineScope == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RemoveUserDataUseCase(ViewModelComponentsProviders viewModelComponentsProviders, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
