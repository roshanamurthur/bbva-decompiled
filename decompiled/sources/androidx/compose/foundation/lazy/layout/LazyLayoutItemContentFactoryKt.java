package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyLayoutItemContentFactoryKt {
    /* JADX INFO: renamed from: access$SkippableItem-JVlU9Rs, reason: not valid java name */
    public static final void m402access$SkippableItemJVlU9Rs(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i10, Object obj2, Composer composer, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1439843069);
        if ((i11 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(lazyLayoutItemProvider) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(obj) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(obj2) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:127)");
            }
            ((SaveableStateHolder) obj).SaveableStateProvider(obj2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 980966366, true, new g(lazyLayoutItemProvider, i10, obj2, i12)), composerStartRestartGroup, 568);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(lazyLayoutItemProvider, obj, i10, obj2, i11));
    }
}
