package com.google.firebase.storage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.n1;
import com.bbva.network.constant.ConstantsKt;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.storage.internal.AdaptiveStreamBuffer;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.internal.SleeperImpl;
import com.google.firebase.storage.internal.Util;
import com.google.firebase.storage.network.NetworkRequest;
import com.google.firebase.storage.network.ResumableUploadByteRequest;
import com.google.firebase.storage.network.ResumableUploadCancelRequest;
import com.google.firebase.storage.network.ResumableUploadQueryRequest;
import com.google.firebase.storage.network.ResumableUploadStartRequest;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class UploadTask extends StorageTask<TaskSnapshot> {
    public static final Random C = new Random();
    public static final SleeperImpl D = new SleeperImpl();
    public static final Clock E = DefaultClock.getInstance();
    public volatile long A;
    public int B;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final StorageReference f49075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f49076l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdaptiveStreamBuffer f49077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicLong f49078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final InternalAuthProvider f49079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final InteropAppCheckTokenProvider f49080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f49081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ExponentialBackoffSender f49082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f49083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile StorageMetadata f49084u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile Uri f49085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Exception f49086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile Exception f49087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile int f49088y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile String f49089z;

    public class TaskSnapshot extends StorageTask<TaskSnapshot>.SnapshotBase {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f49090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f49091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final StorageMetadata f49092e;

        public TaskSnapshot(StorageException storageException, long j10, Uri uri, StorageMetadata storageMetadata) {
            super(storageException);
            this.f49090c = j10;
            this.f49091d = uri;
            this.f49092e = storageMetadata;
        }

        public long getBytesTransferred() {
            return this.f49090c;
        }

        @Nullable
        public StorageMetadata getMetadata() {
            return this.f49092e;
        }

        public long getTotalByteCount() {
            return UploadTask.this.m;
        }

        @Nullable
        public Uri getUploadSessionUri() {
            return this.f49091d;
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NetworkRequest f49094p0;

        public a(ResumableUploadCancelRequest resumableUploadCancelRequest) {
            this.f49094p0 = resumableUploadCancelRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            UploadTask uploadTask = UploadTask.this;
            this.f49094p0.performRequest(Util.getCurrentAuthToken(uploadTask.f49079p), Util.getCurrentAppCheckToken(uploadTask.f49080q), uploadTask.f49075k.a().getApplicationContext());
        }
    }

    public UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, byte[] bArr) {
        this.f49078o = new AtomicLong(0L);
        this.f49081r = 262144;
        this.f49085v = null;
        this.f49086w = null;
        this.f49087x = null;
        this.f49088y = 0;
        this.B = 0;
        Preconditions.checkNotNull(storageReference);
        Preconditions.checkNotNull(bArr);
        FirebaseStorage storage = storageReference.getStorage();
        this.m = bArr.length;
        this.f49075k = storageReference;
        this.f49084u = storageMetadata;
        InternalAuthProvider internalAuthProviderB = storage.b();
        this.f49079p = internalAuthProviderB;
        InteropAppCheckTokenProvider interopAppCheckTokenProviderA = storage.a();
        this.f49080q = interopAppCheckTokenProviderA;
        this.f49076l = null;
        this.f49077n = new AdaptiveStreamBuffer(new ByteArrayInputStream(bArr), 262144);
        this.f49083t = true;
        this.A = storage.getMaxChunkUploadRetry();
        this.f49082s = new ExponentialBackoffSender(storage.getApp().getApplicationContext(), internalAuthProviderB, interopAppCheckTokenProviderA, storage.getMaxUploadRetryTimeMillis());
    }

    @Override // com.google.firebase.storage.StorageTask
    public final StorageReference d() {
        return this.f49075k;
    }

    @Override // com.google.firebase.storage.StorageTask
    public final void f() {
        this.f49082s.reset();
        if (i(4, false)) {
            if (this.f49075k.getParent() == null) {
                this.f49086w = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
            }
            if (this.f49086w != null) {
                return;
            }
            if (this.f49085v == null) {
                String contentType = this.f49084u != null ? this.f49084u.getContentType() : null;
                if (this.f49076l != null && TextUtils.isEmpty(contentType)) {
                    contentType = this.f49075k.getStorage().getApp().getApplicationContext().getContentResolver().getType(this.f49076l);
                }
                if (TextUtils.isEmpty(contentType)) {
                    contentType = ConstantsKt.DEFAULT_MEDIATYPE;
                }
                ResumableUploadStartRequest resumableUploadStartRequest = new ResumableUploadStartRequest(this.f49075k.b(), this.f49075k.a(), this.f49084u != null ? this.f49084u.a() : null, contentType);
                this.f49082s.sendWithExponentialBackoff(resumableUploadStartRequest);
                if (k(resumableUploadStartRequest)) {
                    String resultString = resumableUploadStartRequest.getResultString("X-Goog-Upload-URL");
                    if (!TextUtils.isEmpty(resultString)) {
                        this.f49085v = Uri.parse(resultString);
                    }
                }
            } else {
                l(false);
            }
            boolean zN = n();
            while (zN) {
                try {
                    this.f49077n.fill(this.f49081r);
                    int iMin = Math.min(this.f49081r, this.f49077n.available());
                    ResumableUploadByteRequest resumableUploadByteRequest = new ResumableUploadByteRequest(this.f49075k.b(), this.f49075k.a(), this.f49085v, this.f49077n.get(), this.f49078o.get(), iMin, this.f49077n.isFinished());
                    try {
                        D.sleep(this.B + C.nextInt(250));
                        resumableUploadByteRequest.performRequest(Util.getCurrentAuthToken(this.f49079p), Util.getCurrentAppCheckToken(this.f49080q), this.f49075k.a().getApplicationContext());
                        boolean zK = k(resumableUploadByteRequest);
                        if (zK) {
                            this.B = 0;
                        }
                        if (zK) {
                            this.f49078o.getAndAdd(iMin);
                            if (this.f49077n.isFinished()) {
                                try {
                                    this.f49084u = new StorageMetadata.Builder(resumableUploadByteRequest.getResultBody(), this.f49075k).build();
                                    i(4, false);
                                    i(128, false);
                                } catch (JSONException e5) {
                                    resumableUploadByteRequest.getRawResult();
                                    this.f49086w = e5;
                                }
                            } else {
                                this.f49077n.advance(iMin);
                                int i10 = this.f49081r;
                                if (i10 < 33554432) {
                                    this.f49081r = i10 * 2;
                                }
                            }
                        } else {
                            this.f49081r = 262144;
                        }
                    } catch (InterruptedException e7) {
                        Log.w("UploadTask", "thread interrupted during exponential backoff.");
                        Thread.currentThread().interrupt();
                        this.f49087x = e7;
                    }
                } catch (IOException e10) {
                    this.f49086w = e10;
                }
                zN = n();
                if (zN) {
                    i(4, false);
                }
            }
            if (!this.f49083t || this.f49045g == 16) {
                return;
            }
            try {
                this.f49077n.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.google.firebase.storage.StorageTask
    @NonNull
    public final StorageTask.ProvideError h() {
        return new TaskSnapshot(StorageException.fromExceptionAndHttpCode(this.f49086w != null ? this.f49086w : this.f49087x, this.f49088y), this.f49078o.get(), this.f49085v, this.f49084u);
    }

    public final boolean k(com.google.firebase.storage.network.a aVar) {
        int resultCode = aVar.getResultCode();
        if (this.f49082s.isRetryableError(resultCode)) {
            resultCode = -2;
        }
        this.f49088y = resultCode;
        this.f49087x = aVar.getException();
        this.f49089z = aVar.getResultString("X-Goog-Upload-Status");
        int i10 = this.f49088y;
        return (i10 == 308 || (i10 >= 200 && i10 < 300)) && this.f49087x == null;
    }

    public final boolean l(boolean z10) {
        ResumableUploadQueryRequest resumableUploadQueryRequest = new ResumableUploadQueryRequest(this.f49075k.b(), this.f49075k.a(), this.f49085v);
        if ("final".equals(this.f49089z)) {
            return false;
        }
        if (z10) {
            this.f49082s.sendWithExponentialBackoff(resumableUploadQueryRequest);
            if (!k(resumableUploadQueryRequest)) {
                return false;
            }
        } else {
            resumableUploadQueryRequest.performRequest(Util.getCurrentAuthToken(this.f49079p), Util.getCurrentAppCheckToken(this.f49080q), this.f49075k.a().getApplicationContext());
            if (!k(resumableUploadQueryRequest)) {
                return false;
            }
        }
        if ("final".equals(resumableUploadQueryRequest.getResultString("X-Goog-Upload-Status"))) {
            this.f49086w = new IOException("The server has terminated the upload session");
            return false;
        }
        String resultString = resumableUploadQueryRequest.getResultString("X-Goog-Upload-Size-Received");
        long j10 = !TextUtils.isEmpty(resultString) ? Long.parseLong(resultString) : 0L;
        long j11 = this.f49078o.get();
        if (j11 > j10) {
            this.f49086w = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        }
        if (j11 >= j10) {
            return true;
        }
        try {
            long j12 = j10 - j11;
            if (this.f49077n.advance((int) j12) != j12) {
                this.f49086w = new IOException("Unexpected end of stream encountered.");
                return false;
            }
            if (this.f49078o.compareAndSet(j11, j10)) {
                return true;
            }
            this.f49086w = new IllegalStateException("uploaded bytes changed unexpectedly.");
            return false;
        } catch (IOException e5) {
            this.f49086w = e5;
            return false;
        }
    }

    public final boolean m() {
        if (!"final".equals(this.f49089z)) {
            return true;
        }
        if (this.f49086w == null) {
            this.f49086w = new IOException("The server has terminated the upload session", this.f49087x);
        }
        i(64, false);
        return false;
    }

    public final boolean n() {
        if (this.f49045g == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f49086w = new InterruptedException();
            i(64, false);
            return false;
        }
        if (this.f49045g == 32) {
            i(256, false);
            return false;
        }
        if (this.f49045g == 8) {
            i(16, false);
            return false;
        }
        if (!m()) {
            return false;
        }
        if (this.f49085v == null) {
            if (this.f49086w == null) {
                this.f49086w = new IllegalStateException("Unable to obtain an upload URL.");
            }
            i(64, false);
            return false;
        }
        if (this.f49086w != null) {
            i(64, false);
            return false;
        }
        boolean z10 = this.f49087x != null || this.f49088y < 200 || this.f49088y >= 300;
        Clock clock = E;
        long jElapsedRealtime = clock.elapsedRealtime() + this.A;
        long jElapsedRealtime2 = clock.elapsedRealtime() + ((long) this.B);
        if (z10) {
            if (jElapsedRealtime2 > jElapsedRealtime || !l(true)) {
                if (m()) {
                    i(64, false);
                }
                return false;
            }
            this.B = Math.max(this.B * 2, 1000);
        }
        return true;
    }

    @Override // com.google.firebase.storage.StorageTask
    public void onCanceled() {
        this.f49082s.cancel();
        ResumableUploadCancelRequest resumableUploadCancelRequest = this.f49085v != null ? new ResumableUploadCancelRequest(this.f49075k.b(), this.f49075k.a(), this.f49085v) : null;
        if (resumableUploadCancelRequest != null) {
            StorageTaskScheduler.getInstance().scheduleCommand(new a(resumableUploadCancelRequest));
        }
        this.f49086w = StorageException.fromErrorStatus(Status.RESULT_CANCELED);
        super.onCanceled();
    }

    @Override // com.google.firebase.storage.StorageTask
    public void resetState() {
        this.f49086w = null;
        this.f49087x = null;
        this.f49088y = 0;
        this.f49089z = null;
    }

    @Override // com.google.firebase.storage.StorageTask
    public void schedule() {
        StorageTaskScheduler.getInstance().scheduleUpload(new n1(this, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [long] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8, types: [long] */
    /* JADX WARN: Type inference failed for: r6v9, types: [long] */
    public UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, Uri uri, Uri uri2) {
        ?? r10;
        ?? r4;
        long statSize;
        this.f49078o = new AtomicLong(0L);
        this.f49081r = 262144;
        InputStream inputStreamOpenInputStream = null;
        this.f49085v = null;
        this.f49086w = null;
        this.f49087x = null;
        this.f49088y = 0;
        this.B = 0;
        Preconditions.checkNotNull(storageReference);
        Preconditions.checkNotNull(uri);
        FirebaseStorage storage = storageReference.getStorage();
        this.f49075k = storageReference;
        this.f49084u = storageMetadata;
        InternalAuthProvider internalAuthProviderB = storage.b();
        this.f49079p = internalAuthProviderB;
        InteropAppCheckTokenProvider interopAppCheckTokenProviderA = storage.a();
        this.f49080q = interopAppCheckTokenProviderA;
        this.f49076l = uri;
        this.A = storage.getMaxChunkUploadRetry();
        ?? applicationContext = storageReference.a().getApplicationContext();
        this.f49082s = new ExponentialBackoffSender(applicationContext, internalAuthProviderB, interopAppCheckTokenProviderA, storage.getMaxUploadRetryTimeMillis());
        ?? r11 = -1;
        try {
            try {
                ContentResolver contentResolver = storageReference.getStorage().getApp().getApplicationContext().getContentResolver();
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            applicationContext = statSize;
                        } catch (IOException e5) {
                            e = e5;
                            Log.w("UploadTask", "could not retrieve file size for upload " + this.f49076l.toString(), e);
                            applicationContext = statSize;
                        } catch (NullPointerException e7) {
                            e = e7;
                            Log.w("UploadTask", "NullPointerException during file size calculation.", e);
                            applicationContext = -1;
                        }
                    } else {
                        applicationContext = -1;
                    }
                } catch (IOException e10) {
                    e = e10;
                    statSize = -1;
                } catch (NullPointerException e11) {
                    e = e11;
                }
                inputStreamOpenInputStream = contentResolver.openInputStream(this.f49076l);
                r10 = applicationContext;
                if (inputStreamOpenInputStream != null) {
                    if (applicationContext == -1) {
                        try {
                            int iAvailable = inputStreamOpenInputStream.available();
                            if (iAvailable >= 0) {
                                applicationContext = iAvailable;
                            }
                        } catch (IOException unused) {
                        }
                    }
                    r11 = applicationContext;
                    inputStreamOpenInputStream = new BufferedInputStream(inputStreamOpenInputStream);
                    r4 = r11;
                    r10 = r4;
                }
            } catch (FileNotFoundException e12) {
                e = e12;
                r11 = applicationContext;
                this.f49076l.toString();
                this.f49086w = e;
                r4 = r11;
            }
        } catch (FileNotFoundException e13) {
            e = e13;
            this.f49076l.toString();
            this.f49086w = e;
            r4 = r11;
        }
        this.m = r10;
        this.f49077n = new AdaptiveStreamBuffer(inputStreamOpenInputStream, 262144);
        this.f49083t = true;
        this.f49085v = uri2;
    }

    public UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, InputStream inputStream) {
        this.f49078o = new AtomicLong(0L);
        this.f49081r = 262144;
        this.f49085v = null;
        this.f49086w = null;
        this.f49087x = null;
        this.f49088y = 0;
        this.B = 0;
        Preconditions.checkNotNull(storageReference);
        Preconditions.checkNotNull(inputStream);
        FirebaseStorage storage = storageReference.getStorage();
        this.m = -1L;
        this.f49075k = storageReference;
        this.f49084u = storageMetadata;
        InternalAuthProvider internalAuthProviderB = storage.b();
        this.f49079p = internalAuthProviderB;
        InteropAppCheckTokenProvider interopAppCheckTokenProviderA = storage.a();
        this.f49080q = interopAppCheckTokenProviderA;
        this.f49077n = new AdaptiveStreamBuffer(inputStream, 262144);
        this.f49083t = false;
        this.f49076l = null;
        this.A = storage.getMaxChunkUploadRetry();
        this.f49082s = new ExponentialBackoffSender(storageReference.a().getApplicationContext(), internalAuthProviderB, interopAppCheckTokenProviderA, storage.getMaxUploadRetryTimeMillis());
    }
}
