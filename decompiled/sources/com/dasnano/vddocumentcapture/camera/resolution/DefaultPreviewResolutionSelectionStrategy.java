package com.dasnano.vddocumentcapture.camera.resolution;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.veridas.camera.resolution.PreviewResolutionSelectionStrategy;
import com.veridas.camera.resolution.Resolution;
import java.util.List;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultPreviewResolutionSelectionStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/dasnano/vddocumentcapture/camera/resolution/DefaultPreviewResolutionSelectionStrategy;", "Lcom/veridas/camera/resolution/PreviewResolutionSelectionStrategy;", "()V", "select", "Lcom/veridas/camera/resolution/Resolution;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "", "resolution", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultPreviewResolutionSelectionStrategy implements PreviewResolutionSelectionStrategy {
    @Override // com.veridas.camera.resolution.ResolutionSelectionStrategy
    @NotNull
    public Resolution select(@NotNull List<? extends Resolution> list, @NotNull Resolution resolution) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        TreeSet treeSet = new TreeSet(new PreviewResolutionComparator(resolution, 3.0f, 2.4f, 2.8f));
        treeSet.addAll(list);
        Object objFirst = treeSet.first();
        Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
        return (Resolution) objFirst;
    }
}
