package kk;

import androidx.webkit.ProxyConfig;
import bk.v;
import bk.w;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.InlineOnly;
import kotlin.io.CloseableKt;
import kotlin.io.path.ExperimentalPathApi;
import kotlin.io.path.FileVisitorBuilder;
import kotlin.io.path.FileVisitorBuilderImpl;
import kotlin.io.path.PathTreeWalk;
import kotlin.io.path.PathWalkOption;
import kotlin.io.path.PathsKt__PathRecursiveFunctionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1174:1\n26#2:1175\n26#2:1179\n1#3:1176\n1855#4,2:1177\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1175\n616#1:1179\n440#1:1177,2\n*E\n"})
public class j extends PathsKt__PathRecursiveFunctionsKt {
    @SinceKotlin(version = "1.9")
    @NotNull
    public static final Path createParentDirectories(@NotNull Path path, @NotNull FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr = (FileAttribute[]) Arrays.copyOf(attributes, attributes.length);
                Intrinsics.checkNotNullExpressionValue(Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length)), "createDirectories(...)");
            } catch (FileAlreadyExistsException e5) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e5;
                }
            }
        }
        return path;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @NotNull
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Path createTempDirectory(@Nullable Path path, @Nullable String str, @NotNull FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
            return pathCreateTempDirectory;
        }
        Path pathCreateTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory2, "createTempDirectory(...)");
        return pathCreateTempDirectory2;
    }

    public static /* synthetic */ Path createTempDirectory$default(Path path, String str, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return createTempDirectory(path, str, fileAttributeArr);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @NotNull
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Path createTempFile(@Nullable Path path, @Nullable String str, @Nullable String str2, @NotNull FileAttribute<?>... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
            return pathCreateTempFile;
        }
        Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(pathCreateTempFile2, "createTempFile(...)");
        return pathCreateTempFile2;
    }

    public static /* synthetic */ Path createTempFile$default(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return createTempFile(path, str, str2, fileAttributeArr);
    }

    @PublishedApi
    @NotNull
    public static final Void fileAttributeViewNotAvailable(@NotNull Path path, @NotNull Class<?> attributeViewClass) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    @NotNull
    public static final FileVisitor<Path> fileVisitor(@NotNull Function1<? super FileVisitorBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        FileVisitorBuilderImpl fileVisitorBuilderImpl = new FileVisitorBuilderImpl();
        builderAction.invoke(fileVisitorBuilderImpl);
        return fileVisitorBuilderImpl.build();
    }

    @NotNull
    public static final String getExtension(@NotNull Path path) {
        String string;
        String strSubstringAfterLast;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(string, '.', "")) == null) ? "" : strSubstringAfterLast;
    }

    @NotNull
    public static final String getInvariantSeparatorsPathString(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (Intrinsics.areEqual(separator, "/")) {
            return path.toString();
        }
        String string = path.toString();
        Intrinsics.checkNotNull(separator);
        return l.replace$default(string, separator, "/", false, 4, (Object) null);
    }

    @NotNull
    public static final String getName(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    @NotNull
    public static final String getNameWithoutExtension(@NotNull Path path) {
        String string;
        String strSubstringBeforeLast$default;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(string, Constant.DOT_STRING, (String) null, 2, (Object) null)) == null) ? "" : strSubstringBeforeLast$default;
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @NotNull
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final List<Path> listDirectoryEntries(@NotNull Path path, @NotNull String glob) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamE = androidx.core.app.e.e(directoryStreamNewDirectoryStream);
            Intrinsics.checkNotNull(directoryStreamE);
            List<Path> list = CollectionsKt___CollectionsKt.toList(directoryStreamE);
            CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            return list;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ List listDirectoryEntries$default(Path path, String str, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        return listDirectoryEntries(path, str);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @NotNull
    public static final Path relativeTo(@NotNull Path path, @NotNull Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            return f.f79350a.tryRelativeTo(path, base);
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException(e5.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e5);
        }
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @Nullable
    public static final Path relativeToOrNull(@NotNull Path path, @NotNull Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            return f.f79350a.tryRelativeTo(path, base);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @NotNull
    public static final Path relativeToOrSelf(@NotNull Path path, @NotNull Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        Path pathRelativeToOrNull = relativeToOrNull(path, base);
        return pathRelativeToOrNull == null ? path : pathRelativeToOrNull;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    public static final void visitFileTree(@NotNull Path path, @NotNull FileVisitor<Path> visitor, int i10, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Files.walkFileTree(path, z10 ? v.setOf(FileVisitOption.FOLLOW_LINKS) : w.emptySet(), i10, visitor);
    }

    public static /* synthetic */ void visitFileTree$default(Path path, FileVisitor fileVisitor, int i10, boolean z10, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        visitFileTree(path, (FileVisitor<Path>) fileVisitor, i10, z10);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    @NotNull
    public static final Sequence<Path> walk(@NotNull Path path, @NotNull PathWalkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return new PathTreeWalk(path, options);
    }

    public static /* synthetic */ void visitFileTree$default(Path path, int i10, boolean z10, Function1 function1, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        visitFileTree(path, i10, z10, (Function1<? super FileVisitorBuilder, Unit>) function1);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    public static final void visitFileTree(@NotNull Path path, int i10, boolean z10, @NotNull Function1<? super FileVisitorBuilder, Unit> builderAction) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        visitFileTree(path, fileVisitor(builderAction), i10, z10);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void getExtension$annotations(Path path) {
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    @ExperimentalPathApi
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(Path path) {
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(Path path) {
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void getName$annotations(Path path) {
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void getNameWithoutExtension$annotations(Path path) {
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    public static /* synthetic */ void getPathString$annotations(Path path) {
    }
}
