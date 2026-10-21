package l0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.math.ec.ECFieldElement;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static Function2 a(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, Density density) {
        Updater.m2081setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m2081setimpl(composer2, density, companion.getSetDensity());
        return companion.getSetLayoutDirection();
    }

    public static ECFieldElement b(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }
}
