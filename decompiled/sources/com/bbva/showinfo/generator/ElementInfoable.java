package com.bbva.showinfo.generator;

import android.content.Context;
import com.bbva.plugin.showinfo.command.HideCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ElementInfoable.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/bbva/showinfo/generator/ElementInfoable;", "ElementInfo", "", "create", "", "context", "Landroid/content/Context;", "element", "(Landroid/content/Context;Ljava/lang/Object;)V", HideCommand.ID, "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ElementInfoable<ElementInfo> {

    /* JADX INFO: compiled from: ElementInfoable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <ElementInfo> void hide(@NotNull ElementInfoable<? super ElementInfo> elementInfoable, @NotNull Context context, ElementInfo elementinfo) throws IllegalArgumentException {
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    void create(@NotNull Context context, ElementInfo element) throws IllegalArgumentException;

    void hide(@NotNull Context context, ElementInfo element) throws IllegalArgumentException;
}
