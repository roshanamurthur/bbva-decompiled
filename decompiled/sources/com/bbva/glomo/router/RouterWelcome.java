package com.bbva.glomo.router;

import android.app.Activity;
import android.os.Bundle;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.router.IntentExtra;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RouterWelcome.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomo/router/RouterWelcome;", "Lcom/bbva/glomo/router/RouterBase;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/os/Bundle;", "bundle", "Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "parcel", "", "finalizeCurrentActivity", "", "continueNavigation", "(Landroid/app/Activity;Landroid/os/Bundle;Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/router/WelcomeAction;", "welcomeAction", "computeNavigation", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class RouterWelcome extends RouterBase implements CoroutineScope {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30718r0 = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public WelcomeAction f30719s0 = WelcomeAction.None.INSTANCE;

    /* JADX INFO: compiled from: RouterWelcome.kt */
    @DebugMetadata(c = "com.bbva.glomo.router.RouterWelcome$computeNavigation$1", f = "RouterWelcome.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30720p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ WelcomeAction f30722r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Activity f30723s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WelcomeAction welcomeAction, Activity activity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f30722r0 = welcomeAction;
            this.f30723s0 = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RouterWelcome.this.new a(this.f30722r0, this.f30723s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30720p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                RouterWelcome.this.f30719s0 = this.f30722r0;
                Bundle bundle = Bundle.EMPTY;
                RouterWelcome routerWelcome = RouterWelcome.this;
                Activity activity = this.f30723s0;
                Intrinsics.checkNotNull(bundle);
                this.f30720p0 = 1;
                if (RouterBase.continueNavigation$default(routerWelcome, activity, bundle, null, true, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: RouterWelcome.kt */
    @DebugMetadata(c = "com.bbva.glomo.router.RouterWelcome$continueNavigation$2", f = "RouterWelcome.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Activity f30725q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f30725q0 = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RouterWelcome.this.new b(this.f30725q0, continuation);
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
            RouterWelcome routerWelcome = RouterWelcome.this;
            WelcomeAction welcomeAction = routerWelcome.f30719s0;
            boolean zAreEqual = Intrinsics.areEqual(welcomeAction, WelcomeAction.Bottom.INSTANCE);
            Activity activity = this.f30725q0;
            if (zAreEqual) {
                routerWelcome.navigateToCells(activity);
            } else if (Intrinsics.areEqual(welcomeAction, WelcomeAction.Top.INSTANCE)) {
                RouterBase.navigateToAccessScreen$default(routerWelcome, activity, false, 2, null);
                activity.finish();
            }
            return Unit.INSTANCE;
        }
    }

    public final void computeNavigation(@NotNull Activity activity, @NotNull WelcomeAction welcomeAction) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(welcomeAction, "welcomeAction");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(welcomeAction, activity, null), 3, null);
    }

    @Override // com.bbva.glomo.router.RouterBase
    @Nullable
    public Object continueNavigation(@NotNull Activity activity, @NotNull Bundle bundle, @Nullable IntentExtra.Parcel parcel, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new b(activity, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f30718r0.getCoroutineContext();
    }
}
