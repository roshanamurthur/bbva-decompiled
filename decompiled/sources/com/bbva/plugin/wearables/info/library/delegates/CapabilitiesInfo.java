package com.bbva.plugin.wearables.info.library.delegates;

import com.google.android.gms.wearable.CapabilityInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CapabilitiesDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bbva/plugin/wearables/info/library/delegates/CapabilitiesInfo;", "", "getCapabilitiesBy", "Lcom/google/android/gms/wearable/CapabilityInfo;", "id", "", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CapabilitiesInfo {
    @Nullable
    CapabilityInfo getCapabilitiesBy(@NotNull String id);
}
