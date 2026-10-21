package com.bbva.component.dm.settings.infraestructure;

import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppSettingsMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/dm/settings/infraestructure/AppSettingsMapper;", "", "Ljava/io/InputStream;", "stream", "Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "map", "", "content", "appSettings", "convert", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/google/gson/Gson;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final class AppSettingsMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Gson f28031a;

    public AppSettingsMapper(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f28031a = gson;
    }

    @NotNull
    public final String convert(@NotNull AppSettings appSettings) {
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        String json = this.f28031a.toJson(appSettings.getData(), Map.class);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @Nullable
    public final AppSettings map(@Nullable InputStream stream) {
        if (stream == null) {
            return null;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(stream, Charsets.UTF_8);
        try {
            Object objFromJson = this.f28031a.fromJson((Reader) inputStreamReader, (Class<Object>) Map.class);
            Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            AppSettings appSettings = new AppSettings((Map) objFromJson);
            CloseableKt.closeFinally(inputStreamReader, null);
            return appSettings;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    @Nullable
    public final AppSettings map(@Nullable String content) {
        if (content == null || content.length() == 0) {
            return null;
        }
        Object objFromJson = this.f28031a.fromJson(content, (Class<Object>) Map.class);
        Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        return new AppSettings((Map) objFromJson);
    }
}
