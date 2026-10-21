package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import v1.a;

/* JADX INFO: compiled from: CollectionPreviewParameterProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "values", "", "collection", "<init>", "(Ljava/util/Collection;)V", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0})
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Collection<T> f18290a;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(@NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f18290a = collection;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* synthetic */ int getCount() {
        return a.a(this);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public Sequence<T> getValues() {
        return CollectionsKt___CollectionsKt.asSequence(this.f18290a);
    }
}
