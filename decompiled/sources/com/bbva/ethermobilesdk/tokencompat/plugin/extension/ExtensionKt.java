package com.bbva.ethermobilesdk.tokencompat.plugin.extension;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.ethermobile.help.kit.error.ResultErrorType;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extension.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u0002¨\u0006\u000b"}, d2 = {"isMalformedParam", "", "", "isMalformedTokenType", "manageException", "", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "toTokenType", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "ethertoken-compat-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExtensionKt {
    public static final boolean isMalformedParam(@Nullable String str) {
        return str == null || str.length() == 0 || str == null || l.isBlank(str) || Intrinsics.areEqual(str, AbstractJsonLexerKt.NULL);
    }

    public static final boolean isMalformedTokenType(@Nullable String str) {
        if (str == null) {
            return false;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return !((Intrinsics.areEqual(upperCase, TokenType.CHROTP.name()) || Intrinsics.areEqual(upperCase, TokenType.HOTP.name())) ? true : Intrinsics.areEqual(upperCase, TokenType.TOTP.name()));
    }

    public static final void manageException(@NotNull Throwable th2, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(th2 instanceof ResultErrorType)) {
            callback.sendError(Errors.ErrorDefault);
        } else {
            ResultErrorType resultErrorType = (ResultErrorType) th2;
            callback.sendError(SimpleResponse.error(resultErrorType.getCode(), resultErrorType.getMessage()));
        }
    }

    @Nullable
    public static final TokenType toTokenType(@Nullable String str) {
        if (str != null) {
            return TokenType.valueOf(str);
        }
        return null;
    }
}
