package com.noknok.android.client.asm.api.uaf.json;

import android.content.Context;
import androidx.webkit.internal.AssetHelper;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AuthenticateIn {

    @Expose
    public String appID;

    @Expose
    public String finalChallenge;

    @Expose
    public List<String> keyIDs;

    @Expose
    public List<Transaction> transaction;

    public static class Transaction {

        @Expose
        public String content;

        @Expose
        public String contentType;

        @Expose
        public DisplayPNGCharacteristicsDescriptor tcDisplayPNGCharacteristics;

        /* JADX WARN: Code duplicated, block: B:18:0x0049  */
        public boolean isValid(Context context) {
            String str;
            int asInt;
            if (this.content == null || (str = this.contentType) == null) {
                Logger.e("AuthenticateIn", "Transaction content is missing");
                return false;
            }
            if (!str.equals(AssetHelper.DEFAULT_MIME_TYPE) && !this.contentType.equals("image/png")) {
                Logger.e("AuthenticateIn", "Transaction content type is invalid");
                return false;
            }
            if (this.contentType.equals(AssetHelper.DEFAULT_MIME_TYPE)) {
                AppSDKConfig appSDKConfig = AppSDKConfig.getInstance(context);
                AppSDKConfig.Key key = AppSDKConfig.Key.maxLengthTransactionText;
                if (appSDKConfig.get(key).getAsInt() != 0) {
                    asInt = AppSDKConfig.getInstance(context).get(key).getAsInt();
                } else {
                    asInt = Integer.MAX_VALUE;
                }
            } else {
                asInt = Integer.MAX_VALUE;
            }
            if (!Validator.isValidBase64Format(this.content, 1, asInt)) {
                Logger.e("AuthenticateIn", "Transaction content is invalid");
                return false;
            }
            if (!this.contentType.equals("image/png") || this.tcDisplayPNGCharacteristics != null) {
                return true;
            }
            Logger.e("AuthenticateIn", "Transaction PNG characteristics is missing");
            return false;
        }
    }

    public boolean isValid(Context context) {
        String str;
        String str2 = this.appID;
        if (str2 == null || str2.isEmpty() || this.appID.length() > 512 || (str = this.finalChallenge) == null || str.isEmpty()) {
            return false;
        }
        List<Transaction> list = this.transaction;
        if (list == null) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        for (Transaction transaction : this.transaction) {
            if (transaction == null || !transaction.isValid(context)) {
                return false;
            }
        }
        return true;
    }
}
