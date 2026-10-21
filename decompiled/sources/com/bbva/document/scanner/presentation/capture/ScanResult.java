package com.bbva.document.scanner.presentation.capture;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScanResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "Landroid/os/Parcelable;", "()V", "ScanCancelled", "ScanError", "ScanSuccess", "Lcom/bbva/document/scanner/presentation/capture/ScanResult$ScanCancelled;", "Lcom/bbva/document/scanner/presentation/capture/ScanResult$ScanError;", "Lcom/bbva/document/scanner/presentation/capture/ScanResult$ScanSuccess;", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ScanResult implements Parcelable {

    /* JADX INFO: compiled from: ScanResult.kt */
    @Parcelize
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanResult$ScanCancelled;", "Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ScanCancelled extends ScanResult {

        @NotNull
        public static final ScanCancelled INSTANCE = new ScanCancelled();

        @NotNull
        public static final Parcelable.Creator<ScanCancelled> CREATOR = new Creator();

        /* JADX INFO: compiled from: ScanResult.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ScanCancelled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ScanCancelled createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ScanCancelled.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ScanCancelled[] newArray(int i10) {
                return new ScanCancelled[i10];
            }
        }

        public ScanCancelled() {
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

    /* JADX INFO: compiled from: ScanResult.kt */
    @Parcelize
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanResult$ScanError;", "Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "", "p0", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "<init>", "(Ljava/lang/String;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
    public static final class ScanError extends ScanResult {

        @NotNull
        public static final Parcelable.Creator<ScanError> CREATOR = new Creator();

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorMessage;

        /* JADX INFO: compiled from: ScanResult.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ScanError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ScanError createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScanError(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ScanError[] newArray(int i10) {
                return new ScanError[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScanError(@NotNull String errorMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.errorMessage);
        }
    }

    /* JADX INFO: compiled from: ScanResult.kt */
    @Parcelize
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanResult$ScanSuccess;", "Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "", "p0", "Ljava/lang/String;", "getFile", "()Ljava/lang/String;", "file", "<init>", "(Ljava/lang/String;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
    public static final class ScanSuccess extends ScanResult {

        @NotNull
        public static final Parcelable.Creator<ScanSuccess> CREATOR = new Creator();

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String file;

        /* JADX INFO: compiled from: ScanResult.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ScanSuccess> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ScanSuccess createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScanSuccess(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ScanSuccess[] newArray(int i10) {
                return new ScanSuccess[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScanSuccess(@NotNull String file) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String getFile() {
            return this.file;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.file);
        }
    }

    public ScanResult() {
    }

    public /* synthetic */ ScanResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
