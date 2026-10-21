package xf;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.IOException;

/* JADX INFO: compiled from: CrashlyticsFileMarker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileStore f94631b;

    public r(FileStore fileStore, String str) {
        this.f94630a = str;
        this.f94631b = fileStore;
    }

    public final void a() {
        String str = this.f94630a;
        try {
            this.f94631b.getCommonFile(str).createNewFile();
        } catch (IOException e5) {
            Logger.getLogger().e("Error creating marker: " + str, e5);
        }
    }
}
