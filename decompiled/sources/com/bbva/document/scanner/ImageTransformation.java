package com.bbva.document.scanner;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CaptureOptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B#\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/bbva/document/scanner/ImageTransformation;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "", "component1", "", "", "component2", "transformationId", "parameters", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "p0", "Ljava/lang/String;", "getTransformationId", "()Ljava/lang/String;", "q0", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "(Landroid/os/Parcel;)V", "CREATOR", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ImageTransformation implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String transformationId;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> parameters;

    /* JADX INFO: renamed from: com.bbva.document.scanner.ImageTransformation$CREATOR, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CaptureOptions.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/document/scanner/ImageTransformation$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bbva/document/scanner/ImageTransformation;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bbva/document/scanner/ImageTransformation;", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<ImageTransformation> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ImageTransformation createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImageTransformation(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ImageTransformation[] newArray(int size) {
            return new ImageTransformation[size];
        }
    }

    public ImageTransformation(@NotNull String transformationId, @NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(transformationId, "transformationId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.transformationId = transformationId;
        this.parameters = parameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageTransformation copy$default(ImageTransformation imageTransformation, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = imageTransformation.transformationId;
        }
        if ((i10 & 2) != 0) {
            map = imageTransformation.parameters;
        }
        return imageTransformation.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransformationId() {
        return this.transformationId;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.parameters;
    }

    @NotNull
    public final ImageTransformation copy(@NotNull String transformationId, @NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(transformationId, "transformationId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new ImageTransformation(transformationId, parameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageTransformation)) {
            return false;
        }
        ImageTransformation imageTransformation = (ImageTransformation) other;
        return Intrinsics.areEqual(this.transformationId, imageTransformation.transformationId) && Intrinsics.areEqual(this.parameters, imageTransformation.parameters);
    }

    @NotNull
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getTransformationId() {
        return this.transformationId;
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.transformationId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ImageTransformation(transformationId=" + this.transformationId + ", parameters=" + this.parameters + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.transformationId);
        parcel.writeBundle(CaptureOptionsKt.access$toBundle(this.parameters));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageTransformation(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        string = string == null ? "" : string;
        Bundle bundle = parcel.readBundle(ClassLoader.getSystemClassLoader());
        Map mapAccess$asMap = bundle != null ? CaptureOptionsKt.access$asMap(bundle) : null;
        this(string, mapAccess$asMap == null ? q.emptyMap() : mapAccess$asMap);
    }
}
