package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.barhopper.deeplearning.zze;
import com.google.barhopper.deeplearning.zzf;
import com.google.barhopper.deeplearning.zzh;
import com.google.barhopper.deeplearning.zzi;
import com.google.barhopper.deeplearning.zzk;
import com.google.barhopper.deeplearning.zzm;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import com.google.photos.vision.barhopper.zzac;
import com.google.photos.vision.barhopper.zzad;
import com.google.photos.vision.barhopper.zzae;
import com.google.photos.vision.barhopper.zzag;
import com.google.photos.vision.barhopper.zzaj;
import com.google.photos.vision.barhopper.zzb;
import com.google.photos.vision.barhopper.zzc;
import com.google.photos.vision.barhopper.zzn;
import com.google.photos.vision.barhopper.zzp;
import com.google.photos.vision.barhopper.zzr;
import com.google.photos.vision.barhopper.zzt;
import com.google.photos.vision.barhopper.zzy;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends zzbk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f93085h = {5, 7, 7, 7, 5, 5};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final double[][] f93086i = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f93087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecognitionOptions f93088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public BarhopperV3 f93089g;

    public a(Context context, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f93088f = recognitionOptions;
        this.f93087e = context;
        recognitionOptions.setBarcodeFormats(zzbcVar.zza());
    }

    @Nullable
    public static zzap a(@Nullable zzn zznVar, @Nullable String str, String str2) {
        if (zznVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzap(zznVar.zzf(), zznVar.zzd(), zznVar.zza(), zznVar.zzb(), zznVar.zzc(), zznVar.zze(), zznVar.zzj(), matcher.find() ? matcher.group(1) : null);
    }

    public final BarhopperProto$BarhopperResponse b(ByteBuffer byteBuffer, zzbu zzbuVar) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f93089g);
        boolean zIsDirect = ((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect();
        RecognitionOptions recognitionOptions = this.f93088f;
        if (zIsDirect) {
            return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.recognize(zzbuVar.zzd(), zzbuVar.zza(), bArr, recognitionOptions);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final List zzb(IObjectWrapper iObjectWrapper, zzbu zzbuVar) {
        BarhopperProto$BarhopperResponse barhopperProto$BarhopperResponseRecognize;
        zzat zzatVar;
        zzaw zzawVar;
        zzax zzaxVar;
        zzaz zzazVar;
        zzay zzayVar;
        zzau zzauVar;
        zzaq zzaqVar;
        int i10;
        zzar zzarVar;
        zzas zzasVar;
        int i11;
        Point[] pointArr;
        int i12;
        int i13;
        zzaw[] zzawVarArr;
        zzat[] zzatVarArr;
        zzao[] zzaoVarArr;
        int iZzb = zzbuVar.zzb();
        int i14 = -1;
        int i15 = 0;
        if (iZzb == -1) {
            barhopperProto$BarhopperResponseRecognize = ((BarhopperV3) Preconditions.checkNotNull(this.f93089g)).recognize((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), this.f93088f);
        } else if (iZzb == 17) {
            barhopperProto$BarhopperResponseRecognize = b((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzbuVar);
        } else if (iZzb != 35) {
            if (iZzb != 842094169) {
                throw new IllegalArgumentException(androidx.camera.core.imagecapture.a.a(37, "Unsupported image format: ", zzbuVar.zzb()));
            }
            barhopperProto$BarhopperResponseRecognize = b((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzbuVar);
        } else {
            barhopperProto$BarhopperResponseRecognize = b(((Image) Preconditions.checkNotNull((Image) ObjectWrapper.unwrap(iObjectWrapper))).getPlanes()[0].getBuffer(), zzbuVar);
        }
        ArrayList arrayList = new ArrayList();
        Matrix uprightRotationMatrix = ImageUtils.getInstance().getUprightRotationMatrix(zzbuVar.zzd(), zzbuVar.zza(), zzbuVar.zzc());
        for (zzc zzcVar : barhopperProto$BarhopperResponseRecognize.zzc()) {
            if (zzcVar.zza() > 0 && uprightRotationMatrix != null) {
                float[] fArr = new float[8];
                List listZzo = zzcVar.zzo();
                int iZza = zzcVar.zza();
                for (int i16 = i15; i16 < iZza; i16++) {
                    int i17 = i16 + i16;
                    fArr[i17] = ((zzae) listZzo.get(i16)).zza();
                    fArr[i17 + 1] = ((zzae) listZzo.get(i16)).zzb();
                }
                uprightRotationMatrix.mapPoints(fArr);
                int iZzc = zzbuVar.zzc();
                for (int i18 = i15; i18 < iZza; i18++) {
                    zzb zzbVar = (zzb) zzcVar.zzG();
                    int i19 = i18 + i18;
                    zzad zzadVarZzc = zzae.zzc();
                    zzadVarZzc.zza((int) fArr[i19]);
                    zzadVarZzc.zzb((int) fArr[i19 + 1]);
                    zzbVar.zza((i18 + iZzc) % iZza, (zzae) zzadVarZzc.zzl());
                    zzcVar = (zzc) zzbVar.zzl();
                }
            }
            if (zzcVar.zzt()) {
                zzy zzyVarZzh = zzcVar.zzh();
                zzatVar = new zzat(zzyVarZzh.zzf() + i14, zzyVarZzh.zzc(), zzyVarZzh.zze(), zzyVarZzh.zzd());
            } else {
                zzatVar = null;
            }
            if (zzcVar.zzv()) {
                zzci zzciVarZzb = zzcVar.zzb();
                zzawVar = new zzaw(zzciVarZzb.zzd() + i14, zzciVarZzb.zzc());
            } else {
                zzawVar = null;
            }
            if (zzcVar.zzw()) {
                zzag zzagVarZzj = zzcVar.zzj();
                zzaxVar = new zzax(zzagVarZzj.zzc(), zzagVarZzj.zzd());
            } else {
                zzaxVar = null;
            }
            if (zzcVar.zzy()) {
                com.google.photos.vision.barhopper.zzao zzaoVarZzl = zzcVar.zzl();
                zzazVar = new zzaz(zzaoVarZzl.zzd(), zzaoVarZzl.zzc(), zzaoVarZzl.zze() + i14);
            } else {
                zzazVar = null;
            }
            if (zzcVar.zzx()) {
                zzaj zzajVarZzk = zzcVar.zzk();
                zzayVar = new zzay(zzajVarZzk.zzc(), zzajVarZzk.zzd());
            } else {
                zzayVar = null;
            }
            if (zzcVar.zzu()) {
                zzac zzacVarZzi = zzcVar.zzi();
                zzauVar = new zzau(zzacVarZzi.zza(), zzacVarZzi.zzb());
            } else {
                zzauVar = null;
            }
            if (zzcVar.zzq()) {
                zzp zzpVarZzd = zzcVar.zzd();
                zzaqVar = new zzaq(zzpVarZzd.zzj(), zzpVarZzd.zze(), zzpVarZzd.zzf(), zzpVarZzd.zzh(), zzpVarZzd.zzi(), a(zzpVarZzd.zzb(), zzcVar.zzm().zzn() ? zzcVar.zzm().zzv() : null, "DTSTART:([0-9TZ]*)"), a(zzpVarZzd.zza(), zzcVar.zzm().zzn() ? zzcVar.zzm().zzv() : null, "DTEND:([0-9TZ]*)"));
            } else {
                zzaqVar = null;
            }
            if (zzcVar.zzr()) {
                zzr zzrVarZze = zzcVar.zze();
                zzcd zzcdVarZza = zzrVarZze.zza();
                zzav zzavVar = zzcdVarZza != null ? new zzav(zzcdVarZza.zzd(), zzcdVarZza.zzi(), zzcdVarZza.zzh(), zzcdVarZza.zzc(), zzcdVarZza.zzf(), zzcdVarZza.zze(), zzcdVarZza.zzj()) : null;
                String strZzd = zzrVarZze.zzd();
                String strZze = zzrVarZze.zze();
                List listZzi = zzrVarZze.zzi();
                if (listZzi.isEmpty()) {
                    zzawVarArr = null;
                } else {
                    zzaw[] zzawVarArr2 = new zzaw[listZzi.size()];
                    for (int i20 = 0; i20 < listZzi.size(); i20++) {
                        zzawVarArr2[i20] = new zzaw(((zzci) listZzi.get(i20)).zzd() + i14, ((zzci) listZzi.get(i20)).zzc());
                    }
                    zzawVarArr = zzawVarArr2;
                }
                List listZzh = zzrVarZze.zzh();
                if (listZzh.isEmpty()) {
                    zzatVarArr = null;
                } else {
                    zzat[] zzatVarArr2 = new zzat[listZzh.size()];
                    int i21 = 0;
                    while (i21 < listZzh.size()) {
                        zzatVarArr2[i21] = new zzat(((zzy) listZzh.get(i21)).zzf() + i14, ((zzy) listZzh.get(i21)).zzc(), ((zzy) listZzh.get(i21)).zze(), ((zzy) listZzh.get(i21)).zzd());
                        i21++;
                        i14 = -1;
                    }
                    zzatVarArr = zzatVarArr2;
                }
                String[] strArr = (String[]) zzrVarZze.zzj().toArray(new String[0]);
                List listZzf = zzrVarZze.zzf();
                if (listZzf.isEmpty()) {
                    i10 = 0;
                    zzaoVarArr = null;
                } else {
                    zzao[] zzaoVarArr2 = new zzao[listZzf.size()];
                    for (int i22 = 0; i22 < listZzf.size(); i22++) {
                        zzaoVarArr2[i22] = new zzao(((zzcb) listZzf.get(i22)).zzc() - 1, (String[]) ((zzcb) listZzf.get(i22)).zzb().toArray(new String[0]));
                    }
                    i10 = 0;
                    zzaoVarArr = zzaoVarArr2;
                }
                zzarVar = new zzar(zzavVar, strZzd, strZze, zzawVarArr, zzatVarArr, strArr, zzaoVarArr);
            } else {
                i10 = 0;
                zzarVar = null;
            }
            if (zzcVar.zzs()) {
                zzt zztVarZzf = zzcVar.zzf();
                zzasVar = new zzas(zztVarZzf.zzi(), zztVarZzf.zzk(), zztVarZzf.zzq(), zztVarZzf.zzo(), zztVarZzf.zzl(), zztVarZzf.zze(), zztVarZzf.zzc(), zztVarZzf.zzd(), zztVarZzf.zzf(), zztVarZzf.zzp(), zztVarZzf.zzm(), zztVarZzf.zzj(), zztVarZzf.zzh(), zztVarZzf.zzn());
            } else {
                zzasVar = null;
            }
            switch (zzcVar.zzz() - 1) {
                case 0:
                    i11 = i10;
                    break;
                case 1:
                    i11 = 1;
                    break;
                case 2:
                    i11 = 2;
                    break;
                case 3:
                    i11 = 4;
                    break;
                case 4:
                    i11 = 8;
                    break;
                case 5:
                    i11 = 16;
                    break;
                case 6:
                    i11 = 32;
                    break;
                case 7:
                    i11 = 64;
                    break;
                case 8:
                    i11 = 128;
                    break;
                case 9:
                    i11 = 256;
                    break;
                case 10:
                    i11 = 512;
                    break;
                case 11:
                    i11 = 1024;
                    break;
                case 12:
                    i11 = 2048;
                    break;
                case 13:
                    i11 = 4096;
                    break;
                default:
                    i11 = -1;
                    break;
            }
            String strZzn = zzcVar.zzn();
            String strZzv = zzcVar.zzm().zzn() ? zzcVar.zzm().zzv() : null;
            byte[] bArrZzy = zzcVar.zzm().zzy();
            List listZzo2 = zzcVar.zzo();
            if (listZzo2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[listZzo2.size()];
                for (int i23 = i10; i23 < listZzo2.size(); i23++) {
                    pointArr2[i23] = new Point(((zzae) listZzo2.get(i23)).zza(), ((zzae) listZzo2.get(i23)).zzb());
                }
                pointArr = pointArr2;
            }
            switch (zzcVar.zzA() - 1) {
                case 1:
                    i12 = 1;
                    continue;
                    arrayList.add(new zzba(i11, strZzn, strZzv, bArrZzy, pointArr, i12, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i14 = -1;
                    i15 = i10;
                    break;
                case 2:
                    i12 = 2;
                    continue;
                    arrayList.add(new zzba(i11, strZzn, strZzv, bArrZzy, pointArr, i12, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i14 = -1;
                    i15 = i10;
                    break;
                case 3:
                    i13 = 3;
                    break;
                case 4:
                    i12 = 4;
                    continue;
                    arrayList.add(new zzba(i11, strZzn, strZzv, bArrZzy, pointArr, i12, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i14 = -1;
                    i15 = i10;
                    break;
                case 5:
                    i13 = 5;
                    break;
                case 6:
                    i13 = 6;
                    break;
                case 7:
                    i13 = 7;
                    break;
                case 8:
                    i12 = 8;
                    continue;
                    arrayList.add(new zzba(i11, strZzn, strZzv, bArrZzy, pointArr, i12, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i14 = -1;
                    i15 = i10;
                    break;
                case 9:
                    i13 = 9;
                    break;
                case 10:
                    i13 = 10;
                    break;
                case 11:
                    i13 = 11;
                    break;
                case 12:
                    i13 = 12;
                    break;
                default:
                    i12 = i10;
                    continue;
                    arrayList.add(new zzba(i11, strZzn, strZzv, bArrZzy, pointArr, i12, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i14 = -1;
                    i15 = i10;
                    break;
            }
            i12 = i13;
            arrayList.add(new zzba(i11, strZzn, strZzv, bArrZzy, pointArr, i12, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
            i14 = -1;
            i15 = i10;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzc() {
        Context context = this.f93087e;
        if (this.f93089g != null) {
            return;
        }
        this.f93089g = new BarhopperV3();
        zzh zzhVarZza = zzi.zza();
        zze zzeVarZza = zzf.zza();
        int i10 = 16;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            com.google.barhopper.deeplearning.zzb zzbVarZza = com.google.barhopper.deeplearning.zzc.zza();
            zzbVarZza.zzc(i10);
            zzbVarZza.zzd(i10);
            for (int i13 = 0; i13 < f93085h[i12]; i13++) {
                double[] dArr = f93086i[i11];
                float f6 = (float) (dArr[0] * 320.0d);
                float fSqrt = (float) Math.sqrt(dArr[1]);
                zzbVarZza.zza(f6 / fSqrt);
                zzbVarZza.zzb(f6 * fSqrt);
                i11++;
            }
            i10 += i10;
            zzeVarZza.zza(zzbVarZza);
        }
        zzhVarZza.zza(zzeVarZza);
        try {
            InputStream inputStreamOpen = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f93089g);
                        zzk zzkVarZza = BarhopperV3Options.zza();
                        zzhVarZza.zzb(zzdb.zzt(inputStreamOpen));
                        zzkVarZza.zza(zzhVarZza);
                        zzm zzmVarZza = com.google.barhopper.deeplearning.zzn.zza();
                        zzmVarZza.zza(zzdb.zzt(inputStreamOpen2));
                        zzmVarZza.zzb(zzdb.zzt(inputStreamOpen3));
                        zzkVarZza.zzb(zzmVarZza);
                        barhopperV3.create(zzkVarZza.zzl());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamOpen3 != null) {
                            try {
                                inputStreamOpen3.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th4;
            }
        } catch (IOException e5) {
            throw new IllegalStateException("Failed to open Barcode models", e5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzd() {
        BarhopperV3 barhopperV3 = this.f93089g;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f93089g = null;
        }
    }
}
