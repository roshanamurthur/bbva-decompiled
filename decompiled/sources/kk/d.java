package kk;

import com.esotericsoftware.kryo.serializers.g0;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileVisitorBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Function2<Path, BasicFileAttributes, FileVisitResult> f79342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function2<Path, BasicFileAttributes, FileVisitResult> f79343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Function2<Path, IOException, FileVisitResult> f79344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Function2<Path, IOException, FileVisitResult> f79345d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Nullable Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2, @Nullable Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function3, @Nullable Function2<? super Path, ? super IOException, ? extends FileVisitResult> function4, @Nullable Function2<? super Path, ? super IOException, ? extends FileVisitResult> function5) {
        this.f79342a = function2;
        this.f79343b = function3;
        this.f79344c = function4;
        this.f79345d = function5;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return postVisitDirectory(g0.d(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory(g0.d(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return visitFile(g0.d(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return visitFileFailed(g0.d(obj), iOException);
    }

    @NotNull
    public FileVisitResult postVisitDirectory(@NotNull Path dir, @Nullable IOException iOException) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Function2<Path, IOException, FileVisitResult> function2 = this.f79345d;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(dir, iOException)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(dir, iOException);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultPostVisitDirectory, "postVisitDirectory(...)");
        return fileVisitResultPostVisitDirectory;
    }

    @NotNull
    public FileVisitResult preVisitDirectory(@NotNull Path dir, @NotNull BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Function2<Path, BasicFileAttributes, FileVisitResult> function2 = this.f79342a;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(dir, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    @NotNull
    public FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Function2<Path, BasicFileAttributes, FileVisitResult> function2 = this.f79343b;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(file, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }

    @NotNull
    public FileVisitResult visitFileFailed(@NotNull Path file, @NotNull IOException exc) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(exc, "exc");
        Function2<Path, IOException, FileVisitResult> function2 = this.f79344c;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(file, exc)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(file, exc);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultVisitFileFailed, "visitFileFailed(...)");
        return fileVisitResultVisitFileFailed;
    }
}
