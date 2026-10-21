package com.bbva.ethermobilesdk.securesharing.config;

import android.content.Context;
import android.os.Bundle;
import com.bbva.ethermobilesdk.securesharing.database.InfoTable;
import com.bbva.ethermobilesdk.securesharing.extension.BundleKt;
import com.bbva.ethermobilesdk.securesharing.extension.ContextKt;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.ethermobilesdk.securesharing.model.SharedConfiguration;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/config/Configuration;", "", "Landroid/content/Context;", "context", "", InfoTable.AUTHORITY, "", "init", "Lcom/bbva/ethermobilesdk/securesharing/model/SharedConfiguration;", "a", "Lcom/bbva/ethermobilesdk/securesharing/model/SharedConfiguration;", "getSharedConfiguration", "()Lcom/bbva/ethermobilesdk/securesharing/model/SharedConfiguration;", "setSharedConfiguration", "(Lcom/bbva/ethermobilesdk/securesharing/model/SharedConfiguration;)V", "sharedConfiguration", "Lcom/bbva/ethermobilesdk/securesharing/config/SecurityLevel;", "b", "Lcom/bbva/ethermobilesdk/securesharing/config/SecurityLevel;", "getSecurityLevel", "()Lcom/bbva/ethermobilesdk/securesharing/config/SecurityLevel;", "setSecurityLevel", "(Lcom/bbva/ethermobilesdk/securesharing/config/SecurityLevel;)V", "securityLevel", "<init>", "()V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class Configuration {

    @NotNull
    public static final Configuration INSTANCE = new Configuration();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static SharedConfiguration sharedConfiguration = new SharedConfiguration(CollectionsKt__CollectionsKt.emptyList());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static SecurityLevel securityLevel = SecurityLevel.Signature;

    @NotNull
    public final SecurityLevel getSecurityLevel() {
        return securityLevel;
    }

    @NotNull
    public final SharedConfiguration getSharedConfiguration() {
        return sharedConfiguration;
    }

    public final boolean init(@NotNull Context context, @NotNull String providerName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Bundle metadata = ContextKt.readMetadata(context, providerName);
        SecurityLevel securityLevel2 = BundleKt.readSecurityLevel(metadata);
        securityLevel = securityLevel2;
        if (securityLevel2 == SecurityLevel.Signature) {
            return true;
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(BundleKt.configurationFilename(metadata));
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(metadata.configurationFilename())");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                sharedConfiguration = (SharedConfiguration) Json.INSTANCE.decodeFromString(SharedConfiguration.INSTANCE.serializer(), text);
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception e5) {
            ExceptionKt.throwError("Could not read assets file [" + BundleKt.configurationFilename(metadata) + AbstractJsonLexerKt.END_LIST, e5);
            throw new KotlinNothingValueException();
        }
    }

    public final void setSecurityLevel(@NotNull SecurityLevel securityLevel2) {
        Intrinsics.checkNotNullParameter(securityLevel2, "<set-?>");
        securityLevel = securityLevel2;
    }

    public final void setSharedConfiguration(@NotNull SharedConfiguration sharedConfiguration2) {
        Intrinsics.checkNotNullParameter(sharedConfiguration2, "<set-?>");
        sharedConfiguration = sharedConfiguration2;
    }
}
