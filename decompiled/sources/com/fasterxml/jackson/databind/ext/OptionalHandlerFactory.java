package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class OptionalHandlerFactory implements Serializable {
    public static final OptionalHandlerFactory instance;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Class<?> f43310p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Class<?> f43311q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Java7Support f43312r0;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x0007
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    static {
        /*
            r0 = 0
            java.lang.Class<org.w3c.dom.Node> r1 = org.w3c.dom.Node.class
            java.lang.Class<org.w3c.dom.Document> r2 = org.w3c.dom.Document.class
            goto L19
        L6:
            r1 = r0
        L7:
            java.lang.Class<com.fasterxml.jackson.databind.ext.OptionalHandlerFactory> r2 = com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.class
            java.lang.String r2 = r2.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            java.lang.String r4 = "Could not load DOM `Node` and/or `Document` classes: no DOM support"
            r2.log(r3, r4)
            r2 = r0
        L19:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f43310p0 = r1
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f43311q0 = r2
            com.fasterxml.jackson.databind.ext.Java7Support r0 = com.fasterxml.jackson.databind.ext.Java7Support.instance()     // Catch: java.lang.Throwable -> L21
        L21:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f43312r0 = r0
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory r0 = new com.fasterxml.jackson.databind.ext.OptionalHandlerFactory
            r0.<init>()
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.instance = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.<clinit>():void");
    }

    public static Object a(String str) {
        try {
            return ClassUtil.createInstance(Class.forName(str), false);
        } catch (Exception | LinkageError unused) {
            return null;
        }
    }

    public JsonDeserializer<?> findDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        JsonDeserializer<?> deserializerForJavaNioFilePath;
        Class<?> rawClass = javaType.getRawClass();
        Java7Support java7Support = f43312r0;
        if (java7Support != null && (deserializerForJavaNioFilePath = java7Support.getDeserializerForJavaNioFilePath(rawClass)) != null) {
            return deserializerForJavaNioFilePath;
        }
        Class<?> cls = f43310p0;
        if (cls != null && cls.isAssignableFrom(rawClass)) {
            return (JsonDeserializer) a("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
        }
        Class<?> cls2 = f43311q0;
        if (cls2 != null && cls2.isAssignableFrom(rawClass)) {
            return (JsonDeserializer) a("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
        }
        if (!rawClass.getName().startsWith("javax.xml.")) {
            do {
                rawClass = rawClass.getSuperclass();
                if (rawClass == null || rawClass == Object.class) {
                    return null;
                }
            } while (!rawClass.getName().startsWith("javax.xml."));
        }
        Object objA = a("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers");
        if (objA == null) {
            return null;
        }
        return ((Deserializers) objA).findBeanDeserializer(javaType, deserializationConfig, beanDescription);
    }

    public JsonSerializer<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        JsonSerializer<?> serializerForJavaNioFilePath;
        Class<?> rawClass = javaType.getRawClass();
        Java7Support java7Support = f43312r0;
        if (java7Support != null && (serializerForJavaNioFilePath = java7Support.getSerializerForJavaNioFilePath(rawClass)) != null) {
            return serializerForJavaNioFilePath;
        }
        Class<?> cls = f43310p0;
        if (cls != null && cls.isAssignableFrom(rawClass)) {
            return (JsonSerializer) a("com.fasterxml.jackson.databind.ext.DOMSerializer");
        }
        if (!rawClass.getName().startsWith("javax.xml.")) {
            do {
                rawClass = rawClass.getSuperclass();
                if (rawClass == null || rawClass == Object.class) {
                    return null;
                }
            } while (!rawClass.getName().startsWith("javax.xml."));
        }
        Object objA = a("com.fasterxml.jackson.databind.ext.CoreXMLSerializers");
        if (objA == null) {
            return null;
        }
        return ((Serializers) objA).findSerializer(serializationConfig, javaType, beanDescription);
    }
}
