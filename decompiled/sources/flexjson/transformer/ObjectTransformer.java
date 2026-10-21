package flexjson.transformer;

import flexjson.BeanAnalyzer;
import flexjson.BeanProperty;
import flexjson.ChainedSet;
import flexjson.JSONContext;
import flexjson.JSONException;
import flexjson.Path;
import flexjson.TypeContext;

/* JADX INFO: loaded from: classes7.dex */
public class ObjectTransformer extends AbstractTransformer {
    public Class resolveClass(Object obj) {
        return obj.getClass();
    }

    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        JSONContext context = getContext();
        Path path = context.getPath();
        ChainedSet visits = context.getVisits();
        try {
            if (visits.contains(obj)) {
                TypeContext typeContextPeekTypeContext = getContext().peekTypeContext();
                if (typeContextPeekTypeContext != null) {
                    typeContextPeekTypeContext.decrement();
                    return;
                }
                return;
            }
            context.setVisits(new ChainedSet(visits));
            context.getVisits().add(obj);
            BeanAnalyzer beanAnalyzerAnalyze = BeanAnalyzer.analyze(resolveClass(obj));
            TypeContext typeContextWriteOpenObject = context.writeOpenObject();
            for (BeanProperty beanProperty : beanAnalyzerAnalyze.getProperties()) {
                path.enqueue(beanProperty.getName());
                if (context.isIncluded(beanProperty) && beanProperty.isReadable().booleanValue()) {
                    Object value = beanProperty.getValue(obj);
                    if (!context.getVisits().contains(value)) {
                        Transformer transformer = context.getTransformer(beanProperty, value);
                        if (!(transformer instanceof Inline) || !((Inline) transformer).isInline().booleanValue()) {
                            if (!typeContextWriteOpenObject.isFirst()) {
                                context.writeComma();
                            }
                            typeContextWriteOpenObject.increment();
                            context.writeName(beanProperty.getJsonName());
                        }
                        typeContextWriteOpenObject.setPropertyName(beanProperty.getJsonName());
                        transformer.transform(value);
                    }
                }
                path.pop();
            }
            context.writeCloseObject();
            context.setVisits((ChainedSet) context.getVisits().getParent());
        } catch (JSONException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new JSONException(String.format("%s: Error while trying to serialize.", path), e7);
        }
    }
}
