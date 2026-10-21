package com.noknok.android.client.extension;

import android.content.Context;
import com.google.gson.JsonElement;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class ExtensionConfigHelper {
    public static IExtensionProcessor.ExtensionMode getConfigExtensionMode(Context context, String str, String str2) {
        IExtensionProcessor.ExtensionMode extensionModeValueOf;
        JsonElement jsonElement = AppSDKConfig.getInstance(context).get(str);
        if (jsonElement != null) {
            try {
                if (jsonElement.isJsonObject()) {
                    extensionModeValueOf = IExtensionProcessor.ExtensionMode.valueOf(jsonElement.getAsJsonObject().get(str2).getAsString());
                } else {
                    extensionModeValueOf = str2.equals(IExtensionProcessor.ExtensionOpType.protocol.name()) ? IExtensionProcessor.ExtensionMode.valueOf(jsonElement.getAsString()) : IExtensionProcessor.ExtensionMode.never;
                }
            } catch (IllegalArgumentException | NullPointerException unused) {
                Logger.w("ExtensionConfigHelper", "Not valid configuration value for " + str + ", default values will be used");
                extensionModeValueOf = null;
            }
        } else {
            extensionModeValueOf = null;
        }
        if (extensionModeValueOf == null) {
            return str2.equals(IExtensionProcessor.ExtensionOpType.init.name()) ? IExtensionProcessor.ExtensionMode.never : IExtensionProcessor.ExtensionMode.requested;
        }
        return extensionModeValueOf;
    }
}
