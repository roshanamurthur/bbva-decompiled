package com.bbva.nativesettingsplugin.command;

import android.app.Activity;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.nativesettings.NativeSettings;
import com.bbva.nativesettings.command.exception.NotSupportedSettingException;
import com.bbva.nativesettingsplugin.command.di.Injections;
import com.bbva.nativesettingsplugin.command.di.NativeSettingsInjector;
import com.bbva.nativesettingsplugin.command.params.OpenSettingsParams;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OpenSettingsCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/nativesettingsplugin/command/OpenSettingsCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/nativesettingsplugin/command/params/OpenSettingsParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "nativesettings-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class OpenSettingsCommand extends AbstractCommand<OpenSettingsParams> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Injections f35055p0;

    /* JADX INFO: compiled from: OpenSettingsCommand.kt */
    public static final class a<T> implements Consumer<Activity> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OpenSettingsParams f35057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35058c;

        public a(OpenSettingsParams openSettingsParams, CommandCallback commandCallback) {
            this.f35057b = openSettingsParams;
            this.f35058c = commandCallback;
        }

        @Override // com.bbva.androidtoolkit.optional.function.Consumer
        public final void accept(Activity activity) {
            Activity it = activity;
            CommandCallback commandCallback = this.f35058c;
            OpenSettingsCommand openSettingsCommand = OpenSettingsCommand.this;
            try {
                Injections injections = openSettingsCommand.f35055p0;
                NativeSettings nativeSettingsCreateNativeSettings = injections != null ? injections.createNativeSettings() : null;
                if (nativeSettingsCreateNativeSettings != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    OpenSettingsParams openSettingsParams = this.f35057b;
                    Intrinsics.checkNotNull(openSettingsParams);
                    nativeSettingsCreateNativeSettings.launchNativeSetting(it, openSettingsParams.getSetting());
                }
                if (commandCallback != null) {
                    commandCallback.sendEvent();
                }
            } catch (Throwable th2) {
                OpenSettingsCommand.access$handleNativeSettingsException(openSettingsCommand, th2, commandCallback);
            }
        }
    }

    /* JADX INFO: compiled from: OpenSettingsCommand.kt */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35059p0;

        public b(CommandCallback commandCallback) {
            this.f35059p0 = commandCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CommandCallback commandCallback = this.f35059p0;
            if (commandCallback != null) {
                commandCallback.sendError(Errors.ErrorDefault);
            }
        }
    }

    public OpenSettingsCommand() {
        super(OpenSettingsParams.class);
        Function0<?> function0 = NativeSettingsInjector.INSTANCE.getMap().get(Reflection.getOrCreateKotlinClass(Injections.class));
        this.f35055p0 = (Injections) (function0 != null ? function0.invoke() : null);
    }

    public static final void access$handleNativeSettingsException(OpenSettingsCommand openSettingsCommand, Throwable th2, CommandCallback commandCallback) {
        openSettingsCommand.getClass();
        if (th2 instanceof IllegalArgumentException) {
            if (commandCallback != null) {
                commandCallback.sendError(Errors.ErrorMalformedParam);
            }
        } else if (th2 instanceof NotSupportedSettingException) {
            if (commandCallback != null) {
                commandCallback.sendError(Errors.ErrorNotSupported);
            }
        } else if (commandCallback != null) {
            commandCallback.sendError(Errors.ErrorDefault);
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable OpenSettingsParams params, @Nullable CommandCallback callback) {
        if (params != null && params.getSetting().length() > 0) {
            this.mActivityContainer.get().ifPresentOrElse(new a(params, callback), new b(callback));
        } else if (callback != null) {
            callback.sendError(Errors.ErrorMalformedParam);
        }
    }
}
