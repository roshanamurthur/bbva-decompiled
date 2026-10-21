package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ExternalTypeHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaType f43216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f43217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f43218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f43219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TokenBuffer[] f43220e;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JavaType f43221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f43222b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f43223c = new HashMap();

        public Builder(JavaType javaType) {
            this.f43221a = javaType;
        }

        public final void a(Integer num, String str) {
            HashMap map = this.f43223c;
            Object obj = map.get(str);
            if (obj == null) {
                map.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            map.put(str, linkedList);
        }

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            ArrayList arrayList = this.f43222b;
            Integer numValueOf = Integer.valueOf(arrayList.size());
            arrayList.add(new a(settableBeanProperty, typeDeserializer));
            a(numValueOf, settableBeanProperty.getName());
            a(numValueOf, typeDeserializer.getPropertyName());
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            ArrayList arrayList = this.f43222b;
            int size = arrayList.size();
            a[] aVarArr = new a[size];
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) arrayList.get(i10);
                SettableBeanProperty settableBeanPropertyFind = beanPropertyMap.find(aVar.f43226c);
                if (settableBeanPropertyFind != null) {
                    aVar.f43227d = settableBeanPropertyFind;
                }
                aVarArr[i10] = aVar;
            }
            return new ExternalTypeHandler(this.f43221a, aVarArr, this.f43223c, null, null);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SettableBeanProperty f43224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TypeDeserializer f43225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f43226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SettableBeanProperty f43227d;

        public a(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this.f43224a = settableBeanProperty;
            this.f43225b = typeDeserializer;
            this.f43226c = typeDeserializer.getPropertyName();
        }
    }

    public ExternalTypeHandler(JavaType javaType, a[] aVarArr, Map<String, Object> map, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this.f43216a = javaType;
        this.f43217b = aVarArr;
        this.f43218c = map;
        this.f43219d = strArr;
        this.f43220e = tokenBufferArr;
    }

    public static Builder builder(JavaType javaType) {
        return new Builder(javaType);
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i10, String str) throws IOException {
        JsonParser jsonParserAsParser = this.f43220e[i10].asParser(jsonParser);
        if (jsonParserAsParser.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(jsonParserAsParser);
        tokenBuffer.writeEndArray();
        JsonParser jsonParserAsParser2 = tokenBuffer.asParser(jsonParser);
        jsonParserAsParser2.nextToken();
        return this.f43217b[i10].f43224a.deserialize(jsonParserAsParser2, deserializationContext);
    }

    public final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i10, String str) throws IOException {
        JsonParser jsonParserAsParser = this.f43220e[i10].asParser(jsonParser);
        JsonToken jsonTokenNextToken = jsonParserAsParser.nextToken();
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        a[] aVarArr = this.f43217b;
        if (jsonTokenNextToken == jsonToken) {
            aVarArr[i10].f43224a.set(obj, null);
            return;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(jsonParserAsParser);
        tokenBuffer.writeEndArray();
        JsonParser jsonParserAsParser2 = tokenBuffer.asParser(jsonParser);
        jsonParserAsParser2.nextToken();
        aVarArr[i10].f43224a.deserializeAndSet(jsonParserAsParser2, deserializationContext, obj);
    }

    public final boolean a(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i10) throws IOException {
        if (!str.equals(this.f43217b[i10].f43226c)) {
            return false;
        }
        if (obj != null) {
            TokenBuffer[] tokenBufferArr = this.f43220e;
            if (tokenBufferArr[i10] != null) {
                _deserializeAndSet(jsonParser, deserializationContext, obj, i10, str2);
                tokenBufferArr[i10] = null;
                return true;
            }
        }
        this.f43219d[i10] = str2;
        return true;
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        a[] aVarArr = this.f43217b;
        int length = aVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String strIdFromValueAndType = this.f43219d[i10];
            TokenBuffer[] tokenBufferArr = this.f43220e;
            if (strIdFromValueAndType == null) {
                TokenBuffer tokenBuffer = tokenBufferArr[i10];
                if (tokenBuffer != null) {
                    if (tokenBuffer.firstToken().isScalarValue()) {
                        JsonParser jsonParserAsParser = tokenBuffer.asParser(jsonParser);
                        jsonParserAsParser.nextToken();
                        SettableBeanProperty settableBeanProperty = aVarArr[i10].f43224a;
                        Object objDeserializeIfNatural = TypeDeserializer.deserializeIfNatural(jsonParserAsParser, deserializationContext, settableBeanProperty.getType());
                        if (objDeserializeIfNatural != null) {
                            settableBeanProperty.set(obj, objDeserializeIfNatural);
                        } else if (aVarArr[i10].f43225b.getDefaultImpl() != null) {
                            TypeDeserializer typeDeserializer = aVarArr[i10].f43225b;
                            Class<?> defaultImpl = typeDeserializer.getDefaultImpl();
                            strIdFromValueAndType = defaultImpl == null ? null : typeDeserializer.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
                        } else {
                            deserializationContext.reportInputMismatch(obj.getClass(), "Missing external type id property '%s'", aVarArr[i10].f43226c);
                        }
                    }
                }
            } else if (tokenBufferArr[i10] == null) {
                SettableBeanProperty settableBeanProperty2 = aVarArr[i10].f43224a;
                if (settableBeanProperty2.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    deserializationContext.reportInputMismatch(obj.getClass(), "Missing property '%s' for external type id '%s'", settableBeanProperty2.getName(), aVarArr[i10].f43226c);
                }
                return obj;
            }
            _deserializeAndSet(jsonParser, deserializationContext, obj, i10, strIdFromValueAndType);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    public boolean handlePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.f43218c.get(str);
        if (obj2 == null) {
            return false;
        }
        boolean z10 = obj2 instanceof List;
        a[] aVarArr = this.f43217b;
        TokenBuffer[] tokenBufferArr = this.f43220e;
        String[] strArr = this.f43219d;
        if (z10) {
            Iterator it = ((List) obj2).iterator();
            Integer num = (Integer) it.next();
            if (str.equals(aVarArr[num.intValue()].f43226c)) {
                String text = jsonParser.getText();
                jsonParser.skipChildren();
                strArr[num.intValue()] = text;
                while (it.hasNext()) {
                    strArr[((Integer) it.next()).intValue()] = text;
                }
            } else {
                TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
                tokenBuffer.copyCurrentStructure(jsonParser);
                tokenBufferArr[num.intValue()] = tokenBuffer;
                while (it.hasNext()) {
                    tokenBufferArr[((Integer) it.next()).intValue()] = tokenBuffer;
                }
            }
            return true;
        }
        int iIntValue = ((Integer) obj2).intValue();
        if (str.equals(aVarArr[iIntValue].f43226c)) {
            strArr[iIntValue] = jsonParser.getText();
            jsonParser.skipChildren();
            if (obj != null && tokenBufferArr[iIntValue] != null) {
                String str2 = strArr[iIntValue];
                strArr[iIntValue] = null;
                _deserializeAndSet(jsonParser, deserializationContext, obj, iIntValue, str2);
                tokenBufferArr[iIntValue] = null;
            }
        } else {
            TokenBuffer tokenBuffer2 = new TokenBuffer(jsonParser, deserializationContext);
            tokenBuffer2.copyCurrentStructure(jsonParser);
            tokenBufferArr[iIntValue] = tokenBuffer2;
            if (obj != null && strArr[iIntValue] != null) {
                String str3 = strArr[iIntValue];
                strArr[iIntValue] = null;
                _deserializeAndSet(jsonParser, deserializationContext, obj, iIntValue, str3);
                tokenBufferArr[iIntValue] = null;
            }
        }
        return true;
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.f43218c.get(str);
        boolean z10 = false;
        if (obj2 == null) {
            return false;
        }
        String text = jsonParser.getText();
        if (!(obj2 instanceof List)) {
            return a(jsonParser, deserializationContext, str, obj, text, ((Integer) obj2).intValue());
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            if (a(jsonParser, deserializationContext, str, obj, text, ((Integer) it.next()).intValue())) {
                z10 = true;
            }
        }
        return z10;
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    public ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this.f43216a = externalTypeHandler.f43216a;
        a[] aVarArr = externalTypeHandler.f43217b;
        this.f43217b = aVarArr;
        this.f43218c = externalTypeHandler.f43218c;
        int length = aVarArr.length;
        this.f43219d = new String[length];
        this.f43220e = new TokenBuffer[length];
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer, PropertyBasedCreator propertyBasedCreator) throws IOException {
        String strIdFromValueAndType;
        Object obj;
        a[] aVarArr = this.f43217b;
        int length = aVarArr.length;
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = this.f43219d[i10];
            a aVar = aVarArr[i10];
            JavaType javaType = this.f43216a;
            TokenBuffer[] tokenBufferArr = this.f43220e;
            if (str == null) {
                if (tokenBufferArr[i10] != null) {
                    if (aVar.f43225b.getDefaultImpl() != null) {
                        TypeDeserializer typeDeserializer = aVar.f43225b;
                        Class<?> defaultImpl = typeDeserializer.getDefaultImpl();
                        strIdFromValueAndType = defaultImpl == null ? null : typeDeserializer.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
                    } else {
                        deserializationContext.reportInputMismatch(javaType, "Missing external type id property '%s'", aVar.f43226c);
                        strIdFromValueAndType = str;
                    }
                }
            } else if (tokenBufferArr[i10] == null) {
                strIdFromValueAndType = str;
                deserializationContext.reportInputMismatch(javaType, "Missing property '%s' for external type id '%s'", aVar.f43224a.getName(), aVarArr[i10].f43226c);
                strIdFromValueAndType = str;
            }
            strIdFromValueAndType = str;
            objArr[i10] = _deserialize(jsonParser, deserializationContext, i10, strIdFromValueAndType);
            SettableBeanProperty settableBeanProperty = aVar.f43224a;
            if (settableBeanProperty.getCreatorIndex() >= 0) {
                propertyValueBuffer.assignParameter(settableBeanProperty, objArr[i10]);
                SettableBeanProperty settableBeanProperty2 = aVar.f43227d;
                if (settableBeanProperty2 != null && settableBeanProperty2.getCreatorIndex() >= 0) {
                    if (!settableBeanProperty2.getType().hasRawClass(String.class)) {
                        obj = strIdFromValueAndType;
                        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
                        tokenBuffer.writeString(strIdFromValueAndType);
                        Object objDeserialize = settableBeanProperty2.getValueDeserializer().deserialize(tokenBuffer.asParserOnFirstToken(), deserializationContext);
                        tokenBuffer.close();
                        obj = objDeserialize;
                    }
                    obj = strIdFromValueAndType;
                    propertyValueBuffer.assignParameter(settableBeanProperty2, obj);
                }
            }
        }
        Object objBuild = propertyBasedCreator.build(deserializationContext, propertyValueBuffer);
        for (int i11 = 0; i11 < length; i11++) {
            SettableBeanProperty settableBeanProperty3 = aVarArr[i11].f43224a;
            if (settableBeanProperty3.getCreatorIndex() < 0) {
                settableBeanProperty3.set(objBuild, objArr[i11]);
            }
        }
        return objBuild;
    }
}
