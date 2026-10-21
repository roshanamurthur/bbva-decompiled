package androidx.appcompat.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Reaction.ReactionExecution {
    public static int a(int i10, int i11, int i12, int i13) {
        return CodedOutputStream.computeUInt32SizeNoTag(i10) + i11 + i12 + i13;
    }

    public static SkippableUpdater b(ComposeUiNode.Companion companion, Composer composer, ViewConfiguration viewConfiguration, Composer composer2, Composer composer3) {
        Updater.m2081setimpl(composer, viewConfiguration, companion.getSetViewConfiguration());
        composer2.enableReusing();
        return SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer3));
    }

    public static String c(String str, int i10) {
        return str + i10;
    }

    public static boolean d(Function2 function2, Composer composer, Integer num) {
        function2.invoke(composer, num);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return ComposerKt.isTraceInProgress();
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(i10) + i11 + i12 + i13;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public void execute(Object obj, Object obj2) {
        CellsWebViewModel cellsWebViewModel = (CellsWebViewModel) obj;
        String str = (String) obj2;
        if (str == null) {
            str = "";
        }
        cellsWebViewModel.askToSmartAssistance(str);
    }
}
