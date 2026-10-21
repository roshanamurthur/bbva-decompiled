package com.bbva.plugin.naturalauthentication.command.decorator;

import bk.p;
import bk.q;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.naturalauthentication.command.CommandError;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.DiscoverData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: compiled from: FidoDiscoverCapabilitiesDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoDiscoverCapabilitiesDecorator;", "Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoCallbackDecorator;", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoDiscoverCapabilitiesCallback;", "Lcom/bbva/sl/ar/android/secsdk/fido/model/DiscoverData;", "discoverData", "", "success", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "error", "failure", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "<init>", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFidoDiscoverCapabilitiesDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FidoDiscoverCapabilitiesDecorator.kt\ncom/bbva/plugin/naturalauthentication/command/decorator/FidoDiscoverCapabilitiesDecorator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1557#2:42\n1628#2,3:43\n*S KotlinDebug\n*F\n+ 1 FidoDiscoverCapabilitiesDecorator.kt\ncom/bbva/plugin/naturalauthentication/command/decorator/FidoDiscoverCapabilitiesDecorator\n*L\n22#1:42\n22#1:43,3\n*E\n"})
public final class FidoDiscoverCapabilitiesDecorator extends FidoCallbackDecorator implements FidoSdk.FidoDiscoverCapabilitiesCallback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidoDiscoverCapabilitiesDecorator(@NotNull CommandCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoDiscoverCapabilitiesCallback
    public void failure(@NotNull FidoException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        onFail(CommandError.ErrorDiscoverCapabilities);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoDiscoverCapabilitiesCallback
    public void success(@NotNull DiscoverData discoverData) {
        Intrinsics.checkNotNullParameter(discoverData, "discoverData");
        List<DiscoverData.DiscoverAuthenticator> availableAuthenticators = discoverData.availableAuthenticators;
        Intrinsics.checkNotNullExpressionValue(availableAuthenticators, "availableAuthenticators");
        List<DiscoverData.DiscoverAuthenticator> list = availableAuthenticators;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (DiscoverData.DiscoverAuthenticator discoverAuthenticator : list) {
            Intrinsics.checkNotNull(discoverAuthenticator);
            arrayList.add(q.mapOf(TuplesKt.to("aaid", discoverAuthenticator.getAaid()), TuplesKt.to("description", discoverAuthenticator.getDescription()), TuplesKt.to("keyProtection", Integer.valueOf(discoverAuthenticator.getKeyProtection())), TuplesKt.to("userVerification", Integer.valueOf(discoverAuthenticator.getUserVerification())), TuplesKt.to("name", String.valueOf(discoverAuthenticator.getName()))));
        }
        onSuccess(p.mapOf(TuplesKt.to("capabilities", new JSONArray((Collection) arrayList))));
    }
}
