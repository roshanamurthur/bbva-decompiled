package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class VisitorIDVariantSerializer implements VariantSerializer<VisitorID> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.adobe.marketing.mobile.VariantSerializer
    public VisitorID deserialize(Variant variant) throws VariantException {
        if (variant == null) {
            throw new IllegalArgumentException();
        }
        if (variant.getKind() == VariantKind.NULL) {
            return null;
        }
        Map<String, Variant> variantMap = variant.getVariantMap();
        return new VisitorID(Variant.optVariantFromMap(variantMap, "id_origin").optString(null), Variant.optVariantFromMap(variantMap, "id_type").optString(null), Variant.optVariantFromMap(variantMap, "id").optString(null), VisitorID.AuthenticationState.fromInteger(Variant.optVariantFromMap(variantMap, "authentication_state").optInteger(VisitorID.AuthenticationState.UNKNOWN.getValue())));
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant serialize(VisitorID visitorID) {
        return visitorID == null ? Variant.fromNull() : Variant.fromVariantMap(new HashMap<String, Variant>(visitorID) { // from class: com.adobe.marketing.mobile.VisitorIDVariantSerializer.1
            final /* synthetic */ VisitorID val$visitorID;

            {
                this.val$visitorID = visitorID;
                put("id_origin", Variant.fromString(visitorID.getIdOrigin()));
                put("id_type", Variant.fromString(visitorID.getIdType()));
                put("id", Variant.fromString(visitorID.getId()));
                put("authentication_state", Variant.fromInteger(visitorID.getAuthenticationState() != null ? visitorID.getAuthenticationState().getValue() : VisitorID.AuthenticationState.UNKNOWN.getValue()));
            }
        });
    }
}
