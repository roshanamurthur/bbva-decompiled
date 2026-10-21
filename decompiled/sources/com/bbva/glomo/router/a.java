package com.bbva.glomo.router;

import android.app.Activity;
import android.os.Bundle;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RouterSplash.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.glomo.router.RouterSplash$continueNavigation$2", f = "RouterSplash.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f30726p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RouterSplash f30727q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Activity f30728r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Bundle f30729s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f30730t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RouterSplash routerSplash, Activity activity, Bundle bundle, boolean z10, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f30727q0 = routerSplash;
        this.f30728r0 = activity;
        this.f30729s0 = bundle;
        this.f30730t0 = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f30727q0, this.f30728r0, this.f30729s0, this.f30730t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f30726p0;
        Activity activity = this.f30728r0;
        RouterSplash routerSplash = this.f30727q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            routerSplash.setComesFromDeeplink(ContextExtensionKt.comesFromDeeplink(activity));
            this.f30726p0 = 1;
            obj = routerSplash.computeNavigation(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        RouteActivity routeActivity = (RouteActivity) obj;
        if (ContextExtensionKt.isAndroidWebViewAvailable(activity)) {
            boolean zBooleanValue = routerSplash.f30710r0.execute().booleanValue();
            Bundle bundle = this.f30729s0;
            if (zBooleanValue) {
                RouterSplash.access$navigate(routerSplash, activity, bundle, RouteActivity.WebViewForceUpdateRouteActivity.INSTANCE);
            } else if (routerSplash.getCom.bbva.glomohybrid.base.deeplink.constants.DynamicLinkConstants.COMES_FROM_DEEPLINK_KEY java.lang.String()) {
                RouterSplash.access$navigate(routerSplash, activity, bundle, routeActivity);
            } else {
                RouterSplash.access$navigate(routerSplash, activity, bundle, routeActivity);
            }
        } else {
            routerSplash.navigateToWebViewNotAvailableActivity(activity);
        }
        if (this.f30730t0) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }
}
