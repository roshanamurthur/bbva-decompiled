package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImmutableList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\bJ\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", ExifInterface.LONGITUDE_EAST, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "fromIndex", "toIndex", "subList", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, KMappedMarker {

    /* JADX INFO: compiled from: ImmutableList.kt */
    public static final class a<E> extends AbstractList<E> implements ImmutableList<E> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final ImmutableList<E> f14885p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f14886q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f14887r0;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull ImmutableList<? extends E> immutableList, int i10, int i11) {
            this.f14885p0 = immutableList;
            this.f14886q0 = i10;
            ListImplementation.checkRangeIndexes$runtime_release(i10, i11, immutableList.size());
            this.f14887r0 = i11 - i10;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final E get(int i10) {
            ListImplementation.checkElementIndex$runtime_release(i10, this.f14887r0);
            return this.f14885p0.get(this.f14886q0 + i10);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public final int getSize() {
            return this.f14887r0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        @NotNull
        public final ImmutableList<E> subList(int i10, int i11) {
            ListImplementation.checkRangeIndexes$runtime_release(i10, i11, this.f14887r0);
            int i12 = this.f14886q0;
            return new a(this.f14885p0, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    @NotNull
    ImmutableList<E> subList(int fromIndex, int toIndex);

    @Override // java.util.List
    /* bridge */ /* synthetic */ List subList(int i10, int i11);
}
