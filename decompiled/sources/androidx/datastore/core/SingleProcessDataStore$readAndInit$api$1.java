package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JD\u0010\u0002\u001a\u00028\u000021\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"androidx/datastore/core/SingleProcessDataStore$readAndInit$api$1", "Landroidx/datastore/core/InitializerApi;", "updateData", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SingleProcessDataStore$readAndInit$api$1<T> implements InitializerApi<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Mutex f20721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f20722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<T> f20723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f20724d;

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 2, 2}, l = {503, 337, 339}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f20725p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f20726q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f20727r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.ObjectRef f20728s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public SingleProcessDataStore f20729t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f20730u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f20731w0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20730u0 = obj;
            this.f20731w0 |= Integer.MIN_VALUE;
            return SingleProcessDataStore$readAndInit$api$1.this.updateData(null, this);
        }
    }

    public SingleProcessDataStore$readAndInit$api$1(Mutex mutex, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.f20721a = mutex;
        this.f20722b = booleanRef;
        this.f20723c = objectRef;
        this.f20724d = singleProcessDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00ae, B:38:0x00b6), top: B:54:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InitializerApi
    @Nullable
    public Object updateData(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        a aVar;
        Mutex mutex;
        SingleProcessDataStore singleProcessDataStore;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef<T> objectRef;
        Mutex mutex2;
        Mutex mutex3;
        SingleProcessDataStore singleProcessDataStore2;
        T t10;
        Ref.ObjectRef<T> objectRef2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f20731w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f20731w0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f20730u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f20731w0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar.f20725p0 = function2;
                mutex = this.f20721a;
                aVar.f20726q0 = mutex;
                Ref.BooleanRef booleanRef2 = this.f20722b;
                aVar.f20727r0 = booleanRef2;
                Ref.ObjectRef<T> objectRef3 = this.f20723c;
                aVar.f20728s0 = objectRef3;
                singleProcessDataStore = this.f20724d;
                aVar.f20729t0 = singleProcessDataStore;
                aVar.f20731w0 = 1;
                if (mutex.lock(null, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
                objectRef = objectRef3;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t10 = (T) aVar.f20727r0;
                        objectRef2 = (Ref.ObjectRef) aVar.f20726q0;
                        mutex2 = (Mutex) aVar.f20725p0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            objectRef2.element = t10;
                            objectRef = objectRef2;
                            T t11 = objectRef.element;
                            mutex2.unlock(null);
                            return t11;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) aVar.f20727r0;
                    objectRef = (Ref.ObjectRef) aVar.f20726q0;
                    mutex3 = (Mutex) aVar.f20725p0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        singleProcessDataStore2 = singleProcessDataStore3;
                        if (Intrinsics.areEqual(obj, objectRef.element)) {
                            mutex2 = mutex3;
                        } else {
                            aVar.f20725p0 = mutex3;
                            aVar.f20726q0 = objectRef;
                            aVar.f20727r0 = obj;
                            aVar.f20731w0 = 3;
                            if (singleProcessDataStore2.writeData$datastore_core(obj, aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            t10 = (T) obj;
                            objectRef2 = objectRef;
                            mutex2 = mutex3;
                            objectRef2.element = t10;
                            objectRef = objectRef2;
                        }
                        T t12 = objectRef.element;
                        mutex2.unlock(null);
                        return t12;
                    } catch (Throwable th3) {
                        th = th3;
                        mutex2 = mutex3;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                SingleProcessDataStore singleProcessDataStore4 = aVar.f20729t0;
                objectRef = aVar.f20728s0;
                booleanRef = (Ref.BooleanRef) aVar.f20727r0;
                Mutex mutex4 = (Mutex) aVar.f20726q0;
                Function2<? super T, ? super Continuation<? super T>, ? extends Object> function3 = (Function2) aVar.f20725p0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex4;
                singleProcessDataStore = singleProcessDataStore4;
                function2 = function3;
            }
            if (booleanRef.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            T t13 = objectRef.element;
            aVar.f20725p0 = mutex;
            aVar.f20726q0 = objectRef;
            aVar.f20727r0 = singleProcessDataStore;
            aVar.f20728s0 = null;
            aVar.f20729t0 = null;
            aVar.f20731w0 = 2;
            Object objInvoke = function2.invoke(t13, aVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex3 = mutex;
            obj = objInvoke;
            singleProcessDataStore2 = singleProcessDataStore;
            if (Intrinsics.areEqual(obj, objectRef.element)) {
                aVar.f20725p0 = mutex3;
                aVar.f20726q0 = objectRef;
                aVar.f20727r0 = obj;
                aVar.f20731w0 = 3;
                if (singleProcessDataStore2.writeData$datastore_core(obj, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                t10 = (T) obj;
                objectRef2 = objectRef;
                mutex2 = mutex3;
                objectRef2.element = t10;
                objectRef = objectRef2;
            } else {
                mutex2 = mutex3;
            }
            T t14 = objectRef.element;
            mutex2.unlock(null);
            return t14;
        } catch (Throwable th4) {
            th = th4;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
