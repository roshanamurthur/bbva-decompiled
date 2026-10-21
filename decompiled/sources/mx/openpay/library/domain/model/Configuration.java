package mx.openpay.library.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.salesforce.marketingcloud.storage.db.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lmx/openpay/library/domain/model/Configuration;", "", "Lmx/openpay/library/domain/model/Environment;", "component1", "Lmx/openpay/library/domain/model/Country;", "component2", "Lmx/openpay/library/domain/model/IntegratorTags;", "component3", "environment", "country", k.a.f65040g, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lmx/openpay/library/domain/model/Environment;", "getEnvironment", "()Lmx/openpay/library/domain/model/Environment;", "b", "Lmx/openpay/library/domain/model/Country;", "getCountry", "()Lmx/openpay/library/domain/model/Country;", "c", "Lmx/openpay/library/domain/model/IntegratorTags;", "getTags", "()Lmx/openpay/library/domain/model/IntegratorTags;", "<init>", "(Lmx/openpay/library/domain/model/Environment;Lmx/openpay/library/domain/model/Country;Lmx/openpay/library/domain/model/IntegratorTags;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Configuration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Environment environment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Country country;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IntegratorTags tags;

    public Configuration(@NotNull Environment environment, @NotNull Country country, @NotNull IntegratorTags tags) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.environment = environment;
        this.country = country;
        this.tags = tags;
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, Environment environment, Country country, IntegratorTags integratorTags, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            environment = configuration.environment;
        }
        if ((i10 & 2) != 0) {
            country = configuration.country;
        }
        if ((i10 & 4) != 0) {
            integratorTags = configuration.tags;
        }
        return configuration.copy(environment, country, integratorTags);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IntegratorTags getTags() {
        return this.tags;
    }

    @NotNull
    public final Configuration copy(@NotNull Environment environment, @NotNull Country country, @NotNull IntegratorTags tags) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new Configuration(environment, country, tags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return Intrinsics.areEqual(this.environment, configuration.environment) && Intrinsics.areEqual(this.country, configuration.country) && this.tags == configuration.tags;
    }

    @NotNull
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final IntegratorTags getTags() {
        return this.tags;
    }

    public int hashCode() {
        return this.tags.hashCode() + ((this.country.hashCode() + (this.environment.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Configuration(environment=" + this.environment + ", country=" + this.country + ", tags=" + this.tags + ")";
    }
}
