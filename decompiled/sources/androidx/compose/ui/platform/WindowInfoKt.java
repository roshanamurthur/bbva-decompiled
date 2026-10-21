package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"WindowFocusObserver", "", "onWindowFocusChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isWindowFocused", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,81:1\n76#2:82\n50#3:83\n49#3:84\n1097#4,6:85\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n*L\n55#1:82\n57#1:83\n57#1:84\n57#1:85,6\n*E\n"})
public final class WindowInfoKt {

    /* JADX INFO: compiled from: WindowInfo.kt */
    @DebugMetadata(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f17340p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WindowInfo f17341q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Boolean, Unit>> f17342r0;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowInfoKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WindowInfo.kt */
        public static final class C0064a extends Lambda implements Function0<Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ WindowInfo f17343p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0064a(WindowInfo windowInfo) {
                super(0);
                this.f17343p0 = windowInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f17343p0.isWindowFocused());
            }
        }

        /* JADX INFO: compiled from: WindowInfo.kt */
        public static final class b implements FlowCollector<Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ State<Function1<Boolean, Unit>> f17344p0;

            /* JADX WARN: Multi-variable type inference failed */
            public b(State<? extends Function1<? super Boolean, Unit>> state) {
                this.f17344p0 = state;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Boolean bool, Continuation continuation) {
                this.f17344p0.getValue().invoke(Boxing.boxBoolean(bool.booleanValue()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(WindowInfo windowInfo, State<? extends Function1<? super Boolean, Unit>> state, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f17341q0 = windowInfo;
            this.f17342r0 = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f17341q0, this.f17342r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f17340p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new C0064a(this.f17341q0));
                b bVar = new b(this.f17342r0);
                this.f17340p0 = 1;
                if (flowSnapshotFlow.collect(bVar, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: WindowInfo.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f17345p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f17346q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1, int i10) {
            super(2);
            this.f17345p0 = function1;
            this.f17346q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f17346q0 | 1);
            WindowInfoKt.WindowFocusObserver(this.f17345p0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void WindowFocusObserver(@NotNull Function1<? super Boolean, Unit> onWindowFocusChanged, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(onWindowFocusChanged, "onWindowFocusChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(127829799);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(onWindowFocusChanged) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(127829799, i11, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:53)");
            }
            WindowInfo windowInfo = (WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo());
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onWindowFocusChanged, composerStartRestartGroup, i11 & 14);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(windowInfo) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(windowInfo, stateRememberUpdatedState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(windowInfo, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(onWindowFocusChanged, i10));
    }
}
