package kotlin.io.path;

import androidx.core.app.f;
import androidx.core.app.g;
import com.esotericsoftware.kryo.serializers.d0;
import com.esotericsoftware.kryo.serializers.g0;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kk.i;
import kk.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n346#1,2:434\n354#1:436\n354#1:437\n348#1,4:438\n346#1,2:442\n354#1:444\n348#1,4:445\n354#1:449\n346#1,6:450\n346#1,2:456\n354#1:458\n348#1,4:459\n1#2:431\n1855#3,2:432\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n362#1:434,2\n371#1:436\n374#1:437\n362#1:438,4\n382#1:442,2\n383#1:444\n382#1:445,4\n394#1:449\n402#1:450,6\n420#1:456,2\n421#1:458\n420#1:459,4\n284#1:432,2\n*E\n"})
public class PathsKt__PathRecursiveFunctionsKt extends i {

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    public static final class a extends Lambda implements Function3 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f79685p0 = new a(3);

        public a() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(g0.d(obj), g0.d(obj2), (Exception) obj3);
        }

        @NotNull
        public final Void invoke(@NotNull Path path, @NotNull Path path2, @NotNull Exception exception) throws Exception {
            Intrinsics.checkNotNullParameter(path, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(path2, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(exception, "exception");
            throw exception;
        }
    }

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    public static final class b extends Lambda implements Function3<CopyActionContext, Path, Path, CopyActionResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f79686p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10) {
            super(3);
            this.f79686p0 = z10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ CopyActionResult invoke(CopyActionContext copyActionContext, Path path, Path path2) {
            return invoke2(copyActionContext, g0.d(path), g0.d(path2));
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CopyActionResult invoke2(@NotNull CopyActionContext copyToRecursively, @NotNull Path src, @NotNull Path dst) throws FileSystemException {
            Intrinsics.checkNotNullParameter(copyToRecursively, "$this$copyToRecursively");
            Intrinsics.checkNotNullParameter(src, "src");
            Intrinsics.checkNotNullParameter(dst, "dst");
            LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(this.f79686p0);
            boolean zIsDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
            if (!Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !zIsDirectory) {
                if (zIsDirectory) {
                    PathsKt__PathRecursiveFunctionsKt.deleteRecursively(dst);
                }
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.addSpread(linkOptions);
                spreadBuilder.add(StandardCopyOption.REPLACE_EXISTING);
                CopyOption[] copyOptionArr = (CopyOption[]) spreadBuilder.toArray(new CopyOption[spreadBuilder.size()]);
                Intrinsics.checkNotNullExpressionValue(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
            }
            return CopyActionResult.CONTINUE;
        }
    }

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    public static final class c extends Lambda implements Function3 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f79687p0 = new c(3);

        public c() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(g0.d(obj), g0.d(obj2), (Exception) obj3);
        }

        @NotNull
        public final Void invoke(@NotNull Path path, @NotNull Path path2, @NotNull Exception exception) throws Exception {
            Intrinsics.checkNotNullParameter(path, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(path2, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(exception, "exception");
            throw exception;
        }
    }

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    public static final class d extends Lambda implements Function3<CopyActionContext, Path, Path, CopyActionResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f79688p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10) {
            super(3);
            this.f79688p0 = z10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ CopyActionResult invoke(CopyActionContext copyActionContext, Path path, Path path2) {
            return invoke2(copyActionContext, g0.d(path), g0.d(path2));
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CopyActionResult invoke2(@NotNull CopyActionContext copyActionContext, @NotNull Path src, @NotNull Path dst) {
            Intrinsics.checkNotNullParameter(copyActionContext, "$this$null");
            Intrinsics.checkNotNullParameter(src, "src");
            Intrinsics.checkNotNullParameter(dst, "dst");
            return copyActionContext.copyToIgnoringExistingDirectory(src, dst, this.f79688p0);
        }
    }

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    public static final class e extends Lambda implements Function1<FileVisitorBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> f79689p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Path f79690q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Path f79691r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> f79692s0;

        /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
        public /* synthetic */ class a extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> f79693p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Path f79694q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Path f79695r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> f79696s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function4) {
                super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.f79693p0 = function3;
                this.f79694q0 = path;
                this.f79695r0 = path2;
                this.f79696s0 = function4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
                return invoke2(g0.d(path), androidx.core.graphics.d.e(basicFileAttributes));
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final FileVisitResult invoke2(@NotNull Path p4, @NotNull BasicFileAttributes p10) {
                Intrinsics.checkNotNullParameter(p4, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                return PathsKt__PathRecursiveFunctionsKt.access$copyToRecursively$copy(this.f79693p0, this.f79694q0, this.f79695r0, this.f79696s0, p4, p10);
            }
        }

        /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
        public /* synthetic */ class b extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> f79697p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Path f79698q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Path f79699r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> f79700s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function4) {
                super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.f79697p0 = function3;
                this.f79698q0 = path;
                this.f79699r0 = path2;
                this.f79700s0 = function4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
                return invoke2(g0.d(path), androidx.core.graphics.d.e(basicFileAttributes));
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final FileVisitResult invoke2(@NotNull Path p4, @NotNull BasicFileAttributes p10) {
                Intrinsics.checkNotNullParameter(p4, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                return PathsKt__PathRecursiveFunctionsKt.access$copyToRecursively$copy(this.f79697p0, this.f79698q0, this.f79699r0, this.f79700s0, p4, p10);
            }
        }

        /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
        public /* synthetic */ class c extends FunctionReferenceImpl implements Function2<Path, Exception, FileVisitResult> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> f79701p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Path f79702q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Path f79703r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2) {
                super(2, Intrinsics.Kotlin.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                this.f79701p0 = function3;
                this.f79702q0 = path;
                this.f79703r0 = path2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, Exception exc) {
                return invoke2(g0.d(path), exc);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final FileVisitResult invoke2(@NotNull Path p4, @NotNull Exception p10) {
                Intrinsics.checkNotNullParameter(p4, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                return PathsKt__PathRecursiveFunctionsKt.a(this.f79701p0, this.f79702q0, this.f79703r0, p4, p10);
            }
        }

        /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
        public static final class d extends Lambda implements Function2<Path, IOException, FileVisitResult> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> f79704p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Path f79705q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Path f79706r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2) {
                super(2);
                this.f79704p0 = function3;
                this.f79705q0 = path;
                this.f79706r0 = path2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, IOException iOException) {
                return invoke2(g0.d(path), iOException);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final FileVisitResult invoke2(@NotNull Path directory, @Nullable IOException iOException) {
                Intrinsics.checkNotNullParameter(directory, "directory");
                if (iOException == null) {
                    return FileVisitResult.CONTINUE;
                }
                return PathsKt__PathRecursiveFunctionsKt.a(this.f79704p0, this.f79705q0, this.f79706r0, directory, iOException);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function4) {
            super(1);
            this.f79689p0 = function3;
            this.f79690q0 = path;
            this.f79691r0 = path2;
            this.f79692s0 = function4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FileVisitorBuilder fileVisitorBuilder) {
            invoke2(fileVisitorBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull FileVisitorBuilder visitFileTree) {
            Intrinsics.checkNotNullParameter(visitFileTree, "$this$visitFileTree");
            Function3<CopyActionContext, Path, Path, CopyActionResult> function3 = this.f79689p0;
            Path path = this.f79690q0;
            Path path2 = this.f79691r0;
            Function3<Path, Path, Exception, OnErrorResult> function4 = this.f79692s0;
            visitFileTree.onPreVisitDirectory(new a(function3, path, path2, function4));
            visitFileTree.onVisitFile(new b(function3, path, path2, function4));
            visitFileTree.onVisitFileFailed(new c(function4, path, path2));
            visitFileTree.onPostVisitDirectory(new d(function4, path, path2));
        }
    }

    public static final FileVisitResult a(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2, Path path3, Exception exc) {
        Path pathResolve = path2.resolve(j.relativeTo(path3, path).toString());
        Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        int i10 = WhenMappings.$EnumSwitchMapping$1[function3.invoke(path3, pathResolve, exc).ordinal()];
        if (i10 == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i10 == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final FileVisitResult access$copyToRecursively$copy(Function3 function3, Path path, Path path2, Function3 function4, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            kk.a aVar = kk.a.f79334a;
            Path pathResolve = path2.resolve(j.relativeTo(path3, path).toString());
            Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
            int i10 = WhenMappings.$EnumSwitchMapping$0[((CopyActionResult) function3.invoke(aVar, path3, pathResolve)).ordinal()];
            if (i10 == 1) {
                return FileVisitResult.CONTINUE;
            }
            if (i10 == 2) {
                return FileVisitResult.TERMINATE;
            }
            if (i10 == 3) {
                return FileVisitResult.SKIP_SUBTREE;
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e5) {
            return a(function4, path, path2, path3, e5);
        }
    }

    public static final void b(SecureDirectoryStream<Path> secureDirectoryStream, Path path, kk.c cVar) {
        SecureDirectoryStream<Path> secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e5) {
                cVar.collect(e5);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStreamNewDirectoryStream = null;
        }
        if (secureDirectoryStreamNewDirectoryStream != null) {
            try {
                Iterator<Path> it = secureDirectoryStreamNewDirectoryStream.iterator();
                while (it.hasNext()) {
                    Path fileName = it.next().getFileName();
                    Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                    c(secureDirectoryStreamNewDirectoryStream, fileName, cVar);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(secureDirectoryStreamNewDirectoryStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(secureDirectoryStreamNewDirectoryStream, th2);
                    throw th3;
                }
            }
        }
    }

    public static final void c(SecureDirectoryStream<Path> secureDirectoryStream, Path path, kk.c cVar) {
        Boolean boolValueOf;
        cVar.enterEntry(path);
        try {
            try {
                boolValueOf = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))).readAttributes().isDirectory());
            } catch (NoSuchFileException unused) {
                boolValueOf = null;
            }
            try {
                if (boolValueOf != null && boolValueOf.booleanValue()) {
                    int totalExceptions = cVar.getTotalExceptions();
                    b(secureDirectoryStream, path, cVar);
                    if (totalExceptions == cVar.getTotalExceptions()) {
                        secureDirectoryStream.deleteDirectory(path);
                        Unit unit = Unit.INSTANCE;
                    }
                    cVar.exitEntry(path);
                }
                secureDirectoryStream.deleteFile(path);
                Unit unit2 = Unit.INSTANCE;
            } catch (NoSuchFileException unused2) {
            }
        } catch (Exception e5) {
            cVar.collect(e5);
        }
        cVar.exitEntry(path);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    @NotNull
    public static final Path copyToRecursively(@NotNull Path path, @NotNull Path target, @NotNull Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return z11 ? copyToRecursively(path, target, onError, z10, new b(z10)) : copyToRecursively$default(path, target, onError, z10, (Function3) null, 8, (Object) null);
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function3 = a.f79685p0;
        }
        return copyToRecursively(path, path2, (Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult>) function3, z10, z11);
    }

    public static final void d(Path path, kk.c cVar) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        try {
            if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                Files.deleteIfExists(path);
                return;
            }
            int totalExceptions = cVar.getTotalExceptions();
            try {
                try {
                    directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
                } catch (Exception e5) {
                    cVar.collect(e5);
                }
            } catch (NoSuchFileException unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    for (Path path2 : directoryStreamNewDirectoryStream) {
                        Intrinsics.checkNotNull(path2);
                        d(path2, cVar);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th2);
                        throw th3;
                    }
                }
            }
            if (totalExceptions == cVar.getTotalExceptions()) {
                Files.deleteIfExists(path);
            }
        } catch (Exception e7) {
            cVar.collect(e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final void deleteRecursively(@NotNull Path path) throws FileSystemException {
        DirectoryStream directoryStreamNewDirectoryStream;
        Intrinsics.checkNotNullParameter(path, "<this>");
        boolean z10 = false;
        kk.c cVar = new kk.c(0, 1, null);
        Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    DirectoryStream directoryStreamE = androidx.core.app.e.e(directoryStreamNewDirectoryStream);
                    if (f.h(directoryStreamE)) {
                        cVar.setPath(parent);
                        SecureDirectoryStream secureDirectoryStreamD = g.d(directoryStreamE);
                        Path fileName = path.getFileName();
                        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                        c(secureDirectoryStreamD, fileName, cVar);
                    } else {
                        z10 = true;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
                    if (z10) {
                        d(path, cVar);
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th2);
                        throw th3;
                    }
                }
            } else {
                d(path, cVar);
            }
        } else {
            d(path, cVar);
        }
        List<Exception> collectedExceptions = cVar.getCollectedExceptions();
        if (!collectedExceptions.isEmpty()) {
            FileSystemException fileSystemExceptionD = androidx.core.app.i.d();
            Iterator<T> it = collectedExceptions.iterator();
            while (it.hasNext()) {
                ak.b.addSuppressed(fileSystemExceptionD, (Exception) it.next());
            }
            throw fileSystemExceptionD;
        }
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    @NotNull
    public static final Path copyToRecursively(@NotNull Path path, @NotNull Path target, @NotNull Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean z10, @NotNull Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> copyAction) throws IOException {
        Path parent;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(copyAction, "copyAction");
        LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(z10);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (!Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            throw androidx.core.graphics.c.e(path.toString(), target.toString());
        }
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z10 || !Files.isSymbolicLink(path))) {
            boolean z11 = Files.exists(target, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(target);
            if ((!z11 || !Files.isSameFile(path, target)) && Intrinsics.areEqual(path.getFileSystem(), target.getFileSystem()) && (!z11 ? !((parent = target.getParent()) == null || !Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) || !parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) : target.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0])))) {
                throw d0.e(path.toString(), target.toString());
            }
        }
        j.visitFileTree$default(path, 0, z10, new e(copyAction, path, target, onError), 1, (Object) null);
        return target;
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, boolean z10, Function3 function4, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function3 = c.f79687p0;
        }
        if ((i10 & 8) != 0) {
            function4 = new d(z10);
        }
        return copyToRecursively(path, path2, (Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult>) function3, z10, (Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult>) function4);
    }
}
