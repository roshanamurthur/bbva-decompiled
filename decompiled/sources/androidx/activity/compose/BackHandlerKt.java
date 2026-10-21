package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u008a\u0084\u0002"}, d2 = {"BackHandler", "", "enabled", "", "onBack", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "activity-compose_release", "currentOnBack"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,110:1\n25#2:111\n50#2:118\n49#2:119\n955#3,6:112\n955#3,6:120\n76#4:126\n89#5:127\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n*L\n86#1:111\n94#1:118\n94#1:119\n86#1:112,6\n94#1:120,6\n100#1:126\n84#1:127\n*E\n"})
public final class BackHandlerKt {

    /* JADX INFO: compiled from: BackHandler.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 f392p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f393q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1, boolean z10) {
            super(0);
            this.f392p0 = backHandlerKt$BackHandler$backCallback$1$1;
            this.f393q0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            setEnabled(this.f393q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BackHandler.kt */
    @SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,110:1\n62#2,5:111\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n105#1:111,5\n*E\n"})
    public static final class b extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f394p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f395q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 f396r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1) {
            super(1);
            this.f394p0 = onBackPressedDispatcher;
            this.f395q0 = lifecycleOwner;
            this.f396r0 = backHandlerKt$BackHandler$backCallback$1$1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f394p0;
            LifecycleOwner lifecycleOwner = this.f395q0;
            final BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = this.f396r0;
            onBackPressedDispatcher.addCallback(lifecycleOwner, backHandlerKt$BackHandler$backCallback$1$1);
            return new DisposableEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    remove();
                }
            };
        }
    }

    /* JADX INFO: compiled from: BackHandler.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f397p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f398q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f399r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f400s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f397p0 = z10;
            this.f398q0 = function0;
            this.f399r0 = i10;
            this.f400s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int i10 = this.f399r0 | 1;
            BackHandlerKt.BackHandler(this.f397p0, this.f398q0, composer, i10, this.f400s0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void BackHandler(final boolean z10, @NotNull Function0<Unit> function0, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i12 >> 3) & 14);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new OnBackPressedCallback(z10) { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$backCallback$1$1
                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        BackHandlerKt.access$BackHandler$lambda$0(stateRememberUpdatedState).invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = (BackHandlerKt$BackHandler$backCallback$1$1) objRememberedValue;
            Boolean boolValueOf = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(backHandlerKt$BackHandler$backCallback$1$1);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new a(backHandlerKt$BackHandler$backCallback$1$1, z10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, new b(onBackPressedDispatcher, lifecycleOwner, backHandlerKt$BackHandler$backCallback$1$1), composerStartRestartGroup, 72);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, function0, i10, i11));
    }

    public static final Function0 access$BackHandler$lambda$0(State state) {
        return (Function0) state.getValue();
    }
}
