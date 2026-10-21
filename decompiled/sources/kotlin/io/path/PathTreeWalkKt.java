package kotlin.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kk.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib-jdk7"}, k = 2, mv = {1, 9, 0})
public final class PathTreeWalkKt {
    public static final boolean access$createsCycle(e eVar) {
        for (e parent = eVar.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getKey() == null || eVar.getKey() == null) {
                try {
                    if (Files.isSameFile(parent.getPath(), eVar.getPath())) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (Intrinsics.areEqual(parent.getKey(), eVar.getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final Object access$keyOf(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            Intrinsics.checkNotNullExpressionValue(attributes, "readAttributes(...)");
            return attributes.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }
}
