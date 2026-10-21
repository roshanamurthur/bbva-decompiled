package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/Lifecycle;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "eventFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/Lifecycle$Event;", "getEventFlow", "(Landroidx/lifecycle/Lifecycle;)Lkotlinx/coroutines/flow/Flow;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LifecycleKt {

    /* JADX INFO: compiled from: Lifecycle.kt */
    @DebugMetadata(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/LifecycleKt$eventFlow$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<ProducerScope<? super Lifecycle.Event>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21899p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f21900q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f21901r0;

        /* JADX INFO: renamed from: androidx.lifecycle.LifecycleKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Lifecycle.kt */
        public static final class C0089a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Lifecycle f21902p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ LifecycleEventObserver f21903q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0089a(Lifecycle lifecycle, i iVar) {
                super(0);
                this.f21902p0 = lifecycle;
                this.f21903q0 = iVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f21902p0.removeObserver(this.f21903q0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lifecycle lifecycle, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21901r0 = lifecycle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f21901r0, continuation);
            aVar.f21900q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super Lifecycle.Event> producerScope, Continuation<? super Unit> continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.i] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21899p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.f21900q0;
                ?? r1 = new LifecycleEventObserver() { // from class: androidx.lifecycle.i
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        producerScope.mo5953trySendJP2dKIU(event);
                    }
                };
                Lifecycle lifecycle = this.f21901r0;
                lifecycle.addObserver(r1);
                C0089a c0089a = new C0089a(lifecycle, r1);
                this.f21899p0 = 1;
                if (ProduceKt.awaitClose(producerScope, c0089a, this) == coroutine_suspended) {
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

    @NotNull
    public static final LifecycleCoroutineScope getCoroutineScope(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        while (true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
            AtomicReference<Object> internalScopeRef = lifecycle.getInternalScopeRef();
            do {
                if (internalScopeRef.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                    lifecycleCoroutineScopeImpl2.register();
                    return lifecycleCoroutineScopeImpl2;
                }
            } while (internalScopeRef.get() == null);
        }
    }

    @NotNull
    public static final Flow<Lifecycle.Event> getEventFlow(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        return FlowKt.flowOn(FlowKt.callbackFlow(new a(lifecycle, null)), Dispatchers.getMain().getImmediate());
    }
}
