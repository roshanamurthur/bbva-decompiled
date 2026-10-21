package com.google.firebase.storage;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.n1;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetNetworkRequest;
import com.google.firebase.storage.network.NetworkRequest;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class StreamDownloadTask extends StorageTask<TaskSnapshot> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final StorageReference f49054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExponentialBackoffSender f49055l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public StreamProcessor f49057o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f49059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f49060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public BufferedInputStream f49061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NetworkRequest f49062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f49063u;
    public volatile Exception m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile int f49056n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f49058p = -1;

    public interface StreamProcessor {
        void doInBackground(@NonNull TaskSnapshot taskSnapshot, @NonNull InputStream inputStream) throws IOException;
    }

    public class TaskSnapshot extends StorageTask<TaskSnapshot>.SnapshotBase {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f49064c;

        public TaskSnapshot(StorageException storageException, long j10) {
            super(storageException);
            this.f49064c = j10;
        }

        public long getBytesTransferred() {
            return this.f49064c;
        }

        @NonNull
        public InputStream getStream() {
            return StreamDownloadTask.this.f49061s;
        }

        public long getTotalByteCount() {
            return StreamDownloadTask.this.f49058p;
        }
    }

    public class a implements Callable<InputStream> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final InputStream call() throws Exception {
            String str;
            StreamDownloadTask streamDownloadTask = StreamDownloadTask.this;
            streamDownloadTask.f49055l.reset();
            NetworkRequest networkRequest = streamDownloadTask.f49062t;
            if (networkRequest != null) {
                networkRequest.performRequestEnd();
            }
            GetNetworkRequest getNetworkRequest = new GetNetworkRequest(streamDownloadTask.f49054k.b(), streamDownloadTask.f49054k.a(), streamDownloadTask.f49059q);
            streamDownloadTask.f49062t = getNetworkRequest;
            streamDownloadTask.f49055l.sendWithExponentialBackoff(getNetworkRequest, false);
            streamDownloadTask.f49056n = streamDownloadTask.f49062t.getResultCode();
            streamDownloadTask.m = streamDownloadTask.f49062t.getException() != null ? streamDownloadTask.f49062t.getException() : streamDownloadTask.m;
            int i10 = streamDownloadTask.f49056n;
            if ((i10 != 308 && (i10 < 200 || i10 >= 300)) || streamDownloadTask.m != null || streamDownloadTask.f49045g != 4) {
                throw new IOException("Could not open resulting stream.");
            }
            String resultString = streamDownloadTask.f49062t.getResultString("ETag");
            if (!TextUtils.isEmpty(resultString) && (str = streamDownloadTask.f49063u) != null && !str.equals(resultString)) {
                streamDownloadTask.f49056n = 409;
                throw new IOException("The ETag on the server changed.");
            }
            streamDownloadTask.f49063u = resultString;
            streamDownloadTask.f49058p = ((long) streamDownloadTask.f49062t.getResultingContentLength()) + streamDownloadTask.f49059q;
            return streamDownloadTask.f49062t.getStream();
        }
    }

    public StreamDownloadTask(@NonNull StorageReference storageReference) {
        this.f49054k = storageReference;
        FirebaseStorage storage = storageReference.getStorage();
        this.f49055l = new ExponentialBackoffSender(storage.getApp().getApplicationContext(), storage.b(), storage.a(), storage.getMaxDownloadRetryTimeMillis());
    }

    @Override // com.google.firebase.storage.StorageTask
    @NonNull
    public final StorageReference d() {
        return this.f49054k;
    }

    @Override // com.google.firebase.storage.StorageTask
    public final void f() {
        if (this.m != null) {
            i(64, false);
            return;
        }
        if (i(4, false)) {
            a aVar = new a();
            b bVar = new b();
            bVar.f49067p0 = this;
            bVar.f49069r0 = aVar;
            this.f49061s = new BufferedInputStream(bVar);
            try {
                bVar.e();
                StreamProcessor streamProcessor = this.f49057o;
                if (streamProcessor != null) {
                    try {
                        streamProcessor.doInBackground(g(), this.f49061s);
                    } catch (Exception e5) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e5);
                        this.m = e5;
                    }
                }
            } catch (IOException e7) {
                this.m = e7;
            }
            if (this.f49061s == null) {
                this.f49062t.performRequestEnd();
                this.f49062t = null;
            }
            if (this.m == null && this.f49045g == 4) {
                i(4, false);
                i(128, false);
                return;
            }
            if (i(this.f49045g == 32 ? 256 : 64, false)) {
                return;
            }
            Log.w("StreamDownloadTask", "Unable to change download task to final state from " + this.f49045g);
        }
    }

    @Override // com.google.firebase.storage.StorageTask
    @NonNull
    public final StorageTask.ProvideError h() {
        return new TaskSnapshot(StorageException.fromExceptionAndHttpCode(this.m, this.f49056n), this.f49060r);
    }

    @Override // com.google.firebase.storage.StorageTask
    public void onCanceled() {
        this.f49055l.cancel();
        this.m = StorageException.fromErrorStatus(Status.RESULT_CANCELED);
    }

    @Override // com.google.firebase.storage.StorageTask
    public void onProgress() {
        this.f49060r = this.f49059q;
    }

    @Override // com.google.firebase.storage.StorageTask, com.google.firebase.storage.ControllableTask
    public boolean pause() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.StorageTask, com.google.firebase.storage.ControllableTask
    public boolean resume() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.StorageTask
    public void schedule() {
        StorageTaskScheduler.getInstance().scheduleDownload(new n1(this, 7));
    }

    public static class b extends InputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @Nullable
        public StreamDownloadTask f49067p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public InputStream f49068q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Callable<InputStream> f49069r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public IOException f49070s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f49071t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f49072u0;
        public boolean v0;

        @Override // java.io.InputStream
        public final int available() throws IOException {
            while (e()) {
                try {
                    return this.f49068q0.available();
                } catch (IOException e5) {
                    this.f49070s0 = e5;
                }
            }
            throw this.f49070s0;
        }

        public final void b() throws IOException {
            StreamDownloadTask streamDownloadTask = this.f49067p0;
            if (streamDownloadTask != null && streamDownloadTask.f49045g == 32) {
                throw new com.google.firebase.storage.a("The operation was canceled.");
            }
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            NetworkRequest networkRequest;
            InputStream inputStream = this.f49068q0;
            if (inputStream != null) {
                inputStream.close();
            }
            this.v0 = true;
            StreamDownloadTask streamDownloadTask = this.f49067p0;
            if (streamDownloadTask != null && (networkRequest = streamDownloadTask.f49062t) != null) {
                networkRequest.performRequestEnd();
                streamDownloadTask.f49062t = null;
            }
            b();
        }

        public final boolean e() throws IOException {
            b();
            if (this.f49070s0 != null) {
                try {
                    InputStream inputStream = this.f49068q0;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                this.f49068q0 = null;
                long j10 = this.f49072u0;
                long j11 = this.f49071t0;
                if (j10 == j11) {
                    return false;
                }
                this.f49072u0 = j11;
                this.f49070s0 = null;
            }
            if (this.v0) {
                throw new IOException("Can't perform operation on closed stream");
            }
            if (this.f49068q0 != null) {
                return true;
            }
            try {
                this.f49068q0 = this.f49069r0.call();
                return true;
            } catch (Exception e5) {
                if (e5 instanceof IOException) {
                    throw ((IOException) e5);
                }
                throw new IOException("Unable to open stream", e5);
            }
        }

        public final void g(long j10) {
            StreamDownloadTask streamDownloadTask = this.f49067p0;
            if (streamDownloadTask != null) {
                long j11 = streamDownloadTask.f49059q + j10;
                streamDownloadTask.f49059q = j11;
                if (streamDownloadTask.f49060r + SvgConstantsKt.SPECIFIED_TEXT_ANCHOR <= j11) {
                    if (streamDownloadTask.f49045g == 4) {
                        streamDownloadTask.i(4, false);
                    } else {
                        streamDownloadTask.f49060r = streamDownloadTask.f49059q;
                    }
                }
            }
            this.f49071t0 += j10;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            while (e()) {
                try {
                    int i10 = this.f49068q0.read();
                    if (i10 != -1) {
                        g(1L);
                    }
                    return i10;
                } catch (IOException e5) {
                    this.f49070s0 = e5;
                }
            }
            throw this.f49070s0;
        }

        @Override // java.io.InputStream
        public final long skip(long j10) throws IOException {
            long j11 = 0;
            while (e()) {
                while (j10 > SvgConstantsKt.SPECIFIED_TEXT_ANCHOR) {
                    try {
                        long jSkip = this.f49068q0.skip(SvgConstantsKt.SPECIFIED_TEXT_ANCHOR);
                        if (jSkip < 0) {
                            if (j11 == 0) {
                                return -1L;
                            }
                            return j11;
                        }
                        j11 += jSkip;
                        j10 -= jSkip;
                        g(jSkip);
                        b();
                    } catch (IOException e5) {
                        this.f49070s0 = e5;
                    }
                }
                if (j10 > 0) {
                    long jSkip2 = this.f49068q0.skip(j10);
                    if (jSkip2 < 0) {
                        if (j11 == 0) {
                            return -1L;
                        }
                        return j11;
                    }
                    j11 += jSkip2;
                    j10 -= jSkip2;
                    g(jSkip2);
                }
                if (j10 == 0) {
                    return j11;
                }
            }
            throw this.f49070s0;
        }

        @Override // java.io.InputStream
        public final int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
            int i12 = 0;
            while (e()) {
                while (i11 > SvgConstantsKt.SPECIFIED_TEXT_ANCHOR) {
                    try {
                        int i13 = this.f49068q0.read(bArr, i10, 262144);
                        if (i13 == -1) {
                            if (i12 == 0) {
                                return -1;
                            }
                            return i12;
                        }
                        i12 += i13;
                        i10 += i13;
                        i11 -= i13;
                        g(i13);
                        b();
                    } catch (IOException e5) {
                        this.f49070s0 = e5;
                    }
                }
                if (i11 > 0) {
                    int i14 = this.f49068q0.read(bArr, i10, i11);
                    if (i14 == -1) {
                        if (i12 == 0) {
                            return -1;
                        }
                        return i12;
                    }
                    i10 += i14;
                    i12 += i14;
                    i11 -= i14;
                    g(i14);
                }
                if (i11 == 0) {
                    return i12;
                }
            }
            throw this.f49070s0;
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
        }
    }
}
