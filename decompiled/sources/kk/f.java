package kk;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lkk/f;", "", "Ljava/nio/file/Path;", "path", "base", "tryRelativeTo", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0})
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f79350a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Path f79351b = Paths.get("", new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Path f79352c = Paths.get("..", new String[0]);

    @NotNull
    public final Path tryRelativeTo(@NotNull Path path, @NotNull Path base) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        Path pathNormalize = base.normalize();
        Path pathNormalize2 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(pathNormalize2);
        int iMin = Math.min(pathNormalize.getNameCount(), pathNormalize2.getNameCount());
        for (int i10 = 0; i10 < iMin; i10++) {
            Path name = pathNormalize.getName(i10);
            Path path2 = f79352c;
            if (!Intrinsics.areEqual(name, path2)) {
                break;
            }
            if (!Intrinsics.areEqual(pathNormalize2.getName(i10), path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.areEqual(pathNormalize2, pathNormalize) || !Intrinsics.areEqual(pathNormalize, f79351b)) {
            String string = pathRelativize.toString();
            String separator = pathRelativize.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, "getSeparator(...)");
            pathNormalize2 = l.endsWith$default(string, separator, false, 2, null) ? pathRelativize.getFileSystem().getPath(StringsKt___StringsKt.dropLast(string, pathRelativize.getFileSystem().getSeparator().length()), new String[0]) : pathRelativize;
        }
        Intrinsics.checkNotNull(pathNormalize2);
        return pathNormalize2;
    }
}
