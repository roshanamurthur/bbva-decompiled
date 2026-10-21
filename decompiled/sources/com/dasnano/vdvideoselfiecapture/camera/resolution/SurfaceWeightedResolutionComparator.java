package com.dasnano.vdvideoselfiecapture.camera.resolution;

import com.veridas.camera.resolution.Resolution;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SurfaceWeightedResolutionComparator.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u000b2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/dasnano/vdvideoselfiecapture/camera/resolution/SurfaceWeightedResolutionComparator;", "Ljava/util/Comparator;", "Lcom/veridas/camera/resolution/Resolution;", "Lkotlin/Comparator;", "a", "b", "", "compare", "targetResolution", "<init>", "(Lcom/veridas/camera/resolution/Resolution;)V", "Companion", "video-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
public final class SurfaceWeightedResolutionComparator implements Comparator<Resolution> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Resolution f39726p0;

    public SurfaceWeightedResolutionComparator(@NotNull Resolution targetResolution) {
        Intrinsics.checkNotNullParameter(targetResolution, "targetResolution");
        this.f39726p0 = targetResolution;
    }

    public final double a(Resolution resolution) {
        double d2;
        double d3 = resolution.mp;
        Resolution resolution2 = this.f39726p0;
        double d7 = d3 / ((double) resolution2.mp);
        float f6 = resolution.aspectRatio - resolution2.aspectRatio;
        if (resolution2.width == resolution.width && resolution2.height == resolution.height) {
            return 0.0d;
        }
        double d10 = d7 < 1.0d ? (1.0d - d7) + 0.0d : 0.0d + d7;
        if (d7 < 1.0d) {
            d2 = d10 + 16000.0d;
            double d11 = f6;
            if (d11 >= 0.0d) {
                if (d11 <= 0.0d) {
                    return d2;
                }
                return d2 + 300.0d;
            }
            return d2 + 600.0d;
        }
        if (d7 <= 1.0d) {
            return d10;
        }
        d2 = d10 + 8000.0d;
        double d12 = f6;
        if (d12 >= 0.0d) {
            if (d12 <= 0.0d) {
                return d2;
            }
            return d2 + 300.0d;
        }
        return d2 + 600.0d;
    }

    @Override // java.util.Comparator
    public int compare(@NotNull Resolution a10, @NotNull Resolution b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        double dA = a(a10) - a(b10);
        if (dA > 0.0d) {
            return 1;
        }
        return dA < 0.0d ? -1 : 0;
    }
}
