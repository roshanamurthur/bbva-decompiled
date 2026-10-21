package n2;

import androidx.core.text.util.LinkifyCompat;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        LinkifyCompat.b bVar = (LinkifyCompat.b) obj;
        LinkifyCompat.b bVar2 = (LinkifyCompat.b) obj2;
        int i10 = bVar.f20149c;
        int i11 = bVar2.f20149c;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        return Integer.compare(bVar2.f20150d, bVar.f20150d);
    }
}
