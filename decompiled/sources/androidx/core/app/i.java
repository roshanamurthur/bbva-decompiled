package androidx.core.app;

import android.app.NotificationChannel;
import java.nio.file.FileSystemException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ NotificationChannel b(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ FileSystemException d() {
        return new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
    }
}
