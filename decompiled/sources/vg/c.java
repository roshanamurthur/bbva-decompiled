package vg;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzj;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzm;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.mlkit.vision.face.internal.zzh;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f94061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f94062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FaceDetectorOptions f94063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzoc f94065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public zzj f94066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public zzj f94067g;

    public c(Context context, FaceDetectorOptions faceDetectorOptions, zzoc zzocVar) {
        this.f94062b = context;
        this.f94063c = faceDetectorOptions;
        this.f94064d = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
        this.f94065e = zzocVar;
    }

    @Override // vg.b
    @WorkerThread
    public final Pair a(InputImage inputImage) throws MlKitException {
        ArrayList arrayListB;
        if (this.f94066f == null && this.f94067g == null) {
            zzd();
        }
        zzj zzjVar = this.f94066f;
        if (zzjVar == null && this.f94067g == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        ArrayList arrayListB2 = null;
        if (zzjVar != null) {
            arrayListB = b(zzjVar, inputImage);
            if (!this.f94063c.zzg()) {
                zzh.a(arrayListB);
            }
        } else {
            arrayListB = null;
        }
        zzj zzjVar2 = this.f94067g;
        if (zzjVar2 != null) {
            arrayListB2 = b(zzjVar2, inputImage);
            zzh.a(arrayListB2);
        }
        return new Pair(arrayListB, arrayListB2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a7 A[LOOP:0: B:14:0x00a5->B:15:0x00a7, LOOP_END] */
    public final ArrayList b(zzj zzjVar, InputImage inputImage) throws MlKitException {
        zzf[] zzfVarArrZze;
        ArrayList arrayList;
        try {
            zzp zzpVar = new zzp(inputImage.getWidth(), inputImage.getHeight(), 0, SystemClock.elapsedRealtime(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()));
            if (inputImage.getFormat() == 35) {
                try {
                    if (this.f94064d >= 201500000) {
                        Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes());
                        zzfVarArrZze = zzjVar.zzf(ObjectWrapper.wrap(planeArr[0].getBuffer()), ObjectWrapper.wrap(planeArr[1].getBuffer()), ObjectWrapper.wrap(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), zzpVar);
                    }
                    arrayList = new ArrayList();
                    for (zzf zzfVar : zzfVarArrZze) {
                        arrayList.add(new Face(zzfVar, inputImage.getCoordinatesMatrix()));
                    }
                    return arrayList;
                } catch (RemoteException e5) {
                    e = e5;
                    throw new MlKitException("Failed to detect with legacy face detector", 13, e);
                }
            }
            zzfVarArrZze = zzjVar.zze(ObjectWrapper.wrap(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false)), zzpVar);
            arrayList = new ArrayList();
            while (i < r3) {
                arrayList.add(new Face(zzfVar, inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (RemoteException e7) {
            e = e7;
        }
    }

    @Override // vg.b
    @WorkerThread
    public final void zzb() {
        zzj zzjVar = this.f94066f;
        if (zzjVar != null) {
            try {
                zzjVar.zzd();
            } catch (RemoteException unused) {
            }
            this.f94066f = null;
        }
        zzj zzjVar2 = this.f94067g;
        if (zzjVar2 != null) {
            try {
                zzjVar2.zzd();
            } catch (RemoteException unused2) {
            }
            this.f94067g = null;
        }
    }

    @Override // vg.b
    @WorkerThread
    public final boolean zzd() throws MlKitException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Context context = this.f94062b;
        FaceDetectorOptions faceDetectorOptions = this.f94063c;
        if (this.f94066f != null || this.f94067g != null) {
            return false;
        }
        try {
            zzm zzmVarZza = zzl.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
            if (faceDetectorOptions.zzc() == 2) {
                if (this.f94067g == null) {
                    this.f94067g = zzmVarZza.zzd(iObjectWrapperWrap, new com.google.android.gms.internal.mlkit_vision_face.zzh(2, 2, 0, true, false, faceDetectorOptions.zza()));
                }
                if ((faceDetectorOptions.zzd() == 2 || faceDetectorOptions.zzb() == 2 || faceDetectorOptions.zze() == 2) && this.f94066f == null) {
                    int iZze = faceDetectorOptions.zze();
                    if (iZze == 1) {
                        i13 = 0;
                    } else {
                        if (iZze != 2) {
                            throw new IllegalArgumentException("Invalid mode type: " + iZze);
                        }
                        i13 = 1;
                    }
                    int iZzd = faceDetectorOptions.zzd();
                    if (iZzd == 1) {
                        i14 = 0;
                    } else {
                        if (iZzd != 2) {
                            throw new IllegalArgumentException("Invalid landmark type: " + iZzd);
                        }
                        i14 = 1;
                    }
                    int iZzb = faceDetectorOptions.zzb();
                    if (iZzb == 1) {
                        i15 = 0;
                    } else {
                        if (iZzb != 2) {
                            throw new IllegalArgumentException("Invalid classification type: " + iZzb);
                        }
                        i15 = 1;
                    }
                    this.f94066f = zzmVarZza.zzd(iObjectWrapperWrap, new com.google.android.gms.internal.mlkit_vision_face.zzh(i13, i14, i15, false, faceDetectorOptions.zzg(), faceDetectorOptions.zza()));
                }
            } else if (this.f94066f == null) {
                int iZze2 = faceDetectorOptions.zze();
                if (iZze2 == 1) {
                    i10 = 0;
                } else {
                    if (iZze2 != 2) {
                        throw new IllegalArgumentException("Invalid mode type: " + iZze2);
                    }
                    i10 = 1;
                }
                int iZzd2 = faceDetectorOptions.zzd();
                if (iZzd2 == 1) {
                    i11 = 0;
                } else {
                    if (iZzd2 != 2) {
                        throw new IllegalArgumentException("Invalid landmark type: " + iZzd2);
                    }
                    i11 = 1;
                }
                int iZzb2 = faceDetectorOptions.zzb();
                if (iZzb2 == 1) {
                    i12 = 0;
                } else {
                    if (iZzb2 != 2) {
                        throw new IllegalArgumentException("Invalid classification type: " + iZzb2);
                    }
                    i12 = 1;
                }
                this.f94066f = zzmVarZza.zzd(iObjectWrapperWrap, new com.google.android.gms.internal.mlkit_vision_face.zzh(i10, i11, i12, false, faceDetectorOptions.zzg(), faceDetectorOptions.zza()));
            }
            if (this.f94066f == null && this.f94067g == null && !this.f94061a) {
                OptionalModuleUtils.requestDownload(context, OptionalModuleUtils.BARCODE);
                this.f94061a = true;
            }
            com.google.mlkit.vision.face.internal.zzj.zzc(this.f94065e, false, zzks.NO_ERROR);
            return false;
        } catch (RemoteException e5) {
            throw new MlKitException("Failed to create legacy face detector.", 13, e5);
        } catch (DynamiteModule.LoadingException e7) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e7);
        }
    }
}
