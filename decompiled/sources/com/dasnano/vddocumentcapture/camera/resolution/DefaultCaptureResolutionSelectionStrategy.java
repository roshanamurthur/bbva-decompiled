package com.dasnano.vddocumentcapture.camera.resolution;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.veridas.camera.resolution.CaptureResolutionSelectionStrategy;
import com.veridas.camera.resolution.Resolution;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import ld.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultCaptureResolutionSelectionStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fJ\u001e\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/dasnano/vddocumentcapture/camera/resolution/DefaultCaptureResolutionSelectionStrategy;", "Lcom/veridas/camera/resolution/CaptureResolutionSelectionStrategy;", "", "Lcom/veridas/camera/resolution/Resolution;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "resolution", "select", "", "maxMegaPixels", "<init>", "(F)V", "", "(I)V", "document-capture_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDefaultCaptureResolutionSelectionStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCaptureResolutionSelectionStrategy.kt\ncom/dasnano/vddocumentcapture/camera/resolution/DefaultCaptureResolutionSelectionStrategy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n766#2:87\n857#2,2:88\n*S KotlinDebug\n*F\n+ 1 DefaultCaptureResolutionSelectionStrategy.kt\ncom/dasnano/vddocumentcapture/camera/resolution/DefaultCaptureResolutionSelectionStrategy\n*L\n57#1:87\n57#1:88,2\n*E\n"})
public final class DefaultCaptureResolutionSelectionStrategy implements CaptureResolutionSelectionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39305a;

    public DefaultCaptureResolutionSelectionStrategy(float f6) {
        this.f39305a = (int) (f6 * 1024.0f * 1024.0f);
    }

    @Override // com.veridas.camera.resolution.ResolutionSelectionStrategy
    @NotNull
    public Resolution select(@NotNull List<? extends Resolution> list, @NotNull Resolution resolution) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        float f6 = resolution.aspectRatio;
        ArrayList<Resolution> arrayList = new ArrayList();
        final b bVar = b.f83184p0;
        Collections.sort(list, new Comparator() { // from class: ld.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Function2 tmp0 = bVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Number) tmp0.invoke(obj, obj2)).intValue();
            }
        });
        String strF = "";
        for (Resolution resolution2 : list) {
            float fAbs = Math.abs(f6 - resolution2.aspectRatio);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ROOT, "%dx%d;", Arrays.copyOf(new Object[]{Integer.valueOf(resolution2.width), Integer.valueOf(resolution2.height)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            strF = u.f(strF, str);
            if (fAbs < 0.005f && resolution2.width >= 1200) {
                arrayList.add(resolution2);
            }
        }
        VDLogger.INSTANCE.log(Logger.Tag.CAPTURE_AVAILABLE_SIZES, strF);
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((Resolution) obj).width >= 1200) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        Resolution resolutionCreate = Resolution.create();
        for (Resolution resolution3 : arrayList) {
            int i10 = resolution3.mp;
            if (i10 <= this.f39305a && resolutionCreate.mp < i10) {
                resolutionCreate = resolution3;
            }
        }
        Intrinsics.checkNotNull(resolutionCreate);
        return resolutionCreate;
    }

    public DefaultCaptureResolutionSelectionStrategy(int i10) {
        this.f39305a = i10 * 1048576;
    }
}
