package com.bbva.ethermobilesdk.pinning.provider.site;

import android.content.Context;
import androidx.camera.core.processing.f;
import bk.p;
import com.bbva.ethermobilesdk.pinning.data.catalog.PinningConfigDTO;
import com.bbva.ethermobilesdk.pinning.data.catalog.SiteCatalogDTO;
import com.bbva.ethermobilesdk.pinning.data.catalog.SiteDTO;
import com.bbva.ethermobilesdk.pinning.extension.ExceptionKt;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.ethermobilesdk.pinning.model.ProviderProperties;
import com.bbva.ethermobilesdk.pinning.model.ProviderType;
import com.bbva.ethermobilesdk.pinning.model.catalog.Catalog;
import com.bbva.ethermobilesdk.pinning.model.catalog.Site;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningConfig;
import com.bbva.ethermobilesdk.pinning.model.mapper.MapperKt;
import com.bbva.ethermobilesdk.pinning.model.result.ErrorType;
import com.bbva.ethermobilesdk.pinning.provider.SiteProvider;
import com.bbva.ethermobilesdk.pinning.provider.catalog.CatalogReader;
import com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage;
import com.bbva.ethermobilesdk.pinning.provider.site.storage.SharedPropertyStorage;
import com.bbva.ethermobilesdk.pinning.verifier.SignatureVerifier;
import com.bbva.localstorage.storage.SharedPreferencesStorage;
import com.bbva.localstorage.storage.Storage;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreferencesProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0014J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0014¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\"\u001a\u00020#H\u0014J\n\u0010$\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0013\u001a\u00020\u0005H\u0014J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u001aH\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/provider/site/PreferencesProvider;", "Lcom/bbva/ethermobilesdk/pinning/provider/SiteProvider;", "context", "Landroid/content/Context;", "providerType", "Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;", "propertiesStorage", "Lcom/bbva/ethermobilesdk/pinning/provider/site/storage/PropertyStorage;", "catalogStorage", "Lcom/bbva/localstorage/storage/Storage;", "(Landroid/content/Context;Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;Lcom/bbva/ethermobilesdk/pinning/provider/site/storage/PropertyStorage;Lcom/bbva/localstorage/storage/Storage;)V", "gson", "Lcom/google/gson/Gson;", "reader", "Lcom/bbva/ethermobilesdk/pinning/provider/catalog/CatalogReader;", "signatureVerifier", "Lcom/bbva/ethermobilesdk/pinning/verifier/SignatureVerifier;", "changeLastModified", "", "type", "lastModified", "", ClearCommand.ID, "isUpdated", "", "remoteSiteCatalog", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;", "(Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;)Ljava/lang/Boolean;", "loadCatalog", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Catalog;", "catalog", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/PinningConfigDTO;", "catalogAsStream", "Ljava/io/InputStream;", "configuration", "Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningConfig;", "loadFromStorage", "readResource", "retrieveProperties", "Lcom/bbva/ethermobilesdk/pinning/model/ProviderProperties;", "update", "siteCatalog", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreferencesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesProvider.kt\ncom/bbva/ethermobilesdk/pinning/provider/site/PreferencesProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,195:1\n1#2:196\n1855#3,2:197\n1194#3,2:199\n1222#3,4:201\n1238#3,4:207\n766#3:211\n857#3:212\n2624#3,3:213\n858#3:216\n1194#3,2:217\n1222#3,4:219\n1238#3,4:225\n1549#3:229\n1620#3,3:230\n1549#3:233\n1620#3,3:234\n453#4:205\n403#4:206\n453#4:223\n403#4:224\n*S KotlinDebug\n*F\n+ 1 PreferencesProvider.kt\ncom/bbva/ethermobilesdk/pinning/provider/site/PreferencesProvider\n*L\n80#1:197,2\n109#1:199,2\n109#1:201,4\n110#1:207,4\n120#1:211\n120#1:212\n120#1:213,3\n120#1:216\n163#1:217,2\n163#1:219,4\n166#1:225,4\n187#1:229\n187#1:230,3\n188#1:233\n188#1:234,3\n110#1:205\n110#1:206\n166#1:223\n166#1:224\n*E\n"})
public class PreferencesProvider extends SiteProvider {

    @NotNull
    private final Storage catalogStorage;

    @NotNull
    private final Context context;

    @NotNull
    private final Gson gson;

    @NotNull
    private final PropertyStorage propertiesStorage;

    @NotNull
    private final ProviderType providerType;

    @NotNull
    private final CatalogReader reader;

    @NotNull
    private final SignatureVerifier signatureVerifier;

