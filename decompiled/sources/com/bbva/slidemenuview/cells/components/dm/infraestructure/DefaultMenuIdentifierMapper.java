package com.bbva.slidemenuview.cells.components.dm.infraestructure;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuIdentifierMapper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/DefaultMenuIdentifierMapper;", "Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;", "()V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultMenuIdentifierMapper implements MenuIdentifierMapper {
    @Override // com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper
    public int intIdentifier(@NotNull String str) {
        return MenuIdentifierMapper.DefaultImpls.intIdentifier(this, str);
    }

    @Override // com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper
    @NotNull
    public String stringIdentifier(int i10) {
        return MenuIdentifierMapper.DefaultImpls.stringIdentifier(this, i10);
    }
}
