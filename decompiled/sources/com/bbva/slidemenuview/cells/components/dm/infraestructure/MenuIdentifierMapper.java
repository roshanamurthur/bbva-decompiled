package com.bbva.slidemenuview.cells.components.dm.infraestructure;

import com.bbva.slidemenuview.extensions.MenuExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuIdentifierMapper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;", "", "intIdentifier", "", "id", "", "stringIdentifier", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MenuIdentifierMapper {

    /* JADX INFO: compiled from: MenuIdentifierMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int intIdentifier(@NotNull MenuIdentifierMapper menuIdentifierMapper, @NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return MenuExtensionsKt.idOf(id);
        }

        @NotNull
        public static String stringIdentifier(@NotNull MenuIdentifierMapper menuIdentifierMapper, int i10) {
            return MenuExtensionsKt.idOf(i10);
        }
    }

    int intIdentifier(@NotNull String id);

    @NotNull
    String stringIdentifier(int id);
}
