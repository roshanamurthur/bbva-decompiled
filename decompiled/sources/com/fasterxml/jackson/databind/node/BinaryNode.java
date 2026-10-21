package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class BinaryNode extends ValueNode {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final BinaryNode f43383p0 = new BinaryNode(new byte[0]);
    protected final byte[] _data;

    public BinaryNode(byte[] bArr) {
        this._data = bArr;
    }

    public static BinaryNode valueOf(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? f43383p0 : new BinaryNode(bArr);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return Base64Variants.getDefaultVariant().encode(this._data, false);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() {
        return this._data;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BinaryNode)) {
            return Arrays.equals(((BinaryNode) obj)._data, this._data);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.BINARY;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        byte[] bArr = this._data;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Base64Variant base64Variant = serializerProvider.getConfig().getBase64Variant();
        byte[] bArr = this._data;
        jsonGenerator.writeBinary(base64Variant, bArr, 0, bArr.length);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.JsonNode
    public String toString() {
        return Base64Variants.getDefaultVariant().encode(this._data, true);
    }

    public BinaryNode(byte[] bArr, int i10, int i11) {
        if (i10 == 0 && i11 == bArr.length) {
            this._data = bArr;
            return;
        }
        byte[] bArr2 = new byte[i11];
        this._data = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static BinaryNode valueOf(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return null;
        }
        if (i11 == 0) {
            return f43383p0;
        }
        return new BinaryNode(bArr, i10, i11);
    }
}
