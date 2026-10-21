package kotlin.io.path;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kk.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileVisitorBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\f\u001a\u00020\u000b26\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002H\u0016J@\u0010\u000e\u001a\u00020\u000b26\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002H\u0016J@\u0010\u0011\u001a\u00020\u000b26\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\u0002H\u0016JB\u0010\u0012\u001a\u00020\u000b28\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\u0002H\u0016J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013¨\u0006\u0017"}, d2 = {"Lkotlin/io/path/FileVisitorBuilderImpl;", "Lkotlin/io/path/FileVisitorBuilder;", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/ParameterName;", "name", "directory", "Ljava/nio/file/attribute/BasicFileAttributes;", k.a.f65041h, "Ljava/nio/file/FileVisitResult;", "function", "", "onPreVisitDirectory", "file", "onVisitFile", "Ljava/io/IOException;", "exception", "onVisitFileFailed", "onPostVisitDirectory", "Ljava/nio/file/FileVisitor;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0})
@ExperimentalPathApi
public final class FileVisitorBuilderImpl implements FileVisitorBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f79674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f79675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function2<? super Path, ? super IOException, ? extends FileVisitResult> f79676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function2<? super Path, ? super IOException, ? extends FileVisitResult> f79677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79678e;

    public static void b(Function2 function2, String str) {
        if (function2 != null) {
            throw new IllegalStateException(str.concat(" was already defined"));
        }
    }

    public final void a() {
        if (this.f79678e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    @NotNull
    public final FileVisitor<Path> build() {
        a();
        this.f79678e = true;
        return new d(this.f79674a, this.f79675b, this.f79676c, this.f79677d);
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onPostVisitDirectory(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        a();
        b(this.f79677d, "onPostVisitDirectory");
        this.f79677d = function;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onPreVisitDirectory(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        a();
        b(this.f79674a, "onPreVisitDirectory");
        this.f79674a = function;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onVisitFile(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        a();
        b(this.f79675b, "onVisitFile");
        this.f79675b = function;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onVisitFileFailed(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        a();
        b(this.f79676c, "onVisitFileFailed");
        this.f79676c = function;
    }
}
