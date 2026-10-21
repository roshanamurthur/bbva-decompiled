package xf;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.IOException;

/* JADX INFO: compiled from: CrashlyticsAppQualitySessionsStore.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f94609d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f94610e = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileStore f94611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f94612b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f94613c = null;

    public e(FileStore fileStore) {
        this.f94611a = fileStore;
    }

    public static void a(FileStore fileStore, @Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fileStore.getSessionFile(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e5) {
            Logger.getLogger().w("Failed to persist App Quality Sessions session id.", e5);
        }
    }
}
