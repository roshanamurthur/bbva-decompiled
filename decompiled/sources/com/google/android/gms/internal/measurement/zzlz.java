package com.google.android.gms.internal.measurement;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzlz {
    public static String zza(zzix zzixVar) {
        StringBuilder sb2 = new StringBuilder(zzixVar.zzd());
        for (int i10 = 0; i10 < zzixVar.zzd(); i10++) {
            byte bZza = zzixVar.zza(i10);
            if (bZza == 34) {
                sb2.append("\\\"");
            } else if (bZza == 39) {
                sb2.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb2.append(AbstractJsonLexerKt.STRING_ESC);
                            sb2.append((char) (((bZza >>> 6) & 3) + 48));
                            sb2.append((char) (((bZza >>> 3) & 7) + 48));
                            sb2.append((char) ((bZza & 7) + 48));
                        } else {
                            sb2.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
