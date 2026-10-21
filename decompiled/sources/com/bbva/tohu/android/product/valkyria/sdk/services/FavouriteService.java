package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.CardNotEnabledException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.CardSuspendedException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TemporaryUnavailableException;

/* JADX INFO: loaded from: classes6.dex */
public interface FavouriteService {
    String getFavourite();

    void setFavourite(String str) throws CardNotEnabledException, CardSuspendedException, TemporaryUnavailableException;
}
