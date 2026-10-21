package com.bbva.plugin.naturalauthentication.command.decorator;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.naturalauthentication.ExtensionsKt;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDevice;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FidoListAuthenticatorsDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u001c\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoListAuthenticatorsDecorator;", "Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoCallbackDecorator;", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoListingCallback;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "<init>", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "listingCompleted", "", "fidoSession", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "devicesList", "", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoDevice;", "listingFailed", "p0", "fidoException", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFidoListAuthenticatorsDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FidoListAuthenticatorsDecorator.kt\ncom/bbva/plugin/naturalauthentication/command/decorator/FidoListAuthenticatorsDecorator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1557#2:39\n1628#2,3:40\n*S KotlinDebug\n*F\n+ 1 FidoListAuthenticatorsDecorator.kt\ncom/bbva/plugin/naturalauthentication/command/decorator/FidoListAuthenticatorsDecorator\n*L\n24#1:39\n24#1:40,3\n*E\n"})
public final class FidoListAuthenticatorsDecorator extends FidoCallbackDecorator implements FidoSdk.FidoListingCallback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidoListAuthenticatorsDecorator(@NotNull CommandCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoListingCallback
    public void listingCompleted(@Nullable FidoSession fidoSession, @Nullable List<? extends FidoDevice> devicesList) {
        Map<String, ? extends Object> mapWith;
        Collection collectionEmptyList;
        if (fidoSession != null) {
            Pair[] pairArr = new Pair[1];
            if (devicesList != null) {
                List<? extends FidoDevice> list = devicesList;
                collectionEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    collectionEmptyList.add(ExtensionsKt.toMap((FidoDevice) it.next()));
                }
            } else {
                collectionEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            pairArr[0] = TuplesKt.to("devices", collectionEmptyList);
            mapWith = FidoCallbackDecoratorKt.toMapWith(fidoSession, pairArr);
        } else {
            mapWith = null;
        }
        if (mapWith != null) {
            onSuccess(mapWith);
        } else {
            onFail(Errors.ErrorDefault);
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoListingCallback
    public void listingFailed(@Nullable FidoSession p4, @Nullable FidoException fidoException) {
        onFail(fidoException);
    }
}
