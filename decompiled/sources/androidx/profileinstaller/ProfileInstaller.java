package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstaller {
    public static final int DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST = 2;
    public static final int DIAGNOSTIC_CURRENT_PROFILE_EXISTS = 1;
    public static final int DIAGNOSTIC_PROFILE_IS_COMPRESSED = 5;
    public static final int DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST = 4;
    public static final int DIAGNOSTIC_REF_PROFILE_EXISTS = 3;
    public static final int RESULT_ALREADY_INSTALLED = 2;
    public static final int RESULT_BASELINE_PROFILE_NOT_FOUND = 6;
    public static final int RESULT_BENCHMARK_OPERATION_FAILURE = 15;
    public static final int RESULT_BENCHMARK_OPERATION_SUCCESS = 14;
    public static final int RESULT_BENCHMARK_OPERATION_UNKNOWN = 16;
    public static final int RESULT_DELETE_SKIP_FILE_SUCCESS = 11;
    public static final int RESULT_DESIRED_FORMAT_UNSUPPORTED = 5;
    public static final int RESULT_INSTALL_SKIP_FILE_SUCCESS = 10;
    public static final int RESULT_INSTALL_SUCCESS = 1;
    public static final int RESULT_IO_EXCEPTION = 7;
    public static final int RESULT_META_FILE_REQUIRED_BUT_NOT_FOUND = 9;
    public static final int RESULT_NOT_WRITABLE = 4;
    public static final int RESULT_PARSE_EXCEPTION = 8;
    public static final int RESULT_SAVE_PROFILE_SIGNALLED = 12;
    public static final int RESULT_SAVE_PROFILE_SKIPPED = 13;
    public static final int RESULT_UNSUPPORTED_ART_VERSION = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22510a = new a();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void onDiagnosticReceived(int i10, @Nullable Object obj);

        void onResultReceived(int i10, @Nullable Object obj);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ResultCode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void a(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    @WorkerThread
    public static void b(@NonNull Context context, @NonNull Executor executor, @NonNull DiagnosticsCallback diagnosticsCallback, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j10 = dataInputStream.readLong();
                            dataInputStream.close();
                            boolean z12 = j10 == packageInfo.lastUpdateTime;
                            if (z12) {
                                diagnosticsCallback.onResultReceived(2, null);
                            }
                            if (z12) {
                                context.getPackageName();
                                ProfileVerifier.c(context, false);
                                return;
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            context.getPackageName();
            DeviceProfileWriter deviceProfileWriter = new DeviceProfileWriter(assets, executor, diagnosticsCallback, name, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (deviceProfileWriter.deviceAllowsProfileInstallerAotWrites()) {
                boolean zWrite = deviceProfileWriter.read().transcodeIfNeeded().write();
                if (zWrite) {
                    a(packageInfo, filesDir);
                }
                if (zWrite && z10) {
                    z11 = true;
                }
            }
            ProfileVerifier.c(context, z11);
        } catch (PackageManager.NameNotFoundException e5) {
            diagnosticsCallback.onResultReceived(7, e5);
            ProfileVerifier.c(context, false);
        }
    }

    @WorkerThread
    public static void writeProfile(@NonNull Context context) {
        writeProfile(context, new n.b(1), f22510a);
    }

    @WorkerThread
    public static void writeProfile(@NonNull Context context, @NonNull Executor executor, @NonNull DiagnosticsCallback diagnosticsCallback) {
        b(context, executor, diagnosticsCallback, false);
    }

    public class a implements DiagnosticsCallback {
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void onDiagnosticReceived(int i10, @Nullable Object obj) {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void onResultReceived(int i10, @Nullable Object obj) {
        }
    }

    public class b implements DiagnosticsCallback {
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void onResultReceived(int i10, @Nullable Object obj) {
            if (i10 == 6 || i10 == 7 || i10 == 8) {
            }
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void onDiagnosticReceived(int i10, @Nullable Object obj) {
        }
    }
}
