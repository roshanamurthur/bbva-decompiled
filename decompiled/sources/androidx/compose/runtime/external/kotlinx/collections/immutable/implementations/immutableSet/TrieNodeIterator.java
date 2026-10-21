package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistentHashSetIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\nJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", ExifInterface.LONGITUDE_EAST, "", "", "buffer", "", FirebaseAnalytics.Param.INDEX, "", "reset", "([Ljava/lang/Object;I)V", "", "hasNextCell", "moveToNextCell", "hasNextElement", "currentElement", "()Ljava/lang/Object;", "nextElement", "hasNextNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "currentNode", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class TrieNodeIterator<E> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Object[] f14977a = TrieNode.INSTANCE.getEMPTY$runtime_release().getBuffer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14978b;

    public static /* synthetic */ void reset$default(TrieNodeIterator trieNodeIterator, Object[] objArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        trieNodeIterator.reset(objArr, i10);
    }

    public final E currentElement() {
        CommonFunctionsKt.m2164assert(hasNextElement());
        return (E) this.f14977a[this.f14978b];
    }

    @NotNull
    public final TrieNode<? extends E> currentNode() {
        CommonFunctionsKt.m2164assert(hasNextNode());
        Object obj = this.f14977a[this.f14978b];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode) obj;
    }

    public final boolean hasNextCell() {
        return this.f14978b < this.f14977a.length;
    }

    public final boolean hasNextElement() {
        return hasNextCell() && !(this.f14977a[this.f14978b] instanceof TrieNode);
    }

    public final boolean hasNextNode() {
        return hasNextCell() && (this.f14977a[this.f14978b] instanceof TrieNode);
    }

    public final void moveToNextCell() {
        CommonFunctionsKt.m2164assert(hasNextCell());
        this.f14978b++;
    }

    public final E nextElement() {
        CommonFunctionsKt.m2164assert(hasNextElement());
        Object[] objArr = this.f14977a;
        int i10 = this.f14978b;
        this.f14978b = i10 + 1;
        return (E) objArr[i10];
    }

    public final void reset(@NotNull Object[] buffer, int index) {
        this.f14977a = buffer;
        this.f14978b = index;
    }
}
