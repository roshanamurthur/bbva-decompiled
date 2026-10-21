package com.veridas.graphics;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageEncoding.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/veridas/graphics/ImageEncoding;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "GRAYSCALE", "YUV", "ARGB", "RGBA", "BGRA", "ABGR", "BGR", "RGB", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum ImageEncoding {
    GRAYSCALE(1),
    YUV(3),
    ARGB(5),
    RGBA(7),
    BGRA(11),
    ABGR(13),
    BGR(17),
    RGB(19);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int code;

    ImageEncoding(int i10) {
        this.code = i10;
    }

    @NotNull
    public static EnumEntries<ImageEncoding> getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }
}
