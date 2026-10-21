package o1;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
    }
}
