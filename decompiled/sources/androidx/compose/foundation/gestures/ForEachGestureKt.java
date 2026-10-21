package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ForEachGesture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a>\u0010\b\u001a\u00020\u0004*\u00020\u00062'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a>\u0010\u000f\u001a\u00020\u0004*\u00020\u00062'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"allPointersUp", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "awaitAllPointersUp", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitEachGesture", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forEachGesture", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,121:1\n329#2:122\n329#2:141\n101#3,2:123\n33#3,6:125\n103#3:131\n101#3,2:132\n33#3,6:134\n103#3:140\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:122\n100#1:141\n71#1:123,2\n71#1:125,6\n71#1:131\n87#1:132,2\n87#1:134,6\n87#1:140\n*E\n"})
public final class ForEachGestureKt {

    /* JADX INFO: compiled from: ForEachGesture.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3783p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3784q0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(2, continuation);
            aVar.f3784q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3783p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f3784q0;
                this.f3783p0 = 1;
                if (ForEachGestureKt.awaitAllPointersUp(awaitPointerEventScope, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: ForEachGesture.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0}, l = {86}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AwaitPointerEventScope f3785p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3786q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f3787r0;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3786q0 = obj;
            this.f3787r0 |= Integer.MIN_VALUE;
            return ForEachGestureKt.awaitAllPointersUp((AwaitPointerEventScope) null, this);
        }
    }

    /* JADX INFO: compiled from: ForEachGesture.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {104, 107, 112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
    public static final class c extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3788p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3789q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f3790r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> f3791s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(CoroutineContext coroutineContext, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f3790r0 = coroutineContext;
            this.f3791s0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f3790r0, this.f3791s0, continuation);
            cVar.f3789q0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((c) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0053 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0054  */
        /* JADX WARN: Code duplicated, block: B:28:0x0061 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        /* JADX WARN: Code duplicated, block: B:43:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0062 -> B:20:0x003f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0083 -> B:20:0x003f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r8.f3788p0
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L37
                if (r1 == r4) goto L2e
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r8.f3789q0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r9)
                goto L28
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                java.lang.Object r1 = r8.f3789q0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
            L28:
                r9 = r1
                goto L3e
            L2a:
                r9 = move-exception
                r5 = r1
                r1 = r8
                goto L70
            L2e:
                java.lang.Object r1 = r8.f3789q0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
                r9 = r8
                goto L57
            L37:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.f3789q0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            L3e:
                r1 = r8
            L3f:
                kotlin.coroutines.CoroutineContext r5 = r1.f3790r0
                boolean r5 = kotlinx.coroutines.JobKt.isActive(r5)
                if (r5 == 0) goto L86
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r5 = r1.f3791s0     // Catch: java.util.concurrent.CancellationException -> L6c
                r1.f3789q0 = r9     // Catch: java.util.concurrent.CancellationException -> L6c
                r1.f3788p0 = r4     // Catch: java.util.concurrent.CancellationException -> L6c
                java.lang.Object r5 = r5.invoke(r9, r1)     // Catch: java.util.concurrent.CancellationException -> L6c
                if (r5 != r0) goto L54
                return r0
            L54:
                r7 = r1
                r1 = r9
                r9 = r7
            L57:
                r9.f3789q0 = r1     // Catch: java.util.concurrent.CancellationException -> L66
                r9.f3788p0 = r3     // Catch: java.util.concurrent.CancellationException -> L66
                java.lang.Object r5 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L66
                if (r5 != r0) goto L62
                return r0
            L62:
                r7 = r1
                r1 = r9
                r9 = r7
                goto L3f
            L66:
                r5 = move-exception
                r7 = r1
                r1 = r9
                r9 = r5
                r5 = r7
                goto L70
            L6c:
                r5 = move-exception
                r7 = r5
                r5 = r9
                r9 = r7
            L70:
                kotlin.coroutines.CoroutineContext r6 = r1.f3790r0
                boolean r6 = kotlinx.coroutines.JobKt.isActive(r6)
                if (r6 == 0) goto L85
                r1.f3789q0 = r5
                r1.f3788p0 = r2
                java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r5, r1)
                if (r9 != r0) goto L83
                return r0
            L83:
                r9 = r5
                goto L3f
            L85:
                throw r9
            L86:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: ForEachGesture.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {48, 51, 56}, m = "forEachGesture", n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public PointerInputScope f3792p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Function2 f3793q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public CoroutineContext f3794r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f3795s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f3796t0;

        public d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3795s0 = obj;
            this.f3796t0 |= Integer.MIN_VALUE;
            return ForEachGestureKt.forEachGesture(null, null, this);
        }
    }

    public static final boolean allPointersUp(@NotNull AwaitPointerEventScope awaitPointerEventScope) {
        Intrinsics.checkNotNullParameter(awaitPointerEventScope, "<this>");
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            if (changes.get(i10).getPressed()) {
                z10 = true;
                break;
            }
        }
        return !z10;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[LOOP:0: B:20:0x0054->B:24:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003c A[EDGE_INSN: B:28:0x003c->B:16:0x003c BREAK  A[LOOP:0: B:20:0x0054->B:24:0x0063], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0046 -> B:19:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object awaitAllPointersUp(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.b
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.ForEachGestureKt$b r0 = (androidx.compose.foundation.gestures.ForEachGestureKt.b) r0
            int r1 = r0.f3787r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3787r0 = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$b r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3786q0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3787r0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = r0.f3785p0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r7 = allPointersUp(r6)
            if (r7 != 0) goto L66
        L3c:
            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r0.f3785p0 = r6
            r0.f3787r0 = r3
            java.lang.Object r7 = r6.awaitPointerEvent(r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
            java.util.List r7 = r7.getChanges()
            int r2 = r7.size()
            r4 = 0
        L54:
            if (r4 >= r2) goto L66
            java.lang.Object r5 = r7.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L63
            goto L3c
        L63:
            int r4 = r4 + 1
            goto L54
        L66:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object awaitEachGesture(@NotNull PointerInputScope pointerInputScope, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new c(continuation.getContext(), function2, null), continuation);
        return objAwaitPointerEventScope == ek.a.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007f -> B:18:0x0046). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0099 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @kotlin.ReplaceWith(expression = "awaitEachGesture(block)", imports = {}))
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object forEachGesture(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.PointerInputScope r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.d
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$d r0 = (androidx.compose.foundation.gestures.ForEachGestureKt.d) r0
            int r1 = r0.f3796t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3796t0 = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$d r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f3795s0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3796t0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            kotlin.coroutines.CoroutineContext r8 = r0.f3794r0
            kotlin.jvm.functions.Function2 r9 = r0.f3793q0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = r0.f3792p0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L46
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.coroutines.CoroutineContext r8 = r0.f3794r0
            kotlin.jvm.functions.Function2 r9 = r0.f3793q0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = r0.f3792p0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.util.concurrent.CancellationException -> L49
        L46:
            r10 = r8
            r8 = r2
            goto L5c
        L49:
            r10 = move-exception
            goto L87
        L4b:
            kotlin.coroutines.CoroutineContext r8 = r0.f3794r0
            kotlin.jvm.functions.Function2 r9 = r0.f3793q0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = r0.f3792p0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.util.concurrent.CancellationException -> L49
            goto L73
        L55:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
        L5c:
            boolean r2 = kotlinx.coroutines.JobKt.isActive(r10)
            if (r2 == 0) goto L9d
            r0.f3792p0 = r8     // Catch: java.util.concurrent.CancellationException -> L82
            r0.f3793q0 = r9     // Catch: java.util.concurrent.CancellationException -> L82
            r0.f3794r0 = r10     // Catch: java.util.concurrent.CancellationException -> L82
            r0.f3796t0 = r5     // Catch: java.util.concurrent.CancellationException -> L82
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L82
            if (r2 != r1) goto L71
            return r1
        L71:
            r2 = r8
            r8 = r10
        L73:
            r0.f3792p0 = r2     // Catch: java.util.concurrent.CancellationException -> L49
            r0.f3793q0 = r9     // Catch: java.util.concurrent.CancellationException -> L49
            r0.f3794r0 = r8     // Catch: java.util.concurrent.CancellationException -> L49
            r0.f3796t0 = r4     // Catch: java.util.concurrent.CancellationException -> L49
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L49
            if (r10 != r1) goto L46
            return r1
        L82:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L87:
            boolean r6 = kotlinx.coroutines.JobKt.isActive(r8)
            if (r6 == 0) goto L9c
            r0.f3792p0 = r2
            r0.f3793q0 = r9
            r0.f3794r0 = r8
            r0.f3796t0 = r3
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)
            if (r10 != r1) goto L46
            return r1
        L9c:
            throw r10
        L9d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object awaitAllPointersUp(@NotNull PointerInputScope pointerInputScope, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new a(2, null), continuation);
        return objAwaitPointerEventScope == ek.a.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }
}
