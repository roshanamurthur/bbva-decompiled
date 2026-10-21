package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: IndexBasedArrayIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H$¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H$J\t\u0010\n\u001a\u00020\tH\u0096\u0002J\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0007H\u0016¨\u0006\u0011"}, d2 = {"Landroidx/collection/IndexBasedArrayIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "", FirebaseAnalytics.Param.INDEX, "elementAt", "(I)Ljava/lang/Object;", "", "removeAt", "", "hasNext", "next", "()Ljava/lang/Object;", RemoveCommand.ID, "startingSize", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, KMutableIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f2373p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f2374q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f2375r0;

    public IndexBasedArrayIterator(int i10) {
        this.f2373p0 = i10;
    }

    public abstract T elementAt(int index);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2374q0 < this.f2373p0;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tElementAt = elementAt(this.f2374q0);
        this.f2374q0++;
        this.f2375r0 = true;
        return tElementAt;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f2375r0) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i10 = this.f2374q0 - 1;
        this.f2374q0 = i10;
        removeAt(i10);
        this.f2373p0--;
        this.f2375r0 = false;
    }

    public abstract void removeAt(int index);
}
