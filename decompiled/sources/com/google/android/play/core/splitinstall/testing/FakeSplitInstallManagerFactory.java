package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.internal.zzby;
import com.google.android.play.core.splitinstall.zzu;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class FakeSplitInstallManagerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static FakeSplitInstallManager f46341a;

    public static FakeSplitInstallManager create(Context context) {
        try {
            File fileZzb = zzu.zza(context).zzb();
            if (fileZzb == null) {
                throw new LocalTestingException("Failed to retrieve local testing directory path");
            }
            if (fileZzb.exists()) {
                return create(context, fileZzb);
            }
            throw new LocalTestingException(String.format("Local testing directory not found: %s", fileZzb));
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }

    public static FakeSplitInstallManager createNewInstance(Context context, final File file) {
        SplitCompat.install(context);
        return new FakeSplitInstallManager(context, file, new com.google.android.play.core.splitinstall.zzs(context, context.getPackageName()), new zzby() { // from class: com.google.android.play.core.splitinstall.testing.zzs
            @Override // com.google.android.play.core.splitinstall.internal.zzby
            public final Object zza() {
                return zzaa.zza(file);
            }
        });
    }

    public static synchronized FakeSplitInstallManager create(Context context, File file) {
        try {
            FakeSplitInstallManager fakeSplitInstallManager = f46341a;
            if (fakeSplitInstallManager == null) {
                f46341a = createNewInstance(context, file);
            } else if (!fakeSplitInstallManager.f46337j.getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", f46341a.f46337j.getAbsolutePath(), file.getAbsolutePath()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46341a;
    }
}
