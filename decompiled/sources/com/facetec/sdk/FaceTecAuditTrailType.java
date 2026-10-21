package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public enum FaceTecAuditTrailType {
    DISABLED("Audit trail images will not be returned"),
    FULL_RESOLUTION("The full resolution image will be returned for the audit trail"),
    HEIGHT_640("An image of height 640 will be returned for the audit trail");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f40071c;

    FaceTecAuditTrailType(String str) {
        this.f40071c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f40071c;
    }
}
