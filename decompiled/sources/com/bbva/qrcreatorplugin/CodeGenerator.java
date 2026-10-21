package com.bbva.qrcreatorplugin;

import com.bbva.qrcreator.model.Barcode;
import com.bbva.qrcreator.model.Qr;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CodeGenerator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bbva/qrcreatorplugin/CodeGenerator;", "", OptionalModuleUtils.BARCODE, "", "Lcom/bbva/qrcreator/model/Barcode;", "qr", "Lcom/bbva/qrcreator/model/Qr;", "qrcreator-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CodeGenerator {
    @NotNull
    String barcode(@NotNull Barcode barcode);

    @NotNull
    String qr(@NotNull Qr qr);
}
