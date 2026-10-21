package com.bbva.glomohybrid.landing.presentation.router;

import androidx.appcompat.app.AppCompatActivity;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler;
import com.bbva.glomohybrid.base.models.InAppUpdateInfo;
import com.bbva.glomohybrid.base.models.InAppUpdateType;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingInAppUpdatesRouter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/router/LandingInAppUpdatesRouter;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/appcompat/app/AppCompatActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$ImmediateUpdateNavigation;", "event", "", "update", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/glomohybrid/base/inappupdate/InAppUpdatesHandler;", "inAppUpdatesHandler", "Lcom/bbva/glomohybrid/landing/presentation/router/LandingRouter;", "navigationRouter", "<init>", "(Lcom/bbva/glomohybrid/base/inappupdate/InAppUpdatesHandler;Lcom/bbva/glomohybrid/landing/presentation/router/LandingRouter;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingInAppUpdatesRouter implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final InAppUpdatesHandler f33077p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final LandingRouter f33078q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f33079r0;

    /* JADX INFO: compiled from: LandingInAppUpdatesRouter.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.router.LandingInAppUpdatesRouter$update$1", f = "LandingInAppUpdatesRouter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLandingInAppUpdatesRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingInAppUpdatesRouter.kt\ncom/bbva/glomohybrid/landing/presentation/router/LandingInAppUpdatesRouter$update$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f33080p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LandingContract.Event.ImmediateUpdateNavigation f33081q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LandingInAppUpdatesRouter f33082r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f33083s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LandingContract.Event.ImmediateUpdateNavigation immediateUpdateNavigation, LandingInAppUpdatesRouter landingInAppUpdatesRouter, AppCompatActivity appCompatActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f33081q0 = immediateUpdateNavigation;
            this.f33082r0 = landingInAppUpdatesRouter;
            this.f33083s0 = appCompatActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f33081q0, this.f33082r0, this.f33083s0, continuation);
            aVar.f33080p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LandingContract.Event.ImmediateUpdateNavigation immediateUpdateNavigation = this.f33081q0;
            InAppUpdateInfo info = immediateUpdateNavigation.getUpdate().getInfo();
            LandingInAppUpdatesRouter landingInAppUpdatesRouter = this.f33082r0;
            if (info == null) {
                LandingInAppUpdatesRouter.access$navigateToMarket(landingInAppUpdatesRouter, this.f33083s0, immediateUpdateNavigation.getUpdate().getPackageId());
            } else {
                InAppUpdatesHandler inAppUpdatesHandler = landingInAppUpdatesRouter.f33077p0;
                if ((inAppUpdatesHandler != null ? Boxing.boxBoolean(inAppUpdatesHandler.startFlow(InAppUpdateType.IMMEDIATE, info)) : null) == null) {
                    LandingInAppUpdatesRouter.access$navigateToMarket(landingInAppUpdatesRouter, this.f33083s0, immediateUpdateNavigation.getUpdate().getPackageId());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public LandingInAppUpdatesRouter(@Nullable InAppUpdatesHandler inAppUpdatesHandler, @NotNull LandingRouter navigationRouter) {
        Intrinsics.checkNotNullParameter(navigationRouter, "navigationRouter");
        this.f33077p0 = inAppUpdatesHandler;
        this.f33078q0 = navigationRouter;
        this.f33079r0 = CoroutineScopeKt.MainScope();
    }

    public static final void access$navigateToMarket(LandingInAppUpdatesRouter landingInAppUpdatesRouter, AppCompatActivity appCompatActivity, String str) {
        landingInAppUpdatesRouter.getClass();
        landingInAppUpdatesRouter.f33078q0.navigate(appCompatActivity, new LandingContract.Event.Navigation(LandingContract.Event.Navigation.Type.MARKET, new Route(str, null, null, 6, null), false, null, 12, null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f33079r0.getCoroutineContext();
    }

    public final void update(@NotNull AppCompatActivity activity, @NotNull LandingContract.Event.ImmediateUpdateNavigation event) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(event, this, activity, null), 3, null);
    }
}
