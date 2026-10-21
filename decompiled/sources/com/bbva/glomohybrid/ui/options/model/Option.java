package com.bbva.glomohybrid.ui.options.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Option.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/model/Option;", "", "isSelected", "", "()Z", "title", "", "getTitle", "()Ljava/lang/String;", "type", "", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Option {

    /* JADX INFO: compiled from: Option.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int type(@NotNull Option option) {
            return (option.isSelected() ? State.SELECTED : State.UNSELECTED).ordinal();
        }
    }

    @NotNull
    String getTitle();

    boolean isSelected();

    int type();
}
