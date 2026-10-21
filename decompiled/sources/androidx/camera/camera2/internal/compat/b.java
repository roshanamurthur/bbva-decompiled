package androidx.camera.camera2.internal.compat;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import java.time.ZoneId;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ Typeface.Builder d(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    public static /* synthetic */ OutputConfiguration e(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return ZoneId.class;
    }
}
