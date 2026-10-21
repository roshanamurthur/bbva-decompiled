package com.bbva.cellscore.web.reader;

import android.content.Context;
import com.bbva.cellscore.web.data.configutation.AppConfiguration;
import com.bbva.cellscore.web.deserializer.AppConfigurationDeserializer;
import com.bbva.cellscore.web.model.configuration.AppConfigurationDTO;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppConfigurationReader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/bbva/cellscore/web/reader/AppConfigurationReader;", "Lcom/bbva/cellscore/web/reader/AssetsReader;", "Lcom/bbva/cellscore/web/data/configutation/AppConfiguration;", "read", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppConfigurationReader extends AssetsReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AppConfigurationDeserializer f27220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppConfigurationReader(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27220b = new AppConfigurationDeserializer(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final AppConfiguration read() {
        try {
            InputStream inputStream = read("config/app.config.json");
            AppConfigurationDeserializer appConfigurationDeserializer = this.f27220b;
            return (AppConfiguration) appConfigurationDeserializer.getMapper().modelToData(appConfigurationDeserializer.getGson().fromJson((java.io.Reader) new InputStreamReader(inputStream), AppConfigurationDTO.class));
        } catch (Exception unused) {
            return new AppConfiguration("", CollectionsKt__CollectionsKt.emptyList());
        }
    }
}
