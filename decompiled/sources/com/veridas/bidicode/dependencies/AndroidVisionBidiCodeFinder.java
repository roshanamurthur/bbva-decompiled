package com.veridas.bidicode.dependencies;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.barcode.Barcode;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.common.InputImage;
import com.veridas.bidicode.entities.RawBidiCode;
import com.veridas.lib.entities.resources.bidicode.BidiType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidVisionBidiCodeFinder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/veridas/bidicode/dependencies/AndroidVisionBidiCodeFinder;", "Lcom/veridas/bidicode/dependencies/BidiCodeFinder;", "Ljava/nio/ByteBuffer;", "yuvData", "", "dataWidth", "dataHeight", "", "Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "toBeFoundBidiCodeTypes", "Lcom/veridas/bidicode/entities/RawBidiCode;", "search", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "()V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class AndroidVisionBidiCodeFinder implements BidiCodeFinder {
    public static ArrayList a(List list) {
        if (!(!list.isEmpty())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Barcode barcode = (Barcode) it.next();
            BidiType bidiTypeMapBarcodeFormat2BidiCodeType = AndroidVisionMapper.INSTANCE.mapBarcodeFormat2BidiCodeType(barcode.getFormat());
            if (bidiTypeMapBarcodeFormat2BidiCodeType == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String rawValue = barcode.getRawValue();
            Rect boundingBox = barcode.getBoundingBox();
            if (boundingBox == null) {
                boundingBox = new Rect();
            }
            arrayList.add(new RawBidiCode(bidiTypeMapBarcodeFormat2BidiCodeType, rawValue, boundingBox));
        }
        return arrayList;
    }

    public static ArrayList b(InputImage inputImage, List list) {
        BarcodeScannerOptions barcodeScannerOptionsBuild;
        if (list.size() > 1) {
            int iMapBidiCodeType2BarcodeFormat = AndroidVisionMapper.INSTANCE.mapBidiCodeType2BarcodeFormat((BidiType) list.get(0));
            List listSubList = list.subList(1, list.size());
            int size = listSubList.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = AndroidVisionMapper.INSTANCE.mapBidiCodeType2BarcodeFormat((BidiType) listSubList.get(i10));
            }
            barcodeScannerOptionsBuild = new BarcodeScannerOptions.Builder().setBarcodeFormats(iMapBidiCodeType2BarcodeFormat, Arrays.copyOf(iArr, size)).build();
            Intrinsics.checkNotNullExpressionValue(barcodeScannerOptionsBuild, "build(...)");
        } else {
            barcodeScannerOptionsBuild = new BarcodeScannerOptions.Builder().setBarcodeFormats(AndroidVisionMapper.INSTANCE.mapBidiCodeType2BarcodeFormat((BidiType) list.get(0)), new int[0]).build();
            Intrinsics.checkNotNullExpressionValue(barcodeScannerOptionsBuild, "build(...)");
        }
        BarcodeScanner client = BarcodeScanning.getClient(barcodeScannerOptionsBuild);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        Task<List<com.google.mlkit.vision.barcode.common.Barcode>> taskProcess = client.process(inputImage);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        List list2 = (List) Tasks.await(taskProcess);
        Intrinsics.checkNotNull(list2);
        ArrayList arrayListA = a(list2);
        client.close();
        return arrayListA;
    }

    @Override // com.veridas.bidicode.dependencies.BidiCodeFinder
    @Nullable
    public List<RawBidiCode> search(@NotNull ByteBuffer yuvData, int dataWidth, int dataHeight, @NotNull List<? extends BidiType> toBeFoundBidiCodeTypes) {
        Intrinsics.checkNotNullParameter(yuvData, "yuvData");
        Intrinsics.checkNotNullParameter(toBeFoundBidiCodeTypes, "toBeFoundBidiCodeTypes");
        InputImage inputImageFromByteBuffer = InputImage.fromByteBuffer(yuvData, dataWidth, dataHeight, 0, 17);
        Intrinsics.checkNotNullExpressionValue(inputImageFromByteBuffer, "fromByteBuffer(...)");
        return b(inputImageFromByteBuffer, toBeFoundBidiCodeTypes);
    }

    @Override // com.veridas.bidicode.dependencies.BidiCodeFinder
    @Nullable
    public List<RawBidiCode> search(@NotNull Bitmap bitmap, @NotNull List<? extends BidiType> toBeFoundBidiCodeTypes) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(toBeFoundBidiCodeTypes, "toBeFoundBidiCodeTypes");
        InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmap, 0);
        Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(...)");
        return b(inputImageFromBitmap, toBeFoundBidiCodeTypes);
    }
}
