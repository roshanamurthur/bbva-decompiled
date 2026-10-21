package xf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.InputStream;

/* JADX INFO: compiled from: NativeSessionFile.java */
/* JADX INFO: loaded from: classes10.dex */
public interface v {
    @Nullable
    CrashlyticsReport.FilesPayload.File a();

    @NonNull
    String b();

    @Nullable
    InputStream c();
}
