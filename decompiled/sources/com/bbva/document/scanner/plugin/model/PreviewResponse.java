package com.bbva.document.scanner.plugin.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PreviewResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/PreviewResponse;", "", "Lorg/json/JSONObject;", "toJson", "Primary", "Secondary", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class PreviewResponse {
    private static final /* synthetic */ PreviewResponse[] $VALUES;
    public static final PreviewResponse Primary;
    public static final PreviewResponse Secondary;

    static {
        PreviewResponse previewResponse = new PreviewResponse("Primary", 0);
        Primary = previewResponse;
        PreviewResponse previewResponse2 = new PreviewResponse("Secondary", 1);
        Secondary = previewResponse2;
        $VALUES = new PreviewResponse[]{previewResponse, previewResponse2};
    }

    public PreviewResponse() {
        throw null;
    }

    public static PreviewResponse valueOf(String str) {
        return (PreviewResponse) Enum.valueOf(PreviewResponse.class, str);
    }

    public static PreviewResponse[] values() {
        return (PreviewResponse[]) $VALUES.clone();
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strName = name();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        JSONObject jSONObjectPut = jSONObject.put("action", lowerCase);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject().put(\"action…ase(Locale.getDefault()))");
        return jSONObjectPut;
    }
}
