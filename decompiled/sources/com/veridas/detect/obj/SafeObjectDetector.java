package com.veridas.detect.obj;

import androidx.exifinterface.media.ExifInterface;
import com.veridas.detect.FinishDetectorException;
import com.veridas.detect.InitializeDetectorException;
import com.veridas.detect.Request;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001dB\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/veridas/detect/obj/SafeObjectDetector;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/veridas/detect/obj/ObjectDetector;", "", "isIntelligent", "finish", "initialize", "Lcom/veridas/detect/Request;", "request", "(Lcom/veridas/detect/Request;)Ljava/lang/Object;", "a", "Lcom/veridas/detect/obj/ObjectDetector;", "getDetector", "()Lcom/veridas/detect/obj/ObjectDetector;", "detector", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "", "c", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "lock", "<init>", "(Lcom/veridas/detect/obj/ObjectDetector;)V", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class SafeObjectDetector<T> implements ObjectDetector<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ObjectDetector<T> detector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean initialized;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: compiled from: ObjectDetector.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004¨\u0006\u0007"}, d2 = {"Lcom/veridas/detect/obj/SafeObjectDetector$Companion;", "", "()V", "wrap", "Lcom/veridas/detect/obj/ObjectDetector;", ExifInterface.GPS_DIRECTION_TRUE, "unsafeObjectDetector", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> ObjectDetector<T> wrap(@NotNull ObjectDetector<T> unsafeObjectDetector) {
            Intrinsics.checkNotNullParameter(unsafeObjectDetector, "unsafeObjectDetector");
            return new SafeObjectDetector(unsafeObjectDetector);
        }
    }

    public SafeObjectDetector(@NotNull ObjectDetector<T> detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.detector = detector;
        this.initialized = new AtomicBoolean(false);
        this.lock = new Object();
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    public boolean finish() {
        boolean zFinish;
        synchronized (this.lock) {
            if (!this.initialized.compareAndSet(true, false)) {
                throw new FinishDetectorException("This detector has not been initialized yet.");
            }
            zFinish = this.detector.finish();
        }
        return zFinish;
    }

    @NotNull
    public final ObjectDetector<T> getDetector() {
        return this.detector;
    }

    @NotNull
    public final AtomicBoolean getInitialized() {
        return this.initialized;
    }

    @NotNull
    public final Object getLock() {
        return this.lock;
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    public boolean initialize() {
        boolean zInitialize;
        synchronized (this.lock) {
            if (!this.initialized.compareAndSet(false, true)) {
                throw new InitializeDetectorException("This detector has already been initialized.");
            }
            zInitialize = this.detector.initialize();
        }
        return zInitialize;
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    /* JADX INFO: renamed from: isIntelligent */
    public boolean getF66779a() {
        boolean f66779a;
        synchronized (this.lock) {
            f66779a = this.detector.getF66779a();
        }
        return f66779a;
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    public T request(@NotNull Request request) {
        T tRequest;
        Intrinsics.checkNotNullParameter(request, "request");
        synchronized (this.lock) {
            if (!this.initialized.get()) {
                throw new IllegalStateException("This detector has not been initialized yet.".toString());
            }
            tRequest = this.detector.request(request);
        }
        return tRequest;
    }
}
