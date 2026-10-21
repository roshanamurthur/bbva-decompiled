package com.bbva.ethermobilesdk.sharedstorage.model;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppSignature.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/model/SignatureAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/bbva/ethermobilesdk/sharedstorage/model/AppSignature;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "shared-storage_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SignatureAdapter implements JsonDeserializer<AppSignature> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    @NotNull
    public AppSignature deserialize(@Nullable JsonElement json, @Nullable Type typeOfT, @Nullable JsonDeserializationContext context) throws IllegalStateException, UnsupportedOperationException, IllegalArgumentException {
        JsonObject asJsonObject;
        JsonElement jsonElement;
        String asString;
        String strReplace$default;
        JsonObject asJsonObject2;
        JsonElement jsonElement2;
        String lowerCase = null;
        String asString2 = (json == null || (asJsonObject2 = json.getAsJsonObject()) == null || (jsonElement2 = asJsonObject2.get("applicationId")) == null) ? null : jsonElement2.getAsString();
        if (json != null && (asJsonObject = json.getAsJsonObject()) != null && (jsonElement = asJsonObject.get("sha256")) != null && (asString = jsonElement.getAsString()) != null && (strReplace$default = l.replace$default(asString, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, "", false, 4, (Object) null)) != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            lowerCase = strReplace$default.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        if (asString2 == null || asString2.length() == 0 || lowerCase == null || lowerCase.length() == 0) {
            throw new IllegalArgumentException("Your fingerprints config is wrong. Please check your fingerprints file.");
        }
        return new AppSignature(asString2, lowerCase);
    }
}
