package com.google.mlkit.vision.face.internal;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.zzdl;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzke;
import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkj;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import vg.b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzh extends MLTask {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public static final AtomicBoolean f49630i = new AtomicBoolean(true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ImageUtils f49631j = ImageUtils.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FaceDetectorOptions f49632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzoc f49633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzoe f49634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f49635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f49636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BitmapInStreamingChecker f49637h = new BitmapInStreamingChecker();

    @VisibleForTesting
    public zzh(@NonNull zzoc zzocVar, @NonNull FaceDetectorOptions faceDetectorOptions, @NonNull b bVar) {
        Preconditions.checkNotNull(faceDetectorOptions, "FaceDetectorOptions can not be null");
        this.f49632c = faceDetectorOptions;
        this.f49633d = zzocVar;
        this.f49635f = bVar;
        this.f49634e = zzoe.zza(MlKitContext.getInstance().getApplicationContext());
    }

    public static void a(@NonNull ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Face) it.next()).zzc(-1);
        }
    }

    @WorkerThread
    public final synchronized void b(final int i10, final int i11, long j10, final zzks zzksVar, final InputImage inputImage) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f49633d.zzf(new zzoa() { // from class: com.google.mlkit.vision.face.internal.zzf
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                zzkf zzkfVar;
                zzh zzhVar = this.zza;
                long j11 = jElapsedRealtime;
                zzks zzksVar2 = zzksVar;
                int i12 = i10;
                int i13 = i11;
                InputImage inputImage2 = inputImage;
                zzhVar.getClass();
                zzlj zzljVar = new zzlj();
                zzkj zzkjVar = new zzkj();
                zzkjVar.zzc(Long.valueOf(j11));
                zzkjVar.zzd(zzksVar2);
                zzkjVar.zze(Boolean.valueOf(zzh.f49630i.get()));
                Boolean bool = Boolean.TRUE;
                zzkjVar.zza(bool);
                zzkjVar.zzb(bool);
                zzljVar.zzg(zzkjVar.zzf());
                zzljVar.zze(zzj.zza(zzhVar.f49632c));
                zzljVar.zzd(Integer.valueOf(i12));
                zzljVar.zzh(Integer.valueOf(i13));
                ImageUtils imageUtils = zzh.f49631j;
                int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage2);
                int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage2);
                zzke zzkeVar = new zzke();
                if (mobileVisionImageFormat == -1) {
                    zzkfVar = zzkf.BITMAP;
                } else if (mobileVisionImageFormat == 35) {
                    zzkfVar = zzkf.YUV_420_888;
                } else if (mobileVisionImageFormat == 842094169) {
                    zzkfVar = zzkf.YV12;
                } else if (mobileVisionImageFormat != 16) {
                    zzkfVar = mobileVisionImageFormat != 17 ? zzkf.UNKNOWN_FORMAT : zzkf.NV21;
                } else {
                    zzkfVar = zzkf.NV16;
                }
                zzkeVar.zza(zzkfVar);
                zzkeVar.zzb(Integer.valueOf(mobileVisionImageSize));
                zzljVar.zzf(zzkeVar.zzd());
                zzll zzllVarZzi = zzljVar.zzi();
                zzku zzkuVar = new zzku();
                zzkuVar.zze(zzhVar.f49636g ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
                zzkuVar.zzg(zzllVarZzi);
                return zzof.zzf(zzkuVar);
            }
        }, zzkt.ON_DEVICE_FACE_DETECT);
        zzdl zzdlVar = new zzdl();
        zzdlVar.zzc(zzksVar);
        zzdlVar.zzd(Boolean.valueOf(f49630i.get()));
        zzdlVar.zza(Integer.valueOf(i10));
        zzdlVar.zze(Integer.valueOf(i11));
        zzdlVar.zzb(zzj.zza(this.f49632c));
        final zzdn zzdnVarZzf = zzdlVar.zzf();
        final zzg zzgVar = new zzg(this);
        final zzoc zzocVar = this.f49633d;
        final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        final byte[] bArr = null;
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable(zzktVar, zzdnVarZzf, jElapsedRealtime, zzgVar, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_face.zzny
            public final /* synthetic */ zzkt zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ com.google.mlkit.vision.face.internal.zzg zze;

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f49634e.zzc(true != this.f49636g ? 24303 : 24304, zzksVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @WorkerThread
    public final synchronized void load() throws MlKitException {
        this.f49636g = this.f49635f.zzd();
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @WorkerThread
    public final synchronized void release() {
        try {
            this.f49635f.zzb();
            f49630i.set(true);
            zzoc zzocVar = this.f49633d;
            zzku zzkuVar = new zzku();
            zzkuVar.zze(this.f49636g ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
            zzocVar.zzd(zzof.zzf(zzkuVar), zzkt.ON_DEVICE_FACE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114 A[Catch: all -> 0x002b, MlKitException -> 0x00e0, TryCatch #0 {MlKitException -> 0x00e0, blocks: (B:46:0x010e, B:53:0x0122, B:52:0x011d, B:49:0x0114, B:34:0x00b3, B:36:0x00d7, B:40:0x00e8, B:43:0x00fb, B:45:0x0106), top: B:65:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d A[Catch: all -> 0x002b, MlKitException -> 0x00e0, TryCatch #0 {MlKitException -> 0x00e0, blocks: (B:46:0x010e, B:53:0x0122, B:52:0x011d, B:49:0x0114, B:34:0x00b3, B:36:0x00d7, B:40:0x00e8, B:43:0x00fb, B:45:0x0106), top: B:65:0x00b3 }] */
    @Override // com.google.mlkit.common.sdkinternal.MLTask
    @WorkerThread
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final synchronized List run(@NonNull InputImage inputImage) throws MlKitException {
        long j10;
        List arrayList;
        Iterator it;
        Iterator it2;
        List list;
        int size;
        int size2;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f49637h.check(inputImage);
            try {
                Pair pairA = this.f49635f.a(inputImage);
                List list2 = (List) pairA.first;
                List list3 = (List) pairA.second;
                if (list2 == null && list3 == null) {
                    throw new MlKitException("No detector is enabled", 13);
                }
                if (list2 == null) {
                    list = (List) Preconditions.checkNotNull(list3);
                } else if (list3 == null) {
                    list = (List) Preconditions.checkNotNull(list2);
                } else {
                    HashSet hashSet = new HashSet();
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        Face face = (Face) it3.next();
                        Iterator it4 = list2.iterator();
                        boolean z10 = false;
                        while (it4.hasNext()) {
                            Face face2 = (Face) it4.next();
                            if (face.getBoundingBox() == null || face2.getBoundingBox() == null) {
                                it = it3;
                                it2 = it4;
                                j10 = jElapsedRealtime;
                            } else {
                                Rect boundingBox = face.getBoundingBox();
                                Rect boundingBox2 = face2.getBoundingBox();
                                if (boundingBox.intersect(boundingBox2)) {
                                    it = it3;
                                    it2 = it4;
                                    j10 = jElapsedRealtime;
                                    double dMin = (Math.min(boundingBox.bottom, boundingBox2.bottom) - Math.max(boundingBox.top, boundingBox2.top)) * (Math.min(boundingBox.right, boundingBox2.right) - Math.max(boundingBox.left, boundingBox2.left));
                                    try {
                                        if (dMin / ((((double) ((boundingBox.bottom - boundingBox.top) * (boundingBox.right - boundingBox.left))) + ((double) ((boundingBox2.bottom - boundingBox2.top) * (boundingBox2.right - boundingBox2.left)))) - dMin) > 0.6d) {
                                            face2.zzb(face.zza());
                                            z10 = true;
                                        }
                                    } catch (MlKitException e5) {
                                        e = e5;
                                        b(0, 0, j10, e.getErrorCode() == 14 ? zzks.MODEL_NOT_DOWNLOADED : zzks.UNKNOWN_ERROR, inputImage);
                                        throw e;
                                    }
                                } else {
                                    it = it3;
                                    it2 = it4;
                                    j10 = jElapsedRealtime;
                                }
                            }
                            hashSet.add(face2);
                            it3 = it;
                            it4 = it2;
                            jElapsedRealtime = j10;
                        }
                        Iterator it5 = it3;
                        long j11 = jElapsedRealtime;
                        if (!z10) {
                            hashSet.add(face);
                        }
                        it3 = it5;
                        jElapsedRealtime = j11;
                    }
                    j10 = jElapsedRealtime;
                    arrayList = new ArrayList(hashSet);
                    zzks zzksVar = zzks.NO_ERROR;
                    if (list3 == null) {
                        size = 0;
                    } else {
                        size = list3.size();
                    }
                    if (list2 == null) {
                        size2 = 0;
                    } else {
                        size2 = list2.size();
                    }
                    b(size, size2, j10, zzksVar, inputImage);
                    f49630i.set(false);
                }
                arrayList = list;
                j10 = jElapsedRealtime;
                zzks zzksVar2 = zzks.NO_ERROR;
                if (list3 == null) {
                    size = 0;
                } else {
                    size = list3.size();
                }
                if (list2 == null) {
                    size2 = 0;
                } else {
                    size2 = list2.size();
                }
                b(size, size2, j10, zzksVar2, inputImage);
                f49630i.set(false);
            } catch (MlKitException e7) {
                e = e7;
                j10 = jElapsedRealtime;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }
}
