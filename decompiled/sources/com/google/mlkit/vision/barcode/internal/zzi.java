package com.google.mlkit.vision.barcode.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzka;
import com.google.android.gms.internal.mlkit_vision_barcode.zzki;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkx;
import com.google.android.gms.internal.mlkit_vision_barcode.zznk;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzno;
import com.google.android.gms.internal.mlkit_vision_barcode.zznp;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzi extends MLTask {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ImageUtils f49563i = ImageUtils.getInstance();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @VisibleForTesting
    public static boolean f49564j = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BarcodeScannerOptions f49565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f49566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zznm f49567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzno f49568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BitmapInStreamingChecker f49569g = new BitmapInStreamingChecker();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f49570h;

    public zzi(MlKitContext mlKitContext, BarcodeScannerOptions barcodeScannerOptions, a aVar, zznm zznmVar) {
        Preconditions.checkNotNull(mlKitContext, "MlKitContext can not be null");
        Preconditions.checkNotNull(barcodeScannerOptions, "BarcodeScannerOptions can not be null");
        this.f49565c = barcodeScannerOptions;
        this.f49566d = aVar;
        this.f49567e = zznmVar;
        this.f49568f = zzno.zza(mlKitContext.getApplicationContext());
    }

    @WorkerThread
    public final void a(final zzkj zzkjVar, long j10, @NonNull final InputImage inputImage, @Nullable List list) {
        final zzbz zzbzVar = new zzbz();
        final zzbz zzbzVar2 = new zzbz();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Barcode barcode = (Barcode) it.next();
                zzbzVar.zzd(zzb.zza(barcode.getFormat()));
                zzbzVar2.zzd(zzb.zzb(barcode.getValueType()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f49567e.zzb(new zznk() { // from class: com.google.mlkit.vision.barcode.internal.zzh
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zznk
            public final zznp zza() {
                zzjw zzjwVar;
                zzi zziVar = this.zza;
                long j11 = jElapsedRealtime;
                zzkj zzkjVar2 = zzkjVar;
                zzbz zzbzVar3 = zzbzVar;
                zzbz zzbzVar4 = zzbzVar2;
                InputImage inputImage2 = inputImage;
                zziVar.getClass();
                zzkx zzkxVar = new zzkx();
                zzka zzkaVar = new zzka();
                zzkaVar.zzc(Long.valueOf(j11));
                zzkaVar.zzd(zzkjVar2);
                zzkaVar.zze(Boolean.valueOf(zzi.f49564j));
                Boolean bool = Boolean.TRUE;
                zzkaVar.zza(bool);
                zzkaVar.zzb(bool);
                zzkxVar.zzh(zzkaVar.zzf());
                zzkxVar.zzi(zzb.zzc(zziVar.f49565c));
                zzkxVar.zze(zzbzVar3.zzf());
                zzkxVar.zzf(zzbzVar4.zzf());
                int format = inputImage2.getFormat();
                int mobileVisionImageSize = zzi.f49563i.getMobileVisionImageSize(inputImage2);
                zzjv zzjvVar = new zzjv();
                if (format == -1) {
                    zzjwVar = zzjw.BITMAP;
                } else if (format == 35) {
                    zzjwVar = zzjw.YUV_420_888;
                } else if (format == 842094169) {
                    zzjwVar = zzjw.YV12;
                } else if (format != 16) {
                    zzjwVar = format != 17 ? zzjw.UNKNOWN_FORMAT : zzjw.NV21;
                } else {
                    zzjwVar = zzjw.NV16;
                }
                zzjvVar.zza(zzjwVar);
                zzjvVar.zzb(Integer.valueOf(mobileVisionImageSize));
                zzkxVar.zzg(zzjvVar.zzd());
                zzkl zzklVar = new zzkl();
                zzklVar.zze(zziVar.f49570h ? zzki.TYPE_THICK : zzki.TYPE_THIN);
                zzklVar.zzg(zzkxVar.zzj());
                return zznp.zzd(zzklVar);
            }
        }, zzkk.ON_DEVICE_BARCODE_DETECT);
        zzdw zzdwVar = new zzdw();
        zzdwVar.zze(zzkjVar);
        zzdwVar.zzf(Boolean.valueOf(f49564j));
        zzdwVar.zzg(zzb.zzc(this.f49565c));
        zzdwVar.zzc(zzbzVar.zzf());
        zzdwVar.zzd(zzbzVar2.zzf());
        final zzdy zzdyVarZzh = zzdwVar.zzh();
        final zzg zzgVar = new zzg(this);
        final zznm zznmVar = this.f49567e;
        final zzkk zzkkVar = zzkk.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        final byte[] bArr = null;
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable(zzkkVar, zzdyVarZzh, jElapsedRealtime, zzgVar, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzng
            public final /* synthetic */ zzkk zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ com.google.mlkit.vision.barcode.internal.zzg zze;

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f49568f.zzc(true != this.f49570h ? 24301 : 24302, zzkjVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @WorkerThread
    public final synchronized void load() throws MlKitException {
        this.f49570h = this.f49566d.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @WorkerThread
    public final synchronized void release() {
        this.f49566d.zzb();
        f49564j = true;
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    @WorkerThread
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final synchronized List run(@NonNull InputImage inputImage) throws MlKitException {
        ArrayList arrayListA;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f49569g.check(inputImage);
        try {
            arrayListA = this.f49566d.a(inputImage);
            a(zzkj.NO_ERROR, jElapsedRealtime, inputImage, arrayListA);
            f49564j = false;
        } catch (MlKitException e5) {
            a(e5.getErrorCode() == 14 ? zzkj.MODEL_NOT_DOWNLOADED : zzkj.UNKNOWN_ERROR, jElapsedRealtime, inputImage, null);
            throw e5;
        }
        return arrayListA;
    }
}
