package com.bbva.showinfo.generator;

import android.content.Context;
import android.widget.Toast;
import com.bbva.showinfo.model.InfoToast;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InfoToastGenerator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/showinfo/generator/InfoToastGenerator;", "Lcom/bbva/showinfo/generator/ElementInfoable;", "Lcom/bbva/showinfo/model/InfoToast;", "()V", "create", "", "context", "Landroid/content/Context;", "element", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InfoToastGenerator implements ElementInfoable<InfoToast> {

    @NotNull
    public static final InfoToastGenerator INSTANCE = new InfoToastGenerator();

    @Override // com.bbva.showinfo.generator.ElementInfoable
    public void hide(@NotNull Context context, @NotNull InfoToast infoToast) throws IllegalArgumentException {
        ElementInfoable.DefaultImpls.hide(this, context, infoToast);
    }

    @Override // com.bbva.showinfo.generator.ElementInfoable
    public void create(@NotNull Context context, @NotNull InfoToast element) throws IllegalArgumentException {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        String message = element.getMessage();
        if (message == null) {
            unit = null;
        } else {
            if (message.length() <= 0 || !(!l.isBlank(message))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Integer duration = element.getDuration();
            Toast.makeText(context, message, duration != null ? duration.intValue() : 0).show();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            throw new IllegalArgumentException();
        }
    }
}
