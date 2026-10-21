package z5;

import com.bbva.component.ui.shortcuts.ShortcutsSimpleView;
import com.bbva.component.ui.shortcuts.model.ShortcutsState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShortcutsSimpleView.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.ui.shortcuts.ShortcutsSimpleView$observeState$1", f = "ShortcutsSimpleView.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f94982p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ShortcutsSimpleView f94983q0;

    /* JADX INFO: compiled from: ShortcutsSimpleView.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ShortcutsSimpleView f94984p0;

        public a(ShortcutsSimpleView shortcutsSimpleView) {
            this.f94984p0 = shortcutsSimpleView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            ShortcutsSimpleView.access$updateView(this.f94984p0, (ShortcutsState) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ShortcutsSimpleView shortcutsSimpleView, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f94983q0 = shortcutsSimpleView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f94983q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f94982p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ShortcutsSimpleView shortcutsSimpleView = this.f94983q0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(shortcutsSimpleView.getViewModel().getOnModel());
            a aVar = new a(shortcutsSimpleView);
            this.f94982p0 = 1;
            if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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
