package com.bbva.glomo.router;

import android.app.Activity;
import android.os.Bundle;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomohybrid.base.router.IntentExtra;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RouterOutdated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomo/router/RouterOutdated;", "Lcom/bbva/glomo/router/RouterBase;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/os/Bundle;", "bundle", "Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "parcel", "", "finalizeCurrentActivity", "", "continueNavigation", "(Landroid/app/Activity;Landroid/os/Bundle;Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;", "getRememberedUserUseCase", "<init>", "(Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;)V", "gl-router_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class RouterOutdated extends RouterBase {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final SuspendGetRememberedUserUseCase f30703r0;

    /* JADX INFO: compiled from: RouterOutdated.kt */
    @DebugMetadata(c = "com.bbva.glomo.router.RouterOutdated", f = "RouterOutdated.kt", i = {0, 0, 0}, l = {18}, m = "continueNavigation", n = {"this", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "finalizeCurrentActivity"}, s = {"L$0", "L$1", "Z$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public RouterOutdated f30704p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Activity f30705q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f30706r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f30707s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f30709u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30707s0 = obj;
            this.f30709u0 |= Integer.MIN_VALUE;
            return RouterOutdated.this.continueNavigation(null, null, null, false, this);
        }
    }

    public RouterOutdated(@NotNull SuspendGetRememberedUserUseCase getRememberedUserUseCase) {
        Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "getRememberedUserUseCase");
        this.f30703r0 = getRememberedUserUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomo.router.RouterBase
    @Nullable
    public Object continueNavigation(@NotNull Activity activity, @NotNull Bundle bundle, @Nullable IntentExtra.Parcel parcel, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        RouterOutdated routerOutdated;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30709u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30709u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objExecute = aVar.f30707s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30709u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            aVar.f30704p0 = this;
            aVar.f30705q0 = activity;
            aVar.f30706r0 = z10;
            aVar.f30709u0 = 1;
            objExecute = this.f30703r0.execute(aVar);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            routerOutdated = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = aVar.f30706r0;
            activity = aVar.f30705q0;
            routerOutdated = aVar.f30704p0;
            ResultKt.throwOnFailure(objExecute);
        }
        if (((RememberedUser) objExecute) == null || routerOutdated.isUserFromLegacyApp$gl_router_mexicoRelease()) {
            routerOutdated.navigateToWelcome(activity);
        } else {
            RouterBase.navigateToAccessScreen$default(routerOutdated, activity, false, 2, null);
        }
        if (z10) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }
}
