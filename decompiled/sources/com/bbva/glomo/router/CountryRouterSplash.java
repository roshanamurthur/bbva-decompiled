package com.bbva.glomo.router;

import android.app.Activity;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.usecase.version.IsWebViewVersionValidUseCase;
import com.bbva.glomohybrid.base.usecase.version.LastVersionCheckerUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountryRouterSplash.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\r\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomo/router/CountryRouterSplash;", "Lcom/bbva/glomo/router/RouterSplash;", "Lcom/bbva/glomo/router/RouteActivity;", "computeNavigation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "navigateToWelcome", "w0", "Lcom/bbva/glomo/router/RouteActivity;", "getWelcomeRoute", "()Lcom/bbva/glomo/router/RouteActivity;", "welcomeRoute", "Lcom/bbva/glomohybrid/base/usecase/version/IsWebViewVersionValidUseCase;", "isWebViewVersionValidUseCase", "Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;", "getRememberedUserUseCase", "Lcom/bbva/glomohybrid/base/usecase/version/LastVersionCheckerUseCase;", "lastVersionCheckerUseCase", "<init>", "(Lcom/bbva/glomohybrid/base/usecase/version/IsWebViewVersionValidUseCase;Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;Lcom/bbva/glomohybrid/base/usecase/version/LastVersionCheckerUseCase;)V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryRouterSplash extends RouterSplash {

    @NotNull
    public final LastVersionCheckerUseCase v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final CountryRouteActivity.WelcomeRouteActivity f30685w0;

    /* JADX INFO: compiled from: CountryRouterSplash.kt */
    @DebugMetadata(c = "com.bbva.glomo.router.CountryRouterSplash", f = "CountryRouterSplash.kt", i = {0, 1, 1}, l = {18, 20}, m = "computeNavigation", n = {"this", "this", "nextRoute"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CountryRouterSplash f30686p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public RouteActivity f30687q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30688r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30690t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30688r0 = obj;
            this.f30690t0 |= Integer.MIN_VALUE;
            return CountryRouterSplash.this.computeNavigation(this);
        }
    }

    /* JADX INFO: compiled from: CountryRouterSplash.kt */
    @DebugMetadata(c = "com.bbva.glomo.router.CountryRouterSplash", f = "CountryRouterSplash.kt", i = {}, l = {26}, m = "shouldNavigateToWelcome", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f30691p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f30693r0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30691p0 = obj;
            this.f30693r0 |= Integer.MIN_VALUE;
            return CountryRouterSplash.this.b(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryRouterSplash(@NotNull IsWebViewVersionValidUseCase isWebViewVersionValidUseCase, @NotNull SuspendGetRememberedUserUseCase getRememberedUserUseCase, @NotNull LastVersionCheckerUseCase lastVersionCheckerUseCase) {
        super(isWebViewVersionValidUseCase, getRememberedUserUseCase);
        Intrinsics.checkNotNullParameter(isWebViewVersionValidUseCase, "isWebViewVersionValidUseCase");
        Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "getRememberedUserUseCase");
        Intrinsics.checkNotNullParameter(lastVersionCheckerUseCase, "lastVersionCheckerUseCase");
        this.v0 = lastVersionCheckerUseCase;
        this.f30685w0 = CountryRouteActivity.WelcomeRouteActivity.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Continuation<? super Boolean> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f30693r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f30693r0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objExecute = bVar.f30691p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f30693r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            if (this.v0.execute().booleanValue()) {
                SuspendGetRememberedUserUseCase getRememberedUserUseCase = getGetRememberedUserUseCase();
                bVar.f30693r0 = 1;
                objExecute = getRememberedUserUseCase.execute(bVar);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objExecute);
        boolean z10 = objExecute != null;
        return Boxing.boxBoolean(z10);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomo.router.RouterSplash
    @Nullable
    public Object computeNavigation(@NotNull Continuation<? super RouteActivity> continuation) {
        a aVar;
        CountryRouterSplash countryRouterSplash;
        RouteActivity routeActivity;
        CountryRouterSplash countryRouterSplash2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30690t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30690t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objComputeNavigation = aVar.f30688r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30690t0;
        if (i11 != 0) {
            if (i11 == 1) {
                countryRouterSplash = aVar.f30686p0;
                ResultKt.throwOnFailure(objComputeNavigation);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                routeActivity = aVar.f30687q0;
                countryRouterSplash2 = aVar.f30686p0;
                ResultKt.throwOnFailure(objComputeNavigation);
            }
            if (((Boolean) objComputeNavigation).booleanValue()) {
                return countryRouterSplash2.getWelcomeRoute();
            }
            return routeActivity;
        }
        ResultKt.throwOnFailure(objComputeNavigation);
        aVar.f30686p0 = this;
        aVar.f30690t0 = 1;
        objComputeNavigation = super.computeNavigation(aVar);
        if (objComputeNavigation == coroutine_suspended) {
            return coroutine_suspended;
        }
        countryRouterSplash = this;
        RouteActivity routeActivity2 = (RouteActivity) objComputeNavigation;
        aVar.f30686p0 = countryRouterSplash;
        aVar.f30687q0 = routeActivity2;
        aVar.f30690t0 = 2;
        Object objB = countryRouterSplash.b(aVar);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        routeActivity = routeActivity2;
        objComputeNavigation = objB;
        countryRouterSplash2 = countryRouterSplash;
        if (((Boolean) objComputeNavigation).booleanValue()) {
            return countryRouterSplash2.getWelcomeRoute();
        }
        return routeActivity;
    }

    @Override // com.bbva.glomo.router.RouterSplash
    @NotNull
    public RouteActivity getWelcomeRoute() {
        return this.f30685w0;
    }

    @Override // com.bbva.glomo.router.RouterBase
    public void navigateToWelcome(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Router.navigate$default(Router.INSTANCE, activity, getWelcomeRoute().getRoute(), getWelcomeRoute().getAnimation(), null, null, false, 56, null);
    }
}
