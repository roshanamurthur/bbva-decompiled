package com.dasnano.vdphotoselfiecapture.camera.resolution;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.veridas.camera.resolution.Resolution;
import com.veridas.camera.resolution.ResolutionSelectionStrategy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractResolutionSelectionStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0004¨\u0006\b"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/camera/resolution/AbstractResolutionSelectionStrategy;", "Lcom/veridas/camera/resolution/ResolutionSelectionStrategy;", "", "Lcom/veridas/camera/resolution/Resolution;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "findByConstraints", "<init>", "()V", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
public abstract class AbstractResolutionSelectionStrategy implements ResolutionSelectionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resolution f39545a = Resolution.create(1280, 720);

    @Nullable
    public final Resolution findByConstraints(@NotNull List<? extends Resolution> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Resolution resolution = this.f39545a;
        if (list.contains(resolution)) {
            return resolution;
        }
        return null;
    }
}
