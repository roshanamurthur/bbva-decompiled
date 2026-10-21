package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteCompat;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/room/CoroutinesRoom;", "", "()V", "Companion", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class CoroutinesRoom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    @NotNull
    public static final <R> Flow<R> createFlow(@NotNull RoomDatabase roomDatabase, boolean z10, @NotNull String[] strArr, @NotNull Callable<R> callable) {
        return INSTANCE.createFlow(roomDatabase, z10, strArr, callable);
    }

    @JvmStatic
    @Nullable
    public static final <R> Object execute(@NotNull RoomDatabase roomDatabase, boolean z10, @Nullable CancellationSignal cancellationSignal, @NotNull Callable<R> callable, @NotNull Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z10, cancellationSignal, callable, continuation);
    }

    @JvmStatic
    @Nullable
    public static final <R> Object execute(@NotNull RoomDatabase roomDatabase, boolean z10, @NotNull Callable<R> callable, @NotNull Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z10, callable, continuation);
    }

    /* JADX INFO: compiled from: CoroutinesRoom.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\r\u0012\t\u0012\u0007H\u0005¢\u0006\u0002\b\u00060\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0007¢\u0006\u0002\u0010\u0010J?\u0010\u0011\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J5\u0010\u0011\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "()V", "createFlow", "Lkotlinx/coroutines/flow/Flow;", "R", "Lkotlin/jvm/JvmSuppressWildcards;", "db", "Landroidx/room/RoomDatabase;", "inTransaction", "", "tableNames", "", "", "callable", "Ljava/util/concurrent/Callable;", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/Flow;", "execute", "cancellationSignal", "Landroid/os/CancellationSignal;", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutinesRoom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n*L\n84#1:163,11\n*E\n"})
    public static final class Companion {

        /* JADX INFO: Add missing generic type declarations: [R] */
        /* JADX INFO: compiled from: CoroutinesRoom.kt */
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Callable<R> f23172p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Callable<R> callable, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f23172p0 = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f23172p0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Object obj) {
                return ((a) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return this.f23172p0.call();
            }
        }

        /* JADX INFO: compiled from: CoroutinesRoom.kt */
        public static final class b extends Lambda implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ CancellationSignal f23173p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Job f23174q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CancellationSignal cancellationSignal, Job job) {
                super(1);
                this.f23173p0 = cancellationSignal;
                this.f23174q0 = job;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Throwable th2) {
                CancellationSignal cancellationSignal = this.f23173p0;
                if (cancellationSignal != null) {
                    SupportSQLiteCompat.Api16Impl.cancel(cancellationSignal);
                }
                Job.DefaultImpls.cancel$default(this.f23174q0, (CancellationException) null, 1, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: CoroutinesRoom.kt */
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Callable<R> f23175p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ CancellableContinuation<R> f23176q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(Callable<R> callable, CancellableContinuation<? super R> cancellableContinuation, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f23175p0 = callable;
                this.f23176q0 = cancellableContinuation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.f23175p0, this.f23176q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Continuation continuation = this.f23176q0;
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                try {
                    continuation.resumeWith(Result.m5535constructorimpl(this.f23175p0.call()));
                } catch (Throwable th2) {
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(th2)));
                }
                return Unit.INSTANCE;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final <R> Flow<R> createFlow(@NotNull RoomDatabase db2, boolean inTransaction, @NotNull String[] tableNames, @NotNull Callable<R> callable) {
            return FlowKt.flow(new CoroutinesRoom$Companion$createFlow$1(inTransaction, db2, tableNames, callable, null));
        }

        @JvmStatic
        @Nullable
        public final <R> Object execute(@NotNull RoomDatabase roomDatabase, boolean z10, @NotNull Callable<R> callable, @NotNull Continuation<? super R> continuation) {
            ContinuationInterceptor transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) continuation.getF79378p0().get(TransactionElement.INSTANCE);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                transactionDispatcher = z10 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return BuildersKt.withContext(transactionDispatcher, new a(callable, null), continuation);
        }

        @JvmStatic
        @Nullable
        public final <R> Object execute(@NotNull RoomDatabase roomDatabase, boolean z10, @Nullable CancellationSignal cancellationSignal, @NotNull Callable<R> callable, @NotNull Continuation<? super R> continuation) throws Throwable {
            ContinuationInterceptor transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) continuation.getF79378p0().get(TransactionElement.INSTANCE);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                transactionDispatcher = z10 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            ContinuationInterceptor continuationInterceptor = transactionDispatcher;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            cancellableContinuationImpl.invokeOnCancellation(new b(cancellationSignal, BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, continuationInterceptor, null, new c(callable, cancellableContinuationImpl, null), 2, null)));
            Object result = cancellableContinuationImpl.getResult();
            if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }
}
