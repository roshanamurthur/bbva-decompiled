package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.impl.SessionConfig;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2151p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2152q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f2151p0 = i10;
        this.f2152q0 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f2151p0;
        Object obj3 = this.f2152q0;
        switch (i10) {
            case 0:
                return ((SurfaceSorter) obj3).lambda$sort$0((SessionConfig.OutputConfig) obj, (SessionConfig.OutputConfig) obj2);
            default:
                Comparator comparator = (Comparator) obj3;
                Intrinsics.checkNotNullParameter(comparator, "$comparator");
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return comparator.compare(obj, obj2);
        }
    }
}
