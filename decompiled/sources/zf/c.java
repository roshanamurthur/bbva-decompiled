package zf;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        Charset charset = CrashlyticsReportPersistence.f48278e;
        return str.startsWith("event");
    }
}
