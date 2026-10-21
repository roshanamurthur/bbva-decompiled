package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class DecimalNode extends NumericNode {
    public static final DecimalNode ZERO = new DecimalNode(BigDecimal.ZERO);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final BigDecimal f43385p0 = BigDecimal.valueOf(-2147483648L);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final BigDecimal f43386q0 = BigDecimal.valueOf(2147483647L);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final BigDecimal f43387r0 = BigDecimal.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final BigDecimal f43388s0 = BigDecimal.valueOf(Long.MAX_VALUE);
    protected final BigDecimal _value;

    public DecimalNode(BigDecimal bigDecimal) {
        this._value = bigDecimal;
    }

    public static DecimalNode valueOf(BigDecimal bigDecimal) {
        return new DecimalNode(bigDecimal);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this._value.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigInteger bigIntegerValue() {
        return this._value.toBigInteger();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToInt() {
        return this._value.compareTo(f43385p0) >= 0 && this._value.compareTo(f43386q0) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public boolean canConvertToLong() {
        return this._value.compareTo(f43387r0) >= 0 && this._value.compareTo(f43388s0) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public BigDecimal decimalValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public double doubleValue() {
        return this._value.doubleValue();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof DecimalNode) && ((DecimalNode) obj)._value.compareTo(this._value) == 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public float floatValue() {
        return this._value.floatValue();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return Double.valueOf(doubleValue()).hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public int intValue() {
        return this._value.intValue();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isBigDecimal() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isFloatingPointNumber() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public long longValue() {
        return this._value.longValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.BIG_DECIMAL;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.JsonNode
    public Number numberValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this._value);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public short shortValue() {
        return this._value.shortValue();
    }
}