    public /* synthetic */ PreferencesProvider(Context context, ProviderType providerType, PropertyStorage propertyStorage, Storage storage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, providerType, (i10 & 4) != 0 ? new SharedPropertyStorage(context, providerType.getProperties()) : propertyStorage, (i10 & 8) != 0 ? new SharedPreferencesStorage(context, providerType.getCatalog(), false, null, true, 12, null) : storage);
    }

    private final Catalog loadFromStorage() {
        try {
            Set<String> setKeys = this.catalogStorage.keys();
            LoggerKt.log$default(null, "preferencesProvider catalogStorage keys [" + setKeys + Constant.BRACKET_CLOSE, 1, null);
            Set<String> set = setKeys;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(Storage.DefaultImpls.getString$default(this.catalogStorage, (String) it.next(), null, false, 4, null));
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add((Site) this.gson.fromJson((String) it2.next(), Site.class));
            }
            return new Catalog(arrayList2);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final InputStream readResource(PinningConfig configuration) throws IOException {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(this.context.getResources().openRawResource(configuration.getId()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = this.context.getAssets().open("pinning/" + configuration.getFallbackFile());
            Intrinsics.checkNotNullExpressionValue(objM5535constructorimpl, "context.assets.open(\"pin…iguration.fallbackFile}\")");
        }
        return (InputStream) objM5535constructorimpl;
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.SiteProvider
    public void changeLastModified(@NotNull ProviderType type, @NotNull String lastModified) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        if (type == this.providerType) {
            this.propertiesStorage.setLastModified(lastModified);
        }
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.SiteProvider
    public void clear(@Nullable ProviderType type) {
        if (type == null || type == this.providerType) {
            this.propertiesStorage.clear();
            Storage.DefaultImpls.clear$default(this.catalogStorage, false, 1, null);
            LoggerKt.log$default(null, this.providerType + " did clear", 1, null);
        }
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.SiteProvider
    @Nullable
    public Boolean isUpdated(@NotNull ProviderType type, @NotNull SiteCatalogDTO remoteSiteCatalog) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(remoteSiteCatalog, "remoteSiteCatalog");
        if (type == this.providerType) {
            return Boolean.valueOf(this.propertiesStorage.getRevision() >= remoteSiteCatalog.getRevision());
        }
        return null;
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.SiteProvider
    @Nullable
    public Catalog loadCatalog(@NotNull PinningConfig configuration) throws IOException {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        InputStream resource = readResource(configuration);
        try {
            PinningConfigDTO pinningConfigDTO = this.reader.read(resource);
            LoggerKt.log$default(null, "loadCatalog with with config file [" + configuration.getId() + "] fallback file [" + configuration.getFallbackFile() + "] reset catalog is [" + configuration.getResetCatalog() + Constant.BRACKET_CLOSE, 1, null);
            int revision = pinningConfigDTO.getSiteCatalog().getRevision();
            StringBuilder sb2 = new StringBuilder("loadCatalog with revision [");
            sb2.append(revision);
            sb2.append(Constant.BRACKET_CLOSE);
            LoggerKt.log$default(null, sb2.toString(), 1, null);
            LoggerKt.log$default(null, "loadCatalog with update url [" + pinningConfigDTO.getProperties().getUpdateUrl() + Constant.BRACKET_CLOSE, 1, null);
            try {
                Result.Companion companion = Result.INSTANCE;
                resource.reset();
                objM5535constructorimpl = Result.m5535constructorimpl(resource);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
                try {
                    resource.close();
                    Result.m5535constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m5535constructorimpl(ResultKt.createFailure(th3));
                }
                objM5535constructorimpl = readResource(configuration);
            }
            Catalog catalogLoadCatalog = loadCatalog(pinningConfigDTO, (InputStream) objM5535constructorimpl);
            LoggerKt.log$default(null, "loadCatalog with sites", 1, null);
            for (Site site : catalogLoadCatalog.getSites()) {
                LoggerKt.log$default(null, "site [" + site.getId() + "] hosts [" + site.getHosts() + Constant.BRACKET_CLOSE, 1, null);
            }
            try {
                Result.Companion companion4 = Result.INSTANCE;
                resource.close();
                Result.m5535constructorimpl(Unit.INSTANCE);
            } catch (Throwable th4) {
                Result.Companion companion5 = Result.INSTANCE;
                Result.m5535constructorimpl(ResultKt.createFailure(th4));
            }
            return catalogLoadCatalog;
        } catch (Throwable th5) {
            String message = th5.getMessage();
            Reader inputStreamReader = new InputStreamReader(readResource(configuration), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                ExceptionKt.throwError("Error: " + message + ", PinningCatalog: {" + configuration + "}, Content: " + ((Object) text), th5);
                throw new KotlinNothingValueException();
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    CloseableKt.closeFinally(bufferedReader, th6);
                    throw th7;
                }
            }
        }
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.SiteProvider
    @Nullable
    public ProviderProperties retrieveProperties(@NotNull ProviderType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type == this.providerType) {
            return new ProviderProperties(this.propertiesStorage.getRevision(), this.propertiesStorage.getLastModified(), this.propertiesStorage.getUpdateUrls());
        }
        return null;
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.SiteProvider
    @NotNull
    public Catalog update(@NotNull ProviderType type, @NotNull SiteCatalogDTO siteCatalog) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(siteCatalog, "siteCatalog");
        if (type != this.providerType || siteCatalog.getRevision() <= this.propertiesStorage.getRevision()) {
            Catalog catalogLoadFromStorage = loadFromStorage();
            return catalogLoadFromStorage == null ? MapperKt.toModel(siteCatalog) : catalogLoadFromStorage;
        }
        List<SiteDTO> sites = siteCatalog.getSites();
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(sites, 10, 16));
        for (Object obj : sites) {
            linkedHashMap.put(((SiteDTO) obj).getId(), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), this.gson.toJson(MapperKt.toModel((SiteDTO) entry.getValue())));
        }
        if (!Storage.DefaultImpls.set$default(this.catalogStorage, linkedHashMap2, false, 2, null)) {
            return MapperKt.toModel(siteCatalog);
        }
        Set<String> setKeys = this.catalogStorage.keys();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setKeys) {
            String str = (String) obj2;
            List<SiteDTO> sites2 = siteCatalog.getSites();
            if (!(sites2 instanceof Collection) || !sites2.isEmpty()) {
                Iterator<T> it = sites2.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!Intrinsics.areEqual(((SiteDTO) it.next()).getId(), str));
            }
            arrayList.add(obj2);
        }
        this.catalogStorage.remove(arrayList);
        this.propertiesStorage.setRevision(siteCatalog.getRevision());
        return MapperKt.toModel(siteCatalog);
    }

    public PreferencesProvider(@NotNull Context context, @NotNull ProviderType providerType, @NotNull PropertyStorage propertiesStorage, @NotNull Storage catalogStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(providerType, "providerType");
        Intrinsics.checkNotNullParameter(propertiesStorage, "propertiesStorage");
        Intrinsics.checkNotNullParameter(catalogStorage, "catalogStorage");
        this.context = context;
        this.providerType = providerType;
        this.propertiesStorage = propertiesStorage;
        this.catalogStorage = catalogStorage;
        this.reader = new CatalogReader(null, 1, null);
        this.signatureVerifier = new SignatureVerifier();
        this.gson = new Gson();
    }

    private final Catalog loadCatalog(PinningConfigDTO catalog, InputStream catalogAsStream) {
        if (catalog.getSiteCatalog().getRevision() <= this.propertiesStorage.getRevision()) {
            Catalog catalogLoadFromStorage = loadFromStorage();
            return catalogLoadFromStorage == null ? MapperKt.toModel(catalog.getSiteCatalog()) : catalogLoadFromStorage;
        }
        if (this.signatureVerifier.verify(catalog, catalogAsStream)) {
            Storage.DefaultImpls.clear$default(this.catalogStorage, false, 1, null);
            List<SiteDTO> sites = catalog.getSiteCatalog().getSites();
            LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(sites, 10, 16));
            for (Object obj : sites) {
                linkedHashMap.put(((SiteDTO) obj).getId(), obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(p.mapCapacity(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), this.gson.toJson(MapperKt.toModel((SiteDTO) entry.getValue())));
            }
            if (!Storage.DefaultImpls.set$default(this.catalogStorage, linkedHashMap2, false, 2, null)) {
                return MapperKt.toModel(catalog.getSiteCatalog());
            }
            this.propertiesStorage.setUpdateUrls(catalog.getProperties().getUpdateUrl());
            this.propertiesStorage.setUpdateThreshold(catalog.getProperties().getUpdateThreshold());
            this.propertiesStorage.setRevision(catalog.getSiteCatalog().getRevision());
            return MapperKt.toModel(catalog.getSiteCatalog());
        }
        ExceptionKt.throwError$default(ErrorType.ConfigurationValidationFailed.INSTANCE, (Throwable) null, 2, (Object) null);
        throw new KotlinNothingValueException();
    }
}
