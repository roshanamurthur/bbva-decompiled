package com.bbva.ethermobilesdk.pinning.provider.catalog;

import com.bbva.ethermobilesdk.pinning.data.catalog.PinningConfigDTO;
import com.bbva.ethermobilesdk.pinning.data.catalog.SiteCatalogDTO;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CatalogReader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/provider/catalog/CatalogReader;", "", "parser", "Lcom/bbva/ethermobilesdk/pinning/provider/catalog/Parser;", "(Lcom/bbva/ethermobilesdk/pinning/provider/catalog/Parser;)V", "read", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/PinningConfigDTO;", "stream", "Ljava/io/InputStream;", "readSiteCatalog", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCatalogReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogReader.kt\ncom/bbva/ethermobilesdk/pinning/provider/catalog/CatalogReader\n+ 2 CatalogReader.kt\ncom/bbva/ethermobilesdk/pinning/provider/catalog/Parser\n*L\n1#1,47:1\n31#2:48\n31#2:49\n*S KotlinDebug\n*F\n+ 1 CatalogReader.kt\ncom/bbva/ethermobilesdk/pinning/provider/catalog/CatalogReader\n*L\n22#1:48\n23#1:49\n*E\n"})
public final class CatalogReader {

    @NotNull
    private final Parser parser;

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogReader() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final PinningConfigDTO read(@NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        return (PinningConfigDTO) this.parser.serializer.read(PinningConfigDTO.class, stream);
    }

    @NotNull
    public final SiteCatalogDTO readSiteCatalog(@NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        return (SiteCatalogDTO) this.parser.serializer.read(SiteCatalogDTO.class, stream);
    }

    public CatalogReader(@NotNull Parser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
    }

    public /* synthetic */ CatalogReader(Parser parser, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Parser() : parser);
    }
}
