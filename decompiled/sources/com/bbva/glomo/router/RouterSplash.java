package com.bbva.glomo.router;

import android.app.Activity;
import android.os.Bundle;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomohybrid.base.deeplink.constants.DynamicLinkConstants;
import com.bbva.glomohybrid.base.router.IntentExtra;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.usecase.version.IsWebViewVersionValidUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RouterSplash.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\r8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/bbva/glomo/router/RouterSplash;", "Lcom/bbva/glomo/router/RouterBase;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/os/Bundle;", "bundle", "Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "parcel", "", "finalizeCurrentActivity", "", "continueNavigation", "(Landroid/app/Activity;Landroid/os/Bundle;Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/router/RouteActivity;", "computeNavigation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;", "s0", "Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;", "getGetRememberedUserUseCase$gl_router_mexicoRelease", "()Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;", "getRememberedUserUseCase", "t0", "Lcom/bbva/glomo/router/RouteActivity;", "getWelcomeRoute", "()Lcom/bbva/glomo/router/RouteActivity;", "welcomeRoute", "u0", "Z", "getComesFromDeeplink", "()Z", "setComesFromDeeplink", "(Z)V", DynamicLinkConstants.COMES_FROM_DEEPLINK_KEY, "Lcom/bbva/glomohybrid/base/usecase/version/IsWebViewVersionValidUseCase;", "webViewVersionUseCase", "<init>", "(Lcom/bbva/glomohybrid/base/usecase/version/IsWebViewVersionValidUseCase;Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;)V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class RouterSplash extends RouterBase {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final IsWebViewVersionValidUseCase f30710r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SuspendGetRememberedUserUseCase getRememberedUserUseCase;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final RouteActivity.WelcomeRouteActivity f30712t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public boolean comesFromDeeplink;

    /* JADX INFO: compiled from: RouterSplash.kt */
    @DebugMetadata(c = "com.bbva.glomo.router.RouterSplash", f = "RouterSplash.kt", i = {0}, l = {68}, m = "computeNavigation$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public RouterSplash f30714p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30715q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30717s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30715q0 = obj;
            this.f30717s0 |= Integer.MIN_VALUE;
            return RouterSplash.a(RouterSplash.this, this);
        }
    }

    public RouterSplash(@NotNull IsWebViewVersionValidUseCase webViewVersionUseCase, @NotNull SuspendGetRememberedUserUseCase getRememberedUserUseCase) {
        Intrinsics.checkNotNullParameter(webViewVersionUseCase, "webViewVersionUseCase");
        Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "getRememberedUserUseCase");
        this.f30710r0 = webViewVersionUseCase;
        this.getRememberedUserUseCase = getRememberedUserUseCase;
        this.f30712t0 = RouteActivity.WelcomeRouteActivity.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(RouterSplash routerSplash, Continuation<? super RouteActivity> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30717s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30717s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = routerSplash.new a(continuation);
            }
        } else {
            aVar = routerSplash.new a(continuation);
        }
        Object objExecute = aVar.f30715q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30717s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            SuspendGetRememberedUserUseCase suspendGetRememberedUserUseCase = routerSplash.getRememberedUserUseCase;
            aVar.f30714p0 = routerSplash;
            aVar.f30717s0 = 1;
            objExecute = suspendGetRememberedUserUseCase.execute(aVar);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            routerSplash = aVar.f30714p0;
            ResultKt.throwOnFailure(objExecute);
        }
        RememberedUser rememberedUser = (RememberedUser) objExecute;
        if (routerSplash.comesFromDeeplink) {
            return RouteActivity.LandingRouteActivity.INSTANCE;
        }
        return (rememberedUser == null || routerSplash.isUserFromLegacyApp$gl_router_mexicoRelease()) ? routerSplash.getWelcomeRoute() : RouteActivity.LandingRouteActivity.INSTANCE;
    }

    public static final void access$navigate(RouterSplash routerSplash, Activity activity, Bundle bundle, RouteActivity routeActivity) {
        routerSplash.getClass();
        Router.navigate$default(Router.INSTANCE, activity, routeActivity.getRoute(), routeActivity.getAnimation(), bundle, null, false, 48, null);
    }

    @Nullable
    public Object computeNavigation(@NotNull Continuation<? super RouteActivity> continuation) {
        return a(this, continuation);
    }

    @Override // com.bbva.glomo.router.RouterBase
    @Nullable
    public Object continueNavigation(@NotNull Activity activity, @NotNull Bundle bundle, @Nullable IntentExtra.Parcel parcel, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new com.bbva.glomo.router.a(this, activity, bundle, z10, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final boolean getComesFromDeeplink() {
        return this.comesFromDeeplink;
    }

    @NotNull
    /* JADX INFO: renamed from: getGetRememberedUserUseCase$gl_router_mexicoRelease, reason: from getter */
    public final SuspendGetRememberedUserUseCase getGetRememberedUserUseCase() {
        return this.getRememberedUserUseCase;
    }

    @NotNull
    public RouteActivity getWelcomeRoute() {
        return this.f30712t0;
    }

    public final void setComesFromDeeplink(boolean z10) {
        this.comesFromDeeplink = z10;
    }
}
