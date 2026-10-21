package ma;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel;
import com.esotericsoftware.asm.Opcodes;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomeGlobalViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel$configureUser$1", f = "WelcomeGlobalViewModel.kt", i = {}, l = {Opcodes.INSTANCEOF, Opcodes.MULTIANEWARRAY}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public WelcomeGlobalViewModel f83380p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f83381q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ WelcomeGlobalViewModel f83382r0;

    /* JADX INFO: compiled from: WelcomeGlobalViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel$configureUser$1$1", f = "WelcomeGlobalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RememberedUser>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WelcomeGlobalViewModel f83383p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WelcomeGlobalViewModel welcomeGlobalViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f83383p0 = welcomeGlobalViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f83383p0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RememberedUser> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return WelcomeGlobalViewModel.access$getRememberedUserUseCase(this.f83383p0).execute();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WelcomeGlobalViewModel welcomeGlobalViewModel, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f83382r0 = welcomeGlobalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f83382r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        WelcomeGlobalViewModel welcomeGlobalViewModel;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83381q0;
        WelcomeGlobalViewModel welcomeGlobalViewModel2 = this.f83382r0;
        if (i10 != 0) {
            if (i10 == 1) {
                welcomeGlobalViewModel = this.f83380p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            welcomeGlobalViewModel2.configureUserFromLegacyApp();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineDispatcher coroutineDispatcherIo = welcomeGlobalViewModel2.getThreadDispatchers().io();
        a aVar = new a(welcomeGlobalViewModel2, null);
        this.f83380p0 = welcomeGlobalViewModel2;
        this.f83381q0 = 1;
        obj = BuildersKt.withContext(coroutineDispatcherIo, aVar, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        welcomeGlobalViewModel = welcomeGlobalViewModel2;
        welcomeGlobalViewModel.setRememberedUserData((RememberedUser) obj);
        RememberedUser rememberedUserData = welcomeGlobalViewModel2.getRememberedUserData();
        this.f83380p0 = null;
        this.f83381q0 = 2;
        if (WelcomeGlobalViewModel.access$setWelcomeState(welcomeGlobalViewModel2, rememberedUserData, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        welcomeGlobalViewModel2.configureUserFromLegacyApp();
        return Unit.INSTANCE;
    }
}
