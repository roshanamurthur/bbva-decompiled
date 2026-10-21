package com.bbva.sl.ar.android.secsdk.fido.model;

/* JADX INFO: loaded from: classes8.dex */
public class FidoPayload implements Cloneable {
    private long expirationDate;
    private FidoAttributes fidoAttributes;
    private FidoSession fidoSession;
    private FidoTransaction fidoTransaction;
    private String message;
    private String tag;

    public FidoPayload(String str, FidoAttributes fidoAttributes, FidoSession fidoSession) {
        this(str, fidoAttributes, fidoSession, (FidoTransaction) null, 0L);
    }

    public long getExpirationDate() {
        return this.expirationDate;
    }

    public FidoAttributes getFidoAttributes() {
        return this.fidoAttributes;
    }

    public FidoSession getFidoSession() {
        return this.fidoSession;
    }

    public FidoTransaction getFidoTransaction() {
        return this.fidoTransaction;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTag() {
        return this.tag;
    }

    public void setFidoAttributes(FidoAttributes fidoAttributes) {
        this.fidoAttributes = fidoAttributes;
    }

    public void setFidoSession(FidoSession fidoSession) {
        this.fidoSession = fidoSession;
    }

    public void setFidoTransaction(FidoTransaction fidoTransaction) {
        this.fidoTransaction = fidoTransaction;
    }

    public FidoPayload setLifetime(long j10) {
        this.expirationDate = System.currentTimeMillis() + j10;
        return this;
    }

    public FidoPayload setMessage(String str) {
        this.message = str;
        return this;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public FidoPayload(String str, FidoAttributes fidoAttributes, FidoSession fidoSession, FidoTransaction fidoTransaction) {
        this(str, fidoAttributes, fidoSession, fidoTransaction, 0L);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FidoPayload m4970clone() {
        return new FidoPayload(this.fidoTransaction, this.message, this.fidoAttributes, this.fidoSession, this.expirationDate);
    }

    private FidoPayload(String str, FidoAttributes fidoAttributes, FidoSession fidoSession, FidoTransaction fidoTransaction, long j10) {
        this.message = str;
        this.fidoAttributes = fidoAttributes;
        this.fidoSession = fidoSession;
        this.fidoTransaction = fidoTransaction;
        this.expirationDate = System.currentTimeMillis() + j10;
    }

    private FidoPayload(FidoTransaction fidoTransaction, String str, FidoAttributes fidoAttributes, FidoSession fidoSession, long j10) {
        this(str, fidoAttributes, fidoSession, fidoTransaction);
        this.expirationDate = j10;
    }
}
