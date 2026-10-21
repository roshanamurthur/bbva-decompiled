package com.bbva.qrcreator.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Barcode.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, d2 = {"Lcom/bbva/qrcreator/model/Barcode;", "", "content", "", "format", "Lcom/bbva/qrcreator/model/BarcodeFormat;", "width", "", "height", "colorDark", "colorLight", "(Ljava/lang/String;Lcom/bbva/qrcreator/model/BarcodeFormat;IILjava/lang/String;Ljava/lang/String;)V", "getColorDark", "()Ljava/lang/String;", "getColorLight", "getContent", "getFormat", "()Lcom/bbva/qrcreator/model/BarcodeFormat;", "getHeight", "()I", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "qrcreator_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Barcode {

    @NotNull
    private final String colorDark;

    @NotNull
    private final String colorLight;

    @NotNull
    private final String content;

    @NotNull
    private final BarcodeFormat format;
    private final int height;
    private final int width;

    public Barcode(@NotNull String content, @NotNull BarcodeFormat format, int i10, int i11, @NotNull String colorDark, @NotNull String colorLight) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(colorDark, "colorDark");
        Intrinsics.checkNotNullParameter(colorLight, "colorLight");
        this.content = content;
        this.format = format;
        this.width = i10;
        this.height = i11;
        this.colorDark = colorDark;
        this.colorLight = colorLight;
    }

    public static /* synthetic */ Barcode copy$default(Barcode barcode, String str, BarcodeFormat barcodeFormat, int i10, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = barcode.content;
        }
        if ((i12 & 2) != 0) {
            barcodeFormat = barcode.format;
        }
        BarcodeFormat barcodeFormat2 = barcodeFormat;
        if ((i12 & 4) != 0) {
            i10 = barcode.width;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = barcode.height;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            str2 = barcode.colorDark;
        }
        String str4 = str2;
        if ((i12 & 32) != 0) {
            str3 = barcode.colorLight;
        }
        return barcode.copy(str, barcodeFormat2, i13, i14, str4, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BarcodeFormat getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getColorDark() {
        return this.colorDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getColorLight() {
        return this.colorLight;
    }

    @NotNull
    public final Barcode copy(@NotNull String content, @NotNull BarcodeFormat format, int width, int height, @NotNull String colorDark, @NotNull String colorLight) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(colorDark, "colorDark");
        Intrinsics.checkNotNullParameter(colorLight, "colorLight");
        return new Barcode(content, format, width, height, colorDark, colorLight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Barcode)) {
            return false;
        }
        Barcode barcode = (Barcode) other;
        return Intrinsics.areEqual(this.content, barcode.content) && this.format == barcode.format && this.width == barcode.width && this.height == barcode.height && Intrinsics.areEqual(this.colorDark, barcode.colorDark) && Intrinsics.areEqual(this.colorLight, barcode.colorLight);
    }

    @NotNull
    public final String getColorDark() {
        return this.colorDark;
    }

    @NotNull
    public final String getColorLight() {
        return this.colorLight;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final BarcodeFormat getFormat() {
        return this.format;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.colorLight.hashCode() + n1.c(this.colorDark, (((((this.format.hashCode() + (this.content.hashCode() * 31)) * 31) + this.width) * 31) + this.height) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.content;
        BarcodeFormat barcodeFormat = this.format;
        int i10 = this.width;
        int i11 = this.height;
        String str2 = this.colorDark;
        String str3 = this.colorLight;
        StringBuilder sb2 = new StringBuilder("Barcode(content=");
        sb2.append(str);
        sb2.append(", format=");
        sb2.append(barcodeFormat);
        sb2.append(", width=");
        sb2.append(i10);
        sb2.append(", height=");
        sb2.append(i11);
        sb2.append(", colorDark=");
        return c.b(sb2, str2, ", colorLight=", str3, ")");
    }

    public /* synthetic */ Barcode(String str, BarcodeFormat barcodeFormat, int i10, int i11, String str2, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, barcodeFormat, i10, i11, (i12 & 16) != 0 ? "#000000" : str2, (i12 & 32) != 0 ? "#ffffff" : str3);
    }
}
