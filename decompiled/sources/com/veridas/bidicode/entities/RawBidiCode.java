package com.veridas.bidicode.entities;

import android.graphics.Rect;
import androidx.constraintlayout.core.parser.a;
import com.veridas.lib.entities.resources.bidicode.BidiType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RawBidiCode.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/veridas/bidicode/entities/RawBidiCode;", "", "", "toString", "Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "a", "Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "getType", "()Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "type", "b", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "data", "Landroid/graphics/Rect;", "c", "Landroid/graphics/Rect;", "getRegion", "()Landroid/graphics/Rect;", "region", "<init>", "(Lcom/veridas/lib/entities/resources/bidicode/BidiType;Ljava/lang/String;Landroid/graphics/Rect;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class RawBidiCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BidiType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Rect region;

    public RawBidiCode(@NotNull BidiType type, @Nullable String str, @NotNull Rect region) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(region, "region");
        this.type = type;
        this.data = str;
        this.region = region;
        this.data = str == null ? "" : str;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final Rect getRegion() {
        return this.region;
    }

    @NotNull
    public final BidiType getType() {
        return this.type;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbC = a.c("Bidi code type: ", this.type.getBidiName(), " \nraw text: ", this.data, " and \nregion: ");
        sbC.append(this.region);
        return sbC.toString();
    }
}
