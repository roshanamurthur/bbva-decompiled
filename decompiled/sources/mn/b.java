package mn;

import java.util.Comparator;
import org.junit.runner.manipulation.Sorter;
import org.junit.runners.ParentRunner;

/* JADX INFO: compiled from: ParentRunner.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b implements Comparator<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Sorter f83501p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ParentRunner f83502q0;

    public b(ParentRunner parentRunner, Sorter sorter) {
        this.f83502q0 = parentRunner;
        this.f83501p0 = sorter;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ParentRunner parentRunner = this.f83502q0;
        return this.f83501p0.compare(parentRunner.describeChild(obj), parentRunner.describeChild(obj2));
    }
}
