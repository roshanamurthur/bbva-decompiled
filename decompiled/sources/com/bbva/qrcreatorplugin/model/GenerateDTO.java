package com.bbva.qrcreatorplugin.model;

import ad.d;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.qrcreator.model.Barcode;
import com.bbva.qrcreator.model.BarcodeFormat;
import com.bbva.qrcreator.model.Qr;
import com.bbva.qrcreator.model.QrCorrelation;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GenerateDTO.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jx\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015¨\u0006."}, d2 = {"Lcom/bbva/qrcreatorplugin/model/GenerateDTO;", "", "format", "", "content", "width", "", "height", "correctionLevel", "colorDark", "colorLight", "margin", "logo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getColorDark", "()Ljava/lang/String;", "getColorLight", "getContent", "getCorrectionLevel", "getFormat", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLogo", "getMargin", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/bbva/qrcreatorplugin/model/GenerateDTO;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toBarcode", "Lcom/bbva/qrcreator/model/Barcode;", "toQr", "Lcom/bbva/qrcreator/model/Qr;", "toString", "qrcreator-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GenerateDTO {

    @Nullable
    private final String colorDark;

    @Nullable
    private final String colorLight;

    @Nullable
    private final String content;

    @NotNull
    private final String correctionLevel;

    @Nullable
    private final String format;

    @Nullable
    private final Integer height;

    @Nullable
    private final String logo;

    @Nullable
    private final Integer margin;

    @Nullable
    private final Integer width;

    public GenerateDTO(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @NotNull String correctionLevel, @Nullable String str3, @Nullable String str4, @Nullable Integer num3, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(correctionLevel, "correctionLevel");
        this.format = str;
        this.content = str2;
        this.width = num;
        this.height = num2;
        this.correctionLevel = correctionLevel;
        this.colorDark = str3;
        this.colorLight = str4;
        this.margin = num3;
        this.logo = str5;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCorrectionLevel() {
        return this.correctionLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getColorDark() {
        return this.colorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getColorLight() {
        return this.colorLight;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getMargin() {
        return this.margin;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final GenerateDTO copy(@Nullable String format, @Nullable String content, @Nullable Integer width, @Nullable Integer height, @NotNull String correctionLevel, @Nullable String colorDark, @Nullable String colorLight, @Nullable Integer margin, @Nullable String logo) {
        Intrinsics.checkNotNullParameter(correctionLevel, "correctionLevel");
        return new GenerateDTO(format, content, width, height, correctionLevel, colorDark, colorLight, margin, logo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateDTO)) {
            return false;
        }
        GenerateDTO generateDTO = (GenerateDTO) other;
        return Intrinsics.areEqual(this.format, generateDTO.format) && Intrinsics.areEqual(this.content, generateDTO.content) && Intrinsics.areEqual(this.width, generateDTO.width) && Intrinsics.areEqual(this.height, generateDTO.height) && Intrinsics.areEqual(this.correctionLevel, generateDTO.correctionLevel) && Intrinsics.areEqual(this.colorDark, generateDTO.colorDark) && Intrinsics.areEqual(this.colorLight, generateDTO.colorLight) && Intrinsics.areEqual(this.margin, generateDTO.margin) && Intrinsics.areEqual(this.logo, generateDTO.logo);
    }

    @Nullable
    public final String getColorDark() {
        return this.colorDark;
    }

    @Nullable
    public final String getColorLight() {
        return this.colorLight;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getCorrectionLevel() {
        return this.correctionLevel;
    }

    @Nullable
    public final String getFormat() {
        return this.format;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final Integer getMargin() {
        return this.margin;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.format;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iC = n1.c(this.correctionLevel, (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        String str3 = this.colorDark;
        int iHashCode4 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.colorLight;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.margin;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.logo;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public final Barcode toBarcode() {
        String str = this.content;
        Intrinsics.checkNotNull(str);
        String str2 = this.format;
        Intrinsics.checkNotNull(str2);
        String upperCase = str2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        BarcodeFormat barcodeFormatValueOf = BarcodeFormat.valueOf(upperCase);
        Integer num = this.width;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Integer num2 = this.height;
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        String str3 = this.colorDark;
        if (str3 == null) {
            str3 = "#000000";
        }
        String str4 = str3;
        String str5 = this.colorLight;
        if (str5 == null) {
            str5 = "#ffffff";
        }
        return new Barcode(str, barcodeFormatValueOf, iIntValue, iIntValue2, str4, str5);
    }

    @NotNull
    public final Qr toQr() {
        Bitmap bitmapDecodeByteArray;
        String str = this.logo;
        if (str != null) {
            byte[] bArrDecode = Base64.decode(str, 0);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } else {
            bitmapDecodeByteArray = null;
        }
        Bitmap bitmap = bitmapDecodeByteArray;
        String str2 = this.content;
        Intrinsics.checkNotNull(str2);
        Integer num = this.width;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Integer num2 = this.height;
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        QrCorrelation qrCorrelationValueOf = QrCorrelation.valueOf(this.correctionLevel);
        String str3 = this.colorDark;
        if (str3 == null) {
            str3 = "#000000";
        }
        String str4 = str3;
        String str5 = this.colorLight;
        if (str5 == null) {
            str5 = "#ffffff";
        }
        String str6 = str5;
        Integer num3 = this.margin;
        return new Qr(str2, iIntValue, iIntValue2, qrCorrelationValueOf, str4, str6, num3 != null ? num3.intValue() : 0, bitmap);
    }

    @NotNull
    public String toString() {
        String str = this.format;
        String str2 = this.content;
        Integer num = this.width;
        Integer num2 = this.height;
        String str3 = this.correctionLevel;
        String str4 = this.colorDark;
        String str5 = this.colorLight;
        Integer num3 = this.margin;
        String str6 = this.logo;
        StringBuilder sbC = a.c("GenerateDTO(format=", str, ", content=", str2, ", width=");
        sbC.append(num);
        sbC.append(", height=");
        sbC.append(num2);
        sbC.append(", correctionLevel=");
        k.e(sbC, str3, ", colorDark=", str4, ", colorLight=");
        sbC.append(str5);
        sbC.append(", margin=");
        sbC.append(num3);
        sbC.append(", logo=");
        return d.f(sbC, str6, ")");
    }
}
