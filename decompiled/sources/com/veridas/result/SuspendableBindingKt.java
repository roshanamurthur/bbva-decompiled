package com.veridas.result;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SuspendableBinding.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032/\b\u0004\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086H¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"suspendableBinding", "Lcom/veridas/result/Result;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_EAST, "block", "Lkotlin/Function2;", "Lcom/veridas/result/SuspendableResultBinding;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common-core-jvm"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SuspendableBindingKt {

    /* JADX INFO: compiled from: SuspendableBinding.kt */
    @DebugMetadata(c = "com.veridas.result.SuspendableBindingKt", f = "SuspendableBinding.kt", i = {0}, l = {36}, m = "suspendableBinding", n = {"receiver"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSuspendableBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableBinding.kt\ncom/veridas/result/SuspendableBindingKt$suspendableBinding$1\n*L\n1#1,73:1\n*E\n"})
    public static final class a<V, E> extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.ObjectRef f67459p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f67460q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f67461r0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f67460q0 = obj;
            this.f67461r0 |= Integer.MIN_VALUE;
            return SuspendableBindingKt.suspendableBinding(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: com.veridas.result.SuspendableBindingKt$suspendableBinding$2, reason: invalid class name */
    /* JADX INFO: compiled from: SuspendableBinding.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/CoroutineScope;", "Lcom/veridas/result/Ok;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.veridas.result.SuspendableBindingKt$suspendableBinding$2", f = "SuspendableBinding.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSuspendableBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableBinding.kt\ncom/veridas/result/SuspendableBindingKt$suspendableBinding$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
    public static final class AnonymousClass2<V> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Ok<? extends V>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f67462p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f67463q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<SuspendableResultBindingImpl<E>> f67464r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<SuspendableResultBinding<E>, Continuation<? super V>, Object> f67465s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ref.ObjectRef<SuspendableResultBindingImpl<E>> objectRef, Function2<? super SuspendableResultBinding<E>, ? super Continuation<? super V>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.f67464r0 = objectRef;
            this.f67465s0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f67464r0, this.f67465s0, continuation);
            anonymousClass2.f67463q0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, com.veridas.result.SuspendableResultBindingImpl] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.veridas.result.SuspendableBindingKt$suspendableBinding$2<V> for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r3.f67462p0
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                goto L43
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.Object r4 = r3.f67463q0
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                com.veridas.result.SuspendableResultBindingImpl r1 = new com.veridas.result.SuspendableResultBindingImpl
                kotlin.coroutines.CoroutineContext r4 = r4.getCoroutineContext()
                r1.<init>(r4)
                kotlin.jvm.internal.Ref$ObjectRef<com.veridas.result.SuspendableResultBindingImpl<E>> r4 = r3.f67464r0
                r4.element = r1
                T r4 = r4.element
                if (r4 != 0) goto L36
                java.lang.String r4 = "receiver"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
                r4 = 0
                goto L38
            L36:
                com.veridas.result.SuspendableResultBindingImpl r4 = (com.veridas.result.SuspendableResultBindingImpl) r4
            L38:
                r3.f67462p0 = r2
                kotlin.jvm.functions.Function2<com.veridas.result.SuspendableResultBinding<E>, kotlin.coroutines.Continuation<? super V>, java.lang.Object> r1 = r3.f67465s0
                java.lang.Object r4 = r1.invoke(r4, r3)
                if (r4 != r0) goto L43
                return r0
            L43:
                com.veridas.result.Ok r0 = new com.veridas.result.Ok
                r0.<init>(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veridas.result.SuspendableBindingKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, com.veridas.result.SuspendableResultBindingImpl] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            SuspendableResultBindingImpl suspendableResultBindingImpl;
            ?? suspendableResultBindingImpl2 = new SuspendableResultBindingImpl(((CoroutineScope) this.f67463q0).getCoroutineContext());
            Ref.ObjectRef<SuspendableResultBindingImpl<E>> objectRef = this.f67464r0;
            objectRef.element = suspendableResultBindingImpl2;
            T t10 = objectRef.element;
            if (t10 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("receiver");
                suspendableResultBindingImpl = null;
            } else {
                suspendableResultBindingImpl = (SuspendableResultBindingImpl) t10;
            }
            InlineMarker.mark(3);
            return new Ok(this.f67465s0.invoke(suspendableResultBindingImpl, null));
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Ok<? extends V>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <V, E> Object suspendableBinding(@NotNull Function2<? super SuspendableResultBinding<E>, ? super Continuation<? super V>, ? extends Object> function2, @NotNull Continuation<? super Result<? extends V, ? extends E>> continuation) {
        a aVar;
        Ref.ObjectRef objectRef;
        T t10;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f67461r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f67461r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f67460q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f67461r0;
        SuspendableResultBindingImpl suspendableResultBindingImpl = null;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(objectRef2, function2, null);
                aVar.f67459p0 = objectRef2;
                aVar.f67461r0 = 1;
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(anonymousClass2, aVar);
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objCoroutineScope;
                objectRef = objectRef2;
            } catch (BindCancellationException unused) {
                objectRef = objectRef2;
                t10 = objectRef.element;
                if (t10 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("receiver");
                } else {
                    suspendableResultBindingImpl = (SuspendableResultBindingImpl) t10;
                }
                return suspendableResultBindingImpl.getInternalError();
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = aVar.f67459p0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (BindCancellationException unused2) {
                t10 = objectRef.element;
                if (t10 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("receiver");
                } else {
                    suspendableResultBindingImpl = (SuspendableResultBindingImpl) t10;
                }
                return suspendableResultBindingImpl.getInternalError();
            }
        }
        return (Result) obj;
    }
}
