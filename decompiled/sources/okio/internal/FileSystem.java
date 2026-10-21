package okio.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import okio.BufferedSink;
import okio.FileMetadata;
import okio.Okio;
import okio.Path;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"collectRecursively", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "stack", "Lkotlin/collections/ArrayDeque;", "path", "followSymlinks", "", "postorder", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonCopy", "source", "target", "commonCreateDirectories", "dir", "mustCreate", "commonDeleteRecursively", "fileOrDirectory", "mustExist", "commonExists", "commonListRecursively", "Lkotlin/sequences/Sequence;", "commonMetadata", "Lokio/FileMetadata;", "symlinkTarget", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "-FileSystem")
@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"})
public final class FileSystem {

    /* JADX INFO: renamed from: okio.internal.-FileSystem$a */
    /* JADX INFO: compiled from: FileSystem.kt */
    @DebugMetadata(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {116, 135, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SequenceScope f86447p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public okio.FileSystem f86448q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public ArrayDeque f86449r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Path f86450s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Iterator f86451t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f86452u0;
        public boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public /* synthetic */ Object f86453w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f86454x0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f86453w0 = obj;
            this.f86454x0 |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$b */
    /* JADX INFO: compiled from: FileSystem.kt */
    @DebugMetadata(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f86455p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f86456q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ okio.FileSystem f86457r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Path f86458s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(okio.FileSystem fileSystem, Path path, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f86457r0 = fileSystem;
            this.f86458s0 = path;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f86457r0, this.f86458s0, continuation);
            bVar.f86456q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
            return ((b) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f86455p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope = (SequenceScope) this.f86456q0;
                okio.FileSystem fileSystem = this.f86457r0;
                ArrayDeque arrayDeque = new ArrayDeque();
                Path path = this.f86458s0;
                this.f86455p0 = 1;
                if (FileSystem.collectRecursively(sequenceScope, fileSystem, arrayDeque, path, false, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$c */
    /* JADX INFO: compiled from: FileSystem.kt */
    @DebugMetadata(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
    public static final class c extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ArrayDeque f86459p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator f86460q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f86461r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f86462s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Path f86463t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ okio.FileSystem f86464u0;
        public final /* synthetic */ boolean v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Path path, okio.FileSystem fileSystem, boolean z10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f86463t0 = path;
            this.f86464u0 = fileSystem;
            this.v0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f86463t0, this.f86464u0, this.v0, continuation);
            cVar.f86462s0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
            return ((c) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            ArrayDeque arrayDeque;
            Iterator<Path> it;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f86461r0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.f86462s0;
                ArrayDeque arrayDeque2 = new ArrayDeque();
                Path path = this.f86463t0;
                arrayDeque2.addLast(path);
                sequenceScope = sequenceScope2;
                arrayDeque = arrayDeque2;
                it = this.f86464u0.list(path).iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f86460q0;
                ArrayDeque arrayDeque3 = this.f86459p0;
                SequenceScope sequenceScope3 = (SequenceScope) this.f86462s0;
                ResultKt.throwOnFailure(obj);
                arrayDeque = arrayDeque3;
                sequenceScope = sequenceScope3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                okio.FileSystem fileSystem = this.f86464u0;
                boolean z10 = this.v0;
                this.f86462s0 = sequenceScope;
                this.f86459p0 = arrayDeque;
                this.f86460q0 = it;
                this.f86461r0 = 1;
                if (FileSystem.collectRecursively(sequenceScope, fileSystem, arrayDeque, next, z10, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d9 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:17:0x004d, B:48:0x00d3, B:50:0x00d9), top: B:67:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0115  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:48:0x00d3->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [kotlin.sequences.SequenceScope] */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.sequences.SequenceScope] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.sequences.SequenceScope, kotlin.sequences.SequenceScope<? super okio.Path>] */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.sequences.SequenceScope] */
    @Nullable
    public static final Object collectRecursively(@NotNull SequenceScope<? super Path> sequenceScope, @NotNull okio.FileSystem fileSystem, @NotNull ArrayDeque<Path> arrayDeque, @NotNull Path path, boolean z10, boolean z11, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        a aVar;
        okio.FileSystem fileSystem2;
        ArrayDeque<Path> arrayDeque2;
        boolean z12;
        ?? r11;
        boolean z13;
        okio.FileSystem fileSystem3;
        ArrayDeque<Path> arrayDeque3;
        Path path2;
        boolean z14;
        boolean z15;
        Iterator<Path> it;
        Path next;
        Path path3 = path;
        boolean z16 = z11;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f86454x0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f86454x0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f86453w0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f86454x0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (z16) {
                fileSystem2 = fileSystem;
                arrayDeque2 = arrayDeque;
                z12 = z10;
            } else {
                aVar.f86447p0 = sequenceScope;
                fileSystem2 = fileSystem;
                aVar.f86448q0 = fileSystem2;
                arrayDeque2 = arrayDeque;
                aVar.f86449r0 = arrayDeque2;
                aVar.f86450s0 = path3;
                z12 = z10;
                aVar.f86452u0 = z12;
                aVar.v0 = z16;
                aVar.f86454x0 = 1;
                if (sequenceScope.yield(path3, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            r11 = sequenceScope;
            z13 = z12;
            fileSystem3 = fileSystem2;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    z15 = aVar.v0;
                    z14 = aVar.f86452u0;
                    it = aVar.f86451t0;
                    path2 = aVar.f86450s0;
                    arrayDeque3 = aVar.f86449r0;
                    fileSystem3 = aVar.f86448q0;
                    SequenceScope sequenceScope2 = aVar.f86447p0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r11 = sequenceScope2;
                        while (it.hasNext()) {
                            next = it.next();
                            aVar.f86447p0 = r11;
                            aVar.f86448q0 = fileSystem3;
                            aVar.f86449r0 = arrayDeque3;
                            aVar.f86450s0 = path2;
                            aVar.f86451t0 = it;
                            aVar.f86452u0 = z14;
                            aVar.v0 = z15;
                            aVar.f86454x0 = 2;
                            if (collectRecursively(r11, fileSystem3, arrayDeque3, next, z14, z15, aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        arrayDeque3.removeLast();
                        z16 = z15;
                        path3 = path2;
                        if (z16) {
                            return Unit.INSTANCE;
                        }
                        aVar.f86447p0 = null;
                        aVar.f86448q0 = null;
                        aVar.f86449r0 = null;
                        aVar.f86450s0 = null;
                        aVar.f86451t0 = null;
                        aVar.f86454x0 = 3;
                        if (r11.yield(path3, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        arrayDeque3.removeLast();
                        throw th;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            boolean z17 = aVar.v0;
            boolean z18 = aVar.f86452u0;
            Path path4 = aVar.f86450s0;
            arrayDeque2 = aVar.f86449r0;
            fileSystem3 = aVar.f86448q0;
            SequenceScope sequenceScope3 = aVar.f86447p0;
            ResultKt.throwOnFailure(obj);
            z16 = z17;
            z13 = z18;
            path3 = path4;
            r11 = sequenceScope3;
        }
        List<Path> listListOrNull = fileSystem3.listOrNull(path3);
        if (listListOrNull == null) {
            listListOrNull = CollectionsKt__CollectionsKt.emptyList();
        }
        if (true ^ listListOrNull.isEmpty()) {
            int i12 = 0;
            Path path5 = path3;
            while (true) {
                if (z13 && arrayDeque2.contains(path5)) {
                    throw new IOException(androidx.core.graphics.b.c("symlink cycle at ", path3));
                }
                Path pathSymlinkTarget = symlinkTarget(fileSystem3, path5);
                if (pathSymlinkTarget != null) {
                    i12++;
                    path5 = pathSymlinkTarget;
                } else if (z13 || i12 == 0) {
                    arrayDeque2.addLast(path5);
                    try {
                        arrayDeque3 = arrayDeque2;
                        path2 = path3;
                        z14 = z13;
                        z15 = z16;
                        it = listListOrNull.iterator();
                        r11 = r11;
                        while (it.hasNext()) {
                            next = it.next();
                            aVar.f86447p0 = r11;
                            aVar.f86448q0 = fileSystem3;
                            aVar.f86449r0 = arrayDeque3;
                            aVar.f86450s0 = path2;
                            aVar.f86451t0 = it;
                            aVar.f86452u0 = z14;
                            aVar.v0 = z15;
                            aVar.f86454x0 = 2;
                            if (collectRecursively(r11, fileSystem3, arrayDeque3, next, z14, z15, aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        arrayDeque3.removeLast();
                        z16 = z15;
                        path3 = path2;
                    } catch (Throwable th3) {
                        th = th3;
                        arrayDeque3 = arrayDeque2;
                        arrayDeque3.removeLast();
                        throw th;
                    }
                }
            }
        }
        if (z16) {
            return Unit.INSTANCE;
        }
        aVar.f86447p0 = null;
        aVar.f86448q0 = null;
        aVar.f86449r0 = null;
        aVar.f86450s0 = null;
        aVar.f86451t0 = null;
        aVar.f86454x0 = 3;
        if (r11.yield(path3, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public static final void commonCopy(@NotNull okio.FileSystem fileSystem, @NotNull Path source, @NotNull Path target) throws IOException {
        Long lValueOf;
        Throwable th2;
        Long lValueOf2;
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Source source2 = fileSystem.source(source);
        Throwable th3 = null;
        try {
            BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(target));
            try {
                lValueOf2 = Long.valueOf(bufferedSinkBuffer.writeAll(source2));
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                th2 = null;
            } catch (Throwable th5) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th6) {
                        ak.b.addSuppressed(th5, th6);
                    }
                }
                th2 = th5;
                lValueOf2 = null;
            }
            if (th2 != null) {
                throw th2;
            }
            Intrinsics.checkNotNull(lValueOf2);
            lValueOf = Long.valueOf(lValueOf2.longValue());
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th7) {
                    th3 = th7;
                }
            }
            if (th3 != null) {
                throw th3;
            }
            Intrinsics.checkNotNull(lValueOf);
        } catch (Throwable th8) {
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th9) {
                    ak.b.addSuppressed(th8, th9);
                }
            }
            th3 = th8;
            lValueOf = null;
        }
    }

    public static final void commonCreateDirectories(@NotNull okio.FileSystem fileSystem, @NotNull Path dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            arrayDeque.addFirst(pathParent);
        }
        if (z10 && arrayDeque.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(@NotNull okio.FileSystem fileSystem, @NotNull Path fileOrDirectory, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator it = SequencesKt__SequenceBuilderKt.sequence(new b(fileSystem, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean commonExists(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    @NotNull
    public static final Sequence<Path> commonListRecursively(@NotNull okio.FileSystem fileSystem, @NotNull Path dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        return SequencesKt__SequenceBuilderKt.sequence(new c(dir, fileSystem, z10, null));
    }

    @NotNull
    public static final FileMetadata commonMetadata(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException(androidx.core.graphics.b.c("no such file: ", path));
    }

    @Nullable
    public static final Path symlinkTarget(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        Intrinsics.checkNotNull(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
