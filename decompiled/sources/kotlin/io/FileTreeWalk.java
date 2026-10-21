package kotlin.io;

import androidx.collection.g;
import com.adobe.marketing.mobile.EventDataKeys;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B\u001b\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002J\u001a\u0010\b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005J\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0005J \u0010\r\u001a\u00020\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0019"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "", "iterator", "Lkotlin/Function1;", "", "function", "onEnter", "", "onLeave", "Lkotlin/Function2;", "Ljava/io/IOException;", "onFail", "", "depth", "maxDepth", EventDataKeys.Lifecycle.LIFECYCLE_START, "Lkotlin/io/FileWalkDirection;", "direction", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "a", "FileTreeWalkIterator", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class FileTreeWalk implements Sequence<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f79628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FileWalkDirection f79629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Function1<File, Boolean> f79630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Function1<File, Unit> f79631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Function2<File, IOException, Unit> f79632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f79633f;

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public final class FileTreeWalkIterator extends AbstractIterator<File> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final ArrayDeque<b> f79634r0;

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f79636b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public File[] f79637c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f79638d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f79639e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ FileTreeWalkIterator f79640f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f79640f = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.b
            @Nullable
            public File step() {
                boolean z10 = this.f79639e;
                FileTreeWalkIterator fileTreeWalkIterator = this.f79640f;
                if (!z10 && this.f79637c == null) {
                    Function1 function1 = FileTreeWalk.this.f79630c;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.f79637c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = FileTreeWalk.this.f79632e;
                        if (function2 != null) {
                            function2.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f79639e = true;
                    }
                }
                File[] fileArr = this.f79637c;
                if (fileArr != null) {
                    int i10 = this.f79638d;
                    Intrinsics.checkNotNull(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f79637c;
                        Intrinsics.checkNotNull(fileArr2);
                        int i11 = this.f79638d;
                        this.f79638d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f79636b) {
                    this.f79636b = true;
                    return getRoot();
                }
                Function1 function3 = FileTreeWalk.this.f79631d;
                if (function3 != null) {
                    function3.invoke(getRoot());
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @SourceDebugExtension({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        public final class b extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f79641b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            }

            @Override // kotlin.io.FileTreeWalk.b
            @Nullable
            public File step() {
                if (this.f79641b) {
                    return null;
                }
                this.f79641b = true;
                return getRoot();
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f79642b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public File[] f79643c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f79644d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FileTreeWalkIterator f79645e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f79645e = fileTreeWalkIterator;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.io.FileTreeWalk.b
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File step() {
                /*
                    r11 = this;
                    boolean r0 = r11.f79642b
                    r1 = 0
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r2 = r11.f79645e
                    if (r0 != 0) goto L28
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnEnter$p(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r11.getRoot()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r11.f79642b = r0
                    java.io.File r0 = r11.getRoot()
                    return r0
                L28:
                    java.io.File[] r0 = r11.f79643c
                    if (r0 == 0) goto L45
                    int r3 = r11.f79644d
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r3 >= r0) goto L35
                    goto L45
                L35:
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L44
                    java.io.File r2 = r11.getRoot()
                    r0.invoke(r2)
                L44:
                    return r1
                L45:
                    java.io.File[] r0 = r11.f79643c
                    if (r0 != 0) goto L8d
                    java.io.File r0 = r11.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r11.f79643c = r0
                    if (r0 != 0) goto L73
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function2 r0 = kotlin.io.FileTreeWalk.access$getOnFail$p(r0)
                    if (r0 == 0) goto L73
                    java.io.File r3 = r11.getRoot()
                    kotlin.io.AccessDeniedException r10 = new kotlin.io.AccessDeniedException
                    java.io.File r5 = r11.getRoot()
                    r6 = 0
                    java.lang.String r7 = "Cannot list files in a directory"
                    r8 = 2
                    r9 = 0
                    r4 = r10
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.invoke(r3, r10)
                L73:
                    java.io.File[] r0 = r11.f79643c
                    if (r0 == 0) goto L7d
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L8d
                L7d:
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L8c
                    java.io.File r2 = r11.getRoot()
                    r0.invoke(r2)
                L8c:
                    return r1
                L8d:
                    java.io.File[] r0 = r11.f79643c
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r1 = r11.f79644d
                    int r2 = r1 + 1
                    r11.f79644d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.FileTreeWalkIterator.c.step():java.io.File");
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque<b> arrayDeque = new ArrayDeque<>();
            this.f79634r0 = arrayDeque;
            if (FileTreeWalk.this.f79628a.isDirectory()) {
                arrayDeque.push(a(FileTreeWalk.this.f79628a));
            } else if (FileTreeWalk.this.f79628a.isFile()) {
                arrayDeque.push(new b(this, FileTreeWalk.this.f79628a));
            } else {
                done();
            }
        }

        public final a a(File file) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[FileTreeWalk.this.f79629b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.collections.AbstractIterator
        public final void computeNext() {
            File file;
            while (true) {
                ArrayDeque<b> arrayDeque = this.f79634r0;
                b bVarPeek = arrayDeque.peek();
                if (bVarPeek == null) {
                    file = null;
                    break;
                }
                File fileStep = bVarPeek.step();
                if (fileStep == null) {
                    arrayDeque.pop();
                } else {
                    if (Intrinsics.areEqual(fileStep, bVarPeek.getRoot()) || !fileStep.isDirectory() || arrayDeque.size() >= FileTreeWalk.this.f79633f) {
                        file = fileStep;
                        break;
                    }
                    arrayDeque.push(a(fileStep));
                }
            }
            if (file != null) {
                setNext(file);
            } else {
                done();
            }
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @SourceDebugExtension({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    public static abstract class a extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final File f79646a;

        public b(@NotNull File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f79646a = root;
        }

        @NotNull
        public final File getRoot() {
            return this.f79646a;
        }

        @Nullable
        public abstract File step();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function2, Function2<? super File, ? super IOException, Unit> function3, int i10) {
        this.f79628a = file;
        this.f79629b = fileWalkDirection;
        this.f79630c = function1;
        this.f79631d = function2;
        this.f79632e = function3;
        this.f79633f = i10;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<File> iterator() {
        return new FileTreeWalkIterator();
    }

    @NotNull
    public final FileTreeWalk maxDepth(int depth) {
        if (depth > 0) {
            return new FileTreeWalk(this.f79628a, this.f79629b, this.f79630c, this.f79631d, this.f79632e, depth);
        }
        throw new IllegalArgumentException(g.a("depth must be positive, but was ", depth, '.'));
    }

    @NotNull
    public final FileTreeWalk onEnter(@NotNull Function1<? super File, Boolean> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.f79628a, this.f79629b, function, this.f79631d, this.f79632e, this.f79633f);
    }

    @NotNull
    public final FileTreeWalk onFail(@NotNull Function2<? super File, ? super IOException, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.f79628a, this.f79629b, this.f79630c, this.f79631d, function, this.f79633f);
    }

    @NotNull
    public final FileTreeWalk onLeave(@NotNull Function1<? super File, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.f79628a, this.f79629b, this.f79630c, function, this.f79632e, this.f79633f);
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function2, function3, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(@NotNull File start, @NotNull FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}
