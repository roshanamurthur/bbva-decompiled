package com.fasterxml.jackson.databind;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public class JsonMappingException extends JsonProcessingException {
    protected LinkedList<Reference> _path;
    protected transient Closeable _processor;

    @Deprecated
    public JsonMappingException(String str) {
        super(str);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str) {
        return new JsonMappingException(jsonParser, str);
    }

    public static JsonMappingException fromUnexpectedIOE(IOException iOException) {
        return new JsonMappingException((Closeable) null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), ClassUtil.exceptionMessage(iOException)));
    }

    public static JsonMappingException wrapWithPath(Throwable th2, Object obj, String str) {
        return wrapWithPath(th2, new Reference(obj, str));
    }

    public void _appendPathDesc(StringBuilder sb2) {
        LinkedList<Reference> linkedList = this._path;
        if (linkedList == null) {
            return;
        }
        Iterator<Reference> it = linkedList.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append("->");
            }
        }
    }

    public String _buildMessage() {
        String message = super.getMessage();
        if (this._path == null) {
            return message;
        }
        StringBuilder sb2 = message == null ? new StringBuilder() : new StringBuilder(message);
        sb2.append(" (through reference chain: ");
        StringBuilder pathReference = getPathReference(sb2);
        pathReference.append(RootService.CLOSE_BRACKET);
        return pathReference.toString();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return _buildMessage();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return _buildMessage();
    }

    public List<Reference> getPath() {
        LinkedList<Reference> linkedList = this._path;
        return linkedList == null ? Collections.emptyList() : Collections.unmodifiableList(linkedList);
    }

    public String getPathReference() {
        return getPathReference(new StringBuilder()).toString();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    @JsonIgnore
    public Object getProcessor() {
        return this._processor;
    }

    public void prependPath(Object obj, String str) {
        prependPath(new Reference(obj, str));
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public static class Reference implements Serializable {
        protected String _desc;
        protected String _fieldName;
        protected transient Object _from;
        protected int _index;

        public Reference() {
            this._index = -1;
        }

        public String getDescription() {
            if (this._desc == null) {
                StringBuilder sb2 = new StringBuilder();
                Object obj = this._from;
                if (obj != null) {
                    Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i10 = 0;
                    while (componentType.isArray()) {
                        componentType = componentType.getComponentType();
                        i10++;
                    }
                    sb2.append(componentType.getName());
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    }
                } else {
                    sb2.append("UNKNOWN");
                }
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                if (this._fieldName != null) {
                    sb2.append('\"');
                    sb2.append(this._fieldName);
                    sb2.append('\"');
                } else {
                    int i11 = this._index;
                    if (i11 >= 0) {
                        sb2.append(i11);
                    } else {
                        sb2.append('?');
                    }
                }
                sb2.append(AbstractJsonLexerKt.END_LIST);
                this._desc = sb2.toString();
            }
            return this._desc;
        }

        public String getFieldName() {
            return this._fieldName;
        }

        @JsonIgnore
        public Object getFrom() {
            return this._from;
        }

        public int getIndex() {
            return this._index;
        }

        public String toString() {
            return getDescription();
        }

        public Object writeReplace() {
            getDescription();
            return this;
        }

        public Reference(Object obj) {
            this._index = -1;
            this._from = obj;
        }

        public Reference(Object obj, String str) {
            this._index = -1;
            this._from = obj;
            if (str != null) {
                this._fieldName = str;
                return;
            }
            throw new NullPointerException("Cannot pass null fieldName");
        }

        public Reference(Object obj, int i10) {
            this._from = obj;
            this._index = i10;
        }
    }

    @Deprecated
    public JsonMappingException(String str, Throwable th2) {
        super(str, th2);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str, Throwable th2) {
        return new JsonMappingException(jsonParser, str, th2);
    }

    public static JsonMappingException wrapWithPath(Throwable th2, Object obj, int i10) {
        return wrapWithPath(th2, new Reference(obj, i10));
    }

    public StringBuilder getPathReference(StringBuilder sb2) {
        _appendPathDesc(sb2);
        return sb2;
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str) {
        return new JsonMappingException(jsonGenerator, str, (Throwable) null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    public static JsonMappingException wrapWithPath(Throwable th2, Reference reference) {
        Closeable closeable;
        JsonMappingException jsonMappingException;
        if (th2 instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th2;
        } else {
            String strExceptionMessage = ClassUtil.exceptionMessage(th2);
            if (strExceptionMessage == null || strExceptionMessage.length() == 0) {
                strExceptionMessage = "(was " + th2.getClass().getName() + ")";
            }
            if (th2 instanceof JsonProcessingException) {
                Object processor = ((JsonProcessingException) th2).getProcessor();
                if (processor instanceof Closeable) {
                    closeable = (Closeable) processor;
                } else {
                    closeable = null;
                }
            } else {
                closeable = null;
            }
            jsonMappingException = new JsonMappingException(closeable, strExceptionMessage, th2);
        }
        jsonMappingException.prependPath(reference);
        return jsonMappingException;
    }

    public void prependPath(Object obj, int i10) {
        prependPath(new Reference(obj, i10));
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation, Throwable th2) {
        super(str, jsonLocation, th2);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str, Throwable th2) {
        return new JsonMappingException(jsonGenerator, str, th2);
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this._processor = closeable;
        if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).getTokenLocation();
        }
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str) {
        return new JsonMappingException(deserializationContext.getParser(), str);
    }

    public void prependPath(Reference reference) {
        if (this._path == null) {
            this._path = new LinkedList<>();
        }
        if (this._path.size() < 1000) {
            this._path.addFirst(reference);
        }
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str, Throwable th2) {
        return new JsonMappingException(deserializationContext.getParser(), str, th2);
    }

    public static JsonMappingException from(SerializerProvider serializerProvider, String str) {
        return new JsonMappingException(serializerProvider.getGenerator(), str);
    }

    public static JsonMappingException from(SerializerProvider serializerProvider, String str, Throwable th2) {
        return new JsonMappingException(serializerProvider.getGenerator(), str, th2);
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th2) {
        super(str, th2);
        this._processor = closeable;
        if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).getTokenLocation();
        }
    }

    public JsonMappingException(Closeable closeable, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
        this._processor = closeable;
    }
}
