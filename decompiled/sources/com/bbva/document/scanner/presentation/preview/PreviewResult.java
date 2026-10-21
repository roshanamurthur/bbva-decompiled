package com.bbva.document.scanner.presentation.preview;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.plugin.localstorage.util.ConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PreviewResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/document/scanner/presentation/preview/PreviewResult;", "Landroid/os/Parcelable;", "()V", ConstantKt.BIOMETRIC_NEGATIVE_BUTTON, "Error", "Retry", "Success", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult$Cancel;", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult$Error;", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult$Retry;", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult$Success;", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PreviewResult implements Parcelable {

    /* JADX INFO: compiled from: PreviewResult.kt */
    @Parcelize
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/bbva/document/scanner/presentation/preview/PreviewResult$Cancel;", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Cancel extends PreviewResult {

        @NotNull
        public static final Cancel INSTANCE = new Cancel();

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();

        /* JADX INFO: compiled from: PreviewResult.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Cancel> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Cancel createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancel.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Cancel[] newArray(int i10) {
                return new Cancel[i10];
            }
        }

        public Cancel() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: PreviewResult.kt */
    @Parcelize
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/document/scanner/presentation/preview/PreviewResult$Error;", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "", "p0", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "error", "<init>", "(Ljava/lang/String;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
    public static final class Error extends PreviewResult {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new Creator();

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String error;

        /* JADX INFO: compiled from: PreviewResult.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Error createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Error[] newArray(int i10) {
                return new Error[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.error);
        }
    }

    /* JADX INFO: compiled from: PreviewResult.kt */
    @Parcelize
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/bbva/document/scanner/presentation/preview/PreviewResult$Retry;", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Retry extends PreviewResult {

        @NotNull
        public static final Retry INSTANCE = new Retry();

        @NotNull
        public static final Parcelable.Creator<Retry> CREATOR = new Creator();

        /* JADX INFO: compiled from: PreviewResult.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Retry> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Retry createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Retry.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Retry[] newArray(int i10) {
                return new Retry[i10];
            }
        }

        public Retry() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: PreviewResult.kt */
    @Parcelize
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/document/scanner/presentation/preview/PreviewResult$Success;", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "", "p0", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "uri", "<init>", "(Ljava/lang/String;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
    public static final class Success extends PreviewResult {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new Creator();

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String uri;

        /* JADX INFO: compiled from: PreviewResult.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Success createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Success[] newArray(int i10) {
                return new Success[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String uri) {
            super(null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.uri);
        }
    }

    public PreviewResult() {
    }

    public /* synthetic */ PreviewResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
