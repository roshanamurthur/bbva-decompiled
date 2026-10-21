package u;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollDraggableState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,637:1\n1#2:638\n*E\n"})
public final class j implements DraggableState, DragScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final State<ScrollingLogic> f93671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public ScrollScope f93672b;

    /* JADX INFO: compiled from: Scrollable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", i = {}, l = {534}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f93673p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f93674q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> f93676s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f93676s0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = j.this.new a(this.f93676s0, continuation);
            aVar.f93674q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((a) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f93673p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollScope scrollScope = (ScrollScope) this.f93674q0;
                j jVar = j.this;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(scrollScope, "<set-?>");
                jVar.f93672b = scrollScope;
                this.f93673p0 = 1;
                if (this.f93676s0.invoke(jVar, this) == coroutine_suspended) {
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

    public j(@NotNull State<ScrollingLogic> scrollLogic) {
        Intrinsics.checkNotNullParameter(scrollLogic, "scrollLogic");
        this.f93671a = scrollLogic;
        this.f93672b = ScrollableKt.f3816b;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final void dispatchRawDelta(float f6) {
        ScrollingLogic value = this.f93671a.getValue();
        value.d(value.g(f6));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @Nullable
    public final Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objScroll = this.f93671a.getValue().f3843d.scroll(mutatePriority, new a(function2, null), continuation);
        return objScroll == ek.a.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragScope
    public final void dragBy(float f6) {
        ScrollingLogic value = this.f93671a.getValue();
        value.a(this.f93672b, value.g(f6), NestedScrollSource.INSTANCE.m3392getDragWNlRxjI());
    }
}
