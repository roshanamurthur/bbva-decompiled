package com.google.firebase.storage.ktx;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TaskState.kt */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/storage/ktx/TaskState;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "InProgress", "Paused", "com.google.firebase-firebase-storage"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TaskState<T> {

    /* JADX INFO: compiled from: TaskState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/google/firebase/storage/ktx/TaskState$InProgress;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/firebase/storage/ktx/TaskState;", "a", "Ljava/lang/Object;", "getSnapshot", "()Ljava/lang/Object;", "snapshot", "<init>", "(Ljava/lang/Object;)V", "com.google.firebase-firebase-storage"}, k = 1, mv = {1, 8, 0})
    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class InProgress<T> extends TaskState<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final T snapshot;

        public InProgress(T t10) {
            super(null);
            this.snapshot = t10;
        }

        public final T getSnapshot() {
            return this.snapshot;
        }
    }

    /* JADX INFO: compiled from: TaskState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/google/firebase/storage/ktx/TaskState$Paused;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/firebase/storage/ktx/TaskState;", "a", "Ljava/lang/Object;", "getSnapshot", "()Ljava/lang/Object;", "snapshot", "<init>", "(Ljava/lang/Object;)V", "com.google.firebase-firebase-storage"}, k = 1, mv = {1, 8, 0})
    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class Paused<T> extends TaskState<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final T snapshot;

        public Paused(T t10) {
            super(null);
            this.snapshot = t10;
        }

        public final T getSnapshot() {
            return this.snapshot;
        }
    }

    public /* synthetic */ TaskState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public TaskState() {
    }
}
