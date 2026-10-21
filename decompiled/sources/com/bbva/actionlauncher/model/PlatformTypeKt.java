package com.bbva.actionlauncher.model;

import androidx.camera.core.processing.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformType.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"getMarketSchemeAndUri", "", "", "Lcom/bbva/actionlauncher/model/PlatformType;", "packageName", "actionlauncher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PlatformTypeKt {

    /* JADX INFO: compiled from: PlatformType.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlatformType.values().length];
            try {
                iArr[PlatformType.GMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlatformType.HMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final List<String> getMarketSchemeAndUri(@NotNull PlatformType platformType, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(platformType, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int i10 = WhenMappings.$EnumSwitchMapping$0[platformType.ordinal()];
        if (i10 == 1) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{f.d("market://details?id=", packageName), f.d("https://play.google.com/store/apps/details?id=", packageName)});
        }
        if (i10 == 2) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{f.d("appmarket://details?id=", packageName), f.d("https://appgallery.cloud.huawei.com/appDetail?pkgName=", packageName)});
        }
        throw new NoWhenBranchMatchedException();
    }
}
