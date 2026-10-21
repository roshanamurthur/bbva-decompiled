package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text/TextDragObserver;", "observer", "", "detectDragGesturesAfterLongPressWithObserver", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDownAndDragGesturesWithObserver", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LongPressTextDragObserverKt {

    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f5922p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f5923q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f5924r0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0038a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f5925p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f5926q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ TextDragObserver f5927r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0038a(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation<? super C0038a> continuation) {
                super(2, continuation);
                this.f5926q0 = pointerInputScope;
                this.f5927r0 = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0038a(this.f5926q0, this.f5927r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0038a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f5925p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f5925p0 = 1;
                    if (LongPressTextDragObserverKt.access$detectPreDragGesturesWithObserver(this.f5926q0, this.f5927r0, this) == coroutine_suspended) {
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

        /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f5928p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f5929q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ TextDragObserver f5930r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f5929q0 = pointerInputScope;
                this.f5930r0 = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f5929q0, this.f5930r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f5928p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f5928p0 = 1;
                    if (LongPressTextDragObserverKt.access$detectDragGesturesWithObserver(this.f5929q0, this.f5930r0, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5923q0 = pointerInputScope;
            this.f5924r0 = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f5923q0, this.f5924r0, continuation);
            aVar.f5922p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f5922p0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            PointerInputScope pointerInputScope = this.f5923q0;
            TextDragObserver textDragObserver = this.f5924r0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new C0038a(pointerInputScope, textDragObserver, null), 1, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new b(pointerInputScope, textDragObserver, null), 1, null);
        }
    }

    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    public static final class b extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f5931p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextDragObserver textDragObserver) {
            super(1);
            this.f5931p0 = textDragObserver;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            this.f5931p0.mo540onStartk4lQ0M(offset.getF15533a());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f5932p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextDragObserver textDragObserver) {
            super(0);
            this.f5932p0 = textDragObserver;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f5932p0.onStop();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    public static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f5933p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextDragObserver textDragObserver) {
            super(0);
            this.f5933p0 = textDragObserver;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f5933p0.onCancel();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    public static final class e extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f5934p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextDragObserver textDragObserver) {
            super(2);
            this.f5934p0 = textDragObserver;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
            long f15533a = offset.getF15533a();
            Intrinsics.checkNotNullParameter(pointerInputChange, "<anonymous parameter 0>");
            this.f5934p0.mo539onDragk4lQ0M(f15533a);
            return Unit.INSTANCE;
        }
    }

    public static final Object access$detectDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation continuation) {
        Object objDetectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new e0.f(textDragObserver), new e0.g(textDragObserver), new e0.h(textDragObserver), new e0.i(textDragObserver), continuation);
        return objDetectDragGestures == ek.a.getCOROUTINE_SUSPENDED() ? objDetectDragGestures : Unit.INSTANCE;
    }

    public static final Object access$detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new e0.j(textDragObserver, null), continuation);
        return objAwaitEachGesture == ek.a.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    @Nullable
    public static final Object detectDownAndDragGesturesWithObserver(@NotNull PointerInputScope pointerInputScope, @NotNull TextDragObserver textDragObserver, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(pointerInputScope, textDragObserver, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Nullable
    public static final Object detectDragGesturesAfterLongPressWithObserver(@NotNull PointerInputScope pointerInputScope, @NotNull TextDragObserver textDragObserver, @NotNull Continuation<? super Unit> continuation) {
        Object objDetectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new b(textDragObserver), new c(textDragObserver), new d(textDragObserver), new e(textDragObserver), continuation);
        return objDetectDragGesturesAfterLongPress == ek.a.getCOROUTINE_SUSPENDED() ? objDetectDragGesturesAfterLongPress : Unit.INSTANCE;
    }
}
