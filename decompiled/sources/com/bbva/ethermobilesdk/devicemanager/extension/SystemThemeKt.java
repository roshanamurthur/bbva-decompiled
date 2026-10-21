package com.bbva.ethermobilesdk.devicemanager.extension;

import com.bbva.ethermobilesdk.deviceinfo.data.SystemTheme;
import com.bbva.ethermobilesdk.devicemanager.model.output.SystemThemeStateResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SystemTheme.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDeviceManagerResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse;", "Lcom/bbva/ethermobilesdk/deviceinfo/data/SystemTheme;", "devicemanager_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SystemThemeKt {

    /* JADX INFO: compiled from: SystemTheme.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SystemTheme.values().length];
            try {
                iArr[SystemTheme.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SystemTheme.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SystemTheme.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final SystemThemeStateResponse toDeviceManagerResponse(@NotNull SystemTheme systemTheme) {
        Intrinsics.checkNotNullParameter(systemTheme, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[systemTheme.ordinal()];
        if (i10 == 1) {
            return SystemThemeStateResponse.Light.INSTANCE;
        }
        if (i10 == 2) {
            return SystemThemeStateResponse.Dark.INSTANCE;
        }
        if (i10 == 3) {
            return SystemThemeStateResponse.Undefined.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
