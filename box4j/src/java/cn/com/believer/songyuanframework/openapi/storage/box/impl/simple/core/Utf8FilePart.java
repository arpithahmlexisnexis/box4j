package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.FilePartSource;
import org.apache.commons.httpclient.methods.multipart.PartSource;
import org.apache.commons.httpclient.util.EncodingUtil;

public class Utf8FilePart extends FilePart
{
    
    private static final byte[] FILE_NAME_BYTES = EncodingUtil.getAsciiBytes(FILE_NAME);
    
    private PartSource source;

    public Utf8FilePart(String name, PartSource partSource, String contentType, String charset)
    {
        super(name,partSource,contentType,charset);
        this.source = partSource;
    }

    public Utf8FilePart(String name, PartSource partSource)
    {
        this(name, partSource, null, null);
    }

    public Utf8FilePart(String name, File file) throws FileNotFoundException
    {
        this(name, new FilePartSource(file), null, null);
    }

    protected void sendDispositionHeader(OutputStream out) throws IOException
    {
        out.write(CONTENT_DISPOSITION_BYTES);
        out.write(QUOTE_BYTES);
        out.write(EncodingUtil.getAsciiBytes(getName()));
        out.write(QUOTE_BYTES);
        String filename = this.source.getFileName();
        if (filename != null)
        {
            out.write(FILE_NAME_BYTES);
            out.write(QUOTE_BYTES);
            out.write(filename.getBytes("UTF-8"));
            out.write(QUOTE_BYTES);
        }
    }

}
