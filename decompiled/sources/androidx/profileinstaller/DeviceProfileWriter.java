package androidx.profileinstaller;

import a3.c;
import a3.d;
import a3.i;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DeviceProfileWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final AssetManager f22498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Executor f22499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ProfileInstaller.DiagnosticsCallback f22500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final byte[] f22501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final File f22502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f22503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f22504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final String f22505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22506i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public c[] f22507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public byte[] f22508k;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.DiagnosticsCallback diagnosticsCallback, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.f22498a = assetManager;
        this.f22499b = executor;
        this.f22500c = diagnosticsCallback;
        this.f22503f = str;
        this.f22504g = str2;
        this.f22505h = str3;
        this.f22502e = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24) {
            if (i10 < 31) {
                switch (i10) {
                    case 24:
                    case 25:
                        bArr = ProfileVersion.f22526e;
                        break;
                    case 26:
                        bArr = ProfileVersion.f22525d;
                        break;
                    case 27:
                        bArr = ProfileVersion.f22524c;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = ProfileVersion.f22523b;
                        break;
                }
            } else {
                bArr = ProfileVersion.f22522a;
            }
        }
        this.f22501d = bArr;
    }

    @Nullable
    public final FileInputStream a(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e5) {
            String message = e5.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f22500c.onDiagnosticReceived(5, null);
            }
            return null;
        }
    }

    public final void b(final int i10, @Nullable Serializable serializable) {
        final Serializable serializable2 = serializable;
        this.f22499b.execute(new Runnable() { // from class: a3.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f175p0.f22500c.onResultReceived(i10, serializable2);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.f22501d == null) {
            b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.f22502e;
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    b(4, null);
                    return false;
                }
            } catch (IOException unused) {
                b(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            b(4, null);
            return false;
        }
        this.f22506i = true;
        return true;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter read() {
        FileInputStream fileInputStreamA;
        c[] cVarArrH;
        int i10;
        AssetManager assetManager = this.f22498a;
        ProfileInstaller.DiagnosticsCallback diagnosticsCallback = this.f22500c;
        if (!this.f22506i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        byte[] bArr = this.f22501d;
        if (bArr == null) {
            return this;
        }
        DeviceProfileWriter deviceProfileWriter = null;
        try {
            fileInputStreamA = a(assetManager, this.f22504g);
        } catch (FileNotFoundException e5) {
            diagnosticsCallback.onResultReceived(6, e5);
            fileInputStreamA = null;
        } catch (IOException e7) {
            diagnosticsCallback.onResultReceived(7, e7);
            fileInputStreamA = null;
        }
        try {
            try {
                if (fileInputStreamA != null) {
                    try {
                        try {
                            if (!Arrays.equals(i.f193a, d.b(4, fileInputStreamA))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            cVarArrH = i.h(fileInputStreamA, d.b(4, fileInputStreamA), this.f22503f);
                            try {
                                fileInputStreamA.close();
                            } catch (IOException e10) {
                                diagnosticsCallback.onResultReceived(7, e10);
                            }
                            this.f22507j = cVarArrH;
                        } catch (IOException e11) {
                            diagnosticsCallback.onResultReceived(7, e11);
                            fileInputStreamA.close();
                            cVarArrH = null;
                        }
                    } catch (IllegalStateException e12) {
                        diagnosticsCallback.onResultReceived(8, e12);
                        fileInputStreamA.close();
                        cVarArrH = null;
                    }
                }
            } catch (Throwable th2) {
                try {
                    fileInputStreamA.close();
                } catch (IOException e13) {
                    diagnosticsCallback.onResultReceived(7, e13);
                }
                throw th2;
            }
        } catch (IOException e14) {
            diagnosticsCallback.onResultReceived(7, e14);
        }
        c[] cVarArr = this.f22507j;
        if (cVarArr != null && (i10 = Build.VERSION.SDK_INT) >= 24 && (i10 >= 31 || i10 == 24 || i10 == 25)) {
            try {
                FileInputStream fileInputStreamA2 = a(assetManager, this.f22505h);
                if (fileInputStreamA2 != null) {
                    try {
                        if (!Arrays.equals(i.f194b, d.b(4, fileInputStreamA2))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        this.f22507j = i.e(fileInputStreamA2, d.b(4, fileInputStreamA2), bArr, cVarArr);
                        fileInputStreamA2.close();
                        deviceProfileWriter = this;
                    } catch (Throwable th3) {
                        try {
                            fileInputStreamA2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } else if (fileInputStreamA2 != null) {
                    fileInputStreamA2.close();
                }
            } catch (FileNotFoundException e15) {
                diagnosticsCallback.onResultReceived(9, e15);
            } catch (IOException e16) {
                diagnosticsCallback.onResultReceived(7, e16);
            } catch (IllegalStateException e17) {
                this.f22507j = null;
                diagnosticsCallback.onResultReceived(8, e17);
            }
            if (deviceProfileWriter != null) {
                return deviceProfileWriter;
            }
        }
        return this;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter transcodeIfNeeded() {
        byte[] bArr;
        ProfileInstaller.DiagnosticsCallback diagnosticsCallback = this.f22500c;
        c[] cVarArr = this.f22507j;
        if (cVarArr == null || (bArr = this.f22501d) == null) {
            return this;
        }
        if (!this.f22506i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(i.f193a);
                byteArrayOutputStream.write(bArr);
                if (i.j(byteArrayOutputStream, bArr, cVarArr)) {
                    this.f22508k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f22507j = null;
                    return this;
                }
                diagnosticsCallback.onResultReceived(5, null);
                this.f22507j = null;
                byteArrayOutputStream.close();
                return this;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e5) {
            diagnosticsCallback.onResultReceived(7, e5);
        } catch (IllegalStateException e7) {
            diagnosticsCallback.onResultReceived(8, e7);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean write() {
        byte[] bArr = this.f22508k;
        if (bArr == null) {
            return false;
        }
        if (!this.f22506i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f22502e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            if (fileLockTryLock != null) {
                                try {
                                    if (fileLockTryLock.isValid()) {
                                        byte[] bArr2 = new byte[512];
                                        while (true) {
                                            int i10 = byteArrayInputStream.read(bArr2);
                                            if (i10 <= 0) {
                                                b(1, null);
                                                fileLockTryLock.close();
                                                channel.close();
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                this.f22508k = null;
                                                this.f22507j = null;
                                                return true;
                                            }
                                            fileOutputStream.write(bArr2, 0, i10);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    if (fileLockTryLock != null) {
                                        try {
                                            fileLockTryLock.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                    }
                                    throw th2;
                                }
                            }
                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                        } catch (Throwable th4) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            } catch (FileNotFoundException e5) {
                b(6, e5);
                this.f22508k = null;
                this.f22507j = null;
                return false;
            } catch (IOException e7) {
                b(7, e7);
                this.f22508k = null;
                this.f22507j = null;
                return false;
            }
        } catch (Throwable th10) {
            this.f22508k = null;
            this.f22507j = null;
            throw th10;
        }
    }
}
