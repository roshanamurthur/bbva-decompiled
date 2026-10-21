package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class JsonSchema {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObjectNode f43372a;

    @JsonCreator
    public JsonSchema(ObjectNode objectNode) {
        this.f43372a = objectNode;
    }

    public static JsonNode getDefaultSchemaNode() {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", "any");
        return objectNode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonSchema)) {
            return false;
        }
        ObjectNode objectNode = ((JsonSchema) obj).f43372a;
        ObjectNode objectNode2 = this.f43372a;
        if (objectNode2 == null) {
            return objectNode == null;
        }
        return objectNode2.equals(objectNode);
    }

    @JsonValue
    public ObjectNode getSchemaNode() {
        return this.f43372a;
    }

    public int hashCode() {
        return this.f43372a.hashCode();
    }

    public String toString() {
        return this.f43372a.toString();
    }
}
