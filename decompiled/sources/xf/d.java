package xf;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
    }
}
