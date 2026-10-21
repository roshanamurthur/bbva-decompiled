package kotlin.io.path;

import bk.v;
import bk.w;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lkotlin/io/path/LinkFollowing;", "", "", "followLinks", "", "Ljava/nio/file/LinkOption;", "toLinkOptions", "(Z)[Ljava/nio/file/LinkOption;", "", "Ljava/nio/file/FileVisitOption;", "toVisitOptions", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
public final class LinkFollowing {

    @NotNull
    public static final LinkFollowing INSTANCE = new LinkFollowing();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final LinkOption[] f79679a = {LinkOption.NOFOLLOW_LINKS};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final LinkOption[] f79680b = new LinkOption[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Set<FileVisitOption> f79681c = w.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Set<FileVisitOption> f79682d = v.setOf(FileVisitOption.FOLLOW_LINKS);

    @NotNull
    public final LinkOption[] toLinkOptions(boolean followLinks) {
        return followLinks ? f79680b : f79679a;
    }

    @NotNull
    public final Set<FileVisitOption> toVisitOptions(boolean followLinks) {
        return followLinks ? f79682d : f79681c;
    }
}
