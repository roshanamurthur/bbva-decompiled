package com.bbva.ethermobilesdk.plugin.command.factory;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.cipher.utils.HexadecimalCharacters;
import com.bbva.ethermobilesdk.plugin.extension.ExtensionKt;
import com.bbva.ethermobilesdk.plugin.param.Base64ToHexParam;
import com.bbva.ethermobilesdk.plugin.util.ParamsValidator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64ToHexCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/command/factory/Base64ToHexCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/plugin/param/Base64ToHexParam;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Base64ToHexCommand extends AbstractCommand<Base64ToHexParam> {

    @NotNull
    public static final String ID = "base64tohex";

    public Base64ToHexCommand() {
        super(Base64ToHexParam.class, new ParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull Base64ToHexParam params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            String data = params.getData();
            Intrinsics.checkNotNull(data);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            callback.sendEvent(EncodingUtilsKt.toHex(bytes, HexadecimalCharacters.LOWERCASE));
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return;
        }
        ExtensionKt.manageException(thM5538exceptionOrNullimpl, ID, callback);
    }
}
