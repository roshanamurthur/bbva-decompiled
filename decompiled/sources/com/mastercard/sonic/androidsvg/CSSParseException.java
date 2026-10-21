package com.mastercard.sonic.androidsvg;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CSSParseException.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", NotificationCompat.CATEGORY_MESSAGE, "", "cause", "(Ljava/lang/String;Ljava/lang/Exception;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CSSParseException extends Exception {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CSSParseException(@NotNull String msg) {
        this(msg, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public /* synthetic */ CSSParseException(String str, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CSSParseException(@NotNull String msg, @Nullable Exception exc) {
        super(msg, exc);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
