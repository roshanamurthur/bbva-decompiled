package com.bbva.ethermobilesdk.pinning.update;

import bk.q;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.pinning.SiteManager;
import com.bbva.ethermobilesdk.pinning.data.catalog.SiteCatalogDTO;
import com.bbva.ethermobilesdk.pinning.exception.PinningException;
import com.bbva.ethermobilesdk.pinning.extension.StringKt;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.ethermobilesdk.pinning.model.ProviderProperties;
import com.bbva.ethermobilesdk.pinning.model.ProviderType;
import com.bbva.ethermobilesdk.pinning.model.result.ErrorType;
import com.bbva.ethermobilesdk.pinning.model.result.PinningResult;
import com.bbva.ethermobilesdk.pinning.provider.catalog.CatalogReader;
import com.bbva.ethermobilesdk.pinning.verifier.PinningVerifier;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CatalogUpdater.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/update/CatalogUpdater;", "", "providerType", "Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;", "pinningVerifier", "Lcom/bbva/ethermobilesdk/pinning/verifier/PinningVerifier;", "(Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;Lcom/bbva/ethermobilesdk/pinning/verifier/PinningVerifier;)V", "createRequestParams", "Lcom/bbva/ethermobilesdk/pinning/update/RequestParams;", "providerProperties", "Lcom/bbva/ethermobilesdk/pinning/model/ProviderProperties;", "retrieveSiteCatalog", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;", "updateUrls", "", "", "updateCatalog", "Lcom/bbva/ethermobilesdk/pinning/model/result/PinningResult;", "", "attachHeaders", "Ljavax/net/ssl/HttpsURLConnection;", "requestParams", "Companion", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCatalogUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogUpdater.kt\ncom/bbva/ethermobilesdk/pinning/update/CatalogUpdater\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n766#2:148\n857#2,2:149\n1864#2,3:151\n1#3:154\n*S KotlinDebug\n*F\n+ 1 CatalogUpdater.kt\ncom/bbva/ethermobilesdk/pinning/update/CatalogUpdater\n*L\n35#1:148\n35#1:149,2\n69#1:151,3\n*E\n"})
public final class CatalogUpdater {
    private static final int CONNECT_TIMEOUT = 15000;

    @NotNull
    private static final String HEADER_PARAMETERS = "X-SSLPinning-Params";
    private static final int READ_TIMEOUT = 15000;

    @NotNull
    private static final String REQUEST_METHOD_GET = "GET";

    @NotNull
    private static final String UPDATE_PROTOCOL_VERSION = "1.0";

    @NotNull
    private final PinningVerifier pinningVerifier;

    @NotNull
    private final ProviderType providerType;

    public CatalogUpdater(@NotNull ProviderType providerType, @NotNull PinningVerifier pinningVerifier) {
        Intrinsics.checkNotNullParameter(providerType, "providerType");
        Intrinsics.checkNotNullParameter(pinningVerifier, "pinningVerifier");
        this.providerType = providerType;
        this.pinningVerifier = pinningVerifier;
    }

    private final HttpsURLConnection attachHeaders(HttpsURLConnection httpsURLConnection, RequestParams requestParams) {
        httpsURLConnection.setRequestProperty(HEADER_PARAMETERS, requestParams.toBase64String());
        return httpsURLConnection;
    }

    private final RequestParams createRequestParams(ProviderProperties providerProperties) {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("protocol_version", "1.0");
        pairArr[1] = TuplesKt.to("catalog_actualrevision", String.valueOf(providerProperties.getRevision()));
        String lastModified = providerProperties.getLastModified();
        if (lastModified == null) {
            lastModified = "";
        }
        pairArr[2] = TuplesKt.to("catalog_lastupdate", lastModified);
        return new RequestParams(q.mapOf(pairArr));
    }

