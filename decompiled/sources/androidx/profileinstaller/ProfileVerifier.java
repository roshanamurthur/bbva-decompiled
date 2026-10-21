package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ProfileVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolvableFuture<CompilationStatus> f22511a = ResolvableFuture.create();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f22512b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static CompilationStatus f22513c = null;

    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 196608;
        public static final int RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED = 327680;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;

        @Deprecated
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_NO_PROFILE_INSTALLED = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f22517d;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface ResultCode {
        }

        public CompilationStatus(boolean z10, boolean z11, boolean z12, int i10) {
            this.f22514a = i10;
            this.f22516c = z11;
            this.f22515b = z10;
            this.f22517d = z12;
        }

        public boolean appApkHasEmbeddedProfile() {
            return this.f22517d;
        }

        public int getProfileInstallResultCode() {
            return this.f22514a;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.f22516c;
        }

        public boolean isCompiledWithProfile() {
            return this.f22515b;
        }
    }

    @RequiresApi(33)
    public static class a {
        public static PackageInfo a(Context context, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f22520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f22521d;

        public b(int i10, int i11, long j10, long j11) {
            this.f22518a = i10;
            this.f22519b = i11;
            this.f22520c = j10;
            this.f22521d = j11;
        }

        public static b a(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public final void b(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f22518a);
                dataOutputStream.writeInt(this.f22519b);
                dataOutputStream.writeLong(this.f22520c);
                dataOutputStream.writeLong(this.f22521d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f22519b == bVar.f22519b && this.f22520c == bVar.f22520c && this.f22518a == bVar.f22518a && this.f22521d == bVar.f22521d;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f22519b), Long.valueOf(this.f22520c), Integer.valueOf(this.f22518a), Long.valueOf(this.f22521d));
        }
    }

    public static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(context, packageManager).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static CompilationStatus b(boolean z10, boolean z11, boolean z12, int i10) {
        CompilationStatus compilationStatus = new CompilationStatus(z10, z11, z12, i10);
        f22513c = compilationStatus;
        f22511a.set(compilationStatus);
        return f22513c;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:44:0x006f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @WorkerThread
    public static CompilationStatus c(@NonNull Context context, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        b bVarA;
        b bVar;
        int i12;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        CompilationStatus compilationStatus;
        if (!z10 && (compilationStatus = f22513c) != null) {
            return compilationStatus;
        }
        synchronized (f22512b) {
            if (z10) {
                i10 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                assetFileDescriptorOpenFd.close();
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    long jA = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        bVarA = b.a(file3);
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null) {
                        if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                    } else if (!z11) {
                        i10 = 327680;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                    if (z10) {
                        i10 = 2;
                    }
                    if (bVarA != null) {
                        i10 = 3;
                    }
                    bVar = new b(1, i10, jA, length);
                    if (bVarA != null) {
                        bVar.b(file3);
                    } else {
                        bVar.b(file3);
                    }
                    return b(z12, z13, z11, i10);
                }
                return b(false, false, z11, 262144);
            }
            CompilationStatus compilationStatus2 = f22513c;
            if (compilationStatus2 != null) {
                return compilationStatus2;
            }
            i10 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th2) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th2;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                z11 = false;
            }
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28 && i11 != 30) {
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                try {
                    long jA2 = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused2) {
                            return b(z12, z13, z11, 131072);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null && bVarA.f22520c == jA2 && (i12 = bVarA.f22519b) != 2) {
                        i10 = i12;
                    } else if (!z11) {
                        i10 = 327680;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                    if (z10 && z13 && i10 != 1) {
                        i10 = 2;
                    }
                    if (bVarA != null && bVarA.f22519b == 2 && i10 == 1 && length3 < bVarA.f22521d) {
                        i10 = 3;
                    }
                    bVar = new b(1, i10, jA2, length);
                    if (bVarA != null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused3) {
                            i10 = CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        }
                    }
                    return b(z12, z13, z11, i10);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return b(z12, z13, z11, 65536);
                }
            }
            return b(false, false, z11, 262144);
            throw th;
        }
    }

    @NonNull
    public static ListenableFuture<CompilationStatus> getCompilationStatusAsync() {
        return f22511a;
    }

    @NonNull
    @WorkerThread
    public static CompilationStatus writeProfileVerification(@NonNull Context context) {
        return c(context, false);
    }
}
