package androidx.core.util;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;
import java.nio.file.FileSystemException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ NotificationChannel a(String str, String str2, int i10) {
        return new NotificationChannel(str, str2, i10);
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return AutofillManager.class;
    }

    public static /* bridge */ /* synthetic */ FileSystemException e(Throwable th2) {
        return (FileSystemException) th2;
    }
}
