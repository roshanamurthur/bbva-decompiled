package vg;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzoy;
import com.google.android.gms.internal.mlkit_vision_face.zzpa;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.mlkit.vision.face.internal.zzh;
import com.google.mlkit.vision.face.internal.zzj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f94053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FaceDetectorOptions f94054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f94055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f94056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f94057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzoc f94058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public zzoy f94059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public zzoy f94060h;

    public a(Context context, FaceDetectorOptions faceDetectorOptions, zzoc zzocVar) {
        this.f94053a = context;
        this.f94054b = faceDetectorOptions;
        this.f94058f = zzocVar;
    }

    public static ArrayList d(zzoy zzoyVar, InputImage inputImage) throws MlKitException {
        if (inputImage.getFormat() == -1) {
            inputImage = InputImage.fromByteBuffer(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees(), 17);
        }
        try {
            List listZzd = zzoyVar.zzd(ImageUtils.getInstance().getImageDataWrapper(inputImage), new zzoq(inputImage.getFormat(), inputImage.getWidth(), inputImage.getHeight(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new Face((zzow) it.next(), inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (RemoteException e5) {
            throw new MlKitException("Failed to run face detector.", 13, e5);
        }
    }

    @Override // vg.b
    @WorkerThread
    public final Pair a(InputImage inputImage) throws MlKitException {
        ArrayList arrayListD;
        if (this.f94060h == null && this.f94059g == null) {
            zzd();
        }
        if (!this.f94055c) {
            try {
                zzoy zzoyVar = this.f94060h;
                if (zzoyVar != null) {
                    zzoyVar.zze();
                }
                zzoy zzoyVar2 = this.f94059g;
                if (zzoyVar2 != null) {
                    zzoyVar2.zze();
                }
                this.f94055c = true;
            } catch (RemoteException e5) {
                throw new MlKitException("Failed to init face detector.", 13, e5);
            }
        }
        zzoy zzoyVar3 = this.f94060h;
        ArrayList arrayListD2 = null;
        if (zzoyVar3 != null) {
            arrayListD = d(zzoyVar3, inputImage);
            if (!this.f94054b.zzg()) {
                zzh.a(arrayListD);
            }
        } else {
            arrayListD = null;
        }
        zzoy zzoyVar4 = this.f94059g;
        if (zzoyVar4 != null) {
            arrayListD2 = d(zzoyVar4, inputImage);
            zzh.a(arrayListD2);
        }
        return new Pair(arrayListD, arrayListD2);
    }

    public final void b() throws RemoteException, DynamiteModule.LoadingException {
        FaceDetectorOptions faceDetectorOptions = this.f94054b;
        if (faceDetectorOptions.zzc() != 2) {
            if (this.f94060h == null) {
                this.f94060h = c(new zzou(faceDetectorOptions.zze(), faceDetectorOptions.zzd(), faceDetectorOptions.zzb(), 1, faceDetectorOptions.zzg(), faceDetectorOptions.zza()));
                return;
            }
            return;
        }
        if (this.f94059g == null) {
            this.f94059g = c(new zzou(faceDetectorOptions.zze(), 1, 1, 2, false, faceDetectorOptions.zza()));
        }
        if ((faceDetectorOptions.zzd() == 2 || faceDetectorOptions.zzb() == 2 || faceDetectorOptions.zze() == 2) && this.f94060h == null) {
            this.f94060h = c(new zzou(faceDetectorOptions.zze(), faceDetectorOptions.zzd(), faceDetectorOptions.zzb(), 1, faceDetectorOptions.zzg(), faceDetectorOptions.zza()));
        }
    }

    public final zzoy c(zzou zzouVar) throws RemoteException, DynamiteModule.LoadingException {
        boolean z10 = this.f94056d;
        Context context = this.f94053a;
        return z10 ? zzpa.zza(DynamiteModule.load(context, DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID).instantiate("com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator")).zzd(ObjectWrapper.wrap(context), zzouVar) : zzpa.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.FACE_MODULE_ID).instantiate("com.google.android.gms.vision.face.mlkit.FaceDetectorCreator")).zzd(ObjectWrapper.wrap(context), zzouVar);
    }

    @Override // vg.b
    @WorkerThread
    public final void zzb() {
        try {
            zzoy zzoyVar = this.f94060h;
            if (zzoyVar != null) {
                zzoyVar.zzf();
                this.f94060h = null;
            }
            zzoy zzoyVar2 = this.f94059g;
            if (zzoyVar2 != null) {
                zzoyVar2.zzf();
                this.f94059g = null;
            }
        } catch (RemoteException unused) {
        }
        this.f94055c = false;
    }

    @Override // vg.b
    @WorkerThread
    public final boolean zzd() throws MlKitException {
        if (this.f94060h != null || this.f94059g != null) {
            return this.f94056d;
        }
        Context context = this.f94053a;
        int localVersion = DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID);
        zzoc zzocVar = this.f94058f;
        if (localVersion > 0) {
            this.f94056d = true;
            try {
                b();
            } catch (RemoteException e5) {
                throw new MlKitException("Failed to create thick face detector.", 13, e5);
            } catch (DynamiteModule.LoadingException e7) {
                throw new MlKitException("Failed to load the bundled face module.", 13, e7);
            }
        } else {
            this.f94056d = false;
            try {
                b();
            } catch (RemoteException e10) {
                zzj.zzc(zzocVar, this.f94056d, zzks.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin face detector.", 13, e10);
            } catch (DynamiteModule.LoadingException e11) {
                if (!this.f94057e) {
                    OptionalModuleUtils.requestDownload(context, "face");
                    this.f94057e = true;
                }
                zzj.zzc(zzocVar, this.f94056d, zzks.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the face module to be downloaded. Please wait.", 14, e11);
            }
        }
        zzj.zzc(zzocVar, this.f94056d, zzks.NO_ERROR);
        return this.f94056d;
    }
}
