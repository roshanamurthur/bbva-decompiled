package com.bbva.document.scanner.plugin.model;

import com.bbva.document.scanner.Ratio;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RatioParam.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toRatio", "Lcom/bbva/document/scanner/Ratio;", "Lcom/bbva/document/scanner/plugin/model/RatioParam;", "document-scanner-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RatioParamKt {
    @NotNull
    public static final Ratio toRatio(@Nullable RatioParam ratioParam) {
        if (ratioParam == null) {
            return Ratio.INSTANCE.getCheck();
        }
        String type = ratioParam.getType();
        int iHashCode = type.hashCode();
        if (iHashCode != 3059) {
            if (iHashCode != 3046160) {
                if (iHashCode == 94627080 && type.equals("check")) {
                    return Ratio.INSTANCE.getCheck();
                }
            } else if (type.equals(ValidationConstantsKt.Card)) {
                return Ratio.INSTANCE.getCard();
            }
        } else if (type.equals(ValidationConstantsKt.A4)) {
            return Ratio.INSTANCE.getA4();
        }
        Object obj = ratioParam.getParameters().get("width");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Double");
        double dDoubleValue = ((Double) obj).doubleValue();
        Object obj2 = ratioParam.getParameters().get("height");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Double");
        return new Ratio(dDoubleValue, ((Double) obj2).doubleValue());
    }
}
