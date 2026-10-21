package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class SingleKeyVintegrisImpl implements SingleKey {
    private byte[] atc;
    private byte[] idn;
    private byte[] mdSessionKeyContactless;
    private byte[] mdSessionKeyDsrp;
    private byte[] umdSessionKeyContactless;
    private byte[] umdSessionKeyDsrp;

    public SingleKeyVintegrisImpl(Bullet bullet) {
        String strConcat = bullet.getKeyLocator().concat(ReplenishLogic.ID_SEPARATOR);
        this.umdSessionKeyContactless = strConcat.concat("CONTACTLESS_UMD_SK").getBytes();
        this.mdSessionKeyContactless = strConcat.concat("CONTACTLESS_MD_SK").getBytes();
        this.umdSessionKeyDsrp = strConcat.concat("DSRP_UMD_SK").getBytes();
        this.mdSessionKeyDsrp = strConcat.concat("DSRP_MD_SK").getBytes();
        this.idn = strConcat.concat("IDN").getBytes();
        setAtcFromString(bullet);
    }

    private void setAtcFromString(Bullet bullet) {
        this.atc = ByteBuffer.allocate(2).putShort(bullet.getAtc().shortValue()).array();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.SingleKey
    public byte[] getAtc() {
        return this.atc;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.SingleKey
    public byte[] getIdn() {
        return this.idn;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.SingleKey
    public byte[] getSessionKeyContactlessMd() {
        return this.mdSessionKeyContactless;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.SingleKey
    public byte[] getSessionKeyContactlessUmd() {
        return this.umdSessionKeyContactless;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.SingleKey
    public byte[] getSessionKeyRemotePaymentMd() {
        return this.mdSessionKeyDsrp;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.SingleKey
    public byte[] getSessionKeyRemotePaymentUmd() {
        return this.umdSessionKeyDsrp;
    }
}
