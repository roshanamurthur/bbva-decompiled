package com.bbva.plugin.naturalauthentication;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoAuthenticator;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDevice;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDeviceInfo;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0005\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0006\u001a\u0016\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b*\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"toMap", "", "", "", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoDevice;", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoDeviceInfo;", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoAuthenticator;", "toMutableMap", "", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "checkIfActivityIsPresentOrSendError", "", "Lcom/bbva/androidtoolkit/plugin/component/ActivityContainer;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "naturalauthentication-plugin_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/bbva/plugin/naturalauthentication/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1557#2:61\n1628#2,3:62\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/bbva/plugin/naturalauthentication/ExtensionsKt\n*L\n18#1:61\n18#1:62,3\n*E\n"})
public final class ExtensionsKt {
    public static final void checkIfActivityIsPresentOrSendError(@NotNull ActivityContainer activityContainer, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(activityContainer, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (activityContainer.get().isPresent()) {
            return;
        }
        callback.sendError(Errors.ErrorDefault);
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull FidoDevice fidoDevice) {
        Intrinsics.checkNotNullParameter(fidoDevice, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FidoDeviceInfo fidoDeviceInfo = fidoDevice.getFidoDeviceInfo();
        Intrinsics.checkNotNullExpressionValue(fidoDeviceInfo, "getFidoDeviceInfo(...)");
        linkedHashMap.put("info", toMap(fidoDeviceInfo));
        List<FidoAuthenticator> fidoAuthenticators = fidoDevice.getFidoAuthenticators();
        Intrinsics.checkNotNullExpressionValue(fidoAuthenticators, "getFidoAuthenticators(...)");
        List<FidoAuthenticator> list = fidoAuthenticators;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (FidoAuthenticator fidoAuthenticator : list) {
            Intrinsics.checkNotNull(fidoAuthenticator);
            arrayList.add(toMap(fidoAuthenticator));
        }
        linkedHashMap.put(Constants.authenticators, arrayList);
        return linkedHashMap;
    }

    @NotNull
    public static final Map<String, Object> toMutableMap(@NotNull FidoSession fidoSession) {
        Intrinsics.checkNotNullParameter(fidoSession, "<this>");
        return q.mutableMapOf(TuplesKt.to(Constants.policy, fidoSession.getPolicy()), TuplesKt.to("tenant", fidoSession.getCountry()), TuplesKt.to(Constants.backendRequestUserId, fidoSession.getUserId()));
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull FidoDeviceInfo fidoDeviceInfo) {
        Intrinsics.checkNotNullParameter(fidoDeviceInfo, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("identifier", fidoDeviceInfo.getId());
        linkedHashMap.put("name", fidoDeviceInfo.getName());
        linkedHashMap.put("brand", fidoDeviceInfo.getBrand());
        linkedHashMap.put("model", fidoDeviceInfo.getModel());
        linkedHashMap.put("os", fidoDeviceInfo.getOs());
        linkedHashMap.put("type", fidoDeviceInfo.getType());
        return linkedHashMap;
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull FidoAuthenticator fidoAuthenticator) {
        Intrinsics.checkNotNullParameter(fidoAuthenticator, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("authenticatorHandle", fidoAuthenticator.getHandle());
        linkedHashMap.put("name", fidoAuthenticator.getName());
        String aaid = fidoAuthenticator.getAaid();
        if (aaid == null) {
            aaid = "";
        }
        linkedHashMap.put("aaid", aaid);
        linkedHashMap.put("timestamp", Long.valueOf(fidoAuthenticator.getTimeStamp()));
        return linkedHashMap;
    }
}
