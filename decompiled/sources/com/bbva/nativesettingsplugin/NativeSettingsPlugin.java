package com.bbva.nativesettingsplugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.nativesettingsplugin.command.NativeSettingsCommandFactory;
import com.bbva.nativesettingsplugin.command.di.Injections;
import com.bbva.nativesettingsplugin.command.di.NativeSettingsInjections;
import com.bbva.nativesettingsplugin.command.di.NativeSettingsInjector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NativeSettingsPlugin.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/nativesettingsplugin/NativeSettingsPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "()V", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "getId", "", "Companion", "nativesettings-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class NativeSettingsPlugin extends Plugin {

    @NotNull
    public static final String ID = "NativeSettings";

    /* JADX INFO: compiled from: NativeSettingsPlugin.kt */
    public static final class a extends Lambda implements Function0<Injections> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f35053p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Injections invoke() {
            return new NativeSettingsInjections();
        }
    }

    public NativeSettingsPlugin() {
        NativeSettingsInjector.INSTANCE.getMap().put(Reflection.getOrCreateKotlinClass(Injections.class), a.f35053p0);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new NativeSettingsCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }
}
