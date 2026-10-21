package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import bk.y;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H$J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0004¨\u0006\u000f"}, d2 = {"Lkotlin/collections/AbstractIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "computeNext", "value", "setNext", "(Ljava/lang/Object;)V", "done", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public y f79418p0 = y.NotReady;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public T f79419q0;

    /* JADX INFO: compiled from: AbstractIterator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abstract void computeNext();

    public final void done() {
        this.f79418p0 = y.Done;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        y yVar = this.f79418p0;
        y yVar2 = y.Failed;
        if (yVar == yVar2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[yVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            this.f79418p0 = yVar2;
            computeNext();
            if (this.f79418p0 != y.Ready) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f79418p0 = y.NotReady;
        return this.f79419q0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNext(T value) {
        this.f79419q0 = value;
        this.f79418p0 = y.Ready;
    }
}
