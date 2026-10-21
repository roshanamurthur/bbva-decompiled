package com.dasnano.vddocumentcapture.other;

import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class VDDocument {
    private VDGroup country;
    private Boolean hasObverse;
    private Boolean hasReverse;
    private VDEnums.VDDocumentType mDocumentEnum;
    private VDEnums.VDDocumentTypeTravel mDocumentType;
    private Drawable mDrawable;
    private String mID = "";
    private String documentName = "";

    public VDDocument() {
        Boolean bool = Boolean.FALSE;
        this.hasObverse = bool;
        this.hasReverse = bool;
    }

    public VDEnums.VDDocumentType getDocumentEnum() {
        return this.mDocumentEnum;
    }

    public VDEnums.VDDocumentTypeTravel getDocumentType() {
        return this.mDocumentType;
    }

    public Drawable getDrawable() {
        return this.mDrawable;
    }

    public VDGroup getGroup() {
        return this.country;
    }

    public String getID() {
        return this.mID;
    }

    public String getName() {
        return this.documentName;
    }

    public Boolean hasObverse() {
        return this.hasObverse;
    }

    public Boolean hasReverse() {
        return this.hasReverse;
    }

    public void setDocumentEnum(VDEnums.VDDocumentType vDDocumentType) {
        this.mDocumentEnum = vDDocumentType;
    }

    public void setDocumentType(VDEnums.VDDocumentTypeTravel vDDocumentTypeTravel) {
        this.mDocumentType = vDDocumentTypeTravel;
    }

    public void setDrawable(Drawable drawable) {
        this.mDrawable = drawable;
    }

    public void setGroup(VDGroup vDGroup) {
        this.country = vDGroup;
    }

    public void setID(String str) {
        this.mID = str;
    }

    public void setName(String str) {
        this.documentName = str;
    }

    public void setObverse(Boolean bool) {
        this.hasObverse = bool;
    }

    public void setReverse(Boolean bool) {
        this.hasReverse = bool;
    }

    @NonNull
    public String toString() {
        return "[Id: " + this.mID + ", document type: " + this.mDocumentType + " and country: " + this.country.toString() + ", has obverse: " + this.hasObverse + ", has reverse: " + this.hasReverse + Constant.BRACKET_CLOSE;
    }
}
