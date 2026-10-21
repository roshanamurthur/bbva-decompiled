package m0;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionTracer;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CompositionTracer compositionTracer = ComposerKt.f14493a;
        return Intrinsics.compare(((l) obj).f83273b, ((l) obj2).f83273b);
    }
}
