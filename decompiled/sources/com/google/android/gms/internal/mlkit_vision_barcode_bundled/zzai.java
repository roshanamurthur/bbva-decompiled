package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzai implements zzeg {
    static final zzeg zza = new zzai();

    private zzai() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeg
    public final boolean zza(int i10) {
        if (i10 == 129 || i10 == 161 || i10 == 209 || i10 == 2705 || i10 == 20753 || i10 == 20769 || i10 == 215 || i10 == 216 || i10 == 1297 || i10 == 1298) {
            return true;
        }
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i10) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return true;
                    default:
                        switch (i10) {
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                                return true;
                            default:
                                switch (i10) {
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 167:
                                    case 168:
                                    case 169:
                                        return true;
                                    default:
                                        switch (i10) {
                                            case 211:
                                            case ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE /* 212 */:
                                            case ErrorCodes.ERR_CRY_BAD_PIN_SIZE /* 213 */:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}
