package com.bbva.gp2.android.product.trustdevice.plugin.command.validator;

import com.bbva.gp2.android.product.trustdevice.plugin.request.DeviceRequest;
import kotlin.Metadata;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CommandValidators.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"isNullOrEmpty", "", "Lcom/bbva/gp2/android/product/trustdevice/plugin/request/DeviceRequest;", "payments-trustdevice-plugin_release"}, k = 2, mv = {1, 1, 16})
public final class CommandValidatorsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNullOrEmpty(@NotNull DeviceRequest deviceRequest) {
        String model;
        String os;
        String osVersion;
        String deviceType;
        String id = deviceRequest.getId();
        return (id == null || l.isBlank(id)) && ((model = deviceRequest.getModel()) == null || l.isBlank(model)) && (((os = deviceRequest.getOs()) == null || l.isBlank(os)) && (((osVersion = deviceRequest.getOsVersion()) == null || l.isBlank(osVersion)) && ((deviceType = deviceRequest.getDeviceType()) == null || l.isBlank(deviceType))));
    }
}
