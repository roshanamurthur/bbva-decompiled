package com.google.android.libraries.barhopper;

import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByNative;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
@UsedByNative("jni_common.cc")
public class RecognitionOptions {
    public static final int AZTEC = 4096;
    public static final int CODABAR = 8;
    public static final int CODE_128 = 1;
    public static final int CODE_39 = 2;
    public static final int CODE_93 = 4;
    public static final int DATA_MATRIX = 16;
    public static final int EAN_13 = 32;
    public static final int EAN_8 = 64;
    public static final int ITF = 128;
    public static final int PDF417 = 2048;
    public static final int QR_CODE = 256;
    public static final int TEZ_CODE = 32768;
    public static final int UNRECOGNIZED = 0;
    public static final int UPC_A = 512;
    public static final int UPC_E = 1024;

    @UsedByNative("jni_common.cc")
    private int barcodeFormats = 0;

    @UsedByNative("jni_common.cc")
    private boolean outputUnrecognizedBarcodes = false;

    @UsedByNative("jni_common.cc")
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();

    public int getBarcodeFormats() {
        return this.barcodeFormats;
    }

    @NonNull
    public OnedRecognitionOptions getOnedRecognitionOptions() {
        return this.onedRecognitionOptions;
    }

    public boolean getOutputUnrecognizedBarcodes() {
        return this.outputUnrecognizedBarcodes;
    }

    public void setBarcodeFormats(int i10) {
        this.barcodeFormats = i10;
    }

    public void setOnedRecognitionOptions(@NonNull OnedRecognitionOptions onedRecognitionOptions) {
        this.onedRecognitionOptions = onedRecognitionOptions;
    }

    public void setOutputUnrecognizedBarcodes(boolean z10) {
        this.outputUnrecognizedBarcodes = z10;
    }
}
