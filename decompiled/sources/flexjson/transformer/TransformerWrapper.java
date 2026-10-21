package flexjson.transformer;

/* JADX INFO: loaded from: classes7.dex */
public class TransformerWrapper extends AbstractTransformer {
    protected Boolean isInterceptorTransformer = Boolean.FALSE;
    protected Transformer transformer;

    public TransformerWrapper(Transformer transformer) {
        this.transformer = transformer;
    }

    @Override // flexjson.transformer.AbstractTransformer, flexjson.transformer.Inline
    public Boolean isInline() {
        Transformer transformer = this.transformer;
        return Boolean.valueOf((transformer instanceof Inline) && ((Inline) transformer).isInline().booleanValue());
    }

    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        getContext().getObjectStack().addFirst(obj);
        this.transformer.transform(obj);
        getContext().getObjectStack().removeFirst();
    }
}
