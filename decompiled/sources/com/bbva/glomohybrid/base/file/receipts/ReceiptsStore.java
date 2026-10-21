package com.bbva.glomohybrid.base.file.receipts;

import androidx.lifecycle.LifecycleObserver;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReceiptsStore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/base/file/receipts/ReceiptsStore;", "Landroidx/lifecycle/LifecycleObserver;", "", "encodedReceipt", "name", "Lcom/bbva/glomoutils/Either;", "", "create", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Lazy;", "Ljava/io/File;", "receiptsDir", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "threadDispatchers", "<init>", "(Lkotlin/Lazy;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class ReceiptsStore implements LifecycleObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy<File> f31370p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f31371q0;

    /* JADX INFO: compiled from: ReceiptsStore.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.file.receipts.ReceiptsStore$create$2", f = "ReceiptsStore.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Either<? extends Throwable, ? extends String>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31372p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f31374r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f31375s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31374r0 = str;
            this.f31375s0 = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ReceiptsStore.this.new a(this.f31374r0, this.f31375s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Either<? extends Throwable, ? extends String>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31372p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31372p0 = 1;
                obj = ReceiptsStore.access$getImageFromBase64(ReceiptsStore.this, this.f31374r0, this.f31375s0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            return str == null ? EitherKt.left(new Throwable()) : EitherKt.right(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiptsStore(@NotNull Lazy<? extends File> receiptsDir, @NotNull ThreadDispatchers threadDispatchers) {
        Intrinsics.checkNotNullParameter(receiptsDir, "receiptsDir");
        Intrinsics.checkNotNullParameter(threadDispatchers, "threadDispatchers");
        this.f31370p0 = receiptsDir;
        this.f31371q0 = threadDispatchers;
    }

    public static final String access$buildFileName(ReceiptsStore receiptsStore, String str) {
        receiptsStore.getClass();
        String str2 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return androidx.camera.core.impl.utils.a.b(str, str2, ".png");
    }

    public static final Object access$getImageFromBase64(ReceiptsStore receiptsStore, String str, String str2, Continuation continuation) {
        return BuildersKt.withContext(receiptsStore.f31371q0.io(), new d8.a(receiptsStore, str2, str, null), continuation);
    }

    @Nullable
    public final Object create(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Either<? extends Throwable, String>> continuation) {
        return BuildersKt.withContext(this.f31371q0.io(), new a(str, str2, null), continuation);
    }

    public /* synthetic */ ReceiptsStore(Lazy lazy, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazy, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
