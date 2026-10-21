package sg;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzon;
import com.google.android.gms.internal.mlkit_vision_barcode.zzop;
import com.google.android.gms.internal.mlkit_vision_barcode.zzox;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpg;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.internal.zzb;
import com.google.mlkit.vision.barcode.internal.zzk;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zzcc f93184h = zzcc.zzi(OptionalModuleUtils.BARCODE_MODULE_ID, OptionalModuleUtils.TFLITE_DYNAMITE_MODULE_ID);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f93185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f93186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f93187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f93188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BarcodeScannerOptions f93189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zznm f93190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public zzox f93191g;

    public b(Context context, BarcodeScannerOptions barcodeScannerOptions, zznm zznmVar) {
        this.f93188d = context;
        this.f93189e = barcodeScannerOptions;
        this.f93190f = zznmVar;
    }

    @Override // sg.a
    @WorkerThread
    public final ArrayList a(InputImage inputImage) throws MlKitException {
        if (this.f93191g == null) {
            zzc();
        }
        zzox zzoxVar = (zzox) Preconditions.checkNotNull(this.f93191g);
        if (!this.f93185a) {
            try {
                zzoxVar.zze();
                this.f93185a = true;
            } catch (RemoteException e5) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e5);
            }
        }
        int width = inputImage.getWidth();
        if (inputImage.getFormat() == 35) {
            width = ((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()))[0].getRowStride();
        }
        try {
            List listZzd = zzoxVar.zzd(ImageUtils.getInstance().getImageDataWrapper(inputImage), new zzpg(inputImage.getFormat(), width, inputImage.getHeight(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new Barcode(new zzk((zzon) it.next()), inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (RemoteException e7) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e7);
        }
    }

    @Override // sg.a
    @WorkerThread
    public final void zzb() {
        zzox zzoxVar = this.f93191g;
        if (zzoxVar != null) {
            try {
                zzoxVar.zzf();
            } catch (RemoteException unused) {
            }
            this.f93191g = null;
            this.f93185a = false;
        }
    }

    @Override // sg.a
    @WorkerThread
    public final boolean zzc() throws MlKitException {
        if (this.f93191g != null) {
            return this.f93186b;
        }
        Context context = this.f93188d;
        boolean z10 = DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > 0;
        BarcodeScannerOptions barcodeScannerOptions = this.f93189e;
        zznm zznmVar = this.f93190f;
        if (z10) {
            this.f93186b = true;
            try {
                this.f93191g = zzoz.zza(DynamiteModule.load(context, DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID).instantiate("com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator")).zzd(ObjectWrapper.wrap(context), new zzop(barcodeScannerOptions.zza()));
            } catch (RemoteException e5) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e5);
            } catch (DynamiteModule.LoadingException e7) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e7);
            }
        } else {
            this.f93186b = false;
            if (!OptionalModuleUtils.areAllRequiredModulesAvailable(context, f93184h)) {
                if (!this.f93187c) {
                    OptionalModuleUtils.requestDownload(context, zzcc.zzi(OptionalModuleUtils.BARCODE, OptionalModuleUtils.TFLITE_DYNAMITE));
                    this.f93187c = true;
                }
                zzb.a(zznmVar, zzkj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f93191g = zzoz.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.BARCODE_MODULE_ID).instantiate("com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator")).zzd(ObjectWrapper.wrap(context), new zzop(barcodeScannerOptions.zza()));
            } catch (RemoteException | DynamiteModule.LoadingException e10) {
                zzb.a(zznmVar, zzkj.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e10);
            }
        }
        zzb.a(zznmVar, zzkj.NO_ERROR);
        return this.f93186b;
    }
}
