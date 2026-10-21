package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SelectionContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$3$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,145:1\n33#2,4:146\n38#2:157\n36#3:150\n1097#4,6:151\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$3$1$1\n*L\n103#1:146,4\n103#1:157\n104#1:150\n104#1:151,6\n*E\n"})
public final class e extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f6472p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f6473q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6474r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function2<? super Composer, ? super Integer, Unit> function2, int i10, SelectionManager selectionManager) {
        super(2);
        this.f6472p0 = function2;
        this.f6473q0 = i10;
        this.f6474r0 = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Selection selection;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1375295262, iIntValue, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:98)");
            }
            this.f6472p0.invoke(composer2, Integer.valueOf((this.f6473q0 >> 9) & 14));
            if (TouchMode_androidKt.isInTouchMode()) {
                SelectionManager selectionManager = this.f6474r0;
                if (selectionManager.getHasFocus() && (selection = selectionManager.getSelection()) != null) {
                    List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                    int size = listListOf.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        boolean zBooleanValue = ((Boolean) listListOf.get(i10)).booleanValue();
                        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged = composer2.changed(boolValueOf);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = selectionManager.handleDragObserver(zBooleanValue);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
                        Offset offsetM629getStartHandlePosition_m7T9E = zBooleanValue ? selectionManager.m629getStartHandlePosition_m7T9E() : selectionManager.m628getEndHandlePosition_m7T9E();
                        ResolvedTextDirection direction = zBooleanValue ? selection.getStart().getDirection() : selection.getEnd().getDirection();
                        if (offsetM629getStartHandlePosition_m7T9E != null) {
                            AndroidSelectionHandles_androidKt.m597SelectionHandle8fL75g(offsetM629getStartHandlePosition_m7T9E.getF15533a(), zBooleanValue, direction, selection.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new d(textDragObserver, null)), null, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        }
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
