package dc;

import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.slidemenuview.domain.model.MenuClickAction;
import com.bbva.slidemenuview.presentation.DefaultMenuDelegate;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.slidemenuview.presentation.DefaultMenuDelegate$performNavigation$1", f = "MenuDelegate.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68166p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DefaultMenuDelegate f68167q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MenuClickAction f68168r0;

    /* JADX INFO: renamed from: dc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MenuDelegate.kt */
    public static final class C0280a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DefaultMenuDelegate f68169p0;

        public C0280a(DefaultMenuDelegate defaultMenuDelegate) {
            this.f68169p0 = defaultMenuDelegate;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            DefaultMenuDelegate.access$handleWebNavigationState(this.f68169p0, (WebNavigationState) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DefaultMenuDelegate defaultMenuDelegate, MenuClickAction menuClickAction, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f68167q0 = defaultMenuDelegate;
        this.f68168r0 = menuClickAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f68167q0, this.f68168r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68166p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            DefaultMenuDelegate defaultMenuDelegate = this.f68167q0;
            Flow flowNavigate$default = NavigateDispatcher.DefaultImpls.navigate$default(DefaultMenuDelegate.access$getWebNavigationDispatcher(defaultMenuDelegate), this.f68168r0.getRoute(), true, null, 4, null);
            C0280a c0280a = new C0280a(defaultMenuDelegate);
            this.f68166p0 = 1;
            if (flowNavigate$default.collect(c0280a, this) == coroutine_suspended) {
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
