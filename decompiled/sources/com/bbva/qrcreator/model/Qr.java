package com.bbva.qrcreator.model;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Qr.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006)"}, d2 = {"Lcom/bbva/qrcreator/model/Qr;", "", "content", "", "width", "", "height", "correctionLevel", "Lcom/bbva/qrcreator/model/QrCorrelation;", "colorDark", "colorLight", "margin", "logo", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;IILcom/bbva/qrcreator/model/QrCorrelation;Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/Bitmap;)V", "getColorDark", "()Ljava/lang/String;", "getColorLight", "getContent", "getCorrectionLevel", "()Lcom/bbva/qrcreator/model/QrCorrelation;", "getHeight", "()I", "getLogo", "()Landroid/graphics/Bitmap;", "getMargin", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "qrcreator_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Qr {

    @NotNull
    private final String colorDark;

    @NotNull
    private final String colorLight;

    @NotNull
    private final String content;

    @NotNull
    private final QrCorrelation correctionLevel;
    private final int height;

    @Nullable
    private final Bitmap logo;
    private final int margin;
    private final int width;

    public Qr(@NotNull String content, int i10, int i11, @NotNull QrCorrelation correctionLevel, @NotNull String colorDark, @NotNull String colorLight, int i12, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(correctionLevel, "correctionLevel");
        Intrinsics.checkNotNullParameter(colorDark, "colorDark");
        Intrinsics.checkNotNullParameter(colorLight, "colorLight");
        this.content = content;
        this.width = i10;
        this.height = i11;
        this.correctionLevel = correctionLevel;
        this.colorDark = colorDark;
        this.colorLight = colorLight;
        this.margin = i12;
        this.logo = bitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final QrCorrelation getCorrectionLevel() {
        return this.correctionLevel;
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

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMargin() {
        return this.margin;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Bitmap getLogo() {
        return this.logo;
    }

    @NotNull
    public final Qr copy(@NotNull String content, int width, int height, @NotNull QrCorrelation correctionLevel, @NotNull String colorDark, @NotNull String colorLight, int margin, @Nullable Bitmap logo) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(correctionLevel, "correctionLevel");
        Intrinsics.checkNotNullParameter(colorDark, "colorDark");
        Intrinsics.checkNotNullParameter(colorLight, "colorLight");
        return new Qr(content, width, height, correctionLevel, colorDark, colorLight, margin, logo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Qr)) {
            return false;
        }
        Qr qr = (Qr) other;
        return Intrinsics.areEqual(this.content, qr.content) && this.width == qr.width && this.height == qr.height && this.correctionLevel == qr.correctionLevel && Intrinsics.areEqual(this.colorDark, qr.colorDark) && Intrinsics.areEqual(this.colorLight, qr.colorLight) && this.margin == qr.margin && Intrinsics.areEqual(this.logo, qr.logo);
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
    public final QrCorrelation getCorrectionLevel() {
        return this.correctionLevel;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final Bitmap getLogo() {
        return this.logo;
    }

    public final int getMargin() {
        return this.margin;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iC = (n1.c(this.colorLight, n1.c(this.colorDark, (this.correctionLevel.hashCode() + (((((this.content.hashCode() * 31) + this.width) * 31) + this.height) * 31)) * 31, 31), 31) + this.margin) * 31;
        Bitmap bitmap = this.logo;
        return iC + (bitmap == null ? 0 : bitmap.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.content;
        int i10 = this.width;
        int i11 = this.height;
        QrCorrelation qrCorrelation = this.correctionLevel;
        String str2 = this.colorDark;
        String str3 = this.colorLight;
        int i12 = this.margin;
        Bitmap bitmap = this.logo;
        StringBuilder sb2 = new StringBuilder("Qr(content=");
        sb2.append(str);
        sb2.append(", width=");
        sb2.append(i10);
        sb2.append(", height=");
        sb2.append(i11);
        sb2.append(", correctionLevel=");
        sb2.append(qrCorrelation);
        sb2.append(", colorDark=");
        k.e(sb2, str2, ", colorLight=", str3, ", margin=");
        sb2.append(i12);
        sb2.append(", logo=");
        sb2.append(bitmap);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ Qr(String str, int i10, int i11, QrCorrelation qrCorrelation, String str2, String str3, int i12, Bitmap bitmap, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, qrCorrelation, (i13 & 16) != 0 ? "#000000" : str2, (i13 & 32) != 0 ? "#ffffff" : str3, (i13 & 64) != 0 ? 0 : i12, (i13 & 128) != 0 ? null : bitmap);
    }
}
