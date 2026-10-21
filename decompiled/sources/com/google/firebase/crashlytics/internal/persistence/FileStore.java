package com.google.firebase.crashlytics.internal.persistence;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bbva.notifications.constants.PushConstants;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class FileStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f48287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f48288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f48289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f48290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f48291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f48292f;

    public FileStore(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f48287a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", PushConstants.GE_PARAMS_SEPARATOR);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        b(file);
        this.f48288b = file;
        File file2 = new File(file, "open-sessions");
        b(file2);
        this.f48289c = file2;
        File file3 = new File(file, "reports");
        b(file3);
        this.f48290d = file3;
        File file4 = new File(file, "priority-reports");
        b(file4);
        this.f48291e = file4;
        File file5 = new File(file, "native-reports");
        b(file5);
        this.f48292f = file5;
    }

    public static void a(File file) {
        if (file.exists() && c(file)) {
            Logger.getLogger().d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public static synchronized void b(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                Logger.getLogger().d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                Logger.getLogger().e("Could not create Crashlytics-specific directory: " + file);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean c(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                c(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> d(@Nullable T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public void cleanupPreviousFileSystems() {
        File file = this.f48287a;
        a(new File(file, ".com.google.firebase.crashlytics"));
        a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    @VisibleForTesting
    public void deleteAllCrashlyticsFiles() {
        c(this.f48288b);
    }

    public boolean deleteSessionFiles(String str) {
        return c(new File(this.f48289c, str));
    }

    public List<String> getAllOpenSessionIds() {
        return d(this.f48289c.list());
    }

    public File getCommonFile(String str) {
        return new File(this.f48288b, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return d(this.f48288b.listFiles(filenameFilter));
    }

    public File getNativeReport(String str) {
        return new File(this.f48292f, str);
    }

    public List<File> getNativeReports() {
        return d(this.f48292f.listFiles());
    }

    public File getNativeSessionDir(String str) {
        File file = new File(this.f48289c, str);
        file.mkdirs();
        File file2 = new File(file, "native");
        file2.mkdirs();
        return file2;
    }

    public File getPriorityReport(String str) {
        return new File(this.f48291e, str);
    }

    public List<File> getPriorityReports() {
        return d(this.f48291e.listFiles());
    }

    public File getReport(String str) {
        return new File(this.f48290d, str);
    }

    public List<File> getReports() {
        return d(this.f48290d.listFiles());
    }

    public File getSessionFile(String str, String str2) {
        File file = new File(this.f48289c, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        File file = new File(this.f48289c, str);
        file.mkdirs();
        return d(file.listFiles(filenameFilter));
    }
}
