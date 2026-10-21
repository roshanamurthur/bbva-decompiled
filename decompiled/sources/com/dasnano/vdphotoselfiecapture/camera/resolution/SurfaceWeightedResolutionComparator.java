package com.dasnano.vdphotoselfiecapture.camera.resolution;

import com.veridas.camera.resolution.Resolution;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SurfaceWeightedResolutionComparator.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/camera/resolution/SurfaceWeightedResolutionComparator;", "Ljava/util/Comparator;", "Lcom/veridas/camera/resolution/Resolution;", "Lkotlin/Comparator;", "a", "b", "", "compare", "", "targetMegaPixels", "targetAspectRatio", "<init>", "(DD)V", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
public final class SurfaceWeightedResolutionComparator implements Comparator<Resolution> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final double f39552p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final double f39553q0;

    public SurfaceWeightedResolutionComparator(double d2, double d3) {
        this.f39552p0 = d3;
        this.f39553q0 = d2 * 1024.0d * 1024.0d;
    }

    public final double a(Resolution resolution) {
        double d2;
        double d3 = ((double) resolution.mp) / this.f39553q0;
        double d7 = ((double) resolution.aspectRatio) - this.f39552p0;
        double d10 = d3 < 1.0d ? (1.0d - d3) + 0.0d : d3 + 0.0d;
        if (d3 < 1.0d) {
            d2 = d10 + 16000.0d;
            if (d7 >= 0.0d) {
                if (d7 <= 0.0d) {
                    return d2;
                }
                return d2 + 1000.0d;
            }
            return d2 + 2000.0d;
        }
        if (d3 <= 1.0d) {
            return d10;
        }
        d2 = d10 + 2000.0d;
        if (d7 >= 0.0d) {
            if (d7 <= 0.0d) {
                return d2;
            }
            return d2 + 1000.0d;
        }
        return d2 + 2000.0d;
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
