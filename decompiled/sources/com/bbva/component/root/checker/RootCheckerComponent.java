package com.bbva.component.root.checker;

import android.content.Context;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.ethermobilesdk.devicechecker.DeviceChecker;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RootCheckerComponent.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/root/checker/RootCheckerComponent;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "", "getId", "Lkotlin/Function1;", "", "block", "checkLocalRoot", "dispose", "Landroid/content/Context;", "context", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Landroid/content/Context;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Companion", "component-root-checker_release"}, k = 1, mv = {1, 9, 0})
public final class RootCheckerComponent extends ReactiveComponent {

    @NotNull
    public static final String ACTION_NOT_ROOTED = "action-not-rooted";

    @NotNull
    public static final String ACTION_ROOTED = "action-rooted";

    @NotNull
    public static final String ID = "component-root-checker";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f28229p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final CompletableJob f28230q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final DeviceChecker f28231r0;

    /* JADX INFO: compiled from: RootCheckerComponent.kt */
    @DebugMetadata(c = "com.bbva.component.root.checker.RootCheckerComponent$checkLocalRoot$1", f = "RootCheckerComponent.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f28232p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public RootCheckerComponent f28233q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f28234r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f28235s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ RootCheckerComponent f28236t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super String, Unit> function1, RootCheckerComponent rootCheckerComponent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28235s0 = function1;
            this.f28236t0 = rootCheckerComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f28235s0, this.f28236t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1<String, Unit> function1;
            RootCheckerComponent rootCheckerComponent;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f28234r0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                function1 = this.f28235s0;
                this.f28232p0 = function1;
                RootCheckerComponent rootCheckerComponent2 = this.f28236t0;
                this.f28233q0 = rootCheckerComponent2;
                this.f28234r0 = 1;
                Object objAccess$isRooted = RootCheckerComponent.access$isRooted(rootCheckerComponent2, this);
                if (objAccess$isRooted == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rootCheckerComponent = rootCheckerComponent2;
                obj = objAccess$isRooted;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rootCheckerComponent = this.f28233q0;
                function1 = this.f28232p0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(RootCheckerComponent.access$fireAction(rootCheckerComponent, ((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RootCheckerComponent(Context context, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }

    public static final String access$fireAction(RootCheckerComponent rootCheckerComponent, boolean z10) {
        rootCheckerComponent.getClass();
        return z10 ? ACTION_ROOTED : ACTION_NOT_ROOTED;
    }

    public static final Object access$isRooted(RootCheckerComponent rootCheckerComponent, Continuation continuation) {
        return BuildersKt.withContext(rootCheckerComponent.f28229p0.io(), new h5.a(rootCheckerComponent, null), continuation);
    }

    public final void checkLocalRoot(@NotNull Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(this.f28229p0.main()), this.f28230q0), null, null, new a(block, this, null), 3, null);
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        super.dispose();
        JobKt__JobKt.cancelChildren$default((Job) this.f28230q0, (CancellationException) null, 1, (Object) null);
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    public RootCheckerComponent(@NotNull Context context, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f28229p0 = dispatchers;
        this.f28230q0 = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f28231r0 = new DeviceChecker(context);
    }
}
