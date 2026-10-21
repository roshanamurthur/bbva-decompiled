package com.bbva.plugin.localstorage.extension;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.localstorage.Injector;
import com.bbva.plugin.localstorage.storage.StorageSecure;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a@\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"launch", "", "Lkotlinx/coroutines/CoroutineScope;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "block", "Lkotlin/Function2;", "Lcom/bbva/plugin/localstorage/storage/StorageSecure;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/CoroutineScope;Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;Lkotlin/jvm/functions/Function2;)V", "local-storage-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineScopeKt {

    /* JADX INFO: compiled from: CoroutineScope.kt */
    @DebugMetadata(c = "com.bbva.plugin.localstorage.extension.CoroutineScopeKt$launch$1", f = "CoroutineScope.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCoroutineScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScope.kt\ncom/bbva/plugin/localstorage/extension/CoroutineScopeKt$launch$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35796p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f35797q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<StorageSecure, Continuation<? super Unit>, Object> f35798r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35799s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super StorageSecure, ? super Continuation<? super Unit>, ? extends Object> function2, CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35798r0 = function2;
            this.f35799s0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f35798r0, this.f35799s0, continuation);
            aVar.f35797q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35796p0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2<StorageSecure, Continuation<? super Unit>, Object> function2 = this.f35798r0;
                    Result.Companion companion = Result.INSTANCE;
                    StorageSecure secureStorage$local_storage_plugin_release = Injector.INSTANCE.getSecureStorage$local_storage_plugin_release();
                    this.f35796p0 = 1;
                    if (function2.invoke(secureStorage$local_storage_plugin_release, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                ThrowableKt.manageException(thM5538exceptionOrNullimpl, this.f35799s0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void launch(@NotNull CoroutineScope coroutineScope, @NotNull CommandCallback callback, @NotNull Function2<? super StorageSecure, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(block, callback, null), 3, null);
    }
}
