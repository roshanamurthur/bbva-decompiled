package com.veridas.di;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.veridas.resource.database.BlockingResourcesDatabase;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import com.veridas.resource.database.IResourcesDatabase;
import com.veridas.resource.database.factory.AndroidResourcesDatabaseFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CommonLibraryDepInjector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/veridas/di/CommonLibraryDepInjector;", "", "()V", "blockingResourcesDatabaseLazy", "Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "lock", "resourcesDatabaseLazy", "Lcom/veridas/resource/database/IResourcesDatabase;", "getBlockingResourcesDatabase", "context", "Landroid/content/Context;", "getResourcesDatabase", "initialize", "", "warmup", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class CommonLibraryDepInjector {

    @Nullable
    private static volatile IBlockingResourcesDatabase blockingResourcesDatabaseLazy;

    @Nullable
    private static volatile IResourcesDatabase resourcesDatabaseLazy;

    @NotNull
    public static final CommonLibraryDepInjector INSTANCE = new CommonLibraryDepInjector();

    @NotNull
    private static final Object lock = new Object();

    /* JADX INFO: compiled from: CommonLibraryDepInjector.kt */
    @DebugMetadata(c = "com.veridas.di.CommonLibraryDepInjector$initialize$1", f = "CommonLibraryDepInjector.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCommonLibraryDepInjector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonLibraryDepInjector.kt\ncom/veridas/di/CommonLibraryDepInjector$initialize$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public IResourcesDatabase f67059p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f67060q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Context f67061r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f67061r0 = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f67061r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IResourcesDatabase iResourcesDatabase;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f67060q0;
            Context context = this.f67061r0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (CommonLibraryDepInjector.resourcesDatabaseLazy == null) {
                    IResourcesDatabase iResourcesDatabaseCreate = new AndroidResourcesDatabaseFactory(context).create();
                    this.f67059p0 = iResourcesDatabaseCreate;
                    this.f67060q0 = 1;
                    if (iResourcesDatabaseCreate.init(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iResourcesDatabase = iResourcesDatabaseCreate;
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iResourcesDatabase = this.f67059p0;
            ResultKt.throwOnFailure(obj);
            CommonLibraryDepInjector.resourcesDatabaseLazy = iResourcesDatabase;
            CommonLibraryDepInjector.blockingResourcesDatabaseLazy = new BlockingResourcesDatabase(CommonLibraryDepInjector.getResourcesDatabase(context));
            return Unit.INSTANCE;
        }
    }

    private CommonLibraryDepInjector() {
    }

    @JvmStatic
    @NotNull
    public static final IBlockingResourcesDatabase getBlockingResourcesDatabase(@NotNull Context context) {
        IBlockingResourcesDatabase iBlockingResourcesDatabase;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (lock) {
            INSTANCE.initialize(context);
            iBlockingResourcesDatabase = blockingResourcesDatabaseLazy;
            if (iBlockingResourcesDatabase == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return iBlockingResourcesDatabase;
    }

    @JvmStatic
    @NotNull
    public static final IResourcesDatabase getResourcesDatabase(@NotNull Context context) {
        IResourcesDatabase iResourcesDatabase;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (lock) {
            INSTANCE.initialize(context);
            iResourcesDatabase = resourcesDatabaseLazy;
            if (iResourcesDatabase == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return iResourcesDatabase;
    }

    private final void initialize(Context context) throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new a(context, null), 1, null);
    }

    @JvmStatic
    public static final void warmup(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (lock) {
            INSTANCE.initialize(context);
            Unit unit = Unit.INSTANCE;
        }
    }
}
