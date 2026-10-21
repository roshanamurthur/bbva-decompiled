package com.bbva.glomohybrid.login.domain.usecase;

import androidx.camera.core.imagecapture.a;
import bk.q;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.passchecker.PassChecker;
import com.bbva.ethermobilesdk.passchecker.model.api.output.Validation;
import com.bbva.glomohybrid.base.cells.channels.LoginChannels;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.login.domain.model.UserCredentials;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: ValidatePasswordQualityUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/usecase/ValidatePasswordQualityUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;", "", "params", "execute", "(Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nValidatePasswordQualityUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidatePasswordQualityUseCase.kt\ncom/bbva/glomohybrid/login/domain/usecase/ValidatePasswordQualityUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,69:1\n56#2,6:70\n56#2,6:76\n*S KotlinDebug\n*F\n+ 1 ValidatePasswordQualityUseCase.kt\ncom/bbva/glomohybrid/login/domain/usecase/ValidatePasswordQualityUseCase\n*L\n21#1:70,6\n22#1:76,6\n*E\n"})
public final class ValidatePasswordQualityUseCase implements SuspendUseCaseWithParams<UserCredentials, Unit> {

    @NotNull
    public static final String KEY_PASSWORD_COMPROMISED = "compromised";

    @NotNull
    public static final String KEY_PASSWORD_QUALITY = "quality";

    @NotNull
    public static final String KEY_PASSWORD_VALID = "isValid";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MessageDispatcher f33451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f33452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f33453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f33454d;

    /* JADX INFO: compiled from: ValidatePasswordQualityUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase", f = "ValidatePasswordQualityUseCase.kt", i = {0}, l = {31, 35, 38}, m = "execute", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ValidatePasswordQualityUseCase f33455p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f33456q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f33458s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33456q0 = obj;
            this.f33458s0 |= Integer.MIN_VALUE;
            return ValidatePasswordQualityUseCase.this.execute((UserCredentials) null, (Continuation<? super Unit>) this);
        }
    }

    /* JADX INFO: compiled from: ValidatePasswordQualityUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase$sendPasswordQualityToWeb$2", f = "ValidatePasswordQualityUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f33460q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, ? extends Object> map, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f33460q0 = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ValidatePasswordQualityUseCase.this.new b(this.f33460q0, continuation);
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
            ValidatePasswordQualityUseCase.this.f33451a.sendMessage(LoginChannels.PASSWORD_QUALITY_CHANNEL_NAME, this.f33460q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ValidatePasswordQualityUseCase(@NotNull final ViewModelComponentsProviders provider, @NotNull MessageDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f33451a = dispatcher;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = null == true ? 1 : 0;
        this.f33452b = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<PassChecker>() { // from class: com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.ethermobilesdk.passchecker.PassChecker, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PassChecker invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(PassChecker.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = null == true ? 1 : 0;
        final Object[] objArr3 = null == true ? 1 : 0;
        this.f33453c = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<PasswordQualityConfigurator>() { // from class: com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.login.domain.usecase.PasswordQualityConfigurator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PasswordQualityConfigurator invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(PasswordQualityConfigurator.class), objArr2, objArr3);
            }
        });
        this.f33454d = q.mapOf(TuplesKt.to(KEY_PASSWORD_QUALITY, 0), TuplesKt.to(KEY_PASSWORD_VALID, Boolean.FALSE), TuplesKt.to(KEY_PASSWORD_COMPROMISED, 0));
    }

    public final Object a(Map<String, ? extends Object> map, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new b(map, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final Object b(UserCredentials userCredentials, Continuation<? super Result<Validation>> continuation) {
        return PassChecker.validate$default((PassChecker) this.f33452b.getValue(), ((PasswordQualityConfigurator) this.f33453c.getValue()).getCom.bbva.component.dm.naturalauth.Constants.policy java.lang.String(), userCredentials.getPassword(), "", false, Boxing.boxInt(10), continuation, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull UserCredentials userCredentials, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        ValidatePasswordQualityUseCase validatePasswordQualityUseCase;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f33458s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33458s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objB = aVar.f33456q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f33458s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objB);
            aVar.f33455p0 = this;
            aVar.f33458s0 = 1;
            objB = b(userCredentials, aVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            validatePasswordQualityUseCase = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(objB);
                    return Unit.INSTANCE;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objB);
                return Unit.INSTANCE;
            }
            validatePasswordQualityUseCase = aVar.f33455p0;
            ResultKt.throwOnFailure(objB);
        }
        Result result = (Result) objB;
        if (result instanceof Result.Success) {
            Validation validation = (Validation) ((Result.Success) result).getValue();
            validatePasswordQualityUseCase.getClass();
            Map<String, ? extends Object> mapMapOf = q.mapOf(TuplesKt.to(KEY_PASSWORD_QUALITY, Integer.valueOf(validation.getQuality())), TuplesKt.to(KEY_PASSWORD_VALID, Boolean.valueOf(validation.isValid())), TuplesKt.to(KEY_PASSWORD_COMPROMISED, Integer.valueOf(validation.getCompromised())));
            aVar.f33455p0 = null;
            aVar.f33458s0 = 2;
            if (validatePasswordQualityUseCase.a(mapMapOf, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (!(result instanceof Result.Error)) {
            return Unit.INSTANCE;
        }
        Map<String, ? extends Object> map = validatePasswordQualityUseCase.f33454d;
        aVar.f33455p0 = null;
        aVar.f33458s0 = 3;
        if (validatePasswordQualityUseCase.a(map, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
