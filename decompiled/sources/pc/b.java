package pc;

import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.budiyev.android.codescanner.Decoder;

/* JADX INFO: compiled from: DecoderWrapper.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Camera f92609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Decoder f92610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f92611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f92612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f92613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f92614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f92615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f92616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f92617i;

    public b(@NonNull Camera camera, @NonNull Camera.CameraInfo cameraInfo, @NonNull Decoder decoder, @NonNull c cVar, @NonNull c cVar2, @NonNull c cVar3, int i10, boolean z10, boolean z11) {
        this.f92609a = camera;
        this.f92610b = decoder;
        this.f92611c = cVar;
        this.f92612d = cVar2;
        this.f92613e = cVar3;
        this.f92614f = i10;
        this.f92615g = cameraInfo.facing == 1;
        this.f92616h = z10;
        this.f92617i = z11;
    }
}
