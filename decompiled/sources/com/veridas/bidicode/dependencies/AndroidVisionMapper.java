package com.veridas.bidicode.dependencies;

import com.veridas.lib.entities.resources.bidicode.BidiType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidVisionMapper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/veridas/bidicode/dependencies/AndroidVisionMapper;", "", "()V", "mapBarcodeFormat2BidiCodeType", "Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "from", "", "mapBidiCodeType2BarcodeFormat", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidVisionMapper {

    @NotNull
    public static final AndroidVisionMapper INSTANCE = new AndroidVisionMapper();

    /* JADX INFO: compiled from: AndroidVisionMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BidiType.values().length];
            try {
                iArr[BidiType.CODE_39.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BidiType.CODE_128.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BidiType.DATA_MATRIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BidiType.ITF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BidiType.PDF_417.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BidiType.QR_CODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BidiType.CODABAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public final BidiType mapBarcodeFormat2BidiCodeType(int from) {
        if (from == 1) {
            return BidiType.CODE_128;
        }
        if (from == 2) {
            return BidiType.CODE_39;
        }
        if (from == 16) {
            return BidiType.DATA_MATRIX;
        }
        if (from == 128) {
            return BidiType.ITF;
        }
        if (from == 256) {
            return BidiType.QR_CODE;
        }
        if (from != 2048) {
            return null;
        }
        return BidiType.PDF_417;
    }

    public final int mapBidiCodeType2BarcodeFormat(@NotNull BidiType from) {
        Intrinsics.checkNotNullParameter(from, "from");
        switch (WhenMappings.$EnumSwitchMapping$0[from.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 16;
            case 4:
                return 128;
            case 5:
                return 2048;
            case 6:
                return 256;
            case 7:
                return 8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
