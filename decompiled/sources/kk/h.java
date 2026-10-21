package kk;

import com.esotericsoftware.asm.Opcodes;
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
@DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, 190, Opcodes.IFNONNULL, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
public final class h extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayDeque f79360p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public b f79361q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public e f79362r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public PathTreeWalk f79363s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Object f79364t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f79365u0;
    public /* synthetic */ Object v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ PathTreeWalk f79366w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PathTreeWalk pathTreeWalk, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f79366w0 = pathTreeWalk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        h hVar = new h(this.f79366w0, continuation);
        hVar.v0 = obj;
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0133  */
    /* JADX WARN: Code duplicated, block: B:44:0x0170  */
    /* JADX WARN: Code duplicated, block: B:46:0x0176  */
    /* JADX WARN: Code duplicated, block: B:48:0x018a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x018b  */
    /* JADX WARN: Code duplicated, block: B:51:0x019d A[PHI: r2 r6 r9 r10 r11 r12 r13
      0x019d: PHI (r2v14 kk.b) = (r2v11 kk.b), (r2v16 kk.b) binds: [B:45:0x0174, B:50:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r6v19 kotlin.collections.ArrayDeque) = (r6v17 kotlin.collections.ArrayDeque), (r6v21 kotlin.collections.ArrayDeque) binds: [B:45:0x0174, B:50:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r9v10 kotlin.sequences.SequenceScope) = (r9v8 kotlin.sequences.SequenceScope), (r9v12 kotlin.sequences.SequenceScope) binds: [B:45:0x0174, B:50:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r10v6 kk.h) = (r10v5 kk.h), (r10v7 kk.h) binds: [B:45:0x0174, B:50:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r11v24 kk.e) = (r11v17 kk.e), (r11v26 kk.e) binds: [B:45:0x0174, B:50:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r12v10 java.nio.file.Path) = (r12v8 java.nio.file.Path), (r12v15 java.nio.file.Path) binds: [B:45:0x0174, B:50:0x0194] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r13v7 kotlin.io.path.PathTreeWalk) = (r13v4 kotlin.io.path.PathTreeWalk), (r13v14 kotlin.io.path.PathTreeWalk) binds: [B:45:0x0174, B:50:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01b3 -> B:36:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01b5 -> B:36:0x012c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super Path> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((h) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
