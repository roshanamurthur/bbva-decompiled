package kk;

import com.esotericsoftware.kryo.serializers.f0;
import com.esotericsoftware.kryo.serializers.g0;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.io.path.LinkFollowing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
public final class b extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public e f79336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public ArrayDeque<e> f79337c = new ArrayDeque<>();

    public b(boolean z10) {
        this.f79335a = z10;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory(g0.d(obj), basicFileAttributes);
    }

    @NotNull
    public final List<e> readEntries(@NotNull e directoryNode) throws IOException {
        Intrinsics.checkNotNullParameter(directoryNode, "directoryNode");
        this.f79336b = directoryNode;
        Files.walkFileTree(directoryNode.getPath(), LinkFollowing.INSTANCE.toVisitOptions(this.f79335a), 1, f0.e(this));
        this.f79337c.removeFirst();
        ArrayDeque<e> arrayDeque = this.f79337c;
        this.f79337c = new ArrayDeque<>();
        return arrayDeque;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return visitFile(g0.d(obj), basicFileAttributes);
    }

    @NotNull
    public FileVisitResult preVisitDirectory(@NotNull Path dir, @NotNull BasicFileAttributes attrs) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f79337c.add(new e(dir, attrs.fileKey(), this.f79336b));
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    @NotNull
    public FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f79337c.add(new e(file, null, this.f79336b));
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }
}
