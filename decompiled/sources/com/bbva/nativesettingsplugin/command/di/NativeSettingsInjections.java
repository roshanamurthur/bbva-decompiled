package com.bbva.nativesettingsplugin.command.di;

import com.bbva.nativesettings.NativeSettings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NativeSettingsInjections.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/bbva/nativesettingsplugin/command/di/NativeSettingsInjections;", "Lcom/bbva/nativesettingsplugin/command/di/Injections;", "()V", "createNativeSettings", "Lcom/bbva/nativesettings/NativeSettings;", "nativesettings-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class NativeSettingsInjections implements Injections {
    @Override // com.bbva.nativesettingsplugin.command.di.Injections
    @NotNull
    public NativeSettings createNativeSettings() {
        return new NativeSettings();
    }
}
