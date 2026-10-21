package com.bbva.document.scanner.plugin.model;

import com.bbva.document.scanner.Compression;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CompressionParam.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toCompression", "Lcom/bbva/document/scanner/Compression;", "Lcom/bbva/document/scanner/plugin/model/CompressionParam;", "document-scanner-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompressionParam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressionParam.kt\ncom/bbva/document/scanner/plugin/model/CompressionParamKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
public final class CompressionParamKt {
    @NotNull
    public static final Compression toCompression(@Nullable CompressionParam compressionParam) {
        return compressionParam != null ? new Compression(compressionParam.getId(), compressionParam.getQuality()) : new Compression(null, 0, 3, null);
    }
}
