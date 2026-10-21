package com.google.android.gms.vision.face.mlkit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.n1;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzac;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzad;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzaf;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzag;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzah;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzg;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzh;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzk;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzl;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzq;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsg;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsp;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsr;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzst;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsv;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsx;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzt;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zztc;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzv;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzw;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzx;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzxm;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzxo;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzxy;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzxz;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzy;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzz;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zza extends zzsx {
    private static final GmsLogger zza = new GmsLogger("FaceDetector", "");
    private final Context zzb;
    private final zzst zzc;
    private final zzx zzd;
    private final FaceDetectorV2Jni zze;
    private final zzb zzf;
    private final zzsg zzg;
    private long zzh = -1;

    public zza(Context context, zzst zzstVar, FaceDetectorV2Jni faceDetectorV2Jni, zzb zzbVar) {
        this.zzb = context;
        this.zzc = zzstVar;
        int iZzc = zzstVar.zzc();
        zzaf zzafVarZza = zzag.zza();
        zzafVarZza.zzb("models");
        zzag zzagVar = (zzag) zzafVarZza.zzn();
        zzw zzwVarZza = zzx.zza();
        zzy zzyVarZza = zzz.zza();
        zzyVarZza.zzc(zzagVar);
        zzyVarZza.zzb(zzagVar);
        zzyVarZza.zzd(zzagVar);
        zzwVarZza.zzc(zzyVarZza);
        zzk zzkVarZza = zzl.zza();
        zzkVarZza.zza(zzagVar);
        zzkVarZza.zzb(zzagVar);
        zzwVarZza.zza(zzkVarZza);
        zzac zzacVarZza = zzad.zza();
        zzacVarZza.zzb(zzagVar);
        zzacVarZza.zzc(zzagVar);
        zzacVarZza.zzd(zzagVar);
        zzacVarZza.zza(zzagVar);
        zzwVarZza.zze(zzacVarZza);
        boolean z10 = false;
        boolean z11 = iZzc == 2;
        zzwVarZza.zzg(z11);
        if (!z11 && zzstVar.zzf()) {
            z10 = true;
        }
        zzwVarZza.zzb(z10);
        zzwVarZza.zzf(zzstVar.zza());
        zzwVarZza.zzh(true);
        if (z11) {
            zzwVarZza.zzk(4);
            zzwVarZza.zzj(4);
        } else {
            int iZze = zzstVar.zze();
            if (iZze == 1) {
                zzwVarZza.zzk(2);
            } else if (iZze == 2) {
                zzwVarZza.zzk(3);
            }
            int iZzd = zzstVar.zzd();
            if (iZzd == 1) {
                zzwVarZza.zzj(2);
            } else if (iZzd == 2) {
                zzwVarZza.zzj(3);
            }
            int iZzb = zzstVar.zzb();
            if (iZzb == 1) {
                zzwVarZza.zzi(2);
            } else if (iZzb == 2) {
                zzwVarZza.zzi(3);
            }
        }
        this.zzd = (zzx) zzwVarZza.zzn();
        this.zze = faceDetectorV2Jni;
        this.zzf = zzbVar;
        this.zzg = zzsg.zza(context);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    private final List zze(zzv zzvVar) {
        float f6;
        float f10;
        float f11;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        int i11;
        byte b10;
        ArrayList arrayList3 = new ArrayList();
        for (zzxz zzxzVar : zzvVar.zzc().zze()) {
            int i12 = 1;
            int i13 = -1;
            if (this.zzd.zzk() == 3) {
                float fZzb = -1.0f;
                float fZzb2 = -1.0f;
                float fZzb3 = -1.0f;
                for (zzxm zzxmVar : zzxzVar.zzn()) {
                    String strZze = zzxmVar.zze();
                    int iHashCode = strZze.hashCode();
                    if (iHashCode != -1940789646) {
                        if (iHashCode != -1837755075) {
                            if (iHashCode == 105428 && strZze.equals("joy")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                        } else if (strZze.equals("right_eye_closed")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (strZze.equals("left_eye_closed")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        fZzb3 = zzxmVar.zzb();
                    } else if (b10 == 1) {
                        fZzb = 1.0f - zzxmVar.zzb();
                    } else if (b10 == 2) {
                        fZzb2 = 1.0f - zzxmVar.zzb();
                    }
                }
                f6 = fZzb;
                f10 = fZzb2;
                f11 = fZzb3;
            } else {
                f6 = -1.0f;
                f10 = -1.0f;
                f11 = -1.0f;
            }
            int i14 = 9;
            if (this.zzd.zzl() == 3) {
                List<zzxy> listZzo = zzxzVar.zzo();
                ArrayList arrayList4 = new ArrayList();
                for (zzxy zzxyVar : listZzo) {
                    int iZzg = zzxyVar.zzg() - 1;
                    if (iZzg == 0) {
                        i11 = 4;
                    } else if (iZzg == i12) {
                        i11 = 10;
                    } else if (iZzg != i14) {
                        switch (iZzg) {
                            case 11:
                                i11 = 0;
                                break;
                            case 12:
                                i11 = 5;
                                break;
                            case 13:
                                i11 = 11;
                                break;
                            default:
                                switch (iZzg) {
                                    case 238:
                                        i11 = 1;
                                        break;
                                    case 239:
                                        i11 = 7;
                                        break;
                                    case 240:
                                        i11 = 3;
                                        break;
                                    case 241:
                                        i11 = 9;
                                        break;
                                    case 242:
                                        i11 = 2;
                                        break;
                                    case 243:
                                        i11 = 8;
                                        break;
                                    default:
                                        zza.d("FaceDetector", "Unknown landmark type: ".concat(Integer.toString(iZzg)));
                                        i11 = -1;
                                        break;
                                }
                                break;
                        }
                    } else {
                        i11 = 6;
                    }
                    if (i11 >= 0) {
                        arrayList4.add(new zztc(i11, new PointF(zzxyVar.zzb(), zzxyVar.zzd())));
                    }
                    i14 = 9;
                    i12 = 1;
                }
                arrayList = arrayList4;
            } else {
                arrayList = new ArrayList();
            }
            if (this.zzd.zzl() == 4) {
                List<zzt> list = (List) zzxzVar.zzd(zzah.zza);
                ArrayList arrayList5 = new ArrayList();
                for (zzt zztVar : list) {
                    int iZzd = zztVar.zzd() + i13;
                    switch (iZzd) {
                        case 1:
                            i10 = 1;
                            break;
                        case 2:
                            i10 = 2;
                            break;
                        case 3:
                            i10 = 3;
                            break;
                        case 4:
                            i10 = 4;
                            break;
                        case 5:
                            i10 = 5;
                            break;
                        case 6:
                            i10 = 6;
                            break;
                        case 7:
                            i10 = 7;
                            break;
                        case 8:
                            i10 = 8;
                            break;
                        case 9:
                            i10 = 9;
                            break;
                        case 10:
                            i10 = 10;
                            break;
                        case 11:
                            i10 = 11;
                            break;
                        case 12:
                            i10 = 12;
                            break;
                        case 13:
                            i10 = 13;
                            break;
                        case 14:
                            i10 = 14;
                            break;
                        case 15:
                            i10 = 15;
                            break;
                        default:
                            zza.d("FaceDetector", "Unknown contour type: " + iZzd);
                            i10 = i13;
                            break;
                    }
                    if (i10 != i13) {
                        ArrayList arrayList6 = new ArrayList();
                        for (zzq zzqVar : zztVar.zzc()) {
                            arrayList6.add(new PointF(zzqVar.zza(), zzqVar.zzb()));
                        }
                        arrayList5.add(new zzsr(i10, arrayList6));
                        i13 = -1;
                    }
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = new ArrayList();
            }
            zzxo zzxoVarZzk = zzxzVar.zzk();
            arrayList3.add(new zzsv((int) zzxzVar.zzj(), new Rect((int) zzxoVarZzk.zzb(), (int) zzxoVarZzk.zze(), (int) zzxoVarZzk.zzd(), (int) zzxoVarZzk.zzg()), zzxzVar.zzh(), zzxzVar.zzg(), zzxzVar.zzi(), f6, f10, f11, zzxzVar.zzJ() ? zzxzVar.zze() : -1.0f, arrayList, arrayList2));
        }
        return arrayList3;
    }

    private static int zzf(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 4;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 2;
        }
        throw new IllegalArgumentException(g0.c("Unsupported rotation degree: ", i10));
    }

    private final List zzg(ByteBuffer byteBuffer, zzsp zzspVar, int i10) throws RemoteException {
        zzv zzvVarZzb;
        zzg zzgVarZza = zzh.zza();
        zzgVarZza.zzc(zzspVar.zzd());
        zzgVarZza.zza(zzspVar.zza());
        zzgVarZza.zze(zzf(zzspVar.zzc()));
        zzgVarZza.zzd(i10);
        if (zzspVar.zze() > 0) {
            zzgVarZza.zzb(zzspVar.zze() * 1000);
        }
        zzh zzhVar = (zzh) zzgVarZza.zzn();
        if (byteBuffer.isDirect()) {
            zzvVarZzb = this.zze.zzd(this.zzh, byteBuffer, zzhVar);
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            zzvVarZzb = this.zze.zzb(this.zzh, byteBuffer.array(), zzhVar);
        } else {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            zzvVarZzb = this.zze.zzb(this.zzh, bArr, zzhVar);
        }
        return zzvVarZzb != null ? zze(zzvVarZzb) : new ArrayList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy
    public final List zzb(IObjectWrapper iObjectWrapper, zzsp zzspVar) throws Throwable {
        List listZzg;
        zzv zzvVarZzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iZzb = zzspVar.zzb();
        if (iZzb == -1) {
            listZzg = zzg(com.google.android.gms.internal.mlkit_vision_face_bundled.zzd.zza((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), true), zzspVar, 2);
        } else if (iZzb == 17) {
            listZzg = zzg((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzspVar, 2);
        } else if (iZzb == 35) {
            Image.Plane[] planes = ((Image) ObjectWrapper.unwrap(iObjectWrapper)).getPlanes();
            ByteBuffer buffer = planes[0].getBuffer();
            ByteBuffer buffer2 = planes[1].getBuffer();
            ByteBuffer buffer3 = planes[2].getBuffer();
            zzg zzgVarZza = zzh.zza();
            zzgVarZza.zzc(zzspVar.zzd());
            zzgVarZza.zza(zzspVar.zza());
            zzgVarZza.zze(zzf(zzspVar.zzc()));
            if (zzspVar.zze() > 0) {
                zzgVarZza.zzb(zzspVar.zze() * 1000);
            }
            zzh zzhVar = (zzh) zzgVarZza.zzn();
            if (buffer.isDirect()) {
                zzvVarZzc = this.zze.zze(this.zzh, buffer, buffer2, buffer3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzhVar);
            } else if (buffer.hasArray() && buffer.arrayOffset() == 0) {
                zzvVarZzc = this.zze.zzc(this.zzh, buffer.array(), buffer2.array(), buffer3.array(), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzhVar);
            } else {
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                byte[] bArr2 = new byte[buffer2.remaining()];
                buffer.get(bArr);
                byte[] bArr3 = new byte[buffer3.remaining()];
                buffer.get(bArr);
                zzvVarZzc = this.zze.zzc(this.zzh, bArr, bArr2, bArr3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzhVar);
            }
            listZzg = zzvVarZzc != null ? zze(zzvVarZzc) : new ArrayList();
        } else {
            if (iZzb != 842094169) {
                String strE = n1.e("Unsupported image format ", zzspVar.zzb(), " at API ", Build.VERSION.SDK_INT);
                this.zzg.zzc(25503, 1, jCurrentTimeMillis, System.currentTimeMillis());
                throw zze.zza(strE);
            }
            listZzg = zzg((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzspVar, 7);
        }
        List list = listZzg;
        this.zzf.zza(this.zzc, zzspVar, list, SystemClock.elapsedRealtime() - jElapsedRealtime);
        this.zzg.zzc(25503, 0, jCurrentTimeMillis, System.currentTimeMillis());
        return list;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy
    public final void zzc() throws Throwable {
        this.zzh = this.zze.zza(this.zzd, this.zzb.getAssets());
        this.zzf.zzc(this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy
    public final void zzd() {
        long j10 = this.zzh;
        if (j10 > 0) {
            this.zze.zzf(j10);
            this.zzh = -1L;
        }
    }
}
