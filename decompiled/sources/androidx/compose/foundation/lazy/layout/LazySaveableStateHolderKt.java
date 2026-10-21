package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import bk.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazySaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"LazySaveableStateHolderProvider", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,106:1\n76#2:107\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n*L\n43#1:107\n*E\n"})
public final class LazySaveableStateHolderKt {

    /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazySaveableStateHolder f5065p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<SaveableStateHolder, Composer, Integer, Unit> f5066q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f5067r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(LazySaveableStateHolder lazySaveableStateHolder, Function3<? super SaveableStateHolder, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f5065p0 = lazySaveableStateHolder;
            this.f5066q0 = function3;
            this.f5067r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1863926504, iIntValue, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:48)");
                }
                SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composer2, 0);
                LazySaveableStateHolder lazySaveableStateHolder = this.f5065p0;
                lazySaveableStateHolder.f5052b.setValue(saveableStateHolderRememberSaveableStateHolder);
                this.f5066q0.invoke(lazySaveableStateHolder, composer2, Integer.valueOf(((this.f5067r0 << 3) & 112) | 8));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<SaveableStateHolder, Composer, Integer, Unit> f5068p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f5069q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function3<? super SaveableStateHolder, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f5068p0 = function3;
            this.f5069q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f5069q0 | 1);
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(this.f5068p0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
    public static final class c extends Lambda implements Function0<LazySaveableStateHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SaveableStateRegistry f5070p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SaveableStateRegistry saveableStateRegistry) {
            super(0);
            this.f5070p0 = saveableStateRegistry;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LazySaveableStateHolder invoke() {
            return new LazySaveableStateHolder(this.f5070p0, q.emptyMap());
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void LazySaveableStateHolderProvider(@NotNull Function3<? super SaveableStateHolder, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(674185128);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674185128, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composerStartRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.m2165rememberSaveable(new Object[]{saveableStateRegistry}, (Saver) LazySaveableStateHolder.f5050d.saver(saveableStateRegistry), (String) null, (Function0) new c(saveableStateRegistry), composerStartRestartGroup, 72, 4);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(lazySaveableStateHolder)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1863926504, true, new a(lazySaveableStateHolder, content, i11)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(content, i10));
    }
}
