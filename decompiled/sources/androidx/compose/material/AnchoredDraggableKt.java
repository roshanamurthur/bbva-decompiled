package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aH\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0001\u001a+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0012\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\f\u001a\u00028\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\\\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162#\b\u0002\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00060\u0018H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "anchoredDraggable", "targetValue", "", "snapTo", "(Landroidx/compose/material/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "velocity", "animateTo", "(Landroidx/compose/material/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "confirmValueChange", "rememberAnchoredDraggableState", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/AnchoredDraggableState;", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n1#2:711\n*E\n"})
public final class AnchoredDraggableKt {

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ CoroutineScope f6545p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ float f6546q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f6547r0;

        /* JADX INFO: renamed from: androidx.compose.material.AnchoredDraggableKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0045a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f6548p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f6549q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ float f6550r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0045a(AnchoredDraggableState<T> anchoredDraggableState, float f6, Continuation<? super C0045a> continuation) {
                super(2, continuation);
                this.f6549q0 = anchoredDraggableState;
                this.f6550r0 = f6;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0045a(this.f6549q0, this.f6550r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0045a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
                int i10 = this.f6548p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f6548p0 = 1;
                    if (this.f6549q0.settle(this.f6550r0, this) == coroutine_suspended) {
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
        public a(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f6547r0 = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, Float f6, Continuation<? super Unit> continuation) {
            float fFloatValue = f6.floatValue();
            a aVar = new a(this.f6547r0, continuation);
            aVar.f6545p0 = coroutineScope;
            aVar.f6546q0 = fFloatValue;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.f6545p0, null, null, new C0045a(this.f6547r0, this.f6546q0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {586}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<T> extends SuspendLambda implements Function3<AnchoredDragScope, Map<T, ? extends Float>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f6551p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ AnchoredDragScope f6552q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Map f6553r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ T f6554s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f6555t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f6556u0;

        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        public static final class a extends Lambda implements Function2<Float, Float, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AnchoredDragScope f6557p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f6558q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef) {
                super(2);
                this.f6557p0 = anchoredDragScope;
                this.f6558q0 = floatRef;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Float f6, Float f10) {
                float fFloatValue = f6.floatValue();
                this.f6557p0.dragTo(fFloatValue, f10.floatValue());
                this.f6558q0.element = fFloatValue;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(AnchoredDraggableState anchoredDraggableState, Object obj, float f6, Continuation continuation) {
            super(3, continuation);
            this.f6554s0 = obj;
            this.f6555t0 = anchoredDraggableState;
            this.f6556u0 = f6;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Continuation<? super Unit> continuation) {
            T t10 = this.f6554s0;
            b bVar = new b(this.f6555t0, t10, this.f6556u0, continuation);
            bVar.f6552q0 = anchoredDragScope;
            bVar.f6553r0 = (Map) obj;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f6551p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDragScope anchoredDragScope = this.f6552q0;
                Float f6 = (Float) this.f6553r0.get(this.f6554s0);
                if (f6 != null) {
                    Ref.FloatRef floatRef = new Ref.FloatRef();
                    AnchoredDraggableState<T> anchoredDraggableState = this.f6555t0;
                    float offset = Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
                    floatRef.element = offset;
                    float fFloatValue = f6.floatValue();
                    float f10 = this.f6556u0;
                    AnimationSpec<Float> animationSpec = anchoredDraggableState.getAnimationSpec();
                    a aVar = new a(anchoredDragScope, floatRef);
                    this.f6552q0 = null;
                    this.f6551p0 = 1;
                    if (SuspendAnimationKt.animate(offset, fFloatValue, f10, animationSpec, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class c<T> extends Lambda implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f6559p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class d<T> extends Lambda implements Function0<AnchoredDraggableState<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ T f6560p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Float, Float> f6561q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f6562r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ AnimationSpec<Float> f6563s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Boolean> f6564t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(T t10, Function1<? super Float, Float> function1, Function0<Float> function0, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function2) {
            super(0);
            this.f6560p0 = t10;
            this.f6561q0 = function1;
            this.f6562r0 = function0;
            this.f6563s0 = animationSpec;
            this.f6564t0 = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new AnchoredDraggableState(this.f6560p0, this.f6561q0, this.f6562r0, this.f6563s0, this.f6564t0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e<T> extends SuspendLambda implements Function3<AnchoredDragScope, Map<T, ? extends Float>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ AnchoredDragScope f6565p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Map f6566q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ T f6567r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(T t10, Continuation<? super e> continuation) {
            super(3, continuation);
            this.f6567r0 = t10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Continuation<? super Unit> continuation) {
            e eVar = new e(this.f6567r0, continuation);
            eVar.f6565p0 = anchoredDragScope;
            eVar.f6566q0 = (Map) obj;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AnchoredDragScope anchoredDragScope = this.f6565p0;
            Float f6 = (Float) this.f6566q0.get(this.f6567r0);
            if (f6 != null) {
                h0.a.a(anchoredDragScope, f6.floatValue(), 0.0f, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T> T a(Map<T, Float> map, float f6, boolean z10) {
        if (!(!map.isEmpty())) {
            throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
        }
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (it.hasNext()) {
            float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
            float f10 = z10 ? fFloatValue - f6 : f6 - fFloatValue;
            if (f10 < 0.0f) {
                f10 = Float.POSITIVE_INFINITY;
            }
            do {
                T next2 = it.next();
                float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                float f11 = z10 ? fFloatValue2 - f6 : f6 - fFloatValue2;
                if (f11 < 0.0f) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                if (Float.compare(f10, f11) > 0) {
                    next = next2;
                    f10 = f11;
                }
            } while (it.hasNext());
        }
        return (T) ((Map.Entry) next).getKey();
    }

    public static final Float access$maxOrNull(Map map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float access$minOrNull(Map map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final <T> Modifier anchoredDraggable(@NotNull Modifier modifier, @NotNull AnchoredDraggableState<T> state, @NotNull Orientation orientation, boolean z10, boolean z11, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return DraggableKt.draggable(modifier, state.getDraggableState$material_release(), orientation, (32 & 4) != 0 ? true : z10, (32 & 8) != 0 ? null : mutableInteractionSource, (32 & 16) != 0 ? false : state.isAnimationRunning(), (32 & 32) != 0 ? new DraggableKt.a(3, null) : null, (32 & 64) != 0 ? new DraggableKt.b(3, null) : new a(state, null), (32 & 128) != 0 ? false : z11);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            mutableInteractionSource = null;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z12, z13, mutableInteractionSource);
    }

    @ExperimentalMaterialApi
    @Nullable
    public static final <T> Object animateTo(@NotNull AnchoredDraggableState<T> anchoredDraggableState, T t10, float f6, @NotNull Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t10, null, new b(anchoredDraggableState, t10, f6, null), continuation, 2, null);
        return objAnchoredDrag$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f6, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f6 = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f6, continuation);
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final <T> AnchoredDraggableState<T> rememberAnchoredDraggableState(@NotNull T initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super T, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1812391462);
        AnimationSpec<Float> animationSpec2 = (i11 & 2) != 0 ? AnchoredDraggableDefaults.INSTANCE.getAnimationSpec() : animationSpec;
        Function1<? super T, Boolean> function2 = (i11 & 4) != 0 ? c.f6559p0 : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1812391462, i10, -1, "androidx.compose.material.rememberAnchoredDraggableState (AnchoredDraggable.kt:606)");
        }
        AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
        Function1<Float, Float> positionalThreshold = anchoredDraggableDefaults.getPositionalThreshold(composer, 6);
        Function0<Float> velocityThreshold = anchoredDraggableDefaults.getVelocityThreshold(composer, 6);
        AnchoredDraggableState<T> anchoredDraggableState = (AnchoredDraggableState) RememberSaveableKt.m2165rememberSaveable(new Object[]{initialValue, animationSpec2, function2, positionalThreshold, velocityThreshold}, (Saver) AnchoredDraggableState.INSTANCE.Saver(animationSpec2, function2, positionalThreshold, velocityThreshold), (String) null, (Function0) new d(initialValue, positionalThreshold, velocityThreshold, animationSpec2, function2), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return anchoredDraggableState;
    }

    @ExperimentalMaterialApi
    @Nullable
    public static final <T> Object snapTo(@NotNull AnchoredDraggableState<T> anchoredDraggableState, T t10, @NotNull Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t10, null, new e(t10, null), continuation, 2, null);
        return objAnchoredDrag$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }
}
