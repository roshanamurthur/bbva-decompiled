package com.dasnano.vdphotoselfiecapture.camera.resolution;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.veridas.camera.resolution.CaptureResolutionSelectionStrategy;
import com.veridas.camera.resolution.Resolution;
import java.util.List;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultCaptureResolutionSelectionStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0007\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/camera/resolution/DefaultCaptureResolutionSelectionStrategy;", "Lcom/dasnano/vdphotoselfiecapture/camera/resolution/AbstractResolutionSelectionStrategy;", "Lcom/veridas/camera/resolution/CaptureResolutionSelectionStrategy;", "", "Lcom/veridas/camera/resolution/Resolution;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "resolution", "select", "", "maxMegapixels", "<init>", "(D)V", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultCaptureResolutionSelectionStrategy extends AbstractResolutionSelectionStrategy implements CaptureResolutionSelectionStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f39546b;

    public DefaultCaptureResolutionSelectionStrategy(double d2) {
        this.f39546b = d2;
    }

    @Override // com.veridas.camera.resolution.ResolutionSelectionStrategy
    @NotNull
    public Resolution select(@NotNull List<? extends Resolution> list, @NotNull Resolution resolution) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        TreeSet treeSet = new TreeSet(new SurfaceWeightedResolutionComparator(this.f39546b, resolution.aspectRatio));
        treeSet.addAll(list);
        Object objFirst = treeSet.first();
        Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
        return (Resolution) objFirst;
    }
}
