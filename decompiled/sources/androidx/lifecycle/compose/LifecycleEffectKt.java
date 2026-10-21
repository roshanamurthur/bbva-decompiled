package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1$1;
import androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$1;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LifecycleEffect.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a<\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aF\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0013\u001aP\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0015\u001aJ\u0010\u0010\u001a\u00020\u00052\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0016\"\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0018\u001a2\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0019\u001a<\u0010\u001c\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u0011\u001aF\u0010\u001c\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u0013\u001aP\u0010\u001c\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u0015\u001aJ\u0010\u001c\u001a\u00020\u00052\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0016\"\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u0018\u001a2\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u0019¨\u0006\u001e²\u0006\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "event", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function0;", "", "onEvent", "LifecycleEventEffect", "(Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "key1", "Lkotlin/Function1;", "Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;", "Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "Lkotlin/ExtensionFunctionType;", "effects", "LifecycleStartEffect", "(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "keys", "([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "LifecycleResumeEffect", "currentOnEvent", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,745:1\n77#2:746\n77#2:753\n77#2:760\n77#2:767\n77#2:774\n77#2:785\n77#2:792\n77#2:799\n77#2:806\n77#2:813\n77#2:824\n1225#3,6:747\n1225#3,6:754\n1225#3,6:761\n1225#3,6:768\n1225#3,6:779\n1225#3,6:786\n1225#3,6:793\n1225#3,6:800\n1225#3,6:807\n1225#3,6:818\n1225#3,6:825\n86#4,4:775\n86#4,4:814\n81#5:831\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n56#1:746\n134#1:753\n197#1:760\n262#1:767\n323#1:774\n349#1:785\n466#1:792\n529#1:799\n594#1:806\n655#1:813\n681#1:824\n67#1:747,6\n137#1:754,6\n200#1:761,6\n265#1:768,6\n326#1:779,6\n359#1:786,6\n469#1:793,6\n532#1:800,6\n597#1:807,6\n658#1:818,6\n691#1:825,6\n326#1:775,4\n658#1:814,4\n66#1:831\n*E\n"})
public final class LifecycleEffectKt {

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    @SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,745:1\n64#2,5:746\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n*L\n76#1:746,5\n*E\n"})
    public static final class a extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22095p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.Event f22096q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Function0<Unit>> f22097r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, State<? extends Function0<Unit>> state) {
            super(1);
            this.f22095p0 = lifecycleOwner;
            this.f22096q0 = event;
            this.f22097r0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            final Lifecycle.Event event = this.f22096q0;
            final State<Function0<Unit>> state = this.f22097r0;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: y2.b
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                    if (event2 == event) {
                        LifecycleEffectKt.access$LifecycleEventEffect$lambda$0(state).invoke();
                    }
                }
            };
            final LifecycleOwner lifecycleOwner = this.f22095p0;
            lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
            return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                }
            };
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.Event f22098p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22099q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f22100r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f22101s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f22102t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Lifecycle.Event event, LifecycleOwner lifecycleOwner, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f22098p0 = event;
            this.f22099q0 = lifecycleOwner;
            this.f22100r0 = function0;
            this.f22101s0 = i10;
            this.f22102t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LifecycleEffectKt.LifecycleEventEffect(this.f22098p0, this.f22099q0, this.f22100r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f22101s0 | 1), this.f22102t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f22103p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22104q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> f22105r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f22106s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f22107t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj, LifecycleOwner lifecycleOwner, Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, int i10, int i11) {
            super(2);
            this.f22103p0 = obj;
            this.f22104q0 = lifecycleOwner;
            this.f22105r0 = function1;
            this.f22106s0 = i10;
            this.f22107t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LifecycleEffectKt.LifecycleResumeEffect(this.f22103p0, this.f22104q0, this.f22105r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f22106s0 | 1), this.f22107t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f22108p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f22109q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22110r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> f22111s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f22112t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f22113u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, Object obj2, LifecycleOwner lifecycleOwner, Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, int i10, int i11) {
            super(2);
            this.f22108p0 = obj;
            this.f22109q0 = obj2;
            this.f22110r0 = lifecycleOwner;
            this.f22111s0 = function1;
            this.f22112t0 = i10;
            this.f22113u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LifecycleEffectKt.LifecycleResumeEffect(this.f22108p0, this.f22109q0, this.f22110r0, this.f22111s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f22112t0 | 1), this.f22113u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f22114p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f22115q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Object f22116r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22117s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> f22118t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f22119u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, int i10, int i11) {
            super(2);
            this.f22114p0 = obj;
            this.f22115q0 = obj2;
            this.f22116r0 = obj3;
            this.f22117s0 = lifecycleOwner;
            this.f22118t0 = function1;
            this.f22119u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LifecycleEffectKt.LifecycleResumeEffect(this.f22114p0, this.f22115q0, this.f22116r0, this.f22117s0, this.f22118t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f22119u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object[] f22120p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22121q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> f22122r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f22123s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f22124t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Object[] objArr, LifecycleOwner lifecycleOwner, Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, int i10, int i11) {
            super(2);
            this.f22120p0 = objArr;
            this.f22121q0 = lifecycleOwner;
            this.f22122r0 = function1;
            this.f22123s0 = i10;
            this.f22124t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            num.intValue();
            Object[] objArr = this.f22120p0;
            LifecycleEffectKt.LifecycleResumeEffect(Arrays.copyOf(objArr, objArr.length), this.f22121q0, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) this.f22122r0, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f22123s0 | 1), this.f22124t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22125p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> f22126q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f22127r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f22128s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(LifecycleOwner lifecycleOwner, Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, int i10, int i11) {
            super(2);
            this.f22125p0 = lifecycleOwner;
            this.f22126q0 = function1;
            this.f22127r0 = i10;
            this.f22128s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f22127r0 | 1);
            LifecycleEffectKt.LifecycleResumeEffect(this.f22125p0, this.f22126q0, composer, iUpdateChangedFlags, this.f22128s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22129p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LifecycleResumePauseEffectScope f22130q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> f22131r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f22132s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, int i10) {
            super(2);
            this.f22129p0 = lifecycleOwner;
            this.f22130q0 = lifecycleResumePauseEffectScope;
            this.f22131r0 = function1;
            this.f22132s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f22132s0 | 1);
            LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = this.f22130q0;
            Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> function1 = this.f22131r0;
            LifecycleEffectKt.a(this.f22129p0, lifecycleResumePauseEffectScope, function1, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f22133p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22134q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> f22135r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f22136s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f22137t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Object obj, LifecycleOwner lifecycleOwner, Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, int i10, int i11) {
            super(2);
            this.f22133p0 = obj;
            this.f22134q0 = lifecycleOwner;
            this.f22135r0 = function1;
            this.f22136s0 = i10;
            this.f22137t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LifecycleEffectKt.LifecycleStartEffect(this.f22133p0, this.f22134q0, this.f22135r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f22136s0 | 1), this.f22137t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f22138p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f22139q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22140r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> f22141s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f22142t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f22143u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Object obj, Object obj2, LifecycleOwner lifecycleOwner, Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, int i10, int i11) {
            super(2);
            this.f22138p0 = obj;
            this.f22139q0 = obj2;
            this.f22140r0 = lifecycleOwner;
            this.f22141s0 = function1;
            this.f22142t0 = i10;
            this.f22143u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LifecycleEffectKt.LifecycleStartEffect(this.f22138p0, this.f22139q0, this.f22140r0, this.f22141s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f22142t0 | 1), this.f22143u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f22144p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f22145q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Object f22146r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22147s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> f22148t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f22149u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, int i10, int i11) {
            super(2);
            this.f22144p0 = obj;
            this.f22145q0 = obj2;
            this.f22146r0 = obj3;
            this.f22147s0 = lifecycleOwner;
            this.f22148t0 = function1;
            this.f22149u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LifecycleEffectKt.LifecycleStartEffect(this.f22144p0, this.f22145q0, this.f22146r0, this.f22147s0, this.f22148t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f22149u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object[] f22150p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22151q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> f22152r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f22153s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f22154t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Object[] objArr, LifecycleOwner lifecycleOwner, Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, int i10, int i11) {
            super(2);
            this.f22150p0 = objArr;
            this.f22151q0 = lifecycleOwner;
            this.f22152r0 = function1;
            this.f22153s0 = i10;
            this.f22154t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            num.intValue();
            Object[] objArr = this.f22150p0;
            LifecycleEffectKt.LifecycleStartEffect(Arrays.copyOf(objArr, objArr.length), this.f22151q0, (Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult>) this.f22152r0, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f22153s0 | 1), this.f22154t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class m extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22155p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> f22156q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f22157r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f22158s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(LifecycleOwner lifecycleOwner, Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, int i10, int i11) {
            super(2);
            this.f22155p0 = lifecycleOwner;
            this.f22156q0 = function1;
            this.f22157r0 = i10;
            this.f22158s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f22157r0 | 1);
            LifecycleEffectKt.LifecycleStartEffect(this.f22155p0, this.f22156q0, composer, iUpdateChangedFlags, this.f22158s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    public static final class n extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f22159p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LifecycleStartStopEffectScope f22160q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> f22161r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f22162s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, int i10) {
            super(2);
            this.f22159p0 = lifecycleOwner;
            this.f22160q0 = lifecycleStartStopEffectScope;
            this.f22161r0 = function1;
            this.f22162s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f22162s0 | 1);
            LifecycleStartStopEffectScope lifecycleStartStopEffectScope = this.f22160q0;
            Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> function1 = this.f22161r0;
            LifecycleEffectKt.b(this.f22159p0, lifecycleStartStopEffectScope, function1, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void LifecycleEventEffect(@NotNull Lifecycle.Event event, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function0<Unit> function0, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-709389590);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(event) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i12 &= -113;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-709389590, i12, -1, "androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:57)");
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i12 >> 6) & 14);
            boolean zChanged = ((i12 & 14) == 4) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(lifecycleOwner, event, stateRememberUpdatedState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, (i12 >> 3) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(event, lifecycleOwner2, function0, i10, i11));
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable Object obj, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1220373486);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i12 &= -113;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1220373486, i12, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:467)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            a(lifecycleOwner, (LifecycleResumePauseEffectScope) objRememberedValue, function1, composerStartRestartGroup, ((i12 >> 3) & 14) | (i12 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c(obj, lifecycleOwner2, function1, i10, i11));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable Object obj, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1408314671);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i12 &= -113;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1408314671, i12, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:135)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            b(lifecycleOwner, (LifecycleStartStopEffectScope) objRememberedValue, function1, composerStartRestartGroup, ((i12 >> 3) & 14) | (i12 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new i(obj, lifecycleOwner2, function1, i10, i11));
        }
    }

    @Composable
    public static final void a(final LifecycleOwner lifecycleOwner, final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(912823238);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(lifecycleResumePauseEffectScope) ? 32 : 16;
        }
        if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912823238, i11, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:689)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleResumePauseEffectScope) | ((i11 & 896) == 256) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1$1

                    /* JADX INFO: compiled from: LifecycleEffect.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Lifecycle.Event.values().length];
                            try {
                                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope2 = lifecycleResumePauseEffectScope;
                        final Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> function2 = function1;
                        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: y2.c
                            /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Object] */
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                int i12 = LifecycleEffectKt$LifecycleResumeEffectImpl$1$1.WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                                Ref.ObjectRef objectRef2 = objectRef;
                                if (i12 == 1) {
                                    objectRef2.element = function2.invoke(lifecycleResumePauseEffectScope2);
                                } else {
                                    if (i12 != 2) {
                                        return;
                                    }
                                    LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) objectRef2.element;
                                    if (lifecyclePauseOrDisposeEffectResult != null) {
                                        lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                                    }
                                    objectRef2.element = null;
                                }
                            }
                        };
                        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        lifecycleOwner2.getLifecycle().addObserver(lifecycleEventObserver);
                        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycleOwner2.getLifecycle().removeObserver(lifecycleEventObserver);
                                LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) objectRef.element;
                                if (lifecyclePauseOrDisposeEffectResult != null) {
                                    lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                                }
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, (Function1) objRememberedValue, composerStartRestartGroup, (i11 & 14) | (i11 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(lifecycleOwner, lifecycleResumePauseEffectScope, function1, i10));
        }
    }

    public static final Function0 access$LifecycleEventEffect$lambda$0(State state) {
        return (Function0) state.getValue();
    }

    @Composable
    public static final void b(final LifecycleOwner lifecycleOwner, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(228371534);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(lifecycleStartStopEffectScope) ? 32 : 16;
        }
        if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(228371534, i11, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:357)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleStartStopEffectScope) | ((i11 & 896) == 256) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$1

                    /* JADX INFO: compiled from: LifecycleEffect.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Lifecycle.Event.values().length];
                            try {
                                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        final LifecycleStartStopEffectScope lifecycleStartStopEffectScope2 = lifecycleStartStopEffectScope;
                        final Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> function2 = function1;
                        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: y2.d
                            /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Object] */
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                int i12 = LifecycleEffectKt$LifecycleStartEffectImpl$1$1.WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                                Ref.ObjectRef objectRef2 = objectRef;
                                if (i12 == 1) {
                                    objectRef2.element = function2.invoke(lifecycleStartStopEffectScope2);
                                } else {
                                    if (i12 != 2) {
                                        return;
                                    }
                                    LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) objectRef2.element;
                                    if (lifecycleStopOrDisposeEffectResult != null) {
                                        lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                                    }
                                    objectRef2.element = null;
                                }
                            }
                        };
                        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        lifecycleOwner2.getLifecycle().addObserver(lifecycleEventObserver);
                        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycleOwner2.getLifecycle().removeObserver(lifecycleEventObserver);
                                LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) objectRef.element;
                                if (lifecycleStopOrDisposeEffectResult != null) {
                                    lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                                }
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, (Function1) objRememberedValue, composerStartRestartGroup, (i11 & 14) | (i11 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new n(lifecycleOwner, lifecycleStartStopEffectScope, function1, i10));
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(752680142);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(obj2) ? 32 : 16;
        }
        if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i12 &= -897;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(752680142, i12, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:530)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(obj2) | composerStartRestartGroup.changed(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            a(lifecycleOwner, (LifecycleResumePauseEffectScope) objRememberedValue, function1, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 3) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d(obj, obj2, lifecycleOwner2, function1, i10, i11));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(696924721);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(obj2) ? 32 : 16;
        }
        if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i12 &= -897;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(696924721, i12, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:198)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(obj2) | composerStartRestartGroup.changed(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            b(lifecycleOwner, (LifecycleStartStopEffectScope) objRememberedValue, function1, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 3) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j(obj, obj2, lifecycleOwner2, function1, i10, i11));
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, int i10, int i11) {
        int i12;
        LifecycleOwner lifecycleOwner2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-485941842);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(obj2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(obj3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                lifecycleOwner2 = lifecycleOwner;
                int i13 = composerStartRestartGroup.changedInstance(lifecycleOwner) ? 2048 : 1024;
                i12 |= i13;
            } else {
                lifecycleOwner2 = lifecycleOwner;
            }
            i12 |= i13;
        } else {
            lifecycleOwner2 = lifecycleOwner;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
            } else if ((i11 & 8) != 0) {
                lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i12 &= -7169;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-485941842, i12, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:595)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(obj2) | composerStartRestartGroup.changed(obj3) | composerStartRestartGroup.changed(lifecycleOwner2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            a(lifecycleOwner2, (LifecycleResumePauseEffectScope) objRememberedValue, function1, composerStartRestartGroup, ((i12 >> 9) & 14) | ((i12 >> 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e(obj, obj2, obj3, lifecycleOwner2, function1, i10, i11));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, int i10, int i11) {
        int i12;
        LifecycleOwner lifecycleOwner2;
        Composer composerStartRestartGroup = composer.startRestartGroup(574812561);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(obj2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(obj3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                lifecycleOwner2 = lifecycleOwner;
                int i13 = composerStartRestartGroup.changedInstance(lifecycleOwner) ? 2048 : 1024;
                i12 |= i13;
            } else {
                lifecycleOwner2 = lifecycleOwner;
            }
            i12 |= i13;
        } else {
            lifecycleOwner2 = lifecycleOwner;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
            } else if ((i11 & 8) != 0) {
                lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i12 &= -7169;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(574812561, i12, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:263)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(obj2) | composerStartRestartGroup.changed(obj3) | composerStartRestartGroup.changed(lifecycleOwner2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            b(lifecycleOwner2, (LifecycleStartStopEffectScope) objRememberedValue, function1, composerStartRestartGroup, ((i12 >> 9) & 14) | ((i12 >> 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k(obj, obj2, obj3, lifecycleOwner2, function1, i10, i11));
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@NotNull Object[] objArr, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-781756895);
        int i12 = (i10 & 48) == 0 ? (((i11 & 2) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) ? 32 : 16) | i10 : i10;
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        composerStartRestartGroup.startMovableGroup(1470289652, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i12 |= composerStartRestartGroup.changedInstance(obj) ? 4 : 0;
        }
        composerStartRestartGroup.endMovableGroup();
        if ((i12 & 14) == 0) {
            i12 |= 2;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i12 &= -113;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-781756895, i12, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:656)");
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(objArr);
            spreadBuilder.add(lifecycleOwner);
            boolean zChanged = false;
            for (Object obj2 : spreadBuilder.toArray(new Object[spreadBuilder.size()])) {
                zChanged |= composerStartRestartGroup.changed(obj2);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            a(lifecycleOwner, (LifecycleResumePauseEffectScope) objRememberedValue, function1, composerStartRestartGroup, (i12 & 896) | ((i12 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(objArr, lifecycleOwner2, function1, i10, i11));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@NotNull Object[] objArr, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1510305724);
        int i12 = (i10 & 48) == 0 ? (((i11 & 2) == 0 && composerStartRestartGroup.changedInstance(lifecycleOwner)) ? 32 : 16) | i10 : i10;
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        composerStartRestartGroup.startMovableGroup(-1877684705, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i12 |= composerStartRestartGroup.changedInstance(obj) ? 4 : 0;
        }
        composerStartRestartGroup.endMovableGroup();
        if ((i12 & 14) == 0) {
            i12 |= 2;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i12 &= -113;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1510305724, i12, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:324)");
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(objArr);
            spreadBuilder.add(lifecycleOwner);
            boolean zChanged = false;
            for (Object obj2 : spreadBuilder.toArray(new Object[spreadBuilder.size()])) {
                zChanged |= composerStartRestartGroup.changed(obj2);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            b(lifecycleOwner, (LifecycleStartStopEffectScope) objRememberedValue, function1, composerStartRestartGroup, (i12 & 896) | ((i12 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l(objArr, lifecycleOwner2, function1, i10, i11));
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.")
    @Composable
    public static final void LifecycleResumeEffect(@Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-747476210);
        int i12 = i10 & 1;
        if (i12 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new g(lifecycleOwner, function1, i10, i11));
                return;
            }
            return;
        }
        composerStartRestartGroup.startDefaults();
        if (i12 != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
            composerStartRestartGroup.skipToGroupEnd();
            if ((i11 & 1) != 0) {
                i10 &= -15;
            }
        } else if ((i11 & 1) != 0) {
            i10 &= -15;
        }
        composerStartRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-747476210, i10, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:682)");
        }
        throw new IllegalStateException("LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.")
    @Composable
    public static final void LifecycleStartEffect(@Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-50807951);
        int i12 = i10 & 1;
        if (i12 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new m(lifecycleOwner, function1, i10, i11));
                return;
            }
            return;
        }
        composerStartRestartGroup.startDefaults();
        if (i12 != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
            composerStartRestartGroup.skipToGroupEnd();
            if ((i11 & 1) != 0) {
                i10 &= -15;
            }
        } else if ((i11 & 1) != 0) {
            i10 &= -15;
        }
        composerStartRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-50807951, i10, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:350)");
        }
        throw new IllegalStateException("LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.".toString());
    }
}
