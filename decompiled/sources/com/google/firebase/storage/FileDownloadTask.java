package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.camera.core.n1;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetNetworkRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public class FileDownloadTask extends StorageTask<TaskSnapshot> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f48975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f48976l;
    public final StorageReference m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ExponentialBackoffSender f48977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f48978o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f48979p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile Exception f48980q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f48981r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f48982s;

    public class TaskSnapshot extends StorageTask<TaskSnapshot>.SnapshotBase {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f48983c;

        public TaskSnapshot(StorageException storageException, long j10) {
            super(storageException);
            this.f48983c = j10;
        }

        public long getBytesTransferred() {
            return this.f48983c;
        }

        public long getTotalByteCount() {
            return FileDownloadTask.this.f48978o;
        }
    }

    public FileDownloadTask(@NonNull StorageReference storageReference, @NonNull Uri uri) {
        this.m = storageReference;
        this.f48975k = uri;
        FirebaseStorage storage = storageReference.getStorage();
        this.f48977n = new ExponentialBackoffSender(storage.getApp().getApplicationContext(), storage.b(), storage.a(), storage.getMaxDownloadRetryTimeMillis());
    }

    @Override // com.google.firebase.storage.StorageTask
    @NonNull
    public final StorageReference d() {
        return this.m;
    }

    @Override // com.google.firebase.storage.StorageTask
    public final void f() {
        String str;
        if (this.f48980q != null) {
            i(64, false);
            return;
        }
        if (i(4, false)) {
            do {
                this.f48976l = 0L;
                this.f48980q = null;
                this.f48977n.reset();
                GetNetworkRequest getNetworkRequest = new GetNetworkRequest(this.m.b(), this.m.a(), this.f48981r);
                this.f48977n.sendWithExponentialBackoff(getNetworkRequest, false);
                this.f48982s = getNetworkRequest.getResultCode();
                this.f48980q = getNetworkRequest.getException() != null ? getNetworkRequest.getException() : this.f48980q;
                int i10 = this.f48982s;
                boolean zK = (i10 == 308 || (i10 >= 200 && i10 < 300)) && this.f48980q == null && this.f49045g == 4;
                if (zK) {
                    this.f48978o = ((long) getNetworkRequest.getResultingContentLength()) + this.f48981r;
                    String resultString = getNetworkRequest.getResultString("ETag");
                    if (!TextUtils.isEmpty(resultString) && (str = this.f48979p) != null && !str.equals(resultString)) {
                        Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                        this.f48981r = 0L;
                        this.f48979p = null;
                        getNetworkRequest.performRequestEnd();
                        schedule();
                        return;
                    }
                    this.f48979p = resultString;
                    try {
                        zK = k(getNetworkRequest);
                    } catch (IOException e5) {
                        this.f48980q = e5;
                    }
                }
                getNetworkRequest.performRequestEnd();
                if (zK && this.f48980q == null && this.f49045g == 4) {
                    i(128, false);
                    return;
                }
                File file = new File(this.f48975k.getPath());
                if (file.exists()) {
                    this.f48981r = file.length();
                } else {
                    this.f48981r = 0L;
                }
                if (this.f49045g == 8) {
                    i(16, false);
                    return;
                } else if (this.f49045g == 32) {
                    if (i(256, false)) {
                        return;
                    }
                    Log.w("FileDownloadTask", "Unable to change download task to final state from " + this.f49045g);
                    return;
                }
            } while (this.f48976l > 0);
            i(64, false);
        }
    }

    @Override // com.google.firebase.storage.StorageTask
    @NonNull
    public final StorageTask.ProvideError h() {
        return new TaskSnapshot(StorageException.fromExceptionAndHttpCode(this.f48980q, this.f48982s), this.f48976l + this.f48981r);
    }

    public final boolean k(GetNetworkRequest getNetworkRequest) throws IOException {
        FileOutputStream fileOutputStream;
        InputStream stream = getNetworkRequest.getStream();
        if (stream == null) {
            this.f48980q = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
        File file = new File(this.f48975k.getPath());
        if (!file.exists()) {
            if (this.f48981r > 0) {
                throw new IOException("The file to download to has been deleted.");
            }
            if (!file.createNewFile()) {
                Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
            }
        }
        if (this.f48981r > 0) {
            file.getAbsolutePath();
            fileOutputStream = new FileOutputStream(file, true);
        } else {
            fileOutputStream = new FileOutputStream(file);
        }
        try {
            byte[] bArr = new byte[262144];
            boolean z10 = true;
            while (z10) {
                int i10 = 0;
                boolean z11 = false;
                while (i10 != 262144) {
                    try {
                        int i11 = stream.read(bArr, i10, 262144 - i10);
                        if (i11 == -1) {
                            break;
                        }
                        i10 += i11;
                        z11 = true;
                    } catch (IOException e5) {
                        this.f48980q = e5;
                    }
                }
                if (!z11) {
                    i10 = -1;
                }
                if (i10 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i10);
                this.f48976l += (long) i10;
                if (this.f48980q != null) {
                    this.f48980q = null;
                    z10 = false;
                }
                if (!i(4, false)) {
                    z10 = false;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            stream.close();
            return z10;
        } catch (Throwable th2) {
            fileOutputStream.flush();
            fileOutputStream.close();
            stream.close();
            throw th2;
        }
    }

    @Override // com.google.firebase.storage.StorageTask
    public void onCanceled() {
        this.f48977n.cancel();
        this.f48980q = StorageException.fromErrorStatus(Status.RESULT_CANCELED);
    }

    @Override // com.google.firebase.storage.StorageTask
    public void schedule() {
        StorageTaskScheduler.getInstance().scheduleDownload(new n1(this, 7));
    }
}
