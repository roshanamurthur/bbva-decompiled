package com.dasnano.vdvideoselfiecapture.camera.resolution;

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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/dasnano/vdvideoselfiecapture/camera/resolution/DefaultCaptureResolutionSelectionStrategy;", "Lcom/dasnano/vdvideoselfiecapture/camera/resolution/AbstractResolutionSelectionStrategy;", "Lcom/veridas/camera/resolution/CaptureResolutionSelectionStrategy;", "()V", "select", "Lcom/veridas/camera/resolution/Resolution;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "", "targetResolution", "video-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultCaptureResolutionSelectionStrategy extends AbstractResolutionSelectionStrategy implements CaptureResolutionSelectionStrategy {
    @Override // com.veridas.camera.resolution.ResolutionSelectionStrategy
    @NotNull
    public Resolution select(@NotNull List<? extends Resolution> list, @NotNull Resolution targetResolution) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(targetResolution, "targetResolution");
        TreeSet treeSet = new TreeSet(new SurfaceWeightedResolutionComparator(targetResolution));
        treeSet.addAll(list);
        Object objFirst = treeSet.first();
        Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
        return (Resolution) objFirst;
    }
}
