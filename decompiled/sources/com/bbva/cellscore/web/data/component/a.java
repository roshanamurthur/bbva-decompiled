package com.bbva.cellscore.web.data.component;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: AutoValue_ComponentDefinition.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends ComponentDefinition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentDefinition.ComponentType f27095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<FeatureFlag> f27096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, Object> f27097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<Channel> f27098f;

    public a(String str, String str2, ComponentDefinition.ComponentType componentType, ArrayList<FeatureFlag> arrayList, Map<String, Object> map, ArrayList<Channel> arrayList2) {
        if (str == null) {
            throw new NullPointerException("Null tag");
        }
        this.f27093a = str;
        if (str2 == null) {
            throw new NullPointerException("Null zone");
        }
        this.f27094b = str2;
        if (componentType == null) {
            throw new NullPointerException("Null type");
        }
        this.f27095c = componentType;
        if (arrayList == null) {
            throw new NullPointerException("Null flags");
        }
        this.f27096d = arrayList;
        if (map == null) {
            throw new NullPointerException("Null properties");
        }
        this.f27097e = map;
        if (arrayList2 == null) {
            throw new NullPointerException("Null channels");
        }
        this.f27098f = arrayList2;
    }

    @Override // com.bbva.cellscore.web.data.component.ComponentDefinition
    public final ArrayList<Channel> channels() {
        return this.f27098f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComponentDefinition)) {
            return false;
        }
        ComponentDefinition componentDefinition = (ComponentDefinition) obj;
        return this.f27093a.equals(componentDefinition.tag()) && this.f27094b.equals(componentDefinition.zone()) && this.f27095c.equals(componentDefinition.type()) && this.f27096d.equals(componentDefinition.flags()) && this.f27097e.equals(componentDefinition.properties()) && this.f27098f.equals(componentDefinition.channels());
    }

    @Override // com.bbva.cellscore.web.data.component.ComponentDefinition
    public final ArrayList<FeatureFlag> flags() {
        return this.f27096d;
    }

    public final int hashCode() {
        return ((((((((((this.f27093a.hashCode() ^ 1000003) * 1000003) ^ this.f27094b.hashCode()) * 1000003) ^ this.f27095c.hashCode()) * 1000003) ^ this.f27096d.hashCode()) * 1000003) ^ this.f27097e.hashCode()) * 1000003) ^ this.f27098f.hashCode();
    }

    @Override // com.bbva.cellscore.web.data.component.ComponentDefinition
    public final Map<String, Object> properties() {
        return this.f27097e;
    }

    @Override // com.bbva.cellscore.web.data.component.ComponentDefinition
    public final String tag() {
        return this.f27093a;
    }

    public final String toString() {
        return "ComponentDefinition{tag=" + this.f27093a + ", zone=" + this.f27094b + ", type=" + this.f27095c + ", flags=" + this.f27096d + ", properties=" + this.f27097e + ", channels=" + this.f27098f + "}";
    }

    @Override // com.bbva.cellscore.web.data.component.ComponentDefinition
    public final ComponentDefinition.ComponentType type() {
        return this.f27095c;
    }

    @Override // com.bbva.cellscore.web.data.component.ComponentDefinition
    public final String zone() {
        return this.f27094b;
    }
}
