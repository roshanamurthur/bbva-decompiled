package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.cfg.PackageVersion;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NopAnnotationIntrospector extends AnnotationIntrospector {
    public static final NopAnnotationIntrospector instance = new a();

    public static class a extends NopAnnotationIntrospector {
        @Override // com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.core.Versioned
        public final Version version() {
            return PackageVersion.VERSION;
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return Version.unknownVersion();
    }
}
