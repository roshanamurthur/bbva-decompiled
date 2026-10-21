package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class BooleanNode extends ValueNode {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f43384p0;
    public static final BooleanNode TRUE = new BooleanNode(true);
    public static final BooleanNode FALSE = new BooleanNode(false);

    public BooleanNode(boolean z10) {
        this.f43384p0 = z10;
    }

    public static BooleanNode getFalse() {
        return FALSE;
    }

    public static BooleanNode getTrue() {
        return TRUE;
    }

    public static BooleanNode valueOf(boolean z10) {
        return z10 ? TRUE : FALSE;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean() {
        return this.f43384p0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public double asDouble(double d2) {
        return this.f43384p0 ? 1.0d : 0.0d;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int asInt(int i10) {
        return this.f43384p0 ? 1 : 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public long asLong(long j10) {
        return this.f43384p0 ? 1L : 0L;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this.f43384p0 ? "true" : "false";
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return this.f43384p0 ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean booleanValue() {
        return this.f43384p0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BooleanNode)) {
            return this.f43384p0 == ((BooleanNode) obj).f43384p0;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.BOOLEAN;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this.f43384p0 ? 3 : 1;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeBoolean(this.f43384p0);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z10) {
        return this.f43384p0;
    }
}
