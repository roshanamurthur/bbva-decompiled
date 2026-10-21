package com.bbva.sl.ar.android.secsdk.fido.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class FidoTransaction {
    private static final String ID_JSON_KEY = "id";
    private static final String TEXT_JSON_KEY = "text";

    @Nullable
    @SerializedName("text")
    @Expose
    private String text;

    @NonNull
    @SerializedName("id")
    @Expose
    private String transactionId;

    public FidoTransaction(@NonNull String str, @NonNull String str2) {
        this.transactionId = str;
        this.text = str2;
    }

    public String getText() {
        return this.text;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }
}
