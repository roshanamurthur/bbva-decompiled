package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import we.a;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f46252c;

    public zze(Context context) throws PackageManager.NameNotFoundException {
        this.f46251b = context;
        this.f46250a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static File b(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static void c(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
        } else {
            file.mkdirs();
            if (!file.isDirectory()) {
                throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
            }
        }
    }

    public static void zzl(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                zzl(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    public static void zzm(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    public static boolean zzp(File file) {
        return !file.canWrite();
    }

    public final HashSet a() throws IOException {
        File file = new File(e(), "verified-splits");
        c(file);
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && zzp(file2)) {
                    String name = file2.getName();
                    hashSet.add(new a(file2, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final File d() throws IOException {
        if (this.f46252c == null) {
            Context context = this.f46251b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.f46252c = context.getFilesDir();
        }
        File file = new File(this.f46252c, "splitcompat");
        c(file);
        return file;
    }

    public final File e() throws IOException {
        File file = new File(d(), Long.toString(this.f46250a));
        c(file);
        return file;
    }

    public final File zza(String str) throws IOException {
        File file = new File(e(), "dex");
        c(file);
        File fileB = b(file, str);
        c(fileB);
        return fileB;
    }

    public final File zzb() throws IOException {
        File file = new File(e(), "unverified-splits");
        c(file);
        return file;
    }

    public final File zzc(String str, String str2) throws IOException {
        File file = new File(e(), "native-libraries");
        c(file);
        File fileB = b(file, str);
        c(fileB);
        return b(fileB, str2);
    }

    public final File zzd() throws IOException {
        return new File(e(), "lock.tmp");
    }

    public final File zze(String str) throws IOException {
        return b(zzb(), String.valueOf(str).concat(".apk"));
    }

    public final File zzf(File file) throws IOException {
        File file2 = new File(e(), "verified-splits");
        c(file2);
        return b(file2, file.getName());
    }

    public final File zzg(String str) throws IOException {
        File file = new File(e(), "verified-splits");
        c(file);
        return b(file, String.valueOf(str).concat(".apk"));
    }

    public final void zzk() throws IOException {
        File fileD = d();
        String[] list = fileD.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f46250a))) {
                    File file = new File(fileD, str);
                    file.toString();
                    zzl(file);
                }
            }
        }
    }
}
