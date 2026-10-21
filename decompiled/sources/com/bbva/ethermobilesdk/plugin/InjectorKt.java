package com.bbva.ethermobilesdk.plugin;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.cipher.jwe.CipherAlgorithm;
import com.bbva.ethermobilesdk.cipher.jwe.JweCipher;
import com.bbva.ethermobilesdk.cipher.pincipher.PinCipher;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.plugin.extension.ExtensionKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0000\u001a4\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\tH\u0000\u001a,\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\tH\u0000¨\u0006\u0011"}, d2 = {"runJweCipherClient", "", "cipherAlgorithm", "Lcom/bbva/ethermobilesdk/cipher/jwe/CipherAlgorithm;", "commandId", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "block", "Lkotlin/Function1;", "Lcom/bbva/ethermobilesdk/cipher/jwe/JweCipher;", "runPinCipherClient", "context", "Landroid/content/Context;", "Lcom/bbva/ethermobilesdk/cipher/pincipher/PinCipher;", "runSoftCipherClient", "Lcom/bbva/ethermobilesdk/cipher/softcipher/SoftCipher;", "cipher-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInjector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Injector.kt\ncom/bbva/ethermobilesdk/plugin/InjectorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class InjectorKt {
    public static final void runJweCipherClient(@NotNull CipherAlgorithm cipherAlgorithm, @NotNull String commandId, @NotNull CommandCallback callback, @NotNull Function1<? super JweCipher, Unit> block) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(cipherAlgorithm, "cipherAlgorithm");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            block.invoke(Injector.INSTANCE.getJweCipherClient(cipherAlgorithm));
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return;
        }
        ExtensionKt.manageException(thM5538exceptionOrNullimpl, commandId, callback);
    }

    public static final void runPinCipherClient(@NotNull Context context, @NotNull String commandId, @NotNull CommandCallback callback, @NotNull Function1<? super PinCipher, Unit> block) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            block.invoke(Injector.INSTANCE.getPinCipherClient(context));
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return;
        }
        ExtensionKt.manageException(thM5538exceptionOrNullimpl, commandId, callback);
    }

    public static final void runSoftCipherClient(@NotNull String commandId, @NotNull CommandCallback callback, @NotNull Function1<? super SoftCipher, Unit> block) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            block.invoke(Injector.INSTANCE.getSoftCipherClient());
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return;
        }
        ExtensionKt.manageException(thM5538exceptionOrNullimpl, commandId, callback);
    }
}
