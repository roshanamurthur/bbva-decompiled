package com.dasnano.vdvideoselfiecapture.camera.resolution;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.noknok.android.client.extension.PlayIntegrity;
import com.veridas.camera.resolution.PreviewResolutionSelectionStrategy;
import com.veridas.camera.resolution.Resolution;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultPreviewResolutionSelectionStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0007\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/dasnano/vdvideoselfiecapture/camera/resolution/DefaultPreviewResolutionSelectionStrategy;", "Lcom/dasnano/vdvideoselfiecapture/camera/resolution/AbstractResolutionSelectionStrategy;", "Lcom/veridas/camera/resolution/PreviewResolutionSelectionStrategy;", "", "Lcom/veridas/camera/resolution/Resolution;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, PlayIntegrity.KEY_PREFERRED, "select", "<init>", "()V", "Companion", "video-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultPreviewResolutionSelectionStrategy extends AbstractResolutionSelectionStrategy implements PreviewResolutionSelectionStrategy {
    public static Resolution a(List list, Resolution resolution, float f6, double d2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Resolution resolution2 = (Resolution) it.next();
            if (Math.abs(f6 - resolution2.aspectRatio) < d2 && resolution.mp > resolution2.mp && resolution2.width >= 300) {
                resolution = resolution2;
            }
        }
        return resolution;
    }

    @Override // com.veridas.camera.resolution.ResolutionSelectionStrategy
    @Nullable
    public Resolution select(@NotNull List<? extends Resolution> list, @NotNull Resolution preferred) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(preferred, "preferred");
        float f6 = preferred.aspectRatio;
        Resolution resolutionCreate = Resolution.create(3000);
        Resolution resolutionFindByConstraints = findByConstraints(list);
        if (resolutionFindByConstraints != null) {
            return resolutionFindByConstraints;
        }
        Intrinsics.checkNotNull(resolutionCreate);
        Resolution resolutionA = a(list, resolutionCreate, f6, 0.03d);
        if (resolutionA.mp == resolutionCreate.mp) {
            resolutionA = a(list, resolutionCreate, f6, 0.13d);
            if (resolutionA.mp == resolutionCreate.mp) {
                return list.get(0);
            }
        }
        return resolutionA;
    }
}
