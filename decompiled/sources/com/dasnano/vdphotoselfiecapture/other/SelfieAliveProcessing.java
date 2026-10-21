package com.dasnano.vdphotoselfiecapture.other;

import androidx.constraintlayout.motion.widget.Key;
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

/* JADX INFO: compiled from: SelfieAliveProcessing.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/other/SelfieAliveProcessing;", "Lcom/dasnano/vdphotoselfiecapture/other/AbstractSelfieProcessing;", "delegate", "Lcom/dasnano/vdphotoselfiecapture/other/SelfieProcessingProtocol;", "(Lcom/dasnano/vdphotoselfiecapture/other/SelfieProcessingProtocol;)V", "process", "", "buffer", "Ljava/nio/ByteBuffer;", "width", "", "height", Key.ROTATION, "success", "Ljava/lang/Runnable;", "failure", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelfieAliveProcessing extends AbstractSelfieProcessing {

    /* JADX INFO: compiled from: SelfieAliveProcessing.kt */
    public static final class a extends Lambda implements Function1<List<Face>, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f39701q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f39702r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f39703s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f39704t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Runnable f39705u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ByteBuffer byteBuffer, int i10, int i11, int i12, Runnable runnable) {
            super(1);
            this.f39701q0 = byteBuffer;
            this.f39702r0 = i10;
            this.f39703s0 = i11;
            this.f39704t0 = i12;
            this.f39705u0 = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<Face> list) {
            List<Face> list2 = list;
            Intrinsics.checkNotNull(list2);
            if (!list2.isEmpty()) {
                Float smilingProbability = list2.get(0).getSmilingProbability();
                if (smilingProbability == null) {
                    smilingProbability = Float.valueOf(0.0f);
                }
                SelfieAliveProcessing.this.getDelegate().smileProcessed(this.f39701q0, this.f39702r0, this.f39703s0, this.f39704t0, smilingProbability.floatValue());
            }
            this.f39705u0.run();
            return Unit.INSTANCE;
        }
    }

    public SelfieAliveProcessing(@NotNull SelfieProcessingProtocol delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        setDelegate(delegate);
    }

    @Override // com.dasnano.vdphotoselfiecapture.other.AbstractSelfieProcessing
    public void process(@NotNull ByteBuffer buffer, int width, int height, int rotation, @NotNull Runnable success, @NotNull Runnable failure) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        InputImage inputImageFromByteBuffer = InputImage.fromByteBuffer(buffer, width, height, rotation, 17);
        Intrinsics.checkNotNullExpressionValue(inputImageFromByteBuffer, "fromByteBuffer(...)");
        getFaceDetector().process(inputImageFromByteBuffer).addOnSuccessListener(new d(new a(buffer, width, height, rotation, success), 0)).addOnFailureListener(new e(failure, 0));
    }
}
