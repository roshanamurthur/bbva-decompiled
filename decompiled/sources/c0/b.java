package c0;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,187:1\n1182#2:188\n1161#2,2:189\n460#3,11:191\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n106#1:188\n106#1:189,2\n109#1:191,11\n*E\n"})
public final class b implements BringIntoViewRequester {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableVector<BringIntoViewRequesterNode> f25319a = new MutableVector<>(new BringIntoViewRequesterNode[16], 0);

    /* JADX INFO: compiled from: BringIntoViewRequester.kt */
    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {110}, m = "bringIntoView", n = {"rect", "content$iv", "size$iv", "i$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Rect f25320p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object[] f25321q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f25322r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f25323s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f25324t0;
        public int v0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25324t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return b.this.bringIntoView(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r8 >= r2) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:20:0x0063). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bringIntoView(@org.jetbrains.annotations.Nullable androidx.compose.ui.geometry.Rect r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof c0.b.a
            if (r0 == 0) goto L13
            r0 = r9
            c0.b$a r0 = (c0.b.a) r0
            int r1 = r0.v0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v0 = r1
            goto L18
        L13:
            c0.b$a r0 = new c0.b$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25324t0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.v0
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r8 = r0.f25323s0
            int r2 = r0.f25322r0
            java.lang.Object[] r4 = r0.f25321q0
            androidx.compose.ui.geometry.Rect r5 = r0.f25320p0
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r5
            goto L63
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.ResultKt.throwOnFailure(r9)
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterNode> r9 = r7.f25319a
            int r2 = r9.getSize()
            if (r2 <= 0) goto L66
            java.lang.Object[] r9 = r9.getContent()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L4e:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.BringIntoViewRequesterNode r5 = (androidx.compose.foundation.relocation.BringIntoViewRequesterNode) r5
            r0.f25320p0 = r9
            r0.f25321q0 = r4
            r0.f25322r0 = r2
            r0.f25323s0 = r8
            r0.v0 = r3
            java.lang.Object r5 = r5.bringIntoView(r9, r0)
            if (r5 != r1) goto L63
            return r1
        L63:
            int r8 = r8 + r3
            if (r8 < r2) goto L4e
        L66:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.b.bringIntoView(androidx.compose.ui.geometry.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
