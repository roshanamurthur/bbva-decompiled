package com.vasco.digipass.sdk.utils.qrcodescanner;

import android.graphics.Rect;
import android.media.Image;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes9.dex */
public class QRCodeScannerSDK {

    public static class QRCodeScannerSDKDecodingResultData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f65845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f65846b;

        public String getScannedImageData() {
            return this.f65846b;
        }

        public int getScannedImageFormat() {
            return this.f65845a;
        }

        private QRCodeScannerSDKDecodingResultData(String str, int i10) {
            this.f65846b = str;
            this.f65845a = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    public static QRCodeScannerSDKDecodingResultData decodeImage(Image image, int i10) throws LinkageError, QRCodeScannerSDKException {
        String str;
        try {
            System.loadLibrary("QRCronto");
            int i11 = 1;
            if (i10 < 1 || i10 > 3) {
                throw new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.INVALID_CODE_TYPE);
            }
            if (image == null) {
                throw new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.INVALID_IMAGE);
            }
            int i12 = 2;
            if ((i10 & 2) == 2) {
                com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.d dVar = new com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.d(image, new Rect(0, 0, image.getWidth(), image.getHeight()));
                str = QRCodeScannerSDKJNIWrapper.DecodeCrontoImage(dVar.a(), dVar.c(), dVar.b());
                if (str != null) {
                }
                if (str == null || (i10 & 1) != 1) {
                    i11 = i12;
                } else {
                    com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.b bVar = new com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.b(image);
                    bVar.a(new Rect(0, 0, image.getWidth(), image.getHeight()));
                    byte[] bArrDecodeQRImage = QRCodeScannerSDKJNIWrapper.DecodeQRImage(bVar.a(), bVar.c(), bVar.b());
                    if (bArrDecodeQRImage != null) {
                        str = new String(bArrDecodeQRImage, StandardCharsets.UTF_8);
                    } else {
                        i11 = i12;
                    }
                }
                return new QRCodeScannerSDKDecodingResultData(str, i11);
            }
            str = null;
            i12 = -1;
            if (str == null) {
                i11 = i12;
            } else {
                i11 = i12;
            }
            return new QRCodeScannerSDKDecodingResultData(str, i11);
        } catch (QRCodeScannerSDKException e5) {
            throw e5;
        } catch (Exception e7) {
            e = e7;
            throw new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.INVALID_IMAGE, e);
        } catch (UnsatisfiedLinkError e10) {
            e = e10;
            throw new QRCodeScannerSDKException(QRCodeScannerSDKErrorCodes.INVALID_IMAGE, e);
        }
    }
}
