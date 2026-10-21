package sg;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.internal.zzb;
import com.google.mlkit.vision.barcode.internal.zzm;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f93192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f93193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzad f93194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zznm f93195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public zzaf f93196e;

    public c(Context context, BarcodeScannerOptions barcodeScannerOptions, zznm zznmVar) {
        zzad zzadVar = new zzad();
        this.f93194c = zzadVar;
        this.f93193b = context;
        zzadVar.zza = barcodeScannerOptions.zza();
        this.f93195d = zznmVar;
    }

    @Override // sg.a
    @WorkerThread
    public final ArrayList a(InputImage inputImage) throws MlKitException {
        zzq[] zzqVarArrZzf;
        if (this.f93196e == null) {
            zzc();
        }
        zzaf zzafVar = this.f93196e;
        if (zzafVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzaf zzafVar2 = (zzaf) Preconditions.checkNotNull(zzafVar);
        zzaj zzajVar = new zzaj(inputImage.getWidth(), inputImage.getHeight(), 0, 0L, CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()));
        try {
            int format = inputImage.getFormat();
            if (format == -1) {
                zzqVarArrZzf = zzafVar2.zzf(ObjectWrapper.wrap(inputImage.getBitmapInternal()), zzajVar);
            } else if (format == 17) {
                zzqVarArrZzf = zzafVar2.zze(ObjectWrapper.wrap(inputImage.getByteBuffer()), zzajVar);
            } else if (format == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes());
                zzajVar.zza = planeArr[0].getRowStride();
                zzqVarArrZzf = zzafVar2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzajVar);
            } else {
                if (format != 842094169) {
                    int format2 = inputImage.getFormat();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unsupported image format: ");
                    sb2.append(format2);
                    throw new MlKitException(sb2.toString(), 3);
                }
                zzqVarArrZzf = zzafVar2.zze(ObjectWrapper.wrap(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false)), zzajVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzq zzqVar : zzqVarArrZzf) {
                arrayList.add(new Barcode(new zzm(zzqVar), inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (RemoteException e5) {
            throw new MlKitException("Failed to detect with legacy barcode detector", 13, e5);
        }
    }

    @Override // sg.a
    @WorkerThread
    public final void zzb() {
        zzaf zzafVar = this.f93196e;
        if (zzafVar != null) {
            try {
                zzafVar.zzd();
            } catch (RemoteException unused) {
            }
            this.f93196e = null;
        }
    }

    @Override // sg.a
    @WorkerThread
    public final boolean zzc() throws MlKitException {
        Context context = this.f93193b;
        if (this.f93196e != null) {
            return false;
        }
        try {
            zzaf zzafVarZzd = zzah.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(context), this.f93194c);
            this.f93196e = zzafVarZzd;
            zznm zznmVar = this.f93195d;
            if (zzafVarZzd == null && !this.f93192a) {
                OptionalModuleUtils.requestDownload(context, OptionalModuleUtils.BARCODE);
                this.f93192a = true;
                zzb.a(zznmVar, zzkj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            zzb.a(zznmVar, zzkj.NO_ERROR);
            return false;
        } catch (RemoteException e5) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e5);
        } catch (DynamiteModule.LoadingException e7) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e7);
        }
    }
}
