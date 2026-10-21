package ug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.n1;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzac;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzad;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzaf;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzag;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzah;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzd;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzg;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzh;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzk;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzl;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzq;
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
/* JADX INFO: loaded from: classes10.dex */
public final class a extends zzsx {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f93855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzx f93856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FaceDetectorV2Jni f93857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f93858h = -1;

    public a(Context context, zzst zzstVar, FaceDetectorV2Jni faceDetectorV2Jni) {
        this.f93855e = context;
        int iZzc = zzstVar.zzc();
        zzaf zzafVarZza = zzag.zza();
        zzafVarZza.zzb("models_bundled");
        zzag zzagVar = (zzag) zzafVarZza.zzn();
        int iZze = zzstVar.zze();
        zzy zzyVarZza = zzz.zza();
        zzaf zzafVarZza2 = zzag.zza();
        zzafVarZza2.zzb("models_bundled");
        zzafVarZza2.zza(iZze == 2 ? "fssd_medium_8bit_v5.tflite" : "fssd_25_8bit_v2.tflite");
        zzyVarZza.zzc((zzag) zzafVarZza2.zzn());
        zzaf zzafVarZza3 = zzag.zza();
        zzafVarZza3.zzb("models_bundled");
        zzafVarZza3.zza(iZze == 2 ? "fssd_medium_8bit_gray_v5.tflite" : "fssd_25_8bit_gray_v2.tflite");
        zzyVarZza.zzb((zzag) zzafVarZza3.zzn());
        zzaf zzafVarZza4 = zzag.zza();
        zzafVarZza4.zzb("models_bundled");
        zzafVarZza4.zza(iZze == 2 ? "fssd_anchors_v5.pb" : "fssd_anchors_v2.pb");
        zzyVarZza.zza((zzag) zzafVarZza4.zzn());
        zzyVarZza.zzd(zzagVar);
        zzz zzzVar = (zzz) zzyVarZza.zzn();
        zzw zzwVarZza = zzx.zza();
        zzwVarZza.zzd(zzzVar);
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
            int iZze2 = zzstVar.zze();
            if (iZze2 == 1) {
                zzwVarZza.zzk(2);
            } else if (iZze2 == 2) {
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
        this.f93856f = (zzx) zzwVarZza.zzn();
        this.f93857g = faceDetectorV2Jni;
    }

    public static int zzf(int i10) {
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

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    public final ArrayList a(zzv zzvVar) {
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
            zzx zzxVar = this.f93856f;
            int i12 = 3;
            int i13 = 1;
            if (zzxVar.zzk() == 3) {
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
            if (zzxVar.zzl() == 3) {
                List<zzxy> listZzo = zzxzVar.zzo();
                ArrayList arrayList4 = new ArrayList();
                for (zzxy zzxyVar : listZzo) {
                    int iZzg = zzxyVar.zzg() - 1;
                    if (iZzg == 0) {
                        i11 = 4;
                    } else if (iZzg == i13) {
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
                                        i11 = i13;
                                        break;
                                    case 239:
                                        i11 = 7;
                                        break;
                                    case 240:
                                        i11 = i12;
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
                                        "Unknown landmark type: ".concat(Integer.toString(iZzg));
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
                        i14 = 9;
                        i12 = 3;
                        i13 = 1;
                    } else {
                        i14 = 9;
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = new ArrayList();
            }
            if (zzxVar.zzl() == 4) {
                List<zzt> list = (List) zzxzVar.zzd(zzah.zza);
                ArrayList arrayList5 = new ArrayList();
                for (zzt zztVar : list) {
                    switch (zztVar.zzd() - 1) {
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
                            i10 = -1;
                            break;
                    }
                    if (i10 != -1) {
                        ArrayList arrayList6 = new ArrayList();
                        for (zzq zzqVar : zztVar.zzc()) {
                            arrayList6.add(new PointF(zzqVar.zza(), zzqVar.zzb()));
                        }
                        arrayList5.add(new zzsr(i10, arrayList6));
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

    public final ArrayList b(ByteBuffer byteBuffer, zzsp zzspVar, int i10) throws RemoteException {
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
        boolean zIsDirect = byteBuffer.isDirect();
        FaceDetectorV2Jni faceDetectorV2Jni = this.f93857g;
        if (zIsDirect) {
            zzvVarZzb = faceDetectorV2Jni.zzd(this.f93858h, byteBuffer, zzhVar);
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            zzvVarZzb = faceDetectorV2Jni.zzb(this.f93858h, byteBuffer.array(), zzhVar);
        } else {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            zzvVarZzb = faceDetectorV2Jni.zzb(this.f93858h, bArr, zzhVar);
        }
        return zzvVarZzb != null ? a(zzvVarZzb) : new ArrayList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy
    public final List zzb(IObjectWrapper iObjectWrapper, zzsp zzspVar) throws RemoteException {
        zzv zzvVarZzc;
        int iZzb = zzspVar.zzb();
        if (iZzb == -1) {
            return b(zzd.zza((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), true), zzspVar, 2);
        }
        if (iZzb == 17) {
            return b((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzspVar, 2);
        }
        if (iZzb != 35) {
            if (iZzb == 842094169) {
                return b((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzspVar, 7);
            }
            throw new RemoteException(n1.e("Unsupported image format ", zzspVar.zzb(), " at API ", Build.VERSION.SDK_INT));
        }
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
            zzvVarZzc = this.f93857g.zze(this.f93858h, buffer, buffer2, buffer3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzhVar);
        } else if (buffer.hasArray() && buffer.arrayOffset() == 0) {
            zzvVarZzc = this.f93857g.zzc(this.f93858h, buffer.array(), buffer2.array(), buffer3.array(), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzhVar);
        } else {
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            byte[] bArr2 = new byte[buffer2.remaining()];
            buffer.get(bArr);
            byte[] bArr3 = new byte[buffer3.remaining()];
            buffer.get(bArr);
            zzvVarZzc = this.f93857g.zzc(this.f93858h, bArr, bArr2, bArr3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzhVar);
        }
        return zzvVarZzc != null ? a(zzvVarZzc) : new ArrayList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy
    public final void zzc() {
        this.f93858h = this.f93857g.zza(this.f93856f, this.f93855e.getAssets());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy
    public final void zzd() {
        long j10 = this.f93858h;
        if (j10 > 0) {
            this.f93857g.zzf(j10);
            this.f93858h = -1L;
        }
    }
}
