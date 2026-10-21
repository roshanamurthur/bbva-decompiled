package com.bbva.ethermobilesdk.plugin.command.factory;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.cipher.utils.HexadecimalCharacters;
import com.bbva.ethermobilesdk.plugin.extension.ExtensionKt;
import com.bbva.ethermobilesdk.plugin.param.HexToBase64Param;
import com.bbva.ethermobilesdk.plugin.util.ParamsValidator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HexToBase64Command.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/command/factory/HexToBase64Command;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/plugin/param/HexToBase64Param;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HexToBase64Command extends AbstractCommand<HexToBase64Param> {

    @NotNull
    public static final String ID = "hextobase64";

    public HexToBase64Command() {
        super(HexToBase64Param.class, new ParamsValidator());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:3:0x000a, B:5:0x002a, B:7:0x0030, B:13:0x0041, B:10:0x0037, B:12:0x003d), top: B:21:0x000a }] */
    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull HexToBase64Param params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        String base64;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            String data = params.getData();
            Intrinsics.checkNotNull(data);
            String lowerCase = data.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            byte[] bArrHexStringToByteArray = EncodingUtilsKt.hexStringToByteArray(lowerCase, HexadecimalCharacters.LOWERCASE);
            Boolean urlSafe = params.getUrlSafe();
            if (urlSafe == null) {
                base64 = EncodingUtilsKt.toBase64(bArrHexStringToByteArray);
            } else {
                base64 = urlSafe.booleanValue() ? EncodingUtilsKt.toBase64UrlSafe(bArrHexStringToByteArray) : EncodingUtilsKt.toBase64(bArrHexStringToByteArray);
                if (base64 == null) {
                    base64 = EncodingUtilsKt.toBase64(bArrHexStringToByteArray);
                }
            }
            callback.sendEvent(base64);
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
