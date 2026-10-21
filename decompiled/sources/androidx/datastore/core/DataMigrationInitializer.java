package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Companion", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DataMigrationInitializer<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: DataMigrationInitializer.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J[\u0010\r\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", SqlContracts.TokenEntry.API, "Lkotlin/coroutines/Continuation;", "", "getInitializer", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: compiled from: DataMigrationInitializer.kt */
        @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<InitializerApi<T>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f20642p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f20643q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ List<DataMigration<T>> f20644r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends DataMigration<T>> list, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f20644r0 = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.f20644r0, continuation);
                aVar.f20643q0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((a) create((InitializerApi) obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f20642p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InitializerApi initializerApi = (InitializerApi) this.f20643q0;
                    Companion companion = DataMigrationInitializer.INSTANCE;
                    this.f20642p0 = 1;
                    if (Companion.access$runMigrations(companion, this.f20644r0, initializerApi, this) == coroutine_suspended) {
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

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0073  */
        /* JADX WARN: Code duplicated, block: B:37:0x009e  */
        /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x006d->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008a -> B:25:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008d -> B:25:0x006d). Please report as a decompilation issue!!! */
        public static final Object access$runMigrations(Companion companion, List list, InitializerApi initializerApi, Continuation continuation) throws Throwable {
            androidx.datastore.core.a aVar;
            List list2;
            Iterator<T> it;
            Ref.ObjectRef objectRef;
            Throwable th2;
            Function1 function1;
            companion.getClass();
            if (continuation instanceof androidx.datastore.core.a) {
                aVar = (androidx.datastore.core.a) continuation;
                int i10 = aVar.f20736t0;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f20736t0 = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new androidx.datastore.core.a(companion, continuation);
                }
            } else {
                aVar = new androidx.datastore.core.a(companion, continuation);
            }
            Object obj = aVar.f20734r0;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = aVar.f20736t0;
            if (i11 != 0) {
                if (i11 == 1) {
                    list2 = (List) aVar.f20732p0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = aVar.f20733q0;
                    objectRef = (Ref.ObjectRef) aVar.f20732p0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable 
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        r5.getClass()
                        boolean r0 = r8 instanceof androidx.datastore.core.a
                        if (r0 == 0) goto L16
                        r0 = r8
                        androidx.datastore.core.a r0 = (androidx.datastore.core.a) r0
                        int r1 = r0.f20736t0
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L16
                        int r1 = r1 - r2
                        r0.f20736t0 = r1
                        goto L1b
                    L16:
                        androidx.datastore.core.a r0 = new androidx.datastore.core.a
                        r0.<init>(r5, r8)
                    L1b:
                        java.lang.Object r5 = r0.f20734r0
                        java.lang.Object r8 = ek.a.getCOROUTINE_SUSPENDED()
                        int r1 = r0.f20736t0
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L47
                        if (r1 == r3) goto L3f
                        if (r1 != r2) goto L37
                        java.util.Iterator r6 = r0.f20733q0
                        java.io.Serializable r7 = r0.f20732p0
                        kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                        kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L35
                        goto L6d
                    L35:
                        r5 = move-exception
                        goto L86
                    L37:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L3f:
                        java.io.Serializable r6 = r0.f20732p0
                        java.util.List r6 = (java.util.List) r6
                        kotlin.ResultKt.throwOnFailure(r5)
                        goto L61
                    L47:
                        kotlin.ResultKt.throwOnFailure(r5)
                        java.util.ArrayList r5 = new java.util.ArrayList
                        r5.<init>()
                        androidx.datastore.core.b r1 = new androidx.datastore.core.b
                        r4 = 0
                        r1.<init>(r6, r5, r4)
                        r0.f20732p0 = r5
                        r0.f20736t0 = r3
                        java.lang.Object r6 = r7.updateData(r1, r0)
                        if (r6 != r8) goto L60
                        goto La0
                    L60:
                        r6 = r5
                    L61:
                        kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
                        r5.<init>()
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.Iterator r6 = r6.iterator()
                        r7 = r5
                    L6d:
                        boolean r5 = r6.hasNext()
                        if (r5 == 0) goto L98
                        java.lang.Object r5 = r6.next()
                        kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
                        r0.f20732p0 = r7     // Catch: java.lang.Throwable -> L35
                        r0.f20733q0 = r6     // Catch: java.lang.Throwable -> L35
                        r0.f20736t0 = r2     // Catch: java.lang.Throwable -> L35
                        java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L35
                        if (r5 != r8) goto L6d
                        goto La0
                    L86:
                        T r1 = r7.element
                        if (r1 != 0) goto L8d
                        r7.element = r5
                        goto L6d
                    L8d:
                        kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                        T r1 = r7.element
                        java.lang.Throwable r1 = (java.lang.Throwable) r1
                        ak.b.addSuppressed(r1, r5)
                        goto L6d
                    L98:
                        T r5 = r7.element
                        java.lang.Throwable r5 = (java.lang.Throwable) r5
                        if (r5 != 0) goto La1
                        kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    La0:
                        return r8
                    La1:
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.access$runMigrations(androidx.datastore.core.DataMigrationInitializer$Companion, java.util.List, androidx.datastore.core.InitializerApi, kotlin.coroutines.Continuation):java.lang.Object");
                }

                @NotNull
                public final <T> Function2<InitializerApi<T>, Continuation<? super Unit>, Object> getInitializer(@NotNull List<? extends DataMigration<T>> migrations) {
                    Intrinsics.checkNotNullParameter(migrations, "migrations");
                    return new a(migrations, null);
                }
            }
        }
