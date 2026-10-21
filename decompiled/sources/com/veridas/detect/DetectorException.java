package com.veridas.detect;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DetectorException.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/veridas/detect/DetectorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class DetectorException extends Exception {
    public DetectorException(@Nullable String str) {
        super(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectorException(@Nullable String str, @NotNull Throwable cause) {
        super(str, cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
