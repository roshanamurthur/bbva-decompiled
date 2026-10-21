package com.veridas.bidicode.dependencies;

import com.veridas.bidicode.entities.BidiCodePlacement;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IBidiCodePlacementsProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H&¨\u0006\b"}, d2 = {"Lcom/veridas/bidicode/dependencies/IBidiCodePlacementsProvider;", "", "getPlacementsForDocuments", "", "", "", "Lcom/veridas/bidicode/entities/BidiCodePlacement;", "documents", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IBidiCodePlacementsProvider {
    @NotNull
    Map<String, List<BidiCodePlacement>> getPlacementsForDocuments(@NotNull List<String> documents);
}
