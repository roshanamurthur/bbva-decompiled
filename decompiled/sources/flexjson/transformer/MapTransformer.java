package flexjson.transformer;

import flexjson.JSONContext;
import flexjson.JSONException;
import flexjson.Path;
import flexjson.TypeContext;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class MapTransformer extends AbstractTransformer {
    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        JSONContext context = getContext();
        Path path = context.getPath();
        Map map = (Map) obj;
        try {
            TypeContext typeContextWriteOpenObject = getContext().writeOpenObject();
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                path.enqueue(next != null ? next.toString() : null);
                if (context.isIncluded(next != null ? next.toString() : null, map.get(next))) {
                    Transformer transformer = context.getTransformer(null, map.get(next));
                    if (!(transformer instanceof Inline) || !((Inline) transformer).isInline().booleanValue()) {
                        if (!typeContextWriteOpenObject.isFirst()) {
                            getContext().writeComma();
                        }
                        typeContextWriteOpenObject.increment();
                        if (next != null) {
                            getContext().writeName(next.toString());
                        } else {
                            getContext().writeName(null);
                        }
                    }
                    if (next != null) {
                        typeContextWriteOpenObject.setPropertyName(next.toString());
                    } else {
                        typeContextWriteOpenObject.setPropertyName(null);
                    }
                    transformer.transform(map.get(next));
                }
                path.pop();
            }
            getContext().writeCloseObject();
        } catch (Exception e5) {
            throw new JSONException(String.format("%s: Error while trying to serialize.", path), e5);
        }
    }
}
