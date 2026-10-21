package zf;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Charset charset = CrashlyticsReportPersistence.f48278e;
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
