package androidx.profileinstaller;

import a3.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    @NonNull
    public static final String ACTION_BENCHMARK_OPERATION = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    @NonNull
    public static final String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";

    @NonNull
    public static final String ACTION_SAVE_PROFILE = "androidx.profileinstaller.action.SAVE_PROFILE";

    @NonNull
    public static final String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        Bundle extras;
        File codeCacheDir;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (ACTION_INSTALL_PROFILE.equals(action)) {
            ProfileInstaller.b(context, new f(0), new a(), true);
            return;
        }
        if (ACTION_SKIP_FILE.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                final PackageManager.NameNotFoundException nameNotFoundException = null;
                if ("WRITE_SKIP_FILE".equals(string)) {
                    a aVar = new a();
                    try {
                        ProfileInstaller.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        aVar.onResultReceived(10, null);
                        return;
                    } catch (PackageManager.NameNotFoundException e5) {
                        aVar.onResultReceived(7, e5);
                        return;
                    }
                }
                if ("DELETE_SKIP_FILE".equals(string)) {
                    final a aVar2 = new a();
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    final int i10 = 11;
                    new Runnable() { // from class: a3.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            aVar2.onResultReceived(i10, nameNotFoundException);
                        }
                    }.run();
                    return;
                }
                return;
            }
            return;
        }
        if (ACTION_SAVE_PROFILE.equals(action)) {
            if (Build.VERSION.SDK_INT < 24) {
                setResultCode(13);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                setResultCode(12);
                return;
            }
        }
        if (!ACTION_BENCHMARK_OPERATION.equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        if (!"DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
            setResultCode(16);
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            codeCacheDir = context.createDeviceProtectedStorageContext().getCacheDir();
        } else if (i11 >= 24) {
            codeCacheDir = context.createDeviceProtectedStorageContext().getCodeCacheDir();
        } else {
            codeCacheDir = i11 == 23 ? context.getCodeCacheDir() : context.getCacheDir();
        }
        if (androidx.profileinstaller.a.a(codeCacheDir)) {
            setResultCode(14);
        } else {
            setResultCode(15);
        }
    }

    public class a implements ProfileInstaller.DiagnosticsCallback {
        public a() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void onResultReceived(int i10, @Nullable Object obj) {
            if (i10 == 6 || i10 == 7 || i10 == 8) {
            }
            ProfileInstallReceiver.this.setResultCode(i10);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void onDiagnosticReceived(int i10, @Nullable Object obj) {
        }
    }
}
