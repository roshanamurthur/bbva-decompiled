package com.dasnano.vdphotoselfiecapture.other;

import androidx.constraintlayout.motion.widget.Key;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SelfieAliveProProcessing.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/other/SelfieAliveProProcessing;", "Lcom/dasnano/vdphotoselfiecapture/other/AbstractSelfieProcessing;", "delegate", "Lcom/dasnano/vdphotoselfiecapture/other/SelfieProcessingProtocol;", "(Lcom/dasnano/vdphotoselfiecapture/other/SelfieProcessingProtocol;)V", "process", "", "buffer", "Ljava/nio/ByteBuffer;", "width", "", "height", Key.ROTATION, "success", "Ljava/lang/Runnable;", "failure", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelfieAliveProProcessing extends AbstractSelfieProcessing {

    /* JADX INFO: compiled from: SelfieAliveProProcessing.kt */
    public static final class a extends Lambda implements Function1<List<Face>, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Runnable f39699q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable) {
            super(1);
            this.f39699q0 = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<Face> list) {
            List<Face> list2 = list;
            Intrinsics.checkNotNull(list2);
            if (!list2.isEmpty()) {
                SelfieAliveProProcessing selfieAliveProProcessing = SelfieAliveProProcessing.this;
                selfieAliveProProcessing.sortByArea(list2);
                selfieAliveProProcessing.getDelegate().selfieAliveProProcessed(list2.get(0));
            }
            this.f39699q0.run();
            return Unit.INSTANCE;
        }
    }

    public SelfieAliveProProcessing(@NotNull SelfieProcessingProtocol delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        setDelegate(delegate);
    }

    @Override // com.dasnano.vdphotoselfiecapture.other.AbstractSelfieProcessing
    public void process(@NotNull ByteBuffer buffer, int width, int height, int rotation, @NotNull Runnable success, @NotNull final Runnable failure) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        InputImage inputImageFromByteBuffer = InputImage.fromByteBuffer(buffer, width, height, rotation, 17);
        Intrinsics.checkNotNullExpressionValue(inputImageFromByteBuffer, "fromByteBuffer(...)");
        Task<List<Face>> taskProcess = getFaceDetector().process(inputImageFromByteBuffer);
        final a aVar = new a(success);
        taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: com.dasnano.vdphotoselfiecapture.other.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Function1 tmp0 = aVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.dasnano.vdphotoselfiecapture.other.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                Runnable failure2 = failure;
                Intrinsics.checkNotNullParameter(failure2, "$failure");
                Intrinsics.checkNotNullParameter(it, "it");
                failure2.run();
            }
        });
    }
}
