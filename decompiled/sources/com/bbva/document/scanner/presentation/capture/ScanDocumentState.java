package com.bbva.document.scanner.presentation.capture;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScanDocumentViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState;", "", "()V", "Completed", "Error", "Loading", "Standby", "Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState$Completed;", "Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState$Error;", "Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState$Loading;", "Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState$Standby;", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ScanDocumentState {

    /* JADX INFO: compiled from: ScanDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState$Completed;", "Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState;", "Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "a", "Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "getScanResult", "()Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "scanResult", "<init>", "(Lcom/bbva/document/scanner/presentation/capture/ScanResult;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
    public static final class Completed extends ScanDocumentState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ScanResult scanResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(@NotNull ScanResult scanResult) {
            super(null);
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            this.scanResult = scanResult;
        }

        @NotNull
        public final ScanResult getScanResult() {
            return this.scanResult;
        }
    }

    /* JADX INFO: compiled from: ScanDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState$Error;", "Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState;", "Lcom/bbva/document/scanner/presentation/capture/ScanResult$ScanError;", "a", "Lcom/bbva/document/scanner/presentation/capture/ScanResult$ScanError;", "getScanResult", "()Lcom/bbva/document/scanner/presentation/capture/ScanResult$ScanError;", "scanResult", "<init>", "(Lcom/bbva/document/scanner/presentation/capture/ScanResult$ScanError;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
    public static final class Error extends ScanDocumentState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ScanResult.ScanError scanResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull ScanResult.ScanError scanResult) {
            super(null);
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            this.scanResult = scanResult;
        }

        @NotNull
        public final ScanResult.ScanError getScanResult() {
            return this.scanResult;
        }
    }

    /* JADX INFO: compiled from: ScanDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState$Loading;", "Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState;", "()V", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Loading extends ScanDocumentState {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        public Loading() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ScanDocumentViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState$Standby;", "Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState;", "()V", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Standby extends ScanDocumentState {

        @NotNull
        public static final Standby INSTANCE = new Standby();

        public Standby() {
            super(null);
        }
    }

    public ScanDocumentState() {
    }

    public /* synthetic */ ScanDocumentState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
