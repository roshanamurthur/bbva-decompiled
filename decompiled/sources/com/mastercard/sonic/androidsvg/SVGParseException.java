package com.mastercard.sonic.androidsvg;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: SVGParseException.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGParseException;", "Lorg/xml/sax/SAXException;", NotificationCompat.CATEGORY_MESSAGE, "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SVGParseException extends SAXException {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SVGParseException(@NotNull String msg) {
        this(msg, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public /* synthetic */ SVGParseException(String str, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGParseException(@NotNull String msg, @Nullable Exception exc) {
        super(msg, exc);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
