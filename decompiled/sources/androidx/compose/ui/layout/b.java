package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1063:1\n169#2,9:1064\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n*L\n702#1:1064,9\n*E\n"})
public final class b extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeSubcompositionsState.b f16707p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f16708q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(LayoutNodeSubcompositionsState.b bVar, Function2<? super Composer, ? super Integer, Unit> function2) {
        super(2);
        this.f16707p0 = bVar;
        this.f16708q0 = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-34810602, iIntValue, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:700)");
            }
            boolean zBooleanValue = ((Boolean) this.f16707p0.f16598e.getValue()).booleanValue();
            composer2.startReusableGroup(207, Boolean.valueOf(zBooleanValue));
            boolean zChanged = composer2.changed(zBooleanValue);
            if (zBooleanValue) {
                this.f16708q0.invoke(composer2, 0);
            } else {
                composer2.deactivateToEndGroup(zChanged);
            }
            composer2.endReusableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
