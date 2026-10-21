package com.bbva.ethermobilesdk.tokencompat.plugin;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.plugin.extension.ExtensionKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¨\u0006\b"}, d2 = {"runClient", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "tokenCompat", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompat;", "block", "Lkotlin/Function1;", "ethertoken-compat-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InjectorKt {
    public static final void runClient(@NotNull CommandCallback callback, @NotNull TokenCompat tokenCompat, @NotNull Function1<? super TokenCompat, Unit> block) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(tokenCompat, "tokenCompat");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            block.invoke(tokenCompat);
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return;
        }
        ExtensionKt.manageException(thM5538exceptionOrNullimpl, callback);
    }
}
