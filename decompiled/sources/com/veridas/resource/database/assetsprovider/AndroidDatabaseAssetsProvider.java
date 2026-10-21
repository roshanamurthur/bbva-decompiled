package com.veridas.resource.database.assetsprovider;

import android.content.Context;
import androidx.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidDatabaseAssetsProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/veridas/resource/database/assetsprovider/AndroidDatabaseAssetsProvider;", "Lcom/veridas/resource/database/assetsprovider/IDatabaseAssetsProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getDataBaseBytes", "", "getStencilBytes", "stencilFileName", "", "getTemplateBytes", "templateFileName", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidDatabaseAssetsProvider implements IDatabaseAssetsProvider {

    @NotNull
    private final Context context;

    public AndroidDatabaseAssetsProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.veridas.resource.database.assetsprovider.IDatabaseAssetsProvider
    @NotNull
    public byte[] getDataBaseBytes() throws IOException {
        InputStream inputStreamOpen = this.context.getAssets().open("resources/resources.data");
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return ByteStreamsKt.readBytes(inputStreamOpen);
    }

    @Override // com.veridas.resource.database.assetsprovider.IDatabaseAssetsProvider
    @Nullable
    public byte[] getStencilBytes(@NotNull String stencilFileName) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(stencilFileName, "stencilFileName");
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream inputStreamOpen = this.context.getAssets().open("resources/stencils/" + stencilFileName);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            objM5535constructorimpl = Result.m5535constructorimpl(ByteStreamsKt.readBytes(inputStreamOpen));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (byte[]) objM5535constructorimpl;
    }

    @Override // com.veridas.resource.database.assetsprovider.IDatabaseAssetsProvider
    @Nullable
    public byte[] getTemplateBytes(@NotNull String templateFileName) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(templateFileName, "templateFileName");
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream inputStreamOpen = this.context.getAssets().open("resources/templates/" + templateFileName);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            objM5535constructorimpl = Result.m5535constructorimpl(ByteStreamsKt.readBytes(inputStreamOpen));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (byte[]) objM5535constructorimpl;
    }
}
