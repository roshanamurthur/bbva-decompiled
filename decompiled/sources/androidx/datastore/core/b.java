package androidx.datastore.core;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
public final class b extends SuspendLambda implements Function2<Object, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Iterator f20737p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DataMigration f20738q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Object f20739r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f20740s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public /* synthetic */ Object f20741t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ List<DataMigration<Object>> f20742u0;
    public final /* synthetic */ List<Function1<Continuation<? super Unit>, Object>> v0;

    /* JADX INFO: compiled from: DataMigrationInitializer.kt */
    @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f20743p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DataMigration<Object> f20744q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DataMigration<Object> dataMigration, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f20744q0 = dataMigration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new a(this.f20744q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f20743p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f20743p0 = 1;
                if (this.f20744q0.cleanUp(this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends DataMigration<Object>> list, List<Function1<Continuation<? super Unit>, Object>> list2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f20742u0 = list;
        this.v0 = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        b bVar = new b(this.f20742u0, this.v0, continuation);
        bVar.f20741t0 = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<Object> continuation) {
        return ((b) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
            int r1 = r10.f20740s0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.util.Iterator r1 = r10.f20737p0
            java.lang.Object r4 = r10.f20741t0
            java.util.List r4 = (java.util.List) r4
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r10
            goto L88
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            java.lang.Object r1 = r10.f20739r0
            androidx.datastore.core.DataMigration r4 = r10.f20738q0
            java.util.Iterator r5 = r10.f20737p0
            java.lang.Object r6 = r10.f20741t0
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r10
            r9 = r6
            r6 = r4
            r4 = r9
            goto L66
        L34:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f20741t0
            java.util.List<androidx.datastore.core.DataMigration<java.lang.Object>> r1 = r10.f20742u0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> r4 = r10.v0
            r5 = r10
        L44:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r1.next()
            androidx.datastore.core.DataMigration r6 = (androidx.datastore.core.DataMigration) r6
            r5.f20741t0 = r4
            r5.f20737p0 = r1
            r5.f20738q0 = r6
            r5.f20739r0 = r11
            r5.f20740s0 = r3
            java.lang.Object r7 = r6.shouldMigrate(r11, r5)
            if (r7 != r0) goto L61
            return r0
        L61:
            r9 = r1
            r1 = r11
            r11 = r7
            r7 = r5
            r5 = r9
        L66:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L8a
            androidx.datastore.core.b$a r11 = new androidx.datastore.core.b$a
            r8 = 0
            r11.<init>(r6, r8)
            r4.add(r11)
            r7.f20741t0 = r4
            r7.f20737p0 = r5
            r7.f20738q0 = r8
            r7.f20739r0 = r8
            r7.f20740s0 = r2
            java.lang.Object r11 = r6.migrate(r1, r7)
            if (r11 != r0) goto L8b
            return r0
        L88:
            r5 = r7
            goto L44
        L8a:
            r11 = r1
        L8b:
            r1 = r5
            goto L88
        L8d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
