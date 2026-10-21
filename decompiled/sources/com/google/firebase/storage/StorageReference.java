package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.internal.Slashes;
import com.google.firebase.storage.internal.StorageReferenceUri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class StorageReference implements Comparable<StorageReference> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Uri f49026p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final FirebaseStorage f49027q0;

    public class a implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource f49028a;

        public a(TaskCompletionSource taskCompletionSource) {
            this.f49028a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NonNull Exception exc) {
            this.f49028a.setException(StorageException.fromExceptionAndHttpCode(exc, 0));
        }
    }

    public class b implements OnSuccessListener<StreamDownloadTask.TaskSnapshot> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource f49029a;

        public b(TaskCompletionSource taskCompletionSource) {
            this.f49029a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(StreamDownloadTask.TaskSnapshot taskSnapshot) {
            TaskCompletionSource taskCompletionSource = this.f49029a;
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            taskCompletionSource.setException(StorageException.fromErrorStatus(Status.RESULT_INTERNAL_ERROR));
        }
    }

    public class c implements StreamDownloadTask.StreamProcessor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f49030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource f49031b;

        public c(long j10, TaskCompletionSource taskCompletionSource) {
            this.f49030a = j10;
            this.f49031b = taskCompletionSource;
        }

        @Override // com.google.firebase.storage.StreamDownloadTask.StreamProcessor
        public final void doInBackground(StreamDownloadTask.TaskSnapshot taskSnapshot, InputStream inputStream) throws IOException {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i10 = 0;
                while (true) {
                    int i11 = inputStream.read(bArr, 0, 16384);
                    if (i11 == -1) {
                        byteArrayOutputStream.flush();
                        this.f49031b.setResult(byteArrayOutputStream.toByteArray());
                        inputStream.close();
                        return;
                    } else {
                        i10 += i11;
                        if (i10 > this.f49030a) {
                            throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                        }
                        byteArrayOutputStream.write(bArr, 0, i11);
                    }
                }
            } catch (Throwable th2) {
                inputStream.close();
                throw th2;
            }
        }
    }

    public class d implements Continuation<ListResult, Task<Void>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List f49032p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List f49033q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Executor f49034r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource f49035s0;

        public d(ArrayList arrayList, ArrayList arrayList2, Executor executor, TaskCompletionSource taskCompletionSource) {
            this.f49032p0 = arrayList;
            this.f49033q0 = arrayList2;
            this.f49034r0 = executor;
            this.f49035s0 = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public final Task<Void> then(@NonNull Task<ListResult> task) throws Exception {
            boolean zIsSuccessful = task.isSuccessful();
            TaskCompletionSource taskCompletionSource = this.f49035s0;
            if (zIsSuccessful) {
                ListResult result = task.getResult();
                List<StorageReference> prefixes = result.getPrefixes();
                List list = this.f49032p0;
                list.addAll(prefixes);
                List<StorageReference> items = result.getItems();
                List list2 = this.f49033q0;
                list2.addAll(items);
                if (result.getPageToken() != null) {
                    StorageReference.this.c(null, result.getPageToken()).continueWithTask(this.f49034r0, this);
                } else {
                    taskCompletionSource.setResult(new ListResult(null, list, list2));
                }
            } else {
                taskCompletionSource.setException(task.getException());
            }
            return Tasks.forResult(null);
        }
    }

    public StorageReference(@NonNull Uri uri, @NonNull FirebaseStorage firebaseStorage) {
        Preconditions.checkArgument(uri != null, "storageUri cannot be null");
        Preconditions.checkArgument(firebaseStorage != null, "FirebaseApp cannot be null");
        this.f49026p0 = uri;
        this.f49027q0 = firebaseStorage;
    }

    @NonNull
    public final FirebaseApp a() {
        return getStorage().getApp();
    }

    @NonNull
    public final StorageReferenceUri b() {
        return new StorageReferenceUri(this.f49026p0, this.f49027q0.f48993i);
    }

    public final Task<ListResult> c(@Nullable Integer num, @Nullable String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        StorageTaskScheduler.getInstance().scheduleCommand(new f(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public StorageReference child(@NonNull String str) {
        Preconditions.checkArgument(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new StorageReference(this.f49026p0.buildUpon().appendEncodedPath(Slashes.preserveSlashEncode(Slashes.normalizeSlashes(str))).build(), this.f49027q0);
    }

    @NonNull
    public Task<Void> delete() {
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        StorageTaskScheduler storageTaskScheduler = StorageTaskScheduler.getInstance();
        com.google.firebase.storage.b bVar = new com.google.firebase.storage.b();
        Preconditions.checkNotNull(this);
        Preconditions.checkNotNull(taskCompletionSource);
        bVar.f49096p0 = this;
        bVar.f49097q0 = taskCompletionSource;
        FirebaseStorage storage = getStorage();
        bVar.f49098r0 = new ExponentialBackoffSender(storage.getApp().getApplicationContext(), storage.b(), storage.a(), storage.getMaxDownloadRetryTimeMillis());
        storageTaskScheduler.scheduleCommand(bVar);
        return taskCompletionSource.getTask();
    }

    public boolean equals(Object obj) {
        if (obj instanceof StorageReference) {
            return ((StorageReference) obj).toString().equals(toString());
        }
        return false;
    }

    @NonNull
    public List<FileDownloadTask> getActiveDownloadTasks() {
        List<FileDownloadTask> listUnmodifiableList;
        q qVar = q.f49184c;
        synchronized (qVar.f49186b) {
            try {
                ArrayList arrayList = new ArrayList();
                String string = toString();
                for (Map.Entry entry : qVar.f49185a.entrySet()) {
                    if (((String) entry.getKey()).startsWith(string)) {
                        StorageTask storageTask = (StorageTask) ((WeakReference) entry.getValue()).get();
                        if (storageTask instanceof FileDownloadTask) {
                            arrayList.add((FileDownloadTask) storageTask);
                        }
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listUnmodifiableList;
    }

    @NonNull
    public List<UploadTask> getActiveUploadTasks() {
        List<UploadTask> listUnmodifiableList;
        q qVar = q.f49184c;
        synchronized (qVar.f49186b) {
            try {
                ArrayList arrayList = new ArrayList();
                String string = toString();
                for (Map.Entry entry : qVar.f49185a.entrySet()) {
                    if (((String) entry.getKey()).startsWith(string)) {
                        StorageTask storageTask = (StorageTask) ((WeakReference) entry.getValue()).get();
                        if (storageTask instanceof UploadTask) {
                            arrayList.add((UploadTask) storageTask);
                        }
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listUnmodifiableList;
    }

    @NonNull
    public String getBucket() {
        return this.f49026p0.getAuthority();
    }

    @NonNull
    public Task<byte[]> getBytes(long j10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        StreamDownloadTask streamDownloadTask = new StreamDownloadTask(this);
        c cVar = new c(j10, taskCompletionSource);
        Preconditions.checkNotNull(cVar);
        Preconditions.checkState(streamDownloadTask.f49057o == null);
        streamDownloadTask.f49057o = cVar;
        streamDownloadTask.addOnSuccessListener((OnSuccessListener) new b(taskCompletionSource)).addOnFailureListener((OnFailureListener) new a(taskCompletionSource));
        streamDownloadTask.e();
        return taskCompletionSource.getTask();
    }

    @NonNull
    public Task<Uri> getDownloadUrl() {
        TaskCompletionSource<Uri> taskCompletionSource = new TaskCompletionSource<>();
        StorageTaskScheduler storageTaskScheduler = StorageTaskScheduler.getInstance();
        com.google.firebase.storage.d dVar = new com.google.firebase.storage.d();
        Preconditions.checkNotNull(this);
        Preconditions.checkNotNull(taskCompletionSource);
        dVar.f49103p0 = this;
        dVar.f49104q0 = taskCompletionSource;
        if (getRoot().getName().equals(getName())) {
            throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
        }
        FirebaseStorage storage = getStorage();
        dVar.f49105r0 = new ExponentialBackoffSender(storage.getApp().getApplicationContext(), storage.b(), storage.a(), storage.getMaxOperationRetryTimeMillis());
        storageTaskScheduler.scheduleCommand(dVar);
        return taskCompletionSource.getTask();
    }

    @NonNull
    public FileDownloadTask getFile(@NonNull Uri uri) {
        FileDownloadTask fileDownloadTask = new FileDownloadTask(this, uri);
        fileDownloadTask.e();
        return fileDownloadTask;
    }

    @NonNull
    public Task<StorageMetadata> getMetadata() {
        TaskCompletionSource<StorageMetadata> taskCompletionSource = new TaskCompletionSource<>();
        StorageTaskScheduler storageTaskScheduler = StorageTaskScheduler.getInstance();
        e eVar = new e();
        Preconditions.checkNotNull(this);
        Preconditions.checkNotNull(taskCompletionSource);
        eVar.f49106p0 = this;
        eVar.f49107q0 = taskCompletionSource;
        if (getRoot().getName().equals(getName())) {
            throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
        }
        FirebaseStorage storage = getStorage();
        eVar.f49109s0 = new ExponentialBackoffSender(storage.getApp().getApplicationContext(), storage.b(), storage.a(), storage.getMaxDownloadRetryTimeMillis());
        storageTaskScheduler.scheduleCommand(eVar);
        return taskCompletionSource.getTask();
    }

    @NonNull
    public String getName() {
        String path = this.f49026p0.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        return iLastIndexOf != -1 ? path.substring(iLastIndexOf + 1) : path;
    }

    @Nullable
    public StorageReference getParent() {
        Uri uri = this.f49026p0;
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        if (path.equals("/")) {
            return null;
        }
        int iLastIndexOf = path.lastIndexOf(47);
        return new StorageReference(uri.buildUpon().path(iLastIndexOf != -1 ? path.substring(0, iLastIndexOf) : "/").build(), this.f49027q0);
    }

    @NonNull
    public String getPath() {
        return this.f49026p0.getPath();
    }

    @NonNull
    public StorageReference getRoot() {
        return new StorageReference(this.f49026p0.buildUpon().path("").build(), this.f49027q0);
    }

    @NonNull
    public FirebaseStorage getStorage() {
        return this.f49027q0;
    }

    @NonNull
    public StreamDownloadTask getStream() {
        StreamDownloadTask streamDownloadTask = new StreamDownloadTask(this);
        streamDownloadTask.e();
        return streamDownloadTask;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @NonNull
    public Task<ListResult> list(int i10) {
        Preconditions.checkArgument(i10 > 0, "maxResults must be greater than zero");
        Preconditions.checkArgument(i10 <= 1000, "maxResults must be at most 1000");
        return c(Integer.valueOf(i10), null);
    }

    @NonNull
    public Task<ListResult> listAll() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Executor commandPoolExecutor = StorageTaskScheduler.getInstance().getCommandPoolExecutor();
        c(null, null).continueWithTask(commandPoolExecutor, new d(arrayList, arrayList2, commandPoolExecutor, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public UploadTask putBytes(@NonNull byte[] bArr) {
        Preconditions.checkArgument(bArr != null, "bytes cannot be null");
        UploadTask uploadTask = new UploadTask(this, (StorageMetadata) null, bArr);
        uploadTask.e();
        return uploadTask;
    }

    @NonNull
    public UploadTask putFile(@NonNull Uri uri) {
        Preconditions.checkArgument(uri != null, "uri cannot be null");
        UploadTask uploadTask = new UploadTask(this, null, uri, null);
        uploadTask.e();
        return uploadTask;
    }

    @NonNull
    public UploadTask putStream(@NonNull InputStream inputStream) {
        Preconditions.checkArgument(inputStream != null, "stream cannot be null");
        UploadTask uploadTask = new UploadTask(this, (StorageMetadata) null, inputStream);
        uploadTask.e();
        return uploadTask;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("gs://");
        Uri uri = this.f49026p0;
        sb2.append(uri.getAuthority());
        sb2.append(uri.getEncodedPath());
        return sb2.toString();
    }

    @NonNull
    public Task<StorageMetadata> updateMetadata(@NonNull StorageMetadata storageMetadata) {
        Preconditions.checkNotNull(storageMetadata);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        StorageTaskScheduler.getInstance().scheduleCommand(new u(this, taskCompletionSource, storageMetadata));
        return taskCompletionSource.getTask();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull StorageReference storageReference) {
        return this.f49026p0.compareTo(storageReference.f49026p0);
    }

    @NonNull
    public FileDownloadTask getFile(@NonNull File file) {
        return getFile(Uri.fromFile(file));
    }

    @NonNull
    public StreamDownloadTask getStream(@NonNull StreamDownloadTask.StreamProcessor streamProcessor) {
        StreamDownloadTask streamDownloadTask = new StreamDownloadTask(this);
        Preconditions.checkNotNull(streamProcessor);
        Preconditions.checkState(streamDownloadTask.f49057o == null);
        streamDownloadTask.f49057o = streamProcessor;
        streamDownloadTask.e();
        return streamDownloadTask;
    }

    @NonNull
    public Task<ListResult> list(int i10, @NonNull String str) {
        Preconditions.checkArgument(i10 > 0, "maxResults must be greater than zero");
        Preconditions.checkArgument(i10 <= 1000, "maxResults must be at most 1000");
        Preconditions.checkArgument(str != null, "pageToken must be non-null to resume a previous list() operation");
        return c(Integer.valueOf(i10), str);
    }

    @NonNull
    public UploadTask putBytes(@NonNull byte[] bArr, @NonNull StorageMetadata storageMetadata) {
        Preconditions.checkArgument(bArr != null, "bytes cannot be null");
        Preconditions.checkArgument(storageMetadata != null, "metadata cannot be null");
        UploadTask uploadTask = new UploadTask(this, storageMetadata, bArr);
        uploadTask.e();
        return uploadTask;
    }

    @NonNull
    public UploadTask putFile(@NonNull Uri uri, @NonNull StorageMetadata storageMetadata) {
        Preconditions.checkArgument(uri != null, "uri cannot be null");
        Preconditions.checkArgument(storageMetadata != null, "metadata cannot be null");
        UploadTask uploadTask = new UploadTask(this, storageMetadata, uri, null);
        uploadTask.e();
        return uploadTask;
    }

    @NonNull
    public UploadTask putStream(@NonNull InputStream inputStream, @NonNull StorageMetadata storageMetadata) {
        Preconditions.checkArgument(inputStream != null, "stream cannot be null");
        Preconditions.checkArgument(storageMetadata != null, "metadata cannot be null");
        UploadTask uploadTask = new UploadTask(this, storageMetadata, inputStream);
        uploadTask.e();
        return uploadTask;
    }

    @NonNull
    public UploadTask putFile(@NonNull Uri uri, @Nullable StorageMetadata storageMetadata, @Nullable Uri uri2) {
        Preconditions.checkArgument(uri != null, "uri cannot be null");
        Preconditions.checkArgument(storageMetadata != null, "metadata cannot be null");
        UploadTask uploadTask = new UploadTask(this, storageMetadata, uri, uri2);
        uploadTask.e();
        return uploadTask;
    }
}
