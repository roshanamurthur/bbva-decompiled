package com.bbva.plugin.localstorage.util;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.localstorage.Injector;
import com.bbva.plugin.localstorage.extension.ThrowableKt;
import com.bbva.plugin.localstorage.storage.Storage;
import com.bbva.plugin.localstorage.storage.StorageSecure;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Function.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¢\u0006\u0002\u0010\t\u001a$\u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¨\u0006\f"}, d2 = {"runClient", "", "volatile", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "block", "Lkotlin/Function1;", "Lcom/bbva/plugin/localstorage/storage/Storage;", "(Ljava/lang/Boolean;Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;Lkotlin/jvm/functions/Function1;)V", "runSecureClient", "Lcom/bbva/plugin/localstorage/storage/StorageSecure;", "local-storage-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFunction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Function.kt\ncom/bbva/plugin/localstorage/util/FunctionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class FunctionKt {
    public static final void runClient(@Nullable Boolean bool, @NotNull CommandCallback callback, @NotNull Function1<? super Storage, Unit> block) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                block.invoke(Injector.INSTANCE.getStorageVolatile$local_storage_plugin_release());
            } else {
                block.invoke(Injector.INSTANCE.getStorage$local_storage_plugin_release());
            }
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return;
        }
        ThrowableKt.manageException(thM5538exceptionOrNullimpl, callback);
    }

    public static /* synthetic */ void runClient$default(Boolean bool, CommandCallback commandCallback, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = Boolean.FALSE;
        }
        runClient(bool, commandCallback, function1);
    }

    public static final void runSecureClient(@NotNull CommandCallback callback, @NotNull Function1<? super StorageSecure, Unit> block) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            block.invoke(Injector.INSTANCE.getSecureStorage$local_storage_plugin_release());
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return;
        }
        ThrowableKt.manageException(thM5538exceptionOrNullimpl, callback);
    }
}
