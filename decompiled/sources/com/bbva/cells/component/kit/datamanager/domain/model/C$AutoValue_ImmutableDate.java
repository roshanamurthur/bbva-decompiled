package com.bbva.cells.component.kit.datamanager.domain.model;

import java.util.Date;

/* JADX INFO: renamed from: com.bbva.cells.component.kit.datamanager.domain.model.$AutoValue_ImmutableDate, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
abstract class C$AutoValue_ImmutableDate extends ImmutableDate {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f26678p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Date f26679q0;

    public C$AutoValue_ImmutableDate(String str, Date date) {
        if (str == null) {
            throw new NullPointerException("Null formatted");
        }
        this.f26678p0 = str;
        if (date == null) {
            throw new NullPointerException("Null value");
        }
        this.f26679q0 = date;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDate)) {
            return false;
        }
        ImmutableDate immutableDate = (ImmutableDate) obj;
        return this.f26678p0.equals(immutableDate.formatted()) && this.f26679q0.equals(immutableDate.value());
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.model.ImmutableDate
    public final String formatted() {
        return this.f26678p0;
    }

    public final int hashCode() {
        return ((this.f26678p0.hashCode() ^ 1000003) * 1000003) ^ this.f26679q0.hashCode();
    }

    public final String toString() {
        return "ImmutableDate{formatted=" + this.f26678p0 + ", value=" + this.f26679q0 + "}";
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.model.ImmutableDate
    public final Date value() {
        return this.f26679q0;
    }
}
