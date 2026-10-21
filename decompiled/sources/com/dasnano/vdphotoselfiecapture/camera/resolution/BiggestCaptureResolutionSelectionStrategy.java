package com.dasnano.vdphotoselfiecapture.camera.resolution;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.noknok.android.client.extension.PlayIntegrity;
import com.veridas.camera.resolution.CaptureResolutionSelectionStrategy;
import com.veridas.camera.resolution.Resolution;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiggestCaptureResolutionSelectionStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/camera/resolution/BiggestCaptureResolutionSelectionStrategy;", "Lcom/veridas/camera/resolution/CaptureResolutionSelectionStrategy;", "()V", "select", "Lcom/veridas/camera/resolution/Resolution;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "", PlayIntegrity.KEY_PREFERRED, "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBiggestCaptureResolutionSelectionStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiggestCaptureResolutionSelectionStrategy.kt\ncom/dasnano/vdphotoselfiecapture/camera/resolution/BiggestCaptureResolutionSelectionStrategy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n1963#2,14:14\n*S KotlinDebug\n*F\n+ 1 BiggestCaptureResolutionSelectionStrategy.kt\ncom/dasnano/vdphotoselfiecapture/camera/resolution/BiggestCaptureResolutionSelectionStrategy\n*L\n8#1:14,14\n*E\n"})
public final class BiggestCaptureResolutionSelectionStrategy implements CaptureResolutionSelectionStrategy {
    @Override // com.veridas.camera.resolution.ResolutionSelectionStrategy
    @NotNull
    public Resolution select(@NotNull List<? extends Resolution> list, @NotNull Resolution preferred) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(preferred, "preferred");
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i10 = ((Resolution) next).width;
                do {
                    Object next2 = it.next();
                    int i11 = ((Resolution) next2).width;
                    if (i10 < i11) {
                        next = next2;
                        i10 = i11;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Resolution resolution = (Resolution) obj;
        if (resolution != null) {
            return resolution;
        }
        throw new IllegalArgumentException("Resolution list must not be empty");
    }
}
