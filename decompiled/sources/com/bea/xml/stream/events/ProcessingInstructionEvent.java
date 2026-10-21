package com.bea.xml.stream.events;

import java.io.IOException;
import java.io.Writer;
import javax.xml.stream.events.ProcessingInstruction;

/* JADX INFO: loaded from: classes9.dex */
public class ProcessingInstructionEvent extends BaseEvent implements ProcessingInstruction {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f37882g;

    public ProcessingInstructionEvent() {
        init();
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public void doWriteAsEncodedUnicode(Writer writer) throws IOException {
        writer.write("<?");
        String str = this.f37881f;
        if (str != null) {
            writer.write(str);
        }
        if (this.f37882g != null) {
            writer.write(32);
            writer.write(this.f37882g);
        }
        writer.write("?>");
    }

    @Override // javax.xml.stream.events.ProcessingInstruction
    public String getData() {
        return this.f37882g;
    }

    @Override // javax.xml.stream.events.ProcessingInstruction
    public String getTarget() {
        return this.f37881f;
    }

    public void init() {
        setEventType(3);
    }

    public void setData(String str) {
        this.f37882g = str;
    }

    public void setTarget(String str) {
        this.f37881f = str;
    }

    public ProcessingInstructionEvent(String str, String str2) {
        init();
        this.f37881f = str;
        this.f37882g = str2;
    }
}