    private final SiteCatalogDTO retrieveSiteCatalog(List<String> updateUrls, ProviderProperties providerProperties) throws PinningException {
        Date lastModifiedDate;
        int i10 = 0;
        for (Object obj : updateUrls) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            try {
                LoggerKt.log(LoggerLevel.INFO, "Trying update site [" + i10 + "]: " + StringsKt__StringsKt.substringAfter$default(str, "/", (String) null, 2, (Object) null));
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnectionAttachHeaders = attachHeaders((HttpsURLConnection) uRLConnectionOpenConnection, createRequestParams(providerProperties));
                String lastModified = providerProperties.getLastModified();
                if (lastModified != null && (lastModifiedDate = StringKt.toLastModifiedDate(lastModified)) != null) {
                    httpsURLConnectionAttachHeaders.setRequestProperty("If-Modified-Since", lastModifiedDate.toString());
                }
                httpsURLConnectionAttachHeaders.setRequestMethod("GET");
                httpsURLConnectionAttachHeaders.setConnectTimeout(15000);
                httpsURLConnectionAttachHeaders.setReadTimeout(15000);
                httpsURLConnectionAttachHeaders.setHostnameVerifier(this.pinningVerifier.getPeerVerifier());
                httpsURLConnectionAttachHeaders.setSSLSocketFactory(this.pinningVerifier.getSslContext().getSocketFactory());
                int responseCode = httpsURLConnectionAttachHeaders.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpsURLConnectionAttachHeaders.getHeaderField("Last-Modified");
                    if (headerField != null) {
                        Intrinsics.checkNotNullExpressionValue(headerField, "getHeaderField(\"Last-Modified\")");
                        SiteManager.INSTANCE.setLastModified$pinning_release(this.providerType, headerField);
                    }
                    CatalogReader catalogReader = new CatalogReader(null, 1, null);
                    InputStream inputStream = httpsURLConnectionAttachHeaders.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "conn.inputStream");
                    SiteCatalogDTO siteCatalog = catalogReader.readSiteCatalog(inputStream);
                    LoggerKt.log$default(null, "catalogupdater completed read on remote catalog with revision [" + siteCatalog.getRevision() + "].", 1, null);
                    return siteCatalog;
                }
                if (responseCode == 304) {
                    LoggerKt.log$default(null, "catalogupdater remote catalog not modified since [" + providerProperties.getLastModified() + "]. Skipping.", 1, null);
                    return null;
                }
                throw new IllegalStateException("Unexpected response from updateUrl[" + i10 + "]: [" + responseCode + "]: " + httpsURLConnectionAttachHeaders.getResponseMessage());
            } catch (Throwable th2) {
                LoggerKt.logError("Update site [" + i10 + "] failed. " + th2.getMessage(), th2);
                if (i10 == updateUrls.size() - 1) {
                    throw th2;
                }
                i10 = i11;
            }
        }
        return null;
    }

    @NotNull
    public final PinningResult<Unit> updateCatalog() {
        ArrayList arrayList;
        List listSplit$default;
        try {
            LoggerKt.log(LoggerLevel.INFO, "catalogupdater update " + this.providerType + " catalog");
            LoggerKt.log$default(null, "catalogupdater retrieve site catalog", 1, null);
            SiteManager siteManager = SiteManager.INSTANCE;
            siteManager.loadCatalogSynchronized();
            ProviderProperties providerProperties$pinning_release = siteManager.getProviderProperties$pinning_release(this.providerType);
            if (providerProperties$pinning_release == null) {
                throw new IllegalStateException("Provider Properties cannot be null.");
            }
            String updateUrls = providerProperties$pinning_release.getUpdateUrls();
            if (updateUrls == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) updateUrls, new String[]{ReplenishLogic.ID_SEPARATOR}, false, 0, 6, (Object) null)) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj : listSplit$default) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                LoggerKt.log$default(null, "catalogupdater catalog updateUrls is [" + providerProperties$pinning_release.getUpdateUrls() + Constant.BRACKET_CLOSE, 1, null);
                throw new IllegalStateException("Update URL cannot be empty or null.");
            }
            SiteCatalogDTO siteCatalogDTORetrieveSiteCatalog = retrieveSiteCatalog(arrayList, providerProperties$pinning_release);
            if (siteCatalogDTORetrieveSiteCatalog != null) {
                LoggerKt.log(LoggerLevel.INFO, "catalogupdater retrieved catalog with revision [" + siteCatalogDTORetrieveSiteCatalog.getRevision() + Constant.BRACKET_CLOSE);
                SiteManager.INSTANCE.replaceCatalogIfNewer(this.providerType, siteCatalogDTORetrieveSiteCatalog);
            }
            LoggerKt.log(LoggerLevel.INFO, "catalogupdater current revision is [" + providerProperties$pinning_release.getRevision() + Constant.BRACKET_CLOSE);
            return new PinningResult.Success(Unit.INSTANCE);
        } catch (Throwable th2) {
            LoggerKt.logError("There was a problem updating the catalog.", th2);
            return new PinningResult.Error(new ErrorType.UpdateCatalogError(th2), null, 2, null);
        }
    }
}
