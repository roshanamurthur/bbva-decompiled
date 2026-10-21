package flexjson.transformer;

/* JADX INFO: loaded from: classes7.dex */
public class BooleanTransformer extends AbstractTransformer {
    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        getContext().write(((Boolean) obj).booleanValue() ? "true" : "false");
    }
}
