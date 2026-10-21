package io.card.payment.i18n;

import java.lang.Enum;

/* JADX INFO: loaded from: classes7.dex */
public interface SupportedLocale<E extends Enum<?>> {
    String getAdaptedDisplay(E e5, String str);

    String getName();
}
