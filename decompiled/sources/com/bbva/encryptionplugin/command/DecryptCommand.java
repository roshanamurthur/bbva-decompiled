package com.bbva.encryptionplugin.command;

import android.app.Application;
import bk.p;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.encryptionplugin.InjectionsContainer;
import com.bbva.encryptionplugin.command.helper.ExtractorHelper;
import com.bbva.encryptionplugin.command.param.DecryptParam;
import com.bbva.encryptionplugin.contract.Injections;
import com.bbva.ethermobilesdk.encryption.EncryptionApiClient;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DecryptCommand.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/encryptionplugin/command/DecryptCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/encryptionplugin/command/param/DecryptParam;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "Companion", "a", "encryption_plugin_release"}, k = 1, mv = {1, 4, 0})
public final class DecryptCommand extends AbstractCommand<DecryptParam> {

    @NotNull
    public static final String VALUE = "value";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Injections f29236p0;

    public DecryptCommand() {
        super(DecryptParam.class);
        Function0<?> function0 = InjectionsContainer.INSTANCE.getMap().get(Reflection.getOrCreateKotlinClass(Injections.class));
        this.f29236p0 = (Injections) (function0 != null ? function0.invoke() : null);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable DecryptParam params, @NotNull CommandCallback callback) {
        EncryptionApiClient encryptionApiClient;
        if (params == null) {
            callback.sendError(Errors.ErrorMalformedParam);
            return;
        }
        try {
            Injections injections = this.f29236p0;
            if (injections != null) {
                Application mApplication = this.mApplication;
                Intrinsics.checkExpressionValueIsNotNull(mApplication, "mApplication");
                encryptionApiClient = injections.getEncryptionApiClient(mApplication);
            } else {
                encryptionApiClient = null;
            }
            String strDecryptHostData = encryptionApiClient != null ? encryptionApiClient.decryptHostData(params.getValue()) : null;
            if (strDecryptHostData != null) {
                callback.sendEvent(new JSONObject(p.mapOf(TuplesKt.to("value", ExtractorHelper.findOccurrences$default(ExtractorHelper.INSTANCE, strDecryptHostData, params.getFormat(), (char) 0, 4, null)))));
            } else {
                callback.sendError(Errors.ErrorDefault);
            }
        } catch (Exception unused) {
            callback.sendError(Errors.ErrorDefault);
        }
    }
}
