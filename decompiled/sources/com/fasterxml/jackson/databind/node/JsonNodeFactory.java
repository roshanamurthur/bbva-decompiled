package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.util.RawValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class JsonNodeFactory implements Serializable, JsonNodeCreator {
    public static final JsonNodeFactory instance;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final JsonNodeFactory f43390q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final JsonNodeFactory f43391r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f43392p0;

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        f43390q0 = jsonNodeFactory;
        f43391r0 = new JsonNodeFactory(true);
        instance = jsonNodeFactory;
    }

    public JsonNodeFactory(boolean z10) {
        this.f43392p0 = z10;
    }

    public static JsonNodeFactory withExactBigDecimals(boolean z10) {
        return z10 ? f43391r0 : f43390q0;
    }

    public boolean _inIntRange(long j10) {
        return ((long) ((int) j10)) == j10;
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode rawValueNode(RawValue rawValue) {
        return new POJONode(rawValue);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ArrayNode arrayNode(int i10) {
        return new ArrayNode(this, i10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public BooleanNode booleanNode(boolean z10) {
        return z10 ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NullNode nullNode() {
        return NullNode.getInstance();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public TextNode textNode(String str) {
        return TextNode.valueOf(str);
    }

    public JsonNodeFactory() {
        this(false);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public BinaryNode binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public BinaryNode binaryNode(byte[] bArr, int i10, int i11) {
        return BinaryNode.valueOf(bArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(byte b10) {
        return IntNode.valueOf(b10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Byte b10) {
        return b10 == null ? nullNode() : IntNode.valueOf(b10.intValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(short s4) {
        return ShortNode.valueOf(s4);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Short sh2) {
        return sh2 == null ? nullNode() : ShortNode.valueOf(sh2.shortValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(int i10) {
        return IntNode.valueOf(i10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Integer num) {
        return num == null ? nullNode() : IntNode.valueOf(num.intValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(long j10) {
        return LongNode.valueOf(j10);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Long l6) {
        if (l6 == null) {
            return nullNode();
        }
        return LongNode.valueOf(l6.longValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return nullNode();
        }
        return BigIntegerNode.valueOf(bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(float f6) {
        return FloatNode.valueOf(f6);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Float f6) {
        return f6 == null ? nullNode() : FloatNode.valueOf(f6.floatValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(double d2) {
        return DoubleNode.valueOf(d2);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Double d2) {
        return d2 == null ? nullNode() : DoubleNode.valueOf(d2.doubleValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return nullNode();
        }
        if (this.f43392p0) {
            return DecimalNode.valueOf(bigDecimal);
        }
        return bigDecimal.compareTo(BigDecimal.ZERO) == 0 ? DecimalNode.ZERO : DecimalNode.valueOf(bigDecimal.stripTrailingZeros());
    }
}
