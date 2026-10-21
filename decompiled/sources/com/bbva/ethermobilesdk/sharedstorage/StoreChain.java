package com.bbva.ethermobilesdk.sharedstorage;

import android.content.Context;
import com.bbva.ethermobilesdk.sharedstorage.model.AppSignature;
import com.bbva.ethermobilesdk.sharedstorage.model.AppSignatureContainer;
import com.bbva.ethermobilesdk.sharedstorage.model.SignatureAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StoreChain.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/StoreChain;", "", "Lcom/bbva/ethermobilesdk/sharedstorage/model/AppSignatureContainer;", "a", "Lcom/bbva/ethermobilesdk/sharedstorage/model/AppSignatureContainer;", "getSignatures", "()Lcom/bbva/ethermobilesdk/sharedstorage/model/AppSignatureContainer;", "signatures", "Landroid/content/Context;", "context", "", "group", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public abstract class StoreChain {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AppSignatureContainer signatures;

    public StoreChain(@NotNull Context context, @NotNull String group) {
        AppSignatureContainer appSignatureContainer;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(group, "group");
        Gson gsonCreate = new GsonBuilder().registerTypeAdapter(AppSignature.class, new SignatureAdapter()).create();
        try {
            InputStream inputStreamOpen = context.getAssets().open("etherMobile/sharedStorage/sharedstorage." + group + ".json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            appSignatureContainer = (AppSignatureContainer) gsonCreate.fromJson((Reader) new InputStreamReader(inputStreamOpen), AppSignatureContainer.class);
            if (appSignatureContainer == null) {
                appSignatureContainer = new AppSignatureContainer(CollectionsKt__CollectionsKt.emptyList());
            }
        } catch (Exception unused) {
            appSignatureContainer = new AppSignatureContainer(CollectionsKt__CollectionsKt.emptyList());
        }
        this.signatures = appSignatureContainer;
    }

    @NotNull
    public final AppSignatureContainer getSignatures() {
        return this.signatures;
    }
}
