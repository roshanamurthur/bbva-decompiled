package com.bbva.qrplugin.command;

import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.qr.extension.IntKt;
import com.bbva.qr.model.response.BarcodeResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: DecodeCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"qr-plugin_release"}, k = 2, mv = {1, 8, 0})
public final class DecodeCommandKt {
    public static final JSONObject access$toResponse(BarcodeResult barcodeResult) {
        JSONObject json = SimpleResponse.toJson("content", barcodeResult.getPayload(), "type", IntKt.toFormatIdentifier(barcodeResult.getFormat()));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(\"content\", payloa…mat.toFormatIdentifier())");
        return json;
    }
}
