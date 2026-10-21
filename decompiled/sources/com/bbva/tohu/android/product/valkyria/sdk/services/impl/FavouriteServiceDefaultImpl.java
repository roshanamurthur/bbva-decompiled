package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.CardNotEnabledException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.CardSuspendedException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TemporaryUnavailableException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.services.FavouriteService;

/* JADX INFO: loaded from: classes6.dex */
public class FavouriteServiceDefaultImpl implements FavouriteService {
    private DatabaseManager databaseManager;
    private UserSharedPreferencesManager userPreferencesManager;

    public FavouriteServiceDefaultImpl(DatabaseManager databaseManager, UserSharedPreferencesManager userSharedPreferencesManager) {
        this.databaseManager = databaseManager;
        this.userPreferencesManager = userSharedPreferencesManager;
    }

    private Token getTokenByCardUniqueReference(String str) throws CardNotEnabledException {
        try {
            return this.databaseManager.getTokenByCardUniqueReference(str);
        } catch (NotFoundEntityException e5) {
            throw new CardNotEnabledException(e5);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.FavouriteService
    public String getFavourite() {
        return this.userPreferencesManager.getFavouriteCard();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.FavouriteService
    public void setFavourite(String str) throws CardNotEnabledException, CardSuspendedException, TemporaryUnavailableException {
        if (str != null) {
            Token tokenByCardUniqueReference = getTokenByCardUniqueReference(str);
            String state = tokenByCardUniqueReference.getState();
            if (state.equals("INACTIVE")) {
                throw new CardNotEnabledException();
            }
            if (state.equals("SUSPENDED")) {
                throw new CardSuspendedException();
            }
            if (!this.databaseManager.existUsableBulletsByCardUniqueReference(tokenByCardUniqueReference.getCardUniqueReference())) {
                throw new TemporaryUnavailableException();
            }
        }
        this.userPreferencesManager.setFavouriteCard(str);
    }
}
