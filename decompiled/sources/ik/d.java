package ik;

import java.io.File;
import kotlin.io.FileTreeWalk;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes12.dex */
public class d extends c {
    @NotNull
    public static final FileTreeWalk walk(@NotNull File file, @NotNull FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new FileTreeWalk(file, direction);
    }

    public static /* synthetic */ FileTreeWalk walk$default(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return walk(file, fileWalkDirection);
    }

    @NotNull
    public static final FileTreeWalk walkBottomUp(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return walk(file, FileWalkDirection.BOTTOM_UP);
    }

    @NotNull
    public static final FileTreeWalk walkTopDown(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return walk(file, FileWalkDirection.TOP_DOWN);
    }
}
