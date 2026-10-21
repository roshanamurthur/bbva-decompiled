package kotlin.io.path;

import com.adobe.marketing.mobile.EventDataKeys;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import kk.g;
import kk.h;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u000b"}, d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "", "iterator", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "Lkotlin/io/path/PathWalkOption;", "options", "<init>", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0})
@ExperimentalPathApi
public final class PathTreeWalk implements Sequence<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f79683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PathWalkOption[] f79684b;

    public PathTreeWalk(@NotNull Path start, @NotNull PathWalkOption[] options) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f79683a = start;
        this.f79684b = options;
    }

    public static final LinkOption[] access$getLinkOptions(PathTreeWalk pathTreeWalk) {
        pathTreeWalk.getClass();
        return LinkFollowing.INSTANCE.toLinkOptions(ArraysKt___ArraysKt.contains(pathTreeWalk.f79684b, PathWalkOption.FOLLOW_LINKS));
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<Path> iterator() {
        return ArraysKt___ArraysKt.contains(this.f79684b, PathWalkOption.BREADTH_FIRST) ? SequencesKt__SequenceBuilderKt.iterator(new g(this, null)) : SequencesKt__SequenceBuilderKt.iterator(new h(this, null));
    }
}
