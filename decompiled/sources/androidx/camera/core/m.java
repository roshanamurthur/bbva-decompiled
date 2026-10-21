package androidx.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2168p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2169q0;

    public /* synthetic */ m(Object obj, int i10) {
        this.f2168p0 = i10;
        this.f2169q0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        int i10 = this.f2168p0;
        Object obj = this.f2169q0;
        switch (i10) {
            case 0:
                return ((CaptureProcessorPipeline) obj).lambda$getCloseFuture$4(completer);
            default:
                return VideoCapture.lambda$startRecording$1((AtomicReference) obj, completer);
        }
    }
}
