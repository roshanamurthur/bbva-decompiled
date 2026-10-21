package com.google.mlkit.vision.barcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public class BarcodeScannerOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Executor f49491b;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49492a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Executor f49493b;

        @NonNull
        public BarcodeScannerOptions build() {
            return new BarcodeScannerOptions(this.f49492a, this.f49493b);
        }

        @NonNull
        public Builder setBarcodeFormats(@Barcode.BarcodeFormat int i10, @NonNull @Barcode.BarcodeFormat int... iArr) {
            this.f49492a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f49492a = i11 | this.f49492a;
                }
            }
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.f49493b = executor;
            return this;
        }
    }

    public /* synthetic */ BarcodeScannerOptions(int i10, Executor executor) {
        this.f49490a = i10;
        this.f49491b = executor;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarcodeScannerOptions)) {
            return false;
        }
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        return this.f49490a == barcodeScannerOptions.f49490a && Objects.equal(this.f49491b, barcodeScannerOptions.f49491b);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f49490a), this.f49491b);
    }

    public final int zza() {
        return this.f49490a;
    }

    @Nullable
    public final Executor zzb() {
        return this.f49491b;
    }
}
