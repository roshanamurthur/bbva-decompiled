package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class ErrorThrowingDeserializer extends JsonDeserializer<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final NoClassDefFoundError f43215p0;

    public ErrorThrowingDeserializer(NoClassDefFoundError noClassDefFoundError) {
        this.f43215p0 = noClassDefFoundError;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw this.f43215p0;
    }
}
