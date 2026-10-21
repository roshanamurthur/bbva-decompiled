package androidx.camera.camera2.internal;

import androidx.arch.core.util.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements Function {
    public static String a(StringBuilder sb2, float f6, String str) {
        sb2.append(f6);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        return Camera2CapturePipeline.AePreCaptureTask.lambda$preCapture$1((Void) obj);
    }
}
