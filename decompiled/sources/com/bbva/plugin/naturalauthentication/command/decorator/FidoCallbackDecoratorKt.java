package com.bbva.plugin.naturalauthentication.command.decorator;

import bk.q;
import com.bbva.plugin.naturalauthentication.ExtensionsKt;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoCallbackDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0007H\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"toMapWith", "", "", "", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "extras", "", "Lkotlin/Pair;", "(Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;[Lkotlin/Pair;)Ljava/util/Map;", "naturalauthentication-plugin_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FidoCallbackDecoratorKt {
    @NotNull
    public static final Map<String, Object> toMapWith(@NotNull FidoSession fidoSession, @NotNull Pair<String, ? extends Object>... extras) {
        Intrinsics.checkNotNullParameter(fidoSession, "<this>");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Map<String, Object> mutableMap = ExtensionsKt.toMutableMap(fidoSession);
        q.putAll(mutableMap, extras);
        return mutableMap;
    }
}
