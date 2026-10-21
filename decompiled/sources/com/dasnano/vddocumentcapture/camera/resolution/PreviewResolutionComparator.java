package com.dasnano.vddocumentcapture.camera.resolution;

import com.noknok.android.client.extension.PlayIntegrity;
import com.veridas.camera.resolution.Resolution;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PreviewResolutionComparator.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/dasnano/vddocumentcapture/camera/resolution/PreviewResolutionComparator;", "Ljava/util/Comparator;", "Lcom/veridas/camera/resolution/Resolution;", "Lkotlin/Comparator;", "a", "b", "", "compare", PlayIntegrity.KEY_PREFERRED, "", "mp", "minSurfaceTolerance", "maxSurfaceTolerance", "<init>", "(Lcom/veridas/camera/resolution/Resolution;FFF)V", "document-capture_release"}, k = 1, mv = {1, 9, 0})
public final class PreviewResolutionComparator implements Comparator<Resolution> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Resolution f39308p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final float f39309q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final float f39310r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final float f39311s0;

    public PreviewResolutionComparator(@NotNull Resolution preferred, float f6, float f10, float f11) {
        Intrinsics.checkNotNullParameter(preferred, "preferred");
        this.f39308p0 = preferred;
        this.f39309q0 = f10;
        this.f39310r0 = f11;
        this.f39311s0 = f6 * 1024.0f * 1024.0f;
    }

    public final float a(Resolution resolution) {
        float f6;
        float f10 = resolution.mp / this.f39311s0;
        float f11 = resolution.aspectRatio - this.f39308p0.aspectRatio;
        boolean z10 = f10 < this.f39309q0;
        boolean z11 = f10 > this.f39310r0;
        float f12 = f11 + 0.0f;
        if (f10 < 1.0f) {
            f10 = 1 - f10;
        }
        float f13 = f12 + f10;
        if (f11 < 0.0f) {
            f13 += 16384.0f;
            if (z10) {
                f6 = 4096.0f;
                return f13 + f6;
            }
            if (!z11) {
                return f13;
            }
            return f13 + 512.0f;
        }
        if (f11 <= 0.0f) {
            if (z10) {
                f6 = 8192.0f;
                return f13 + f6;
            }
            if (!z11) {
                return f13;
            }
            return f13 + 512.0f;
        }
        f13 += 2048.0f;
        if (z10) {
            f6 = 6144.0f;
            return f13 + f6;
        }
        if (!z11) {
            return f13;
        }
        return f13 + 512.0f;
    }

    @Override // java.util.Comparator
    public int compare(@NotNull Resolution a10, @NotNull Resolution b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        float fA = a(a10) - a(b10);
        if (fA > 0.0f) {
            return 1;
        }
        return fA < 0.0f ? -1 : 0;
    }
}
