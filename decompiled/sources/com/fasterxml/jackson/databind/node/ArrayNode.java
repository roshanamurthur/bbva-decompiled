package com.fasterxml.jackson.databind.node;

import androidx.appcompat.widget.o1;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class ArrayNode extends ContainerNode<ArrayNode> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<JsonNode> f43378p0;

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this.f43378p0 = new ArrayList();
    }

    public ArrayNode _add(JsonNode jsonNode) {
        this.f43378p0.add(jsonNode);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode _at(JsonPointer jsonPointer) {
        return get(jsonPointer.getMatchingIndex());
    }

    public boolean _childrenEqual(ArrayNode arrayNode) {
        return this.f43378p0.equals(arrayNode.f43378p0);
    }

    public ArrayNode _insert(int i10, JsonNode jsonNode) {
        List<JsonNode> list = this.f43378p0;
        if (i10 < 0) {
            list.add(0, jsonNode);
        } else if (i10 >= list.size()) {
            list.add(jsonNode);
        } else {
            list.add(i10, jsonNode);
        }
        return this;
    }

    public ArrayNode add(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _add(jsonNode);
        return this;
    }

    public ArrayNode addAll(ArrayNode arrayNode) {
        this.f43378p0.addAll(arrayNode.f43378p0);
        return this;
    }

    public ArrayNode addArray() {
        ArrayNode arrayNode = arrayNode();
        _add(arrayNode);
        return arrayNode;
    }

    public ArrayNode addNull() {
        _add(nullNode());
        return this;
    }

    public ObjectNode addObject() {
        ObjectNode objectNode = objectNode();
        _add(objectNode);
        return objectNode;
    }

    public ArrayNode addPOJO(Object obj) {
        if (obj == null) {
            addNull();
        } else {
            _add(pojoNode(obj));
        }
        return this;
    }

    public ArrayNode addRawValue(RawValue rawValue) {
        if (rawValue == null) {
            addNull();
        } else {
            _add(rawValueNode(rawValue));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this.f43378p0.iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        if (!(jsonNode instanceof ArrayNode)) {
            return false;
        }
        ArrayNode arrayNode = (ArrayNode) jsonNode;
        List<JsonNode> list = this.f43378p0;
        int size = list.size();
        if (arrayNode.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!list.get(i10).equals(comparator, arrayNode.f43378p0.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findParents(String str, List<JsonNode> list) {
        Iterator<JsonNode> it = this.f43378p0.iterator();
        while (it.hasNext()) {
            list = it.next().findParents(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode findValue(String str) {
        Iterator<JsonNode> it = this.f43378p0.iterator();
        while (it.hasNext()) {
            JsonNode jsonNodeFindValue = it.next().findValue(str);
            if (jsonNodeFindValue != null) {
                return jsonNodeFindValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findValues(String str, List<JsonNode> list) {
        Iterator<JsonNode> it = this.f43378p0.iterator();
        while (it.hasNext()) {
            list = it.next().findValues(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<String> findValuesAsText(String str, List<String> list) {
        Iterator<JsonNode> it = this.f43378p0.iterator();
        while (it.hasNext()) {
            list = it.next().findValuesAsText(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this.f43378p0.hashCode();
    }

    public ArrayNode insert(int i10, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _insert(i10, jsonNode);
        return this;
    }

    public ArrayNode insertArray(int i10) {
        ArrayNode arrayNode = arrayNode();
        _insert(i10, arrayNode);
        return arrayNode;
    }

    public ArrayNode insertNull(int i10) {
        _insert(i10, nullNode());
        return this;
    }

    public ObjectNode insertObject(int i10) {
        ObjectNode objectNode = objectNode();
        _insert(i10, objectNode);
        return objectNode;
    }

    public ArrayNode insertPOJO(int i10, Object obj) {
        return obj == null ? insertNull(i10) : _insert(i10, pojoNode(obj));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public boolean isArray() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this.f43378p0.isEmpty();
    }

    public JsonNode remove(int i10) {
        if (i10 < 0) {
            return null;
        }
        List<JsonNode> list = this.f43378p0;
        if (i10 < list.size()) {
            return list.remove(i10);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<JsonNode> list = this.f43378p0;
        int size = list.size();
        jsonGenerator.writeStartArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            ((BaseJsonNode) list.get(i10)).serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_ARRAY));
        Iterator<JsonNode> it = this.f43378p0.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    public JsonNode set(int i10, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        if (i10 >= 0) {
            List<JsonNode> list = this.f43378p0;
            if (i10 < list.size()) {
                return list.set(i10, jsonNode);
            }
        }
        StringBuilder sbC = o1.c("Illegal index ", i10, ", array size ");
        sbC.append(size());
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public int size() {
        return this.f43378p0.size();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() << 4) + 16);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        List<JsonNode> list = this.f43378p0;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(list.get(i10).toString());
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public ArrayNode addAll(Collection<? extends JsonNode> collection) {
        this.f43378p0.addAll(collection);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode deepCopy() {
        ArrayNode arrayNode = new ArrayNode(this._nodeFactory);
        Iterator<JsonNode> it = this.f43378p0.iterator();
        while (it.hasNext()) {
            arrayNode.f43378p0.add(it.next().deepCopy());
        }
        return arrayNode;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ObjectNode findParent(String str) {
        Iterator<JsonNode> it = this.f43378p0.iterator();
        while (it.hasNext()) {
            JsonNode jsonNodeFindParent = it.next().findParent(str);
            if (jsonNodeFindParent != null) {
                return (ObjectNode) jsonNodeFindParent;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public ArrayNode removeAll() {
        this.f43378p0.clear();
        return this;
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, int i10) {
        super(jsonNodeFactory);
        this.f43378p0 = new ArrayList(i10);
    }

    public ArrayNode add(int i10) {
        _add(numberNode(i10));
        return this;
    }

    public ArrayNode insert(int i10, int i11) {
        _insert(i10, numberNode(i11));
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(String str) {
        return MissingNode.getInstance();
    }

    public ArrayNode add(Integer num) {
        if (num == null) {
            return addNull();
        }
        return _add(numberNode(num.intValue()));
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(int i10) {
        if (i10 < 0) {
            return null;
        }
        List<JsonNode> list = this.f43378p0;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    public ArrayNode insert(int i10, Integer num) {
        if (num == null) {
            insertNull(i10);
        } else {
            _insert(i10, numberNode(num.intValue()));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(int i10) {
        if (i10 >= 0) {
            List<JsonNode> list = this.f43378p0;
            if (i10 < list.size()) {
                return list.get(i10);
            }
        }
        return MissingNode.getInstance();
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, List<JsonNode> list) {
        super(jsonNodeFactory);
        this.f43378p0 = list;
    }

    public ArrayNode add(long j10) {
        return _add(numberNode(j10));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ArrayNode)) {
            return false;
        }
        return this.f43378p0.equals(((ArrayNode) obj).f43378p0);
    }

    public ArrayNode insert(int i10, long j10) {
        return _insert(i10, numberNode(j10));
    }

    public ArrayNode add(Long l6) {
        if (l6 == null) {
            return addNull();
        }
        return _add(numberNode(l6.longValue()));
    }

    public ArrayNode insert(int i10, Long l6) {
        if (l6 == null) {
            return insertNull(i10);
        }
        return _insert(i10, numberNode(l6.longValue()));
    }

    public ArrayNode add(float f6) {
        return _add(numberNode(f6));
    }

    public ArrayNode insert(int i10, float f6) {
        return _insert(i10, numberNode(f6));
    }

    public ArrayNode add(Float f6) {
        if (f6 == null) {
            return addNull();
        }
        return _add(numberNode(f6.floatValue()));
    }

    public ArrayNode insert(int i10, Float f6) {
        if (f6 == null) {
            return insertNull(i10);
        }
        return _insert(i10, numberNode(f6.floatValue()));
    }

    public ArrayNode add(double d2) {
        return _add(numberNode(d2));
    }

    public ArrayNode insert(int i10, double d2) {
        return _insert(i10, numberNode(d2));
    }

    public ArrayNode add(Double d2) {
        if (d2 == null) {
            return addNull();
        }
        return _add(numberNode(d2.doubleValue()));
    }

    public ArrayNode insert(int i10, Double d2) {
        if (d2 == null) {
            return insertNull(i10);
        }
        return _insert(i10, numberNode(d2.doubleValue()));
    }

    public ArrayNode add(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return addNull();
        }
        return _add(numberNode(bigDecimal));
    }

    public ArrayNode insert(int i10, BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return insertNull(i10);
        }
        return _insert(i10, numberNode(bigDecimal));
    }

    public ArrayNode add(BigInteger bigInteger) {
        if (bigInteger == null) {
            return addNull();
        }
        return _add(numberNode(bigInteger));
    }

    public ArrayNode insert(int i10, BigInteger bigInteger) {
        if (bigInteger == null) {
            return insertNull(i10);
        }
        return _insert(i10, numberNode(bigInteger));
    }

    public ArrayNode add(String str) {
        if (str == null) {
            return addNull();
        }
        return _add(textNode(str));
    }

    public ArrayNode insert(int i10, String str) {
        if (str == null) {
            return insertNull(i10);
        }
        return _insert(i10, textNode(str));
    }

    public ArrayNode add(boolean z10) {
        return _add(booleanNode(z10));
    }

    public ArrayNode insert(int i10, boolean z10) {
        return _insert(i10, booleanNode(z10));
    }

    public ArrayNode add(Boolean bool) {
        if (bool == null) {
            return addNull();
        }
        return _add(booleanNode(bool.booleanValue()));
    }

    public ArrayNode insert(int i10, Boolean bool) {
        if (bool == null) {
            return insertNull(i10);
        }
        return _insert(i10, booleanNode(bool.booleanValue()));
    }

    public ArrayNode add(byte[] bArr) {
        if (bArr == null) {
            return addNull();
        }
        return _add(binaryNode(bArr));
    }

    public ArrayNode insert(int i10, byte[] bArr) {
        if (bArr == null) {
            return insertNull(i10);
        }
        return _insert(i10, binaryNode(bArr));
    }
}
