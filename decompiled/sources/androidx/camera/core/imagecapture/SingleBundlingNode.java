package androidx.camera.core.imagecapture;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.Threads;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
class SingleBundlingNode implements BundlingNode {
    private ProcessingNode.In mOutputEdge;
    private ProcessingRequest mPendingRequest;

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void matchImageWithRequest(@NonNull ImageProxy imageProxy) {
        Threads.checkMainThread();
        Preconditions.checkState(this.mPendingRequest != null);
        Object tag = imageProxy.getImageInfo().getTagBundle().getTag(this.mPendingRequest.getTagBundleKey());
        Objects.requireNonNull(tag);
        Preconditions.checkState(((Integer) tag).intValue() == this.mPendingRequest.getStageIds().get(0).intValue());
        this.mOutputEdge.getEdge().accept(ProcessingNode.InputPacket.of(this.mPendingRequest, imageProxy));
        this.mPendingRequest = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void trackIncomingRequest(@NonNull ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        Preconditions.checkState(processingRequest.getStageIds().size() == 1, "Cannot handle multi-image capture.");
        Preconditions.checkState(this.mPendingRequest == null, "Already has an existing request.");
        this.mPendingRequest = processingRequest;
    }

    @Override // androidx.camera.core.processing.Node
    @NonNull
    public ProcessingNode.In transform(@NonNull CaptureNode.Out out) {
        out.getImageEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.j
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f2104p0.matchImageWithRequest((ImageProxy) obj);
            }
        });
        out.getRequestEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.k
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f2105p0.trackIncomingRequest((ProcessingRequest) obj);
            }
        });
        ProcessingNode.In inOf = ProcessingNode.In.of(out.getFormat());
        this.mOutputEdge = inOf;
        return inOf;
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }
}
