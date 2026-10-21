package com.dasnano.vddocumentcapture.camera.resolution;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ResolutionConstraints.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/dasnano/vddocumentcapture/camera/resolution/ResolutionConstraints;", "", "Companion", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ResolutionConstraints {
    public static final float ASPECT_RATIO_TOLERANCE = 0.005f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f39312a;
    public static final int MINIMUM_SIZE = 1200;

    /* JADX INFO: compiled from: ResolutionConstraints.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/dasnano/vddocumentcapture/camera/resolution/ResolutionConstraints$Companion;", "", "()V", "ASPECT_RATIO_TOLERANCE", "", "MINIMUM_SIZE", "", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static final float ASPECT_RATIO_TOLERANCE = 0.005f;
        public static final int MINIMUM_SIZE = 1200;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f39312a = new Companion();
    }
}
