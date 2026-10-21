package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.web.constant.NavigationOperations;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WeakCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/WeakCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "element", "", "push", "(Ljava/lang/Object;)V", NavigationOperations.POP, "()Ljava/lang/Object;", "", "getSize", "()I", "size", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWeakCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,76:1\n1182#2:77\n1161#2,2:78\n728#3,2:80\n48#3:82\n*S KotlinDebug\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:77\n29#1:78,2\n38#1:80,2\n49#1:82\n*E\n"})
public final class WeakCache<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableVector<Reference<T>> f17336a = new MutableVector<>(new Reference[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ReferenceQueue<T> f17337b = new ReferenceQueue<>();

    public final int getSize() {
        Reference<? extends T> referencePoll;
        MutableVector<Reference<T>> mutableVector;
        do {
            referencePoll = this.f17337b.poll();
            mutableVector = this.f17336a;
            if (referencePoll != null) {
                mutableVector.remove(referencePoll);
            }
        } while (referencePoll != null);
        return mutableVector.getSize();
    }

    @Nullable
    public final T pop() {
        Reference<? extends T> referencePoll;
        MutableVector<Reference<T>> mutableVector;
        do {
            referencePoll = this.f17337b.poll();
            mutableVector = this.f17336a;
            if (referencePoll != null) {
                mutableVector.remove(referencePoll);
            }
        } while (referencePoll != null);
        while (mutableVector.isNotEmpty()) {
            T t10 = (T) ((Reference) androidx.constraintlayout.core.parser.a.a(mutableVector, 1)).get();
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public final void push(T element) {
        ReferenceQueue<T> referenceQueue;
        Reference<? extends T> referencePoll;
        MutableVector<Reference<T>> mutableVector;
        do {
            referenceQueue = this.f17337b;
            referencePoll = referenceQueue.poll();
            mutableVector = this.f17336a;
            if (referencePoll != null) {
                mutableVector.remove(referencePoll);
            }
        } while (referencePoll != null);
        mutableVector.add(new WeakReference(element, referenceQueue));
    }
}
