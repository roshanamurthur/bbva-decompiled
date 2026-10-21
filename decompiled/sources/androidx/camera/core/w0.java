package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;
import com.visa.internal.CheckmarkElement;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2278p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2279q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2280r0;

    public /* synthetic */ w0(Object obj, Object obj2, int i10) {
        this.f2278p0 = i10;
        this.f2279q0 = obj;
        this.f2280r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2278p0;
        Object obj = this.f2280r0;
        Object obj2 = this.f2279q0;
        switch (i10) {
            case 0:
                ((MetadataImageReader) obj2).lambda$enqueueImageProxy$1((ImageReaderProxy.OnImageAvailableListener) obj);
                break;
            case 1:
                uf.j.b bVar = (uf.j.b) obj;
                try {
                    uf.j.this.set(((Callable) obj2).call());
                } catch (Exception e5) {
                    uf.j.this.setException(e5);
                    return;
                }
                break;
            default:
                CheckmarkElement.b((CheckmarkElement) obj2, (Function0) obj);
                break;
        }
    }
}
