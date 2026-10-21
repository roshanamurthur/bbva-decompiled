package com.bbva.document.scanner;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CaptureOptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b<\u0010=J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J[\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0018HÖ\u0001J\u0019\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'¨\u0006>"}, d2 = {"Lcom/bbva/document/scanner/CaptureOptions;", "Landroid/os/Parcelable;", "", "component1", "component2", "Lcom/bbva/document/scanner/Ratio;", "component3", "Lcom/bbva/document/scanner/NotificationConfig;", "component4", "Lcom/bbva/document/scanner/Compression;", "component5", "", "Lcom/bbva/document/scanner/ImageTransformation;", "component6", "component7", "output", "buttonText", "ratio", "notificationConfig", "compression", "transformations", "processingImageText", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getOutput", "()Ljava/lang/String;", "q0", "getButtonText", "r0", "Lcom/bbva/document/scanner/Ratio;", "getRatio", "()Lcom/bbva/document/scanner/Ratio;", "s0", "Lcom/bbva/document/scanner/NotificationConfig;", "getNotificationConfig", "()Lcom/bbva/document/scanner/NotificationConfig;", "t0", "Lcom/bbva/document/scanner/Compression;", "getCompression", "()Lcom/bbva/document/scanner/Compression;", "u0", "Ljava/util/List;", "getTransformations", "()Ljava/util/List;", "v0", "getProcessingImageText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/document/scanner/Ratio;Lcom/bbva/document/scanner/NotificationConfig;Lcom/bbva/document/scanner/Compression;Ljava/util/List;Ljava/lang/String;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CaptureOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CaptureOptions> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String output;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String buttonText;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Ratio ratio;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final NotificationConfig notificationConfig;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Compression compression;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<ImageTransformation> transformations;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    public final String processingImageText;

    /* JADX INFO: compiled from: CaptureOptions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CaptureOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CaptureOptions createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Ratio ratioCreateFromParcel = Ratio.CREATOR.createFromParcel(parcel);
            NotificationConfig notificationConfigCreateFromParcel = parcel.readInt() == 0 ? null : NotificationConfig.CREATOR.createFromParcel(parcel);
            Compression compressionCreateFromParcel = Compression.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(CaptureOptions.class.getClassLoader()));
            }
            return new CaptureOptions(string, string2, ratioCreateFromParcel, notificationConfigCreateFromParcel, compressionCreateFromParcel, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CaptureOptions[] newArray(int i10) {
            return new CaptureOptions[i10];
        }
    }

    public CaptureOptions(@NotNull String output, @Nullable String str, @NotNull Ratio ratio, @Nullable NotificationConfig notificationConfig, @NotNull Compression compression, @NotNull List<ImageTransformation> transformations, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        Intrinsics.checkNotNullParameter(compression, "compression");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        this.output = output;
        this.buttonText = str;
        this.ratio = ratio;
        this.notificationConfig = notificationConfig;
        this.compression = compression;
        this.transformations = transformations;
        this.processingImageText = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureOptions copy$default(CaptureOptions captureOptions, String str, String str2, Ratio ratio, NotificationConfig notificationConfig, Compression compression, List list, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = captureOptions.output;
        }
        if ((i10 & 2) != 0) {
            str2 = captureOptions.buttonText;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            ratio = captureOptions.ratio;
        }
        Ratio ratio2 = ratio;
        if ((i10 & 8) != 0) {
            notificationConfig = captureOptions.notificationConfig;
        }
        NotificationConfig notificationConfig2 = notificationConfig;
        if ((i10 & 16) != 0) {
            compression = captureOptions.compression;
        }
        Compression compression2 = compression;
        if ((i10 & 32) != 0) {
            list = captureOptions.transformations;
        }
        List list2 = list;
        if ((i10 & 64) != 0) {
            str3 = captureOptions.processingImageText;
        }
        return captureOptions.copy(str, str4, ratio2, notificationConfig2, compression2, list2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOutput() {
        return this.output;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Ratio getRatio() {
        return this.ratio;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Compression getCompression() {
        return this.compression;
    }

    @NotNull
    public final List<ImageTransformation> component6() {
        return this.transformations;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProcessingImageText() {
        return this.processingImageText;
    }

    @NotNull
    public final CaptureOptions copy(@NotNull String output, @Nullable String buttonText, @NotNull Ratio ratio, @Nullable NotificationConfig notificationConfig, @NotNull Compression compression, @NotNull List<ImageTransformation> transformations, @Nullable String processingImageText) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        Intrinsics.checkNotNullParameter(compression, "compression");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        return new CaptureOptions(output, buttonText, ratio, notificationConfig, compression, transformations, processingImageText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureOptions)) {
            return false;
        }
        CaptureOptions captureOptions = (CaptureOptions) other;
        return Intrinsics.areEqual(this.output, captureOptions.output) && Intrinsics.areEqual(this.buttonText, captureOptions.buttonText) && Intrinsics.areEqual(this.ratio, captureOptions.ratio) && Intrinsics.areEqual(this.notificationConfig, captureOptions.notificationConfig) && Intrinsics.areEqual(this.compression, captureOptions.compression) && Intrinsics.areEqual(this.transformations, captureOptions.transformations) && Intrinsics.areEqual(this.processingImageText, captureOptions.processingImageText);
    }

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final Compression getCompression() {
        return this.compression;
    }

    @Nullable
    public final NotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    @NotNull
    public final String getOutput() {
        return this.output;
    }

    @Nullable
    public final String getProcessingImageText() {
        return this.processingImageText;
    }

    @NotNull
    public final Ratio getRatio() {
        return this.ratio;
    }

    @NotNull
    public final List<ImageTransformation> getTransformations() {
        return this.transformations;
    }

    public int hashCode() {
        int iHashCode = this.output.hashCode() * 31;
        String str = this.buttonText;
        int iHashCode2 = (this.ratio.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        NotificationConfig notificationConfig = this.notificationConfig;
        int iA = a.a(this.transformations, (this.compression.hashCode() + ((iHashCode2 + (notificationConfig == null ? 0 : notificationConfig.hashCode())) * 31)) * 31, 31);
        String str2 = this.processingImageText;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CaptureOptions(output=");
        sb2.append(this.output);
        sb2.append(", buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", ratio=");
        sb2.append(this.ratio);
        sb2.append(", notificationConfig=");
        sb2.append(this.notificationConfig);
        sb2.append(", compression=");
        sb2.append(this.compression);
        sb2.append(", transformations=");
        sb2.append(this.transformations);
        sb2.append(", processingImageText=");
        return d.f(sb2, this.processingImageText, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.output);
        parcel.writeString(this.buttonText);
        this.ratio.writeToParcel(parcel, flags);
        NotificationConfig notificationConfig = this.notificationConfig;
        if (notificationConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationConfig.writeToParcel(parcel, flags);
        }
        this.compression.writeToParcel(parcel, flags);
        List<ImageTransformation> list = this.transformations;
        parcel.writeInt(list.size());
        Iterator<ImageTransformation> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
        parcel.writeString(this.processingImageText);
    }

    public /* synthetic */ CaptureOptions(String str, String str2, Ratio ratio, NotificationConfig notificationConfig, Compression compression, List list, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? Ratio.INSTANCE.getCheck() : ratio, (i10 & 8) != 0 ? null : notificationConfig, (i10 & 16) != 0 ? new Compression(null, 0, 3, null) : compression, (i10 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 64) == 0 ? str3 : null);
    }
}
