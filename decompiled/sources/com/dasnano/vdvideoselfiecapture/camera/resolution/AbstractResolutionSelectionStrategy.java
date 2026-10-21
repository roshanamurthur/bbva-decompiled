package com.dasnano.vdvideoselfiecapture.camera.resolution;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.veridas.camera.resolution.Resolution;
import com.veridas.camera.resolution.ResolutionSelectionStrategy;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractResolutionSelectionStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0004¨\u0006\b"}, d2 = {"Lcom/dasnano/vdvideoselfiecapture/camera/resolution/AbstractResolutionSelectionStrategy;", "Lcom/dasnano/vdvideoselfiecapture/camera/resolution/ResolutionConstraints;", "Lcom/veridas/camera/resolution/ResolutionSelectionStrategy;", "()V", "findByConstraints", "Lcom/veridas/camera/resolution/Resolution;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "", "video-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbstractResolutionSelectionStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractResolutionSelectionStrategy.kt\ncom/dasnano/vdvideoselfiecapture/camera/resolution/AbstractResolutionSelectionStrategy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,16:1\n288#2,2:17\n*S KotlinDebug\n*F\n+ 1 AbstractResolutionSelectionStrategy.kt\ncom/dasnano/vdvideoselfiecapture/camera/resolution/AbstractResolutionSelectionStrategy\n*L\n13#1:17,2\n*E\n"})
public abstract class AbstractResolutionSelectionStrategy implements ResolutionConstraints, ResolutionSelectionStrategy {
    @Nullable
    public final Resolution findByConstraints(@NotNull List<? extends Resolution> list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            Resolution resolution = (Resolution) next;
            if (resolution.width == 1280 && resolution.height == 720) {
                return (Resolution) next;
            }
        }
        next = null;
        return (Resolution) next;
    }
}
