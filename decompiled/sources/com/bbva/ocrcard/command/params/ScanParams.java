package com.bbva.ocrcard.command.params;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScanParams.kt */
/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\t\u00102\u001a\u000203HÖ\u0001J\u0013\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000203HÖ\u0001J\t\u00108\u001a\u00020\u000bHÖ\u0001J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000203HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u0006>"}, d2 = {"Lcom/bbva/ocrcard/command/params/ScanParams;", "Landroid/os/Parcelable;", "requireExpiry", "", "requireCVV", "requirePostalCode", "suppressManual", "restrictPostalCodeToNumericOnly", "keepApplicationTheme", "requireCardholderName", "scanInstructions", "", "noCamera", "scanExpiry", "languageOrLocale", "guideColor", "suppressConfirmation", "suppressScan", "(ZZZZZZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZ)V", "getGuideColor", "()Ljava/lang/String;", "getKeepApplicationTheme", "()Z", "getLanguageOrLocale", "getNoCamera", "getRequireCVV", "getRequireCardholderName", "getRequireExpiry", "getRequirePostalCode", "getRestrictPostalCodeToNumericOnly", "getScanExpiry", "getScanInstructions", "getSuppressConfirmation", "getSuppressManual", "getSuppressScan", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ocrcard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ScanParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScanParams> CREATOR = new Creator();

    @NotNull
    private final String guideColor;
    private final boolean keepApplicationTheme;

    @NotNull
    private final String languageOrLocale;
    private final boolean noCamera;
    private final boolean requireCVV;
    private final boolean requireCardholderName;
    private final boolean requireExpiry;
    private final boolean requirePostalCode;
    private final boolean restrictPostalCodeToNumericOnly;
    private final boolean scanExpiry;

    @NotNull
    private final String scanInstructions;
    private final boolean suppressConfirmation;
    private final boolean suppressManual;
    private final boolean suppressScan;

    /* JADX INFO: compiled from: ScanParams.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScanParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ScanParams createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScanParams(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ScanParams[] newArray(int i10) {
            return new ScanParams[i10];
        }
    }

    public ScanParams(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @NotNull String scanInstructions, boolean z17, boolean z18, @NotNull String languageOrLocale, @NotNull String guideColor, boolean z19, boolean z20) {
        Intrinsics.checkNotNullParameter(scanInstructions, "scanInstructions");
        Intrinsics.checkNotNullParameter(languageOrLocale, "languageOrLocale");
        Intrinsics.checkNotNullParameter(guideColor, "guideColor");
        this.requireExpiry = z10;
        this.requireCVV = z11;
        this.requirePostalCode = z12;
        this.suppressManual = z13;
        this.restrictPostalCodeToNumericOnly = z14;
        this.keepApplicationTheme = z15;
        this.requireCardholderName = z16;
        this.scanInstructions = scanInstructions;
        this.noCamera = z17;
        this.scanExpiry = z18;
        this.languageOrLocale = languageOrLocale;
        this.guideColor = guideColor;
        this.suppressConfirmation = z19;
        this.suppressScan = z20;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRequireExpiry() {
        return this.requireExpiry;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getScanExpiry() {
        return this.scanExpiry;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLanguageOrLocale() {
        return this.languageOrLocale;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getGuideColor() {
        return this.guideColor;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getSuppressConfirmation() {
        return this.suppressConfirmation;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getSuppressScan() {
        return this.suppressScan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRequireCVV() {
        return this.requireCVV;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRequirePostalCode() {
        return this.requirePostalCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSuppressManual() {
        return this.suppressManual;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getRestrictPostalCodeToNumericOnly() {
        return this.restrictPostalCodeToNumericOnly;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getKeepApplicationTheme() {
        return this.keepApplicationTheme;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getRequireCardholderName() {
        return this.requireCardholderName;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getScanInstructions() {
        return this.scanInstructions;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getNoCamera() {
        return this.noCamera;
    }

    @NotNull
    public final ScanParams copy(boolean requireExpiry, boolean requireCVV, boolean requirePostalCode, boolean suppressManual, boolean restrictPostalCodeToNumericOnly, boolean keepApplicationTheme, boolean requireCardholderName, @NotNull String scanInstructions, boolean noCamera, boolean scanExpiry, @NotNull String languageOrLocale, @NotNull String guideColor, boolean suppressConfirmation, boolean suppressScan) {
        Intrinsics.checkNotNullParameter(scanInstructions, "scanInstructions");
        Intrinsics.checkNotNullParameter(languageOrLocale, "languageOrLocale");
        Intrinsics.checkNotNullParameter(guideColor, "guideColor");
        return new ScanParams(requireExpiry, requireCVV, requirePostalCode, suppressManual, restrictPostalCodeToNumericOnly, keepApplicationTheme, requireCardholderName, scanInstructions, noCamera, scanExpiry, languageOrLocale, guideColor, suppressConfirmation, suppressScan);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanParams)) {
            return false;
        }
        ScanParams scanParams = (ScanParams) other;
        return this.requireExpiry == scanParams.requireExpiry && this.requireCVV == scanParams.requireCVV && this.requirePostalCode == scanParams.requirePostalCode && this.suppressManual == scanParams.suppressManual && this.restrictPostalCodeToNumericOnly == scanParams.restrictPostalCodeToNumericOnly && this.keepApplicationTheme == scanParams.keepApplicationTheme && this.requireCardholderName == scanParams.requireCardholderName && Intrinsics.areEqual(this.scanInstructions, scanParams.scanInstructions) && this.noCamera == scanParams.noCamera && this.scanExpiry == scanParams.scanExpiry && Intrinsics.areEqual(this.languageOrLocale, scanParams.languageOrLocale) && Intrinsics.areEqual(this.guideColor, scanParams.guideColor) && this.suppressConfirmation == scanParams.suppressConfirmation && this.suppressScan == scanParams.suppressScan;
    }

    @NotNull
    public final String getGuideColor() {
        return this.guideColor;
    }

    public final boolean getKeepApplicationTheme() {
        return this.keepApplicationTheme;
    }

    @NotNull
    public final String getLanguageOrLocale() {
        return this.languageOrLocale;
    }

    public final boolean getNoCamera() {
        return this.noCamera;
    }

    public final boolean getRequireCVV() {
        return this.requireCVV;
    }

    public final boolean getRequireCardholderName() {
        return this.requireCardholderName;
    }

    public final boolean getRequireExpiry() {
        return this.requireExpiry;
    }

    public final boolean getRequirePostalCode() {
        return this.requirePostalCode;
    }

    public final boolean getRestrictPostalCodeToNumericOnly() {
        return this.restrictPostalCodeToNumericOnly;
    }

    public final boolean getScanExpiry() {
        return this.scanExpiry;
    }

    @NotNull
    public final String getScanInstructions() {
        return this.scanInstructions;
    }

    public final boolean getSuppressConfirmation() {
        return this.suppressConfirmation;
    }

    public final boolean getSuppressManual() {
        return this.suppressManual;
    }

    public final boolean getSuppressScan() {
        return this.suppressScan;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public int hashCode() {
        boolean z10 = this.requireExpiry;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.requireCVV;
        ?? r3 = z11;
        if (z11) {
            r3 = 1;
        }
        int i11 = (i10 + r3) * 31;
        boolean z12 = this.requirePostalCode;
        ?? r4 = z12;
        if (z12) {
            r4 = 1;
        }
        int i12 = (i11 + r4) * 31;
        boolean z13 = this.suppressManual;
        ?? r10 = z13;
        if (z13) {
            r10 = 1;
        }
        int i13 = (i12 + r10) * 31;
        boolean z14 = this.restrictPostalCodeToNumericOnly;
        ?? r11 = z14;
        if (z14) {
            r11 = 1;
        }
        int i14 = (i13 + r11) * 31;
        boolean z15 = this.keepApplicationTheme;
        ?? r12 = z15;
        if (z15) {
            r12 = 1;
        }
        int i15 = (i14 + r12) * 31;
        boolean z16 = this.requireCardholderName;
        ?? r13 = z16;
        if (z16) {
            r13 = 1;
        }
        int iC = n1.c(this.scanInstructions, (i15 + r13) * 31, 31);
        boolean z17 = this.noCamera;
        ?? r14 = z17;
        if (z17) {
            r14 = 1;
        }
        int i16 = (iC + r14) * 31;
        boolean z18 = this.scanExpiry;
        ?? r15 = z18;
        if (z18) {
            r15 = 1;
        }
        int iC2 = n1.c(this.guideColor, n1.c(this.languageOrLocale, (i16 + r15) * 31, 31), 31);
        boolean z19 = this.suppressConfirmation;
        ?? r16 = z19;
        if (z19) {
            r16 = 1;
        }
        int i17 = (iC2 + r16) * 31;
        boolean z20 = this.suppressScan;
        return i17 + (z20 ? 1 : z20);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScanParams(requireExpiry=");
        sb2.append(this.requireExpiry);
        sb2.append(", requireCVV=");
        sb2.append(this.requireCVV);
        sb2.append(", requirePostalCode=");
        sb2.append(this.requirePostalCode);
        sb2.append(", suppressManual=");
        sb2.append(this.suppressManual);
        sb2.append(", restrictPostalCodeToNumericOnly=");
        sb2.append(this.restrictPostalCodeToNumericOnly);
        sb2.append(", keepApplicationTheme=");
        sb2.append(this.keepApplicationTheme);
        sb2.append(", requireCardholderName=");
        sb2.append(this.requireCardholderName);
        sb2.append(", scanInstructions=");
        sb2.append(this.scanInstructions);
        sb2.append(", noCamera=");
        sb2.append(this.noCamera);
        sb2.append(", scanExpiry=");
        sb2.append(this.scanExpiry);
        sb2.append(", languageOrLocale=");
        sb2.append(this.languageOrLocale);
        sb2.append(", guideColor=");
        sb2.append(this.guideColor);
        sb2.append(", suppressConfirmation=");
        sb2.append(this.suppressConfirmation);
        sb2.append(", suppressScan=");
        return a.d(sb2, this.suppressScan, RootService.CLOSE_BRACKET);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.requireExpiry ? 1 : 0);
        parcel.writeInt(this.requireCVV ? 1 : 0);
        parcel.writeInt(this.requirePostalCode ? 1 : 0);
        parcel.writeInt(this.suppressManual ? 1 : 0);
        parcel.writeInt(this.restrictPostalCodeToNumericOnly ? 1 : 0);
        parcel.writeInt(this.keepApplicationTheme ? 1 : 0);
        parcel.writeInt(this.requireCardholderName ? 1 : 0);
        parcel.writeString(this.scanInstructions);
        parcel.writeInt(this.noCamera ? 1 : 0);
        parcel.writeInt(this.scanExpiry ? 1 : 0);
        parcel.writeString(this.languageOrLocale);
        parcel.writeString(this.guideColor);
        parcel.writeInt(this.suppressConfirmation ? 1 : 0);
        parcel.writeInt(this.suppressScan ? 1 : 0);
    }
}
