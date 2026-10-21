package com.google.firebase.storage.ktx;

import android.net.Uri;
import androidx.camera.camera2.interop.g;
import androidx.camera.core.processing.o;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.OnPausedListener;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StorageTaskScheduler;
import com.google.firebase.storage.StreamDownloadTask;
import com.google.firebase.storage.UploadTask;
import java.io.InputStream;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import ng.b;
import ng.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Storage.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015H\u0007\u001a\u0011\u0010\u0016\u001a\u00020\u0017*\u00060\u0018R\u00020\u0019H\u0087\u0002\u001a\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\u00020\u001cH\u0087\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u0017*\u00060\u001dR\u00020\u001eH\u0087\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u0017*\u00060\u001fR\u00020 H\u0087\u0002\u001a\u0011\u0010!\u001a\u00020\u0017*\u00060\u0018R\u00020\u0019H\u0087\u0002\u001a\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\u00020\u001cH\u0087\u0002\u001a\u0011\u0010!\u001a\u00020\u0017*\u00060\u001dR\u00020\u001eH\u0087\u0002\u001a\u0011\u0010!\u001a\u00020\u0017*\u00060\u001fR\u00020 H\u0087\u0002\u001a\u000f\u0010\"\u001a\u0004\u0018\u00010#*\u00020\u001cH\u0087\u0002\u001a\u0011\u0010\"\u001a\u00020$*\u00060\u001dR\u00020\u001eH\u0087\u0002\u001a\u0013\u0010\"\u001a\u0004\u0018\u00010\u0010*\u00060\u001fR\u00020 H\u0087\u0002\u001a\u0013\u0010%\u001a\u0004\u0018\u00010&*\u00060\u001fR\u00020 H\u0087\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010'\u001a\u00020(\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020#\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010)\u001a\u00020#\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"D\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0012\b\u0000\u0010\b*\f0\tR\b\u0012\u0004\u0012\u0002H\b0\n*\b\u0012\u0004\u0012\u0002H\b0\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006*"}, d2 = {"storage", "Lcom/google/firebase/storage/FirebaseStorage;", "Lcom/google/firebase/ktx/Firebase;", "getStorage", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/storage/FirebaseStorage;", "taskState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/firebase/storage/ktx/TaskState;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/firebase/storage/StorageTask$SnapshotBase;", "Lcom/google/firebase/storage/StorageTask;", "getTaskState$annotations", "(Lcom/google/firebase/storage/StorageTask;)V", "getTaskState", "(Lcom/google/firebase/storage/StorageTask;)Lkotlinx/coroutines/flow/Flow;", "storageMetadata", "Lcom/google/firebase/storage/StorageMetadata;", "init", "Lkotlin/Function1;", "Lcom/google/firebase/storage/StorageMetadata$Builder;", "", "Lkotlin/ExtensionFunctionType;", "component1", "", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "", "Lcom/google/firebase/storage/StorageReference;", "Lcom/google/firebase/storage/ListResult;", "Lcom/google/firebase/storage/StreamDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/StreamDownloadTask;", "Lcom/google/firebase/storage/UploadTask$TaskSnapshot;", "Lcom/google/firebase/storage/UploadTask;", "component2", "component3", "", "Ljava/io/InputStream;", "component4", "Landroid/net/Uri;", "app", "Lcom/google/firebase/FirebaseApp;", "url", "com.google.firebase-firebase-storage"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StorageKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Storage.kt */
    @DebugMetadata(c = "com.google.firebase.storage.ktx.StorageKt$taskState$1", f = "Storage.kt", i = {}, l = {ResultCode.ERROR_CONN_SSL_HANDSHAKE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<T> extends SuspendLambda implements Function2<ProducerScope<? super TaskState<T>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f49147p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f49148q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ StorageTask<T> f49149r0;

        /* JADX INFO: renamed from: com.google.firebase.storage.ktx.StorageKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Storage.kt */
        public static final class C0219a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ StorageTask<T> f49150p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ OnProgressListener<T> f49151q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ OnPausedListener<T> f49152r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ OnCompleteListener<T> f49153s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0219a(StorageTask storageTask, ng.a aVar, b bVar, c cVar) {
                super(0);
                this.f49150p0 = storageTask;
                this.f49151q0 = aVar;
                this.f49152r0 = bVar;
                this.f49153s0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                StorageTask<T> storageTask = this.f49150p0;
                storageTask.removeOnProgressListener(this.f49151q0);
                storageTask.removeOnPausedListener(this.f49152r0);
                storageTask.removeOnCompleteListener(this.f49153s0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StorageTask<T> storageTask, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f49149r0 = storageTask;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f49149r0, continuation);
            aVar.f49148q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create((ProducerScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.storage.OnProgressListener, ng.a] */
        /* JADX WARN: Type inference failed for: r3v0, types: [com.google.firebase.storage.OnPausedListener, ng.b] */
        /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.tasks.OnCompleteListener, ng.c] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f49147p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.f49148q0;
                ?? r1 = new OnProgressListener() { // from class: ng.a
                    @Override // com.google.firebase.storage.OnProgressListener
                    public final void onProgress(Object obj2) {
                        StorageTaskScheduler.getInstance().scheduleCallback(new o(producerScope, (StorageTask.SnapshotBase) obj2, 2));
                    }
                };
                ?? r3 = new OnPausedListener() { // from class: ng.b
                    @Override // com.google.firebase.storage.OnPausedListener
                    public final void onPaused(Object obj2) {
                        StorageTaskScheduler.getInstance().scheduleCallback(new g(producerScope, (StorageTask.SnapshotBase) obj2, 3));
                    }
                };
                ?? r4 = new OnCompleteListener() { // from class: ng.c
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        boolean zIsSuccessful = task.isSuccessful();
                        ProducerScope producerScope2 = producerScope;
                        if (zIsSuccessful) {
                            SendChannel.DefaultImpls.close$default(producerScope2, null, 1, null);
                        } else {
                            CoroutineScopeKt.cancel(producerScope2, "Error getting the TaskState", task.getException());
                        }
                    }
                };
                StorageTask<T> storageTask = this.f49149r0;
                storageTask.addOnProgressListener((OnProgressListener) r1);
                storageTask.addOnPausedListener((OnPausedListener) r3);
                storageTask.addOnCompleteListener((OnCompleteListener) r4);
                C0219a c0219a = new C0219a(storageTask, r1, r3, r4);
                this.f49147p0 = 1;
                if (ProduceKt.awaitClose(producerScope, c0219a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final long component1(@NotNull UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final long component2(@NotNull UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Nullable
    public static final StorageMetadata component3(@NotNull UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getMetadata();
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Nullable
    public static final Uri component4(@NotNull UploadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getUploadSessionUri();
    }

    @NotNull
    public static final FirebaseStorage getStorage(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance()");
        return firebaseStorage;
    }

    @NotNull
    public static final <T extends StorageTask<T>.SnapshotBase> Flow<TaskState<T>> getTaskState(@NotNull StorageTask<T> storageTask) {
        Intrinsics.checkNotNullParameter(storageTask, "<this>");
        return FlowKt.callbackFlow(new a(storageTask, null));
    }

    @NotNull
    public static final FirebaseStorage storage(@NotNull Firebase firebase, @NotNull String url) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(url);
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance(url)");
        return firebaseStorage;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public static final StorageMetadata storageMetadata(@NotNull Function1<? super StorageMetadata.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        StorageMetadata.Builder builder = new StorageMetadata.Builder();
        init.invoke(builder);
        StorageMetadata storageMetadataBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(storageMetadataBuild, "builder.build()");
        return storageMetadataBuild;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final long component1(@NotNull StreamDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final long component2(@NotNull StreamDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public static final InputStream component3(@NotNull StreamDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        InputStream stream = taskSnapshot.getStream();
        Intrinsics.checkNotNullExpressionValue(stream, "stream");
        return stream;
    }

    @NotNull
    public static final FirebaseStorage storage(@NotNull Firebase firebase, @NotNull FirebaseApp app) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(app);
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance(app)");
        return firebaseStorage;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final long component1(@NotNull FileDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getBytesTransferred();
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final long component2(@NotNull FileDownloadTask.TaskSnapshot taskSnapshot) {
        Intrinsics.checkNotNullParameter(taskSnapshot, "<this>");
        return taskSnapshot.getTotalByteCount();
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Nullable
    public static final String component3(@NotNull ListResult listResult) {
        Intrinsics.checkNotNullParameter(listResult, "<this>");
        return listResult.getPageToken();
    }

    @NotNull
    public static final FirebaseStorage storage(@NotNull Firebase firebase, @NotNull FirebaseApp app, @NotNull String url) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(url, "url");
        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance(app, url);
        Intrinsics.checkNotNullExpressionValue(firebaseStorage, "getInstance(app, url)");
        return firebaseStorage;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public static final List<StorageReference> component1(@NotNull ListResult listResult) {
        Intrinsics.checkNotNullParameter(listResult, "<this>");
        List<StorageReference> items = listResult.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "items");
        return items;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public static final List<StorageReference> component2(@NotNull ListResult listResult) {
        Intrinsics.checkNotNullParameter(listResult, "<this>");
        List<StorageReference> prefixes = listResult.getPrefixes();
        Intrinsics.checkNotNullExpressionValue(prefixes, "prefixes");
        return prefixes;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static /* synthetic */ void getTaskState$annotations(StorageTask storageTask) {
    }
}
