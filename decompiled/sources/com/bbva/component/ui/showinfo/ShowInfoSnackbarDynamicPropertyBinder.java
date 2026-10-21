package com.bbva.component.ui.showinfo;

import a6.c;
import io.reactivex.functions.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ShowInfoSnackbarDynamicPropertyBinder {
    public static void a(final ShowInfoSnackbar showInfoSnackbar) {
        showInfoSnackbar.newProperty("message", new Consumer() { // from class: a6.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                showInfoSnackbar.setTextMessage((Map) obj);
            }
        });
        showInfoSnackbar.newProperty("durationInMillis", new c(showInfoSnackbar, 0));
        showInfoSnackbar.newProperty("textGravity", new Consumer() { // from class: a6.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                showInfoSnackbar.setTextGravity((Map) obj);
            }
        });
        showInfoSnackbar.newProperty("textMaxLines", new Consumer() { // from class: a6.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                showInfoSnackbar.setTextMaxLines((Map) obj);
            }
        });
    }
}
