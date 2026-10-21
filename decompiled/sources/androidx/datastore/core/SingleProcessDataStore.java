package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 &*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003&'(B\u0081\u0001\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012?\b\u0002\u0010\u001f\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00030\u001c\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \u0012\b\b\u0002\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%JF\u0010\n\u001a\u00028\u000021\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/DataStore;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "", "writeData$datastore_core", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "Lkotlinx/coroutines/flow/Flow;", "e", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "data", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/Serializer;", "serializer", "", "Landroidx/datastore/core/InitializerApi;", SqlContracts.TokenEntry.API, "initTasksList", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/datastore/core/Serializer;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "Companion", "Message", "a", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class SingleProcessDataStore<T> implements DataStore<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("activeFilesLock")
    @NotNull
    public static final LinkedHashSet f20655k = new LinkedHashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Object f20656l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<File> f20657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Serializer<T> f20658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CorruptionHandler<T> f20659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f20660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<T> data;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f20662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f20663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<r2.g<T>> f20664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> f20665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SimpleActor<Message<T>> f20666j;

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$datastore_core", "()Ljava/util/Set;", "activeFilesLock", "getActiveFilesLock$datastore_core", "()Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getActiveFiles$datastore_core() {
            return SingleProcessDataStore.f20655k;
        }

        @NotNull
        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.f20656l;
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    public static abstract class Message<T> {

        /* JADX INFO: compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0017\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$Message;", "Lr2/g;", "a", "Lr2/g;", "getLastState", "()Lr2/g;", "lastState", "<init>", "(Lr2/g;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
        public static final class Read<T> extends Message<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final r2.g<T> lastState;

            public Read(@Nullable r2.g<T> gVar) {
                super(null);
                this.lastState = gVar;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            @Nullable
            public r2.g<T> getLastState() {
                return this.lastState;
            }
        }

        /* JADX INFO: compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002Bc\u00121\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b \u0010!RE\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$Message;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "a", "Lkotlin/jvm/functions/Function2;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "transform", "Lkotlinx/coroutines/CompletableDeferred;", "b", "Lkotlinx/coroutines/CompletableDeferred;", "getAck", "()Lkotlinx/coroutines/CompletableDeferred;", net.ipsoft.amelia.sdk.internal.c.c.f84801f, "Lr2/g;", "c", "Lr2/g;", "getLastState", "()Lr2/g;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "d", "Lkotlin/coroutines/CoroutineContext;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CompletableDeferred;Lr2/g;Lkotlin/coroutines/CoroutineContext;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
        public static final class Update<T> extends Message<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function2<T, Continuation<? super T>, Object> transform;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final CompletableDeferred<T> ack;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final r2.g<T> lastState;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final CoroutineContext callerContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Update(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> transform, @NotNull CompletableDeferred<T> ack, @Nullable r2.g<T> gVar, @NotNull CoroutineContext callerContext) {
                super(null);
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(ack, "ack");
                Intrinsics.checkNotNullParameter(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = gVar;
                this.callerContext = callerContext;
            }

            @NotNull
            public final CompletableDeferred<T> getAck() {
                return this.ack;
            }

            @NotNull
            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            @Nullable
            public r2.g<T> getLastState() {
                return this.lastState;
            }

            @NotNull
            public final Function2<T, Continuation<? super T>, Object> getTransform() {
                return this.transform;
            }
        }

        public Message() {
        }

        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public abstract r2.g<T> getLastState();
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final FileOutputStream f20672p0;

        public a(@NotNull FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.f20672p0 = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f20672p0.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i10) throws IOException {
            this.f20672p0.write(i10);
        }

        @Override // java.io.OutputStream
        public final void write(@NotNull byte[] b10) throws IOException {
            Intrinsics.checkNotNullParameter(b10, "b");
            this.f20672p0.write(b10);
        }

        @Override // java.io.OutputStream
        public final void write(@NotNull byte[] bytes, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.f20672p0.write(bytes, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SingleProcessDataStore<T> f20673p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SingleProcessDataStore<T> singleProcessDataStore) {
            super(1);
            this.f20673p0 = singleProcessDataStore;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable th3 = th2;
            if (th3 != null) {
                this.f20673p0.f20664h.setValue(new r2.b(th3));
            }
            Companion companion = SingleProcessDataStore.INSTANCE;
            Object activeFilesLock$datastore_core = companion.getActiveFilesLock$datastore_core();
            SingleProcessDataStore<T> singleProcessDataStore = this.f20673p0;
            synchronized (activeFilesLock$datastore_core) {
                companion.getActiveFiles$datastore_core().remove(singleProcessDataStore.a().getAbsolutePath());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    public static final class c extends Lambda implements Function2<Message<T>, Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f20674p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Object obj, Throwable th2) {
            Message msg = (Message) obj;
            Throwable cancellationException = th2;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg instanceof Message.Update) {
                CompletableDeferred<T> ack = ((Message.Update) msg).getAck();
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ack.completeExceptionally(cancellationException);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", i = {}, l = {239, 242}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<Message<T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f20675p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f20676q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SingleProcessDataStore<T> f20677r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f20677r0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.f20677r0, continuation);
            dVar.f20676q0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((d) create((Message) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f20675p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Message message = (Message) this.f20676q0;
                boolean z10 = message instanceof Message.Read;
                SingleProcessDataStore<T> singleProcessDataStore = this.f20677r0;
                if (z10) {
                    this.f20675p0 = 1;
                    if (SingleProcessDataStore.access$handleRead(singleProcessDataStore, (Message.Read) message, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (message instanceof Message.Update) {
                    this.f20675p0 = 2;
                    if (SingleProcessDataStore.access$handleUpdate(singleProcessDataStore, (Message.Update) message, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    public static final class e extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SingleProcessDataStore<T> f20688p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SingleProcessDataStore<T> singleProcessDataStore) {
            super(0);
            this.f20688p0 = singleProcessDataStore;
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = (File) this.f20688p0.f20657a.invoke();
            String it = file.getAbsolutePath();
            Companion companion = SingleProcessDataStore.INSTANCE;
            synchronized (companion.getActiveFilesLock$datastore_core()) {
                if (!(!companion.getActiveFiles$datastore_core().contains(it))) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set<String> activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                activeFiles$datastore_core.add(it);
            }
            return file;
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 1, 1, 2}, l = {322, 348, TypedValues.PositionType.TYPE_SIZE_PERCENT}, m = "readAndInit", n = {"updateLock", "initData", "updateLock", "initData", "initializationComplete", "$this$withLock_u24default$iv"}, s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SingleProcessDataStore f20689p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f20690q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Serializable f20691r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Object f20692s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public SingleProcessDataStore$readAndInit$api$1 f20693t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Iterator f20694u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ SingleProcessDataStore<T> f20695w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f20696x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super f> continuation) {
            super(continuation);
            this.f20695w0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v0 = obj;
            this.f20696x0 |= Integer.MIN_VALUE;
            return this.f20695w0.b(this);
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {302}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SingleProcessDataStore f20697p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f20698q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SingleProcessDataStore<T> f20699r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f20700s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super g> continuation) {
            super(continuation);
            this.f20699r0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20698q0 = obj;
            this.f20700s0 |= Integer.MIN_VALUE;
            return this.f20699r0.c(this);
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {311}, m = "readAndInitOrPropagateFailure", n = {"this"}, s = {"L$0"})
    public static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SingleProcessDataStore f20701p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f20702q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SingleProcessDataStore<T> f20703r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f20704s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super h> continuation) {
            super(continuation);
            this.f20703r0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20702q0 = obj;
            this.f20704s0 |= Integer.MIN_VALUE;
            return this.f20703r0.d(this);
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {381}, m = "readData", n = {"this"}, s = {"L$0"})
    public static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SingleProcessDataStore f20705p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public FileInputStream f20706q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f20707r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SingleProcessDataStore<T> f20708s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f20709t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super i> continuation) {
            super(continuation);
            this.f20708s0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20707r0 = obj;
            this.f20709t0 |= Integer.MIN_VALUE;
            return this.f20708s0.e(this);
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 1, 2, 2}, l = {359, 362, 365}, m = "readDataOrHandleCorruption", n = {"this", "ex", "ex", "newData"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f20710p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f20711q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f20712r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SingleProcessDataStore<T> f20713s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f20714t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super j> continuation) {
            super(continuation);
            this.f20713s0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20712r0 = obj;
            this.f20714t0 |= Integer.MIN_VALUE;
            return this.f20713s0.f(this);
        }
    }

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {426}, m = "writeData$datastore_core", n = {"this", "scratchFile", "stream"}, s = {"L$0", "L$1", "L$4"})
    public static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SingleProcessDataStore f20715p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public File f20716q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public FileOutputStream f20717r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public FileOutputStream f20718s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f20719t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ SingleProcessDataStore<T> f20720u0;
        public int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super k> continuation) {
            super(continuation);
            this.f20720u0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20719t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return this.f20720u0.writeData$datastore_core(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(@NotNull Function0<? extends File> produceFile, @NotNull Serializer<T> serializer, @NotNull List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList, @NotNull CorruptionHandler<T> corruptionHandler, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f20657a = produceFile;
        this.f20658b = serializer;
        this.f20659c = corruptionHandler;
        this.f20660d = scope;
        this.data = FlowKt.flow(new SingleProcessDataStore$data$1(this, null));
        this.f20662f = ".tmp";
        this.f20663g = LazyKt__LazyJVMKt.lazy(new e(this));
        this.f20664h = StateFlowKt.MutableStateFlow(r2.h.f92922a);
        this.f20665i = CollectionsKt___CollectionsKt.toList(initTasksList);
        this.f20666j = new SimpleActor<>(scope, new b(this), c.f20674p0, new d(this, null));
    }

    public static final Object access$handleRead(SingleProcessDataStore singleProcessDataStore, Message.Read read, Continuation continuation) {
        r2.g<T> value = singleProcessDataStore.f20664h.getValue();
        if (!(value instanceof r2.a)) {
            if (value instanceof r2.c) {
                if (value == read.getLastState()) {
                    Object objD = singleProcessDataStore.d(continuation);
                    return objD == ek.a.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
                }
            } else {
                if (Intrinsics.areEqual(value, r2.h.f92922a)) {
                    Object objD2 = singleProcessDataStore.d(continuation);
                    return objD2 == ek.a.getCOROUTINE_SUSPENDED() ? objD2 : Unit.INSTANCE;
                }
                if (value instanceof r2.b) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final Object access$handleUpdate(SingleProcessDataStore singleProcessDataStore, Message.Update update, Continuation continuation) {
        r2.d dVar;
        Object objM5535constructorimpl;
        ?? r10;
        CompletableDeferred<T> ack;
        Object objG;
        ?? r11;
        CompletableDeferred completableDeferred;
        singleProcessDataStore.getClass();
        if (continuation instanceof r2.d) {
            dVar = (r2.d) continuation;
            int i10 = dVar.f92912u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f92912u0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new r2.d(singleProcessDataStore, continuation);
            }
        } else {
            dVar = new r2.d(singleProcessDataStore, continuation);
        }
        Object obj = dVar.f92910s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f92912u0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    completableDeferred = (CompletableDeferred) dVar.f92907p0;
                } else if (i11 == 2) {
                    CompletableDeferred<T> completableDeferred2 = dVar.f92909r0;
                    SingleProcessDataStore singleProcessDataStore2 = dVar.f92908q0;
                    Message.Update update2 = (Message.Update) dVar.f92907p0;
                    ResultKt.throwOnFailure(obj);
                    ack = completableDeferred2;
                    r11 = singleProcessDataStore2;
                    update = update2;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (CompletableDeferred) dVar.f92907p0;
                }
                ResultKt.throwOnFailure(obj);
                singleProcessDataStore = completableDeferred;
                objM5535constructorimpl = Result.m5535constructorimpl(obj);
                r10 = singleProcessDataStore;
                CompletableDeferredKt.completeWith(r10, objM5535constructorimpl);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ack = update.getAck();
            try {
                Result.Companion companion = Result.INSTANCE;
                r2.g<T> value = singleProcessDataStore.f20664h.getValue();
                if (value instanceof r2.a) {
                    Function2<T, Continuation<? super T>, Object> transform = update.getTransform();
                    CoroutineContext callerContext = update.getCallerContext();
                    dVar.f92907p0 = ack;
                    dVar.f92912u0 = 1;
                    objG = singleProcessDataStore.g(callerContext, transform, dVar);
                    if (objG == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (!(value instanceof r2.c) && !(value instanceof r2.h)) {
                        if (value instanceof r2.b) {
                            throw ((r2.b) value).f92905a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (value != update.getLastState()) {
                        throw ((r2.c) value).f92906a;
                    }
                    dVar.f92907p0 = update;
                    dVar.f92908q0 = singleProcessDataStore;
                    dVar.f92909r0 = ack;
                    dVar.f92912u0 = 2;
                    if (singleProcessDataStore.c(dVar) == coroutine_suspended) {
                        r11 = singleProcessDataStore;
                        return coroutine_suspended;
                    }
                }
                CompletableDeferred<T> completableDeferred3 = ack;
                obj = objG;
                singleProcessDataStore = completableDeferred3;
                objM5535constructorimpl = Result.m5535constructorimpl(obj);
                r10 = singleProcessDataStore;
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore = ack;
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th));
                r10 = singleProcessDataStore;
            }
            CompletableDeferredKt.completeWith(r10, objM5535constructorimpl);
            return Unit.INSTANCE;
            r11 = singleProcessDataStore;
            Function2<T, Continuation<? super T>, Object> transform2 = update.getTransform();
            CoroutineContext callerContext2 = update.getCallerContext();
            dVar.f92907p0 = ack;
            dVar.f92908q0 = null;
            dVar.f92909r0 = null;
            dVar.f92912u0 = 3;
            objG = r11.g(callerContext2, transform2, dVar);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
            CompletableDeferred<T> completableDeferred4 = ack;
            obj = objG;
            singleProcessDataStore = completableDeferred4;
            objM5535constructorimpl = Result.m5535constructorimpl(obj);
            r10 = singleProcessDataStore;
        } catch (Throwable th3) {
            th = th3;
        }
        CompletableDeferredKt.completeWith(r10, objM5535constructorimpl);
        return Unit.INSTANCE;
    }

    public final File a() {
        return (File) this.f20663g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:0: B:33:0x00d5->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Continuation<? super Unit> continuation) {
        f fVar;
        Mutex mutexMutex$default;
        Ref.ObjectRef objectRef;
        SingleProcessDataStore singleProcessDataStore;
        Ref.ObjectRef objectRef2;
        SingleProcessDataStore singleProcessDataStore2;
        Ref.ObjectRef objectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator<T> it;
        Mutex mutex;
        Ref.BooleanRef booleanRef;
        Mutex mutex2;
        SingleProcessDataStore singleProcessDataStore3;
        Ref.ObjectRef objectRef4;
        Ref.BooleanRef booleanRef2;
        Function2 function2;
        SingleProcessDataStore singleProcessDataStore4;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i10 = fVar.f20696x0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f20696x0 = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, continuation);
            }
        } else {
            fVar = new f(this, continuation);
        }
        T t10 = (T) fVar.v0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = fVar.f20696x0;
        if (i11 != 0) {
            if (i11 == 1) {
                objectRef = (Ref.ObjectRef) fVar.f20692s0;
                objectRef2 = (Ref.ObjectRef) fVar.f20691r0;
                mutexMutex$default = (Mutex) fVar.f20690q0;
                SingleProcessDataStore singleProcessDataStore5 = fVar.f20689p0;
                ResultKt.throwOnFailure(t10);
                singleProcessDataStore = singleProcessDataStore5;
            } else if (i11 == 2) {
                it = fVar.f20694u0;
                singleProcessDataStore$readAndInit$api$1 = fVar.f20693t0;
                booleanRef = (Ref.BooleanRef) fVar.f20692s0;
                objectRef3 = (Ref.ObjectRef) fVar.f20691r0;
                mutex = (Mutex) fVar.f20690q0;
                SingleProcessDataStore singleProcessDataStore6 = fVar.f20689p0;
                ResultKt.throwOnFailure(t10);
                singleProcessDataStore2 = singleProcessDataStore6;
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    fVar.f20689p0 = singleProcessDataStore2;
                    fVar.f20690q0 = mutex;
                    fVar.f20691r0 = objectRef3;
                    fVar.f20692s0 = booleanRef;
                    fVar.f20693t0 = singleProcessDataStore$readAndInit$api$1;
                    fVar.f20694u0 = it;
                    fVar.f20696x0 = 2;
                    if (function2.invoke(singleProcessDataStore$readAndInit$api$1, fVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                objectRef2 = objectRef3;
                mutex2 = mutex;
                singleProcessDataStore3 = singleProcessDataStore2;
                singleProcessDataStore3.f20665i = null;
                fVar.f20689p0 = singleProcessDataStore3;
                fVar.f20690q0 = objectRef2;
                fVar.f20691r0 = booleanRef;
                fVar.f20692s0 = mutex2;
                fVar.f20693t0 = null;
                fVar.f20694u0 = null;
                fVar.f20696x0 = 3;
                if (mutex2.lock(null, fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef4 = objectRef2;
                booleanRef2 = booleanRef;
                singleProcessDataStore4 = singleProcessDataStore3;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) fVar.f20692s0;
                booleanRef2 = (Ref.BooleanRef) fVar.f20691r0;
                objectRef4 = (Ref.ObjectRef) fVar.f20690q0;
                SingleProcessDataStore singleProcessDataStore7 = fVar.f20689p0;
                ResultKt.throwOnFailure(t10);
                singleProcessDataStore4 = singleProcessDataStore7;
            }
            try {
                booleanRef2.element = true;
                Unit unit = Unit.INSTANCE;
                mutex2.unlock(null);
                MutableStateFlow<r2.g<T>> mutableStateFlow = singleProcessDataStore4.f20664h;
                T t11 = objectRef4.element;
                mutableStateFlow.setValue(new r2.a(t11, t11 != null ? t11.hashCode() : 0));
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                mutex2.unlock(null);
                throw th2;
            }
        }
        ResultKt.throwOnFailure(t10);
        MutableStateFlow<r2.g<T>> mutableStateFlow2 = this.f20664h;
        if (!Intrinsics.areEqual(mutableStateFlow2.getValue(), r2.h.f92922a) && !(mutableStateFlow2.getValue() instanceof r2.c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
        objectRef = new Ref.ObjectRef();
        fVar.f20689p0 = this;
        fVar.f20690q0 = mutexMutex$default;
        fVar.f20691r0 = objectRef;
        fVar.f20692s0 = objectRef;
        fVar.f20696x0 = 1;
        t10 = (T) f(fVar);
        if (t10 == coroutine_suspended) {
            return coroutine_suspended;
        }
        singleProcessDataStore = this;
        objectRef2 = objectRef;
        objectRef.element = t10;
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$2 = new SingleProcessDataStore$readAndInit$api$1(mutexMutex$default, booleanRef3, objectRef2, singleProcessDataStore);
        List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> list = singleProcessDataStore.f20665i;
        if (list == null) {
            mutex2 = mutexMutex$default;
            booleanRef = booleanRef3;
            singleProcessDataStore3 = singleProcessDataStore;
        } else {
            singleProcessDataStore2 = singleProcessDataStore;
            objectRef3 = objectRef2;
            singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$2;
            it = list.iterator();
            mutex = mutexMutex$default;
            booleanRef = booleanRef3;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                fVar.f20689p0 = singleProcessDataStore2;
                fVar.f20690q0 = mutex;
                fVar.f20691r0 = objectRef3;
                fVar.f20692s0 = booleanRef;
                fVar.f20693t0 = singleProcessDataStore$readAndInit$api$1;
                fVar.f20694u0 = it;
                fVar.f20696x0 = 2;
                if (function2.invoke(singleProcessDataStore$readAndInit$api$1, fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            objectRef2 = objectRef3;
            mutex2 = mutex;
            singleProcessDataStore3 = singleProcessDataStore2;
        }
        singleProcessDataStore3.f20665i = null;
        fVar.f20689p0 = singleProcessDataStore3;
        fVar.f20690q0 = objectRef2;
        fVar.f20691r0 = booleanRef;
        fVar.f20692s0 = mutex2;
        fVar.f20693t0 = null;
        fVar.f20694u0 = null;
        fVar.f20696x0 = 3;
        if (mutex2.lock(null, fVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        objectRef4 = objectRef2;
        booleanRef2 = booleanRef;
        singleProcessDataStore4 = singleProcessDataStore3;
        booleanRef2.element = true;
        Unit unit2 = Unit.INSTANCE;
        mutex2.unlock(null);
        MutableStateFlow<r2.g<T>> mutableStateFlow3 = singleProcessDataStore4.f20664h;
        T t12 = objectRef4.element;
        mutableStateFlow3.setValue(new r2.a(t12, t12 != null ? t12.hashCode() : 0));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Continuation<? super Unit> continuation) throws Throwable {
        g gVar;
        SingleProcessDataStore singleProcessDataStore;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f20700s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f20700s0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, continuation);
            }
        } else {
            gVar = new g(this, continuation);
        }
        Object obj = gVar.f20698q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f20700s0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = gVar.f20697p0;
            try {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore.f20664h.setValue(new r2.c(th));
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            gVar.f20697p0 = this;
            gVar.f20700s0 = 1;
            if (b(gVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            singleProcessDataStore = this;
            singleProcessDataStore.f20664h.setValue(new r2.c(th));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Continuation<? super Unit> continuation) {
        h hVar;
        SingleProcessDataStore singleProcessDataStore;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i10 = hVar.f20704s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f20704s0 = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, continuation);
            }
        } else {
            hVar = new h(this, continuation);
        }
        Object obj = hVar.f20702q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = hVar.f20704s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                hVar.f20701p0 = this;
                hVar.f20704s0 = 1;
                if (b(hVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore = this;
                singleProcessDataStore.f20664h.setValue(new r2.c(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = hVar.f20701p0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                singleProcessDataStore.f20664h.setValue(new r2.c(th));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$i, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.core.Serializer, androidx.datastore.core.Serializer<T>] */
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
    public final Object e(Continuation<? super T> continuation) throws FileNotFoundException {
        ?? iVar;
        FileInputStream fileInputStream;
        Throwable th2;
        if (continuation instanceof i) {
            i iVar2 = (i) continuation;
            int i10 = iVar2.f20709t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar2.f20709t0 = i10 - Integer.MIN_VALUE;
                iVar = iVar2;
            } else {
                iVar = new i(this, continuation);
            }
        } else {
            iVar = new i(this, continuation);
        }
        Object obj = iVar.f20707r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = iVar.f20709t0;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileInputStream = iVar.f20706q0;
                iVar = iVar.f20705p0;
                try {
                    ResultKt.throwOnFailure(obj);
                    CloseableKt.closeFinally(fileInputStream, null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th2;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(fileInputStream, th2);
                        throw th4;
                    }
                }
            }
            ResultKt.throwOnFailure(obj);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(a());
                try {
                    Serializer<T> serializer = this.f20658b;
                    iVar.f20705p0 = this;
                    iVar.f20706q0 = fileInputStream2;
                    iVar.f20709t0 = 1;
                    Object from = serializer.readFrom(fileInputStream2, iVar);
                    if (from == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fileInputStream = fileInputStream2;
                    obj = from;
                    CloseableKt.closeFinally(fileInputStream, null);
                    return obj;
                } catch (Throwable th5) {
                    fileInputStream = fileInputStream2;
                    th2 = th5;
                    iVar = this;
                    throw th2;
                }
            } catch (FileNotFoundException e5) {
                e = e5;
                iVar = this;
                if (iVar.a().exists()) {
                    throw e;
                }
                return iVar.f20658b.getDefaultValue();
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            if (iVar.a().exists()) {
                return iVar.f20658b.getDefaultValue();
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    public final Object f(Continuation<? super T> continuation) throws CorruptionException, FileNotFoundException {
        j jVar;
        ?? r3;
        Object objHandleCorruption;
        CorruptionException corruptionException;
        ?? r4;
        CorruptionException corruptionException2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i10 = jVar.f20714t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f20714t0 = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, continuation);
            }
        } else {
            jVar = new j(this, continuation);
        }
        Object objE = jVar.f20712r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = jVar.f20714t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objE);
            try {
                jVar.f20710p0 = this;
                jVar.f20714t0 = 1;
                objE = e(jVar);
                return objE == coroutine_suspended ? coroutine_suspended : objE;
            } catch (CorruptionException e5) {
                e = e5;
                r3 = this;
                CorruptionHandler<T> corruptionHandler = r3.f20659c;
                jVar.f20710p0 = r3;
                jVar.f20711q0 = e;
                jVar.f20714t0 = 2;
                objHandleCorruption = corruptionHandler.handleCorruption(e, jVar);
                if (objHandleCorruption == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ?? r10 = r3;
                corruptionException = e;
                objE = objHandleCorruption;
                r4 = r10;
                jVar.f20710p0 = corruptionException;
                jVar.f20711q0 = objE;
                jVar.f20714t0 = 3;
                if (r4.writeData$datastore_core(objE, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objE;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                corruptionException = (CorruptionException) jVar.f20711q0;
                SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) jVar.f20710p0;
                ResultKt.throwOnFailure(objE);
                r4 = singleProcessDataStore;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = jVar.f20711q0;
                corruptionException2 = (CorruptionException) jVar.f20710p0;
                try {
                    ResultKt.throwOnFailure(objE);
                    return obj;
                } catch (IOException e7) {
                    e = e7;
                }
            }
            ak.b.addSuppressed(corruptionException2, e);
            throw corruptionException2;
        }
        r3 = (SingleProcessDataStore) jVar.f20710p0;
        try {
            ResultKt.throwOnFailure(objE);
        } catch (CorruptionException e10) {
            e = e10;
            CorruptionHandler<T> corruptionHandler2 = r3.f20659c;
            jVar.f20710p0 = r3;
            jVar.f20711q0 = e;
            jVar.f20714t0 = 2;
            objHandleCorruption = corruptionHandler2.handleCorruption(e, jVar);
            if (objHandleCorruption == coroutine_suspended) {
                return coroutine_suspended;
            }
            ?? r11 = r3;
            corruptionException = e;
            objE = objHandleCorruption;
            r4 = r11;
            jVar.f20710p0 = corruptionException;
            jVar.f20711q0 = objE;
            jVar.f20714t0 = 3;
            if (r4.writeData$datastore_core(objE, jVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objE;
        }
        try {
            jVar.f20710p0 = corruptionException;
            jVar.f20711q0 = objE;
            jVar.f20714t0 = 3;
            if (r4.writeData$datastore_core(objE, jVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objE;
        } catch (IOException e11) {
            e = e11;
            corruptionException2 = corruptionException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        r2.e eVar;
        SingleProcessDataStore singleProcessDataStore;
        r2.a aVar;
        Object obj;
        SingleProcessDataStore singleProcessDataStore2;
        int iHashCode;
        if (continuation instanceof r2.e) {
            eVar = (r2.e) continuation;
            int i10 = eVar.f92918u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f92918u0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new r2.e(this, continuation);
            }
        } else {
            eVar = new r2.e(this, continuation);
        }
        Object obj2 = eVar.f92916s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f92918u0;
        if (i11 != 0) {
            if (i11 == 1) {
                obj = eVar.f92915r0;
                aVar = (r2.a) eVar.f92914q0;
                SingleProcessDataStore singleProcessDataStore3 = eVar.f92913p0;
                ResultKt.throwOnFailure(obj2);
                singleProcessDataStore = singleProcessDataStore3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = eVar.f92914q0;
                SingleProcessDataStore singleProcessDataStore4 = eVar.f92913p0;
                ResultKt.throwOnFailure(obj2);
                singleProcessDataStore2 = singleProcessDataStore4;
            }
            MutableStateFlow<r2.g<T>> mutableStateFlow = singleProcessDataStore2.f20664h;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            mutableStateFlow.setValue(new r2.a(obj, iHashCode));
            return obj;
        }
        ResultKt.throwOnFailure(obj2);
        r2.a aVar2 = (r2.a) this.f20664h.getValue();
        aVar2.a();
        Object obj3 = aVar2.f92903a;
        r2.f fVar = new r2.f(function2, obj3, null);
        eVar.f92913p0 = this;
        eVar.f92914q0 = aVar2;
        eVar.f92915r0 = obj3;
        eVar.f92918u0 = 1;
        Object objWithContext = BuildersKt.withContext(coroutineContext, fVar, eVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        singleProcessDataStore = this;
        aVar = aVar2;
        obj2 = objWithContext;
        obj = obj3;
        aVar.a();
        if (!Intrinsics.areEqual(obj, obj2)) {
            eVar.f92913p0 = singleProcessDataStore;
            eVar.f92914q0 = obj2;
            eVar.f92915r0 = null;
            eVar.f92918u0 = 2;
            if (singleProcessDataStore.writeData$datastore_core(obj2, eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = obj2;
            singleProcessDataStore2 = singleProcessDataStore;
            MutableStateFlow<r2.g<T>> mutableStateFlow2 = singleProcessDataStore2.f20664h;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            mutableStateFlow2.setValue(new r2.a(obj, iHashCode));
        }
        return obj;
    }

    @Override // androidx.datastore.core.DataStore
    @NotNull
    public Flow<T> getData() {
        return this.data;
    }

    @Override // androidx.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.f20666j.offer(new Message.Update(function2, completableDeferredCompletableDeferred$default, this.f20664h.getValue(), continuation.getContext()));
        return completableDeferredCompletableDeferred$default.await(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object writeData$datastore_core(T t10, @NotNull Continuation<? super Unit> continuation) throws IOException {
        k kVar;
        File file;
        FileOutputStream fileOutputStream;
        SingleProcessDataStore<T> singleProcessDataStore;
        FileOutputStream fileOutputStream2;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i10 = kVar.v0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.v0 = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, continuation);
            }
        } else {
            kVar = new k(this, continuation);
        }
        Object obj = kVar.f20719t0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = kVar.v0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            File fileA = a();
            File parentFile = fileA.getCanonicalFile().getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", fileA));
                }
            }
            file = new File(Intrinsics.stringPlus(a().getAbsolutePath(), this.f20662f));
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                try {
                    Serializer<T> serializer = this.f20658b;
                    a aVar = new a(fileOutputStream3);
                    kVar.f20715p0 = this;
                    kVar.f20716q0 = file;
                    kVar.f20717r0 = fileOutputStream3;
                    kVar.f20718s0 = fileOutputStream3;
                    kVar.v0 = 1;
                    if (serializer.writeTo(t10, aVar, kVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    singleProcessDataStore = this;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } catch (IOException e5) {
                if (file.exists()) {
                    file.delete();
                }
                throw e5;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = kVar.f20718s0;
            fileOutputStream = kVar.f20717r0;
            file = kVar.f20716q0;
            singleProcessDataStore = kVar.f20715p0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th4;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(fileOutputStream, null);
        if (file.renameTo(singleProcessDataStore.a())) {
            return Unit.INSTANCE;
        }
        throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
    }

    public /* synthetic */ SingleProcessDataStore(Function0 function0, Serializer serializer, List list, CorruptionHandler corruptionHandler, CoroutineScope coroutineScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, serializer, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 8) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i10 & 16) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))) : coroutineScope);
    }
}
