package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import j.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a.\u0010\u0003\u001a\u00020\u00012\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"ReportDrawn", "", "(Landroidx/compose/runtime/Composer;I)V", "ReportDrawnAfter", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReportDrawnWhen", "predicate", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ReportDrawnKt {

    /* JADX INFO: compiled from: ReportDrawn.kt */
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f424p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: ReportDrawn.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f425p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(2);
            this.f425p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ReportDrawnKt.ReportDrawn(composer, this.f425p0 | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ReportDrawn.kt */
    @DebugMetadata(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", f = "ReportDrawn.kt", i = {0}, l = {182}, m = "invokeSuspend", n = {"$this$reportWhenComplete$iv"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,176:1\n180#2,10:177\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n*L\n173#1:177,10\n*E\n"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public FullyDrawnReporter f426p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f427q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FullyDrawnReporter f428r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f429s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(FullyDrawnReporter fullyDrawnReporter, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f428r0 = fullyDrawnReporter;
            this.f429s0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f428r0, this.f429s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            FullyDrawnReporter fullyDrawnReporter;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f427q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super Unit>, Object> function1 = this.f429s0;
                FullyDrawnReporter fullyDrawnReporter2 = this.f428r0;
                fullyDrawnReporter2.addReporter();
                if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                    try {
                        this.f426p0 = fullyDrawnReporter2;
                        this.f427q0 = 1;
                        if (function1.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        fullyDrawnReporter = fullyDrawnReporter2;
                        fullyDrawnReporter.removeReporter();
                    } catch (Throwable th2) {
                        th = th2;
                        fullyDrawnReporter = fullyDrawnReporter2;
                        fullyDrawnReporter.removeReporter();
                        throw th;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fullyDrawnReporter = this.f426p0;
                try {
                    ResultKt.throwOnFailure(obj);
                    fullyDrawnReporter.removeReporter();
                } catch (Throwable th3) {
                    th = th3;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ReportDrawn.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f430p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f431q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super Continuation<? super Unit>, ? extends Object> function1, int i10) {
            super(2);
            this.f430p0 = function1;
            this.f431q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int i10 = this.f431q0 | 1;
            ReportDrawnKt.ReportDrawnAfter(this.f430p0, composer, i10);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ReportDrawn.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f432p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f433q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super Continuation<? super Unit>, ? extends Object> function1, int i10) {
            super(2);
            this.f432p0 = function1;
            this.f433q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int i10 = this.f433q0 | 1;
            ReportDrawnKt.ReportDrawnAfter(this.f432p0, composer, i10);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ReportDrawn.kt */
    @SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,176:1\n62#2,5:177\n62#2,5:182\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n135#1:177,5\n138#1:182,5\n*E\n"})
    public static final class f extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FullyDrawnReporter f434p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Boolean> f435q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FullyDrawnReporter fullyDrawnReporter, Function0<Boolean> function0) {
            super(1);
            this.f434p0 = fullyDrawnReporter;
            this.f435q0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            FullyDrawnReporter fullyDrawnReporter = this.f434p0;
            if (fullyDrawnReporter.isFullyDrawnReported()) {
                return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
            final j.c cVar = new j.c(fullyDrawnReporter, this.f435q0);
            return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$invoke$$inlined$onDispose$2
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    c cVar2 = cVar;
                    Function0<Boolean> function0 = cVar2.f78725q0;
                    SnapshotStateObserver snapshotStateObserver = cVar2.f78726r0;
                    snapshotStateObserver.clear(function0);
                    FullyDrawnReporter fullyDrawnReporter2 = cVar2.f78724p0;
                    if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                        fullyDrawnReporter2.removeReporter();
                    }
                    snapshotStateObserver.clear();
                    snapshotStateObserver.stop();
                }
            };
        }
    }

    /* JADX INFO: compiled from: ReportDrawn.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Boolean> f436p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f437q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, Function0 function0) {
            super(2);
            this.f436p0 = function0;
            this.f437q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int i10 = this.f437q0 | 1;
            ReportDrawnKt.ReportDrawnWhen(this.f436p0, composer, i10);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ReportDrawn.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Boolean> f438p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f439q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, Function0 function0) {
            super(2);
            this.f438p0 = function0;
            this.f439q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int i10 = this.f439q0 | 1;
            ReportDrawnKt.ReportDrawnWhen(this.f438p0, composer, i10);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void ReportDrawn(@Nullable Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357012904);
        if (i10 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            ReportDrawnWhen(a.f424p0, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(i10));
    }

    @Composable
    public static final void ReportDrawnAfter(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @Nullable Composer composer, int i10) {
        FullyDrawnReporter fullyDrawnReporter;
        Composer composerStartRestartGroup = composer.startRestartGroup(945311272);
        FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(function1, i10));
            return;
        }
        EffectsKt.LaunchedEffect(function1, fullyDrawnReporter, new c(fullyDrawnReporter, function1, null), composerStartRestartGroup, 584);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new d(function1, i10));
    }

    @Composable
    public static final void ReportDrawnWhen(@NotNull Function0<Boolean> function0, @Nullable Composer composer, int i10) {
        int i11;
        FullyDrawnReporter fullyDrawnReporter;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2047119994);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new h(i10, function0));
                return;
            }
            EffectsKt.DisposableEffect(fullyDrawnReporter, function0, new f(fullyDrawnReporter, function0), composerStartRestartGroup, ((i11 << 3) & 112) | 8);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new g(i10, function0));
    }
}
