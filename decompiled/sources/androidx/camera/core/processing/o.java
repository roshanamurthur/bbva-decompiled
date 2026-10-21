package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.util.Base64;
import androidx.camera.core.SurfaceOutput;
import com.bbva.signaturepad.ui.widget.SignaturePadView;
import com.bbva.signaturepad.util.AuxCache;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.ktx.TaskState;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2226p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2227q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2228r0;

    public /* synthetic */ o(Object obj, Object obj2, int i10) {
        this.f2226p0 = i10;
        this.f2227q0 = obj;
        this.f2228r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2226p0;
        Object obj = this.f2228r0;
        Object obj2 = this.f2227q0;
        switch (i10) {
            case 0:
                ((SurfaceProcessorWithExecutor) obj2).lambda$onOutputSurface$1((SurfaceOutput) obj);
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj2;
                SignaturePadView.OnSignatureSaveListener signatureSaveListener = (SignaturePadView.OnSignatureSaveListener) obj;
                SignaturePadView.Companion companion = SignaturePadView.INSTANCE;
                Intrinsics.checkNotNullParameter(signatureSaveListener, "$signatureSaveListener");
                if (bitmap == null) {
                    signatureSaveListener.onSignatureSaveFailed();
                } else {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                        String strEncodeToString = Base64.encodeToString(byteArray, 2);
                        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
                        AuxCache.INSTANCE.setSUCCESS_DIGITAL_SIGN_DATA(strEncodeToString);
                        signatureSaveListener.onSignatureSaved();
                    } catch (Exception unused) {
                        signatureSaveListener.onSignatureSaveFailed();
                        return;
                    }
                }
                break;
            default:
                ChannelsKt.trySendBlocking((ProducerScope) obj2, new TaskState.InProgress((StorageTask.SnapshotBase) obj));
                break;
        }
    }
}
