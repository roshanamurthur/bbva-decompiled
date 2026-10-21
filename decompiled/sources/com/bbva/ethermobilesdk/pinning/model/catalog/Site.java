package com.bbva.ethermobilesdk.pinning.model.catalog;

import androidx.annotation.Keep;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.cipher.factory.TrustManagerKt;
import com.bbva.ethermobilesdk.pinning.extension.StringKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Catalog.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003J\b\u0010!\u001a\u00020\u0003H\u0016J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/catalog/Site;", "", "id", "", "hosts", "", "checker", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/SiteChecker;", "pemCertificates", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Certificate;", "(Ljava/lang/String;Ljava/util/List;Lcom/bbva/ethermobilesdk/pinning/model/catalog/SiteChecker;Ljava/util/List;)V", "getChecker", "()Lcom/bbva/ethermobilesdk/pinning/model/catalog/SiteChecker;", "getHosts", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getPemCertificates", "trustManagers", "Ljavax/net/ssl/X509TrustManager;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "matchHost", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/MatchType;", "host", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCatalog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Catalog.kt\ncom/bbva/ethermobilesdk/pinning/model/catalog/Site\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1549#2:84\n1620#2,3:85\n*S KotlinDebug\n*F\n+ 1 Catalog.kt\ncom/bbva/ethermobilesdk/pinning/model/catalog/Site\n*L\n65#1:84\n65#1:85,3\n*E\n"})
public final /* data */ class Site {

    @SerializedName("checker")
    @NotNull
    private final SiteChecker checker;

    @SerializedName("hosts")
    @NotNull
    private final List<String> hosts;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("pemCertificates")
    @NotNull
    private final List<Certificate> pemCertificates;

    @Nullable
    private transient List<? extends X509TrustManager> trustManagers;

    /* JADX INFO: compiled from: Catalog.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchType.values().length];
            try {
                iArr[MatchType.SITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Site(@NotNull String id, @NotNull List<String> hosts, @NotNull SiteChecker checker, @NotNull List<Certificate> pemCertificates) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        Intrinsics.checkNotNullParameter(checker, "checker");
        Intrinsics.checkNotNullParameter(pemCertificates, "pemCertificates");
        this.id = id;
        this.hosts = hosts;
        this.checker = checker;
        this.pemCertificates = pemCertificates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Site copy$default(Site site, String str, List list, SiteChecker siteChecker, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = site.id;
        }
        if ((i10 & 2) != 0) {
            list = site.hosts;
        }
        if ((i10 & 4) != 0) {
            siteChecker = site.checker;
        }
        if ((i10 & 8) != 0) {
            list2 = site.pemCertificates;
        }
        return site.copy(str, list, siteChecker, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<String> component2() {
        return this.hosts;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SiteChecker getChecker() {
        return this.checker;
    }

    @NotNull
    public final List<Certificate> component4() {
        return this.pemCertificates;
    }

    @NotNull
    public final Site copy(@NotNull String id, @NotNull List<String> hosts, @NotNull SiteChecker checker, @NotNull List<Certificate> pemCertificates) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        Intrinsics.checkNotNullParameter(checker, "checker");
        Intrinsics.checkNotNullParameter(pemCertificates, "pemCertificates");
        return new Site(id, hosts, checker, pemCertificates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Site)) {
            return false;
        }
        Site site = (Site) other;
        return Intrinsics.areEqual(this.id, site.id) && Intrinsics.areEqual(this.hosts, site.hosts) && Intrinsics.areEqual(this.checker, site.checker) && Intrinsics.areEqual(this.pemCertificates, site.pemCertificates);
    }

    @NotNull
    public final SiteChecker getChecker() {
        return this.checker;
    }

    @NotNull
    public final List<String> getHosts() {
        return this.hosts;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<Certificate> getPemCertificates() {
        return this.pemCertificates;
    }

    public int hashCode() {
        return this.pemCertificates.hashCode() + ((this.checker.hashCode() + a.a(this.hosts, this.id.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public final MatchType matchHost(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        MatchType matchTypeMatchHostWith = MatchType.NO_MATCH;
        Iterator<String> it = this.hosts.iterator();
        while (it.hasNext()) {
            matchTypeMatchHostWith = StringKt.matchHostWith(host, it.next());
            if (WhenMappings.$EnumSwitchMapping$0[matchTypeMatchHostWith.ordinal()] == 1) {
                break;
            }
        }
        return matchTypeMatchHostWith;
    }

    @NotNull
    public String toString() {
        return "Site(id=" + this.id + ", hosts=" + this.hosts + ")";
    }

    @NotNull
    public final List<X509TrustManager> trustManagers() {
        if (this.trustManagers == null) {
            List<Certificate> list = this.pemCertificates;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(StringKt.toX509Certificate(((Certificate) it.next()).getValue()));
            }
            this.trustManagers = (List) ResultKt.getOrThrow(TrustManagerKt.loadTrustManagers(this.id, arrayList));
        }
        List list2 = this.trustManagers;
        return list2 == null ? CollectionsKt__CollectionsKt.emptyList() : list2;
    }
}
