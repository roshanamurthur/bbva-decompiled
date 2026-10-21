package com.bbva.plugin.biometrics.command.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.room.g;
import bk.q;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.biometrics.authenticator.Biometrics;
import com.bbva.plugin.biometrics.BiometricsFactory;
import com.bbva.plugin.biometrics.command.base.BiometricsCommand;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: BiometricsCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B-\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB\u001f\b\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001fJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u0007\u0010\u000bJ\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/bbva/plugin/biometrics/command/base/BiometricsCommand;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "commandCallback", "", "execute", "(Ljava/lang/Object;Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "Lcom/bbva/biometrics/authenticator/Biometrics$Builder;", "biometricsBuilder", "(Ljava/lang/Object;Lcom/bbva/biometrics/authenticator/Biometrics$Builder;)V", "", "code", "", "message", "Lorg/json/JSONObject;", "getJSONObjectResult", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "getCommandCallback", "()Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "setCommandCallback", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "Ljava/lang/Class;", "clazz", "Lcom/bbva/plugin/biometrics/BiometricsFactory;", "factory", "Lcom/cells/validator/ValidatorChecker;", "validatorChecker", "<init>", "(Ljava/lang/Class;Lcom/bbva/plugin/biometrics/BiometricsFactory;Lcom/cells/validator/ValidatorChecker;)V", "(Ljava/lang/Class;Lcom/bbva/plugin/biometrics/BiometricsFactory;)V", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1})
public abstract class BiometricsCommand<T> extends AbstractCommand<T> {
    public CommandCallback commandCallback;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BiometricsFactory f35604p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsCommand(@NotNull Class<T> clazz, @NotNull BiometricsFactory factory, @Nullable ValidatorChecker<T> validatorChecker) {
        super(clazz, validatorChecker);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f35604p0 = factory;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable final T params, @NotNull CommandCallback commandCallback) {
        Intrinsics.checkNotNullParameter(commandCallback, "commandCallback");
        try {
            setCommandCallback(commandCallback);
            this.mActivityContainer.get().ifPresentOrElse(new Consumer() { // from class: za.a
                @Override // com.bbva.androidtoolkit.optional.function.Consumer
                public final void accept(Object obj) {
                    BiometricsCommand this$0 = this.f95014a;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.execute(params, this$0.f35604p0.createBiometricsBuilder());
                }
            }, new g(commandCallback, 1));
        } catch (Exception e5) {
            e5.printStackTrace();
            commandCallback.sendError(Errors.ErrorDefault);
        }
    }

    public abstract void execute(@Nullable T params, @NotNull Biometrics.Builder biometricsBuilder);

    @NotNull
    public final CommandCallback getCommandCallback() {
        CommandCallback commandCallback = this.commandCallback;
        if (commandCallback != null) {
            return commandCallback;
        }
        Intrinsics.throwUninitializedPropertyAccessException("commandCallback");
        throw null;
    }

    @NotNull
    public final JSONObject getJSONObjectResult(int code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new JSONObject(q.mapOf(TuplesKt.to("code", Integer.valueOf(code)), TuplesKt.to("message", message)));
    }

    public final void setCommandCallback(@NotNull CommandCallback commandCallback) {
        Intrinsics.checkNotNullParameter(commandCallback, "<set-?>");
        this.commandCallback = commandCallback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricsCommand(@NotNull Class<T> clazz, @NotNull BiometricsFactory factory) {
        this(clazz, factory, null);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
