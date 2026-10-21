package com.bbva.document.scanner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CaptureOptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JK\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/bbva/document/scanner/PreviewOptions;", "Landroid/os/Parcelable;", "", "component1", "Lcom/bbva/document/scanner/Ratio;", "component2", "component3", "component4", "component5", "", "component6", "path", "ratio", "titleText", "primaryButtonText", "secondaryButtonText", "allowRetry", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "q0", "Lcom/bbva/document/scanner/Ratio;", "getRatio", "()Lcom/bbva/document/scanner/Ratio;", "r0", "getTitleText", "s0", "getPrimaryButtonText", "t0", "getSecondaryButtonText", "u0", "Z", "getAllowRetry", "()Z", "<init>", "(Ljava/lang/String;Lcom/bbva/document/scanner/Ratio;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PreviewOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PreviewOptions> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String path;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Ratio ratio;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String titleText;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String primaryButtonText;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String secondaryButtonText;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public final boolean allowRetry;

    /* JADX INFO: compiled from: CaptureOptions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PreviewOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PreviewOptions createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PreviewOptions(parcel.readString(), Ratio.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PreviewOptions[] newArray(int i10) {
            return new PreviewOptions[i10];
        }
    }

    public PreviewOptions(@NotNull String path, @NotNull Ratio ratio, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        this.path = path;
        this.ratio = ratio;
        this.titleText = str;
        this.primaryButtonText = str2;
        this.secondaryButtonText = str3;
        this.allowRetry = z10;
    }

    public static /* synthetic */ PreviewOptions copy$default(PreviewOptions previewOptions, String str, Ratio ratio, String str2, String str3, String str4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = previewOptions.path;
        }
        if ((i10 & 2) != 0) {
            ratio = previewOptions.ratio;
        }
        Ratio ratio2 = ratio;
        if ((i10 & 4) != 0) {
            str2 = previewOptions.titleText;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = previewOptions.primaryButtonText;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = previewOptions.secondaryButtonText;
        }
        String str7 = str4;
        if ((i10 & 32) != 0) {
            z10 = previewOptions.allowRetry;
        }
        return previewOptions.copy(str, ratio2, str5, str6, str7, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Ratio getRatio() {
        return this.ratio;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getAllowRetry() {
        return this.allowRetry;
    }

    @NotNull
    public final PreviewOptions copy(@NotNull String path, @NotNull Ratio ratio, @Nullable String titleText, @Nullable String primaryButtonText, @Nullable String secondaryButtonText, boolean allowRetry) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        return new PreviewOptions(path, ratio, titleText, primaryButtonText, secondaryButtonText, allowRetry);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewOptions)) {
            return false;
        }
        PreviewOptions previewOptions = (PreviewOptions) other;
        return Intrinsics.areEqual(this.path, previewOptions.path) && Intrinsics.areEqual(this.ratio, previewOptions.ratio) && Intrinsics.areEqual(this.titleText, previewOptions.titleText) && Intrinsics.areEqual(this.primaryButtonText, previewOptions.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, previewOptions.secondaryButtonText) && this.allowRetry == previewOptions.allowRetry;
    }

    public final boolean getAllowRetry() {
        return this.allowRetry;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    @NotNull
    public final Ratio getRatio() {
        return this.ratio;
    }

    @Nullable
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    @Nullable
    public final String getTitleText() {
        return this.titleText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    public int hashCode() {
        int iHashCode = (this.ratio.hashCode() + (this.path.hashCode() * 31)) * 31;
        String str = this.titleText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.primaryButtonText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryButtonText;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z10 = this.allowRetry;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode4 + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PreviewOptions(path=");
        sb2.append(this.path);
        sb2.append(", ratio=");
        sb2.append(this.ratio);
        sb2.append(", titleText=");
        sb2.append(this.titleText);
        sb2.append(", primaryButtonText=");
        sb2.append(this.primaryButtonText);
        sb2.append(", secondaryButtonText=");
        sb2.append(this.secondaryButtonText);
        sb2.append(", allowRetry=");
        return i.c(sb2, this.allowRetry, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.path);
        this.ratio.writeToParcel(parcel, flags);
        parcel.writeString(this.titleText);
        parcel.writeString(this.primaryButtonText);
        parcel.writeString(this.secondaryButtonText);
        parcel.writeInt(this.allowRetry ? 1 : 0);
    }

    public /* synthetic */ PreviewOptions(String str, Ratio ratio, String str2, String str3, String str4, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? Ratio.INSTANCE.getCheck() : ratio, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? false : z10);
    }
}
