package com.dasnano.vdphotoselfiecapture.camera.resolution;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.noknok.android.client.extension.PlayIntegrity;
import com.veridas.camera.resolution.CaptureResolutionSelectionStrategy;
import com.veridas.camera.resolution.Resolution;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SAPCaptureResolutionSelectionStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0007\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0011"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/camera/resolution/SAPCaptureResolutionSelectionStrategy;", "Lcom/dasnano/vdphotoselfiecapture/camera/resolution/AbstractResolutionSelectionStrategy;", "Lcom/veridas/camera/resolution/CaptureResolutionSelectionStrategy;", "", "Lcom/veridas/camera/resolution/Resolution;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, PlayIntegrity.KEY_PREFERRED, "select", "", "tolerance", "", "minHeight", "minWidth", "", "imageQuality", "<init>", "(DIILjava/lang/String;)V", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSAPCaptureResolutionSelectionStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SAPCaptureResolutionSelectionStrategy.kt\ncom/dasnano/vdphotoselfiecapture/camera/resolution/SAPCaptureResolutionSelectionStrategy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n766#2:113\n857#2,2:114\n766#2:116\n857#2,2:117\n*S KotlinDebug\n*F\n+ 1 SAPCaptureResolutionSelectionStrategy.kt\ncom/dasnano/vdphotoselfiecapture/camera/resolution/SAPCaptureResolutionSelectionStrategy\n*L\n26#1:113\n26#1:114,2\n39#1:116\n39#1:117,2\n*E\n"})
public final class SAPCaptureResolutionSelectionStrategy extends AbstractResolutionSelectionStrategy implements CaptureResolutionSelectionStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f39548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f39551e;

    public SAPCaptureResolutionSelectionStrategy(double d2, int i10, int i11, @NotNull String imageQuality) {
        Intrinsics.checkNotNullParameter(imageQuality, "imageQuality");
        this.f39548b = d2;
        this.f39549c = i10;
        this.f39550d = i11;
        this.f39551e = imageQuality;
    }

    @Override // com.veridas.camera.resolution.ResolutionSelectionStrategy
    @Nullable
    public Resolution select(@NotNull List<Resolution> list, @NotNull Resolution preferred) {
        int i10;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(preferred, "preferred");
        ArrayList arrayList = new ArrayList();
        Resolution resolutionFindByConstraints = findByConstraints(list);
        if (resolutionFindByConstraints != null) {
            return resolutionFindByConstraints;
        }
        List<Resolution> list2 = list;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i10 = this.f39550d;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            Resolution resolution = (Resolution) next;
            if (Math.abs(preferred.aspectRatio - resolution.aspectRatio) < this.f39548b && resolution.width >= i10 && resolution.height >= this.f39549c) {
                arrayList2.add(next);
            }
        }
        arrayList.addAll(arrayList2);
        if (arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list2) {
                if (((Resolution) obj).width >= i10) {
                    arrayList3.add(obj);
                }
            }
            arrayList.addAll(arrayList3);
        }
        if (!arrayList.isEmpty()) {
            list = arrayList;
        }
        String str = this.f39551e;
        boolean zEquals = l.equals(str, "low", true);
        boolean zEquals2 = l.equals(str, "medium", true);
        boolean zEquals3 = l.equals(str, "high", true);
        Resolution resolutionCreate = Resolution.create();
        if (zEquals2 || zEquals) {
            for (Resolution resolution2 : list) {
                int i11 = resolutionCreate.mp;
                if (i11 == 1 || i11 > resolution2.mp) {
                    resolutionCreate = resolution2;
                }
            }
        } else if (zEquals3) {
            for (Resolution resolution3 : list) {
                int i12 = resolution3.mp;
                if (i12 <= 921600 && resolutionCreate.mp < i12) {
                    resolutionCreate = resolution3;
                }
            }
        } else {
            for (Resolution resolution4 : list) {
                if (resolutionCreate.mp < resolution4.mp) {
                    resolutionCreate = resolution4;
                }
            }
        }
        Intrinsics.checkNotNull(resolutionCreate);
        if (resolutionCreate.mp != 1) {
            return resolutionCreate;
        }
        if (!list.isEmpty()) {
            return (Resolution) CollectionsKt___CollectionsKt.last((List) list);
        }
        return null;
    }
}
