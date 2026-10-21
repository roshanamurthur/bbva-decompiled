package com.bbva.qrcreatorplugin;

import com.bbva.qrcreator.CodeCreator;
import com.bbva.qrcreator.formatter.Base64Formatter;
import com.bbva.qrcreator.model.Barcode;
import com.bbva.qrcreator.model.Qr;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CodeGenerator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/qrcreatorplugin/DefaultCodeGenerator;", "Lcom/bbva/qrcreatorplugin/CodeGenerator;", "Lcom/bbva/qrcreator/model/Qr;", "qr", "", "Lcom/bbva/qrcreator/model/Barcode;", OptionalModuleUtils.BARCODE, "<init>", "()V", "qrcreator-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class DefaultCodeGenerator implements CodeGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CodeCreator f36338a = new CodeCreator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Base64Formatter f36339b = new Base64Formatter();

    @Override // com.bbva.qrcreatorplugin.CodeGenerator
    @NotNull
    public String barcode(@NotNull Barcode barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        return (String) this.f36338a.createBarcode(barcode, this.f36339b);
    }

    @Override // com.bbva.qrcreatorplugin.CodeGenerator
    @NotNull
    public String qr(@NotNull Qr qr) {
        Intrinsics.checkNotNullParameter(qr, "qr");
        return (String) this.f36338a.createQrCode(qr, this.f36339b);
    }
}
