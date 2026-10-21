package com.dasnano.vddocumentcapture.camera.resolution;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.veridas.camera.resolution.PreviewResolutionSelectionStrategy;
import com.veridas.camera.resolution.Resolution;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LargestByAspectRatioPreviewResolutionSelectionStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/dasnano/vddocumentcapture/camera/resolution/LargestByAspectRatioPreviewResolutionSelectionStrategy;", "Lcom/veridas/camera/resolution/PreviewResolutionSelectionStrategy;", "", "Lcom/veridas/camera/resolution/Resolution;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "resolution", "select", "<init>", "()V", "document-capture_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLargestByAspectRatioPreviewResolutionSelectionStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LargestByAspectRatioPreviewResolutionSelectionStrategy.kt\ncom/dasnano/vddocumentcapture/camera/resolution/LargestByAspectRatioPreviewResolutionSelectionStrategy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,19:1\n288#2,2:20\n*S KotlinDebug\n*F\n+ 1 LargestByAspectRatioPreviewResolutionSelectionStrategy.kt\ncom/dasnano/vddocumentcapture/camera/resolution/LargestByAspectRatioPreviewResolutionSelectionStrategy\n*L\n14#1:20,2\n*E\n"})
public final class LargestByAspectRatioPreviewResolutionSelectionStrategy implements PreviewResolutionSelectionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39306a = 0.2f;

    /* JADX INFO: compiled from: LargestByAspectRatioPreviewResolutionSelectionStrategy.kt */
    public static final class a extends Lambda implements Function2<Resolution, Resolution, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f39307p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Resolution resolution, Resolution resolution2) {
            return Integer.valueOf(resolution2.mp - resolution.mp);
        }
    }

    @Override // com.veridas.camera.resolution.ResolutionSelectionStrategy
    @NotNull
    public Resolution select(@NotNull List<? extends Resolution> list, @NotNull Resolution resolution) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        final a aVar = a.f39307p0;
        Collections.sort(list, new Comparator() { // from class: ld.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Function2 tmp0 = aVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Number) tmp0.invoke(obj, obj2)).intValue();
            }
        });
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (Math.abs(((Resolution) next).aspectRatio - resolution.aspectRatio) > this.f39306a);
        Resolution resolution2 = (Resolution) next;
        return resolution2 == null ? list.get(0) : resolution2;
    }
}
