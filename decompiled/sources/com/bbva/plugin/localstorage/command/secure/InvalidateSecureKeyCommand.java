package com.bbva.plugin.localstorage.command.secure;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.localstorage.params.InvalidateSecureKeyParam;
import com.bbva.plugin.localstorage.storage.StorageSecure;
import com.bbva.plugin.localstorage.util.ParamsValidator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InvalidateSecureKeyCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/localstorage/command/secure/InvalidateSecureKeyCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/localstorage/params/InvalidateSecureKeyParam;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InvalidateSecureKeyCommand extends AbstractCommand<InvalidateSecureKeyParam> implements CoroutineScope {

    @NotNull
    public static final String ID = "invalidatesecurekey";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35782p0;

    /* JADX INFO: compiled from: InvalidateSecureKeyCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.localstorage.command.secure.InvalidateSecureKeyCommand$execute$1", f = "InvalidateSecureKeyCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<StorageSecure, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35783p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InvalidateSecureKeyParam f35784q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35785r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InvalidateSecureKeyParam invalidateSecureKeyParam, CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35784q0 = invalidateSecureKeyParam;
            this.f35785r0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f35784q0, this.f35785r0, continuation);
            aVar.f35783p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(StorageSecure storageSecure, Continuation<? super Unit> continuation) {
            return ((a) create(storageSecure, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            StorageSecure storageSecure = (StorageSecure) this.f35783p0;
            String key = this.f35784q0.getKey();
            Intrinsics.checkNotNull(key);
            storageSecure.remove(key);
            this.f35785r0.sendEvent();
            return Unit.INSTANCE;
        }
    }

    public InvalidateSecureKeyCommand() {
        super(InvalidateSecureKeyParam.class, new ParamsValidator());
        this.f35782p0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35782p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull InvalidateSecureKeyParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.bbva.plugin.localstorage.extension.CoroutineScopeKt.launch(this, callback, new a(params, callback, null));
    }
}
