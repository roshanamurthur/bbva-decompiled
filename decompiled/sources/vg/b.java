package vg;

import android.util.Pair;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public interface b {
    Pair a(InputImage inputImage) throws MlKitException;

    void zzb();

    boolean zzd() throws MlKitException;
}
