package kk;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.io.path.CopyActionContext;
import kotlin.io.path.CopyActionResult;
import kotlin.io.path.ExperimentalPathApi;
import kotlin.io.path.LinkFollowing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
@ExperimentalPathApi
public final class a implements CopyActionContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f79334a = new a();

    @Override // kotlin.io.path.CopyActionContext
    @NotNull
    public CopyActionResult copyToIgnoringExistingDirectory(@NotNull Path path, @NotNull Path target, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(z10);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !Files.isDirectory(target, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
            Intrinsics.checkNotNullExpressionValue(Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
        }
        return CopyActionResult.CONTINUE;
    }
}
