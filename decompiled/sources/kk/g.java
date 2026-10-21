package kk;

import java.nio.file.Path;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.io.path.PathTreeWalk;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes12.dex */
@DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {184, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
public final class g extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayDeque f79353p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public b f79354q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public e f79355r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public PathTreeWalk f79356s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Object f79357t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f79358u0;
    public /* synthetic */ Object v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ PathTreeWalk f79359w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PathTreeWalk pathTreeWalk, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f79359w0 = pathTreeWalk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        g gVar = new g(this.f79359w0, continuation);
        gVar.v0 = obj;
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0075  */
    /* JADX WARN: Code duplicated, block: B:17:0x009f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c8 A[PHI: r1 r5 r6 r7 r8 r9 r14
      0x00c8: PHI (r1v3 kk.b) = (r1v5 kk.b), (r1v6 kk.b) binds: [B:23:0x00c1, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r5v2 kotlin.collections.ArrayDeque) = (r5v4 kotlin.collections.ArrayDeque), (r5v5 kotlin.collections.ArrayDeque) binds: [B:23:0x00c1, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r6v4 kotlin.sequences.SequenceScope) = (r6v6 kotlin.sequences.SequenceScope), (r6v7 kotlin.sequences.SequenceScope) binds: [B:23:0x00c1, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r7v2 kk.e) = (r7v6 kk.e), (r7v10 kk.e) binds: [B:23:0x00c1, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r8v1 java.nio.file.Path) = (r8v4 java.nio.file.Path), (r8v5 java.nio.file.Path) binds: [B:23:0x00c1, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r9v1 kotlin.io.path.PathTreeWalk) = (r9v8 kotlin.io.path.PathTreeWalk), (r9v9 kotlin.io.path.PathTreeWalk) binds: [B:23:0x00c1, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r14v4 kk.g) = (r14v5 kk.g), (r14v6 kk.g) binds: [B:23:0x00c1, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x006e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00de -> B:11:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e0 -> B:11:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x009f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super Path> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((g) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
