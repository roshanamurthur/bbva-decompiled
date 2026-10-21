package com.bbva.cellscore.web.data.component;

import ad.d;

/* JADX INFO: renamed from: com.bbva.cellscore.web.data.component.$AutoValue_TemplateDefinition, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
abstract class C$AutoValue_TemplateDefinition extends TemplateDefinition {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f27089p0;

    public C$AutoValue_TemplateDefinition(String str) {
        if (str == null) {
            throw new NullPointerException("Null tag");
        }
        this.f27089p0 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TemplateDefinition) {
            return this.f27089p0.equals(((TemplateDefinition) obj).tag());
        }
        return false;
    }

    public final int hashCode() {
        return this.f27089p0.hashCode() ^ 1000003;
    }

    @Override // com.bbva.cellscore.web.data.component.TemplateDefinition
    public final String tag() {
        return this.f27089p0;
    }

    public final String toString() {
        return d.f(new StringBuilder("TemplateDefinition{tag="), this.f27089p0, "}");
    }
}
